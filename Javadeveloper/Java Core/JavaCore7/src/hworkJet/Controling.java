package hworkJet;

public class Controling implements MovingDown, MovingLeft, MovingRight, MovingUp{

	int d = (int) (Math.random() * (100 - 1) + 1);
	int c = (int) (Math.random() * (100 - 1) + 1);
	int u = (int) (Math.random() * (100 - 1) + 1);
	int r = (int) (Math.random() * (100 - 1) + 1);
	
	@Override
	public void moveUp() {
		System.out.println("Jet up to "+ u +" points");
		
	}

	@Override
	public void moveRight() {
		System.out.println("Jet right to "+ r +" points");
		
	}

	@Override
	public void moveLeft() {
		System.out.println("Jet left to "+ c +" points");
	}

	@Override
	public void moveDown() {
		System.out.println("Jet down to "+d +" points");
		
	}

}
