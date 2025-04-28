package com.cloudframe.app.numeric0.dto.serialize;

/**
*  The class C584HbEqupSurchageOcc06Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:50. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class C584HbEqupSurchageOcc06Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(C584HbEqupSurchageOcc06Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int C_584_HB_EQUP_SURCHAGE_OCC_06_LENGTH = 28;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginC584HbTotVzwSurchgAmt;
            protected  int beginC584HbFusfRate;
            protected  int beginC584HbRegulatoryCharg;
            protected  int beginC584HbVzwAdminChgAmt;
	
	/**
	* Constructor for C584HbEqupSurchageOcc06Serialized
	**/
    public C584HbEqupSurchageOcc06Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in C584HbEqupSurchageOcc06Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(C_584_HB_EQUP_SURCHAGE_OCC_06_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginC584HbTotVzwSurchgAmt = getStartOffset() + 0;	// set offset for serialization
  
             beginC584HbFusfRate = getStartOffset() + 10;	// set offset for serialization
  
             beginC584HbRegulatoryCharg = getStartOffset() + 16;	// set offset for serialization
  
             beginC584HbVzwAdminChgAmt = getStartOffset() + 22;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localC584HbTotVzwSurchgAmtCounter = -1;
     
     public boolean isC584HbTotVzwSurchgAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localC584HbTotVzwSurchgAmtCounter != sharedCounter;
         localC584HbTotVzwSurchgAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of c584HbTotVzwSurchgAmt
	 *	@return c584HbTotVzwSurchgAmt
	 */
	public char[]  getC584HbTotVzwSurchgAmtString() {
	    return getCharArray(beginC584HbTotVzwSurchgAmt,C_584_HB_TOT_VZW_SURCHG_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean c584HbTotVzwSurchgAmtIsNumeric() {
		    return isNumeric(beginC584HbTotVzwSurchgAmt
	                    ,beginC584HbTotVzwSurchgAmt + C_584_HB_TOT_VZW_SURCHG_AMT_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int C_584_HB_TOT_VZW_SURCHG_AMT_LEN = 10;
  protected  static final int C_584_HB_TOT_VZW_SURCHG_AMT_SCALE = 2;

   protected BigDecimal checkC584HbTotVzwSurchgAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,9/*precision*/);
   }

  	/**
	 * serializeC584HbTotVzwSurchgAmt
	 */
	protected void serializeC584HbTotVzwSurchgAmt(BigDecimal c584HbTotVzwSurchgAmt) {
	       putNumber(beginC584HbTotVzwSurchgAmt,c584HbTotVzwSurchgAmt,C_584_HB_TOT_VZW_SURCHG_AMT_LEN,C_584_HB_TOT_VZW_SURCHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localC584HbTotVzwSurchgAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeC584HbTotVzwSurchgAmt
	 */
   	protected  BigDecimal serializeC584HbTotVzwSurchgAmt(char[] value) throws CFException {
        if (value.length < 10) value = pad(10, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginC584HbTotVzwSurchgAmt
		       ,10
		      );		 localC584HbTotVzwSurchgAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,C_584_HB_TOT_VZW_SURCHG_AMT_LEN,C_584_HB_TOT_VZW_SURCHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("c584HbTotVzwSurchgAmt", beginC584HbTotVzwSurchgAmt,C_584_HB_TOT_VZW_SURCHG_AMT_LEN);
    	}
    }
    /**
	 *	refreshC584HbTotVzwSurchgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshC584HbTotVzwSurchgAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginC584HbTotVzwSurchgAmt
			            ,C_584_HB_TOT_VZW_SURCHG_AMT_LEN
			            ,C_584_HB_TOT_VZW_SURCHG_AMT_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("c584HbTotVzwSurchgAmt", beginC584HbTotVzwSurchgAmt,C_584_HB_TOT_VZW_SURCHG_AMT_LEN);
    }
   	}
     int localC584HbFusfRateCounter = -1;
     
     public boolean isC584HbFusfRateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localC584HbFusfRateCounter != sharedCounter;
         localC584HbFusfRateCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of c584HbFusfRate
	 *	@return c584HbFusfRate
	 */
	public char[]  getC584HbFusfRateString() {
	    return getCharArray(beginC584HbFusfRate,C_584_HB_FUSF_RATE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean c584HbFusfRateIsNumeric() {
		    return isNumeric(beginC584HbFusfRate
	                    ,beginC584HbFusfRate + C_584_HB_FUSF_RATE_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int C_584_HB_FUSF_RATE_LEN = 6;
  protected  static final int C_584_HB_FUSF_RATE_SCALE = 2;

   protected BigDecimal checkC584HbFusfRateMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,5/*precision*/);
   }

  	/**
	 * serializeC584HbFusfRate
	 */
	protected void serializeC584HbFusfRate(BigDecimal c584HbFusfRate) {
	       putNumber(beginC584HbFusfRate,c584HbFusfRate,C_584_HB_FUSF_RATE_LEN,C_584_HB_FUSF_RATE_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localC584HbFusfRateCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeC584HbFusfRate
	 */
   	protected  BigDecimal serializeC584HbFusfRate(char[] value) throws CFException {
        if (value.length < 6) value = pad(6, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginC584HbFusfRate
		       ,6
		      );		 localC584HbFusfRateCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,C_584_HB_FUSF_RATE_LEN,C_584_HB_FUSF_RATE_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("c584HbFusfRate", beginC584HbFusfRate,C_584_HB_FUSF_RATE_LEN);
    	}
    }
    /**
	 *	refreshC584HbFusfRate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshC584HbFusfRate() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginC584HbFusfRate
			            ,C_584_HB_FUSF_RATE_LEN
			            ,C_584_HB_FUSF_RATE_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("c584HbFusfRate", beginC584HbFusfRate,C_584_HB_FUSF_RATE_LEN);
    }
   	}
     int localC584HbRegulatoryChargCounter = -1;
     
     public boolean isC584HbRegulatoryChargModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localC584HbRegulatoryChargCounter != sharedCounter;
         localC584HbRegulatoryChargCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of c584HbRegulatoryCharg
	 *	@return c584HbRegulatoryCharg
	 */
	public char[]  getC584HbRegulatoryChargString() {
	    return getCharArray(beginC584HbRegulatoryCharg,C_584_HB_REGULATORY_CHARG_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean c584HbRegulatoryChargIsNumeric() {
		    return isNumeric(beginC584HbRegulatoryCharg
	                    ,beginC584HbRegulatoryCharg + C_584_HB_REGULATORY_CHARG_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int C_584_HB_REGULATORY_CHARG_LEN = 6;
  protected  static final int C_584_HB_REGULATORY_CHARG_SCALE = 2;

   protected BigDecimal checkC584HbRegulatoryChargMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,5/*precision*/);
   }

  	/**
	 * serializeC584HbRegulatoryCharg
	 */
	protected void serializeC584HbRegulatoryCharg(BigDecimal c584HbRegulatoryCharg) {
	       putNumber(beginC584HbRegulatoryCharg,c584HbRegulatoryCharg,C_584_HB_REGULATORY_CHARG_LEN,C_584_HB_REGULATORY_CHARG_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localC584HbRegulatoryChargCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeC584HbRegulatoryCharg
	 */
   	protected  BigDecimal serializeC584HbRegulatoryCharg(char[] value) throws CFException {
        if (value.length < 6) value = pad(6, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginC584HbRegulatoryCharg
		       ,6
		      );		 localC584HbRegulatoryChargCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,C_584_HB_REGULATORY_CHARG_LEN,C_584_HB_REGULATORY_CHARG_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("c584HbRegulatoryCharg", beginC584HbRegulatoryCharg,C_584_HB_REGULATORY_CHARG_LEN);
    	}
    }
    /**
	 *	refreshC584HbRegulatoryCharg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshC584HbRegulatoryCharg() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginC584HbRegulatoryCharg
			            ,C_584_HB_REGULATORY_CHARG_LEN
			            ,C_584_HB_REGULATORY_CHARG_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("c584HbRegulatoryCharg", beginC584HbRegulatoryCharg,C_584_HB_REGULATORY_CHARG_LEN);
    }
   	}
     int localC584HbVzwAdminChgAmtCounter = -1;
     
     public boolean isC584HbVzwAdminChgAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localC584HbVzwAdminChgAmtCounter != sharedCounter;
         localC584HbVzwAdminChgAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of c584HbVzwAdminChgAmt
	 *	@return c584HbVzwAdminChgAmt
	 */
	public char[]  getC584HbVzwAdminChgAmtString() {
	    return getCharArray(beginC584HbVzwAdminChgAmt,C_584_HB_VZW_ADMIN_CHG_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean c584HbVzwAdminChgAmtIsNumeric() {
		    return isNumeric(beginC584HbVzwAdminChgAmt
	                    ,beginC584HbVzwAdminChgAmt + C_584_HB_VZW_ADMIN_CHG_AMT_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int C_584_HB_VZW_ADMIN_CHG_AMT_LEN = 6;
  protected  static final int C_584_HB_VZW_ADMIN_CHG_AMT_SCALE = 2;

   protected BigDecimal checkC584HbVzwAdminChgAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,5/*precision*/);
   }

  	/**
	 * serializeC584HbVzwAdminChgAmt
	 */
	protected void serializeC584HbVzwAdminChgAmt(BigDecimal c584HbVzwAdminChgAmt) {
	       putNumber(beginC584HbVzwAdminChgAmt,c584HbVzwAdminChgAmt,C_584_HB_VZW_ADMIN_CHG_AMT_LEN,C_584_HB_VZW_ADMIN_CHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localC584HbVzwAdminChgAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeC584HbVzwAdminChgAmt
	 */
   	protected  BigDecimal serializeC584HbVzwAdminChgAmt(char[] value) throws CFException {
        if (value.length < 6) value = pad(6, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginC584HbVzwAdminChgAmt
		       ,6
		      );		 localC584HbVzwAdminChgAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,C_584_HB_VZW_ADMIN_CHG_AMT_LEN,C_584_HB_VZW_ADMIN_CHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("c584HbVzwAdminChgAmt", beginC584HbVzwAdminChgAmt,C_584_HB_VZW_ADMIN_CHG_AMT_LEN);
    	}
    }
    /**
	 *	refreshC584HbVzwAdminChgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshC584HbVzwAdminChgAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginC584HbVzwAdminChgAmt
			            ,C_584_HB_VZW_ADMIN_CHG_AMT_LEN
			            ,C_584_HB_VZW_ADMIN_CHG_AMT_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("c584HbVzwAdminChgAmt", beginC584HbVzwAdminChgAmt,C_584_HB_VZW_ADMIN_CHG_AMT_LEN);
    }
   	}




}
  
