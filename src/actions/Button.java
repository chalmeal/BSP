package src.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import src.BspGame;
import src.components.ComputerHand;

/**
 * 各手のボタンを表現します。
 */
public class Button {

    // ボタンが押されたときのためのクラス
    public static class ButtonActionListener implements ActionListener {

        // ボタンが押されたときに呼ばれるメソッド
        public void actionPerformed(ActionEvent e) {
            int computerHandNum = ComputerHand.getComputerHand();
            String computerHand = BspGame.hands[computerHandNum];
            BspGame.contentsLabel.setText(computerHand);
            int playerHandNum = 0;
            for (int i = 0; i < BspGame.hands.length; i++) {
                if (BspGame.hands[i] == e.getActionCommand()) {
                    playerHandNum = i;
                    break;
                }
            }
            String serif = Judge.getResultText(playerHandNum, computerHandNum);
            BspGame.headerLabel.setText(serif);
        }

    }

}
