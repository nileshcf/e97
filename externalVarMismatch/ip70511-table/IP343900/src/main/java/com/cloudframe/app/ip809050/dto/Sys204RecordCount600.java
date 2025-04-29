package com.cloudframe.app.ip809050.dto;

/**
*  The class Sys204RecordCount600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys204RecordCount600 extends Sys204RecordCount600Serialized {
   


								private char[] sys204Count600 = Field.fillLowValue(10);
	
	/**
	* Constructor for Sys204RecordCount600
	**/
    public Sys204RecordCount600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             pad(60,"IP809050-SYS204: EDIT #1851                ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 0
             ,60
             );
    }


 

	/**
	 *	Returns the value of sys204Count600
	 *	@return sys204Count600
	 */
   public char[] getSys204Count600() throws CFException{
     if (isSys204Count600Modified()) { 
        sys204Count600 = refreshSys204Count600();
     }
   		return sys204Count600;
   }

  
	/**
	*  set variable sys204Count600
	*  Corresponding COBOL Variable is 600-SYS204-COUNT
	*  @param value
	**/
   public void setSys204Count600(char[] value) {
      sys204Count600 = checkSys204Count600Constraints(value);
      serializeSys204Count600(sys204Count600);
   } 

     /**
	 * 	Update Sys204Count600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys204Count600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys204Count600,sys204Count600.length);
   	
   }
   
   public void setSys204Count600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys204Count600,sys204Count600.length);
   	
   }
   
     /**
	 * 	Update Sys204Count600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys204Count600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys204Count600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys204Count600 with another Field
	 *	@param value
	 */
   public void setSys204Count600(Field source) {
       replace(source,0,source.length(),beginSys204Count600,SYS_204_COUNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update Sys204Count600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys204Count600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys204Count600,SYS_204_COUNT_600_LEN);
   	
   }
   
     /**
	 * 	Update Sys204Count600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys204Count600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys204Count600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys204RecordCount600FieldLength() {
			return SYS_204_RECORD_COUNT_600_LENGTH;
		}

}
  
