package ru.itis.inf304;

public abstract class Human {
    protected String name;
    protected Gender gender;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }
}

