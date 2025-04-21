package com.cloudframe.app.sf320010.file.records;

/**
*  The class FdReportFileOutRcd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FdReportFileOutRcd extends FdReportFileOutRcdSerialized {
   

						private char[] fdReportFileOutRcdString = Field.fillLowValue(145);
	
	/**
	* Constructor for FdReportFileOutRcd
	**/
    public FdReportFileOutRcd() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fdReportFileOutRcdString
	 *	@return fdReportFileOutRcdString
	 */
   public char[] getFdReportFileOutRcdString() throws CFException{
     if (isFdReportFileOutRcdStringModified()) { 
        fdReportFileOutRcdString = refreshFdReportFileOutRcdString();
     }
   		return fdReportFileOutRcdString;
   }

  
	/**
	*  set variable fdReportFileOutRcdString
	*  Corresponding COBOL Variable is FD-REPORT-FILE-OUT-RCD-STRING
	*  @param value
	**/
   public void setFdReportFileOutRcdString(char[] value) {
      fdReportFileOutRcdString = checkFdReportFileOutRcdStringConstraints(value);
      serializeFdReportFileOutRcdString(fdReportFileOutRcdString);
   } 

     /**
	 * 	Update FdReportFileOutRcdString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFdReportFileOutRcdString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFdReportFileOutRcdString,fdReportFileOutRcdString.length);
   	
   }
   
   public void setFdReportFileOutRcdString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFdReportFileOutRcdString,fdReportFileOutRcdString.length);
   	
   }
   
     /**
	 * 	Update FdReportFileOutRcdString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFdReportFileOutRcdString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFdReportFileOutRcdString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FdReportFileOutRcdString with another Field
	 *	@param value
	 */
   public void setFdReportFileOutRcdString(Field source) {
       replace(source,0,source.length(),beginFdReportFileOutRcdString,FD_REPORT_FILE_OUT_RCD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update FdReportFileOutRcdString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFdReportFileOutRcdString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFdReportFileOutRcdString,FD_REPORT_FILE_OUT_RCD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update FdReportFileOutRcdString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFdReportFileOutRcdString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFdReportFileOutRcdString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFdReportFileOutRcdFieldLength() {
			return FD_REPORT_FILE_OUT_RCD_LENGTH;
		}

}
  
