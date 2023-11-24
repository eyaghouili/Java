public class Dolphin extends Aquatic{
    protected double swimmingSpeed;

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }
    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
    public Dolphin()
    {
        super();
        this.swimmingSpeed = 0.0;
    }
    public Dolphin(int age,String fam,String name,boolean isMa, String habitat,double swimmingSpeed)
    {
        super(age,fam,name,isMa,habitat);
        this.swimmingSpeed=swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString()+"Dolphin{" +
                "swimmingSpeed=" + swimmingSpeed +
                '}';
    }
    public void swim()
    {
        System.out.println("This dolphin is swimming");
    }
}
