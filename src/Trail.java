public class Trail extends Sortie {
    int denivelePositif;

    public Trail(String nom, double distanceKm, int tempsMinute, int denivelePositif){
        super(nom, distanceKm, tempsMinute);
        this.denivelePositif = denivelePositif;
    }

    @Override
    public String decrire() {
        return "Trail : " + nom + ", distance : " + distanceKm + "km , temps : " + tempsMinute + " minute(s), dénivelé : " + denivelePositif +" mètres";
    }
}
