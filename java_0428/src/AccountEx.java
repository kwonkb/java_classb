public class AccountEx {
    public static void main(String[] args) {

//        예금 객체 생성
        Account acc = new Account();

//        예금하기
        acc.deposit(10000);
        System.out.println("예금액 : " + acc.getBalance());

//        출금하기
        try{
            acc.withdraw(30000);
        }

        catch (UserMadeException e) {
            String msg = e.getMessage();
            System.out.println(msg);
            System.out.println();

//            에러에 대한 모든 정보 출력
            e.printStackTrace();
        }
    }
}
