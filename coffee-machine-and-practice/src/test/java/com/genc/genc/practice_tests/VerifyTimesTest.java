package com.genc.genc.practice_tests;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;

public class VerifyTimesTest {

    @Test
    void testMultipleCalls() {
        List<String> mockedList = mock(List.class);

        mockedList.add("One");
        mockedList.add("Two");
        mockedList.add("Two");

        verify(mockedList, times(1)).add("One");
        verify(mockedList, times(2)).add("Two");
    }
}
