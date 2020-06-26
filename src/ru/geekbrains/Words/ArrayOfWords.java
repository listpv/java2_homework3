package ru.geekbrains.Words;

import java.util.*;

public class ArrayOfWords
{
    private ArrayList<String> arrayWords;
    private HashMap<String, Integer> hm;             // Содержит обработанную ситуацию. Заполняется сразу при инициализации.

    public ArrayOfWords(ArrayList<String> arrayWords)
    {
        this.arrayWords = arrayWords;
        hm = new HashMap<>();
        unicWords();
    }

    // Обрабатывает первоначальный список. Не уверен, правильно, ли помещать метод в конструктор.
    // Если нет,то возможны варманты. Но если в конструкторе, то вызывается только один раз.
    private void unicWords()
    {
        for(int i = 0; i < arrayWords.size(); i++)
        {
            int repeate = 0;
            for(int j = 0; j < arrayWords.size(); j++)
            {
                if(arrayWords.get(i).equalsIgnoreCase(arrayWords.get(j)))
                {
                    repeate++;
                }
            }
            hm.put(arrayWords.get(i), repeate);
        }
    }

    // список уникальных имён.
    public void listOfUnicWord()
    {
//        unicWords();
        Set<Map.Entry<String, Integer>> set = hm.entrySet();
        ArrayList<String> unicWord = new ArrayList<>();  // для вывода в строку.
        for (Map.Entry<String, Integer> me: set)
        {
//            System.out.println(me.getKey());
            unicWord.add(me.getKey());
        }
        System.out.println(unicWord);
    }

    // список уникальных имён с количеством упоминаний.
    public void allInfo()
    {
//        unicWords();
        Set<Map.Entry<String, Integer>> set = hm.entrySet();

        for (Map.Entry<String, Integer> me: set)
        {
            System.out.println(me.getKey() + " " + me.getValue());
        }
    }

    // Первоначальный список.
    public void origInfo()
    {
        System.out.println(arrayWords);
    }

    public HashMap<String, Integer> getHm()
    {
        return hm;
    }
}
