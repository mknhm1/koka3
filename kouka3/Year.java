import java.util.Scanner;
// Year class
public class Year extends ExceptionHandling {

    public void year() {
        Indication indication = new Indication();
        Phone phone = new Phone();

        // 年選択メニュー表示
        System.out.println("1 2023");
        System.out.println("2 2022");
        System.out.println("3 2021");
        System.out.println("4 2020");
        System.out.println("5 2019");
        System.out.println("6 2018");
        System.out.println("7 2017");
        System.out.println("選択");
        Scanner stdIn = new Scanner(System.in);

        int x = -1;
        // 入力が数字でない場合や範囲外の場合の例外処理
        while (x < 0 || x > 3) {
            try {
                x = Integer.parseInt(stdIn.next());
                if (x < 0 || x > 3) {
                    throw new InputException("無効な入力。再入力してください。");
                }
            } catch (NumberFormatException e) {
                handleException("無効な入力です。再入力してください.");
            } catch (InputException e) {
                handleException(e.getMessage());
            }
        }

        switch (x) {
            case 0:
                indication.fin(); // 終了メソッド呼び出し
                break;
            case 1:
                phone.year23(); // Phoneクラスのyear23メソッド呼び出し
                break;
            case 2:
                phone.year22(); // Phoneクラスのyear22メソッド呼び出し
                break;
            case 3:
                phone.year21(); // Phoneクラスのyear21メソッド呼び出し
                break;
            case 4:
                phone.year20(); // Phoneクラスのyear20メソッド呼び出し
                break;
            case 5:
                phone.year19(); // Phoneクラスのyear19メソッド呼び出し
                break;
            case 6:
                phone.year18(); // Phoneクラスのyear18メソッド呼び出し
                break;
            case 7:
                phone.year17(); // Phoneクラスのyear17メソッド呼び出し
                break;
            default:
                // 未定義の入力に対する処理
                break;
        }
    }
}