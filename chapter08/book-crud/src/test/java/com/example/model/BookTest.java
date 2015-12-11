package com.example.domain.model;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BookTest {
	@Test
    public void testGetTitle() {
    	Book testee = new Book("Gradle 철저 입문", "9784798199999");
        assertThat(testee.getTitle(), is("Gradle 철저 입문"));
    }
}
