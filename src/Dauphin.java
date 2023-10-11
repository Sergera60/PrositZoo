public class Dauphin extends Aquatic{


    private float swimmingSpeed;


    public Dauphin(){

    }
    public Dauphin(String family, String name, int age, boolean isMammal,String habitat,float swimmingSpeed){


        super(family,name,age,isMammal,habitat);

        setSwimmingSpeed(swimmingSpeed);
    }



    public float getSwimmingSpeed(){
        return this.swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed){
        this.swimmingSpeed=swimmingSpeed;

    }

    public String toString() {
        return "Animal{" +
                "family='" + super.getFamily() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", isMammal=" + super.getIsMammal() +
                ", habitat="+ super.gethabitat()+
                ",swimmingSpeed="+swimmingSpeed+
                '}';
    }


    public void swim(){

        System.out.println("This Dolphin is swimming");
    }

}
