public class Aquatic extends Animal {



   private String habitat;


public Aquatic(){

}
public Aquatic(String family, String name, int age, boolean isMammal,String habitat){

   super(family,name,age,isMammal);

   setHabitat(habitat);
}

   public String gethabitat(){
      return this.habitat;
   }

   public void setHabitat(String habitat){
      this.habitat=habitat;

   }


   public String toString() {
      return "Animal{" +
              "family='" + super.getFamily() + '\'' +
              ", name='" + super.getName() + '\'' +
              ", age=" + super.getAge() +
              ", isMammal=" + super.getIsMammal() +
              ", habitat="+ habitat+
              '}';
   }


   public void swim(){

   System.out.println("This aquatic is swimming");
   }



}
