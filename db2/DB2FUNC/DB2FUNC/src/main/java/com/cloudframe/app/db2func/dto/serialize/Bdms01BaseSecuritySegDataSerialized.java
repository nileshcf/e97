package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01BaseSecuritySegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Bdms01BaseSecuritySegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01BaseSecuritySegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_BASE_SECURITY_SEG_DATA_LENGTH = 135;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01BaseSecuritySegSqlcd;
            protected  int beginMsdIndustrialClass;
            protected  int beginMsdAidsCode;
            protected  int beginMsdStkDailyVolume;
            protected  int beginMsdDailyVolume;
            protected  int beginMsdTaxCode;
            protected  int beginMsdMarginCode;
            protected  int beginMsdRedenominationDate;
            protected  int beginMsdBndRemicInd;
            protected  int beginMsdBndRemicReitInd;
            protected  int beginMsdCurrencyCode;
            protected  int beginMsdCurrencyCode1;
            protected  int beginMsdIssueCurrencyPrev;
            protected  int beginMsdIncomeDistPoint;
            protected  int beginMsdSicCode;
            protected  int beginMsdProprietaryCode;
            protected  int beginBdms01SecurityParsInd;
            protected  int beginBdms01MarginableLstInd;
            protected  int beginBdms01MarginableOtcInd;
            protected  int beginBdms01TaxableCd;
            protected  int beginBdms01ConvInd;
            protected  int beginBdms01CnsInd;
            protected  int beginBdms01R144aInd;
            protected  int beginMsd144a;
            protected  int beginBdms01OptionInd;
            protected  int beginBdms01DllrUsTradeInd;
            protected  int beginBdms01BasSecCurrencyCd;
            protected  int beginBdms01ErclrInd;
            protected  int beginBdms01CedelInd;
            protected  int beginBdms01IssueDt;
            protected  int beginBdms01ReitInd;
            protected  int beginBdms01RemicInd;
            protected  int beginBdms01RoyaltyInd;
            protected  int beginBdms01IbmCd;
            protected  int beginBdms01CanadaProductCd;
            protected  int beginBdms01ForeignInd;
            protected  int beginBdms01IssueWhenInd;
            protected  int beginBdms01InvstDrctInd;
            protected  int beginBdms01CurrencyLegacyCd;
            protected  int beginBdms01RedenominationDt;
            protected  int beginBdms01OatsNasdaqCd;
            protected  int beginBdms01StepBondInd;
            protected  int beginBdms01PhlyBltmExchInd;
            protected  int beginBdms01ChgoExchInd;
            protected  int beginBdms01BstnExchInd;
            protected  int beginBdms01PcfcExchInd;
            protected  int beginBdms01MadoffInd;
            protected  int beginBdms01PinkSheetInd;
            protected  int beginBdms01NaicsCd;
            protected  int beginBdms01LlcInd;
            protected  int beginBdms01YieldBidPct;
            protected  int beginBdms01IntPyngInd;
            protected  int beginBdms01TleBypassInd;
            protected  int beginBdms01QlfdOvrdDvdCd;
            protected  int beginBdms01PutStrtDt;
            protected  int beginBdms01PutTmngCd;
            protected  int beginBdms01CallTmngCd;
            protected  int beginBdms01OtcBlltnStkInd;
	
	/**
	* Constructor for Bdms01BaseSecuritySegDataSerialized
	**/
    public Bdms01BaseSecuritySegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01BaseSecuritySegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01BaseSecuritySegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01BaseSecuritySegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,322); // serialize this field at offset 322 by default 
    }
    
	/**
	* sets parent for this Bdms01BaseSecuritySegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 322 by default
    }    
	/**
	* initializes the field in Bdms01BaseSecuritySegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_BASE_SECURITY_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01BaseSecuritySegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdIndustrialClass = getStartOffset() + 4;	// set offset for serialization
  
             beginMsdAidsCode = getStartOffset() + 6;	// set offset for serialization
  
             beginMsdStkDailyVolume = getStartOffset() + 7;	// set offset for serialization
  
             beginMsdDailyVolume = getStartOffset() + 7;	// set offset for serialization
  
             beginMsdTaxCode = getStartOffset() + 18;	// set offset for serialization
  
             beginMsdMarginCode = getStartOffset() + 19;	// set offset for serialization
  
             beginMsdRedenominationDate = getStartOffset() + 20;	// set offset for serialization
  
             beginMsdBndRemicInd = getStartOffset() + 28;	// set offset for serialization
  
             beginMsdBndRemicReitInd = getStartOffset() + 28;	// set offset for serialization
  
             beginMsdCurrencyCode = getStartOffset() + 29;	// set offset for serialization
  
             beginMsdCurrencyCode1 = getStartOffset() + 29;	// set offset for serialization
  
             beginMsdIssueCurrencyPrev = getStartOffset() + 32;	// set offset for serialization
  
             beginMsdIncomeDistPoint = getStartOffset() + 35;	// set offset for serialization
  
             beginMsdSicCode = getStartOffset() + 38;	// set offset for serialization
  
             beginMsdProprietaryCode = getStartOffset() + 42;	// set offset for serialization
  
             beginBdms01SecurityParsInd = getStartOffset() + 44;	// set offset for serialization
  
             beginBdms01MarginableLstInd = getStartOffset() + 45;	// set offset for serialization
  
             beginBdms01MarginableOtcInd = getStartOffset() + 46;	// set offset for serialization
  
             beginBdms01TaxableCd = getStartOffset() + 47;	// set offset for serialization
  
             beginBdms01ConvInd = getStartOffset() + 48;	// set offset for serialization
  
             beginBdms01CnsInd = getStartOffset() + 49;	// set offset for serialization
  
             beginBdms01R144aInd = getStartOffset() + 50;	// set offset for serialization
  
             beginMsd144a = getStartOffset() + 50;	// set offset for serialization
  
             beginBdms01OptionInd = getStartOffset() + 51;	// set offset for serialization
  
             beginBdms01DllrUsTradeInd = getStartOffset() + 52;	// set offset for serialization
  
             beginBdms01BasSecCurrencyCd = getStartOffset() + 53;	// set offset for serialization
  
             beginBdms01ErclrInd = getStartOffset() + 55;	// set offset for serialization
  
             beginBdms01CedelInd = getStartOffset() + 56;	// set offset for serialization
  
             beginBdms01IssueDt = getStartOffset() + 57;	// set offset for serialization
  
             beginBdms01ReitInd = getStartOffset() + 67;	// set offset for serialization
  
             beginBdms01RemicInd = getStartOffset() + 68;	// set offset for serialization
  
             beginBdms01RoyaltyInd = getStartOffset() + 69;	// set offset for serialization
  
             beginBdms01IbmCd = getStartOffset() + 70;	// set offset for serialization
  
             beginBdms01CanadaProductCd = getStartOffset() + 76;	// set offset for serialization
  
             beginBdms01ForeignInd = getStartOffset() + 79;	// set offset for serialization
  
             beginBdms01IssueWhenInd = getStartOffset() + 80;	// set offset for serialization
  
             beginBdms01InvstDrctInd = getStartOffset() + 81;	// set offset for serialization
  
             beginBdms01CurrencyLegacyCd = getStartOffset() + 82;	// set offset for serialization
  
             beginBdms01RedenominationDt = getStartOffset() + 84;	// set offset for serialization
  
             beginBdms01OatsNasdaqCd = getStartOffset() + 94;	// set offset for serialization
  
             beginBdms01StepBondInd = getStartOffset() + 95;	// set offset for serialization
  
             beginBdms01PhlyBltmExchInd = getStartOffset() + 96;	// set offset for serialization
  
             beginBdms01ChgoExchInd = getStartOffset() + 97;	// set offset for serialization
  
             beginBdms01BstnExchInd = getStartOffset() + 98;	// set offset for serialization
  
             beginBdms01PcfcExchInd = getStartOffset() + 99;	// set offset for serialization
  
             beginBdms01MadoffInd = getStartOffset() + 100;	// set offset for serialization
  
             beginBdms01PinkSheetInd = getStartOffset() + 101;	// set offset for serialization
  
             beginBdms01NaicsCd = getStartOffset() + 102;	// set offset for serialization
  
             beginBdms01LlcInd = getStartOffset() + 108;	// set offset for serialization
  
             beginBdms01YieldBidPct = getStartOffset() + 109;	// set offset for serialization
  
             beginBdms01IntPyngInd = getStartOffset() + 119;	// set offset for serialization
  
             beginBdms01TleBypassInd = getStartOffset() + 120;	// set offset for serialization
  
             beginBdms01QlfdOvrdDvdCd = getStartOffset() + 121;	// set offset for serialization
  
             beginBdms01PutStrtDt = getStartOffset() + 122;	// set offset for serialization
  
             beginBdms01PutTmngCd = getStartOffset() + 132;	// set offset for serialization
  
             beginBdms01CallTmngCd = getStartOffset() + 133;	// set offset for serialization
  
             beginBdms01OtcBlltnStkInd = getStartOffset() + 134;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBdms01BaseSecuritySegSqlcdCounter = -1;
     public boolean isBdms01BaseSecuritySegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01BaseSecuritySegSqlcdCounter != sharedCounter;
         localBdms01BaseSecuritySegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01BaseSecuritySegSqlcd
	 *	@return bdms01BaseSecuritySegSqlcd
	 */
	public char[]  getBdms01BaseSecuritySegSqlcdString() {
	     return getCharArray(beginBdms01BaseSecuritySegSqlcd,BDMS_01_BASE_SECURITY_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01BaseSecuritySegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01BaseSecuritySegSqlcd
	                    ,beginBdms01BaseSecuritySegSqlcd + BDMS_01_BASE_SECURITY_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_BASE_SECURITY_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01BaseSecuritySegSqlcd
	 */
	protected void serializeBdms01BaseSecuritySegSqlcd(int bdms01BaseSecuritySegSqlcd) {
		 putNumber(beginBdms01BaseSecuritySegSqlcd,bdms01BaseSecuritySegSqlcd,BDMS_01_BASE_SECURITY_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01BaseSecuritySegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01BaseSecuritySegSqlcd
	 */
   	protected  int serializeBdms01BaseSecuritySegSqlcd(char[] value) {
	    int  bdms01BaseSecuritySegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01BaseSecuritySegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01BaseSecuritySegSqlcd
		       ,4
		      );
		 localBdms01BaseSecuritySegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01BaseSecuritySegSqlcd;
    }

   protected int checkBdms01BaseSecuritySegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01BaseSecuritySegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01BaseSecuritySegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01BaseSecuritySegSqlcd
			                 ,BDMS_01_BASE_SECURITY_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01BaseSecuritySegSqlcd", beginBdms01BaseSecuritySegSqlcd,BDMS_01_BASE_SECURITY_SEG_SQLCD_LEN);
    }
   	}
     int localMsdIndustrialClassCounter = -1;
     public boolean isMsdIndustrialClassModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdIndustrialClassCounter != sharedCounter;
         localMsdIndustrialClassCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_INDUSTRIAL_CLASS_LEN = 2;
	/**
	 * 	serialize this MsdIndustrialClass
	 */
   protected void serializeMsdIndustrialClass(char[] msdIndustrialClass) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdIndustrialClass,0,getStringValue(),beginMsdIndustrialClass,MSD_INDUSTRIAL_CLASS_LEN);
       localMsdIndustrialClassCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdIndustrialClassConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMsdIndustrialClass is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdIndustrialClass() {	 
   		return (substring(getStringValue(),beginMsdIndustrialClass,beginMsdIndustrialClass + MSD_INDUSTRIAL_CLASS_LEN));
   	}
     int localMsdAidsCodeCounter = -1;
     public boolean isMsdAidsCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdAidsCodeCounter != sharedCounter;
         localMsdAidsCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_AIDS_CODE_LEN = 1;
	/**
	 * 	serialize this MsdAidsCode
	 */
   protected void serializeMsdAidsCode(char[] msdAidsCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdAidsCode,0,getStringValue(),beginMsdAidsCode,MSD_AIDS_CODE_LEN);
       localMsdAidsCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdAidsCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdAidsCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdAidsCode() {	 
   		return (substring(getStringValue(),beginMsdAidsCode,beginMsdAidsCode + MSD_AIDS_CODE_LEN));
   	}
     int localMsdStkDailyVolumeCounter = -1;
     public boolean isMsdStkDailyVolumeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdStkDailyVolumeCounter != sharedCounter;
         localMsdStkDailyVolumeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdStkDailyVolume
	 *	@return msdStkDailyVolume
	 */
	public char[]  getMsdStkDailyVolumeString() {
	     return getCharArray(beginMsdStkDailyVolume,MSD_STK_DAILY_VOLUME_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdStkDailyVolumeIsNumeric() {
	    return isNumeric(beginMsdStkDailyVolume
	                    ,beginMsdStkDailyVolume + MSD_STK_DAILY_VOLUME_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_STK_DAILY_VOLUME_LEN = 11;
  	/**
	 * serializeMsdStkDailyVolume
	 */
	protected void serializeMsdStkDailyVolume(long msdStkDailyVolume) {
		 putNumber(beginMsdStkDailyVolume,msdStkDailyVolume,MSD_STK_DAILY_VOLUME_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdStkDailyVolumeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdStkDailyVolume
	 */
   	protected  long serializeMsdStkDailyVolume(char[] value) {
	    long  msdStkDailyVolume;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdStkDailyVolume = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginMsdStkDailyVolume
		       ,11
		      );
		 localMsdStkDailyVolumeCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdStkDailyVolume;
    }

   protected long checkMsdStkDailyVolumeMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdStkDailyVolume is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdStkDailyVolume() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdStkDailyVolume
			                 ,MSD_STK_DAILY_VOLUME_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdStkDailyVolume", beginMsdStkDailyVolume,MSD_STK_DAILY_VOLUME_LEN);
    }
   	}
     int localMsdDailyVolumeCounter = -1;
     public boolean isMsdDailyVolumeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdDailyVolumeCounter != sharedCounter;
         localMsdDailyVolumeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdDailyVolume
	 *	@return msdDailyVolume
	 */
	public char[]  getMsdDailyVolumeString() {
	     return getCharArray(beginMsdDailyVolume,MSD_DAILY_VOLUME_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdDailyVolumeIsNumeric() {
	    return isNumeric(beginMsdDailyVolume
	                    ,beginMsdDailyVolume + MSD_DAILY_VOLUME_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_DAILY_VOLUME_LEN = 11;
  	/**
	 * serializeMsdDailyVolume
	 */
	protected void serializeMsdDailyVolume(long msdDailyVolume) {
		 putNumber(beginMsdDailyVolume,msdDailyVolume,MSD_DAILY_VOLUME_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdDailyVolumeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdDailyVolume
	 */
   	protected  long serializeMsdDailyVolume(char[] value) {
	    long  msdDailyVolume;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdDailyVolume = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginMsdDailyVolume
		       ,11
		      );
		 localMsdDailyVolumeCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdDailyVolume;
    }

   protected long checkMsdDailyVolumeMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdDailyVolume is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdDailyVolume() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdDailyVolume
			                 ,MSD_DAILY_VOLUME_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdDailyVolume", beginMsdDailyVolume,MSD_DAILY_VOLUME_LEN);
    }
   	}
     int localMsdTaxCodeCounter = -1;
     public boolean isMsdTaxCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdTaxCodeCounter != sharedCounter;
         localMsdTaxCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_TAX_CODE_LEN = 1;
	/**
	 * 	serialize this MsdTaxCode
	 */
   protected void serializeMsdTaxCode(char[] msdTaxCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdTaxCode,0,getStringValue(),beginMsdTaxCode,MSD_TAX_CODE_LEN);
       localMsdTaxCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdTaxCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdTaxCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdTaxCode() {	 
   		return (substring(getStringValue(),beginMsdTaxCode,beginMsdTaxCode + MSD_TAX_CODE_LEN));
   	}
     int localMsdMarginCodeCounter = -1;
     public boolean isMsdMarginCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdMarginCodeCounter != sharedCounter;
         localMsdMarginCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_MARGIN_CODE_LEN = 1;
	/**
	 * 	serialize this MsdMarginCode
	 */
   protected void serializeMsdMarginCode(char[] msdMarginCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdMarginCode,0,getStringValue(),beginMsdMarginCode,MSD_MARGIN_CODE_LEN);
       localMsdMarginCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdMarginCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdMarginCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdMarginCode() {	 
   		return (substring(getStringValue(),beginMsdMarginCode,beginMsdMarginCode + MSD_MARGIN_CODE_LEN));
   	}
     int localMsdRedenominationDateCounter = -1;
     public boolean isMsdRedenominationDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdRedenominationDateCounter != sharedCounter;
         localMsdRedenominationDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdRedenominationDate
	 *	@return msdRedenominationDate
	 */
	public char[]  getMsdRedenominationDateString() {
	     return getCharArray(beginMsdRedenominationDate,MSD_REDENOMINATION_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdRedenominationDateIsNumeric() {
	    return isNumeric(beginMsdRedenominationDate
	                    ,beginMsdRedenominationDate + MSD_REDENOMINATION_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_REDENOMINATION_DATE_LEN = 8;
  	/**
	 * serializeMsdRedenominationDate
	 */
	protected void serializeMsdRedenominationDate(long msdRedenominationDate) {
		 putNumber(beginMsdRedenominationDate,msdRedenominationDate,MSD_REDENOMINATION_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdRedenominationDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdRedenominationDate
	 */
   	protected  long serializeMsdRedenominationDate(char[] value) {
	    long  msdRedenominationDate;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdRedenominationDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginMsdRedenominationDate
		       ,8
		      );
		 localMsdRedenominationDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdRedenominationDate;
    }

   protected long checkMsdRedenominationDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdRedenominationDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdRedenominationDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdRedenominationDate
			                 ,MSD_REDENOMINATION_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdRedenominationDate", beginMsdRedenominationDate,MSD_REDENOMINATION_DATE_LEN);
    }
   	}
     int localMsdBndRemicIndCounter = -1;
     public boolean isMsdBndRemicIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBndRemicIndCounter != sharedCounter;
         localMsdBndRemicIndCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_BND_REMIC_IND_LEN = 1;
	/**
	 * 	serialize this MsdBndRemicInd
	 */
   protected void serializeMsdBndRemicInd(char[] msdBndRemicInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdBndRemicInd,0,getStringValue(),beginMsdBndRemicInd,MSD_BND_REMIC_IND_LEN);
       localMsdBndRemicIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdBndRemicIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdBndRemicInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdBndRemicInd() {	 
   		return (substring(getStringValue(),beginMsdBndRemicInd,beginMsdBndRemicInd + MSD_BND_REMIC_IND_LEN));
   	}
     int localMsdBndRemicReitIndCounter = -1;
     public boolean isMsdBndRemicReitIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBndRemicReitIndCounter != sharedCounter;
         localMsdBndRemicReitIndCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_BND_REMIC_REIT_IND_LEN = 1;
	/**
	 * 	serialize this MsdBndRemicReitInd
	 */
   protected void serializeMsdBndRemicReitInd(char[] msdBndRemicReitInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdBndRemicReitInd,0,getStringValue(),beginMsdBndRemicReitInd,MSD_BND_REMIC_REIT_IND_LEN);
       localMsdBndRemicReitIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdBndRemicReitIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdBndRemicReitInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdBndRemicReitInd() {	 
   		return (substring(getStringValue(),beginMsdBndRemicReitInd,beginMsdBndRemicReitInd + MSD_BND_REMIC_REIT_IND_LEN));
   	}
     int localMsdCurrencyCodeCounter = -1;
     public boolean isMsdCurrencyCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCurrencyCodeCounter != sharedCounter;
         localMsdCurrencyCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_CURRENCY_CODE_LEN = 3;
	/**
	 * 	serialize this MsdCurrencyCode
	 */
   protected void serializeMsdCurrencyCode(char[] msdCurrencyCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdCurrencyCode,0,getStringValue(),beginMsdCurrencyCode,MSD_CURRENCY_CODE_LEN);
       localMsdCurrencyCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdCurrencyCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshMsdCurrencyCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdCurrencyCode() {	 
   		return (substring(getStringValue(),beginMsdCurrencyCode,beginMsdCurrencyCode + MSD_CURRENCY_CODE_LEN));
   	}
     int localMsdCurrencyCode1Counter = -1;
     public boolean isMsdCurrencyCode1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCurrencyCode1Counter != sharedCounter;
         localMsdCurrencyCode1Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_CURRENCY_CODE_1_LEN = 3;
	/**
	 * 	serialize this MsdCurrencyCode1
	 */
   protected void serializeMsdCurrencyCode1(char[] msdCurrencyCode1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdCurrencyCode1,0,getStringValue(),beginMsdCurrencyCode1,MSD_CURRENCY_CODE_1_LEN);
       localMsdCurrencyCode1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdCurrencyCode1Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshMsdCurrencyCode1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdCurrencyCode1() {	 
   		return (substring(getStringValue(),beginMsdCurrencyCode1,beginMsdCurrencyCode1 + MSD_CURRENCY_CODE_1_LEN));
   	}
     int localMsdIssueCurrencyPrevCounter = -1;
     public boolean isMsdIssueCurrencyPrevModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdIssueCurrencyPrevCounter != sharedCounter;
         localMsdIssueCurrencyPrevCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_ISSUE_CURRENCY_PREV_LEN = 3;
	/**
	 * 	serialize this MsdIssueCurrencyPrev
	 */
   protected void serializeMsdIssueCurrencyPrev(char[] msdIssueCurrencyPrev) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdIssueCurrencyPrev,0,getStringValue(),beginMsdIssueCurrencyPrev,MSD_ISSUE_CURRENCY_PREV_LEN);
       localMsdIssueCurrencyPrevCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdIssueCurrencyPrevConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshMsdIssueCurrencyPrev is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdIssueCurrencyPrev() {	 
   		return (substring(getStringValue(),beginMsdIssueCurrencyPrev,beginMsdIssueCurrencyPrev + MSD_ISSUE_CURRENCY_PREV_LEN));
   	}
     int localMsdIncomeDistPointCounter = -1;
     public boolean isMsdIncomeDistPointModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdIncomeDistPointCounter != sharedCounter;
         localMsdIncomeDistPointCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdIncomeDistPoint
	 *	@return msdIncomeDistPoint
	 */
	public char[]  getMsdIncomeDistPointString() {
	     return getCharArray(beginMsdIncomeDistPoint,MSD_INCOME_DIST_POINT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdIncomeDistPointIsNumeric() {
	    return isNumeric(beginMsdIncomeDistPoint
	                    ,beginMsdIncomeDistPoint + MSD_INCOME_DIST_POINT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_INCOME_DIST_POINT_LEN = 3;
  	/**
	 * serializeMsdIncomeDistPoint
	 */
	protected void serializeMsdIncomeDistPoint(int msdIncomeDistPoint) {
		 putNumber(beginMsdIncomeDistPoint,msdIncomeDistPoint,MSD_INCOME_DIST_POINT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdIncomeDistPointCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdIncomeDistPoint
	 */
   	protected  int serializeMsdIncomeDistPoint(char[] value) {
	    int  msdIncomeDistPoint;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdIncomeDistPoint = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginMsdIncomeDistPoint
		       ,3
		      );
		 localMsdIncomeDistPointCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdIncomeDistPoint;
    }

   protected int checkMsdIncomeDistPointMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdIncomeDistPoint is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdIncomeDistPoint() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdIncomeDistPoint
			                 ,MSD_INCOME_DIST_POINT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdIncomeDistPoint", beginMsdIncomeDistPoint,MSD_INCOME_DIST_POINT_LEN);
    }
   	}
     int localMsdSicCodeCounter = -1;
     public boolean isMsdSicCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSicCodeCounter != sharedCounter;
         localMsdSicCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SIC_CODE_LEN = 4;
	/**
	 * 	serialize this MsdSicCode
	 */
   protected void serializeMsdSicCode(char[] msdSicCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSicCode,0,getStringValue(),beginMsdSicCode,MSD_SIC_CODE_LEN);
       localMsdSicCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSicCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMsdSicCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSicCode() {	 
   		return (substring(getStringValue(),beginMsdSicCode,beginMsdSicCode + MSD_SIC_CODE_LEN));
   	}
     int localMsdProprietaryCodeCounter = -1;
     public boolean isMsdProprietaryCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdProprietaryCodeCounter != sharedCounter;
         localMsdProprietaryCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_PROPRIETARY_CODE_LEN = 2;
	/**
	 * 	serialize this MsdProprietaryCode
	 */
   protected void serializeMsdProprietaryCode(char[] msdProprietaryCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdProprietaryCode,0,getStringValue(),beginMsdProprietaryCode,MSD_PROPRIETARY_CODE_LEN);
       localMsdProprietaryCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdProprietaryCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMsdProprietaryCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdProprietaryCode() {	 
   		return (substring(getStringValue(),beginMsdProprietaryCode,beginMsdProprietaryCode + MSD_PROPRIETARY_CODE_LEN));
   	}
     int localBdms01SecurityParsIndCounter = -1;
     public boolean isBdms01SecurityParsIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SecurityParsIndCounter != sharedCounter;
         localBdms01SecurityParsIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SECURITY_PARS_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01SecurityParsInd
	 */
   protected void serializeBdms01SecurityParsInd(char[] bdms01SecurityParsInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SecurityParsInd,0,getStringValue(),beginBdms01SecurityParsInd,BDMS_01_SECURITY_PARS_IND_LEN);
       localBdms01SecurityParsIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SecurityParsIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01SecurityParsInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SecurityParsInd() {	 
   		return (substring(getStringValue(),beginBdms01SecurityParsInd,beginBdms01SecurityParsInd + BDMS_01_SECURITY_PARS_IND_LEN));
   	}
     int localBdms01MarginableLstIndCounter = -1;
     public boolean isBdms01MarginableLstIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MarginableLstIndCounter != sharedCounter;
         localBdms01MarginableLstIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_MARGINABLE_LST_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01MarginableLstInd
	 */
   protected void serializeBdms01MarginableLstInd(char[] bdms01MarginableLstInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01MarginableLstInd,0,getStringValue(),beginBdms01MarginableLstInd,BDMS_01_MARGINABLE_LST_IND_LEN);
       localBdms01MarginableLstIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01MarginableLstIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01MarginableLstInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01MarginableLstInd() {	 
   		return (substring(getStringValue(),beginBdms01MarginableLstInd,beginBdms01MarginableLstInd + BDMS_01_MARGINABLE_LST_IND_LEN));
   	}
     int localBdms01MarginableOtcIndCounter = -1;
     public boolean isBdms01MarginableOtcIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MarginableOtcIndCounter != sharedCounter;
         localBdms01MarginableOtcIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_MARGINABLE_OTC_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01MarginableOtcInd
	 */
   protected void serializeBdms01MarginableOtcInd(char[] bdms01MarginableOtcInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01MarginableOtcInd,0,getStringValue(),beginBdms01MarginableOtcInd,BDMS_01_MARGINABLE_OTC_IND_LEN);
       localBdms01MarginableOtcIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01MarginableOtcIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01MarginableOtcInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01MarginableOtcInd() {	 
   		return (substring(getStringValue(),beginBdms01MarginableOtcInd,beginBdms01MarginableOtcInd + BDMS_01_MARGINABLE_OTC_IND_LEN));
   	}
     int localBdms01TaxableCdCounter = -1;
     public boolean isBdms01TaxableCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TaxableCdCounter != sharedCounter;
         localBdms01TaxableCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TAXABLE_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01TaxableCd
	 */
   protected void serializeBdms01TaxableCd(char[] bdms01TaxableCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TaxableCd,0,getStringValue(),beginBdms01TaxableCd,BDMS_01_TAXABLE_CD_LEN);
       localBdms01TaxableCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TaxableCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01TaxableCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TaxableCd() {	 
   		return (substring(getStringValue(),beginBdms01TaxableCd,beginBdms01TaxableCd + BDMS_01_TAXABLE_CD_LEN));
   	}
     int localBdms01ConvIndCounter = -1;
     public boolean isBdms01ConvIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ConvIndCounter != sharedCounter;
         localBdms01ConvIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CONV_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01ConvInd
	 */
   protected void serializeBdms01ConvInd(char[] bdms01ConvInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ConvInd,0,getStringValue(),beginBdms01ConvInd,BDMS_01_CONV_IND_LEN);
       localBdms01ConvIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ConvIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01ConvInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ConvInd() {	 
   		return (substring(getStringValue(),beginBdms01ConvInd,beginBdms01ConvInd + BDMS_01_CONV_IND_LEN));
   	}
     int localBdms01CnsIndCounter = -1;
     public boolean isBdms01CnsIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CnsIndCounter != sharedCounter;
         localBdms01CnsIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CNS_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01CnsInd
	 */
   protected void serializeBdms01CnsInd(char[] bdms01CnsInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CnsInd,0,getStringValue(),beginBdms01CnsInd,BDMS_01_CNS_IND_LEN);
       localBdms01CnsIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CnsIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01CnsInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CnsInd() {	 
   		return (substring(getStringValue(),beginBdms01CnsInd,beginBdms01CnsInd + BDMS_01_CNS_IND_LEN));
   	}
     int localBdms01R144aIndCounter = -1;
     public boolean isBdms01R144aIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01R144aIndCounter != sharedCounter;
         localBdms01R144aIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_R_144A_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01R144aInd
	 */
   protected void serializeBdms01R144aInd(char[] bdms01R144aInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01R144aInd,0,getStringValue(),beginBdms01R144aInd,BDMS_01_R_144A_IND_LEN);
       localBdms01R144aIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01R144aIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01R144aInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01R144aInd() {	 
   		return (substring(getStringValue(),beginBdms01R144aInd,beginBdms01R144aInd + BDMS_01_R_144A_IND_LEN));
   	}
     int localMsd144aCounter = -1;
     public boolean isMsd144aModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsd144aCounter != sharedCounter;
         localMsd144aCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_144A_LEN = 1;
	/**
	 * 	serialize this Msd144a
	 */
   protected void serializeMsd144a(char[] msd144a) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msd144a,0,getStringValue(),beginMsd144a,MSD_144A_LEN);
       localMsd144aCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsd144aConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsd144a is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsd144a() {	 
   		return (substring(getStringValue(),beginMsd144a,beginMsd144a + MSD_144A_LEN));
   	}
     int localBdms01OptionIndCounter = -1;
     public boolean isBdms01OptionIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OptionIndCounter != sharedCounter;
         localBdms01OptionIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OPTION_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01OptionInd
	 */
   protected void serializeBdms01OptionInd(char[] bdms01OptionInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OptionInd,0,getStringValue(),beginBdms01OptionInd,BDMS_01_OPTION_IND_LEN);
       localBdms01OptionIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OptionIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01OptionInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OptionInd() {	 
   		return (substring(getStringValue(),beginBdms01OptionInd,beginBdms01OptionInd + BDMS_01_OPTION_IND_LEN));
   	}
     int localBdms01DllrUsTradeIndCounter = -1;
     public boolean isBdms01DllrUsTradeIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01DllrUsTradeIndCounter != sharedCounter;
         localBdms01DllrUsTradeIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_DLLR_US_TRADE_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01DllrUsTradeInd
	 */
   protected void serializeBdms01DllrUsTradeInd(char[] bdms01DllrUsTradeInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01DllrUsTradeInd,0,getStringValue(),beginBdms01DllrUsTradeInd,BDMS_01_DLLR_US_TRADE_IND_LEN);
       localBdms01DllrUsTradeIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01DllrUsTradeIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01DllrUsTradeInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01DllrUsTradeInd() {	 
   		return (substring(getStringValue(),beginBdms01DllrUsTradeInd,beginBdms01DllrUsTradeInd + BDMS_01_DLLR_US_TRADE_IND_LEN));
   	}
     int localBdms01BasSecCurrencyCdCounter = -1;
     public boolean isBdms01BasSecCurrencyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01BasSecCurrencyCdCounter != sharedCounter;
         localBdms01BasSecCurrencyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_BAS_SEC_CURRENCY_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01BasSecCurrencyCd
	 */
   protected void serializeBdms01BasSecCurrencyCd(char[] bdms01BasSecCurrencyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01BasSecCurrencyCd,0,getStringValue(),beginBdms01BasSecCurrencyCd,BDMS_01_BAS_SEC_CURRENCY_CD_LEN);
       localBdms01BasSecCurrencyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01BasSecCurrencyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01BasSecCurrencyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01BasSecCurrencyCd() {	 
   		return (substring(getStringValue(),beginBdms01BasSecCurrencyCd,beginBdms01BasSecCurrencyCd + BDMS_01_BAS_SEC_CURRENCY_CD_LEN));
   	}
     int localBdms01ErclrIndCounter = -1;
     public boolean isBdms01ErclrIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ErclrIndCounter != sharedCounter;
         localBdms01ErclrIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_ERCLR_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01ErclrInd
	 */
   protected void serializeBdms01ErclrInd(char[] bdms01ErclrInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ErclrInd,0,getStringValue(),beginBdms01ErclrInd,BDMS_01_ERCLR_IND_LEN);
       localBdms01ErclrIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ErclrIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01ErclrInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ErclrInd() {	 
   		return (substring(getStringValue(),beginBdms01ErclrInd,beginBdms01ErclrInd + BDMS_01_ERCLR_IND_LEN));
   	}
     int localBdms01CedelIndCounter = -1;
     public boolean isBdms01CedelIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CedelIndCounter != sharedCounter;
         localBdms01CedelIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CEDEL_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01CedelInd
	 */
   protected void serializeBdms01CedelInd(char[] bdms01CedelInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CedelInd,0,getStringValue(),beginBdms01CedelInd,BDMS_01_CEDEL_IND_LEN);
       localBdms01CedelIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CedelIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01CedelInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CedelInd() {	 
   		return (substring(getStringValue(),beginBdms01CedelInd,beginBdms01CedelInd + BDMS_01_CEDEL_IND_LEN));
   	}
     int localBdms01IssueDtCounter = -1;
     public boolean isBdms01IssueDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01IssueDtCounter != sharedCounter;
         localBdms01IssueDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_ISSUE_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01IssueDt
	 */
   protected void serializeBdms01IssueDt(char[] bdms01IssueDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01IssueDt,0,getStringValue(),beginBdms01IssueDt,BDMS_01_ISSUE_DT_LEN);
       localBdms01IssueDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01IssueDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01IssueDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01IssueDt() {	 
   		return (substring(getStringValue(),beginBdms01IssueDt,beginBdms01IssueDt + BDMS_01_ISSUE_DT_LEN));
   	}
     int localBdms01ReitIndCounter = -1;
     public boolean isBdms01ReitIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ReitIndCounter != sharedCounter;
         localBdms01ReitIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_REIT_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01ReitInd
	 */
   protected void serializeBdms01ReitInd(char[] bdms01ReitInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ReitInd,0,getStringValue(),beginBdms01ReitInd,BDMS_01_REIT_IND_LEN);
       localBdms01ReitIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ReitIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01ReitInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ReitInd() {	 
   		return (substring(getStringValue(),beginBdms01ReitInd,beginBdms01ReitInd + BDMS_01_REIT_IND_LEN));
   	}
     int localBdms01RemicIndCounter = -1;
     public boolean isBdms01RemicIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RemicIndCounter != sharedCounter;
         localBdms01RemicIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_REMIC_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01RemicInd
	 */
   protected void serializeBdms01RemicInd(char[] bdms01RemicInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RemicInd,0,getStringValue(),beginBdms01RemicInd,BDMS_01_REMIC_IND_LEN);
       localBdms01RemicIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RemicIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01RemicInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RemicInd() {	 
   		return (substring(getStringValue(),beginBdms01RemicInd,beginBdms01RemicInd + BDMS_01_REMIC_IND_LEN));
   	}
     int localBdms01RoyaltyIndCounter = -1;
     public boolean isBdms01RoyaltyIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RoyaltyIndCounter != sharedCounter;
         localBdms01RoyaltyIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_ROYALTY_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01RoyaltyInd
	 */
   protected void serializeBdms01RoyaltyInd(char[] bdms01RoyaltyInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RoyaltyInd,0,getStringValue(),beginBdms01RoyaltyInd,BDMS_01_ROYALTY_IND_LEN);
       localBdms01RoyaltyIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RoyaltyIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01RoyaltyInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RoyaltyInd() {	 
   		return (substring(getStringValue(),beginBdms01RoyaltyInd,beginBdms01RoyaltyInd + BDMS_01_ROYALTY_IND_LEN));
   	}
     int localBdms01IbmCdCounter = -1;
     public boolean isBdms01IbmCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01IbmCdCounter != sharedCounter;
         localBdms01IbmCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_IBM_CD_LEN = 6;
	/**
	 * 	serialize this Bdms01IbmCd
	 */
   protected void serializeBdms01IbmCd(char[] bdms01IbmCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01IbmCd,0,getStringValue(),beginBdms01IbmCd,BDMS_01_IBM_CD_LEN);
       localBdms01IbmCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01IbmCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshBdms01IbmCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01IbmCd() {	 
   		return (substring(getStringValue(),beginBdms01IbmCd,beginBdms01IbmCd + BDMS_01_IBM_CD_LEN));
   	}
     int localBdms01CanadaProductCdCounter = -1;
     public boolean isBdms01CanadaProductCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CanadaProductCdCounter != sharedCounter;
         localBdms01CanadaProductCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CANADA_PRODUCT_CD_LEN = 3;
	/**
	 * 	serialize this Bdms01CanadaProductCd
	 */
   protected void serializeBdms01CanadaProductCd(char[] bdms01CanadaProductCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CanadaProductCd,0,getStringValue(),beginBdms01CanadaProductCd,BDMS_01_CANADA_PRODUCT_CD_LEN);
       localBdms01CanadaProductCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CanadaProductCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshBdms01CanadaProductCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CanadaProductCd() {	 
   		return (substring(getStringValue(),beginBdms01CanadaProductCd,beginBdms01CanadaProductCd + BDMS_01_CANADA_PRODUCT_CD_LEN));
   	}
     int localBdms01ForeignIndCounter = -1;
     public boolean isBdms01ForeignIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ForeignIndCounter != sharedCounter;
         localBdms01ForeignIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FOREIGN_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01ForeignInd
	 */
   protected void serializeBdms01ForeignInd(char[] bdms01ForeignInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ForeignInd,0,getStringValue(),beginBdms01ForeignInd,BDMS_01_FOREIGN_IND_LEN);
       localBdms01ForeignIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ForeignIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01ForeignInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ForeignInd() {	 
   		return (substring(getStringValue(),beginBdms01ForeignInd,beginBdms01ForeignInd + BDMS_01_FOREIGN_IND_LEN));
   	}
     int localBdms01IssueWhenIndCounter = -1;
     public boolean isBdms01IssueWhenIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01IssueWhenIndCounter != sharedCounter;
         localBdms01IssueWhenIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_ISSUE_WHEN_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01IssueWhenInd
	 */
   protected void serializeBdms01IssueWhenInd(char[] bdms01IssueWhenInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01IssueWhenInd,0,getStringValue(),beginBdms01IssueWhenInd,BDMS_01_ISSUE_WHEN_IND_LEN);
       localBdms01IssueWhenIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01IssueWhenIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01IssueWhenInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01IssueWhenInd() {	 
   		return (substring(getStringValue(),beginBdms01IssueWhenInd,beginBdms01IssueWhenInd + BDMS_01_ISSUE_WHEN_IND_LEN));
   	}
     int localBdms01InvstDrctIndCounter = -1;
     public boolean isBdms01InvstDrctIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01InvstDrctIndCounter != sharedCounter;
         localBdms01InvstDrctIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_INVST_DRCT_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01InvstDrctInd
	 */
   protected void serializeBdms01InvstDrctInd(char[] bdms01InvstDrctInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01InvstDrctInd,0,getStringValue(),beginBdms01InvstDrctInd,BDMS_01_INVST_DRCT_IND_LEN);
       localBdms01InvstDrctIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01InvstDrctIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01InvstDrctInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01InvstDrctInd() {	 
   		return (substring(getStringValue(),beginBdms01InvstDrctInd,beginBdms01InvstDrctInd + BDMS_01_INVST_DRCT_IND_LEN));
   	}
     int localBdms01CurrencyLegacyCdCounter = -1;
     public boolean isBdms01CurrencyLegacyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CurrencyLegacyCdCounter != sharedCounter;
         localBdms01CurrencyLegacyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CURRENCY_LEGACY_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01CurrencyLegacyCd
	 */
   protected void serializeBdms01CurrencyLegacyCd(char[] bdms01CurrencyLegacyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CurrencyLegacyCd,0,getStringValue(),beginBdms01CurrencyLegacyCd,BDMS_01_CURRENCY_LEGACY_CD_LEN);
       localBdms01CurrencyLegacyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CurrencyLegacyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01CurrencyLegacyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CurrencyLegacyCd() {	 
   		return (substring(getStringValue(),beginBdms01CurrencyLegacyCd,beginBdms01CurrencyLegacyCd + BDMS_01_CURRENCY_LEGACY_CD_LEN));
   	}
     int localBdms01RedenominationDtCounter = -1;
     public boolean isBdms01RedenominationDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RedenominationDtCounter != sharedCounter;
         localBdms01RedenominationDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_REDENOMINATION_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01RedenominationDt
	 */
   protected void serializeBdms01RedenominationDt(char[] bdms01RedenominationDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RedenominationDt,0,getStringValue(),beginBdms01RedenominationDt,BDMS_01_REDENOMINATION_DT_LEN);
       localBdms01RedenominationDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RedenominationDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01RedenominationDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RedenominationDt() {	 
   		return (substring(getStringValue(),beginBdms01RedenominationDt,beginBdms01RedenominationDt + BDMS_01_REDENOMINATION_DT_LEN));
   	}
     int localBdms01OatsNasdaqCdCounter = -1;
     public boolean isBdms01OatsNasdaqCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OatsNasdaqCdCounter != sharedCounter;
         localBdms01OatsNasdaqCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OATS_NASDAQ_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01OatsNasdaqCd
	 */
   protected void serializeBdms01OatsNasdaqCd(char[] bdms01OatsNasdaqCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OatsNasdaqCd,0,getStringValue(),beginBdms01OatsNasdaqCd,BDMS_01_OATS_NASDAQ_CD_LEN);
       localBdms01OatsNasdaqCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OatsNasdaqCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01OatsNasdaqCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OatsNasdaqCd() {	 
   		return (substring(getStringValue(),beginBdms01OatsNasdaqCd,beginBdms01OatsNasdaqCd + BDMS_01_OATS_NASDAQ_CD_LEN));
   	}
     int localBdms01StepBondIndCounter = -1;
     public boolean isBdms01StepBondIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01StepBondIndCounter != sharedCounter;
         localBdms01StepBondIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_STEP_BOND_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01StepBondInd
	 */
   protected void serializeBdms01StepBondInd(char[] bdms01StepBondInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01StepBondInd,0,getStringValue(),beginBdms01StepBondInd,BDMS_01_STEP_BOND_IND_LEN);
       localBdms01StepBondIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01StepBondIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01StepBondInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01StepBondInd() {	 
   		return (substring(getStringValue(),beginBdms01StepBondInd,beginBdms01StepBondInd + BDMS_01_STEP_BOND_IND_LEN));
   	}
     int localBdms01PhlyBltmExchIndCounter = -1;
     public boolean isBdms01PhlyBltmExchIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PhlyBltmExchIndCounter != sharedCounter;
         localBdms01PhlyBltmExchIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PHLY_BLTM_EXCH_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01PhlyBltmExchInd
	 */
   protected void serializeBdms01PhlyBltmExchInd(char[] bdms01PhlyBltmExchInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PhlyBltmExchInd,0,getStringValue(),beginBdms01PhlyBltmExchInd,BDMS_01_PHLY_BLTM_EXCH_IND_LEN);
       localBdms01PhlyBltmExchIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PhlyBltmExchIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01PhlyBltmExchInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PhlyBltmExchInd() {	 
   		return (substring(getStringValue(),beginBdms01PhlyBltmExchInd,beginBdms01PhlyBltmExchInd + BDMS_01_PHLY_BLTM_EXCH_IND_LEN));
   	}
     int localBdms01ChgoExchIndCounter = -1;
     public boolean isBdms01ChgoExchIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ChgoExchIndCounter != sharedCounter;
         localBdms01ChgoExchIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CHGO_EXCH_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01ChgoExchInd
	 */
   protected void serializeBdms01ChgoExchInd(char[] bdms01ChgoExchInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ChgoExchInd,0,getStringValue(),beginBdms01ChgoExchInd,BDMS_01_CHGO_EXCH_IND_LEN);
       localBdms01ChgoExchIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ChgoExchIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01ChgoExchInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ChgoExchInd() {	 
   		return (substring(getStringValue(),beginBdms01ChgoExchInd,beginBdms01ChgoExchInd + BDMS_01_CHGO_EXCH_IND_LEN));
   	}
     int localBdms01BstnExchIndCounter = -1;
     public boolean isBdms01BstnExchIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01BstnExchIndCounter != sharedCounter;
         localBdms01BstnExchIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_BSTN_EXCH_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01BstnExchInd
	 */
   protected void serializeBdms01BstnExchInd(char[] bdms01BstnExchInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01BstnExchInd,0,getStringValue(),beginBdms01BstnExchInd,BDMS_01_BSTN_EXCH_IND_LEN);
       localBdms01BstnExchIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01BstnExchIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01BstnExchInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01BstnExchInd() {	 
   		return (substring(getStringValue(),beginBdms01BstnExchInd,beginBdms01BstnExchInd + BDMS_01_BSTN_EXCH_IND_LEN));
   	}
     int localBdms01PcfcExchIndCounter = -1;
     public boolean isBdms01PcfcExchIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PcfcExchIndCounter != sharedCounter;
         localBdms01PcfcExchIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PCFC_EXCH_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01PcfcExchInd
	 */
   protected void serializeBdms01PcfcExchInd(char[] bdms01PcfcExchInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PcfcExchInd,0,getStringValue(),beginBdms01PcfcExchInd,BDMS_01_PCFC_EXCH_IND_LEN);
       localBdms01PcfcExchIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PcfcExchIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01PcfcExchInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PcfcExchInd() {	 
   		return (substring(getStringValue(),beginBdms01PcfcExchInd,beginBdms01PcfcExchInd + BDMS_01_PCFC_EXCH_IND_LEN));
   	}
     int localBdms01MadoffIndCounter = -1;
     public boolean isBdms01MadoffIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MadoffIndCounter != sharedCounter;
         localBdms01MadoffIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_MADOFF_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01MadoffInd
	 */
   protected void serializeBdms01MadoffInd(char[] bdms01MadoffInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01MadoffInd,0,getStringValue(),beginBdms01MadoffInd,BDMS_01_MADOFF_IND_LEN);
       localBdms01MadoffIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01MadoffIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01MadoffInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01MadoffInd() {	 
   		return (substring(getStringValue(),beginBdms01MadoffInd,beginBdms01MadoffInd + BDMS_01_MADOFF_IND_LEN));
   	}
     int localBdms01PinkSheetIndCounter = -1;
     public boolean isBdms01PinkSheetIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PinkSheetIndCounter != sharedCounter;
         localBdms01PinkSheetIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PINK_SHEET_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01PinkSheetInd
	 */
   protected void serializeBdms01PinkSheetInd(char[] bdms01PinkSheetInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PinkSheetInd,0,getStringValue(),beginBdms01PinkSheetInd,BDMS_01_PINK_SHEET_IND_LEN);
       localBdms01PinkSheetIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PinkSheetIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01PinkSheetInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PinkSheetInd() {	 
   		return (substring(getStringValue(),beginBdms01PinkSheetInd,beginBdms01PinkSheetInd + BDMS_01_PINK_SHEET_IND_LEN));
   	}
     int localBdms01NaicsCdCounter = -1;
     public boolean isBdms01NaicsCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01NaicsCdCounter != sharedCounter;
         localBdms01NaicsCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_NAICS_CD_LEN = 6;
	/**
	 * 	serialize this Bdms01NaicsCd
	 */
   protected void serializeBdms01NaicsCd(char[] bdms01NaicsCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01NaicsCd,0,getStringValue(),beginBdms01NaicsCd,BDMS_01_NAICS_CD_LEN);
       localBdms01NaicsCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01NaicsCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshBdms01NaicsCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01NaicsCd() {	 
   		return (substring(getStringValue(),beginBdms01NaicsCd,beginBdms01NaicsCd + BDMS_01_NAICS_CD_LEN));
   	}
     int localBdms01LlcIndCounter = -1;
     public boolean isBdms01LlcIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01LlcIndCounter != sharedCounter;
         localBdms01LlcIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_LLC_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01LlcInd
	 */
   protected void serializeBdms01LlcInd(char[] bdms01LlcInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01LlcInd,0,getStringValue(),beginBdms01LlcInd,BDMS_01_LLC_IND_LEN);
       localBdms01LlcIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01LlcIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01LlcInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01LlcInd() {	 
   		return (substring(getStringValue(),beginBdms01LlcInd,beginBdms01LlcInd + BDMS_01_LLC_IND_LEN));
   	}
     int localBdms01YieldBidPctCounter = -1;
     
     public boolean isBdms01YieldBidPctModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01YieldBidPctCounter != sharedCounter;
         localBdms01YieldBidPctCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01YieldBidPct
	 *	@return bdms01YieldBidPct
	 */
	public char[]  getBdms01YieldBidPctString() {
	    return getCharArray(beginBdms01YieldBidPct,BDMS_01_YIELD_BID_PCT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01YieldBidPctIsNumeric() {
		    return isNumeric(beginBdms01YieldBidPct
	                    ,beginBdms01YieldBidPct + BDMS_01_YIELD_BID_PCT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_YIELD_BID_PCT_LEN = 10;
  protected  static final int BDMS_01_YIELD_BID_PCT_SCALE = 5;

   protected BigDecimal checkBdms01YieldBidPctMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,5/*scale*/,10/*precision*/);
   }

  	/**
	 * serializeBdms01YieldBidPct
	 */
	protected void serializeBdms01YieldBidPct(BigDecimal bdms01YieldBidPct) {
	       putNumber(beginBdms01YieldBidPct,bdms01YieldBidPct,BDMS_01_YIELD_BID_PCT_LEN,BDMS_01_YIELD_BID_PCT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01YieldBidPctCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01YieldBidPct
	 */
   	protected  BigDecimal serializeBdms01YieldBidPct(char[] value) throws CFException {
        if (value.length < 10) value = pad(10, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginBdms01YieldBidPct
		       ,10
		      );		 localBdms01YieldBidPctCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_YIELD_BID_PCT_LEN,BDMS_01_YIELD_BID_PCT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01YieldBidPct", beginBdms01YieldBidPct,BDMS_01_YIELD_BID_PCT_LEN);
    	}
    }
    /**
	 *	refreshBdms01YieldBidPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01YieldBidPct() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01YieldBidPct
			            ,BDMS_01_YIELD_BID_PCT_LEN
			            ,BDMS_01_YIELD_BID_PCT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01YieldBidPct", beginBdms01YieldBidPct,BDMS_01_YIELD_BID_PCT_LEN);
    }
   	}
     int localBdms01IntPyngIndCounter = -1;
     public boolean isBdms01IntPyngIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01IntPyngIndCounter != sharedCounter;
         localBdms01IntPyngIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_INT_PYNG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01IntPyngInd
	 */
   protected void serializeBdms01IntPyngInd(char[] bdms01IntPyngInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01IntPyngInd,0,getStringValue(),beginBdms01IntPyngInd,BDMS_01_INT_PYNG_IND_LEN);
       localBdms01IntPyngIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01IntPyngIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01IntPyngInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01IntPyngInd() {	 
   		return (substring(getStringValue(),beginBdms01IntPyngInd,beginBdms01IntPyngInd + BDMS_01_INT_PYNG_IND_LEN));
   	}
     int localBdms01TleBypassIndCounter = -1;
     public boolean isBdms01TleBypassIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TleBypassIndCounter != sharedCounter;
         localBdms01TleBypassIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TLE_BYPASS_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01TleBypassInd
	 */
   protected void serializeBdms01TleBypassInd(char[] bdms01TleBypassInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TleBypassInd,0,getStringValue(),beginBdms01TleBypassInd,BDMS_01_TLE_BYPASS_IND_LEN);
       localBdms01TleBypassIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TleBypassIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01TleBypassInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TleBypassInd() {	 
   		return (substring(getStringValue(),beginBdms01TleBypassInd,beginBdms01TleBypassInd + BDMS_01_TLE_BYPASS_IND_LEN));
   	}
     int localBdms01QlfdOvrdDvdCdCounter = -1;
     public boolean isBdms01QlfdOvrdDvdCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01QlfdOvrdDvdCdCounter != sharedCounter;
         localBdms01QlfdOvrdDvdCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_QLFD_OVRD_DVD_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01QlfdOvrdDvdCd
	 */
   protected void serializeBdms01QlfdOvrdDvdCd(char[] bdms01QlfdOvrdDvdCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01QlfdOvrdDvdCd,0,getStringValue(),beginBdms01QlfdOvrdDvdCd,BDMS_01_QLFD_OVRD_DVD_CD_LEN);
       localBdms01QlfdOvrdDvdCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01QlfdOvrdDvdCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01QlfdOvrdDvdCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01QlfdOvrdDvdCd() {	 
   		return (substring(getStringValue(),beginBdms01QlfdOvrdDvdCd,beginBdms01QlfdOvrdDvdCd + BDMS_01_QLFD_OVRD_DVD_CD_LEN));
   	}
     int localBdms01PutStrtDtCounter = -1;
     public boolean isBdms01PutStrtDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PutStrtDtCounter != sharedCounter;
         localBdms01PutStrtDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PUT_STRT_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01PutStrtDt
	 */
   protected void serializeBdms01PutStrtDt(char[] bdms01PutStrtDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PutStrtDt,0,getStringValue(),beginBdms01PutStrtDt,BDMS_01_PUT_STRT_DT_LEN);
       localBdms01PutStrtDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PutStrtDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01PutStrtDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PutStrtDt() {	 
   		return (substring(getStringValue(),beginBdms01PutStrtDt,beginBdms01PutStrtDt + BDMS_01_PUT_STRT_DT_LEN));
   	}
     int localBdms01PutTmngCdCounter = -1;
     public boolean isBdms01PutTmngCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PutTmngCdCounter != sharedCounter;
         localBdms01PutTmngCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PUT_TMNG_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01PutTmngCd
	 */
   protected void serializeBdms01PutTmngCd(char[] bdms01PutTmngCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PutTmngCd,0,getStringValue(),beginBdms01PutTmngCd,BDMS_01_PUT_TMNG_CD_LEN);
       localBdms01PutTmngCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PutTmngCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01PutTmngCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PutTmngCd() {	 
   		return (substring(getStringValue(),beginBdms01PutTmngCd,beginBdms01PutTmngCd + BDMS_01_PUT_TMNG_CD_LEN));
   	}
     int localBdms01CallTmngCdCounter = -1;
     public boolean isBdms01CallTmngCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CallTmngCdCounter != sharedCounter;
         localBdms01CallTmngCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CALL_TMNG_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01CallTmngCd
	 */
   protected void serializeBdms01CallTmngCd(char[] bdms01CallTmngCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CallTmngCd,0,getStringValue(),beginBdms01CallTmngCd,BDMS_01_CALL_TMNG_CD_LEN);
       localBdms01CallTmngCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CallTmngCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01CallTmngCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CallTmngCd() {	 
   		return (substring(getStringValue(),beginBdms01CallTmngCd,beginBdms01CallTmngCd + BDMS_01_CALL_TMNG_CD_LEN));
   	}
     int localBdms01OtcBlltnStkIndCounter = -1;
     public boolean isBdms01OtcBlltnStkIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OtcBlltnStkIndCounter != sharedCounter;
         localBdms01OtcBlltnStkIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OTC_BLLTN_STK_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01OtcBlltnStkInd
	 */
   protected void serializeBdms01OtcBlltnStkInd(char[] bdms01OtcBlltnStkInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OtcBlltnStkInd,0,getStringValue(),beginBdms01OtcBlltnStkInd,BDMS_01_OTC_BLLTN_STK_IND_LEN);
       localBdms01OtcBlltnStkIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OtcBlltnStkIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01OtcBlltnStkInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OtcBlltnStkInd() {	 
   		return (substring(getStringValue(),beginBdms01OtcBlltnStkInd,beginBdms01OtcBlltnStkInd + BDMS_01_OTC_BLLTN_STK_IND_LEN));
   	}




}
  
