public class CaDeadcodeApplication {
    String s;
    private String unused;
    private String unused_init = "init";

    public static void main(String[] args) {
        s = "hello";
        System.out.print(s);
    }
}
