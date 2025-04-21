package com.cloudframe.app.ip809050.dto;

/**
*  The class Sys001RecordCount600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys001RecordCount600 extends Sys001RecordCount600Serialized {
   


								private char[] sys001Count600 = Field.fillLowValue(10);
	
	/**
	* Constructor for Sys001RecordCount600
	**/
    public Sys001RecordCount600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             "IP809050-SYS001: NUMBER OF OUTBOUND RECORDS READ           -".toCharArray()
             , getStartOffset() + 0
             ,60
             );
    }


 

	/**
	 *	Returns the value of sys001Count600
	 *	@return sys001Count600
	 */
   public char[] getSys001Count600() throws CFException{
     if (isSys001Count600Modified()) { 
        sys001Count600 = refreshSys001Count600();
     }
   		return sys001Count600;
   }

  
	/**
	*  set variable sys001Count600
	*  Corresponding COBOL Variable is 600-SYS001-COUNT
	*  @param value
	**/
   public void setSys001Count600(char[] value) {
      sys001Count600 = checkSys001Count600Constraints(value);
      serializeSys001Count600(sys001Count600);
   } 

     /**
	 * 	Update Sys001Count600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001Count600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001Count600,sys001Count600.length);
   	
   }
   
   public void setSys001Count600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001Count600,sys001Count600.length);
   	
   }
   
     /**
	 * 	Update Sys001Count600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001Count600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001Count600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001Count600 with another Field
	 *	@param value
	 */
   public void setSys001Count600(Field source) {
       replace(source,0,source.length(),beginSys001Count600,SYS_001_COUNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001Count600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001Count600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001Count600,SYS_001_COUNT_600_LEN);
   	
   }
   
     /**
	 * 	Update Sys001Count600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001Count600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001Count600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys001RecordCount600FieldLength() {
			return SYS_001_RECORD_COUNT_600_LENGTH;
		}

}
  
