package com.cloudframe.app.ip809050.dto;

/**
*  The class Sys214RecordCount600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys214RecordCount600 extends Sys214RecordCount600Serialized {
   


								private char[] sys214Count1600 = Field.fillLowValue(13);
	
	/**
	* Constructor for Sys214RecordCount600
	**/
    public Sys214RecordCount600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             pad(60,"IMPACTED DOLLAR AMT FOR EDIT#1852  - ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 0
             ,60
             );
    }


 

	/**
	 *	Returns the value of sys214Count1600
	 *	@return sys214Count1600
	 */
   public char[] getSys214Count1600() throws CFException{
     if (isSys214Count1600Modified()) { 
        sys214Count1600 = refreshSys214Count1600();
     }
   		return sys214Count1600;
   }

  
	/**
	*  set variable sys214Count1600
	*  Corresponding COBOL Variable is 600-SYS214-COUNT1
	*  @param value
	**/
   public void setSys214Count1600(char[] value) {
      sys214Count1600 = checkSys214Count1600Constraints(value);
      serializeSys214Count1600(sys214Count1600);
   } 

     /**
	 * 	Update Sys214Count1600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys214Count1600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys214Count1600,sys214Count1600.length);
   	
   }
   
   public void setSys214Count1600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys214Count1600,sys214Count1600.length);
   	
   }
   
     /**
	 * 	Update Sys214Count1600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys214Count1600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys214Count1600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys214Count1600 with another Field
	 *	@param value
	 */
   public void setSys214Count1600(Field source) {
       replace(source,0,source.length(),beginSys214Count1600,SYS_214_COUNT_1600_LEN);
   	
   }  
   
     /**
	 * 	Update Sys214Count1600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys214Count1600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys214Count1600,SYS_214_COUNT_1600_LEN);
   	
   }
   
     /**
	 * 	Update Sys214Count1600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys214Count1600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys214Count1600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys214RecordCount600FieldLength() {
			return SYS_214_RECORD_COUNT_600_LENGTH;
		}

}
  
