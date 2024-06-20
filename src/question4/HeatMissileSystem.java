package question4;

public class HeatMissileSystem implements MissileSystem {
	
	
		
		private static HeatMissileSystem hMissile;
		
		private HeatMissileSystem() {
			
		}
	public static HeatMissileSystem getInstance() {
		
		if(hMissile==null) {
			
			hMissile=new HeatMissileSystem();
			System.out.println("Initailize Heat Missile System ..");
		}
		
		return hMissile;
	}

	@Override
	public void launch(String source) {
		// TODO Auto-generated method stub
		System.out.print(" Heat Missile launch from"+source);
	}

	@Override
	public void blast(String destination) {
		// TODO Auto-generated method stub

		System.out.println("and Heat Missile blast Flight"+destination);
	}

}
