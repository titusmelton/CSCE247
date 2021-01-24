/**
 * Auto Generated Java Class.
 */
public class HoleScoreDisplay  implements Observer {
        public Subject golfer;
        public int par;
        public int strokes;

        public HoleScoreDisplay(Subject golfer) {
                super();
                this.golfer = golfer;
        }

        @Override
        public void update(int strokes, int par) {
        this.strokes = strokes;
        this.par = par;
        showCurrentScore();
    }
        
        private void showCurrentScore() {
                System.out.println("Current Round Stats:");
                System.out.println("Par: "+par);
                System.out.println("Strokes: "+ strokes);
                System.out.println("Made Par");
        }
  
  
  /* ADD YOUR CODE HERE */
  
}
