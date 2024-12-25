package org.junior.external;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Person implements Externalizable {

    private String name;
    private int age;
    private transient double CPA;       // средний балл

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.CPA = 0;
    }
    public Person() {
        this("Anon", 0);
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


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(age);
        out.writeDouble(CPA);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        age = in.readInt();
        CPA = in.readDouble();
    }
}
