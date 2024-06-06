import java.io.*;
Class BufferedRWDemo {
Public static void main(String args[]) throws Exception {
BufferedReaderbr = new BufferedReader (new FileReader(“in.txt”) );
BufferedWriterbw = new Bufferewriter (new FileWriter(“out.txt”) );
Int i;
do {
i = br.read();
if ( i ! = -1)
{
If (Character.isLowerCase( ( char ) i ) )
bw.write(Character.toUpperCase( (char) i ) );
else if (Character.isUpperCase( (char) i ) )
bw.write(Character.toLowerCase( (char) i ) );
else
bw.write((char) i );
}
} while( i ! = -1);
br.close();
bw.close();
}}