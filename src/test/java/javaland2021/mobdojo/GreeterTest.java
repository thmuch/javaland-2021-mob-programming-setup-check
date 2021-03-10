package javaland2021.mobdojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreeterTest {

    @Test
    void greet() {

        var greeter = new Greeter();

        var greeting = greeter.greet("JavaLand 2021");

        assertEquals("Hello JavaLand 2021", greeting);
    }
}