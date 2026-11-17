public abstract class Sortie {

    String nom;
    double distanceKm;
    int tempsMinute;

    /*Constructeur*/
    public Sortie(String nom, double distanceKm, int tempsMinute){
        this.nom = nom;
        this.distanceKm = distanceKm;
        this.tempsMinute = tempsMinute;
    }

    public abstract String decrire();

}
