import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    static Map<String, ArrayList<Integer>> pbMap = new HashMap<>();


//    add(String name, Integer phoneNum): Добавляет запись в телефонную книгу.
//    Если запись с именем name уже существует, добавляет новый номер телефона в существующую запись.
//    Если запись с именем name не существует, создает новую запись с этим именем и номером телефона phoneNum.

    private static void add(String name, Integer phoneNum) {
        if (!pbMap.containsKey(name)) {
            pbMap.put(name, new ArrayList<>());
        }
        pbMap.get(name).add(phoneNum);
    }

//    find(String name): Поиск номеров телефона по имени в телефонной книге.
//    Если запись с именем name существует, возвращает список номеров телефона для этой записи.
//    Если запись с именем name не существует, возвращает пустой список.

    static void find(String name) {
        if(pbMap.containsKey(name)) System.out.println(pbMap.get(name));
        else System.out.println(new ArrayList<>());
    }

//    getPhoneBook(): Возвращает всю телефонную книгу в виде HashMap, где ключи - это имена, а значения - списки номеров
//    телефона.

    static void getPhoneBook() {
        System.out.println(pbMap);
    }

    public static void main(String[] args) {
        add("Виктор", 454545);
        add("Саша", 123478);
        add("Лена", 894534);

        getPhoneBook();

        add("Саша", 670099);

        getPhoneBook();

        find("Лена");

        getPhoneBook();

        find("Z");
    }
}


/*
Полный код для сдачи ДЗ:


import java.util.ArrayList;
import java.util.HashMap;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {

// Введите свое решение ниже
      if (!phoneBook.containsKey(name)) {
        phoneBook.put(name, new ArrayList<>());
      }
      phoneBook.get(name).add(phoneNum);
    }

    public ArrayList<Integer> find(String name) {
// Введите свое решение ниже
      ArrayList<Integer> arr = new ArrayList<>();
      if(phoneBook.containsKey(name)) arr = phoneBook.get(name);
      else arr = new ArrayList<>();
      return arr;
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
// Введите свое решение ниже
      HashMap<String, ArrayList<Integer>> map = new HashMap<>();
      map = phoneBook;
      return map;
    }
}
// Не удаляйте этот класс - он нужен для

public class Printer {
    public static void main(String[] args) {
        String name1;
        String name2;
        int phone1;
        int phone2;

        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            phone1 = 123456;
            phone2 = 654321;
        } else {
            name1 = args[0];
            name2 = args[1];
            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);

        System.out.println(myPhoneBook.find(name1));
        System.out.println(PhoneBook.getPhoneBook());
        System.out.println(myPhoneBook.find("Me"));
    }
}
 */
