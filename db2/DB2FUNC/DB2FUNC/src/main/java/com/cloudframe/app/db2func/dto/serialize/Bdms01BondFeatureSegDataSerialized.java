package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01BondFeatureSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Bdms01BondFeatureSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01BondFeatureSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_BOND_FEATURE_SEG_DATA_LENGTH = 394;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01BondFeatureSegSqlcd;
            protected  int beginMsdBondCallPrice;
            protected  int beginBdms01CallRateBondDt;
            protected  int beginBdms01CallTypePutCd;
            protected  int beginBdms01CallFeatureFrqncCd;
            protected  int beginBdms01CallRdmptPartialCd;
            protected  int beginBdms01CallSelectionBondCd;
            protected  int beginMsdBondPutPrice;
            protected  int beginBdms01PutRateBondDt;
            protected  int beginBdms01PutTypePutCd;
            protected  int beginMsdBondPutType;
            protected  int beginBdms01PutFeatureFrqncCd;
            protected  int beginBdms01PutRdmptPartialCd;
            protected  int beginBdms01PutSelectionBondCd;
            protected  int beginMsdBndPrerefDate;
            protected  int beginMsdBndPrerefPrice;
            protected  int beginBdms01PrerefRateBondDt;
            protected  int beginBdms01PrefTypePutCd;
            protected  int beginBdms01PrefFeatureFrqncCd;
            protected  int beginBdms01PrefRdmptPartialCd;
            protected  int beginBdms01PrefSelectionBondCd;
            protected  int beginMsdBondParCallDate;
            protected  int beginMsdBondParCallPrice;
            protected  int beginBdms01PcRateBondDt;
            protected  int beginBdms01PcTypePutCd;
            protected  int beginBdms01PcFeatureFrqncCd;
            protected  int beginBdms01PcRdmptPartialCd;
            protected  int beginBdms01PcSelectionBondCd;
            protected  int beginBdms01BndRefundDate;
            protected  int beginBdms01BndRefundPrice;
            protected  int beginBdms01RfTypePutCd;
            protected  int beginBdms01RfFeatureFrqncCd;
            protected  int beginBdms01RfRdmptPartialCd;
            protected  int beginBdms01RfSelectionBondCd;
            protected  int beginBdms01AddtlPutDate;
            protected  int beginBdms01AddtlPutPrice;
            protected  int beginBdms01PaTypePutCd;
            protected  int beginBdms01PaFeatureFrqncCd;
            protected  int beginBdms01PaRdmptPartialCd;
            protected  int beginBdms01PaSelectionBondCd;
            protected  int beginBdms01BndOfferingDate;
            protected  int beginBdms01BndOfferingPrice;
            protected  int beginBdms01ExTypePutCd;
            protected  int beginBdms01ExFeatureFrqncCd;
            protected  int beginBdms01ExRdmptPartialCd;
            protected  int beginBdms01ExSelectionBondCd;
            protected  int beginBdms01BndRetractDate;
            protected  int beginBdms01BndRetractPrice;
            protected  int beginBdms01RtTypePutCd;
            protected  int beginBdms01RtFeatureFrqncCd;
            protected  int beginBdms01RtRdmptPartialCd;
            protected  int beginBdms01RtSelectionBondCd;
	
	/**
	* Constructor for Bdms01BondFeatureSegDataSerialized
	**/
    public Bdms01BondFeatureSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01BondFeatureSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01BondFeatureSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01BondFeatureSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2787); // serialize this field at offset 2787 by default 
    }
    
	/**
	* sets parent for this Bdms01BondFeatureSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2787 by default
    }    
	/**
	* initializes the field in Bdms01BondFeatureSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_BOND_FEATURE_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01BondFeatureSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
  
             beginMsdBondCallPrice = getStartOffset() + 12;	// set offset for serialization
  
             beginBdms01CallRateBondDt = getStartOffset() + 30;	// set offset for serialization
  
             beginBdms01CallTypePutCd = getStartOffset() + 40;	// set offset for serialization
  
             beginBdms01CallFeatureFrqncCd = getStartOffset() + 41;	// set offset for serialization
  
             beginBdms01CallRdmptPartialCd = getStartOffset() + 43;	// set offset for serialization
  
             beginBdms01CallSelectionBondCd = getStartOffset() + 45;	// set offset for serialization
  
  
             beginMsdBondPutPrice = getStartOffset() + 55;	// set offset for serialization
  
             beginBdms01PutRateBondDt = getStartOffset() + 73;	// set offset for serialization
  
             beginBdms01PutTypePutCd = getStartOffset() + 83;	// set offset for serialization
  
             beginMsdBondPutType = getStartOffset() + 83;	// set offset for serialization
  
             beginBdms01PutFeatureFrqncCd = getStartOffset() + 84;	// set offset for serialization
  
             beginBdms01PutRdmptPartialCd = getStartOffset() + 86;	// set offset for serialization
  
             beginBdms01PutSelectionBondCd = getStartOffset() + 88;	// set offset for serialization
  
             beginMsdBndPrerefDate = getStartOffset() + 90;	// set offset for serialization
  
             beginMsdBndPrerefPrice = getStartOffset() + 98;	// set offset for serialization
  
             beginBdms01PrerefRateBondDt = getStartOffset() + 116;	// set offset for serialization
  
             beginBdms01PrefTypePutCd = getStartOffset() + 126;	// set offset for serialization
  
             beginBdms01PrefFeatureFrqncCd = getStartOffset() + 127;	// set offset for serialization
  
             beginBdms01PrefRdmptPartialCd = getStartOffset() + 129;	// set offset for serialization
  
             beginBdms01PrefSelectionBondCd = getStartOffset() + 131;	// set offset for serialization
  
             beginMsdBondParCallDate = getStartOffset() + 133;	// set offset for serialization
  
             beginMsdBondParCallPrice = getStartOffset() + 139;	// set offset for serialization
  
             beginBdms01PcRateBondDt = getStartOffset() + 157;	// set offset for serialization
  
             beginBdms01PcTypePutCd = getStartOffset() + 167;	// set offset for serialization
  
             beginBdms01PcFeatureFrqncCd = getStartOffset() + 168;	// set offset for serialization
  
             beginBdms01PcRdmptPartialCd = getStartOffset() + 170;	// set offset for serialization
  
             beginBdms01PcSelectionBondCd = getStartOffset() + 172;	// set offset for serialization
  
             beginBdms01BndRefundDate = getStartOffset() + 174;	// set offset for serialization
  
             beginBdms01BndRefundPrice = getStartOffset() + 184;	// set offset for serialization
  
             beginBdms01RfTypePutCd = getStartOffset() + 202;	// set offset for serialization
  
             beginBdms01RfFeatureFrqncCd = getStartOffset() + 203;	// set offset for serialization
  
             beginBdms01RfRdmptPartialCd = getStartOffset() + 205;	// set offset for serialization
  
             beginBdms01RfSelectionBondCd = getStartOffset() + 207;	// set offset for serialization
  
             beginBdms01AddtlPutDate = getStartOffset() + 209;	// set offset for serialization
  
             beginBdms01AddtlPutPrice = getStartOffset() + 219;	// set offset for serialization
  
             beginBdms01PaTypePutCd = getStartOffset() + 237;	// set offset for serialization
  
             beginBdms01PaFeatureFrqncCd = getStartOffset() + 238;	// set offset for serialization
  
             beginBdms01PaRdmptPartialCd = getStartOffset() + 240;	// set offset for serialization
  
             beginBdms01PaSelectionBondCd = getStartOffset() + 242;	// set offset for serialization
  
             beginBdms01BndOfferingDate = getStartOffset() + 244;	// set offset for serialization
  
             beginBdms01BndOfferingPrice = getStartOffset() + 254;	// set offset for serialization
  
             beginBdms01ExTypePutCd = getStartOffset() + 272;	// set offset for serialization
  
             beginBdms01ExFeatureFrqncCd = getStartOffset() + 273;	// set offset for serialization
  
             beginBdms01ExRdmptPartialCd = getStartOffset() + 275;	// set offset for serialization
  
             beginBdms01ExSelectionBondCd = getStartOffset() + 277;	// set offset for serialization
  
             beginBdms01BndRetractDate = getStartOffset() + 279;	// set offset for serialization
  
             beginBdms01BndRetractPrice = getStartOffset() + 289;	// set offset for serialization
  
             beginBdms01RtTypePutCd = getStartOffset() + 307;	// set offset for serialization
  
             beginBdms01RtFeatureFrqncCd = getStartOffset() + 308;	// set offset for serialization
  
             beginBdms01RtRdmptPartialCd = getStartOffset() + 310;	// set offset for serialization
  
             beginBdms01RtSelectionBondCd = getStartOffset() + 312;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01BondFeatureSegSqlcdCounter = -1;
     public boolean isBdms01BondFeatureSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01BondFeatureSegSqlcdCounter != sharedCounter;
         localBdms01BondFeatureSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01BondFeatureSegSqlcd
	 *	@return bdms01BondFeatureSegSqlcd
	 */
	public char[]  getBdms01BondFeatureSegSqlcdString() {
	     return getCharArray(beginBdms01BondFeatureSegSqlcd,BDMS_01_BOND_FEATURE_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01BondFeatureSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01BondFeatureSegSqlcd
	                    ,beginBdms01BondFeatureSegSqlcd + BDMS_01_BOND_FEATURE_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_BOND_FEATURE_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01BondFeatureSegSqlcd
	 */
	protected void serializeBdms01BondFeatureSegSqlcd(int bdms01BondFeatureSegSqlcd) {
		 putNumber(beginBdms01BondFeatureSegSqlcd,bdms01BondFeatureSegSqlcd,BDMS_01_BOND_FEATURE_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01BondFeatureSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01BondFeatureSegSqlcd
	 */
   	protected  int serializeBdms01BondFeatureSegSqlcd(char[] value) {
	    int  bdms01BondFeatureSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01BondFeatureSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01BondFeatureSegSqlcd
		       ,4
		      );
		 localBdms01BondFeatureSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01BondFeatureSegSqlcd;
    }

   protected int checkBdms01BondFeatureSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01BondFeatureSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01BondFeatureSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01BondFeatureSegSqlcd
			                 ,BDMS_01_BOND_FEATURE_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01BondFeatureSegSqlcd", beginBdms01BondFeatureSegSqlcd,BDMS_01_BOND_FEATURE_SEG_SQLCD_LEN);
    }
   	}
     int localMsdBondCallPriceCounter = -1;
     
     public boolean isMsdBondCallPriceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondCallPriceCounter != sharedCounter;
         localMsdBondCallPriceCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdBondCallPrice
	 *	@return msdBondCallPrice
	 */
	public char[]  getMsdBondCallPriceString() {
	    return getCharArray(beginMsdBondCallPrice,MSD_BOND_CALL_PRICE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondCallPriceIsNumeric() {
		    return isNumeric(beginMsdBondCallPrice
	                    ,beginMsdBondCallPrice + MSD_BOND_CALL_PRICE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_BOND_CALL_PRICE_LEN = 18;
  protected  static final int MSD_BOND_CALL_PRICE_SCALE = 8;

   protected BigDecimal checkMsdBondCallPriceMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeMsdBondCallPrice
	 */
	protected void serializeMsdBondCallPrice(BigDecimal msdBondCallPrice) {
	       putNumber(beginMsdBondCallPrice,msdBondCallPrice,MSD_BOND_CALL_PRICE_LEN,MSD_BOND_CALL_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondCallPriceCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdBondCallPrice
	 */
   	protected  BigDecimal serializeMsdBondCallPrice(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginMsdBondCallPrice
		       ,18
		      );		 localMsdBondCallPriceCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_BOND_CALL_PRICE_LEN,MSD_BOND_CALL_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdBondCallPrice", beginMsdBondCallPrice,MSD_BOND_CALL_PRICE_LEN);
    	}
    }
    /**
	 *	refreshMsdBondCallPrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdBondCallPrice() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdBondCallPrice
			            ,MSD_BOND_CALL_PRICE_LEN
			            ,MSD_BOND_CALL_PRICE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondCallPrice", beginMsdBondCallPrice,MSD_BOND_CALL_PRICE_LEN);
    }
   	}
     int localBdms01CallRateBondDtCounter = -1;
     public boolean isBdms01CallRateBondDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CallRateBondDtCounter != sharedCounter;
         localBdms01CallRateBondDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CALL_RATE_BOND_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01CallRateBondDt
	 */
   protected void serializeBdms01CallRateBondDt(char[] bdms01CallRateBondDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CallRateBondDt,0,getStringValue(),beginBdms01CallRateBondDt,BDMS_01_CALL_RATE_BOND_DT_LEN);
       localBdms01CallRateBondDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CallRateBondDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01CallRateBondDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CallRateBondDt() {	 
   		return (substring(getStringValue(),beginBdms01CallRateBondDt,beginBdms01CallRateBondDt + BDMS_01_CALL_RATE_BOND_DT_LEN));
   	}
     int localBdms01CallTypePutCdCounter = -1;
     public boolean isBdms01CallTypePutCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CallTypePutCdCounter != sharedCounter;
         localBdms01CallTypePutCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CALL_TYPE_PUT_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01CallTypePutCd
	 */
   protected void serializeBdms01CallTypePutCd(char[] bdms01CallTypePutCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CallTypePutCd,0,getStringValue(),beginBdms01CallTypePutCd,BDMS_01_CALL_TYPE_PUT_CD_LEN);
       localBdms01CallTypePutCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CallTypePutCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01CallTypePutCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CallTypePutCd() {	 
   		return (substring(getStringValue(),beginBdms01CallTypePutCd,beginBdms01CallTypePutCd + BDMS_01_CALL_TYPE_PUT_CD_LEN));
   	}
     int localBdms01CallFeatureFrqncCdCounter = -1;
     public boolean isBdms01CallFeatureFrqncCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CallFeatureFrqncCdCounter != sharedCounter;
         localBdms01CallFeatureFrqncCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CALL_FEATURE_FRQNC_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01CallFeatureFrqncCd
	 */
   protected void serializeBdms01CallFeatureFrqncCd(char[] bdms01CallFeatureFrqncCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CallFeatureFrqncCd,0,getStringValue(),beginBdms01CallFeatureFrqncCd,BDMS_01_CALL_FEATURE_FRQNC_CD_LEN);
       localBdms01CallFeatureFrqncCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CallFeatureFrqncCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01CallFeatureFrqncCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CallFeatureFrqncCd() {	 
   		return (substring(getStringValue(),beginBdms01CallFeatureFrqncCd,beginBdms01CallFeatureFrqncCd + BDMS_01_CALL_FEATURE_FRQNC_CD_LEN));
   	}
     int localBdms01CallRdmptPartialCdCounter = -1;
     public boolean isBdms01CallRdmptPartialCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CallRdmptPartialCdCounter != sharedCounter;
         localBdms01CallRdmptPartialCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CALL_RDMPT_PARTIAL_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01CallRdmptPartialCd
	 */
   protected void serializeBdms01CallRdmptPartialCd(char[] bdms01CallRdmptPartialCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CallRdmptPartialCd,0,getStringValue(),beginBdms01CallRdmptPartialCd,BDMS_01_CALL_RDMPT_PARTIAL_CD_LEN);
       localBdms01CallRdmptPartialCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CallRdmptPartialCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01CallRdmptPartialCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CallRdmptPartialCd() {	 
   		return (substring(getStringValue(),beginBdms01CallRdmptPartialCd,beginBdms01CallRdmptPartialCd + BDMS_01_CALL_RDMPT_PARTIAL_CD_LEN));
   	}
     int localBdms01CallSelectionBondCdCounter = -1;
     public boolean isBdms01CallSelectionBondCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CallSelectionBondCdCounter != sharedCounter;
         localBdms01CallSelectionBondCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CALL_SELECTION_BOND_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01CallSelectionBondCd
	 */
   protected void serializeBdms01CallSelectionBondCd(char[] bdms01CallSelectionBondCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CallSelectionBondCd,0,getStringValue(),beginBdms01CallSelectionBondCd,BDMS_01_CALL_SELECTION_BOND_CD_LEN);
       localBdms01CallSelectionBondCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CallSelectionBondCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01CallSelectionBondCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CallSelectionBondCd() {	 
   		return (substring(getStringValue(),beginBdms01CallSelectionBondCd,beginBdms01CallSelectionBondCd + BDMS_01_CALL_SELECTION_BOND_CD_LEN));
   	}
     int localMsdBondPutPriceCounter = -1;
     
     public boolean isMsdBondPutPriceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondPutPriceCounter != sharedCounter;
         localMsdBondPutPriceCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdBondPutPrice
	 *	@return msdBondPutPrice
	 */
	public char[]  getMsdBondPutPriceString() {
	    return getCharArray(beginMsdBondPutPrice,MSD_BOND_PUT_PRICE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondPutPriceIsNumeric() {
		    return isNumeric(beginMsdBondPutPrice
	                    ,beginMsdBondPutPrice + MSD_BOND_PUT_PRICE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_BOND_PUT_PRICE_LEN = 18;
  protected  static final int MSD_BOND_PUT_PRICE_SCALE = 8;

   protected BigDecimal checkMsdBondPutPriceMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeMsdBondPutPrice
	 */
	protected void serializeMsdBondPutPrice(BigDecimal msdBondPutPrice) {
	       putNumber(beginMsdBondPutPrice,msdBondPutPrice,MSD_BOND_PUT_PRICE_LEN,MSD_BOND_PUT_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondPutPriceCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdBondPutPrice
	 */
   	protected  BigDecimal serializeMsdBondPutPrice(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginMsdBondPutPrice
		       ,18
		      );		 localMsdBondPutPriceCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_BOND_PUT_PRICE_LEN,MSD_BOND_PUT_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdBondPutPrice", beginMsdBondPutPrice,MSD_BOND_PUT_PRICE_LEN);
    	}
    }
    /**
	 *	refreshMsdBondPutPrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdBondPutPrice() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdBondPutPrice
			            ,MSD_BOND_PUT_PRICE_LEN
			            ,MSD_BOND_PUT_PRICE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondPutPrice", beginMsdBondPutPrice,MSD_BOND_PUT_PRICE_LEN);
    }
   	}
     int localBdms01PutRateBondDtCounter = -1;
     public boolean isBdms01PutRateBondDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PutRateBondDtCounter != sharedCounter;
         localBdms01PutRateBondDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PUT_RATE_BOND_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01PutRateBondDt
	 */
   protected void serializeBdms01PutRateBondDt(char[] bdms01PutRateBondDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PutRateBondDt,0,getStringValue(),beginBdms01PutRateBondDt,BDMS_01_PUT_RATE_BOND_DT_LEN);
       localBdms01PutRateBondDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PutRateBondDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01PutRateBondDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PutRateBondDt() {	 
   		return (substring(getStringValue(),beginBdms01PutRateBondDt,beginBdms01PutRateBondDt + BDMS_01_PUT_RATE_BOND_DT_LEN));
   	}
     int localBdms01PutTypePutCdCounter = -1;
     public boolean isBdms01PutTypePutCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PutTypePutCdCounter != sharedCounter;
         localBdms01PutTypePutCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PUT_TYPE_PUT_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01PutTypePutCd
	 */
   protected void serializeBdms01PutTypePutCd(char[] bdms01PutTypePutCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PutTypePutCd,0,getStringValue(),beginBdms01PutTypePutCd,BDMS_01_PUT_TYPE_PUT_CD_LEN);
       localBdms01PutTypePutCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PutTypePutCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01PutTypePutCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PutTypePutCd() {	 
   		return (substring(getStringValue(),beginBdms01PutTypePutCd,beginBdms01PutTypePutCd + BDMS_01_PUT_TYPE_PUT_CD_LEN));
   	}
     int localMsdBondPutTypeCounter = -1;
     public boolean isMsdBondPutTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondPutTypeCounter != sharedCounter;
         localMsdBondPutTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_BOND_PUT_TYPE_LEN = 1;
	/**
	 * 	serialize this MsdBondPutType
	 */
   protected void serializeMsdBondPutType(char[] msdBondPutType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdBondPutType,0,getStringValue(),beginMsdBondPutType,MSD_BOND_PUT_TYPE_LEN);
       localMsdBondPutTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdBondPutTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdBondPutType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdBondPutType() {	 
   		return (substring(getStringValue(),beginMsdBondPutType,beginMsdBondPutType + MSD_BOND_PUT_TYPE_LEN));
   	}
     int localBdms01PutFeatureFrqncCdCounter = -1;
     public boolean isBdms01PutFeatureFrqncCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PutFeatureFrqncCdCounter != sharedCounter;
         localBdms01PutFeatureFrqncCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PUT_FEATURE_FRQNC_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01PutFeatureFrqncCd
	 */
   protected void serializeBdms01PutFeatureFrqncCd(char[] bdms01PutFeatureFrqncCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PutFeatureFrqncCd,0,getStringValue(),beginBdms01PutFeatureFrqncCd,BDMS_01_PUT_FEATURE_FRQNC_CD_LEN);
       localBdms01PutFeatureFrqncCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PutFeatureFrqncCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01PutFeatureFrqncCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PutFeatureFrqncCd() {	 
   		return (substring(getStringValue(),beginBdms01PutFeatureFrqncCd,beginBdms01PutFeatureFrqncCd + BDMS_01_PUT_FEATURE_FRQNC_CD_LEN));
   	}
     int localBdms01PutRdmptPartialCdCounter = -1;
     public boolean isBdms01PutRdmptPartialCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PutRdmptPartialCdCounter != sharedCounter;
         localBdms01PutRdmptPartialCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PUT_RDMPT_PARTIAL_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01PutRdmptPartialCd
	 */
   protected void serializeBdms01PutRdmptPartialCd(char[] bdms01PutRdmptPartialCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PutRdmptPartialCd,0,getStringValue(),beginBdms01PutRdmptPartialCd,BDMS_01_PUT_RDMPT_PARTIAL_CD_LEN);
       localBdms01PutRdmptPartialCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PutRdmptPartialCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01PutRdmptPartialCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PutRdmptPartialCd() {	 
   		return (substring(getStringValue(),beginBdms01PutRdmptPartialCd,beginBdms01PutRdmptPartialCd + BDMS_01_PUT_RDMPT_PARTIAL_CD_LEN));
   	}
     int localBdms01PutSelectionBondCdCounter = -1;
     public boolean isBdms01PutSelectionBondCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PutSelectionBondCdCounter != sharedCounter;
         localBdms01PutSelectionBondCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PUT_SELECTION_BOND_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01PutSelectionBondCd
	 */
   protected void serializeBdms01PutSelectionBondCd(char[] bdms01PutSelectionBondCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PutSelectionBondCd,0,getStringValue(),beginBdms01PutSelectionBondCd,BDMS_01_PUT_SELECTION_BOND_CD_LEN);
       localBdms01PutSelectionBondCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PutSelectionBondCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01PutSelectionBondCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PutSelectionBondCd() {	 
   		return (substring(getStringValue(),beginBdms01PutSelectionBondCd,beginBdms01PutSelectionBondCd + BDMS_01_PUT_SELECTION_BOND_CD_LEN));
   	}
     int localMsdBndPrerefDateCounter = -1;
     public boolean isMsdBndPrerefDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBndPrerefDateCounter != sharedCounter;
         localMsdBndPrerefDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBndPrerefDate
	 *	@return msdBndPrerefDate
	 */
	public char[]  getMsdBndPrerefDateString() {
	     return getCharArray(beginMsdBndPrerefDate,MSD_BND_PREREF_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBndPrerefDateIsNumeric() {
	    return isNumeric(beginMsdBndPrerefDate
	                    ,beginMsdBndPrerefDate + MSD_BND_PREREF_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BND_PREREF_DATE_LEN = 8;
  	/**
	 * serializeMsdBndPrerefDate
	 */
	protected void serializeMsdBndPrerefDate(long msdBndPrerefDate) {
		 putNumber(beginMsdBndPrerefDate,msdBndPrerefDate,MSD_BND_PREREF_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBndPrerefDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBndPrerefDate
	 */
   	protected  long serializeMsdBndPrerefDate(char[] value) {
	    long  msdBndPrerefDate;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBndPrerefDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginMsdBndPrerefDate
		       ,8
		      );
		 localMsdBndPrerefDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBndPrerefDate;
    }

   protected long checkMsdBndPrerefDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBndPrerefDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdBndPrerefDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdBndPrerefDate
			                 ,MSD_BND_PREREF_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBndPrerefDate", beginMsdBndPrerefDate,MSD_BND_PREREF_DATE_LEN);
    }
   	}
     int localMsdBndPrerefPriceCounter = -1;
     
     public boolean isMsdBndPrerefPriceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBndPrerefPriceCounter != sharedCounter;
         localMsdBndPrerefPriceCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdBndPrerefPrice
	 *	@return msdBndPrerefPrice
	 */
	public char[]  getMsdBndPrerefPriceString() {
	    return getCharArray(beginMsdBndPrerefPrice,MSD_BND_PREREF_PRICE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBndPrerefPriceIsNumeric() {
		    return isNumeric(beginMsdBndPrerefPrice
	                    ,beginMsdBndPrerefPrice + MSD_BND_PREREF_PRICE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_BND_PREREF_PRICE_LEN = 18;
  protected  static final int MSD_BND_PREREF_PRICE_SCALE = 8;

   protected BigDecimal checkMsdBndPrerefPriceMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeMsdBndPrerefPrice
	 */
	protected void serializeMsdBndPrerefPrice(BigDecimal msdBndPrerefPrice) {
	       putNumber(beginMsdBndPrerefPrice,msdBndPrerefPrice,MSD_BND_PREREF_PRICE_LEN,MSD_BND_PREREF_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBndPrerefPriceCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdBndPrerefPrice
	 */
   	protected  BigDecimal serializeMsdBndPrerefPrice(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginMsdBndPrerefPrice
		       ,18
		      );		 localMsdBndPrerefPriceCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_BND_PREREF_PRICE_LEN,MSD_BND_PREREF_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdBndPrerefPrice", beginMsdBndPrerefPrice,MSD_BND_PREREF_PRICE_LEN);
    	}
    }
    /**
	 *	refreshMsdBndPrerefPrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdBndPrerefPrice() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdBndPrerefPrice
			            ,MSD_BND_PREREF_PRICE_LEN
			            ,MSD_BND_PREREF_PRICE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBndPrerefPrice", beginMsdBndPrerefPrice,MSD_BND_PREREF_PRICE_LEN);
    }
   	}
     int localBdms01PrerefRateBondDtCounter = -1;
     public boolean isBdms01PrerefRateBondDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PrerefRateBondDtCounter != sharedCounter;
         localBdms01PrerefRateBondDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PREREF_RATE_BOND_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01PrerefRateBondDt
	 */
   protected void serializeBdms01PrerefRateBondDt(char[] bdms01PrerefRateBondDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PrerefRateBondDt,0,getStringValue(),beginBdms01PrerefRateBondDt,BDMS_01_PREREF_RATE_BOND_DT_LEN);
       localBdms01PrerefRateBondDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PrerefRateBondDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01PrerefRateBondDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PrerefRateBondDt() {	 
   		return (substring(getStringValue(),beginBdms01PrerefRateBondDt,beginBdms01PrerefRateBondDt + BDMS_01_PREREF_RATE_BOND_DT_LEN));
   	}
     int localBdms01PrefTypePutCdCounter = -1;
     public boolean isBdms01PrefTypePutCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PrefTypePutCdCounter != sharedCounter;
         localBdms01PrefTypePutCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PREF_TYPE_PUT_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01PrefTypePutCd
	 */
   protected void serializeBdms01PrefTypePutCd(char[] bdms01PrefTypePutCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PrefTypePutCd,0,getStringValue(),beginBdms01PrefTypePutCd,BDMS_01_PREF_TYPE_PUT_CD_LEN);
       localBdms01PrefTypePutCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PrefTypePutCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01PrefTypePutCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PrefTypePutCd() {	 
   		return (substring(getStringValue(),beginBdms01PrefTypePutCd,beginBdms01PrefTypePutCd + BDMS_01_PREF_TYPE_PUT_CD_LEN));
   	}
     int localBdms01PrefFeatureFrqncCdCounter = -1;
     public boolean isBdms01PrefFeatureFrqncCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PrefFeatureFrqncCdCounter != sharedCounter;
         localBdms01PrefFeatureFrqncCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PREF_FEATURE_FRQNC_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01PrefFeatureFrqncCd
	 */
   protected void serializeBdms01PrefFeatureFrqncCd(char[] bdms01PrefFeatureFrqncCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PrefFeatureFrqncCd,0,getStringValue(),beginBdms01PrefFeatureFrqncCd,BDMS_01_PREF_FEATURE_FRQNC_CD_LEN);
       localBdms01PrefFeatureFrqncCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PrefFeatureFrqncCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01PrefFeatureFrqncCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PrefFeatureFrqncCd() {	 
   		return (substring(getStringValue(),beginBdms01PrefFeatureFrqncCd,beginBdms01PrefFeatureFrqncCd + BDMS_01_PREF_FEATURE_FRQNC_CD_LEN));
   	}
     int localBdms01PrefRdmptPartialCdCounter = -1;
     public boolean isBdms01PrefRdmptPartialCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PrefRdmptPartialCdCounter != sharedCounter;
         localBdms01PrefRdmptPartialCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PREF_RDMPT_PARTIAL_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01PrefRdmptPartialCd
	 */
   protected void serializeBdms01PrefRdmptPartialCd(char[] bdms01PrefRdmptPartialCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PrefRdmptPartialCd,0,getStringValue(),beginBdms01PrefRdmptPartialCd,BDMS_01_PREF_RDMPT_PARTIAL_CD_LEN);
       localBdms01PrefRdmptPartialCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PrefRdmptPartialCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01PrefRdmptPartialCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PrefRdmptPartialCd() {	 
   		return (substring(getStringValue(),beginBdms01PrefRdmptPartialCd,beginBdms01PrefRdmptPartialCd + BDMS_01_PREF_RDMPT_PARTIAL_CD_LEN));
   	}
     int localBdms01PrefSelectionBondCdCounter = -1;
     public boolean isBdms01PrefSelectionBondCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PrefSelectionBondCdCounter != sharedCounter;
         localBdms01PrefSelectionBondCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PREF_SELECTION_BOND_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01PrefSelectionBondCd
	 */
   protected void serializeBdms01PrefSelectionBondCd(char[] bdms01PrefSelectionBondCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PrefSelectionBondCd,0,getStringValue(),beginBdms01PrefSelectionBondCd,BDMS_01_PREF_SELECTION_BOND_CD_LEN);
       localBdms01PrefSelectionBondCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PrefSelectionBondCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01PrefSelectionBondCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PrefSelectionBondCd() {	 
   		return (substring(getStringValue(),beginBdms01PrefSelectionBondCd,beginBdms01PrefSelectionBondCd + BDMS_01_PREF_SELECTION_BOND_CD_LEN));
   	}
     int localMsdBondParCallDateCounter = -1;
     public boolean isMsdBondParCallDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondParCallDateCounter != sharedCounter;
         localMsdBondParCallDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBondParCallDate
	 *	@return msdBondParCallDate
	 */
	public char[]  getMsdBondParCallDateString() {
	     return getCharArray(beginMsdBondParCallDate,MSD_BOND_PAR_CALL_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondParCallDateIsNumeric() {
	    return isNumeric(beginMsdBondParCallDate
	                    ,beginMsdBondParCallDate + MSD_BOND_PAR_CALL_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BOND_PAR_CALL_DATE_LEN = 6;
  	/**
	 * serializeMsdBondParCallDate
	 */
	protected void serializeMsdBondParCallDate(long msdBondParCallDate) {
		 putNumber(beginMsdBondParCallDate,msdBondParCallDate,MSD_BOND_PAR_CALL_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondParCallDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBondParCallDate
	 */
   	protected  long serializeMsdBondParCallDate(char[] value) {
	    long  msdBondParCallDate;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBondParCallDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMsdBondParCallDate
		       ,6
		      );
		 localMsdBondParCallDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBondParCallDate;
    }

   protected long checkMsdBondParCallDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBondParCallDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdBondParCallDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdBondParCallDate
			                 ,MSD_BOND_PAR_CALL_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondParCallDate", beginMsdBondParCallDate,MSD_BOND_PAR_CALL_DATE_LEN);
    }
   	}
     int localMsdBondParCallPriceCounter = -1;
     
     public boolean isMsdBondParCallPriceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondParCallPriceCounter != sharedCounter;
         localMsdBondParCallPriceCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdBondParCallPrice
	 *	@return msdBondParCallPrice
	 */
	public char[]  getMsdBondParCallPriceString() {
	    return getCharArray(beginMsdBondParCallPrice,MSD_BOND_PAR_CALL_PRICE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondParCallPriceIsNumeric() {
		    return isNumeric(beginMsdBondParCallPrice
	                    ,beginMsdBondParCallPrice + MSD_BOND_PAR_CALL_PRICE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_BOND_PAR_CALL_PRICE_LEN = 18;
  protected  static final int MSD_BOND_PAR_CALL_PRICE_SCALE = 8;

   protected BigDecimal checkMsdBondParCallPriceMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeMsdBondParCallPrice
	 */
	protected void serializeMsdBondParCallPrice(BigDecimal msdBondParCallPrice) {
	       putNumber(beginMsdBondParCallPrice,msdBondParCallPrice,MSD_BOND_PAR_CALL_PRICE_LEN,MSD_BOND_PAR_CALL_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondParCallPriceCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdBondParCallPrice
	 */
   	protected  BigDecimal serializeMsdBondParCallPrice(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginMsdBondParCallPrice
		       ,18
		      );		 localMsdBondParCallPriceCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_BOND_PAR_CALL_PRICE_LEN,MSD_BOND_PAR_CALL_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdBondParCallPrice", beginMsdBondParCallPrice,MSD_BOND_PAR_CALL_PRICE_LEN);
    	}
    }
    /**
	 *	refreshMsdBondParCallPrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdBondParCallPrice() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdBondParCallPrice
			            ,MSD_BOND_PAR_CALL_PRICE_LEN
			            ,MSD_BOND_PAR_CALL_PRICE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondParCallPrice", beginMsdBondParCallPrice,MSD_BOND_PAR_CALL_PRICE_LEN);
    }
   	}
     int localBdms01PcRateBondDtCounter = -1;
     public boolean isBdms01PcRateBondDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PcRateBondDtCounter != sharedCounter;
         localBdms01PcRateBondDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PC_RATE_BOND_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01PcRateBondDt
	 */
   protected void serializeBdms01PcRateBondDt(char[] bdms01PcRateBondDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PcRateBondDt,0,getStringValue(),beginBdms01PcRateBondDt,BDMS_01_PC_RATE_BOND_DT_LEN);
       localBdms01PcRateBondDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PcRateBondDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01PcRateBondDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PcRateBondDt() {	 
   		return (substring(getStringValue(),beginBdms01PcRateBondDt,beginBdms01PcRateBondDt + BDMS_01_PC_RATE_BOND_DT_LEN));
   	}
     int localBdms01PcTypePutCdCounter = -1;
     public boolean isBdms01PcTypePutCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PcTypePutCdCounter != sharedCounter;
         localBdms01PcTypePutCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PC_TYPE_PUT_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01PcTypePutCd
	 */
   protected void serializeBdms01PcTypePutCd(char[] bdms01PcTypePutCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PcTypePutCd,0,getStringValue(),beginBdms01PcTypePutCd,BDMS_01_PC_TYPE_PUT_CD_LEN);
       localBdms01PcTypePutCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PcTypePutCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01PcTypePutCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PcTypePutCd() {	 
   		return (substring(getStringValue(),beginBdms01PcTypePutCd,beginBdms01PcTypePutCd + BDMS_01_PC_TYPE_PUT_CD_LEN));
   	}
     int localBdms01PcFeatureFrqncCdCounter = -1;
     public boolean isBdms01PcFeatureFrqncCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PcFeatureFrqncCdCounter != sharedCounter;
         localBdms01PcFeatureFrqncCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PC_FEATURE_FRQNC_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01PcFeatureFrqncCd
	 */
   protected void serializeBdms01PcFeatureFrqncCd(char[] bdms01PcFeatureFrqncCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PcFeatureFrqncCd,0,getStringValue(),beginBdms01PcFeatureFrqncCd,BDMS_01_PC_FEATURE_FRQNC_CD_LEN);
       localBdms01PcFeatureFrqncCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PcFeatureFrqncCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01PcFeatureFrqncCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PcFeatureFrqncCd() {	 
   		return (substring(getStringValue(),beginBdms01PcFeatureFrqncCd,beginBdms01PcFeatureFrqncCd + BDMS_01_PC_FEATURE_FRQNC_CD_LEN));
   	}
     int localBdms01PcRdmptPartialCdCounter = -1;
     public boolean isBdms01PcRdmptPartialCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PcRdmptPartialCdCounter != sharedCounter;
         localBdms01PcRdmptPartialCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PC_RDMPT_PARTIAL_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01PcRdmptPartialCd
	 */
   protected void serializeBdms01PcRdmptPartialCd(char[] bdms01PcRdmptPartialCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PcRdmptPartialCd,0,getStringValue(),beginBdms01PcRdmptPartialCd,BDMS_01_PC_RDMPT_PARTIAL_CD_LEN);
       localBdms01PcRdmptPartialCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PcRdmptPartialCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01PcRdmptPartialCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PcRdmptPartialCd() {	 
   		return (substring(getStringValue(),beginBdms01PcRdmptPartialCd,beginBdms01PcRdmptPartialCd + BDMS_01_PC_RDMPT_PARTIAL_CD_LEN));
   	}
     int localBdms01PcSelectionBondCdCounter = -1;
     public boolean isBdms01PcSelectionBondCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PcSelectionBondCdCounter != sharedCounter;
         localBdms01PcSelectionBondCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PC_SELECTION_BOND_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01PcSelectionBondCd
	 */
   protected void serializeBdms01PcSelectionBondCd(char[] bdms01PcSelectionBondCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PcSelectionBondCd,0,getStringValue(),beginBdms01PcSelectionBondCd,BDMS_01_PC_SELECTION_BOND_CD_LEN);
       localBdms01PcSelectionBondCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PcSelectionBondCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01PcSelectionBondCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PcSelectionBondCd() {	 
   		return (substring(getStringValue(),beginBdms01PcSelectionBondCd,beginBdms01PcSelectionBondCd + BDMS_01_PC_SELECTION_BOND_CD_LEN));
   	}
     int localBdms01BndRefundDateCounter = -1;
     public boolean isBdms01BndRefundDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01BndRefundDateCounter != sharedCounter;
         localBdms01BndRefundDateCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_BND_REFUND_DATE_LEN = 10;
	/**
	 * 	serialize this Bdms01BndRefundDate
	 */
   protected void serializeBdms01BndRefundDate(char[] bdms01BndRefundDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01BndRefundDate,0,getStringValue(),beginBdms01BndRefundDate,BDMS_01_BND_REFUND_DATE_LEN);
       localBdms01BndRefundDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01BndRefundDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01BndRefundDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01BndRefundDate() {	 
   		return (substring(getStringValue(),beginBdms01BndRefundDate,beginBdms01BndRefundDate + BDMS_01_BND_REFUND_DATE_LEN));
   	}
     int localBdms01BndRefundPriceCounter = -1;
     
     public boolean isBdms01BndRefundPriceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01BndRefundPriceCounter != sharedCounter;
         localBdms01BndRefundPriceCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01BndRefundPrice
	 *	@return bdms01BndRefundPrice
	 */
	public char[]  getBdms01BndRefundPriceString() {
	    return getCharArray(beginBdms01BndRefundPrice,BDMS_01_BND_REFUND_PRICE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01BndRefundPriceIsNumeric() {
		    return isNumeric(beginBdms01BndRefundPrice
	                    ,beginBdms01BndRefundPrice + BDMS_01_BND_REFUND_PRICE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_BND_REFUND_PRICE_LEN = 18;
  protected  static final int BDMS_01_BND_REFUND_PRICE_SCALE = 8;

   protected BigDecimal checkBdms01BndRefundPriceMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeBdms01BndRefundPrice
	 */
	protected void serializeBdms01BndRefundPrice(BigDecimal bdms01BndRefundPrice) {
	       putNumber(beginBdms01BndRefundPrice,bdms01BndRefundPrice,BDMS_01_BND_REFUND_PRICE_LEN,BDMS_01_BND_REFUND_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01BndRefundPriceCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01BndRefundPrice
	 */
   	protected  BigDecimal serializeBdms01BndRefundPrice(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginBdms01BndRefundPrice
		       ,18
		      );		 localBdms01BndRefundPriceCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_BND_REFUND_PRICE_LEN,BDMS_01_BND_REFUND_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01BndRefundPrice", beginBdms01BndRefundPrice,BDMS_01_BND_REFUND_PRICE_LEN);
    	}
    }
    /**
	 *	refreshBdms01BndRefundPrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01BndRefundPrice() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01BndRefundPrice
			            ,BDMS_01_BND_REFUND_PRICE_LEN
			            ,BDMS_01_BND_REFUND_PRICE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01BndRefundPrice", beginBdms01BndRefundPrice,BDMS_01_BND_REFUND_PRICE_LEN);
    }
   	}
     int localBdms01RfTypePutCdCounter = -1;
     public boolean isBdms01RfTypePutCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RfTypePutCdCounter != sharedCounter;
         localBdms01RfTypePutCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_RF_TYPE_PUT_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01RfTypePutCd
	 */
   protected void serializeBdms01RfTypePutCd(char[] bdms01RfTypePutCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RfTypePutCd,0,getStringValue(),beginBdms01RfTypePutCd,BDMS_01_RF_TYPE_PUT_CD_LEN);
       localBdms01RfTypePutCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RfTypePutCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01RfTypePutCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RfTypePutCd() {	 
   		return (substring(getStringValue(),beginBdms01RfTypePutCd,beginBdms01RfTypePutCd + BDMS_01_RF_TYPE_PUT_CD_LEN));
   	}
     int localBdms01RfFeatureFrqncCdCounter = -1;
     public boolean isBdms01RfFeatureFrqncCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RfFeatureFrqncCdCounter != sharedCounter;
         localBdms01RfFeatureFrqncCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_RF_FEATURE_FRQNC_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01RfFeatureFrqncCd
	 */
   protected void serializeBdms01RfFeatureFrqncCd(char[] bdms01RfFeatureFrqncCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RfFeatureFrqncCd,0,getStringValue(),beginBdms01RfFeatureFrqncCd,BDMS_01_RF_FEATURE_FRQNC_CD_LEN);
       localBdms01RfFeatureFrqncCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RfFeatureFrqncCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01RfFeatureFrqncCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RfFeatureFrqncCd() {	 
   		return (substring(getStringValue(),beginBdms01RfFeatureFrqncCd,beginBdms01RfFeatureFrqncCd + BDMS_01_RF_FEATURE_FRQNC_CD_LEN));
   	}
     int localBdms01RfRdmptPartialCdCounter = -1;
     public boolean isBdms01RfRdmptPartialCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RfRdmptPartialCdCounter != sharedCounter;
         localBdms01RfRdmptPartialCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_RF_RDMPT_PARTIAL_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01RfRdmptPartialCd
	 */
   protected void serializeBdms01RfRdmptPartialCd(char[] bdms01RfRdmptPartialCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RfRdmptPartialCd,0,getStringValue(),beginBdms01RfRdmptPartialCd,BDMS_01_RF_RDMPT_PARTIAL_CD_LEN);
       localBdms01RfRdmptPartialCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RfRdmptPartialCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01RfRdmptPartialCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RfRdmptPartialCd() {	 
   		return (substring(getStringValue(),beginBdms01RfRdmptPartialCd,beginBdms01RfRdmptPartialCd + BDMS_01_RF_RDMPT_PARTIAL_CD_LEN));
   	}
     int localBdms01RfSelectionBondCdCounter = -1;
     public boolean isBdms01RfSelectionBondCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RfSelectionBondCdCounter != sharedCounter;
         localBdms01RfSelectionBondCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_RF_SELECTION_BOND_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01RfSelectionBondCd
	 */
   protected void serializeBdms01RfSelectionBondCd(char[] bdms01RfSelectionBondCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RfSelectionBondCd,0,getStringValue(),beginBdms01RfSelectionBondCd,BDMS_01_RF_SELECTION_BOND_CD_LEN);
       localBdms01RfSelectionBondCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RfSelectionBondCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01RfSelectionBondCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RfSelectionBondCd() {	 
   		return (substring(getStringValue(),beginBdms01RfSelectionBondCd,beginBdms01RfSelectionBondCd + BDMS_01_RF_SELECTION_BOND_CD_LEN));
   	}
     int localBdms01AddtlPutDateCounter = -1;
     public boolean isBdms01AddtlPutDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01AddtlPutDateCounter != sharedCounter;
         localBdms01AddtlPutDateCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_ADDTL_PUT_DATE_LEN = 10;
	/**
	 * 	serialize this Bdms01AddtlPutDate
	 */
   protected void serializeBdms01AddtlPutDate(char[] bdms01AddtlPutDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01AddtlPutDate,0,getStringValue(),beginBdms01AddtlPutDate,BDMS_01_ADDTL_PUT_DATE_LEN);
       localBdms01AddtlPutDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01AddtlPutDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01AddtlPutDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01AddtlPutDate() {	 
   		return (substring(getStringValue(),beginBdms01AddtlPutDate,beginBdms01AddtlPutDate + BDMS_01_ADDTL_PUT_DATE_LEN));
   	}
     int localBdms01AddtlPutPriceCounter = -1;
     
     public boolean isBdms01AddtlPutPriceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01AddtlPutPriceCounter != sharedCounter;
         localBdms01AddtlPutPriceCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01AddtlPutPrice
	 *	@return bdms01AddtlPutPrice
	 */
	public char[]  getBdms01AddtlPutPriceString() {
	    return getCharArray(beginBdms01AddtlPutPrice,BDMS_01_ADDTL_PUT_PRICE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01AddtlPutPriceIsNumeric() {
		    return isNumeric(beginBdms01AddtlPutPrice
	                    ,beginBdms01AddtlPutPrice + BDMS_01_ADDTL_PUT_PRICE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_ADDTL_PUT_PRICE_LEN = 18;
  protected  static final int BDMS_01_ADDTL_PUT_PRICE_SCALE = 8;

   protected BigDecimal checkBdms01AddtlPutPriceMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeBdms01AddtlPutPrice
	 */
	protected void serializeBdms01AddtlPutPrice(BigDecimal bdms01AddtlPutPrice) {
	       putNumber(beginBdms01AddtlPutPrice,bdms01AddtlPutPrice,BDMS_01_ADDTL_PUT_PRICE_LEN,BDMS_01_ADDTL_PUT_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01AddtlPutPriceCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01AddtlPutPrice
	 */
   	protected  BigDecimal serializeBdms01AddtlPutPrice(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginBdms01AddtlPutPrice
		       ,18
		      );		 localBdms01AddtlPutPriceCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_ADDTL_PUT_PRICE_LEN,BDMS_01_ADDTL_PUT_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01AddtlPutPrice", beginBdms01AddtlPutPrice,BDMS_01_ADDTL_PUT_PRICE_LEN);
    	}
    }
    /**
	 *	refreshBdms01AddtlPutPrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01AddtlPutPrice() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01AddtlPutPrice
			            ,BDMS_01_ADDTL_PUT_PRICE_LEN
			            ,BDMS_01_ADDTL_PUT_PRICE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01AddtlPutPrice", beginBdms01AddtlPutPrice,BDMS_01_ADDTL_PUT_PRICE_LEN);
    }
   	}
     int localBdms01PaTypePutCdCounter = -1;
     public boolean isBdms01PaTypePutCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PaTypePutCdCounter != sharedCounter;
         localBdms01PaTypePutCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PA_TYPE_PUT_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01PaTypePutCd
	 */
   protected void serializeBdms01PaTypePutCd(char[] bdms01PaTypePutCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PaTypePutCd,0,getStringValue(),beginBdms01PaTypePutCd,BDMS_01_PA_TYPE_PUT_CD_LEN);
       localBdms01PaTypePutCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PaTypePutCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01PaTypePutCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PaTypePutCd() {	 
   		return (substring(getStringValue(),beginBdms01PaTypePutCd,beginBdms01PaTypePutCd + BDMS_01_PA_TYPE_PUT_CD_LEN));
   	}
     int localBdms01PaFeatureFrqncCdCounter = -1;
     public boolean isBdms01PaFeatureFrqncCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PaFeatureFrqncCdCounter != sharedCounter;
         localBdms01PaFeatureFrqncCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PA_FEATURE_FRQNC_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01PaFeatureFrqncCd
	 */
   protected void serializeBdms01PaFeatureFrqncCd(char[] bdms01PaFeatureFrqncCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PaFeatureFrqncCd,0,getStringValue(),beginBdms01PaFeatureFrqncCd,BDMS_01_PA_FEATURE_FRQNC_CD_LEN);
       localBdms01PaFeatureFrqncCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PaFeatureFrqncCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01PaFeatureFrqncCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PaFeatureFrqncCd() {	 
   		return (substring(getStringValue(),beginBdms01PaFeatureFrqncCd,beginBdms01PaFeatureFrqncCd + BDMS_01_PA_FEATURE_FRQNC_CD_LEN));
   	}
     int localBdms01PaRdmptPartialCdCounter = -1;
     public boolean isBdms01PaRdmptPartialCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PaRdmptPartialCdCounter != sharedCounter;
         localBdms01PaRdmptPartialCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PA_RDMPT_PARTIAL_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01PaRdmptPartialCd
	 */
   protected void serializeBdms01PaRdmptPartialCd(char[] bdms01PaRdmptPartialCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PaRdmptPartialCd,0,getStringValue(),beginBdms01PaRdmptPartialCd,BDMS_01_PA_RDMPT_PARTIAL_CD_LEN);
       localBdms01PaRdmptPartialCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PaRdmptPartialCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01PaRdmptPartialCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PaRdmptPartialCd() {	 
   		return (substring(getStringValue(),beginBdms01PaRdmptPartialCd,beginBdms01PaRdmptPartialCd + BDMS_01_PA_RDMPT_PARTIAL_CD_LEN));
   	}
     int localBdms01PaSelectionBondCdCounter = -1;
     public boolean isBdms01PaSelectionBondCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PaSelectionBondCdCounter != sharedCounter;
         localBdms01PaSelectionBondCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PA_SELECTION_BOND_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01PaSelectionBondCd
	 */
   protected void serializeBdms01PaSelectionBondCd(char[] bdms01PaSelectionBondCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PaSelectionBondCd,0,getStringValue(),beginBdms01PaSelectionBondCd,BDMS_01_PA_SELECTION_BOND_CD_LEN);
       localBdms01PaSelectionBondCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PaSelectionBondCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01PaSelectionBondCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PaSelectionBondCd() {	 
   		return (substring(getStringValue(),beginBdms01PaSelectionBondCd,beginBdms01PaSelectionBondCd + BDMS_01_PA_SELECTION_BOND_CD_LEN));
   	}
     int localBdms01BndOfferingDateCounter = -1;
     public boolean isBdms01BndOfferingDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01BndOfferingDateCounter != sharedCounter;
         localBdms01BndOfferingDateCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_BND_OFFERING_DATE_LEN = 10;
	/**
	 * 	serialize this Bdms01BndOfferingDate
	 */
   protected void serializeBdms01BndOfferingDate(char[] bdms01BndOfferingDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01BndOfferingDate,0,getStringValue(),beginBdms01BndOfferingDate,BDMS_01_BND_OFFERING_DATE_LEN);
       localBdms01BndOfferingDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01BndOfferingDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01BndOfferingDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01BndOfferingDate() {	 
   		return (substring(getStringValue(),beginBdms01BndOfferingDate,beginBdms01BndOfferingDate + BDMS_01_BND_OFFERING_DATE_LEN));
   	}
     int localBdms01BndOfferingPriceCounter = -1;
     
     public boolean isBdms01BndOfferingPriceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01BndOfferingPriceCounter != sharedCounter;
         localBdms01BndOfferingPriceCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01BndOfferingPrice
	 *	@return bdms01BndOfferingPrice
	 */
	public char[]  getBdms01BndOfferingPriceString() {
	    return getCharArray(beginBdms01BndOfferingPrice,BDMS_01_BND_OFFERING_PRICE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01BndOfferingPriceIsNumeric() {
		    return isNumeric(beginBdms01BndOfferingPrice
	                    ,beginBdms01BndOfferingPrice + BDMS_01_BND_OFFERING_PRICE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_BND_OFFERING_PRICE_LEN = 18;
  protected  static final int BDMS_01_BND_OFFERING_PRICE_SCALE = 8;

   protected BigDecimal checkBdms01BndOfferingPriceMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeBdms01BndOfferingPrice
	 */
	protected void serializeBdms01BndOfferingPrice(BigDecimal bdms01BndOfferingPrice) {
	       putNumber(beginBdms01BndOfferingPrice,bdms01BndOfferingPrice,BDMS_01_BND_OFFERING_PRICE_LEN,BDMS_01_BND_OFFERING_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01BndOfferingPriceCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01BndOfferingPrice
	 */
   	protected  BigDecimal serializeBdms01BndOfferingPrice(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginBdms01BndOfferingPrice
		       ,18
		      );		 localBdms01BndOfferingPriceCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_BND_OFFERING_PRICE_LEN,BDMS_01_BND_OFFERING_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01BndOfferingPrice", beginBdms01BndOfferingPrice,BDMS_01_BND_OFFERING_PRICE_LEN);
    	}
    }
    /**
	 *	refreshBdms01BndOfferingPrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01BndOfferingPrice() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01BndOfferingPrice
			            ,BDMS_01_BND_OFFERING_PRICE_LEN
			            ,BDMS_01_BND_OFFERING_PRICE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01BndOfferingPrice", beginBdms01BndOfferingPrice,BDMS_01_BND_OFFERING_PRICE_LEN);
    }
   	}
     int localBdms01ExTypePutCdCounter = -1;
     public boolean isBdms01ExTypePutCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ExTypePutCdCounter != sharedCounter;
         localBdms01ExTypePutCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_EX_TYPE_PUT_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01ExTypePutCd
	 */
   protected void serializeBdms01ExTypePutCd(char[] bdms01ExTypePutCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ExTypePutCd,0,getStringValue(),beginBdms01ExTypePutCd,BDMS_01_EX_TYPE_PUT_CD_LEN);
       localBdms01ExTypePutCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ExTypePutCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01ExTypePutCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ExTypePutCd() {	 
   		return (substring(getStringValue(),beginBdms01ExTypePutCd,beginBdms01ExTypePutCd + BDMS_01_EX_TYPE_PUT_CD_LEN));
   	}
     int localBdms01ExFeatureFrqncCdCounter = -1;
     public boolean isBdms01ExFeatureFrqncCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ExFeatureFrqncCdCounter != sharedCounter;
         localBdms01ExFeatureFrqncCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_EX_FEATURE_FRQNC_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01ExFeatureFrqncCd
	 */
   protected void serializeBdms01ExFeatureFrqncCd(char[] bdms01ExFeatureFrqncCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ExFeatureFrqncCd,0,getStringValue(),beginBdms01ExFeatureFrqncCd,BDMS_01_EX_FEATURE_FRQNC_CD_LEN);
       localBdms01ExFeatureFrqncCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ExFeatureFrqncCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01ExFeatureFrqncCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ExFeatureFrqncCd() {	 
   		return (substring(getStringValue(),beginBdms01ExFeatureFrqncCd,beginBdms01ExFeatureFrqncCd + BDMS_01_EX_FEATURE_FRQNC_CD_LEN));
   	}
     int localBdms01ExRdmptPartialCdCounter = -1;
     public boolean isBdms01ExRdmptPartialCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ExRdmptPartialCdCounter != sharedCounter;
         localBdms01ExRdmptPartialCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_EX_RDMPT_PARTIAL_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01ExRdmptPartialCd
	 */
   protected void serializeBdms01ExRdmptPartialCd(char[] bdms01ExRdmptPartialCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ExRdmptPartialCd,0,getStringValue(),beginBdms01ExRdmptPartialCd,BDMS_01_EX_RDMPT_PARTIAL_CD_LEN);
       localBdms01ExRdmptPartialCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ExRdmptPartialCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01ExRdmptPartialCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ExRdmptPartialCd() {	 
   		return (substring(getStringValue(),beginBdms01ExRdmptPartialCd,beginBdms01ExRdmptPartialCd + BDMS_01_EX_RDMPT_PARTIAL_CD_LEN));
   	}
     int localBdms01ExSelectionBondCdCounter = -1;
     public boolean isBdms01ExSelectionBondCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ExSelectionBondCdCounter != sharedCounter;
         localBdms01ExSelectionBondCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_EX_SELECTION_BOND_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01ExSelectionBondCd
	 */
   protected void serializeBdms01ExSelectionBondCd(char[] bdms01ExSelectionBondCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ExSelectionBondCd,0,getStringValue(),beginBdms01ExSelectionBondCd,BDMS_01_EX_SELECTION_BOND_CD_LEN);
       localBdms01ExSelectionBondCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ExSelectionBondCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01ExSelectionBondCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ExSelectionBondCd() {	 
   		return (substring(getStringValue(),beginBdms01ExSelectionBondCd,beginBdms01ExSelectionBondCd + BDMS_01_EX_SELECTION_BOND_CD_LEN));
   	}
     int localBdms01BndRetractDateCounter = -1;
     public boolean isBdms01BndRetractDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01BndRetractDateCounter != sharedCounter;
         localBdms01BndRetractDateCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_BND_RETRACT_DATE_LEN = 10;
	/**
	 * 	serialize this Bdms01BndRetractDate
	 */
   protected void serializeBdms01BndRetractDate(char[] bdms01BndRetractDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01BndRetractDate,0,getStringValue(),beginBdms01BndRetractDate,BDMS_01_BND_RETRACT_DATE_LEN);
       localBdms01BndRetractDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01BndRetractDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01BndRetractDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01BndRetractDate() {	 
   		return (substring(getStringValue(),beginBdms01BndRetractDate,beginBdms01BndRetractDate + BDMS_01_BND_RETRACT_DATE_LEN));
   	}
     int localBdms01BndRetractPriceCounter = -1;
     
     public boolean isBdms01BndRetractPriceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01BndRetractPriceCounter != sharedCounter;
         localBdms01BndRetractPriceCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01BndRetractPrice
	 *	@return bdms01BndRetractPrice
	 */
	public char[]  getBdms01BndRetractPriceString() {
	    return getCharArray(beginBdms01BndRetractPrice,BDMS_01_BND_RETRACT_PRICE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01BndRetractPriceIsNumeric() {
		    return isNumeric(beginBdms01BndRetractPrice
	                    ,beginBdms01BndRetractPrice + BDMS_01_BND_RETRACT_PRICE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_BND_RETRACT_PRICE_LEN = 18;
  protected  static final int BDMS_01_BND_RETRACT_PRICE_SCALE = 8;

   protected BigDecimal checkBdms01BndRetractPriceMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeBdms01BndRetractPrice
	 */
	protected void serializeBdms01BndRetractPrice(BigDecimal bdms01BndRetractPrice) {
	       putNumber(beginBdms01BndRetractPrice,bdms01BndRetractPrice,BDMS_01_BND_RETRACT_PRICE_LEN,BDMS_01_BND_RETRACT_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01BndRetractPriceCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01BndRetractPrice
	 */
   	protected  BigDecimal serializeBdms01BndRetractPrice(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginBdms01BndRetractPrice
		       ,18
		      );		 localBdms01BndRetractPriceCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_BND_RETRACT_PRICE_LEN,BDMS_01_BND_RETRACT_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01BndRetractPrice", beginBdms01BndRetractPrice,BDMS_01_BND_RETRACT_PRICE_LEN);
    	}
    }
    /**
	 *	refreshBdms01BndRetractPrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01BndRetractPrice() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01BndRetractPrice
			            ,BDMS_01_BND_RETRACT_PRICE_LEN
			            ,BDMS_01_BND_RETRACT_PRICE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01BndRetractPrice", beginBdms01BndRetractPrice,BDMS_01_BND_RETRACT_PRICE_LEN);
    }
   	}
     int localBdms01RtTypePutCdCounter = -1;
     public boolean isBdms01RtTypePutCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RtTypePutCdCounter != sharedCounter;
         localBdms01RtTypePutCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_RT_TYPE_PUT_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01RtTypePutCd
	 */
   protected void serializeBdms01RtTypePutCd(char[] bdms01RtTypePutCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RtTypePutCd,0,getStringValue(),beginBdms01RtTypePutCd,BDMS_01_RT_TYPE_PUT_CD_LEN);
       localBdms01RtTypePutCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RtTypePutCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01RtTypePutCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RtTypePutCd() {	 
   		return (substring(getStringValue(),beginBdms01RtTypePutCd,beginBdms01RtTypePutCd + BDMS_01_RT_TYPE_PUT_CD_LEN));
   	}
     int localBdms01RtFeatureFrqncCdCounter = -1;
     public boolean isBdms01RtFeatureFrqncCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RtFeatureFrqncCdCounter != sharedCounter;
         localBdms01RtFeatureFrqncCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_RT_FEATURE_FRQNC_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01RtFeatureFrqncCd
	 */
   protected void serializeBdms01RtFeatureFrqncCd(char[] bdms01RtFeatureFrqncCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RtFeatureFrqncCd,0,getStringValue(),beginBdms01RtFeatureFrqncCd,BDMS_01_RT_FEATURE_FRQNC_CD_LEN);
       localBdms01RtFeatureFrqncCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RtFeatureFrqncCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01RtFeatureFrqncCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RtFeatureFrqncCd() {	 
   		return (substring(getStringValue(),beginBdms01RtFeatureFrqncCd,beginBdms01RtFeatureFrqncCd + BDMS_01_RT_FEATURE_FRQNC_CD_LEN));
   	}
     int localBdms01RtRdmptPartialCdCounter = -1;
     public boolean isBdms01RtRdmptPartialCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RtRdmptPartialCdCounter != sharedCounter;
         localBdms01RtRdmptPartialCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_RT_RDMPT_PARTIAL_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01RtRdmptPartialCd
	 */
   protected void serializeBdms01RtRdmptPartialCd(char[] bdms01RtRdmptPartialCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RtRdmptPartialCd,0,getStringValue(),beginBdms01RtRdmptPartialCd,BDMS_01_RT_RDMPT_PARTIAL_CD_LEN);
       localBdms01RtRdmptPartialCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RtRdmptPartialCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01RtRdmptPartialCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RtRdmptPartialCd() {	 
   		return (substring(getStringValue(),beginBdms01RtRdmptPartialCd,beginBdms01RtRdmptPartialCd + BDMS_01_RT_RDMPT_PARTIAL_CD_LEN));
   	}
     int localBdms01RtSelectionBondCdCounter = -1;
     public boolean isBdms01RtSelectionBondCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RtSelectionBondCdCounter != sharedCounter;
         localBdms01RtSelectionBondCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_RT_SELECTION_BOND_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01RtSelectionBondCd
	 */
   protected void serializeBdms01RtSelectionBondCd(char[] bdms01RtSelectionBondCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RtSelectionBondCd,0,getStringValue(),beginBdms01RtSelectionBondCd,BDMS_01_RT_SELECTION_BOND_CD_LEN);
       localBdms01RtSelectionBondCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RtSelectionBondCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01RtSelectionBondCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RtSelectionBondCd() {	 
   		return (substring(getStringValue(),beginBdms01RtSelectionBondCd,beginBdms01RtSelectionBondCd + BDMS_01_RT_SELECTION_BOND_CD_LEN));
   	}




}
  
