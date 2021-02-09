/**
 * Created by pc on 06/02/2021.
 */
public class ArrayH {
    int[] ary={20,30,45,62,44};
    int [] ary2 = new int[5] ;
    public void reveres(){
        int n= ary.length-1;
        for (int i = 0; i <ary.length/2 ; i++) {
            int t=ary[i];
            ary[i]=ary[n];
            ary[n]=t;
            n--;}}
    public void backup(){
        for (int i = 0; i <ary.length ; i++) {
            System.arraycopy(ary,0,ary2,0,5);}}
    public void print(){
        System.out.print(" [ ");
        for (int i = 0; i <ary2.length ; i++) {
            if (i==ary2.length-1){
                System.out.print(ary2[i]);}
            else{System.out.print(ary2[i]+",");}}
        System.out.print(" ] ");}
    public static void main(String[] args) {
        ArrayH arr =new ArrayH();
        arr.reveres();
        arr.print();}}
