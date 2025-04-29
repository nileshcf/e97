package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class Bdms01GetpriceSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:18. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Bdms01GetpriceSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01GetpriceSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_GETPRICE_SEG_DATA_LENGTH = 119;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01GetpriceSegSqlcd;
            protected  int beginBdms01GetprcRetPriceDate;
            protected  int beginBdms01GetprcRetCurrencyCd;
            protected  int beginBdms01GetprcRetExchangeCd;
            protected  int beginBdms01GetprcRetVendorCd;
            protected  int beginBdms01GetprcRetWiInd;
            protected  int beginBdms01GetprcRetCountryCd;
            protected  int beginBdms01GetprcRetCloseAvSw;
            protected  int beginBdms01GetprcRetCloseAvPrc;
            protected  int beginBdms01GetprcRetAskHiSw;
            protected  int beginBdms01GetprcRetAskHiPrc;
            protected  int beginBdms01GetprcRetBidLoSw;
            protected  int beginBdms01GetprcRetBidLoPrc;
	
	/**
	* Constructor for Bdms01GetpriceSegDataSerialized
	**/
    public Bdms01GetpriceSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01GetpriceSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01GetpriceSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01GetpriceSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3649); // serialize this field at offset 3649 by default 
    }
    
	/**
	* sets parent for this Bdms01GetpriceSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3649 by default
    }    
	/**
	* initializes the field in Bdms01GetpriceSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_GETPRICE_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01GetpriceSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginBdms01GetprcRetPriceDate = getStartOffset() + 4;	// set offset for serialization
  
             beginBdms01GetprcRetCurrencyCd = getStartOffset() + 14;	// set offset for serialization
  
             beginBdms01GetprcRetExchangeCd = getStartOffset() + 16;	// set offset for serialization
  
             beginBdms01GetprcRetVendorCd = getStartOffset() + 26;	// set offset for serialization
  
             beginBdms01GetprcRetWiInd = getStartOffset() + 36;	// set offset for serialization
  
             beginBdms01GetprcRetCountryCd = getStartOffset() + 37;	// set offset for serialization
  
             beginBdms01GetprcRetCloseAvSw = getStartOffset() + 39;	// set offset for serialization
  
             beginBdms01GetprcRetCloseAvPrc = getStartOffset() + 41;	// set offset for serialization
  
             beginBdms01GetprcRetAskHiSw = getStartOffset() + 59;	// set offset for serialization
  
             beginBdms01GetprcRetAskHiPrc = getStartOffset() + 61;	// set offset for serialization
  
             beginBdms01GetprcRetBidLoSw = getStartOffset() + 79;	// set offset for serialization
  
             beginBdms01GetprcRetBidLoPrc = getStartOffset() + 81;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01GetpriceSegSqlcdCounter = -1;
     public boolean isBdms01GetpriceSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01GetpriceSegSqlcdCounter != sharedCounter;
         localBdms01GetpriceSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01GetpriceSegSqlcd
	 *	@return bdms01GetpriceSegSqlcd
	 */
	public char[]  getBdms01GetpriceSegSqlcdString() {
	     return getCharArray(beginBdms01GetpriceSegSqlcd,BDMS_01_GETPRICE_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01GetpriceSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01GetpriceSegSqlcd
	                    ,beginBdms01GetpriceSegSqlcd + BDMS_01_GETPRICE_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_GETPRICE_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01GetpriceSegSqlcd
	 */
	protected void serializeBdms01GetpriceSegSqlcd(int bdms01GetpriceSegSqlcd) {
		 putNumber(beginBdms01GetpriceSegSqlcd,bdms01GetpriceSegSqlcd,BDMS_01_GETPRICE_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01GetpriceSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01GetpriceSegSqlcd
	 */
   	protected  int serializeBdms01GetpriceSegSqlcd(char[] value) {
	    int  bdms01GetpriceSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01GetpriceSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01GetpriceSegSqlcd
		       ,4
		      );
		 localBdms01GetpriceSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01GetpriceSegSqlcd;
    }

   protected int checkBdms01GetpriceSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01GetpriceSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01GetpriceSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01GetpriceSegSqlcd
			                 ,BDMS_01_GETPRICE_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01GetpriceSegSqlcd", beginBdms01GetpriceSegSqlcd,BDMS_01_GETPRICE_SEG_SQLCD_LEN);
    }
   	}
     int localBdms01GetprcRetPriceDateCounter = -1;
     public boolean isBdms01GetprcRetPriceDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01GetprcRetPriceDateCounter != sharedCounter;
         localBdms01GetprcRetPriceDateCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_GETPRC_RET_PRICE_DATE_LEN = 10;
	/**
	 * 	serialize this Bdms01GetprcRetPriceDate
	 */
   protected void serializeBdms01GetprcRetPriceDate(char[] bdms01GetprcRetPriceDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01GetprcRetPriceDate,0,getStringValue(),beginBdms01GetprcRetPriceDate,BDMS_01_GETPRC_RET_PRICE_DATE_LEN);
       localBdms01GetprcRetPriceDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01GetprcRetPriceDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01GetprcRetPriceDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01GetprcRetPriceDate() {	 
   		return (substring(getStringValue(),beginBdms01GetprcRetPriceDate,beginBdms01GetprcRetPriceDate + BDMS_01_GETPRC_RET_PRICE_DATE_LEN));
   	}
     int localBdms01GetprcRetCurrencyCdCounter = -1;
     public boolean isBdms01GetprcRetCurrencyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01GetprcRetCurrencyCdCounter != sharedCounter;
         localBdms01GetprcRetCurrencyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_GETPRC_RET_CURRENCY_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01GetprcRetCurrencyCd
	 */
   protected void serializeBdms01GetprcRetCurrencyCd(char[] bdms01GetprcRetCurrencyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01GetprcRetCurrencyCd,0,getStringValue(),beginBdms01GetprcRetCurrencyCd,BDMS_01_GETPRC_RET_CURRENCY_CD_LEN);
       localBdms01GetprcRetCurrencyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01GetprcRetCurrencyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01GetprcRetCurrencyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01GetprcRetCurrencyCd() {	 
   		return (substring(getStringValue(),beginBdms01GetprcRetCurrencyCd,beginBdms01GetprcRetCurrencyCd + BDMS_01_GETPRC_RET_CURRENCY_CD_LEN));
   	}
     int localBdms01GetprcRetExchangeCdCounter = -1;
     public boolean isBdms01GetprcRetExchangeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01GetprcRetExchangeCdCounter != sharedCounter;
         localBdms01GetprcRetExchangeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_GETPRC_RET_EXCHANGE_CD_LEN = 10;
	/**
	 * 	serialize this Bdms01GetprcRetExchangeCd
	 */
   protected void serializeBdms01GetprcRetExchangeCd(char[] bdms01GetprcRetExchangeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01GetprcRetExchangeCd,0,getStringValue(),beginBdms01GetprcRetExchangeCd,BDMS_01_GETPRC_RET_EXCHANGE_CD_LEN);
       localBdms01GetprcRetExchangeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01GetprcRetExchangeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01GetprcRetExchangeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01GetprcRetExchangeCd() {	 
   		return (substring(getStringValue(),beginBdms01GetprcRetExchangeCd,beginBdms01GetprcRetExchangeCd + BDMS_01_GETPRC_RET_EXCHANGE_CD_LEN));
   	}
     int localBdms01GetprcRetVendorCdCounter = -1;
     public boolean isBdms01GetprcRetVendorCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01GetprcRetVendorCdCounter != sharedCounter;
         localBdms01GetprcRetVendorCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_GETPRC_RET_VENDOR_CD_LEN = 10;
	/**
	 * 	serialize this Bdms01GetprcRetVendorCd
	 */
   protected void serializeBdms01GetprcRetVendorCd(char[] bdms01GetprcRetVendorCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01GetprcRetVendorCd,0,getStringValue(),beginBdms01GetprcRetVendorCd,BDMS_01_GETPRC_RET_VENDOR_CD_LEN);
       localBdms01GetprcRetVendorCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01GetprcRetVendorCdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01GetprcRetVendorCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01GetprcRetVendorCd() {	 
   		return (substring(getStringValue(),beginBdms01GetprcRetVendorCd,beginBdms01GetprcRetVendorCd + BDMS_01_GETPRC_RET_VENDOR_CD_LEN));
   	}
     int localBdms01GetprcRetWiIndCounter = -1;
     public boolean isBdms01GetprcRetWiIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01GetprcRetWiIndCounter != sharedCounter;
         localBdms01GetprcRetWiIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_GETPRC_RET_WI_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01GetprcRetWiInd
	 */
   protected void serializeBdms01GetprcRetWiInd(char[] bdms01GetprcRetWiInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01GetprcRetWiInd,0,getStringValue(),beginBdms01GetprcRetWiInd,BDMS_01_GETPRC_RET_WI_IND_LEN);
       localBdms01GetprcRetWiIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01GetprcRetWiIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01GetprcRetWiInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01GetprcRetWiInd() {	 
   		return (substring(getStringValue(),beginBdms01GetprcRetWiInd,beginBdms01GetprcRetWiInd + BDMS_01_GETPRC_RET_WI_IND_LEN));
   	}
     int localBdms01GetprcRetCountryCdCounter = -1;
     public boolean isBdms01GetprcRetCountryCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01GetprcRetCountryCdCounter != sharedCounter;
         localBdms01GetprcRetCountryCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_GETPRC_RET_COUNTRY_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01GetprcRetCountryCd
	 */
   protected void serializeBdms01GetprcRetCountryCd(char[] bdms01GetprcRetCountryCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01GetprcRetCountryCd,0,getStringValue(),beginBdms01GetprcRetCountryCd,BDMS_01_GETPRC_RET_COUNTRY_CD_LEN);
       localBdms01GetprcRetCountryCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01GetprcRetCountryCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01GetprcRetCountryCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01GetprcRetCountryCd() {	 
   		return (substring(getStringValue(),beginBdms01GetprcRetCountryCd,beginBdms01GetprcRetCountryCd + BDMS_01_GETPRC_RET_COUNTRY_CD_LEN));
   	}
     int localBdms01GetprcRetCloseAvSwCounter = -1;
     public boolean isBdms01GetprcRetCloseAvSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01GetprcRetCloseAvSwCounter != sharedCounter;
         localBdms01GetprcRetCloseAvSwCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_GETPRC_RET_CLOSE_AV_SW_LEN = 2;
	/**
	 * 	serialize this Bdms01GetprcRetCloseAvSw
	 */
   protected void serializeBdms01GetprcRetCloseAvSw(char[] bdms01GetprcRetCloseAvSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01GetprcRetCloseAvSw,0,getStringValue(),beginBdms01GetprcRetCloseAvSw,BDMS_01_GETPRC_RET_CLOSE_AV_SW_LEN);
       localBdms01GetprcRetCloseAvSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01GetprcRetCloseAvSwConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01GetprcRetCloseAvSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01GetprcRetCloseAvSw() {	 
   		return (substring(getStringValue(),beginBdms01GetprcRetCloseAvSw,beginBdms01GetprcRetCloseAvSw + BDMS_01_GETPRC_RET_CLOSE_AV_SW_LEN));
   	}
     int localBdms01GetprcRetCloseAvPrcCounter = -1;
     
     public boolean isBdms01GetprcRetCloseAvPrcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01GetprcRetCloseAvPrcCounter != sharedCounter;
         localBdms01GetprcRetCloseAvPrcCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01GetprcRetCloseAvPrc
	 *	@return bdms01GetprcRetCloseAvPrc
	 */
	public char[]  getBdms01GetprcRetCloseAvPrcString() {
	    return getCharArray(beginBdms01GetprcRetCloseAvPrc,BDMS_01_GETPRC_RET_CLOSE_AV_PRC_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01GetprcRetCloseAvPrcIsNumeric() {
		    return isNumeric(beginBdms01GetprcRetCloseAvPrc
	                    ,beginBdms01GetprcRetCloseAvPrc + BDMS_01_GETPRC_RET_CLOSE_AV_PRC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_GETPRC_RET_CLOSE_AV_PRC_LEN = 18;
  protected  static final int BDMS_01_GETPRC_RET_CLOSE_AV_PRC_SCALE = 8;

   protected BigDecimal checkBdms01GetprcRetCloseAvPrcMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeBdms01GetprcRetCloseAvPrc
	 */
	protected void serializeBdms01GetprcRetCloseAvPrc(BigDecimal bdms01GetprcRetCloseAvPrc) {
	       putNumber(beginBdms01GetprcRetCloseAvPrc,bdms01GetprcRetCloseAvPrc,BDMS_01_GETPRC_RET_CLOSE_AV_PRC_LEN,BDMS_01_GETPRC_RET_CLOSE_AV_PRC_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01GetprcRetCloseAvPrcCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01GetprcRetCloseAvPrc
	 */
   	protected  BigDecimal serializeBdms01GetprcRetCloseAvPrc(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginBdms01GetprcRetCloseAvPrc
		       ,18
		      );		 localBdms01GetprcRetCloseAvPrcCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_GETPRC_RET_CLOSE_AV_PRC_LEN,BDMS_01_GETPRC_RET_CLOSE_AV_PRC_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01GetprcRetCloseAvPrc", beginBdms01GetprcRetCloseAvPrc,BDMS_01_GETPRC_RET_CLOSE_AV_PRC_LEN);
    	}
    }
    /**
	 *	refreshBdms01GetprcRetCloseAvPrc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01GetprcRetCloseAvPrc() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01GetprcRetCloseAvPrc
			            ,BDMS_01_GETPRC_RET_CLOSE_AV_PRC_LEN
			            ,BDMS_01_GETPRC_RET_CLOSE_AV_PRC_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01GetprcRetCloseAvPrc", beginBdms01GetprcRetCloseAvPrc,BDMS_01_GETPRC_RET_CLOSE_AV_PRC_LEN);
    }
   	}
     int localBdms01GetprcRetAskHiSwCounter = -1;
     public boolean isBdms01GetprcRetAskHiSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01GetprcRetAskHiSwCounter != sharedCounter;
         localBdms01GetprcRetAskHiSwCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_GETPRC_RET_ASK_HI_SW_LEN = 2;
	/**
	 * 	serialize this Bdms01GetprcRetAskHiSw
	 */
   protected void serializeBdms01GetprcRetAskHiSw(char[] bdms01GetprcRetAskHiSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01GetprcRetAskHiSw,0,getStringValue(),beginBdms01GetprcRetAskHiSw,BDMS_01_GETPRC_RET_ASK_HI_SW_LEN);
       localBdms01GetprcRetAskHiSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01GetprcRetAskHiSwConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01GetprcRetAskHiSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01GetprcRetAskHiSw() {	 
   		return (substring(getStringValue(),beginBdms01GetprcRetAskHiSw,beginBdms01GetprcRetAskHiSw + BDMS_01_GETPRC_RET_ASK_HI_SW_LEN));
   	}
     int localBdms01GetprcRetAskHiPrcCounter = -1;
     
     public boolean isBdms01GetprcRetAskHiPrcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01GetprcRetAskHiPrcCounter != sharedCounter;
         localBdms01GetprcRetAskHiPrcCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01GetprcRetAskHiPrc
	 *	@return bdms01GetprcRetAskHiPrc
	 */
	public char[]  getBdms01GetprcRetAskHiPrcString() {
	    return getCharArray(beginBdms01GetprcRetAskHiPrc,BDMS_01_GETPRC_RET_ASK_HI_PRC_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01GetprcRetAskHiPrcIsNumeric() {
		    return isNumeric(beginBdms01GetprcRetAskHiPrc
	                    ,beginBdms01GetprcRetAskHiPrc + BDMS_01_GETPRC_RET_ASK_HI_PRC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_GETPRC_RET_ASK_HI_PRC_LEN = 18;
  protected  static final int BDMS_01_GETPRC_RET_ASK_HI_PRC_SCALE = 8;

   protected BigDecimal checkBdms01GetprcRetAskHiPrcMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeBdms01GetprcRetAskHiPrc
	 */
	protected void serializeBdms01GetprcRetAskHiPrc(BigDecimal bdms01GetprcRetAskHiPrc) {
	       putNumber(beginBdms01GetprcRetAskHiPrc,bdms01GetprcRetAskHiPrc,BDMS_01_GETPRC_RET_ASK_HI_PRC_LEN,BDMS_01_GETPRC_RET_ASK_HI_PRC_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01GetprcRetAskHiPrcCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01GetprcRetAskHiPrc
	 */
   	protected  BigDecimal serializeBdms01GetprcRetAskHiPrc(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginBdms01GetprcRetAskHiPrc
		       ,18
		      );		 localBdms01GetprcRetAskHiPrcCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_GETPRC_RET_ASK_HI_PRC_LEN,BDMS_01_GETPRC_RET_ASK_HI_PRC_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01GetprcRetAskHiPrc", beginBdms01GetprcRetAskHiPrc,BDMS_01_GETPRC_RET_ASK_HI_PRC_LEN);
    	}
    }
    /**
	 *	refreshBdms01GetprcRetAskHiPrc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01GetprcRetAskHiPrc() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01GetprcRetAskHiPrc
			            ,BDMS_01_GETPRC_RET_ASK_HI_PRC_LEN
			            ,BDMS_01_GETPRC_RET_ASK_HI_PRC_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01GetprcRetAskHiPrc", beginBdms01GetprcRetAskHiPrc,BDMS_01_GETPRC_RET_ASK_HI_PRC_LEN);
    }
   	}
     int localBdms01GetprcRetBidLoSwCounter = -1;
     public boolean isBdms01GetprcRetBidLoSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01GetprcRetBidLoSwCounter != sharedCounter;
         localBdms01GetprcRetBidLoSwCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_GETPRC_RET_BID_LO_SW_LEN = 2;
	/**
	 * 	serialize this Bdms01GetprcRetBidLoSw
	 */
   protected void serializeBdms01GetprcRetBidLoSw(char[] bdms01GetprcRetBidLoSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01GetprcRetBidLoSw,0,getStringValue(),beginBdms01GetprcRetBidLoSw,BDMS_01_GETPRC_RET_BID_LO_SW_LEN);
       localBdms01GetprcRetBidLoSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01GetprcRetBidLoSwConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01GetprcRetBidLoSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01GetprcRetBidLoSw() {	 
   		return (substring(getStringValue(),beginBdms01GetprcRetBidLoSw,beginBdms01GetprcRetBidLoSw + BDMS_01_GETPRC_RET_BID_LO_SW_LEN));
   	}
     int localBdms01GetprcRetBidLoPrcCounter = -1;
     
     public boolean isBdms01GetprcRetBidLoPrcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01GetprcRetBidLoPrcCounter != sharedCounter;
         localBdms01GetprcRetBidLoPrcCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01GetprcRetBidLoPrc
	 *	@return bdms01GetprcRetBidLoPrc
	 */
	public char[]  getBdms01GetprcRetBidLoPrcString() {
	    return getCharArray(beginBdms01GetprcRetBidLoPrc,BDMS_01_GETPRC_RET_BID_LO_PRC_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01GetprcRetBidLoPrcIsNumeric() {
		    return isNumeric(beginBdms01GetprcRetBidLoPrc
	                    ,beginBdms01GetprcRetBidLoPrc + BDMS_01_GETPRC_RET_BID_LO_PRC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_GETPRC_RET_BID_LO_PRC_LEN = 18;
  protected  static final int BDMS_01_GETPRC_RET_BID_LO_PRC_SCALE = 8;

   protected BigDecimal checkBdms01GetprcRetBidLoPrcMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeBdms01GetprcRetBidLoPrc
	 */
	protected void serializeBdms01GetprcRetBidLoPrc(BigDecimal bdms01GetprcRetBidLoPrc) {
	       putNumber(beginBdms01GetprcRetBidLoPrc,bdms01GetprcRetBidLoPrc,BDMS_01_GETPRC_RET_BID_LO_PRC_LEN,BDMS_01_GETPRC_RET_BID_LO_PRC_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01GetprcRetBidLoPrcCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01GetprcRetBidLoPrc
	 */
   	protected  BigDecimal serializeBdms01GetprcRetBidLoPrc(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginBdms01GetprcRetBidLoPrc
		       ,18
		      );		 localBdms01GetprcRetBidLoPrcCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_GETPRC_RET_BID_LO_PRC_LEN,BDMS_01_GETPRC_RET_BID_LO_PRC_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01GetprcRetBidLoPrc", beginBdms01GetprcRetBidLoPrc,BDMS_01_GETPRC_RET_BID_LO_PRC_LEN);
    	}
    }
    /**
	 *	refreshBdms01GetprcRetBidLoPrc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01GetprcRetBidLoPrc() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01GetprcRetBidLoPrc
			            ,BDMS_01_GETPRC_RET_BID_LO_PRC_LEN
			            ,BDMS_01_GETPRC_RET_BID_LO_PRC_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01GetprcRetBidLoPrc", beginBdms01GetprcRetBidLoPrc,BDMS_01_GETPRC_RET_BID_LO_PRC_LEN);
    }
   	}




}
  
