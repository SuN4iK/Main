package game;


import java.util.HashSet;
import java.util.Objects;

public class Player {
    private String name;
    private HashSet<Card> hand = new HashSet<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void raise() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Игрок " + name;
    }
}