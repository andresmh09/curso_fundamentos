public class Circulo{
   //atributo
  private double radio;
  
  //métodos
  public void setRadio(double r){
      this.radio = r;
    }
    
  public double getRadio(){
      return this.radio;
    }
   
  public double getPerimetro(){
        return 2 * this.radio * Math.PI;
    }
}