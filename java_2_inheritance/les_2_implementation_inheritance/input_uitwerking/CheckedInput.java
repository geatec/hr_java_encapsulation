// Copyright: GEATEC engineering
// License: Apache 2

public class CheckedInput extends CoinInput {

    // ====== Public part ======
    
    // --- Methods ---
    
    public CheckedInput (float eurosPerCoin, float lowerBoundEuros, float upperBoundEuros) {
        super (eurosPerCoin);
        this.lowerBoundEuros = lowerBoundEuros;
        this.upperBoundEuros = upperBoundEuros;
    }
        
    public float ask (String prompt) throws Exception {
        float euros = super.ask (prompt + "(" + lowerBoundEuros / eurosPerCoin + " - " + upperBoundEuros / eurosPerCoin + ") ");
        if (euros < lowerBoundEuros) {
            throw new CoinInputException ("Error, amount should be at least " + lowerBoundEuros / eurosPerCoin + " local coins");
        }
        else if (euros > upperBoundEuros) {
            throw new CoinInputException ("Error, amount should be at most " + upperBoundEuros / eurosPerCoin + " local coins"); 
        }
        else {
            return euros;
        }
    }
    
    // ====== Protected part ======
    
    // --- Fields ---
    
    protected float lowerBoundEuros;
    protected float upperBoundEuros;
}