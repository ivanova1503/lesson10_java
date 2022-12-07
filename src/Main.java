import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк: ");
        int x = scanner.nextInt();
        do{
            System.out.println("Неверный ввод");
            System.out.println("Введите количество строк: ");
            x = scanner.nextInt();
        }
        while (x<0);


        System.out.println("Введите количество столбцов: ");
        int y = scanner.nextInt();
        do{
            System.out.println("Неверный ввод");
            System.out.println("Введите количество столбцов: ");
            y = scanner.nextInt();
        }
        while (y<0);


        int[][] array = new int[x][y];

        for (int i=0; i<x; i++) {
            System.out.println("Введите значения в строку " + (i + 1) + ":");
            for (int j=0; j<y; j++) {
                array[i][j]= scanner.nextInt();
            }
        }

        //System.out.println(Arrays.deepToString(array));

        System.out.print("Первая строка массива, где каждое значение умножено на 3: ");
        for (int i=0; i<y; i++) {
            System.out.print(array[0][i]*3 + " ");
        }

    }
}