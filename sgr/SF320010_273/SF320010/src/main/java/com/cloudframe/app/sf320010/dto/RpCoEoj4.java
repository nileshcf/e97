package com.cloudframe.app.sf320010.dto;

/**
*  The class RpCoEoj4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:45. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpCoEoj4 extends RpCoEoj4Serialized { 
   



								private char[] rpCoEoj4TotalBulk = Field.fillLowValue(6);

	
	/**
	* Constructor for RpCoEoj4
	**/
    public RpCoEoj4() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("BULK DATA TRANSMISSION LOG RECORDS READ  - ").toCharArray()
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
	 *	Returns the value of rpCoEoj4TotalBulk
	 *	@return rpCoEoj4TotalBulk
	 */
   public char[] getRpCoEoj4TotalBulk() throws CFException{
     if (isRpCoEoj4TotalBulkModified()) { 
        rpCoEoj4TotalBulk = refreshRpCoEoj4TotalBulk();
     }
   		return rpCoEoj4TotalBulk;
   }

  
	/**
	*  set variable rpCoEoj4TotalBulk
	*  Corresponding COBOL Variable is RP-CO-EOJ4-TOTAL-BULK
	*  @param value
	**/
   public void setRpCoEoj4TotalBulk(char[] value) {
      rpCoEoj4TotalBulk = checkRpCoEoj4TotalBulkConstraints(value);
      serializeRpCoEoj4TotalBulk(rpCoEoj4TotalBulk);
   } 

     /**
	 * 	Update RpCoEoj4TotalBulk 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpCoEoj4TotalBulk(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpCoEoj4TotalBulk,rpCoEoj4TotalBulk.length);
   	
   }
   
   public void setRpCoEoj4TotalBulk(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj4TotalBulk,rpCoEoj4TotalBulk.length);
   	
   }
   
     /**
	 * 	Update RpCoEoj4TotalBulk 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj4TotalBulk(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj4TotalBulk+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpCoEoj4TotalBulk with another Field
	 *	@param value
	 */
   public void setRpCoEoj4TotalBulk(Field source) {
       replace(source,0,source.length(),beginRpCoEoj4TotalBulk,RP_CO_EOJ_4_TOTAL_BULK_LEN);
   	
   }  
   
     /**
	 * 	Update RpCoEoj4TotalBulk 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpCoEoj4TotalBulk(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpCoEoj4TotalBulk,RP_CO_EOJ_4_TOTAL_BULK_LEN);
   	
   }
   
     /**
	 * 	Update RpCoEoj4TotalBulk 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpCoEoj4TotalBulk(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpCoEoj4TotalBulk+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpCoEoj4FieldLength() {
			return RP_CO_EOJ_4_LENGTH;
		}

}
  
