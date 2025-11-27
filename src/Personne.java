public class Personne {
    public int id;
    public String nom;
    public String prenom;
    public String dateDeNaissance;
    public String email;
    public String phone;

    public Personne(int id, String name, String lastname, String dateNaissance, String numerPhone, String email) {
        this.id = id;
        this.nom = name;
        this.prenom = lastname;
        this.dateDeNaissance = dateNaissance;
        this.email = "";
        this.phone = "";
    }
}
