package com.cloudframe.app.sf311010.dto;

/**
*  The class Head6360 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Head6360 extends Head6360Serialized {
   

						private char[] head6ReportId360 = new char[1];

						private char[] head6CarCon360 = new char[1];







	
	/**
	* Constructor for Head6360
	**/
    public Head6360() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHead6ReportId360(fillSpace(1));
								setHead6CarCon360(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 2
             ,8
             );
       replaceValue( // serialize and save the value
             String.join("", java.util.Collections.nCopies(18, "-")).toCharArray()
             , getStartOffset() + 10
             ,18
             );
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 28
             ,7
             );
       replaceValue( // serialize and save the value
             String.join("", java.util.Collections.nCopies(5, "-")).toCharArray()
             , getStartOffset() + 35
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 40
             ,8
             );
       replaceValue( // serialize and save the value
             String.join("", java.util.Collections.nCopies(10, "-")).toCharArray()
             , getStartOffset() + 48
             ,10
             );
       replaceValue( // serialize and save the value
             pad(72," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 58
             ,72
             );
    }


 

	/**
	 *	Returns the value of head6ReportId360
	 *	@return head6ReportId360
	 */
   public char[] getHead6ReportId360() throws CFException{
     if (isHead6ReportId360Modified()) { 
        head6ReportId360 = refreshHead6ReportId360();
     }
   		return head6ReportId360;
   }

  
	/**
	*  set variable head6ReportId360
	*  Corresponding COBOL Variable is 360-HEAD6-REPORT-ID
	*  @param value
	**/
   public void setHead6ReportId360(char[] value) {
      head6ReportId360 = checkHead6ReportId360Constraints(value);
      serializeHead6ReportId360(head6ReportId360);
   } 

     /**
	 * 	Update Head6ReportId360 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHead6ReportId360(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHead6ReportId360,head6ReportId360.length);
   	
   }
   
   public void setHead6ReportId360(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHead6ReportId360,head6ReportId360.length);
   	
   }
   
     /**
	 * 	Update Head6ReportId360 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHead6ReportId360(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead6ReportId360+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Head6ReportId360 with another Field
	 *	@param value
	 */
   public void setHead6ReportId360(Field source) {
       replace(source,0,source.length(),beginHead6ReportId360,HEAD_6_REPORT_ID_360_LEN);
   	
   }  
   
     /**
	 * 	Update Head6ReportId360 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHead6ReportId360(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHead6ReportId360,HEAD_6_REPORT_ID_360_LEN);
   	
   }
   
     /**
	 * 	Update Head6ReportId360 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHead6ReportId360(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead6ReportId360+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of head6CarCon360
	 *	@return head6CarCon360
	 */
   public char[] getHead6CarCon360() throws CFException{
     if (isHead6CarCon360Modified()) { 
        head6CarCon360 = refreshHead6CarCon360();
     }
   		return head6CarCon360;
   }

  
	/**
	*  set variable head6CarCon360
	*  Corresponding COBOL Variable is 360-HEAD6-CAR-CON
	*  @param value
	**/
   public void setHead6CarCon360(char[] value) {
      head6CarCon360 = checkHead6CarCon360Constraints(value);
      serializeHead6CarCon360(head6CarCon360);
   } 

     /**
	 * 	Update Head6CarCon360 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHead6CarCon360(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHead6CarCon360,head6CarCon360.length);
   	
   }
   
   public void setHead6CarCon360(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHead6CarCon360,head6CarCon360.length);
   	
   }
   
     /**
	 * 	Update Head6CarCon360 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHead6CarCon360(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead6CarCon360+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Head6CarCon360 with another Field
	 *	@param value
	 */
   public void setHead6CarCon360(Field source) {
       replace(source,0,source.length(),beginHead6CarCon360,HEAD_6_CAR_CON_360_LEN);
   	
   }  
   
     /**
	 * 	Update Head6CarCon360 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHead6CarCon360(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHead6CarCon360,HEAD_6_CAR_CON_360_LEN);
   	
   }
   
     /**
	 * 	Update Head6CarCon360 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHead6CarCon360(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead6CarCon360+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHead6360FieldLength() {
			return HEAD_6360_LENGTH;
		}

}
  
