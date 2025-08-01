package com.genc.genc.practice;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class QuickSort implements SortingAlgorithm {
    @Override
    public void sort(int[] arr) {
        Arrays.sort(arr);
    }
}
