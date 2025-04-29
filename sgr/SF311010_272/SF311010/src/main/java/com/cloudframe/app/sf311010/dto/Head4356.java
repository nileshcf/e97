package com.cloudframe.app.sf311010.dto;

/**
*  The class Head4356 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Head4356 extends Head4356Serialized {
   

						private char[] head4ReportId356 = new char[1];

						private char[] head4CarCon356 = new char[1];



	
	/**
	* Constructor for Head4356
	**/
    public Head4356() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHead4ReportId356(fillSpace(1));
								setHead4CarCon356(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(48)
             , getStartOffset() + 2
             ,48
             );
       replaceValue( // serialize and save the value
             ("RECORD").toCharArray()
             , getStartOffset() + 50
             ,6
             );
       replaceValue( // serialize and save the value
             pad(74," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 56
             ,74
             );
    }


 

	/**
	 *	Returns the value of head4ReportId356
	 *	@return head4ReportId356
	 */
   public char[] getHead4ReportId356() throws CFException{
     if (isHead4ReportId356Modified()) { 
        head4ReportId356 = refreshHead4ReportId356();
     }
   		return head4ReportId356;
   }

  
	/**
	*  set variable head4ReportId356
	*  Corresponding COBOL Variable is 356-HEAD4-REPORT-ID
	*  @param value
	**/
   public void setHead4ReportId356(char[] value) {
      head4ReportId356 = checkHead4ReportId356Constraints(value);
      serializeHead4ReportId356(head4ReportId356);
   } 

     /**
	 * 	Update Head4ReportId356 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHead4ReportId356(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHead4ReportId356,head4ReportId356.length);
   	
   }
   
   public void setHead4ReportId356(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHead4ReportId356,head4ReportId356.length);
   	
   }
   
     /**
	 * 	Update Head4ReportId356 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHead4ReportId356(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead4ReportId356+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Head4ReportId356 with another Field
	 *	@param value
	 */
   public void setHead4ReportId356(Field source) {
       replace(source,0,source.length(),beginHead4ReportId356,HEAD_4_REPORT_ID_356_LEN);
   	
   }  
   
     /**
	 * 	Update Head4ReportId356 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHead4ReportId356(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHead4ReportId356,HEAD_4_REPORT_ID_356_LEN);
   	
   }
   
     /**
	 * 	Update Head4ReportId356 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHead4ReportId356(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead4ReportId356+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of head4CarCon356
	 *	@return head4CarCon356
	 */
   public char[] getHead4CarCon356() throws CFException{
     if (isHead4CarCon356Modified()) { 
        head4CarCon356 = refreshHead4CarCon356();
     }
   		return head4CarCon356;
   }

  
	/**
	*  set variable head4CarCon356
	*  Corresponding COBOL Variable is 356-HEAD4-CAR-CON
	*  @param value
	**/
   public void setHead4CarCon356(char[] value) {
      head4CarCon356 = checkHead4CarCon356Constraints(value);
      serializeHead4CarCon356(head4CarCon356);
   } 

     /**
	 * 	Update Head4CarCon356 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHead4CarCon356(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHead4CarCon356,head4CarCon356.length);
   	
   }
   
   public void setHead4CarCon356(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHead4CarCon356,head4CarCon356.length);
   	
   }
   
     /**
	 * 	Update Head4CarCon356 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHead4CarCon356(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead4CarCon356+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Head4CarCon356 with another Field
	 *	@param value
	 */
   public void setHead4CarCon356(Field source) {
       replace(source,0,source.length(),beginHead4CarCon356,HEAD_4_CAR_CON_356_LEN);
   	
   }  
   
     /**
	 * 	Update Head4CarCon356 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHead4CarCon356(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHead4CarCon356,HEAD_4_CAR_CON_356_LEN);
   	
   }
   
     /**
	 * 	Update Head4CarCon356 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHead4CarCon356(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead4CarCon356+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHead4356FieldLength() {
			return HEAD_4356_LENGTH;
		}

}
  
