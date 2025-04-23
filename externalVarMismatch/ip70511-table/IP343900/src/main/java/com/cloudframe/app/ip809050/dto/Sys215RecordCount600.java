package com.cloudframe.app.ip809050.dto;

/**
*  The class Sys215RecordCount600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys215RecordCount600 extends Sys215RecordCount600Serialized {
   


								private char[] sys215Count1600 = Field.fillLowValue(13);
	
	/**
	* Constructor for Sys215RecordCount600
	**/
    public Sys215RecordCount600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             pad(60,"IMPACTED DOLLAR AMT FOR EDIT#1754  - ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 0
             ,60
             );
    }


 

	/**
	 *	Returns the value of sys215Count1600
	 *	@return sys215Count1600
	 */
   public char[] getSys215Count1600() throws CFException{
     if (isSys215Count1600Modified()) { 
        sys215Count1600 = refreshSys215Count1600();
     }
   		return sys215Count1600;
   }

  
	/**
	*  set variable sys215Count1600
	*  Corresponding COBOL Variable is 600-SYS215-COUNT1
	*  @param value
	**/
   public void setSys215Count1600(char[] value) {
      sys215Count1600 = checkSys215Count1600Constraints(value);
      serializeSys215Count1600(sys215Count1600);
   } 

     /**
	 * 	Update Sys215Count1600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys215Count1600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys215Count1600,sys215Count1600.length);
   	
   }
   
   public void setSys215Count1600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys215Count1600,sys215Count1600.length);
   	
   }
   
     /**
	 * 	Update Sys215Count1600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys215Count1600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys215Count1600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys215Count1600 with another Field
	 *	@param value
	 */
   public void setSys215Count1600(Field source) {
       replace(source,0,source.length(),beginSys215Count1600,SYS_215_COUNT_1600_LEN);
   	
   }  
   
     /**
	 * 	Update Sys215Count1600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys215Count1600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys215Count1600,SYS_215_COUNT_1600_LEN);
   	
   }
   
     /**
	 * 	Update Sys215Count1600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys215Count1600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys215Count1600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys215RecordCount600FieldLength() {
			return SYS_215_RECORD_COUNT_600_LENGTH;
		}

}
  
