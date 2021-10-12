package Task2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

//Пользователь вводит с клавиатуры набор чисел. Полученные числа необходимо сохранить в список. После
//        чего нужно показать меню, в котором предложить пользователю набор пунктов:
//        1. Добавить элемент в список;
//        2. Удалить элемент из списка;
//        3. Показать содержимое списка;
//        4. Проверить есть ли значение в списке;
//        5. Заменить значение в списке.
//        В зависимости от выбора пользователя выполняется
//        действие, после чего меню отображается снова.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int size = sc.nextInt();
        ArrayList numbers = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            System.out.println("Введите число: ");
            int a = sc.nextInt();
            numbers.add(a);
        }

        do {
            System.out.println("Выберите действие:\n1. Добавить элемент в список;\n" + "2. Удалить элемент из списка;\n" + "3. Показать содержимое списка;\n" + "4. Проверить есть ли значение в списке;\n" + "5. Заменить значение в списке.\n" + "6. Выйти из программы");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Введите число для добавления: ");
                    int addNumber = sc.nextInt();
                    numbers.add(addNumber);
                    break;
                }
                case 2: {
                    System.out.println("Введите индекс элемента для удаления: ");
                    int removeNumber = sc.nextInt();
                    if (removeNumber > -1 || removeNumber < size - 1) numbers.remove(removeNumber);
                    break;
                }
                case 3: {
                    System.out.println(numbers);
                    break;
                }
                case 4: {
                    System.out.println("Введите значение для проверки: ");
                    int numberCheck = sc.nextInt();
                    numbers.contains((Integer) numberCheck);
                    break;
                }
                case 5: {
                    System.out.println("Введите индекс элемента для замены: ");
                    int changeIndex = sc.nextInt();
                    System.out.println("Введите новое число: ");
                    int newNumber = sc.nextInt();
                    numbers.remove(changeIndex);
                    numbers.add(changeIndex, newNumber);
                    break;
                }
                default: {
                    System.out.println("Выход из программы");
                }
            }
        }
        while (true);
    }
}
