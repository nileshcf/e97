package com.cloudframe.app.mcsort05.file.records;

/**
*  The class Sys001GroupStatRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.mcsort05.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys001GroupStatRec extends Sys001GroupStatRecSerialized {
   

						private char[] sys001GroupStatRecString = Field.fillLowValue(2000);
	
	/**
	* Constructor for Sys001GroupStatRec
	**/
    public Sys001GroupStatRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys001GroupStatRecString
	 *	@return sys001GroupStatRecString
	 */
   public char[] getSys001GroupStatRecString() throws CFException{
     if (isSys001GroupStatRecStringModified()) { 
        sys001GroupStatRecString = refreshSys001GroupStatRecString();
     }
   		return sys001GroupStatRecString;
   }

  
	/**
	*  set variable sys001GroupStatRecString
	*  Corresponding COBOL Variable is SYS001-GROUP-STAT-REC-STRING
	*  @param value
	**/
   public void setSys001GroupStatRecString(char[] value) {
      sys001GroupStatRecString = checkSys001GroupStatRecStringConstraints(value);
      serializeSys001GroupStatRecString(sys001GroupStatRecString);
   } 

     /**
	 * 	Update Sys001GroupStatRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001GroupStatRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001GroupStatRecString,sys001GroupStatRecString.length);
   	
   }
   
   public void setSys001GroupStatRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001GroupStatRecString,sys001GroupStatRecString.length);
   	
   }
   
     /**
	 * 	Update Sys001GroupStatRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001GroupStatRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001GroupStatRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001GroupStatRecString with another Field
	 *	@param value
	 */
   public void setSys001GroupStatRecString(Field source) {
       replace(source,0,source.length(),beginSys001GroupStatRecString,SYS_001_GROUP_STAT_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001GroupStatRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001GroupStatRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001GroupStatRecString,SYS_001_GROUP_STAT_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys001GroupStatRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001GroupStatRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001GroupStatRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys001GroupStatRecFieldLength() {
			return SYS_001_GROUP_STAT_REC_LENGTH;
		}

}
  
