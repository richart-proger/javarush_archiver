package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.exception.WrongZipFileException;

public class Archiver {
    public static void main(String[] args) {
        Operation operation = null;
        do {
            try {
                operation = askOperation();
                CommandExecutor.execute(operation);
            } catch (WrongZipFileException e) {
                ConsoleHelper.writeMessage("Вы не выбрали файл архива или выбрали неверный файл.");
            } catch (Exception e) {
                ConsoleHelper.writeMessage("Произошла ошибка. Проверьте введенные данные.");
            }
        } while (operation != Operation.EXIT);
    }


    private static Operation askOperation() throws Exception {
        ConsoleHelper.writeMessage("Выберите операцию:");

        for (Operation operation : Operation.values()) {
            ConsoleHelper.writeMessage(String.format("\t%d - %s", operation.ordinal(), operation.getOperationName()));
        }

        int numberOfOperation = ConsoleHelper.readInt();
        return Operation.values()[numberOfOperation];
    }
}