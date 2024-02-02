import java.util.Scanner;

public class Indication implements encyclpedia {
    public void fin() {
        System.exit(0);
    }

    public void stert() {
        Indication indication = new Indication();
        Maker maker=new Maker();
        Year year=new Year();
        System.out.println("図鑑\n検索項目選択\n1 発売メーカー\n2 発売年\n0 終了\n番号指定");
        Scanner stdIn = new Scanner(System.in);
        int x = Integer.parseInt(stdIn.next());

        switch (x) {
            case 0:
                indication.fin();
                break;
            case 1:
            maker.maker();
                break;
            case 2:
            year.year();
                break;

            default:

                break;
        }
    }

}


