
public class Fixsize {
public static void main(String[] args) {
 long begintime = System.currentTimeMillis();
 String[] sum=new String[100000];

for(int i=1;i<100000;i++){
sum[i]="a";
}
  long endtime=System.currentTimeMillis();
  System.out.println(endtime - begintime);
}

}