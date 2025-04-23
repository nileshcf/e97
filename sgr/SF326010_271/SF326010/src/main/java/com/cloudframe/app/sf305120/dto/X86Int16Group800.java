package com.cloudframe.app.sf305120.dto;

/**
*  The class X86Int16Group800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X86Int16Group800 extends X86Int16Group800Serialized {
   

								private short x86Int16800;
					private X86Int16X800 x86Int16X800 = new X86Int16X800();
	
	/**
	* Constructor for X86Int16Group800
	**/
    public X86Int16Group800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			x86Int16X800.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setX86Int16800((short)0);
    }


 

	/**
	 *	Returns the value of x86Int16800
	 *	@return x86Int16800
	 */
	public short getX86Int16800() throws CFException {
        if (isX86Int16800Modified()) { 
           x86Int16800 = refreshX86Int16800();
        }
   		return x86Int16800;
	}
	
	/**
	 * 	Update X86Int16800 with the passed value
	 *  Corresponding COBOL Variable is 800-X86-INT-16
	 *	@param number
	 */
	public void setX86Int16800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    x86Int16800 = checkX86Int16800MaxLimit(number); 
		serializeX86Int16800(x86Int16800);
	}

	public void setX86Int16800(int number) {
	    number = checkX86Int16800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setX86Int16800((short)number);
	}
	public void setX86Int16800(long number) {
	    number = checkX86Int16800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setX86Int16800((short)number);
	}
	

	/**
	 *	Returns the value of x86Int16X800
	 *	@return x86Int16X800
	 */   
	 public X86Int16X800 getX86Int16X800() {
   	return x86Int16X800;
   }
   /**
	* 	Update X86Int16X800 with the passed value
	*   Corresponding COBOL Variable is 800-X86-INT-16-X
	*	@param value
	*/
   public void setX86Int16X800(char[] value) {
      x86Int16X800.setString(value); 
   }   
    
     /**
	 * 	Update X86Int16X800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX86Int16X800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x86Int16X800.begin,x86Int16X800.length());
   }
   
     /**
	 * 	Update X86Int16X800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int16X800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x86Int16X800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X86Int16X800 with another Field
	 *	@param value
	 */
   public void setX86Int16X800(Field source) {
   	replace(source,0,source.length(),x86Int16X800.begin,x86Int16X800.length());
   }  
   
     /**
	 * 	Update X86Int16X800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX86Int16X800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x86Int16X800.begin,x86Int16X800.length());
   }
   
     /**
	 * 	Update X86Int16X800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int16X800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x86Int16X800.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getX86Int16Group800FieldLength() {
			return X_86_INT_16_GROUP_800_LENGTH;
		}

}
  
