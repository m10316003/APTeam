
public class Mutest {

public static void main(String[] args) {
 long begintime = System.currentTimeMillis();
int sum=0;
StringBuilder s=new StringBuilder("");
for(int i=1;i<100000;i++){
sum=sum+i;
s.append("+"+i);
}
  long endtime=System.currentTimeMillis();
  System.out.println(endtime - begintime);

}
}

