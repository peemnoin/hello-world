public class zZq1qQ {

public static void mmMM(int[] XXx){ for(int i=0;i<XXx.length-1;i++){for(int j=0;j<XXx.length-1;j++){if(XXx[j+1]>XXx[j]){
int tmp=XXx[j];XXx[j]=XXx[j+1];XXx[j+1]=tmp;}}}}

public static void main(String[] aRGz){int[] lol={9,4,6,2,7};mmMM(lol);for(int i=0;i<=lol.length;i++)System.out.println(lol[i]);}}
