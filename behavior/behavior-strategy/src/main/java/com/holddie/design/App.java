package com.holddie.design;

import com.holddie.design.implement.HeapSortStrategy;
import com.holddie.design.implement.MergeSortStrategy;
import com.holddie.design.implement.QuickSortStrategy;
import com.holddie.design.manager.SortingManager;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<Integer> list = Arrays.asList(23, 12, 45, 25, 67);

        MergeSortStrategy mergeSortStrategy = new MergeSortStrategy();
        SortingManager sortingManager = new SortingManager(mergeSortStrategy, list);
        sortingManager.sortList();

        QuickSortStrategy quickSortStrategy = new QuickSortStrategy();
        sortingManager.setSortStratrgy(quickSortStrategy);
        sortingManager.sortList();

        HeapSortStrategy heapSortStrategy = new HeapSortStrategy();
        sortingManager.setSortStratrgy(heapSortStrategy);
        sortingManager.sortList();

    }
}
