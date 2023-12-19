package com.mafercompany.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //System.out.println( "Hello World!" );
        //Persona p = new Persona();
        Persona p = new Persona();
        p.setId(01);
        p.setNombres("Mafer");
      //  System.out.println(p.getId()+" "+ p.getNombres());
        System.out.println(p.toString());
    }
}
