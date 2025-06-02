package model.objectes;

public abstract class Multimedia {

    String id;
    char localitzacio;

    public Multimedia(String id, char localitzacio) throws Exception {
        if(!id.startsWith("IMG") || !id.startsWith("SND") || !id.startsWith("VID")){
            throw new Exception("Error ha de començar amb IMG, SND o VID");
        }
        this.id = id;
        this.localitzacio = localitzacio;
    }

}
