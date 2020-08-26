package designpattern.facade;

public class HomeTheaterTestDrive {

	public static void main(String[] args) {
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);
		
		homeTheater.watchMovie("Raiders of the Lost Ark");
		
		homeTheater.endMovie();
	}

}
