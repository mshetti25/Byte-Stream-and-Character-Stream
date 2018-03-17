import java.io.*;
public class character_stream {

	public void Ch_Strm() {

		BufferedReader buf = null;
        BufferedWriter buff= null;
        String a = "";
        String b = ",";
        String inpt = "C:/Users/Manisha Shetti/Desktop/510/data.csv";
        String otpt= "C:/Users/Manisha Shetti/Desktop/510/data_character.csv";
        
       
        try {

            buf = new BufferedReader(new FileReader(inpt));
            buff= new BufferedWriter(new FileWriter(otpt));
            while ((a = buf.readLine()) != null) {
                String[] c = a.split(b);
                buff.write(c[1]+","+" "+ c[3]);
              
                buff.newLine();
            }
            buff.flush();
            buff.close();

        } catch (FileNotFoundException E) {
            E.printStackTrace();
        } catch (IOException E) {
            E.printStackTrace();
        } finally {
            if (buf != null) {
                try {
                    buf.close();
                } catch (IOException E) {
                    E.printStackTrace();
                }
            }
        }

    }
	public static void main(String args[]){
		character_stream ch= new character_stream();
		ch.Ch_Strm();
	}

}
