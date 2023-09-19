package course57;

import java.util.Random;
import java.util.Scanner;

public class PlayControll {

	public static void main(String[] args) {
		Random rnd = new Random();
		int count = 0;
		Scanner stdIn = new Scanner(System.in);
		Player me = new Player();
		Target koku = new Target();

		System.out.println("さぁ。どうしますか？？");
		System.out.println("0.通常垢抜けシュミレーション、99.チートデバッグモード");
		int de = stdIn.nextInt();
		popo: while (true) {
			if (de == 0) {
				me.setGakkuryoku(rnd.nextInt(5) + 1);
				me.setKinryoku(rnd.nextInt(5) + 1);
				me.setMitame(rnd.nextInt(5) + 1);
				me.setOmosiro(rnd.nextInt(5) + 1);

				koku.setHituyouGaku(rnd.nextInt(11) + 3);
				koku.setHituyouKin(rnd.nextInt(11) + 3);
				koku.setHituyouMita(rnd.nextInt(11) + 3);
				koku.setHituyouOmo(rnd.nextInt(11) + 3);
				break;
			} else if (de == 99) {
				System.out.println("自分の学力");
				me.setGakkuryoku(stdIn.nextInt());
				System.out.println("自分の筋力");
				me.setKinryoku(stdIn.nextInt());
				System.out.println("自分の顔面値");
				me.setMitame(stdIn.nextInt());
				System.out.println("自分の面白さ");
				me.setOmosiro(stdIn.nextInt());

				System.out.println("相手の学力");
				koku.setHituyouGaku(stdIn.nextInt());
				System.out.println("相手の筋力");
				koku.setHituyouKin(stdIn.nextInt());
				System.out.println("相手の顔面");
				koku.setHituyouMita(stdIn.nextInt());
				System.out.println("相手の面白さ");
				koku.setHituyouOmo(stdIn.nextInt());
				break;
			} else {
				continue popo;
			}

		}

		while (count < 7) {
			System.out.println("現在のステータスは以下の通りです");
			System.out.println("学力:" + me.getGakkuryoku());
			System.out.println("筋力:" + me.getKinryoku());
			System.out.println("見た目:" + me.getMitame());
			System.out.println("面白さ:" + me.getOmosiro());
			System.out.println("メニューを選択してください");
			System.out.println("1.筋トレ、2.勉強、3.整形、4.人としゃべる");

			int menu = stdIn.nextInt();
			int ko = rnd.nextInt(4);

			if (menu == 1) {

				me.setKinryoku(me.getKinryoku() + 1);
				count = count + 1;
				if (ko == 0) {
					System.out.println("相手の学力値は" + koku.getHituyouGaku() + "です");
					System.out.println("告白成功までは" + (koku.getHituyouGaku() - me.getGakkuryoku() + 1) + "以上必要です。");
				} else if (ko == 1) {
					System.out.println("相手の筋力値は" + koku.getHituyouKin() + "です");
					System.out.println("告白成功までは" + (koku.getHituyouKin() - me.getKinryoku() + 1) + "以上必要です。");
				} else if (ko == 2) {
					System.out.println("相手の見た目値は" + koku.getHituyouMita() + "です");
					System.out.println("告白成功までは" + (koku.getHituyouMita() - me.getMitame() + 1) + "以上必要です。");
				} else {
					System.out.println("相手のおもしろ値は" + koku.getHituyouOmo() + "です");
					System.out.println("告白成功までは" + (koku.getHituyouOmo() - me.getOmosiro() + 1) + "以上必要です。");
				}

			} else if (menu == 2) {

				count = count + 1;
				me.setGakkuryoku(me.getGakkuryoku() + 1);
				if (ko == 0) {
					System.out.println("相手の学力値は" + koku.getHituyouGaku() + "です");
					System.out.println("告白成功までは" + (koku.getHituyouGaku() - me.getGakkuryoku() + 1) + "以上必要です。");
				} else if (ko == 1) {
					System.out.println("相手の筋力値は" + koku.getHituyouKin() + "です");
					System.out.println("告白成功までは" + (koku.getHituyouKin() - me.getKinryoku() + 1) + "以上必要です。");
				} else if (ko == 2) {
					System.out.println("相手の見た目値は" + koku.getHituyouMita() + "です");
					System.out.println("告白成功までは" + (koku.getHituyouMita() - me.getMitame() + 1) + "以上必要です。");
				} else {
					System.out.println("相手のおもしろ値は" + koku.getHituyouOmo() + "です");
					System.out.println("告白成功までは" + (koku.getHituyouOmo() - me.getOmosiro() + 1) + "以上必要です。");
				}

			} else if (menu == 3) {

				count = count + 1;
				me.setMitame(me.getMitame() + 1);
				if (ko == 0) {
					System.out.println("相手の学力値は" + koku.getHituyouGaku() + "です");
					System.out.println("告白成功までは" + (koku.getHituyouGaku() - me.getGakkuryoku() + 1) + "以上必要です。");
				} else if (ko == 1) {
					System.out.println("相手の筋力値は" + koku.getHituyouKin() + "です");
					System.out.println("告白成功までは" + (koku.getHituyouKin() - me.getKinryoku() + 1) + "以上必要です。");
				} else if (ko == 2) {
					System.out.println("相手の見た目値は" + koku.getHituyouMita() + "です");
					System.out.println("告白成功までは" + (koku.getHituyouMita() - me.getMitame() + 1) + "以上必要です。");
				} else {
					System.out.println("相手のおもしろ値は" + koku.getHituyouOmo() + "です");
					System.out.println("告白成功までは" + (koku.getHituyouOmo() - me.getOmosiro() + 1) + "以上必要です。");
				}

			} else if (menu == 4) {

				count = count + 1;
				me.setOmosiro(me.getOmosiro() + 1);
				if (ko == 0) {
					System.out.println("相手の学力値は" + koku.getHituyouGaku() + "です");
					System.out.println("告白成功までは" + (koku.getHituyouGaku() - me.getGakkuryoku() + 1) + "以上必要です。");
				} else if (ko == 1) {
					System.out.println("相手の筋力値は" + koku.getHituyouKin() + "です");
					System.out.println("告白成功までは" + (koku.getHituyouKin() - me.getKinryoku() + 1) + "以上必要です。");
				} else if (ko == 2) {
					System.out.println("相手の見た目値は" + koku.getHituyouMita() + "です");
					System.out.println("告白成功までは" + (koku.getHituyouMita() - me.getMitame() + 1) + "以上必要です。");
				} else {
					System.out.println("相手のおもしろ値は" + koku.getHituyouOmo() + "です");
					System.out.println("告白成功までは" + (koku.getHituyouOmo() - me.getOmosiro() + 1) + "以上必要です。");
				}

			} else {
				System.out.println("1～4で選択してください");
			}

		}
		////////////////////告白フェーズ////////////////////////////
		System.out.println("さて。。。。。。。。。。。。");
		System.out.println("告白の日です。何で挑みますか。");
		System.out.println("1.学力、2.筋力、3.顔面、4.面白さ");
		int koku1 = stdIn.nextInt();

		point: while (true) {
			if (koku1 == 1) {
				/////////////////学力勝負///////////////////////
				if (me.getGakkuryoku() > koku.getHituyouGaku()) {
					int ni = rnd.nextInt(3);
					////////////////////学力は勝ってランダムフェーズ///////////////////
					if (ni == 0) {
						if (me.getKinryoku() > koku.getHituyouKin()) {
							System.out.println("告白成功ですおめでと");
							break;
						} else {
							System.out.println("死亡しました。もっと垢ぬけろ");
							break;
						}
					}
					if (ni == 1) {
						if (me.getMitame() > koku.getHituyouMita()) {
							System.out.println("告白成功ですおめでと");
							break;
						} else {
							System.out.println("死亡しました。もっと垢ぬけろ");
							break;
						}
					}
					if (ni == 2) {
						if (me.getOmosiro() > koku.getHituyouOmo()) {
							System.out.println("告白成功ですおめでと");
							break;
						} else {
							System.out.println("死亡しました。もっと垢ぬけろ");
							break;
						}
					}
					/////////////////////////////////////////////////////////
				} else {
					System.out.println("死亡しました。おつ。ｗ");
					break;
				}
				/////////////////////////////////////////////////////////
			} else if (koku1 == 2) {
				if (me.getKinryoku() > koku.getHituyouKin()) {
					int ni = rnd.nextInt(3);
					if (ni == 0) {
						if (me.getGakkuryoku() > koku.getHituyouGaku()) {
							System.out.println("告白成功ですおめでと");
							break;
						} else {
							System.out.println("死亡しました。もっと垢ぬけろ");
							break;
						}
					}
					if (ni == 1) {
						if (me.getMitame() > koku.getHituyouMita()) {
							System.out.println("告白成功ですおめでと");
							break;
						} else {
							System.out.println("死亡しました。もっと垢ぬけろ");
							break;
						}
					}
					if (ni == 2) {
						if (me.getOmosiro() > koku.getHituyouOmo()) {
							System.out.println("告白成功ですおめでと");
							break;
						} else {
							System.out.println("死亡しました。もっと垢ぬけろ");
							break;
						}
					}
				} else {
					System.out.println("死亡しました。おつ。ｗ");
					break;
				}
			} else if (koku1 == 3) {
				if (me.getMitame() > koku.getHituyouMita()) {
					int ni = rnd.nextInt(3);
					if (ni == 0) {
						if (me.getKinryoku() > koku.getHituyouKin()) {
							System.out.println("告白成功ですおめでと");
							break;
						} else {
							System.out.println("死亡しました。もっと垢ぬけろ");
							break;
						}
					}
					if (ni == 1) {
						if (me.getGakkuryoku() > koku.getHituyouGaku()) {
							System.out.println("告白成功ですおめでと");
							break;
						} else {
							System.out.println("死亡しました。もっと垢ぬけろ");
							break;
						}
					}
					if (ni == 2) {
						if (me.getOmosiro() > koku.getHituyouOmo()) {
							System.out.println("告白成功ですおめでと");
							break;
						} else {
							System.out.println("死亡しました。もっと垢ぬけろ");
							break;
						}
					}
				} else {
					System.out.println("死亡しました。おつ。ｗ");
					break;
				}
			} else if (koku1 == 4) {
				if (me.getOmosiro() > koku.getHituyouOmo()) {
					int ni = rnd.nextInt(3);
					if (ni == 0) {
						if (me.getKinryoku() > koku.getHituyouKin()) {
							System.out.println("告白成功ですおめでと");
							break;
						} else {
							System.out.println("死亡しました。もっと垢ぬけろ");
							break;
						}
					}
					if (ni == 1) {
						if (me.getMitame() > koku.getHituyouMita()) {
							System.out.println("告白成功ですおめでと");
							break;
						} else {
							System.out.println("死亡しました。もっと垢ぬけろ");
							break;
						}
					}
					if (ni == 2) {
						if (me.getGakkuryoku() > koku.getHituyouGaku()) {
							System.out.println("告白成功ですおめでと");
							break;
						} else {
							System.out.println("死亡しました。もっと垢ぬけろ");
							break;
						}
					}
				} else {
					System.out.println("死亡しました。おつ。ｗ");
					break;
				}
			} else {
				System.out.println("1～4で入力してください。");
				continue point;

			}
		}

	}

}
