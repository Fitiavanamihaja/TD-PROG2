import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Notes {

    private Etudiant etudiant;
    private Examen examen;
    private double note;        
    private Instant changement;    
    private List<Changement> historique = new ArrayList<>();

    public Notes(double note, Instant changement) {
        this.note = note;
        this.changement = changement;

        historique.add(new Changement(note, changement, "Initial"));
    }

    public double getValeurAt(Instant t) {
        Optional<Changement> dernier = historique.stream()
                .filter(c -> !c.getTimestamp().isAfter(t))      
                .max(Comparator.comparing(Changement::getTimestamp));

        return dernier.map(Changement::getValeur).orElse(0.0);
    }


    public void addChangement(double nouvelleValeur, Instant timestamp, String raison) {
        historique.add(new Changement(nouvelleValeur, timestamp, raison));
        this.note = nouvelleValeur;
        this.changement = timestamp;

    public double getNote() {
        return note;
    }

    public List<Changement> getHistorique() {
        return historique;
    }
}
