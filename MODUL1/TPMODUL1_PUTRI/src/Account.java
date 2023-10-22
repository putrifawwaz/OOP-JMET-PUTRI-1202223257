public class Account {
    private String name;
    private int accountNumber;
    private int balance;

    public Account(String name, int accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance = this.balance + amount;
        System.out.println("Saldo Akun " + getName() + " setelah menyetor uang adalah sebesar " + this.balance);
    }

    public boolean withdraw(int amount) {
        boolean result = false;
        if (amount > 0) {
            this.balance = this.balance - amount;
            result = true;
            System.out.println("Saldo Akun " + this.getName() + " setelah menarik uang adalah sebesar " + this.balance);
            return result;
        } else {
            System.out.println("Jumlah yang dimasukkan tidak valid");
            return result;
        }
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
        

}
