package course18_19;

public class 配列鉄板構文 {

	public static void main(String[] args) {
		String a = "つっちー";
		String b = "おおさわニキ";
		String c = "臼井";
		String d = "鹿嶋";
		String e = "杉もっちゃん";
		String f = "藤倉";
		String g = "おおせきニキ";
		String h = "ながなわくん";

		//配列の鉄板構文
		//[]のことを要素と呼ぶ。要素は０から始まる。
		String[] nameList = new String[10];
		nameList[0] = "つっちー";
		nameList[1] = "おおさわにき";
		nameList[2] = "臼井";
		nameList[3] = "鹿嶋";
		nameList[4] = "杉もっちゃん";
		nameList[5] = "藤倉";
		nameList[6] = "おおせきにき";
		nameList[7] = "ながなわくん";

		for (int i = 0; i < 8; i++) {
			System.out.println("俺の友達の名前は" + nameList[i] + "だ。");
		}

	}

}
