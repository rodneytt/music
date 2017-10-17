package com.osight.music;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.Test;

import com.osight.monitor.collect.ActionCollect;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.LoaderClassPath;
import javassist.NotFoundException;

/**
 * @author chenw <a href="mailto:chenw@chsi.com.cn">chen wei</a>
 * @version $Id$
 */
public class UserTest {
    @Test
    public void test() throws NotFoundException, IOException {
        final String className = "com.osight.music.controller.UserController";
        ClassLoader loader = getClass().getClassLoader();
        ClassPool localClassPool = new ClassPool();
        localClassPool.insertClassPath(new LoaderClassPath(loader));
        CtClass ctClass = localClassPool.get(className);
        ActionCollect collect = ActionCollect.INSTANCE;
        byte[] classByte = collect.transform(className, null, ctClass);
        String pathname = System.getProperty("user.dir") + "/target/UserController.class";
        Path path = new File(pathname).toPath();
        Files.write(path, classByte);
        System.out.println(pathname);
    }
}
