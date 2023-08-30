

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int [] arr = new int[n];
        
        for(int i=0 ; i<n ; i++){
            arr[i] = scn.nextInt();
        }
        
        Queue<Integer> qu = new LinkedList<>();
        
        int sum = 0;
        for(int i=0 ; i<n ; i++){
            qu.add(arr[i]);
            sum+=arr[i];
            if(sum == 0){
                break;
            }
        }
        
        if(qu.size() < n){
            while(qu.size() != 0){
                System.out.print(qu.remove()+" ");
            }
        }else{
           if(sum == 0){
             while(qu.size() != 0){
                System.out.print(qu.remove()+" ");
            }  
           }else{
               System.out.println("No element found");
           }
        }
    }
}