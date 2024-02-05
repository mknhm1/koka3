
/**
 * Indicationクラス: 検索のためのクラス
*/
import java.util.Scanner;

public class Indication  extends ExceptionHandling implements Encyclpedia {
    /**
     *   終了メソッド
    */
    public void fin() {
        System.exit(0);
    }

    /**
     * 検索メソッド
    */
    public void stert() {
        /**
         *  インスタンス生成
         */
           
            Indication indication = new Indication();
            Maker maker = new Maker();
            Year year = new Year();

            /**
             * ユーザーに対するメニュー表示
             */
            System.out.println("図鑑\n検索項目選択\n1 発売メーカー\n2 発売年\n0 終了\n番号指定");
            Scanner stdIn = new Scanner(System.in);

            int x = -1;
            /**
             * 入力が数字でない場合や範囲外の場合の例外処理
             */
            while (x < 0 || x > 2) {
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
                 *  終了メソッド呼び出し
                 */
                    indication.fin();
                    break;
                case 1:
                /**
                 * Makerクラスのメーカーメソッド呼び出し
                 */
                    maker.maker();
                    break;
                case 2:
                /**
                 * Yearクラスの年メソッド呼び出し
                 */
                    year.year();
                    break;
                default:
                /**
                 * 未定義の入力に対する処理
                 */
                    break;
            }
        }
    }
