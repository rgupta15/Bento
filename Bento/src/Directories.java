import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Directories {
	
	public static void listf(String directoryName,ArrayList<FileStat> files) {
		
		File directory = new File(directoryName);

	    // Get all files from a directory.
	    File[] fList = directory.listFiles();
	    if(fList != null)
	        for (File file : fList) {      
	            if (file.isFile()) {
	            		FileStat fileObj = new FileStat(file.getAbsolutePath(),file.getName(),file.length());
	                files.add(fileObj);
	            } else if (file.isDirectory()) {
	                listf(file.getAbsolutePath(), files);
	            }
	        }
	    }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<FileStat> files = new ArrayList<FileStat>();
		//recursively get files
		listf(args[0],files);
		//sort based on filesize using comparator
		Collections.sort(files,FileStat.FileSizeComp);
		for(FileStat file:files) 
			System.out.printf("Path:%s\tName:%s\tSize:%d\n",file.filePath,file.fileName,file.fileSize);

	}
}
