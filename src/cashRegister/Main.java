package cashRegister;

public class Main {
    public static void main(String[] args) {
        Register cashRegister = new Register();
        cashRegister.addRow("Соль", 1.6, 1);
        cashRegister.addRow("Сахар", 3.5, 2);
        cashRegister.closeBill();
        cashRegister.addRow("Помидоры", 2.7, 1.5);
        cashRegister.addRow("Огурцы", 1.7, 1.5);
        cashRegister.addRow("Лосось", 9.8, 0.3);
        cashRegister.closeBill();
        System.out.println(cashRegister.getReport());
    }
}
