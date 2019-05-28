package cn.com.crtvu.user.demo;

/**
 * 插入排序
 * Created by weijiuzhu on 2019/5/28.
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] a = {7, 5, 13, 21, 8, 1, 15};
        traversing(a);
        int[] algorithm = sort(a);
        traversing(algorithm);
    }

    public static void traversing(int[] array){
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static int[] sort(int[] array){
        for (int i = 1; i < array.length; i++){
            for (int j = i; j < array.length && j > 0; j --){
                if (array[j] < array[j-1]){
                    int min = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = min;
                }
            }
        }
        return array;
    }
}
