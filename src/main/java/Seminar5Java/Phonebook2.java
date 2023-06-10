//
package Seminar5Java;
import javax.naming.Name;
import java.util.*;
public class Phonebook2 {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество записей в телефонной книге:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Введите имя ");
            String name = scanner.next();
            System.out.println("Введите номер телефона:");
            String phone = scanner.next();
            List<String> phones = phoneBook.get(name);
            if (phones == null) {
                phones = new ArrayList<>();
                phones.add(phone);
                phoneBook.put(name, phones);
            } else {
                phones.add(phone);
            }
        }

        List<Map.Entry<String, List<String>>> list = new ArrayList<>(phoneBook.entrySet());
        list.sort(new Comparator<Map.Entry<String, List<String>>>() {
            @Override
            public int compare(Map.Entry<String, List<String>> o1, Map.Entry<String, List<String>> o2) {
                return o2.getValue().size() - o1.getValue().size();
            }
        });

        System.out.println("Телефонная книга:");
        for (Map.Entry<String, List<String>> entry : list) {
            String name = entry.getKey();
            List<String> phones = entry.getValue();
            System.out.println(name + ": " + phones);
        }
    }
}