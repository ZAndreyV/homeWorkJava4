package org.example;

import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
        //2. Пусть дан LinkedList с несколькими элементами.
        //Реализуйте метод, который вернет “перевернутый” список.
        String str1 = new String("World!");
        String str2 = new String("Earl");
        String str3 = new String("Java");
        String str4 = new String("Moscow");
        String str5 = new String("Perl");

        LinkedList<String> list = new LinkedList<>();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(str4);
        list.add(str5);
        System.out.println(list);
        LinkedList<String> list1 = reversedLinkedList(list);
        System.out.println(list1);
    }

    private static LinkedList<String> reversedLinkedList(LinkedList<String> lst) {
        for (int i = 0; i < lst.size(); i++) {
            String element = lst.get(0);
            lst.remove(0);
            lst.add(lst.size() - i, element);
        }
        return lst;
    }
}
