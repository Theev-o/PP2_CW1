package com.michal.kuc;

import java.util.Random;

public class SquareFab extends FigureFab {

    Random rnd = new Random();

    public IFigure Create() {
        return new Square(rnd.nextDouble() * 20 + 1);
    }
}
