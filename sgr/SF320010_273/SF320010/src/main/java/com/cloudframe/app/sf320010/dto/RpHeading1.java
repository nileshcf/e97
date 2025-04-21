package com.cloudframe.app.sf320010.dto;

/**
*  The class RpHeading1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpHeading1 extends RpHeading1Serialized {
   



						private char[] rpH1RptCode = Field.fillLowValue(2);





						private char[] rpH1CurrentDate = Field.fillLowValue(8);



						private char[] rpH1Curtime = Field.fillLowValue(8);
	
	/**
	* Constructor for RpHeading1
	**/
    public RpHeading1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("1").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("SF320010-").toCharArray()
             , getStartOffset() + 1
             ,9
             );
       replaceValue( // serialize and save the value
             fillSpace(41)
             , getStartOffset() + 12
             ,41
             );
       replaceValue( // serialize and save the value
             ("MASTERCARD INTERNATIONAL INC.").toCharArray()
             , getStartOffset() + 53
             ,29
             );
       replaceValue( // serialize and save the value
             fillSpace(17)
             , getStartOffset() + 82
             ,17
             );
       replaceValue( // serialize and save the value
             ("RUN DATE ").toCharArray()
             , getStartOffset() + 99
             ,9
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 116
             ,4
             );
       replaceValue( // serialize and save the value
             ("TIME ").toCharArray()
             , getStartOffset() + 120
             ,5
             );
    }


 

	/**
	 *	Returns the value of rpH1RptCode
	 *	@return rpH1RptCode
	 */
   public char[] getRpH1RptCode() throws CFException{
     if (isRpH1RptCodeModified()) { 
        rpH1RptCode = refreshRpH1RptCode();
     }
   		return rpH1RptCode;
   }

  
	/**
	*  set variable rpH1RptCode
	*  Corresponding COBOL Variable is RP-H1-RPT-CODE
	*  @param value
	**/
   public void setRpH1RptCode(char[] value) {
      rpH1RptCode = checkRpH1RptCodeConstraints(value);
      serializeRpH1RptCode(rpH1RptCode);
   } 

     /**
	 * 	Update RpH1RptCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpH1RptCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpH1RptCode,rpH1RptCode.length);
   	
   }
   
   public void setRpH1RptCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpH1RptCode,rpH1RptCode.length);
   	
   }
   
     /**
	 * 	Update RpH1RptCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpH1RptCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpH1RptCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpH1RptCode with another Field
	 *	@param value
	 */
   public void setRpH1RptCode(Field source) {
       replace(source,0,source.length(),beginRpH1RptCode,RP_H_1_RPT_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update RpH1RptCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpH1RptCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpH1RptCode,RP_H_1_RPT_CODE_LEN);
   	
   }
   
     /**
	 * 	Update RpH1RptCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpH1RptCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpH1RptCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpH1CurrentDate
	 *	@return rpH1CurrentDate
	 */
   public char[] getRpH1CurrentDate() throws CFException{
     if (isRpH1CurrentDateModified()) { 
        rpH1CurrentDate = refreshRpH1CurrentDate();
     }
   		return rpH1CurrentDate;
   }

  
	/**
	*  set variable rpH1CurrentDate
	*  Corresponding COBOL Variable is RP-H1-CURRENT-DATE
	*  @param value
	**/
   public void setRpH1CurrentDate(char[] value) {
      rpH1CurrentDate = checkRpH1CurrentDateConstraints(value);
      serializeRpH1CurrentDate(rpH1CurrentDate);
   } 

     /**
	 * 	Update RpH1CurrentDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpH1CurrentDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpH1CurrentDate,rpH1CurrentDate.length);
   	
   }
   
   public void setRpH1CurrentDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpH1CurrentDate,rpH1CurrentDate.length);
   	
   }
   
     /**
	 * 	Update RpH1CurrentDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpH1CurrentDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpH1CurrentDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpH1CurrentDate with another Field
	 *	@param value
	 */
   public void setRpH1CurrentDate(Field source) {
       replace(source,0,source.length(),beginRpH1CurrentDate,RP_H_1_CURRENT_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update RpH1CurrentDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpH1CurrentDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpH1CurrentDate,RP_H_1_CURRENT_DATE_LEN);
   	
   }
   
     /**
	 * 	Update RpH1CurrentDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpH1CurrentDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpH1CurrentDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpH1Curtime
	 *	@return rpH1Curtime
	 */
   public char[] getRpH1Curtime() throws CFException{
     if (isRpH1CurtimeModified()) { 
        rpH1Curtime = refreshRpH1Curtime();
     }
   		return rpH1Curtime;
   }

  
	/**
	*  set variable rpH1Curtime
	*  Corresponding COBOL Variable is RP-H1-CURTIME
	*  @param value
	**/
   public void setRpH1Curtime(char[] value) {
      rpH1Curtime = checkRpH1CurtimeConstraints(value);
      serializeRpH1Curtime(rpH1Curtime);
   } 

     /**
	 * 	Update RpH1Curtime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpH1Curtime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpH1Curtime,rpH1Curtime.length);
   	
   }
   
   public void setRpH1Curtime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpH1Curtime,rpH1Curtime.length);
   	
   }
   
     /**
	 * 	Update RpH1Curtime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpH1Curtime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpH1Curtime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpH1Curtime with another Field
	 *	@param value
	 */
   public void setRpH1Curtime(Field source) {
       replace(source,0,source.length(),beginRpH1Curtime,RP_H_1_CURTIME_LEN);
   	
   }  
   
     /**
	 * 	Update RpH1Curtime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpH1Curtime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpH1Curtime,RP_H_1_CURTIME_LEN);
   	
   }
   
     /**
	 * 	Update RpH1Curtime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpH1Curtime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpH1Curtime+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpHeading1FieldLength() {
			return RP_HEADING_1_LENGTH;
		}

}
  
