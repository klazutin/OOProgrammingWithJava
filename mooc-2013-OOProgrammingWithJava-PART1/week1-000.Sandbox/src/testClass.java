/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
public class testClass {
    private String name;
    private int age = 0;
    
    public testClass(int age) {
        age = 5;
        this.age = 3;
        this.age = age;
        System.out.println("Instantiated " + this.age + age);
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void show() {
        System.out.println(this.age);
    }
}
