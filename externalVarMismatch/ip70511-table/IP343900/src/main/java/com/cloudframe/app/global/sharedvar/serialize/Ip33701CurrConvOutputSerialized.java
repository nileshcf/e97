package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip33701CurrConvOutputSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Ip33701CurrConvOutputSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip33701CurrConvOutputSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_33701_CURR_CONV_OUTPUT_LENGTH = 91;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp33701ConvType;
            protected  int beginIp33701RateSrcToTrg;
            protected  int beginIp33701SrcAmt6Decimals;
            protected  int beginIp33701TargetAmount;
            protected  int beginIp33701TargetAmount1;
            protected  int beginIp33701TargetAmount2;
            protected  int beginIp33701TargetAmount3;
            protected  int beginIp33701TargetAmount4;
            protected  int beginIp33701TargetAmount5;
            protected  int beginIp33701TargetAmount6;
            protected  int beginIp33701TrgAmt6Decimals;
            protected  int beginIp33701TargetAmount7;
            protected  int beginIp33701ReturnCode;
	
	/**
	* Constructor for Ip33701CurrConvOutputSerialized
	**/
    public Ip33701CurrConvOutputSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip33701CurrConvOutputSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip33701CurrConvOutputSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip33701CurrConvOutputSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,39); // serialize this field at offset 39 by default 
    }
    
	/**
	* sets parent for this Ip33701CurrConvOutputSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 39 by default
    }    
	/**
	* initializes the field in Ip33701CurrConvOutputSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_33701_CURR_CONV_OUTPUT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp33701ConvType = getStartOffset() + 0;	// set offset for serialization
  
             beginIp33701RateSrcToTrg = getStartOffset() + 1;	// set offset for serialization
  
             beginIp33701SrcAmt6Decimals = getStartOffset() + 16;	// set offset for serialization
  
             beginIp33701TargetAmount = getStartOffset() + 34;	// set offset for serialization
  
             beginIp33701TargetAmount1 = getStartOffset() + 34;	// set offset for serialization
  
             beginIp33701TargetAmount2 = getStartOffset() + 34;	// set offset for serialization
  
             beginIp33701TargetAmount3 = getStartOffset() + 34;	// set offset for serialization
  
             beginIp33701TargetAmount4 = getStartOffset() + 34;	// set offset for serialization
  
             beginIp33701TargetAmount5 = getStartOffset() + 34;	// set offset for serialization
  
             beginIp33701TargetAmount6 = getStartOffset() + 34;	// set offset for serialization
  
             beginIp33701TrgAmt6Decimals = getStartOffset() + 52;	// set offset for serialization
  
             beginIp33701TargetAmount7 = getStartOffset() + 70;	// set offset for serialization
  
             beginIp33701ReturnCode = getStartOffset() + 89;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp33701ConvTypeCounter = -1;
     public boolean isIp33701ConvTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701ConvTypeCounter != sharedCounter;
         localIp33701ConvTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_33701_CONV_TYPE_LEN = 1;
	/**
	 * 	serialize this Ip33701ConvType
	 */
   protected void serializeIp33701ConvType(char[] ip33701ConvType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip33701ConvType,0,getStringValue(),beginIp33701ConvType,IP_33701_CONV_TYPE_LEN);
       localIp33701ConvTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp33701ConvTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp33701ConvType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp33701ConvType() {	 
   		return (substring(getStringValue(),beginIp33701ConvType,beginIp33701ConvType + IP_33701_CONV_TYPE_LEN));
   	}
     int localIp33701RateSrcToTrgCounter = -1;
     
     public boolean isIp33701RateSrcToTrgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701RateSrcToTrgCounter != sharedCounter;
         localIp33701RateSrcToTrgCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ip33701RateSrcToTrg
	 *	@return ip33701RateSrcToTrg
	 */
	public char[]  getIp33701RateSrcToTrgString() {
	    return getCharArray(beginIp33701RateSrcToTrg,IP_33701_RATE_SRC_TO_TRG_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701RateSrcToTrgIsNumeric() {
		    return isNumeric(beginIp33701RateSrcToTrg
	                    ,beginIp33701RateSrcToTrg + IP_33701_RATE_SRC_TO_TRG_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int IP_33701_RATE_SRC_TO_TRG_LEN = 15;
  protected  static final int IP_33701_RATE_SRC_TO_TRG_SCALE = 7;

   protected BigDecimal checkIp33701RateSrcToTrgMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,7/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeIp33701RateSrcToTrg
	 */
	protected void serializeIp33701RateSrcToTrg(BigDecimal ip33701RateSrcToTrg) {
	       putNumber(beginIp33701RateSrcToTrg,ip33701RateSrcToTrg,IP_33701_RATE_SRC_TO_TRG_LEN,IP_33701_RATE_SRC_TO_TRG_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701RateSrcToTrgCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeIp33701RateSrcToTrg
	 */
   	protected  BigDecimal serializeIp33701RateSrcToTrg(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginIp33701RateSrcToTrg
		       ,15
		      );		 localIp33701RateSrcToTrgCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,IP_33701_RATE_SRC_TO_TRG_LEN,IP_33701_RATE_SRC_TO_TRG_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ip33701RateSrcToTrg", beginIp33701RateSrcToTrg,IP_33701_RATE_SRC_TO_TRG_LEN);
    	}
    }
    /**
	 *	refreshIp33701RateSrcToTrg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshIp33701RateSrcToTrg() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginIp33701RateSrcToTrg
			            ,IP_33701_RATE_SRC_TO_TRG_LEN
			            ,IP_33701_RATE_SRC_TO_TRG_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701RateSrcToTrg", beginIp33701RateSrcToTrg,IP_33701_RATE_SRC_TO_TRG_LEN);
    }
   	}
     int localIp33701SrcAmt6DecimalsCounter = -1;
     
     public boolean isIp33701SrcAmt6DecimalsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701SrcAmt6DecimalsCounter != sharedCounter;
         localIp33701SrcAmt6DecimalsCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ip33701SrcAmt6Decimals
	 *	@return ip33701SrcAmt6Decimals
	 */
	public char[]  getIp33701SrcAmt6DecimalsString() {
	    return getCharArray(beginIp33701SrcAmt6Decimals,IP_33701_SRC_AMT_6_DECIMALS_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701SrcAmt6DecimalsIsNumeric() {
		    return isNumeric(beginIp33701SrcAmt6Decimals
	                    ,beginIp33701SrcAmt6Decimals + IP_33701_SRC_AMT_6_DECIMALS_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int IP_33701_SRC_AMT_6_DECIMALS_LEN = 18;
  protected  static final int IP_33701_SRC_AMT_6_DECIMALS_SCALE = 6;

   protected BigDecimal checkIp33701SrcAmt6DecimalsMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeIp33701SrcAmt6Decimals
	 */
	protected void serializeIp33701SrcAmt6Decimals(BigDecimal ip33701SrcAmt6Decimals) {
	       putNumber(beginIp33701SrcAmt6Decimals,ip33701SrcAmt6Decimals,IP_33701_SRC_AMT_6_DECIMALS_LEN,IP_33701_SRC_AMT_6_DECIMALS_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701SrcAmt6DecimalsCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeIp33701SrcAmt6Decimals
	 */
   	protected  BigDecimal serializeIp33701SrcAmt6Decimals(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginIp33701SrcAmt6Decimals
		       ,18
		      );		 localIp33701SrcAmt6DecimalsCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,IP_33701_SRC_AMT_6_DECIMALS_LEN,IP_33701_SRC_AMT_6_DECIMALS_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ip33701SrcAmt6Decimals", beginIp33701SrcAmt6Decimals,IP_33701_SRC_AMT_6_DECIMALS_LEN);
    	}
    }
    /**
	 *	refreshIp33701SrcAmt6Decimals is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshIp33701SrcAmt6Decimals() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginIp33701SrcAmt6Decimals
			            ,IP_33701_SRC_AMT_6_DECIMALS_LEN
			            ,IP_33701_SRC_AMT_6_DECIMALS_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701SrcAmt6Decimals", beginIp33701SrcAmt6Decimals,IP_33701_SRC_AMT_6_DECIMALS_LEN);
    }
   	}
     int localIp33701TargetAmountCounter = -1;
     public boolean isIp33701TargetAmountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701TargetAmountCounter != sharedCounter;
         localIp33701TargetAmountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip33701TargetAmount
	 *	@return ip33701TargetAmount
	 */
	public char[]  getIp33701TargetAmountString() {
	     return getCharArray(beginIp33701TargetAmount,IP_33701_TARGET_AMOUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetAmountIsNumeric() {
	    return isNumeric(beginIp33701TargetAmount
	                    ,beginIp33701TargetAmount + IP_33701_TARGET_AMOUNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_33701_TARGET_AMOUNT_LEN = 18;
  	/**
	 * serializeIp33701TargetAmount
	 */
	protected void serializeIp33701TargetAmount(long ip33701TargetAmount) {
		 putNumber(beginIp33701TargetAmount,ip33701TargetAmount,IP_33701_TARGET_AMOUNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701TargetAmountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp33701TargetAmount
	 */
   	protected  long serializeIp33701TargetAmount(char[] value) {
	    long  ip33701TargetAmount;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip33701TargetAmount = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginIp33701TargetAmount
		       ,18
		      );
		 localIp33701TargetAmountCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip33701TargetAmount;
    }

   protected long checkIp33701TargetAmountMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshIp33701TargetAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp33701TargetAmount() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp33701TargetAmount
			                 ,IP_33701_TARGET_AMOUNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701TargetAmount", beginIp33701TargetAmount,IP_33701_TARGET_AMOUNT_LEN);
    }
   	}
     int localIp33701TargetAmount1Counter = -1;
     
     public boolean isIp33701TargetAmount1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701TargetAmount1Counter != sharedCounter;
         localIp33701TargetAmount1Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ip33701TargetAmount1
	 *	@return ip33701TargetAmount1
	 */
	public char[]  getIp33701TargetAmount1String() {
	    return getCharArray(beginIp33701TargetAmount1,IP_33701_TARGET_AMOUNT_1_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetAmount1IsNumeric() {
		    return isNumeric(beginIp33701TargetAmount1
	                    ,beginIp33701TargetAmount1 + IP_33701_TARGET_AMOUNT_1_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int IP_33701_TARGET_AMOUNT_1_LEN = 18;
  protected  static final int IP_33701_TARGET_AMOUNT_1_SCALE = 1;

   protected BigDecimal checkIp33701TargetAmount1MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,1/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeIp33701TargetAmount1
	 */
	protected void serializeIp33701TargetAmount1(BigDecimal ip33701TargetAmount1) {
	       putNumber(beginIp33701TargetAmount1,ip33701TargetAmount1,IP_33701_TARGET_AMOUNT_1_LEN,IP_33701_TARGET_AMOUNT_1_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701TargetAmount1Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeIp33701TargetAmount1
	 */
   	protected  BigDecimal serializeIp33701TargetAmount1(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginIp33701TargetAmount1
		       ,18
		      );		 localIp33701TargetAmount1Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,IP_33701_TARGET_AMOUNT_1_LEN,IP_33701_TARGET_AMOUNT_1_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ip33701TargetAmount1", beginIp33701TargetAmount1,IP_33701_TARGET_AMOUNT_1_LEN);
    	}
    }
    /**
	 *	refreshIp33701TargetAmount1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshIp33701TargetAmount1() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginIp33701TargetAmount1
			            ,IP_33701_TARGET_AMOUNT_1_LEN
			            ,IP_33701_TARGET_AMOUNT_1_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701TargetAmount1", beginIp33701TargetAmount1,IP_33701_TARGET_AMOUNT_1_LEN);
    }
   	}
     int localIp33701TargetAmount2Counter = -1;
     
     public boolean isIp33701TargetAmount2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701TargetAmount2Counter != sharedCounter;
         localIp33701TargetAmount2Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ip33701TargetAmount2
	 *	@return ip33701TargetAmount2
	 */
	public char[]  getIp33701TargetAmount2String() {
	    return getCharArray(beginIp33701TargetAmount2,IP_33701_TARGET_AMOUNT_2_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetAmount2IsNumeric() {
		    return isNumeric(beginIp33701TargetAmount2
	                    ,beginIp33701TargetAmount2 + IP_33701_TARGET_AMOUNT_2_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int IP_33701_TARGET_AMOUNT_2_LEN = 18;
  protected  static final int IP_33701_TARGET_AMOUNT_2_SCALE = 2;

   protected BigDecimal checkIp33701TargetAmount2MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeIp33701TargetAmount2
	 */
	protected void serializeIp33701TargetAmount2(BigDecimal ip33701TargetAmount2) {
	       putNumber(beginIp33701TargetAmount2,ip33701TargetAmount2,IP_33701_TARGET_AMOUNT_2_LEN,IP_33701_TARGET_AMOUNT_2_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701TargetAmount2Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeIp33701TargetAmount2
	 */
   	protected  BigDecimal serializeIp33701TargetAmount2(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginIp33701TargetAmount2
		       ,18
		      );		 localIp33701TargetAmount2Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,IP_33701_TARGET_AMOUNT_2_LEN,IP_33701_TARGET_AMOUNT_2_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ip33701TargetAmount2", beginIp33701TargetAmount2,IP_33701_TARGET_AMOUNT_2_LEN);
    	}
    }
    /**
	 *	refreshIp33701TargetAmount2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshIp33701TargetAmount2() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginIp33701TargetAmount2
			            ,IP_33701_TARGET_AMOUNT_2_LEN
			            ,IP_33701_TARGET_AMOUNT_2_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701TargetAmount2", beginIp33701TargetAmount2,IP_33701_TARGET_AMOUNT_2_LEN);
    }
   	}
     int localIp33701TargetAmount3Counter = -1;
     
     public boolean isIp33701TargetAmount3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701TargetAmount3Counter != sharedCounter;
         localIp33701TargetAmount3Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ip33701TargetAmount3
	 *	@return ip33701TargetAmount3
	 */
	public char[]  getIp33701TargetAmount3String() {
	    return getCharArray(beginIp33701TargetAmount3,IP_33701_TARGET_AMOUNT_3_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetAmount3IsNumeric() {
		    return isNumeric(beginIp33701TargetAmount3
	                    ,beginIp33701TargetAmount3 + IP_33701_TARGET_AMOUNT_3_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int IP_33701_TARGET_AMOUNT_3_LEN = 18;
  protected  static final int IP_33701_TARGET_AMOUNT_3_SCALE = 3;

   protected BigDecimal checkIp33701TargetAmount3MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeIp33701TargetAmount3
	 */
	protected void serializeIp33701TargetAmount3(BigDecimal ip33701TargetAmount3) {
	       putNumber(beginIp33701TargetAmount3,ip33701TargetAmount3,IP_33701_TARGET_AMOUNT_3_LEN,IP_33701_TARGET_AMOUNT_3_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701TargetAmount3Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeIp33701TargetAmount3
	 */
   	protected  BigDecimal serializeIp33701TargetAmount3(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginIp33701TargetAmount3
		       ,18
		      );		 localIp33701TargetAmount3Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,IP_33701_TARGET_AMOUNT_3_LEN,IP_33701_TARGET_AMOUNT_3_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ip33701TargetAmount3", beginIp33701TargetAmount3,IP_33701_TARGET_AMOUNT_3_LEN);
    	}
    }
    /**
	 *	refreshIp33701TargetAmount3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshIp33701TargetAmount3() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginIp33701TargetAmount3
			            ,IP_33701_TARGET_AMOUNT_3_LEN
			            ,IP_33701_TARGET_AMOUNT_3_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701TargetAmount3", beginIp33701TargetAmount3,IP_33701_TARGET_AMOUNT_3_LEN);
    }
   	}
     int localIp33701TargetAmount4Counter = -1;
     
     public boolean isIp33701TargetAmount4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701TargetAmount4Counter != sharedCounter;
         localIp33701TargetAmount4Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ip33701TargetAmount4
	 *	@return ip33701TargetAmount4
	 */
	public char[]  getIp33701TargetAmount4String() {
	    return getCharArray(beginIp33701TargetAmount4,IP_33701_TARGET_AMOUNT_4_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetAmount4IsNumeric() {
		    return isNumeric(beginIp33701TargetAmount4
	                    ,beginIp33701TargetAmount4 + IP_33701_TARGET_AMOUNT_4_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int IP_33701_TARGET_AMOUNT_4_LEN = 18;
  protected  static final int IP_33701_TARGET_AMOUNT_4_SCALE = 4;

   protected BigDecimal checkIp33701TargetAmount4MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeIp33701TargetAmount4
	 */
	protected void serializeIp33701TargetAmount4(BigDecimal ip33701TargetAmount4) {
	       putNumber(beginIp33701TargetAmount4,ip33701TargetAmount4,IP_33701_TARGET_AMOUNT_4_LEN,IP_33701_TARGET_AMOUNT_4_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701TargetAmount4Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeIp33701TargetAmount4
	 */
   	protected  BigDecimal serializeIp33701TargetAmount4(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginIp33701TargetAmount4
		       ,18
		      );		 localIp33701TargetAmount4Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,IP_33701_TARGET_AMOUNT_4_LEN,IP_33701_TARGET_AMOUNT_4_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ip33701TargetAmount4", beginIp33701TargetAmount4,IP_33701_TARGET_AMOUNT_4_LEN);
    	}
    }
    /**
	 *	refreshIp33701TargetAmount4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshIp33701TargetAmount4() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginIp33701TargetAmount4
			            ,IP_33701_TARGET_AMOUNT_4_LEN
			            ,IP_33701_TARGET_AMOUNT_4_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701TargetAmount4", beginIp33701TargetAmount4,IP_33701_TARGET_AMOUNT_4_LEN);
    }
   	}
     int localIp33701TargetAmount5Counter = -1;
     
     public boolean isIp33701TargetAmount5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701TargetAmount5Counter != sharedCounter;
         localIp33701TargetAmount5Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ip33701TargetAmount5
	 *	@return ip33701TargetAmount5
	 */
	public char[]  getIp33701TargetAmount5String() {
	    return getCharArray(beginIp33701TargetAmount5,IP_33701_TARGET_AMOUNT_5_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetAmount5IsNumeric() {
		    return isNumeric(beginIp33701TargetAmount5
	                    ,beginIp33701TargetAmount5 + IP_33701_TARGET_AMOUNT_5_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int IP_33701_TARGET_AMOUNT_5_LEN = 18;
  protected  static final int IP_33701_TARGET_AMOUNT_5_SCALE = 5;

   protected BigDecimal checkIp33701TargetAmount5MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,5/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeIp33701TargetAmount5
	 */
	protected void serializeIp33701TargetAmount5(BigDecimal ip33701TargetAmount5) {
	       putNumber(beginIp33701TargetAmount5,ip33701TargetAmount5,IP_33701_TARGET_AMOUNT_5_LEN,IP_33701_TARGET_AMOUNT_5_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701TargetAmount5Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeIp33701TargetAmount5
	 */
   	protected  BigDecimal serializeIp33701TargetAmount5(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginIp33701TargetAmount5
		       ,18
		      );		 localIp33701TargetAmount5Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,IP_33701_TARGET_AMOUNT_5_LEN,IP_33701_TARGET_AMOUNT_5_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ip33701TargetAmount5", beginIp33701TargetAmount5,IP_33701_TARGET_AMOUNT_5_LEN);
    	}
    }
    /**
	 *	refreshIp33701TargetAmount5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshIp33701TargetAmount5() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginIp33701TargetAmount5
			            ,IP_33701_TARGET_AMOUNT_5_LEN
			            ,IP_33701_TARGET_AMOUNT_5_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701TargetAmount5", beginIp33701TargetAmount5,IP_33701_TARGET_AMOUNT_5_LEN);
    }
   	}
     int localIp33701TargetAmount6Counter = -1;
     
     public boolean isIp33701TargetAmount6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701TargetAmount6Counter != sharedCounter;
         localIp33701TargetAmount6Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ip33701TargetAmount6
	 *	@return ip33701TargetAmount6
	 */
	public char[]  getIp33701TargetAmount6String() {
	    return getCharArray(beginIp33701TargetAmount6,IP_33701_TARGET_AMOUNT_6_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetAmount6IsNumeric() {
		    return isNumeric(beginIp33701TargetAmount6
	                    ,beginIp33701TargetAmount6 + IP_33701_TARGET_AMOUNT_6_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int IP_33701_TARGET_AMOUNT_6_LEN = 18;
  protected  static final int IP_33701_TARGET_AMOUNT_6_SCALE = 6;

   protected BigDecimal checkIp33701TargetAmount6MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeIp33701TargetAmount6
	 */
	protected void serializeIp33701TargetAmount6(BigDecimal ip33701TargetAmount6) {
	       putNumber(beginIp33701TargetAmount6,ip33701TargetAmount6,IP_33701_TARGET_AMOUNT_6_LEN,IP_33701_TARGET_AMOUNT_6_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701TargetAmount6Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeIp33701TargetAmount6
	 */
   	protected  BigDecimal serializeIp33701TargetAmount6(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginIp33701TargetAmount6
		       ,18
		      );		 localIp33701TargetAmount6Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,IP_33701_TARGET_AMOUNT_6_LEN,IP_33701_TARGET_AMOUNT_6_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ip33701TargetAmount6", beginIp33701TargetAmount6,IP_33701_TARGET_AMOUNT_6_LEN);
    	}
    }
    /**
	 *	refreshIp33701TargetAmount6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshIp33701TargetAmount6() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginIp33701TargetAmount6
			            ,IP_33701_TARGET_AMOUNT_6_LEN
			            ,IP_33701_TARGET_AMOUNT_6_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701TargetAmount6", beginIp33701TargetAmount6,IP_33701_TARGET_AMOUNT_6_LEN);
    }
   	}
     int localIp33701TrgAmt6DecimalsCounter = -1;
     
     public boolean isIp33701TrgAmt6DecimalsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701TrgAmt6DecimalsCounter != sharedCounter;
         localIp33701TrgAmt6DecimalsCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ip33701TrgAmt6Decimals
	 *	@return ip33701TrgAmt6Decimals
	 */
	public char[]  getIp33701TrgAmt6DecimalsString() {
	    return getCharArray(beginIp33701TrgAmt6Decimals,IP_33701_TRG_AMT_6_DECIMALS_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TrgAmt6DecimalsIsNumeric() {
		    return isNumeric(beginIp33701TrgAmt6Decimals
	                    ,beginIp33701TrgAmt6Decimals + IP_33701_TRG_AMT_6_DECIMALS_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int IP_33701_TRG_AMT_6_DECIMALS_LEN = 18;
  protected  static final int IP_33701_TRG_AMT_6_DECIMALS_SCALE = 6;

   protected BigDecimal checkIp33701TrgAmt6DecimalsMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeIp33701TrgAmt6Decimals
	 */
	protected void serializeIp33701TrgAmt6Decimals(BigDecimal ip33701TrgAmt6Decimals) {
	       putNumber(beginIp33701TrgAmt6Decimals,ip33701TrgAmt6Decimals,IP_33701_TRG_AMT_6_DECIMALS_LEN,IP_33701_TRG_AMT_6_DECIMALS_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701TrgAmt6DecimalsCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeIp33701TrgAmt6Decimals
	 */
   	protected  BigDecimal serializeIp33701TrgAmt6Decimals(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginIp33701TrgAmt6Decimals
		       ,18
		      );		 localIp33701TrgAmt6DecimalsCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,IP_33701_TRG_AMT_6_DECIMALS_LEN,IP_33701_TRG_AMT_6_DECIMALS_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ip33701TrgAmt6Decimals", beginIp33701TrgAmt6Decimals,IP_33701_TRG_AMT_6_DECIMALS_LEN);
    	}
    }
    /**
	 *	refreshIp33701TrgAmt6Decimals is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshIp33701TrgAmt6Decimals() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginIp33701TrgAmt6Decimals
			            ,IP_33701_TRG_AMT_6_DECIMALS_LEN
			            ,IP_33701_TRG_AMT_6_DECIMALS_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701TrgAmt6Decimals", beginIp33701TrgAmt6Decimals,IP_33701_TRG_AMT_6_DECIMALS_LEN);
    }
   	}
     int localIp33701TargetAmount7Counter = -1;
     
     public boolean isIp33701TargetAmount7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701TargetAmount7Counter != sharedCounter;
         localIp33701TargetAmount7Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ip33701TargetAmount7
	 *	@return ip33701TargetAmount7
	 */
	public char[]  getIp33701TargetAmount7String() {
	    return getCharArray(beginIp33701TargetAmount7,IP_33701_TARGET_AMOUNT_7_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetAmount7IsNumeric() {
		    return isNumeric(beginIp33701TargetAmount7
	                    ,beginIp33701TargetAmount7 + IP_33701_TARGET_AMOUNT_7_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int IP_33701_TARGET_AMOUNT_7_LEN = 19;
  protected  static final int IP_33701_TARGET_AMOUNT_7_SCALE = 7;

   protected BigDecimal checkIp33701TargetAmount7MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,7/*scale*/,19/*precision*/);
   }

  	/**
	 * serializeIp33701TargetAmount7
	 */
	protected void serializeIp33701TargetAmount7(BigDecimal ip33701TargetAmount7) {
	       putNumber(beginIp33701TargetAmount7,ip33701TargetAmount7,IP_33701_TARGET_AMOUNT_7_LEN,IP_33701_TARGET_AMOUNT_7_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701TargetAmount7Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeIp33701TargetAmount7
	 */
   	protected  BigDecimal serializeIp33701TargetAmount7(char[] value) throws CFException {
        if (value.length < 19) value = pad(19, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(19,value,true/*isSigned?*/)
		       ,beginIp33701TargetAmount7
		       ,19
		      );		 localIp33701TargetAmount7Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,IP_33701_TARGET_AMOUNT_7_LEN,IP_33701_TARGET_AMOUNT_7_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ip33701TargetAmount7", beginIp33701TargetAmount7,IP_33701_TARGET_AMOUNT_7_LEN);
    	}
    }
    /**
	 *	refreshIp33701TargetAmount7 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshIp33701TargetAmount7() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginIp33701TargetAmount7
			            ,IP_33701_TARGET_AMOUNT_7_LEN
			            ,IP_33701_TARGET_AMOUNT_7_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701TargetAmount7", beginIp33701TargetAmount7,IP_33701_TARGET_AMOUNT_7_LEN);
    }
   	}
         int localIp33701ReturnCodeCounter = -1;
         public boolean isIp33701ReturnCodeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp33701ReturnCodeCounter != sharedCounter;
            localIp33701ReturnCodeCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_33701_RETURN_CODE_LEN = 2;
  	/**
	 * serializeIp33701ReturnCode
	 */
	protected void serializeIp33701ReturnCode(short ip33701ReturnCode) {
           replaceValue( //  save the value as string
                   getBinaryString( ip33701ReturnCode,IP_33701_RETURN_CODE_LEN)
                  ,beginIp33701ReturnCode
                  ,IP_33701_RETURN_CODE_LEN
                 );
            localIp33701ReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp33701ReturnCodeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp33701ReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp33701ReturnCode() {	 
			return (getShort(beginIp33701ReturnCode));
   	}




}
  
