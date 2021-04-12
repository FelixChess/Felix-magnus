public class test3 {
    public static void main (String[] args) {

        long testNr = 3;
        while ( true ) {
            int zeros = 0;
            long test = 2;
            while ( test < testNr ) {


                if ( testNr % test == 0 ) {
                    zeros = zeros + 1;
                }


                test = test + 1;
            }

            if ( zeros == 0 ) {
                System.out.println( "Primtal : "+ testNr );
            }
            testNr = testNr + 2;
        }
    }
}
