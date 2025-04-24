package com.cloudframe.app.mcsort02.file.records;

/**
*  The class OutRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.mcsort02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class OutRecord extends OutRecordSerialized { 
   

						private char[] outRecordString = Field.fillLowValue(32752);
	
	/**
	* Constructor for OutRecord
	**/
    public OutRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of outRecordString
	 *	@return outRecordString
	 */
   public char[] getOutRecordString() throws CFException{
     if (isOutRecordStringModified()) { 
        outRecordString = refreshOutRecordString();
     }
   		return outRecordString;
   }

  
	/**
	*  set variable outRecordString
	*  Corresponding COBOL Variable is OUT-RECORD-STRING
	*  @param value
	**/
   public void setOutRecordString(char[] value) {
      outRecordString = checkOutRecordStringConstraints(value);
      serializeOutRecordString(outRecordString);
   } 

     /**
	 * 	Update OutRecordString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOutRecordString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOutRecordString,outRecordString.length);
   	
   }
   
   public void setOutRecordString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOutRecordString,outRecordString.length);
   	
   }
   
     /**
	 * 	Update OutRecordString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOutRecordString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOutRecordString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OutRecordString with another Field
	 *	@param value
	 */
   public void setOutRecordString(Field source) {
       replace(source,0,source.length(),beginOutRecordString,OUT_RECORD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update OutRecordString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOutRecordString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOutRecordString,OUT_RECORD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update OutRecordString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOutRecordString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOutRecordString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getOutRecordFieldLength() {
			return OUT_RECORD_LENGTH;
		}

}
  
