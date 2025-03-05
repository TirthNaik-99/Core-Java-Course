package org.example;

class BankAccount {
    private int bankAccountNumber;
    private String accountHolderName;

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
}
public class Encapsulation{
    public static void main(String[] args) {
         BankAccount bankAccount = new BankAccount();
         bankAccount.setBankAccountNumber(123456789);
         bankAccount.setAccountHolderName("Tirth Naik");
         System.out.println(bankAccount.getBankAccountNumber());
         System.out.println(bankAccount.getAccountHolderName());
    }
}
