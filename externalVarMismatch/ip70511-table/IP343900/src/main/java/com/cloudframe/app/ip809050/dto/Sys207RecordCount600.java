package com.cloudframe.app.ip809050.dto;

/**
*  The class Sys207RecordCount600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys207RecordCount600 extends Sys207RecordCount600Serialized {
   


								private char[] sys207Count600 = Field.fillLowValue(10);
	
	/**
	* Constructor for Sys207RecordCount600
	**/
    public Sys207RecordCount600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             pad(60,"IP809050-SYS207: EDIT #1750                 ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 0
             ,60
             );
    }


 

	/**
	 *	Returns the value of sys207Count600
	 *	@return sys207Count600
	 */
   public char[] getSys207Count600() throws CFException{
     if (isSys207Count600Modified()) { 
        sys207Count600 = refreshSys207Count600();
     }
   		return sys207Count600;
   }

  
	/**
	*  set variable sys207Count600
	*  Corresponding COBOL Variable is 600-SYS207-COUNT
	*  @param value
	**/
   public void setSys207Count600(char[] value) {
      sys207Count600 = checkSys207Count600Constraints(value);
      serializeSys207Count600(sys207Count600);
   } 

     /**
	 * 	Update Sys207Count600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys207Count600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys207Count600,sys207Count600.length);
   	
   }
   
   public void setSys207Count600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys207Count600,sys207Count600.length);
   	
   }
   
     /**
	 * 	Update Sys207Count600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys207Count600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys207Count600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys207Count600 with another Field
	 *	@param value
	 */
   public void setSys207Count600(Field source) {
       replace(source,0,source.length(),beginSys207Count600,SYS_207_COUNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update Sys207Count600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys207Count600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys207Count600,SYS_207_COUNT_600_LEN);
   	
   }
   
     /**
	 * 	Update Sys207Count600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys207Count600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys207Count600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys207RecordCount600FieldLength() {
			return SYS_207_RECORD_COUNT_600_LENGTH;
		}

}
  
