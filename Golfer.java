/**
 * Auto Generated Java Class.
 */
import java.util.ArrayList;
public class Golfer implements Subject {
   private ArrayList<Observer> observers;
        private String name;

        public Golfer(String name) {
                super();
                this.name = name;
                observers = new ArrayList<Observer>();
        }

        public void scoreInput
(int strokes, int par) {
        notifyObservers(strokes, par);
        }

        public String getName() {
                return name;
        }

        @Override
        public void registerObserver(Observer observer) {
                observers.add(observer);
        }

        
        @Override
        public void removeObserver(Observer observer) {
                observers.remove(observer);
        }

        @Override
        public void notifyObservers(int strokes, int par) {
                for (Observer observer : observers) {
                        observer.update(strokes, par);
                }
        }
  
  /* ADD YOUR CODE HERE */
  
}
