package com.cloudframe.app.ip343690.dto;

/**
*  The class Tipapma is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.ip343690.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Tipapma extends TipapmaSerialized {
   

						private char[] tipapmaVrtlAcctNum = Field.fillLowValue(19);

						private char[] tipapmaCrteUpdtTs = Field.fillLowValue(26);

						private char[] tipapmaPrimAcctNum = Field.fillLowValue(19);

						private char[] tipapmaPrimAcctSeqNum = Field.fillLowValue(3);
	
	/**
	* Constructor for Tipapma
	**/
    public Tipapma() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of tipapmaVrtlAcctNum
	 *	@return tipapmaVrtlAcctNum
	 */
   public char[] getTipapmaVrtlAcctNum() throws CFException{
     if (isTipapmaVrtlAcctNumModified()) { 
        tipapmaVrtlAcctNum = refreshTipapmaVrtlAcctNum();
     }
   		return tipapmaVrtlAcctNum;
   }

  
	/**
	*  set variable tipapmaVrtlAcctNum
	*  Corresponding COBOL Variable is TIPAPMA-VRTL-ACCT-NUM
	*  @param value
	**/
   public void setTipapmaVrtlAcctNum(char[] value) {
      tipapmaVrtlAcctNum = checkTipapmaVrtlAcctNumConstraints(value);
      serializeTipapmaVrtlAcctNum(tipapmaVrtlAcctNum);
   } 

     /**
	 * 	Update TipapmaVrtlAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTipapmaVrtlAcctNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTipapmaVrtlAcctNum,tipapmaVrtlAcctNum.length);
   	
   }
   
   public void setTipapmaVrtlAcctNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTipapmaVrtlAcctNum,tipapmaVrtlAcctNum.length);
   	
   }
   
     /**
	 * 	Update TipapmaVrtlAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaVrtlAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTipapmaVrtlAcctNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TipapmaVrtlAcctNum with another Field
	 *	@param value
	 */
   public void setTipapmaVrtlAcctNum(Field source) {
       replace(source,0,source.length(),beginTipapmaVrtlAcctNum,TIPAPMA_VRTL_ACCT_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update TipapmaVrtlAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTipapmaVrtlAcctNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTipapmaVrtlAcctNum,TIPAPMA_VRTL_ACCT_NUM_LEN);
   	
   }
   
     /**
	 * 	Update TipapmaVrtlAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaVrtlAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTipapmaVrtlAcctNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tipapmaCrteUpdtTs
	 *	@return tipapmaCrteUpdtTs
	 */
   public char[] getTipapmaCrteUpdtTs() throws CFException{
     if (isTipapmaCrteUpdtTsModified()) { 
        tipapmaCrteUpdtTs = refreshTipapmaCrteUpdtTs();
     }
   		return tipapmaCrteUpdtTs;
   }

  
	/**
	*  set variable tipapmaCrteUpdtTs
	*  Corresponding COBOL Variable is TIPAPMA-CRTE-UPDT-TS
	*  @param value
	**/
   public void setTipapmaCrteUpdtTs(char[] value) {
      tipapmaCrteUpdtTs = checkTipapmaCrteUpdtTsConstraints(value);
      serializeTipapmaCrteUpdtTs(tipapmaCrteUpdtTs);
   } 

     /**
	 * 	Update TipapmaCrteUpdtTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTipapmaCrteUpdtTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTipapmaCrteUpdtTs,tipapmaCrteUpdtTs.length);
   	
   }
   
   public void setTipapmaCrteUpdtTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTipapmaCrteUpdtTs,tipapmaCrteUpdtTs.length);
   	
   }
   
     /**
	 * 	Update TipapmaCrteUpdtTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaCrteUpdtTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTipapmaCrteUpdtTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TipapmaCrteUpdtTs with another Field
	 *	@param value
	 */
   public void setTipapmaCrteUpdtTs(Field source) {
       replace(source,0,source.length(),beginTipapmaCrteUpdtTs,TIPAPMA_CRTE_UPDT_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TipapmaCrteUpdtTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTipapmaCrteUpdtTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTipapmaCrteUpdtTs,TIPAPMA_CRTE_UPDT_TS_LEN);
   	
   }
   
     /**
	 * 	Update TipapmaCrteUpdtTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaCrteUpdtTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTipapmaCrteUpdtTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tipapmaPrimAcctNum
	 *	@return tipapmaPrimAcctNum
	 */
   public char[] getTipapmaPrimAcctNum() throws CFException{
     if (isTipapmaPrimAcctNumModified()) { 
        tipapmaPrimAcctNum = refreshTipapmaPrimAcctNum();
     }
   		return tipapmaPrimAcctNum;
   }

  
	/**
	*  set variable tipapmaPrimAcctNum
	*  Corresponding COBOL Variable is TIPAPMA-PRIM-ACCT-NUM
	*  @param value
	**/
   public void setTipapmaPrimAcctNum(char[] value) {
      tipapmaPrimAcctNum = checkTipapmaPrimAcctNumConstraints(value);
      serializeTipapmaPrimAcctNum(tipapmaPrimAcctNum);
   } 

     /**
	 * 	Update TipapmaPrimAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTipapmaPrimAcctNum,tipapmaPrimAcctNum.length);
   	
   }
   
   public void setTipapmaPrimAcctNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTipapmaPrimAcctNum,tipapmaPrimAcctNum.length);
   	
   }
   
     /**
	 * 	Update TipapmaPrimAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTipapmaPrimAcctNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TipapmaPrimAcctNum with another Field
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(Field source) {
       replace(source,0,source.length(),beginTipapmaPrimAcctNum,TIPAPMA_PRIM_ACCT_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update TipapmaPrimAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTipapmaPrimAcctNum,TIPAPMA_PRIM_ACCT_NUM_LEN);
   	
   }
   
     /**
	 * 	Update TipapmaPrimAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTipapmaPrimAcctNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tipapmaPrimAcctSeqNum
	 *	@return tipapmaPrimAcctSeqNum
	 */
   public char[] getTipapmaPrimAcctSeqNum() throws CFException{
     if (isTipapmaPrimAcctSeqNumModified()) { 
        tipapmaPrimAcctSeqNum = refreshTipapmaPrimAcctSeqNum();
     }
   		return tipapmaPrimAcctSeqNum;
   }

  
	/**
	*  set variable tipapmaPrimAcctSeqNum
	*  Corresponding COBOL Variable is TIPAPMA-PRIM-ACCT-SEQ-NUM
	*  @param value
	**/
   public void setTipapmaPrimAcctSeqNum(char[] value) {
      tipapmaPrimAcctSeqNum = checkTipapmaPrimAcctSeqNumConstraints(value);
      serializeTipapmaPrimAcctSeqNum(tipapmaPrimAcctSeqNum);
   } 

     /**
	 * 	Update TipapmaPrimAcctSeqNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTipapmaPrimAcctSeqNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTipapmaPrimAcctSeqNum,tipapmaPrimAcctSeqNum.length);
   	
   }
   
   public void setTipapmaPrimAcctSeqNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTipapmaPrimAcctSeqNum,tipapmaPrimAcctSeqNum.length);
   	
   }
   
     /**
	 * 	Update TipapmaPrimAcctSeqNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaPrimAcctSeqNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTipapmaPrimAcctSeqNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TipapmaPrimAcctSeqNum with another Field
	 *	@param value
	 */
   public void setTipapmaPrimAcctSeqNum(Field source) {
       replace(source,0,source.length(),beginTipapmaPrimAcctSeqNum,TIPAPMA_PRIM_ACCT_SEQ_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update TipapmaPrimAcctSeqNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTipapmaPrimAcctSeqNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTipapmaPrimAcctSeqNum,TIPAPMA_PRIM_ACCT_SEQ_NUM_LEN);
   	
   }
   
     /**
	 * 	Update TipapmaPrimAcctSeqNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaPrimAcctSeqNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTipapmaPrimAcctSeqNum+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTipapmaFieldLength() {
			return TIPAPMA_LENGTH;
		}

}
  
