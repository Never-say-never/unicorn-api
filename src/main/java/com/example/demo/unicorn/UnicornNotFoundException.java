package com.example.demo.unicorn;

class UnicornNotFoundException extends RuntimeException {
    UnicornNotFoundException(String unicornName) {
        super("Unicorn not found " + unicornName);
    }
}
