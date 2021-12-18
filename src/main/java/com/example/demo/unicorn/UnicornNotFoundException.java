package com.example.demo.unicorn;

class UnicornNotFoundException extends RuntimeException {
    UnicornNotFoundException(String unicornName) {
        super("Unicorn '" + unicornName + "' not found");
    }
}
