package com.cloudframe.app.sf326010.dto;

/**
*  The class Z9Int32Group800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.sf326010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Z9Int32Group800 extends Z9Int32Group800Serialized {
   

								private int z9Int32800;
					private Z9Int32X800 z9Int32X800 = new Z9Int32X800();
	
	/**
	* Constructor for Z9Int32Group800
	**/
    public Z9Int32Group800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			z9Int32X800.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setZ9Int32800(0);
    }


 

	/**
	 *	Returns the value of z9Int32800
	 *	@return z9Int32800
	 */
	public int getZ9Int32800() throws CFException {
        if (isZ9Int32800Modified()) { 
           z9Int32800 = refreshZ9Int32800();
        }
   		return z9Int32800;
	}
	
	/**
	 * 	Update Z9Int32800 with the passed value
	 *  Corresponding COBOL Variable is 800-Z9-INT-32
	 *	@param number
	 */
	public void setZ9Int32800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    z9Int32800 = checkZ9Int32800MaxLimit(number); 
		serializeZ9Int32800(z9Int32800);
	}


	public void setZ9Int32800(long number) {
	    number = checkZ9Int32800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setZ9Int32800((int)number);
	}
	
	/**
	 *	Returns the value of z9Int32X800
	 *	@return z9Int32X800
	 */   
	 public Z9Int32X800 getZ9Int32X800() {
   	return z9Int32X800;
   }
   /**
	* 	Update Z9Int32X800 with the passed value
	*   Corresponding COBOL Variable is 800-Z9-INT-32-X
	*	@param value
	*/
   public void setZ9Int32X800(char[] value) {
      z9Int32X800.setString(value); 
   }   
    
     /**
	 * 	Update Z9Int32X800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setZ9Int32X800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,z9Int32X800.begin,z9Int32X800.length());
   }
   
     /**
	 * 	Update Z9Int32X800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int32X800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,z9Int32X800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Z9Int32X800 with another Field
	 *	@param value
	 */
   public void setZ9Int32X800(Field source) {
   	replace(source,0,source.length(),z9Int32X800.begin,z9Int32X800.length());
   }  
   
     /**
	 * 	Update Z9Int32X800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setZ9Int32X800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,z9Int32X800.begin,z9Int32X800.length());
   }
   
     /**
	 * 	Update Z9Int32X800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int32X800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,z9Int32X800.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getZ9Int32Group800FieldLength() {
			return Z_9_INT_32_GROUP_800_LENGTH;
		}

}
  
