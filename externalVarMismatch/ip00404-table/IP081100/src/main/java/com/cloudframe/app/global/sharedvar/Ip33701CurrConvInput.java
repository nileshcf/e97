package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip33701CurrConvInput is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


public class Ip33701CurrConvInput extends Ip33701CurrConvInputSerialized { 
   

								private int ip33701SourceCurCode;

						private char[] ip33701SourceCurExp = Field.fillLowValue(1);

								private int ip33701TargetCurCode;

						private char[] ip33701TargetCurExp = Field.fillLowValue(1);

								private long ip33701SourceAmount;

								private BigDecimal ip33701SourceAmount1 = BigDecimal.ZERO;

								private BigDecimal ip33701SourceAmount2 = BigDecimal.ZERO;

								private BigDecimal ip33701SourceAmount3 = BigDecimal.ZERO;

								private BigDecimal ip33701SourceAmount4 = BigDecimal.ZERO;

								private BigDecimal ip33701SourceAmount5 = BigDecimal.ZERO;

								private BigDecimal ip33701SourceAmount6 = BigDecimal.ZERO;

						private char[] ip33701ConvRateTrgAsRef = Field.fillLowValue(1);

						private char[] ip33701ConvRateTrgNotRef = Field.fillLowValue(1);

						private char[] ip33701ApplyConvRate = Field.fillLowValue(1);

						private char[] ip33701ApplyCrossRate = Field.fillLowValue(1);

						private char[] ip33701RateTypeSrcToBase = Field.fillLowValue(1);

						private char[] ip33701RateTypeTrgToBase = Field.fillLowValue(1);

								private long ip33701FxDateYyddd;

						private char[] ip33701IsTargetAmtTrunc = Field.fillLowValue(1);

						private char[] ip33701ToGetSrcAmt6 = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip33701CurrConvInput
	**/
    public Ip33701CurrConvInput() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip33701CurrConvInput. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip33701CurrConvInput(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip33701SourceCurCode
	 *	@return ip33701SourceCurCode
	 */
	public int getIp33701SourceCurCode() throws CFException {
       if (isIp33701SourceCurCodeModified()) { 
           ip33701SourceCurCode = refreshIp33701SourceCurCode();
        }
   		return ip33701SourceCurCode;
	}
	

	
	   
	/**
	 * 	Update Ip33701SourceCurCode with the passed value
	 *  Corresponding COBOL Variable is IP33701-SOURCE-CUR-CODE
	 *	@param number
	 */
	public void setIp33701SourceCurCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip33701SourceCurCode = checkIp33701SourceCurCodeMaxLimit(number); 
		serializeIp33701SourceCurCode(ip33701SourceCurCode);
	}
	

	public void setIp33701SourceCurCode(long number) {
	    number = checkIp33701SourceCurCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp33701SourceCurCode((int)number);
	}
	
	/**
	 * 	Update Ip33701SourceCurCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceCurCode(char[] value) throws CFException {
		 ip33701SourceCurCode = serializeIp33701SourceCurCode(value);
	}
	/**
	 * 	Update Ip33701SourceCurCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceCurCodeString(char[] value) throws CFException {
		 setIp33701SourceCurCode(value);
	}
	/**
	 *	Returns the value of ip33701SourceCurExp
	 *	@return ip33701SourceCurExp
	 */
   public char[] getIp33701SourceCurExp() throws CFException{
     if (isIp33701SourceCurExpModified()) { 
        ip33701SourceCurExp = refreshIp33701SourceCurExp();
     }
   		return ip33701SourceCurExp;
   }

  
	/**
	*  set variable ip33701SourceCurExp
	*  Corresponding COBOL Variable is IP33701-SOURCE-CUR-EXP
	*  @param value
	**/
   public void setIp33701SourceCurExp(char[] value) {
      ip33701SourceCurExp = checkIp33701SourceCurExpConstraints(value);
      serializeIp33701SourceCurExp(ip33701SourceCurExp);
   } 

     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701SourceCurExp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp33701SourceCurExp,ip33701SourceCurExp.length);
   	
   }
   
   public void setIp33701SourceCurExp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701SourceCurExp,ip33701SourceCurExp.length);
   	
   }
   
     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701SourceCurExp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701SourceCurExp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip33701SourceCurExp with another Field
	 *	@param value
	 */
   public void setIp33701SourceCurExp(Field source) {
       replace(source,0,source.length(),beginIp33701SourceCurExp,IP_33701_SOURCE_CUR_EXP_LEN);
   	
   }  
   
     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701SourceCurExp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp33701SourceCurExp,IP_33701_SOURCE_CUR_EXP_LEN);
   	
   }
   
     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701SourceCurExp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701SourceCurExp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip33701TargetCurCode
	 *	@return ip33701TargetCurCode
	 */
	public int getIp33701TargetCurCode() throws CFException {
       if (isIp33701TargetCurCodeModified()) { 
           ip33701TargetCurCode = refreshIp33701TargetCurCode();
        }
   		return ip33701TargetCurCode;
	}
	

	
	   
	/**
	 * 	Update Ip33701TargetCurCode with the passed value
	 *  Corresponding COBOL Variable is IP33701-TARGET-CUR-CODE
	 *	@param number
	 */
	public void setIp33701TargetCurCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip33701TargetCurCode = checkIp33701TargetCurCodeMaxLimit(number); 
		serializeIp33701TargetCurCode(ip33701TargetCurCode);
	}
	

	public void setIp33701TargetCurCode(long number) {
	    number = checkIp33701TargetCurCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp33701TargetCurCode((int)number);
	}
	
	/**
	 * 	Update Ip33701TargetCurCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetCurCode(char[] value) throws CFException {
		 ip33701TargetCurCode = serializeIp33701TargetCurCode(value);
	}
	/**
	 * 	Update Ip33701TargetCurCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetCurCodeString(char[] value) throws CFException {
		 setIp33701TargetCurCode(value);
	}
	/**
	 *	Returns the value of ip33701TargetCurExp
	 *	@return ip33701TargetCurExp
	 */
   public char[] getIp33701TargetCurExp() throws CFException{
     if (isIp33701TargetCurExpModified()) { 
        ip33701TargetCurExp = refreshIp33701TargetCurExp();
     }
   		return ip33701TargetCurExp;
   }

  
	/**
	*  set variable ip33701TargetCurExp
	*  Corresponding COBOL Variable is IP33701-TARGET-CUR-EXP
	*  @param value
	**/
   public void setIp33701TargetCurExp(char[] value) {
      ip33701TargetCurExp = checkIp33701TargetCurExpConstraints(value);
      serializeIp33701TargetCurExp(ip33701TargetCurExp);
   } 

     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701TargetCurExp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp33701TargetCurExp,ip33701TargetCurExp.length);
   	
   }
   
   public void setIp33701TargetCurExp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701TargetCurExp,ip33701TargetCurExp.length);
   	
   }
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701TargetCurExp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701TargetCurExp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip33701TargetCurExp with another Field
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source) {
       replace(source,0,source.length(),beginIp33701TargetCurExp,IP_33701_TARGET_CUR_EXP_LEN);
   	
   }  
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp33701TargetCurExp,IP_33701_TARGET_CUR_EXP_LEN);
   	
   }
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701TargetCurExp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip33701SourceAmount
	 *	@return ip33701SourceAmount
	 */
	public long getIp33701SourceAmount() throws CFException {
       if (isIp33701SourceAmountModified()) { 
           ip33701SourceAmount = refreshIp33701SourceAmount();
        }
   		return ip33701SourceAmount;
	}
	

    /**
	 *	Returns the String value of ip33701SourceAmount
	 *	@return ip33701SourceAmount
	 */
	public char[]  getIp33701SourceAmountActualString() {
	    String value = String.valueOf(ip33701SourceAmount).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip33701SourceAmount with the passed value
	 *  Corresponding COBOL Variable is IP33701-SOURCE-AMOUNT
	 *	@param number
	 */
	public void setIp33701SourceAmount(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip33701SourceAmount = checkIp33701SourceAmountMaxLimit(number); 
		serializeIp33701SourceAmount(ip33701SourceAmount);
	}
	

	/**
	 * 	Update Ip33701SourceAmount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceAmount(char[] value) throws CFException {
		 ip33701SourceAmount = serializeIp33701SourceAmount(value);
	}
	/**
	 * 	Update Ip33701SourceAmount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceAmountString(char[] value) throws CFException {
		 setIp33701SourceAmount(value);
	}
	/**
	 *	Returns the value of ip33701SourceAmount1
	 *	@return ip33701SourceAmount1
	 */
	public BigDecimal getIp33701SourceAmount1() throws CFException {
       if (isIp33701SourceAmount1Modified()) { 
           ip33701SourceAmount1 = refreshIp33701SourceAmount1();
        }
   		return ip33701SourceAmount1;
	}
	

    /**
	 *	Returns the String value of ip33701SourceAmount1
	 *	@return ip33701SourceAmount1
	 */
	public char[]  getIp33701SourceAmount1ActualString() {
	    String value = String.valueOf(ip33701SourceAmount1).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip33701SourceAmount1 with the passed number
	 *  Corresponding COBOL Variable is IP33701-SOURCE-AMOUNT-1
	 *	@param number
	 */
	public void setIp33701SourceAmount1(BigDecimal number) {
       ip33701SourceAmount1 = checkIp33701SourceAmount1MaxLimit(number);
	    serializeIp33701SourceAmount1(ip33701SourceAmount1);
   }
	/**
	 * 	Update Ip33701SourceAmount1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceAmount1(char[] value) throws CFException {
		 ip33701SourceAmount1 = serializeIp33701SourceAmount1(value);
	}   
	/**
	 *	Returns the value of ip33701SourceAmount2
	 *	@return ip33701SourceAmount2
	 */
	public BigDecimal getIp33701SourceAmount2() throws CFException {
       if (isIp33701SourceAmount2Modified()) { 
           ip33701SourceAmount2 = refreshIp33701SourceAmount2();
        }
   		return ip33701SourceAmount2;
	}
	

    /**
	 *	Returns the String value of ip33701SourceAmount2
	 *	@return ip33701SourceAmount2
	 */
	public char[]  getIp33701SourceAmount2ActualString() {
	    String value = String.valueOf(ip33701SourceAmount2).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip33701SourceAmount2 with the passed number
	 *  Corresponding COBOL Variable is IP33701-SOURCE-AMOUNT-2
	 *	@param number
	 */
	public void setIp33701SourceAmount2(BigDecimal number) {
       ip33701SourceAmount2 = checkIp33701SourceAmount2MaxLimit(number);
	    serializeIp33701SourceAmount2(ip33701SourceAmount2);
   }
	/**
	 * 	Update Ip33701SourceAmount2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceAmount2(char[] value) throws CFException {
		 ip33701SourceAmount2 = serializeIp33701SourceAmount2(value);
	}   
	/**
	 *	Returns the value of ip33701SourceAmount3
	 *	@return ip33701SourceAmount3
	 */
	public BigDecimal getIp33701SourceAmount3() throws CFException {
       if (isIp33701SourceAmount3Modified()) { 
           ip33701SourceAmount3 = refreshIp33701SourceAmount3();
        }
   		return ip33701SourceAmount3;
	}
	

    /**
	 *	Returns the String value of ip33701SourceAmount3
	 *	@return ip33701SourceAmount3
	 */
	public char[]  getIp33701SourceAmount3ActualString() {
	    String value = String.valueOf(ip33701SourceAmount3).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip33701SourceAmount3 with the passed number
	 *  Corresponding COBOL Variable is IP33701-SOURCE-AMOUNT-3
	 *	@param number
	 */
	public void setIp33701SourceAmount3(BigDecimal number) {
       ip33701SourceAmount3 = checkIp33701SourceAmount3MaxLimit(number);
	    serializeIp33701SourceAmount3(ip33701SourceAmount3);
   }
	/**
	 * 	Update Ip33701SourceAmount3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceAmount3(char[] value) throws CFException {
		 ip33701SourceAmount3 = serializeIp33701SourceAmount3(value);
	}   
	/**
	 *	Returns the value of ip33701SourceAmount4
	 *	@return ip33701SourceAmount4
	 */
	public BigDecimal getIp33701SourceAmount4() throws CFException {
       if (isIp33701SourceAmount4Modified()) { 
           ip33701SourceAmount4 = refreshIp33701SourceAmount4();
        }
   		return ip33701SourceAmount4;
	}
	

    /**
	 *	Returns the String value of ip33701SourceAmount4
	 *	@return ip33701SourceAmount4
	 */
	public char[]  getIp33701SourceAmount4ActualString() {
	    String value = String.valueOf(ip33701SourceAmount4).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip33701SourceAmount4 with the passed number
	 *  Corresponding COBOL Variable is IP33701-SOURCE-AMOUNT-4
	 *	@param number
	 */
	public void setIp33701SourceAmount4(BigDecimal number) {
       ip33701SourceAmount4 = checkIp33701SourceAmount4MaxLimit(number);
	    serializeIp33701SourceAmount4(ip33701SourceAmount4);
   }
	/**
	 * 	Update Ip33701SourceAmount4 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceAmount4(char[] value) throws CFException {
		 ip33701SourceAmount4 = serializeIp33701SourceAmount4(value);
	}   
	/**
	 *	Returns the value of ip33701SourceAmount5
	 *	@return ip33701SourceAmount5
	 */
	public BigDecimal getIp33701SourceAmount5() throws CFException {
       if (isIp33701SourceAmount5Modified()) { 
           ip33701SourceAmount5 = refreshIp33701SourceAmount5();
        }
   		return ip33701SourceAmount5;
	}
	

    /**
	 *	Returns the String value of ip33701SourceAmount5
	 *	@return ip33701SourceAmount5
	 */
	public char[]  getIp33701SourceAmount5ActualString() {
	    String value = String.valueOf(ip33701SourceAmount5).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip33701SourceAmount5 with the passed number
	 *  Corresponding COBOL Variable is IP33701-SOURCE-AMOUNT-5
	 *	@param number
	 */
	public void setIp33701SourceAmount5(BigDecimal number) {
       ip33701SourceAmount5 = checkIp33701SourceAmount5MaxLimit(number);
	    serializeIp33701SourceAmount5(ip33701SourceAmount5);
   }
	/**
	 * 	Update Ip33701SourceAmount5 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceAmount5(char[] value) throws CFException {
		 ip33701SourceAmount5 = serializeIp33701SourceAmount5(value);
	}   
	/**
	 *	Returns the value of ip33701SourceAmount6
	 *	@return ip33701SourceAmount6
	 */
	public BigDecimal getIp33701SourceAmount6() throws CFException {
       if (isIp33701SourceAmount6Modified()) { 
           ip33701SourceAmount6 = refreshIp33701SourceAmount6();
        }
   		return ip33701SourceAmount6;
	}
	

    /**
	 *	Returns the String value of ip33701SourceAmount6
	 *	@return ip33701SourceAmount6
	 */
	public char[]  getIp33701SourceAmount6ActualString() {
	    String value = String.valueOf(ip33701SourceAmount6).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip33701SourceAmount6 with the passed number
	 *  Corresponding COBOL Variable is IP33701-SOURCE-AMOUNT-6
	 *	@param number
	 */
	public void setIp33701SourceAmount6(BigDecimal number) {
       ip33701SourceAmount6 = checkIp33701SourceAmount6MaxLimit(number);
	    serializeIp33701SourceAmount6(ip33701SourceAmount6);
   }
	/**
	 * 	Update Ip33701SourceAmount6 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceAmount6(char[] value) throws CFException {
		 ip33701SourceAmount6 = serializeIp33701SourceAmount6(value);
	}   
	/**
	 *	Returns the value of ip33701ConvRateTrgAsRef
	 *	@return ip33701ConvRateTrgAsRef
	 */
   public char[] getIp33701ConvRateTrgAsRef() throws CFException{
     if (isIp33701ConvRateTrgAsRefModified()) { 
        ip33701ConvRateTrgAsRef = refreshIp33701ConvRateTrgAsRef();
     }
   		return ip33701ConvRateTrgAsRef;
   }

  
	/**
	*  set variable ip33701ConvRateTrgAsRef
	*  Corresponding COBOL Variable is IP33701-CONV-RATE-TRG-AS-REF
	*  @param value
	**/
   public void setIp33701ConvRateTrgAsRef(char[] value) {
      ip33701ConvRateTrgAsRef = checkIp33701ConvRateTrgAsRefConstraints(value);
      serializeIp33701ConvRateTrgAsRef(ip33701ConvRateTrgAsRef);
   } 

     /**
	 * 	Update Ip33701ConvRateTrgAsRef 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701ConvRateTrgAsRef(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp33701ConvRateTrgAsRef,ip33701ConvRateTrgAsRef.length);
   	
   }
   
   public void setIp33701ConvRateTrgAsRef(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701ConvRateTrgAsRef,ip33701ConvRateTrgAsRef.length);
   	
   }
   
     /**
	 * 	Update Ip33701ConvRateTrgAsRef 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701ConvRateTrgAsRef(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701ConvRateTrgAsRef+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip33701ConvRateTrgAsRef with another Field
	 *	@param value
	 */
   public void setIp33701ConvRateTrgAsRef(Field source) {
       replace(source,0,source.length(),beginIp33701ConvRateTrgAsRef,IP_33701_CONV_RATE_TRG_AS_REF_LEN);
   	
   }  
   
     /**
	 * 	Update Ip33701ConvRateTrgAsRef 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701ConvRateTrgAsRef(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp33701ConvRateTrgAsRef,IP_33701_CONV_RATE_TRG_AS_REF_LEN);
   	
   }
   
     /**
	 * 	Update Ip33701ConvRateTrgAsRef 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701ConvRateTrgAsRef(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701ConvRateTrgAsRef+targetIndex,targetLen);
    
   }
	char[] ip33701Xrate1BuyRt8888Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isIp33701Xrate1BuyRt88()
	 *	@return  Returns true if isIp33701Xrate1BuyRt88() is "1"
	 */
   public boolean isIp33701Xrate1BuyRt88() throws CFException {
      return (  compareChars( getIp33701ConvRateTrgAsRef() , ip33701Xrate1BuyRt8888Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setIp33701Xrate1BuyRt88True() {  			
    	setIp33701ConvRateTrgAsRef( ip33701Xrate1BuyRt8888Value);
   	}
	char[] ip33701Xrate1BuyRtInv8888Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isIp33701Xrate1BuyRtInv88()
	 *	@return  Returns true if isIp33701Xrate1BuyRtInv88() is "2"
	 */
   public boolean isIp33701Xrate1BuyRtInv88() throws CFException {
      return (  compareChars( getIp33701ConvRateTrgAsRef() , ip33701Xrate1BuyRtInv8888Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setIp33701Xrate1BuyRtInv88True() {  			
    	setIp33701ConvRateTrgAsRef( ip33701Xrate1BuyRtInv8888Value);
   	}
	char[] ip33701Xrate1MidRt8888Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isIp33701Xrate1MidRt88()
	 *	@return  Returns true if isIp33701Xrate1MidRt88() is "3"
	 */
   public boolean isIp33701Xrate1MidRt88() throws CFException {
      return (  compareChars( getIp33701ConvRateTrgAsRef() , ip33701Xrate1MidRt8888Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setIp33701Xrate1MidRt88True() {  			
    	setIp33701ConvRateTrgAsRef( ip33701Xrate1MidRt8888Value);
   	}
	char[] ip33701Xrate1MidRtInv8888Value = "4".toCharArray();
	/**
	 *	Test condition "4" for isIp33701Xrate1MidRtInv88()
	 *	@return  Returns true if isIp33701Xrate1MidRtInv88() is "4"
	 */
   public boolean isIp33701Xrate1MidRtInv88() throws CFException {
      return (  compareChars( getIp33701ConvRateTrgAsRef() , ip33701Xrate1MidRtInv8888Value)  == 0  );
   }


	/**
	*  set values "4"
	*/
   	public void setIp33701Xrate1MidRtInv88True() {  			
    	setIp33701ConvRateTrgAsRef( ip33701Xrate1MidRtInv8888Value);
   	}
	char[] ip33701Xrate1SellRt8888Value = "5".toCharArray();
	/**
	 *	Test condition "5" for isIp33701Xrate1SellRt88()
	 *	@return  Returns true if isIp33701Xrate1SellRt88() is "5"
	 */
   public boolean isIp33701Xrate1SellRt88() throws CFException {
      return (  compareChars( getIp33701ConvRateTrgAsRef() , ip33701Xrate1SellRt8888Value)  == 0  );
   }


	/**
	*  set values "5"
	*/
   	public void setIp33701Xrate1SellRt88True() {  			
    	setIp33701ConvRateTrgAsRef( ip33701Xrate1SellRt8888Value);
   	}
	char[] ip33701Xrate1SellRtInv8888Value = "6".toCharArray();
	/**
	 *	Test condition "6" for isIp33701Xrate1SellRtInv88()
	 *	@return  Returns true if isIp33701Xrate1SellRtInv88() is "6"
	 */
   public boolean isIp33701Xrate1SellRtInv88() throws CFException {
      return (  compareChars( getIp33701ConvRateTrgAsRef() , ip33701Xrate1SellRtInv8888Value)  == 0  );
   }


	/**
	*  set values "6"
	*/
   	public void setIp33701Xrate1SellRtInv88True() {  			
    	setIp33701ConvRateTrgAsRef( ip33701Xrate1SellRtInv8888Value);
   	}
	/**
	 *	Returns the value of ip33701ConvRateTrgNotRef
	 *	@return ip33701ConvRateTrgNotRef
	 */
   public char[] getIp33701ConvRateTrgNotRef() throws CFException{
     if (isIp33701ConvRateTrgNotRefModified()) { 
        ip33701ConvRateTrgNotRef = refreshIp33701ConvRateTrgNotRef();
     }
   		return ip33701ConvRateTrgNotRef;
   }

  
	/**
	*  set variable ip33701ConvRateTrgNotRef
	*  Corresponding COBOL Variable is IP33701-CONV-RATE-TRG-NOT-REF
	*  @param value
	**/
   public void setIp33701ConvRateTrgNotRef(char[] value) {
      ip33701ConvRateTrgNotRef = checkIp33701ConvRateTrgNotRefConstraints(value);
      serializeIp33701ConvRateTrgNotRef(ip33701ConvRateTrgNotRef);
   } 

     /**
	 * 	Update Ip33701ConvRateTrgNotRef 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701ConvRateTrgNotRef(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp33701ConvRateTrgNotRef,ip33701ConvRateTrgNotRef.length);
   	
   }
   
   public void setIp33701ConvRateTrgNotRef(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701ConvRateTrgNotRef,ip33701ConvRateTrgNotRef.length);
   	
   }
   
     /**
	 * 	Update Ip33701ConvRateTrgNotRef 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701ConvRateTrgNotRef(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701ConvRateTrgNotRef+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip33701ConvRateTrgNotRef with another Field
	 *	@param value
	 */
   public void setIp33701ConvRateTrgNotRef(Field source) {
       replace(source,0,source.length(),beginIp33701ConvRateTrgNotRef,IP_33701_CONV_RATE_TRG_NOT_REF_LEN);
   	
   }  
   
     /**
	 * 	Update Ip33701ConvRateTrgNotRef 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701ConvRateTrgNotRef(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp33701ConvRateTrgNotRef,IP_33701_CONV_RATE_TRG_NOT_REF_LEN);
   	
   }
   
     /**
	 * 	Update Ip33701ConvRateTrgNotRef 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701ConvRateTrgNotRef(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701ConvRateTrgNotRef+targetIndex,targetLen);
    
   }
	char[] ip33701Xrate2BuyRt8888Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isIp33701Xrate2BuyRt88()
	 *	@return  Returns true if isIp33701Xrate2BuyRt88() is "1"
	 */
   public boolean isIp33701Xrate2BuyRt88() throws CFException {
      return (  compareChars( getIp33701ConvRateTrgNotRef() , ip33701Xrate2BuyRt8888Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setIp33701Xrate2BuyRt88True() {  			
    	setIp33701ConvRateTrgNotRef( ip33701Xrate2BuyRt8888Value);
   	}
	char[] ip33701Xrate2BuyRtInv8888Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isIp33701Xrate2BuyRtInv88()
	 *	@return  Returns true if isIp33701Xrate2BuyRtInv88() is "2"
	 */
   public boolean isIp33701Xrate2BuyRtInv88() throws CFException {
      return (  compareChars( getIp33701ConvRateTrgNotRef() , ip33701Xrate2BuyRtInv8888Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setIp33701Xrate2BuyRtInv88True() {  			
    	setIp33701ConvRateTrgNotRef( ip33701Xrate2BuyRtInv8888Value);
   	}
	char[] ip33701Xrate2MidRt8888Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isIp33701Xrate2MidRt88()
	 *	@return  Returns true if isIp33701Xrate2MidRt88() is "3"
	 */
   public boolean isIp33701Xrate2MidRt88() throws CFException {
      return (  compareChars( getIp33701ConvRateTrgNotRef() , ip33701Xrate2MidRt8888Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setIp33701Xrate2MidRt88True() {  			
    	setIp33701ConvRateTrgNotRef( ip33701Xrate2MidRt8888Value);
   	}
	char[] ip33701Xrate2MidRtInv8888Value = "4".toCharArray();
	/**
	 *	Test condition "4" for isIp33701Xrate2MidRtInv88()
	 *	@return  Returns true if isIp33701Xrate2MidRtInv88() is "4"
	 */
   public boolean isIp33701Xrate2MidRtInv88() throws CFException {
      return (  compareChars( getIp33701ConvRateTrgNotRef() , ip33701Xrate2MidRtInv8888Value)  == 0  );
   }


	/**
	*  set values "4"
	*/
   	public void setIp33701Xrate2MidRtInv88True() {  			
    	setIp33701ConvRateTrgNotRef( ip33701Xrate2MidRtInv8888Value);
   	}
	char[] ip33701Xrate2SellRt8888Value = "5".toCharArray();
	/**
	 *	Test condition "5" for isIp33701Xrate2SellRt88()
	 *	@return  Returns true if isIp33701Xrate2SellRt88() is "5"
	 */
   public boolean isIp33701Xrate2SellRt88() throws CFException {
      return (  compareChars( getIp33701ConvRateTrgNotRef() , ip33701Xrate2SellRt8888Value)  == 0  );
   }


	/**
	*  set values "5"
	*/
   	public void setIp33701Xrate2SellRt88True() {  			
    	setIp33701ConvRateTrgNotRef( ip33701Xrate2SellRt8888Value);
   	}
	char[] ip33701Xrate2SellRtInv8888Value = "6".toCharArray();
	/**
	 *	Test condition "6" for isIp33701Xrate2SellRtInv88()
	 *	@return  Returns true if isIp33701Xrate2SellRtInv88() is "6"
	 */
   public boolean isIp33701Xrate2SellRtInv88() throws CFException {
      return (  compareChars( getIp33701ConvRateTrgNotRef() , ip33701Xrate2SellRtInv8888Value)  == 0  );
   }


	/**
	*  set values "6"
	*/
   	public void setIp33701Xrate2SellRtInv88True() {  			
    	setIp33701ConvRateTrgNotRef( ip33701Xrate2SellRtInv8888Value);
   	}
	/**
	 *	Returns the value of ip33701ApplyConvRate
	 *	@return ip33701ApplyConvRate
	 */
   public char[] getIp33701ApplyConvRate() throws CFException{
     if (isIp33701ApplyConvRateModified()) { 
        ip33701ApplyConvRate = refreshIp33701ApplyConvRate();
     }
   		return ip33701ApplyConvRate;
   }

  
	/**
	*  set variable ip33701ApplyConvRate
	*  Corresponding COBOL Variable is IP33701-APPLY-CONV-RATE
	*  @param value
	**/
   public void setIp33701ApplyConvRate(char[] value) {
      ip33701ApplyConvRate = checkIp33701ApplyConvRateConstraints(value);
      serializeIp33701ApplyConvRate(ip33701ApplyConvRate);
   } 

     /**
	 * 	Update Ip33701ApplyConvRate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701ApplyConvRate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp33701ApplyConvRate,ip33701ApplyConvRate.length);
   	
   }
   
   public void setIp33701ApplyConvRate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701ApplyConvRate,ip33701ApplyConvRate.length);
   	
   }
   
     /**
	 * 	Update Ip33701ApplyConvRate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701ApplyConvRate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701ApplyConvRate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip33701ApplyConvRate with another Field
	 *	@param value
	 */
   public void setIp33701ApplyConvRate(Field source) {
       replace(source,0,source.length(),beginIp33701ApplyConvRate,IP_33701_APPLY_CONV_RATE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip33701ApplyConvRate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701ApplyConvRate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp33701ApplyConvRate,IP_33701_APPLY_CONV_RATE_LEN);
   	
   }
   
     /**
	 * 	Update Ip33701ApplyConvRate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701ApplyConvRate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701ApplyConvRate+targetIndex,targetLen);
    
   }
	char[] ip33701MultiplyByRate8888Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isIp33701MultiplyByRate88()
	 *	@return  Returns true if isIp33701MultiplyByRate88() is "M"
	 */
   public boolean isIp33701MultiplyByRate88() throws CFException {
      return (  compareChars( getIp33701ApplyConvRate() , ip33701MultiplyByRate8888Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setIp33701MultiplyByRate88True() {  			
    	setIp33701ApplyConvRate( ip33701MultiplyByRate8888Value);
   	}
	char[] ip33701DivideByRate8888Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isIp33701DivideByRate88()
	 *	@return  Returns true if isIp33701DivideByRate88() is "D"
	 */
   public boolean isIp33701DivideByRate88() throws CFException {
      return (  compareChars( getIp33701ApplyConvRate() , ip33701DivideByRate8888Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setIp33701DivideByRate88True() {  			
    	setIp33701ApplyConvRate( ip33701DivideByRate8888Value);
   	}
	/**
	 *	Returns the value of ip33701ApplyCrossRate
	 *	@return ip33701ApplyCrossRate
	 */
   public char[] getIp33701ApplyCrossRate() throws CFException{
     if (isIp33701ApplyCrossRateModified()) { 
        ip33701ApplyCrossRate = refreshIp33701ApplyCrossRate();
     }
   		return ip33701ApplyCrossRate;
   }

  
	/**
	*  set variable ip33701ApplyCrossRate
	*  Corresponding COBOL Variable is IP33701-APPLY-CROSS-RATE
	*  @param value
	**/
   public void setIp33701ApplyCrossRate(char[] value) {
      ip33701ApplyCrossRate = checkIp33701ApplyCrossRateConstraints(value);
      serializeIp33701ApplyCrossRate(ip33701ApplyCrossRate);
   } 

     /**
	 * 	Update Ip33701ApplyCrossRate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701ApplyCrossRate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp33701ApplyCrossRate,ip33701ApplyCrossRate.length);
   	
   }
   
   public void setIp33701ApplyCrossRate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701ApplyCrossRate,ip33701ApplyCrossRate.length);
   	
   }
   
     /**
	 * 	Update Ip33701ApplyCrossRate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701ApplyCrossRate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701ApplyCrossRate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip33701ApplyCrossRate with another Field
	 *	@param value
	 */
   public void setIp33701ApplyCrossRate(Field source) {
       replace(source,0,source.length(),beginIp33701ApplyCrossRate,IP_33701_APPLY_CROSS_RATE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip33701ApplyCrossRate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701ApplyCrossRate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp33701ApplyCrossRate,IP_33701_APPLY_CROSS_RATE_LEN);
   	
   }
   
     /**
	 * 	Update Ip33701ApplyCrossRate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701ApplyCrossRate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701ApplyCrossRate+targetIndex,targetLen);
    
   }
	char[] ip33701CrossRateApply8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp33701CrossRateApply88()
	 *	@return  Returns true if isIp33701CrossRateApply88() is "Y"
	 */
   public boolean isIp33701CrossRateApply88() throws CFException {
      return (  compareChars( getIp33701ApplyCrossRate() , ip33701CrossRateApply8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp33701CrossRateApply88True() {  			
    	setIp33701ApplyCrossRate( ip33701CrossRateApply8888Value);
   	}
	char[] ip33701NoCrossRate8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp33701NoCrossRate88()
	 *	@return  Returns true if isIp33701NoCrossRate88() is "N"
	 */
   public boolean isIp33701NoCrossRate88() throws CFException {
      return (  compareChars( getIp33701ApplyCrossRate() , ip33701NoCrossRate8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp33701NoCrossRate88True() {  			
    	setIp33701ApplyCrossRate( ip33701NoCrossRate8888Value);
   	}
	/**
	 *	Returns the value of ip33701RateTypeSrcToBase
	 *	@return ip33701RateTypeSrcToBase
	 */
   public char[] getIp33701RateTypeSrcToBase() throws CFException{
     if (isIp33701RateTypeSrcToBaseModified()) { 
        ip33701RateTypeSrcToBase = refreshIp33701RateTypeSrcToBase();
     }
   		return ip33701RateTypeSrcToBase;
   }

  
	/**
	*  set variable ip33701RateTypeSrcToBase
	*  Corresponding COBOL Variable is IP33701-RATE-TYPE-SRC-TO-BASE
	*  @param value
	**/
   public void setIp33701RateTypeSrcToBase(char[] value) {
      ip33701RateTypeSrcToBase = checkIp33701RateTypeSrcToBaseConstraints(value);
      serializeIp33701RateTypeSrcToBase(ip33701RateTypeSrcToBase);
   } 

     /**
	 * 	Update Ip33701RateTypeSrcToBase 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701RateTypeSrcToBase(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp33701RateTypeSrcToBase,ip33701RateTypeSrcToBase.length);
   	
   }
   
   public void setIp33701RateTypeSrcToBase(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701RateTypeSrcToBase,ip33701RateTypeSrcToBase.length);
   	
   }
   
     /**
	 * 	Update Ip33701RateTypeSrcToBase 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701RateTypeSrcToBase(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701RateTypeSrcToBase+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip33701RateTypeSrcToBase with another Field
	 *	@param value
	 */
   public void setIp33701RateTypeSrcToBase(Field source) {
       replace(source,0,source.length(),beginIp33701RateTypeSrcToBase,IP_33701_RATE_TYPE_SRC_TO_BASE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip33701RateTypeSrcToBase 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701RateTypeSrcToBase(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp33701RateTypeSrcToBase,IP_33701_RATE_TYPE_SRC_TO_BASE_LEN);
   	
   }
   
     /**
	 * 	Update Ip33701RateTypeSrcToBase 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701RateTypeSrcToBase(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701RateTypeSrcToBase+targetIndex,targetLen);
    
   }
	char[] ip33701SToBBuyRt8888Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isIp33701SToBBuyRt88()
	 *	@return  Returns true if isIp33701SToBBuyRt88() is "B"
	 */
   public boolean isIp33701SToBBuyRt88() throws CFException {
      return (  compareChars( getIp33701RateTypeSrcToBase() , ip33701SToBBuyRt8888Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setIp33701SToBBuyRt88True() {  			
    	setIp33701RateTypeSrcToBase( ip33701SToBBuyRt8888Value);
   	}
	char[] ip33701SToBMidRt8888Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isIp33701SToBMidRt88()
	 *	@return  Returns true if isIp33701SToBMidRt88() is "M"
	 */
   public boolean isIp33701SToBMidRt88() throws CFException {
      return (  compareChars( getIp33701RateTypeSrcToBase() , ip33701SToBMidRt8888Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setIp33701SToBMidRt88True() {  			
    	setIp33701RateTypeSrcToBase( ip33701SToBMidRt8888Value);
   	}
	char[] ip33701SToBSellRt8888Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isIp33701SToBSellRt88()
	 *	@return  Returns true if isIp33701SToBSellRt88() is "S"
	 */
   public boolean isIp33701SToBSellRt88() throws CFException {
      return (  compareChars( getIp33701RateTypeSrcToBase() , ip33701SToBSellRt8888Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setIp33701SToBSellRt88True() {  			
    	setIp33701RateTypeSrcToBase( ip33701SToBSellRt8888Value);
   	}
	/**
	 *	Returns the value of ip33701RateTypeTrgToBase
	 *	@return ip33701RateTypeTrgToBase
	 */
   public char[] getIp33701RateTypeTrgToBase() throws CFException{
     if (isIp33701RateTypeTrgToBaseModified()) { 
        ip33701RateTypeTrgToBase = refreshIp33701RateTypeTrgToBase();
     }
   		return ip33701RateTypeTrgToBase;
   }

  
	/**
	*  set variable ip33701RateTypeTrgToBase
	*  Corresponding COBOL Variable is IP33701-RATE-TYPE-TRG-TO-BASE
	*  @param value
	**/
   public void setIp33701RateTypeTrgToBase(char[] value) {
      ip33701RateTypeTrgToBase = checkIp33701RateTypeTrgToBaseConstraints(value);
      serializeIp33701RateTypeTrgToBase(ip33701RateTypeTrgToBase);
   } 

     /**
	 * 	Update Ip33701RateTypeTrgToBase 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701RateTypeTrgToBase(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp33701RateTypeTrgToBase,ip33701RateTypeTrgToBase.length);
   	
   }
   
   public void setIp33701RateTypeTrgToBase(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701RateTypeTrgToBase,ip33701RateTypeTrgToBase.length);
   	
   }
   
     /**
	 * 	Update Ip33701RateTypeTrgToBase 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701RateTypeTrgToBase(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701RateTypeTrgToBase+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip33701RateTypeTrgToBase with another Field
	 *	@param value
	 */
   public void setIp33701RateTypeTrgToBase(Field source) {
       replace(source,0,source.length(),beginIp33701RateTypeTrgToBase,IP_33701_RATE_TYPE_TRG_TO_BASE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip33701RateTypeTrgToBase 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701RateTypeTrgToBase(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp33701RateTypeTrgToBase,IP_33701_RATE_TYPE_TRG_TO_BASE_LEN);
   	
   }
   
     /**
	 * 	Update Ip33701RateTypeTrgToBase 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701RateTypeTrgToBase(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701RateTypeTrgToBase+targetIndex,targetLen);
    
   }
	char[] ip33701TToBBuyRt8888Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isIp33701TToBBuyRt88()
	 *	@return  Returns true if isIp33701TToBBuyRt88() is "B"
	 */
   public boolean isIp33701TToBBuyRt88() throws CFException {
      return (  compareChars( getIp33701RateTypeTrgToBase() , ip33701TToBBuyRt8888Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setIp33701TToBBuyRt88True() {  			
    	setIp33701RateTypeTrgToBase( ip33701TToBBuyRt8888Value);
   	}
	char[] ip33701TToBMidRt8888Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isIp33701TToBMidRt88()
	 *	@return  Returns true if isIp33701TToBMidRt88() is "M"
	 */
   public boolean isIp33701TToBMidRt88() throws CFException {
      return (  compareChars( getIp33701RateTypeTrgToBase() , ip33701TToBMidRt8888Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setIp33701TToBMidRt88True() {  			
    	setIp33701RateTypeTrgToBase( ip33701TToBMidRt8888Value);
   	}
	char[] ip33701TToBSellRt8888Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isIp33701TToBSellRt88()
	 *	@return  Returns true if isIp33701TToBSellRt88() is "S"
	 */
   public boolean isIp33701TToBSellRt88() throws CFException {
      return (  compareChars( getIp33701RateTypeTrgToBase() , ip33701TToBSellRt8888Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setIp33701TToBSellRt88True() {  			
    	setIp33701RateTypeTrgToBase( ip33701TToBSellRt8888Value);
   	}
	/**
	 *	Returns the value of ip33701FxDateYyddd
	 *	@return ip33701FxDateYyddd
	 */
	public long getIp33701FxDateYyddd() throws CFException {
       if (isIp33701FxDateYydddModified()) { 
           ip33701FxDateYyddd = refreshIp33701FxDateYyddd();
        }
   		return ip33701FxDateYyddd;
	}
	

	
	   
	/**
	 * 	Update Ip33701FxDateYyddd with the passed value
	 *  Corresponding COBOL Variable is IP33701-FX-DATE-YYDDD
	 *	@param number
	 */
	public void setIp33701FxDateYyddd(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip33701FxDateYyddd = checkIp33701FxDateYydddMaxLimit(number); 
		serializeIp33701FxDateYyddd(ip33701FxDateYyddd);
	}
	

	/**
	 * 	Update Ip33701FxDateYyddd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701FxDateYyddd(char[] value) throws CFException {
		 ip33701FxDateYyddd = serializeIp33701FxDateYyddd(value);
	}
	/**
	 * 	Update Ip33701FxDateYyddd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701FxDateYydddString(char[] value) throws CFException {
		 setIp33701FxDateYyddd(value);
	}
	/**
	 *	Returns the value of ip33701IsTargetAmtTrunc
	 *	@return ip33701IsTargetAmtTrunc
	 */
   public char[] getIp33701IsTargetAmtTrunc() throws CFException{
     if (isIp33701IsTargetAmtTruncModified()) { 
        ip33701IsTargetAmtTrunc = refreshIp33701IsTargetAmtTrunc();
     }
   		return ip33701IsTargetAmtTrunc;
   }

  
	/**
	*  set variable ip33701IsTargetAmtTrunc
	*  Corresponding COBOL Variable is IP33701-IS-TARGET-AMT-TRUNC
	*  @param value
	**/
   public void setIp33701IsTargetAmtTrunc(char[] value) {
      ip33701IsTargetAmtTrunc = checkIp33701IsTargetAmtTruncConstraints(value);
      serializeIp33701IsTargetAmtTrunc(ip33701IsTargetAmtTrunc);
   } 

     /**
	 * 	Update Ip33701IsTargetAmtTrunc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701IsTargetAmtTrunc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp33701IsTargetAmtTrunc,ip33701IsTargetAmtTrunc.length);
   	
   }
   
   public void setIp33701IsTargetAmtTrunc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701IsTargetAmtTrunc,ip33701IsTargetAmtTrunc.length);
   	
   }
   
     /**
	 * 	Update Ip33701IsTargetAmtTrunc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701IsTargetAmtTrunc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701IsTargetAmtTrunc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip33701IsTargetAmtTrunc with another Field
	 *	@param value
	 */
   public void setIp33701IsTargetAmtTrunc(Field source) {
       replace(source,0,source.length(),beginIp33701IsTargetAmtTrunc,IP_33701_IS_TARGET_AMT_TRUNC_LEN);
   	
   }  
   
     /**
	 * 	Update Ip33701IsTargetAmtTrunc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701IsTargetAmtTrunc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp33701IsTargetAmtTrunc,IP_33701_IS_TARGET_AMT_TRUNC_LEN);
   	
   }
   
     /**
	 * 	Update Ip33701IsTargetAmtTrunc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701IsTargetAmtTrunc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701IsTargetAmtTrunc+targetIndex,targetLen);
    
   }
	char[] ip33701TargetAmtTruncY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp33701TargetAmtTruncY88()
	 *	@return  Returns true if isIp33701TargetAmtTruncY88() is "Y"
	 */
   public boolean isIp33701TargetAmtTruncY88() throws CFException {
      return (  compareChars( getIp33701IsTargetAmtTrunc() , ip33701TargetAmtTruncY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp33701TargetAmtTruncY88True() {  			
    	setIp33701IsTargetAmtTrunc( ip33701TargetAmtTruncY8888Value);
   	}
	/**
	 *	Returns the value of ip33701ToGetSrcAmt6
	 *	@return ip33701ToGetSrcAmt6
	 */
   public char[] getIp33701ToGetSrcAmt6() throws CFException{
     if (isIp33701ToGetSrcAmt6Modified()) { 
        ip33701ToGetSrcAmt6 = refreshIp33701ToGetSrcAmt6();
     }
   		return ip33701ToGetSrcAmt6;
   }

  
	/**
	*  set variable ip33701ToGetSrcAmt6
	*  Corresponding COBOL Variable is IP33701-TO-GET-SRC-AMT-6
	*  @param value
	**/
   public void setIp33701ToGetSrcAmt6(char[] value) {
      ip33701ToGetSrcAmt6 = checkIp33701ToGetSrcAmt6Constraints(value);
      serializeIp33701ToGetSrcAmt6(ip33701ToGetSrcAmt6);
   } 

     /**
	 * 	Update Ip33701ToGetSrcAmt6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701ToGetSrcAmt6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp33701ToGetSrcAmt6,ip33701ToGetSrcAmt6.length);
   	
   }
   
   public void setIp33701ToGetSrcAmt6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701ToGetSrcAmt6,ip33701ToGetSrcAmt6.length);
   	
   }
   
     /**
	 * 	Update Ip33701ToGetSrcAmt6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701ToGetSrcAmt6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701ToGetSrcAmt6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip33701ToGetSrcAmt6 with another Field
	 *	@param value
	 */
   public void setIp33701ToGetSrcAmt6(Field source) {
       replace(source,0,source.length(),beginIp33701ToGetSrcAmt6,IP_33701_TO_GET_SRC_AMT_6_LEN);
   	
   }  
   
     /**
	 * 	Update Ip33701ToGetSrcAmt6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701ToGetSrcAmt6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp33701ToGetSrcAmt6,IP_33701_TO_GET_SRC_AMT_6_LEN);
   	
   }
   
     /**
	 * 	Update Ip33701ToGetSrcAmt6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701ToGetSrcAmt6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701ToGetSrcAmt6+targetIndex,targetLen);
    
   }
	char[] ip33701GetSrcAmt68888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp33701GetSrcAmt688()
	 *	@return  Returns true if isIp33701GetSrcAmt688() is "Y"
	 */
   public boolean isIp33701GetSrcAmt688() throws CFException {
      return (  compareChars( getIp33701ToGetSrcAmt6() , ip33701GetSrcAmt68888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp33701GetSrcAmt688True() {  			
    	setIp33701ToGetSrcAmt6( ip33701GetSrcAmt68888Value);
   	}

	
	
	
	/**
	 * 	initializes Ip33701CurrConvInput
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp33701SourceCurCode(0);
         setIp33701SourceCurExp(CONSTANTS.SPACE);
                     setIp33701TargetCurCode(0);
         setIp33701TargetCurExp(CONSTANTS.SPACE);
                     setIp33701SourceAmount(0);
         setIp33701ConvRateTrgAsRef(CONSTANTS.SPACE);
         setIp33701ConvRateTrgNotRef(CONSTANTS.SPACE);
         setIp33701ApplyConvRate(CONSTANTS.SPACE);
         setIp33701ApplyCrossRate(CONSTANTS.SPACE);
         setIp33701RateTypeSrcToBase(CONSTANTS.SPACE);
         setIp33701RateTypeTrgToBase(CONSTANTS.SPACE);
                     setIp33701FxDateYyddd(0);
         setIp33701IsTargetAmtTrunc(CONSTANTS.SPACE);
         setIp33701ToGetSrcAmt6(CONSTANTS.SPACE);
   }

		public static int getIp33701CurrConvInputFieldLength() {
			return IP_33701_CURR_CONV_INPUT_LENGTH;
		}

}
  
