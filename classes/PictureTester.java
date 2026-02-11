/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("images/beach.jpg");
    //.explore will work on download/VS Code. Not currently set up to use on Codespaces
    //beach.explore();  
    beach.zeroBlue();
    //beach.explore();
    //write is set up by default to work on Codespaces
    beach.write("images/oldBeach.jpg");
  }
  
  /** Method to test KeepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("images/beach.jpg");
    //beach.explore();  
    beach.KeepOnlyBlue();
    //beach.explore();
    // write the result to a new file to avoid overwriting the original
    beach.write("images/beachKeepOnlyBlue.jpg");
  }

  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("images/beach.jpg");
    //beach.explore();  
    beach.KeepOnlyRed();
    //beach.explore();
    // write the result to a new file to avoid overwriting the original
    beach.write("images/beachKeepOnlyRed.jpg");
  }
  public static void testKeepOnlyGreen(){
    Picture beach = new Picture("images/beach.jpg");
    beach.KeepOnlyGreen();
    beach.write("images/beachKeepOnlyGreen.jpg");
  }
  public static void testNegate(){
    Picture beach = new Picture("images/beach.jpg");
    beach.negate();
    beach.write("images/beachNegate.jpg");
  }
  public static void testGrayscale(){
    Picture beach = new Picture("images/beach.jpg");
    beach.grayscale();
    beach.write("images/beachGrayscale.jpg");
  }
  public static void testFixUnderwater(){
    Picture water = new Picture("images/beach.jpg");
    water.fixUnderwater();
    water.write("images/fixedBeach.jpg");
  }
  public static void testEdgeDetection(){
    Picture swan = new Picture("images/swan.jpg");
    swan.edgeDetection(10);
    swan.write("images/swanEdges.jpg");
  }
  public static void testClearBlueOverValue(){
    Picture beach = new Picture("images/beach.jpg");
    beach.clearBlueOverValue(200);
    beach.write("images/beachClearBlueOverValue.jpg");
  }

  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testEdgeDetection();
    testClearBlueOverValue();

  }
}