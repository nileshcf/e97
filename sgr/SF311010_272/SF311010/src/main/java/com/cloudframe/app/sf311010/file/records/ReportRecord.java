package com.cloudframe.app.sf311010.file.records;

/**
*  The class ReportRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/


import com.cloudframe.app.sf311010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ReportRecord extends ReportRecordSerialized {
   

						private char[] reportRecordString = Field.fillLowValue(145);
	
	/**
	* Constructor for ReportRecord
	**/
    public ReportRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of reportRecordString
	 *	@return reportRecordString
	 */
   public char[] getReportRecordString() throws CFException{
     if (isReportRecordStringModified()) { 
        reportRecordString = refreshReportRecordString();
     }
   		return reportRecordString;
   }

  
	/**
	*  set variable reportRecordString
	*  Corresponding COBOL Variable is REPORT-RECORD-STRING
	*  @param value
	**/
   public void setReportRecordString(char[] value) {
      reportRecordString = checkReportRecordStringConstraints(value);
      serializeReportRecordString(reportRecordString);
   } 

     /**
	 * 	Update ReportRecordString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReportRecordString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginReportRecordString,reportRecordString.length);
   	
   }
   
   public void setReportRecordString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginReportRecordString,reportRecordString.length);
   	
   }
   
     /**
	 * 	Update ReportRecordString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReportRecordString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReportRecordString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ReportRecordString with another Field
	 *	@param value
	 */
   public void setReportRecordString(Field source) {
       replace(source,0,source.length(),beginReportRecordString,REPORT_RECORD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update ReportRecordString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReportRecordString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginReportRecordString,REPORT_RECORD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update ReportRecordString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReportRecordString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReportRecordString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getReportRecordFieldLength() {
			return REPORT_RECORD_LENGTH;
		}

}
  
