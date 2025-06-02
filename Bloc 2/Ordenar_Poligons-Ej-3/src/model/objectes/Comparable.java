package model.objectes;

public interface Comparable{
    boolean equals(Object o);

    static boolean equals(Poligon p1, Poligon p2) {
        return false;
    }
    int compareTo(Poligon p);
    static int compareTo(Poligon p1, Poligon p2){
        int a1 =p1.getArea();
        int a2 =p2.getArea();

        return Integer.compare(a1, a2);
    }
}
