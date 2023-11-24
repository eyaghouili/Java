public class Penguin extends Aquatic{
    protected double swimmingDepth;

    public double getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(double swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
    public Penguin()
    {
        super();
        this.swimmingDepth = 0.0;
    }
    public Penguin(int age,String fam,String name,boolean isMa, String habitat,double swimmingDepth)
    {
        super(age,fam,name,isMa,habitat);
        this.swimmingDepth=swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString()+"Penguin{" +
                "swimmingDepth=" + swimmingDepth +
                '}';
    }
    public void swim()
    {
        System.out.println("This Penguin is swimming");
    }
}
