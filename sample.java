import java.util.*;




public class sample {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

        if(num>0){
            System.out.println("Positive");
             switch (num) {
            case 1:
                System.out.println("Sunday");
                
                break;

            case 2:
                System.out.println("Monday");
                break;
            
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
        
            default:
                System.out.println("number is in  range[1,7]");
                break;
        }


        }
        else if(num<0){
            System.out.println("Negative");
        }

        else{
            System.out.println("Zero");
        }
   
        
        for(int i=1;i<num+1;i++){
            System.out.print(i);
        }


        int z=num;

        while (z>0) {
            System.out.println(z);
            z--;
            
        }

        int w=1;
        do{
            System.out.println(w);
            w++;
        }while(w<4);

        
    }
    
}
