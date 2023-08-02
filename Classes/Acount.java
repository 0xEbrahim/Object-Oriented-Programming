public class Acount {
    private int accountNo ;
    private float amount;
    private String name;
    public void insert(int accountNo ,String name , float amount ){
        this.accountNo = accountNo ;
        this.name = name;
        this.amount = amount;
    }
    public void deposit(float amount){
        this.amount+=amount;
        System.out.println("Cash added, your Balance Now is : " + this.amount);
    }
    public void withdraw(float amount){
        if(this.amount-amount >= 0){
            this.amount-=amount;
            System.out.println("Successful operation, your Balance now is : " + this.amount);
        }else{
            System.out.println("There is no enough cash...");
        }
    }

    public void checkBalance(){
        System.out.println("Balance : " + this.amount);
    }
    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", amount=" + amount +
                ", name='" + name + '\'' +
                '}';
    }
}
