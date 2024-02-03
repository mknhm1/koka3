import java.util.Scanner;

public class Maker {
    public void maker() {
        Indication indication = new Indication();
        Phone phone = new Phone();
        System.out.println("1 Samsung\n2 Sony\n3 Apple\n選択");
        Scanner stdIn = new Scanner(System.in);
        int x = Integer.parseInt(stdIn.next());

        switch (x) {
            case 0:
                indication.fin();
                break;
            case 1:
                phone.Samsun();
                break;
            case 2:
                phone.Sony();
                break;
            case 3:
                phone.Apple();
                break;
            default:
                // Handle default case
                break;
        }
    }
}