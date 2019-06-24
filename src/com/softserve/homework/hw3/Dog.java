package com.softserve.homework.hw3;

public class Dog {

    private String name;
    private int age;
    private Breed breed;

    public Dog() {
    }

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object obj) {
        Dog other = (Dog) obj;
        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) return false;
        return true;
    }
    public String checkAge(Object obj){
        Dog other = (Dog) obj;
        if (age > other.age)  {
            return "First Dog is Older ";
        }else return "Second Dog is Older";
    }

    public static void main(String[] args) {

        Dog d1 = new Dog("Vaska", 12, Breed.Boxer);
        Dog d2 = new Dog("Vaska", 2, Breed.Beagle);
        Dog d3 = new Dog("Pilik", 4, Breed.Doberman);
        Dog d4 = new Dog("Okro", 11, Breed.Bulldog);

        System.out.println(d1.equals(d2));
        System.out.println(d3.checkAge(d4));
    }
}
