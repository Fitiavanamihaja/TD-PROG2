import java.util.ArrayList;
import java.util.List;

public class Matiere {

    private int id;
    private String label;
    private int credits;
    private Prof enseignant;
    private List<Examen> examens = new ArrayList<>();

    public Matiere(int id, String label, int credits, Prof enseignant) {
        this.id = id;
        this.label = label;
        this.credits = credits;
        this.enseignant = enseignant;
    }

    public void ajouterExamen(Examen examen) {
        examens.add(examen);
    }
    public int getId() {
        return id;
    }

