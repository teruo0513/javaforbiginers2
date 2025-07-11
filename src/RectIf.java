
public class RectIf extends MyFrame {
	public void run() {
		setColor(0, 128, 0);
		int x = 30;

		// 4-1
		//		for (int i = 0; i < 10; i++) {
		//			fillRect(x, x, 10, 100);
		//
		//			x += 20;
		//		}

		//4-2
		//				for (int i = 0; i < 10; i++) {		
		//					fillRect(x, 100, 10, x);
		//					
		//					x += 20;
		//				}

		//4-3
		int rbg = 0;
		for (int i = 0; i < 10; i++) {

			rbg += 20;
			setColor(rbg, rbg, rbg);
			fillRect(x, 100, 10, 100);

			x += 15;
		}

		// EX
		for (int i = 0; i < 10; i++) {

			rbg -= 20;
			setColor(rbg, rbg, rbg);
			fillRect(x, 100, 10, 100);

			x += 15;

		}

	}
}
