package src.actions;

/**
 * 勝敗引の結果を返します。
 */
public class Judge {

    // じゃんけんの結果を取得するメソッド
    static String getResultText(int playerHand, int computerHand) {
        String resultText = "";
        int result = (playerHand - computerHand + 3) % 3;

        // あいこ
        if (result == 0) {
            return resultText = "あいこ！";
        }
        // プレイヤーが負け
        else if (result == 1) {
            return resultText = "きみの負け！";
        }
        // プレイヤーが勝ち
        else if (result == 2) {
            return resultText = "きみの勝ち！";
        }
        return resultText;

    }

}