package ru.geekbrains.Words;

import org.jetbrains.annotations.NotNull;

import java.util.*;

/*         Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
           Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
           Посчитать сколько раз встречается каждое слово.*/
public class Main
{

    public static void main(String[] args)
    {
	// write your code here
        ArrayOfWords arrayOfWords = new ArrayOfWords(fullfill());
        arrayOfWords.origInfo();
        arrayOfWords.listOfUnicWord();
        arrayOfWords.allInfo();

    }

    public static @NotNull ArrayList<String> fullfill()
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Иван");
        list.add("Пётр");
        list.add("Вася");
        list.add("Иван");
        list.add("Пётр");
        list.add("Игнат");
        list.add("Никита");
        list.add("Иван");
        list.add("Вася");
        return list;
    }
}
