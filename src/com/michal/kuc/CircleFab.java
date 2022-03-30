package com.michal.kuc;

import java.util.Random;

public class CircleFab extends FigureFab {
    Random rnd = new Random();

    public IFigure Create() {
        return new Circle(rnd.nextDouble() * 20 + 1);
    }
}
