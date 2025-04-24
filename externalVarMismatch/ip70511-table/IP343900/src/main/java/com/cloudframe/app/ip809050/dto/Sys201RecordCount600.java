package com.cloudframe.app.ip809050.dto;

/**
*  The class Sys201RecordCount600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys201RecordCount600 extends Sys201RecordCount600Serialized { 
   


								private char[] sys201Count600 = Field.fillLowValue(10);
	
	/**
	* Constructor for Sys201RecordCount600
	**/
    public Sys201RecordCount600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             pad(60,"IP809050-SYS201: EDIT #1848                ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 0
             ,60
             );
    }


 

	/**
	 *	Returns the value of sys201Count600
	 *	@return sys201Count600
	 */
   public char[] getSys201Count600() throws CFException{
     if (isSys201Count600Modified()) { 
        sys201Count600 = refreshSys201Count600();
     }
   		return sys201Count600;
   }

  
	/**
	*  set variable sys201Count600
	*  Corresponding COBOL Variable is 600-SYS201-COUNT
	*  @param value
	**/
   public void setSys201Count600(char[] value) {
      sys201Count600 = checkSys201Count600Constraints(value);
      serializeSys201Count600(sys201Count600);
   } 

     /**
	 * 	Update Sys201Count600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys201Count600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys201Count600,sys201Count600.length);
   	
   }
   
   public void setSys201Count600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys201Count600,sys201Count600.length);
   	
   }
   
     /**
	 * 	Update Sys201Count600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201Count600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201Count600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys201Count600 with another Field
	 *	@param value
	 */
   public void setSys201Count600(Field source) {
       replace(source,0,source.length(),beginSys201Count600,SYS_201_COUNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update Sys201Count600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys201Count600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys201Count600,SYS_201_COUNT_600_LEN);
   	
   }
   
     /**
	 * 	Update Sys201Count600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201Count600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201Count600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys201RecordCount600FieldLength() {
			return SYS_201_RECORD_COUNT_600_LENGTH;
		}

}
  
