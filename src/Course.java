public abstract class Course {

    String nom;
    double distanceKm;
    int tempsMinute;

    /*Constructeur*/
    public Course(String nom, double distanceKm, int tempsMinute){
        this.nom = nom;
        this.distanceKm = distanceKm;
        this.tempsMinute = tempsMinute;
    }

    public abstract String decrire();

}
