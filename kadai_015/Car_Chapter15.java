package kadai.kadai_015;

public class Car_Chapter15 {

    private int beforeGear = 1;
    private int speed = 10;
    private int afterGear = 1;
	

      
     public Car_Chapter15(int gear) {

    	 this.beforeGear = gear ;
	}

	public void gearChange(int afterGear) {
		this.afterGear = afterGear ;
		switch (afterGear) {
		case 1  -> this.speed = 10;
		case 2  -> this.speed = 20;
		case 3  -> this.speed = 30;
		case 4  -> this.speed = 40;
		case 5  -> this.speed = 50;

		default -> this.speed = 10;
		
		}
		
	}
     public void run() {
		System.out.println("ギア" + beforeGear + "から" + afterGear + "に切り替えました");
		System.out.println("速度は時速" + speed +"kmです" );

	}
}
