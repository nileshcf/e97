package com.cloudframe.app.ip088030.dto;

/**
*  The class IchgEntry500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:30. using version 5.0.0.254
**/


import com.cloudframe.app.ip088030.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class IchgEntry500 extends IchgEntry500Serialized { 
   

						private char[] recType500 = Field.fillLowValue(1);

								private BigDecimal txnLowAmt500 = BigDecimal.ZERO;

								private long txnLowAmtU500;

								private BigDecimal txnHighAmt500 = BigDecimal.ZERO;

								private long txnHighAmtU500;

						private char[] mcc500 = Field.fillLowValue(4);

						private char[] maid500 = Field.fillLowValue(6);

						private char[] prodId500 = Field.fillLowValue(3);

								private BigDecimal viaRate500 = BigDecimal.ZERO;

								private BigDecimal fiaAmt500 = BigDecimal.ZERO;

								private BigDecimal minAmt500 = BigDecimal.ZERO;

								private BigDecimal maxAmt500 = BigDecimal.ZERO;
	
	/**
	* Constructor for IchgEntry500
	**/
    public IchgEntry500() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IchgEntry500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IchgEntry500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of recType500
	 *	@return recType500
	 */
   public char[] getRecType500() throws CFException{
     if (isRecType500Modified()) { 
        recType500 = refreshRecType500();
     }
   		return recType500;
   }

  
	/**
	*  set variable recType500
	*  Corresponding COBOL Variable is 500-REC-TYPE
	*  @param value
	**/
   public void setRecType500(char[] value) {
      recType500 = checkRecType500Constraints(value);
      serializeRecType500(recType500);
   } 

     /**
	 * 	Update RecType500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecType500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecType500,recType500.length);
   	
   }
   
   public void setRecType500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecType500,recType500.length);
   	
   }
   
     /**
	 * 	Update RecType500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecType500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecType500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RecType500 with another Field
	 *	@param value
	 */
   public void setRecType500(Field source) {
       replace(source,0,source.length(),beginRecType500,REC_TYPE_500_LEN);
   	
   }  
   
     /**
	 * 	Update RecType500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecType500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecType500,REC_TYPE_500_LEN);
   	
   }
   
     /**
	 * 	Update RecType500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecType500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecType500+targetIndex,targetLen);
    
   }
	char[] validRecType5008888Value1 = "C".toCharArray();
char[] validRecType5008888Value2 = "D".toCharArray();

	/**
	 *	Test condition "C" "D" for isValidRecType50088()
	 *	@return  Returns true if isValidRecType50088() is "C" "D"
	 */
   public boolean isValidRecType50088() throws CFException {
      return (  compareChars( getRecType500() , validRecType5008888Value1)  == 0  ||  compareChars( getRecType500() , validRecType5008888Value2)  == 0  );
   }


	/**
	*  set values "C" "D"
	*/
   	public void setValidRecType50088True() {  			
    	setRecType500( validRecType5008888Value1);
   	}
	/**
	 *	Returns the value of txnLowAmt500
	 *	@return txnLowAmt500
	 */
	public BigDecimal getTxnLowAmt500() throws CFException {
       if (isTxnLowAmt500Modified()) { 
           txnLowAmt500 = refreshTxnLowAmt500();
        }
   		return txnLowAmt500;
	}
	

	
	   
	/**
	 * 	Update TxnLowAmt500 with the passed number
	 *  Corresponding COBOL Variable is 500-TXN-LOW-AMT
	 *	@param number
	 */
	public void setTxnLowAmt500(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       txnLowAmt500 = checkTxnLowAmt500MaxLimit(number);
	    serializeTxnLowAmt500(txnLowAmt500);
   }
	/**
	 * 	Update TxnLowAmt500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTxnLowAmt500(char[] value) throws CFException {
		 txnLowAmt500 = serializeTxnLowAmt500(value);
	}   
	/**
	 *	Returns the value of txnLowAmtU500
	 *	@return txnLowAmtU500
	 */
	public long getTxnLowAmtU500() throws CFException {
       if (isTxnLowAmtU500Modified()) { 
           txnLowAmtU500 = refreshTxnLowAmtU500();
        }
   		return txnLowAmtU500;
	}
	

	
	   
	/**
	 * 	Update TxnLowAmtU500 with the passed value
	 *  Corresponding COBOL Variable is 500-TXN-LOW-AMT-U
	 *	@param number
	 */
	public void setTxnLowAmtU500(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    txnLowAmtU500 = checkTxnLowAmtU500MaxLimit(number); 
		serializeTxnLowAmtU500(txnLowAmtU500);
	}
	

	/**
	 * 	Update TxnLowAmtU500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTxnLowAmtU500(char[] value) throws CFException {
		 txnLowAmtU500 = serializeTxnLowAmtU500(value);
	}
	/**
	 * 	Update TxnLowAmtU500 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTxnLowAmtU500String(char[] value) throws CFException {
		 setTxnLowAmtU500(value);
	}
	/**
	 *	Returns the value of txnHighAmt500
	 *	@return txnHighAmt500
	 */
	public BigDecimal getTxnHighAmt500() throws CFException {
       if (isTxnHighAmt500Modified()) { 
           txnHighAmt500 = refreshTxnHighAmt500();
        }
   		return txnHighAmt500;
	}
	

	
	   
	/**
	 * 	Update TxnHighAmt500 with the passed number
	 *  Corresponding COBOL Variable is 500-TXN-HIGH-AMT
	 *	@param number
	 */
	public void setTxnHighAmt500(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       txnHighAmt500 = checkTxnHighAmt500MaxLimit(number);
	    serializeTxnHighAmt500(txnHighAmt500);
   }
	/**
	 * 	Update TxnHighAmt500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTxnHighAmt500(char[] value) throws CFException {
		 txnHighAmt500 = serializeTxnHighAmt500(value);
	}   
	/**
	 *	Returns the value of txnHighAmtU500
	 *	@return txnHighAmtU500
	 */
	public long getTxnHighAmtU500() throws CFException {
       if (isTxnHighAmtU500Modified()) { 
           txnHighAmtU500 = refreshTxnHighAmtU500();
        }
   		return txnHighAmtU500;
	}
	

	
	   
	/**
	 * 	Update TxnHighAmtU500 with the passed value
	 *  Corresponding COBOL Variable is 500-TXN-HIGH-AMT-U
	 *	@param number
	 */
	public void setTxnHighAmtU500(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    txnHighAmtU500 = checkTxnHighAmtU500MaxLimit(number); 
		serializeTxnHighAmtU500(txnHighAmtU500);
	}
	

	/**
	 * 	Update TxnHighAmtU500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTxnHighAmtU500(char[] value) throws CFException {
		 txnHighAmtU500 = serializeTxnHighAmtU500(value);
	}
	/**
	 * 	Update TxnHighAmtU500 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTxnHighAmtU500String(char[] value) throws CFException {
		 setTxnHighAmtU500(value);
	}
	/**
	 *	Returns the value of mcc500
	 *	@return mcc500
	 */
   public char[] getMcc500() throws CFException{
     if (isMcc500Modified()) { 
        mcc500 = refreshMcc500();
     }
   		return mcc500;
   }

  
	/**
	*  set variable mcc500
	*  Corresponding COBOL Variable is 500-MCC
	*  @param value
	**/
   public void setMcc500(char[] value) {
      mcc500 = checkMcc500Constraints(value);
      serializeMcc500(mcc500);
   } 

     /**
	 * 	Update Mcc500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMcc500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMcc500,mcc500.length);
   	
   }
   
   public void setMcc500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMcc500,mcc500.length);
   	
   }
   
     /**
	 * 	Update Mcc500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMcc500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcc500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Mcc500 with another Field
	 *	@param value
	 */
   public void setMcc500(Field source) {
       replace(source,0,source.length(),beginMcc500,MCC_500_LEN);
   	
   }  
   
     /**
	 * 	Update Mcc500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMcc500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMcc500,MCC_500_LEN);
   	
   }
   
     /**
	 * 	Update Mcc500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMcc500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcc500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of maid500
	 *	@return maid500
	 */
   public char[] getMaid500() throws CFException{
     if (isMaid500Modified()) { 
        maid500 = refreshMaid500();
     }
   		return maid500;
   }

  
	/**
	*  set variable maid500
	*  Corresponding COBOL Variable is 500-MAID
	*  @param value
	**/
   public void setMaid500(char[] value) {
      maid500 = checkMaid500Constraints(value);
      serializeMaid500(maid500);
   } 

     /**
	 * 	Update Maid500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMaid500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMaid500,maid500.length);
   	
   }
   
   public void setMaid500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMaid500,maid500.length);
   	
   }
   
     /**
	 * 	Update Maid500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMaid500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMaid500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Maid500 with another Field
	 *	@param value
	 */
   public void setMaid500(Field source) {
       replace(source,0,source.length(),beginMaid500,MAID_500_LEN);
   	
   }  
   
     /**
	 * 	Update Maid500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMaid500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMaid500,MAID_500_LEN);
   	
   }
   
     /**
	 * 	Update Maid500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMaid500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMaid500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prodId500
	 *	@return prodId500
	 */
   public char[] getProdId500() throws CFException{
     if (isProdId500Modified()) { 
        prodId500 = refreshProdId500();
     }
   		return prodId500;
   }

  
	/**
	*  set variable prodId500
	*  Corresponding COBOL Variable is 500-PROD-ID
	*  @param value
	**/
   public void setProdId500(char[] value) {
      prodId500 = checkProdId500Constraints(value);
      serializeProdId500(prodId500);
   } 

     /**
	 * 	Update ProdId500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProdId500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginProdId500,prodId500.length);
   	
   }
   
   public void setProdId500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginProdId500,prodId500.length);
   	
   }
   
     /**
	 * 	Update ProdId500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProdId500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProdId500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ProdId500 with another Field
	 *	@param value
	 */
   public void setProdId500(Field source) {
       replace(source,0,source.length(),beginProdId500,PROD_ID_500_LEN);
   	
   }  
   
     /**
	 * 	Update ProdId500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProdId500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginProdId500,PROD_ID_500_LEN);
   	
   }
   
     /**
	 * 	Update ProdId500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProdId500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProdId500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of viaRate500
	 *	@return viaRate500
	 */
	public BigDecimal getViaRate500() throws CFException {
       if (isViaRate500Modified()) { 
           viaRate500 = refreshViaRate500();
        }
   		return viaRate500;
	}
	

	
	   
	/**
	 * 	Update ViaRate500 with the passed number
	 *  Corresponding COBOL Variable is 500-VIA-RATE
	 *	@param number
	 */
	public void setViaRate500(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       viaRate500 = checkViaRate500MaxLimit(number);
	    serializeViaRate500(viaRate500);
   }
	/**
	 * 	Update ViaRate500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setViaRate500(char[] value) throws CFException {
		 viaRate500 = serializeViaRate500(value);
	}   
	/**
	 *	Returns the value of fiaAmt500
	 *	@return fiaAmt500
	 */
	public BigDecimal getFiaAmt500() throws CFException {
       if (isFiaAmt500Modified()) { 
           fiaAmt500 = refreshFiaAmt500();
        }
   		return fiaAmt500;
	}
	

	
	   
	/**
	 * 	Update FiaAmt500 with the passed number
	 *  Corresponding COBOL Variable is 500-FIA-AMT
	 *	@param number
	 */
	public void setFiaAmt500(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       fiaAmt500 = checkFiaAmt500MaxLimit(number);
	    serializeFiaAmt500(fiaAmt500);
   }
	/**
	 * 	Update FiaAmt500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFiaAmt500(char[] value) throws CFException {
		 fiaAmt500 = serializeFiaAmt500(value);
	}   
	/**
	 *	Returns the value of minAmt500
	 *	@return minAmt500
	 */
	public BigDecimal getMinAmt500() throws CFException {
       if (isMinAmt500Modified()) { 
           minAmt500 = refreshMinAmt500();
        }
   		return minAmt500;
	}
	

	
	   
	/**
	 * 	Update MinAmt500 with the passed number
	 *  Corresponding COBOL Variable is 500-MIN-AMT
	 *	@param number
	 */
	public void setMinAmt500(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       minAmt500 = checkMinAmt500MaxLimit(number);
	    serializeMinAmt500(minAmt500);
   }
	/**
	 * 	Update MinAmt500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMinAmt500(char[] value) throws CFException {
		 minAmt500 = serializeMinAmt500(value);
	}   
	/**
	 *	Returns the value of maxAmt500
	 *	@return maxAmt500
	 */
	public BigDecimal getMaxAmt500() throws CFException {
       if (isMaxAmt500Modified()) { 
           maxAmt500 = refreshMaxAmt500();
        }
   		return maxAmt500;
	}
	

	
	   
	/**
	 * 	Update MaxAmt500 with the passed number
	 *  Corresponding COBOL Variable is 500-MAX-AMT
	 *	@param number
	 */
	public void setMaxAmt500(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       maxAmt500 = checkMaxAmt500MaxLimit(number);
	    serializeMaxAmt500(maxAmt500);
   }
	/**
	 * 	Update MaxAmt500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaxAmt500(char[] value) throws CFException {
		 maxAmt500 = serializeMaxAmt500(value);
	}   

	
	
	

		public static int getIchgEntry500FieldLength() {
			return ICHG_ENTRY_500_LENGTH;
		}

}
  
