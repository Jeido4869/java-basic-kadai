package kadai.kadai_018;

public class Kato_Chapter18 {

	public static void main(String[] args) {
		
		//各オブジェクトの作成
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro =new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		
		//名前を引数に入れる
		taro.setGivenName("太郎");
		//太郎の紹介文の実行
	    taro.commonIntroduce();
		
	    //名前を引数に入れる
		ichiro.setGivenName("一郎");
		//一郎の紹介文の実行
		ichiro.commonIntroduce();
		
		//名前を引数に入れる
		hanako.setGivenName("花子");
		//花子の紹介文の実行
		hanako.commonIntroduce();
		
	}
	
}
