
import java.util.*;
public class FileStat{
	
	String filePath;
	String fileName;
	long fileSize;

	public FileStat(String filePath,String fileName,long fileSize) {
		// TODO Auto-generated constructor stub
		this.fileName = fileName;
		this.filePath = filePath;
		this.fileSize = fileSize;
	}
	
	public static Comparator<FileStat> FileSizeComp = new Comparator<FileStat>() {

		public int compare(FileStat s1, FileStat s2) {			
		   return (int) (s1.fileSize - s2.fileSize);
	    }};

}
