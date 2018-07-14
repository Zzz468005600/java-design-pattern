package stonezhu.com.observerpattern;

public class Observable extends java.util.Observable {

    public void change(){
        System.out.println("Observable change");

        super.setChanged();
        super.notifyObservers("Observable change");
    }

}
