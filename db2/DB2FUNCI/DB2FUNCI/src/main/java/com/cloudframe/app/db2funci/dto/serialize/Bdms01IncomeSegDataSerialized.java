package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class Bdms01IncomeSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Bdms01IncomeSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01IncomeSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_INCOME_SEG_DATA_LENGTH = 439;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01IncomeSegSqlcd;
            protected  int beginMsdDividendType;
            protected  int beginMsdPaymentFreq;
            protected  int beginMsdCashDivRate1;
            protected  int beginBdms01Cash1RecordDt;
            protected  int beginBdms01Cash1PaymentDt;
            protected  int beginBdms01Cash1ExdividendDt;
            protected  int beginBdms01Cash1FrqncPayCd;
            protected  int beginBdms01Cash1DayTkffGnrtQty;
            protected  int beginBdms01Cash1AssetLiqnInd;
            protected  int beginBdms01Cash1CurrencyCd;
            protected  int beginBdms01Cash1VendorCd;
            protected  int beginBdms01Cash1TypeIncomeCd;
            protected  int beginBdms01Cash1PayFrctnShrInd;
            protected  int beginMsdCashDivRate2;
            protected  int beginBdms01Cash2RecordDt;
            protected  int beginBdms01Cash2PaymentDt;
            protected  int beginBdms01Cash2ExdividendDt;
            protected  int beginBdms01Cash2FrqncPayCd;
            protected  int beginBdms01Cash2DayTkffGnrtQty;
            protected  int beginBdms01Cash2AssetLiqnInd;
            protected  int beginBdms01Cash2CurrencyCd;
            protected  int beginBdms01Cash2VendorCd;
            protected  int beginBdms01Cash2TypeIncomeCd;
            protected  int beginBdms01Cash2PayFrctnShrInd;
            protected  int beginMsdStockDivRate;
            protected  int beginBdms01StockRecordDt;
            protected  int beginBdms01StockPaymentDt;
            protected  int beginBdms01StockExdividendDt;
            protected  int beginBdms01StockFrqncPayCd;
            protected  int beginBdms01StockDayTkffGnrtQty;
            protected  int beginBdms01StockAssetLiqnInd;
            protected  int beginBdms01StockCurrencyCd;
            protected  int beginBdms01StockVendorCd;
            protected  int beginBdms01StockTypeIncomeCd;
            protected  int beginBdms01StockPayFrctnShrInd;
            protected  int beginMsdSplitDivRate;
            protected  int beginBdms01SplitRecordDt;
            protected  int beginBdms01SplitPaymentDt;
            protected  int beginBdms01SplitExdividendDt;
            protected  int beginBdms01SplitFrqncPayCd;
            protected  int beginBdms01SplitDayTkffGnrtQty;
            protected  int beginBdms01SplitAssetLiqnInd;
            protected  int beginBdms01SplitCurrencyCd;
            protected  int beginBdms01SplitVendorCd;
            protected  int beginBdms01SplitTypeIncomeCd;
            protected  int beginBdms01SplitPayFrctnShrInd;
            protected  int beginMsdSplitRightInd;
	
	/**
	* Constructor for Bdms01IncomeSegDataSerialized
	**/
    public Bdms01IncomeSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01IncomeSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01IncomeSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01IncomeSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1501); // serialize this field at offset 1501 by default 
    }
    
	/**
	* sets parent for this Bdms01IncomeSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1501 by default
    }    
	/**
	* initializes the field in Bdms01IncomeSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_INCOME_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01IncomeSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdDividendType = getStartOffset() + 4;	// set offset for serialization
  
             beginMsdPaymentFreq = getStartOffset() + 5;	// set offset for serialization
  
  
             beginMsdCashDivRate1 = getStartOffset() + 14;	// set offset for serialization
  
  
  
             beginBdms01Cash1RecordDt = getStartOffset() + 45;	// set offset for serialization
  
             beginBdms01Cash1PaymentDt = getStartOffset() + 55;	// set offset for serialization
  
             beginBdms01Cash1ExdividendDt = getStartOffset() + 65;	// set offset for serialization
  
             beginBdms01Cash1FrqncPayCd = getStartOffset() + 75;	// set offset for serialization
  
             beginBdms01Cash1DayTkffGnrtQty = getStartOffset() + 77;	// set offset for serialization
  
             beginBdms01Cash1AssetLiqnInd = getStartOffset() + 78;	// set offset for serialization
  
             beginBdms01Cash1CurrencyCd = getStartOffset() + 79;	// set offset for serialization
  
             beginBdms01Cash1VendorCd = getStartOffset() + 81;	// set offset for serialization
  
             beginBdms01Cash1TypeIncomeCd = getStartOffset() + 86;	// set offset for serialization
  
             beginBdms01Cash1PayFrctnShrInd = getStartOffset() + 88;	// set offset for serialization
  
  
             beginMsdCashDivRate2 = getStartOffset() + 97;	// set offset for serialization
  
  
  
             beginBdms01Cash2RecordDt = getStartOffset() + 128;	// set offset for serialization
  
             beginBdms01Cash2PaymentDt = getStartOffset() + 138;	// set offset for serialization
  
             beginBdms01Cash2ExdividendDt = getStartOffset() + 148;	// set offset for serialization
  
             beginBdms01Cash2FrqncPayCd = getStartOffset() + 158;	// set offset for serialization
  
             beginBdms01Cash2DayTkffGnrtQty = getStartOffset() + 160;	// set offset for serialization
  
             beginBdms01Cash2AssetLiqnInd = getStartOffset() + 161;	// set offset for serialization
  
             beginBdms01Cash2CurrencyCd = getStartOffset() + 162;	// set offset for serialization
  
             beginBdms01Cash2VendorCd = getStartOffset() + 164;	// set offset for serialization
  
             beginBdms01Cash2TypeIncomeCd = getStartOffset() + 169;	// set offset for serialization
  
             beginBdms01Cash2PayFrctnShrInd = getStartOffset() + 171;	// set offset for serialization
  
  
             beginMsdStockDivRate = getStartOffset() + 180;	// set offset for serialization
  
  
  
             beginBdms01StockRecordDt = getStartOffset() + 211;	// set offset for serialization
  
             beginBdms01StockPaymentDt = getStartOffset() + 221;	// set offset for serialization
  
             beginBdms01StockExdividendDt = getStartOffset() + 231;	// set offset for serialization
  
             beginBdms01StockFrqncPayCd = getStartOffset() + 241;	// set offset for serialization
  
             beginBdms01StockDayTkffGnrtQty = getStartOffset() + 243;	// set offset for serialization
  
             beginBdms01StockAssetLiqnInd = getStartOffset() + 244;	// set offset for serialization
  
             beginBdms01StockCurrencyCd = getStartOffset() + 245;	// set offset for serialization
  
             beginBdms01StockVendorCd = getStartOffset() + 247;	// set offset for serialization
  
             beginBdms01StockTypeIncomeCd = getStartOffset() + 252;	// set offset for serialization
  
             beginBdms01StockPayFrctnShrInd = getStartOffset() + 254;	// set offset for serialization
  
  
             beginMsdSplitDivRate = getStartOffset() + 263;	// set offset for serialization
  
  
  
             beginBdms01SplitRecordDt = getStartOffset() + 294;	// set offset for serialization
  
             beginBdms01SplitPaymentDt = getStartOffset() + 304;	// set offset for serialization
  
             beginBdms01SplitExdividendDt = getStartOffset() + 314;	// set offset for serialization
  
             beginBdms01SplitFrqncPayCd = getStartOffset() + 324;	// set offset for serialization
  
             beginBdms01SplitDayTkffGnrtQty = getStartOffset() + 326;	// set offset for serialization
  
             beginBdms01SplitAssetLiqnInd = getStartOffset() + 327;	// set offset for serialization
  
             beginBdms01SplitCurrencyCd = getStartOffset() + 328;	// set offset for serialization
  
             beginBdms01SplitVendorCd = getStartOffset() + 330;	// set offset for serialization
  
             beginBdms01SplitTypeIncomeCd = getStartOffset() + 335;	// set offset for serialization
  
             beginBdms01SplitPayFrctnShrInd = getStartOffset() + 337;	// set offset for serialization
  
             beginMsdSplitRightInd = getStartOffset() + 338;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01IncomeSegSqlcdCounter = -1;
     public boolean isBdms01IncomeSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01IncomeSegSqlcdCounter != sharedCounter;
         localBdms01IncomeSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01IncomeSegSqlcd
	 *	@return bdms01IncomeSegSqlcd
	 */
	public char[]  getBdms01IncomeSegSqlcdString() {
	     return getCharArray(beginBdms01IncomeSegSqlcd,BDMS_01_INCOME_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01IncomeSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01IncomeSegSqlcd
	                    ,beginBdms01IncomeSegSqlcd + BDMS_01_INCOME_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_INCOME_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01IncomeSegSqlcd
	 */
	protected void serializeBdms01IncomeSegSqlcd(int bdms01IncomeSegSqlcd) {
		 putNumber(beginBdms01IncomeSegSqlcd,bdms01IncomeSegSqlcd,BDMS_01_INCOME_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01IncomeSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01IncomeSegSqlcd
	 */
   	protected  int serializeBdms01IncomeSegSqlcd(char[] value) {
	    int  bdms01IncomeSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01IncomeSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01IncomeSegSqlcd
		       ,4
		      );
		 localBdms01IncomeSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01IncomeSegSqlcd;
    }

   protected int checkBdms01IncomeSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01IncomeSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01IncomeSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01IncomeSegSqlcd
			                 ,BDMS_01_INCOME_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01IncomeSegSqlcd", beginBdms01IncomeSegSqlcd,BDMS_01_INCOME_SEG_SQLCD_LEN);
    }
   	}
     int localMsdDividendTypeCounter = -1;
     public boolean isMsdDividendTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdDividendTypeCounter != sharedCounter;
         localMsdDividendTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_DIVIDEND_TYPE_LEN = 1;
	/**
	 * 	serialize this MsdDividendType
	 */
   protected void serializeMsdDividendType(char[] msdDividendType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdDividendType,0,getStringValue(),beginMsdDividendType,MSD_DIVIDEND_TYPE_LEN);
       localMsdDividendTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdDividendTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdDividendType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdDividendType() {	 
   		return (substring(getStringValue(),beginMsdDividendType,beginMsdDividendType + MSD_DIVIDEND_TYPE_LEN));
   	}
     int localMsdPaymentFreqCounter = -1;
     public boolean isMsdPaymentFreqModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdPaymentFreqCounter != sharedCounter;
         localMsdPaymentFreqCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_PAYMENT_FREQ_LEN = 1;
	/**
	 * 	serialize this MsdPaymentFreq
	 */
   protected void serializeMsdPaymentFreq(char[] msdPaymentFreq) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdPaymentFreq,0,getStringValue(),beginMsdPaymentFreq,MSD_PAYMENT_FREQ_LEN);
       localMsdPaymentFreqCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdPaymentFreqConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdPaymentFreq is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdPaymentFreq() {	 
   		return (substring(getStringValue(),beginMsdPaymentFreq,beginMsdPaymentFreq + MSD_PAYMENT_FREQ_LEN));
   	}
     int localMsdCashDivRate1Counter = -1;
     
     public boolean isMsdCashDivRate1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCashDivRate1Counter != sharedCounter;
         localMsdCashDivRate1Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdCashDivRate1
	 *	@return msdCashDivRate1
	 */
	public char[]  getMsdCashDivRate1String() {
	    return getCharArray(beginMsdCashDivRate1,MSD_CASH_DIV_RATE_1_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdCashDivRate1IsNumeric() {
		    return isNumeric(beginMsdCashDivRate1
	                    ,beginMsdCashDivRate1 + MSD_CASH_DIV_RATE_1_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_CASH_DIV_RATE_1_LEN = 15;
  protected  static final int MSD_CASH_DIV_RATE_1_SCALE = 8;

   protected BigDecimal checkMsdCashDivRate1MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeMsdCashDivRate1
	 */
	protected void serializeMsdCashDivRate1(BigDecimal msdCashDivRate1) {
	       putNumber(beginMsdCashDivRate1,msdCashDivRate1,MSD_CASH_DIV_RATE_1_LEN,MSD_CASH_DIV_RATE_1_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdCashDivRate1Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdCashDivRate1
	 */
   	protected  BigDecimal serializeMsdCashDivRate1(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginMsdCashDivRate1
		       ,15
		      );		 localMsdCashDivRate1Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_CASH_DIV_RATE_1_LEN,MSD_CASH_DIV_RATE_1_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdCashDivRate1", beginMsdCashDivRate1,MSD_CASH_DIV_RATE_1_LEN);
    	}
    }
    /**
	 *	refreshMsdCashDivRate1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdCashDivRate1() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdCashDivRate1
			            ,MSD_CASH_DIV_RATE_1_LEN
			            ,MSD_CASH_DIV_RATE_1_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdCashDivRate1", beginMsdCashDivRate1,MSD_CASH_DIV_RATE_1_LEN);
    }
   	}
     int localBdms01Cash1RecordDtCounter = -1;
     public boolean isBdms01Cash1RecordDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Cash1RecordDtCounter != sharedCounter;
         localBdms01Cash1RecordDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CASH_1_RECORD_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01Cash1RecordDt
	 */
   protected void serializeBdms01Cash1RecordDt(char[] bdms01Cash1RecordDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Cash1RecordDt,0,getStringValue(),beginBdms01Cash1RecordDt,BDMS_01_CASH_1_RECORD_DT_LEN);
       localBdms01Cash1RecordDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Cash1RecordDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01Cash1RecordDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Cash1RecordDt() {	 
   		return (substring(getStringValue(),beginBdms01Cash1RecordDt,beginBdms01Cash1RecordDt + BDMS_01_CASH_1_RECORD_DT_LEN));
   	}
     int localBdms01Cash1PaymentDtCounter = -1;
     public boolean isBdms01Cash1PaymentDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Cash1PaymentDtCounter != sharedCounter;
         localBdms01Cash1PaymentDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CASH_1_PAYMENT_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01Cash1PaymentDt
	 */
   protected void serializeBdms01Cash1PaymentDt(char[] bdms01Cash1PaymentDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Cash1PaymentDt,0,getStringValue(),beginBdms01Cash1PaymentDt,BDMS_01_CASH_1_PAYMENT_DT_LEN);
       localBdms01Cash1PaymentDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Cash1PaymentDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01Cash1PaymentDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Cash1PaymentDt() {	 
   		return (substring(getStringValue(),beginBdms01Cash1PaymentDt,beginBdms01Cash1PaymentDt + BDMS_01_CASH_1_PAYMENT_DT_LEN));
   	}
     int localBdms01Cash1ExdividendDtCounter = -1;
     public boolean isBdms01Cash1ExdividendDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Cash1ExdividendDtCounter != sharedCounter;
         localBdms01Cash1ExdividendDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CASH_1_EXDIVIDEND_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01Cash1ExdividendDt
	 */
   protected void serializeBdms01Cash1ExdividendDt(char[] bdms01Cash1ExdividendDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Cash1ExdividendDt,0,getStringValue(),beginBdms01Cash1ExdividendDt,BDMS_01_CASH_1_EXDIVIDEND_DT_LEN);
       localBdms01Cash1ExdividendDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Cash1ExdividendDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01Cash1ExdividendDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Cash1ExdividendDt() {	 
   		return (substring(getStringValue(),beginBdms01Cash1ExdividendDt,beginBdms01Cash1ExdividendDt + BDMS_01_CASH_1_EXDIVIDEND_DT_LEN));
   	}
     int localBdms01Cash1FrqncPayCdCounter = -1;
     public boolean isBdms01Cash1FrqncPayCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Cash1FrqncPayCdCounter != sharedCounter;
         localBdms01Cash1FrqncPayCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CASH_1_FRQNC_PAY_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01Cash1FrqncPayCd
	 */
   protected void serializeBdms01Cash1FrqncPayCd(char[] bdms01Cash1FrqncPayCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Cash1FrqncPayCd,0,getStringValue(),beginBdms01Cash1FrqncPayCd,BDMS_01_CASH_1_FRQNC_PAY_CD_LEN);
       localBdms01Cash1FrqncPayCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Cash1FrqncPayCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01Cash1FrqncPayCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Cash1FrqncPayCd() {	 
   		return (substring(getStringValue(),beginBdms01Cash1FrqncPayCd,beginBdms01Cash1FrqncPayCd + BDMS_01_CASH_1_FRQNC_PAY_CD_LEN));
   	}
     int localBdms01Cash1DayTkffGnrtQtyCounter = -1;
     public boolean isBdms01Cash1DayTkffGnrtQtyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Cash1DayTkffGnrtQtyCounter != sharedCounter;
         localBdms01Cash1DayTkffGnrtQtyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01Cash1DayTkffGnrtQty
	 *	@return bdms01Cash1DayTkffGnrtQty
	 */
	public char[]  getBdms01Cash1DayTkffGnrtQtyString() {
	     return getCharArray(beginBdms01Cash1DayTkffGnrtQty,BDMS_01_CASH_1_DAY_TKFF_GNRT_QTY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01Cash1DayTkffGnrtQtyIsNumeric() {
	    return isNumeric(beginBdms01Cash1DayTkffGnrtQty
	                    ,beginBdms01Cash1DayTkffGnrtQty + BDMS_01_CASH_1_DAY_TKFF_GNRT_QTY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_CASH_1_DAY_TKFF_GNRT_QTY_LEN = 1;
  	/**
	 * serializeBdms01Cash1DayTkffGnrtQty
	 */
	protected void serializeBdms01Cash1DayTkffGnrtQty(int bdms01Cash1DayTkffGnrtQty) {
		 putNumber(beginBdms01Cash1DayTkffGnrtQty,bdms01Cash1DayTkffGnrtQty,BDMS_01_CASH_1_DAY_TKFF_GNRT_QTY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01Cash1DayTkffGnrtQtyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01Cash1DayTkffGnrtQty
	 */
   	protected  int serializeBdms01Cash1DayTkffGnrtQty(char[] value) {
	    int  bdms01Cash1DayTkffGnrtQty;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01Cash1DayTkffGnrtQty = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginBdms01Cash1DayTkffGnrtQty
		       ,1
		      );
		 localBdms01Cash1DayTkffGnrtQtyCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01Cash1DayTkffGnrtQty;
    }

   protected int checkBdms01Cash1DayTkffGnrtQtyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01Cash1DayTkffGnrtQty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01Cash1DayTkffGnrtQty() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01Cash1DayTkffGnrtQty
			                 ,BDMS_01_CASH_1_DAY_TKFF_GNRT_QTY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01Cash1DayTkffGnrtQty", beginBdms01Cash1DayTkffGnrtQty,BDMS_01_CASH_1_DAY_TKFF_GNRT_QTY_LEN);
    }
   	}
     int localBdms01Cash1AssetLiqnIndCounter = -1;
     public boolean isBdms01Cash1AssetLiqnIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Cash1AssetLiqnIndCounter != sharedCounter;
         localBdms01Cash1AssetLiqnIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CASH_1_ASSET_LIQN_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01Cash1AssetLiqnInd
	 */
   protected void serializeBdms01Cash1AssetLiqnInd(char[] bdms01Cash1AssetLiqnInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Cash1AssetLiqnInd,0,getStringValue(),beginBdms01Cash1AssetLiqnInd,BDMS_01_CASH_1_ASSET_LIQN_IND_LEN);
       localBdms01Cash1AssetLiqnIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Cash1AssetLiqnIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01Cash1AssetLiqnInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Cash1AssetLiqnInd() {	 
   		return (substring(getStringValue(),beginBdms01Cash1AssetLiqnInd,beginBdms01Cash1AssetLiqnInd + BDMS_01_CASH_1_ASSET_LIQN_IND_LEN));
   	}
     int localBdms01Cash1CurrencyCdCounter = -1;
     public boolean isBdms01Cash1CurrencyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Cash1CurrencyCdCounter != sharedCounter;
         localBdms01Cash1CurrencyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CASH_1_CURRENCY_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01Cash1CurrencyCd
	 */
   protected void serializeBdms01Cash1CurrencyCd(char[] bdms01Cash1CurrencyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Cash1CurrencyCd,0,getStringValue(),beginBdms01Cash1CurrencyCd,BDMS_01_CASH_1_CURRENCY_CD_LEN);
       localBdms01Cash1CurrencyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Cash1CurrencyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01Cash1CurrencyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Cash1CurrencyCd() {	 
   		return (substring(getStringValue(),beginBdms01Cash1CurrencyCd,beginBdms01Cash1CurrencyCd + BDMS_01_CASH_1_CURRENCY_CD_LEN));
   	}
     int localBdms01Cash1VendorCdCounter = -1;
     public boolean isBdms01Cash1VendorCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Cash1VendorCdCounter != sharedCounter;
         localBdms01Cash1VendorCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CASH_1_VENDOR_CD_LEN = 5;
	/**
	 * 	serialize this Bdms01Cash1VendorCd
	 */
   protected void serializeBdms01Cash1VendorCd(char[] bdms01Cash1VendorCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Cash1VendorCd,0,getStringValue(),beginBdms01Cash1VendorCd,BDMS_01_CASH_1_VENDOR_CD_LEN);
       localBdms01Cash1VendorCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Cash1VendorCdConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshBdms01Cash1VendorCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Cash1VendorCd() {	 
   		return (substring(getStringValue(),beginBdms01Cash1VendorCd,beginBdms01Cash1VendorCd + BDMS_01_CASH_1_VENDOR_CD_LEN));
   	}
     int localBdms01Cash1TypeIncomeCdCounter = -1;
     public boolean isBdms01Cash1TypeIncomeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Cash1TypeIncomeCdCounter != sharedCounter;
         localBdms01Cash1TypeIncomeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CASH_1_TYPE_INCOME_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01Cash1TypeIncomeCd
	 */
   protected void serializeBdms01Cash1TypeIncomeCd(char[] bdms01Cash1TypeIncomeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Cash1TypeIncomeCd,0,getStringValue(),beginBdms01Cash1TypeIncomeCd,BDMS_01_CASH_1_TYPE_INCOME_CD_LEN);
       localBdms01Cash1TypeIncomeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Cash1TypeIncomeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01Cash1TypeIncomeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Cash1TypeIncomeCd() {	 
   		return (substring(getStringValue(),beginBdms01Cash1TypeIncomeCd,beginBdms01Cash1TypeIncomeCd + BDMS_01_CASH_1_TYPE_INCOME_CD_LEN));
   	}
     int localBdms01Cash1PayFrctnShrIndCounter = -1;
     public boolean isBdms01Cash1PayFrctnShrIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Cash1PayFrctnShrIndCounter != sharedCounter;
         localBdms01Cash1PayFrctnShrIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CASH_1_PAY_FRCTN_SHR_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01Cash1PayFrctnShrInd
	 */
   protected void serializeBdms01Cash1PayFrctnShrInd(char[] bdms01Cash1PayFrctnShrInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Cash1PayFrctnShrInd,0,getStringValue(),beginBdms01Cash1PayFrctnShrInd,BDMS_01_CASH_1_PAY_FRCTN_SHR_IND_LEN);
       localBdms01Cash1PayFrctnShrIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Cash1PayFrctnShrIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01Cash1PayFrctnShrInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Cash1PayFrctnShrInd() {	 
   		return (substring(getStringValue(),beginBdms01Cash1PayFrctnShrInd,beginBdms01Cash1PayFrctnShrInd + BDMS_01_CASH_1_PAY_FRCTN_SHR_IND_LEN));
   	}
     int localMsdCashDivRate2Counter = -1;
     
     public boolean isMsdCashDivRate2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCashDivRate2Counter != sharedCounter;
         localMsdCashDivRate2Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdCashDivRate2
	 *	@return msdCashDivRate2
	 */
	public char[]  getMsdCashDivRate2String() {
	    return getCharArray(beginMsdCashDivRate2,MSD_CASH_DIV_RATE_2_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdCashDivRate2IsNumeric() {
		    return isNumeric(beginMsdCashDivRate2
	                    ,beginMsdCashDivRate2 + MSD_CASH_DIV_RATE_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_CASH_DIV_RATE_2_LEN = 15;
  protected  static final int MSD_CASH_DIV_RATE_2_SCALE = 8;

   protected BigDecimal checkMsdCashDivRate2MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeMsdCashDivRate2
	 */
	protected void serializeMsdCashDivRate2(BigDecimal msdCashDivRate2) {
	       putNumber(beginMsdCashDivRate2,msdCashDivRate2,MSD_CASH_DIV_RATE_2_LEN,MSD_CASH_DIV_RATE_2_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdCashDivRate2Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdCashDivRate2
	 */
   	protected  BigDecimal serializeMsdCashDivRate2(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginMsdCashDivRate2
		       ,15
		      );		 localMsdCashDivRate2Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_CASH_DIV_RATE_2_LEN,MSD_CASH_DIV_RATE_2_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdCashDivRate2", beginMsdCashDivRate2,MSD_CASH_DIV_RATE_2_LEN);
    	}
    }
    /**
	 *	refreshMsdCashDivRate2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdCashDivRate2() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdCashDivRate2
			            ,MSD_CASH_DIV_RATE_2_LEN
			            ,MSD_CASH_DIV_RATE_2_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdCashDivRate2", beginMsdCashDivRate2,MSD_CASH_DIV_RATE_2_LEN);
    }
   	}
     int localBdms01Cash2RecordDtCounter = -1;
     public boolean isBdms01Cash2RecordDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Cash2RecordDtCounter != sharedCounter;
         localBdms01Cash2RecordDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CASH_2_RECORD_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01Cash2RecordDt
	 */
   protected void serializeBdms01Cash2RecordDt(char[] bdms01Cash2RecordDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Cash2RecordDt,0,getStringValue(),beginBdms01Cash2RecordDt,BDMS_01_CASH_2_RECORD_DT_LEN);
       localBdms01Cash2RecordDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Cash2RecordDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01Cash2RecordDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Cash2RecordDt() {	 
   		return (substring(getStringValue(),beginBdms01Cash2RecordDt,beginBdms01Cash2RecordDt + BDMS_01_CASH_2_RECORD_DT_LEN));
   	}
     int localBdms01Cash2PaymentDtCounter = -1;
     public boolean isBdms01Cash2PaymentDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Cash2PaymentDtCounter != sharedCounter;
         localBdms01Cash2PaymentDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CASH_2_PAYMENT_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01Cash2PaymentDt
	 */
   protected void serializeBdms01Cash2PaymentDt(char[] bdms01Cash2PaymentDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Cash2PaymentDt,0,getStringValue(),beginBdms01Cash2PaymentDt,BDMS_01_CASH_2_PAYMENT_DT_LEN);
       localBdms01Cash2PaymentDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Cash2PaymentDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01Cash2PaymentDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Cash2PaymentDt() {	 
   		return (substring(getStringValue(),beginBdms01Cash2PaymentDt,beginBdms01Cash2PaymentDt + BDMS_01_CASH_2_PAYMENT_DT_LEN));
   	}
     int localBdms01Cash2ExdividendDtCounter = -1;
     public boolean isBdms01Cash2ExdividendDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Cash2ExdividendDtCounter != sharedCounter;
         localBdms01Cash2ExdividendDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CASH_2_EXDIVIDEND_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01Cash2ExdividendDt
	 */
   protected void serializeBdms01Cash2ExdividendDt(char[] bdms01Cash2ExdividendDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Cash2ExdividendDt,0,getStringValue(),beginBdms01Cash2ExdividendDt,BDMS_01_CASH_2_EXDIVIDEND_DT_LEN);
       localBdms01Cash2ExdividendDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Cash2ExdividendDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01Cash2ExdividendDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Cash2ExdividendDt() {	 
   		return (substring(getStringValue(),beginBdms01Cash2ExdividendDt,beginBdms01Cash2ExdividendDt + BDMS_01_CASH_2_EXDIVIDEND_DT_LEN));
   	}
     int localBdms01Cash2FrqncPayCdCounter = -1;
     public boolean isBdms01Cash2FrqncPayCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Cash2FrqncPayCdCounter != sharedCounter;
         localBdms01Cash2FrqncPayCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CASH_2_FRQNC_PAY_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01Cash2FrqncPayCd
	 */
   protected void serializeBdms01Cash2FrqncPayCd(char[] bdms01Cash2FrqncPayCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Cash2FrqncPayCd,0,getStringValue(),beginBdms01Cash2FrqncPayCd,BDMS_01_CASH_2_FRQNC_PAY_CD_LEN);
       localBdms01Cash2FrqncPayCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Cash2FrqncPayCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01Cash2FrqncPayCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Cash2FrqncPayCd() {	 
   		return (substring(getStringValue(),beginBdms01Cash2FrqncPayCd,beginBdms01Cash2FrqncPayCd + BDMS_01_CASH_2_FRQNC_PAY_CD_LEN));
   	}
     int localBdms01Cash2DayTkffGnrtQtyCounter = -1;
     public boolean isBdms01Cash2DayTkffGnrtQtyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Cash2DayTkffGnrtQtyCounter != sharedCounter;
         localBdms01Cash2DayTkffGnrtQtyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01Cash2DayTkffGnrtQty
	 *	@return bdms01Cash2DayTkffGnrtQty
	 */
	public char[]  getBdms01Cash2DayTkffGnrtQtyString() {
	     return getCharArray(beginBdms01Cash2DayTkffGnrtQty,BDMS_01_CASH_2_DAY_TKFF_GNRT_QTY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01Cash2DayTkffGnrtQtyIsNumeric() {
	    return isNumeric(beginBdms01Cash2DayTkffGnrtQty
	                    ,beginBdms01Cash2DayTkffGnrtQty + BDMS_01_CASH_2_DAY_TKFF_GNRT_QTY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_CASH_2_DAY_TKFF_GNRT_QTY_LEN = 1;
  	/**
	 * serializeBdms01Cash2DayTkffGnrtQty
	 */
	protected void serializeBdms01Cash2DayTkffGnrtQty(int bdms01Cash2DayTkffGnrtQty) {
		 putNumber(beginBdms01Cash2DayTkffGnrtQty,bdms01Cash2DayTkffGnrtQty,BDMS_01_CASH_2_DAY_TKFF_GNRT_QTY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01Cash2DayTkffGnrtQtyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01Cash2DayTkffGnrtQty
	 */
   	protected  int serializeBdms01Cash2DayTkffGnrtQty(char[] value) {
	    int  bdms01Cash2DayTkffGnrtQty;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01Cash2DayTkffGnrtQty = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginBdms01Cash2DayTkffGnrtQty
		       ,1
		      );
		 localBdms01Cash2DayTkffGnrtQtyCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01Cash2DayTkffGnrtQty;
    }

   protected int checkBdms01Cash2DayTkffGnrtQtyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01Cash2DayTkffGnrtQty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01Cash2DayTkffGnrtQty() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01Cash2DayTkffGnrtQty
			                 ,BDMS_01_CASH_2_DAY_TKFF_GNRT_QTY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01Cash2DayTkffGnrtQty", beginBdms01Cash2DayTkffGnrtQty,BDMS_01_CASH_2_DAY_TKFF_GNRT_QTY_LEN);
    }
   	}
     int localBdms01Cash2AssetLiqnIndCounter = -1;
     public boolean isBdms01Cash2AssetLiqnIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Cash2AssetLiqnIndCounter != sharedCounter;
         localBdms01Cash2AssetLiqnIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CASH_2_ASSET_LIQN_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01Cash2AssetLiqnInd
	 */
   protected void serializeBdms01Cash2AssetLiqnInd(char[] bdms01Cash2AssetLiqnInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Cash2AssetLiqnInd,0,getStringValue(),beginBdms01Cash2AssetLiqnInd,BDMS_01_CASH_2_ASSET_LIQN_IND_LEN);
       localBdms01Cash2AssetLiqnIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Cash2AssetLiqnIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01Cash2AssetLiqnInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Cash2AssetLiqnInd() {	 
   		return (substring(getStringValue(),beginBdms01Cash2AssetLiqnInd,beginBdms01Cash2AssetLiqnInd + BDMS_01_CASH_2_ASSET_LIQN_IND_LEN));
   	}
     int localBdms01Cash2CurrencyCdCounter = -1;
     public boolean isBdms01Cash2CurrencyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Cash2CurrencyCdCounter != sharedCounter;
         localBdms01Cash2CurrencyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CASH_2_CURRENCY_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01Cash2CurrencyCd
	 */
   protected void serializeBdms01Cash2CurrencyCd(char[] bdms01Cash2CurrencyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Cash2CurrencyCd,0,getStringValue(),beginBdms01Cash2CurrencyCd,BDMS_01_CASH_2_CURRENCY_CD_LEN);
       localBdms01Cash2CurrencyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Cash2CurrencyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01Cash2CurrencyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Cash2CurrencyCd() {	 
   		return (substring(getStringValue(),beginBdms01Cash2CurrencyCd,beginBdms01Cash2CurrencyCd + BDMS_01_CASH_2_CURRENCY_CD_LEN));
   	}
     int localBdms01Cash2VendorCdCounter = -1;
     public boolean isBdms01Cash2VendorCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Cash2VendorCdCounter != sharedCounter;
         localBdms01Cash2VendorCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CASH_2_VENDOR_CD_LEN = 5;
	/**
	 * 	serialize this Bdms01Cash2VendorCd
	 */
   protected void serializeBdms01Cash2VendorCd(char[] bdms01Cash2VendorCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Cash2VendorCd,0,getStringValue(),beginBdms01Cash2VendorCd,BDMS_01_CASH_2_VENDOR_CD_LEN);
       localBdms01Cash2VendorCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Cash2VendorCdConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshBdms01Cash2VendorCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Cash2VendorCd() {	 
   		return (substring(getStringValue(),beginBdms01Cash2VendorCd,beginBdms01Cash2VendorCd + BDMS_01_CASH_2_VENDOR_CD_LEN));
   	}
     int localBdms01Cash2TypeIncomeCdCounter = -1;
     public boolean isBdms01Cash2TypeIncomeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Cash2TypeIncomeCdCounter != sharedCounter;
         localBdms01Cash2TypeIncomeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CASH_2_TYPE_INCOME_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01Cash2TypeIncomeCd
	 */
   protected void serializeBdms01Cash2TypeIncomeCd(char[] bdms01Cash2TypeIncomeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Cash2TypeIncomeCd,0,getStringValue(),beginBdms01Cash2TypeIncomeCd,BDMS_01_CASH_2_TYPE_INCOME_CD_LEN);
       localBdms01Cash2TypeIncomeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Cash2TypeIncomeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01Cash2TypeIncomeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Cash2TypeIncomeCd() {	 
   		return (substring(getStringValue(),beginBdms01Cash2TypeIncomeCd,beginBdms01Cash2TypeIncomeCd + BDMS_01_CASH_2_TYPE_INCOME_CD_LEN));
   	}
     int localBdms01Cash2PayFrctnShrIndCounter = -1;
     public boolean isBdms01Cash2PayFrctnShrIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Cash2PayFrctnShrIndCounter != sharedCounter;
         localBdms01Cash2PayFrctnShrIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CASH_2_PAY_FRCTN_SHR_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01Cash2PayFrctnShrInd
	 */
   protected void serializeBdms01Cash2PayFrctnShrInd(char[] bdms01Cash2PayFrctnShrInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Cash2PayFrctnShrInd,0,getStringValue(),beginBdms01Cash2PayFrctnShrInd,BDMS_01_CASH_2_PAY_FRCTN_SHR_IND_LEN);
       localBdms01Cash2PayFrctnShrIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Cash2PayFrctnShrIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01Cash2PayFrctnShrInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Cash2PayFrctnShrInd() {	 
   		return (substring(getStringValue(),beginBdms01Cash2PayFrctnShrInd,beginBdms01Cash2PayFrctnShrInd + BDMS_01_CASH_2_PAY_FRCTN_SHR_IND_LEN));
   	}
     int localMsdStockDivRateCounter = -1;
     
     public boolean isMsdStockDivRateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdStockDivRateCounter != sharedCounter;
         localMsdStockDivRateCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdStockDivRate
	 *	@return msdStockDivRate
	 */
	public char[]  getMsdStockDivRateString() {
	    return getCharArray(beginMsdStockDivRate,MSD_STOCK_DIV_RATE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdStockDivRateIsNumeric() {
		    return isNumeric(beginMsdStockDivRate
	                    ,beginMsdStockDivRate + MSD_STOCK_DIV_RATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_STOCK_DIV_RATE_LEN = 15;
  protected  static final int MSD_STOCK_DIV_RATE_SCALE = 8;

   protected BigDecimal checkMsdStockDivRateMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeMsdStockDivRate
	 */
	protected void serializeMsdStockDivRate(BigDecimal msdStockDivRate) {
	       putNumber(beginMsdStockDivRate,msdStockDivRate,MSD_STOCK_DIV_RATE_LEN,MSD_STOCK_DIV_RATE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdStockDivRateCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdStockDivRate
	 */
   	protected  BigDecimal serializeMsdStockDivRate(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginMsdStockDivRate
		       ,15
		      );		 localMsdStockDivRateCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_STOCK_DIV_RATE_LEN,MSD_STOCK_DIV_RATE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdStockDivRate", beginMsdStockDivRate,MSD_STOCK_DIV_RATE_LEN);
    	}
    }
    /**
	 *	refreshMsdStockDivRate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdStockDivRate() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdStockDivRate
			            ,MSD_STOCK_DIV_RATE_LEN
			            ,MSD_STOCK_DIV_RATE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdStockDivRate", beginMsdStockDivRate,MSD_STOCK_DIV_RATE_LEN);
    }
   	}
     int localBdms01StockRecordDtCounter = -1;
     public boolean isBdms01StockRecordDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01StockRecordDtCounter != sharedCounter;
         localBdms01StockRecordDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_STOCK_RECORD_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01StockRecordDt
	 */
   protected void serializeBdms01StockRecordDt(char[] bdms01StockRecordDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01StockRecordDt,0,getStringValue(),beginBdms01StockRecordDt,BDMS_01_STOCK_RECORD_DT_LEN);
       localBdms01StockRecordDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01StockRecordDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01StockRecordDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01StockRecordDt() {	 
   		return (substring(getStringValue(),beginBdms01StockRecordDt,beginBdms01StockRecordDt + BDMS_01_STOCK_RECORD_DT_LEN));
   	}
     int localBdms01StockPaymentDtCounter = -1;
     public boolean isBdms01StockPaymentDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01StockPaymentDtCounter != sharedCounter;
         localBdms01StockPaymentDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_STOCK_PAYMENT_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01StockPaymentDt
	 */
   protected void serializeBdms01StockPaymentDt(char[] bdms01StockPaymentDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01StockPaymentDt,0,getStringValue(),beginBdms01StockPaymentDt,BDMS_01_STOCK_PAYMENT_DT_LEN);
       localBdms01StockPaymentDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01StockPaymentDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01StockPaymentDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01StockPaymentDt() {	 
   		return (substring(getStringValue(),beginBdms01StockPaymentDt,beginBdms01StockPaymentDt + BDMS_01_STOCK_PAYMENT_DT_LEN));
   	}
     int localBdms01StockExdividendDtCounter = -1;
     public boolean isBdms01StockExdividendDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01StockExdividendDtCounter != sharedCounter;
         localBdms01StockExdividendDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_STOCK_EXDIVIDEND_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01StockExdividendDt
	 */
   protected void serializeBdms01StockExdividendDt(char[] bdms01StockExdividendDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01StockExdividendDt,0,getStringValue(),beginBdms01StockExdividendDt,BDMS_01_STOCK_EXDIVIDEND_DT_LEN);
       localBdms01StockExdividendDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01StockExdividendDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01StockExdividendDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01StockExdividendDt() {	 
   		return (substring(getStringValue(),beginBdms01StockExdividendDt,beginBdms01StockExdividendDt + BDMS_01_STOCK_EXDIVIDEND_DT_LEN));
   	}
     int localBdms01StockFrqncPayCdCounter = -1;
     public boolean isBdms01StockFrqncPayCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01StockFrqncPayCdCounter != sharedCounter;
         localBdms01StockFrqncPayCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_STOCK_FRQNC_PAY_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01StockFrqncPayCd
	 */
   protected void serializeBdms01StockFrqncPayCd(char[] bdms01StockFrqncPayCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01StockFrqncPayCd,0,getStringValue(),beginBdms01StockFrqncPayCd,BDMS_01_STOCK_FRQNC_PAY_CD_LEN);
       localBdms01StockFrqncPayCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01StockFrqncPayCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01StockFrqncPayCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01StockFrqncPayCd() {	 
   		return (substring(getStringValue(),beginBdms01StockFrqncPayCd,beginBdms01StockFrqncPayCd + BDMS_01_STOCK_FRQNC_PAY_CD_LEN));
   	}
     int localBdms01StockDayTkffGnrtQtyCounter = -1;
     public boolean isBdms01StockDayTkffGnrtQtyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01StockDayTkffGnrtQtyCounter != sharedCounter;
         localBdms01StockDayTkffGnrtQtyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01StockDayTkffGnrtQty
	 *	@return bdms01StockDayTkffGnrtQty
	 */
	public char[]  getBdms01StockDayTkffGnrtQtyString() {
	     return getCharArray(beginBdms01StockDayTkffGnrtQty,BDMS_01_STOCK_DAY_TKFF_GNRT_QTY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01StockDayTkffGnrtQtyIsNumeric() {
	    return isNumeric(beginBdms01StockDayTkffGnrtQty
	                    ,beginBdms01StockDayTkffGnrtQty + BDMS_01_STOCK_DAY_TKFF_GNRT_QTY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_STOCK_DAY_TKFF_GNRT_QTY_LEN = 1;
  	/**
	 * serializeBdms01StockDayTkffGnrtQty
	 */
	protected void serializeBdms01StockDayTkffGnrtQty(int bdms01StockDayTkffGnrtQty) {
		 putNumber(beginBdms01StockDayTkffGnrtQty,bdms01StockDayTkffGnrtQty,BDMS_01_STOCK_DAY_TKFF_GNRT_QTY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01StockDayTkffGnrtQtyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01StockDayTkffGnrtQty
	 */
   	protected  int serializeBdms01StockDayTkffGnrtQty(char[] value) {
	    int  bdms01StockDayTkffGnrtQty;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01StockDayTkffGnrtQty = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginBdms01StockDayTkffGnrtQty
		       ,1
		      );
		 localBdms01StockDayTkffGnrtQtyCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01StockDayTkffGnrtQty;
    }

   protected int checkBdms01StockDayTkffGnrtQtyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01StockDayTkffGnrtQty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01StockDayTkffGnrtQty() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01StockDayTkffGnrtQty
			                 ,BDMS_01_STOCK_DAY_TKFF_GNRT_QTY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01StockDayTkffGnrtQty", beginBdms01StockDayTkffGnrtQty,BDMS_01_STOCK_DAY_TKFF_GNRT_QTY_LEN);
    }
   	}
     int localBdms01StockAssetLiqnIndCounter = -1;
     public boolean isBdms01StockAssetLiqnIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01StockAssetLiqnIndCounter != sharedCounter;
         localBdms01StockAssetLiqnIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_STOCK_ASSET_LIQN_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01StockAssetLiqnInd
	 */
   protected void serializeBdms01StockAssetLiqnInd(char[] bdms01StockAssetLiqnInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01StockAssetLiqnInd,0,getStringValue(),beginBdms01StockAssetLiqnInd,BDMS_01_STOCK_ASSET_LIQN_IND_LEN);
       localBdms01StockAssetLiqnIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01StockAssetLiqnIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01StockAssetLiqnInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01StockAssetLiqnInd() {	 
   		return (substring(getStringValue(),beginBdms01StockAssetLiqnInd,beginBdms01StockAssetLiqnInd + BDMS_01_STOCK_ASSET_LIQN_IND_LEN));
   	}
     int localBdms01StockCurrencyCdCounter = -1;
     public boolean isBdms01StockCurrencyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01StockCurrencyCdCounter != sharedCounter;
         localBdms01StockCurrencyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_STOCK_CURRENCY_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01StockCurrencyCd
	 */
   protected void serializeBdms01StockCurrencyCd(char[] bdms01StockCurrencyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01StockCurrencyCd,0,getStringValue(),beginBdms01StockCurrencyCd,BDMS_01_STOCK_CURRENCY_CD_LEN);
       localBdms01StockCurrencyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01StockCurrencyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01StockCurrencyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01StockCurrencyCd() {	 
   		return (substring(getStringValue(),beginBdms01StockCurrencyCd,beginBdms01StockCurrencyCd + BDMS_01_STOCK_CURRENCY_CD_LEN));
   	}
     int localBdms01StockVendorCdCounter = -1;
     public boolean isBdms01StockVendorCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01StockVendorCdCounter != sharedCounter;
         localBdms01StockVendorCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_STOCK_VENDOR_CD_LEN = 5;
	/**
	 * 	serialize this Bdms01StockVendorCd
	 */
   protected void serializeBdms01StockVendorCd(char[] bdms01StockVendorCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01StockVendorCd,0,getStringValue(),beginBdms01StockVendorCd,BDMS_01_STOCK_VENDOR_CD_LEN);
       localBdms01StockVendorCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01StockVendorCdConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshBdms01StockVendorCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01StockVendorCd() {	 
   		return (substring(getStringValue(),beginBdms01StockVendorCd,beginBdms01StockVendorCd + BDMS_01_STOCK_VENDOR_CD_LEN));
   	}
     int localBdms01StockTypeIncomeCdCounter = -1;
     public boolean isBdms01StockTypeIncomeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01StockTypeIncomeCdCounter != sharedCounter;
         localBdms01StockTypeIncomeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_STOCK_TYPE_INCOME_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01StockTypeIncomeCd
	 */
   protected void serializeBdms01StockTypeIncomeCd(char[] bdms01StockTypeIncomeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01StockTypeIncomeCd,0,getStringValue(),beginBdms01StockTypeIncomeCd,BDMS_01_STOCK_TYPE_INCOME_CD_LEN);
       localBdms01StockTypeIncomeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01StockTypeIncomeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01StockTypeIncomeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01StockTypeIncomeCd() {	 
   		return (substring(getStringValue(),beginBdms01StockTypeIncomeCd,beginBdms01StockTypeIncomeCd + BDMS_01_STOCK_TYPE_INCOME_CD_LEN));
   	}
     int localBdms01StockPayFrctnShrIndCounter = -1;
     public boolean isBdms01StockPayFrctnShrIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01StockPayFrctnShrIndCounter != sharedCounter;
         localBdms01StockPayFrctnShrIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_STOCK_PAY_FRCTN_SHR_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01StockPayFrctnShrInd
	 */
   protected void serializeBdms01StockPayFrctnShrInd(char[] bdms01StockPayFrctnShrInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01StockPayFrctnShrInd,0,getStringValue(),beginBdms01StockPayFrctnShrInd,BDMS_01_STOCK_PAY_FRCTN_SHR_IND_LEN);
       localBdms01StockPayFrctnShrIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01StockPayFrctnShrIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01StockPayFrctnShrInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01StockPayFrctnShrInd() {	 
   		return (substring(getStringValue(),beginBdms01StockPayFrctnShrInd,beginBdms01StockPayFrctnShrInd + BDMS_01_STOCK_PAY_FRCTN_SHR_IND_LEN));
   	}
     int localMsdSplitDivRateCounter = -1;
     
     public boolean isMsdSplitDivRateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSplitDivRateCounter != sharedCounter;
         localMsdSplitDivRateCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdSplitDivRate
	 *	@return msdSplitDivRate
	 */
	public char[]  getMsdSplitDivRateString() {
	    return getCharArray(beginMsdSplitDivRate,MSD_SPLIT_DIV_RATE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdSplitDivRateIsNumeric() {
		    return isNumeric(beginMsdSplitDivRate
	                    ,beginMsdSplitDivRate + MSD_SPLIT_DIV_RATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_SPLIT_DIV_RATE_LEN = 15;
  protected  static final int MSD_SPLIT_DIV_RATE_SCALE = 8;

   protected BigDecimal checkMsdSplitDivRateMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeMsdSplitDivRate
	 */
	protected void serializeMsdSplitDivRate(BigDecimal msdSplitDivRate) {
	       putNumber(beginMsdSplitDivRate,msdSplitDivRate,MSD_SPLIT_DIV_RATE_LEN,MSD_SPLIT_DIV_RATE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdSplitDivRateCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdSplitDivRate
	 */
   	protected  BigDecimal serializeMsdSplitDivRate(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginMsdSplitDivRate
		       ,15
		      );		 localMsdSplitDivRateCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_SPLIT_DIV_RATE_LEN,MSD_SPLIT_DIV_RATE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdSplitDivRate", beginMsdSplitDivRate,MSD_SPLIT_DIV_RATE_LEN);
    	}
    }
    /**
	 *	refreshMsdSplitDivRate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdSplitDivRate() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdSplitDivRate
			            ,MSD_SPLIT_DIV_RATE_LEN
			            ,MSD_SPLIT_DIV_RATE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdSplitDivRate", beginMsdSplitDivRate,MSD_SPLIT_DIV_RATE_LEN);
    }
   	}
     int localBdms01SplitRecordDtCounter = -1;
     public boolean isBdms01SplitRecordDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SplitRecordDtCounter != sharedCounter;
         localBdms01SplitRecordDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SPLIT_RECORD_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01SplitRecordDt
	 */
   protected void serializeBdms01SplitRecordDt(char[] bdms01SplitRecordDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SplitRecordDt,0,getStringValue(),beginBdms01SplitRecordDt,BDMS_01_SPLIT_RECORD_DT_LEN);
       localBdms01SplitRecordDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SplitRecordDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01SplitRecordDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SplitRecordDt() {	 
   		return (substring(getStringValue(),beginBdms01SplitRecordDt,beginBdms01SplitRecordDt + BDMS_01_SPLIT_RECORD_DT_LEN));
   	}
     int localBdms01SplitPaymentDtCounter = -1;
     public boolean isBdms01SplitPaymentDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SplitPaymentDtCounter != sharedCounter;
         localBdms01SplitPaymentDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SPLIT_PAYMENT_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01SplitPaymentDt
	 */
   protected void serializeBdms01SplitPaymentDt(char[] bdms01SplitPaymentDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SplitPaymentDt,0,getStringValue(),beginBdms01SplitPaymentDt,BDMS_01_SPLIT_PAYMENT_DT_LEN);
       localBdms01SplitPaymentDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SplitPaymentDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01SplitPaymentDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SplitPaymentDt() {	 
   		return (substring(getStringValue(),beginBdms01SplitPaymentDt,beginBdms01SplitPaymentDt + BDMS_01_SPLIT_PAYMENT_DT_LEN));
   	}
     int localBdms01SplitExdividendDtCounter = -1;
     public boolean isBdms01SplitExdividendDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SplitExdividendDtCounter != sharedCounter;
         localBdms01SplitExdividendDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SPLIT_EXDIVIDEND_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01SplitExdividendDt
	 */
   protected void serializeBdms01SplitExdividendDt(char[] bdms01SplitExdividendDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SplitExdividendDt,0,getStringValue(),beginBdms01SplitExdividendDt,BDMS_01_SPLIT_EXDIVIDEND_DT_LEN);
       localBdms01SplitExdividendDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SplitExdividendDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01SplitExdividendDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SplitExdividendDt() {	 
   		return (substring(getStringValue(),beginBdms01SplitExdividendDt,beginBdms01SplitExdividendDt + BDMS_01_SPLIT_EXDIVIDEND_DT_LEN));
   	}
     int localBdms01SplitFrqncPayCdCounter = -1;
     public boolean isBdms01SplitFrqncPayCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SplitFrqncPayCdCounter != sharedCounter;
         localBdms01SplitFrqncPayCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SPLIT_FRQNC_PAY_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01SplitFrqncPayCd
	 */
   protected void serializeBdms01SplitFrqncPayCd(char[] bdms01SplitFrqncPayCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SplitFrqncPayCd,0,getStringValue(),beginBdms01SplitFrqncPayCd,BDMS_01_SPLIT_FRQNC_PAY_CD_LEN);
       localBdms01SplitFrqncPayCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SplitFrqncPayCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01SplitFrqncPayCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SplitFrqncPayCd() {	 
   		return (substring(getStringValue(),beginBdms01SplitFrqncPayCd,beginBdms01SplitFrqncPayCd + BDMS_01_SPLIT_FRQNC_PAY_CD_LEN));
   	}
     int localBdms01SplitDayTkffGnrtQtyCounter = -1;
     public boolean isBdms01SplitDayTkffGnrtQtyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SplitDayTkffGnrtQtyCounter != sharedCounter;
         localBdms01SplitDayTkffGnrtQtyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01SplitDayTkffGnrtQty
	 *	@return bdms01SplitDayTkffGnrtQty
	 */
	public char[]  getBdms01SplitDayTkffGnrtQtyString() {
	     return getCharArray(beginBdms01SplitDayTkffGnrtQty,BDMS_01_SPLIT_DAY_TKFF_GNRT_QTY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01SplitDayTkffGnrtQtyIsNumeric() {
	    return isNumeric(beginBdms01SplitDayTkffGnrtQty
	                    ,beginBdms01SplitDayTkffGnrtQty + BDMS_01_SPLIT_DAY_TKFF_GNRT_QTY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_SPLIT_DAY_TKFF_GNRT_QTY_LEN = 1;
  	/**
	 * serializeBdms01SplitDayTkffGnrtQty
	 */
	protected void serializeBdms01SplitDayTkffGnrtQty(int bdms01SplitDayTkffGnrtQty) {
		 putNumber(beginBdms01SplitDayTkffGnrtQty,bdms01SplitDayTkffGnrtQty,BDMS_01_SPLIT_DAY_TKFF_GNRT_QTY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01SplitDayTkffGnrtQtyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01SplitDayTkffGnrtQty
	 */
   	protected  int serializeBdms01SplitDayTkffGnrtQty(char[] value) {
	    int  bdms01SplitDayTkffGnrtQty;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01SplitDayTkffGnrtQty = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginBdms01SplitDayTkffGnrtQty
		       ,1
		      );
		 localBdms01SplitDayTkffGnrtQtyCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01SplitDayTkffGnrtQty;
    }

   protected int checkBdms01SplitDayTkffGnrtQtyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01SplitDayTkffGnrtQty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01SplitDayTkffGnrtQty() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01SplitDayTkffGnrtQty
			                 ,BDMS_01_SPLIT_DAY_TKFF_GNRT_QTY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01SplitDayTkffGnrtQty", beginBdms01SplitDayTkffGnrtQty,BDMS_01_SPLIT_DAY_TKFF_GNRT_QTY_LEN);
    }
   	}
     int localBdms01SplitAssetLiqnIndCounter = -1;
     public boolean isBdms01SplitAssetLiqnIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SplitAssetLiqnIndCounter != sharedCounter;
         localBdms01SplitAssetLiqnIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SPLIT_ASSET_LIQN_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01SplitAssetLiqnInd
	 */
   protected void serializeBdms01SplitAssetLiqnInd(char[] bdms01SplitAssetLiqnInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SplitAssetLiqnInd,0,getStringValue(),beginBdms01SplitAssetLiqnInd,BDMS_01_SPLIT_ASSET_LIQN_IND_LEN);
       localBdms01SplitAssetLiqnIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SplitAssetLiqnIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01SplitAssetLiqnInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SplitAssetLiqnInd() {	 
   		return (substring(getStringValue(),beginBdms01SplitAssetLiqnInd,beginBdms01SplitAssetLiqnInd + BDMS_01_SPLIT_ASSET_LIQN_IND_LEN));
   	}
     int localBdms01SplitCurrencyCdCounter = -1;
     public boolean isBdms01SplitCurrencyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SplitCurrencyCdCounter != sharedCounter;
         localBdms01SplitCurrencyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SPLIT_CURRENCY_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01SplitCurrencyCd
	 */
   protected void serializeBdms01SplitCurrencyCd(char[] bdms01SplitCurrencyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SplitCurrencyCd,0,getStringValue(),beginBdms01SplitCurrencyCd,BDMS_01_SPLIT_CURRENCY_CD_LEN);
       localBdms01SplitCurrencyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SplitCurrencyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01SplitCurrencyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SplitCurrencyCd() {	 
   		return (substring(getStringValue(),beginBdms01SplitCurrencyCd,beginBdms01SplitCurrencyCd + BDMS_01_SPLIT_CURRENCY_CD_LEN));
   	}
     int localBdms01SplitVendorCdCounter = -1;
     public boolean isBdms01SplitVendorCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SplitVendorCdCounter != sharedCounter;
         localBdms01SplitVendorCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SPLIT_VENDOR_CD_LEN = 5;
	/**
	 * 	serialize this Bdms01SplitVendorCd
	 */
   protected void serializeBdms01SplitVendorCd(char[] bdms01SplitVendorCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SplitVendorCd,0,getStringValue(),beginBdms01SplitVendorCd,BDMS_01_SPLIT_VENDOR_CD_LEN);
       localBdms01SplitVendorCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SplitVendorCdConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshBdms01SplitVendorCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SplitVendorCd() {	 
   		return (substring(getStringValue(),beginBdms01SplitVendorCd,beginBdms01SplitVendorCd + BDMS_01_SPLIT_VENDOR_CD_LEN));
   	}
     int localBdms01SplitTypeIncomeCdCounter = -1;
     public boolean isBdms01SplitTypeIncomeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SplitTypeIncomeCdCounter != sharedCounter;
         localBdms01SplitTypeIncomeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SPLIT_TYPE_INCOME_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01SplitTypeIncomeCd
	 */
   protected void serializeBdms01SplitTypeIncomeCd(char[] bdms01SplitTypeIncomeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SplitTypeIncomeCd,0,getStringValue(),beginBdms01SplitTypeIncomeCd,BDMS_01_SPLIT_TYPE_INCOME_CD_LEN);
       localBdms01SplitTypeIncomeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SplitTypeIncomeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01SplitTypeIncomeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SplitTypeIncomeCd() {	 
   		return (substring(getStringValue(),beginBdms01SplitTypeIncomeCd,beginBdms01SplitTypeIncomeCd + BDMS_01_SPLIT_TYPE_INCOME_CD_LEN));
   	}
     int localBdms01SplitPayFrctnShrIndCounter = -1;
     public boolean isBdms01SplitPayFrctnShrIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SplitPayFrctnShrIndCounter != sharedCounter;
         localBdms01SplitPayFrctnShrIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SPLIT_PAY_FRCTN_SHR_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01SplitPayFrctnShrInd
	 */
   protected void serializeBdms01SplitPayFrctnShrInd(char[] bdms01SplitPayFrctnShrInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SplitPayFrctnShrInd,0,getStringValue(),beginBdms01SplitPayFrctnShrInd,BDMS_01_SPLIT_PAY_FRCTN_SHR_IND_LEN);
       localBdms01SplitPayFrctnShrIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SplitPayFrctnShrIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01SplitPayFrctnShrInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SplitPayFrctnShrInd() {	 
   		return (substring(getStringValue(),beginBdms01SplitPayFrctnShrInd,beginBdms01SplitPayFrctnShrInd + BDMS_01_SPLIT_PAY_FRCTN_SHR_IND_LEN));
   	}
     int localMsdSplitRightIndCounter = -1;
     public boolean isMsdSplitRightIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSplitRightIndCounter != sharedCounter;
         localMsdSplitRightIndCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SPLIT_RIGHT_IND_LEN = 1;
	/**
	 * 	serialize this MsdSplitRightInd
	 */
   protected void serializeMsdSplitRightInd(char[] msdSplitRightInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSplitRightInd,0,getStringValue(),beginMsdSplitRightInd,MSD_SPLIT_RIGHT_IND_LEN);
       localMsdSplitRightIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSplitRightIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdSplitRightInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSplitRightInd() {	 
   		return (substring(getStringValue(),beginMsdSplitRightInd,beginMsdSplitRightInd + MSD_SPLIT_RIGHT_IND_LEN));
   	}




}
  
