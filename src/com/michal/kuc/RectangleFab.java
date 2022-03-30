package com.michal.kuc;

import java.util.Random;

public class RectangleFab extends FigureFab {
    Random rnd = new Random();

    public IFigure Create() {
        return new Rectangle(rnd.nextDouble() * 20 + 1, rnd.nextDouble() * 20 + 1);
    }
}
