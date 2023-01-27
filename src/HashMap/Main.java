package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Client, Integer> clients = new HashMap<>();
        clients.put(new Client("Olga", "Volodina", true), 5);
        clients.put(new Client("Alla", "Rogozina", true), 9);
        clients.put(new Client("Petr", "Borisov", false), 56);
        for (Integer value : clients.values()) {
            System.out.println(value);
        }
    }
}
