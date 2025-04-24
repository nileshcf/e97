package com.cloudframe.app.ms00d363.file.records;

/**
*  The class ExcelRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ExcelRecord extends ExcelRecordSerialized { 
   

						private char[] excelRecordString = Field.fillLowValue(500);
	
	/**
	* Constructor for ExcelRecord
	**/
    public ExcelRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of excelRecordString
	 *	@return excelRecordString
	 */
   public char[] getExcelRecordString() throws CFException{
     if (isExcelRecordStringModified()) { 
        excelRecordString = refreshExcelRecordString();
     }
   		return excelRecordString;
   }

  
	/**
	*  set variable excelRecordString
	*  Corresponding COBOL Variable is EXCEL-RECORD-STRING
	*  @param value
	**/
   public void setExcelRecordString(char[] value) {
      excelRecordString = checkExcelRecordStringConstraints(value);
      serializeExcelRecordString(excelRecordString);
   } 

     /**
	 * 	Update ExcelRecordString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExcelRecordString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExcelRecordString,excelRecordString.length);
   	
   }
   
   public void setExcelRecordString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExcelRecordString,excelRecordString.length);
   	
   }
   
     /**
	 * 	Update ExcelRecordString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExcelRecordString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExcelRecordString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExcelRecordString with another Field
	 *	@param value
	 */
   public void setExcelRecordString(Field source) {
       replace(source,0,source.length(),beginExcelRecordString,EXCEL_RECORD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update ExcelRecordString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExcelRecordString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExcelRecordString,EXCEL_RECORD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update ExcelRecordString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExcelRecordString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExcelRecordString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getExcelRecordFieldLength() {
			return EXCEL_RECORD_LENGTH;
		}

}
  
