package com.cloudframe.app.ip662010.dto;

/**
*  The class RemainingCarrLthNumGroup400 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:55. using version 5.0.0.256
**/


import com.cloudframe.app.ip662010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RemainingCarrLthNumGroup400 extends RemainingCarrLthNumGroup400Serialized {
   

								private int remainingCarrLthNum400;

						private char[] remainingCarrLthNumX400 = Field.fillLowValue(3);
	
	/**
	* Constructor for RemainingCarrLthNumGroup400
	**/
    public RemainingCarrLthNumGroup400() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of remainingCarrLthNum400
	 *	@return remainingCarrLthNum400
	 */
	public int getRemainingCarrLthNum400() throws CFException {
       if (isRemainingCarrLthNum400Modified()) { 
           remainingCarrLthNum400 = refreshRemainingCarrLthNum400();
        }
   		return remainingCarrLthNum400;
	}
	

	
	   
	/**
	 * 	Update RemainingCarrLthNum400 with the passed value
	 *  Corresponding COBOL Variable is 400-REMAINING-CARR-LTH-NUM
	 *	@param number
	 */
	public void setRemainingCarrLthNum400(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    remainingCarrLthNum400 = checkRemainingCarrLthNum400MaxLimit(number); 
		serializeRemainingCarrLthNum400(remainingCarrLthNum400);
	}
	

	public void setRemainingCarrLthNum400(long number) {
	    number = checkRemainingCarrLthNum400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRemainingCarrLthNum400((int)number);
	}
	
	/**
	 * 	Update RemainingCarrLthNum400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRemainingCarrLthNum400(char[] value) throws CFException {
		 remainingCarrLthNum400 = serializeRemainingCarrLthNum400(value);
	}
	/**
	 * 	Update RemainingCarrLthNum400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRemainingCarrLthNum400String(char[] value) throws CFException {
		 setRemainingCarrLthNum400(value);
	}
	/**
	 *	Returns the value of remainingCarrLthNumX400
	 *	@return remainingCarrLthNumX400
	 */
   public char[] getRemainingCarrLthNumX400() throws CFException{
     if (isRemainingCarrLthNumX400Modified()) { 
        remainingCarrLthNumX400 = refreshRemainingCarrLthNumX400();
     }
   		return remainingCarrLthNumX400;
   }

  
	/**
	*  set variable remainingCarrLthNumX400
	*  Corresponding COBOL Variable is 400-REMAINING-CARR-LTH-NUM-X
	*  @param value
	**/
   public void setRemainingCarrLthNumX400(char[] value) {
      remainingCarrLthNumX400 = checkRemainingCarrLthNumX400Constraints(value);
      serializeRemainingCarrLthNumX400(remainingCarrLthNumX400);
   } 

     /**
	 * 	Update RemainingCarrLthNumX400 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRemainingCarrLthNumX400(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRemainingCarrLthNumX400,remainingCarrLthNumX400.length);
   	
   }
   
   public void setRemainingCarrLthNumX400(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRemainingCarrLthNumX400,remainingCarrLthNumX400.length);
   	
   }
   
     /**
	 * 	Update RemainingCarrLthNumX400 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRemainingCarrLthNumX400(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRemainingCarrLthNumX400+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RemainingCarrLthNumX400 with another Field
	 *	@param value
	 */
   public void setRemainingCarrLthNumX400(Field source) {
       replace(source,0,source.length(),beginRemainingCarrLthNumX400,REMAINING_CARR_LTH_NUM_X_400_LEN);
   	
   }  
   
     /**
	 * 	Update RemainingCarrLthNumX400 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRemainingCarrLthNumX400(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRemainingCarrLthNumX400,REMAINING_CARR_LTH_NUM_X_400_LEN);
   	
   }
   
     /**
	 * 	Update RemainingCarrLthNumX400 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRemainingCarrLthNumX400(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRemainingCarrLthNumX400+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRemainingCarrLthNumGroup400FieldLength() {
			return REMAINING_CARR_LTH_NUM_GROUP_400_LENGTH;
		}

}
  
