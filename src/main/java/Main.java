import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.get();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        logger.log("Программа запущена.");

        System.out.println("Привет!\n" +
                "Введи два числа: размер списка N и через ENTER\n" +
                "верхнюю границу значений элементов в списке M.");
        logger.log("Просим пользователя ввести 2 числа");

        System.out.print("N:");
        int n = scanner.nextInt();
        logger.log("Введено значение N: " + n);

        List<Integer> list = new ArrayList<>(n);
        System.out.print("M:");
        int m = scanner.nextInt();
        logger.log("Введено значение M: " + m);

        for (int i = 0; i < n; i++) {
            int rand = random.nextInt(m);
            list.add(rand);
            logger.log("В " + (i+1) + " слот присвоено значение: " + rand);
        }
        System.out.println(list);
        logger.log(String.valueOf(list));

        System.out.println("Введи число F для фильтрации списка.");
        System.out.print("F:");
        int f = scanner.nextInt();
        logger.log("Введено значение F: " + f);

        Filter filter = new Filter(f);
        list = filter.filterOut(list);
        System.out.println(list);
        logger.log(String.valueOf(list));

        logger.printLog();
    }
}
