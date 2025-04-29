package com.cloudframe.app.cfsort09.file.records;

/**
*  The class DisplayRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/


import com.cloudframe.app.cfsort09.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DisplayRecord extends DisplayRecordSerialized {
   

						private char[] displayStr = Field.fillLowValue(133);
	
	/**
	* Constructor for DisplayRecord
	**/
    public DisplayRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of displayStr
	 *	@return displayStr
	 */
   public char[] getDisplayStr() throws CFException{
     if (isDisplayStrModified()) { 
        displayStr = refreshDisplayStr();
     }
   		return displayStr;
   }

  
	/**
	*  set variable displayStr
	*  Corresponding COBOL Variable is DISPLAY-STR
	*  @param value
	**/
   public void setDisplayStr(char[] value) {
      displayStr = checkDisplayStrConstraints(value);
      serializeDisplayStr(displayStr);
   } 

     /**
	 * 	Update DisplayStr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDisplayStr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDisplayStr,displayStr.length);
   	
   }
   
   public void setDisplayStr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDisplayStr,displayStr.length);
   	
   }
   
     /**
	 * 	Update DisplayStr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDisplayStr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDisplayStr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DisplayStr with another Field
	 *	@param value
	 */
   public void setDisplayStr(Field source) {
       replace(source,0,source.length(),beginDisplayStr,DISPLAY_STR_LEN);
   	
   }  
   
     /**
	 * 	Update DisplayStr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDisplayStr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDisplayStr,DISPLAY_STR_LEN);
   	
   }
   
     /**
	 * 	Update DisplayStr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDisplayStr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDisplayStr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDisplayRecordFieldLength() {
			return DISPLAY_RECORD_LENGTH;
		}

}
  
