package kadai.kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

    // 単語とその意味を格納するための辞書（連想配列）
    private HashMap<String, String> dictionary;

    // コンストラクタ：インスタンス生成時に辞書を初期化する
    public Dictionary_Chapter21() {
        dictionary = new HashMap<String, String>(); // 空の辞書を作成

        // 辞書に英単語と日本語訳を追加
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウイ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    // 指定された単語配列を検索し、意味を出力するメソッド
    public void search(String[] words) {
        // 配列の各単語に対して処理を実行
        for (String word : words) {
            // 辞書に単語が存在するかを確認
            if (dictionary.containsKey(word)) {
                // 存在する場合は意味を表示
                System.out.println(word + "の意味は" + dictionary.get(word));
            } else {
                // 存在しない場合は存在しない旨を表示
                System.out.println(word + "は辞書に存在しません");
            }
        }
    }
}
