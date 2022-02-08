package inheritance;

public class Shooting {

   @PrintAnno
    public void shoot1() {
       System.out.println("fire");
   }
   @PrintAnno("*")
    public void shoot2() {
       System.out.println("별");
   }

   @PrintAnno(value = "@", number = 30)
    public void shoot3() {
       System.out.println("골뱅이");
   }
}
