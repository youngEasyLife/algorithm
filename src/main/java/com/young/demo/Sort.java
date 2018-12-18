package com.young.demo;

/**
 * ClassName : Sort
 * Description :排序方法
 * Author : young
 * Date: 2018/12/18 10:03
 **/
public class Sort {

    /**
     * 交换数组元素
     *
     * @param arr:
     * @param a:
     * @param b:
     */
    private static void swap(Integer[] arr, int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }

    /**
     * 插入排序
     * des: 每一步将一个待排序的记录，插入到前面已经排好序的有序序列中去，直到插完所有元素为止。
     */
    private static void insertArray(Integer[] in) {
        int num = 0;
        int upNum = 0;
        for (int i = 0; i < in.length; i++) {
            for (int y = i - 1; y >= 0; y--) {
                num++;
                if (in[y + 1] < in[y]) {
                    swap(in, y + 1, y);
                    upNum++;
                } else {
                    break;
                }
            }
        }
      /*  for (int i = 0; i < in.length; i++) {
            System.out.println(in[i]);
        }*/
        System.out.println();
        System.out.println("插入排序 执行次数-----》" + num);
        System.out.println("插入排序 交换次数------>" + upNum);

    }

    /**
     * 冒泡排序
     *
     * @param in
     */
    public static void bubbleArray(Integer[] in) {
        int num = 0;
        int upNum = 0;
        for (int i = 0; i < in.length; i++) {
            boolean change = true;
            for (int y = in.length - 1; y > i; y--) {
                num++;
                if (in[y] < in[y - 1]) {
                    swap(in, y - 1, y);
                    upNum++;
                    change = false;
                }
            }
            if (change) {
                break;
            }
        }
        for (int i = 0; i < in.length; i++) {
            System.out.println(in[i]);
        }
        System.out.println();
        System.out.println("冒泡排序 执行次数-----》" + num);
        System.out.println("冒泡排序 交换次数------>" + upNum);


    }

    /**
     * 选择排序
     *
     * @param in：数组
     * @ :每一趟从待排序的数据元素中选择最小（或最大）的一个元素作为首元素，直到所有元素排完为止，简单选择排序是不稳定排序
     */
    public static void chooseArray(Integer[] in) {
        int num = 0;
        int upNum = 0;
        for (int i = 0; i < in.length; i++) {
            int min = i;//每一趟循环比较时，min用于存放较小元素的数组下标，这样当前批次比较完毕最终存放的就是此趟内最小的元素的下标
            for (int y = i + 1; y < in.length; y++) {
                num++;
                if (in[min] > in[y]) {

                    swap(in, y, min);
                    upNum++;
                }
            }
        }
        /*for (int i = 0; i < in.length; i++) {
            System.out.println(in[i]);
        }*/
        System.out.println();
        System.out.println("选择排序 执行次数-----》" + num);
        System.out.println("选择排序 交换次数------>" + upNum);


    }


    public static void main(String[] args) {

        long startTime = System.nanoTime();   //获取开始时间
        Integer in[] = {
                8, 89, 5, 84, 3, 45, 12, 33, 77, 98, 456, 878, 654, 213, 897
        };
        bubbleArray(in);
     /*   Integer num[] = {
                8, 89, 5, 84, 3, 45, 12, 33, 77, 98, 456, 878, 654, 213, 897
        };
        chooseArray(num);  //测试的代码段*/

        long endTime = System.nanoTime(); //获取结束时间

        System.out.println("程序运行时间： " + (endTime - startTime) + "ns");


    }


}
