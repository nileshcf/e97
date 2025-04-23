package com.cloudframe.app.sf305120.dto;

/**
*  The class X86Int32Group800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X86Int32Group800 extends X86Int32Group800Serialized {
   

								private int x86Int32800;
					private X86Int32X800 x86Int32X800 = new X86Int32X800();
	
	/**
	* Constructor for X86Int32Group800
	**/
    public X86Int32Group800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			x86Int32X800.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setX86Int32800(0);
    }


 

	/**
	 *	Returns the value of x86Int32800
	 *	@return x86Int32800
	 */
	public int getX86Int32800() throws CFException {
        if (isX86Int32800Modified()) { 
           x86Int32800 = refreshX86Int32800();
        }
   		return x86Int32800;
	}
	
	/**
	 * 	Update X86Int32800 with the passed value
	 *  Corresponding COBOL Variable is 800-X86-INT-32
	 *	@param number
	 */
	public void setX86Int32800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    x86Int32800 = checkX86Int32800MaxLimit(number); 
		serializeX86Int32800(x86Int32800);
	}


	public void setX86Int32800(long number) {
	    number = checkX86Int32800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setX86Int32800((int)number);
	}
	
	/**
	 *	Returns the value of x86Int32X800
	 *	@return x86Int32X800
	 */   
	 public X86Int32X800 getX86Int32X800() {
   	return x86Int32X800;
   }
   /**
	* 	Update X86Int32X800 with the passed value
	*   Corresponding COBOL Variable is 800-X86-INT-32-X
	*	@param value
	*/
   public void setX86Int32X800(char[] value) {
      x86Int32X800.setString(value); 
   }   
    
     /**
	 * 	Update X86Int32X800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX86Int32X800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x86Int32X800.begin,x86Int32X800.length());
   }
   
     /**
	 * 	Update X86Int32X800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32X800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x86Int32X800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X86Int32X800 with another Field
	 *	@param value
	 */
   public void setX86Int32X800(Field source) {
   	replace(source,0,source.length(),x86Int32X800.begin,x86Int32X800.length());
   }  
   
     /**
	 * 	Update X86Int32X800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX86Int32X800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x86Int32X800.begin,x86Int32X800.length());
   }
   
     /**
	 * 	Update X86Int32X800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32X800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x86Int32X800.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getX86Int32Group800FieldLength() {
			return X_86_INT_32_GROUP_800_LENGTH;
		}

}
  
