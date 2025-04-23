package com.cloudframe.app.sf311010.dto;

/**
*  The class Head5358 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Head5358 extends Head5358Serialized {
   

						private char[] head5ReportId358 = new char[1];

						private char[] head5CarCon358 = new char[1];







	
	/**
	* Constructor for Head5358
	**/
    public Head5358() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHead5ReportId358(fillSpace(1));
								setHead5CarCon358(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 2
             ,8
             );
       replaceValue( // serialize and save the value
             ("LOG TYPE").toCharArray()
             , getStartOffset() + 10
             ,8
             );
       replaceValue( // serialize and save the value
             fillSpace(17)
             , getStartOffset() + 18
             ,17
             );
       replaceValue( // serialize and save the value
             ("CLASS").toCharArray()
             , getStartOffset() + 35
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(10)
             , getStartOffset() + 40
             ,10
             );
       replaceValue( // serialize and save the value
             ("COUNT").toCharArray()
             , getStartOffset() + 50
             ,5
             );
       replaceValue( // serialize and save the value
             pad(75," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 55
             ,75
             );
    }


 

	/**
	 *	Returns the value of head5ReportId358
	 *	@return head5ReportId358
	 */
   public char[] getHead5ReportId358() throws CFException{
     if (isHead5ReportId358Modified()) { 
        head5ReportId358 = refreshHead5ReportId358();
     }
   		return head5ReportId358;
   }

  
	/**
	*  set variable head5ReportId358
	*  Corresponding COBOL Variable is 358-HEAD5-REPORT-ID
	*  @param value
	**/
   public void setHead5ReportId358(char[] value) {
      head5ReportId358 = checkHead5ReportId358Constraints(value);
      serializeHead5ReportId358(head5ReportId358);
   } 

     /**
	 * 	Update Head5ReportId358 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHead5ReportId358(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHead5ReportId358,head5ReportId358.length);
   	
   }
   
   public void setHead5ReportId358(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHead5ReportId358,head5ReportId358.length);
   	
   }
   
     /**
	 * 	Update Head5ReportId358 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHead5ReportId358(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead5ReportId358+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Head5ReportId358 with another Field
	 *	@param value
	 */
   public void setHead5ReportId358(Field source) {
       replace(source,0,source.length(),beginHead5ReportId358,HEAD_5_REPORT_ID_358_LEN);
   	
   }  
   
     /**
	 * 	Update Head5ReportId358 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHead5ReportId358(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHead5ReportId358,HEAD_5_REPORT_ID_358_LEN);
   	
   }
   
     /**
	 * 	Update Head5ReportId358 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHead5ReportId358(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead5ReportId358+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of head5CarCon358
	 *	@return head5CarCon358
	 */
   public char[] getHead5CarCon358() throws CFException{
     if (isHead5CarCon358Modified()) { 
        head5CarCon358 = refreshHead5CarCon358();
     }
   		return head5CarCon358;
   }

  
	/**
	*  set variable head5CarCon358
	*  Corresponding COBOL Variable is 358-HEAD5-CAR-CON
	*  @param value
	**/
   public void setHead5CarCon358(char[] value) {
      head5CarCon358 = checkHead5CarCon358Constraints(value);
      serializeHead5CarCon358(head5CarCon358);
   } 

     /**
	 * 	Update Head5CarCon358 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHead5CarCon358(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHead5CarCon358,head5CarCon358.length);
   	
   }
   
   public void setHead5CarCon358(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHead5CarCon358,head5CarCon358.length);
   	
   }
   
     /**
	 * 	Update Head5CarCon358 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHead5CarCon358(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead5CarCon358+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Head5CarCon358 with another Field
	 *	@param value
	 */
   public void setHead5CarCon358(Field source) {
       replace(source,0,source.length(),beginHead5CarCon358,HEAD_5_CAR_CON_358_LEN);
   	
   }  
   
     /**
	 * 	Update Head5CarCon358 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHead5CarCon358(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHead5CarCon358,HEAD_5_CAR_CON_358_LEN);
   	
   }
   
     /**
	 * 	Update Head5CarCon358 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHead5CarCon358(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHead5CarCon358+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHead5358FieldLength() {
			return HEAD_5358_LENGTH;
		}

}
  
