/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.eltest.bean;

/**
 *
 * @author icbt
 */
public class Person {
    private String name;
    private String age;
    private Dog dog;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    
    
}
