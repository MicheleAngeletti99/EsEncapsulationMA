public class Auto {
    private int cilindrata;
    private String targa;
    private String marca;
    private String modello;

    // Getters
    public int getCilindrataInt() {
        return cilindrata;
    }

    public String getCilindrataString() {
        return String.valueOf(cilindrata) + " cavalli";
    }

    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    // Setters
    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    // Constructor
    public Auto(int cilindrata, String targa, String marca, String modello) {
        setCilindrata(cilindrata);
        setTarga(targa);
        setMarca(marca);
        setModello(modello);
    }
}
