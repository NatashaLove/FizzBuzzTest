package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int lower=1;
        int upper = 100;


        for (int i=lower; i<=upper;i++){
            boolean number=true;
            int fizz;
            int buzz;
            int test;
            fizz=i%2;
            buzz=i%3;
            test=i%5;

            //System.out.println();
            if (fizz==0) {
                System.out.print("Fizz");
                number = false;
            //    if (!((i%2)==0 && (i%3)==0 && (i%5)==0) || ! ((i%2)==0 && (i%3)==0) || !((i%2)==0 && (i%5)==0) || ! ((i%3)==0 && (i%5)==0)  )
               if(!(buzz==0) && !(test==0)) {
                   if (!(buzz == 0) || !(test == 0)) {
                       System.out.println();
                   }
               }
            }
            if (buzz == 0) {
                System.out.print("Buzz");
                number = false;
               // if (!((i%2)==0 && (i%3)==0 && (i%5)==0) || ! ((i%2)==0 && (i%3)==0) || !((i%2)==0 && (i%5)==0) || ! ((i%3)==0 && (i%5)==0)  )

                if(!(fizz==0) && !(test==0)){
                    if (!(fizz == 0) || !(test == 0)) {
                            System.out.println();
                    }
                }
              //  {System.out.println();}
            }

            if (test == 0) {
                System.out.print("Test");
              //  System.out.println();
                number = false;
               // if (!((i%2)==0 && (i%3)==0 && (i%5)==0) || ! ((i%2)==0 && (i%3)==0) || !((i%2)==0 && (i%5)==0) || ! ((i%3)==0 && (i%5)==0)  )
                if(!(buzz==0) && !(fizz==0)){
                    if (!(buzz == 0) || (!(fizz == 0))) {
                        System.out.println();
                    }
                }
               // {System.out.println();}

            }


            if (number)
               // System.out.println();
            { System.out.println(i);}

            /*
            if ((i%2)==0 && (i%3)==0 && (i%5)==0) {

                System.out.println("FizzBuzzTest");
                number=false;
                break;
            }
            if ((i%2)==0 && (i%3)==0) {

                System.out.println("FizzBuzz");
                number=false;
                break;
            }

            if ((i%2)==0 && (i%5)==0) {

                System.out.println("FizzTest");
                number=false;
                break;
            }
            if ((i%3)==0 && (i%5)==0) {

                System.out.println("BuzzTest");
                number=false;
                break;
            }
*/

            //


        }



    }
}
