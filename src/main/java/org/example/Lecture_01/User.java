package org.example.Lecture_01;

import java.util.Arrays;
import java.util.List;

public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class UseUser {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User("Павел",25),
                new User("Геннадий",30),
                new User("Виталий",41));
        users.stream().map(x->new User(x.name, x.age-5)).filter(user -> user.age<=25).forEach(System.out::println);
    }
}