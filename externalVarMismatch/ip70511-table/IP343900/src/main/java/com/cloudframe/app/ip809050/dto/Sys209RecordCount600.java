package com.cloudframe.app.ip809050.dto;

/**
*  The class Sys209RecordCount600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys209RecordCount600 extends Sys209RecordCount600Serialized {
   


								private char[] sys209Count1600 = Field.fillLowValue(13);
	
	/**
	* Constructor for Sys209RecordCount600
	**/
    public Sys209RecordCount600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             pad(60,"TOTAL IMPACTED DOLLAR AMOUNT       - ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 0
             ,60
             );
    }


 

	/**
	 *	Returns the value of sys209Count1600
	 *	@return sys209Count1600
	 */
   public char[] getSys209Count1600() throws CFException{
     if (isSys209Count1600Modified()) { 
        sys209Count1600 = refreshSys209Count1600();
     }
   		return sys209Count1600;
   }

  
	/**
	*  set variable sys209Count1600
	*  Corresponding COBOL Variable is 600-SYS209-COUNT1
	*  @param value
	**/
   public void setSys209Count1600(char[] value) {
      sys209Count1600 = checkSys209Count1600Constraints(value);
      serializeSys209Count1600(sys209Count1600);
   } 

     /**
	 * 	Update Sys209Count1600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys209Count1600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys209Count1600,sys209Count1600.length);
   	
   }
   
   public void setSys209Count1600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys209Count1600,sys209Count1600.length);
   	
   }
   
     /**
	 * 	Update Sys209Count1600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys209Count1600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys209Count1600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys209Count1600 with another Field
	 *	@param value
	 */
   public void setSys209Count1600(Field source) {
       replace(source,0,source.length(),beginSys209Count1600,SYS_209_COUNT_1600_LEN);
   	
   }  
   
     /**
	 * 	Update Sys209Count1600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys209Count1600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys209Count1600,SYS_209_COUNT_1600_LEN);
   	
   }
   
     /**
	 * 	Update Sys209Count1600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys209Count1600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys209Count1600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys209RecordCount600FieldLength() {
			return SYS_209_RECORD_COUNT_600_LENGTH;
		}

}
  
