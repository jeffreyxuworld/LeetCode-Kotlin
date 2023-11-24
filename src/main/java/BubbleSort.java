import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = { 3, 9, -1, 10, -2 };
        // 冒泡排序的时间复杂度 O(n^2)
        int temp = 0; // 临时变量
        boolean flag = false; //标识变量，表示是否进行交换
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 如果前面的数比后面的数大，则交换
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("第" + (i + 1) + "趟排序后的数组");
            System.out.println(Arrays.toString(arr));
            if(!flag) {//在一趟排序中，一次交换都没发生过
                break;
            }else {
                flag = false;//重置flag，进行下次判断
            }
        }

    }
}