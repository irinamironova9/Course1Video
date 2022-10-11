public class Main {
    public static void main(String[] args) {
        // Вопрос 1 - while
        double monthlySavings = 32_500d;
        double total = 0d;
        int month = 0;
        while (total < 1_000_000) {
            total += monthlySavings;
            month++;
            System.out.printf("%s-й месяц: сумма накоплений равна %.2f рублей.%n", month, total);
        }

        // Вопрос 2 - метод toString
        Book book = new Book("Emma", "Jane Austen", 2022);
        System.out.println(book);

        // Вопрос 3 - область видимости
        for (int i = 0; i <= 10; i += 5) {
            System.out.println(i);
        }
        // i = 0;

        // Задача - создать метод, возводящий число в квадрат
        int a = 7;
        System.out.println(squareNumber(a));
    }

    public static int squareNumber(int number) {
        return number * number;
    }
}