 import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// // public class Main{
// //     public static void main(String[] args) {
// //         File file = new File("hello.txt");
// //         // check the file name
// //         System.out.println(file.getName()); // hello.txt
// //         // find the directory
// //         System.out.println(file.getPath()); // F:\\JAVA\\hello.txt
// //         // find the absolute path
// //         System.out.println(file.getAbsolutePath()); //F:\\JAVA\\hello.txt
// //         // check if the file is exist or not
// //         System.out.println(file.isDirectory());// TRUE

// //         // debuging 
// //         System.out.println(file.exists());
// //     }
// // }

// import java.io.FileWriter;
// import java.io.IOException;

// public class Main {

//  public static void main(String[] args) {
 
//   try {
//    FileWriter writer = new FileWriter("poem.txt");
//    writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin' everywhere!");
//    //writer.append("\n(A poem by Bro)");
//    writer.close();
//   }
//   catch (IOException e) {
//    // TODO Auto-generated catch block
//    e.printStackTrace();
//   }
//  }
// }


public class Main {

 public static void main(String[] args) {
  
  // FileReader = read the contents of a file as a stream of characters. 
  //read() returns an int value which contains the byte value
  //when read() returns -1, there is no more data to be read
  
  try {
   FileReader reader = new FileReader("hello.txt");
   int data = reader.read();
   while(data != -1) {
    System.out.print((char)data);
    data = reader.read();
   }
   reader.close();
   
  } catch (FileNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }
}