package com.cloudframe.app.ip809050.dto;

/**
*  The class Sys211RecordCount600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys211RecordCount600 extends Sys211RecordCount600Serialized { 
   


								private char[] sys211Count1600 = Field.fillLowValue(13);
	
	/**
	* Constructor for Sys211RecordCount600
	**/
    public Sys211RecordCount600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             pad(60,"IMPACTED DOLLAR AMT FOR EDIT#1849  - ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 0
             ,60
             );
    }


 

	/**
	 *	Returns the value of sys211Count1600
	 *	@return sys211Count1600
	 */
   public char[] getSys211Count1600() throws CFException{
     if (isSys211Count1600Modified()) { 
        sys211Count1600 = refreshSys211Count1600();
     }
   		return sys211Count1600;
   }

  
	/**
	*  set variable sys211Count1600
	*  Corresponding COBOL Variable is 600-SYS211-COUNT1
	*  @param value
	**/
   public void setSys211Count1600(char[] value) {
      sys211Count1600 = checkSys211Count1600Constraints(value);
      serializeSys211Count1600(sys211Count1600);
   } 

     /**
	 * 	Update Sys211Count1600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys211Count1600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys211Count1600,sys211Count1600.length);
   	
   }
   
   public void setSys211Count1600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys211Count1600,sys211Count1600.length);
   	
   }
   
     /**
	 * 	Update Sys211Count1600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys211Count1600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys211Count1600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys211Count1600 with another Field
	 *	@param value
	 */
   public void setSys211Count1600(Field source) {
       replace(source,0,source.length(),beginSys211Count1600,SYS_211_COUNT_1600_LEN);
   	
   }  
   
     /**
	 * 	Update Sys211Count1600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys211Count1600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys211Count1600,SYS_211_COUNT_1600_LEN);
   	
   }
   
     /**
	 * 	Update Sys211Count1600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys211Count1600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys211Count1600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys211RecordCount600FieldLength() {
			return SYS_211_RECORD_COUNT_600_LENGTH;
		}

}
  
