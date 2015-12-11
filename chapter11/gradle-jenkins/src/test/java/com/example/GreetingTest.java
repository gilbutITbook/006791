package com.example;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GreetingTest {
    @Test
    public void testSayHello() {
        Greeting greeting = new Greeting();
        assertThat(greeting.sayHello(), is("Hello World!!"));
    }
}
