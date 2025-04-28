package com.cloudframe.app.iovb32k.file.records;

/**
*  The class InRecMax is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/


import com.cloudframe.app.iovb32k.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InRecMax extends InRecMaxSerialized {
   

						private char[] inRecMaxString = Field.fillLowValue(32752);
	
	/**
	* Constructor for InRecMax
	**/
    public InRecMax() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of inRecMaxString
	 *	@return inRecMaxString
	 */
   public char[] getInRecMaxString() throws CFException{
     if (isInRecMaxStringModified()) { 
        inRecMaxString = refreshInRecMaxString();
     }
   		return inRecMaxString;
   }

  
	/**
	*  set variable inRecMaxString
	*  Corresponding COBOL Variable is IN-REC-MAX-STRING
	*  @param value
	**/
   public void setInRecMaxString(char[] value) {
      inRecMaxString = checkInRecMaxStringConstraints(value);
      serializeInRecMaxString(inRecMaxString);
   } 

     /**
	 * 	Update InRecMaxString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInRecMaxString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInRecMaxString,inRecMaxString.length);
   	
   }
   
   public void setInRecMaxString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInRecMaxString,inRecMaxString.length);
   	
   }
   
     /**
	 * 	Update InRecMaxString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInRecMaxString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInRecMaxString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InRecMaxString with another Field
	 *	@param value
	 */
   public void setInRecMaxString(Field source) {
       replace(source,0,source.length(),beginInRecMaxString,IN_REC_MAX_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update InRecMaxString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInRecMaxString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInRecMaxString,IN_REC_MAX_STRING_LEN);
   	
   }
   
     /**
	 * 	Update InRecMaxString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInRecMaxString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInRecMaxString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getInRecMaxFieldLength() {
			return IN_REC_MAX_LENGTH;
		}

}
  
