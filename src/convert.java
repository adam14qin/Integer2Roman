
public class convert {
	public static void main(String []args){
		String s="PAYPALISHIRING";
		String output="";
		//String s="A";
		int numRows=3;
		//int numRows=1;
//		if ((s.length()==1)||(numRows==1)){
//			output=s;
//		}
//		else {
//	    for (int i=0;i<numRows;i++){
//	        int pointer=i;
//	        if ((i>0)&&(i<numRows-1)){
//	            while (pointer<s.length()){
//	                output+=s.charAt(pointer);
//	                pointer= ((pointer%(2*numRows-2)==i)?(pointer+2*(numRows-i-1)):(pointer+2*i));                                    
//	            } 
//	        }
//	        else {while (pointer<s.length())
//	                    {
//	                    output+=s.charAt(pointer);
//	                    pointer+=2*numRows-2;
//	                    }     
//	        }
//	    }
//		}
		
//	    System.out.println(output);
		int nRows=3;
	    char[] c = s.toCharArray();
	    int len = c.length;
	    StringBuffer[] sb = new StringBuffer[nRows];
	    for (int i = 0; i < sb.length; i++) {sb[i] = new StringBuffer();System.out.println(i);}
	    
	    int i = 0;
	    while (i < len) {
	        for (int idx = 0; idx < nRows && i < len; idx++) // vertically down
	            sb[idx].append(c[i++]);
	        for (int idx = nRows-2; idx >= 1 && i < len; idx--) // obliquely up
	            sb[idx].append(c[i++]);
	    }
	    for (int idx = 1; idx < sb.length; idx++)
	        sb[0].append(sb[idx]);
	    System.out.println(sb[0].toString());
	}
}
