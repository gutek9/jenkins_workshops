package com.jcg.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        while (true) {
            System.out.println( "Hello World!" );
            try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}  
        }
    }
}
