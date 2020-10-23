package hworkJet;

public class Application {

	public static void main(String[] args) {
		Su27 su27 = new Su27(100, 150, 24, 40, 5000, "red", 300);

su27.startEngine();
su27.flyUp();
su27.stelsRegime();
su27.boomnuclear();
su27.moveDown();
su27.moveUp();
su27.moveLeft();
su27.moveRight();
su27.turbospeed();
su27.landing();
	}

}
