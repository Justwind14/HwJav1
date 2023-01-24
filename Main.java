import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // Вычислить n-ое число (сумма чисел от 1 до n)
        // task1();
        /*
        System.out.print("Введите число n: ");
        Scanner bro = new Scanner(System.in);
        int n = bro.nextInt();
        System.out.println("Факториал числа " + n + " равен: " + task2(1, n));
*/
        //task3();
        task4();
    }

    static void task1() {
        System.out.print("Введите число n: ");
        Scanner scan = new Scanner(System.in);
        try {
            int n = scan.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Сумма чисел от 1го до n равна: " + sum);
        } catch (Exception e) {
            System.out.println("введите именно ЧИСЛО!");
            task1();
        }
    }

    static int task2(int prod, int s) { // Вычислить n! (произведение чисел от 1 до n)

        try {
            for (int i = 1; i <= s; i++) {
                prod *= i;
            }
        } catch (Exception e) {
            System.out.println("введите именно ЧИСЛО!");
            task2(1, s);
        }
        return prod;
    }

    static void task3() {
        /*
        Вывести все простые числа от 1 до 1000
        (простые числа - это числа которые делятся только на себя и на единицу без остатка.
        Чтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице)
         */
        for (int i = 1; i < 1000; i++) {
            int k = 0;
            for (int j = 1; j < i + 1; j++) {
                if (i % j == 0) {
                    k++;
                }
            }
            if (k == 2) {
                System.out.println(i);
            }
        }
    }

    static void task4 () {
        /*
        Реализовать простой калькулятор ("введите первое число"... "Введите второе число"
        ... "укажите операцию, которую надо выполнить с этими числами"... "ответ: ...")
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = scan.nextInt();
        System.out.println("Введите оператор вычисления (+, -, *, /): ");
        char c = scan.next().charAt(0);
        System.out.println("Введите второе число: ");
        double b = scan.nextInt();
        if (c == '+') {
            System.out.println("результат: " + (a+b));
        }
        else if (c == '-') {
            System.out.println("результат: " + (a-b));
        }
        else if (c == '*') {
            System.out.println("результат: " + (a*b));
        }
        else if(c == '/') {
            System.out.println("результат: " + (a/b));
        }
        else System.out.println("введите операторы корректно");
    }
}
