package HomeWork.Task2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    int[] arr = {5,6,3,2,5,1,4,9};

    public void arraySort() {
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        assert arr != null;
        System.out.println(Arrays.toString(arr));
    }

    public void duplicationCheck() {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int x : arr) {
            int newValue = counter.getOrDefault(x, 0) + 1;
            assert arr != null;
            counter.put(x, newValue);
        }
        System.out.println(counter);
        int count = 0;
        for (int value : counter.values()) {
            if (value > 1) {
                count++;
            }
        }
        System.out.println("Колличество дублированных чисел: " + count);
    }

    public static void main (String[] args) {
        Main main = new Main();
        main.arraySort();
        main.duplicationCheck();

    }
}