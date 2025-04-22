package com.cloudframe.app.sf320010.dto;

/**
*  The class RpReportPrintLine is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpReportPrintLine extends RpReportPrintLineSerialized {
   

						private char[] rpReportCode = Field.fillLowValue(1);

						private char[] rpPrintLine = Field.fillLowValue(133);

	
	/**
	* Constructor for RpReportPrintLine
	**/
    public RpReportPrintLine() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(11)
             , getStartOffset() + 134
             ,11
             );
    }


 

	/**
	 *	Returns the value of rpReportCode
	 *	@return rpReportCode
	 */
   public char[] getRpReportCode() throws CFException{
     if (isRpReportCodeModified()) { 
        rpReportCode = refreshRpReportCode();
     }
   		return rpReportCode;
   }

  
	/**
	*  set variable rpReportCode
	*  Corresponding COBOL Variable is RP-REPORT-CODE
	*  @param value
	**/
   public void setRpReportCode(char[] value) {
      rpReportCode = checkRpReportCodeConstraints(value);
      serializeRpReportCode(rpReportCode);
   } 

     /**
	 * 	Update RpReportCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpReportCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpReportCode,rpReportCode.length);
   	
   }
   
   public void setRpReportCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpReportCode,rpReportCode.length);
   	
   }
   
     /**
	 * 	Update RpReportCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpReportCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpReportCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpReportCode with another Field
	 *	@param value
	 */
   public void setRpReportCode(Field source) {
       replace(source,0,source.length(),beginRpReportCode,RP_REPORT_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update RpReportCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpReportCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpReportCode,RP_REPORT_CODE_LEN);
   	
   }
   
     /**
	 * 	Update RpReportCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpReportCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpReportCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpPrintLine
	 *	@return rpPrintLine
	 */
   public char[] getRpPrintLine() throws CFException{
     if (isRpPrintLineModified()) { 
        rpPrintLine = refreshRpPrintLine();
     }
   		return rpPrintLine;
   }

  
	/**
	*  set variable rpPrintLine
	*  Corresponding COBOL Variable is RP-PRINT-LINE
	*  @param value
	**/
   public void setRpPrintLine(char[] value) {
      rpPrintLine = checkRpPrintLineConstraints(value);
      serializeRpPrintLine(rpPrintLine);
   } 

     /**
	 * 	Update RpPrintLine 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpPrintLine(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpPrintLine,rpPrintLine.length);
   	
   }
   
   public void setRpPrintLine(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpPrintLine,rpPrintLine.length);
   	
   }
   
     /**
	 * 	Update RpPrintLine 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpPrintLine(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPrintLine+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpPrintLine with another Field
	 *	@param value
	 */
   public void setRpPrintLine(Field source) {
       replace(source,0,source.length(),beginRpPrintLine,RP_PRINT_LINE_LEN);
   	
   }  
   
     /**
	 * 	Update RpPrintLine 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpPrintLine(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpPrintLine,RP_PRINT_LINE_LEN);
   	
   }
   
     /**
	 * 	Update RpPrintLine 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpPrintLine(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpPrintLine+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpReportPrintLineFieldLength() {
			return RP_REPORT_PRINT_LINE_LENGTH;
		}

}
  
