package org.lister.sorttest;

import java.util.Arrays;

/**
 * @Author: Li Jian
 * @Date: 2019-5-30 10:26
 * @Description:
 */
public class Sort {


    /**
     * 冒泡排序
     * @param arrays
     */
    public void bubbleSort(int [] arrays){

        int len = arrays.length;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if (arrays[i] > arrays[j]) {
                    int temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
    }

    /**
     * 快速排序
     * @param arr
     * @param start 起始位置 0
     * @param end 数组尾
     */
    public void fastSort(int [] arr, int start, int end) {

        if (start < end) {
            // 选基准数
            int baseNum = arr[start];
            // 记录中间值
            int midNum;
            int i = start;
            int j = end;

            do {
                while (arr[i] < baseNum && i < end) {
                    i++;
                }
                while (arr[j] > baseNum && j > start) {
                    j--;
                }
                if (i <= j) {
                    midNum = arr[i];
                    arr[i] = arr[j];
                    arr[j] = midNum;
                    i++;
                    j--;
                }
            } while (i <= j);
            if (start < j) {
                fastSort(arr, start, j);
            }
            if (end > i) {
                fastSort(arr, i, end);
            }
        }
    }

}
