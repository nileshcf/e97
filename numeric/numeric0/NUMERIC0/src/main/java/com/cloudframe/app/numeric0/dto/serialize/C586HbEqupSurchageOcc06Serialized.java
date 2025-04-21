package com.cloudframe.app.numeric0.dto.serialize;

/**
*  The class C586HbEqupSurchageOcc06Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:57. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class C586HbEqupSurchageOcc06Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(C586HbEqupSurchageOcc06Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int C_586_HB_EQUP_SURCHAGE_OCC_06_LENGTH = 32;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginC586HbTotVzwSurchgAmt;
            protected  int beginC586HbFusfRate;
            protected  int beginC586HbRegulatoryCharg;
            protected  int beginC586HbVzwAdminChgAmt;
	
	/**
	* Constructor for C586HbEqupSurchageOcc06Serialized
	**/
    public C586HbEqupSurchageOcc06Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in C586HbEqupSurchageOcc06Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(C_586_HB_EQUP_SURCHAGE_OCC_06_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginC586HbTotVzwSurchgAmt = getStartOffset() + 0;	// set offset for serialization
  
             beginC586HbFusfRate = getStartOffset() + 11;	// set offset for serialization
  
             beginC586HbRegulatoryCharg = getStartOffset() + 18;	// set offset for serialization
  
             beginC586HbVzwAdminChgAmt = getStartOffset() + 25;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localC586HbTotVzwSurchgAmtCounter = -1;
     
     public boolean isC586HbTotVzwSurchgAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localC586HbTotVzwSurchgAmtCounter != sharedCounter;
         localC586HbTotVzwSurchgAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of c586HbTotVzwSurchgAmt
	 *	@return c586HbTotVzwSurchgAmt
	 */
	public char[]  getC586HbTotVzwSurchgAmtString() {
	    return getCharArray(beginC586HbTotVzwSurchgAmt,C_586_HB_TOT_VZW_SURCHG_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean c586HbTotVzwSurchgAmtIsNumeric() {
		    return isNumeric(beginC586HbTotVzwSurchgAmt
	                    ,beginC586HbTotVzwSurchgAmt + C_586_HB_TOT_VZW_SURCHG_AMT_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int C_586_HB_TOT_VZW_SURCHG_AMT_LEN = 11;
  protected  static final int C_586_HB_TOT_VZW_SURCHG_AMT_SCALE = 1;

   protected BigDecimal checkC586HbTotVzwSurchgAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,1/*scale*/,10/*precision*/);
   }

  	/**
	 * serializeC586HbTotVzwSurchgAmt
	 */
	protected void serializeC586HbTotVzwSurchgAmt(BigDecimal c586HbTotVzwSurchgAmt) {
	       putNumber(beginC586HbTotVzwSurchgAmt,c586HbTotVzwSurchgAmt,C_586_HB_TOT_VZW_SURCHG_AMT_LEN,C_586_HB_TOT_VZW_SURCHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localC586HbTotVzwSurchgAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeC586HbTotVzwSurchgAmt
	 */
   	protected  BigDecimal serializeC586HbTotVzwSurchgAmt(char[] value) throws CFException {
        if (value.length < 11) value = pad(11, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(11,value,true/*isSigned?*/)
		       ,beginC586HbTotVzwSurchgAmt
		       ,11
		      );		 localC586HbTotVzwSurchgAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,C_586_HB_TOT_VZW_SURCHG_AMT_LEN,C_586_HB_TOT_VZW_SURCHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("c586HbTotVzwSurchgAmt", beginC586HbTotVzwSurchgAmt,C_586_HB_TOT_VZW_SURCHG_AMT_LEN);
    	}
    }
    /**
	 *	refreshC586HbTotVzwSurchgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshC586HbTotVzwSurchgAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginC586HbTotVzwSurchgAmt
			            ,C_586_HB_TOT_VZW_SURCHG_AMT_LEN
			            ,C_586_HB_TOT_VZW_SURCHG_AMT_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("c586HbTotVzwSurchgAmt", beginC586HbTotVzwSurchgAmt,C_586_HB_TOT_VZW_SURCHG_AMT_LEN);
    }
   	}
     int localC586HbFusfRateCounter = -1;
     
     public boolean isC586HbFusfRateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localC586HbFusfRateCounter != sharedCounter;
         localC586HbFusfRateCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of c586HbFusfRate
	 *	@return c586HbFusfRate
	 */
	public char[]  getC586HbFusfRateString() {
	    return getCharArray(beginC586HbFusfRate,C_586_HB_FUSF_RATE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean c586HbFusfRateIsNumeric() {
		    return isNumeric(beginC586HbFusfRate
	                    ,beginC586HbFusfRate + C_586_HB_FUSF_RATE_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int C_586_HB_FUSF_RATE_LEN = 7;
  protected  static final int C_586_HB_FUSF_RATE_SCALE = 1;

   protected BigDecimal checkC586HbFusfRateMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,1/*scale*/,6/*precision*/);
   }

  	/**
	 * serializeC586HbFusfRate
	 */
	protected void serializeC586HbFusfRate(BigDecimal c586HbFusfRate) {
	       putNumber(beginC586HbFusfRate,c586HbFusfRate,C_586_HB_FUSF_RATE_LEN,C_586_HB_FUSF_RATE_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localC586HbFusfRateCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeC586HbFusfRate
	 */
   	protected  BigDecimal serializeC586HbFusfRate(char[] value) throws CFException {
        if (value.length < 7) value = pad(7, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(7,value,true/*isSigned?*/)
		       ,beginC586HbFusfRate
		       ,7
		      );		 localC586HbFusfRateCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,C_586_HB_FUSF_RATE_LEN,C_586_HB_FUSF_RATE_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("c586HbFusfRate", beginC586HbFusfRate,C_586_HB_FUSF_RATE_LEN);
    	}
    }
    /**
	 *	refreshC586HbFusfRate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshC586HbFusfRate() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginC586HbFusfRate
			            ,C_586_HB_FUSF_RATE_LEN
			            ,C_586_HB_FUSF_RATE_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("c586HbFusfRate", beginC586HbFusfRate,C_586_HB_FUSF_RATE_LEN);
    }
   	}
     int localC586HbRegulatoryChargCounter = -1;
     
     public boolean isC586HbRegulatoryChargModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localC586HbRegulatoryChargCounter != sharedCounter;
         localC586HbRegulatoryChargCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of c586HbRegulatoryCharg
	 *	@return c586HbRegulatoryCharg
	 */
	public char[]  getC586HbRegulatoryChargString() {
	    return getCharArray(beginC586HbRegulatoryCharg,C_586_HB_REGULATORY_CHARG_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean c586HbRegulatoryChargIsNumeric() {
		    return isNumeric(beginC586HbRegulatoryCharg
	                    ,beginC586HbRegulatoryCharg + C_586_HB_REGULATORY_CHARG_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int C_586_HB_REGULATORY_CHARG_LEN = 7;
  protected  static final int C_586_HB_REGULATORY_CHARG_SCALE = 1;

   protected BigDecimal checkC586HbRegulatoryChargMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,1/*scale*/,6/*precision*/);
   }

  	/**
	 * serializeC586HbRegulatoryCharg
	 */
	protected void serializeC586HbRegulatoryCharg(BigDecimal c586HbRegulatoryCharg) {
	       putNumber(beginC586HbRegulatoryCharg,c586HbRegulatoryCharg,C_586_HB_REGULATORY_CHARG_LEN,C_586_HB_REGULATORY_CHARG_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localC586HbRegulatoryChargCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeC586HbRegulatoryCharg
	 */
   	protected  BigDecimal serializeC586HbRegulatoryCharg(char[] value) throws CFException {
        if (value.length < 7) value = pad(7, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(7,value,true/*isSigned?*/)
		       ,beginC586HbRegulatoryCharg
		       ,7
		      );		 localC586HbRegulatoryChargCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,C_586_HB_REGULATORY_CHARG_LEN,C_586_HB_REGULATORY_CHARG_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("c586HbRegulatoryCharg", beginC586HbRegulatoryCharg,C_586_HB_REGULATORY_CHARG_LEN);
    	}
    }
    /**
	 *	refreshC586HbRegulatoryCharg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshC586HbRegulatoryCharg() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginC586HbRegulatoryCharg
			            ,C_586_HB_REGULATORY_CHARG_LEN
			            ,C_586_HB_REGULATORY_CHARG_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("c586HbRegulatoryCharg", beginC586HbRegulatoryCharg,C_586_HB_REGULATORY_CHARG_LEN);
    }
   	}
     int localC586HbVzwAdminChgAmtCounter = -1;
     
     public boolean isC586HbVzwAdminChgAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localC586HbVzwAdminChgAmtCounter != sharedCounter;
         localC586HbVzwAdminChgAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of c586HbVzwAdminChgAmt
	 *	@return c586HbVzwAdminChgAmt
	 */
	public char[]  getC586HbVzwAdminChgAmtString() {
	    return getCharArray(beginC586HbVzwAdminChgAmt,C_586_HB_VZW_ADMIN_CHG_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean c586HbVzwAdminChgAmtIsNumeric() {
		    return isNumeric(beginC586HbVzwAdminChgAmt
	                    ,beginC586HbVzwAdminChgAmt + C_586_HB_VZW_ADMIN_CHG_AMT_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int C_586_HB_VZW_ADMIN_CHG_AMT_LEN = 7;
  protected  static final int C_586_HB_VZW_ADMIN_CHG_AMT_SCALE = 1;

   protected BigDecimal checkC586HbVzwAdminChgAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,1/*scale*/,6/*precision*/);
   }

  	/**
	 * serializeC586HbVzwAdminChgAmt
	 */
	protected void serializeC586HbVzwAdminChgAmt(BigDecimal c586HbVzwAdminChgAmt) {
	       putNumber(beginC586HbVzwAdminChgAmt,c586HbVzwAdminChgAmt,C_586_HB_VZW_ADMIN_CHG_AMT_LEN,C_586_HB_VZW_ADMIN_CHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localC586HbVzwAdminChgAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeC586HbVzwAdminChgAmt
	 */
   	protected  BigDecimal serializeC586HbVzwAdminChgAmt(char[] value) throws CFException {
        if (value.length < 7) value = pad(7, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(7,value,true/*isSigned?*/)
		       ,beginC586HbVzwAdminChgAmt
		       ,7
		      );		 localC586HbVzwAdminChgAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,C_586_HB_VZW_ADMIN_CHG_AMT_LEN,C_586_HB_VZW_ADMIN_CHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("c586HbVzwAdminChgAmt", beginC586HbVzwAdminChgAmt,C_586_HB_VZW_ADMIN_CHG_AMT_LEN);
    	}
    }
    /**
	 *	refreshC586HbVzwAdminChgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshC586HbVzwAdminChgAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginC586HbVzwAdminChgAmt
			            ,C_586_HB_VZW_ADMIN_CHG_AMT_LEN
			            ,C_586_HB_VZW_ADMIN_CHG_AMT_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("c586HbVzwAdminChgAmt", beginC586HbVzwAdminChgAmt,C_586_HB_VZW_ADMIN_CHG_AMT_LEN);
    }
   	}




}
  
