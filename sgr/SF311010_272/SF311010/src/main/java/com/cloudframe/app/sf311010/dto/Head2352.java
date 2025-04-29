package com.cloudframe.app.sf311010.dto;

/**
*  The class Head2352 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Head2352 extends Head2352Serialized {
   

						private char[] head2ReportId352 = new char[1];

						private char[] head2CarCon352 = new char[1];




						private char[] head2Time352 = new char[8];
	
	/**
	* Constructor for Head2352
	**/
    public Head2352() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHead2ReportId352(fillSpace(1));
								setHead2CarCon352(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(47)
             , getStartOffset() + 2
             ,47
             );
       replaceValue( // serialize and save the value
             pad(63,"BANKNET TRANSACTION LOG CONTROL TOTALS".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 49
             ,63
             );
       replaceValue( // serialize and save the value
             ("RUN TIME: ").toCharArray()
             , getStartOffset() + 112
             ,10
             );
								setHead2Time352(fillSpace(8));
    }


 

	/**
	 *	Returns the value of head2ReportId352
	 *	@return head2ReportId352
	 */
   public char[] getHead2ReportId352() throws CFException{
     if (isHead2ReportId352Modified()) { 
        head2ReportId352 = refreshHead2ReportId352();
     }
   		return head2ReportId352;
   }

  
	/**
	*  set variable head2ReportId352
	*  Corresponding COBOL Variable is 352-HEAD2-REPORT-ID
	*  @param value
	**/
   public void setHead2ReportId352(char[] value) {
      head2ReportId352 = checkHead2ReportId352Constraints(value);
      serializeHead2ReportId352(head2ReportId352);
   } 

     /**
	 * 	Update Head2ReportId352 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHead2ReportId352(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHead2ReportId352,head2ReportId352.length);
   	
   }
   
   public void setHead2ReportId352(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHead2ReportId352,head2ReportId352.length);
   	
   }
   
     /**
	 * 	Update Head2ReportId352 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHead2ReportId352(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead2ReportId352+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Head2ReportId352 with another Field
	 *	@param value
	 */
   public void setHead2ReportId352(Field source) {
       replace(source,0,source.length(),beginHead2ReportId352,HEAD_2_REPORT_ID_352_LEN);
   	
   }  
   
     /**
	 * 	Update Head2ReportId352 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHead2ReportId352(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHead2ReportId352,HEAD_2_REPORT_ID_352_LEN);
   	
   }
   
     /**
	 * 	Update Head2ReportId352 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHead2ReportId352(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead2ReportId352+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of head2CarCon352
	 *	@return head2CarCon352
	 */
   public char[] getHead2CarCon352() throws CFException{
     if (isHead2CarCon352Modified()) { 
        head2CarCon352 = refreshHead2CarCon352();
     }
   		return head2CarCon352;
   }

  
	/**
	*  set variable head2CarCon352
	*  Corresponding COBOL Variable is 352-HEAD2-CAR-CON
	*  @param value
	**/
   public void setHead2CarCon352(char[] value) {
      head2CarCon352 = checkHead2CarCon352Constraints(value);
      serializeHead2CarCon352(head2CarCon352);
   } 

     /**
	 * 	Update Head2CarCon352 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHead2CarCon352(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHead2CarCon352,head2CarCon352.length);
   	
   }
   
   public void setHead2CarCon352(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHead2CarCon352,head2CarCon352.length);
   	
   }
   
     /**
	 * 	Update Head2CarCon352 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHead2CarCon352(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead2CarCon352+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Head2CarCon352 with another Field
	 *	@param value
	 */
   public void setHead2CarCon352(Field source) {
       replace(source,0,source.length(),beginHead2CarCon352,HEAD_2_CAR_CON_352_LEN);
   	
   }  
   
     /**
	 * 	Update Head2CarCon352 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHead2CarCon352(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHead2CarCon352,HEAD_2_CAR_CON_352_LEN);
   	
   }
   
     /**
	 * 	Update Head2CarCon352 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHead2CarCon352(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead2CarCon352+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of head2Time352
	 *	@return head2Time352
	 */
   public char[] getHead2Time352() throws CFException{
     if (isHead2Time352Modified()) { 
        head2Time352 = refreshHead2Time352();
     }
   		return head2Time352;
   }

  
	/**
	*  set variable head2Time352
	*  Corresponding COBOL Variable is 352-HEAD2-TIME
	*  @param value
	**/
   public void setHead2Time352(char[] value) {
      head2Time352 = checkHead2Time352Constraints(value);
      serializeHead2Time352(head2Time352);
   } 

     /**
	 * 	Update Head2Time352 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHead2Time352(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHead2Time352,head2Time352.length);
   	
   }
   
   public void setHead2Time352(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHead2Time352,head2Time352.length);
   	
   }
   
     /**
	 * 	Update Head2Time352 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHead2Time352(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead2Time352+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Head2Time352 with another Field
	 *	@param value
	 */
   public void setHead2Time352(Field source) {
       replace(source,0,source.length(),beginHead2Time352,HEAD_2_TIME_352_LEN);
   	
   }  
   
     /**
	 * 	Update Head2Time352 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHead2Time352(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHead2Time352,HEAD_2_TIME_352_LEN);
   	
   }
   
     /**
	 * 	Update Head2Time352 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHead2Time352(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead2Time352+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHead2352FieldLength() {
			return HEAD_2352_LENGTH;
		}

}
  
