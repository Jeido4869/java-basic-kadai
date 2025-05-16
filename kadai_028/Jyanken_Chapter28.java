package kadai.kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    // プレイヤーの手（入力値）
    private String input = "";

    // 相手の手（ランダムに決定）
    private String comparative = "";

    // -----------------------------
    // 自分の手をユーザーから入力する処理
    // -----------------------------
    public String getMyChoice() {
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        Scanner myChoice = new Scanner(System.in);

        while (true) {
            this.input = myChoice.next();  // ユーザーの入力を取得

            // 正しい入力であればそのまま返す
            if (input.equals("r") || input.equals("s") || input.equals("p")) {
                return this.input;
            } else {
                // 不正な入力の場合、再入力を促す
                System.out.println("再度入力してください");
            }
        }
    }

    // -----------------------------
    // 対戦相手の手をランダムで決定する処理
    // -----------------------------
    public String getRandom() {
        String[] Choice = {"r", "s", "p"}; // グー・チョキ・パー
        int i = (int) Math.floor(Math.random() * 3); // 0〜2のランダムな整数
        this.comparative = Choice[i]; // ランダムな手を設定
        return this.comparative;
    }

    // -----------------------------
    // 勝敗を判定し、結果を表示する処理
    // -----------------------------
    public void playGame() {
        // 手の表示用マッピング（r → グーなど）
        HashMap<String, String> choice = new HashMap<String, String>();
        choice.put("r", "グー");
        choice.put("s", "チョキ");
        choice.put("p", "パー");

        // 自分と相手の手を表示
        System.out.println("自分の手は" + choice.get(this.input) +
                           ", 対戦相手の手は" + choice.get(this.comparative));

        // 勝敗の判定ロジック
        if (this.input.equals(this.comparative)) {
            System.out.println("あいこです");
        } else if (
            (this.input.equals("r") && this.comparative.equals("s")) || // グー vs チョキ
            (this.input.equals("s") && this.comparative.equals("p")) || // チョキ vs パー
            (this.input.equals("p") && this.comparative.equals("r"))    // パー vs グー
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
