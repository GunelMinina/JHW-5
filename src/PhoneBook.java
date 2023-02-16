import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    HashMap<String, ArrayList<String>> phoneMap = new HashMap<>();
    public void add(String surname, String phone) {
        ArrayList<String> phones = phoneMap.get(surname);

        if (phones == null) {
            ArrayList<String> listOfPhones = new ArrayList<>();
            listOfPhones.add(phone);
            phoneMap.put(surname, listOfPhones);
        } else {
            phones.add(phone);
            phoneMap.put(surname, phones);
        }
    }
    public ArrayList<String> get(String surname) {
        return phoneMap.get(surname);
    }

}