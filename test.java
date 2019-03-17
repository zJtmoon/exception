package org;

/**
 * Created by zjt on 18-7-15.
 */
public class test {
    public  void a() throws Exception {
        b(1,0);
    }
    public void b(int a,int b) throws Exception {
        if (b == 0) {
            throw new Exception("CUO");
        }

    }

    public static void main(String[] args) throws Exception {
     test c=new test();
     c.a();
    }
}
