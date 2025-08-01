package com.genc.genc.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SortingService {
    QuickSort quickSort;

    @Autowired
    public SortingService(QuickSort quickSort) {
        this.quickSort = quickSort;
    }

    public void sort(int[] arr) {
        System.out.println(quickSort);
        quickSort.sort(arr);
    }
}
