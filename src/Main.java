import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите рубли для первой суммы:");
        long rubles1 = scanner.nextLong();
        System.out.println("Введите копейки для первой суммы:");
        byte kopecks1 = scanner.nextByte();

        System.out.println("Введите рубли для второй суммы:");
        long rubles2 = scanner.nextLong();
        System.out.println("Введите копейки для второй суммы:");
        byte kopecks2 = scanner.nextByte();

        Money m1 = new Money(rubles1, kopecks1);
        Money m2 = new Money(rubles2, kopecks2);

        Money sum = m1.add(m2);
        System.out.println("Сумма: " + sum);

        Money diff = m1.subtract(m2);
        System.out.println("Разность: " + diff);

        System.out.println("Введите множитель:");
        double multiplier = scanner.nextDouble();
        Money product = m1.multiply(multiplier);
        System.out.println("Произведение: " + product);

        System.out.println("Введите делитель:");
        double divisor = scanner.nextDouble();
        Money quotient = m1.divide(divisor);
        System.out.println("Частное: " + quotient);

        int comparison = m1.compareTo(m2);
        System.out.println("Сравнение: " + comparison);
    }
}
