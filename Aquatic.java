abstract class Aquatic extends Animal
 {
  protected String habitat;
  public String getHabitat() {
   return habitat;
  }
  public void setHabitat(String habitat) {
   this.habitat = habitat;
  }
  public Aquatic()
  {
   super();
   this.habitat="";
   System.out.println("Je suis le constructeur de la classe Aquatic ");
  }
  public Aquatic(int age,String fam,String name,boolean isMa, String habitat)
  {
   super(age,fam,name,isMa);
   this.habitat=habitat;
  }
  //@Override
  public void displayAnimal()
  {
   super.displayAnimal();
   System.out.println(habitat);
  }

  @Override
  public String toString() {
   return super.toString()+"Aquatic{" +
           "habitat='" + habitat
           ;
  }
   public abstract void  swim();

   //System.out.println("This aquatic animal is swimming");

 }
