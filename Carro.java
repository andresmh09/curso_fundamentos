public class Carro {
    private String marca;
    private boolean encendido = true;
    private int velocidad;
    private int velocidadMaxima = 80;
    
    public Carro(String mar){
        this.marca = mar;
    }
    
    public Carro(String mar, boolean encen){
        this.marca = mar;
        this.encendido = encen;
    }
    
    public String getMarca(){
        return this.marca;
    }
    public int getVelocidad(){
        return this.velocidad;
    }
    public boolean getEncendido(){
        return this.encendido;
    }
    
    public void encender(){
        this.encendido = true;
    }
    public void apagar(){
        this.encendido = false;
        this.velocidad = 0;
    }
    
    public void disminuirVelocidad(int v){
        if(this.encendido == true){
            this.velocidad = this.velocidad - v;
            if(this.velocidad < 0){
                this.velocidad = 0;
            }
        }
    }
    
    public void aumentarVelocidad(int v){
        if(this.encendido == true){
            this.velocidad = this.velocidad + v;
            if(this.velocidad >= this.velocidadMaxima){
                this.velocidad = this.velocidadMaxima;
            }
        }
    }
    
  
}