package javaApi;

import java.util.Arrays;

public class MemberDeep implements Cloneable{
    public String name;
    public int age;
    public int[] score;
    public Car car;

    public MemberDeep(String name, int age, int[] score, Car car){
        this.name=name;
        this.age=age;
        this.score=score;
        this.car=car;
    }

    public MemberDeep getMember() {
        MemberDeep cloned = null;
        try {
            cloned = (MemberDeep) clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        return cloned;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        MemberDeep cloned = (MemberDeep) super.clone();
        cloned.score = Arrays.copyOf(this.score, this.score.length);
        cloned.car = new Car(this.car.model);
        return cloned;
    }
}
