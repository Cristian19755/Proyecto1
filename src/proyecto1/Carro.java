package proyecto_1;

public class Carro {

    private String vin, fabricante, modelo;
    private int year, precio;

    public Carro(String vin, String fabricante, String modelo, int year, int precio) {
        this.vin = vin;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
    }

    public String Ver_Informacion() {
        String cadena = ("VIN:" + this.vin + "\n"
                + "Fabricante:" + this.fabricante + "\n"
                + "Modelo:" + this.modelo + "\n"
                + "Year:" + this.year + "\n"
                + "Precio:" + this.year + "\n");
        return cadena;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
