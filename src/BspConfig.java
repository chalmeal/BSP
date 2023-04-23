package src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import src.actions.Button.ButtonActionListener;
import src.makes.PanelMaker;
import src.makes.TextMaker;

/**
 * Swingでの画面上の設定を表現します。
 * サイズの変更は好みに合わせて行ってください。
 */
public class BspConfig {

    public static void GameConfig() {
        JFrame frame = new JFrame("じゃんけんゲーム");
        frame.setSize(640, 480);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        // ヘッダー
        JPanel headerPanel = PanelMaker.makePanel(Color.BLACK, 640, 50);
        headerPanel.setLayout(new BorderLayout());
        BspGame.headerLabel = TextMaker.makeText("「さあ、じゃんけんで勝負だ！」", 24, Color.WHITE);
        headerPanel.add(BspGame.headerLabel);
        frame.add(headerPanel, BorderLayout.NORTH);

        // コンテンツパネル
        JPanel contentsPanel = PanelMaker.makePanel(Color.WHITE);
        contentsPanel.setLayout(new BorderLayout());
        BspGame.contentsLabel = TextMaker.makeText("じゃんけん……", 54, Color.BLACK);
        contentsPanel.add(BspGame.contentsLabel);
        frame.add(contentsPanel, BorderLayout.CENTER);

        // フッター
        JPanel footerPanel = PanelMaker.makePanel(Color.BLACK, 640, 50);
        footerPanel.setLayout(new GridLayout());

        // プレイヤーが選択する手のボタン
        for (String hand : BspGame.hands) {
            JButton button = new JButton(hand);
            button.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 24));
            button.addActionListener(new ButtonActionListener());
            footerPanel.add(button);
        }

        frame.add(footerPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

}
