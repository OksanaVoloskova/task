import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static final int X = 3;
    private static final int S = 7;
    private static final int M = 21;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Введите числа через пробел (конец массива - ввод любого символа не числа):");
        while(sc.hasNextInt()) {
            arrayList.add(sc.nextInt());
        }
        ArrayOfNumbers.help();

        ArrayList<Integer> arrayMultiply3 = new ArrayList<>();
        ArrayList<Integer> arrayMultiply7 = new ArrayList<>();
        ArrayList<Integer> arrayMultiply21 = new ArrayList<>();
        String type;
        while (true) {
            String command = sc.next();
            switch (command) {
                case "init":
                    arrayMultiply3 = ArrayOfNumbers.initMultiplyToArray(arrayList, X);
                    arrayMultiply7 = ArrayOfNumbers.initMultiplyToArray(arrayList, S);
                    arrayMultiply21 = ArrayOfNumbers.initMultiplyToArray(arrayList, M);
                    System.out.println("Списки инициализированны.");
                    break;
                case "print":
                    printArrayLists(arrayMultiply3, arrayMultiply7, arrayMultiply21);
                    break;
                case "printT":
                    System.out.println("Введите тип, X - кратно 3, S - кратно 7, M - кратно 21: ");
                    type = sc.next();
                    printDefiniteType(type, arrayMultiply3, arrayMultiply7, arrayMultiply21);
                    break;
                case "anymore":
                    System.out.println(ArrayOfNumbers.isAnyMore(arrayList));
                    break;
                case "clearT":
                    System.out.println("Введите тип, X - кратно 3, S - кратно 7, M - кратно 21: ");
                    type = sc.next();
                    clearDefiniteType(arrayMultiply3, arrayMultiply7, arrayMultiply21, type);
                    break;
                case "merge":
                    ArrayList<Integer> mergedArrayList = ArrayOfNumbers
                            .mergeArrays(arrayMultiply7, arrayMultiply3, arrayMultiply21);
                    Collections.sort(mergedArrayList);
                    System.out.println("объединение 3 списков: " + mergedArrayList);
                    ArrayOfNumbers.clearType(arrayMultiply3);
                    ArrayOfNumbers.clearType(arrayMultiply7);
                    ArrayOfNumbers.clearType(arrayMultiply21);
                    break;
                case "help":
                    ArrayOfNumbers.help();
                    break;
                default:
                    System.out.println("Введена неверная команда");
                    break;
            }
        }
    }

    private static void clearDefiniteType(ArrayList<Integer> arrayMultiply3, ArrayList<Integer> arrayMultiply7, ArrayList<Integer> arrayMultiply21, String type) {
        switch (type) {
            case "S":
                ArrayOfNumbers.clearType(arrayMultiply7);
                ArrayOfNumbers.printArray(arrayMultiply7, S);
                break;
            case "X":
                ArrayOfNumbers.clearType(arrayMultiply3);
                ArrayOfNumbers.printArray(arrayMultiply3, X);
                break;
            case "M":
                ArrayOfNumbers.clearType(arrayMultiply21);
                ArrayOfNumbers.printArray(arrayMultiply21, M);
                break;
            default:
                System.out.println("Введено неверное наименование типа");
                break;
        }
    }

    private static void printArrayLists(ArrayList<Integer> arrayMultiply3, ArrayList<Integer> arrayMultiply7, ArrayList<Integer> arrayMultiply21) {
        ArrayOfNumbers.printArray(arrayMultiply3, X);
        ArrayOfNumbers.printArray(arrayMultiply7, S);
        ArrayOfNumbers.printArray(arrayMultiply21, M);
    }

    public  static void printDefiniteType(String type, ArrayList<Integer> arrayMultiply3, ArrayList<Integer> arrayMultiply7, ArrayList<Integer> arrayMultiply21) {
        switch (type) {
            case "S":
                ArrayOfNumbers.printArray(arrayMultiply7, S);
                break;
            case "X":
                ArrayOfNumbers.printArray(arrayMultiply3, X);
                break;
            case "M":
                ArrayOfNumbers.printArray(arrayMultiply21, M);
                break;
            default:
                System.out.println("ВВедено неверное значение типа");
                break;
        }
    }
}

