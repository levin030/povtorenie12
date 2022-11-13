import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[random.nextInt()];
        for (int s:number) {
            System.out.println(number);
        }







    }
}

        /*int[] numbers = {2, 8, 3, 3, 4, 4, 9, 19};
        array(numbers);
        temp(numbers);
    }

    public static void array(int[] a) {
        int minimum = a[0];
        for (int i = 0; i < a.length; i++) {
            if (minimum > a[i]) {
                minimum = a[i];
            }
            System.out.print(a[i]+" ");

        }
        System.out.println("\n"+"\n"+"минимальное число "+minimum);

    }

    public static void temp(int[] b) {
        int maximum = b[0];
        for (int i = 0; i < b.length; i++) {
            if (maximum < b[i]) {
                maximum = b[i];
            }
        }
            System.out.println("\n"+"\n"+"максимальное число "+maximum);
    }
}
















       /* int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

















    }
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int h =0;
        System.out.println("введите число");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    n = array[i];
                    array[i] = array[j];
                    array[j] = n;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+" ");
        }
        }
    }*/











       /*int[] array = {123, 32, 4356, 562, 3624, 62, 347};
       int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}*/