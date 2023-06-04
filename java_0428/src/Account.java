public class Account {
    private long balance;

    public Account() {

    }

    public long getBalance() {
        return balance;
    }

    public void deposi(int money) {
        balance += money;
     }

     public void withdraw(int money) throws UserMadeException {
         //예금액이 출금액 보다 많을 경우
        if(balance < money) {
            //        강제 예외 발생
            throw new UserMadeException("잔고부족 : " + (money - balance) + "원 모자람");
        }
        balance -= money;
     }

    public void deposit(int i) {
    }
}
