import java.util.*;
public class stack{
    public static void main(String[] args) {
        int top =-1;
        int bottom = -1;
        int max = 7;
        int [] stack=new int[20];
        int a,ch,i,flag=1;
        Scanner sc=new Scanner(System.in);
        while(flag!=0){
            System.out.println("Press 1 for push");
            System.out.println("Press 2 for pop");
            System.out.println("Press 3 for display");
            System.out.println("Press 4 for exit");
            System.out.println(" ");
            System.out.println("Enter your choice : ");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                 if(top==(max-1)){
                    System.out.println("\n stack is full");
                 }
                 else{
                    System.out.println("enter the element");
                    a=sc.nextInt();
                    stack[++top]=a;
                 }
                    break;
                case 2:
                if(top==bottom){
                    System.out.println("stack is empty");
                }
                else{
                    System.out.println("Pop character is :"+stack[top]);
                    top--;
                }
                   break;
                case 3:
                System.out.println("Read the stack from the  bottom");
                System.out.println("The stack is : ----v  ");
                for(i=0;i<=top;i++){
                    System.out.println(stack[i]);
                }
                   break;
                case 4:
                flag=0;
                break;
                default:
                System.out.println("You have exited");
                System.out.println("Start again press enter");
                
            }
        }
    }
}