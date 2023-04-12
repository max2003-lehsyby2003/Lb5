import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        double [] array;
        double [] sumArray;
        LabArrayProcessor labArrayProcessor = new LabArrayProcessor();
        LabDoubleArrayReader labDoubleArrayReader = new LabDoubleArrayReader();

        double[][] array2;
        double[][] sumArray2;


        while (choice != 5) {
            System.out.println("Виберіть один из пунктов меню:");
            System.out.println("1. Зчитати данні з першого файлу та вивести елементи на екран");
            System.out.println("2. Розрахувати сумму елементів масива");
            System.out.println("3. Відкрити другий файл та вивести матрицю елементів на екран ");
            System.out.println("4. Розрахувати сумму елементів виділенного участку");
            System.out.println("5. Вихід з программи");
            choice = input.nextInt();


            switch (choice) {
                case 1 ->{
                    System.out.println("1.");
                    array = labDoubleArrayReader.readOneDimensionalArray("lab5.1.txt");
                    labArrayProcessor.processArray(array);
                }
                case 2 ->{
                    System.out.println("2.");
                    sumArray = labDoubleArrayReader.readOneDimensionalArray("lab5.1.txt");

                    System.out.println(labArrayProcessor.calculate(sumArray));
                }
                case 3 ->{
                    System.out.println("3.");
                    array2 = labDoubleArrayReader.readTwoDimensionalArray("lab5.2.txt");
                    labArrayProcessor.processArray(array2);

                }
                case 4 ->{

                    System.out.println("4.");
                    File file = new File("lab5.2.txt");

                sumArray2 = labDoubleArrayReader.readTwoDimensionalArray(file);

                    System.out.println(labArrayProcessor.calculate(sumArray2));
                }
                case 5 -> System.out.println("Вихід з программи");
                default -> System.out.println("Невірний выбір. Попробуйте ще раз.");
            }
        }
    }
}
