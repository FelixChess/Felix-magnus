public class test2 {

    public int x = 0;
    public test2(int x) {
        this.x = x;

    }
    public void printX() {
        System.out.println( "X = "+this.x );
    }
    public void xAdd(int add) {
        this.x = this.x + add;
    }
    public int getX() {
        return this.x;
    }



    public static void main(String[] args) {
        /*for ( int i=0 ; i<args.length ; i++) {
            System.out.println(args[i]);
        }*/

        //test2 t2 = new test2(5);
        //t2.printX();

        test2 t3 = new test2(51);
        t3.printX();
        t3.xAdd(10);
        t3.printX();
        t3.x = 100;
        t3.printX();

        int xt3 = t3.getX();
        System.out.println(" >>>> xt3 = "+xt3);
        
    }
}
