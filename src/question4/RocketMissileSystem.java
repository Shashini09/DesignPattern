package question4;

public class RocketMissileSystem implements MissileSystem {
	
	private static RocketMissileSystem rMissile;
	
	private RocketMissileSystem() {
		
	}
public static RocketMissileSystem getInstance() {
	
	if(rMissile==null) {
		
		rMissile=new RocketMissileSystem();
		System.out.println("Initailize Rocket Missile System ..");
	}
	
	return rMissile;
}

	@Override
	public void launch(String source) {
		// TODO Auto-generated method stub
		System.out.print(" Rocket Missile launch from"+source);
	}

	@Override
	public void blast(String destination) {
		// TODO Auto-generated method stub
		System.out.println("and Rocket Missile blast Flight"+destination);
	}

}
