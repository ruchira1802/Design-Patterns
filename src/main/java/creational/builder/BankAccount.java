package creational.builder;

public class BankAccount {

    private final long accountNumber;
    private final String owner;
    private final String branch;
    private final double balance;
    private final double interestRate;

    public BankAccount(BankBuilder builder) {
        this.accountNumber = builder.accountNumber;
        this.owner = builder.owner;
        this.branch = builder.branch;
        this.balance = builder.balance;
        this.interestRate = builder.interestRate;
    }


//This constructor has many parameters, and some of which are non mandatory
    //    public BankAccount(long accountNumber, String owner, String branch, double balance, double interestRate) {
//        this.accountNumber = accountNumber;
//        this.owner = owner;
//        this.branch = branch;
//        this.balance = balance;
//        this.interestRate = interestRate;
//    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public String getBranch() {
        return branch;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }



    public static class BankBuilder {

        private long accountNumber;
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        public BankBuilder setAccountNumber(long accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public BankBuilder setOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public BankBuilder setBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public BankBuilder setBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public BankBuilder setInterestRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }

    }
}
