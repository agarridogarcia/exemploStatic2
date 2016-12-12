
package exemplostatic;

import javax.swing.JOptionPane;


public class Persoa {
    private static int numPersoas;
    private String nome;
    private int edade;

    public Persoa(String nome, int edade) {
        this.nome = nome;
        this.edade = edade;
        numPersoas ++;
    }

    public Persoa() {
        numPersoas ++;
    }

    public static int getNumPersoas() {
        return numPersoas;
    }

    public String getNome() {
        return nome;
    }

    public int getEdade() {
        return edade;
    }

    public static void setNumPersoas(int numPersoas) {
        Persoa.numPersoas = numPersoas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }
    public static int getnumPersoas (){
        return numPersoas;
    }
    /*public static void incrementarPersoas(){
        numPersoas ++;
    }*/
    public void visualizar (){
        JOptionPane.showMessageDialog(null, "Nome: "  + nome + " Idade: " + edade + "\nNum de persoas: " + numPersoas);
    }
}
