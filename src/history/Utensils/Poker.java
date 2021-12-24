package history.Utensils;

public class Poker implements Utensils {

    @Override
    public String getName() {
        return "кочерга";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        return !(obj == null || getClass() != obj.getClass());
    }

    @Override
    public String toString() {
        return "Действие полетели";
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() * 101;
    }
}
