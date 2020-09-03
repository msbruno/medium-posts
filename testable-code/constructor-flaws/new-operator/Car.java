import java.util.ArrayList;

class Car {
  
	private ArrayList<RainTyre> tyres;

	public Car(){
		this.tyres = new ArrayList<RainTyre>();
		this.tyres.add(new RainTyre());
		this.tyres.add(new RainTyre());
		this.tyres.add(new RainTyre());
		this.tyres.add(new RainTyre());
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
