package src.makes;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

/**
 * パネルを作成します。
 * サイズ変更を行いたい場合は前者、不要な場合は後者を利用してください。
 */
public class PanelMaker {

    // パネルを作るメソッド（サイズx,y指定）
    public static JPanel makePanel(Color color, int width, int height) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        panel.setPreferredSize(new Dimension(width, height));
        return panel;
    }

    // パネルを作るメソッド（サイズx,y未指定）
    public static JPanel makePanel(Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        return panel;
    }

}
