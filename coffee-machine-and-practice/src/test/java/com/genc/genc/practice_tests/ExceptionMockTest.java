package com.genc.genc.practice_tests;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ExceptionMockTest {

    @Test
    void testThrowingException() {
        List<String> mockedList = mock(List.class);

        // Configure the mock to throw an exception when get(1) is called
        when(mockedList.get(1)).thenThrow(new RuntimeException("Item not found"));

        try {
            mockedList.get(1); // Call the method that should throw the exception
            fail("Expected RuntimeException was not thrown"); // Fail the test if no exception is thrown
        } catch (RuntimeException ex) {
            assertEquals("Item not found", ex.getMessage()); // Verify the exception message
        }
    }
}
