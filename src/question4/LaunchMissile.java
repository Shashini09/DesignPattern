package question4;

public class LaunchMissile implements MissileOperation {

MissileSystem missile;
	
	
	
	public LaunchMissile(MissileSystem missile) {
		
		this.missile = missile;
	}
	@Override
	public void initiateoperation(String location) {
		// TODO Auto-generated method stub
missile.launch(location);
	}

}
