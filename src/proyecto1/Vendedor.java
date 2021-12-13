package proyecto_1;

public class Vendedor {

    private int dpi, ventas;
    private String nombre, genero, password, correo;

    public Vendedor(int dpi, int ventas, String nombre, String genero, String correo, String password) {
        this.dpi = dpi;
        this.nombre = nombre;
        this.ventas = ventas;        
        this.genero = genero;
        this.correo = correo;
        this.password = password;        
    }
    
    public String Mostrar_Info(){
        String cadena =("DPI:" + this.dpi+"\n"
                + "Nombre:" + this.nombre+"\n"
                + "Ventas:" + this.ventas+"\n"
                + "Genero:" + this.genero+"\n"
                + "Password" + this.password+"\n");
        return cadena;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
