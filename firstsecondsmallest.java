public class firstsecondsmallest {
    public static void main(String[] args) {
        int arr[]={20,42,6,25,30,88,1};
        int small1=0;
        int small2=0;

        if(arr[0]<arr[1]){
            small1=arr[0];
            small2=arr[1];
        }else{
            small1=arr[1];
            small2=arr[0];
        }
        for( int i=2;i<arr.length;i++){
            if(arr[i]<small1){
                small2=small1;
                small1=arr[i];
            }else if(arr[i]<small2){
                small2=arr[i];
            }
        }
        System.out.println("1st smallest element "+small1);
        System.out.println("2nd smallest element "+small2);
    }
}
