package src.components;

import java.util.Random;

/**
 * コンピュータがランダムで出す手を作成します。
 * 確率は各1/3です。
 */
public class ComputerHand {

    // コンピュータの手を取得するためのメソッド
    public static int getComputerHand() {
        Random random = new Random();
        // handに0〜2の数値をランダムで代入
        int hand = random.nextInt(3);
        return hand;
    }

}
