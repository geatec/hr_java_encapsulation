// Copyright: GEATEC engineering
// License: Apache 2

public class CoinInput {

    // ====== Public part ======
    
    // --- Methods ---
    
    public CoinInput (float eurosPerCoin) {
        this.eurosPerCoin = eurosPerCoin;
        conio = new Conio ();
    }
        
    public float ask (String prompt) throws Exception {
        return eurosPerCoin * Float.parseFloat (conio.input (prompt));
    }
   
    // ====== Protected part ======
    
    // --- Fields ---
    
    protected float eurosPerCoin;
    protected Conio conio;
}
