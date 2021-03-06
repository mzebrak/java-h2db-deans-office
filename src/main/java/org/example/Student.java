package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Student {
    private int id;
    private int index_number;
    private String name, surname;

    public Student(String[] arr) {
        this(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), arr[2], arr[3]);
    }
}
