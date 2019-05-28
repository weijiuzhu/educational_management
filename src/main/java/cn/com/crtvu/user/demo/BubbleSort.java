package cn.com.crtvu.user.demo;

/**
 * 冒泡排序
 * Created by weijiuzhu on 2019/5/27.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {7, 5, 13, 21, 8, 1, 15};
        traversing(a);
        int[] algorithm = algorithm(a);
        traversing(algorithm);
    }

    public static void traversing(int[] array){
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static int[] algorithm(int[] array){

        for (int i = 1; i < array.length; i++){
            for (int j = 0; j < array.length - i; j++){
                if (array[j] < array[j +1]){
                    int max = array[j];
                    array[j] = array[j+1];
                    array[j+1] = max;
                }
            }
        }
        return array;
    }
}
