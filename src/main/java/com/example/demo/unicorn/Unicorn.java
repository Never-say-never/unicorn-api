package com.example.demo.unicorn;

import lombok.Data;

@Data
class Unicorn {

    private String name;

    Unicorn(String name) {
        this.name = name;
    }

    public int getMarshmallows() {
        return name.length();
    }
}