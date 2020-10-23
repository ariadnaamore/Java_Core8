package hworkJet;

public abstract class JetFly extends Controling{
	
	
	int wight;
	int height;
	int lenth;
	int time;
	double km;
	
	
public JetFly(int wight, int height, int lenth, int time, double km) {
		super();
		this.wight = wight;
		this.height = height;
		this.lenth = lenth;
		this.time = time;
		this.km = km;
	}




@Override
public void moveUp() {
	
	super.moveUp();
}




@Override
public void moveRight() {
	
	super.moveRight();
}




@Override
public void moveLeft() {
	
	super.moveLeft();
}




@Override
public void moveDown() {
	// TODO Auto-generated method stub
	super.moveDown();
}




public void startEngine() {
		
		System.out.println("Jet will be ready in "+ (int) (Math.random() * 69 + 20)  + " minutes");
		
	}
public void flyUp() {
	System.out.println("Jet will go "+ (Math.random() * (1000 - 1) + 1) +" km in this fuel");
	
	
}
	public void landing() {
		System.out.println("The jet starts landing");
	};
	
	
}
