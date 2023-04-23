package src.makes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

/**
 * 画面上に表示するテキストを作成します。
 */
public class TextMaker {

    // テキストを作るメソッド
    public static JLabel makeText(String str, int size, Color color) {
        JLabel label = new JLabel(str);
        label.setForeground(color);
        label.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, size));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        return label;
    }

}
