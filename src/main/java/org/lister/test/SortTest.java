package org.lister.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.lister.sorttest.Sort;

/**
 * @Author: Li Jian
 * @Date: 2019-5-30 10:52
 * @Description:
 */
public class SortTest {

    static int [] arr = {1,3,2,6,5,9,0,8,7,4};
    private Sort sort = new Sort();

    @BeforeAll
    public static void beforePrint(){
        System.out.println("排序前：");
        printArray(arr);
    }

    @AfterAll
    public static void afterPrint(){
        System.out.println("排序后：");
        printArray(arr);
    }

    /**
     * 冒泡排序
     */
    @Test
    public void bubbleSort(){

        sort.bubbleSort(arr);
    }

    /**
     * 快速排序
     */
    @Test
    public void fastSort() {

        sort.fastSort(arr, 0, arr.length - 1);
    }

    private static void printArray(int[] arr) {

        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
