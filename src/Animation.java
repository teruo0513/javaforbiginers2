
public class Animation extends MyFrame {

	// 処理停止させる秒数
	private float _sleepSecond = 0.02f;

	public void run() {

		// 表示させたい箇所のコメントアウトを外してね

		Practice5_1();
		Practice5_2();
		Practice5_3();
		
		Practice5_EX();
		Practice5_EX2();
	} 

	
	// 練習問題5-1
	private void Practice5_1() {
		int y = 200;
		int x = 30;

		while (y >= 100) {
			//(1)画面を消す
			clear();

			//(2)四角形を表示する
			setColor(0, 128, 0);
			fillOval(x, y, 100, 100);

			y -= 5;
			sleep(_sleepSecond);
		}
		while (x <= 200) {
			//(1)画面を消す
			clear();

			//(2)四角形を表示する
			setColor(0, 128, 0);
			fillOval(x, y, 100, 100);

			x += 5;
			sleep(_sleepSecond);
		}
	}

	// 練習問題5-2
	private void Practice5_2() {
		int y = 30;
		int x = 30;

		while (y <= 200) {
			//(1)画面を消す
			clear();

			//(2)四角形を表示する
			setColor(0, 128, 0);
			fillOval(x, y, 100, 100);

			y += 5;
			x += 5;
			sleep(_sleepSecond);
		}
		while (x >= 30) {
			//(1)画面を消す
			clear();

			//(2)四角形を表示する
			setColor(0, 128, 0);
			fillOval(x, y, 100, 100);

			x -= 5;
			sleep(_sleepSecond);
		}
		while (y >= 30) {
			//(1)画面を消す
			clear();

			//(2)四角形を表示する
			setColor(0, 128, 0);
			fillOval(x, y, 100, 100);

			y -= 5;
			x += 5;
			sleep(_sleepSecond);
		}
	}

	// 練習問題5-3
	private void Practice5_3() {
		int y = 100;
		int x = 30;

		for (int i = 0; i < 3; i++) {
			while (x <= 200) {
				//(1)画面を消す
				clear();

				//(2)四角形を表示する
				setColor(0, 128, 0);
				fillOval(x, y, 100, 100);

				x += 5;
				sleep(_sleepSecond);
			}
			while (x >= 30) {
				//(1)画面を消す
				clear();

				//(2)四角形を表示する
				setColor(0, 128, 0);
				fillOval(x, y, 100, 100);

				x -= 5;
				sleep(_sleepSecond);
			}
		}
	}

	// 練習問題5-EX
	private void Practice5_EX() {
		int y = 30;
		int x = 30;

		while (true) {
			while (x <= 200) {
				//(1)画面を消す
				clear();

				//(2)四角形を表示する
				setColor(0, 128, 0);
				fillOval(x, y, 100, 100);

				x += 5;
				sleep(_sleepSecond);
			}
			while (y <= 200) {
				//(1)画面を消す
				clear();

				//(2)四角形を表示する
				setColor(0, 128, 0);
				fillOval(x, y, 100, 100);

				y += 5;
				sleep(_sleepSecond);
			}
			while (x >= 30) {
				//(1)画面を消す
				clear();

				//(2)四角形を表示する
				setColor(0, 128, 0);
				fillOval(x, y, 100, 100);

				x -= 5;
				sleep(_sleepSecond);

			}
			while (y >= 30) {
				//(1)画面を消す
				clear();

				//(2)四角形を表示する
				setColor(0, 128, 0);
				fillOval(x, y, 100, 100);

				y -= 5;
				sleep(_sleepSecond);

			}
		}
	}

	// 練習問題5-EX2
	// (おまけ対応)
	private void Practice5_EX2() {
		int y = 30;
		int x = 30;
		// 折り返しごとに下に移動する量
		int moveDown = 50;

		// 下に移動する目標
		int targetY = y + moveDown;

		// 今の移動方向
		boolean isRight = true;

		while (true) {

			while (IsRight(isRight, x)) {

				//(1)画面を消す
				clear();

				//(2)四角形を表示する
				setColor(0, 128, 0);
				fillOval(x, y, 100, 100);

				// 三項演算子
				// isRightがTrueなら→へ移動 Falseなら←へ移動
				x += isRight ? 5 : -5;
				sleep(_sleepSecond);
			}
			
			// 次回移動する方向を反対にする
			isRight = !isRight;
			
			while (y <= targetY) {
				//(1)画面を消す
				clear();

				//(2)四角形を表示する
				setColor(0, 128, 0);
				fillOval(x, y, 100, 100);

				y += 5;
				sleep(_sleepSecond);
			}
			
			// 確認用にある程度下まで行ったら上に戻す
			targetY += moveDown;
			if (y > 400) {
				y = 30;
				targetY = y + moveDown;
			}
		}
	}

	// 移動方向と現在地を指定すると
	// 移動すべき位置まで移動しているかどうかを返す関数
	private boolean IsRight(boolean isRight, int x) {
		if (isRight) {
			return x <= 200;
		} else {
			return x >= 30;
		}

	}
}
