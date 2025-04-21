package com.cloudframe.app.sf320010.dto;

/**
*  The class RpCoEoj6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpCoEoj6 extends RpCoEoj6Serialized {
   



								private char[] rpCoEoj6TotalPos = Field.fillLowValue(6);

	
	/**
	* Constructor for RpCoEoj6
	**/
    public RpCoEoj6() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("POINT OF SALE TRANSACTION LOG RCDS READ  - ").toCharArray()
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
	 *	Returns the value of rpCoEoj6TotalPos
	 *	@return rpCoEoj6TotalPos
	 */
   public char[] getRpCoEoj6TotalPos() throws CFException{
     if (isRpCoEoj6TotalPosModified()) { 
        rpCoEoj6TotalPos = refreshRpCoEoj6TotalPos();
     }
   		return rpCoEoj6TotalPos;
   }

  
	/**
	*  set variable rpCoEoj6TotalPos
	*  Corresponding COBOL Variable is RP-CO-EOJ6-TOTAL-POS
	*  @param value
	**/
   public void setRpCoEoj6TotalPos(char[] value) {
      rpCoEoj6TotalPos = checkRpCoEoj6TotalPosConstraints(value);
      serializeRpCoEoj6TotalPos(rpCoEoj6TotalPos);
   } 

     /**
	 * 	Update RpCoEoj6TotalPos 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpCoEoj6TotalPos(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpCoEoj6TotalPos,rpCoEoj6TotalPos.length);
   	
   }
   
   public void setRpCoEoj6TotalPos(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj6TotalPos,rpCoEoj6TotalPos.length);
   	
   }
   
     /**
	 * 	Update RpCoEoj6TotalPos 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj6TotalPos(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj6TotalPos+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpCoEoj6TotalPos with another Field
	 *	@param value
	 */
   public void setRpCoEoj6TotalPos(Field source) {
       replace(source,0,source.length(),beginRpCoEoj6TotalPos,RP_CO_EOJ_6_TOTAL_POS_LEN);
   	
   }  
   
     /**
	 * 	Update RpCoEoj6TotalPos 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpCoEoj6TotalPos(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpCoEoj6TotalPos,RP_CO_EOJ_6_TOTAL_POS_LEN);
   	
   }
   
     /**
	 * 	Update RpCoEoj6TotalPos 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj6TotalPos(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj6TotalPos+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpCoEoj6FieldLength() {
			return RP_CO_EOJ_6_LENGTH;
		}

}
  
