package com.nology.zoology.animal;

public abstract class Animal {
    private int id;
    protected String name;
    protected int age;
    protected boolean isPettable;
    protected short hunger = 50;
    private static final int HUNGER_LEVEL = 40;

    // Can we have a way to know when an animal is hungry and when it should
    // be fed?

    public Animal(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isPettable = getType().isPettable();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public short getHunger() {
        return hunger;
    }


    public void setHunger(short hunger) {
        this.hunger = hunger;
    }

    public boolean isHungry() {
        return this.hunger >= HUNGER_LEVEL;
    };

    public void feed() {
        hunger -= 10;
        makeSound();
    }

    public abstract void makeSound();
    public abstract String getInformation();

    public AnimalType getType() {
        return null;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + String.format("[id=%s, name=%s, " +
                "age=%d]", this.id, this.name, this.age);
    }
}
