package question4;

public class MissileController {
	
	private static MissileController cMissile;
	
	private MissileOperation operation1;
	private MissileOperation operation2;
	
	
	private MissileController() {
		
	}
public static MissileController getInstance() {
	
	if(cMissile==null) {
		
		cMissile=new MissileController();
		System.out.println("Initailize Missile Controller ..");
	}
	
	return cMissile;
}
public void setOperation(MissileOperation launch,MissileOperation blast) {
	this.operation1=launch;
	this.operation2=blast;
}

	public void  performLaunching(String start) {
		operation1.initiateoperation(start);
	}
	
	public void performBIasting(String end) {
		operation2.initiateoperation(end);
	}
	

}
