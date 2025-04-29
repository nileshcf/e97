package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class Bdms01PriceSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Bdms01PriceSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01PriceSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_PRICE_SEG_DATA_LENGTH = 162;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01PriceSegSqlcd;
            protected  int beginMsdSecurityPrice;
            protected  int beginMsdSecurityPriceHi;
            protected  int beginMsdSecurityPriceLow;
            protected  int beginBdms01PriceIssueWhenInd;
            protected  int beginBdms01PriceExchangeCode;
            protected  int beginBdms01PriceCurrencyCd;
            protected  int beginBdms01VendorCd;
            protected  int beginBdms01PriceSetDt;
            protected  int beginBdms01PriceCountryCd;
            protected  int beginBdms01CloseAvSw;
            protected  int beginBdms01AskHiSw;
            protected  int beginBdms01BidLoSw;
            protected  int beginMsdHousePrice;
            protected  int beginMsdHousePriceDate;
            protected  int beginMsdHousePriceSource;
            protected  int beginMsdHousePriceRegion;
	
	/**
	* Constructor for Bdms01PriceSegDataSerialized
	**/
    public Bdms01PriceSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01PriceSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01PriceSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01PriceSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,500); // serialize this field at offset 500 by default 
    }
    
	/**
	* sets parent for this Bdms01PriceSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 500 by default
    }    
	/**
	* initializes the field in Bdms01PriceSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_PRICE_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01PriceSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
  
             beginMsdSecurityPrice = getStartOffset() + 12;	// set offset for serialization
  
             beginMsdSecurityPriceHi = getStartOffset() + 30;	// set offset for serialization
  
             beginMsdSecurityPriceLow = getStartOffset() + 48;	// set offset for serialization
  
             beginBdms01PriceIssueWhenInd = getStartOffset() + 66;	// set offset for serialization
  
             beginBdms01PriceExchangeCode = getStartOffset() + 67;	// set offset for serialization
  
             beginBdms01PriceCurrencyCd = getStartOffset() + 77;	// set offset for serialization
  
             beginBdms01VendorCd = getStartOffset() + 79;	// set offset for serialization
  
             beginBdms01PriceSetDt = getStartOffset() + 84;	// set offset for serialization
  
             beginBdms01PriceCountryCd = getStartOffset() + 94;	// set offset for serialization
  
             beginBdms01CloseAvSw = getStartOffset() + 96;	// set offset for serialization
  
             beginBdms01AskHiSw = getStartOffset() + 98;	// set offset for serialization
  
             beginBdms01BidLoSw = getStartOffset() + 100;	// set offset for serialization
  
             beginMsdHousePrice = getStartOffset() + 102;	// set offset for serialization
  
             beginMsdHousePriceDate = getStartOffset() + 118;	// set offset for serialization
  
             beginMsdHousePriceSource = getStartOffset() + 128;	// set offset for serialization
  
             beginMsdHousePriceRegion = getStartOffset() + 143;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01PriceSegSqlcdCounter = -1;
     public boolean isBdms01PriceSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PriceSegSqlcdCounter != sharedCounter;
         localBdms01PriceSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01PriceSegSqlcd
	 *	@return bdms01PriceSegSqlcd
	 */
	public char[]  getBdms01PriceSegSqlcdString() {
	     return getCharArray(beginBdms01PriceSegSqlcd,BDMS_01_PRICE_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01PriceSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01PriceSegSqlcd
	                    ,beginBdms01PriceSegSqlcd + BDMS_01_PRICE_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_PRICE_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01PriceSegSqlcd
	 */
	protected void serializeBdms01PriceSegSqlcd(int bdms01PriceSegSqlcd) {
		 putNumber(beginBdms01PriceSegSqlcd,bdms01PriceSegSqlcd,BDMS_01_PRICE_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01PriceSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01PriceSegSqlcd
	 */
   	protected  int serializeBdms01PriceSegSqlcd(char[] value) {
	    int  bdms01PriceSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01PriceSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01PriceSegSqlcd
		       ,4
		      );
		 localBdms01PriceSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01PriceSegSqlcd;
    }

   protected int checkBdms01PriceSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01PriceSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01PriceSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01PriceSegSqlcd
			                 ,BDMS_01_PRICE_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01PriceSegSqlcd", beginBdms01PriceSegSqlcd,BDMS_01_PRICE_SEG_SQLCD_LEN);
    }
   	}
     int localMsdSecurityPriceCounter = -1;
     
     public boolean isMsdSecurityPriceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSecurityPriceCounter != sharedCounter;
         localMsdSecurityPriceCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdSecurityPrice
	 *	@return msdSecurityPrice
	 */
	public char[]  getMsdSecurityPriceString() {
	    return getCharArray(beginMsdSecurityPrice,MSD_SECURITY_PRICE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdSecurityPriceIsNumeric() {
		    return isNumeric(beginMsdSecurityPrice
	                    ,beginMsdSecurityPrice + MSD_SECURITY_PRICE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_SECURITY_PRICE_LEN = 18;
  protected  static final int MSD_SECURITY_PRICE_SCALE = 8;

   protected BigDecimal checkMsdSecurityPriceMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeMsdSecurityPrice
	 */
	protected void serializeMsdSecurityPrice(BigDecimal msdSecurityPrice) {
	       putNumber(beginMsdSecurityPrice,msdSecurityPrice,MSD_SECURITY_PRICE_LEN,MSD_SECURITY_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdSecurityPriceCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdSecurityPrice
	 */
   	protected  BigDecimal serializeMsdSecurityPrice(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginMsdSecurityPrice
		       ,18
		      );		 localMsdSecurityPriceCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_SECURITY_PRICE_LEN,MSD_SECURITY_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdSecurityPrice", beginMsdSecurityPrice,MSD_SECURITY_PRICE_LEN);
    	}
    }
    /**
	 *	refreshMsdSecurityPrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdSecurityPrice() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdSecurityPrice
			            ,MSD_SECURITY_PRICE_LEN
			            ,MSD_SECURITY_PRICE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdSecurityPrice", beginMsdSecurityPrice,MSD_SECURITY_PRICE_LEN);
    }
   	}
     int localMsdSecurityPriceHiCounter = -1;
     
     public boolean isMsdSecurityPriceHiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSecurityPriceHiCounter != sharedCounter;
         localMsdSecurityPriceHiCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdSecurityPriceHi
	 *	@return msdSecurityPriceHi
	 */
	public char[]  getMsdSecurityPriceHiString() {
	    return getCharArray(beginMsdSecurityPriceHi,MSD_SECURITY_PRICE_HI_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdSecurityPriceHiIsNumeric() {
		    return isNumeric(beginMsdSecurityPriceHi
	                    ,beginMsdSecurityPriceHi + MSD_SECURITY_PRICE_HI_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_SECURITY_PRICE_HI_LEN = 18;
  protected  static final int MSD_SECURITY_PRICE_HI_SCALE = 8;

   protected BigDecimal checkMsdSecurityPriceHiMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeMsdSecurityPriceHi
	 */
	protected void serializeMsdSecurityPriceHi(BigDecimal msdSecurityPriceHi) {
	       putNumber(beginMsdSecurityPriceHi,msdSecurityPriceHi,MSD_SECURITY_PRICE_HI_LEN,MSD_SECURITY_PRICE_HI_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdSecurityPriceHiCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdSecurityPriceHi
	 */
   	protected  BigDecimal serializeMsdSecurityPriceHi(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginMsdSecurityPriceHi
		       ,18
		      );		 localMsdSecurityPriceHiCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_SECURITY_PRICE_HI_LEN,MSD_SECURITY_PRICE_HI_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdSecurityPriceHi", beginMsdSecurityPriceHi,MSD_SECURITY_PRICE_HI_LEN);
    	}
    }
    /**
	 *	refreshMsdSecurityPriceHi is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdSecurityPriceHi() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdSecurityPriceHi
			            ,MSD_SECURITY_PRICE_HI_LEN
			            ,MSD_SECURITY_PRICE_HI_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdSecurityPriceHi", beginMsdSecurityPriceHi,MSD_SECURITY_PRICE_HI_LEN);
    }
   	}
     int localMsdSecurityPriceLowCounter = -1;
     
     public boolean isMsdSecurityPriceLowModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSecurityPriceLowCounter != sharedCounter;
         localMsdSecurityPriceLowCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdSecurityPriceLow
	 *	@return msdSecurityPriceLow
	 */
	public char[]  getMsdSecurityPriceLowString() {
	    return getCharArray(beginMsdSecurityPriceLow,MSD_SECURITY_PRICE_LOW_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdSecurityPriceLowIsNumeric() {
		    return isNumeric(beginMsdSecurityPriceLow
	                    ,beginMsdSecurityPriceLow + MSD_SECURITY_PRICE_LOW_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_SECURITY_PRICE_LOW_LEN = 18;
  protected  static final int MSD_SECURITY_PRICE_LOW_SCALE = 8;

   protected BigDecimal checkMsdSecurityPriceLowMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeMsdSecurityPriceLow
	 */
	protected void serializeMsdSecurityPriceLow(BigDecimal msdSecurityPriceLow) {
	       putNumber(beginMsdSecurityPriceLow,msdSecurityPriceLow,MSD_SECURITY_PRICE_LOW_LEN,MSD_SECURITY_PRICE_LOW_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdSecurityPriceLowCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdSecurityPriceLow
	 */
   	protected  BigDecimal serializeMsdSecurityPriceLow(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginMsdSecurityPriceLow
		       ,18
		      );		 localMsdSecurityPriceLowCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_SECURITY_PRICE_LOW_LEN,MSD_SECURITY_PRICE_LOW_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdSecurityPriceLow", beginMsdSecurityPriceLow,MSD_SECURITY_PRICE_LOW_LEN);
    	}
    }
    /**
	 *	refreshMsdSecurityPriceLow is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdSecurityPriceLow() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdSecurityPriceLow
			            ,MSD_SECURITY_PRICE_LOW_LEN
			            ,MSD_SECURITY_PRICE_LOW_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdSecurityPriceLow", beginMsdSecurityPriceLow,MSD_SECURITY_PRICE_LOW_LEN);
    }
   	}
     int localBdms01PriceIssueWhenIndCounter = -1;
     public boolean isBdms01PriceIssueWhenIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PriceIssueWhenIndCounter != sharedCounter;
         localBdms01PriceIssueWhenIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PRICE_ISSUE_WHEN_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01PriceIssueWhenInd
	 */
   protected void serializeBdms01PriceIssueWhenInd(char[] bdms01PriceIssueWhenInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PriceIssueWhenInd,0,getStringValue(),beginBdms01PriceIssueWhenInd,BDMS_01_PRICE_ISSUE_WHEN_IND_LEN);
       localBdms01PriceIssueWhenIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PriceIssueWhenIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01PriceIssueWhenInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PriceIssueWhenInd() {	 
   		return (substring(getStringValue(),beginBdms01PriceIssueWhenInd,beginBdms01PriceIssueWhenInd + BDMS_01_PRICE_ISSUE_WHEN_IND_LEN));
   	}
     int localBdms01PriceExchangeCodeCounter = -1;
     public boolean isBdms01PriceExchangeCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PriceExchangeCodeCounter != sharedCounter;
         localBdms01PriceExchangeCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PRICE_EXCHANGE_CODE_LEN = 10;
	/**
	 * 	serialize this Bdms01PriceExchangeCode
	 */
   protected void serializeBdms01PriceExchangeCode(char[] bdms01PriceExchangeCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PriceExchangeCode,0,getStringValue(),beginBdms01PriceExchangeCode,BDMS_01_PRICE_EXCHANGE_CODE_LEN);
       localBdms01PriceExchangeCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PriceExchangeCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01PriceExchangeCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PriceExchangeCode() {	 
   		return (substring(getStringValue(),beginBdms01PriceExchangeCode,beginBdms01PriceExchangeCode + BDMS_01_PRICE_EXCHANGE_CODE_LEN));
   	}
     int localBdms01PriceCurrencyCdCounter = -1;
     public boolean isBdms01PriceCurrencyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PriceCurrencyCdCounter != sharedCounter;
         localBdms01PriceCurrencyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PRICE_CURRENCY_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01PriceCurrencyCd
	 */
   protected void serializeBdms01PriceCurrencyCd(char[] bdms01PriceCurrencyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PriceCurrencyCd,0,getStringValue(),beginBdms01PriceCurrencyCd,BDMS_01_PRICE_CURRENCY_CD_LEN);
       localBdms01PriceCurrencyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PriceCurrencyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01PriceCurrencyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PriceCurrencyCd() {	 
   		return (substring(getStringValue(),beginBdms01PriceCurrencyCd,beginBdms01PriceCurrencyCd + BDMS_01_PRICE_CURRENCY_CD_LEN));
   	}
     int localBdms01VendorCdCounter = -1;
     public boolean isBdms01VendorCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01VendorCdCounter != sharedCounter;
         localBdms01VendorCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_VENDOR_CD_LEN = 5;
	/**
	 * 	serialize this Bdms01VendorCd
	 */
   protected void serializeBdms01VendorCd(char[] bdms01VendorCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01VendorCd,0,getStringValue(),beginBdms01VendorCd,BDMS_01_VENDOR_CD_LEN);
       localBdms01VendorCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01VendorCdConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshBdms01VendorCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01VendorCd() {	 
   		return (substring(getStringValue(),beginBdms01VendorCd,beginBdms01VendorCd + BDMS_01_VENDOR_CD_LEN));
   	}
     int localBdms01PriceSetDtCounter = -1;
     public boolean isBdms01PriceSetDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PriceSetDtCounter != sharedCounter;
         localBdms01PriceSetDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PRICE_SET_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01PriceSetDt
	 */
   protected void serializeBdms01PriceSetDt(char[] bdms01PriceSetDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PriceSetDt,0,getStringValue(),beginBdms01PriceSetDt,BDMS_01_PRICE_SET_DT_LEN);
       localBdms01PriceSetDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PriceSetDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01PriceSetDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PriceSetDt() {	 
   		return (substring(getStringValue(),beginBdms01PriceSetDt,beginBdms01PriceSetDt + BDMS_01_PRICE_SET_DT_LEN));
   	}
     int localBdms01PriceCountryCdCounter = -1;
     public boolean isBdms01PriceCountryCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PriceCountryCdCounter != sharedCounter;
         localBdms01PriceCountryCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PRICE_COUNTRY_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01PriceCountryCd
	 */
   protected void serializeBdms01PriceCountryCd(char[] bdms01PriceCountryCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PriceCountryCd,0,getStringValue(),beginBdms01PriceCountryCd,BDMS_01_PRICE_COUNTRY_CD_LEN);
       localBdms01PriceCountryCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PriceCountryCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01PriceCountryCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PriceCountryCd() {	 
   		return (substring(getStringValue(),beginBdms01PriceCountryCd,beginBdms01PriceCountryCd + BDMS_01_PRICE_COUNTRY_CD_LEN));
   	}
     int localBdms01CloseAvSwCounter = -1;
     public boolean isBdms01CloseAvSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CloseAvSwCounter != sharedCounter;
         localBdms01CloseAvSwCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CLOSE_AV_SW_LEN = 2;
	/**
	 * 	serialize this Bdms01CloseAvSw
	 */
   protected void serializeBdms01CloseAvSw(char[] bdms01CloseAvSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CloseAvSw,0,getStringValue(),beginBdms01CloseAvSw,BDMS_01_CLOSE_AV_SW_LEN);
       localBdms01CloseAvSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CloseAvSwConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01CloseAvSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CloseAvSw() {	 
   		return (substring(getStringValue(),beginBdms01CloseAvSw,beginBdms01CloseAvSw + BDMS_01_CLOSE_AV_SW_LEN));
   	}
     int localBdms01AskHiSwCounter = -1;
     public boolean isBdms01AskHiSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01AskHiSwCounter != sharedCounter;
         localBdms01AskHiSwCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_ASK_HI_SW_LEN = 2;
	/**
	 * 	serialize this Bdms01AskHiSw
	 */
   protected void serializeBdms01AskHiSw(char[] bdms01AskHiSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01AskHiSw,0,getStringValue(),beginBdms01AskHiSw,BDMS_01_ASK_HI_SW_LEN);
       localBdms01AskHiSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01AskHiSwConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01AskHiSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01AskHiSw() {	 
   		return (substring(getStringValue(),beginBdms01AskHiSw,beginBdms01AskHiSw + BDMS_01_ASK_HI_SW_LEN));
   	}
     int localBdms01BidLoSwCounter = -1;
     public boolean isBdms01BidLoSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01BidLoSwCounter != sharedCounter;
         localBdms01BidLoSwCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_BID_LO_SW_LEN = 2;
	/**
	 * 	serialize this Bdms01BidLoSw
	 */
   protected void serializeBdms01BidLoSw(char[] bdms01BidLoSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01BidLoSw,0,getStringValue(),beginBdms01BidLoSw,BDMS_01_BID_LO_SW_LEN);
       localBdms01BidLoSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01BidLoSwConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01BidLoSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01BidLoSw() {	 
   		return (substring(getStringValue(),beginBdms01BidLoSw,beginBdms01BidLoSw + BDMS_01_BID_LO_SW_LEN));
   	}
     int localMsdHousePriceCounter = -1;
     
     public boolean isMsdHousePriceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdHousePriceCounter != sharedCounter;
         localMsdHousePriceCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdHousePrice
	 *	@return msdHousePrice
	 */
	public char[]  getMsdHousePriceString() {
	    return getCharArray(beginMsdHousePrice,MSD_HOUSE_PRICE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdHousePriceIsNumeric() {
		    return isNumeric(beginMsdHousePrice
	                    ,beginMsdHousePrice + MSD_HOUSE_PRICE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_HOUSE_PRICE_LEN = 16;
  protected  static final int MSD_HOUSE_PRICE_SCALE = 8;

   protected BigDecimal checkMsdHousePriceMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,16/*precision*/);
   }

  	/**
	 * serializeMsdHousePrice
	 */
	protected void serializeMsdHousePrice(BigDecimal msdHousePrice) {
	       putNumber(beginMsdHousePrice,msdHousePrice,MSD_HOUSE_PRICE_LEN,MSD_HOUSE_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdHousePriceCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdHousePrice
	 */
   	protected  BigDecimal serializeMsdHousePrice(char[] value) throws CFException {
        if (value.length < 16) value = pad(16, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(16,value,false/*isSigned?*/)
		       ,beginMsdHousePrice
		       ,16
		      );		 localMsdHousePriceCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_HOUSE_PRICE_LEN,MSD_HOUSE_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdHousePrice", beginMsdHousePrice,MSD_HOUSE_PRICE_LEN);
    	}
    }
    /**
	 *	refreshMsdHousePrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdHousePrice() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdHousePrice
			            ,MSD_HOUSE_PRICE_LEN
			            ,MSD_HOUSE_PRICE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdHousePrice", beginMsdHousePrice,MSD_HOUSE_PRICE_LEN);
    }
   	}
     int localMsdHousePriceDateCounter = -1;
     public boolean isMsdHousePriceDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdHousePriceDateCounter != sharedCounter;
         localMsdHousePriceDateCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_HOUSE_PRICE_DATE_LEN = 10;
	/**
	 * 	serialize this MsdHousePriceDate
	 */
   protected void serializeMsdHousePriceDate(char[] msdHousePriceDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdHousePriceDate,0,getStringValue(),beginMsdHousePriceDate,MSD_HOUSE_PRICE_DATE_LEN);
       localMsdHousePriceDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdHousePriceDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshMsdHousePriceDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdHousePriceDate() {	 
   		return (substring(getStringValue(),beginMsdHousePriceDate,beginMsdHousePriceDate + MSD_HOUSE_PRICE_DATE_LEN));
   	}
     int localMsdHousePriceSourceCounter = -1;
     public boolean isMsdHousePriceSourceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdHousePriceSourceCounter != sharedCounter;
         localMsdHousePriceSourceCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_HOUSE_PRICE_SOURCE_LEN = 15;
	/**
	 * 	serialize this MsdHousePriceSource
	 */
   protected void serializeMsdHousePriceSource(char[] msdHousePriceSource) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdHousePriceSource,0,getStringValue(),beginMsdHousePriceSource,MSD_HOUSE_PRICE_SOURCE_LEN);
       localMsdHousePriceSourceCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdHousePriceSourceConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshMsdHousePriceSource is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdHousePriceSource() {	 
   		return (substring(getStringValue(),beginMsdHousePriceSource,beginMsdHousePriceSource + MSD_HOUSE_PRICE_SOURCE_LEN));
   	}
     int localMsdHousePriceRegionCounter = -1;
     public boolean isMsdHousePriceRegionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdHousePriceRegionCounter != sharedCounter;
         localMsdHousePriceRegionCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_HOUSE_PRICE_REGION_LEN = 1;
	/**
	 * 	serialize this MsdHousePriceRegion
	 */
   protected void serializeMsdHousePriceRegion(char[] msdHousePriceRegion) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdHousePriceRegion,0,getStringValue(),beginMsdHousePriceRegion,MSD_HOUSE_PRICE_REGION_LEN);
       localMsdHousePriceRegionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdHousePriceRegionConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdHousePriceRegion is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdHousePriceRegion() {	 
   		return (substring(getStringValue(),beginMsdHousePriceRegion,beginMsdHousePriceRegion + MSD_HOUSE_PRICE_REGION_LEN));
   	}




}
  
