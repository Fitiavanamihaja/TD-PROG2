import java.time.Instant;
public class Changement {
    public double valeur;
    public Instant timestamp;
    public String motif;

    public Changement(double valeur, Instant timestamp, String motif) {
        this.valeur = valeur;
        this.timestamp = timestamp;
        this.motif = motif;
    }
}

    

