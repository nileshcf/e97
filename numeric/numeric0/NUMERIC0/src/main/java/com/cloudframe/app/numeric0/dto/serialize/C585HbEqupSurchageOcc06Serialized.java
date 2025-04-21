package com.cloudframe.app.numeric0.dto.serialize;

/**
*  The class C585HbEqupSurchageOcc06Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class C585HbEqupSurchageOcc06Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(C585HbEqupSurchageOcc06Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int C_585_HB_EQUP_SURCHAGE_OCC_06_LENGTH = 40;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginC585HbTotVzwSurchgAmt;
            protected  int beginC585HbFusfRate;
            protected  int beginC585HbRegulatoryCharg;
            protected  int beginC585HbVzwAdminChgAmt;
	
	/**
	* Constructor for C585HbEqupSurchageOcc06Serialized
	**/
    public C585HbEqupSurchageOcc06Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in C585HbEqupSurchageOcc06Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(C_585_HB_EQUP_SURCHAGE_OCC_06_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginC585HbTotVzwSurchgAmt = getStartOffset() + 0;	// set offset for serialization
  
             beginC585HbFusfRate = getStartOffset() + 13;	// set offset for serialization
  
             beginC585HbRegulatoryCharg = getStartOffset() + 22;	// set offset for serialization
  
             beginC585HbVzwAdminChgAmt = getStartOffset() + 31;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localC585HbTotVzwSurchgAmtCounter = -1;
     
     public boolean isC585HbTotVzwSurchgAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localC585HbTotVzwSurchgAmtCounter != sharedCounter;
         localC585HbTotVzwSurchgAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of c585HbTotVzwSurchgAmt
	 *	@return c585HbTotVzwSurchgAmt
	 */
	public char[]  getC585HbTotVzwSurchgAmtString() {
	    return getCharArray(beginC585HbTotVzwSurchgAmt,C_585_HB_TOT_VZW_SURCHG_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean c585HbTotVzwSurchgAmtIsNumeric() {
		    return isNumeric(beginC585HbTotVzwSurchgAmt
	                    ,beginC585HbTotVzwSurchgAmt + C_585_HB_TOT_VZW_SURCHG_AMT_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int C_585_HB_TOT_VZW_SURCHG_AMT_LEN = 13;
  protected  static final int C_585_HB_TOT_VZW_SURCHG_AMT_SCALE = 3;

   protected BigDecimal checkC585HbTotVzwSurchgAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeC585HbTotVzwSurchgAmt
	 */
	protected void serializeC585HbTotVzwSurchgAmt(BigDecimal c585HbTotVzwSurchgAmt) {
	       putNumber(beginC585HbTotVzwSurchgAmt,c585HbTotVzwSurchgAmt,C_585_HB_TOT_VZW_SURCHG_AMT_LEN,C_585_HB_TOT_VZW_SURCHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localC585HbTotVzwSurchgAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeC585HbTotVzwSurchgAmt
	 */
   	protected  BigDecimal serializeC585HbTotVzwSurchgAmt(char[] value) throws CFException {
        if (value.length < 13) value = pad(13, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(13,value,true/*isSigned?*/)
		       ,beginC585HbTotVzwSurchgAmt
		       ,13
		      );		 localC585HbTotVzwSurchgAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,C_585_HB_TOT_VZW_SURCHG_AMT_LEN,C_585_HB_TOT_VZW_SURCHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("c585HbTotVzwSurchgAmt", beginC585HbTotVzwSurchgAmt,C_585_HB_TOT_VZW_SURCHG_AMT_LEN);
    	}
    }
    /**
	 *	refreshC585HbTotVzwSurchgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshC585HbTotVzwSurchgAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginC585HbTotVzwSurchgAmt
			            ,C_585_HB_TOT_VZW_SURCHG_AMT_LEN
			            ,C_585_HB_TOT_VZW_SURCHG_AMT_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("c585HbTotVzwSurchgAmt", beginC585HbTotVzwSurchgAmt,C_585_HB_TOT_VZW_SURCHG_AMT_LEN);
    }
   	}
     int localC585HbFusfRateCounter = -1;
     
     public boolean isC585HbFusfRateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localC585HbFusfRateCounter != sharedCounter;
         localC585HbFusfRateCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of c585HbFusfRate
	 *	@return c585HbFusfRate
	 */
	public char[]  getC585HbFusfRateString() {
	    return getCharArray(beginC585HbFusfRate,C_585_HB_FUSF_RATE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean c585HbFusfRateIsNumeric() {
		    return isNumeric(beginC585HbFusfRate
	                    ,beginC585HbFusfRate + C_585_HB_FUSF_RATE_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int C_585_HB_FUSF_RATE_LEN = 9;
  protected  static final int C_585_HB_FUSF_RATE_SCALE = 3;

   protected BigDecimal checkC585HbFusfRateMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeC585HbFusfRate
	 */
	protected void serializeC585HbFusfRate(BigDecimal c585HbFusfRate) {
	       putNumber(beginC585HbFusfRate,c585HbFusfRate,C_585_HB_FUSF_RATE_LEN,C_585_HB_FUSF_RATE_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localC585HbFusfRateCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeC585HbFusfRate
	 */
   	protected  BigDecimal serializeC585HbFusfRate(char[] value) throws CFException {
        if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginC585HbFusfRate
		       ,9
		      );		 localC585HbFusfRateCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,C_585_HB_FUSF_RATE_LEN,C_585_HB_FUSF_RATE_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("c585HbFusfRate", beginC585HbFusfRate,C_585_HB_FUSF_RATE_LEN);
    	}
    }
    /**
	 *	refreshC585HbFusfRate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshC585HbFusfRate() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginC585HbFusfRate
			            ,C_585_HB_FUSF_RATE_LEN
			            ,C_585_HB_FUSF_RATE_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("c585HbFusfRate", beginC585HbFusfRate,C_585_HB_FUSF_RATE_LEN);
    }
   	}
     int localC585HbRegulatoryChargCounter = -1;
     
     public boolean isC585HbRegulatoryChargModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localC585HbRegulatoryChargCounter != sharedCounter;
         localC585HbRegulatoryChargCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of c585HbRegulatoryCharg
	 *	@return c585HbRegulatoryCharg
	 */
	public char[]  getC585HbRegulatoryChargString() {
	    return getCharArray(beginC585HbRegulatoryCharg,C_585_HB_REGULATORY_CHARG_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean c585HbRegulatoryChargIsNumeric() {
		    return isNumeric(beginC585HbRegulatoryCharg
	                    ,beginC585HbRegulatoryCharg + C_585_HB_REGULATORY_CHARG_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int C_585_HB_REGULATORY_CHARG_LEN = 9;
  protected  static final int C_585_HB_REGULATORY_CHARG_SCALE = 3;

   protected BigDecimal checkC585HbRegulatoryChargMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeC585HbRegulatoryCharg
	 */
	protected void serializeC585HbRegulatoryCharg(BigDecimal c585HbRegulatoryCharg) {
	       putNumber(beginC585HbRegulatoryCharg,c585HbRegulatoryCharg,C_585_HB_REGULATORY_CHARG_LEN,C_585_HB_REGULATORY_CHARG_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localC585HbRegulatoryChargCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeC585HbRegulatoryCharg
	 */
   	protected  BigDecimal serializeC585HbRegulatoryCharg(char[] value) throws CFException {
        if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginC585HbRegulatoryCharg
		       ,9
		      );		 localC585HbRegulatoryChargCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,C_585_HB_REGULATORY_CHARG_LEN,C_585_HB_REGULATORY_CHARG_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("c585HbRegulatoryCharg", beginC585HbRegulatoryCharg,C_585_HB_REGULATORY_CHARG_LEN);
    	}
    }
    /**
	 *	refreshC585HbRegulatoryCharg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshC585HbRegulatoryCharg() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginC585HbRegulatoryCharg
			            ,C_585_HB_REGULATORY_CHARG_LEN
			            ,C_585_HB_REGULATORY_CHARG_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("c585HbRegulatoryCharg", beginC585HbRegulatoryCharg,C_585_HB_REGULATORY_CHARG_LEN);
    }
   	}
     int localC585HbVzwAdminChgAmtCounter = -1;
     
     public boolean isC585HbVzwAdminChgAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localC585HbVzwAdminChgAmtCounter != sharedCounter;
         localC585HbVzwAdminChgAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of c585HbVzwAdminChgAmt
	 *	@return c585HbVzwAdminChgAmt
	 */
	public char[]  getC585HbVzwAdminChgAmtString() {
	    return getCharArray(beginC585HbVzwAdminChgAmt,C_585_HB_VZW_ADMIN_CHG_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean c585HbVzwAdminChgAmtIsNumeric() {
		    return isNumeric(beginC585HbVzwAdminChgAmt
	                    ,beginC585HbVzwAdminChgAmt + C_585_HB_VZW_ADMIN_CHG_AMT_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int C_585_HB_VZW_ADMIN_CHG_AMT_LEN = 9;
  protected  static final int C_585_HB_VZW_ADMIN_CHG_AMT_SCALE = 3;

   protected BigDecimal checkC585HbVzwAdminChgAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeC585HbVzwAdminChgAmt
	 */
	protected void serializeC585HbVzwAdminChgAmt(BigDecimal c585HbVzwAdminChgAmt) {
	       putNumber(beginC585HbVzwAdminChgAmt,c585HbVzwAdminChgAmt,C_585_HB_VZW_ADMIN_CHG_AMT_LEN,C_585_HB_VZW_ADMIN_CHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localC585HbVzwAdminChgAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeC585HbVzwAdminChgAmt
	 */
   	protected  BigDecimal serializeC585HbVzwAdminChgAmt(char[] value) throws CFException {
        if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginC585HbVzwAdminChgAmt
		       ,9
		      );		 localC585HbVzwAdminChgAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,C_585_HB_VZW_ADMIN_CHG_AMT_LEN,C_585_HB_VZW_ADMIN_CHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("c585HbVzwAdminChgAmt", beginC585HbVzwAdminChgAmt,C_585_HB_VZW_ADMIN_CHG_AMT_LEN);
    	}
    }
    /**
	 *	refreshC585HbVzwAdminChgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshC585HbVzwAdminChgAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginC585HbVzwAdminChgAmt
			            ,C_585_HB_VZW_ADMIN_CHG_AMT_LEN
			            ,C_585_HB_VZW_ADMIN_CHG_AMT_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("c585HbVzwAdminChgAmt", beginC585HbVzwAdminChgAmt,C_585_HB_VZW_ADMIN_CHG_AMT_LEN);
    }
   	}




}
  
