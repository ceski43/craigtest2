/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Craig
 */
public class Human{
   
   int HumanAge;
 /* This is An 'Object example */
   public Human(String name){
      // the parammeter of this contructor is 'name'
      System.out.println("Name chosen is :" + name ); 
   }
   
   public void setAge( int age ){
       HumanAge = 52;
   }
   /* This is an example of 'Acess Control Private means it can onnly be acccesed in its own class inn this case 'Human' */
   private int getAge( ){
       System.out.println("age is :" + HumanAge ); 
       return HumanAge;
   }
    public static void main(String []args){
      /* Object creation */
      Human myHuman = new Human( "Craig" );
      
      Human humanheight = new Human( "6.2" );
      
      /* this methhod sets the human age. */
      myHuman.setAge( 52 );

      /* imm calling this methhod to get the hhuman age */
      myHuman.getAge( );
      
      /* imm calling this methhod to get the hhuman Height */
      humanheight.setHeight( 5 );
      
      /* imm calling this methhod to get the hhuman Height */
      humanheight.getHeight ( );

      /* You can access instance variable as follows as well */
      System.out.println("Variable Value :" + myHuman.HumanAge ); 
      System.out.println("Variable Value :" + humanheight.HumanHeight ); 
   }
}

