package com.cloudframe.app.sf320010.dto;

/**
*  The class RpCoEoj5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpCoEoj5 extends RpCoEoj5Serialized {
   



								private char[] rpCoEoj5TotalOper = Field.fillLowValue(6);

	
	/**
	* Constructor for RpCoEoj5
	**/
    public RpCoEoj5() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("OPERATOR COMMAND LOG RECORDS READ        - ").toCharArray()
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
	 *	Returns the value of rpCoEoj5TotalOper
	 *	@return rpCoEoj5TotalOper
	 */
   public char[] getRpCoEoj5TotalOper() throws CFException{
     if (isRpCoEoj5TotalOperModified()) { 
        rpCoEoj5TotalOper = refreshRpCoEoj5TotalOper();
     }
   		return rpCoEoj5TotalOper;
   }

  
	/**
	*  set variable rpCoEoj5TotalOper
	*  Corresponding COBOL Variable is RP-CO-EOJ5-TOTAL-OPER
	*  @param value
	**/
   public void setRpCoEoj5TotalOper(char[] value) {
      rpCoEoj5TotalOper = checkRpCoEoj5TotalOperConstraints(value);
      serializeRpCoEoj5TotalOper(rpCoEoj5TotalOper);
   } 

     /**
	 * 	Update RpCoEoj5TotalOper 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpCoEoj5TotalOper(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpCoEoj5TotalOper,rpCoEoj5TotalOper.length);
   	
   }
   
   public void setRpCoEoj5TotalOper(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj5TotalOper,rpCoEoj5TotalOper.length);
   	
   }
   
     /**
	 * 	Update RpCoEoj5TotalOper 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj5TotalOper(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj5TotalOper+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpCoEoj5TotalOper with another Field
	 *	@param value
	 */
   public void setRpCoEoj5TotalOper(Field source) {
       replace(source,0,source.length(),beginRpCoEoj5TotalOper,RP_CO_EOJ_5_TOTAL_OPER_LEN);
   	
   }  
   
     /**
	 * 	Update RpCoEoj5TotalOper 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpCoEoj5TotalOper(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpCoEoj5TotalOper,RP_CO_EOJ_5_TOTAL_OPER_LEN);
   	
   }
   
     /**
	 * 	Update RpCoEoj5TotalOper 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj5TotalOper(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj5TotalOper+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpCoEoj5FieldLength() {
			return RP_CO_EOJ_5_LENGTH;
		}

}
  
