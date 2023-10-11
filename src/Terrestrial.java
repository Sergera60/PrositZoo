public class Terrestrial extends Animal{

    private int nbrlegs ;



public Terrestrial(){

}
public  Terrestrial(String family, String name, int age, boolean isMammal,int nbrlegs){

    super(family,name,age,isMammal);
    setNbrlegs(nbrlegs);
}


public int getNbrlegs(){
    return this.nbrlegs;
}

public void setNbrlegs(int nbrlegs){
    this.nbrlegs=nbrlegs;

}

    public String toString() {
        return "Animal{" +
                "family='" + super.getFamily() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", isMammal=" + super.getIsMammal() +
                ", nbrlegs="+ nbrlegs+
                '}';
    }

}
