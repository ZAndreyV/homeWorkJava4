package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        //1. Реализовать консольное приложение, которое:
        //Принимает от пользователя и “запоминает” строки.
        //Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
        //Если введено revert, удаляет предыдущую введенную строку из памяти.
        Scanner sc = new Scanner(System.in);
        Deque<String> deque = new ArrayDeque<String>();
        while (true) {
            System.out.println("Enter any string to add to array or \"print\" to show elements in array or \"revert\" to remove last entered:");
            String enterString = sc.nextLine();
            if (enterString.equals("print")) {
                print(deque);
            } else if (enterString.equals("revert")) {
                revert(deque);
            } else {
                deque.add(enterString);
            }
        }
    }

    private static void revert(Deque<String> w) {
        w.removeLast();
    }

    private static void print(Deque<String> q) {
        q.descendingIterator().forEachRemaining(System.out::println);
    }
}
