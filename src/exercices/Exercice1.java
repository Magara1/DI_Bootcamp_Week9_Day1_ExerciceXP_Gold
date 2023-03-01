package exercices;

import java.util.Arrays;

public class Exercice1 {
	
	public static void rearrangeArray(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int left = 0, right = n - 1;
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (flag)
                temp[i] = arr[right--];
            else
                temp[i] = arr[left++];

            flag = !flag;
        }
       
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Tab1 : " + Arrays.toString(arr));
        rearrangeArray(arr);
        System.out.println("Tab2 : " + Arrays.toString(arr));
    }

}
