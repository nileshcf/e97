package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip33701CurrConvInputSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Ip33701CurrConvInputSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip33701CurrConvInputSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_33701_CURR_CONV_INPUT_LENGTH = 39;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp33701SourceCurCode;
            protected  int beginIp33701SourceCurExp;
            protected  int beginIp33701TargetCurCode;
            protected  int beginIp33701TargetCurExp;
            protected  int beginIp33701SourceAmount;
            protected  int beginIp33701SourceAmount1;
            protected  int beginIp33701SourceAmount2;
            protected  int beginIp33701SourceAmount3;
            protected  int beginIp33701SourceAmount4;
            protected  int beginIp33701SourceAmount5;
            protected  int beginIp33701SourceAmount6;
            protected  int beginIp33701ConvRateTrgAsRef;
            protected  int beginIp33701ConvRateTrgNotRef;
            protected  int beginIp33701ApplyConvRate;
            protected  int beginIp33701ApplyCrossRate;
            protected  int beginIp33701RateTypeSrcToBase;
            protected  int beginIp33701RateTypeTrgToBase;
            protected  int beginIp33701FxDateYyddd;
            protected  int beginIp33701IsTargetAmtTrunc;
            protected  int beginIp33701ToGetSrcAmt6;
	
	/**
	* Constructor for Ip33701CurrConvInputSerialized
	**/
    public Ip33701CurrConvInputSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip33701CurrConvInputSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip33701CurrConvInputSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip33701CurrConvInputSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip33701CurrConvInputSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip33701CurrConvInputSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_33701_CURR_CONV_INPUT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp33701SourceCurCode = getStartOffset() + 0;	// set offset for serialization
  
             beginIp33701SourceCurExp = getStartOffset() + 3;	// set offset for serialization
  
             beginIp33701TargetCurCode = getStartOffset() + 4;	// set offset for serialization
  
             beginIp33701TargetCurExp = getStartOffset() + 7;	// set offset for serialization
  
             beginIp33701SourceAmount = getStartOffset() + 8;	// set offset for serialization
  
             beginIp33701SourceAmount1 = getStartOffset() + 8;	// set offset for serialization
  
             beginIp33701SourceAmount2 = getStartOffset() + 8;	// set offset for serialization
  
             beginIp33701SourceAmount3 = getStartOffset() + 8;	// set offset for serialization
  
             beginIp33701SourceAmount4 = getStartOffset() + 8;	// set offset for serialization
  
             beginIp33701SourceAmount5 = getStartOffset() + 8;	// set offset for serialization
  
             beginIp33701SourceAmount6 = getStartOffset() + 8;	// set offset for serialization
  
             beginIp33701ConvRateTrgAsRef = getStartOffset() + 26;	// set offset for serialization
  
             beginIp33701ConvRateTrgNotRef = getStartOffset() + 27;	// set offset for serialization
  
             beginIp33701ApplyConvRate = getStartOffset() + 28;	// set offset for serialization
  
             beginIp33701ApplyCrossRate = getStartOffset() + 29;	// set offset for serialization
  
             beginIp33701RateTypeSrcToBase = getStartOffset() + 30;	// set offset for serialization
  
             beginIp33701RateTypeTrgToBase = getStartOffset() + 31;	// set offset for serialization
  
             beginIp33701FxDateYyddd = getStartOffset() + 32;	// set offset for serialization
  
             beginIp33701IsTargetAmtTrunc = getStartOffset() + 37;	// set offset for serialization
  
             beginIp33701ToGetSrcAmt6 = getStartOffset() + 38;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp33701SourceCurCodeCounter = -1;
     public boolean isIp33701SourceCurCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701SourceCurCodeCounter != sharedCounter;
         localIp33701SourceCurCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip33701SourceCurCode
	 *	@return ip33701SourceCurCode
	 */
	public char[]  getIp33701SourceCurCodeString() {
	     return getCharArray(beginIp33701SourceCurCode,IP_33701_SOURCE_CUR_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701SourceCurCodeIsNumeric() {
	    return isNumeric(beginIp33701SourceCurCode
	                    ,beginIp33701SourceCurCode + IP_33701_SOURCE_CUR_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_33701_SOURCE_CUR_CODE_LEN = 3;
  	/**
	 * serializeIp33701SourceCurCode
	 */
	protected void serializeIp33701SourceCurCode(int ip33701SourceCurCode) {
		 putNumber(beginIp33701SourceCurCode,ip33701SourceCurCode,IP_33701_SOURCE_CUR_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701SourceCurCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp33701SourceCurCode
	 */
   	protected  int serializeIp33701SourceCurCode(char[] value) {
	    int  ip33701SourceCurCode;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip33701SourceCurCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp33701SourceCurCode
		       ,3
		      );
		 localIp33701SourceCurCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip33701SourceCurCode;
    }

   protected int checkIp33701SourceCurCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp33701SourceCurCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp33701SourceCurCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp33701SourceCurCode
			                 ,IP_33701_SOURCE_CUR_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701SourceCurCode", beginIp33701SourceCurCode,IP_33701_SOURCE_CUR_CODE_LEN);
    }
   	}
     int localIp33701SourceCurExpCounter = -1;
     public boolean isIp33701SourceCurExpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701SourceCurExpCounter != sharedCounter;
         localIp33701SourceCurExpCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_33701_SOURCE_CUR_EXP_LEN = 1;
	/**
	 * 	serialize this Ip33701SourceCurExp
	 */
   protected void serializeIp33701SourceCurExp(char[] ip33701SourceCurExp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip33701SourceCurExp,0,getStringValue(),beginIp33701SourceCurExp,IP_33701_SOURCE_CUR_EXP_LEN);
       localIp33701SourceCurExpCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp33701SourceCurExpConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp33701SourceCurExp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp33701SourceCurExp() {	 
   		return (substring(getStringValue(),beginIp33701SourceCurExp,beginIp33701SourceCurExp + IP_33701_SOURCE_CUR_EXP_LEN));
   	}
     int localIp33701TargetCurCodeCounter = -1;
     public boolean isIp33701TargetCurCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701TargetCurCodeCounter != sharedCounter;
         localIp33701TargetCurCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip33701TargetCurCode
	 *	@return ip33701TargetCurCode
	 */
	public char[]  getIp33701TargetCurCodeString() {
	     return getCharArray(beginIp33701TargetCurCode,IP_33701_TARGET_CUR_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetCurCodeIsNumeric() {
	    return isNumeric(beginIp33701TargetCurCode
	                    ,beginIp33701TargetCurCode + IP_33701_TARGET_CUR_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_33701_TARGET_CUR_CODE_LEN = 3;
  	/**
	 * serializeIp33701TargetCurCode
	 */
	protected void serializeIp33701TargetCurCode(int ip33701TargetCurCode) {
		 putNumber(beginIp33701TargetCurCode,ip33701TargetCurCode,IP_33701_TARGET_CUR_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701TargetCurCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp33701TargetCurCode
	 */
   	protected  int serializeIp33701TargetCurCode(char[] value) {
	    int  ip33701TargetCurCode;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip33701TargetCurCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp33701TargetCurCode
		       ,3
		      );
		 localIp33701TargetCurCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip33701TargetCurCode;
    }

   protected int checkIp33701TargetCurCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp33701TargetCurCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp33701TargetCurCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp33701TargetCurCode
			                 ,IP_33701_TARGET_CUR_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701TargetCurCode", beginIp33701TargetCurCode,IP_33701_TARGET_CUR_CODE_LEN);
    }
   	}
     int localIp33701TargetCurExpCounter = -1;
     public boolean isIp33701TargetCurExpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701TargetCurExpCounter != sharedCounter;
         localIp33701TargetCurExpCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_33701_TARGET_CUR_EXP_LEN = 1;
	/**
	 * 	serialize this Ip33701TargetCurExp
	 */
   protected void serializeIp33701TargetCurExp(char[] ip33701TargetCurExp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip33701TargetCurExp,0,getStringValue(),beginIp33701TargetCurExp,IP_33701_TARGET_CUR_EXP_LEN);
       localIp33701TargetCurExpCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp33701TargetCurExpConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp33701TargetCurExp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp33701TargetCurExp() {	 
   		return (substring(getStringValue(),beginIp33701TargetCurExp,beginIp33701TargetCurExp + IP_33701_TARGET_CUR_EXP_LEN));
   	}
     int localIp33701SourceAmountCounter = -1;
     public boolean isIp33701SourceAmountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701SourceAmountCounter != sharedCounter;
         localIp33701SourceAmountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip33701SourceAmount
	 *	@return ip33701SourceAmount
	 */
	public char[]  getIp33701SourceAmountString() {
	     return getCharArray(beginIp33701SourceAmount,IP_33701_SOURCE_AMOUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701SourceAmountIsNumeric() {
	    return isNumeric(beginIp33701SourceAmount
	                    ,beginIp33701SourceAmount + IP_33701_SOURCE_AMOUNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_33701_SOURCE_AMOUNT_LEN = 18;
  	/**
	 * serializeIp33701SourceAmount
	 */
	protected void serializeIp33701SourceAmount(long ip33701SourceAmount) {
		 putNumber(beginIp33701SourceAmount,ip33701SourceAmount,IP_33701_SOURCE_AMOUNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701SourceAmountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp33701SourceAmount
	 */
   	protected  long serializeIp33701SourceAmount(char[] value) {
	    long  ip33701SourceAmount;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip33701SourceAmount = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginIp33701SourceAmount
		       ,18
		      );
		 localIp33701SourceAmountCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip33701SourceAmount;
    }

   protected long checkIp33701SourceAmountMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshIp33701SourceAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp33701SourceAmount() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp33701SourceAmount
			                 ,IP_33701_SOURCE_AMOUNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701SourceAmount", beginIp33701SourceAmount,IP_33701_SOURCE_AMOUNT_LEN);
    }
   	}
     int localIp33701SourceAmount1Counter = -1;
     
     public boolean isIp33701SourceAmount1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701SourceAmount1Counter != sharedCounter;
         localIp33701SourceAmount1Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ip33701SourceAmount1
	 *	@return ip33701SourceAmount1
	 */
	public char[]  getIp33701SourceAmount1String() {
	    return getCharArray(beginIp33701SourceAmount1,IP_33701_SOURCE_AMOUNT_1_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701SourceAmount1IsNumeric() {
		    return isNumeric(beginIp33701SourceAmount1
	                    ,beginIp33701SourceAmount1 + IP_33701_SOURCE_AMOUNT_1_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int IP_33701_SOURCE_AMOUNT_1_LEN = 18;
  protected  static final int IP_33701_SOURCE_AMOUNT_1_SCALE = 1;

   protected BigDecimal checkIp33701SourceAmount1MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,1/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeIp33701SourceAmount1
	 */
	protected void serializeIp33701SourceAmount1(BigDecimal ip33701SourceAmount1) {
	       putNumber(beginIp33701SourceAmount1,ip33701SourceAmount1,IP_33701_SOURCE_AMOUNT_1_LEN,IP_33701_SOURCE_AMOUNT_1_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701SourceAmount1Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeIp33701SourceAmount1
	 */
   	protected  BigDecimal serializeIp33701SourceAmount1(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginIp33701SourceAmount1
		       ,18
		      );		 localIp33701SourceAmount1Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,IP_33701_SOURCE_AMOUNT_1_LEN,IP_33701_SOURCE_AMOUNT_1_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ip33701SourceAmount1", beginIp33701SourceAmount1,IP_33701_SOURCE_AMOUNT_1_LEN);
    	}
    }
    /**
	 *	refreshIp33701SourceAmount1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshIp33701SourceAmount1() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginIp33701SourceAmount1
			            ,IP_33701_SOURCE_AMOUNT_1_LEN
			            ,IP_33701_SOURCE_AMOUNT_1_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701SourceAmount1", beginIp33701SourceAmount1,IP_33701_SOURCE_AMOUNT_1_LEN);
    }
   	}
     int localIp33701SourceAmount2Counter = -1;
     
     public boolean isIp33701SourceAmount2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701SourceAmount2Counter != sharedCounter;
         localIp33701SourceAmount2Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ip33701SourceAmount2
	 *	@return ip33701SourceAmount2
	 */
	public char[]  getIp33701SourceAmount2String() {
	    return getCharArray(beginIp33701SourceAmount2,IP_33701_SOURCE_AMOUNT_2_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701SourceAmount2IsNumeric() {
		    return isNumeric(beginIp33701SourceAmount2
	                    ,beginIp33701SourceAmount2 + IP_33701_SOURCE_AMOUNT_2_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int IP_33701_SOURCE_AMOUNT_2_LEN = 18;
  protected  static final int IP_33701_SOURCE_AMOUNT_2_SCALE = 2;

   protected BigDecimal checkIp33701SourceAmount2MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeIp33701SourceAmount2
	 */
	protected void serializeIp33701SourceAmount2(BigDecimal ip33701SourceAmount2) {
	       putNumber(beginIp33701SourceAmount2,ip33701SourceAmount2,IP_33701_SOURCE_AMOUNT_2_LEN,IP_33701_SOURCE_AMOUNT_2_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701SourceAmount2Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeIp33701SourceAmount2
	 */
   	protected  BigDecimal serializeIp33701SourceAmount2(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginIp33701SourceAmount2
		       ,18
		      );		 localIp33701SourceAmount2Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,IP_33701_SOURCE_AMOUNT_2_LEN,IP_33701_SOURCE_AMOUNT_2_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ip33701SourceAmount2", beginIp33701SourceAmount2,IP_33701_SOURCE_AMOUNT_2_LEN);
    	}
    }
    /**
	 *	refreshIp33701SourceAmount2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshIp33701SourceAmount2() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginIp33701SourceAmount2
			            ,IP_33701_SOURCE_AMOUNT_2_LEN
			            ,IP_33701_SOURCE_AMOUNT_2_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701SourceAmount2", beginIp33701SourceAmount2,IP_33701_SOURCE_AMOUNT_2_LEN);
    }
   	}
     int localIp33701SourceAmount3Counter = -1;
     
     public boolean isIp33701SourceAmount3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701SourceAmount3Counter != sharedCounter;
         localIp33701SourceAmount3Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ip33701SourceAmount3
	 *	@return ip33701SourceAmount3
	 */
	public char[]  getIp33701SourceAmount3String() {
	    return getCharArray(beginIp33701SourceAmount3,IP_33701_SOURCE_AMOUNT_3_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701SourceAmount3IsNumeric() {
		    return isNumeric(beginIp33701SourceAmount3
	                    ,beginIp33701SourceAmount3 + IP_33701_SOURCE_AMOUNT_3_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int IP_33701_SOURCE_AMOUNT_3_LEN = 18;
  protected  static final int IP_33701_SOURCE_AMOUNT_3_SCALE = 3;

   protected BigDecimal checkIp33701SourceAmount3MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeIp33701SourceAmount3
	 */
	protected void serializeIp33701SourceAmount3(BigDecimal ip33701SourceAmount3) {
	       putNumber(beginIp33701SourceAmount3,ip33701SourceAmount3,IP_33701_SOURCE_AMOUNT_3_LEN,IP_33701_SOURCE_AMOUNT_3_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701SourceAmount3Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeIp33701SourceAmount3
	 */
   	protected  BigDecimal serializeIp33701SourceAmount3(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginIp33701SourceAmount3
		       ,18
		      );		 localIp33701SourceAmount3Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,IP_33701_SOURCE_AMOUNT_3_LEN,IP_33701_SOURCE_AMOUNT_3_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ip33701SourceAmount3", beginIp33701SourceAmount3,IP_33701_SOURCE_AMOUNT_3_LEN);
    	}
    }
    /**
	 *	refreshIp33701SourceAmount3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshIp33701SourceAmount3() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginIp33701SourceAmount3
			            ,IP_33701_SOURCE_AMOUNT_3_LEN
			            ,IP_33701_SOURCE_AMOUNT_3_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701SourceAmount3", beginIp33701SourceAmount3,IP_33701_SOURCE_AMOUNT_3_LEN);
    }
   	}
     int localIp33701SourceAmount4Counter = -1;
     
     public boolean isIp33701SourceAmount4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701SourceAmount4Counter != sharedCounter;
         localIp33701SourceAmount4Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ip33701SourceAmount4
	 *	@return ip33701SourceAmount4
	 */
	public char[]  getIp33701SourceAmount4String() {
	    return getCharArray(beginIp33701SourceAmount4,IP_33701_SOURCE_AMOUNT_4_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701SourceAmount4IsNumeric() {
		    return isNumeric(beginIp33701SourceAmount4
	                    ,beginIp33701SourceAmount4 + IP_33701_SOURCE_AMOUNT_4_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int IP_33701_SOURCE_AMOUNT_4_LEN = 18;
  protected  static final int IP_33701_SOURCE_AMOUNT_4_SCALE = 4;

   protected BigDecimal checkIp33701SourceAmount4MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeIp33701SourceAmount4
	 */
	protected void serializeIp33701SourceAmount4(BigDecimal ip33701SourceAmount4) {
	       putNumber(beginIp33701SourceAmount4,ip33701SourceAmount4,IP_33701_SOURCE_AMOUNT_4_LEN,IP_33701_SOURCE_AMOUNT_4_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701SourceAmount4Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeIp33701SourceAmount4
	 */
   	protected  BigDecimal serializeIp33701SourceAmount4(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginIp33701SourceAmount4
		       ,18
		      );		 localIp33701SourceAmount4Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,IP_33701_SOURCE_AMOUNT_4_LEN,IP_33701_SOURCE_AMOUNT_4_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ip33701SourceAmount4", beginIp33701SourceAmount4,IP_33701_SOURCE_AMOUNT_4_LEN);
    	}
    }
    /**
	 *	refreshIp33701SourceAmount4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshIp33701SourceAmount4() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginIp33701SourceAmount4
			            ,IP_33701_SOURCE_AMOUNT_4_LEN
			            ,IP_33701_SOURCE_AMOUNT_4_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701SourceAmount4", beginIp33701SourceAmount4,IP_33701_SOURCE_AMOUNT_4_LEN);
    }
   	}
     int localIp33701SourceAmount5Counter = -1;
     
     public boolean isIp33701SourceAmount5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701SourceAmount5Counter != sharedCounter;
         localIp33701SourceAmount5Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ip33701SourceAmount5
	 *	@return ip33701SourceAmount5
	 */
	public char[]  getIp33701SourceAmount5String() {
	    return getCharArray(beginIp33701SourceAmount5,IP_33701_SOURCE_AMOUNT_5_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701SourceAmount5IsNumeric() {
		    return isNumeric(beginIp33701SourceAmount5
	                    ,beginIp33701SourceAmount5 + IP_33701_SOURCE_AMOUNT_5_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int IP_33701_SOURCE_AMOUNT_5_LEN = 18;
  protected  static final int IP_33701_SOURCE_AMOUNT_5_SCALE = 5;

   protected BigDecimal checkIp33701SourceAmount5MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,5/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeIp33701SourceAmount5
	 */
	protected void serializeIp33701SourceAmount5(BigDecimal ip33701SourceAmount5) {
	       putNumber(beginIp33701SourceAmount5,ip33701SourceAmount5,IP_33701_SOURCE_AMOUNT_5_LEN,IP_33701_SOURCE_AMOUNT_5_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701SourceAmount5Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeIp33701SourceAmount5
	 */
   	protected  BigDecimal serializeIp33701SourceAmount5(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginIp33701SourceAmount5
		       ,18
		      );		 localIp33701SourceAmount5Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,IP_33701_SOURCE_AMOUNT_5_LEN,IP_33701_SOURCE_AMOUNT_5_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ip33701SourceAmount5", beginIp33701SourceAmount5,IP_33701_SOURCE_AMOUNT_5_LEN);
    	}
    }
    /**
	 *	refreshIp33701SourceAmount5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshIp33701SourceAmount5() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginIp33701SourceAmount5
			            ,IP_33701_SOURCE_AMOUNT_5_LEN
			            ,IP_33701_SOURCE_AMOUNT_5_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701SourceAmount5", beginIp33701SourceAmount5,IP_33701_SOURCE_AMOUNT_5_LEN);
    }
   	}
     int localIp33701SourceAmount6Counter = -1;
     
     public boolean isIp33701SourceAmount6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701SourceAmount6Counter != sharedCounter;
         localIp33701SourceAmount6Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ip33701SourceAmount6
	 *	@return ip33701SourceAmount6
	 */
	public char[]  getIp33701SourceAmount6String() {
	    return getCharArray(beginIp33701SourceAmount6,IP_33701_SOURCE_AMOUNT_6_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701SourceAmount6IsNumeric() {
		    return isNumeric(beginIp33701SourceAmount6
	                    ,beginIp33701SourceAmount6 + IP_33701_SOURCE_AMOUNT_6_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int IP_33701_SOURCE_AMOUNT_6_LEN = 18;
  protected  static final int IP_33701_SOURCE_AMOUNT_6_SCALE = 6;

   protected BigDecimal checkIp33701SourceAmount6MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeIp33701SourceAmount6
	 */
	protected void serializeIp33701SourceAmount6(BigDecimal ip33701SourceAmount6) {
	       putNumber(beginIp33701SourceAmount6,ip33701SourceAmount6,IP_33701_SOURCE_AMOUNT_6_LEN,IP_33701_SOURCE_AMOUNT_6_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701SourceAmount6Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeIp33701SourceAmount6
	 */
   	protected  BigDecimal serializeIp33701SourceAmount6(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginIp33701SourceAmount6
		       ,18
		      );		 localIp33701SourceAmount6Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,IP_33701_SOURCE_AMOUNT_6_LEN,IP_33701_SOURCE_AMOUNT_6_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ip33701SourceAmount6", beginIp33701SourceAmount6,IP_33701_SOURCE_AMOUNT_6_LEN);
    	}
    }
    /**
	 *	refreshIp33701SourceAmount6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshIp33701SourceAmount6() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginIp33701SourceAmount6
			            ,IP_33701_SOURCE_AMOUNT_6_LEN
			            ,IP_33701_SOURCE_AMOUNT_6_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701SourceAmount6", beginIp33701SourceAmount6,IP_33701_SOURCE_AMOUNT_6_LEN);
    }
   	}
     int localIp33701ConvRateTrgAsRefCounter = -1;
     public boolean isIp33701ConvRateTrgAsRefModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701ConvRateTrgAsRefCounter != sharedCounter;
         localIp33701ConvRateTrgAsRefCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_33701_CONV_RATE_TRG_AS_REF_LEN = 1;
	/**
	 * 	serialize this Ip33701ConvRateTrgAsRef
	 */
   protected void serializeIp33701ConvRateTrgAsRef(char[] ip33701ConvRateTrgAsRef) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip33701ConvRateTrgAsRef,0,getStringValue(),beginIp33701ConvRateTrgAsRef,IP_33701_CONV_RATE_TRG_AS_REF_LEN);
       localIp33701ConvRateTrgAsRefCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp33701ConvRateTrgAsRefConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp33701ConvRateTrgAsRef is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp33701ConvRateTrgAsRef() {	 
   		return (substring(getStringValue(),beginIp33701ConvRateTrgAsRef,beginIp33701ConvRateTrgAsRef + IP_33701_CONV_RATE_TRG_AS_REF_LEN));
   	}
     int localIp33701ConvRateTrgNotRefCounter = -1;
     public boolean isIp33701ConvRateTrgNotRefModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701ConvRateTrgNotRefCounter != sharedCounter;
         localIp33701ConvRateTrgNotRefCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_33701_CONV_RATE_TRG_NOT_REF_LEN = 1;
	/**
	 * 	serialize this Ip33701ConvRateTrgNotRef
	 */
   protected void serializeIp33701ConvRateTrgNotRef(char[] ip33701ConvRateTrgNotRef) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip33701ConvRateTrgNotRef,0,getStringValue(),beginIp33701ConvRateTrgNotRef,IP_33701_CONV_RATE_TRG_NOT_REF_LEN);
       localIp33701ConvRateTrgNotRefCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp33701ConvRateTrgNotRefConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp33701ConvRateTrgNotRef is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp33701ConvRateTrgNotRef() {	 
   		return (substring(getStringValue(),beginIp33701ConvRateTrgNotRef,beginIp33701ConvRateTrgNotRef + IP_33701_CONV_RATE_TRG_NOT_REF_LEN));
   	}
     int localIp33701ApplyConvRateCounter = -1;
     public boolean isIp33701ApplyConvRateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701ApplyConvRateCounter != sharedCounter;
         localIp33701ApplyConvRateCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_33701_APPLY_CONV_RATE_LEN = 1;
	/**
	 * 	serialize this Ip33701ApplyConvRate
	 */
   protected void serializeIp33701ApplyConvRate(char[] ip33701ApplyConvRate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip33701ApplyConvRate,0,getStringValue(),beginIp33701ApplyConvRate,IP_33701_APPLY_CONV_RATE_LEN);
       localIp33701ApplyConvRateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp33701ApplyConvRateConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp33701ApplyConvRate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp33701ApplyConvRate() {	 
   		return (substring(getStringValue(),beginIp33701ApplyConvRate,beginIp33701ApplyConvRate + IP_33701_APPLY_CONV_RATE_LEN));
   	}
     int localIp33701ApplyCrossRateCounter = -1;
     public boolean isIp33701ApplyCrossRateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701ApplyCrossRateCounter != sharedCounter;
         localIp33701ApplyCrossRateCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_33701_APPLY_CROSS_RATE_LEN = 1;
	/**
	 * 	serialize this Ip33701ApplyCrossRate
	 */
   protected void serializeIp33701ApplyCrossRate(char[] ip33701ApplyCrossRate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip33701ApplyCrossRate,0,getStringValue(),beginIp33701ApplyCrossRate,IP_33701_APPLY_CROSS_RATE_LEN);
       localIp33701ApplyCrossRateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp33701ApplyCrossRateConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp33701ApplyCrossRate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp33701ApplyCrossRate() {	 
   		return (substring(getStringValue(),beginIp33701ApplyCrossRate,beginIp33701ApplyCrossRate + IP_33701_APPLY_CROSS_RATE_LEN));
   	}
     int localIp33701RateTypeSrcToBaseCounter = -1;
     public boolean isIp33701RateTypeSrcToBaseModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701RateTypeSrcToBaseCounter != sharedCounter;
         localIp33701RateTypeSrcToBaseCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_33701_RATE_TYPE_SRC_TO_BASE_LEN = 1;
	/**
	 * 	serialize this Ip33701RateTypeSrcToBase
	 */
   protected void serializeIp33701RateTypeSrcToBase(char[] ip33701RateTypeSrcToBase) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip33701RateTypeSrcToBase,0,getStringValue(),beginIp33701RateTypeSrcToBase,IP_33701_RATE_TYPE_SRC_TO_BASE_LEN);
       localIp33701RateTypeSrcToBaseCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp33701RateTypeSrcToBaseConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp33701RateTypeSrcToBase is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp33701RateTypeSrcToBase() {	 
   		return (substring(getStringValue(),beginIp33701RateTypeSrcToBase,beginIp33701RateTypeSrcToBase + IP_33701_RATE_TYPE_SRC_TO_BASE_LEN));
   	}
     int localIp33701RateTypeTrgToBaseCounter = -1;
     public boolean isIp33701RateTypeTrgToBaseModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701RateTypeTrgToBaseCounter != sharedCounter;
         localIp33701RateTypeTrgToBaseCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_33701_RATE_TYPE_TRG_TO_BASE_LEN = 1;
	/**
	 * 	serialize this Ip33701RateTypeTrgToBase
	 */
   protected void serializeIp33701RateTypeTrgToBase(char[] ip33701RateTypeTrgToBase) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip33701RateTypeTrgToBase,0,getStringValue(),beginIp33701RateTypeTrgToBase,IP_33701_RATE_TYPE_TRG_TO_BASE_LEN);
       localIp33701RateTypeTrgToBaseCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp33701RateTypeTrgToBaseConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp33701RateTypeTrgToBase is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp33701RateTypeTrgToBase() {	 
   		return (substring(getStringValue(),beginIp33701RateTypeTrgToBase,beginIp33701RateTypeTrgToBase + IP_33701_RATE_TYPE_TRG_TO_BASE_LEN));
   	}
     int localIp33701FxDateYydddCounter = -1;
     public boolean isIp33701FxDateYydddModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701FxDateYydddCounter != sharedCounter;
         localIp33701FxDateYydddCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip33701FxDateYyddd
	 *	@return ip33701FxDateYyddd
	 */
	public char[]  getIp33701FxDateYydddString() {
	     return getCharArray(beginIp33701FxDateYyddd,IP_33701_FX_DATE_YYDDD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701FxDateYydddIsNumeric() {
	    return isNumeric(beginIp33701FxDateYyddd
	                    ,beginIp33701FxDateYyddd + IP_33701_FX_DATE_YYDDD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_33701_FX_DATE_YYDDD_LEN = 5;
  	/**
	 * serializeIp33701FxDateYyddd
	 */
	protected void serializeIp33701FxDateYyddd(long ip33701FxDateYyddd) {
		 putNumber(beginIp33701FxDateYyddd,ip33701FxDateYyddd,IP_33701_FX_DATE_YYDDD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701FxDateYydddCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp33701FxDateYyddd
	 */
   	protected  long serializeIp33701FxDateYyddd(char[] value) {
	    long  ip33701FxDateYyddd;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip33701FxDateYyddd = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginIp33701FxDateYyddd
		       ,5
		      );
		 localIp33701FxDateYydddCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip33701FxDateYyddd;
    }

   protected long checkIp33701FxDateYydddMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp33701FxDateYyddd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp33701FxDateYyddd() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp33701FxDateYyddd
			                 ,IP_33701_FX_DATE_YYDDD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701FxDateYyddd", beginIp33701FxDateYyddd,IP_33701_FX_DATE_YYDDD_LEN);
    }
   	}
     int localIp33701IsTargetAmtTruncCounter = -1;
     public boolean isIp33701IsTargetAmtTruncModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701IsTargetAmtTruncCounter != sharedCounter;
         localIp33701IsTargetAmtTruncCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_33701_IS_TARGET_AMT_TRUNC_LEN = 1;
	/**
	 * 	serialize this Ip33701IsTargetAmtTrunc
	 */
   protected void serializeIp33701IsTargetAmtTrunc(char[] ip33701IsTargetAmtTrunc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip33701IsTargetAmtTrunc,0,getStringValue(),beginIp33701IsTargetAmtTrunc,IP_33701_IS_TARGET_AMT_TRUNC_LEN);
       localIp33701IsTargetAmtTruncCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp33701IsTargetAmtTruncConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp33701IsTargetAmtTrunc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp33701IsTargetAmtTrunc() {	 
   		return (substring(getStringValue(),beginIp33701IsTargetAmtTrunc,beginIp33701IsTargetAmtTrunc + IP_33701_IS_TARGET_AMT_TRUNC_LEN));
   	}
     int localIp33701ToGetSrcAmt6Counter = -1;
     public boolean isIp33701ToGetSrcAmt6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701ToGetSrcAmt6Counter != sharedCounter;
         localIp33701ToGetSrcAmt6Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_33701_TO_GET_SRC_AMT_6_LEN = 1;
	/**
	 * 	serialize this Ip33701ToGetSrcAmt6
	 */
   protected void serializeIp33701ToGetSrcAmt6(char[] ip33701ToGetSrcAmt6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip33701ToGetSrcAmt6,0,getStringValue(),beginIp33701ToGetSrcAmt6,IP_33701_TO_GET_SRC_AMT_6_LEN);
       localIp33701ToGetSrcAmt6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp33701ToGetSrcAmt6Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp33701ToGetSrcAmt6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp33701ToGetSrcAmt6() {	 
   		return (substring(getStringValue(),beginIp33701ToGetSrcAmt6,beginIp33701ToGetSrcAmt6 + IP_33701_TO_GET_SRC_AMT_6_LEN));
   	}




}
  
