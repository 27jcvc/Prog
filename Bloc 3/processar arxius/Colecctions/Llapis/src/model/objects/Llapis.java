package model.objects;

public class Llapis {
    private int color;
    private float gruix;

    public Llapis(int color, float gruix) {
        setColor(color);
        setGruix(gruix);
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        if (color >= 0 && color <= 7)
            this.color = color;
        else
            throw new IllegalArgumentException("Color ha d'estar entre 0 i 7");
    }

    public float getGruix() {
        return gruix;
    }

    public void setGruix(float gruix) {
        if (gruix >= 0.1f && gruix <= 3.0f)
            this.gruix = gruix;
        else
            throw new IllegalArgumentException("Gruix ha d'estar entre 0.1 i 3.0");
    }

    @Override
    public String toString() {
        return "Llapis{" + "color=" + color + ", gruix=" + gruix + '}';
    }

    // Equals i hashCode per evitar duplicats
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Llapis)) return false;
        Llapis l = (Llapis) o;
        return color == l.color && Float.compare(gruix, l.gruix) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * color + Float.hashCode(gruix);
    }
}