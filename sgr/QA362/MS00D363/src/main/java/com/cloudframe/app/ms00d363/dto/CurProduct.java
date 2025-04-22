package com.cloudframe.app.ms00d363.dto;

/**
*  The class CurProduct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CurProduct extends CurProductSerialized {
   

								private long currProcId;

						private char[] currInterType = Field.fillLowValue(1);

						private char[] currInstId = Field.fillLowValue(10);

						private char[] currBinId = Field.fillLowValue(11);

						private char[] currCntry = Field.fillLowValue(3);

						private char[] currCurrency = Field.fillLowValue(3);

						private char[] currExponent = Field.fillLowValue(1);

						private char[] currSettServId = Field.fillLowValue(3);

								private long currIca;

						private char[] currIsisAgreeNum = Field.fillLowValue(4);

								private int currProd;
	
	/**
	* Constructor for CurProduct
	**/
    public CurProduct() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of currProcId
	 *	@return currProcId
	 */
	public long getCurrProcId() throws CFException {
       if (isCurrProcIdModified()) { 
           currProcId = refreshCurrProcId();
        }
   		return currProcId;
	}
	

	
	   
	/**
	 * 	Update CurrProcId with the passed value
	 *  Corresponding COBOL Variable is WS-CURR-PROC-ID
	 *	@param number
	 */
	public void setCurrProcId(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    currProcId = checkCurrProcIdMaxLimit(number); 
		serializeCurrProcId(currProcId);
	}
	

	/**
	 * 	Update CurrProcId with the passed value
	 *	@param value (String or char[])
	 */
	public void setCurrProcId(char[] value) throws CFException {
		 currProcId = serializeCurrProcId(value);
	}
	/**
	 * 	Update CurrProcId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCurrProcIdString(char[] value) throws CFException {
		 setCurrProcId(value);
	}
	/**
	 *	Returns the value of currInterType
	 *	@return currInterType
	 */
   public char[] getCurrInterType() throws CFException{
     if (isCurrInterTypeModified()) { 
        currInterType = refreshCurrInterType();
     }
   		return currInterType;
   }

  
	/**
	*  set variable currInterType
	*  Corresponding COBOL Variable is WS-CURR-INTER-TYPE
	*  @param value
	**/
   public void setCurrInterType(char[] value) {
      currInterType = checkCurrInterTypeConstraints(value);
      serializeCurrInterType(currInterType);
   } 

     /**
	 * 	Update CurrInterType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrInterType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrInterType,currInterType.length);
   	
   }
   
   public void setCurrInterType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrInterType,currInterType.length);
   	
   }
   
     /**
	 * 	Update CurrInterType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrInterType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrInterType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrInterType with another Field
	 *	@param value
	 */
   public void setCurrInterType(Field source) {
       replace(source,0,source.length(),beginCurrInterType,CURR_INTER_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update CurrInterType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrInterType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrInterType,CURR_INTER_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update CurrInterType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrInterType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrInterType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currInstId
	 *	@return currInstId
	 */
   public char[] getCurrInstId() throws CFException{
     if (isCurrInstIdModified()) { 
        currInstId = refreshCurrInstId();
     }
   		return currInstId;
   }

  
	/**
	*  set variable currInstId
	*  Corresponding COBOL Variable is WS-CURR-INST-ID
	*  @param value
	**/
   public void setCurrInstId(char[] value) {
      currInstId = checkCurrInstIdConstraints(value);
      serializeCurrInstId(currInstId);
   } 

     /**
	 * 	Update CurrInstId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrInstId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrInstId,currInstId.length);
   	
   }
   
   public void setCurrInstId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrInstId,currInstId.length);
   	
   }
   
     /**
	 * 	Update CurrInstId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrInstId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrInstId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrInstId with another Field
	 *	@param value
	 */
   public void setCurrInstId(Field source) {
       replace(source,0,source.length(),beginCurrInstId,CURR_INST_ID_LEN);
   	
   }  
   
     /**
	 * 	Update CurrInstId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrInstId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrInstId,CURR_INST_ID_LEN);
   	
   }
   
     /**
	 * 	Update CurrInstId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrInstId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrInstId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currBinId
	 *	@return currBinId
	 */
   public char[] getCurrBinId() throws CFException{
     if (isCurrBinIdModified()) { 
        currBinId = refreshCurrBinId();
     }
   		return currBinId;
   }

  
	/**
	*  set variable currBinId
	*  Corresponding COBOL Variable is WS-CURR-BIN-ID
	*  @param value
	**/
   public void setCurrBinId(char[] value) {
      currBinId = checkCurrBinIdConstraints(value);
      serializeCurrBinId(currBinId);
   } 

     /**
	 * 	Update CurrBinId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrBinId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrBinId,currBinId.length);
   	
   }
   
   public void setCurrBinId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrBinId,currBinId.length);
   	
   }
   
     /**
	 * 	Update CurrBinId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrBinId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrBinId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrBinId with another Field
	 *	@param value
	 */
   public void setCurrBinId(Field source) {
       replace(source,0,source.length(),beginCurrBinId,CURR_BIN_ID_LEN);
   	
   }  
   
     /**
	 * 	Update CurrBinId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrBinId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrBinId,CURR_BIN_ID_LEN);
   	
   }
   
     /**
	 * 	Update CurrBinId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrBinId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrBinId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currCntry
	 *	@return currCntry
	 */
   public char[] getCurrCntry() throws CFException{
     if (isCurrCntryModified()) { 
        currCntry = refreshCurrCntry();
     }
   		return currCntry;
   }

  
	/**
	*  set variable currCntry
	*  Corresponding COBOL Variable is WS-CURR-CNTRY
	*  @param value
	**/
   public void setCurrCntry(char[] value) {
      currCntry = checkCurrCntryConstraints(value);
      serializeCurrCntry(currCntry);
   } 

     /**
	 * 	Update CurrCntry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrCntry(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrCntry,currCntry.length);
   	
   }
   
   public void setCurrCntry(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrCntry,currCntry.length);
   	
   }
   
     /**
	 * 	Update CurrCntry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrCntry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrCntry+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrCntry with another Field
	 *	@param value
	 */
   public void setCurrCntry(Field source) {
       replace(source,0,source.length(),beginCurrCntry,CURR_CNTRY_LEN);
   	
   }  
   
     /**
	 * 	Update CurrCntry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrCntry(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrCntry,CURR_CNTRY_LEN);
   	
   }
   
     /**
	 * 	Update CurrCntry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrCntry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrCntry+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currCurrency
	 *	@return currCurrency
	 */
   public char[] getCurrCurrency() throws CFException{
     if (isCurrCurrencyModified()) { 
        currCurrency = refreshCurrCurrency();
     }
   		return currCurrency;
   }

  
	/**
	*  set variable currCurrency
	*  Corresponding COBOL Variable is WS-CURR-CURRENCY
	*  @param value
	**/
   public void setCurrCurrency(char[] value) {
      currCurrency = checkCurrCurrencyConstraints(value);
      serializeCurrCurrency(currCurrency);
   } 

     /**
	 * 	Update CurrCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrCurrency,currCurrency.length);
   	
   }
   
   public void setCurrCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrCurrency,currCurrency.length);
   	
   }
   
     /**
	 * 	Update CurrCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrCurrency with another Field
	 *	@param value
	 */
   public void setCurrCurrency(Field source) {
       replace(source,0,source.length(),beginCurrCurrency,CURR_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update CurrCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrCurrency,CURR_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update CurrCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrCurrency+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currExponent
	 *	@return currExponent
	 */
   public char[] getCurrExponent() throws CFException{
     if (isCurrExponentModified()) { 
        currExponent = refreshCurrExponent();
     }
   		return currExponent;
   }

  
	/**
	*  set variable currExponent
	*  Corresponding COBOL Variable is WS-CURR-EXPONENT
	*  @param value
	**/
   public void setCurrExponent(char[] value) {
      currExponent = checkCurrExponentConstraints(value);
      serializeCurrExponent(currExponent);
   } 

     /**
	 * 	Update CurrExponent 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrExponent(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrExponent,currExponent.length);
   	
   }
   
   public void setCurrExponent(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrExponent,currExponent.length);
   	
   }
   
     /**
	 * 	Update CurrExponent 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrExponent(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrExponent+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrExponent with another Field
	 *	@param value
	 */
   public void setCurrExponent(Field source) {
       replace(source,0,source.length(),beginCurrExponent,CURR_EXPONENT_LEN);
   	
   }  
   
     /**
	 * 	Update CurrExponent 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrExponent(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrExponent,CURR_EXPONENT_LEN);
   	
   }
   
     /**
	 * 	Update CurrExponent 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrExponent(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrExponent+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currSettServId
	 *	@return currSettServId
	 */
   public char[] getCurrSettServId() throws CFException{
     if (isCurrSettServIdModified()) { 
        currSettServId = refreshCurrSettServId();
     }
   		return currSettServId;
   }

  
	/**
	*  set variable currSettServId
	*  Corresponding COBOL Variable is WS-CURR-SETT-SERV-ID
	*  @param value
	**/
   public void setCurrSettServId(char[] value) {
      currSettServId = checkCurrSettServIdConstraints(value);
      serializeCurrSettServId(currSettServId);
   } 

     /**
	 * 	Update CurrSettServId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrSettServId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrSettServId,currSettServId.length);
   	
   }
   
   public void setCurrSettServId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrSettServId,currSettServId.length);
   	
   }
   
     /**
	 * 	Update CurrSettServId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrSettServId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrSettServId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrSettServId with another Field
	 *	@param value
	 */
   public void setCurrSettServId(Field source) {
       replace(source,0,source.length(),beginCurrSettServId,CURR_SETT_SERV_ID_LEN);
   	
   }  
   
     /**
	 * 	Update CurrSettServId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrSettServId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrSettServId,CURR_SETT_SERV_ID_LEN);
   	
   }
   
     /**
	 * 	Update CurrSettServId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrSettServId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrSettServId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currIca
	 *	@return currIca
	 */
	public long getCurrIca() throws CFException {
       if (isCurrIcaModified()) { 
           currIca = refreshCurrIca();
        }
   		return currIca;
	}
	

	
	   
	/**
	 * 	Update CurrIca with the passed value
	 *  Corresponding COBOL Variable is WS-CURR-ICA
	 *	@param number
	 */
	public void setCurrIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    currIca = checkCurrIcaMaxLimit(number); 
		serializeCurrIca(currIca);
	}
	

	/**
	 * 	Update CurrIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setCurrIca(char[] value) throws CFException {
		 currIca = serializeCurrIca(value);
	}
	/**
	 * 	Update CurrIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCurrIcaString(char[] value) throws CFException {
		 setCurrIca(value);
	}
	/**
	 *	Returns the value of currIsisAgreeNum
	 *	@return currIsisAgreeNum
	 */
   public char[] getCurrIsisAgreeNum() throws CFException{
     if (isCurrIsisAgreeNumModified()) { 
        currIsisAgreeNum = refreshCurrIsisAgreeNum();
     }
   		return currIsisAgreeNum;
   }

  
	/**
	*  set variable currIsisAgreeNum
	*  Corresponding COBOL Variable is WS-CURR-ISIS-AGREE-NUM
	*  @param value
	**/
   public void setCurrIsisAgreeNum(char[] value) {
      currIsisAgreeNum = checkCurrIsisAgreeNumConstraints(value);
      serializeCurrIsisAgreeNum(currIsisAgreeNum);
   } 

     /**
	 * 	Update CurrIsisAgreeNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrIsisAgreeNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrIsisAgreeNum,currIsisAgreeNum.length);
   	
   }
   
   public void setCurrIsisAgreeNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrIsisAgreeNum,currIsisAgreeNum.length);
   	
   }
   
     /**
	 * 	Update CurrIsisAgreeNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrIsisAgreeNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrIsisAgreeNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrIsisAgreeNum with another Field
	 *	@param value
	 */
   public void setCurrIsisAgreeNum(Field source) {
       replace(source,0,source.length(),beginCurrIsisAgreeNum,CURR_ISIS_AGREE_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update CurrIsisAgreeNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrIsisAgreeNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrIsisAgreeNum,CURR_ISIS_AGREE_NUM_LEN);
   	
   }
   
     /**
	 * 	Update CurrIsisAgreeNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrIsisAgreeNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrIsisAgreeNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currProd
	 *	@return currProd
	 */
	public int getCurrProd() throws CFException {
       if (isCurrProdModified()) { 
           currProd = refreshCurrProd();
        }
   		return currProd;
	}
	

	
	   
	/**
	 * 	Update CurrProd with the passed value
	 *  Corresponding COBOL Variable is WS-CURR-PROD
	 *	@param number
	 */
	public void setCurrProd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    currProd = checkCurrProdMaxLimit(number); 
		serializeCurrProd(currProd);
	}
	

	public void setCurrProd(long number) {
	    number = checkCurrProdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCurrProd((int)number);
	}
	
	/**
	 * 	Update CurrProd with the passed value
	 *	@param value (String or char[])
	 */
	public void setCurrProd(char[] value) throws CFException {
		 currProd = serializeCurrProd(value);
	}
	/**
	 * 	Update CurrProd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCurrProdString(char[] value) throws CFException {
		 setCurrProd(value);
	}

	
	
	

		public static int getCurProductFieldLength() {
			return CUR_PRODUCT_LENGTH;
		}

}
  
