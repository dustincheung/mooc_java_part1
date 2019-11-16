import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birds = new ArrayList<>();

    public boolean inDatabase(Bird bird){
        for(Bird b: birds){
            if(bird.getName().equals(b.getName())){
                return true;
            }
        }
        return false;
    }

    public void observed(String name){
        for(Bird b: birds){
            if(name.equals(b.getName())){
                b.incrNumTimesObserved();
                return;
            }
        }
        System.out.println("Is not a bird!");

    }

    public void addBird(Bird bird){
        if(inDatabase(bird) == false) {
            birds.add(bird);
        }else{
            System.out.println("This bird is already in DB");
        }
    }

    public void printStat(){
        if(this.birds.isEmpty() == false){
            for(Bird b: this.birds){
                System.out.println(b.getName() + " (" + b.getLatinName() + "): " + b.getNumTimesObserved() + " observations");
            }
        }else {
            System.out.print("db is empty");
        }
    }

    public void printBird(String name){
        for(Bird b: birds){
            if(name.equals(b.getName())){
                System.out.println(b.getName() + " (" + b.getLatinName() + "): " + b.getNumTimesObserved() + " observations");
                return;
            }
        }
        System.out.println("This bird is not in DB");

    }
}
