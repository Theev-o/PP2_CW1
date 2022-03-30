package com.michal.kuc;

import java.util.HashMap;
import java.util.Map;

public class Figure {
    Map<Integer, FigureFab> fabMap = new HashMap<Integer, FigureFab>();
    Figure(){
        fabMap.put(0, new SquareFab());
        fabMap.put(1, new RectangleFab());
        fabMap.put(2, new CircleFab());
    }

    IFigure create (Integer n){
        return fabMap.get(n).Create();
    }
}
