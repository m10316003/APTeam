

//m10316018
public class Imtest {
	 
public static void main(String[] args) {
 long begintime = System.currentTimeMillis();
int sum=0;
String s=new String("");
for(int i=1;i<100000;i++){
sum=sum+i;
s=s+"+"+i;
}
  long endtime=System.currentTimeMillis();
  System.out.println(endtime - begintime);
}
}