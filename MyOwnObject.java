
public class MyOwnObject {
	String dirName = "";
	String fileName = "";
	String childName = "";
	int place;
	
	/*public void read() {
		MyOwnObject x = new MyOwnObject(); 
		ArrayBoundedStack<MyOwnObject> stack = new ArrayBoundedStack<MyOwnObject>();
		
		File parent = new File("C:\\DirFolder1");
		dirName = parent.getPath();
		
		stack.push(x);
		
		while (!stack.isEmpty()) {
			File current = new File(dirName, childName);
			System.out.println(current.getName());
			stack.pop();
			
			File [] files = current.listFiles();

			for (File f : files) {
				if (f.isDirectory()) {
					childName = f.getName();
					System.out.println("\t" + childName);
					stack.push(new MyOwnObject());
				}
				else {
					fileName = f.getName();
					System.out.println("\t" + fileName);
				}
			}
		}
	}
	*/
}