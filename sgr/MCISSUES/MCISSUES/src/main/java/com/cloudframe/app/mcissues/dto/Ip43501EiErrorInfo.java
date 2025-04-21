package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip43501EiErrorInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip43501EiErrorInfo extends Ip43501EiErrorInfoSerialized { 
   

								private long ip43501EiSourceAmount;

						private char[] ip43501EiSourceCurrency = Field.fillLowValue(3);

								private int ip43501EiSourceCurrExp;

						private char[] ip43501EiSourceMtiFunc = Field.fillLowValue(8);
				private Ip43501EiElemId ip43501EiElemId = new Ip43501EiElemId();
				private Ip43501EiData ip43501EiData = new Ip43501EiData();
	
	/**
	* Constructor for Ip43501EiErrorInfo
	**/
    public Ip43501EiErrorInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip43501EiErrorInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip43501EiErrorInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip43501EiElemId.setParent(this,getStartOffset() + 30);
	       			ip43501EiData.setParent(this,getStartOffset() + 40);
    } 

	/**
	 *	Returns the value of ip43501EiSourceAmount
	 *	@return ip43501EiSourceAmount
	 */
	public long getIp43501EiSourceAmount() throws CFException {
       if (isIp43501EiSourceAmountModified()) { 
           ip43501EiSourceAmount = refreshIp43501EiSourceAmount();
        }
   		return ip43501EiSourceAmount;
	}
	

	
	   
	/**
	 * 	Update Ip43501EiSourceAmount with the passed value
	 *  Corresponding COBOL Variable is IP43501-EI-SOURCE-AMOUNT
	 *	@param number
	 */
	public void setIp43501EiSourceAmount(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip43501EiSourceAmount = checkIp43501EiSourceAmountMaxLimit(number); 
		serializeIp43501EiSourceAmount(ip43501EiSourceAmount);
	}
	

	/**
	 * 	Update Ip43501EiSourceAmount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp43501EiSourceAmount(char[] value) throws CFException {
		 ip43501EiSourceAmount = serializeIp43501EiSourceAmount(value);
	}
	/**
	 * 	Update Ip43501EiSourceAmount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp43501EiSourceAmountString(char[] value) throws CFException {
		 setIp43501EiSourceAmount(value);
	}
	/**
	 *	Returns the value of ip43501EiSourceCurrency
	 *	@return ip43501EiSourceCurrency
	 */
   public char[] getIp43501EiSourceCurrency() throws CFException{
     if (isIp43501EiSourceCurrencyModified()) { 
        ip43501EiSourceCurrency = refreshIp43501EiSourceCurrency();
     }
   		return ip43501EiSourceCurrency;
   }

  
	/**
	*  set variable ip43501EiSourceCurrency
	*  Corresponding COBOL Variable is IP43501-EI-SOURCE-CURRENCY
	*  @param value
	**/
   public void setIp43501EiSourceCurrency(char[] value) {
      ip43501EiSourceCurrency = checkIp43501EiSourceCurrencyConstraints(value);
      serializeIp43501EiSourceCurrency(ip43501EiSourceCurrency);
   } 

     /**
	 * 	Update Ip43501EiSourceCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp43501EiSourceCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp43501EiSourceCurrency,ip43501EiSourceCurrency.length);
   	
   }
   
   public void setIp43501EiSourceCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiSourceCurrency,ip43501EiSourceCurrency.length);
   	
   }
   
     /**
	 * 	Update Ip43501EiSourceCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiSourceCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiSourceCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip43501EiSourceCurrency with another Field
	 *	@param value
	 */
   public void setIp43501EiSourceCurrency(Field source) {
       replace(source,0,source.length(),beginIp43501EiSourceCurrency,IP_43501_EI_SOURCE_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip43501EiSourceCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp43501EiSourceCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp43501EiSourceCurrency,IP_43501_EI_SOURCE_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update Ip43501EiSourceCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiSourceCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiSourceCurrency+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip43501EiSourceCurrExp
	 *	@return ip43501EiSourceCurrExp
	 */
	public int getIp43501EiSourceCurrExp() throws CFException {
       if (isIp43501EiSourceCurrExpModified()) { 
           ip43501EiSourceCurrExp = refreshIp43501EiSourceCurrExp();
        }
   		return ip43501EiSourceCurrExp;
	}
	

	
	   
	/**
	 * 	Update Ip43501EiSourceCurrExp with the passed value
	 *  Corresponding COBOL Variable is IP43501-EI-SOURCE-CURR-EXP
	 *	@param number
	 */
	public void setIp43501EiSourceCurrExp(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip43501EiSourceCurrExp = checkIp43501EiSourceCurrExpMaxLimit(number); 
		serializeIp43501EiSourceCurrExp(ip43501EiSourceCurrExp);
	}
	

	public void setIp43501EiSourceCurrExp(long number) {
	    number = checkIp43501EiSourceCurrExpMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp43501EiSourceCurrExp((int)number);
	}
	
	/**
	 * 	Update Ip43501EiSourceCurrExp with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp43501EiSourceCurrExp(char[] value) throws CFException {
		 ip43501EiSourceCurrExp = serializeIp43501EiSourceCurrExp(value);
	}
	/**
	 * 	Update Ip43501EiSourceCurrExp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp43501EiSourceCurrExpString(char[] value) throws CFException {
		 setIp43501EiSourceCurrExp(value);
	}
	/**
	 *	Returns the value of ip43501EiSourceMtiFunc
	 *	@return ip43501EiSourceMtiFunc
	 */
   public char[] getIp43501EiSourceMtiFunc() throws CFException{
     if (isIp43501EiSourceMtiFuncModified()) { 
        ip43501EiSourceMtiFunc = refreshIp43501EiSourceMtiFunc();
     }
   		return ip43501EiSourceMtiFunc;
   }

  
	/**
	*  set variable ip43501EiSourceMtiFunc
	*  Corresponding COBOL Variable is IP43501-EI-SOURCE-MTI-FUNC
	*  @param value
	**/
   public void setIp43501EiSourceMtiFunc(char[] value) {
      ip43501EiSourceMtiFunc = checkIp43501EiSourceMtiFuncConstraints(value);
      serializeIp43501EiSourceMtiFunc(ip43501EiSourceMtiFunc);
   } 

     /**
	 * 	Update Ip43501EiSourceMtiFunc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp43501EiSourceMtiFunc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp43501EiSourceMtiFunc,ip43501EiSourceMtiFunc.length);
   	
   }
   
   public void setIp43501EiSourceMtiFunc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiSourceMtiFunc,ip43501EiSourceMtiFunc.length);
   	
   }
   
     /**
	 * 	Update Ip43501EiSourceMtiFunc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiSourceMtiFunc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiSourceMtiFunc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip43501EiSourceMtiFunc with another Field
	 *	@param value
	 */
   public void setIp43501EiSourceMtiFunc(Field source) {
       replace(source,0,source.length(),beginIp43501EiSourceMtiFunc,IP_43501_EI_SOURCE_MTI_FUNC_LEN);
   	
   }  
   
     /**
	 * 	Update Ip43501EiSourceMtiFunc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp43501EiSourceMtiFunc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp43501EiSourceMtiFunc,IP_43501_EI_SOURCE_MTI_FUNC_LEN);
   	
   }
   
     /**
	 * 	Update Ip43501EiSourceMtiFunc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiSourceMtiFunc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501EiSourceMtiFunc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip43501EiElemId
	 *	@return ip43501EiElemId
	 */   
	 public Ip43501EiElemId getIp43501EiElemId() {
   	return ip43501EiElemId;
   }
   /**
	* 	Update Ip43501EiElemId with the passed value
	*   Corresponding COBOL Variable is IP43501-EI-ELEM-ID
	*	@param value
	*/
   public void setIp43501EiElemId(char[] value) {
      ip43501EiElemId.setString(value); 
   }   
    
     /**
	 * 	Update Ip43501EiElemId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp43501EiElemId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip43501EiElemId.begin,ip43501EiElemId.length());
   }
   
     /**
	 * 	Update Ip43501EiElemId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiElemId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip43501EiElemId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip43501EiElemId with another Field
	 *	@param value
	 */
   public void setIp43501EiElemId(Field source) {
   	replace(source,0,source.length(),ip43501EiElemId.begin,ip43501EiElemId.length());
   }  
   
     /**
	 * 	Update Ip43501EiElemId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp43501EiElemId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip43501EiElemId.begin,ip43501EiElemId.length());
   }
   
     /**
	 * 	Update Ip43501EiElemId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiElemId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip43501EiElemId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip43501EiData
	 *	@return ip43501EiData
	 */   
	 public Ip43501EiData getIp43501EiData() {
   	return ip43501EiData;
   }
   /**
	* 	Update Ip43501EiData with the passed value
	*   Corresponding COBOL Variable is IP43501-EI-DATA
	*	@param value
	*/
   public void setIp43501EiData(char[] value) {
      ip43501EiData.setString(value); 
   }   
    
     /**
	 * 	Update Ip43501EiData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp43501EiData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip43501EiData.begin,ip43501EiData.length());
   }
   
     /**
	 * 	Update Ip43501EiData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip43501EiData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip43501EiData with another Field
	 *	@param value
	 */
   public void setIp43501EiData(Field source) {
   	replace(source,0,source.length(),ip43501EiData.begin,ip43501EiData.length());
   }  
   
     /**
	 * 	Update Ip43501EiData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp43501EiData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip43501EiData.begin,ip43501EiData.length());
   }
   
     /**
	 * 	Update Ip43501EiData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501EiData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip43501EiData.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip43501EiErrorInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp43501EiSourceAmount(0);
         setIp43501EiSourceCurrency(CONSTANTS.SPACE_3);
                     setIp43501EiSourceCurrExp(0);
         setIp43501EiSourceMtiFunc(CONSTANTS.SPACE_8);
          ip43501EiElemId.initialize();
     
          ip43501EiData.initialize();
     
   }

		public static int getIp43501EiErrorInfoFieldLength() {
			return IP_43501_EI_ERROR_INFO_LENGTH;
		}

}
  
