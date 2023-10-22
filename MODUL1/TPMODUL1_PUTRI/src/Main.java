public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addAccount("Putri_SI4603", 1202223257, 100000);
        bank.addAccount("Sazkia_SI4603", 1202223258, 200000);
        bank.addAccount("Aliyah_SI4603", 1202223259, 100000);

        System.out.println("\n===================================\n");

        bank.deposit(30000, "Putri_SI4603");
        bank.withdraw(20000, "Aliyah_SI4603");

        System.out.println("\n===================================\n");

        bank.removeAccount("Sazkia_SI4603");

        System.out.println("\n===================================\n");

        bank.getAllAccount();
        
    }
}