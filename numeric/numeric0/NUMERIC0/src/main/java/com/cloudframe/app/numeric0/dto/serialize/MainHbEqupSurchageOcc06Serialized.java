package com.cloudframe.app.numeric0.dto.serialize;

/**
*  The class MainHbEqupSurchageOcc06Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class MainHbEqupSurchageOcc06Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MainHbEqupSurchageOcc06Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MAIN_HB_EQUP_SURCHAGE_OCC_06_LENGTH = 28;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMainHbTotVzwSurchgAmt;
            protected  int beginMainHbFusfRate;
            protected  int beginMainHbRegulatoryCharg;
            protected  int beginMainHbVzwAdminChgAmt;
	
	/**
	* Constructor for MainHbEqupSurchageOcc06Serialized
	**/
    public MainHbEqupSurchageOcc06Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MainHbEqupSurchageOcc06Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MAIN_HB_EQUP_SURCHAGE_OCC_06_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMainHbTotVzwSurchgAmt = getStartOffset() + 0;	// set offset for serialization
  
             beginMainHbFusfRate = getStartOffset() + 10;	// set offset for serialization
  
             beginMainHbRegulatoryCharg = getStartOffset() + 16;	// set offset for serialization
  
             beginMainHbVzwAdminChgAmt = getStartOffset() + 22;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMainHbTotVzwSurchgAmtCounter = -1;
     
     public boolean isMainHbTotVzwSurchgAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMainHbTotVzwSurchgAmtCounter != sharedCounter;
         localMainHbTotVzwSurchgAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of mainHbTotVzwSurchgAmt
	 *	@return mainHbTotVzwSurchgAmt
	 */
	public char[]  getMainHbTotVzwSurchgAmtString() {
	    return getCharArray(beginMainHbTotVzwSurchgAmt,MAIN_HB_TOT_VZW_SURCHG_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mainHbTotVzwSurchgAmtIsNumeric() {
		    return isNumeric(beginMainHbTotVzwSurchgAmt
	                    ,beginMainHbTotVzwSurchgAmt + MAIN_HB_TOT_VZW_SURCHG_AMT_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int MAIN_HB_TOT_VZW_SURCHG_AMT_LEN = 10;
  protected  static final int MAIN_HB_TOT_VZW_SURCHG_AMT_SCALE = 2;

   protected BigDecimal checkMainHbTotVzwSurchgAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,9/*precision*/);
   }

  	/**
	 * serializeMainHbTotVzwSurchgAmt
	 */
	protected void serializeMainHbTotVzwSurchgAmt(BigDecimal mainHbTotVzwSurchgAmt) {
	       putNumber(beginMainHbTotVzwSurchgAmt,mainHbTotVzwSurchgAmt,MAIN_HB_TOT_VZW_SURCHG_AMT_LEN,MAIN_HB_TOT_VZW_SURCHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localMainHbTotVzwSurchgAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMainHbTotVzwSurchgAmt
	 */
   	protected  BigDecimal serializeMainHbTotVzwSurchgAmt(char[] value) throws CFException {
        if (value.length < 10) value = pad(10, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginMainHbTotVzwSurchgAmt
		       ,10
		      );		 localMainHbTotVzwSurchgAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MAIN_HB_TOT_VZW_SURCHG_AMT_LEN,MAIN_HB_TOT_VZW_SURCHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("mainHbTotVzwSurchgAmt", beginMainHbTotVzwSurchgAmt,MAIN_HB_TOT_VZW_SURCHG_AMT_LEN);
    	}
    }
    /**
	 *	refreshMainHbTotVzwSurchgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMainHbTotVzwSurchgAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMainHbTotVzwSurchgAmt
			            ,MAIN_HB_TOT_VZW_SURCHG_AMT_LEN
			            ,MAIN_HB_TOT_VZW_SURCHG_AMT_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("mainHbTotVzwSurchgAmt", beginMainHbTotVzwSurchgAmt,MAIN_HB_TOT_VZW_SURCHG_AMT_LEN);
    }
   	}
     int localMainHbFusfRateCounter = -1;
     
     public boolean isMainHbFusfRateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMainHbFusfRateCounter != sharedCounter;
         localMainHbFusfRateCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of mainHbFusfRate
	 *	@return mainHbFusfRate
	 */
	public char[]  getMainHbFusfRateString() {
	    return getCharArray(beginMainHbFusfRate,MAIN_HB_FUSF_RATE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mainHbFusfRateIsNumeric() {
		    return isNumeric(beginMainHbFusfRate
	                    ,beginMainHbFusfRate + MAIN_HB_FUSF_RATE_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int MAIN_HB_FUSF_RATE_LEN = 6;
  protected  static final int MAIN_HB_FUSF_RATE_SCALE = 2;

   protected BigDecimal checkMainHbFusfRateMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,5/*precision*/);
   }

  	/**
	 * serializeMainHbFusfRate
	 */
	protected void serializeMainHbFusfRate(BigDecimal mainHbFusfRate) {
	       putNumber(beginMainHbFusfRate,mainHbFusfRate,MAIN_HB_FUSF_RATE_LEN,MAIN_HB_FUSF_RATE_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localMainHbFusfRateCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMainHbFusfRate
	 */
   	protected  BigDecimal serializeMainHbFusfRate(char[] value) throws CFException {
        if (value.length < 6) value = pad(6, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginMainHbFusfRate
		       ,6
		      );		 localMainHbFusfRateCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MAIN_HB_FUSF_RATE_LEN,MAIN_HB_FUSF_RATE_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("mainHbFusfRate", beginMainHbFusfRate,MAIN_HB_FUSF_RATE_LEN);
    	}
    }
    /**
	 *	refreshMainHbFusfRate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMainHbFusfRate() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMainHbFusfRate
			            ,MAIN_HB_FUSF_RATE_LEN
			            ,MAIN_HB_FUSF_RATE_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("mainHbFusfRate", beginMainHbFusfRate,MAIN_HB_FUSF_RATE_LEN);
    }
   	}
     int localMainHbRegulatoryChargCounter = -1;
     
     public boolean isMainHbRegulatoryChargModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMainHbRegulatoryChargCounter != sharedCounter;
         localMainHbRegulatoryChargCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of mainHbRegulatoryCharg
	 *	@return mainHbRegulatoryCharg
	 */
	public char[]  getMainHbRegulatoryChargString() {
	    return getCharArray(beginMainHbRegulatoryCharg,MAIN_HB_REGULATORY_CHARG_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mainHbRegulatoryChargIsNumeric() {
		    return isNumeric(beginMainHbRegulatoryCharg
	                    ,beginMainHbRegulatoryCharg + MAIN_HB_REGULATORY_CHARG_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int MAIN_HB_REGULATORY_CHARG_LEN = 6;
  protected  static final int MAIN_HB_REGULATORY_CHARG_SCALE = 2;

   protected BigDecimal checkMainHbRegulatoryChargMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,5/*precision*/);
   }

  	/**
	 * serializeMainHbRegulatoryCharg
	 */
	protected void serializeMainHbRegulatoryCharg(BigDecimal mainHbRegulatoryCharg) {
	       putNumber(beginMainHbRegulatoryCharg,mainHbRegulatoryCharg,MAIN_HB_REGULATORY_CHARG_LEN,MAIN_HB_REGULATORY_CHARG_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localMainHbRegulatoryChargCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMainHbRegulatoryCharg
	 */
   	protected  BigDecimal serializeMainHbRegulatoryCharg(char[] value) throws CFException {
        if (value.length < 6) value = pad(6, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginMainHbRegulatoryCharg
		       ,6
		      );		 localMainHbRegulatoryChargCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MAIN_HB_REGULATORY_CHARG_LEN,MAIN_HB_REGULATORY_CHARG_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("mainHbRegulatoryCharg", beginMainHbRegulatoryCharg,MAIN_HB_REGULATORY_CHARG_LEN);
    	}
    }
    /**
	 *	refreshMainHbRegulatoryCharg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMainHbRegulatoryCharg() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMainHbRegulatoryCharg
			            ,MAIN_HB_REGULATORY_CHARG_LEN
			            ,MAIN_HB_REGULATORY_CHARG_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("mainHbRegulatoryCharg", beginMainHbRegulatoryCharg,MAIN_HB_REGULATORY_CHARG_LEN);
    }
   	}
     int localMainHbVzwAdminChgAmtCounter = -1;
     
     public boolean isMainHbVzwAdminChgAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMainHbVzwAdminChgAmtCounter != sharedCounter;
         localMainHbVzwAdminChgAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of mainHbVzwAdminChgAmt
	 *	@return mainHbVzwAdminChgAmt
	 */
	public char[]  getMainHbVzwAdminChgAmtString() {
	    return getCharArray(beginMainHbVzwAdminChgAmt,MAIN_HB_VZW_ADMIN_CHG_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mainHbVzwAdminChgAmtIsNumeric() {
		    return isNumeric(beginMainHbVzwAdminChgAmt
	                    ,beginMainHbVzwAdminChgAmt + MAIN_HB_VZW_ADMIN_CHG_AMT_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
  protected  static final int MAIN_HB_VZW_ADMIN_CHG_AMT_LEN = 6;
  protected  static final int MAIN_HB_VZW_ADMIN_CHG_AMT_SCALE = 2;

   protected BigDecimal checkMainHbVzwAdminChgAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,5/*precision*/);
   }

  	/**
	 * serializeMainHbVzwAdminChgAmt
	 */
	protected void serializeMainHbVzwAdminChgAmt(BigDecimal mainHbVzwAdminChgAmt) {
	       putNumber(beginMainHbVzwAdminChgAmt,mainHbVzwAdminChgAmt,MAIN_HB_VZW_ADMIN_CHG_AMT_LEN,MAIN_HB_VZW_ADMIN_CHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localMainHbVzwAdminChgAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMainHbVzwAdminChgAmt
	 */
   	protected  BigDecimal serializeMainHbVzwAdminChgAmt(char[] value) throws CFException {
        if (value.length < 6) value = pad(6, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginMainHbVzwAdminChgAmt
		       ,6
		      );		 localMainHbVzwAdminChgAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MAIN_HB_VZW_ADMIN_CHG_AMT_LEN,MAIN_HB_VZW_ADMIN_CHG_AMT_SCALE,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("mainHbVzwAdminChgAmt", beginMainHbVzwAdminChgAmt,MAIN_HB_VZW_ADMIN_CHG_AMT_LEN);
    	}
    }
    /**
	 *	refreshMainHbVzwAdminChgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMainHbVzwAdminChgAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMainHbVzwAdminChgAmt
			            ,MAIN_HB_VZW_ADMIN_CHG_AMT_LEN
			            ,MAIN_HB_VZW_ADMIN_CHG_AMT_SCALE
			            ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("mainHbVzwAdminChgAmt", beginMainHbVzwAdminChgAmt,MAIN_HB_VZW_ADMIN_CHG_AMT_LEN);
    }
   	}




}
  
