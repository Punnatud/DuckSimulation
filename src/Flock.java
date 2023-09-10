import java.util.ArrayList;

public class Flock implements Quackable{
    ArrayList<Quackable> quackers = new ArrayList<>();
    public void add(Quackable quacker){
        quackers.add(quacker);
    }
    @Override
    public void quack() {
        int i=0;
        for(Quackable quacker : quackers){
            if(i==0){
                quacker.quack();
                quacker.quack();
                quacker.quack();

            }
            else {
                quacker.quack();
            }
            i++;
        }
    }
}
