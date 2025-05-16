package kadai.kadai_028;

// じゃんけんゲームの実行クラス
public class JyankenExec_Chapter28 {

    public static void main(String[] args) {
        
        // Jyanken_Chapter28クラスのインスタンスを作成
        Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
        
        // プレイヤーの手を入力させる（r, s, p）
        jyanken.getMyChoice();
        
        // 相手（コンピュータ）の手をランダムに決定
        jyanken.getRandom();
        
        // 勝敗を判定して結果を表示
        jyanken.playGame();
    }
}
