package model.objectes;

public class So extends Multimedia implements Reproductor{

    private String nom;
    private int durada;
    private String format;

    public So(String id, char localitzacio) throws Exception {
        super(id, localitzacio);
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo");
    }

    @Override
    public void pause() {
        System.out.println("Pausa");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }
}
