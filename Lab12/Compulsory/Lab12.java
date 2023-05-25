/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab12;

import java.io.File;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Mihnea
 */
public class Lab12 {

    public static void main(String[] args) throws MalformedURLException {
        MyClassloader classLoader = new MyClassloader();
        File path = new File("C:/Users/Mihnea/Documents/NetBeansProjects/lab8/target/classes/com/mycompany/lab8/AlbumDAO.class");
        if (path.exists()) {
            URL url = path.toURI().toURL();
            classLoader.addURL(url);
        }
        Class clazz = classLoader.getClass();
        Method[] methods = clazz.getMethods();
        for(Method method : methods){
            System.out.println(method);
        }
    }
}
