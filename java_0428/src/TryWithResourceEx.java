public class TryWithResourceEx {
    public static void main(String[] args) {
//        기존 방식의 외부 리소스 닫는 방식
        System.out.println("-----기존 방식의 외부 리소스 닫는 방식-----");

        //외부 리소스 선언
        FileInputStream fis = null;

        try{
        // 외부리소스 객체 생성 및 사용
            fis = new FileInputStream("file.txt");
            fis.read();
            throw new Exception(); //강제 예외 발생
        }

        catch (Exception e) {
            //예외 처리 코드 동작 기존의 소스코드에서 외부리소스를 해제할 수 없음.
            System.out.println("예외 처리 코드가 실행되었습니다.");
        }

        finally{
            try{
                if(fis != null) {
                    fis.close(); //클로즈 명령어 사용해 닫아줘야했음.
                }
            }
            catch (Exception e) {}
        }

        System.out.println("\n--------try with resource 방식----------\n");

//        자동 close를 진행할 클래스 타입의 객체를 try의 ()안에 입력
//        try코드블록 안에서 실행 후 정상 종료 혹은 비정상 종료 가 되더라도 자동으로 close()메소드가 실행되어
//        외부 리소스를 해제함.
//        Auto close()가 적용된 클래스의 객체 선언
        try (FileInputStream fis2 = new FileInputStream("file.txt")){
//            객체사용
            fis2.read();
//          강제 예외 발생
            throw new Exception();
//          catch()가 동작하기 직전에 close() 메소드가 자동 실행됨.
        }

        catch(Exception e) {
            System.out.println("예외 처리 코드가 실행되었습니다.");
        }

        System.out.println("\n-----프로그램 종료-----\n");
    }
}
