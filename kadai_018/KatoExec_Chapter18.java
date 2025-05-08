package kadai.kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		//各オブジェクトの作成
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro =new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		
		//名前を取得
		taro.setGivenName();
		//太郎の紹介文の実行
	    taro.commonIntroduce();
		
	    //名前を取得
		ichiro.setGivenName();
		//一郎の紹介文の実行
		ichiro.commonIntroduce();
		
		//名前を取得
		hanako.setGivenName();
		//花子の紹介文の実行
		hanako.commonIntroduce();
		
	}

}
