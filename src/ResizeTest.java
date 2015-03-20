

import java.util.ArrayList;

public class ResizeTest {
public static void main(String[] args) {
 long begintime = System.currentTimeMillis();
  ArrayList<Integer> list = new ArrayList<Integer>();
for(int i=1;i<100000;i++){
         list.add(i);
}
  long endtime=System.currentTimeMillis();
  System.out.println(endtime - begintime);
}

}