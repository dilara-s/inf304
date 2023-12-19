package ru.itis.inf304;

public enum Gender {
    male, female;
    String getFullValue() {
        switch (this) {
            case male : return "Мужской";
            case female : return "Женский";
        }
        return "Не определен";
    }
}
