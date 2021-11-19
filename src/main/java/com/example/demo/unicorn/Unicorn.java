package com.example.demo.unicorn;

import lombok.Data;

@Data
class Unicorn {

    private String name;
    private int speed;

    Unicorn(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
}