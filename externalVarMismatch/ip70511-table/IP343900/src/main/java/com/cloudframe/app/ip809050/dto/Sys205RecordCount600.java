package com.cloudframe.app.ip809050.dto;

/**
*  The class Sys205RecordCount600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys205RecordCount600 extends Sys205RecordCount600Serialized {
   


								private char[] sys205Count600 = Field.fillLowValue(10);
	
	/**
	* Constructor for Sys205RecordCount600
	**/
    public Sys205RecordCount600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             pad(60,"IP809050-SYS205: EDIT #1852                 ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 0
             ,60
             );
    }


 

	/**
	 *	Returns the value of sys205Count600
	 *	@return sys205Count600
	 */
   public char[] getSys205Count600() throws CFException{
     if (isSys205Count600Modified()) { 
        sys205Count600 = refreshSys205Count600();
     }
   		return sys205Count600;
   }

  
	/**
	*  set variable sys205Count600
	*  Corresponding COBOL Variable is 600-SYS205-COUNT
	*  @param value
	**/
   public void setSys205Count600(char[] value) {
      sys205Count600 = checkSys205Count600Constraints(value);
      serializeSys205Count600(sys205Count600);
   } 

     /**
	 * 	Update Sys205Count600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys205Count600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys205Count600,sys205Count600.length);
   	
   }
   
   public void setSys205Count600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys205Count600,sys205Count600.length);
   	
   }
   
     /**
	 * 	Update Sys205Count600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys205Count600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys205Count600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys205Count600 with another Field
	 *	@param value
	 */
   public void setSys205Count600(Field source) {
       replace(source,0,source.length(),beginSys205Count600,SYS_205_COUNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update Sys205Count600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys205Count600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys205Count600,SYS_205_COUNT_600_LEN);
   	
   }
   
     /**
	 * 	Update Sys205Count600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys205Count600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys205Count600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys205RecordCount600FieldLength() {
			return SYS_205_RECORD_COUNT_600_LENGTH;
		}

}
  
