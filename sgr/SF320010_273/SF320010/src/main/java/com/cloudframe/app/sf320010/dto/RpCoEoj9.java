package com.cloudframe.app.sf320010.dto;

/**
*  The class RpCoEoj9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpCoEoj9 extends RpCoEoj9Serialized {
   



								private char[] rpCoEoj9TotalRem = Field.fillLowValue(6);

	
	/**
	* Constructor for RpCoEoj9
	**/
    public RpCoEoj9() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("REMOTE CONSOLE ACTIVITY LOG RCDS READ    - ").toCharArray()
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
	 *	Returns the value of rpCoEoj9TotalRem
	 *	@return rpCoEoj9TotalRem
	 */
   public char[] getRpCoEoj9TotalRem() throws CFException{
     if (isRpCoEoj9TotalRemModified()) { 
        rpCoEoj9TotalRem = refreshRpCoEoj9TotalRem();
     }
   		return rpCoEoj9TotalRem;
   }

  
	/**
	*  set variable rpCoEoj9TotalRem
	*  Corresponding COBOL Variable is RP-CO-EOJ9-TOTAL-REM
	*  @param value
	**/
   public void setRpCoEoj9TotalRem(char[] value) {
      rpCoEoj9TotalRem = checkRpCoEoj9TotalRemConstraints(value);
      serializeRpCoEoj9TotalRem(rpCoEoj9TotalRem);
   } 

     /**
	 * 	Update RpCoEoj9TotalRem 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpCoEoj9TotalRem(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpCoEoj9TotalRem,rpCoEoj9TotalRem.length);
   	
   }
   
   public void setRpCoEoj9TotalRem(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj9TotalRem,rpCoEoj9TotalRem.length);
   	
   }
   
     /**
	 * 	Update RpCoEoj9TotalRem 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj9TotalRem(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj9TotalRem+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpCoEoj9TotalRem with another Field
	 *	@param value
	 */
   public void setRpCoEoj9TotalRem(Field source) {
       replace(source,0,source.length(),beginRpCoEoj9TotalRem,RP_CO_EOJ_9_TOTAL_REM_LEN);
   	
   }  
   
     /**
	 * 	Update RpCoEoj9TotalRem 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpCoEoj9TotalRem(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpCoEoj9TotalRem,RP_CO_EOJ_9_TOTAL_REM_LEN);
   	
   }
   
     /**
	 * 	Update RpCoEoj9TotalRem 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj9TotalRem(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj9TotalRem+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpCoEoj9FieldLength() {
			return RP_CO_EOJ_9_LENGTH;
		}

}
  
