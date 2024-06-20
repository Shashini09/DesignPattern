package question4;

public class BlastMissile implements MissileOperation {

	MissileSystem missile;
	
	
	
	public BlastMissile(MissileSystem missile) {
		
		this.missile = missile;
	}



	@Override
	public void initiateoperation(String location) {
		// TODO Auto-generated method stub
missile.blast(location);
	}

}
