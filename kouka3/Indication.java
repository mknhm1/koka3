import java.util.Scanner;

public class Indication implements encyclpedia {
    public void fin() {
        System.exit(0);
    }

    public void stert() {
        Indication indication = new Indication();
        System.out.println("図鑑");
        System.out.println("検索項目選択");
        System.out.println("1 発売メーカー");
        System.out.println("2 発売年");
        System.out.println("0 終了");
        System.out.print("番号指定:");
        Scanner stdIn = new Scanner(System.in);
        int x = Integer.parseInt(stdIn.next());

        switch (x) {
            case 0:
                indication.fin();
                break;
            case 1:
            Maker maker=new Maker();
            maker.maker();
                break;
            case 2:
                // Implement case 2 if needed
                break;
            default:
                // Handle default case
                break;
        }
    }

}


