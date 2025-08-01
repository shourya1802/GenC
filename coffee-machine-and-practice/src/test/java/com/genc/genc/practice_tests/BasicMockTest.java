package com.genc.genc.practice_tests;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BasicMockTest {

    @Test
    void testMockList() {
        List<String> mockedList = mock(List.class);
        when(mockedList.get(0)).thenReturn("Hello Mockito");

        assertEquals("Hello Mockito", mockedList.get(0));
        assertNull(mockedList.get(1)); // Unstubbed call returns null
    }
}
