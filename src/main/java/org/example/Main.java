package org.example;

import java.util.*;


import static org.example.Phonebook.showBook;

public class Main {
            public static void main(String[] args) {
                Phonebook book = new Phonebook();
                Phonebook.add("Mary", "89201231212");
                Phonebook.add("Alex", "89202342334");
                Phonebook.add("Stiven", "89203454545");
                Phonebook.add("Mary", "89102324556");
                Phonebook.add("Stiven", "89264443322");
                Phonebook.add("Mary", "89106785423");
                Phonebook.add("Helga", "89202335678");

                System.out.println("Выполнение запроса номеров по имени Get(Name)");
                System.out.println();
                System.out.println(book.get("Mary"));
                System.out.println(book.get("Alex"));
                System.out.println(book.get("Helga"));
                System.out.println();

                System.out.println("Вывод всей телефонной книги с сортировкой от большего кол-ва номеров к меньшему");
                System.out.println();
                showBook();
                System.out.println();
            }
        }

