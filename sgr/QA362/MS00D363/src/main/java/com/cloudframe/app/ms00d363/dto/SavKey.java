package com.cloudframe.app.ms00d363.dto;

/**
*  The class SavKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SavKey extends SavKeySerialized {
   

								private long savProcId;

						private char[] savInterType = Field.fillLowValue(1);

						private char[] savInstId = Field.fillLowValue(10);

						private char[] savBinId = Field.fillLowValue(11);

						private char[] savCntry = Field.fillLowValue(3);

						private char[] savCurrency = Field.fillLowValue(3);

						private char[] savExponent = Field.fillLowValue(1);

						private char[] savSettServId = Field.fillLowValue(3);

								private long savIca;

						private char[] savIsisAgreeNum = Field.fillLowValue(4);
	
	/**
	* Constructor for SavKey
	**/
    public SavKey() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of savProcId
	 *	@return savProcId
	 */
	public long getSavProcId() throws CFException {
       if (isSavProcIdModified()) { 
           savProcId = refreshSavProcId();
        }
   		return savProcId;
	}
	

	
	   
	/**
	 * 	Update SavProcId with the passed value
	 *  Corresponding COBOL Variable is WS-SAV-PROC-ID
	 *	@param number
	 */
	public void setSavProcId(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    savProcId = checkSavProcIdMaxLimit(number); 
		serializeSavProcId(savProcId);
	}
	

	/**
	 * 	Update SavProcId with the passed value
	 *	@param value (String or char[])
	 */
	public void setSavProcId(char[] value) throws CFException {
		 savProcId = serializeSavProcId(value);
	}
	/**
	 * 	Update SavProcId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSavProcIdString(char[] value) throws CFException {
		 setSavProcId(value);
	}
	/**
	 *	Returns the value of savInterType
	 *	@return savInterType
	 */
   public char[] getSavInterType() throws CFException{
     if (isSavInterTypeModified()) { 
        savInterType = refreshSavInterType();
     }
   		return savInterType;
   }

  
	/**
	*  set variable savInterType
	*  Corresponding COBOL Variable is WS-SAV-INTER-TYPE
	*  @param value
	**/
   public void setSavInterType(char[] value) {
      savInterType = checkSavInterTypeConstraints(value);
      serializeSavInterType(savInterType);
   } 

     /**
	 * 	Update SavInterType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSavInterType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSavInterType,savInterType.length);
   	
   }
   
   public void setSavInterType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSavInterType,savInterType.length);
   	
   }
   
     /**
	 * 	Update SavInterType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavInterType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavInterType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SavInterType with another Field
	 *	@param value
	 */
   public void setSavInterType(Field source) {
       replace(source,0,source.length(),beginSavInterType,SAV_INTER_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update SavInterType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSavInterType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSavInterType,SAV_INTER_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update SavInterType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavInterType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavInterType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of savInstId
	 *	@return savInstId
	 */
   public char[] getSavInstId() throws CFException{
     if (isSavInstIdModified()) { 
        savInstId = refreshSavInstId();
     }
   		return savInstId;
   }

  
	/**
	*  set variable savInstId
	*  Corresponding COBOL Variable is WS-SAV-INST-ID
	*  @param value
	**/
   public void setSavInstId(char[] value) {
      savInstId = checkSavInstIdConstraints(value);
      serializeSavInstId(savInstId);
   } 

     /**
	 * 	Update SavInstId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSavInstId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSavInstId,savInstId.length);
   	
   }
   
   public void setSavInstId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSavInstId,savInstId.length);
   	
   }
   
     /**
	 * 	Update SavInstId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavInstId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavInstId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SavInstId with another Field
	 *	@param value
	 */
   public void setSavInstId(Field source) {
       replace(source,0,source.length(),beginSavInstId,SAV_INST_ID_LEN);
   	
   }  
   
     /**
	 * 	Update SavInstId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSavInstId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSavInstId,SAV_INST_ID_LEN);
   	
   }
   
     /**
	 * 	Update SavInstId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavInstId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavInstId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of savBinId
	 *	@return savBinId
	 */
   public char[] getSavBinId() throws CFException{
     if (isSavBinIdModified()) { 
        savBinId = refreshSavBinId();
     }
   		return savBinId;
   }

  
	/**
	*  set variable savBinId
	*  Corresponding COBOL Variable is WS-SAV-BIN-ID
	*  @param value
	**/
   public void setSavBinId(char[] value) {
      savBinId = checkSavBinIdConstraints(value);
      serializeSavBinId(savBinId);
   } 

     /**
	 * 	Update SavBinId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSavBinId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSavBinId,savBinId.length);
   	
   }
   
   public void setSavBinId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSavBinId,savBinId.length);
   	
   }
   
     /**
	 * 	Update SavBinId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavBinId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavBinId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SavBinId with another Field
	 *	@param value
	 */
   public void setSavBinId(Field source) {
       replace(source,0,source.length(),beginSavBinId,SAV_BIN_ID_LEN);
   	
   }  
   
     /**
	 * 	Update SavBinId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSavBinId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSavBinId,SAV_BIN_ID_LEN);
   	
   }
   
     /**
	 * 	Update SavBinId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavBinId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavBinId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of savCntry
	 *	@return savCntry
	 */
   public char[] getSavCntry() throws CFException{
     if (isSavCntryModified()) { 
        savCntry = refreshSavCntry();
     }
   		return savCntry;
   }

  
	/**
	*  set variable savCntry
	*  Corresponding COBOL Variable is WS-SAV-CNTRY
	*  @param value
	**/
   public void setSavCntry(char[] value) {
      savCntry = checkSavCntryConstraints(value);
      serializeSavCntry(savCntry);
   } 

     /**
	 * 	Update SavCntry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSavCntry(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSavCntry,savCntry.length);
   	
   }
   
   public void setSavCntry(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSavCntry,savCntry.length);
   	
   }
   
     /**
	 * 	Update SavCntry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavCntry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavCntry+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SavCntry with another Field
	 *	@param value
	 */
   public void setSavCntry(Field source) {
       replace(source,0,source.length(),beginSavCntry,SAV_CNTRY_LEN);
   	
   }  
   
     /**
	 * 	Update SavCntry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSavCntry(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSavCntry,SAV_CNTRY_LEN);
   	
   }
   
     /**
	 * 	Update SavCntry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavCntry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavCntry+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of savCurrency
	 *	@return savCurrency
	 */
   public char[] getSavCurrency() throws CFException{
     if (isSavCurrencyModified()) { 
        savCurrency = refreshSavCurrency();
     }
   		return savCurrency;
   }

  
	/**
	*  set variable savCurrency
	*  Corresponding COBOL Variable is WS-SAV-CURRENCY
	*  @param value
	**/
   public void setSavCurrency(char[] value) {
      savCurrency = checkSavCurrencyConstraints(value);
      serializeSavCurrency(savCurrency);
   } 

     /**
	 * 	Update SavCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSavCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSavCurrency,savCurrency.length);
   	
   }
   
   public void setSavCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSavCurrency,savCurrency.length);
   	
   }
   
     /**
	 * 	Update SavCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SavCurrency with another Field
	 *	@param value
	 */
   public void setSavCurrency(Field source) {
       replace(source,0,source.length(),beginSavCurrency,SAV_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update SavCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSavCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSavCurrency,SAV_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update SavCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavCurrency+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of savExponent
	 *	@return savExponent
	 */
   public char[] getSavExponent() throws CFException{
     if (isSavExponentModified()) { 
        savExponent = refreshSavExponent();
     }
   		return savExponent;
   }

  
	/**
	*  set variable savExponent
	*  Corresponding COBOL Variable is WS-SAV-EXPONENT
	*  @param value
	**/
   public void setSavExponent(char[] value) {
      savExponent = checkSavExponentConstraints(value);
      serializeSavExponent(savExponent);
   } 

     /**
	 * 	Update SavExponent 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSavExponent(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSavExponent,savExponent.length);
   	
   }
   
   public void setSavExponent(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSavExponent,savExponent.length);
   	
   }
   
     /**
	 * 	Update SavExponent 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavExponent(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavExponent+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SavExponent with another Field
	 *	@param value
	 */
   public void setSavExponent(Field source) {
       replace(source,0,source.length(),beginSavExponent,SAV_EXPONENT_LEN);
   	
   }  
   
     /**
	 * 	Update SavExponent 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSavExponent(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSavExponent,SAV_EXPONENT_LEN);
   	
   }
   
     /**
	 * 	Update SavExponent 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavExponent(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavExponent+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of savSettServId
	 *	@return savSettServId
	 */
   public char[] getSavSettServId() throws CFException{
     if (isSavSettServIdModified()) { 
        savSettServId = refreshSavSettServId();
     }
   		return savSettServId;
   }

  
	/**
	*  set variable savSettServId
	*  Corresponding COBOL Variable is WS-SAV-SETT-SERV-ID
	*  @param value
	**/
   public void setSavSettServId(char[] value) {
      savSettServId = checkSavSettServIdConstraints(value);
      serializeSavSettServId(savSettServId);
   } 

     /**
	 * 	Update SavSettServId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSavSettServId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSavSettServId,savSettServId.length);
   	
   }
   
   public void setSavSettServId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSavSettServId,savSettServId.length);
   	
   }
   
     /**
	 * 	Update SavSettServId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavSettServId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavSettServId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SavSettServId with another Field
	 *	@param value
	 */
   public void setSavSettServId(Field source) {
       replace(source,0,source.length(),beginSavSettServId,SAV_SETT_SERV_ID_LEN);
   	
   }  
   
     /**
	 * 	Update SavSettServId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSavSettServId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSavSettServId,SAV_SETT_SERV_ID_LEN);
   	
   }
   
     /**
	 * 	Update SavSettServId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavSettServId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavSettServId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of savIca
	 *	@return savIca
	 */
	public long getSavIca() throws CFException {
       if (isSavIcaModified()) { 
           savIca = refreshSavIca();
        }
   		return savIca;
	}
	

	
	   
	/**
	 * 	Update SavIca with the passed value
	 *  Corresponding COBOL Variable is WS-SAV-ICA
	 *	@param number
	 */
	public void setSavIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    savIca = checkSavIcaMaxLimit(number); 
		serializeSavIca(savIca);
	}
	

	/**
	 * 	Update SavIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setSavIca(char[] value) throws CFException {
		 savIca = serializeSavIca(value);
	}
	/**
	 * 	Update SavIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSavIcaString(char[] value) throws CFException {
		 setSavIca(value);
	}
	/**
	 *	Returns the value of savIsisAgreeNum
	 *	@return savIsisAgreeNum
	 */
   public char[] getSavIsisAgreeNum() throws CFException{
     if (isSavIsisAgreeNumModified()) { 
        savIsisAgreeNum = refreshSavIsisAgreeNum();
     }
   		return savIsisAgreeNum;
   }

  
	/**
	*  set variable savIsisAgreeNum
	*  Corresponding COBOL Variable is WS-SAV-ISIS-AGREE-NUM
	*  @param value
	**/
   public void setSavIsisAgreeNum(char[] value) {
      savIsisAgreeNum = checkSavIsisAgreeNumConstraints(value);
      serializeSavIsisAgreeNum(savIsisAgreeNum);
   } 

     /**
	 * 	Update SavIsisAgreeNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSavIsisAgreeNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSavIsisAgreeNum,savIsisAgreeNum.length);
   	
   }
   
   public void setSavIsisAgreeNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSavIsisAgreeNum,savIsisAgreeNum.length);
   	
   }
   
     /**
	 * 	Update SavIsisAgreeNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavIsisAgreeNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavIsisAgreeNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SavIsisAgreeNum with another Field
	 *	@param value
	 */
   public void setSavIsisAgreeNum(Field source) {
       replace(source,0,source.length(),beginSavIsisAgreeNum,SAV_ISIS_AGREE_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update SavIsisAgreeNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSavIsisAgreeNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSavIsisAgreeNum,SAV_ISIS_AGREE_NUM_LEN);
   	
   }
   
     /**
	 * 	Update SavIsisAgreeNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavIsisAgreeNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavIsisAgreeNum+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSavKeyFieldLength() {
			return SAV_KEY_LENGTH;
		}

}
  
