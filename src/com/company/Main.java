package com.company;

public class Main {

    public static void main(String[] args) {
	// do
        int x = 10;
        while( x < 20 ) {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }

        System.out.print("---------------------------\n");
        // do.....while
        int y = 10;
        do{
            System.out.print("value of y : " + y );
            y++;
            System.out.print("\n");
        }while( y < 20 );

        System.out.print("---------------------------\n");
        //for
        for(int z = 10; z < 15; z = z+1) {
            System.out.print("value of z : " + z );
            System.out.print("\n");
        }

        System.out.print("---------------------------\n");
        int [] numbers = {10, 20, 30, 40, 50};
        for(int m : numbers ){
            System.out.print( m );
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names ={"James", "Larry", "Tom", "Lacy"};
        for( String name : names ) {
            System.out.print( name );
            System.out.print(",");
        }
        System.out.print("\n");

        //break
        System.out.print("---------------------------\n");
        int [] numbers1 = {10, 20, 30, 40, 50};
        for(int n : numbers1 ) {
            // n 等于 30 时跳出循环
            if( n == 30 ) {
                break;
            }
            System.out.print( n );
            System.out.print("\n");
        }

        System.out.print("---------------------------\n");
        //continue
        int [] numbers2 = {10, 20, 30, 40, 50};
        for(int i : numbers2 ) {
            if( i == 30 ) {
                continue;
            }
            System.out.print( i );
            System.out.print("\n");
        }
    }
}
