import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    //        Реализуйте структуру телефонной книги с помощью HashMap,
    //        учитывая, что 1 человек может иметь несколько телефонов.
    HashMap<String, ArrayList<String>> phoneMap = new HashMap<>();

    public static void main(String[] args) {

        PhoneBook pb = new PhoneBook();
        pb.add("Иванов", "8(800)222-22-33");
        pb.add("Петров", "8(495)444-55-66");
        pb.add("Сидоров", "8(800)444-55-66");
        pb.add("Пушкин", "8(800)444-55-66");
        pb.add("Иванов", "8(496)234-44-44");
        pb.add("Лермонтов", "8(925)316-65-82");
        pb.add("Коровин", "8(903)155-20-90");
        pb.add("Дынин", "8(903)675-75-10");
        pb.add("Пышечкин", "8(495)613-43-04");
        pb.add("Иванов", "8(800)555-33-55");

        System.out.println(pb.get("Пупкин"));
    }

}