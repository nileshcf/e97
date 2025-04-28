package com.cloudframe.app.sf305120.dto;

/**
*  The class HalfWordGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HalfWordGroup800 extends HalfWordGroup800Serialized {
   

								private short halfWord800;
					private HalfWordX2800 halfWordX2800 = new HalfWordX2800();
	
	/**
	* Constructor for HalfWordGroup800
	**/
    public HalfWordGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			halfWordX2800.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setHalfWord800((short)0);
    }


 

	/**
	 *	Returns the value of halfWord800
	 *	@return halfWord800
	 */
	public short getHalfWord800() throws CFException {
        if (isHalfWord800Modified()) { 
           halfWord800 = refreshHalfWord800();
        }
   		return halfWord800;
	}
	
	/**
	 * 	Update HalfWord800 with the passed value
	 *  Corresponding COBOL Variable is 800-HALF-WORD
	 *	@param number
	 */
	public void setHalfWord800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    halfWord800 = checkHalfWord800MaxLimit(number); 
		serializeHalfWord800(halfWord800);
	}

	public void setHalfWord800(int number) {
	    number = checkHalfWord800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHalfWord800((short)number);
	}
	public void setHalfWord800(long number) {
	    number = checkHalfWord800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHalfWord800((short)number);
	}
	

	/**
	 *	Returns the value of halfWordX2800
	 *	@return halfWordX2800
	 */   
	 public HalfWordX2800 getHalfWordX2800() {
   	return halfWordX2800;
   }
   /**
	* 	Update HalfWordX2800 with the passed value
	*   Corresponding COBOL Variable is 800-HALF-WORD-X2
	*	@param value
	*/
   public void setHalfWordX2800(char[] value) {
      halfWordX2800.setString(value); 
   }   
    
     /**
	 * 	Update HalfWordX2800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHalfWordX2800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,halfWordX2800.begin,halfWordX2800.length());
   }
   
     /**
	 * 	Update HalfWordX2800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHalfWordX2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,halfWordX2800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HalfWordX2800 with another Field
	 *	@param value
	 */
   public void setHalfWordX2800(Field source) {
   	replace(source,0,source.length(),halfWordX2800.begin,halfWordX2800.length());
   }  
   
     /**
	 * 	Update HalfWordX2800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHalfWordX2800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,halfWordX2800.begin,halfWordX2800.length());
   }
   
     /**
	 * 	Update HalfWordX2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHalfWordX2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,halfWordX2800.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getHalfWordGroup800FieldLength() {
			return HALF_WORD_GROUP_800_LENGTH;
		}

}
  
