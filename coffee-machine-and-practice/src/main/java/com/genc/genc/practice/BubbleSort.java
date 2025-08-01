package com.genc.genc.practice;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BubbleSort implements SortingAlgorithm {
    @Override
    public void sort(int[] arr) {
        Arrays.sort(arr);
    }
}
