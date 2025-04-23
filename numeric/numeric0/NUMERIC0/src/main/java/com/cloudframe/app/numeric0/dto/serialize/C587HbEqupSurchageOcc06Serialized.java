package com.cloudframe.app.numeric0.dto.serialize;

/**
*  The class C587HbEqupSurchageOcc06Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class C587HbEqupSurchageOcc06Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(C587HbEqupSurchageOcc06Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int C_587_HB_EQUP_SURCHAGE_OCC_06_LENGTH = 19;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginC587HbTotVzwSurchgAmt;
            protected  int beginC587HbFusfRate;
            protected  int beginC587HbRegulatoryCharg;
            protected  int beginC587HbVzwAdminChgAmt;
	
	/**
	* Constructor for C587HbEqupSurchageOcc06Serialized
	**/
    public C587HbEqupSurchageOcc06Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in C587HbEqupSurchageOcc06Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(C_587_HB_EQUP_SURCHAGE_OCC_06_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginC587HbTotVzwSurchgAmt = getStartOffset() + 0;	// set offset for serialization
  
             beginC587HbFusfRate = getStartOffset() + 7;	// set offset for serialization
  
             beginC587HbRegulatoryCharg = getStartOffset() + 11;	// set offset for serialization
  
             beginC587HbVzwAdminChgAmt = getStartOffset() + 15;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localC587HbTotVzwSurchgAmtCounter = -1;
     
     public boolean isC587HbTotVzwSurchgAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localC587HbTotVzwSurchgAmtCounter != sharedCounter;
         localC587HbTotVzwSurchgAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of c587HbTotVzwSurchgAmt
	 *	@return c587HbTotVzwSurchgAmt
	 */
	public char[]  getC587HbTotVzwSurchgAmtString() {
	    return getCharArray(beginC587HbTotVzwSurchgAmt,C_587_HB_TOT_VZW_SURCHG_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean c587HbTotVzwSurchgAmtIsNumeric() {
		    return isNumeric(beginC587HbTotVzwSurchgAmt
	                    ,beginC587HbTotVzwSurchgAmt + C_587_HB_TOT_VZW_SURCHG_AMT_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int C_587_HB_TOT_VZW_SURCHG_AMT_LEN = 7;
  protected  static final int C_587_HB_TOT_VZW_SURCHG_AMT_SCALE = 1;

   protected BigDecimal checkC587HbTotVzwSurchgAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,1/*scale*/,6/*precision*/);
   }

  	/**
	 * serializeC587HbTotVzwSurchgAmt
	 */
	protected void serializeC587HbTotVzwSurchgAmt(BigDecimal c587HbTotVzwSurchgAmt) {
	       putNumber(beginC587HbTotVzwSurchgAmt,c587HbTotVzwSurchgAmt,C_587_HB_TOT_VZW_SURCHG_AMT_LEN,C_587_HB_TOT_VZW_SURCHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localC587HbTotVzwSurchgAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeC587HbTotVzwSurchgAmt
	 */
   	protected  BigDecimal serializeC587HbTotVzwSurchgAmt(char[] value) throws CFException {
        if (value.length < 7) value = pad(7, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(7,value,true/*isSigned?*/)
		       ,beginC587HbTotVzwSurchgAmt
		       ,7
		      );		 localC587HbTotVzwSurchgAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,C_587_HB_TOT_VZW_SURCHG_AMT_LEN,C_587_HB_TOT_VZW_SURCHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("c587HbTotVzwSurchgAmt", beginC587HbTotVzwSurchgAmt,C_587_HB_TOT_VZW_SURCHG_AMT_LEN);
    	}
    }
    /**
	 *	refreshC587HbTotVzwSurchgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshC587HbTotVzwSurchgAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginC587HbTotVzwSurchgAmt
			            ,C_587_HB_TOT_VZW_SURCHG_AMT_LEN
			            ,C_587_HB_TOT_VZW_SURCHG_AMT_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("c587HbTotVzwSurchgAmt", beginC587HbTotVzwSurchgAmt,C_587_HB_TOT_VZW_SURCHG_AMT_LEN);
    }
   	}
     int localC587HbFusfRateCounter = -1;
     
     public boolean isC587HbFusfRateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localC587HbFusfRateCounter != sharedCounter;
         localC587HbFusfRateCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of c587HbFusfRate
	 *	@return c587HbFusfRate
	 */
	public char[]  getC587HbFusfRateString() {
	    return getCharArray(beginC587HbFusfRate,C_587_HB_FUSF_RATE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean c587HbFusfRateIsNumeric() {
		    return isNumeric(beginC587HbFusfRate
	                    ,beginC587HbFusfRate + C_587_HB_FUSF_RATE_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int C_587_HB_FUSF_RATE_LEN = 4;
  protected  static final int C_587_HB_FUSF_RATE_SCALE = 1;

   protected BigDecimal checkC587HbFusfRateMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,1/*scale*/,3/*precision*/);
   }

  	/**
	 * serializeC587HbFusfRate
	 */
	protected void serializeC587HbFusfRate(BigDecimal c587HbFusfRate) {
	       putNumber(beginC587HbFusfRate,c587HbFusfRate,C_587_HB_FUSF_RATE_LEN,C_587_HB_FUSF_RATE_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localC587HbFusfRateCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeC587HbFusfRate
	 */
   	protected  BigDecimal serializeC587HbFusfRate(char[] value) throws CFException {
        if (value.length < 4) value = pad(4, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginC587HbFusfRate
		       ,4
		      );		 localC587HbFusfRateCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,C_587_HB_FUSF_RATE_LEN,C_587_HB_FUSF_RATE_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("c587HbFusfRate", beginC587HbFusfRate,C_587_HB_FUSF_RATE_LEN);
    	}
    }
    /**
	 *	refreshC587HbFusfRate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshC587HbFusfRate() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginC587HbFusfRate
			            ,C_587_HB_FUSF_RATE_LEN
			            ,C_587_HB_FUSF_RATE_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("c587HbFusfRate", beginC587HbFusfRate,C_587_HB_FUSF_RATE_LEN);
    }
   	}
     int localC587HbRegulatoryChargCounter = -1;
     
     public boolean isC587HbRegulatoryChargModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localC587HbRegulatoryChargCounter != sharedCounter;
         localC587HbRegulatoryChargCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of c587HbRegulatoryCharg
	 *	@return c587HbRegulatoryCharg
	 */
	public char[]  getC587HbRegulatoryChargString() {
	    return getCharArray(beginC587HbRegulatoryCharg,C_587_HB_REGULATORY_CHARG_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean c587HbRegulatoryChargIsNumeric() {
		    return isNumeric(beginC587HbRegulatoryCharg
	                    ,beginC587HbRegulatoryCharg + C_587_HB_REGULATORY_CHARG_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int C_587_HB_REGULATORY_CHARG_LEN = 4;
  protected  static final int C_587_HB_REGULATORY_CHARG_SCALE = 1;

   protected BigDecimal checkC587HbRegulatoryChargMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,1/*scale*/,3/*precision*/);
   }

  	/**
	 * serializeC587HbRegulatoryCharg
	 */
	protected void serializeC587HbRegulatoryCharg(BigDecimal c587HbRegulatoryCharg) {
	       putNumber(beginC587HbRegulatoryCharg,c587HbRegulatoryCharg,C_587_HB_REGULATORY_CHARG_LEN,C_587_HB_REGULATORY_CHARG_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localC587HbRegulatoryChargCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeC587HbRegulatoryCharg
	 */
   	protected  BigDecimal serializeC587HbRegulatoryCharg(char[] value) throws CFException {
        if (value.length < 4) value = pad(4, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginC587HbRegulatoryCharg
		       ,4
		      );		 localC587HbRegulatoryChargCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,C_587_HB_REGULATORY_CHARG_LEN,C_587_HB_REGULATORY_CHARG_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("c587HbRegulatoryCharg", beginC587HbRegulatoryCharg,C_587_HB_REGULATORY_CHARG_LEN);
    	}
    }
    /**
	 *	refreshC587HbRegulatoryCharg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshC587HbRegulatoryCharg() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginC587HbRegulatoryCharg
			            ,C_587_HB_REGULATORY_CHARG_LEN
			            ,C_587_HB_REGULATORY_CHARG_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("c587HbRegulatoryCharg", beginC587HbRegulatoryCharg,C_587_HB_REGULATORY_CHARG_LEN);
    }
   	}
     int localC587HbVzwAdminChgAmtCounter = -1;
     
     public boolean isC587HbVzwAdminChgAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localC587HbVzwAdminChgAmtCounter != sharedCounter;
         localC587HbVzwAdminChgAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of c587HbVzwAdminChgAmt
	 *	@return c587HbVzwAdminChgAmt
	 */
	public char[]  getC587HbVzwAdminChgAmtString() {
	    return getCharArray(beginC587HbVzwAdminChgAmt,C_587_HB_VZW_ADMIN_CHG_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean c587HbVzwAdminChgAmtIsNumeric() {
		    return isNumeric(beginC587HbVzwAdminChgAmt
	                    ,beginC587HbVzwAdminChgAmt + C_587_HB_VZW_ADMIN_CHG_AMT_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int C_587_HB_VZW_ADMIN_CHG_AMT_LEN = 4;
  protected  static final int C_587_HB_VZW_ADMIN_CHG_AMT_SCALE = 1;

   protected BigDecimal checkC587HbVzwAdminChgAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,1/*scale*/,3/*precision*/);
   }

  	/**
	 * serializeC587HbVzwAdminChgAmt
	 */
	protected void serializeC587HbVzwAdminChgAmt(BigDecimal c587HbVzwAdminChgAmt) {
	       putNumber(beginC587HbVzwAdminChgAmt,c587HbVzwAdminChgAmt,C_587_HB_VZW_ADMIN_CHG_AMT_LEN,C_587_HB_VZW_ADMIN_CHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localC587HbVzwAdminChgAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeC587HbVzwAdminChgAmt
	 */
   	protected  BigDecimal serializeC587HbVzwAdminChgAmt(char[] value) throws CFException {
        if (value.length < 4) value = pad(4, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginC587HbVzwAdminChgAmt
		       ,4
		      );		 localC587HbVzwAdminChgAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,C_587_HB_VZW_ADMIN_CHG_AMT_LEN,C_587_HB_VZW_ADMIN_CHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("c587HbVzwAdminChgAmt", beginC587HbVzwAdminChgAmt,C_587_HB_VZW_ADMIN_CHG_AMT_LEN);
    	}
    }
    /**
	 *	refreshC587HbVzwAdminChgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshC587HbVzwAdminChgAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginC587HbVzwAdminChgAmt
			            ,C_587_HB_VZW_ADMIN_CHG_AMT_LEN
			            ,C_587_HB_VZW_ADMIN_CHG_AMT_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("c587HbVzwAdminChgAmt", beginC587HbVzwAdminChgAmt,C_587_HB_VZW_ADMIN_CHG_AMT_LEN);
    }
   	}




}
  
