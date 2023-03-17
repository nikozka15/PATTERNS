package facade.hometheatre;

public class HomeTheatreTestDrive {
  public static void main(String[] args) {

    // instantiate components here

    HomeTheatreFacade homeTheater =
      new HomeTheatreFacade(new Amplifier(),
                            new Tuner(),
                            new DvdPlayer(),
                            new CdPlayer(),
                            new Projector(),
                            new Screen(),
                            new TheaterLights(),
                            new PopcornPopper());

    homeTheater.watchMovie("Raiders of the Lost Ark");
    homeTheater.endMovie();
  }
}
