package com.cloudframe.app.sf320010.dto;

/**
*  The class RpCoEoj13 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpCoEoj13 extends RpCoEoj13Serialized {
   



								private char[] rpCoEoj13TotalChk = Field.fillLowValue(6);

	
	/**
	* Constructor for RpCoEoj13
	**/
    public RpCoEoj13() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("CHK LOG RECORDS READ                     - ").toCharArray()
             , getStartOffset() + 1
             ,43
             );
       replaceValue( // serialize and save the value
             pad(84," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 50
             ,84
             );
    }


 

	/**
	 *	Returns the value of rpCoEoj13TotalChk
	 *	@return rpCoEoj13TotalChk
	 */
   public char[] getRpCoEoj13TotalChk() throws CFException{
     if (isRpCoEoj13TotalChkModified()) { 
        rpCoEoj13TotalChk = refreshRpCoEoj13TotalChk();
     }
   		return rpCoEoj13TotalChk;
   }

  
	/**
	*  set variable rpCoEoj13TotalChk
	*  Corresponding COBOL Variable is RP-CO-EOJ13-TOTAL-CHK
	*  @param value
	**/
   public void setRpCoEoj13TotalChk(char[] value) {
      rpCoEoj13TotalChk = checkRpCoEoj13TotalChkConstraints(value);
      serializeRpCoEoj13TotalChk(rpCoEoj13TotalChk);
   } 

     /**
	 * 	Update RpCoEoj13TotalChk 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpCoEoj13TotalChk(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpCoEoj13TotalChk,rpCoEoj13TotalChk.length);
   	
   }
   
   public void setRpCoEoj13TotalChk(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj13TotalChk,rpCoEoj13TotalChk.length);
   	
   }
   
     /**
	 * 	Update RpCoEoj13TotalChk 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj13TotalChk(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj13TotalChk+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpCoEoj13TotalChk with another Field
	 *	@param value
	 */
   public void setRpCoEoj13TotalChk(Field source) {
       replace(source,0,source.length(),beginRpCoEoj13TotalChk,RP_CO_EOJ_13_TOTAL_CHK_LEN);
   	
   }  
   
     /**
	 * 	Update RpCoEoj13TotalChk 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpCoEoj13TotalChk(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpCoEoj13TotalChk,RP_CO_EOJ_13_TOTAL_CHK_LEN);
   	
   }
   
     /**
	 * 	Update RpCoEoj13TotalChk 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj13TotalChk(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj13TotalChk+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpCoEoj13FieldLength() {
			return RP_CO_EOJ_13_LENGTH;
		}

}
  
