package com.cloudframe.app.numeric0.dto.serialize;

/**
*  The class C588HbEqupSurchageOcc06Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:50. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class C588HbEqupSurchageOcc06Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(C588HbEqupSurchageOcc06Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int C_588_HB_EQUP_SURCHAGE_OCC_06_LENGTH = 27;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginC588HbTotVzwSurchgAmt;
            protected  int beginC588HbFusfRate;
            protected  int beginC588HbRegulatoryCharg;
            protected  int beginC588HbVzwAdminChgAmt;
	
	/**
	* Constructor for C588HbEqupSurchageOcc06Serialized
	**/
    public C588HbEqupSurchageOcc06Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in C588HbEqupSurchageOcc06Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(C_588_HB_EQUP_SURCHAGE_OCC_06_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginC588HbTotVzwSurchgAmt = getStartOffset() + 0;	// set offset for serialization
  
             beginC588HbFusfRate = getStartOffset() + 9;	// set offset for serialization
  
             beginC588HbRegulatoryCharg = getStartOffset() + 15;	// set offset for serialization
  
             beginC588HbVzwAdminChgAmt = getStartOffset() + 21;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localC588HbTotVzwSurchgAmtCounter = -1;
     
     public boolean isC588HbTotVzwSurchgAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localC588HbTotVzwSurchgAmtCounter != sharedCounter;
         localC588HbTotVzwSurchgAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of c588HbTotVzwSurchgAmt
	 *	@return c588HbTotVzwSurchgAmt
	 */
	public char[]  getC588HbTotVzwSurchgAmtString() {
	    return getCharArray(beginC588HbTotVzwSurchgAmt,C_588_HB_TOT_VZW_SURCHG_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean c588HbTotVzwSurchgAmtIsNumeric() {
		    return isNumeric(beginC588HbTotVzwSurchgAmt
	                    ,beginC588HbTotVzwSurchgAmt + C_588_HB_TOT_VZW_SURCHG_AMT_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int C_588_HB_TOT_VZW_SURCHG_AMT_LEN = 9;
  protected  static final int C_588_HB_TOT_VZW_SURCHG_AMT_SCALE = 3;

   protected BigDecimal checkC588HbTotVzwSurchgAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeC588HbTotVzwSurchgAmt
	 */
	protected void serializeC588HbTotVzwSurchgAmt(BigDecimal c588HbTotVzwSurchgAmt) {
	       putNumber(beginC588HbTotVzwSurchgAmt,c588HbTotVzwSurchgAmt,C_588_HB_TOT_VZW_SURCHG_AMT_LEN,C_588_HB_TOT_VZW_SURCHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localC588HbTotVzwSurchgAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeC588HbTotVzwSurchgAmt
	 */
   	protected  BigDecimal serializeC588HbTotVzwSurchgAmt(char[] value) throws CFException {
        if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginC588HbTotVzwSurchgAmt
		       ,9
		      );		 localC588HbTotVzwSurchgAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,C_588_HB_TOT_VZW_SURCHG_AMT_LEN,C_588_HB_TOT_VZW_SURCHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("c588HbTotVzwSurchgAmt", beginC588HbTotVzwSurchgAmt,C_588_HB_TOT_VZW_SURCHG_AMT_LEN);
    	}
    }
    /**
	 *	refreshC588HbTotVzwSurchgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshC588HbTotVzwSurchgAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginC588HbTotVzwSurchgAmt
			            ,C_588_HB_TOT_VZW_SURCHG_AMT_LEN
			            ,C_588_HB_TOT_VZW_SURCHG_AMT_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("c588HbTotVzwSurchgAmt", beginC588HbTotVzwSurchgAmt,C_588_HB_TOT_VZW_SURCHG_AMT_LEN);
    }
   	}
     int localC588HbFusfRateCounter = -1;
     
     public boolean isC588HbFusfRateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localC588HbFusfRateCounter != sharedCounter;
         localC588HbFusfRateCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of c588HbFusfRate
	 *	@return c588HbFusfRate
	 */
	public char[]  getC588HbFusfRateString() {
	    return getCharArray(beginC588HbFusfRate,C_588_HB_FUSF_RATE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean c588HbFusfRateIsNumeric() {
		    return isNumeric(beginC588HbFusfRate
	                    ,beginC588HbFusfRate + C_588_HB_FUSF_RATE_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int C_588_HB_FUSF_RATE_LEN = 6;
  protected  static final int C_588_HB_FUSF_RATE_SCALE = 3;

   protected BigDecimal checkC588HbFusfRateMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,5/*precision*/);
   }

  	/**
	 * serializeC588HbFusfRate
	 */
	protected void serializeC588HbFusfRate(BigDecimal c588HbFusfRate) {
	       putNumber(beginC588HbFusfRate,c588HbFusfRate,C_588_HB_FUSF_RATE_LEN,C_588_HB_FUSF_RATE_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localC588HbFusfRateCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeC588HbFusfRate
	 */
   	protected  BigDecimal serializeC588HbFusfRate(char[] value) throws CFException {
        if (value.length < 6) value = pad(6, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginC588HbFusfRate
		       ,6
		      );		 localC588HbFusfRateCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,C_588_HB_FUSF_RATE_LEN,C_588_HB_FUSF_RATE_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("c588HbFusfRate", beginC588HbFusfRate,C_588_HB_FUSF_RATE_LEN);
    	}
    }
    /**
	 *	refreshC588HbFusfRate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshC588HbFusfRate() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginC588HbFusfRate
			            ,C_588_HB_FUSF_RATE_LEN
			            ,C_588_HB_FUSF_RATE_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("c588HbFusfRate", beginC588HbFusfRate,C_588_HB_FUSF_RATE_LEN);
    }
   	}
     int localC588HbRegulatoryChargCounter = -1;
     
     public boolean isC588HbRegulatoryChargModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localC588HbRegulatoryChargCounter != sharedCounter;
         localC588HbRegulatoryChargCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of c588HbRegulatoryCharg
	 *	@return c588HbRegulatoryCharg
	 */
	public char[]  getC588HbRegulatoryChargString() {
	    return getCharArray(beginC588HbRegulatoryCharg,C_588_HB_REGULATORY_CHARG_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean c588HbRegulatoryChargIsNumeric() {
		    return isNumeric(beginC588HbRegulatoryCharg
	                    ,beginC588HbRegulatoryCharg + C_588_HB_REGULATORY_CHARG_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int C_588_HB_REGULATORY_CHARG_LEN = 6;
  protected  static final int C_588_HB_REGULATORY_CHARG_SCALE = 3;

   protected BigDecimal checkC588HbRegulatoryChargMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,5/*precision*/);
   }

  	/**
	 * serializeC588HbRegulatoryCharg
	 */
	protected void serializeC588HbRegulatoryCharg(BigDecimal c588HbRegulatoryCharg) {
	       putNumber(beginC588HbRegulatoryCharg,c588HbRegulatoryCharg,C_588_HB_REGULATORY_CHARG_LEN,C_588_HB_REGULATORY_CHARG_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localC588HbRegulatoryChargCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeC588HbRegulatoryCharg
	 */
   	protected  BigDecimal serializeC588HbRegulatoryCharg(char[] value) throws CFException {
        if (value.length < 6) value = pad(6, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginC588HbRegulatoryCharg
		       ,6
		      );		 localC588HbRegulatoryChargCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,C_588_HB_REGULATORY_CHARG_LEN,C_588_HB_REGULATORY_CHARG_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("c588HbRegulatoryCharg", beginC588HbRegulatoryCharg,C_588_HB_REGULATORY_CHARG_LEN);
    	}
    }
    /**
	 *	refreshC588HbRegulatoryCharg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshC588HbRegulatoryCharg() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginC588HbRegulatoryCharg
			            ,C_588_HB_REGULATORY_CHARG_LEN
			            ,C_588_HB_REGULATORY_CHARG_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("c588HbRegulatoryCharg", beginC588HbRegulatoryCharg,C_588_HB_REGULATORY_CHARG_LEN);
    }
   	}
     int localC588HbVzwAdminChgAmtCounter = -1;
     
     public boolean isC588HbVzwAdminChgAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localC588HbVzwAdminChgAmtCounter != sharedCounter;
         localC588HbVzwAdminChgAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of c588HbVzwAdminChgAmt
	 *	@return c588HbVzwAdminChgAmt
	 */
	public char[]  getC588HbVzwAdminChgAmtString() {
	    return getCharArray(beginC588HbVzwAdminChgAmt,C_588_HB_VZW_ADMIN_CHG_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean c588HbVzwAdminChgAmtIsNumeric() {
		    return isNumeric(beginC588HbVzwAdminChgAmt
	                    ,beginC588HbVzwAdminChgAmt + C_588_HB_VZW_ADMIN_CHG_AMT_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int C_588_HB_VZW_ADMIN_CHG_AMT_LEN = 6;
  protected  static final int C_588_HB_VZW_ADMIN_CHG_AMT_SCALE = 3;

   protected BigDecimal checkC588HbVzwAdminChgAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,5/*precision*/);
   }

  	/**
	 * serializeC588HbVzwAdminChgAmt
	 */
	protected void serializeC588HbVzwAdminChgAmt(BigDecimal c588HbVzwAdminChgAmt) {
	       putNumber(beginC588HbVzwAdminChgAmt,c588HbVzwAdminChgAmt,C_588_HB_VZW_ADMIN_CHG_AMT_LEN,C_588_HB_VZW_ADMIN_CHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localC588HbVzwAdminChgAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeC588HbVzwAdminChgAmt
	 */
   	protected  BigDecimal serializeC588HbVzwAdminChgAmt(char[] value) throws CFException {
        if (value.length < 6) value = pad(6, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginC588HbVzwAdminChgAmt
		       ,6
		      );		 localC588HbVzwAdminChgAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,C_588_HB_VZW_ADMIN_CHG_AMT_LEN,C_588_HB_VZW_ADMIN_CHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("c588HbVzwAdminChgAmt", beginC588HbVzwAdminChgAmt,C_588_HB_VZW_ADMIN_CHG_AMT_LEN);
    	}
    }
    /**
	 *	refreshC588HbVzwAdminChgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshC588HbVzwAdminChgAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginC588HbVzwAdminChgAmt
			            ,C_588_HB_VZW_ADMIN_CHG_AMT_LEN
			            ,C_588_HB_VZW_ADMIN_CHG_AMT_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("c588HbVzwAdminChgAmt", beginC588HbVzwAdminChgAmt,C_588_HB_VZW_ADMIN_CHG_AMT_LEN);
    }
   	}




}
  
