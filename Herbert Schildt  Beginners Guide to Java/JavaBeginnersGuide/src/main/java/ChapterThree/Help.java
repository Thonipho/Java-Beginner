/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterThree;

/**
 *
 * @author User
 */
public class Help {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.IOException {
        // a simple help system
        
        char choice, ignore;
        
        for(;;) {
            do {
                System.out.println("Help on: ");
                System.out.println("\t1. if ");
                System.out.println("\t2. switch ");
                System.out.println("\t3. for ");
                System.out.println("\t4. while ");
                System.out.println("\t5. do-while ");
                System.out.println("\t6. break ");
                System.out.println("\t2. continue\n ");
                System.out.println("Choose one (q to quit): ");
                
                choice = (char) System.in.read();
                
                do {
                    ignore = (char) System.in.read();
                }while(ignore != '\n');
            }while(choice < '1' | choice > '7' & choice != 'q');
            
            if(choice == 'q') break;
            System.out.println("\n");
        }
        
        switch(choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("\tcase constant:");
                System.out.println("\t\tstatement sequence");
                System.out.println("\t\tbreak");
                System.out.println("\t// ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The for:\n");
                System.out.println("for(init; condition; iteration)");
                System.out.println(" statement;");
                break;
            case '4':
                System.out.println("The while:\n");
                System.out.println("while(condition) statement;");
                break;
            default:
                System.out.println("Selection not found");
        }
    }
    
}
