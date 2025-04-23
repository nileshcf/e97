package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01TaxSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Bdms01TaxSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01TaxSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_TAX_SEG_DATA_LENGTH = 66;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01TaxSegSqlcd;
            protected  int beginBdms01EffectiveTaxDt;
            protected  int beginBdms01TaxCountryCd;
            protected  int beginBdms01EligTaxCrdtInd;
            protected  int beginBdms01StatusTaxCd;
            protected  int beginBdms01TaxWitholdRt;
            protected  int beginBdms01TaxCreditRt;
	
	/**
	* Constructor for Bdms01TaxSegDataSerialized
	**/
    public Bdms01TaxSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01TaxSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01TaxSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01TaxSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3807); // serialize this field at offset 3807 by default 
    }
    
	/**
	* sets parent for this Bdms01TaxSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3807 by default
    }    
	/**
	* initializes the field in Bdms01TaxSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_TAX_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01TaxSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginBdms01EffectiveTaxDt = getStartOffset() + 4;	// set offset for serialization
  
             beginBdms01TaxCountryCd = getStartOffset() + 14;	// set offset for serialization
  
             beginBdms01EligTaxCrdtInd = getStartOffset() + 16;	// set offset for serialization
  
             beginBdms01StatusTaxCd = getStartOffset() + 17;	// set offset for serialization
  
             beginBdms01TaxWitholdRt = getStartOffset() + 18;	// set offset for serialization
  
             beginBdms01TaxCreditRt = getStartOffset() + 27;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01TaxSegSqlcdCounter = -1;
     public boolean isBdms01TaxSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TaxSegSqlcdCounter != sharedCounter;
         localBdms01TaxSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01TaxSegSqlcd
	 *	@return bdms01TaxSegSqlcd
	 */
	public char[]  getBdms01TaxSegSqlcdString() {
	     return getCharArray(beginBdms01TaxSegSqlcd,BDMS_01_TAX_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01TaxSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01TaxSegSqlcd
	                    ,beginBdms01TaxSegSqlcd + BDMS_01_TAX_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_TAX_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01TaxSegSqlcd
	 */
	protected void serializeBdms01TaxSegSqlcd(int bdms01TaxSegSqlcd) {
		 putNumber(beginBdms01TaxSegSqlcd,bdms01TaxSegSqlcd,BDMS_01_TAX_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01TaxSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01TaxSegSqlcd
	 */
   	protected  int serializeBdms01TaxSegSqlcd(char[] value) {
	    int  bdms01TaxSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01TaxSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01TaxSegSqlcd
		       ,4
		      );
		 localBdms01TaxSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01TaxSegSqlcd;
    }

   protected int checkBdms01TaxSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01TaxSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01TaxSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01TaxSegSqlcd
			                 ,BDMS_01_TAX_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01TaxSegSqlcd", beginBdms01TaxSegSqlcd,BDMS_01_TAX_SEG_SQLCD_LEN);
    }
   	}
     int localBdms01EffectiveTaxDtCounter = -1;
     public boolean isBdms01EffectiveTaxDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01EffectiveTaxDtCounter != sharedCounter;
         localBdms01EffectiveTaxDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_EFFECTIVE_TAX_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01EffectiveTaxDt
	 */
   protected void serializeBdms01EffectiveTaxDt(char[] bdms01EffectiveTaxDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01EffectiveTaxDt,0,getStringValue(),beginBdms01EffectiveTaxDt,BDMS_01_EFFECTIVE_TAX_DT_LEN);
       localBdms01EffectiveTaxDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01EffectiveTaxDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01EffectiveTaxDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01EffectiveTaxDt() {	 
   		return (substring(getStringValue(),beginBdms01EffectiveTaxDt,beginBdms01EffectiveTaxDt + BDMS_01_EFFECTIVE_TAX_DT_LEN));
   	}
     int localBdms01TaxCountryCdCounter = -1;
     public boolean isBdms01TaxCountryCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TaxCountryCdCounter != sharedCounter;
         localBdms01TaxCountryCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TAX_COUNTRY_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01TaxCountryCd
	 */
   protected void serializeBdms01TaxCountryCd(char[] bdms01TaxCountryCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TaxCountryCd,0,getStringValue(),beginBdms01TaxCountryCd,BDMS_01_TAX_COUNTRY_CD_LEN);
       localBdms01TaxCountryCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TaxCountryCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01TaxCountryCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TaxCountryCd() {	 
   		return (substring(getStringValue(),beginBdms01TaxCountryCd,beginBdms01TaxCountryCd + BDMS_01_TAX_COUNTRY_CD_LEN));
   	}
     int localBdms01EligTaxCrdtIndCounter = -1;
     public boolean isBdms01EligTaxCrdtIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01EligTaxCrdtIndCounter != sharedCounter;
         localBdms01EligTaxCrdtIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_ELIG_TAX_CRDT_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01EligTaxCrdtInd
	 */
   protected void serializeBdms01EligTaxCrdtInd(char[] bdms01EligTaxCrdtInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01EligTaxCrdtInd,0,getStringValue(),beginBdms01EligTaxCrdtInd,BDMS_01_ELIG_TAX_CRDT_IND_LEN);
       localBdms01EligTaxCrdtIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01EligTaxCrdtIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01EligTaxCrdtInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01EligTaxCrdtInd() {	 
   		return (substring(getStringValue(),beginBdms01EligTaxCrdtInd,beginBdms01EligTaxCrdtInd + BDMS_01_ELIG_TAX_CRDT_IND_LEN));
   	}
     int localBdms01StatusTaxCdCounter = -1;
     public boolean isBdms01StatusTaxCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01StatusTaxCdCounter != sharedCounter;
         localBdms01StatusTaxCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_STATUS_TAX_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01StatusTaxCd
	 */
   protected void serializeBdms01StatusTaxCd(char[] bdms01StatusTaxCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01StatusTaxCd,0,getStringValue(),beginBdms01StatusTaxCd,BDMS_01_STATUS_TAX_CD_LEN);
       localBdms01StatusTaxCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01StatusTaxCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01StatusTaxCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01StatusTaxCd() {	 
   		return (substring(getStringValue(),beginBdms01StatusTaxCd,beginBdms01StatusTaxCd + BDMS_01_STATUS_TAX_CD_LEN));
   	}
     int localBdms01TaxWitholdRtCounter = -1;
     
     public boolean isBdms01TaxWitholdRtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TaxWitholdRtCounter != sharedCounter;
         localBdms01TaxWitholdRtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01TaxWitholdRt
	 *	@return bdms01TaxWitholdRt
	 */
	public char[]  getBdms01TaxWitholdRtString() {
	    return getCharArray(beginBdms01TaxWitholdRt,BDMS_01_TAX_WITHOLD_RT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01TaxWitholdRtIsNumeric() {
		    return isNumeric(beginBdms01TaxWitholdRt
	                    ,beginBdms01TaxWitholdRt + BDMS_01_TAX_WITHOLD_RT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_TAX_WITHOLD_RT_LEN = 9;
  protected  static final int BDMS_01_TAX_WITHOLD_RT_SCALE = 7;

   protected BigDecimal checkBdms01TaxWitholdRtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,7/*scale*/,9/*precision*/);
   }

  	/**
	 * serializeBdms01TaxWitholdRt
	 */
	protected void serializeBdms01TaxWitholdRt(BigDecimal bdms01TaxWitholdRt) {
	       putNumber(beginBdms01TaxWitholdRt,bdms01TaxWitholdRt,BDMS_01_TAX_WITHOLD_RT_LEN,BDMS_01_TAX_WITHOLD_RT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01TaxWitholdRtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01TaxWitholdRt
	 */
   	protected  BigDecimal serializeBdms01TaxWitholdRt(char[] value) throws CFException {
        if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginBdms01TaxWitholdRt
		       ,9
		      );		 localBdms01TaxWitholdRtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_TAX_WITHOLD_RT_LEN,BDMS_01_TAX_WITHOLD_RT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01TaxWitholdRt", beginBdms01TaxWitholdRt,BDMS_01_TAX_WITHOLD_RT_LEN);
    	}
    }
    /**
	 *	refreshBdms01TaxWitholdRt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01TaxWitholdRt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01TaxWitholdRt
			            ,BDMS_01_TAX_WITHOLD_RT_LEN
			            ,BDMS_01_TAX_WITHOLD_RT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01TaxWitholdRt", beginBdms01TaxWitholdRt,BDMS_01_TAX_WITHOLD_RT_LEN);
    }
   	}
     int localBdms01TaxCreditRtCounter = -1;
     
     public boolean isBdms01TaxCreditRtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TaxCreditRtCounter != sharedCounter;
         localBdms01TaxCreditRtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01TaxCreditRt
	 *	@return bdms01TaxCreditRt
	 */
	public char[]  getBdms01TaxCreditRtString() {
	    return getCharArray(beginBdms01TaxCreditRt,BDMS_01_TAX_CREDIT_RT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01TaxCreditRtIsNumeric() {
		    return isNumeric(beginBdms01TaxCreditRt
	                    ,beginBdms01TaxCreditRt + BDMS_01_TAX_CREDIT_RT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_TAX_CREDIT_RT_LEN = 9;
  protected  static final int BDMS_01_TAX_CREDIT_RT_SCALE = 7;

   protected BigDecimal checkBdms01TaxCreditRtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,7/*scale*/,9/*precision*/);
   }

  	/**
	 * serializeBdms01TaxCreditRt
	 */
	protected void serializeBdms01TaxCreditRt(BigDecimal bdms01TaxCreditRt) {
	       putNumber(beginBdms01TaxCreditRt,bdms01TaxCreditRt,BDMS_01_TAX_CREDIT_RT_LEN,BDMS_01_TAX_CREDIT_RT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01TaxCreditRtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01TaxCreditRt
	 */
   	protected  BigDecimal serializeBdms01TaxCreditRt(char[] value) throws CFException {
        if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginBdms01TaxCreditRt
		       ,9
		      );		 localBdms01TaxCreditRtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_TAX_CREDIT_RT_LEN,BDMS_01_TAX_CREDIT_RT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01TaxCreditRt", beginBdms01TaxCreditRt,BDMS_01_TAX_CREDIT_RT_LEN);
    	}
    }
    /**
	 *	refreshBdms01TaxCreditRt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01TaxCreditRt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01TaxCreditRt
			            ,BDMS_01_TAX_CREDIT_RT_LEN
			            ,BDMS_01_TAX_CREDIT_RT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01TaxCreditRt", beginBdms01TaxCreditRt,BDMS_01_TAX_CREDIT_RT_LEN);
    }
   	}




}
  
