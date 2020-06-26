package ru.geekbrains.Phonebook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Phonebook
{
    private TreeMap<String, ArrayList<String>> phonebook;

    public Phonebook(TreeMap<String, ArrayList<String>> phonebook)
    {
        this.phonebook = phonebook;
    }

    // для более очевидной в условии задачи инициализации.
    public Phonebook(String name, String phone)
    {
        ArrayList<String> var = new ArrayList<>();
        var.add(phone);
        phonebook.put(name, var);
    }

    public void addArray(String name, ArrayList<String> phone)
    {
        boolean bon = true;   // переменная для понимания, есть ли уже это имя в ТС.
        for(Map.Entry<String, ArrayList<String>> o : phonebook.entrySet())
        {
            if(name.equalsIgnoreCase(o.getKey()))
            {                                             // если такой абонент уже есть, то к его
                                                          // номеру(-ам) добаляются введённые.
                ArrayList<String> var = o.getValue();
                Iterator<String> iter = phone.iterator();
                while (iter.hasNext())
                {
                    var.add(iter.next());
                }
                phonebook.put(o.getKey(), var);
                bon = false;
                break;
            }
        }
        if(bon)
        {
            phonebook.put(name, phone);
        }
    }

    // для более очевидного в условии задачи добавления, логика такая же как в addArray
    public void addNumber(String name, String number)
    {
        boolean bon = true;
        for(Map.Entry<String, ArrayList<String>> o : phonebook.entrySet())
        {
            if(name.equalsIgnoreCase(o.getKey()))
            {
                ArrayList<String> var1 = o.getValue();
                var1.add(number);
                phonebook.put(o.getKey(), var1);
                bon = false;
                break;
            }
        }
        if(bon)
        {
            ArrayList<String> var2 = new ArrayList<>();
            var2.add(number);
            phonebook.put(name, var2);
        }
    }

    // Если возвращать, то клон, дабы невозможно было внести изменения.
    public void getNumber(String name)
    {
        boolean bon = true;
//        ArrayList<String> finish = new ArrayList<>();
        for(Map.Entry<String, ArrayList<String>> o : phonebook.entrySet())
        {
            if(name.equalsIgnoreCase(o.getKey()))
            {
                System.out.println("Имени " + name + " соответствуют  " + o.getValue());
//                finish = o.getValue();
                bon = false;
                break;
            }
        }
        if(bon)
        {
            System.out.println(name + " не в телефонном справочнике");
        }
//        return finish;
    }

    public void info ()
    {
        System.out.println("Телефонный справочник.");
        for(Map.Entry<String, ArrayList<String>> o : phonebook.entrySet())
        {
            System.out.println(o.getKey() + "   " + o.getValue());
        }
    }

    public TreeMap<String, ArrayList<String>> getPhonebook()
    {
        return phonebook;
    }
}
