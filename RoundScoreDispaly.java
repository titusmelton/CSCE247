/**
 * Auto Generated Java Class.
 */
public class RoundScoreDispaly implements Observer {
        public Subject golfer;
        public int parTotal;
        public int strokesTotal;
        
        public RoundScoreDisplay(Subject golfer) {
                super();
                this.golfer = golfer;
        }

        @Override
        public void update(int strokes, int par) {
                strokesTotal = strokesTotal + strokes;
                parTotal  = parTotal + par;
                displayRoundScore();
        }

        private void displayRoundScore() {
                System.out.println("Round Stats:");
                System.out.println("Par: "+parTotal);
                System.out.println("Strokes: "+strokesTotal);
                System.out.println("2 Under Par");
        }
  
  /* ADD YOUR CODE HERE */
  
}
