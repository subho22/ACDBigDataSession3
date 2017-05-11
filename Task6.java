package Session3;

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class Task6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		        //String dest = br.readLine();
        
        Configuration conf = new Configuration();
        FileSystem fs =FileSystem.get(conf);
        /*OutputStream os = fs.create(new Path(dest));
        
        InputStream is = new BufferedInputStream(new FileInputStream("/home/acadgild/hello.txt"));
        
       IOUtils.copyBytes(is, os, conf);*/
       
       fs.copyFromLocalFile(new Path("/home/acadgild/hello.txt"), new Path("/mydir_hdfs"));
        
	}

}
