
package conditional_statement;



import java.util.*;
public class Condition_statement {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Operation op = new Operation();
        Scanner sc = new Scanner(System.in);
        conditional con = new conditional();
        int num;
        System.out.print(" please enter number a ");
        op.a=sc.nextInt();
        System.out.print(" please enter number b ");
        op.b=sc.nextInt();
        
        
        System.out.print("choose between 1,2,3,4 "
                +"1 : add"
                +"2 : sub"
                +"3 : div "
                +"4 : prod ");
    num=sc.nextInt();
    
    switch(num){
        case 1:
            op.add();
        break;
        case 2:
            
       
            op.sub();
        break;
        case 3:
            op.div();
        break;
        case 4:
            op.prod();
        break;    
    }
                
                
    }
    
}

