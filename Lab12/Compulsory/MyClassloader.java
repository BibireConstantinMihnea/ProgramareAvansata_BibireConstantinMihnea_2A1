/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab12;

import java.net.URL;
import java.net.URLClassLoader;

/**
 *
 * @author Mihnea
 */
public class MyClassloader extends URLClassLoader {

    public MyClassloader() {
        super(new URL[0], ClassLoader.getSystemClassLoader());
    }

    @Override
    public void addURL(URL url) {
        super.addURL(url); //addUrl is protected in the superclass
    }

}
