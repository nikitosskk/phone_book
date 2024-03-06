import java.util.*;

public class PhoneBook {
    private HashMap<String, List<String>> phoneBook = new HashMap<>();

    public void addPhone(String name, String phone) {
        if (name == null || name.isEmpty() || phone == null || phone.isEmpty()) {
            throw new IllegalArgumentException("Name or phone is empty");
        }

        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>());
        }
        phoneBook.get(name).add(phone);
    }

    public void printPhoneBook() {
        List<String> sortedNames = new ArrayList<>(phoneBook.keySet());
        sortedNames.sort(String::compareToIgnoreCase);
        Collections.reverse(sortedNames);

        for (String name : sortedNames) {
            System.out.println(name + ": " + phoneBook.get(name));
        }
    }
}
