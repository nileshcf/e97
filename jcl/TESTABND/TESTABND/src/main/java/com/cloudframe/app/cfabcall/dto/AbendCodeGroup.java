package com.cloudframe.app.cfabcall.dto;

/**
*  The class AbendCodeGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.cfabcall.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AbendCodeGroup extends AbendCodeGroupSerialized {
   

								private int abendCode;

						private char[] abendX = Field.fillLowValue(4);
	
	/**
	* Constructor for AbendCodeGroup
	**/
    public AbendCodeGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of abendCode
	 *	@return abendCode
	 */
	public int getAbendCode() throws CFException {
        if (isAbendCodeModified()) { 
           abendCode = refreshAbendCode();
        }
   		return abendCode;
	}
	
	/**
	 * 	Update AbendCode with the passed value
	 *  Corresponding COBOL Variable is WS-ABEND-CODE
	 *	@param number
	 */
	public void setAbendCode(int number) {
	     // Truncate if the number is beyond +/- Max range
	    abendCode = checkAbendCodeMaxLimit(number); 
		serializeAbendCode(abendCode);
	}


	public void setAbendCode(long number) {
	    number = checkAbendCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setAbendCode((int)number);
	}
	
	/**
	 *	Returns the value of abendX
	 *	@return abendX
	 */
   public char[] getAbendX() throws CFException{
     if (isAbendXModified()) { 
        abendX = refreshAbendX();
     }
   		return abendX;
   }

  
	/**
	*  set variable abendX
	*  Corresponding COBOL Variable is WS-ABEND-X
	*  @param value
	**/
   public void setAbendX(char[] value) {
      abendX = checkAbendXConstraints(value);
      serializeAbendX(abendX);
   } 

     /**
	 * 	Update AbendX 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendX(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAbendX,abendX.length);
   	
   }
   
   public void setAbendX(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAbendX,abendX.length);
   	
   }
   
     /**
	 * 	Update AbendX 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendX+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AbendX with another Field
	 *	@param value
	 */
   public void setAbendX(Field source) {
       replace(source,0,source.length(),beginAbendX,ABEND_X_LEN);
   	
   }  
   
     /**
	 * 	Update AbendX 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendX(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAbendX,ABEND_X_LEN);
   	
   }
   
     /**
	 * 	Update AbendX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendX+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAbendCodeGroupFieldLength() {
			return ABEND_CODE_GROUP_LENGTH;
		}

}
  
