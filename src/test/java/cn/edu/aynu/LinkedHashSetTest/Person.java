package cn.edu.aynu.LinkedHashSetTest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *@Author:冯君
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private int age;

    @Override
    public boolean equals(Object obj) {
        if(this==obj)  return true;
        if(obj==null)  return false;
        if(this.getClass()!=obj.getClass()) return false;

        Person person = (Person)obj;

        return this.age==person.age ? (this.name.equals(person.name) ? true: false):false;
    }


    @Override
    public int hashCode() {
        return name.hashCode()+age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
