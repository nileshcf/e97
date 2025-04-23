package com.cloudframe.app.sf311010.dto;

/**
*  The class Head1350 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Head1350 extends Head1350Serialized {
   

						private char[] head1ReportId350 = new char[1];

						private char[] head1CarCon350 = new char[1];




						private char[] head1Date350 = new char[8];
	
	/**
	* Constructor for Head1350
	**/
    public Head1350() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHead1ReportId350(fillSpace(1));
								setHead1CarCon350(fillSpace(1));
       replaceValue( // serialize and save the value
             ("SF311010-AA                                       ").toCharArray()
             , getStartOffset() + 2
             ,50
             );
       replaceValue( // serialize and save the value
             pad(60,"MASTERCARD INTERNATIONAL INC.".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 52
             ,60
             );
       replaceValue( // serialize and save the value
             ("RUN DATE: ").toCharArray()
             , getStartOffset() + 112
             ,10
             );
								setHead1Date350(fillSpace(8));
    }


 

	/**
	 *	Returns the value of head1ReportId350
	 *	@return head1ReportId350
	 */
   public char[] getHead1ReportId350() throws CFException{
     if (isHead1ReportId350Modified()) { 
        head1ReportId350 = refreshHead1ReportId350();
     }
   		return head1ReportId350;
   }

  
	/**
	*  set variable head1ReportId350
	*  Corresponding COBOL Variable is 350-HEAD1-REPORT-ID
	*  @param value
	**/
   public void setHead1ReportId350(char[] value) {
      head1ReportId350 = checkHead1ReportId350Constraints(value);
      serializeHead1ReportId350(head1ReportId350);
   } 

     /**
	 * 	Update Head1ReportId350 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHead1ReportId350(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHead1ReportId350,head1ReportId350.length);
   	
   }
   
   public void setHead1ReportId350(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHead1ReportId350,head1ReportId350.length);
   	
   }
   
     /**
	 * 	Update Head1ReportId350 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHead1ReportId350(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead1ReportId350+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Head1ReportId350 with another Field
	 *	@param value
	 */
   public void setHead1ReportId350(Field source) {
       replace(source,0,source.length(),beginHead1ReportId350,HEAD_1_REPORT_ID_350_LEN);
   	
   }  
   
     /**
	 * 	Update Head1ReportId350 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHead1ReportId350(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHead1ReportId350,HEAD_1_REPORT_ID_350_LEN);
   	
   }
   
     /**
	 * 	Update Head1ReportId350 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHead1ReportId350(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead1ReportId350+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of head1CarCon350
	 *	@return head1CarCon350
	 */
   public char[] getHead1CarCon350() throws CFException{
     if (isHead1CarCon350Modified()) { 
        head1CarCon350 = refreshHead1CarCon350();
     }
   		return head1CarCon350;
   }

  
	/**
	*  set variable head1CarCon350
	*  Corresponding COBOL Variable is 350-HEAD1-CAR-CON
	*  @param value
	**/
   public void setHead1CarCon350(char[] value) {
      head1CarCon350 = checkHead1CarCon350Constraints(value);
      serializeHead1CarCon350(head1CarCon350);
   } 

     /**
	 * 	Update Head1CarCon350 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHead1CarCon350(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHead1CarCon350,head1CarCon350.length);
   	
   }
   
   public void setHead1CarCon350(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHead1CarCon350,head1CarCon350.length);
   	
   }
   
     /**
	 * 	Update Head1CarCon350 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHead1CarCon350(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead1CarCon350+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Head1CarCon350 with another Field
	 *	@param value
	 */
   public void setHead1CarCon350(Field source) {
       replace(source,0,source.length(),beginHead1CarCon350,HEAD_1_CAR_CON_350_LEN);
   	
   }  
   
     /**
	 * 	Update Head1CarCon350 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHead1CarCon350(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHead1CarCon350,HEAD_1_CAR_CON_350_LEN);
   	
   }
   
     /**
	 * 	Update Head1CarCon350 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHead1CarCon350(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead1CarCon350+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of head1Date350
	 *	@return head1Date350
	 */
   public char[] getHead1Date350() throws CFException{
     if (isHead1Date350Modified()) { 
        head1Date350 = refreshHead1Date350();
     }
   		return head1Date350;
   }

  
	/**
	*  set variable head1Date350
	*  Corresponding COBOL Variable is 350-HEAD1-DATE
	*  @param value
	**/
   public void setHead1Date350(char[] value) {
      head1Date350 = checkHead1Date350Constraints(value);
      serializeHead1Date350(head1Date350);
   } 

     /**
	 * 	Update Head1Date350 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHead1Date350(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHead1Date350,head1Date350.length);
   	
   }
   
   public void setHead1Date350(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHead1Date350,head1Date350.length);
   	
   }
   
     /**
	 * 	Update Head1Date350 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHead1Date350(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead1Date350+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Head1Date350 with another Field
	 *	@param value
	 */
   public void setHead1Date350(Field source) {
       replace(source,0,source.length(),beginHead1Date350,HEAD_1_DATE_350_LEN);
   	
   }  
   
     /**
	 * 	Update Head1Date350 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHead1Date350(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHead1Date350,HEAD_1_DATE_350_LEN);
   	
   }
   
     /**
	 * 	Update Head1Date350 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHead1Date350(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead1Date350+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHead1350FieldLength() {
			return HEAD_1350_LENGTH;
		}

}
  
