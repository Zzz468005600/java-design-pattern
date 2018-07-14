package stonezhu.com;

import stonezhu.com.observerpattern.Observable;
import stonezhu.com.observerpattern.Observer1;
import stonezhu.com.observerpattern.Observer2;
import stonezhu.com.observerpattern.Observer3;

public class Main {

    public static void main(String[] args) {
        //新建观察者
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        Observer3 observer3 = new Observer3();

        //新建被观察者
        Observable observable = new Observable();

        //三个观察者进行观察
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);

        //被观察者发生变化
        observable.change();
    }

}
