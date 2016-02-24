/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Craig
 */

// an example of inheritance AND Subclass Humanheight is inherited by Human and can also be used as a 'Subclass'
public class HumanHeightSub extends Human{
   
   int HumanHeight;

    public HumanHeightSub(String name) {
        super(name);
    }
// /* This is An 'Object example */
//   public HumanHeightSub(int Height){
//      // the parammeter of this contructor is 'Height'
//      System.out.println("Height is :" + Height); 
//   }
//   
   public void setHeight( int Height ){
       HumanHeight = Height;
   }
   
   public int getHeight( ){
       System.out.println("Height is :" + HumanHeight ); 
       return HumanHeight;
   }

}

/* An Example of abstract */

abstract class HeightObject {
    int x, y;
    
    void moveTo(int newX, int newY) {
        
    }
    
    abstract void resize();
}

class Height extends HeightObject {
    @Override
    void resize() {
        
       
    }
}
class Length extends HeightObject {
    @Override
    void resize() {
        
    }
}



/*This is an example of PolyMorphsm , this means that the object can take on many forms
This example shows the Human is 'Craig','Vegetarian' & a Specific 'Height'*/

//private interface Vegetarian{}
//public class Human{}
//public class Craig extends Human implements Vegetarian{}
//
//
//}*/