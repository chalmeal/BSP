package src;

import javax.swing.JLabel;

import src.components.Hands;

/**
 * じゃんけんアプリケーションを実行します。
 */
public class BspGame {

	public static JLabel contentsLabel;
	public static JLabel headerLabel;
	public static String[] hands = Hands.hands();

	public static void main(String[] args) {
		BspConfig.GameConfig();
	}

}