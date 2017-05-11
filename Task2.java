package Session3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class Task2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		String uri =args[0];
		Path path = new Path(uri);
		Configuration conf = new Configuration();
		FileSystem fs = FileSystem.get(URI.create(uri), conf);
		
        displayrecursively(fs, path);

	}
	
	public static void displayrecursively(FileSystem fs,Path path) throws FileNotFoundException, IOException
	{
    FileStatus[] filestatus = fs.listStatus(path);
		
		for(FileStatus fstat:filestatus)
		{
			if(fstat.isDirectory())
				System.out.println("Directory : "+fstat.getPath());
			
			displayrecursively(fs, fstat.getPath());
		}

	}

}
