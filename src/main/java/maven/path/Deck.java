package maven.path;

import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;

public class Deck extends Cards {

    public Deck() {
        Console cons = System.console();
        String input;
        input = cons.readLine();
        ArrayList<Integer> stack =  new ArrayList<Integer>();
        for(int k=0; k<30; k++){
            stack.add(k); }
        boolean draw = true;
            int maximum  = 29;
            int minimum = 1;
            Random rn = new Random();
            int n = maximum - minimum + 1;
            int i = rn.nextInt() % n;
            int randomNum = minimum + i;
            boolean stop = false;

        while(!stop){
            input = cons.readLine("> ");
        

        switch(input){
            case "take":
            
            this.setTake(randomNum);
            draw = true;

            System.out.printf("you have picked card number %d", randomNum);
            break;

            case "count":
            if(draw =true) {
               
               
               stack.remove(randomNum);}
               for(int r=0; r<k.size(); r++)

               System.out.printf("there are %d cards left", stack);
               break;  

            case "shuffle":
               Collections.shuffle(stack);
               System.out.println("your cards shuffled");
               break;
    }
    
}
}
    
}
