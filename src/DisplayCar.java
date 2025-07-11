
public class DisplayCar extends MyFrame {
	public void run() {
		Car face1 = new Car(10, 50, 3, 0);
		Car face2 = new Car(300, 150, -10, 0);
		face1.draw(this);

		for (int i = 0; i < 30; i++) {
			clear();
			face1.draw(this);
			face1.move();

			face2.draw(this);
			face2.move();

			sleep(0.1);
		}
	}
}
