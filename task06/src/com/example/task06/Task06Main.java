package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /**/
        new Task06Main().printMethodName();

    }

    void printMethodName() {
        StackTraceElement MethodName =  new RuntimeException().getStackTrace()[1]; // [0] -> printMethodName
        System.out.println(MethodName.getMethodName());
    }

}