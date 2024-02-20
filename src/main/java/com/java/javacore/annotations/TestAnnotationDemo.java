package com.java.javacore.annotations;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
public class TestAnnotationDemo {

    public static void main(String[] args) {
        TestRunner runner = new TestRunner();
        runner.runTests(TestSamples.class);
    }

}