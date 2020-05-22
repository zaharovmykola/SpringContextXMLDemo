package implementations;

import interfaces.IPerson;

public class Wizard implements IPerson {

    public void goTo(int _x, int _y) {

        System.out.printf("Fly to %d; %d\n", _x, _y);
    }

}
