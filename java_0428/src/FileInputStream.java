public class FileInputStream implements AutoCloseable{
    private String file;

    public FileInputStream(String file) {
        this.file = file;
    }

    public void read() {
        System.out.println(file + "을 읽습니다. ");
    }

//    인터페이스 autocloseable을 상속받아 close()가 사용됨.
    @Override
    public void close() throws Exception {
        System.out.println(file + "을 닫습니다.");
    }
}
