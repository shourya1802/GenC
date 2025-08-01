package com.genc.genc.practice_tests;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class VerifyMethodCallTest {

    @Test
    void testVerifyCalls() {
        List<String> mockedList = mock(List.class);

        mockedList.add("Apple");
        mockedList.add("Banana");

        verify(mockedList).add("Apple");
        verify(mockedList).add("Banana");
    }
}
