public class Route extends Course{
    boolean competition;

    public Route(String nom, double distanceKm, int tempsMinute, boolean competition){
        super(nom, distanceKm, tempsMinute);
        this.competition = competition;
    }

    @Override
    public String decrire() {
        return "Route : " + nom + ", distance : " + distanceKm + "km , temps : " + tempsMinute + " minute(s), competition : " + competition;
    }
}
