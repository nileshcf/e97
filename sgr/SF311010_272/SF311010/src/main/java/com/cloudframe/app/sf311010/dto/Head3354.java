package com.cloudframe.app.sf311010.dto;

/**
*  The class Head3354 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Head3354 extends Head3354Serialized {
   

						private char[] head3ReportId354 = new char[1];

						private char[] head3CarCon354 = new char[1];




								private char[] head3Page354 = Field.fillLowValue(3);

	
	/**
	* Constructor for Head3354
	**/
    public Head3354() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHead3ReportId354(fillSpace(1));
								setHead3CarCon354(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(11)
             , getStartOffset() + 2
             ,11
             );
       replaceValue( // serialize and save the value
             pad(99," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 13
             ,99
             );
       replaceValue( // serialize and save the value
             ("PAGE: ").toCharArray()
             , getStartOffset() + 112
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(9)
             , getStartOffset() + 121
             ,9
             );
    }


 

	/**
	 *	Returns the value of head3ReportId354
	 *	@return head3ReportId354
	 */
   public char[] getHead3ReportId354() throws CFException{
     if (isHead3ReportId354Modified()) { 
        head3ReportId354 = refreshHead3ReportId354();
     }
   		return head3ReportId354;
   }

  
	/**
	*  set variable head3ReportId354
	*  Corresponding COBOL Variable is 354-HEAD3-REPORT-ID
	*  @param value
	**/
   public void setHead3ReportId354(char[] value) {
      head3ReportId354 = checkHead3ReportId354Constraints(value);
      serializeHead3ReportId354(head3ReportId354);
   } 

     /**
	 * 	Update Head3ReportId354 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHead3ReportId354(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHead3ReportId354,head3ReportId354.length);
   	
   }
   
   public void setHead3ReportId354(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHead3ReportId354,head3ReportId354.length);
   	
   }
   
     /**
	 * 	Update Head3ReportId354 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHead3ReportId354(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead3ReportId354+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Head3ReportId354 with another Field
	 *	@param value
	 */
   public void setHead3ReportId354(Field source) {
       replace(source,0,source.length(),beginHead3ReportId354,HEAD_3_REPORT_ID_354_LEN);
   	
   }  
   
     /**
	 * 	Update Head3ReportId354 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHead3ReportId354(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHead3ReportId354,HEAD_3_REPORT_ID_354_LEN);
   	
   }
   
     /**
	 * 	Update Head3ReportId354 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHead3ReportId354(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead3ReportId354+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of head3CarCon354
	 *	@return head3CarCon354
	 */
   public char[] getHead3CarCon354() throws CFException{
     if (isHead3CarCon354Modified()) { 
        head3CarCon354 = refreshHead3CarCon354();
     }
   		return head3CarCon354;
   }

  
	/**
	*  set variable head3CarCon354
	*  Corresponding COBOL Variable is 354-HEAD3-CAR-CON
	*  @param value
	**/
   public void setHead3CarCon354(char[] value) {
      head3CarCon354 = checkHead3CarCon354Constraints(value);
      serializeHead3CarCon354(head3CarCon354);
   } 

     /**
	 * 	Update Head3CarCon354 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHead3CarCon354(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHead3CarCon354,head3CarCon354.length);
   	
   }
   
   public void setHead3CarCon354(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHead3CarCon354,head3CarCon354.length);
   	
   }
   
     /**
	 * 	Update Head3CarCon354 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHead3CarCon354(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead3CarCon354+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Head3CarCon354 with another Field
	 *	@param value
	 */
   public void setHead3CarCon354(Field source) {
       replace(source,0,source.length(),beginHead3CarCon354,HEAD_3_CAR_CON_354_LEN);
   	
   }  
   
     /**
	 * 	Update Head3CarCon354 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHead3CarCon354(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHead3CarCon354,HEAD_3_CAR_CON_354_LEN);
   	
   }
   
     /**
	 * 	Update Head3CarCon354 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHead3CarCon354(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead3CarCon354+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of head3Page354
	 *	@return head3Page354
	 */
   public char[] getHead3Page354() throws CFException{
     if (isHead3Page354Modified()) { 
        head3Page354 = refreshHead3Page354();
     }
   		return head3Page354;
   }

  
	/**
	*  set variable head3Page354
	*  Corresponding COBOL Variable is 354-HEAD3-PAGE
	*  @param value
	**/
   public void setHead3Page354(char[] value) {
      head3Page354 = checkHead3Page354Constraints(value);
      serializeHead3Page354(head3Page354);
   } 

     /**
	 * 	Update Head3Page354 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHead3Page354(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHead3Page354,head3Page354.length);
   	
   }
   
   public void setHead3Page354(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHead3Page354,head3Page354.length);
   	
   }
   
     /**
	 * 	Update Head3Page354 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHead3Page354(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead3Page354+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Head3Page354 with another Field
	 *	@param value
	 */
   public void setHead3Page354(Field source) {
       replace(source,0,source.length(),beginHead3Page354,HEAD_3_PAGE_354_LEN);
   	
   }  
   
     /**
	 * 	Update Head3Page354 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHead3Page354(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHead3Page354,HEAD_3_PAGE_354_LEN);
   	
   }
   
     /**
	 * 	Update Head3Page354 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHead3Page354(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead3Page354+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHead3354FieldLength() {
			return HEAD_3354_LENGTH;
		}

}
  
