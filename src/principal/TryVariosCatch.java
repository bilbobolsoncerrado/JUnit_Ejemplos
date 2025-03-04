package principal;

public class TryVariosCatch {
	 

	  public boolean writeListFalse(int indice, int[] arr) 
	  {

	
		  
	    try {
	    	arr[indice] = 10;
	    	return true;	
	    }
	    	    
	    catch (ArrayIndexOutOfBoundsException e) {
	             return false;
	    } 
	  }
	  public void writeListSyso(int indice, int[] arr) 
	  {

		    try {
		    	arr[indice] = 10;
		    }
		    	    
		    catch (ArrayIndexOutOfBoundsException e) {
		    	System.out.println("Intento de acceso a un índice fuera del array");
		    } 
	  }

}
