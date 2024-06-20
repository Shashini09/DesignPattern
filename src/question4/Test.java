package question4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HeatMissileSystem heatmissile= HeatMissileSystem.getInstance();
		
		RocketMissileSystem rocketmissile=RocketMissileSystem.getInstance();
		
		MissileController cont= MissileController.getInstance();
		
		cont.setOperation(new LaunchMissile(heatmissile),new BlastMissile(heatmissile));
		cont.performLaunching("Colombo");
		cont.performBIasting("MH370");
		
		cont.setOperation(new LaunchMissile(rocketmissile),new BlastMissile(rocketmissile));
		cont.performLaunching("Kandy");
		cont.performBIasting("MH420");
		
		
	}

}
