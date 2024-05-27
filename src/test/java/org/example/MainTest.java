package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void helloWorld_printsHelloWorld_whenRunProgram() {
        String expected = "Hello World!";
        String actual = Main.helloWorld();
        assertEquals(expected, actual);
    }
}