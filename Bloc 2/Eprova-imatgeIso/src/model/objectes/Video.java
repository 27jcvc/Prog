package model.objectes;

public class Video extends Multimedia{

    private String nom;
    private int durada;

    public Video(String id, char localitzacio) throws Exception {
        super(id, localitzacio);
    }
}
