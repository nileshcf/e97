package com.cloudframe.app.ip809050.dto;

/**
*  The class Sys206RecordCount600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys206RecordCount600 extends Sys206RecordCount600Serialized { 
   


								private char[] sys206Count600 = Field.fillLowValue(10);
	
	/**
	* Constructor for Sys206RecordCount600
	**/
    public Sys206RecordCount600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             pad(60,"IP809050-SYS206: EDIT #1754                 ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 0
             ,60
             );
    }


 

	/**
	 *	Returns the value of sys206Count600
	 *	@return sys206Count600
	 */
   public char[] getSys206Count600() throws CFException{
     if (isSys206Count600Modified()) { 
        sys206Count600 = refreshSys206Count600();
     }
   		return sys206Count600;
   }

  
	/**
	*  set variable sys206Count600
	*  Corresponding COBOL Variable is 600-SYS206-COUNT
	*  @param value
	**/
   public void setSys206Count600(char[] value) {
      sys206Count600 = checkSys206Count600Constraints(value);
      serializeSys206Count600(sys206Count600);
   } 

     /**
	 * 	Update Sys206Count600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys206Count600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys206Count600,sys206Count600.length);
   	
   }
   
   public void setSys206Count600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys206Count600,sys206Count600.length);
   	
   }
   
     /**
	 * 	Update Sys206Count600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys206Count600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys206Count600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys206Count600 with another Field
	 *	@param value
	 */
   public void setSys206Count600(Field source) {
       replace(source,0,source.length(),beginSys206Count600,SYS_206_COUNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update Sys206Count600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys206Count600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys206Count600,SYS_206_COUNT_600_LEN);
   	
   }
   
     /**
	 * 	Update Sys206Count600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys206Count600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys206Count600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys206RecordCount600FieldLength() {
			return SYS_206_RECORD_COUNT_600_LENGTH;
		}

}
  
