// Copyright: GEATEC engineering
// License: Apache 2

class RepeatedInput extends CheckedInput {

    // ====== Public part ======
    
    // --- Methods ---
    
    public RepeatedInput (float eurosPerCoin, float lowerBoundEuros, float upperBoundEuros, int maxNrOfRepetitions) {
        super (eurosPerCoin, lowerBoundEuros, upperBoundEuros);
        this.maxNrOfRepetitions = maxNrOfRepetitions;
    }
        
    public float ask (String prompt) throws Exception {
        for (int repetitionIndex = 0; repetitionIndex < maxNrOfRepetitions; repetitionIndex++) {
            try {
                return super.ask (prompt + " (" + (maxNrOfRepetitions - repetitionIndex) + " attempts left) ");
            }
            catch (CoinInputException coinInputException) {
                conio.print (coinInputException.getMessage ());
            }
        }
        // We only get here after too much out-of-range answers
        throw new CoinInputException ("Error, more than " + maxNrOfRepetitions + " out-of-range answers");
    }
    
    // ====== Protected part ======
    
    // --- Fields ---
    
    protected int maxNrOfRepetitions;
}