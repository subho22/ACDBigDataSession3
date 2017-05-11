package Session3;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		
		long st= Long.parseLong(args[0]);
		long end = Long.parseLong(args[1]);
		
		String directoryLinux ="/Users/acadgild/test";
		
		listFilesAndFilesSubDirectories(directoryLinux,st,end);
        

	}
	
    public static void listFilesAndFilesSubDirectories(String directoryName,long st,long end){

    File directory = new File(directoryName);
		
		File[] flist = directory.listFiles();
		
        for (File file : flist){

            if (file.isFile()){
 
            	
            	if(file.lastModified()>st && file.lastModified()<end)
                System.out.println(file.getAbsolutePath());

            } else if (file.isDirectory()){

                listFilesAndFilesSubDirectories(file.getAbsolutePath(),st,end);

            }

        }

        }

    }


