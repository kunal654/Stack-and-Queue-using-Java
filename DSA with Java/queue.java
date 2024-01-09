import java.util.*;
public class queue {
    public static void main(String[] args) {
        int rare =-1;
        int front = -1;
        int max = 7;
        int [] que=new int[max];
        int additem,ch,i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to start : ");
        n=sc.nextInt();
        while(n==1){
            System.out.println("Press 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for display");
            System.out.println("Press 4 for exit");
           // System.out.println(" ");
            System.out.println("Enter your choice : ");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                 if(rare ==max-1){
                    System.out.println("Queue overflow");
                 }
                    else{
                        if(front == -1){
                            front = 0;
                        }
                        System.out.println("Please enter element");
                        additem=sc.nextInt();
                        rare =rare +1;
                        que[rare]=additem;
                    }
                    break;
                case 2:
                  if(front == -1 || front>rare){
                    System.out.println("Queue underflow");
                    return;
                  }else{
                    System.out.println("Element deleted from queue is : "+que[front]);
                    front=front+1;
                  }
                  break;
                case 3:
                if(front == -1){
                    System.out.println("Empty queue");
                }else{
                    System.out.println("The queue is : ");
                    System.out.println("Read in the : ----->");
                    for(i=front;i<rare;i++){
                      System.out.println(que[i]);
                    }
                    System.out.println(" ");
                }
                 break;
                 case 4:
                   n=0;
            
                default:
                    System.out.println("You are exited ");
                    System.out.println("To start again press enter");
            }
        }
    }
}
