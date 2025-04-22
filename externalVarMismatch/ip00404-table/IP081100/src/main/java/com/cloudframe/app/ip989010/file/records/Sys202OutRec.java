package com.cloudframe.app.ip989010.file.records;

/**
*  The class Sys202OutRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys202OutRec extends Sys202OutRecSerialized {
   

						private char[] sys202OutRecString = Field.fillLowValue(41);
	
	/**
	* Constructor for Sys202OutRec
	**/
    public Sys202OutRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys202OutRecString
	 *	@return sys202OutRecString
	 */
   public char[] getSys202OutRecString() throws CFException{
     if (isSys202OutRecStringModified()) { 
        sys202OutRecString = refreshSys202OutRecString();
     }
   		return sys202OutRecString;
   }

  
	/**
	*  set variable sys202OutRecString
	*  Corresponding COBOL Variable is SYS202-OUT-REC-STRING
	*  @param value
	**/
   public void setSys202OutRecString(char[] value) {
      sys202OutRecString = checkSys202OutRecStringConstraints(value);
      serializeSys202OutRecString(sys202OutRecString);
   } 

     /**
	 * 	Update Sys202OutRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys202OutRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys202OutRecString,sys202OutRecString.length);
   	
   }
   
   public void setSys202OutRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys202OutRecString,sys202OutRecString.length);
   	
   }
   
     /**
	 * 	Update Sys202OutRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys202OutRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys202OutRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys202OutRecString with another Field
	 *	@param value
	 */
   public void setSys202OutRecString(Field source) {
       replace(source,0,source.length(),beginSys202OutRecString,SYS_202_OUT_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys202OutRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys202OutRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys202OutRecString,SYS_202_OUT_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys202OutRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys202OutRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys202OutRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys202OutRecFieldLength() {
			return SYS_202_OUT_REC_LENGTH;
		}

}
  
