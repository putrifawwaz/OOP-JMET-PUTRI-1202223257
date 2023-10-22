import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accountList;

    public Bank() {
        this.accountList = new ArrayList<>();
    }

    public void addAccount(String name, int accountNumber, int balance) {
        this.accountList.add(new Account(name, accountNumber, balance));
        System.out.println("Saldo Akun " + name +": " + balance );
    }

    public void removeAccount(String name) {
        int isFind = getAccount(name);
        System.out.println("Akun " + this.accountList.get(isFind).getName() + " Berhasil di hapus.");
        accountList.remove(isFind);
    }
    
    public void withdraw(int amount, String name) {
        int isFind = getAccount(name);
        this.accountList.get(isFind).withdraw(amount);
    }

    public void deposit(int amount, String name) {
        int isFind = getAccount(name);
        this.accountList.get(isFind).deposit(amount);

    }      

    public int getAccount(String name){
        int result = 0;
        int p = 0;
        
        for(Account i : accountList){
            if(i.getName() == name ){
                result = p;
                break;
            }
            p += 1;
        }
        return result;
    }

    public void getAllAccount(){
        System.out.println("Daftar semua akun Bank:");
        for (Account i : this.accountList) {

            System.out.print("Nama : " + i.getName()+',' + " ");
            System.out.print("Nomor Akun : " + i.getAccountNumber()+',' + " ");
            System.out.print("Saldo : " + i.getBalance());
            System.out.println();

        }
    }
}
