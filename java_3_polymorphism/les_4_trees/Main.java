// Copyright: GEATEC engineering
// License: Apache 2

public class Main {
    
    // ====== Public part ======
    
    // --- Methods ---    
    
    public static void main (String [] args) {
        Tree tree = new Tree ();
        
        tree
            .store ("jan")
            .store ("piet")
            .store ("karel")
            .store ("marie")
            .store ("sofie")
            .store ("roos")
            
            .store ("john")
            .store ("pete")
            .store ("charles")
            .store ("mary")
            .store ("sophie")
            .store ("rose")
            
            .store ("heinz")
            .store ("dieter")
            .store ("karl")
            .store ("liselotte")
            .store ("hannelore")
            .store ("gisela")
            
            .store ("jean")
            .store ("piere")
            .store ("louis")
            .store ("fleur")
            .store ("heloise")
            .store ("frederique")
        ;
            
        tree.dump ();   
        tree.print ();
    }
}
