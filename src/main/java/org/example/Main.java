package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

            public static void main(String[] args) {
                // Создание объекта Person
                Person person = new Person("John", "Doe", 30);

                // Генерация строки через toString()
                System.out.println("Person toString: " + person.toString());

                // Сериализация в JSON
                String json = person.toJson();
                System.out.println("Person as JSON: " + json);

                // Десериализация обратно в объект Person
                Person deserializedPerson = Person.fromJson(json);
                System.out.println("Deserialized Person: " + deserializedPerson);

                // Сравнение объектов с equals
                System.out.println("Objects are equal: " + person.equals(deserializedPerson));

                // HashCode
                System.out.println("HashCode: " + person.hashCode());
            }
        }



