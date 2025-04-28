package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01BondBasicSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Bdms01BondBasicSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01BondBasicSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_BOND_BASIC_SEG_DATA_LENGTH = 249;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01BondBasicSegSqlcd;
            protected  int beginMsdBondInterestRate;
            protected  int beginBdms01DateCouponCd;
            protected  int beginMsdBondDatedIndicator;
            protected  int beginMsdStateCode;
            protected  int beginMsdInsuranceCode;
            protected  int beginBdms01InsJjkCd;
            protected  int beginMsdBondGuaranteedInd;
            protected  int beginMsdBndEvalueCode;
            protected  int beginMsdBondActualPayDate;
            protected  int beginBdms01DatePayActualCd;
            protected  int beginMsdBondFirstCpnDt;
            protected  int beginBdms01FrqncRateChgCd;
            protected  int beginBdms01MaturityDt;
            protected  int beginBdms01AccrueIntDt;
            protected  int beginBdms01PayInterestDt;
            protected  int beginBdms01CouponFirstDt;
            protected  int beginBdms01CalcYldIntCd;
            protected  int beginBdms01RecordHldEstDt;
            protected  int beginBdms01PrdLongShortCd;
            protected  int beginBdms01ExtCallInd;
            protected  int beginMsdExtraordinaryCall;
            protected  int beginBdms01ChngRateCd;
            protected  int beginBdms01MuniMultInd;
            protected  int beginBdms01SbaInd;
            protected  int beginBdms01TaxExmptBankInd;
            protected  int beginBdms01StrpdBondInd;
            protected  int beginBdms01DefaultInd;
            protected  int beginBdms01SerialBondNbr;
            protected  int beginBdms01InterestPayCd;
            protected  int beginBdms01NbrDayPayCd;
            protected  int beginBdms01CmrlBondCd;
            protected  int beginBdms01TypeGovtCd;
            protected  int beginBdms01StateCd;
            protected  int beginBdms01GovtBackCd;
            protected  int beginBdms01TypePaperCd;
            protected  int beginBdms01PymntArreasInd;
            protected  int beginBdms01RdmptPrtlCd;
            protected  int beginBdms01OrgnlIntPayDt;
            protected  int beginBdms01EvltnBondCd;
            protected  int beginBdms01RefundReasonCd;
            protected  int beginBdms01CanadaBondInd;
            protected  int beginBdms01ErbndInd;
            protected  int beginBdms01CallTypeCd;
            protected  int beginBdms01TypeMuniCd;
            protected  int beginBdms01AgencyInd;
            protected  int beginBdms01TiisInd;
            protected  int beginBdms01IntCalcnCd;
            protected  int beginBdms01AstBckdCd;
            protected  int beginBdms01GnmaSrlNoteInd;
            protected  int beginBdms01TraceInd;
            protected  int beginBdms01TbaInd;
            protected  int beginBdms01MnmmDnmntAmt;
            protected  int beginBdms01ClNoticeDaysNbr;
            protected  int beginBdms01SinkingFundInd;
            protected  int beginBdms01DefeaseInd;
            protected  int beginBdms01RvnuInd;
            protected  int beginBdms01CvrsnRt;
            protected  int beginBdms01CvrsnPrcAmt;
            protected  int beginBdms01CvrsnExpDt;
	
	/**
	* Constructor for Bdms01BondBasicSegDataSerialized
	**/
    public Bdms01BondBasicSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01BondBasicSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01BondBasicSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01BondBasicSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2538); // serialize this field at offset 2538 by default 
    }
    
	/**
	* sets parent for this Bdms01BondBasicSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2538 by default
    }    
	/**
	* initializes the field in Bdms01BondBasicSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_BOND_BASIC_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01BondBasicSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdBondInterestRate = getStartOffset() + 4;	// set offset for serialization
  
  
  
             beginBdms01DateCouponCd = getStartOffset() + 23;	// set offset for serialization
  
  
  
             beginMsdBondDatedIndicator = getStartOffset() + 43;	// set offset for serialization
  
             beginMsdStateCode = getStartOffset() + 44;	// set offset for serialization
  
             beginMsdInsuranceCode = getStartOffset() + 46;	// set offset for serialization
  
             beginBdms01InsJjkCd = getStartOffset() + 46;	// set offset for serialization
  
             beginMsdBondGuaranteedInd = getStartOffset() + 48;	// set offset for serialization
  
             beginMsdBndEvalueCode = getStartOffset() + 49;	// set offset for serialization
  
  
             beginMsdBondActualPayDate = getStartOffset() + 58;	// set offset for serialization
  
             beginBdms01DatePayActualCd = getStartOffset() + 58;	// set offset for serialization
  
             beginMsdBondFirstCpnDt = getStartOffset() + 62;	// set offset for serialization
  
             beginBdms01FrqncRateChgCd = getStartOffset() + 68;	// set offset for serialization
  
  
             beginBdms01MaturityDt = getStartOffset() + 70;	// set offset for serialization
  
             beginBdms01AccrueIntDt = getStartOffset() + 80;	// set offset for serialization
  
             beginBdms01PayInterestDt = getStartOffset() + 90;	// set offset for serialization
  
             beginBdms01CouponFirstDt = getStartOffset() + 100;	// set offset for serialization
  
             beginBdms01CalcYldIntCd = getStartOffset() + 110;	// set offset for serialization
  
             beginBdms01RecordHldEstDt = getStartOffset() + 111;	// set offset for serialization
  
             beginBdms01PrdLongShortCd = getStartOffset() + 121;	// set offset for serialization
  
             beginBdms01ExtCallInd = getStartOffset() + 122;	// set offset for serialization
  
             beginMsdExtraordinaryCall = getStartOffset() + 122;	// set offset for serialization
  
             beginBdms01ChngRateCd = getStartOffset() + 123;	// set offset for serialization
  
             beginBdms01MuniMultInd = getStartOffset() + 124;	// set offset for serialization
  
             beginBdms01SbaInd = getStartOffset() + 125;	// set offset for serialization
  
             beginBdms01TaxExmptBankInd = getStartOffset() + 126;	// set offset for serialization
  
             beginBdms01StrpdBondInd = getStartOffset() + 127;	// set offset for serialization
  
             beginBdms01DefaultInd = getStartOffset() + 128;	// set offset for serialization
  
             beginBdms01SerialBondNbr = getStartOffset() + 129;	// set offset for serialization
  
             beginBdms01InterestPayCd = getStartOffset() + 136;	// set offset for serialization
  
             beginBdms01NbrDayPayCd = getStartOffset() + 138;	// set offset for serialization
  
             beginBdms01CmrlBondCd = getStartOffset() + 142;	// set offset for serialization
  
             beginBdms01TypeGovtCd = getStartOffset() + 144;	// set offset for serialization
  
             beginBdms01StateCd = getStartOffset() + 146;	// set offset for serialization
  
             beginBdms01GovtBackCd = getStartOffset() + 148;	// set offset for serialization
  
             beginBdms01TypePaperCd = getStartOffset() + 150;	// set offset for serialization
  
             beginBdms01PymntArreasInd = getStartOffset() + 152;	// set offset for serialization
  
             beginBdms01RdmptPrtlCd = getStartOffset() + 153;	// set offset for serialization
  
             beginBdms01OrgnlIntPayDt = getStartOffset() + 155;	// set offset for serialization
  
             beginBdms01EvltnBondCd = getStartOffset() + 165;	// set offset for serialization
  
             beginBdms01RefundReasonCd = getStartOffset() + 167;	// set offset for serialization
  
             beginBdms01CanadaBondInd = getStartOffset() + 169;	// set offset for serialization
  
             beginBdms01ErbndInd = getStartOffset() + 170;	// set offset for serialization
  
             beginBdms01CallTypeCd = getStartOffset() + 171;	// set offset for serialization
  
             beginBdms01TypeMuniCd = getStartOffset() + 173;	// set offset for serialization
  
             beginBdms01AgencyInd = getStartOffset() + 177;	// set offset for serialization
  
             beginBdms01TiisInd = getStartOffset() + 178;	// set offset for serialization
  
             beginBdms01IntCalcnCd = getStartOffset() + 179;	// set offset for serialization
  
             beginBdms01AstBckdCd = getStartOffset() + 183;	// set offset for serialization
  
             beginBdms01GnmaSrlNoteInd = getStartOffset() + 185;	// set offset for serialization
  
             beginBdms01TraceInd = getStartOffset() + 186;	// set offset for serialization
  
             beginBdms01TbaInd = getStartOffset() + 187;	// set offset for serialization
  
             beginBdms01MnmmDnmntAmt = getStartOffset() + 188;	// set offset for serialization
  
             beginBdms01ClNoticeDaysNbr = getStartOffset() + 201;	// set offset for serialization
  
             beginBdms01SinkingFundInd = getStartOffset() + 204;	// set offset for serialization
  
             beginBdms01DefeaseInd = getStartOffset() + 205;	// set offset for serialization
  
             beginBdms01RvnuInd = getStartOffset() + 206;	// set offset for serialization
  
             beginBdms01CvrsnRt = getStartOffset() + 207;	// set offset for serialization
  
             beginBdms01CvrsnPrcAmt = getStartOffset() + 222;	// set offset for serialization
  
             beginBdms01CvrsnExpDt = getStartOffset() + 237;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01BondBasicSegSqlcdCounter = -1;
     public boolean isBdms01BondBasicSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01BondBasicSegSqlcdCounter != sharedCounter;
         localBdms01BondBasicSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01BondBasicSegSqlcd
	 *	@return bdms01BondBasicSegSqlcd
	 */
	public char[]  getBdms01BondBasicSegSqlcdString() {
	     return getCharArray(beginBdms01BondBasicSegSqlcd,BDMS_01_BOND_BASIC_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01BondBasicSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01BondBasicSegSqlcd
	                    ,beginBdms01BondBasicSegSqlcd + BDMS_01_BOND_BASIC_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_BOND_BASIC_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01BondBasicSegSqlcd
	 */
	protected void serializeBdms01BondBasicSegSqlcd(int bdms01BondBasicSegSqlcd) {
		 putNumber(beginBdms01BondBasicSegSqlcd,bdms01BondBasicSegSqlcd,BDMS_01_BOND_BASIC_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01BondBasicSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01BondBasicSegSqlcd
	 */
   	protected  int serializeBdms01BondBasicSegSqlcd(char[] value) {
	    int  bdms01BondBasicSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01BondBasicSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01BondBasicSegSqlcd
		       ,4
		      );
		 localBdms01BondBasicSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01BondBasicSegSqlcd;
    }

   protected int checkBdms01BondBasicSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01BondBasicSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01BondBasicSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01BondBasicSegSqlcd
			                 ,BDMS_01_BOND_BASIC_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01BondBasicSegSqlcd", beginBdms01BondBasicSegSqlcd,BDMS_01_BOND_BASIC_SEG_SQLCD_LEN);
    }
   	}
     int localMsdBondInterestRateCounter = -1;
     
     public boolean isMsdBondInterestRateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondInterestRateCounter != sharedCounter;
         localMsdBondInterestRateCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdBondInterestRate
	 *	@return msdBondInterestRate
	 */
	public char[]  getMsdBondInterestRateString() {
	    return getCharArray(beginMsdBondInterestRate,MSD_BOND_INTEREST_RATE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondInterestRateIsNumeric() {
		    return isNumeric(beginMsdBondInterestRate
	                    ,beginMsdBondInterestRate + MSD_BOND_INTEREST_RATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_BOND_INTEREST_RATE_LEN = 11;
  protected  static final int MSD_BOND_INTEREST_RATE_SCALE = 8;

   protected BigDecimal checkMsdBondInterestRateMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,11/*precision*/);
   }

  	/**
	 * serializeMsdBondInterestRate
	 */
	protected void serializeMsdBondInterestRate(BigDecimal msdBondInterestRate) {
	       putNumber(beginMsdBondInterestRate,msdBondInterestRate,MSD_BOND_INTEREST_RATE_LEN,MSD_BOND_INTEREST_RATE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondInterestRateCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdBondInterestRate
	 */
   	protected  BigDecimal serializeMsdBondInterestRate(char[] value) throws CFException {
        if (value.length < 11) value = pad(11, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginMsdBondInterestRate
		       ,11
		      );		 localMsdBondInterestRateCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_BOND_INTEREST_RATE_LEN,MSD_BOND_INTEREST_RATE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdBondInterestRate", beginMsdBondInterestRate,MSD_BOND_INTEREST_RATE_LEN);
    	}
    }
    /**
	 *	refreshMsdBondInterestRate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdBondInterestRate() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdBondInterestRate
			            ,MSD_BOND_INTEREST_RATE_LEN
			            ,MSD_BOND_INTEREST_RATE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondInterestRate", beginMsdBondInterestRate,MSD_BOND_INTEREST_RATE_LEN);
    }
   	}
     int localBdms01DateCouponCdCounter = -1;
     public boolean isBdms01DateCouponCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01DateCouponCdCounter != sharedCounter;
         localBdms01DateCouponCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_DATE_COUPON_CD_LEN = 4;
	/**
	 * 	serialize this Bdms01DateCouponCd
	 */
   protected void serializeBdms01DateCouponCd(char[] bdms01DateCouponCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01DateCouponCd,0,getStringValue(),beginBdms01DateCouponCd,BDMS_01_DATE_COUPON_CD_LEN);
       localBdms01DateCouponCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01DateCouponCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshBdms01DateCouponCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01DateCouponCd() {	 
   		return (substring(getStringValue(),beginBdms01DateCouponCd,beginBdms01DateCouponCd + BDMS_01_DATE_COUPON_CD_LEN));
   	}
     int localMsdBondDatedIndicatorCounter = -1;
     public boolean isMsdBondDatedIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondDatedIndicatorCounter != sharedCounter;
         localMsdBondDatedIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_BOND_DATED_INDICATOR_LEN = 1;
	/**
	 * 	serialize this MsdBondDatedIndicator
	 */
   protected void serializeMsdBondDatedIndicator(char[] msdBondDatedIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdBondDatedIndicator,0,getStringValue(),beginMsdBondDatedIndicator,MSD_BOND_DATED_INDICATOR_LEN);
       localMsdBondDatedIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdBondDatedIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdBondDatedIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdBondDatedIndicator() {	 
   		return (substring(getStringValue(),beginMsdBondDatedIndicator,beginMsdBondDatedIndicator + MSD_BOND_DATED_INDICATOR_LEN));
   	}
     int localMsdStateCodeCounter = -1;
     public boolean isMsdStateCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdStateCodeCounter != sharedCounter;
         localMsdStateCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_STATE_CODE_LEN = 2;
	/**
	 * 	serialize this MsdStateCode
	 */
   protected void serializeMsdStateCode(char[] msdStateCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdStateCode,0,getStringValue(),beginMsdStateCode,MSD_STATE_CODE_LEN);
       localMsdStateCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdStateCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMsdStateCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdStateCode() {	 
   		return (substring(getStringValue(),beginMsdStateCode,beginMsdStateCode + MSD_STATE_CODE_LEN));
   	}
     int localMsdInsuranceCodeCounter = -1;
     public boolean isMsdInsuranceCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdInsuranceCodeCounter != sharedCounter;
         localMsdInsuranceCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_INSURANCE_CODE_LEN = 2;
	/**
	 * 	serialize this MsdInsuranceCode
	 */
   protected void serializeMsdInsuranceCode(char[] msdInsuranceCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdInsuranceCode,0,getStringValue(),beginMsdInsuranceCode,MSD_INSURANCE_CODE_LEN);
       localMsdInsuranceCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdInsuranceCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMsdInsuranceCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdInsuranceCode() {	 
   		return (substring(getStringValue(),beginMsdInsuranceCode,beginMsdInsuranceCode + MSD_INSURANCE_CODE_LEN));
   	}
     int localBdms01InsJjkCdCounter = -1;
     public boolean isBdms01InsJjkCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01InsJjkCdCounter != sharedCounter;
         localBdms01InsJjkCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_INS_JJK_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01InsJjkCd
	 */
   protected void serializeBdms01InsJjkCd(char[] bdms01InsJjkCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01InsJjkCd,0,getStringValue(),beginBdms01InsJjkCd,BDMS_01_INS_JJK_CD_LEN);
       localBdms01InsJjkCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01InsJjkCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01InsJjkCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01InsJjkCd() {	 
   		return (substring(getStringValue(),beginBdms01InsJjkCd,beginBdms01InsJjkCd + BDMS_01_INS_JJK_CD_LEN));
   	}
     int localMsdBondGuaranteedIndCounter = -1;
     public boolean isMsdBondGuaranteedIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondGuaranteedIndCounter != sharedCounter;
         localMsdBondGuaranteedIndCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_BOND_GUARANTEED_IND_LEN = 1;
	/**
	 * 	serialize this MsdBondGuaranteedInd
	 */
   protected void serializeMsdBondGuaranteedInd(char[] msdBondGuaranteedInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdBondGuaranteedInd,0,getStringValue(),beginMsdBondGuaranteedInd,MSD_BOND_GUARANTEED_IND_LEN);
       localMsdBondGuaranteedIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdBondGuaranteedIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdBondGuaranteedInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdBondGuaranteedInd() {	 
   		return (substring(getStringValue(),beginMsdBondGuaranteedInd,beginMsdBondGuaranteedInd + MSD_BOND_GUARANTEED_IND_LEN));
   	}
     int localMsdBndEvalueCodeCounter = -1;
     public boolean isMsdBndEvalueCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBndEvalueCodeCounter != sharedCounter;
         localMsdBndEvalueCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_BND_EVALUE_CODE_LEN = 1;
	/**
	 * 	serialize this MsdBndEvalueCode
	 */
   protected void serializeMsdBndEvalueCode(char[] msdBndEvalueCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdBndEvalueCode,0,getStringValue(),beginMsdBndEvalueCode,MSD_BND_EVALUE_CODE_LEN);
       localMsdBndEvalueCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdBndEvalueCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdBndEvalueCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdBndEvalueCode() {	 
   		return (substring(getStringValue(),beginMsdBndEvalueCode,beginMsdBndEvalueCode + MSD_BND_EVALUE_CODE_LEN));
   	}
     int localMsdBondActualPayDateCounter = -1;
     public boolean isMsdBondActualPayDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondActualPayDateCounter != sharedCounter;
         localMsdBondActualPayDateCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_BOND_ACTUAL_PAY_DATE_LEN = 4;
	/**
	 * 	serialize this MsdBondActualPayDate
	 */
   protected void serializeMsdBondActualPayDate(char[] msdBondActualPayDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdBondActualPayDate,0,getStringValue(),beginMsdBondActualPayDate,MSD_BOND_ACTUAL_PAY_DATE_LEN);
       localMsdBondActualPayDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdBondActualPayDateConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMsdBondActualPayDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdBondActualPayDate() {	 
   		return (substring(getStringValue(),beginMsdBondActualPayDate,beginMsdBondActualPayDate + MSD_BOND_ACTUAL_PAY_DATE_LEN));
   	}
     int localBdms01DatePayActualCdCounter = -1;
     public boolean isBdms01DatePayActualCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01DatePayActualCdCounter != sharedCounter;
         localBdms01DatePayActualCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_DATE_PAY_ACTUAL_CD_LEN = 4;
	/**
	 * 	serialize this Bdms01DatePayActualCd
	 */
   protected void serializeBdms01DatePayActualCd(char[] bdms01DatePayActualCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01DatePayActualCd,0,getStringValue(),beginBdms01DatePayActualCd,BDMS_01_DATE_PAY_ACTUAL_CD_LEN);
       localBdms01DatePayActualCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01DatePayActualCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshBdms01DatePayActualCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01DatePayActualCd() {	 
   		return (substring(getStringValue(),beginBdms01DatePayActualCd,beginBdms01DatePayActualCd + BDMS_01_DATE_PAY_ACTUAL_CD_LEN));
   	}
     int localMsdBondFirstCpnDtCounter = -1;
     public boolean isMsdBondFirstCpnDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdBondFirstCpnDtCounter != sharedCounter;
         localMsdBondFirstCpnDtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdBondFirstCpnDt
	 *	@return msdBondFirstCpnDt
	 */
	public char[]  getMsdBondFirstCpnDtString() {
	     return getCharArray(beginMsdBondFirstCpnDt,MSD_BOND_FIRST_CPN_DT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdBondFirstCpnDtIsNumeric() {
	    return isNumeric(beginMsdBondFirstCpnDt
	                    ,beginMsdBondFirstCpnDt + MSD_BOND_FIRST_CPN_DT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_BOND_FIRST_CPN_DT_LEN = 6;
  	/**
	 * serializeMsdBondFirstCpnDt
	 */
	protected void serializeMsdBondFirstCpnDt(long msdBondFirstCpnDt) {
		 putNumber(beginMsdBondFirstCpnDt,msdBondFirstCpnDt,MSD_BOND_FIRST_CPN_DT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdBondFirstCpnDtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdBondFirstCpnDt
	 */
   	protected  long serializeMsdBondFirstCpnDt(char[] value) {
	    long  msdBondFirstCpnDt;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdBondFirstCpnDt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMsdBondFirstCpnDt
		       ,6
		      );
		 localMsdBondFirstCpnDtCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdBondFirstCpnDt;
    }

   protected long checkMsdBondFirstCpnDtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdBondFirstCpnDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdBondFirstCpnDt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdBondFirstCpnDt
			                 ,MSD_BOND_FIRST_CPN_DT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdBondFirstCpnDt", beginMsdBondFirstCpnDt,MSD_BOND_FIRST_CPN_DT_LEN);
    }
   	}
     int localBdms01FrqncRateChgCdCounter = -1;
     public boolean isBdms01FrqncRateChgCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01FrqncRateChgCdCounter != sharedCounter;
         localBdms01FrqncRateChgCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FRQNC_RATE_CHG_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01FrqncRateChgCd
	 */
   protected void serializeBdms01FrqncRateChgCd(char[] bdms01FrqncRateChgCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01FrqncRateChgCd,0,getStringValue(),beginBdms01FrqncRateChgCd,BDMS_01_FRQNC_RATE_CHG_CD_LEN);
       localBdms01FrqncRateChgCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01FrqncRateChgCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01FrqncRateChgCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01FrqncRateChgCd() {	 
   		return (substring(getStringValue(),beginBdms01FrqncRateChgCd,beginBdms01FrqncRateChgCd + BDMS_01_FRQNC_RATE_CHG_CD_LEN));
   	}
     int localBdms01MaturityDtCounter = -1;
     public boolean isBdms01MaturityDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MaturityDtCounter != sharedCounter;
         localBdms01MaturityDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_MATURITY_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01MaturityDt
	 */
   protected void serializeBdms01MaturityDt(char[] bdms01MaturityDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01MaturityDt,0,getStringValue(),beginBdms01MaturityDt,BDMS_01_MATURITY_DT_LEN);
       localBdms01MaturityDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01MaturityDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01MaturityDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01MaturityDt() {	 
   		return (substring(getStringValue(),beginBdms01MaturityDt,beginBdms01MaturityDt + BDMS_01_MATURITY_DT_LEN));
   	}
     int localBdms01AccrueIntDtCounter = -1;
     public boolean isBdms01AccrueIntDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01AccrueIntDtCounter != sharedCounter;
         localBdms01AccrueIntDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_ACCRUE_INT_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01AccrueIntDt
	 */
   protected void serializeBdms01AccrueIntDt(char[] bdms01AccrueIntDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01AccrueIntDt,0,getStringValue(),beginBdms01AccrueIntDt,BDMS_01_ACCRUE_INT_DT_LEN);
       localBdms01AccrueIntDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01AccrueIntDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01AccrueIntDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01AccrueIntDt() {	 
   		return (substring(getStringValue(),beginBdms01AccrueIntDt,beginBdms01AccrueIntDt + BDMS_01_ACCRUE_INT_DT_LEN));
   	}
     int localBdms01PayInterestDtCounter = -1;
     public boolean isBdms01PayInterestDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PayInterestDtCounter != sharedCounter;
         localBdms01PayInterestDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PAY_INTEREST_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01PayInterestDt
	 */
   protected void serializeBdms01PayInterestDt(char[] bdms01PayInterestDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PayInterestDt,0,getStringValue(),beginBdms01PayInterestDt,BDMS_01_PAY_INTEREST_DT_LEN);
       localBdms01PayInterestDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PayInterestDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01PayInterestDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PayInterestDt() {	 
   		return (substring(getStringValue(),beginBdms01PayInterestDt,beginBdms01PayInterestDt + BDMS_01_PAY_INTEREST_DT_LEN));
   	}
     int localBdms01CouponFirstDtCounter = -1;
     public boolean isBdms01CouponFirstDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CouponFirstDtCounter != sharedCounter;
         localBdms01CouponFirstDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_COUPON_FIRST_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01CouponFirstDt
	 */
   protected void serializeBdms01CouponFirstDt(char[] bdms01CouponFirstDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CouponFirstDt,0,getStringValue(),beginBdms01CouponFirstDt,BDMS_01_COUPON_FIRST_DT_LEN);
       localBdms01CouponFirstDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CouponFirstDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01CouponFirstDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CouponFirstDt() {	 
   		return (substring(getStringValue(),beginBdms01CouponFirstDt,beginBdms01CouponFirstDt + BDMS_01_COUPON_FIRST_DT_LEN));
   	}
     int localBdms01CalcYldIntCdCounter = -1;
     public boolean isBdms01CalcYldIntCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CalcYldIntCdCounter != sharedCounter;
         localBdms01CalcYldIntCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CALC_YLD_INT_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01CalcYldIntCd
	 */
   protected void serializeBdms01CalcYldIntCd(char[] bdms01CalcYldIntCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CalcYldIntCd,0,getStringValue(),beginBdms01CalcYldIntCd,BDMS_01_CALC_YLD_INT_CD_LEN);
       localBdms01CalcYldIntCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CalcYldIntCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01CalcYldIntCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CalcYldIntCd() {	 
   		return (substring(getStringValue(),beginBdms01CalcYldIntCd,beginBdms01CalcYldIntCd + BDMS_01_CALC_YLD_INT_CD_LEN));
   	}
     int localBdms01RecordHldEstDtCounter = -1;
     public boolean isBdms01RecordHldEstDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RecordHldEstDtCounter != sharedCounter;
         localBdms01RecordHldEstDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_RECORD_HLD_EST_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01RecordHldEstDt
	 */
   protected void serializeBdms01RecordHldEstDt(char[] bdms01RecordHldEstDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RecordHldEstDt,0,getStringValue(),beginBdms01RecordHldEstDt,BDMS_01_RECORD_HLD_EST_DT_LEN);
       localBdms01RecordHldEstDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RecordHldEstDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01RecordHldEstDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RecordHldEstDt() {	 
   		return (substring(getStringValue(),beginBdms01RecordHldEstDt,beginBdms01RecordHldEstDt + BDMS_01_RECORD_HLD_EST_DT_LEN));
   	}
     int localBdms01PrdLongShortCdCounter = -1;
     public boolean isBdms01PrdLongShortCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PrdLongShortCdCounter != sharedCounter;
         localBdms01PrdLongShortCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PRD_LONG_SHORT_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01PrdLongShortCd
	 */
   protected void serializeBdms01PrdLongShortCd(char[] bdms01PrdLongShortCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PrdLongShortCd,0,getStringValue(),beginBdms01PrdLongShortCd,BDMS_01_PRD_LONG_SHORT_CD_LEN);
       localBdms01PrdLongShortCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PrdLongShortCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01PrdLongShortCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PrdLongShortCd() {	 
   		return (substring(getStringValue(),beginBdms01PrdLongShortCd,beginBdms01PrdLongShortCd + BDMS_01_PRD_LONG_SHORT_CD_LEN));
   	}
     int localBdms01ExtCallIndCounter = -1;
     public boolean isBdms01ExtCallIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ExtCallIndCounter != sharedCounter;
         localBdms01ExtCallIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_EXT_CALL_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01ExtCallInd
	 */
   protected void serializeBdms01ExtCallInd(char[] bdms01ExtCallInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ExtCallInd,0,getStringValue(),beginBdms01ExtCallInd,BDMS_01_EXT_CALL_IND_LEN);
       localBdms01ExtCallIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ExtCallIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01ExtCallInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ExtCallInd() {	 
   		return (substring(getStringValue(),beginBdms01ExtCallInd,beginBdms01ExtCallInd + BDMS_01_EXT_CALL_IND_LEN));
   	}
     int localMsdExtraordinaryCallCounter = -1;
     public boolean isMsdExtraordinaryCallModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdExtraordinaryCallCounter != sharedCounter;
         localMsdExtraordinaryCallCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_EXTRAORDINARY_CALL_LEN = 1;
	/**
	 * 	serialize this MsdExtraordinaryCall
	 */
   protected void serializeMsdExtraordinaryCall(char[] msdExtraordinaryCall) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdExtraordinaryCall,0,getStringValue(),beginMsdExtraordinaryCall,MSD_EXTRAORDINARY_CALL_LEN);
       localMsdExtraordinaryCallCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdExtraordinaryCallConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdExtraordinaryCall is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdExtraordinaryCall() {	 
   		return (substring(getStringValue(),beginMsdExtraordinaryCall,beginMsdExtraordinaryCall + MSD_EXTRAORDINARY_CALL_LEN));
   	}
     int localBdms01ChngRateCdCounter = -1;
     public boolean isBdms01ChngRateCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ChngRateCdCounter != sharedCounter;
         localBdms01ChngRateCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CHNG_RATE_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01ChngRateCd
	 */
   protected void serializeBdms01ChngRateCd(char[] bdms01ChngRateCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ChngRateCd,0,getStringValue(),beginBdms01ChngRateCd,BDMS_01_CHNG_RATE_CD_LEN);
       localBdms01ChngRateCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ChngRateCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01ChngRateCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ChngRateCd() {	 
   		return (substring(getStringValue(),beginBdms01ChngRateCd,beginBdms01ChngRateCd + BDMS_01_CHNG_RATE_CD_LEN));
   	}
     int localBdms01MuniMultIndCounter = -1;
     public boolean isBdms01MuniMultIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MuniMultIndCounter != sharedCounter;
         localBdms01MuniMultIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_MUNI_MULT_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01MuniMultInd
	 */
   protected void serializeBdms01MuniMultInd(char[] bdms01MuniMultInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01MuniMultInd,0,getStringValue(),beginBdms01MuniMultInd,BDMS_01_MUNI_MULT_IND_LEN);
       localBdms01MuniMultIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01MuniMultIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01MuniMultInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01MuniMultInd() {	 
   		return (substring(getStringValue(),beginBdms01MuniMultInd,beginBdms01MuniMultInd + BDMS_01_MUNI_MULT_IND_LEN));
   	}
     int localBdms01SbaIndCounter = -1;
     public boolean isBdms01SbaIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SbaIndCounter != sharedCounter;
         localBdms01SbaIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SBA_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01SbaInd
	 */
   protected void serializeBdms01SbaInd(char[] bdms01SbaInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SbaInd,0,getStringValue(),beginBdms01SbaInd,BDMS_01_SBA_IND_LEN);
       localBdms01SbaIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SbaIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01SbaInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SbaInd() {	 
   		return (substring(getStringValue(),beginBdms01SbaInd,beginBdms01SbaInd + BDMS_01_SBA_IND_LEN));
   	}
     int localBdms01TaxExmptBankIndCounter = -1;
     public boolean isBdms01TaxExmptBankIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TaxExmptBankIndCounter != sharedCounter;
         localBdms01TaxExmptBankIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TAX_EXMPT_BANK_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01TaxExmptBankInd
	 */
   protected void serializeBdms01TaxExmptBankInd(char[] bdms01TaxExmptBankInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TaxExmptBankInd,0,getStringValue(),beginBdms01TaxExmptBankInd,BDMS_01_TAX_EXMPT_BANK_IND_LEN);
       localBdms01TaxExmptBankIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TaxExmptBankIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01TaxExmptBankInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TaxExmptBankInd() {	 
   		return (substring(getStringValue(),beginBdms01TaxExmptBankInd,beginBdms01TaxExmptBankInd + BDMS_01_TAX_EXMPT_BANK_IND_LEN));
   	}
     int localBdms01StrpdBondIndCounter = -1;
     public boolean isBdms01StrpdBondIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01StrpdBondIndCounter != sharedCounter;
         localBdms01StrpdBondIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_STRPD_BOND_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01StrpdBondInd
	 */
   protected void serializeBdms01StrpdBondInd(char[] bdms01StrpdBondInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01StrpdBondInd,0,getStringValue(),beginBdms01StrpdBondInd,BDMS_01_STRPD_BOND_IND_LEN);
       localBdms01StrpdBondIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01StrpdBondIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01StrpdBondInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01StrpdBondInd() {	 
   		return (substring(getStringValue(),beginBdms01StrpdBondInd,beginBdms01StrpdBondInd + BDMS_01_STRPD_BOND_IND_LEN));
   	}
     int localBdms01DefaultIndCounter = -1;
     public boolean isBdms01DefaultIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01DefaultIndCounter != sharedCounter;
         localBdms01DefaultIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_DEFAULT_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01DefaultInd
	 */
   protected void serializeBdms01DefaultInd(char[] bdms01DefaultInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01DefaultInd,0,getStringValue(),beginBdms01DefaultInd,BDMS_01_DEFAULT_IND_LEN);
       localBdms01DefaultIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01DefaultIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01DefaultInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01DefaultInd() {	 
   		return (substring(getStringValue(),beginBdms01DefaultInd,beginBdms01DefaultInd + BDMS_01_DEFAULT_IND_LEN));
   	}
     int localBdms01SerialBondNbrCounter = -1;
     public boolean isBdms01SerialBondNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SerialBondNbrCounter != sharedCounter;
         localBdms01SerialBondNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SERIAL_BOND_NBR_LEN = 7;
	/**
	 * 	serialize this Bdms01SerialBondNbr
	 */
   protected void serializeBdms01SerialBondNbr(char[] bdms01SerialBondNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SerialBondNbr,0,getStringValue(),beginBdms01SerialBondNbr,BDMS_01_SERIAL_BOND_NBR_LEN);
       localBdms01SerialBondNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SerialBondNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshBdms01SerialBondNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SerialBondNbr() {	 
   		return (substring(getStringValue(),beginBdms01SerialBondNbr,beginBdms01SerialBondNbr + BDMS_01_SERIAL_BOND_NBR_LEN));
   	}
     int localBdms01InterestPayCdCounter = -1;
     public boolean isBdms01InterestPayCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01InterestPayCdCounter != sharedCounter;
         localBdms01InterestPayCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_INTEREST_PAY_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01InterestPayCd
	 */
   protected void serializeBdms01InterestPayCd(char[] bdms01InterestPayCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01InterestPayCd,0,getStringValue(),beginBdms01InterestPayCd,BDMS_01_INTEREST_PAY_CD_LEN);
       localBdms01InterestPayCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01InterestPayCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01InterestPayCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01InterestPayCd() {	 
   		return (substring(getStringValue(),beginBdms01InterestPayCd,beginBdms01InterestPayCd + BDMS_01_INTEREST_PAY_CD_LEN));
   	}
     int localBdms01NbrDayPayCdCounter = -1;
     public boolean isBdms01NbrDayPayCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01NbrDayPayCdCounter != sharedCounter;
         localBdms01NbrDayPayCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_NBR_DAY_PAY_CD_LEN = 4;
	/**
	 * 	serialize this Bdms01NbrDayPayCd
	 */
   protected void serializeBdms01NbrDayPayCd(char[] bdms01NbrDayPayCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01NbrDayPayCd,0,getStringValue(),beginBdms01NbrDayPayCd,BDMS_01_NBR_DAY_PAY_CD_LEN);
       localBdms01NbrDayPayCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01NbrDayPayCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshBdms01NbrDayPayCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01NbrDayPayCd() {	 
   		return (substring(getStringValue(),beginBdms01NbrDayPayCd,beginBdms01NbrDayPayCd + BDMS_01_NBR_DAY_PAY_CD_LEN));
   	}
     int localBdms01CmrlBondCdCounter = -1;
     public boolean isBdms01CmrlBondCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CmrlBondCdCounter != sharedCounter;
         localBdms01CmrlBondCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CMRL_BOND_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01CmrlBondCd
	 */
   protected void serializeBdms01CmrlBondCd(char[] bdms01CmrlBondCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CmrlBondCd,0,getStringValue(),beginBdms01CmrlBondCd,BDMS_01_CMRL_BOND_CD_LEN);
       localBdms01CmrlBondCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CmrlBondCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01CmrlBondCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CmrlBondCd() {	 
   		return (substring(getStringValue(),beginBdms01CmrlBondCd,beginBdms01CmrlBondCd + BDMS_01_CMRL_BOND_CD_LEN));
   	}
     int localBdms01TypeGovtCdCounter = -1;
     public boolean isBdms01TypeGovtCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TypeGovtCdCounter != sharedCounter;
         localBdms01TypeGovtCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TYPE_GOVT_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01TypeGovtCd
	 */
   protected void serializeBdms01TypeGovtCd(char[] bdms01TypeGovtCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TypeGovtCd,0,getStringValue(),beginBdms01TypeGovtCd,BDMS_01_TYPE_GOVT_CD_LEN);
       localBdms01TypeGovtCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TypeGovtCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01TypeGovtCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TypeGovtCd() {	 
   		return (substring(getStringValue(),beginBdms01TypeGovtCd,beginBdms01TypeGovtCd + BDMS_01_TYPE_GOVT_CD_LEN));
   	}
     int localBdms01StateCdCounter = -1;
     public boolean isBdms01StateCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01StateCdCounter != sharedCounter;
         localBdms01StateCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_STATE_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01StateCd
	 */
   protected void serializeBdms01StateCd(char[] bdms01StateCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01StateCd,0,getStringValue(),beginBdms01StateCd,BDMS_01_STATE_CD_LEN);
       localBdms01StateCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01StateCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01StateCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01StateCd() {	 
   		return (substring(getStringValue(),beginBdms01StateCd,beginBdms01StateCd + BDMS_01_STATE_CD_LEN));
   	}
     int localBdms01GovtBackCdCounter = -1;
     public boolean isBdms01GovtBackCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01GovtBackCdCounter != sharedCounter;
         localBdms01GovtBackCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_GOVT_BACK_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01GovtBackCd
	 */
   protected void serializeBdms01GovtBackCd(char[] bdms01GovtBackCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01GovtBackCd,0,getStringValue(),beginBdms01GovtBackCd,BDMS_01_GOVT_BACK_CD_LEN);
       localBdms01GovtBackCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01GovtBackCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01GovtBackCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01GovtBackCd() {	 
   		return (substring(getStringValue(),beginBdms01GovtBackCd,beginBdms01GovtBackCd + BDMS_01_GOVT_BACK_CD_LEN));
   	}
     int localBdms01TypePaperCdCounter = -1;
     public boolean isBdms01TypePaperCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TypePaperCdCounter != sharedCounter;
         localBdms01TypePaperCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TYPE_PAPER_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01TypePaperCd
	 */
   protected void serializeBdms01TypePaperCd(char[] bdms01TypePaperCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TypePaperCd,0,getStringValue(),beginBdms01TypePaperCd,BDMS_01_TYPE_PAPER_CD_LEN);
       localBdms01TypePaperCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TypePaperCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01TypePaperCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TypePaperCd() {	 
   		return (substring(getStringValue(),beginBdms01TypePaperCd,beginBdms01TypePaperCd + BDMS_01_TYPE_PAPER_CD_LEN));
   	}
     int localBdms01PymntArreasIndCounter = -1;
     public boolean isBdms01PymntArreasIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PymntArreasIndCounter != sharedCounter;
         localBdms01PymntArreasIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PYMNT_ARREAS_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01PymntArreasInd
	 */
   protected void serializeBdms01PymntArreasInd(char[] bdms01PymntArreasInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PymntArreasInd,0,getStringValue(),beginBdms01PymntArreasInd,BDMS_01_PYMNT_ARREAS_IND_LEN);
       localBdms01PymntArreasIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PymntArreasIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01PymntArreasInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PymntArreasInd() {	 
   		return (substring(getStringValue(),beginBdms01PymntArreasInd,beginBdms01PymntArreasInd + BDMS_01_PYMNT_ARREAS_IND_LEN));
   	}
     int localBdms01RdmptPrtlCdCounter = -1;
     public boolean isBdms01RdmptPrtlCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RdmptPrtlCdCounter != sharedCounter;
         localBdms01RdmptPrtlCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_RDMPT_PRTL_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01RdmptPrtlCd
	 */
   protected void serializeBdms01RdmptPrtlCd(char[] bdms01RdmptPrtlCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RdmptPrtlCd,0,getStringValue(),beginBdms01RdmptPrtlCd,BDMS_01_RDMPT_PRTL_CD_LEN);
       localBdms01RdmptPrtlCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RdmptPrtlCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01RdmptPrtlCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RdmptPrtlCd() {	 
   		return (substring(getStringValue(),beginBdms01RdmptPrtlCd,beginBdms01RdmptPrtlCd + BDMS_01_RDMPT_PRTL_CD_LEN));
   	}
     int localBdms01OrgnlIntPayDtCounter = -1;
     public boolean isBdms01OrgnlIntPayDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OrgnlIntPayDtCounter != sharedCounter;
         localBdms01OrgnlIntPayDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_ORGNL_INT_PAY_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01OrgnlIntPayDt
	 */
   protected void serializeBdms01OrgnlIntPayDt(char[] bdms01OrgnlIntPayDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OrgnlIntPayDt,0,getStringValue(),beginBdms01OrgnlIntPayDt,BDMS_01_ORGNL_INT_PAY_DT_LEN);
       localBdms01OrgnlIntPayDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OrgnlIntPayDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01OrgnlIntPayDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OrgnlIntPayDt() {	 
   		return (substring(getStringValue(),beginBdms01OrgnlIntPayDt,beginBdms01OrgnlIntPayDt + BDMS_01_ORGNL_INT_PAY_DT_LEN));
   	}
     int localBdms01EvltnBondCdCounter = -1;
     public boolean isBdms01EvltnBondCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01EvltnBondCdCounter != sharedCounter;
         localBdms01EvltnBondCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_EVLTN_BOND_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01EvltnBondCd
	 */
   protected void serializeBdms01EvltnBondCd(char[] bdms01EvltnBondCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01EvltnBondCd,0,getStringValue(),beginBdms01EvltnBondCd,BDMS_01_EVLTN_BOND_CD_LEN);
       localBdms01EvltnBondCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01EvltnBondCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01EvltnBondCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01EvltnBondCd() {	 
   		return (substring(getStringValue(),beginBdms01EvltnBondCd,beginBdms01EvltnBondCd + BDMS_01_EVLTN_BOND_CD_LEN));
   	}
     int localBdms01RefundReasonCdCounter = -1;
     public boolean isBdms01RefundReasonCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RefundReasonCdCounter != sharedCounter;
         localBdms01RefundReasonCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_REFUND_REASON_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01RefundReasonCd
	 */
   protected void serializeBdms01RefundReasonCd(char[] bdms01RefundReasonCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RefundReasonCd,0,getStringValue(),beginBdms01RefundReasonCd,BDMS_01_REFUND_REASON_CD_LEN);
       localBdms01RefundReasonCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RefundReasonCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01RefundReasonCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RefundReasonCd() {	 
   		return (substring(getStringValue(),beginBdms01RefundReasonCd,beginBdms01RefundReasonCd + BDMS_01_REFUND_REASON_CD_LEN));
   	}
     int localBdms01CanadaBondIndCounter = -1;
     public boolean isBdms01CanadaBondIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CanadaBondIndCounter != sharedCounter;
         localBdms01CanadaBondIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CANADA_BOND_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01CanadaBondInd
	 */
   protected void serializeBdms01CanadaBondInd(char[] bdms01CanadaBondInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CanadaBondInd,0,getStringValue(),beginBdms01CanadaBondInd,BDMS_01_CANADA_BOND_IND_LEN);
       localBdms01CanadaBondIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CanadaBondIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01CanadaBondInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CanadaBondInd() {	 
   		return (substring(getStringValue(),beginBdms01CanadaBondInd,beginBdms01CanadaBondInd + BDMS_01_CANADA_BOND_IND_LEN));
   	}
     int localBdms01ErbndIndCounter = -1;
     public boolean isBdms01ErbndIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ErbndIndCounter != sharedCounter;
         localBdms01ErbndIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_ERBND_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01ErbndInd
	 */
   protected void serializeBdms01ErbndInd(char[] bdms01ErbndInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ErbndInd,0,getStringValue(),beginBdms01ErbndInd,BDMS_01_ERBND_IND_LEN);
       localBdms01ErbndIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ErbndIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01ErbndInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ErbndInd() {	 
   		return (substring(getStringValue(),beginBdms01ErbndInd,beginBdms01ErbndInd + BDMS_01_ERBND_IND_LEN));
   	}
     int localBdms01CallTypeCdCounter = -1;
     public boolean isBdms01CallTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CallTypeCdCounter != sharedCounter;
         localBdms01CallTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CALL_TYPE_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01CallTypeCd
	 */
   protected void serializeBdms01CallTypeCd(char[] bdms01CallTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CallTypeCd,0,getStringValue(),beginBdms01CallTypeCd,BDMS_01_CALL_TYPE_CD_LEN);
       localBdms01CallTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CallTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01CallTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CallTypeCd() {	 
   		return (substring(getStringValue(),beginBdms01CallTypeCd,beginBdms01CallTypeCd + BDMS_01_CALL_TYPE_CD_LEN));
   	}
     int localBdms01TypeMuniCdCounter = -1;
     public boolean isBdms01TypeMuniCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TypeMuniCdCounter != sharedCounter;
         localBdms01TypeMuniCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TYPE_MUNI_CD_LEN = 4;
	/**
	 * 	serialize this Bdms01TypeMuniCd
	 */
   protected void serializeBdms01TypeMuniCd(char[] bdms01TypeMuniCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TypeMuniCd,0,getStringValue(),beginBdms01TypeMuniCd,BDMS_01_TYPE_MUNI_CD_LEN);
       localBdms01TypeMuniCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TypeMuniCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshBdms01TypeMuniCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TypeMuniCd() {	 
   		return (substring(getStringValue(),beginBdms01TypeMuniCd,beginBdms01TypeMuniCd + BDMS_01_TYPE_MUNI_CD_LEN));
   	}
     int localBdms01AgencyIndCounter = -1;
     public boolean isBdms01AgencyIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01AgencyIndCounter != sharedCounter;
         localBdms01AgencyIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_AGENCY_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01AgencyInd
	 */
   protected void serializeBdms01AgencyInd(char[] bdms01AgencyInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01AgencyInd,0,getStringValue(),beginBdms01AgencyInd,BDMS_01_AGENCY_IND_LEN);
       localBdms01AgencyIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01AgencyIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01AgencyInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01AgencyInd() {	 
   		return (substring(getStringValue(),beginBdms01AgencyInd,beginBdms01AgencyInd + BDMS_01_AGENCY_IND_LEN));
   	}
     int localBdms01TiisIndCounter = -1;
     public boolean isBdms01TiisIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TiisIndCounter != sharedCounter;
         localBdms01TiisIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TIIS_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01TiisInd
	 */
   protected void serializeBdms01TiisInd(char[] bdms01TiisInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TiisInd,0,getStringValue(),beginBdms01TiisInd,BDMS_01_TIIS_IND_LEN);
       localBdms01TiisIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TiisIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01TiisInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TiisInd() {	 
   		return (substring(getStringValue(),beginBdms01TiisInd,beginBdms01TiisInd + BDMS_01_TIIS_IND_LEN));
   	}
     int localBdms01IntCalcnCdCounter = -1;
     public boolean isBdms01IntCalcnCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01IntCalcnCdCounter != sharedCounter;
         localBdms01IntCalcnCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_INT_CALCN_CD_LEN = 4;
	/**
	 * 	serialize this Bdms01IntCalcnCd
	 */
   protected void serializeBdms01IntCalcnCd(char[] bdms01IntCalcnCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01IntCalcnCd,0,getStringValue(),beginBdms01IntCalcnCd,BDMS_01_INT_CALCN_CD_LEN);
       localBdms01IntCalcnCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01IntCalcnCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshBdms01IntCalcnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01IntCalcnCd() {	 
   		return (substring(getStringValue(),beginBdms01IntCalcnCd,beginBdms01IntCalcnCd + BDMS_01_INT_CALCN_CD_LEN));
   	}
     int localBdms01AstBckdCdCounter = -1;
     public boolean isBdms01AstBckdCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01AstBckdCdCounter != sharedCounter;
         localBdms01AstBckdCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_AST_BCKD_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01AstBckdCd
	 */
   protected void serializeBdms01AstBckdCd(char[] bdms01AstBckdCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01AstBckdCd,0,getStringValue(),beginBdms01AstBckdCd,BDMS_01_AST_BCKD_CD_LEN);
       localBdms01AstBckdCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01AstBckdCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01AstBckdCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01AstBckdCd() {	 
   		return (substring(getStringValue(),beginBdms01AstBckdCd,beginBdms01AstBckdCd + BDMS_01_AST_BCKD_CD_LEN));
   	}
     int localBdms01GnmaSrlNoteIndCounter = -1;
     public boolean isBdms01GnmaSrlNoteIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01GnmaSrlNoteIndCounter != sharedCounter;
         localBdms01GnmaSrlNoteIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_GNMA_SRL_NOTE_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01GnmaSrlNoteInd
	 */
   protected void serializeBdms01GnmaSrlNoteInd(char[] bdms01GnmaSrlNoteInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01GnmaSrlNoteInd,0,getStringValue(),beginBdms01GnmaSrlNoteInd,BDMS_01_GNMA_SRL_NOTE_IND_LEN);
       localBdms01GnmaSrlNoteIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01GnmaSrlNoteIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01GnmaSrlNoteInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01GnmaSrlNoteInd() {	 
   		return (substring(getStringValue(),beginBdms01GnmaSrlNoteInd,beginBdms01GnmaSrlNoteInd + BDMS_01_GNMA_SRL_NOTE_IND_LEN));
   	}
     int localBdms01TraceIndCounter = -1;
     public boolean isBdms01TraceIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TraceIndCounter != sharedCounter;
         localBdms01TraceIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TRACE_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01TraceInd
	 */
   protected void serializeBdms01TraceInd(char[] bdms01TraceInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TraceInd,0,getStringValue(),beginBdms01TraceInd,BDMS_01_TRACE_IND_LEN);
       localBdms01TraceIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TraceIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01TraceInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TraceInd() {	 
   		return (substring(getStringValue(),beginBdms01TraceInd,beginBdms01TraceInd + BDMS_01_TRACE_IND_LEN));
   	}
     int localBdms01TbaIndCounter = -1;
     public boolean isBdms01TbaIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TbaIndCounter != sharedCounter;
         localBdms01TbaIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TBA_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01TbaInd
	 */
   protected void serializeBdms01TbaInd(char[] bdms01TbaInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TbaInd,0,getStringValue(),beginBdms01TbaInd,BDMS_01_TBA_IND_LEN);
       localBdms01TbaIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TbaIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01TbaInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TbaInd() {	 
   		return (substring(getStringValue(),beginBdms01TbaInd,beginBdms01TbaInd + BDMS_01_TBA_IND_LEN));
   	}
     int localBdms01MnmmDnmntAmtCounter = -1;
     
     public boolean isBdms01MnmmDnmntAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MnmmDnmntAmtCounter != sharedCounter;
         localBdms01MnmmDnmntAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01MnmmDnmntAmt
	 *	@return bdms01MnmmDnmntAmt
	 */
	public char[]  getBdms01MnmmDnmntAmtString() {
	    return getCharArray(beginBdms01MnmmDnmntAmt,BDMS_01_MNMM_DNMNT_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01MnmmDnmntAmtIsNumeric() {
		    return isNumeric(beginBdms01MnmmDnmntAmt
	                    ,beginBdms01MnmmDnmntAmt + BDMS_01_MNMM_DNMNT_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_MNMM_DNMNT_AMT_LEN = 13;
  protected  static final int BDMS_01_MNMM_DNMNT_AMT_SCALE = 2;

   protected BigDecimal checkBdms01MnmmDnmntAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,13/*precision*/);
   }

  	/**
	 * serializeBdms01MnmmDnmntAmt
	 */
	protected void serializeBdms01MnmmDnmntAmt(BigDecimal bdms01MnmmDnmntAmt) {
	       putNumber(beginBdms01MnmmDnmntAmt,bdms01MnmmDnmntAmt,BDMS_01_MNMM_DNMNT_AMT_LEN,BDMS_01_MNMM_DNMNT_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01MnmmDnmntAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01MnmmDnmntAmt
	 */
   	protected  BigDecimal serializeBdms01MnmmDnmntAmt(char[] value) throws CFException {
        if (value.length < 13) value = pad(13, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(13,value,false/*isSigned?*/)
		       ,beginBdms01MnmmDnmntAmt
		       ,13
		      );		 localBdms01MnmmDnmntAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_MNMM_DNMNT_AMT_LEN,BDMS_01_MNMM_DNMNT_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01MnmmDnmntAmt", beginBdms01MnmmDnmntAmt,BDMS_01_MNMM_DNMNT_AMT_LEN);
    	}
    }
    /**
	 *	refreshBdms01MnmmDnmntAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01MnmmDnmntAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01MnmmDnmntAmt
			            ,BDMS_01_MNMM_DNMNT_AMT_LEN
			            ,BDMS_01_MNMM_DNMNT_AMT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01MnmmDnmntAmt", beginBdms01MnmmDnmntAmt,BDMS_01_MNMM_DNMNT_AMT_LEN);
    }
   	}
     int localBdms01ClNoticeDaysNbrCounter = -1;
     public boolean isBdms01ClNoticeDaysNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ClNoticeDaysNbrCounter != sharedCounter;
         localBdms01ClNoticeDaysNbrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01ClNoticeDaysNbr
	 *	@return bdms01ClNoticeDaysNbr
	 */
	public char[]  getBdms01ClNoticeDaysNbrString() {
	     return getCharArray(beginBdms01ClNoticeDaysNbr,BDMS_01_CL_NOTICE_DAYS_NBR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01ClNoticeDaysNbrIsNumeric() {
	    return isNumeric(beginBdms01ClNoticeDaysNbr
	                    ,beginBdms01ClNoticeDaysNbr + BDMS_01_CL_NOTICE_DAYS_NBR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_CL_NOTICE_DAYS_NBR_LEN = 3;
  	/**
	 * serializeBdms01ClNoticeDaysNbr
	 */
	protected void serializeBdms01ClNoticeDaysNbr(int bdms01ClNoticeDaysNbr) {
		 putNumber(beginBdms01ClNoticeDaysNbr,bdms01ClNoticeDaysNbr,BDMS_01_CL_NOTICE_DAYS_NBR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01ClNoticeDaysNbrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01ClNoticeDaysNbr
	 */
   	protected  int serializeBdms01ClNoticeDaysNbr(char[] value) {
	    int  bdms01ClNoticeDaysNbr;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01ClNoticeDaysNbr = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginBdms01ClNoticeDaysNbr
		       ,3
		      );
		 localBdms01ClNoticeDaysNbrCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01ClNoticeDaysNbr;
    }

   protected int checkBdms01ClNoticeDaysNbrMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01ClNoticeDaysNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01ClNoticeDaysNbr() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01ClNoticeDaysNbr
			                 ,BDMS_01_CL_NOTICE_DAYS_NBR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01ClNoticeDaysNbr", beginBdms01ClNoticeDaysNbr,BDMS_01_CL_NOTICE_DAYS_NBR_LEN);
    }
   	}
     int localBdms01SinkingFundIndCounter = -1;
     public boolean isBdms01SinkingFundIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SinkingFundIndCounter != sharedCounter;
         localBdms01SinkingFundIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SINKING_FUND_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01SinkingFundInd
	 */
   protected void serializeBdms01SinkingFundInd(char[] bdms01SinkingFundInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SinkingFundInd,0,getStringValue(),beginBdms01SinkingFundInd,BDMS_01_SINKING_FUND_IND_LEN);
       localBdms01SinkingFundIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SinkingFundIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01SinkingFundInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SinkingFundInd() {	 
   		return (substring(getStringValue(),beginBdms01SinkingFundInd,beginBdms01SinkingFundInd + BDMS_01_SINKING_FUND_IND_LEN));
   	}
     int localBdms01DefeaseIndCounter = -1;
     public boolean isBdms01DefeaseIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01DefeaseIndCounter != sharedCounter;
         localBdms01DefeaseIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_DEFEASE_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01DefeaseInd
	 */
   protected void serializeBdms01DefeaseInd(char[] bdms01DefeaseInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01DefeaseInd,0,getStringValue(),beginBdms01DefeaseInd,BDMS_01_DEFEASE_IND_LEN);
       localBdms01DefeaseIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01DefeaseIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01DefeaseInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01DefeaseInd() {	 
   		return (substring(getStringValue(),beginBdms01DefeaseInd,beginBdms01DefeaseInd + BDMS_01_DEFEASE_IND_LEN));
   	}
     int localBdms01RvnuIndCounter = -1;
     public boolean isBdms01RvnuIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RvnuIndCounter != sharedCounter;
         localBdms01RvnuIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_RVNU_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01RvnuInd
	 */
   protected void serializeBdms01RvnuInd(char[] bdms01RvnuInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RvnuInd,0,getStringValue(),beginBdms01RvnuInd,BDMS_01_RVNU_IND_LEN);
       localBdms01RvnuIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RvnuIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01RvnuInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RvnuInd() {	 
   		return (substring(getStringValue(),beginBdms01RvnuInd,beginBdms01RvnuInd + BDMS_01_RVNU_IND_LEN));
   	}
     int localBdms01CvrsnRtCounter = -1;
     
     public boolean isBdms01CvrsnRtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CvrsnRtCounter != sharedCounter;
         localBdms01CvrsnRtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01CvrsnRt
	 *	@return bdms01CvrsnRt
	 */
	public char[]  getBdms01CvrsnRtString() {
	    return getCharArray(beginBdms01CvrsnRt,BDMS_01_CVRSN_RT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01CvrsnRtIsNumeric() {
		    return isNumeric(beginBdms01CvrsnRt
	                    ,beginBdms01CvrsnRt + BDMS_01_CVRSN_RT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_CVRSN_RT_LEN = 15;
  protected  static final int BDMS_01_CVRSN_RT_SCALE = 8;

   protected BigDecimal checkBdms01CvrsnRtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeBdms01CvrsnRt
	 */
	protected void serializeBdms01CvrsnRt(BigDecimal bdms01CvrsnRt) {
	       putNumber(beginBdms01CvrsnRt,bdms01CvrsnRt,BDMS_01_CVRSN_RT_LEN,BDMS_01_CVRSN_RT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01CvrsnRtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01CvrsnRt
	 */
   	protected  BigDecimal serializeBdms01CvrsnRt(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginBdms01CvrsnRt
		       ,15
		      );		 localBdms01CvrsnRtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_CVRSN_RT_LEN,BDMS_01_CVRSN_RT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01CvrsnRt", beginBdms01CvrsnRt,BDMS_01_CVRSN_RT_LEN);
    	}
    }
    /**
	 *	refreshBdms01CvrsnRt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01CvrsnRt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01CvrsnRt
			            ,BDMS_01_CVRSN_RT_LEN
			            ,BDMS_01_CVRSN_RT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01CvrsnRt", beginBdms01CvrsnRt,BDMS_01_CVRSN_RT_LEN);
    }
   	}
     int localBdms01CvrsnPrcAmtCounter = -1;
     
     public boolean isBdms01CvrsnPrcAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CvrsnPrcAmtCounter != sharedCounter;
         localBdms01CvrsnPrcAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01CvrsnPrcAmt
	 *	@return bdms01CvrsnPrcAmt
	 */
	public char[]  getBdms01CvrsnPrcAmtString() {
	    return getCharArray(beginBdms01CvrsnPrcAmt,BDMS_01_CVRSN_PRC_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01CvrsnPrcAmtIsNumeric() {
		    return isNumeric(beginBdms01CvrsnPrcAmt
	                    ,beginBdms01CvrsnPrcAmt + BDMS_01_CVRSN_PRC_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_CVRSN_PRC_AMT_LEN = 15;
  protected  static final int BDMS_01_CVRSN_PRC_AMT_SCALE = 8;

   protected BigDecimal checkBdms01CvrsnPrcAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeBdms01CvrsnPrcAmt
	 */
	protected void serializeBdms01CvrsnPrcAmt(BigDecimal bdms01CvrsnPrcAmt) {
	       putNumber(beginBdms01CvrsnPrcAmt,bdms01CvrsnPrcAmt,BDMS_01_CVRSN_PRC_AMT_LEN,BDMS_01_CVRSN_PRC_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01CvrsnPrcAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01CvrsnPrcAmt
	 */
   	protected  BigDecimal serializeBdms01CvrsnPrcAmt(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginBdms01CvrsnPrcAmt
		       ,15
		      );		 localBdms01CvrsnPrcAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_CVRSN_PRC_AMT_LEN,BDMS_01_CVRSN_PRC_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01CvrsnPrcAmt", beginBdms01CvrsnPrcAmt,BDMS_01_CVRSN_PRC_AMT_LEN);
    	}
    }
    /**
	 *	refreshBdms01CvrsnPrcAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01CvrsnPrcAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01CvrsnPrcAmt
			            ,BDMS_01_CVRSN_PRC_AMT_LEN
			            ,BDMS_01_CVRSN_PRC_AMT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01CvrsnPrcAmt", beginBdms01CvrsnPrcAmt,BDMS_01_CVRSN_PRC_AMT_LEN);
    }
   	}
     int localBdms01CvrsnExpDtCounter = -1;
     public boolean isBdms01CvrsnExpDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CvrsnExpDtCounter != sharedCounter;
         localBdms01CvrsnExpDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CVRSN_EXP_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01CvrsnExpDt
	 */
   protected void serializeBdms01CvrsnExpDt(char[] bdms01CvrsnExpDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CvrsnExpDt,0,getStringValue(),beginBdms01CvrsnExpDt,BDMS_01_CVRSN_EXP_DT_LEN);
       localBdms01CvrsnExpDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CvrsnExpDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01CvrsnExpDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CvrsnExpDt() {	 
   		return (substring(getStringValue(),beginBdms01CvrsnExpDt,beginBdms01CvrsnExpDt + BDMS_01_CVRSN_EXP_DT_LEN));
   	}




}
  
