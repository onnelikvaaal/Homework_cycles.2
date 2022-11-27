public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.1");
       int cash = 15000;
       int total = 0;
       int numberOfMonth = 0;
       while (total <= 2_459_000) {
           total = total + total / 100;
           total = total + cash;
           numberOfMonth ++;
           System.out.println("Месяц " + numberOfMonth + ": сумма накоплений равна " + total + " рублей");
       }
        System.out.println();
        System.out.println("Задача 1.2");
        int count = 0;
        while (count < 10) {
            count++;
            System.out.print(count + " ");
        }
        System.out.println();
        System.out.println();
        for (int n = 10; n != 0; n --) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Задача 1.3");
        int population = 12_000_000;
        int birthOnThousand = 17;
        int deathOnThousand = 8;
        System.out.println();
        for (int n = 1; n <= 10; n ++) {
            population = population + ((population * (birthOnThousand - deathOnThousand)) / 1000);
            System.out.println("Год " + n + ": численность населения составляет " + population + " человек");
        }
        System.out.println();
        System.out.println("Задача 2.1");
        int money = 15000;
        for (int ii = 1; money <= 12_000_000; ii++) {
            money = money + ((money / 100) * 7);
            System.out.println("Месяц " + ii + ": сумма накоплений равна " + money + " рублей");
        }
        System.out.println();
        System.out.println("Задача 2.2");
        int money1 = 15000;
        for (int n = 1; money1 <= 12_000_000; n++) {
            money1 = money1 + ((money1 / 100) * 7);
            if (n % 6 == 0) {
                System.out.println("Сумма накоплений на " + n + "й месяц составляет " + money1 + " рублей");
            }
        }
        System.out.println();
        System.out.println("Задача 2.3");
        int cash1 = 15000;
        for (int n = 1; n <= 9 * 12; n++) {
            cash1 = cash1 + ((cash1 / 100) * 7);
            if (n % 6 == 0) {
                System.out.println("Сумма накоплений на " + n + "й месяц составляет " + cash1 + " рублей");
            }
        }
        System.out.println();
        System.out.println("Задача 2.4");
        int friday = 2;
        for (int n = 1; n <= 31; n++) {
            if (n == friday || (n - friday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + n + " число. Необходимо подготовить отчёт!");
            }
        }
        System.out.println();
        System.out.println("Задача 3.1");
        int yearNow = 2022;
        int yearBefore = yearNow - 200;
        int yearAfter = yearNow + 100;
        int period = 79;
        for (int n = 1; n <= yearAfter; n++) {
            if (n % period == 0 && n > yearBefore) {
                System.out.println(n);
            }
        }
        System.out.println();
        System.out.println("Задача 3.2");
        int c = 2;
        for (int n = 1; n <= 10; n++) {
            c = n * 2;
            System.out.println(2 + " * " + n + " = " + c);// тут прям не уверена совсем, но выводится всё верно
        }
    }
}