class Bicycle {
    int speed;
    int gear;
	
	
    Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }
    void applyBrake(int decrement) {
        speed = speed - decrement;
        System.out.println("speed after braking" + speed);
    }
    void speedUp(int increment) {
        speed = speed + increment;
        System.out.println("speed after braking" + speed);
    }
    void printInfo() {
        System.out.println("speed of bicycle is= " + speed + " and gear of Bicycle is= " + gear);
    }
}

class MountainBike extends Bicycle {
    int seatheight;
    MountainBike(int speed, int gear, int seatheight) {
      super();
        this.seatheight = seatheight;
    }
    void setHeight(int newheight) {
        seatheight = newheight;
        System.out.println("new seatheight" + seatheight);
    }
	 void printInfo() {
        System.out.println("speed of bicycle is= " + speed + " and gear of Bicycle is= " + gear+ "new height="+seatheight);
    }
}

class TestDriver {
    public static void main(String...s) {
        MountainBike mb = new MountainBike(100, 5, 4);
		mb.printInfo();
		mb.applyBrake(50);
		mb.speedUp(20);
       

    }
}
