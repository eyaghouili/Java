import java.util.Scanner;
//import Aquatic.java;

public class Zoo {
    Animal[] animals;
    int nbrAnimal;
    private static int nbrAquatic;
    String name;
    String city;
    int  nbrCages=25;
    private static int nbTotalAn;
    Aquatic aquaticAnimals[]=new Aquatic[10];
    public Zoo(int nbrCages, String city,String name)
    {
        this.nbrCages=nbrCages;
        this.animals= new Animal[nbrCages];
        this.name=name;
        this.city=city;

    }
    public Zoo()
    {
        animals=new Animal[25];
    }

    public String toString() {
        // Créez une chaîne de caractères contenant les informations de l'objet
        String str = "Name: " + this.name + "\n";
        str += "City: " + this.city + "\n";
        str += "Number of Cages: " + this.nbrCages + "\n";

        return str;
    }

    public void displayZoo()
    {
        System.out.println("city :"+city+" name :"+name);
        for (int i=0;i<animals.length;i++) {
            if (animals[i]!=null)
                System.out.println(animals[i].name);
        }
    }
    public int searchAnimal(Animal a)
    {

        for(int i=0;i<nbrAnimal;i++)
        {

            if(animals[i].name==a.name)
                return i;
        }
        return -1;
    }
    public boolean addAnimal(Animal animal)
    {
        if(searchAnimal(animal)!=-1)
            return false;
        if(!isZooFull())
        {
            return false;
        }
        else {
            animals[nbrAnimal]=animal;
            nbrAnimal++;
            nbTotalAn++;
            System.out.println(nbrAnimal);


        return true;}
    }
    public static int nbTotal()
    {

        return nbTotalAn;
    }
    public boolean isZooFull()
    {
        if(animals.length==nbrAnimal)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2)
    {
        if (z1.nbrAnimal < z2.nbrAnimal) {
            return z2;
        }
        else if(z1.nbrAnimal > z2.nbrAnimal){
            return z1;
        }
        return null;
    }
    public Zoo comparerZoo(Zoo z1)
    {
        if(this.nbrAnimal> z1.nbrAnimal)
            return this;

        else if  (this.nbrAnimal< z1.nbrAnimal)
            return z1;
        return null;
    }
    public boolean removeAnimal(Animal a)
    {

        int indexAnimal=searchAnimal(a);
        if (indexAnimal==-1)
            return false;
        for (int i=indexAnimal;i<nbrAnimal;i++)
            animals[i]=animals[i+1];
        animals[nbrAnimal]=null;
        this.nbrAnimal--;
        return true;
    }
    public void addAquaticAnimal(Aquatic aquatic)
    {
        aquaticAnimals[nbrAquatic]=aquatic;
        nbrAquatic++;
        //System.out.println(nbrAquatic);

    }
    public void swimZoo()
    {
        for(Aquatic element: this.aquaticAnimals)
        {
            if (element!=null)
                element.swim();
        }
    }
    public double getMaxPenguinSwimmingDepth() {
        double maxDepth = -1;

        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                Penguin penguin = (Penguin) aquatic;
                double depth = penguin.getSwimmingDepth();
                if (depth > maxDepth) {
                    maxDepth = depth;
                }
            }
        }

        return maxDepth;
    }
}

