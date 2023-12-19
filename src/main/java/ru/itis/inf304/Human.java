package ru.itis.inf304;

public abstract class Human {

    Gender gender;
    public Human(Gender gender) {
        gender = this.gender;
    }
    public String getGender () {
        for (Gender c : Gender.values()) {
            switch (c) {
                case male : return "male";
                case female : return "female";
            }
        }
        return "do not determined";
    }


    enum Gender {
        male, female;

    }
}

