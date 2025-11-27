import java.time.LocalDateTime;

public class Examen {
    public int id;
    public String titre;
    public Matiere matiere;
    public LocalDateTime dateExamen;
    public double coefficient;

    public Examen(int id, String titre, Matiere matiere, int coefficient) {
        this.id = id;
        this.titre = titre;
        this.matiere = matiere;
        this.dateExamen = LocalDateTime.now();
        this.coefficient = coefficient;
        if (matiere != null) {
            matiere.ajouterExamen(this);
        }
    }
}