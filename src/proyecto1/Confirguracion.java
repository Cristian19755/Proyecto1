package proyecto_1;

public class Confirguracion {
   private String nombre_Empresa, slogan, mision, vision;
   
   public Confirguracion(){
       this.nombre_Empresa = "";
       this.slogan = "";
       this.mision = "";
       this.vision = "";
   }

    public String getNombre_Empresa() {
        return nombre_Empresa;
    }

    public void setNombre_Empresa(String nombre_Empresa) {
        this.nombre_Empresa = nombre_Empresa;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }
   
    
       
}
