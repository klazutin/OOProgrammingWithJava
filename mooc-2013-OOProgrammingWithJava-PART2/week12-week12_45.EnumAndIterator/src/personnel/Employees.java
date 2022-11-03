/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author klazutin
 */
public class Employees {
    private ArrayList<Person> employeeList;
    
    public Employees() {
        this.employeeList = new ArrayList<Person>();
    }
    
    public void add(Person person) {
        this.employeeList.add(person);
    }
    
    public void add(List<Person> persons) {
        for (Person p : persons) {
            employeeList.add(p);
        }
    }
    
    public void print() {
//        for (Person p : employeeList) {
//            System.out.println(p);
//        }
        
        Iterator<Person> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            System.out.println(p);
        }
    }
    
    public void print(Education education) {
//        for (Person p : employeeList) {
//            if (p.getEducation() == education) {
//                System.out.println(p);
//            }
//        }
        Iterator<Person> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getEducation() == education) {
                System.out.println(p);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getEducation() == education) {
                iterator.remove();
            }
        }        
    }
}
