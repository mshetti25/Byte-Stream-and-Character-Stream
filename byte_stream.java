import java.io.*;
public class byte_stream {

	public void Bytes_Strm() throws IOException{
		
		 String a = "" ;
	     String b = ",";
		 String inpt = "C:/Users/Manisha Shetti/Desktop/510/data.csv";
		 String otpt = "C:/Users/Manisha Shetti/Desktop/510/data_bytes.csv";
		 
      try {
   	   FileInputStream i = new FileInputStream(inpt);
   	   FileOutputStream o = new FileOutputStream(otpt);
   	   @SuppressWarnings("resource")
   	   BufferedReader buf = new BufferedReader(new InputStreamReader(i));
   	   BufferedWriter buff = new BufferedWriter(new OutputStreamWriter(o));
   	   while((a = buf.readLine())!= null){
   		   String[] c = a.split(b);
              buff.write(c[0] + "," + " " + c[2]);
              buff.newLine();
   	   }
   	   buff.flush();
          buff.close();
      }
      catch (FileNotFoundException E) {
      	   E.printStackTrace();
      	  }
      	  }
  
	public static void main(String args[]) throws IOException {
		byte_stream bt= new byte_stream();
		bt.Bytes_Strm();
	}	
	
	

}
