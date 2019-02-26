package academy.mate.builder;

public class Start {
    public static void main(String[] args) {
        final InfoCar infoCar = new InfoCar.InfoCarBuilder().brand("Mercedes").model("GLS").color("White").year(2018).hp(340).build();
    }
}
