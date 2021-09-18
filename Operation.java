package com.javarush.task.task31.task3110;

public enum Operation {
    CREATE("упаковать файлы в архив"),
    ADD ("добавить файл в архив"),
    REMOVE ("удалить файл из архива"),
    EXTRACT ("распаковать архив"),
    CONTENT ("просмотреть содержимое архива"),
    EXIT ("выход");

    private final String operationName;

    Operation(String operationName) {
        this.operationName = operationName;
    }

    public Object getOperationName() {
        return operationName;
    }
}
