package com.cloudframe.app.ms00d363.dto;

/**
*  The class SavProduct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SavProduct extends SavProductSerialized {
   

								private long saveProcId;

						private char[] saveInterType = Field.fillLowValue(1);

						private char[] saveInstId = Field.fillLowValue(10);

						private char[] saveBinId = Field.fillLowValue(11);

						private char[] saveCntry = Field.fillLowValue(3);

						private char[] saveCurrency = Field.fillLowValue(3);

						private char[] saveExponent = Field.fillLowValue(1);

						private char[] saveSettServId = Field.fillLowValue(3);

								private long saveIca;

						private char[] saveIsisAgreeNum = Field.fillLowValue(4);

								private int saveProd;
	
	/**
	* Constructor for SavProduct
	**/
    public SavProduct() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of saveProcId
	 *	@return saveProcId
	 */
	public long getSaveProcId() throws CFException {
       if (isSaveProcIdModified()) { 
           saveProcId = refreshSaveProcId();
        }
   		return saveProcId;
	}
	

	
	   
	/**
	 * 	Update SaveProcId with the passed value
	 *  Corresponding COBOL Variable is WS-SAVE-PROC-ID
	 *	@param number
	 */
	public void setSaveProcId(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    saveProcId = checkSaveProcIdMaxLimit(number); 
		serializeSaveProcId(saveProcId);
	}
	

	/**
	 * 	Update SaveProcId with the passed value
	 *	@param value (String or char[])
	 */
	public void setSaveProcId(char[] value) throws CFException {
		 saveProcId = serializeSaveProcId(value);
	}
	/**
	 * 	Update SaveProcId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSaveProcIdString(char[] value) throws CFException {
		 setSaveProcId(value);
	}
	/**
	 *	Returns the value of saveInterType
	 *	@return saveInterType
	 */
   public char[] getSaveInterType() throws CFException{
     if (isSaveInterTypeModified()) { 
        saveInterType = refreshSaveInterType();
     }
   		return saveInterType;
   }

  
	/**
	*  set variable saveInterType
	*  Corresponding COBOL Variable is WS-SAVE-INTER-TYPE
	*  @param value
	**/
   public void setSaveInterType(char[] value) {
      saveInterType = checkSaveInterTypeConstraints(value);
      serializeSaveInterType(saveInterType);
   } 

     /**
	 * 	Update SaveInterType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSaveInterType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSaveInterType,saveInterType.length);
   	
   }
   
   public void setSaveInterType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSaveInterType,saveInterType.length);
   	
   }
   
     /**
	 * 	Update SaveInterType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSaveInterType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSaveInterType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SaveInterType with another Field
	 *	@param value
	 */
   public void setSaveInterType(Field source) {
       replace(source,0,source.length(),beginSaveInterType,SAVE_INTER_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update SaveInterType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSaveInterType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSaveInterType,SAVE_INTER_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update SaveInterType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSaveInterType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSaveInterType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of saveInstId
	 *	@return saveInstId
	 */
   public char[] getSaveInstId() throws CFException{
     if (isSaveInstIdModified()) { 
        saveInstId = refreshSaveInstId();
     }
   		return saveInstId;
   }

  
	/**
	*  set variable saveInstId
	*  Corresponding COBOL Variable is WS-SAVE-INST-ID
	*  @param value
	**/
   public void setSaveInstId(char[] value) {
      saveInstId = checkSaveInstIdConstraints(value);
      serializeSaveInstId(saveInstId);
   } 

     /**
	 * 	Update SaveInstId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSaveInstId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSaveInstId,saveInstId.length);
   	
   }
   
   public void setSaveInstId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSaveInstId,saveInstId.length);
   	
   }
   
     /**
	 * 	Update SaveInstId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSaveInstId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSaveInstId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SaveInstId with another Field
	 *	@param value
	 */
   public void setSaveInstId(Field source) {
       replace(source,0,source.length(),beginSaveInstId,SAVE_INST_ID_LEN);
   	
   }  
   
     /**
	 * 	Update SaveInstId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSaveInstId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSaveInstId,SAVE_INST_ID_LEN);
   	
   }
   
     /**
	 * 	Update SaveInstId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSaveInstId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSaveInstId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of saveBinId
	 *	@return saveBinId
	 */
   public char[] getSaveBinId() throws CFException{
     if (isSaveBinIdModified()) { 
        saveBinId = refreshSaveBinId();
     }
   		return saveBinId;
   }

  
	/**
	*  set variable saveBinId
	*  Corresponding COBOL Variable is WS-SAVE-BIN-ID
	*  @param value
	**/
   public void setSaveBinId(char[] value) {
      saveBinId = checkSaveBinIdConstraints(value);
      serializeSaveBinId(saveBinId);
   } 

     /**
	 * 	Update SaveBinId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSaveBinId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSaveBinId,saveBinId.length);
   	
   }
   
   public void setSaveBinId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSaveBinId,saveBinId.length);
   	
   }
   
     /**
	 * 	Update SaveBinId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSaveBinId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSaveBinId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SaveBinId with another Field
	 *	@param value
	 */
   public void setSaveBinId(Field source) {
       replace(source,0,source.length(),beginSaveBinId,SAVE_BIN_ID_LEN);
   	
   }  
   
     /**
	 * 	Update SaveBinId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSaveBinId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSaveBinId,SAVE_BIN_ID_LEN);
   	
   }
   
     /**
	 * 	Update SaveBinId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSaveBinId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSaveBinId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of saveCntry
	 *	@return saveCntry
	 */
   public char[] getSaveCntry() throws CFException{
     if (isSaveCntryModified()) { 
        saveCntry = refreshSaveCntry();
     }
   		return saveCntry;
   }

  
	/**
	*  set variable saveCntry
	*  Corresponding COBOL Variable is WS-SAVE-CNTRY
	*  @param value
	**/
   public void setSaveCntry(char[] value) {
      saveCntry = checkSaveCntryConstraints(value);
      serializeSaveCntry(saveCntry);
   } 

     /**
	 * 	Update SaveCntry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSaveCntry(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSaveCntry,saveCntry.length);
   	
   }
   
   public void setSaveCntry(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSaveCntry,saveCntry.length);
   	
   }
   
     /**
	 * 	Update SaveCntry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSaveCntry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSaveCntry+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SaveCntry with another Field
	 *	@param value
	 */
   public void setSaveCntry(Field source) {
       replace(source,0,source.length(),beginSaveCntry,SAVE_CNTRY_LEN);
   	
   }  
   
     /**
	 * 	Update SaveCntry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSaveCntry(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSaveCntry,SAVE_CNTRY_LEN);
   	
   }
   
     /**
	 * 	Update SaveCntry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSaveCntry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSaveCntry+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of saveCurrency
	 *	@return saveCurrency
	 */
   public char[] getSaveCurrency() throws CFException{
     if (isSaveCurrencyModified()) { 
        saveCurrency = refreshSaveCurrency();
     }
   		return saveCurrency;
   }

  
	/**
	*  set variable saveCurrency
	*  Corresponding COBOL Variable is WS-SAVE-CURRENCY
	*  @param value
	**/
   public void setSaveCurrency(char[] value) {
      saveCurrency = checkSaveCurrencyConstraints(value);
      serializeSaveCurrency(saveCurrency);
   } 

     /**
	 * 	Update SaveCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSaveCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSaveCurrency,saveCurrency.length);
   	
   }
   
   public void setSaveCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSaveCurrency,saveCurrency.length);
   	
   }
   
     /**
	 * 	Update SaveCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSaveCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSaveCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SaveCurrency with another Field
	 *	@param value
	 */
   public void setSaveCurrency(Field source) {
       replace(source,0,source.length(),beginSaveCurrency,SAVE_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update SaveCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSaveCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSaveCurrency,SAVE_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update SaveCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSaveCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSaveCurrency+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of saveExponent
	 *	@return saveExponent
	 */
   public char[] getSaveExponent() throws CFException{
     if (isSaveExponentModified()) { 
        saveExponent = refreshSaveExponent();
     }
   		return saveExponent;
   }

  
	/**
	*  set variable saveExponent
	*  Corresponding COBOL Variable is WS-SAVE-EXPONENT
	*  @param value
	**/
   public void setSaveExponent(char[] value) {
      saveExponent = checkSaveExponentConstraints(value);
      serializeSaveExponent(saveExponent);
   } 

     /**
	 * 	Update SaveExponent 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSaveExponent(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSaveExponent,saveExponent.length);
   	
   }
   
   public void setSaveExponent(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSaveExponent,saveExponent.length);
   	
   }
   
     /**
	 * 	Update SaveExponent 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSaveExponent(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSaveExponent+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SaveExponent with another Field
	 *	@param value
	 */
   public void setSaveExponent(Field source) {
       replace(source,0,source.length(),beginSaveExponent,SAVE_EXPONENT_LEN);
   	
   }  
   
     /**
	 * 	Update SaveExponent 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSaveExponent(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSaveExponent,SAVE_EXPONENT_LEN);
   	
   }
   
     /**
	 * 	Update SaveExponent 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSaveExponent(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSaveExponent+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of saveSettServId
	 *	@return saveSettServId
	 */
   public char[] getSaveSettServId() throws CFException{
     if (isSaveSettServIdModified()) { 
        saveSettServId = refreshSaveSettServId();
     }
   		return saveSettServId;
   }

  
	/**
	*  set variable saveSettServId
	*  Corresponding COBOL Variable is WS-SAVE-SETT-SERV-ID
	*  @param value
	**/
   public void setSaveSettServId(char[] value) {
      saveSettServId = checkSaveSettServIdConstraints(value);
      serializeSaveSettServId(saveSettServId);
   } 

     /**
	 * 	Update SaveSettServId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSaveSettServId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSaveSettServId,saveSettServId.length);
   	
   }
   
   public void setSaveSettServId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSaveSettServId,saveSettServId.length);
   	
   }
   
     /**
	 * 	Update SaveSettServId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSaveSettServId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSaveSettServId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SaveSettServId with another Field
	 *	@param value
	 */
   public void setSaveSettServId(Field source) {
       replace(source,0,source.length(),beginSaveSettServId,SAVE_SETT_SERV_ID_LEN);
   	
   }  
   
     /**
	 * 	Update SaveSettServId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSaveSettServId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSaveSettServId,SAVE_SETT_SERV_ID_LEN);
   	
   }
   
     /**
	 * 	Update SaveSettServId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSaveSettServId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSaveSettServId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of saveIca
	 *	@return saveIca
	 */
	public long getSaveIca() throws CFException {
       if (isSaveIcaModified()) { 
           saveIca = refreshSaveIca();
        }
   		return saveIca;
	}
	

	
	   
	/**
	 * 	Update SaveIca with the passed value
	 *  Corresponding COBOL Variable is WS-SAVE-ICA
	 *	@param number
	 */
	public void setSaveIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    saveIca = checkSaveIcaMaxLimit(number); 
		serializeSaveIca(saveIca);
	}
	

	/**
	 * 	Update SaveIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setSaveIca(char[] value) throws CFException {
		 saveIca = serializeSaveIca(value);
	}
	/**
	 * 	Update SaveIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSaveIcaString(char[] value) throws CFException {
		 setSaveIca(value);
	}
	/**
	 *	Returns the value of saveIsisAgreeNum
	 *	@return saveIsisAgreeNum
	 */
   public char[] getSaveIsisAgreeNum() throws CFException{
     if (isSaveIsisAgreeNumModified()) { 
        saveIsisAgreeNum = refreshSaveIsisAgreeNum();
     }
   		return saveIsisAgreeNum;
   }

  
	/**
	*  set variable saveIsisAgreeNum
	*  Corresponding COBOL Variable is WS-SAVE-ISIS-AGREE-NUM
	*  @param value
	**/
   public void setSaveIsisAgreeNum(char[] value) {
      saveIsisAgreeNum = checkSaveIsisAgreeNumConstraints(value);
      serializeSaveIsisAgreeNum(saveIsisAgreeNum);
   } 

     /**
	 * 	Update SaveIsisAgreeNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSaveIsisAgreeNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSaveIsisAgreeNum,saveIsisAgreeNum.length);
   	
   }
   
   public void setSaveIsisAgreeNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSaveIsisAgreeNum,saveIsisAgreeNum.length);
   	
   }
   
     /**
	 * 	Update SaveIsisAgreeNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSaveIsisAgreeNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSaveIsisAgreeNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SaveIsisAgreeNum with another Field
	 *	@param value
	 */
   public void setSaveIsisAgreeNum(Field source) {
       replace(source,0,source.length(),beginSaveIsisAgreeNum,SAVE_ISIS_AGREE_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update SaveIsisAgreeNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSaveIsisAgreeNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSaveIsisAgreeNum,SAVE_ISIS_AGREE_NUM_LEN);
   	
   }
   
     /**
	 * 	Update SaveIsisAgreeNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSaveIsisAgreeNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSaveIsisAgreeNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of saveProd
	 *	@return saveProd
	 */
	public int getSaveProd() throws CFException {
       if (isSaveProdModified()) { 
           saveProd = refreshSaveProd();
        }
   		return saveProd;
	}
	

	
	   
	/**
	 * 	Update SaveProd with the passed value
	 *  Corresponding COBOL Variable is WS-SAVE-PROD
	 *	@param number
	 */
	public void setSaveProd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    saveProd = checkSaveProdMaxLimit(number); 
		serializeSaveProd(saveProd);
	}
	

	public void setSaveProd(long number) {
	    number = checkSaveProdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSaveProd((int)number);
	}
	
	/**
	 * 	Update SaveProd with the passed value
	 *	@param value (String or char[])
	 */
	public void setSaveProd(char[] value) throws CFException {
		 saveProd = serializeSaveProd(value);
	}
	/**
	 * 	Update SaveProd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSaveProdString(char[] value) throws CFException {
		 setSaveProd(value);
	}

	
	
	

		public static int getSavProductFieldLength() {
			return SAV_PRODUCT_LENGTH;
		}

}
  
