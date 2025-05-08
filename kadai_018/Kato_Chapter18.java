package kadai.kadai_018;

abstract public class Kato_Chapter18 {


	//フィールド作成
	public String familyName = "加藤";
	public String givenName = "";
	public String address = "住所は東京都中野区〇×です";

	//共通紹介分の出力
	public void execIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println(this.address);
	}
	
	//書き換え可能な個別紹介用の抽象メソッドの作成
	abstract void eachIntroduce();
	
	//作成した紹介文を出力するメソッド
	public void commonIntroduce(){
		 execIntroduce();
		 eachIntroduce();
		 
	}
	
}
