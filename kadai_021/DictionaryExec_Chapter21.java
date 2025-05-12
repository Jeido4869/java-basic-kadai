package kadai.kadai_021;

public class DictionaryExec_Chapter21 {

    public static void main(String[] args) {

        // Dictionary_Chapter21 クラスのインスタンスを作成（辞書を初期化）
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 検索したい英単語の配列を定義
        String[] words = {"apple", "banana", "grape", "orange"};

        // 単語配列を使って辞書を検索し、結果を表示
        dictionary.search(words);
    }
}
