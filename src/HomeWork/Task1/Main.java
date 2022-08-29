package HomeWork.Task1;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    int[][] array = new int[5][5];
    int max = 0;
    int min = 0;
    int sum = 0;
    int average = 0;

    public void arrayOfRandomNumbers() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ThreadLocalRandom.current().nextInt(0, 99);
                assert array != null;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void arrayValues() {
        //минимальное и максимальное значения
        min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    assert min >= 0;
                } else if (array[i][j] > max) {
                    max = array[i][j];
                    assert max != 100;
                }
                //сумма элементов массива
                sum += array[i][j];
            }
        }
        //среднее значение
        average = sum / 25;
        assert sum > 1;
        System.out.println("Максимальное значение = " + max + ", " + "Минимальное значение = " + min + ", " +
                "Среднее значение = " + average);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.arrayOfRandomNumbers();
        main.arrayValues();
    }
}