public class Penguin extends Aquatic{
private float swimmingDepth;


public Penguin(){

}

    public Penguin(String family, String name, int age, boolean isMammal,String habitat,float swimmingDepth){


        super(family,name,age,isMammal,habitat);

        setSwimmingDepth(swimmingDepth);
    }



    public float getSwimmingDepth(){
        return this.swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth){
        this.swimmingDepth=swimmingDepth;

    }
    public String toString() {
        return "Animal{" +
                "family='" + super.getFamily() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", isMammal=" + super.getIsMammal() +
                ", habitat="+ super.gethabitat()+
                ",swimmingDepth="+swimmingDepth+
                '}';
    }


}
