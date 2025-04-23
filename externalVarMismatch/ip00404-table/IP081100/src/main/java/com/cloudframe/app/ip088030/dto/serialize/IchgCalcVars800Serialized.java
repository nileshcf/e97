package com.cloudframe.app.ip088030.dto.serialize;

/**
*  The class IchgCalcVars800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class IchgCalcVars800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IchgCalcVars800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ICHG_CALC_VARS_800_LENGTH = 183;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginViaAmt800;
            protected  int beginFiaAmt800;
            protected  int beginNetAmt800;
            protected  int beginClrTxnAmt6800;
            protected  int beginViaRate800;
            protected  int beginMinAmt800;
            protected  int beginMaxAmt800;
            protected  int beginViaRate801;
            protected  int beginFiaAmt801;
            protected  int beginMinAmt801;
            protected  int beginMaxAmt801;
            protected  int beginViaRate802;
            protected  int beginFiaAmt802;
            protected  int beginMinAmt802;
            protected  int beginMaxAmt802;
	
	/**
	* Constructor for IchgCalcVars800Serialized
	**/
    public IchgCalcVars800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in IchgCalcVars800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ICHG_CALC_VARS_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginViaAmt800 = getStartOffset() + 0;	// set offset for serialization
  
             beginFiaAmt800 = getStartOffset() + 12;	// set offset for serialization
  
             beginNetAmt800 = getStartOffset() + 24;	// set offset for serialization
  
             beginClrTxnAmt6800 = getStartOffset() + 36;	// set offset for serialization
  
             beginViaRate800 = getStartOffset() + 54;	// set offset for serialization
  
             beginMinAmt800 = getStartOffset() + 65;	// set offset for serialization
  
             beginMaxAmt800 = getStartOffset() + 77;	// set offset for serialization
  
             beginViaRate801 = getStartOffset() + 89;	// set offset for serialization
  
             beginFiaAmt801 = getStartOffset() + 100;	// set offset for serialization
  
             beginMinAmt801 = getStartOffset() + 112;	// set offset for serialization
  
             beginMaxAmt801 = getStartOffset() + 124;	// set offset for serialization
  
             beginViaRate802 = getStartOffset() + 136;	// set offset for serialization
  
             beginFiaAmt802 = getStartOffset() + 147;	// set offset for serialization
  
             beginMinAmt802 = getStartOffset() + 159;	// set offset for serialization
  
             beginMaxAmt802 = getStartOffset() + 171;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localViaAmt800Counter = -1;
     
     public boolean isViaAmt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localViaAmt800Counter != sharedCounter;
         localViaAmt800Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of viaAmt800
	 *	@return viaAmt800
	 */
	public char[]  getViaAmt800String() {
	    return getCharArray(beginViaAmt800,VIA_AMT_800_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean viaAmt800IsNumeric() {
		    return isNumeric(beginViaAmt800
	                    ,beginViaAmt800 + VIA_AMT_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int VIA_AMT_800_LEN = 12;
  protected  static final int VIA_AMT_800_SCALE = 6;

   protected BigDecimal checkViaAmt800MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeViaAmt800
	 */
	protected void serializeViaAmt800(BigDecimal viaAmt800) {
	       putNumber(beginViaAmt800,viaAmt800,VIA_AMT_800_LEN,VIA_AMT_800_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localViaAmt800Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeViaAmt800
	 */
   	protected  BigDecimal serializeViaAmt800(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginViaAmt800
		       ,12
		      );		 localViaAmt800Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,VIA_AMT_800_LEN,VIA_AMT_800_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("viaAmt800", beginViaAmt800,VIA_AMT_800_LEN);
    	}
    }
    /**
	 *	refreshViaAmt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshViaAmt800() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginViaAmt800
			            ,VIA_AMT_800_LEN
			            ,VIA_AMT_800_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("viaAmt800", beginViaAmt800,VIA_AMT_800_LEN);
    }
   	}
     int localFiaAmt800Counter = -1;
     
     public boolean isFiaAmt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiaAmt800Counter != sharedCounter;
         localFiaAmt800Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of fiaAmt800
	 *	@return fiaAmt800
	 */
	public char[]  getFiaAmt800String() {
	    return getCharArray(beginFiaAmt800,FIA_AMT_800_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fiaAmt800IsNumeric() {
		    return isNumeric(beginFiaAmt800
	                    ,beginFiaAmt800 + FIA_AMT_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int FIA_AMT_800_LEN = 12;
  protected  static final int FIA_AMT_800_SCALE = 6;

   protected BigDecimal checkFiaAmt800MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeFiaAmt800
	 */
	protected void serializeFiaAmt800(BigDecimal fiaAmt800) {
	       putNumber(beginFiaAmt800,fiaAmt800,FIA_AMT_800_LEN,FIA_AMT_800_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFiaAmt800Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeFiaAmt800
	 */
   	protected  BigDecimal serializeFiaAmt800(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginFiaAmt800
		       ,12
		      );		 localFiaAmt800Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,FIA_AMT_800_LEN,FIA_AMT_800_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("fiaAmt800", beginFiaAmt800,FIA_AMT_800_LEN);
    	}
    }
    /**
	 *	refreshFiaAmt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshFiaAmt800() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginFiaAmt800
			            ,FIA_AMT_800_LEN
			            ,FIA_AMT_800_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("fiaAmt800", beginFiaAmt800,FIA_AMT_800_LEN);
    }
   	}
     int localNetAmt800Counter = -1;
     
     public boolean isNetAmt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNetAmt800Counter != sharedCounter;
         localNetAmt800Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of netAmt800
	 *	@return netAmt800
	 */
	public char[]  getNetAmt800String() {
	    return getCharArray(beginNetAmt800,NET_AMT_800_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean netAmt800IsNumeric() {
		    return isNumeric(beginNetAmt800
	                    ,beginNetAmt800 + NET_AMT_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int NET_AMT_800_LEN = 12;
  protected  static final int NET_AMT_800_SCALE = 6;

   protected BigDecimal checkNetAmt800MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeNetAmt800
	 */
	protected void serializeNetAmt800(BigDecimal netAmt800) {
	       putNumber(beginNetAmt800,netAmt800,NET_AMT_800_LEN,NET_AMT_800_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNetAmt800Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeNetAmt800
	 */
   	protected  BigDecimal serializeNetAmt800(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginNetAmt800
		       ,12
		      );		 localNetAmt800Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,NET_AMT_800_LEN,NET_AMT_800_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("netAmt800", beginNetAmt800,NET_AMT_800_LEN);
    	}
    }
    /**
	 *	refreshNetAmt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshNetAmt800() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginNetAmt800
			            ,NET_AMT_800_LEN
			            ,NET_AMT_800_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("netAmt800", beginNetAmt800,NET_AMT_800_LEN);
    }
   	}
     int localClrTxnAmt6800Counter = -1;
     
     public boolean isClrTxnAmt6800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClrTxnAmt6800Counter != sharedCounter;
         localClrTxnAmt6800Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of clrTxnAmt6800
	 *	@return clrTxnAmt6800
	 */
	public char[]  getClrTxnAmt6800String() {
	    return getCharArray(beginClrTxnAmt6800,CLR_TXN_AMT_6800_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean clrTxnAmt6800IsNumeric() {
		    return isNumeric(beginClrTxnAmt6800
	                    ,beginClrTxnAmt6800 + CLR_TXN_AMT_6800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int CLR_TXN_AMT_6800_LEN = 18;
  protected  static final int CLR_TXN_AMT_6800_SCALE = 6;

   protected BigDecimal checkClrTxnAmt6800MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeClrTxnAmt6800
	 */
	protected void serializeClrTxnAmt6800(BigDecimal clrTxnAmt6800) {
	       putNumber(beginClrTxnAmt6800,clrTxnAmt6800,CLR_TXN_AMT_6800_LEN,CLR_TXN_AMT_6800_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localClrTxnAmt6800Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeClrTxnAmt6800
	 */
   	protected  BigDecimal serializeClrTxnAmt6800(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginClrTxnAmt6800
		       ,18
		      );		 localClrTxnAmt6800Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,CLR_TXN_AMT_6800_LEN,CLR_TXN_AMT_6800_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("clrTxnAmt6800", beginClrTxnAmt6800,CLR_TXN_AMT_6800_LEN);
    	}
    }
    /**
	 *	refreshClrTxnAmt6800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshClrTxnAmt6800() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginClrTxnAmt6800
			            ,CLR_TXN_AMT_6800_LEN
			            ,CLR_TXN_AMT_6800_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("clrTxnAmt6800", beginClrTxnAmt6800,CLR_TXN_AMT_6800_LEN);
    }
   	}
     int localViaRate800Counter = -1;
     
     public boolean isViaRate800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localViaRate800Counter != sharedCounter;
         localViaRate800Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of viaRate800
	 *	@return viaRate800
	 */
	public char[]  getViaRate800String() {
	    return getCharArray(beginViaRate800,VIA_RATE_800_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean viaRate800IsNumeric() {
		    return isNumeric(beginViaRate800
	                    ,beginViaRate800 + VIA_RATE_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int VIA_RATE_800_LEN = 11;
  protected  static final int VIA_RATE_800_SCALE = 6;

   protected BigDecimal checkViaRate800MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,11/*precision*/);
   }

  	/**
	 * serializeViaRate800
	 */
	protected void serializeViaRate800(BigDecimal viaRate800) {
	       putNumber(beginViaRate800,viaRate800,VIA_RATE_800_LEN,VIA_RATE_800_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localViaRate800Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeViaRate800
	 */
   	protected  BigDecimal serializeViaRate800(char[] value) throws CFException {
        if (value.length < 11) value = pad(11, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginViaRate800
		       ,11
		      );		 localViaRate800Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,VIA_RATE_800_LEN,VIA_RATE_800_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("viaRate800", beginViaRate800,VIA_RATE_800_LEN);
    	}
    }
    /**
	 *	refreshViaRate800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshViaRate800() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginViaRate800
			            ,VIA_RATE_800_LEN
			            ,VIA_RATE_800_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("viaRate800", beginViaRate800,VIA_RATE_800_LEN);
    }
   	}
     int localMinAmt800Counter = -1;
     
     public boolean isMinAmt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMinAmt800Counter != sharedCounter;
         localMinAmt800Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of minAmt800
	 *	@return minAmt800
	 */
	public char[]  getMinAmt800String() {
	    return getCharArray(beginMinAmt800,MIN_AMT_800_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean minAmt800IsNumeric() {
		    return isNumeric(beginMinAmt800
	                    ,beginMinAmt800 + MIN_AMT_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MIN_AMT_800_LEN = 12;
  protected  static final int MIN_AMT_800_SCALE = 2;

   protected BigDecimal checkMinAmt800MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeMinAmt800
	 */
	protected void serializeMinAmt800(BigDecimal minAmt800) {
	       putNumber(beginMinAmt800,minAmt800,MIN_AMT_800_LEN,MIN_AMT_800_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMinAmt800Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMinAmt800
	 */
   	protected  BigDecimal serializeMinAmt800(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginMinAmt800
		       ,12
		      );		 localMinAmt800Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MIN_AMT_800_LEN,MIN_AMT_800_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("minAmt800", beginMinAmt800,MIN_AMT_800_LEN);
    	}
    }
    /**
	 *	refreshMinAmt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMinAmt800() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMinAmt800
			            ,MIN_AMT_800_LEN
			            ,MIN_AMT_800_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("minAmt800", beginMinAmt800,MIN_AMT_800_LEN);
    }
   	}
     int localMaxAmt800Counter = -1;
     
     public boolean isMaxAmt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaxAmt800Counter != sharedCounter;
         localMaxAmt800Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of maxAmt800
	 *	@return maxAmt800
	 */
	public char[]  getMaxAmt800String() {
	    return getCharArray(beginMaxAmt800,MAX_AMT_800_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maxAmt800IsNumeric() {
		    return isNumeric(beginMaxAmt800
	                    ,beginMaxAmt800 + MAX_AMT_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MAX_AMT_800_LEN = 12;
  protected  static final int MAX_AMT_800_SCALE = 2;

   protected BigDecimal checkMaxAmt800MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeMaxAmt800
	 */
	protected void serializeMaxAmt800(BigDecimal maxAmt800) {
	       putNumber(beginMaxAmt800,maxAmt800,MAX_AMT_800_LEN,MAX_AMT_800_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMaxAmt800Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMaxAmt800
	 */
   	protected  BigDecimal serializeMaxAmt800(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginMaxAmt800
		       ,12
		      );		 localMaxAmt800Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MAX_AMT_800_LEN,MAX_AMT_800_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("maxAmt800", beginMaxAmt800,MAX_AMT_800_LEN);
    	}
    }
    /**
	 *	refreshMaxAmt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMaxAmt800() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMaxAmt800
			            ,MAX_AMT_800_LEN
			            ,MAX_AMT_800_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("maxAmt800", beginMaxAmt800,MAX_AMT_800_LEN);
    }
   	}
     int localViaRate801Counter = -1;
     
     public boolean isViaRate801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localViaRate801Counter != sharedCounter;
         localViaRate801Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of viaRate801
	 *	@return viaRate801
	 */
	public char[]  getViaRate801String() {
	    return getCharArray(beginViaRate801,VIA_RATE_801_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean viaRate801IsNumeric() {
		    return isNumeric(beginViaRate801
	                    ,beginViaRate801 + VIA_RATE_801_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int VIA_RATE_801_LEN = 11;
  protected  static final int VIA_RATE_801_SCALE = 6;

   protected BigDecimal checkViaRate801MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,11/*precision*/);
   }

  	/**
	 * serializeViaRate801
	 */
	protected void serializeViaRate801(BigDecimal viaRate801) {
	       putNumber(beginViaRate801,viaRate801,VIA_RATE_801_LEN,VIA_RATE_801_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localViaRate801Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeViaRate801
	 */
   	protected  BigDecimal serializeViaRate801(char[] value) throws CFException {
        if (value.length < 11) value = pad(11, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginViaRate801
		       ,11
		      );		 localViaRate801Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,VIA_RATE_801_LEN,VIA_RATE_801_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("viaRate801", beginViaRate801,VIA_RATE_801_LEN);
    	}
    }
    /**
	 *	refreshViaRate801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshViaRate801() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginViaRate801
			            ,VIA_RATE_801_LEN
			            ,VIA_RATE_801_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("viaRate801", beginViaRate801,VIA_RATE_801_LEN);
    }
   	}
     int localFiaAmt801Counter = -1;
     
     public boolean isFiaAmt801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiaAmt801Counter != sharedCounter;
         localFiaAmt801Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of fiaAmt801
	 *	@return fiaAmt801
	 */
	public char[]  getFiaAmt801String() {
	    return getCharArray(beginFiaAmt801,FIA_AMT_801_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fiaAmt801IsNumeric() {
		    return isNumeric(beginFiaAmt801
	                    ,beginFiaAmt801 + FIA_AMT_801_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int FIA_AMT_801_LEN = 12;
  protected  static final int FIA_AMT_801_SCALE = 6;

   protected BigDecimal checkFiaAmt801MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeFiaAmt801
	 */
	protected void serializeFiaAmt801(BigDecimal fiaAmt801) {
	       putNumber(beginFiaAmt801,fiaAmt801,FIA_AMT_801_LEN,FIA_AMT_801_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFiaAmt801Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeFiaAmt801
	 */
   	protected  BigDecimal serializeFiaAmt801(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginFiaAmt801
		       ,12
		      );		 localFiaAmt801Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,FIA_AMT_801_LEN,FIA_AMT_801_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("fiaAmt801", beginFiaAmt801,FIA_AMT_801_LEN);
    	}
    }
    /**
	 *	refreshFiaAmt801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshFiaAmt801() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginFiaAmt801
			            ,FIA_AMT_801_LEN
			            ,FIA_AMT_801_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("fiaAmt801", beginFiaAmt801,FIA_AMT_801_LEN);
    }
   	}
     int localMinAmt801Counter = -1;
     
     public boolean isMinAmt801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMinAmt801Counter != sharedCounter;
         localMinAmt801Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of minAmt801
	 *	@return minAmt801
	 */
	public char[]  getMinAmt801String() {
	    return getCharArray(beginMinAmt801,MIN_AMT_801_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean minAmt801IsNumeric() {
		    return isNumeric(beginMinAmt801
	                    ,beginMinAmt801 + MIN_AMT_801_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MIN_AMT_801_LEN = 12;
  protected  static final int MIN_AMT_801_SCALE = 2;

   protected BigDecimal checkMinAmt801MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeMinAmt801
	 */
	protected void serializeMinAmt801(BigDecimal minAmt801) {
	       putNumber(beginMinAmt801,minAmt801,MIN_AMT_801_LEN,MIN_AMT_801_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMinAmt801Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMinAmt801
	 */
   	protected  BigDecimal serializeMinAmt801(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginMinAmt801
		       ,12
		      );		 localMinAmt801Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MIN_AMT_801_LEN,MIN_AMT_801_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("minAmt801", beginMinAmt801,MIN_AMT_801_LEN);
    	}
    }
    /**
	 *	refreshMinAmt801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMinAmt801() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMinAmt801
			            ,MIN_AMT_801_LEN
			            ,MIN_AMT_801_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("minAmt801", beginMinAmt801,MIN_AMT_801_LEN);
    }
   	}
     int localMaxAmt801Counter = -1;
     
     public boolean isMaxAmt801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaxAmt801Counter != sharedCounter;
         localMaxAmt801Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of maxAmt801
	 *	@return maxAmt801
	 */
	public char[]  getMaxAmt801String() {
	    return getCharArray(beginMaxAmt801,MAX_AMT_801_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maxAmt801IsNumeric() {
		    return isNumeric(beginMaxAmt801
	                    ,beginMaxAmt801 + MAX_AMT_801_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MAX_AMT_801_LEN = 12;
  protected  static final int MAX_AMT_801_SCALE = 2;

   protected BigDecimal checkMaxAmt801MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeMaxAmt801
	 */
	protected void serializeMaxAmt801(BigDecimal maxAmt801) {
	       putNumber(beginMaxAmt801,maxAmt801,MAX_AMT_801_LEN,MAX_AMT_801_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMaxAmt801Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMaxAmt801
	 */
   	protected  BigDecimal serializeMaxAmt801(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginMaxAmt801
		       ,12
		      );		 localMaxAmt801Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MAX_AMT_801_LEN,MAX_AMT_801_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("maxAmt801", beginMaxAmt801,MAX_AMT_801_LEN);
    	}
    }
    /**
	 *	refreshMaxAmt801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMaxAmt801() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMaxAmt801
			            ,MAX_AMT_801_LEN
			            ,MAX_AMT_801_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("maxAmt801", beginMaxAmt801,MAX_AMT_801_LEN);
    }
   	}
     int localViaRate802Counter = -1;
     
     public boolean isViaRate802Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localViaRate802Counter != sharedCounter;
         localViaRate802Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of viaRate802
	 *	@return viaRate802
	 */
	public char[]  getViaRate802String() {
	    return getCharArray(beginViaRate802,VIA_RATE_802_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean viaRate802IsNumeric() {
		    return isNumeric(beginViaRate802
	                    ,beginViaRate802 + VIA_RATE_802_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int VIA_RATE_802_LEN = 11;
  protected  static final int VIA_RATE_802_SCALE = 6;

   protected BigDecimal checkViaRate802MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,11/*precision*/);
   }

  	/**
	 * serializeViaRate802
	 */
	protected void serializeViaRate802(BigDecimal viaRate802) {
	       putNumber(beginViaRate802,viaRate802,VIA_RATE_802_LEN,VIA_RATE_802_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localViaRate802Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeViaRate802
	 */
   	protected  BigDecimal serializeViaRate802(char[] value) throws CFException {
        if (value.length < 11) value = pad(11, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginViaRate802
		       ,11
		      );		 localViaRate802Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,VIA_RATE_802_LEN,VIA_RATE_802_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("viaRate802", beginViaRate802,VIA_RATE_802_LEN);
    	}
    }
    /**
	 *	refreshViaRate802 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshViaRate802() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginViaRate802
			            ,VIA_RATE_802_LEN
			            ,VIA_RATE_802_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("viaRate802", beginViaRate802,VIA_RATE_802_LEN);
    }
   	}
     int localFiaAmt802Counter = -1;
     
     public boolean isFiaAmt802Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiaAmt802Counter != sharedCounter;
         localFiaAmt802Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of fiaAmt802
	 *	@return fiaAmt802
	 */
	public char[]  getFiaAmt802String() {
	    return getCharArray(beginFiaAmt802,FIA_AMT_802_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fiaAmt802IsNumeric() {
		    return isNumeric(beginFiaAmt802
	                    ,beginFiaAmt802 + FIA_AMT_802_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int FIA_AMT_802_LEN = 12;
  protected  static final int FIA_AMT_802_SCALE = 6;

   protected BigDecimal checkFiaAmt802MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeFiaAmt802
	 */
	protected void serializeFiaAmt802(BigDecimal fiaAmt802) {
	       putNumber(beginFiaAmt802,fiaAmt802,FIA_AMT_802_LEN,FIA_AMT_802_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFiaAmt802Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeFiaAmt802
	 */
   	protected  BigDecimal serializeFiaAmt802(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginFiaAmt802
		       ,12
		      );		 localFiaAmt802Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,FIA_AMT_802_LEN,FIA_AMT_802_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("fiaAmt802", beginFiaAmt802,FIA_AMT_802_LEN);
    	}
    }
    /**
	 *	refreshFiaAmt802 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshFiaAmt802() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginFiaAmt802
			            ,FIA_AMT_802_LEN
			            ,FIA_AMT_802_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("fiaAmt802", beginFiaAmt802,FIA_AMT_802_LEN);
    }
   	}
     int localMinAmt802Counter = -1;
     
     public boolean isMinAmt802Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMinAmt802Counter != sharedCounter;
         localMinAmt802Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of minAmt802
	 *	@return minAmt802
	 */
	public char[]  getMinAmt802String() {
	    return getCharArray(beginMinAmt802,MIN_AMT_802_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean minAmt802IsNumeric() {
		    return isNumeric(beginMinAmt802
	                    ,beginMinAmt802 + MIN_AMT_802_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MIN_AMT_802_LEN = 12;
  protected  static final int MIN_AMT_802_SCALE = 2;

   protected BigDecimal checkMinAmt802MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeMinAmt802
	 */
	protected void serializeMinAmt802(BigDecimal minAmt802) {
	       putNumber(beginMinAmt802,minAmt802,MIN_AMT_802_LEN,MIN_AMT_802_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMinAmt802Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMinAmt802
	 */
   	protected  BigDecimal serializeMinAmt802(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginMinAmt802
		       ,12
		      );		 localMinAmt802Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MIN_AMT_802_LEN,MIN_AMT_802_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("minAmt802", beginMinAmt802,MIN_AMT_802_LEN);
    	}
    }
    /**
	 *	refreshMinAmt802 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMinAmt802() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMinAmt802
			            ,MIN_AMT_802_LEN
			            ,MIN_AMT_802_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("minAmt802", beginMinAmt802,MIN_AMT_802_LEN);
    }
   	}
     int localMaxAmt802Counter = -1;
     
     public boolean isMaxAmt802Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaxAmt802Counter != sharedCounter;
         localMaxAmt802Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of maxAmt802
	 *	@return maxAmt802
	 */
	public char[]  getMaxAmt802String() {
	    return getCharArray(beginMaxAmt802,MAX_AMT_802_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maxAmt802IsNumeric() {
		    return isNumeric(beginMaxAmt802
	                    ,beginMaxAmt802 + MAX_AMT_802_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MAX_AMT_802_LEN = 12;
  protected  static final int MAX_AMT_802_SCALE = 2;

   protected BigDecimal checkMaxAmt802MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeMaxAmt802
	 */
	protected void serializeMaxAmt802(BigDecimal maxAmt802) {
	       putNumber(beginMaxAmt802,maxAmt802,MAX_AMT_802_LEN,MAX_AMT_802_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMaxAmt802Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMaxAmt802
	 */
   	protected  BigDecimal serializeMaxAmt802(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginMaxAmt802
		       ,12
		      );		 localMaxAmt802Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MAX_AMT_802_LEN,MAX_AMT_802_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("maxAmt802", beginMaxAmt802,MAX_AMT_802_LEN);
    	}
    }
    /**
	 *	refreshMaxAmt802 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMaxAmt802() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMaxAmt802
			            ,MAX_AMT_802_LEN
			            ,MAX_AMT_802_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("maxAmt802", beginMaxAmt802,MAX_AMT_802_LEN);
    }
   	}




}
  
