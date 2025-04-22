package com.cloudframe.app.ms00d363.dto;

/**
*  The class CurKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CurKey extends CurKeySerialized {
   

								private long curProcId;

						private char[] curInterType = Field.fillLowValue(1);

						private char[] curInstId = Field.fillLowValue(10);

						private char[] curBinId = Field.fillLowValue(11);

						private char[] curCntry = Field.fillLowValue(3);

						private char[] curCurrency = Field.fillLowValue(3);

						private char[] curExponent = Field.fillLowValue(1);

						private char[] curSettServId = Field.fillLowValue(3);

								private long curIca;

						private char[] curIsisAgreeNum = Field.fillLowValue(4);
	
	/**
	* Constructor for CurKey
	**/
    public CurKey() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of curProcId
	 *	@return curProcId
	 */
	public long getCurProcId() throws CFException {
       if (isCurProcIdModified()) { 
           curProcId = refreshCurProcId();
        }
   		return curProcId;
	}
	

	
	   
	/**
	 * 	Update CurProcId with the passed value
	 *  Corresponding COBOL Variable is WS-CUR-PROC-ID
	 *	@param number
	 */
	public void setCurProcId(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    curProcId = checkCurProcIdMaxLimit(number); 
		serializeCurProcId(curProcId);
	}
	

	/**
	 * 	Update CurProcId with the passed value
	 *	@param value (String or char[])
	 */
	public void setCurProcId(char[] value) throws CFException {
		 curProcId = serializeCurProcId(value);
	}
	/**
	 * 	Update CurProcId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCurProcIdString(char[] value) throws CFException {
		 setCurProcId(value);
	}
	/**
	 *	Returns the value of curInterType
	 *	@return curInterType
	 */
   public char[] getCurInterType() throws CFException{
     if (isCurInterTypeModified()) { 
        curInterType = refreshCurInterType();
     }
   		return curInterType;
   }

  
	/**
	*  set variable curInterType
	*  Corresponding COBOL Variable is WS-CUR-INTER-TYPE
	*  @param value
	**/
   public void setCurInterType(char[] value) {
      curInterType = checkCurInterTypeConstraints(value);
      serializeCurInterType(curInterType);
   } 

     /**
	 * 	Update CurInterType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurInterType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurInterType,curInterType.length);
   	
   }
   
   public void setCurInterType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurInterType,curInterType.length);
   	
   }
   
     /**
	 * 	Update CurInterType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurInterType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurInterType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurInterType with another Field
	 *	@param value
	 */
   public void setCurInterType(Field source) {
       replace(source,0,source.length(),beginCurInterType,CUR_INTER_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update CurInterType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurInterType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurInterType,CUR_INTER_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update CurInterType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurInterType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurInterType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of curInstId
	 *	@return curInstId
	 */
   public char[] getCurInstId() throws CFException{
     if (isCurInstIdModified()) { 
        curInstId = refreshCurInstId();
     }
   		return curInstId;
   }

  
	/**
	*  set variable curInstId
	*  Corresponding COBOL Variable is WS-CUR-INST-ID
	*  @param value
	**/
   public void setCurInstId(char[] value) {
      curInstId = checkCurInstIdConstraints(value);
      serializeCurInstId(curInstId);
   } 

     /**
	 * 	Update CurInstId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurInstId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurInstId,curInstId.length);
   	
   }
   
   public void setCurInstId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurInstId,curInstId.length);
   	
   }
   
     /**
	 * 	Update CurInstId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurInstId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurInstId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurInstId with another Field
	 *	@param value
	 */
   public void setCurInstId(Field source) {
       replace(source,0,source.length(),beginCurInstId,CUR_INST_ID_LEN);
   	
   }  
   
     /**
	 * 	Update CurInstId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurInstId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurInstId,CUR_INST_ID_LEN);
   	
   }
   
     /**
	 * 	Update CurInstId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurInstId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurInstId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of curBinId
	 *	@return curBinId
	 */
   public char[] getCurBinId() throws CFException{
     if (isCurBinIdModified()) { 
        curBinId = refreshCurBinId();
     }
   		return curBinId;
   }

  
	/**
	*  set variable curBinId
	*  Corresponding COBOL Variable is WS-CUR-BIN-ID
	*  @param value
	**/
   public void setCurBinId(char[] value) {
      curBinId = checkCurBinIdConstraints(value);
      serializeCurBinId(curBinId);
   } 

     /**
	 * 	Update CurBinId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurBinId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurBinId,curBinId.length);
   	
   }
   
   public void setCurBinId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurBinId,curBinId.length);
   	
   }
   
     /**
	 * 	Update CurBinId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurBinId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurBinId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurBinId with another Field
	 *	@param value
	 */
   public void setCurBinId(Field source) {
       replace(source,0,source.length(),beginCurBinId,CUR_BIN_ID_LEN);
   	
   }  
   
     /**
	 * 	Update CurBinId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurBinId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurBinId,CUR_BIN_ID_LEN);
   	
   }
   
     /**
	 * 	Update CurBinId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurBinId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurBinId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of curCntry
	 *	@return curCntry
	 */
   public char[] getCurCntry() throws CFException{
     if (isCurCntryModified()) { 
        curCntry = refreshCurCntry();
     }
   		return curCntry;
   }

  
	/**
	*  set variable curCntry
	*  Corresponding COBOL Variable is WS-CUR-CNTRY
	*  @param value
	**/
   public void setCurCntry(char[] value) {
      curCntry = checkCurCntryConstraints(value);
      serializeCurCntry(curCntry);
   } 

     /**
	 * 	Update CurCntry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurCntry(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurCntry,curCntry.length);
   	
   }
   
   public void setCurCntry(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurCntry,curCntry.length);
   	
   }
   
     /**
	 * 	Update CurCntry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurCntry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurCntry+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurCntry with another Field
	 *	@param value
	 */
   public void setCurCntry(Field source) {
       replace(source,0,source.length(),beginCurCntry,CUR_CNTRY_LEN);
   	
   }  
   
     /**
	 * 	Update CurCntry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurCntry(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurCntry,CUR_CNTRY_LEN);
   	
   }
   
     /**
	 * 	Update CurCntry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurCntry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurCntry+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of curCurrency
	 *	@return curCurrency
	 */
   public char[] getCurCurrency() throws CFException{
     if (isCurCurrencyModified()) { 
        curCurrency = refreshCurCurrency();
     }
   		return curCurrency;
   }

  
	/**
	*  set variable curCurrency
	*  Corresponding COBOL Variable is WS-CUR-CURRENCY
	*  @param value
	**/
   public void setCurCurrency(char[] value) {
      curCurrency = checkCurCurrencyConstraints(value);
      serializeCurCurrency(curCurrency);
   } 

     /**
	 * 	Update CurCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurCurrency,curCurrency.length);
   	
   }
   
   public void setCurCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurCurrency,curCurrency.length);
   	
   }
   
     /**
	 * 	Update CurCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurCurrency with another Field
	 *	@param value
	 */
   public void setCurCurrency(Field source) {
       replace(source,0,source.length(),beginCurCurrency,CUR_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update CurCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurCurrency,CUR_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update CurCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurCurrency+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of curExponent
	 *	@return curExponent
	 */
   public char[] getCurExponent() throws CFException{
     if (isCurExponentModified()) { 
        curExponent = refreshCurExponent();
     }
   		return curExponent;
   }

  
	/**
	*  set variable curExponent
	*  Corresponding COBOL Variable is WS-CUR-EXPONENT
	*  @param value
	**/
   public void setCurExponent(char[] value) {
      curExponent = checkCurExponentConstraints(value);
      serializeCurExponent(curExponent);
   } 

     /**
	 * 	Update CurExponent 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurExponent(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurExponent,curExponent.length);
   	
   }
   
   public void setCurExponent(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurExponent,curExponent.length);
   	
   }
   
     /**
	 * 	Update CurExponent 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurExponent(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurExponent+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurExponent with another Field
	 *	@param value
	 */
   public void setCurExponent(Field source) {
       replace(source,0,source.length(),beginCurExponent,CUR_EXPONENT_LEN);
   	
   }  
   
     /**
	 * 	Update CurExponent 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurExponent(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurExponent,CUR_EXPONENT_LEN);
   	
   }
   
     /**
	 * 	Update CurExponent 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurExponent(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurExponent+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of curSettServId
	 *	@return curSettServId
	 */
   public char[] getCurSettServId() throws CFException{
     if (isCurSettServIdModified()) { 
        curSettServId = refreshCurSettServId();
     }
   		return curSettServId;
   }

  
	/**
	*  set variable curSettServId
	*  Corresponding COBOL Variable is WS-CUR-SETT-SERV-ID
	*  @param value
	**/
   public void setCurSettServId(char[] value) {
      curSettServId = checkCurSettServIdConstraints(value);
      serializeCurSettServId(curSettServId);
   } 

     /**
	 * 	Update CurSettServId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurSettServId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurSettServId,curSettServId.length);
   	
   }
   
   public void setCurSettServId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurSettServId,curSettServId.length);
   	
   }
   
     /**
	 * 	Update CurSettServId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurSettServId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurSettServId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurSettServId with another Field
	 *	@param value
	 */
   public void setCurSettServId(Field source) {
       replace(source,0,source.length(),beginCurSettServId,CUR_SETT_SERV_ID_LEN);
   	
   }  
   
     /**
	 * 	Update CurSettServId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurSettServId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurSettServId,CUR_SETT_SERV_ID_LEN);
   	
   }
   
     /**
	 * 	Update CurSettServId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurSettServId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurSettServId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of curIca
	 *	@return curIca
	 */
	public long getCurIca() throws CFException {
       if (isCurIcaModified()) { 
           curIca = refreshCurIca();
        }
   		return curIca;
	}
	

	
	   
	/**
	 * 	Update CurIca with the passed value
	 *  Corresponding COBOL Variable is WS-CUR-ICA
	 *	@param number
	 */
	public void setCurIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    curIca = checkCurIcaMaxLimit(number); 
		serializeCurIca(curIca);
	}
	

	/**
	 * 	Update CurIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setCurIca(char[] value) throws CFException {
		 curIca = serializeCurIca(value);
	}
	/**
	 * 	Update CurIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCurIcaString(char[] value) throws CFException {
		 setCurIca(value);
	}
	/**
	 *	Returns the value of curIsisAgreeNum
	 *	@return curIsisAgreeNum
	 */
   public char[] getCurIsisAgreeNum() throws CFException{
     if (isCurIsisAgreeNumModified()) { 
        curIsisAgreeNum = refreshCurIsisAgreeNum();
     }
   		return curIsisAgreeNum;
   }

  
	/**
	*  set variable curIsisAgreeNum
	*  Corresponding COBOL Variable is WS-CUR-ISIS-AGREE-NUM
	*  @param value
	**/
   public void setCurIsisAgreeNum(char[] value) {
      curIsisAgreeNum = checkCurIsisAgreeNumConstraints(value);
      serializeCurIsisAgreeNum(curIsisAgreeNum);
   } 

     /**
	 * 	Update CurIsisAgreeNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurIsisAgreeNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurIsisAgreeNum,curIsisAgreeNum.length);
   	
   }
   
   public void setCurIsisAgreeNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurIsisAgreeNum,curIsisAgreeNum.length);
   	
   }
   
     /**
	 * 	Update CurIsisAgreeNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurIsisAgreeNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurIsisAgreeNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurIsisAgreeNum with another Field
	 *	@param value
	 */
   public void setCurIsisAgreeNum(Field source) {
       replace(source,0,source.length(),beginCurIsisAgreeNum,CUR_ISIS_AGREE_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update CurIsisAgreeNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurIsisAgreeNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurIsisAgreeNum,CUR_ISIS_AGREE_NUM_LEN);
   	
   }
   
     /**
	 * 	Update CurIsisAgreeNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurIsisAgreeNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurIsisAgreeNum+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCurKeyFieldLength() {
			return CUR_KEY_LENGTH;
		}

}
  
