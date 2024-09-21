package org.example;

import com.google.gson.Gson;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    // Конструктор
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }



    // Метод toString с использованием Apache Commons Lang3
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    // Метод equals с использованием Apache Commons Lang3
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())return false;

        Person other = (Person) obj;

        return new EqualsBuilder()
                .append(age, other.age)
                .append(firstName, other.firstName)
                .append(lastName, other.lastName)
                .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(firstName)
                .append(lastName)
                .append(age)
                .toHashCode();
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    // Десериализация JSON обратно в объект Person
    public static Person fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Person.class);
    }
}