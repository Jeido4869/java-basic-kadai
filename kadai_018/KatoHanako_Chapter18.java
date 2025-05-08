package kadai.kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18{

	//名前の取得
	public void setGivenName() {
		String name = "花子";
		this.givenName = name;
	}
	

	//個別紹介用の抽象メソッドの書き換え
	void eachIntroduce() {
	
		System.out.println("趣味は読書です");
	
	}
}
