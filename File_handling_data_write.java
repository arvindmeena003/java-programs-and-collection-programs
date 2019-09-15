package arvind;

import java.io.*;
public class File_handling_data_write {

	public static void main() throws IOException{
		int i;
		FileOutputStream fout=new FileOutputStream("./meena.txt");
String s="Arvind";
char ch[]=s.toCharArray();
	for(i=0;i<s.length();i++)
		fout.write(ch[i]);
	fout.close();
	}
}
