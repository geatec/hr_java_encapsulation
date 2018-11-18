// Copyright: GEATEC engineering
// License: Apache 2

class Obfuscator {   // Don't inherit from 3rd party Queue, whose interface may change
    /*
    Question: Can you make the queue work without remembering getIndex?
    
    Just for fun, you may expand this example to provide some truly useable coding and decoding.
    And if you're really eager: how about morse, back and forth, realtime...
    */
    
    // ======= Public part ======
    
    // --- Methods ---
    
    public Obfuscator (int maximumSize) {
        wordQueue = new Queue (maximumSize);
    }
        
    public String put (String plainWord) throws Exception {
        String codedWord = "";
        for (int index = 0; index < plainWord.length (); index++) {
            codedWord +=  (char )(plainWord.charAt (index) + 1);    // Simplistic obfuscation of ASCII codepage only
        }
        wordQueue.put (codedWord);
        return codedWord;
    }
    
    public String get () throws Exception {
        return wordQueue.get () .toString ();
    }

    public boolean empty () {
        return wordQueue.getSize () == 0;
    }
   
    // ====== Private part ======
    
    // --- Fields ---
    
    private Queue wordQueue = null;
}
