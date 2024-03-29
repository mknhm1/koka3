
/**
 * Makerクラス: 発売メーカーに関するクラス
*/
import java.util.Scanner;

public class Maker extends ExceptionHandling{
    public void maker() {

            Indication indication = new Indication();
            Phone phone = new Phone();
/**
 * メーカー選択メニュー表示
 */
            System.out.println("1 Samsung\n2 Sony\n3 Apple\n選択");
            Scanner stdIn = new Scanner(System.in);

            int x = -1;
      /**
       *入力が数字でない場合や範囲外の場合の例外処理
       */
            while (x < 0 || x > 3) {
                try {
                    x = Integer.parseInt(stdIn.next());
                    if (x < 0 || x > 3) {
                        throw new InputException("無効な入力です。再入力してください。");
                    }
                } catch (NumberFormatException e) {
                    handleException("無効な入力です。再入力してください.");
                } catch (InputException e) {
                    handleException(e.getMessage());
                }
            }

            switch (x) {
                case 0:
                /**
                 * 終了メソッド呼び出し
                 */
                    indication.fin();
                    break;
                case 1:
                /**
                 * PhoneクラスのSamsunメソッド呼び出し
                 */
                    phone.Samsun();
                    break;
                case 2:
                /**
                 * PhoneクラスのSonyメソッド呼び出し
                 */
                    phone.Sony();
                case 3:
                /**PhoneクラスのAppleメソッド呼び出し
                 */
                    phone.Apple();
                    break;
                default:
                /**
                 * 未定義の入力に対する処理
                 */
                    break;
            }
        }
    }

