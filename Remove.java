import java.util.Arrays;

/**
 * Created by pc on 09/02/2021.
 */
public class Remove {
    int a[]={111,12,13,14,15};
    public void remove(int arr[],int index ){
        if (index>=0 &&index<arr.length){
            int i= index ;
            while(i<arr.length-1){
                arr[i]=arr[i+1];
                i++;}
            arr[i]=0;
        }}

    public static void main(String[] args) {
        Remove o = new Remove();
        System.out.println(Arrays.toString(o.a));
         o.remove(o.a,2);
        System.out.println(Arrays.toString(o.a));


}}
