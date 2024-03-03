public class Ascii {
    public static void main(String[] args) {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c + ": " + (int) c);
        }
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c + " : " + (int) c);
        }
    }
}