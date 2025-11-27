public class Prof extends Personne{
    public String specialite;
    public Prof(int id, String name, String lastname, String dateNaissance, String numerPhone, String email,
                String specialite) {
        super(id, name, lastname, dateNaissance, numerPhone, email);
        this.specialite = specialite;
    }
}
