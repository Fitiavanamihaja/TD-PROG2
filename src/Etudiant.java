import java.util.List;
import java.util.ArrayList;


public class Etudiant extends Personne {
    public String group;
    public Tuteur tutor;
    public List<Notes> notes = new ArrayList<>();

    public Etudiant(int id, String name, String lastname, String dateNaissance, String numerPhone,
                    String email, String group, Tuteur tutor) {
        super(id, name, lastname, dateNaissance, numerPhone, email);
        this.email = email;
        this.group = group;
        this.tutor = tutor;
            }
}
