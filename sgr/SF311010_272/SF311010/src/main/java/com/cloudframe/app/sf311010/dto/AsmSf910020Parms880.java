package com.cloudframe.app.sf311010.dto;

/**
*  The class AsmSf910020Parms880 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AsmSf910020Parms880 extends AsmSf910020Parms880Serialized {
   

						private char[] asmTranByte880 = Field.fillLowValue(1);
				private AsmBitSw880 asmBitSw880 = new AsmBitSw880();
	
	/**
	* Constructor for AsmSf910020Parms880
	**/
    public AsmSf910020Parms880() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			asmBitSw880.setParent(this,getStartOffset() + 1);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of asmTranByte880
	 *	@return asmTranByte880
	 */
   public char[] getAsmTranByte880() throws CFException{
     if (isAsmTranByte880Modified()) { 
        asmTranByte880 = refreshAsmTranByte880();
     }
   		return asmTranByte880;
   }

  
	/**
	*  set variable asmTranByte880
	*  Corresponding COBOL Variable is 880-ASM-TRAN-BYTE
	*  @param value
	**/
   public void setAsmTranByte880(char[] value) {
      asmTranByte880 = checkAsmTranByte880Constraints(value);
      serializeAsmTranByte880(asmTranByte880);
   } 

     /**
	 * 	Update AsmTranByte880 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAsmTranByte880(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAsmTranByte880,asmTranByte880.length);
   	
   }
   
   public void setAsmTranByte880(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAsmTranByte880,asmTranByte880.length);
   	
   }
   
     /**
	 * 	Update AsmTranByte880 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAsmTranByte880(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAsmTranByte880+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AsmTranByte880 with another Field
	 *	@param value
	 */
   public void setAsmTranByte880(Field source) {
       replace(source,0,source.length(),beginAsmTranByte880,ASM_TRAN_BYTE_880_LEN);
   	
   }  
   
     /**
	 * 	Update AsmTranByte880 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAsmTranByte880(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAsmTranByte880,ASM_TRAN_BYTE_880_LEN);
   	
   }
   
     /**
	 * 	Update AsmTranByte880 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAsmTranByte880(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAsmTranByte880+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of asmBitSw880
	 *	@return asmBitSw880
	 */   
	 public AsmBitSw880 getAsmBitSw880() {
   	return asmBitSw880;
   }
   /**
	* 	Update AsmBitSw880 with the passed value
	*   Corresponding COBOL Variable is 880-ASM-BIT-SW
	*	@param value
	*/
   public void setAsmBitSw880(char[] value) {
      asmBitSw880.setString(value); 
   }   
    
     /**
	 * 	Update AsmBitSw880 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAsmBitSw880(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,asmBitSw880.begin,asmBitSw880.length());
   }
   
     /**
	 * 	Update AsmBitSw880 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAsmBitSw880(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,asmBitSw880.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AsmBitSw880 with another Field
	 *	@param value
	 */
   public void setAsmBitSw880(Field source) {
   	replace(source,0,source.length(),asmBitSw880.begin,asmBitSw880.length());
   }  
   
     /**
	 * 	Update AsmBitSw880 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAsmBitSw880(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,asmBitSw880.begin,asmBitSw880.length());
   }
   
     /**
	 * 	Update AsmBitSw880 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAsmBitSw880(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,asmBitSw880.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getAsmSf910020Parms880FieldLength() {
			return ASM_SF_910020_PARMS_880_LENGTH;
		}

}
  
