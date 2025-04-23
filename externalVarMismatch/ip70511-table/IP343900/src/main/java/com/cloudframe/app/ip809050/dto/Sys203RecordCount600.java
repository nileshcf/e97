package com.cloudframe.app.ip809050.dto;

/**
*  The class Sys203RecordCount600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys203RecordCount600 extends Sys203RecordCount600Serialized {
   


								private char[] sys203Count600 = Field.fillLowValue(10);
	
	/**
	* Constructor for Sys203RecordCount600
	**/
    public Sys203RecordCount600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             pad(60,"IP809050-SYS203: EDIT #1850                ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 0
             ,60
             );
    }


 

	/**
	 *	Returns the value of sys203Count600
	 *	@return sys203Count600
	 */
   public char[] getSys203Count600() throws CFException{
     if (isSys203Count600Modified()) { 
        sys203Count600 = refreshSys203Count600();
     }
   		return sys203Count600;
   }

  
	/**
	*  set variable sys203Count600
	*  Corresponding COBOL Variable is 600-SYS203-COUNT
	*  @param value
	**/
   public void setSys203Count600(char[] value) {
      sys203Count600 = checkSys203Count600Constraints(value);
      serializeSys203Count600(sys203Count600);
   } 

     /**
	 * 	Update Sys203Count600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys203Count600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys203Count600,sys203Count600.length);
   	
   }
   
   public void setSys203Count600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys203Count600,sys203Count600.length);
   	
   }
   
     /**
	 * 	Update Sys203Count600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys203Count600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys203Count600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys203Count600 with another Field
	 *	@param value
	 */
   public void setSys203Count600(Field source) {
       replace(source,0,source.length(),beginSys203Count600,SYS_203_COUNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update Sys203Count600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys203Count600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys203Count600,SYS_203_COUNT_600_LEN);
   	
   }
   
     /**
	 * 	Update Sys203Count600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys203Count600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys203Count600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys203RecordCount600FieldLength() {
			return SYS_203_RECORD_COUNT_600_LENGTH;
		}

}
  
