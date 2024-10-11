public class CoinFlip {
    public CoinFlip () { }

    public String flip() {
        int result = (int) (Math.random() * 1);
        if (result == 0) {
            return "heads";
        }
        return "tails";
    }

    public double simulate(int numFlips) {
        int heads = 0;
        int tails = 0;
        for (int i == 0; i < numFlips; i++) {
            String flip = flip();
            if (flip.equals("heads")) {
                heads++;
            } else {
                tails++;
            }
        }
        return (double) heads / numFlips;
    }
}
