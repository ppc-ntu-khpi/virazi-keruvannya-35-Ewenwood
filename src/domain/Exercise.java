package domain;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    /**
     * Метод, определяющий является ли входное число (номер билета) счастливым
     * @param number Входное число, которое необходимо для проверки на счастливый билет
     */
    public static void Calculate (int number) {

        int firstHalf = 0;
        int secondhalf = 0;
        /**
         * Переобразуем число в строку, что бы разбить ее на отдельные символы
         */
        String n = Integer.toString(number);
        char[] charArray = n.toCharArray();
        List<Integer> numberInDigits = new ArrayList<Integer>();
        for (int i = 0;i<charArray.length; i++){
            int c = Character.getNumericValue(charArray[i]);
            numberInDigits.add(c);
        }
        /**
         * Проверка на ввод толкьо шестизначного числа
         */
        if (numberInDigits.size() != 6) {
            System.out.println("Введите только шестизначное число!");
            return;
        }
        /**
         * Цикл, который проходит 3 итерации с начала  списка numberInDigits и суммирует первые 3 числа
         */
        for (int i = 0; i < 3 ; i++) {
            firstHalf = firstHalf + numberInDigits.get(i);

        }
        /**
         * Цикл, который проходит 3 итерации с конца  списка numberInDigits и суммирует последние 3 числа
         */
        for (int i = numberInDigits.size() - 1; i >= 3 ; i--) {
            secondhalf = secondhalf + numberInDigits.get(i);
        }

        /**
         * Проверка на счастливый билет
         */
        if (firstHalf == secondhalf) {
            System.out.println("Поздравляем, у Вас счастливый билет!");
        } else {
            System.out.println("Билет не счастливый, повезет в следующий раз!");
        }

    }
}