package org.junior.jackson;

public class Person {

    private String name;
    private int age;
    private transient double CPA;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.CPA = 0;
    }
    public Person() {
        this("", 0);
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getCPA() {
        return CPA;
    }

    public void setCPA(double CPA) {
        this.CPA = CPA;
    }

    @Override
    public String toString() {
        return String.format("%s, %d лет, средний балл: %.2f", name, age, CPA);
    }
}
