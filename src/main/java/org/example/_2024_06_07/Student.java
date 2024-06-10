package org.example._2024_06_07;

import java.util.Objects;

public class Student {
    private String name;
    private int age;



    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("hello");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return ((age == student.age) && (Objects.equals(name, student.name))); // name.equals(student.name) == Objects.equals(name, student.name)
    }

    @Override
    public int hashCode() { //-2000000000 +2000000000
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age;
    }
}
