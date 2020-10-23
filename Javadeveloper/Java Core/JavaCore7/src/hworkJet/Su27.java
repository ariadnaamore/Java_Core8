package hworkJet;

public class Su27 extends JetFly implements TurboSpeed, Stels, Nuclear {

int maxspeed;
String color;
int sp;
double t = (int) (Math.random() * (60 - 1) + 1);
int bomb = (int) (Math.random() * (10 - 1) + 1);
public Su27(int wight, int height, int lenth, int time, double km, String color, int maxspeed) {
	super(wight, height, lenth, time, km);
	this.color = color;
	this.maxspeed = maxspeed;
	
	
	
}
@Override
public void startEngine() {
	
	super.startEngine();
}
@Override
public void flyUp() {
	
	super.flyUp();
}
@Override
public void landing() {
	
	super.landing();
}
@Override
public void boomnuclear() {
	System.out.println("Jet drops  " + bomb + " bombs");
	
}
@Override
public void stelsRegime() {
	System.out.println("Not visible during  " + t + " minutes");
	
}
@Override
public void turbospeed() {
	System.out.println("Accelerating to " + (int) (Math.random() * (maxspeed - 1) + 1) + " kmh");
	
}
public void setMaxspeed(int maxspeed) {
	this.maxspeed = maxspeed;
}
public void setColor(String color) {
	this.color = color;
}



}
