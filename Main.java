public class Main {

  public static void main(String[] args) {   

      Carro carro1 = new Carro("Tesla");
      Carro carro2 = new Carro("Mazda",false);
      carro1.aumentarVelocidad(10);
      carro2.aumentarVelocidad(40);
      
      int vel1 = carro1.getVelocidad();
      System.out.println("La velocidad del carro Tesla es:" + vel1);
      int vel2 = carro2.getVelocidad();
      System.out.println("La velocidad del carro Mazda es:" + vel2);
      
      carro2.encender();
      carro2.aumentarVelocidad(40);
      
      int r = 1;
      while(r <=3){
          carro1.disminuirVelocidad(5);
          carro2.disminuirVelocidad(5);
          r= r+1;
        }
      System.out.println("La velocidad del carro Tesla es:" + carro1.getVelocidad());
      System.out.println("La velocidad del carro Mazda es:" + carro2.getVelocidad());
    }

}