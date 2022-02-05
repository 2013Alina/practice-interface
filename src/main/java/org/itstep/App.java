package org.itstep;

import org.itstep.command.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Для запуска комманды help введите слово help с клавиатуры.");
        System.out.println("Для запуска команды echo <text> введите с клавиатуры echo и " +
                "Ваши волшебные слова.");
        System.out.println("Для запуска команды now введите слово now с клавиатуры.");
        System.out.println("Для запуска команды exit введите с клавиатуры слово exit " +
                "(после этой команды программа будет завершена)");
        System.out.println("Введите Вашу команду: ");

        Scanner scanner = new Scanner(System.in);
        Receiver receiver = new Receiver(); // создаем объект, который будет использоваться

        // Создаем объекты для всех умений объекта receiver: ;
        Command echo = new EchoTextCommand(receiver);
        Command exit = new ExitCommand(receiver);
        Command help = new HelpCommand(receiver);
        Command now = new NowCommand(receiver);
        Invoker invoker = new Invoker(echo, exit, help, now);

        // Создаемтся invoker, с которым мы будем непосредственно контактировать:
        while (true) {
            System.out.print(">>> ");
            String input = scanner.nextLine();
            if (!App.requestValidation(input)) {
                System.out.println("Error");
            }
            if (App.requestValidation(input)) {
                while (true) {
                    if (input.equals("now")) {
                        invoker.now();
                        break;
                    }
                    if (input.equals("help")) {
                        invoker.help();
                        break;
                    }
                    if (input.startsWith("echo")) {
                        invoker.echo(input);
                        break;
                    }
                    if (input.equals("exit")) {
                        invoker.exit();
                    }

                }
            }
        }
    }

    public static boolean requestValidation(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.equals("help") || input.startsWith("echo")
             || input.equals("now") || input.equals("exit")) {
                return true;
            }
        }
        return false;
    }
}
