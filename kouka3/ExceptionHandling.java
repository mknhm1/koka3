import java.util.Scanner;
// ExceptionHandling class
class ExceptionHandling {
    public void handleException(String message) {
        System.out.println(message);
        Scanner stdIn = new Scanner(System.in);
        stdIn.nextLine(); // 不正な入力をクリア
    }
}