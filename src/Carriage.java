// вагон

public class Carriage extends GoByRail {



    public Carriage(int wheelset) {
        super.SetWheel(wheelset);
        System.out.println("вагон c " + wheelset + " колесными парами");
    }
}
