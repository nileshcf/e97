package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip33701CurrConvOutput is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


public class Ip33701CurrConvOutput extends Ip33701CurrConvOutputSerialized { 
   

						private char[] ip33701ConvType = Field.fillLowValue(1);

								private BigDecimal ip33701RateSrcToTrg = BigDecimal.ZERO;

								private BigDecimal ip33701SrcAmt6Decimals = BigDecimal.ZERO;

								private long ip33701TargetAmount;

								private BigDecimal ip33701TargetAmount1 = BigDecimal.ZERO;

								private BigDecimal ip33701TargetAmount2 = BigDecimal.ZERO;

								private BigDecimal ip33701TargetAmount3 = BigDecimal.ZERO;

								private BigDecimal ip33701TargetAmount4 = BigDecimal.ZERO;

								private BigDecimal ip33701TargetAmount5 = BigDecimal.ZERO;

								private BigDecimal ip33701TargetAmount6 = BigDecimal.ZERO;

								private BigDecimal ip33701TrgAmt6Decimals = BigDecimal.ZERO;

								private BigDecimal ip33701TargetAmount7 = BigDecimal.ZERO;

								private short ip33701ReturnCode;
	
	/**
	* Constructor for Ip33701CurrConvOutput
	**/
    public Ip33701CurrConvOutput() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip33701CurrConvOutput. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip33701CurrConvOutput(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip33701ConvType
	 *	@return ip33701ConvType
	 */
   public char[] getIp33701ConvType() throws CFException{
     if (isIp33701ConvTypeModified()) { 
        ip33701ConvType = refreshIp33701ConvType();
     }
   		return ip33701ConvType;
   }

  
	/**
	*  set variable ip33701ConvType
	*  Corresponding COBOL Variable is IP33701-CONV-TYPE
	*  @param value
	**/
   public void setIp33701ConvType(char[] value) {
      ip33701ConvType = checkIp33701ConvTypeConstraints(value);
      serializeIp33701ConvType(ip33701ConvType);
   } 

     /**
	 * 	Update Ip33701ConvType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701ConvType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp33701ConvType,ip33701ConvType.length);
   	
   }
   
   public void setIp33701ConvType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701ConvType,ip33701ConvType.length);
   	
   }
   
     /**
	 * 	Update Ip33701ConvType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701ConvType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701ConvType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip33701ConvType with another Field
	 *	@param value
	 */
   public void setIp33701ConvType(Field source) {
       replace(source,0,source.length(),beginIp33701ConvType,IP_33701_CONV_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip33701ConvType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701ConvType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp33701ConvType,IP_33701_CONV_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ip33701ConvType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701ConvType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp33701ConvType+targetIndex,targetLen);
    
   }
	char[] ip33701CrossRate8888Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isIp33701CrossRate88()
	 *	@return  Returns true if isIp33701CrossRate88() is "F"
	 */
   public boolean isIp33701CrossRate88() throws CFException {
      return (  compareChars( getIp33701ConvType() , ip33701CrossRate8888Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setIp33701CrossRate88True() {  			
    	setIp33701ConvType( ip33701CrossRate8888Value);
   	}
	char[] ip33701MarketRateConv8888Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isIp33701MarketRateConv88()
	 *	@return  Returns true if isIp33701MarketRateConv88() is "M"
	 */
   public boolean isIp33701MarketRateConv88() throws CFException {
      return (  compareChars( getIp33701ConvType() , ip33701MarketRateConv8888Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setIp33701MarketRateConv88True() {  			
    	setIp33701ConvType( ip33701MarketRateConv8888Value);
   	}
	char[] ip33701NoConversion8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp33701NoConversion88()
	 *	@return  Returns true if isIp33701NoConversion88() is "N"
	 */
   public boolean isIp33701NoConversion88() throws CFException {
      return (  compareChars( getIp33701ConvType() , ip33701NoConversion8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp33701NoConversion88True() {  			
    	setIp33701ConvType( ip33701NoConversion8888Value);
   	}
	/**
	 *	Returns the value of ip33701RateSrcToTrg
	 *	@return ip33701RateSrcToTrg
	 */
	public BigDecimal getIp33701RateSrcToTrg() throws CFException {
       if (isIp33701RateSrcToTrgModified()) { 
           ip33701RateSrcToTrg = refreshIp33701RateSrcToTrg();
        }
   		return ip33701RateSrcToTrg;
	}
	

	
	   
	/**
	 * 	Update Ip33701RateSrcToTrg with the passed number
	 *  Corresponding COBOL Variable is IP33701-RATE-SRC-TO-TRG
	 *	@param number
	 */
	public void setIp33701RateSrcToTrg(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       ip33701RateSrcToTrg = checkIp33701RateSrcToTrgMaxLimit(number);
	    serializeIp33701RateSrcToTrg(ip33701RateSrcToTrg);
   }
	/**
	 * 	Update Ip33701RateSrcToTrg with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701RateSrcToTrg(char[] value) throws CFException {
		 ip33701RateSrcToTrg = serializeIp33701RateSrcToTrg(value);
	}   
	
	/**
	 *	Test condition 1 for isIp33701SrcToTrgSame88()
	 *	@return  Returns true if isIp33701SrcToTrgSame88() is 1
	 */
   public boolean isIp33701SrcToTrgSame88() throws CFException {
      return (  getIp33701RateSrcToTrg() .compareTo( BigDecimal.valueOf(1) ) == 0  );
   }


	/**
	*  set values 1
	*/
   	public void setIp33701SrcToTrgSame88True() {  			
    	setIp33701RateSrcToTrg( BigDecimal.ONE);
   	}
	/**
	 *	Returns the value of ip33701SrcAmt6Decimals
	 *	@return ip33701SrcAmt6Decimals
	 */
	public BigDecimal getIp33701SrcAmt6Decimals() throws CFException {
       if (isIp33701SrcAmt6DecimalsModified()) { 
           ip33701SrcAmt6Decimals = refreshIp33701SrcAmt6Decimals();
        }
   		return ip33701SrcAmt6Decimals;
	}
	

    /**
	 *	Returns the String value of ip33701SrcAmt6Decimals
	 *	@return ip33701SrcAmt6Decimals
	 */
	public char[]  getIp33701SrcAmt6DecimalsActualString() {
	    String value = String.valueOf(ip33701SrcAmt6Decimals).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip33701SrcAmt6Decimals with the passed number
	 *  Corresponding COBOL Variable is IP33701-SRC-AMT-6-DECIMALS
	 *	@param number
	 */
	public void setIp33701SrcAmt6Decimals(BigDecimal number) {
       ip33701SrcAmt6Decimals = checkIp33701SrcAmt6DecimalsMaxLimit(number);
	    serializeIp33701SrcAmt6Decimals(ip33701SrcAmt6Decimals);
   }
	/**
	 * 	Update Ip33701SrcAmt6Decimals with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701SrcAmt6Decimals(char[] value) throws CFException {
		 ip33701SrcAmt6Decimals = serializeIp33701SrcAmt6Decimals(value);
	}   
	/**
	 *	Returns the value of ip33701TargetAmount
	 *	@return ip33701TargetAmount
	 */
	public long getIp33701TargetAmount() throws CFException {
       if (isIp33701TargetAmountModified()) { 
           ip33701TargetAmount = refreshIp33701TargetAmount();
        }
   		return ip33701TargetAmount;
	}
	

    /**
	 *	Returns the String value of ip33701TargetAmount
	 *	@return ip33701TargetAmount
	 */
	public char[]  getIp33701TargetAmountActualString() {
	    String value = String.valueOf(ip33701TargetAmount).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip33701TargetAmount with the passed value
	 *  Corresponding COBOL Variable is IP33701-TARGET-AMOUNT
	 *	@param number
	 */
	public void setIp33701TargetAmount(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip33701TargetAmount = checkIp33701TargetAmountMaxLimit(number); 
		serializeIp33701TargetAmount(ip33701TargetAmount);
	}
	

	/**
	 * 	Update Ip33701TargetAmount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetAmount(char[] value) throws CFException {
		 ip33701TargetAmount = serializeIp33701TargetAmount(value);
	}
	/**
	 * 	Update Ip33701TargetAmount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetAmountString(char[] value) throws CFException {
		 setIp33701TargetAmount(value);
	}
	/**
	 *	Returns the value of ip33701TargetAmount1
	 *	@return ip33701TargetAmount1
	 */
	public BigDecimal getIp33701TargetAmount1() throws CFException {
       if (isIp33701TargetAmount1Modified()) { 
           ip33701TargetAmount1 = refreshIp33701TargetAmount1();
        }
   		return ip33701TargetAmount1;
	}
	

    /**
	 *	Returns the String value of ip33701TargetAmount1
	 *	@return ip33701TargetAmount1
	 */
	public char[]  getIp33701TargetAmount1ActualString() {
	    String value = String.valueOf(ip33701TargetAmount1).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip33701TargetAmount1 with the passed number
	 *  Corresponding COBOL Variable is IP33701-TARGET-AMOUNT-1
	 *	@param number
	 */
	public void setIp33701TargetAmount1(BigDecimal number) {
       ip33701TargetAmount1 = checkIp33701TargetAmount1MaxLimit(number);
	    serializeIp33701TargetAmount1(ip33701TargetAmount1);
   }
	/**
	 * 	Update Ip33701TargetAmount1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetAmount1(char[] value) throws CFException {
		 ip33701TargetAmount1 = serializeIp33701TargetAmount1(value);
	}   
	/**
	 *	Returns the value of ip33701TargetAmount2
	 *	@return ip33701TargetAmount2
	 */
	public BigDecimal getIp33701TargetAmount2() throws CFException {
       if (isIp33701TargetAmount2Modified()) { 
           ip33701TargetAmount2 = refreshIp33701TargetAmount2();
        }
   		return ip33701TargetAmount2;
	}
	

    /**
	 *	Returns the String value of ip33701TargetAmount2
	 *	@return ip33701TargetAmount2
	 */
	public char[]  getIp33701TargetAmount2ActualString() {
	    String value = String.valueOf(ip33701TargetAmount2).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip33701TargetAmount2 with the passed number
	 *  Corresponding COBOL Variable is IP33701-TARGET-AMOUNT-2
	 *	@param number
	 */
	public void setIp33701TargetAmount2(BigDecimal number) {
       ip33701TargetAmount2 = checkIp33701TargetAmount2MaxLimit(number);
	    serializeIp33701TargetAmount2(ip33701TargetAmount2);
   }
	/**
	 * 	Update Ip33701TargetAmount2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetAmount2(char[] value) throws CFException {
		 ip33701TargetAmount2 = serializeIp33701TargetAmount2(value);
	}   
	/**
	 *	Returns the value of ip33701TargetAmount3
	 *	@return ip33701TargetAmount3
	 */
	public BigDecimal getIp33701TargetAmount3() throws CFException {
       if (isIp33701TargetAmount3Modified()) { 
           ip33701TargetAmount3 = refreshIp33701TargetAmount3();
        }
   		return ip33701TargetAmount3;
	}
	

    /**
	 *	Returns the String value of ip33701TargetAmount3
	 *	@return ip33701TargetAmount3
	 */
	public char[]  getIp33701TargetAmount3ActualString() {
	    String value = String.valueOf(ip33701TargetAmount3).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip33701TargetAmount3 with the passed number
	 *  Corresponding COBOL Variable is IP33701-TARGET-AMOUNT-3
	 *	@param number
	 */
	public void setIp33701TargetAmount3(BigDecimal number) {
       ip33701TargetAmount3 = checkIp33701TargetAmount3MaxLimit(number);
	    serializeIp33701TargetAmount3(ip33701TargetAmount3);
   }
	/**
	 * 	Update Ip33701TargetAmount3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetAmount3(char[] value) throws CFException {
		 ip33701TargetAmount3 = serializeIp33701TargetAmount3(value);
	}   
	/**
	 *	Returns the value of ip33701TargetAmount4
	 *	@return ip33701TargetAmount4
	 */
	public BigDecimal getIp33701TargetAmount4() throws CFException {
       if (isIp33701TargetAmount4Modified()) { 
           ip33701TargetAmount4 = refreshIp33701TargetAmount4();
        }
   		return ip33701TargetAmount4;
	}
	

    /**
	 *	Returns the String value of ip33701TargetAmount4
	 *	@return ip33701TargetAmount4
	 */
	public char[]  getIp33701TargetAmount4ActualString() {
	    String value = String.valueOf(ip33701TargetAmount4).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip33701TargetAmount4 with the passed number
	 *  Corresponding COBOL Variable is IP33701-TARGET-AMOUNT-4
	 *	@param number
	 */
	public void setIp33701TargetAmount4(BigDecimal number) {
       ip33701TargetAmount4 = checkIp33701TargetAmount4MaxLimit(number);
	    serializeIp33701TargetAmount4(ip33701TargetAmount4);
   }
	/**
	 * 	Update Ip33701TargetAmount4 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetAmount4(char[] value) throws CFException {
		 ip33701TargetAmount4 = serializeIp33701TargetAmount4(value);
	}   
	/**
	 *	Returns the value of ip33701TargetAmount5
	 *	@return ip33701TargetAmount5
	 */
	public BigDecimal getIp33701TargetAmount5() throws CFException {
       if (isIp33701TargetAmount5Modified()) { 
           ip33701TargetAmount5 = refreshIp33701TargetAmount5();
        }
   		return ip33701TargetAmount5;
	}
	

    /**
	 *	Returns the String value of ip33701TargetAmount5
	 *	@return ip33701TargetAmount5
	 */
	public char[]  getIp33701TargetAmount5ActualString() {
	    String value = String.valueOf(ip33701TargetAmount5).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip33701TargetAmount5 with the passed number
	 *  Corresponding COBOL Variable is IP33701-TARGET-AMOUNT-5
	 *	@param number
	 */
	public void setIp33701TargetAmount5(BigDecimal number) {
       ip33701TargetAmount5 = checkIp33701TargetAmount5MaxLimit(number);
	    serializeIp33701TargetAmount5(ip33701TargetAmount5);
   }
	/**
	 * 	Update Ip33701TargetAmount5 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetAmount5(char[] value) throws CFException {
		 ip33701TargetAmount5 = serializeIp33701TargetAmount5(value);
	}   
	/**
	 *	Returns the value of ip33701TargetAmount6
	 *	@return ip33701TargetAmount6
	 */
	public BigDecimal getIp33701TargetAmount6() throws CFException {
       if (isIp33701TargetAmount6Modified()) { 
           ip33701TargetAmount6 = refreshIp33701TargetAmount6();
        }
   		return ip33701TargetAmount6;
	}
	

    /**
	 *	Returns the String value of ip33701TargetAmount6
	 *	@return ip33701TargetAmount6
	 */
	public char[]  getIp33701TargetAmount6ActualString() {
	    String value = String.valueOf(ip33701TargetAmount6).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip33701TargetAmount6 with the passed number
	 *  Corresponding COBOL Variable is IP33701-TARGET-AMOUNT-6
	 *	@param number
	 */
	public void setIp33701TargetAmount6(BigDecimal number) {
       ip33701TargetAmount6 = checkIp33701TargetAmount6MaxLimit(number);
	    serializeIp33701TargetAmount6(ip33701TargetAmount6);
   }
	/**
	 * 	Update Ip33701TargetAmount6 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetAmount6(char[] value) throws CFException {
		 ip33701TargetAmount6 = serializeIp33701TargetAmount6(value);
	}   
	/**
	 *	Returns the value of ip33701TrgAmt6Decimals
	 *	@return ip33701TrgAmt6Decimals
	 */
	public BigDecimal getIp33701TrgAmt6Decimals() throws CFException {
       if (isIp33701TrgAmt6DecimalsModified()) { 
           ip33701TrgAmt6Decimals = refreshIp33701TrgAmt6Decimals();
        }
   		return ip33701TrgAmt6Decimals;
	}
	

    /**
	 *	Returns the String value of ip33701TrgAmt6Decimals
	 *	@return ip33701TrgAmt6Decimals
	 */
	public char[]  getIp33701TrgAmt6DecimalsActualString() {
	    String value = String.valueOf(ip33701TrgAmt6Decimals).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip33701TrgAmt6Decimals with the passed number
	 *  Corresponding COBOL Variable is IP33701-TRG-AMT-6-DECIMALS
	 *	@param number
	 */
	public void setIp33701TrgAmt6Decimals(BigDecimal number) {
       ip33701TrgAmt6Decimals = checkIp33701TrgAmt6DecimalsMaxLimit(number);
	    serializeIp33701TrgAmt6Decimals(ip33701TrgAmt6Decimals);
   }
	/**
	 * 	Update Ip33701TrgAmt6Decimals with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TrgAmt6Decimals(char[] value) throws CFException {
		 ip33701TrgAmt6Decimals = serializeIp33701TrgAmt6Decimals(value);
	}   
	/**
	 *	Returns the value of ip33701TargetAmount7
	 *	@return ip33701TargetAmount7
	 */
	public BigDecimal getIp33701TargetAmount7() throws CFException {
       if (isIp33701TargetAmount7Modified()) { 
           ip33701TargetAmount7 = refreshIp33701TargetAmount7();
        }
   		return ip33701TargetAmount7;
	}
	

    /**
	 *	Returns the String value of ip33701TargetAmount7
	 *	@return ip33701TargetAmount7
	 */
	public char[]  getIp33701TargetAmount7ActualString() {
	    String value = String.valueOf(ip33701TargetAmount7).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip33701TargetAmount7 with the passed number
	 *  Corresponding COBOL Variable is IP33701-TARGET-AMOUNT-7
	 *	@param number
	 */
	public void setIp33701TargetAmount7(BigDecimal number) {
       ip33701TargetAmount7 = checkIp33701TargetAmount7MaxLimit(number);
	    serializeIp33701TargetAmount7(ip33701TargetAmount7);
   }
	/**
	 * 	Update Ip33701TargetAmount7 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetAmount7(char[] value) throws CFException {
		 ip33701TargetAmount7 = serializeIp33701TargetAmount7(value);
	}   
	/**
	 *	Returns the value of ip33701ReturnCode
	 *	@return ip33701ReturnCode
	 */
	public short getIp33701ReturnCode() throws CFException {
        if (isIp33701ReturnCodeModified()) { 
           ip33701ReturnCode = refreshIp33701ReturnCode();
        }
   		return ip33701ReturnCode;
	}
	
	/**
	 * 	Update Ip33701ReturnCode with the passed value
	 *  Corresponding COBOL Variable is IP33701-RETURN-CODE
	 *	@param number
	 */
	public void setIp33701ReturnCode(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip33701ReturnCode = checkIp33701ReturnCodeMaxLimit(number); 
		serializeIp33701ReturnCode(ip33701ReturnCode);
	}

	public void setIp33701ReturnCode(int number) {
	    number = checkIp33701ReturnCodeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp33701ReturnCode((short)number);
	}
	public void setIp33701ReturnCode(long number) {
	    number = checkIp33701ReturnCodeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp33701ReturnCode((short)number);
	}
	

	
	/**
	 *	Test condition 2 for isIp33701CurNotNumeric88()
	 *	@return  Returns true if isIp33701CurNotNumeric88() is 2
	 */
   public boolean isIp33701CurNotNumeric88() throws CFException {
      return (  getIp33701ReturnCode()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setIp33701CurNotNumeric88True() {  			
    	setIp33701ReturnCode( (short)2);
   	}
	
	/**
	 *	Test condition 3 for isIp33701AmtNotNumeric88()
	 *	@return  Returns true if isIp33701AmtNotNumeric88() is 3
	 */
   public boolean isIp33701AmtNotNumeric88() throws CFException {
      return (  getIp33701ReturnCode()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setIp33701AmtNotNumeric88True() {  			
    	setIp33701ReturnCode( (short)3);
   	}
	
	/**
	 *	Test condition 4 for isIp33701InvalidCurExp88()
	 *	@return  Returns true if isIp33701InvalidCurExp88() is 4
	 */
   public boolean isIp33701InvalidCurExp88() throws CFException {
      return (  getIp33701ReturnCode()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setIp33701InvalidCurExp88True() {  			
    	setIp33701ReturnCode( (short)4);
   	}
	
	/**
	 *	Test condition 8 for isIp33701CurCdZeroes88()
	 *	@return  Returns true if isIp33701CurCdZeroes88() is 8
	 */
   public boolean isIp33701CurCdZeroes88() throws CFException {
      return (  getIp33701ReturnCode()  ==  8  );
   }


	/**
	*  set values 8
	*/
   	public void setIp33701CurCdZeroes88True() {  			
    	setIp33701ReturnCode( (short)8);
   	}

	
	
	
	/**
	 * 	initializes Ip33701CurrConvOutput
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp33701ConvType(CONSTANTS.SPACE);
			setIp33701RateSrcToTrg(BigDecimal.ZERO);
			setIp33701SrcAmt6Decimals(BigDecimal.ZERO);
                     setIp33701TargetAmount(0);
			setIp33701TrgAmt6Decimals(BigDecimal.ZERO);
			setIp33701TargetAmount7(BigDecimal.ZERO);
         	setIp33701ReturnCode((short)0);
   }

		public static int getIp33701CurrConvOutputFieldLength() {
			return IP_33701_CURR_CONV_OUTPUT_LENGTH;
		}

}
  
