package com.cloudframe.app.sf305120.dto;

/**
*  The class Z9Int16Group800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Z9Int16Group800 extends Z9Int16Group800Serialized {
   

								private short z9Int16800;
					private Z9Int16X800 z9Int16X800 = new Z9Int16X800();
	
	/**
	* Constructor for Z9Int16Group800
	**/
    public Z9Int16Group800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			z9Int16X800.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setZ9Int16800((short)0);
    }


 

	/**
	 *	Returns the value of z9Int16800
	 *	@return z9Int16800
	 */
	public short getZ9Int16800() throws CFException {
        if (isZ9Int16800Modified()) { 
           z9Int16800 = refreshZ9Int16800();
        }
   		return z9Int16800;
	}
	
	/**
	 * 	Update Z9Int16800 with the passed value
	 *  Corresponding COBOL Variable is 800-Z9-INT-16
	 *	@param number
	 */
	public void setZ9Int16800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    z9Int16800 = checkZ9Int16800MaxLimit(number); 
		serializeZ9Int16800(z9Int16800);
	}

	public void setZ9Int16800(int number) {
	    number = checkZ9Int16800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setZ9Int16800((short)number);
	}
	public void setZ9Int16800(long number) {
	    number = checkZ9Int16800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setZ9Int16800((short)number);
	}
	

	/**
	 *	Returns the value of z9Int16X800
	 *	@return z9Int16X800
	 */   
	 public Z9Int16X800 getZ9Int16X800() {
   	return z9Int16X800;
   }
   /**
	* 	Update Z9Int16X800 with the passed value
	*   Corresponding COBOL Variable is 800-Z9-INT-16-X
	*	@param value
	*/
   public void setZ9Int16X800(char[] value) {
      z9Int16X800.setString(value); 
   }   
    
     /**
	 * 	Update Z9Int16X800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setZ9Int16X800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,z9Int16X800.begin,z9Int16X800.length());
   }
   
     /**
	 * 	Update Z9Int16X800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int16X800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,z9Int16X800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Z9Int16X800 with another Field
	 *	@param value
	 */
   public void setZ9Int16X800(Field source) {
   	replace(source,0,source.length(),z9Int16X800.begin,z9Int16X800.length());
   }  
   
     /**
	 * 	Update Z9Int16X800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setZ9Int16X800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,z9Int16X800.begin,z9Int16X800.length());
   }
   
     /**
	 * 	Update Z9Int16X800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int16X800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,z9Int16X800.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getZ9Int16Group800FieldLength() {
			return Z_9_INT_16_GROUP_800_LENGTH;
		}

}
  
