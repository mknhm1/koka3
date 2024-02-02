import java.util.Scanner;
public class Maker {
    public void maker(){
        Indication indication = new Indication();
        Phone phone =new Phone();
        System.out.println("1 samsung");
        System.out.println("2 SONY");
        System.out.println("3 Apple");
        System.out.println("選択");
        Scanner stdIn = new Scanner(System.in);
        int x = Integer.parseInt(stdIn.next());

        switch (x) {
            case 0:
                indication.fin();
                break;
            case 1:
                phone.printg1();
                phone.printg2();
                phone.printg3();
                break;
            case 2:
            case 3:
            phone.printi1();
            phone.printi2();
            phone.printi3();
            //     break;
            default:
                // Handle default case
                break;
        }
    }

}
