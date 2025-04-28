package com.cloudframe.app.sf320010.dto;

/**
*  The class RpEmailHeading1200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpEmailHeading1200 extends RpEmailHeading1200Serialized {
   


						private char[] rpH1RptCode1200 = new char[2];





						private char[] rpH1CurrentDate1200 = new char[8];



						private char[] rpH1Curtime1200 = new char[8];
	
	/**
	* Constructor for RpEmailHeading1200
	**/
    public RpEmailHeading1200() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SF320010-").toCharArray()
             , getStartOffset() + 0
             ,9
             );
								setRpH1RptCode1200(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(41)
             , getStartOffset() + 11
             ,41
             );
       replaceValue( // serialize and save the value
             ("MASTERCARD INTERNATIONAL INC.").toCharArray()
             , getStartOffset() + 52
             ,29
             );
       replaceValue( // serialize and save the value
             fillSpace(17)
             , getStartOffset() + 81
             ,17
             );
       replaceValue( // serialize and save the value
             ("RUN DATE ").toCharArray()
             , getStartOffset() + 98
             ,9
             );
								setRpH1CurrentDate1200(fillSpace(8));
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 115
             ,4
             );
       replaceValue( // serialize and save the value
             ("TIME ").toCharArray()
             , getStartOffset() + 119
             ,5
             );
								setRpH1Curtime1200(fillSpace(8));
    }


 

	/**
	 *	Returns the value of rpH1RptCode1200
	 *	@return rpH1RptCode1200
	 */
   public char[] getRpH1RptCode1200() throws CFException{
     if (isRpH1RptCode1200Modified()) { 
        rpH1RptCode1200 = refreshRpH1RptCode1200();
     }
   		return rpH1RptCode1200;
   }

  
	/**
	*  set variable rpH1RptCode1200
	*  Corresponding COBOL Variable is 200-RP-H1-RPT-CODE1
	*  @param value
	**/
   public void setRpH1RptCode1200(char[] value) {
      rpH1RptCode1200 = checkRpH1RptCode1200Constraints(value);
      serializeRpH1RptCode1200(rpH1RptCode1200);
   } 

     /**
	 * 	Update RpH1RptCode1200 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpH1RptCode1200(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpH1RptCode1200,rpH1RptCode1200.length);
   	
   }
   
   public void setRpH1RptCode1200(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpH1RptCode1200,rpH1RptCode1200.length);
   	
   }
   
     /**
	 * 	Update RpH1RptCode1200 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpH1RptCode1200(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpH1RptCode1200+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpH1RptCode1200 with another Field
	 *	@param value
	 */
   public void setRpH1RptCode1200(Field source) {
       replace(source,0,source.length(),beginRpH1RptCode1200,RP_H_1_RPT_CODE_1200_LEN);
   	
   }  
   
     /**
	 * 	Update RpH1RptCode1200 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpH1RptCode1200(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpH1RptCode1200,RP_H_1_RPT_CODE_1200_LEN);
   	
   }
   
     /**
	 * 	Update RpH1RptCode1200 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpH1RptCode1200(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpH1RptCode1200+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpH1CurrentDate1200
	 *	@return rpH1CurrentDate1200
	 */
   public char[] getRpH1CurrentDate1200() throws CFException{
     if (isRpH1CurrentDate1200Modified()) { 
        rpH1CurrentDate1200 = refreshRpH1CurrentDate1200();
     }
   		return rpH1CurrentDate1200;
   }

  
	/**
	*  set variable rpH1CurrentDate1200
	*  Corresponding COBOL Variable is 200-RP-H1-CURRENT-DATE1
	*  @param value
	**/
   public void setRpH1CurrentDate1200(char[] value) {
      rpH1CurrentDate1200 = checkRpH1CurrentDate1200Constraints(value);
      serializeRpH1CurrentDate1200(rpH1CurrentDate1200);
   } 

     /**
	 * 	Update RpH1CurrentDate1200 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpH1CurrentDate1200(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpH1CurrentDate1200,rpH1CurrentDate1200.length);
   	
   }
   
   public void setRpH1CurrentDate1200(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpH1CurrentDate1200,rpH1CurrentDate1200.length);
   	
   }
   
     /**
	 * 	Update RpH1CurrentDate1200 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpH1CurrentDate1200(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpH1CurrentDate1200+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpH1CurrentDate1200 with another Field
	 *	@param value
	 */
   public void setRpH1CurrentDate1200(Field source) {
       replace(source,0,source.length(),beginRpH1CurrentDate1200,RP_H_1_CURRENT_DATE_1200_LEN);
   	
   }  
   
     /**
	 * 	Update RpH1CurrentDate1200 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpH1CurrentDate1200(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpH1CurrentDate1200,RP_H_1_CURRENT_DATE_1200_LEN);
   	
   }
   
     /**
	 * 	Update RpH1CurrentDate1200 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpH1CurrentDate1200(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpH1CurrentDate1200+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpH1Curtime1200
	 *	@return rpH1Curtime1200
	 */
   public char[] getRpH1Curtime1200() throws CFException{
     if (isRpH1Curtime1200Modified()) { 
        rpH1Curtime1200 = refreshRpH1Curtime1200();
     }
   		return rpH1Curtime1200;
   }

  
	/**
	*  set variable rpH1Curtime1200
	*  Corresponding COBOL Variable is 200-RP-H1-CURTIME1
	*  @param value
	**/
   public void setRpH1Curtime1200(char[] value) {
      rpH1Curtime1200 = checkRpH1Curtime1200Constraints(value);
      serializeRpH1Curtime1200(rpH1Curtime1200);
   } 

     /**
	 * 	Update RpH1Curtime1200 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpH1Curtime1200(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpH1Curtime1200,rpH1Curtime1200.length);
   	
   }
   
   public void setRpH1Curtime1200(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpH1Curtime1200,rpH1Curtime1200.length);
   	
   }
   
     /**
	 * 	Update RpH1Curtime1200 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpH1Curtime1200(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpH1Curtime1200+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpH1Curtime1200 with another Field
	 *	@param value
	 */
   public void setRpH1Curtime1200(Field source) {
       replace(source,0,source.length(),beginRpH1Curtime1200,RP_H_1_CURTIME_1200_LEN);
   	
   }  
   
     /**
	 * 	Update RpH1Curtime1200 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpH1Curtime1200(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpH1Curtime1200,RP_H_1_CURTIME_1200_LEN);
   	
   }
   
     /**
	 * 	Update RpH1Curtime1200 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpH1Curtime1200(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpH1Curtime1200+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpEmailHeading1200FieldLength() {
			return RP_EMAIL_HEADING_1200_LENGTH;
		}

}
  
