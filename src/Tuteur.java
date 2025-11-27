public class Tuteur extends Personne{
    public String description;

    public Tuteur(int id, String name, String lastname, String dateNaissance, String numerPhone, String email,
                  String description) {
        super(id, name, lastname, dateNaissance,numerPhone, email);
        this.description = description;
    }
}

