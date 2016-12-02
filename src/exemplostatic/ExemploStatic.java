
package exemplostatic;


public class ExemploStatic {

   
    public static void main(String[] args) {
         Persoa per1=new Persoa("Ana", 23);
         //per1.incrementarPersoas();//obsoleto
         per1.visualizar();
         Persoa per2=new Persoa("Juan",30);
         //per2.incrementarPersoas();
         per2.visualizar();
         System.out.println("Persoas = " + Persoa.getNumPersoas());
         
         
    }
    
}
