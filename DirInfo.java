/*
 * Frank Stalteri
 * CSC236
 * Lab 2
 */
public class DirInfo {
	
	String childName = "";
	String parentName = "";
	String [] files = {};
	
	public DirInfo(String childName, String parentName, String [] files) {
		
		this.childName = childName;
		this.parentName = parentName;
		this.files = files;
	}
	
	public DirInfo() {
		
	}
	/*public void readDirectory() throws IOException {
		ArrayBoundedStack<File> stack = new ArrayBoundedStack<File>();
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a directory to read.");
		String dir = kb.next();
		kb.close();
		File p = new File(dir);
		
		stack.push(p);
		
		while (!stack.isEmpty()) {
			File current = stack.top();
			String parentName = current.getName();
			System.out.println(parentName);
			stack.pop();
			
			File [] files = current.listFiles();
			
			for (File f : files) {
				if (f.isDirectory()) {
					stack.push(new File(current, f.getName()));
					//System.out.println("\t" + f.getName());
					files = f.listFiles();
				}
				else {
					System.out.println("\t" + f.getName());
				}
			}
		}
	}
	*/
}