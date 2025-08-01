package com.genc.genc.practice_tests;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ResetMockTest {

    @Test
    void testReset() {
        List<String> mockedList = mock(List.class);

        when(mockedList.size()).thenReturn(5);
        assertEquals(5, mockedList.size());

        reset(mockedList);
        assertEquals(0, mockedList.size()); // Unstubbed after reset
    }
}
