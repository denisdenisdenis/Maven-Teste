import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     Screen s = new Screen();
	     try{
	    	 	s.click("Img/LoginNeoflow.png");
	     }
         catch(FindFailed e){
                 e.printStackTrace(); 
         }

	}

}
