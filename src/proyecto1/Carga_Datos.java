

package proyecto1;

public class Carga_Datos {
    
    private clientes clientes[];
    private vendedores vendedores[];
    private carros carros[];
    
    public Carga_Datos(clientes[] clientes){
        this.clientes = clientes;
        
    }
    
    public Carga_Datos(vendedores[] vendedores){
        this.vendedores = vendedores;
    }

    public Carga_Datos(carros[] carros){
        this.carros = carros;
    }
    
    public void Cargar_Clientes(String nombre,String correo,String genero,int dpi,int nit){
        for (int i = 0; i < this.clientes.length; i++) {
            if(this.clientes[i] == null){
                this.clientes[i] = new cliente(dpi,nit,nombre,genero,correo);
                break;
            }
        }
    }
    
    public void Cargar_Vendedores(int dpi, int ventas, String nombre, String genero, String correo, String password){
        for (int i = 0; i < this.vendedores.length; i++) {
            if(this.vendedores[i] == null){
                this.vendedores[i] = new vendedor(dpi,ventas,nombre,genero,correo,password);
                break;
            }
        }
    }

    public void Cargar_Carros(String vin, String fabricante, String modelo, int year, int precio){
        for (int i = 0; i < this.carros.length; i++) {
            if(this.carros[i] == null){
                this.carros[i] = new carro(vin,fabricante,modelo,year,precio);
                break;
            }
        }
    }
   
    

    public cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(cliente[] clientes) {
        this.clientes = clientes;
    }

    public vendedor[] getVendedores() {
        return vendedores;
    }

    public void setVendedores(vendedor[] vendedores) {
        this.vendedores = vendedores;
    }

    public void setClientes(cliente[] clientes) {
        this.clientes = clientes;
    }

    public carro[] getCarros() {
        return carros;
    }

    public void setCarros(carro[] carros) {
        this.carros = carros;
    }
    
    
    
    
}
