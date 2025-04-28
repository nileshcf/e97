package com.cloudframe.app.mcissues.dto;

/**
*  The class DtlRecord4800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class DtlRecord4800 extends DtlRecord4800Serialized {
   

						private char[] dtlLast800 = Field.fillLowValue(1);
	
	/**
	* Constructor for DtlRecord4800
	**/
    public DtlRecord4800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of dtlLast800
	 *	@return dtlLast800
	 */
   public char[] getDtlLast800() throws CFException{
     if (isDtlLast800Modified()) { 
        dtlLast800 = refreshDtlLast800();
     }
   		return dtlLast800;
   }

  
	/**
	*  set variable dtlLast800
	*  Corresponding COBOL Variable is 800-DTL-LAST
	*  @param value
	**/
   public void setDtlLast800(char[] value) {
      dtlLast800 = checkDtlLast800Constraints(value);
      serializeDtlLast800(dtlLast800);
   } 

     /**
	 * 	Update DtlLast800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDtlLast800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDtlLast800,dtlLast800.length);
   	
   }
   
   public void setDtlLast800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDtlLast800,dtlLast800.length);
   	
   }
   
     /**
	 * 	Update DtlLast800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDtlLast800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDtlLast800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DtlLast800 with another Field
	 *	@param value
	 */
   public void setDtlLast800(Field source) {
       replace(source,0,source.length(),beginDtlLast800,DTL_LAST_800_LEN);
   	
   }  
   
     /**
	 * 	Update DtlLast800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDtlLast800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDtlLast800,DTL_LAST_800_LEN);
   	
   }
   
     /**
	 * 	Update DtlLast800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDtlLast800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDtlLast800+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes DtlRecord4800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setDtlLast800(CONSTANTS.SPACE);
   }

		public static int getDtlRecord4800FieldLength() {
			return DTL_RECORD_4800_LENGTH;
		}

}
  
