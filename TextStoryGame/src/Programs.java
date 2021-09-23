import java.io.IOException;
import java.net.URI;

public class Programs {
	
	public static void TaskManager() {
		
		Runtime runtime = Runtime.getRuntime(); 
        try
        {
            runtime.exec("taskmgr.exe");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
	}
	
	public static void YouTube() {
		
		try { 
			   URI uri= new URI("https://www.youtube.com/");
			   
			   java.awt.Desktop.getDesktop().browse(uri);
			    System.out.println("Web page opened in browser");
			 
			  } catch (Exception e) {
			   
			   e.printStackTrace();
			  }
	}

}
