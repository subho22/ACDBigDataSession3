import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.FileUtil;
import org.apache.hadoop.fs.Path;

public class Task1{
  public static void main(String[] args) throws IOException, URISyntaxException
  {

public static void main(String[] args) throws IOException, URISyntaxException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String uri = br.readLine();
    Configuration conf = new Configuration();
    Path path = new Path(uri);
    FileSystem fs = FileSystem.get(URI.creste(uri), conf);
    FileStatus[] fileStatus = fs.listStatus(path);
    for(FileStatus status : fileStatus){
        System.out.println(status.getPath().toString());
    }
}