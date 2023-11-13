package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Permet d'ajouter du texte au document
     * @param texte texte à ajouter
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    /**
     * Permet de remplacer un morceau du texte existant par un autre
     * @param start index du caractère à partir du quel le texte doit être remplacer
     * @param end index du caractère jusqu'où le texte doit être remplacer
     * @param remplacement texte à mettre à la place de celui qui existe
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    /**
     * Permet de mettre un morceau de texte en majuscule
     * @param start index du caractère à partir du quel le texte doit être mis en majuscule
     * @param end index du caractère jusqu'où le texte doit être mis en majuscule
     */
    public void majuscules(int start, int end) {
        String texteMaj = texte.substring(start, end);
        texteMaj = texteMaj.toUpperCase();
        remplacer(start, end, texteMaj);
    }

    /**
     * Permet de supprimer un morceau de texte du document
     * @param start index du caractère à partir du quel le texte doit être supprimer
     * @param end index du caractère jusqu'où le texte doit être supprimer
     */
    public void effacer(int start, int end) {
        remplacer(start, end, "");
    }

    /**
     * Efface la totalité du texte du document
     */
    public void clear() {
        texte = "";
    }
}
