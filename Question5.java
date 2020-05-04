import java.lang.reflect.Array;


public class Question5 {

	
	public static void main(String[] args) {
		int n = 0;
		 int []x = new int [100]; 
		for (int i = 1; i <= n; i++) 
		{ for (int j = 1; j <= n; j++) 
			if ((x[i]& x[j]) != 0){
				return ;
			}
			
		System.out.println ("First all-zero row is:"+ i); 
		break; 
		
		}

	}

}
