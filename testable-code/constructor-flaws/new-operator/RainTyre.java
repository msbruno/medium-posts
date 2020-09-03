class RainTyre {
  
	private int distanceTravelled;

	public RainTyre(){
		this.distanceTravelled = 0;  
	}

	public void run(){
		System.out.println("Tyre running.");
		this.distanceTravelled++;
	}
}
