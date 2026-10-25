package ru.otus.hw8;

public class Main {

    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"1", "1", "1", "1"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "5"}};

        try {
            System.out.println("Позитивный вызов:");
            System.out.println(strToInt(array));
        } catch (AppArraySizeException | AppArrayDataException ex) {
            System.out.println(ex.getMessage());
        }


        String[][] arrayWithText = {
                {"1", "2", "3", "4"},
                {"1", "1", "1", "1"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "five"}};
        try {
            System.out.println("Вызов с текстом вместо числа:");
            System.out.println(strToInt(arrayWithText));
        } catch (AppArraySizeException | AppArrayDataException ex) {
            System.out.println(ex.getMessage());
        }


        String[][] arrayWithFive = {
                {"1", "2", "3", "4", "5"},
                {"1", "1", "1", "1", "5"},
                {"1", "2", "3", "4", "5"},
                {"1", "2", "3", "5", "5"}};
        try {
            System.out.println("Вызов с размером 5:");
            System.out.println(strToInt(arrayWithFive));
        } catch (AppArraySizeException | AppArrayDataException ex) {
            System.out.println(ex.getMessage());
        }


        String[][] arrayWithThree = {
                {"1", "2", "3"},
                {"1", "1", "1", "1", "5"},
                {"1", "2", "3", "4", "5"},
                {"1", "2", "3", "5", "5"}};
        try {
            System.out.println("Вызов с размером 3:");
            System.out.println(strToInt(arrayWithThree));
        } catch (AppArraySizeException | AppArrayDataException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static int strToInt(String[][] strArray) {
        if (strArray.length != 4) {
            throw new AppArraySizeException("Неправильный размер массива");
        } else {
            int sum = 0;
            for (int i = 0; i < strArray.length; i++) {
                String[] strings = strArray[i];
                if (strings.length != 4) throw new AppArraySizeException("Неправильный размер массива");

                for (int j = 0; j < strings.length; j++) {
                    try {
                        int temp = Integer.parseInt(strings[j]);
                        sum += temp;
                    } catch (NumberFormatException ex) {
                        throw new AppArrayDataException("Неверные данные в ячейке " + (i + 1) + " : " + (j + 1));
                    }
                }
            }
            return sum;

        }
    }
}
