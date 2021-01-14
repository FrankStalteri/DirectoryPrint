/*
 * Frank Stalteri
 * CSC236
 * Lab 2
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DirectoryRead {
	
	public static void main(String[] args) throws IOException {
		//ask for starting directory
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter starting directory: ");
		String start = kb.nextLine();
		kb.close();
		
		//call read method to start traversing
		read(start);
		
	}
	public static void read(String start) {
		String childName = "";
		String parentName = "";
		File current = new File(start);
		String [] sFiles = {};
		ArrayBoundedStack<DirInfo> stack = new ArrayBoundedStack<>();
		DirInfo x;
		
		//get first directory information
		parentName = current.getPath();
		sFiles = current.list();
		File [] files = current.listFiles();
		for (File f : files) {
			if (f.isDirectory()) {
				childName = f.getPath();
			}
		}
		//push first object onto stack with its info.
		stack.push(x = new DirInfo(childName, parentName, sFiles));
		
		//Keep finding the directories and get its contents 
		//until reach a dead end.
		while (current != null) {
			File c = new File(childName);
			sFiles = c.list();
			File [] cFiles = c.listFiles();
			for (int i = 0; i < cFiles.length; i++) {
				//if a directory is found, get its contents and
				//make current directory the child directory
				if (cFiles[i].isDirectory()) {
					childName = cFiles[i].getPath();
					parentName = cFiles[i].getParent();
					stack.push(x = new DirInfo(childName, parentName, sFiles));
					current = new File(childName);
				}
				//if the first file in the array is a file, 
				//then there is no directory later and make current null
				//to stop traversing
				if (cFiles[0].isFile()) {
					parentName = cFiles[i].getParent();
					childName = null;
					stack.push(x = new DirInfo(childName, parentName, sFiles));
					current = null;
				}
			}
		}
		//loop through stack to access each DirInfo object's 
		//file information then pop for next one
		String indent = "";
		while (!stack.isEmpty()) {
			DirInfo curr = stack.top();
			System.out.println(indent + curr.parentName);
			
			for (String f : curr.files) {
				System.out.println(indent + f);
			}
			indent = indent.concat("   ");
			stack.pop();
		}
	}
}