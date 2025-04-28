package com.cloudframe.app.ip809050.dto;

/**
*  The class Sys212RecordCount600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys212RecordCount600 extends Sys212RecordCount600Serialized { 
   


								private char[] sys212Count1600 = Field.fillLowValue(13);
	
	/**
	* Constructor for Sys212RecordCount600
	**/
    public Sys212RecordCount600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             pad(60,"IMPACTED DOLLAR AMT FOR EDIT#1850  - ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 0
             ,60
             );
    }


 

	/**
	 *	Returns the value of sys212Count1600
	 *	@return sys212Count1600
	 */
   public char[] getSys212Count1600() throws CFException{
     if (isSys212Count1600Modified()) { 
        sys212Count1600 = refreshSys212Count1600();
     }
   		return sys212Count1600;
   }

  
	/**
	*  set variable sys212Count1600
	*  Corresponding COBOL Variable is 600-SYS212-COUNT1
	*  @param value
	**/
   public void setSys212Count1600(char[] value) {
      sys212Count1600 = checkSys212Count1600Constraints(value);
      serializeSys212Count1600(sys212Count1600);
   } 

     /**
	 * 	Update Sys212Count1600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys212Count1600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys212Count1600,sys212Count1600.length);
   	
   }
   
   public void setSys212Count1600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys212Count1600,sys212Count1600.length);
   	
   }
   
     /**
	 * 	Update Sys212Count1600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys212Count1600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys212Count1600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys212Count1600 with another Field
	 *	@param value
	 */
   public void setSys212Count1600(Field source) {
       replace(source,0,source.length(),beginSys212Count1600,SYS_212_COUNT_1600_LEN);
   	
   }  
   
     /**
	 * 	Update Sys212Count1600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys212Count1600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys212Count1600,SYS_212_COUNT_1600_LEN);
   	
   }
   
     /**
	 * 	Update Sys212Count1600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys212Count1600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys212Count1600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys212RecordCount600FieldLength() {
			return SYS_212_RECORD_COUNT_600_LENGTH;
		}

}
  
