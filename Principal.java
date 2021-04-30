public class Principal {

  public static void main(String[] args) {   

      Circulo circulo1 = new Circulo();
      circulo1.setRadio(5);
      double perime1 = circulo1.getPerimetro();
      System.out.println("El perimetro del circulo 1 es:" + perime1);
      
      Circulo circulo2 = new Circulo();
      circulo2.setRadio(12);
      double perime2 = circulo2.getPerimetro();
      System.out.println("El perimetro del circulo 2 es:" + perime2);
      
      Circulo circulo3 = new Circulo();
      circulo3.setRadio(2);
      double perime3 = circulo3.getPerimetro();
      System.out.println("El perimetro del circulo 3 es:" + perime3);
    }

}