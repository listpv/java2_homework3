package ru.geekbrains.Phonebook;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.TreeMap;

/*      Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
        В этот телефонный справочник с помощью метода add() можно добавлять записи.
        С помощью метода get() искать номер телефона по фамилии. Следует учесть,
        что под одной фамилией может быть несколько телефонов, тогда при запросе такой фамилии
        должны выводиться все телефоны.Желательно как можно меньше добавлять своего, чего нет в задании
        (т.е. не надо в телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес),
        делать взаимодействие с пользователем через консоль и т.д.). Консоль желательно не использовать
        (в том числе Scanner), тестировать просто из метода main() прописывая add() и get().*/

public class PhonebookMain
{
    public static void main(String[] args)
    {
        // write your code here

        // Запонение выглядит криво и неудобно. Но, если вводить с консоли, то будет, на мой взгляд универсально.
        // Достаточно будет, при консольном вводе, только ArrayList<String>.
        Phonebook phonebook = new Phonebook(fullfill());
        phonebook.info();
        phonebook.addNumber("Иван", "222-222-222");
        ArrayList<String> extra1 = new ArrayList<>();
        extra1.add("222-222-333");
        extra1.add("222-222-224");
        phonebook.addArray("Иван", extra1);
        ArrayList<String> extra2 = new ArrayList<>();
        extra2.add("333-333-333");
        extra2.add("333-333-334");
        phonebook.addArray("Олег", extra2);
        ArrayList<String> extra3 = new ArrayList<>();
        extra3.add("222-222-333");
        phonebook.addArray("Витя", extra3);
        phonebook.addNumber("Гена", "444-444-444");
        phonebook.getNumber("Эдик");
        phonebook.info();
    }

    public static @NotNull TreeMap<String, ArrayList<String>> fullfill()
    {
        TreeMap<String, ArrayList<String>> phonelist = new TreeMap<>();
        ArrayList<String> a1= new ArrayList<>();
        a1.add("111-111-111");
        phonelist.put("Иван",a1);
        ArrayList<String> a2= new ArrayList<>();
        a2.add("111-111-112");
        a2.add("111-111-113");
        a2.add("111-111-114");
        phonelist.put("Василий",a2);
        ArrayList<String> a3= new ArrayList<>();
        a3.add("111-111-115");
        phonelist.put("Паша",a3);
        ArrayList<String> a4= new ArrayList<>();
        a4.add("111-111-116");
        a4.add("111-111-117");
        phonelist.put("Сергей",a4);
        ArrayList<String> a5= new ArrayList<>();
        a5.add("111-111-118");
        phonelist.put("Игнат",a5);
        ArrayList<String> a6= new ArrayList<>();
        a6.add("111-111-119");
        phonelist.put("Антон",a6);
        return phonelist;
    }
}
