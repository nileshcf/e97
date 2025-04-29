package com.cloudframe.app.mcissues.dto;

/**
*  The class DtlRecord3800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class DtlRecord3800 extends DtlRecord3800Serialized {
   

						private char[] dtlCount800 = Field.fillLowValue(10);
	
	/**
	* Constructor for DtlRecord3800
	**/
    public DtlRecord3800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of dtlCount800
	 *	@return dtlCount800
	 */
   public char[] getDtlCount800() throws CFException{
     if (isDtlCount800Modified()) { 
        dtlCount800 = refreshDtlCount800();
     }
   		return dtlCount800;
   }

  
	/**
	*  set variable dtlCount800
	*  Corresponding COBOL Variable is 800-DTL-COUNT
	*  @param value
	**/
   public void setDtlCount800(char[] value) {
      dtlCount800 = checkDtlCount800Constraints(value);
      serializeDtlCount800(dtlCount800);
   } 

     /**
	 * 	Update DtlCount800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDtlCount800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDtlCount800,dtlCount800.length);
   	
   }
   
   public void setDtlCount800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDtlCount800,dtlCount800.length);
   	
   }
   
     /**
	 * 	Update DtlCount800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDtlCount800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDtlCount800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DtlCount800 with another Field
	 *	@param value
	 */
   public void setDtlCount800(Field source) {
       replace(source,0,source.length(),beginDtlCount800,DTL_COUNT_800_LEN);
   	
   }  
   
     /**
	 * 	Update DtlCount800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDtlCount800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDtlCount800,DTL_COUNT_800_LEN);
   	
   }
   
     /**
	 * 	Update DtlCount800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDtlCount800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDtlCount800+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes DtlRecord3800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setDtlCount800(CONSTANTS.SPACE_10);
   }

		public static int getDtlRecord3800FieldLength() {
			return DTL_RECORD_3800_LENGTH;
		}

}
  
