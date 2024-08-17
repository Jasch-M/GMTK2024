package org.example.gtmk2024.model.canvas;

import lombok.Getter;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

@Getter
public class Canvas {

    private final HashSet<CanvasPosition> positions;

    public Canvas() {
        positions = new HashSet<>();
    }

    public Canvas(Enumeration<CanvasPosition> enumeration) {
        positions = new HashSet<>();

        Iterator<CanvasPosition> iterator = enumeration.asIterator();
        iterator.forEachRemaining(positions::add);
    }
}
