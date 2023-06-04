public interface InterD extends InterA,InterB{
    @Override
    default void methodA(){
        System.out.println("ImplD  - methodA() 실행");
    }


    @Override
    default void methodB(){
        System.out.println("ImplD - methodB() 실행");
    }

    void methodD();
}
