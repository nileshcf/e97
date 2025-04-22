package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01StockSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Bdms01StockSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01StockSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_STOCK_SEG_DATA_LENGTH = 293;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01StockSegSqlcd;
            protected  int beginMsdSharesOuts;
            protected  int beginMsdEarnPerShr;
            protected  int beginMsdEarnPerShrSign;
            protected  int beginMsdEstimatedDiv;
            protected  int beginMsdStkProxyMtngDt;
            protected  int beginMsdStkProxyRecDt;
            protected  int beginMsdPoisonPillInd;
            protected  int beginBdms01MeetingProxyDt;
            protected  int beginBdms01RecordProxyDt;
            protected  int beginBdms01StkExpirationDt;
            protected  int beginBdms01MasterLtdInd;
            protected  int beginMsdMlp;
            protected  int beginBdms01MmfInd;
            protected  int beginBdms01OpenFundCd;
            protected  int beginBdms01LotTradeCd;
            protected  int beginBdms01DvdndYldAmt;
            protected  int beginBdms01ExpirationAmt;
            protected  int beginBdms01AdrInd;
            protected  int beginBdms01GdrInd;
            protected  int beginBdms01PsnplCd;
            protected  int beginBdms01PrfrdInd;
            protected  int beginBdms01DivCumInd;
            protected  int beginBdms01FreqIncmDebtCd;
            protected  int beginBdms01CallDt;
            protected  int beginBdms01CallAmt;
            protected  int beginBdms01DvdndAnnlAmt;
            protected  int beginBdms01DvdndAnnlPct;
            protected  int beginBdms01PrtcpInd;
            protected  int beginBdms01VoteRghtsInd;
            protected  int beginBdms01ScrtyAdpRstrNbr;
            protected  int beginBdms01UtsCanadianCd;
            protected  int beginBdms01WarrantsIndexInd;
            protected  int beginMsdMidsQids;
            protected  int beginBdms01EtfInd;
            protected  int beginBdms01SmallCptlInd;
            protected  int beginBdms01ExmptUptckInd;
            protected  int beginBdms01RegShoElgblInd;
            protected  int beginBdms01RegShoElgblDt;
            protected  int beginBdms01MfFamilyNbr;
            protected  int beginBdms01ShrClassCd;
            protected  int beginBdms01RegShoInelgblDt;
            protected  int beginBdms01MfLoadTypeCd;
            protected  int beginBdms01EqiContraInd;
            protected  int beginBdms01OtcBlltnFeeInd;
	
	/**
	* Constructor for Bdms01StockSegDataSerialized
	**/
    public Bdms01StockSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01StockSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01StockSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01StockSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2056); // serialize this field at offset 2056 by default 
    }
    
	/**
	* sets parent for this Bdms01StockSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2056 by default
    }    
	/**
	* initializes the field in Bdms01StockSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_STOCK_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01StockSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdSharesOuts = getStartOffset() + 4;	// set offset for serialization
  
             beginMsdEarnPerShr = getStartOffset() + 17;	// set offset for serialization
  
             beginMsdEarnPerShrSign = getStartOffset() + 32;	// set offset for serialization
  
             beginMsdEstimatedDiv = getStartOffset() + 33;	// set offset for serialization
  
             beginMsdStkProxyMtngDt = getStartOffset() + 48;	// set offset for serialization
  
             beginMsdStkProxyRecDt = getStartOffset() + 56;	// set offset for serialization
  
  
             beginMsdPoisonPillInd = getStartOffset() + 72;	// set offset for serialization
  
             beginBdms01MeetingProxyDt = getStartOffset() + 73;	// set offset for serialization
  
             beginBdms01RecordProxyDt = getStartOffset() + 83;	// set offset for serialization
  
             beginBdms01StkExpirationDt = getStartOffset() + 93;	// set offset for serialization
  
             beginBdms01MasterLtdInd = getStartOffset() + 103;	// set offset for serialization
  
             beginMsdMlp = getStartOffset() + 103;	// set offset for serialization
  
             beginBdms01MmfInd = getStartOffset() + 104;	// set offset for serialization
  
             beginBdms01OpenFundCd = getStartOffset() + 105;	// set offset for serialization
  
             beginBdms01LotTradeCd = getStartOffset() + 106;	// set offset for serialization
  
             beginBdms01DvdndYldAmt = getStartOffset() + 108;	// set offset for serialization
  
             beginBdms01ExpirationAmt = getStartOffset() + 123;	// set offset for serialization
  
             beginBdms01AdrInd = getStartOffset() + 138;	// set offset for serialization
  
             beginBdms01GdrInd = getStartOffset() + 139;	// set offset for serialization
  
             beginBdms01PsnplCd = getStartOffset() + 140;	// set offset for serialization
  
             beginBdms01PrfrdInd = getStartOffset() + 143;	// set offset for serialization
  
             beginBdms01DivCumInd = getStartOffset() + 144;	// set offset for serialization
  
             beginBdms01FreqIncmDebtCd = getStartOffset() + 145;	// set offset for serialization
  
             beginBdms01CallDt = getStartOffset() + 147;	// set offset for serialization
  
             beginBdms01CallAmt = getStartOffset() + 157;	// set offset for serialization
  
             beginBdms01DvdndAnnlAmt = getStartOffset() + 172;	// set offset for serialization
  
             beginBdms01DvdndAnnlPct = getStartOffset() + 187;	// set offset for serialization
  
             beginBdms01PrtcpInd = getStartOffset() + 202;	// set offset for serialization
  
             beginBdms01VoteRghtsInd = getStartOffset() + 203;	// set offset for serialization
  
             beginBdms01ScrtyAdpRstrNbr = getStartOffset() + 204;	// set offset for serialization
  
             beginBdms01UtsCanadianCd = getStartOffset() + 211;	// set offset for serialization
  
             beginBdms01WarrantsIndexInd = getStartOffset() + 212;	// set offset for serialization
  
             beginMsdMidsQids = getStartOffset() + 213;	// set offset for serialization
  
             beginBdms01EtfInd = getStartOffset() + 214;	// set offset for serialization
  
             beginBdms01SmallCptlInd = getStartOffset() + 215;	// set offset for serialization
  
             beginBdms01ExmptUptckInd = getStartOffset() + 216;	// set offset for serialization
  
             beginBdms01RegShoElgblInd = getStartOffset() + 217;	// set offset for serialization
  
             beginBdms01RegShoElgblDt = getStartOffset() + 218;	// set offset for serialization
  
             beginBdms01MfFamilyNbr = getStartOffset() + 228;	// set offset for serialization
  
             beginBdms01ShrClassCd = getStartOffset() + 232;	// set offset for serialization
  
             beginBdms01RegShoInelgblDt = getStartOffset() + 233;	// set offset for serialization
  
             beginBdms01MfLoadTypeCd = getStartOffset() + 243;	// set offset for serialization
  
             beginBdms01EqiContraInd = getStartOffset() + 244;	// set offset for serialization
  
             beginBdms01OtcBlltnFeeInd = getStartOffset() + 245;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01StockSegSqlcdCounter = -1;
     public boolean isBdms01StockSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01StockSegSqlcdCounter != sharedCounter;
         localBdms01StockSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01StockSegSqlcd
	 *	@return bdms01StockSegSqlcd
	 */
	public char[]  getBdms01StockSegSqlcdString() {
	     return getCharArray(beginBdms01StockSegSqlcd,BDMS_01_STOCK_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01StockSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01StockSegSqlcd
	                    ,beginBdms01StockSegSqlcd + BDMS_01_STOCK_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_STOCK_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01StockSegSqlcd
	 */
	protected void serializeBdms01StockSegSqlcd(int bdms01StockSegSqlcd) {
		 putNumber(beginBdms01StockSegSqlcd,bdms01StockSegSqlcd,BDMS_01_STOCK_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01StockSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01StockSegSqlcd
	 */
   	protected  int serializeBdms01StockSegSqlcd(char[] value) {
	    int  bdms01StockSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01StockSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01StockSegSqlcd
		       ,4
		      );
		 localBdms01StockSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01StockSegSqlcd;
    }

   protected int checkBdms01StockSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01StockSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01StockSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01StockSegSqlcd
			                 ,BDMS_01_STOCK_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01StockSegSqlcd", beginBdms01StockSegSqlcd,BDMS_01_STOCK_SEG_SQLCD_LEN);
    }
   	}
     int localMsdSharesOutsCounter = -1;
     public boolean isMsdSharesOutsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSharesOutsCounter != sharedCounter;
         localMsdSharesOutsCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdSharesOuts
	 *	@return msdSharesOuts
	 */
	public char[]  getMsdSharesOutsString() {
	     return getCharArray(beginMsdSharesOuts,MSD_SHARES_OUTS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdSharesOutsIsNumeric() {
	    return isNumeric(beginMsdSharesOuts
	                    ,beginMsdSharesOuts + MSD_SHARES_OUTS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_SHARES_OUTS_LEN = 13;
  	/**
	 * serializeMsdSharesOuts
	 */
	protected void serializeMsdSharesOuts(long msdSharesOuts) {
		 putNumber(beginMsdSharesOuts,msdSharesOuts,MSD_SHARES_OUTS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdSharesOutsCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdSharesOuts
	 */
   	protected  long serializeMsdSharesOuts(char[] value) {
	    long  msdSharesOuts;
	    if(value.length >0 && value.length!= 13)
            value = new String(value).trim().toCharArray();
	    if (value.length < 13) value = pad(13, value, ' ', LEFT_PAD);
	    else if (value.length > 13) value = substring(value,0,13);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdSharesOuts = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(13,value,false/*isSigned?*/)
		       ,beginMsdSharesOuts
		       ,13
		      );
		 localMsdSharesOutsCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdSharesOuts;
    }

   protected long checkMsdSharesOutsMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdSharesOuts is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdSharesOuts() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdSharesOuts
			                 ,MSD_SHARES_OUTS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdSharesOuts", beginMsdSharesOuts,MSD_SHARES_OUTS_LEN);
    }
   	}
     int localMsdEarnPerShrCounter = -1;
     
     public boolean isMsdEarnPerShrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdEarnPerShrCounter != sharedCounter;
         localMsdEarnPerShrCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdEarnPerShr
	 *	@return msdEarnPerShr
	 */
	public char[]  getMsdEarnPerShrString() {
	    return getCharArray(beginMsdEarnPerShr,MSD_EARN_PER_SHR_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdEarnPerShrIsNumeric() {
		    return isNumeric(beginMsdEarnPerShr
	                    ,beginMsdEarnPerShr + MSD_EARN_PER_SHR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_EARN_PER_SHR_LEN = 15;
  protected  static final int MSD_EARN_PER_SHR_SCALE = 7;

   protected BigDecimal checkMsdEarnPerShrMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,7/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeMsdEarnPerShr
	 */
	protected void serializeMsdEarnPerShr(BigDecimal msdEarnPerShr) {
	       putNumber(beginMsdEarnPerShr,msdEarnPerShr,MSD_EARN_PER_SHR_LEN,MSD_EARN_PER_SHR_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdEarnPerShrCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdEarnPerShr
	 */
   	protected  BigDecimal serializeMsdEarnPerShr(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginMsdEarnPerShr
		       ,15
		      );		 localMsdEarnPerShrCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_EARN_PER_SHR_LEN,MSD_EARN_PER_SHR_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdEarnPerShr", beginMsdEarnPerShr,MSD_EARN_PER_SHR_LEN);
    	}
    }
    /**
	 *	refreshMsdEarnPerShr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdEarnPerShr() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdEarnPerShr
			            ,MSD_EARN_PER_SHR_LEN
			            ,MSD_EARN_PER_SHR_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdEarnPerShr", beginMsdEarnPerShr,MSD_EARN_PER_SHR_LEN);
    }
   	}
     int localMsdEarnPerShrSignCounter = -1;
     public boolean isMsdEarnPerShrSignModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdEarnPerShrSignCounter != sharedCounter;
         localMsdEarnPerShrSignCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_EARN_PER_SHR_SIGN_LEN = 1;
	/**
	 * 	serialize this MsdEarnPerShrSign
	 */
   protected void serializeMsdEarnPerShrSign(char[] msdEarnPerShrSign) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdEarnPerShrSign,0,getStringValue(),beginMsdEarnPerShrSign,MSD_EARN_PER_SHR_SIGN_LEN);
       localMsdEarnPerShrSignCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdEarnPerShrSignConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdEarnPerShrSign is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdEarnPerShrSign() {	 
   		return (substring(getStringValue(),beginMsdEarnPerShrSign,beginMsdEarnPerShrSign + MSD_EARN_PER_SHR_SIGN_LEN));
   	}
     int localMsdEstimatedDivCounter = -1;
     
     public boolean isMsdEstimatedDivModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdEstimatedDivCounter != sharedCounter;
         localMsdEstimatedDivCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdEstimatedDiv
	 *	@return msdEstimatedDiv
	 */
	public char[]  getMsdEstimatedDivString() {
	    return getCharArray(beginMsdEstimatedDiv,MSD_ESTIMATED_DIV_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdEstimatedDivIsNumeric() {
		    return isNumeric(beginMsdEstimatedDiv
	                    ,beginMsdEstimatedDiv + MSD_ESTIMATED_DIV_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_ESTIMATED_DIV_LEN = 15;
  protected  static final int MSD_ESTIMATED_DIV_SCALE = 7;

   protected BigDecimal checkMsdEstimatedDivMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,7/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeMsdEstimatedDiv
	 */
	protected void serializeMsdEstimatedDiv(BigDecimal msdEstimatedDiv) {
	       putNumber(beginMsdEstimatedDiv,msdEstimatedDiv,MSD_ESTIMATED_DIV_LEN,MSD_ESTIMATED_DIV_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdEstimatedDivCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdEstimatedDiv
	 */
   	protected  BigDecimal serializeMsdEstimatedDiv(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginMsdEstimatedDiv
		       ,15
		      );		 localMsdEstimatedDivCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_ESTIMATED_DIV_LEN,MSD_ESTIMATED_DIV_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdEstimatedDiv", beginMsdEstimatedDiv,MSD_ESTIMATED_DIV_LEN);
    	}
    }
    /**
	 *	refreshMsdEstimatedDiv is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdEstimatedDiv() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdEstimatedDiv
			            ,MSD_ESTIMATED_DIV_LEN
			            ,MSD_ESTIMATED_DIV_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdEstimatedDiv", beginMsdEstimatedDiv,MSD_ESTIMATED_DIV_LEN);
    }
   	}
     int localMsdStkProxyMtngDtCounter = -1;
     public boolean isMsdStkProxyMtngDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdStkProxyMtngDtCounter != sharedCounter;
         localMsdStkProxyMtngDtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdStkProxyMtngDt
	 *	@return msdStkProxyMtngDt
	 */
	public char[]  getMsdStkProxyMtngDtString() {
	     return getCharArray(beginMsdStkProxyMtngDt,MSD_STK_PROXY_MTNG_DT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdStkProxyMtngDtIsNumeric() {
	    return isNumeric(beginMsdStkProxyMtngDt
	                    ,beginMsdStkProxyMtngDt + MSD_STK_PROXY_MTNG_DT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_STK_PROXY_MTNG_DT_LEN = 8;
  	/**
	 * serializeMsdStkProxyMtngDt
	 */
	protected void serializeMsdStkProxyMtngDt(long msdStkProxyMtngDt) {
		 putNumber(beginMsdStkProxyMtngDt,msdStkProxyMtngDt,MSD_STK_PROXY_MTNG_DT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdStkProxyMtngDtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdStkProxyMtngDt
	 */
   	protected  long serializeMsdStkProxyMtngDt(char[] value) {
	    long  msdStkProxyMtngDt;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdStkProxyMtngDt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginMsdStkProxyMtngDt
		       ,8
		      );
		 localMsdStkProxyMtngDtCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdStkProxyMtngDt;
    }

   protected long checkMsdStkProxyMtngDtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdStkProxyMtngDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdStkProxyMtngDt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdStkProxyMtngDt
			                 ,MSD_STK_PROXY_MTNG_DT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdStkProxyMtngDt", beginMsdStkProxyMtngDt,MSD_STK_PROXY_MTNG_DT_LEN);
    }
   	}
     int localMsdStkProxyRecDtCounter = -1;
     public boolean isMsdStkProxyRecDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdStkProxyRecDtCounter != sharedCounter;
         localMsdStkProxyRecDtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdStkProxyRecDt
	 *	@return msdStkProxyRecDt
	 */
	public char[]  getMsdStkProxyRecDtString() {
	     return getCharArray(beginMsdStkProxyRecDt,MSD_STK_PROXY_REC_DT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdStkProxyRecDtIsNumeric() {
	    return isNumeric(beginMsdStkProxyRecDt
	                    ,beginMsdStkProxyRecDt + MSD_STK_PROXY_REC_DT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_STK_PROXY_REC_DT_LEN = 8;
  	/**
	 * serializeMsdStkProxyRecDt
	 */
	protected void serializeMsdStkProxyRecDt(long msdStkProxyRecDt) {
		 putNumber(beginMsdStkProxyRecDt,msdStkProxyRecDt,MSD_STK_PROXY_REC_DT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdStkProxyRecDtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdStkProxyRecDt
	 */
   	protected  long serializeMsdStkProxyRecDt(char[] value) {
	    long  msdStkProxyRecDt;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdStkProxyRecDt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginMsdStkProxyRecDt
		       ,8
		      );
		 localMsdStkProxyRecDtCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdStkProxyRecDt;
    }

   protected long checkMsdStkProxyRecDtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdStkProxyRecDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdStkProxyRecDt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdStkProxyRecDt
			                 ,MSD_STK_PROXY_REC_DT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdStkProxyRecDt", beginMsdStkProxyRecDt,MSD_STK_PROXY_REC_DT_LEN);
    }
   	}
     int localMsdPoisonPillIndCounter = -1;
     public boolean isMsdPoisonPillIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdPoisonPillIndCounter != sharedCounter;
         localMsdPoisonPillIndCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_POISON_PILL_IND_LEN = 1;
	/**
	 * 	serialize this MsdPoisonPillInd
	 */
   protected void serializeMsdPoisonPillInd(char[] msdPoisonPillInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdPoisonPillInd,0,getStringValue(),beginMsdPoisonPillInd,MSD_POISON_PILL_IND_LEN);
       localMsdPoisonPillIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdPoisonPillIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdPoisonPillInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdPoisonPillInd() {	 
   		return (substring(getStringValue(),beginMsdPoisonPillInd,beginMsdPoisonPillInd + MSD_POISON_PILL_IND_LEN));
   	}
     int localBdms01MeetingProxyDtCounter = -1;
     public boolean isBdms01MeetingProxyDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MeetingProxyDtCounter != sharedCounter;
         localBdms01MeetingProxyDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_MEETING_PROXY_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01MeetingProxyDt
	 */
   protected void serializeBdms01MeetingProxyDt(char[] bdms01MeetingProxyDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01MeetingProxyDt,0,getStringValue(),beginBdms01MeetingProxyDt,BDMS_01_MEETING_PROXY_DT_LEN);
       localBdms01MeetingProxyDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01MeetingProxyDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01MeetingProxyDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01MeetingProxyDt() {	 
   		return (substring(getStringValue(),beginBdms01MeetingProxyDt,beginBdms01MeetingProxyDt + BDMS_01_MEETING_PROXY_DT_LEN));
   	}
     int localBdms01RecordProxyDtCounter = -1;
     public boolean isBdms01RecordProxyDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RecordProxyDtCounter != sharedCounter;
         localBdms01RecordProxyDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_RECORD_PROXY_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01RecordProxyDt
	 */
   protected void serializeBdms01RecordProxyDt(char[] bdms01RecordProxyDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RecordProxyDt,0,getStringValue(),beginBdms01RecordProxyDt,BDMS_01_RECORD_PROXY_DT_LEN);
       localBdms01RecordProxyDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RecordProxyDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01RecordProxyDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RecordProxyDt() {	 
   		return (substring(getStringValue(),beginBdms01RecordProxyDt,beginBdms01RecordProxyDt + BDMS_01_RECORD_PROXY_DT_LEN));
   	}
     int localBdms01StkExpirationDtCounter = -1;
     public boolean isBdms01StkExpirationDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01StkExpirationDtCounter != sharedCounter;
         localBdms01StkExpirationDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_STK_EXPIRATION_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01StkExpirationDt
	 */
   protected void serializeBdms01StkExpirationDt(char[] bdms01StkExpirationDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01StkExpirationDt,0,getStringValue(),beginBdms01StkExpirationDt,BDMS_01_STK_EXPIRATION_DT_LEN);
       localBdms01StkExpirationDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01StkExpirationDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01StkExpirationDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01StkExpirationDt() {	 
   		return (substring(getStringValue(),beginBdms01StkExpirationDt,beginBdms01StkExpirationDt + BDMS_01_STK_EXPIRATION_DT_LEN));
   	}
     int localBdms01MasterLtdIndCounter = -1;
     public boolean isBdms01MasterLtdIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MasterLtdIndCounter != sharedCounter;
         localBdms01MasterLtdIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_MASTER_LTD_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01MasterLtdInd
	 */
   protected void serializeBdms01MasterLtdInd(char[] bdms01MasterLtdInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01MasterLtdInd,0,getStringValue(),beginBdms01MasterLtdInd,BDMS_01_MASTER_LTD_IND_LEN);
       localBdms01MasterLtdIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01MasterLtdIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01MasterLtdInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01MasterLtdInd() {	 
   		return (substring(getStringValue(),beginBdms01MasterLtdInd,beginBdms01MasterLtdInd + BDMS_01_MASTER_LTD_IND_LEN));
   	}
     int localMsdMlpCounter = -1;
     public boolean isMsdMlpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdMlpCounter != sharedCounter;
         localMsdMlpCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_MLP_LEN = 1;
	/**
	 * 	serialize this MsdMlp
	 */
   protected void serializeMsdMlp(char[] msdMlp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdMlp,0,getStringValue(),beginMsdMlp,MSD_MLP_LEN);
       localMsdMlpCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdMlpConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdMlp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdMlp() {	 
   		return (substring(getStringValue(),beginMsdMlp,beginMsdMlp + MSD_MLP_LEN));
   	}
     int localBdms01MmfIndCounter = -1;
     public boolean isBdms01MmfIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MmfIndCounter != sharedCounter;
         localBdms01MmfIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_MMF_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01MmfInd
	 */
   protected void serializeBdms01MmfInd(char[] bdms01MmfInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01MmfInd,0,getStringValue(),beginBdms01MmfInd,BDMS_01_MMF_IND_LEN);
       localBdms01MmfIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01MmfIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01MmfInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01MmfInd() {	 
   		return (substring(getStringValue(),beginBdms01MmfInd,beginBdms01MmfInd + BDMS_01_MMF_IND_LEN));
   	}
     int localBdms01OpenFundCdCounter = -1;
     public boolean isBdms01OpenFundCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OpenFundCdCounter != sharedCounter;
         localBdms01OpenFundCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OPEN_FUND_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01OpenFundCd
	 */
   protected void serializeBdms01OpenFundCd(char[] bdms01OpenFundCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OpenFundCd,0,getStringValue(),beginBdms01OpenFundCd,BDMS_01_OPEN_FUND_CD_LEN);
       localBdms01OpenFundCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OpenFundCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01OpenFundCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OpenFundCd() {	 
   		return (substring(getStringValue(),beginBdms01OpenFundCd,beginBdms01OpenFundCd + BDMS_01_OPEN_FUND_CD_LEN));
   	}
     int localBdms01LotTradeCdCounter = -1;
     public boolean isBdms01LotTradeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01LotTradeCdCounter != sharedCounter;
         localBdms01LotTradeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_LOT_TRADE_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01LotTradeCd
	 */
   protected void serializeBdms01LotTradeCd(char[] bdms01LotTradeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01LotTradeCd,0,getStringValue(),beginBdms01LotTradeCd,BDMS_01_LOT_TRADE_CD_LEN);
       localBdms01LotTradeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01LotTradeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01LotTradeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01LotTradeCd() {	 
   		return (substring(getStringValue(),beginBdms01LotTradeCd,beginBdms01LotTradeCd + BDMS_01_LOT_TRADE_CD_LEN));
   	}
     int localBdms01DvdndYldAmtCounter = -1;
     
     public boolean isBdms01DvdndYldAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01DvdndYldAmtCounter != sharedCounter;
         localBdms01DvdndYldAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01DvdndYldAmt
	 *	@return bdms01DvdndYldAmt
	 */
	public char[]  getBdms01DvdndYldAmtString() {
	    return getCharArray(beginBdms01DvdndYldAmt,BDMS_01_DVDND_YLD_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01DvdndYldAmtIsNumeric() {
		    return isNumeric(beginBdms01DvdndYldAmt
	                    ,beginBdms01DvdndYldAmt + BDMS_01_DVDND_YLD_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_DVDND_YLD_AMT_LEN = 15;
  protected  static final int BDMS_01_DVDND_YLD_AMT_SCALE = 7;

   protected BigDecimal checkBdms01DvdndYldAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,7/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeBdms01DvdndYldAmt
	 */
	protected void serializeBdms01DvdndYldAmt(BigDecimal bdms01DvdndYldAmt) {
	       putNumber(beginBdms01DvdndYldAmt,bdms01DvdndYldAmt,BDMS_01_DVDND_YLD_AMT_LEN,BDMS_01_DVDND_YLD_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01DvdndYldAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01DvdndYldAmt
	 */
   	protected  BigDecimal serializeBdms01DvdndYldAmt(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginBdms01DvdndYldAmt
		       ,15
		      );		 localBdms01DvdndYldAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_DVDND_YLD_AMT_LEN,BDMS_01_DVDND_YLD_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01DvdndYldAmt", beginBdms01DvdndYldAmt,BDMS_01_DVDND_YLD_AMT_LEN);
    	}
    }
    /**
	 *	refreshBdms01DvdndYldAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01DvdndYldAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01DvdndYldAmt
			            ,BDMS_01_DVDND_YLD_AMT_LEN
			            ,BDMS_01_DVDND_YLD_AMT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01DvdndYldAmt", beginBdms01DvdndYldAmt,BDMS_01_DVDND_YLD_AMT_LEN);
    }
   	}
     int localBdms01ExpirationAmtCounter = -1;
     
     public boolean isBdms01ExpirationAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ExpirationAmtCounter != sharedCounter;
         localBdms01ExpirationAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01ExpirationAmt
	 *	@return bdms01ExpirationAmt
	 */
	public char[]  getBdms01ExpirationAmtString() {
	    return getCharArray(beginBdms01ExpirationAmt,BDMS_01_EXPIRATION_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01ExpirationAmtIsNumeric() {
		    return isNumeric(beginBdms01ExpirationAmt
	                    ,beginBdms01ExpirationAmt + BDMS_01_EXPIRATION_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_EXPIRATION_AMT_LEN = 15;
  protected  static final int BDMS_01_EXPIRATION_AMT_SCALE = 7;

   protected BigDecimal checkBdms01ExpirationAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,7/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeBdms01ExpirationAmt
	 */
	protected void serializeBdms01ExpirationAmt(BigDecimal bdms01ExpirationAmt) {
	       putNumber(beginBdms01ExpirationAmt,bdms01ExpirationAmt,BDMS_01_EXPIRATION_AMT_LEN,BDMS_01_EXPIRATION_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01ExpirationAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01ExpirationAmt
	 */
   	protected  BigDecimal serializeBdms01ExpirationAmt(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginBdms01ExpirationAmt
		       ,15
		      );		 localBdms01ExpirationAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_EXPIRATION_AMT_LEN,BDMS_01_EXPIRATION_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01ExpirationAmt", beginBdms01ExpirationAmt,BDMS_01_EXPIRATION_AMT_LEN);
    	}
    }
    /**
	 *	refreshBdms01ExpirationAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01ExpirationAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01ExpirationAmt
			            ,BDMS_01_EXPIRATION_AMT_LEN
			            ,BDMS_01_EXPIRATION_AMT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01ExpirationAmt", beginBdms01ExpirationAmt,BDMS_01_EXPIRATION_AMT_LEN);
    }
   	}
     int localBdms01AdrIndCounter = -1;
     public boolean isBdms01AdrIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01AdrIndCounter != sharedCounter;
         localBdms01AdrIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_ADR_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01AdrInd
	 */
   protected void serializeBdms01AdrInd(char[] bdms01AdrInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01AdrInd,0,getStringValue(),beginBdms01AdrInd,BDMS_01_ADR_IND_LEN);
       localBdms01AdrIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01AdrIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01AdrInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01AdrInd() {	 
   		return (substring(getStringValue(),beginBdms01AdrInd,beginBdms01AdrInd + BDMS_01_ADR_IND_LEN));
   	}
     int localBdms01GdrIndCounter = -1;
     public boolean isBdms01GdrIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01GdrIndCounter != sharedCounter;
         localBdms01GdrIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_GDR_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01GdrInd
	 */
   protected void serializeBdms01GdrInd(char[] bdms01GdrInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01GdrInd,0,getStringValue(),beginBdms01GdrInd,BDMS_01_GDR_IND_LEN);
       localBdms01GdrIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01GdrIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01GdrInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01GdrInd() {	 
   		return (substring(getStringValue(),beginBdms01GdrInd,beginBdms01GdrInd + BDMS_01_GDR_IND_LEN));
   	}
     int localBdms01PsnplCdCounter = -1;
     public boolean isBdms01PsnplCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PsnplCdCounter != sharedCounter;
         localBdms01PsnplCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PSNPL_CD_LEN = 3;
	/**
	 * 	serialize this Bdms01PsnplCd
	 */
   protected void serializeBdms01PsnplCd(char[] bdms01PsnplCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PsnplCd,0,getStringValue(),beginBdms01PsnplCd,BDMS_01_PSNPL_CD_LEN);
       localBdms01PsnplCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PsnplCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshBdms01PsnplCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PsnplCd() {	 
   		return (substring(getStringValue(),beginBdms01PsnplCd,beginBdms01PsnplCd + BDMS_01_PSNPL_CD_LEN));
   	}
     int localBdms01PrfrdIndCounter = -1;
     public boolean isBdms01PrfrdIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PrfrdIndCounter != sharedCounter;
         localBdms01PrfrdIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PRFRD_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01PrfrdInd
	 */
   protected void serializeBdms01PrfrdInd(char[] bdms01PrfrdInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PrfrdInd,0,getStringValue(),beginBdms01PrfrdInd,BDMS_01_PRFRD_IND_LEN);
       localBdms01PrfrdIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PrfrdIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01PrfrdInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PrfrdInd() {	 
   		return (substring(getStringValue(),beginBdms01PrfrdInd,beginBdms01PrfrdInd + BDMS_01_PRFRD_IND_LEN));
   	}
     int localBdms01DivCumIndCounter = -1;
     public boolean isBdms01DivCumIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01DivCumIndCounter != sharedCounter;
         localBdms01DivCumIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_DIV_CUM_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01DivCumInd
	 */
   protected void serializeBdms01DivCumInd(char[] bdms01DivCumInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01DivCumInd,0,getStringValue(),beginBdms01DivCumInd,BDMS_01_DIV_CUM_IND_LEN);
       localBdms01DivCumIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01DivCumIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01DivCumInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01DivCumInd() {	 
   		return (substring(getStringValue(),beginBdms01DivCumInd,beginBdms01DivCumInd + BDMS_01_DIV_CUM_IND_LEN));
   	}
     int localBdms01FreqIncmDebtCdCounter = -1;
     public boolean isBdms01FreqIncmDebtCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01FreqIncmDebtCdCounter != sharedCounter;
         localBdms01FreqIncmDebtCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FREQ_INCM_DEBT_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01FreqIncmDebtCd
	 */
   protected void serializeBdms01FreqIncmDebtCd(char[] bdms01FreqIncmDebtCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01FreqIncmDebtCd,0,getStringValue(),beginBdms01FreqIncmDebtCd,BDMS_01_FREQ_INCM_DEBT_CD_LEN);
       localBdms01FreqIncmDebtCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01FreqIncmDebtCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01FreqIncmDebtCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01FreqIncmDebtCd() {	 
   		return (substring(getStringValue(),beginBdms01FreqIncmDebtCd,beginBdms01FreqIncmDebtCd + BDMS_01_FREQ_INCM_DEBT_CD_LEN));
   	}
     int localBdms01CallDtCounter = -1;
     public boolean isBdms01CallDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CallDtCounter != sharedCounter;
         localBdms01CallDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CALL_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01CallDt
	 */
   protected void serializeBdms01CallDt(char[] bdms01CallDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CallDt,0,getStringValue(),beginBdms01CallDt,BDMS_01_CALL_DT_LEN);
       localBdms01CallDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CallDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01CallDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CallDt() {	 
   		return (substring(getStringValue(),beginBdms01CallDt,beginBdms01CallDt + BDMS_01_CALL_DT_LEN));
   	}
     int localBdms01CallAmtCounter = -1;
     
     public boolean isBdms01CallAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CallAmtCounter != sharedCounter;
         localBdms01CallAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01CallAmt
	 *	@return bdms01CallAmt
	 */
	public char[]  getBdms01CallAmtString() {
	    return getCharArray(beginBdms01CallAmt,BDMS_01_CALL_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01CallAmtIsNumeric() {
		    return isNumeric(beginBdms01CallAmt
	                    ,beginBdms01CallAmt + BDMS_01_CALL_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_CALL_AMT_LEN = 15;
  protected  static final int BDMS_01_CALL_AMT_SCALE = 7;

   protected BigDecimal checkBdms01CallAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,7/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeBdms01CallAmt
	 */
	protected void serializeBdms01CallAmt(BigDecimal bdms01CallAmt) {
	       putNumber(beginBdms01CallAmt,bdms01CallAmt,BDMS_01_CALL_AMT_LEN,BDMS_01_CALL_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01CallAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01CallAmt
	 */
   	protected  BigDecimal serializeBdms01CallAmt(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginBdms01CallAmt
		       ,15
		      );		 localBdms01CallAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_CALL_AMT_LEN,BDMS_01_CALL_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01CallAmt", beginBdms01CallAmt,BDMS_01_CALL_AMT_LEN);
    	}
    }
    /**
	 *	refreshBdms01CallAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01CallAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01CallAmt
			            ,BDMS_01_CALL_AMT_LEN
			            ,BDMS_01_CALL_AMT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01CallAmt", beginBdms01CallAmt,BDMS_01_CALL_AMT_LEN);
    }
   	}
     int localBdms01DvdndAnnlAmtCounter = -1;
     
     public boolean isBdms01DvdndAnnlAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01DvdndAnnlAmtCounter != sharedCounter;
         localBdms01DvdndAnnlAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01DvdndAnnlAmt
	 *	@return bdms01DvdndAnnlAmt
	 */
	public char[]  getBdms01DvdndAnnlAmtString() {
	    return getCharArray(beginBdms01DvdndAnnlAmt,BDMS_01_DVDND_ANNL_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01DvdndAnnlAmtIsNumeric() {
		    return isNumeric(beginBdms01DvdndAnnlAmt
	                    ,beginBdms01DvdndAnnlAmt + BDMS_01_DVDND_ANNL_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_DVDND_ANNL_AMT_LEN = 15;
  protected  static final int BDMS_01_DVDND_ANNL_AMT_SCALE = 7;

   protected BigDecimal checkBdms01DvdndAnnlAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,7/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeBdms01DvdndAnnlAmt
	 */
	protected void serializeBdms01DvdndAnnlAmt(BigDecimal bdms01DvdndAnnlAmt) {
	       putNumber(beginBdms01DvdndAnnlAmt,bdms01DvdndAnnlAmt,BDMS_01_DVDND_ANNL_AMT_LEN,BDMS_01_DVDND_ANNL_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01DvdndAnnlAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01DvdndAnnlAmt
	 */
   	protected  BigDecimal serializeBdms01DvdndAnnlAmt(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginBdms01DvdndAnnlAmt
		       ,15
		      );		 localBdms01DvdndAnnlAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_DVDND_ANNL_AMT_LEN,BDMS_01_DVDND_ANNL_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01DvdndAnnlAmt", beginBdms01DvdndAnnlAmt,BDMS_01_DVDND_ANNL_AMT_LEN);
    	}
    }
    /**
	 *	refreshBdms01DvdndAnnlAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01DvdndAnnlAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01DvdndAnnlAmt
			            ,BDMS_01_DVDND_ANNL_AMT_LEN
			            ,BDMS_01_DVDND_ANNL_AMT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01DvdndAnnlAmt", beginBdms01DvdndAnnlAmt,BDMS_01_DVDND_ANNL_AMT_LEN);
    }
   	}
     int localBdms01DvdndAnnlPctCounter = -1;
     
     public boolean isBdms01DvdndAnnlPctModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01DvdndAnnlPctCounter != sharedCounter;
         localBdms01DvdndAnnlPctCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01DvdndAnnlPct
	 *	@return bdms01DvdndAnnlPct
	 */
	public char[]  getBdms01DvdndAnnlPctString() {
	    return getCharArray(beginBdms01DvdndAnnlPct,BDMS_01_DVDND_ANNL_PCT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01DvdndAnnlPctIsNumeric() {
		    return isNumeric(beginBdms01DvdndAnnlPct
	                    ,beginBdms01DvdndAnnlPct + BDMS_01_DVDND_ANNL_PCT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_DVDND_ANNL_PCT_LEN = 15;
  protected  static final int BDMS_01_DVDND_ANNL_PCT_SCALE = 7;

   protected BigDecimal checkBdms01DvdndAnnlPctMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,7/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeBdms01DvdndAnnlPct
	 */
	protected void serializeBdms01DvdndAnnlPct(BigDecimal bdms01DvdndAnnlPct) {
	       putNumber(beginBdms01DvdndAnnlPct,bdms01DvdndAnnlPct,BDMS_01_DVDND_ANNL_PCT_LEN,BDMS_01_DVDND_ANNL_PCT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01DvdndAnnlPctCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01DvdndAnnlPct
	 */
   	protected  BigDecimal serializeBdms01DvdndAnnlPct(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginBdms01DvdndAnnlPct
		       ,15
		      );		 localBdms01DvdndAnnlPctCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_DVDND_ANNL_PCT_LEN,BDMS_01_DVDND_ANNL_PCT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01DvdndAnnlPct", beginBdms01DvdndAnnlPct,BDMS_01_DVDND_ANNL_PCT_LEN);
    	}
    }
    /**
	 *	refreshBdms01DvdndAnnlPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01DvdndAnnlPct() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01DvdndAnnlPct
			            ,BDMS_01_DVDND_ANNL_PCT_LEN
			            ,BDMS_01_DVDND_ANNL_PCT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01DvdndAnnlPct", beginBdms01DvdndAnnlPct,BDMS_01_DVDND_ANNL_PCT_LEN);
    }
   	}
     int localBdms01PrtcpIndCounter = -1;
     public boolean isBdms01PrtcpIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PrtcpIndCounter != sharedCounter;
         localBdms01PrtcpIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PRTCP_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01PrtcpInd
	 */
   protected void serializeBdms01PrtcpInd(char[] bdms01PrtcpInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PrtcpInd,0,getStringValue(),beginBdms01PrtcpInd,BDMS_01_PRTCP_IND_LEN);
       localBdms01PrtcpIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PrtcpIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01PrtcpInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PrtcpInd() {	 
   		return (substring(getStringValue(),beginBdms01PrtcpInd,beginBdms01PrtcpInd + BDMS_01_PRTCP_IND_LEN));
   	}
     int localBdms01VoteRghtsIndCounter = -1;
     public boolean isBdms01VoteRghtsIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01VoteRghtsIndCounter != sharedCounter;
         localBdms01VoteRghtsIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_VOTE_RGHTS_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01VoteRghtsInd
	 */
   protected void serializeBdms01VoteRghtsInd(char[] bdms01VoteRghtsInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01VoteRghtsInd,0,getStringValue(),beginBdms01VoteRghtsInd,BDMS_01_VOTE_RGHTS_IND_LEN);
       localBdms01VoteRghtsIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01VoteRghtsIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01VoteRghtsInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01VoteRghtsInd() {	 
   		return (substring(getStringValue(),beginBdms01VoteRghtsInd,beginBdms01VoteRghtsInd + BDMS_01_VOTE_RGHTS_IND_LEN));
   	}
     int localBdms01ScrtyAdpRstrNbrCounter = -1;
     public boolean isBdms01ScrtyAdpRstrNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ScrtyAdpRstrNbrCounter != sharedCounter;
         localBdms01ScrtyAdpRstrNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SCRTY_ADP_RSTR_NBR_LEN = 7;
	/**
	 * 	serialize this Bdms01ScrtyAdpRstrNbr
	 */
   protected void serializeBdms01ScrtyAdpRstrNbr(char[] bdms01ScrtyAdpRstrNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ScrtyAdpRstrNbr,0,getStringValue(),beginBdms01ScrtyAdpRstrNbr,BDMS_01_SCRTY_ADP_RSTR_NBR_LEN);
       localBdms01ScrtyAdpRstrNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ScrtyAdpRstrNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshBdms01ScrtyAdpRstrNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ScrtyAdpRstrNbr() {	 
   		return (substring(getStringValue(),beginBdms01ScrtyAdpRstrNbr,beginBdms01ScrtyAdpRstrNbr + BDMS_01_SCRTY_ADP_RSTR_NBR_LEN));
   	}
     int localBdms01UtsCanadianCdCounter = -1;
     public boolean isBdms01UtsCanadianCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01UtsCanadianCdCounter != sharedCounter;
         localBdms01UtsCanadianCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_UTS_CANADIAN_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01UtsCanadianCd
	 */
   protected void serializeBdms01UtsCanadianCd(char[] bdms01UtsCanadianCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01UtsCanadianCd,0,getStringValue(),beginBdms01UtsCanadianCd,BDMS_01_UTS_CANADIAN_CD_LEN);
       localBdms01UtsCanadianCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01UtsCanadianCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01UtsCanadianCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01UtsCanadianCd() {	 
   		return (substring(getStringValue(),beginBdms01UtsCanadianCd,beginBdms01UtsCanadianCd + BDMS_01_UTS_CANADIAN_CD_LEN));
   	}
     int localBdms01WarrantsIndexIndCounter = -1;
     public boolean isBdms01WarrantsIndexIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01WarrantsIndexIndCounter != sharedCounter;
         localBdms01WarrantsIndexIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_WARRANTS_INDEX_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01WarrantsIndexInd
	 */
   protected void serializeBdms01WarrantsIndexInd(char[] bdms01WarrantsIndexInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01WarrantsIndexInd,0,getStringValue(),beginBdms01WarrantsIndexInd,BDMS_01_WARRANTS_INDEX_IND_LEN);
       localBdms01WarrantsIndexIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01WarrantsIndexIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01WarrantsIndexInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01WarrantsIndexInd() {	 
   		return (substring(getStringValue(),beginBdms01WarrantsIndexInd,beginBdms01WarrantsIndexInd + BDMS_01_WARRANTS_INDEX_IND_LEN));
   	}
     int localMsdMidsQidsCounter = -1;
     public boolean isMsdMidsQidsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdMidsQidsCounter != sharedCounter;
         localMsdMidsQidsCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_MIDS_QIDS_LEN = 1;
	/**
	 * 	serialize this MsdMidsQids
	 */
   protected void serializeMsdMidsQids(char[] msdMidsQids) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdMidsQids,0,getStringValue(),beginMsdMidsQids,MSD_MIDS_QIDS_LEN);
       localMsdMidsQidsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdMidsQidsConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdMidsQids is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdMidsQids() {	 
   		return (substring(getStringValue(),beginMsdMidsQids,beginMsdMidsQids + MSD_MIDS_QIDS_LEN));
   	}
     int localBdms01EtfIndCounter = -1;
     public boolean isBdms01EtfIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01EtfIndCounter != sharedCounter;
         localBdms01EtfIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_ETF_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01EtfInd
	 */
   protected void serializeBdms01EtfInd(char[] bdms01EtfInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01EtfInd,0,getStringValue(),beginBdms01EtfInd,BDMS_01_ETF_IND_LEN);
       localBdms01EtfIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01EtfIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01EtfInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01EtfInd() {	 
   		return (substring(getStringValue(),beginBdms01EtfInd,beginBdms01EtfInd + BDMS_01_ETF_IND_LEN));
   	}
     int localBdms01SmallCptlIndCounter = -1;
     public boolean isBdms01SmallCptlIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SmallCptlIndCounter != sharedCounter;
         localBdms01SmallCptlIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SMALL_CPTL_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01SmallCptlInd
	 */
   protected void serializeBdms01SmallCptlInd(char[] bdms01SmallCptlInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SmallCptlInd,0,getStringValue(),beginBdms01SmallCptlInd,BDMS_01_SMALL_CPTL_IND_LEN);
       localBdms01SmallCptlIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SmallCptlIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01SmallCptlInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SmallCptlInd() {	 
   		return (substring(getStringValue(),beginBdms01SmallCptlInd,beginBdms01SmallCptlInd + BDMS_01_SMALL_CPTL_IND_LEN));
   	}
     int localBdms01ExmptUptckIndCounter = -1;
     public boolean isBdms01ExmptUptckIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ExmptUptckIndCounter != sharedCounter;
         localBdms01ExmptUptckIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_EXMPT_UPTCK_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01ExmptUptckInd
	 */
   protected void serializeBdms01ExmptUptckInd(char[] bdms01ExmptUptckInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ExmptUptckInd,0,getStringValue(),beginBdms01ExmptUptckInd,BDMS_01_EXMPT_UPTCK_IND_LEN);
       localBdms01ExmptUptckIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ExmptUptckIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01ExmptUptckInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ExmptUptckInd() {	 
   		return (substring(getStringValue(),beginBdms01ExmptUptckInd,beginBdms01ExmptUptckInd + BDMS_01_EXMPT_UPTCK_IND_LEN));
   	}
     int localBdms01RegShoElgblIndCounter = -1;
     public boolean isBdms01RegShoElgblIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RegShoElgblIndCounter != sharedCounter;
         localBdms01RegShoElgblIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_REG_SHO_ELGBL_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01RegShoElgblInd
	 */
   protected void serializeBdms01RegShoElgblInd(char[] bdms01RegShoElgblInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RegShoElgblInd,0,getStringValue(),beginBdms01RegShoElgblInd,BDMS_01_REG_SHO_ELGBL_IND_LEN);
       localBdms01RegShoElgblIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RegShoElgblIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01RegShoElgblInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RegShoElgblInd() {	 
   		return (substring(getStringValue(),beginBdms01RegShoElgblInd,beginBdms01RegShoElgblInd + BDMS_01_REG_SHO_ELGBL_IND_LEN));
   	}
     int localBdms01RegShoElgblDtCounter = -1;
     public boolean isBdms01RegShoElgblDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RegShoElgblDtCounter != sharedCounter;
         localBdms01RegShoElgblDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_REG_SHO_ELGBL_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01RegShoElgblDt
	 */
   protected void serializeBdms01RegShoElgblDt(char[] bdms01RegShoElgblDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RegShoElgblDt,0,getStringValue(),beginBdms01RegShoElgblDt,BDMS_01_REG_SHO_ELGBL_DT_LEN);
       localBdms01RegShoElgblDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RegShoElgblDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01RegShoElgblDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RegShoElgblDt() {	 
   		return (substring(getStringValue(),beginBdms01RegShoElgblDt,beginBdms01RegShoElgblDt + BDMS_01_REG_SHO_ELGBL_DT_LEN));
   	}
     int localBdms01MfFamilyNbrCounter = -1;
     public boolean isBdms01MfFamilyNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MfFamilyNbrCounter != sharedCounter;
         localBdms01MfFamilyNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_MF_FAMILY_NBR_LEN = 4;
	/**
	 * 	serialize this Bdms01MfFamilyNbr
	 */
   protected void serializeBdms01MfFamilyNbr(char[] bdms01MfFamilyNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01MfFamilyNbr,0,getStringValue(),beginBdms01MfFamilyNbr,BDMS_01_MF_FAMILY_NBR_LEN);
       localBdms01MfFamilyNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01MfFamilyNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshBdms01MfFamilyNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01MfFamilyNbr() {	 
   		return (substring(getStringValue(),beginBdms01MfFamilyNbr,beginBdms01MfFamilyNbr + BDMS_01_MF_FAMILY_NBR_LEN));
   	}
     int localBdms01ShrClassCdCounter = -1;
     public boolean isBdms01ShrClassCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ShrClassCdCounter != sharedCounter;
         localBdms01ShrClassCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SHR_CLASS_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01ShrClassCd
	 */
   protected void serializeBdms01ShrClassCd(char[] bdms01ShrClassCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ShrClassCd,0,getStringValue(),beginBdms01ShrClassCd,BDMS_01_SHR_CLASS_CD_LEN);
       localBdms01ShrClassCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ShrClassCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01ShrClassCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ShrClassCd() {	 
   		return (substring(getStringValue(),beginBdms01ShrClassCd,beginBdms01ShrClassCd + BDMS_01_SHR_CLASS_CD_LEN));
   	}
     int localBdms01RegShoInelgblDtCounter = -1;
     public boolean isBdms01RegShoInelgblDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RegShoInelgblDtCounter != sharedCounter;
         localBdms01RegShoInelgblDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_REG_SHO_INELGBL_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01RegShoInelgblDt
	 */
   protected void serializeBdms01RegShoInelgblDt(char[] bdms01RegShoInelgblDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RegShoInelgblDt,0,getStringValue(),beginBdms01RegShoInelgblDt,BDMS_01_REG_SHO_INELGBL_DT_LEN);
       localBdms01RegShoInelgblDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RegShoInelgblDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01RegShoInelgblDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RegShoInelgblDt() {	 
   		return (substring(getStringValue(),beginBdms01RegShoInelgblDt,beginBdms01RegShoInelgblDt + BDMS_01_REG_SHO_INELGBL_DT_LEN));
   	}
     int localBdms01MfLoadTypeCdCounter = -1;
     public boolean isBdms01MfLoadTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MfLoadTypeCdCounter != sharedCounter;
         localBdms01MfLoadTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_MF_LOAD_TYPE_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01MfLoadTypeCd
	 */
   protected void serializeBdms01MfLoadTypeCd(char[] bdms01MfLoadTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01MfLoadTypeCd,0,getStringValue(),beginBdms01MfLoadTypeCd,BDMS_01_MF_LOAD_TYPE_CD_LEN);
       localBdms01MfLoadTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01MfLoadTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01MfLoadTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01MfLoadTypeCd() {	 
   		return (substring(getStringValue(),beginBdms01MfLoadTypeCd,beginBdms01MfLoadTypeCd + BDMS_01_MF_LOAD_TYPE_CD_LEN));
   	}
     int localBdms01EqiContraIndCounter = -1;
     public boolean isBdms01EqiContraIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01EqiContraIndCounter != sharedCounter;
         localBdms01EqiContraIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_EQI_CONTRA_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01EqiContraInd
	 */
   protected void serializeBdms01EqiContraInd(char[] bdms01EqiContraInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01EqiContraInd,0,getStringValue(),beginBdms01EqiContraInd,BDMS_01_EQI_CONTRA_IND_LEN);
       localBdms01EqiContraIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01EqiContraIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01EqiContraInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01EqiContraInd() {	 
   		return (substring(getStringValue(),beginBdms01EqiContraInd,beginBdms01EqiContraInd + BDMS_01_EQI_CONTRA_IND_LEN));
   	}
     int localBdms01OtcBlltnFeeIndCounter = -1;
     public boolean isBdms01OtcBlltnFeeIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OtcBlltnFeeIndCounter != sharedCounter;
         localBdms01OtcBlltnFeeIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OTC_BLLTN_FEE_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01OtcBlltnFeeInd
	 */
   protected void serializeBdms01OtcBlltnFeeInd(char[] bdms01OtcBlltnFeeInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OtcBlltnFeeInd,0,getStringValue(),beginBdms01OtcBlltnFeeInd,BDMS_01_OTC_BLLTN_FEE_IND_LEN);
       localBdms01OtcBlltnFeeIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OtcBlltnFeeIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01OtcBlltnFeeInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OtcBlltnFeeInd() {	 
   		return (substring(getStringValue(),beginBdms01OtcBlltnFeeInd,beginBdms01OtcBlltnFeeInd + BDMS_01_OTC_BLLTN_FEE_IND_LEN));
   	}




}
  
