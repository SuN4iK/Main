package game;

import java.util.HashMap;
import java.util.Map;

public class Chip implements Comparable<Chip> {

    private static final Map<Integer, String> CHIP_COLORS = new HashMap<>();

    static {
        CHIP_COLORS.put(1, "Белый");
        CHIP_COLORS.put(5, "Красный");
        CHIP_COLORS.put(25, "Зеленый");
        CHIP_COLORS.put(100, "Черный");
        CHIP_COLORS.put(500, "Фиолетовый");
        CHIP_COLORS.put(1000, "Оранжевый");
    }




    private final int value; // Номинал фишки
    private String color;

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Chip o) {
        return 0;
    }

    public Chip(int value) {
        this.value = value;
    }
}