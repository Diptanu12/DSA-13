public class linearSearch {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,85,69,45,12};
        System.out.println(linear(a,122));
    }
    static int linear(int a[], int x){
        for(int i=0; i<a.length;i++){
            if(a[i]==x){
                return i;
            }
        }
        return -1;
    }

}
