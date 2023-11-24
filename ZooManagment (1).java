import java.util.Arrays;
import java.util.Scanner;
public class ZooManagment {

    public static void main(String[] args)
    {
     /* Animal lion = new Animal("felin","lion",2,true);
     Zoo myZoo = new Zoo(5,"tunis","MyZoo");
     Zoo z1= new Zoo(4,"gabes","z1");
        /*lion.name="lion";
        lion.family="felin";
        lion.age=2;
        lion.isMammal=true;
        myZoo.animals[0]=lion;
        myZoo.name="myzoo";
        myZoo.city="Tunis";
        myZoo.nbrCages=20;
        System.out.println(myZoo.name);
        myZoo.displayZoo();
        //System.out.println(myZoo);
        //System.out.println(myZoo.toString());
        lion.displayAnimal();
        myZoo.addAnimal(lion);
        System.out.println(Zoo.comparerZoo(myZoo,z1));*/
        Animal a1=new Animal();
        System.out.println("family :"+a1.getFamily());
        System.out.println("name :"+a1.getName());
        System.out.println("age :"+a1.getAge());
        System.out.println("mamal =");
        Animal a2=new Animal("Lion",5);
        System.out.println("tn.esprit.gestion.Entite.Animal 2");


        System.out.println("to String");
        a1.Affiche();
        a2.Affiche();
        System.out.println("to String");
        System.out.println(a2.toString());
        System.out.println(a2);

        System.out.println(a1.toString());
        System.out.println(a1);

        System.out.println("tn.esprit.gestion.Entite.Zoo");
        Zoo zo1=new Zoo(); //name=null,nbrCaages=0,

        Zoo z2=new Zoo(12,"frigua","bouf");
        System.out.println(z2.addAnimal(a2));
        System.out.println(z2.addAnimal(a1));
        System.out.println(z2.addAnimal(a2));
        System.out.println(z2.addAnimal(a2));

        z2.displayZoo();
        System.out.println("toString");
        System.out.println(z2);

        System.out.println("remove");
        System.out.println(z2.removeAnimal(a2));
        System.out.println(z2);
        System.out.println("comparer zoo");

        System.out.println(zo1.comparerZoo(z2));

        Zoo z3=new Zoo();
        z3.addAnimal(a1);
        z3.addAnimal(a2);

        System.out.println(Zoo.comparerZoo(z2,z3));

        System.out.println("Le nombre "+Zoo.nbTotal());
       // Aquatic aq=new Aquatic();
        Terrestrial t=new Terrestrial();
        Dolphin d=new Dolphin(7,"assil","eya",true,"tounes",5.2);
        Penguin p=new Penguin(7,"eya","yasmine",false, "canada",7.2);
       //Aquatic aq1=new Aquatic( 5,"eya","walid",false, "fel bhar");
      // aq1.displayAnimal();
       // System.out.println(aq1);
        System.out.println(d);
        //aq.swim();
        d.swim();
        p.swim();
        //z2.addAquaticAnimal(aq);
        z2.addAquaticAnimal(d);
        z2.addAquaticAnimal(p);
       // z2.addAquaticAnimal(aq1);


        System.out.println(z2.getMaxPenguinSwimmingDepth());
        z2.swimZoo();
    }
}
