import java.util.ArrayList;

class Car {
  
	private List<RainTyre> tyres;

	public Car(List<RainTyre> tyres){
		this.tyres = tyres;
	}

	public void run(){
	  this.burnTyres();
	  this.makeNoise();
	}

	private void burnTyres(){
		for(RainTyre tyre : tyres){
			tyre.run();
		}
	}
	
	private void makeNoise(){
		System.out.println("born to be wild!");
	}
}
