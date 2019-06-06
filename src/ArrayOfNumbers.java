import java.util.ArrayList;
import java.util.Collections;

public class ArrayOfNumbers {

    public static ArrayList<Integer> initMultiplyToArray(ArrayList<Integer> arrayList, int xsm) {
        ArrayList<Integer> multiplyArray = new ArrayList<>();
        for (Integer arr : arrayList) {
            if(arr%xsm == 0) {
                multiplyArray.add(arr);
            }
        }
        return multiplyArray;
    }

    public static void printArray(ArrayList<Integer> arrayList, int type) {
        if(arrayList.isEmpty()) {
            System.out.print("Список, кратный " + type + " пуст.\n");
        } else {
            Collections.sort(arrayList);
            System.out.println("Список чисел, кратный " + type + ": " + arrayList);
        }
    }

    public static boolean isAnyMore(ArrayList<Integer> arrayList) {
        for (Integer arr : arrayList) {
            if(arr%3 != 0 && arr%7 != 0 && arr%21 != 0) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Integer> mergeArrays(ArrayList<Integer> arrayMultiply3, ArrayList<Integer> arrayMultiply7, ArrayList<Integer> arrayMultiply21) {
        arrayMultiply3.addAll(arrayMultiply7);
        arrayMultiply3.addAll(arrayMultiply21);
        return arrayMultiply3;
    }

    public static ArrayList<Integer> clearType(ArrayList<Integer> arrayList) {
        arrayList.clear();
        return arrayList;
    }

    public static void help() {
        System.out.println("Инициализация списков, команда init\n" +
                "Печать всех списков, команда print\n" +
                "Печать конкретного списка, команда printT\n" +
                "Есть ли значения, не вошедшие ни в один список, команда anymore\n" +
                "Слить все списки в один и вывести на экран, а затем очистить списки, команда merge\n" +
                "Очистка списка определенного типа, команда clearT\n" +
                "Справка по командам, команда help\n");

    }

}
