/**
 * Created by Adrian on 04.08.2016.
 */
public class Oras {
    private String nume;
    private int populatie;
    private String regiune;

    public Oras(String line){
        String[] temp = line.split(":");
        nume = temp[0];
        populatie = Integer.parseInt(temp[1]);
        regiune = temp[2];
    }

    @Override
    public String toString() {
        return "Oras{" +
                "nume='" + nume + '\'' +
                ", populatie=" + populatie +
                ", regiune='" + regiune + '\'' +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getPopulatie() {
        return populatie;
    }

    public void setPopulatie(int populatie) {
        this.populatie = populatie;
    }

    public String getRegiune() {
        return regiune;
    }

    public void setRegiune(String regiune) {
        this.regiune = regiune;
    }
}
