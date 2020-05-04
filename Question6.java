
public class Question6 {

	
	public static void main(String[] args) {
	int first = 0,second=0,third=0;
	int max,min,mid;
	if(first>second &first>third){
		max=first;
		mid=second;
		min=third;
	}
	else if (first>second&first<third ){
		mid=first;
		min=second;
		max=third;
	}
	else if(first>third &first<second){
		mid=first;
		max=second;
		min=third;
	}
	else if((first<second &first<third)& second>third){
		
		min=first;
		max=second;
		mid=third;
	}
	}

}
