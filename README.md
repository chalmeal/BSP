# じゃんけんゲーム

本コードはSwingでのじゃんけんゲームです。実装としてはシンプル且つ簡易的なコードで、細かな仕様は期待していません。

## ディレクトリ構成

```
BSP ー src
         |
          ― actions
         |      |
         |       ― Button.java（各手のボタンを表現します。）
         |      |
         |       ― Judge.java（勝敗引の結果を返します。）
         |
          ― components
         |       |
         |        ― ComputerHand.java（コンピュータがランダムで出す手を作成します。）
         |       |
         |        ― Hands.java（プレイヤー、コンピュータが扱う手を表現します。）
         |
          ― makes
         |       |
         |        ― PanelMaker.java（パネルを作成します。）
         |       |
         |        ― TextMaker.java（画面上に表示するテキストを作成します。）
         |
          ― BspConfig.java（Swingでの画面上の設定を表現します。）
         |
          ― BspGames.java（じゃんけんアプリケーションを実行します。）
```

## License

本コードは下記サイトを参考に作成しています。

ロジック系は引用していますが、ディレクトリ構成の変更及び一部命名を変更した実装になります。

参考：[【絶対できる！】Javaでのじゃんけんゲームの作り方](https://original-game.com/java-janken-game-program/)