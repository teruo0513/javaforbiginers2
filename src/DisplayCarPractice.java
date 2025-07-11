import java.util.Vector;

public class DisplayCarPractice extends MyFrame {
	public void run() {
		// 可変長配列
		Vector<Car> faces = new Vector<Car>();

		for (int i = 0; i < 5; i++) {
			faces.add(new Car(50, 60 * i + 50, i + 1, 0));
		}

		while (true) {
			clear();

			for (int j = 0; j < faces.size(); j++) {
				faces.get(j).draw(this);
				faces.get(j).move();
			}
			sleep(0.03);
		}
	}
}
