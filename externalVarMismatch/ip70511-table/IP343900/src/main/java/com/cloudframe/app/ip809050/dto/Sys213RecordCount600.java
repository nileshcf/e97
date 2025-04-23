package com.cloudframe.app.ip809050.dto;

/**
*  The class Sys213RecordCount600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys213RecordCount600 extends Sys213RecordCount600Serialized {
   


								private char[] sys213Count1600 = Field.fillLowValue(13);
	
	/**
	* Constructor for Sys213RecordCount600
	**/
    public Sys213RecordCount600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             pad(60,"IMPACTED DOLLAR AMT FOR EDIT#1851  - ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 0
             ,60
             );
    }


 

	/**
	 *	Returns the value of sys213Count1600
	 *	@return sys213Count1600
	 */
   public char[] getSys213Count1600() throws CFException{
     if (isSys213Count1600Modified()) { 
        sys213Count1600 = refreshSys213Count1600();
     }
   		return sys213Count1600;
   }

  
	/**
	*  set variable sys213Count1600
	*  Corresponding COBOL Variable is 600-SYS213-COUNT1
	*  @param value
	**/
   public void setSys213Count1600(char[] value) {
      sys213Count1600 = checkSys213Count1600Constraints(value);
      serializeSys213Count1600(sys213Count1600);
   } 

     /**
	 * 	Update Sys213Count1600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys213Count1600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys213Count1600,sys213Count1600.length);
   	
   }
   
   public void setSys213Count1600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys213Count1600,sys213Count1600.length);
   	
   }
   
     /**
	 * 	Update Sys213Count1600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys213Count1600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys213Count1600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys213Count1600 with another Field
	 *	@param value
	 */
   public void setSys213Count1600(Field source) {
       replace(source,0,source.length(),beginSys213Count1600,SYS_213_COUNT_1600_LEN);
   	
   }  
   
     /**
	 * 	Update Sys213Count1600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys213Count1600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys213Count1600,SYS_213_COUNT_1600_LEN);
   	
   }
   
     /**
	 * 	Update Sys213Count1600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys213Count1600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys213Count1600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys213RecordCount600FieldLength() {
			return SYS_213_RECORD_COUNT_600_LENGTH;
		}

}
  
