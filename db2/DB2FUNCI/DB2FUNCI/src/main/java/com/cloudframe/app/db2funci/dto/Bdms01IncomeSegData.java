package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01IncomeSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01IncomeSegData extends Bdms01IncomeSegDataSerialized { 
   

								private int bdms01IncomeSegSqlcd;

						private char[] msdDividendType = Field.fillLowValue(1);

						private char[] msdPaymentFreq = Field.fillLowValue(1);
				private MsdCashDivRec1Mmddyycc msdCashDivRec1Mmddyycc = new MsdCashDivRec1Mmddyycc();

								private BigDecimal msdCashDivRate1 = BigDecimal.ZERO;
				private MsdCashDivEx1Mmddyycc msdCashDivEx1Mmddyycc = new MsdCashDivEx1Mmddyycc();
				private MsdCashDivPay1Mmddyycc msdCashDivPay1Mmddyycc = new MsdCashDivPay1Mmddyycc();

						private char[] bdms01Cash1RecordDt = Field.fillLowValue(10);

						private char[] bdms01Cash1PaymentDt = Field.fillLowValue(10);

						private char[] bdms01Cash1ExdividendDt = Field.fillLowValue(10);

						private char[] bdms01Cash1FrqncPayCd = Field.fillLowValue(2);

								private int bdms01Cash1DayTkffGnrtQty;

						private char[] bdms01Cash1AssetLiqnInd = Field.fillLowValue(1);

						private char[] bdms01Cash1CurrencyCd = Field.fillLowValue(2);

						private char[] bdms01Cash1VendorCd = Field.fillLowValue(5);

						private char[] bdms01Cash1TypeIncomeCd = Field.fillLowValue(2);

						private char[] bdms01Cash1PayFrctnShrInd = Field.fillLowValue(1);
				private MsdCashDivRec2Mmddyycc msdCashDivRec2Mmddyycc = new MsdCashDivRec2Mmddyycc();

								private BigDecimal msdCashDivRate2 = BigDecimal.ZERO;
				private MsdCashDivEx2Mmddyycc msdCashDivEx2Mmddyycc = new MsdCashDivEx2Mmddyycc();
				private MsdCashDivPay2Mmddyycc msdCashDivPay2Mmddyycc = new MsdCashDivPay2Mmddyycc();

						private char[] bdms01Cash2RecordDt = Field.fillLowValue(10);

						private char[] bdms01Cash2PaymentDt = Field.fillLowValue(10);

						private char[] bdms01Cash2ExdividendDt = Field.fillLowValue(10);

						private char[] bdms01Cash2FrqncPayCd = Field.fillLowValue(2);

								private int bdms01Cash2DayTkffGnrtQty;

						private char[] bdms01Cash2AssetLiqnInd = Field.fillLowValue(1);

						private char[] bdms01Cash2CurrencyCd = Field.fillLowValue(2);

						private char[] bdms01Cash2VendorCd = Field.fillLowValue(5);

						private char[] bdms01Cash2TypeIncomeCd = Field.fillLowValue(2);

						private char[] bdms01Cash2PayFrctnShrInd = Field.fillLowValue(1);
				private MsdStockDivRecMmddyycc msdStockDivRecMmddyycc = new MsdStockDivRecMmddyycc();

								private BigDecimal msdStockDivRate = BigDecimal.ZERO;
				private MsdStockDivExMmddyycc msdStockDivExMmddyycc = new MsdStockDivExMmddyycc();
				private MsdStockDivPayMmddyycc msdStockDivPayMmddyycc = new MsdStockDivPayMmddyycc();

						private char[] bdms01StockRecordDt = Field.fillLowValue(10);

						private char[] bdms01StockPaymentDt = Field.fillLowValue(10);

						private char[] bdms01StockExdividendDt = Field.fillLowValue(10);

						private char[] bdms01StockFrqncPayCd = Field.fillLowValue(2);

								private int bdms01StockDayTkffGnrtQty;

						private char[] bdms01StockAssetLiqnInd = Field.fillLowValue(1);

						private char[] bdms01StockCurrencyCd = Field.fillLowValue(2);

						private char[] bdms01StockVendorCd = Field.fillLowValue(5);

						private char[] bdms01StockTypeIncomeCd = Field.fillLowValue(2);

						private char[] bdms01StockPayFrctnShrInd = Field.fillLowValue(1);
				private MsdSplitDivRecMmddyycc msdSplitDivRecMmddyycc = new MsdSplitDivRecMmddyycc();

								private BigDecimal msdSplitDivRate = BigDecimal.ZERO;
				private MsdSplitDivExMmddyycc msdSplitDivExMmddyycc = new MsdSplitDivExMmddyycc();
				private MsdSplitDivPayMmddyycc msdSplitDivPayMmddyycc = new MsdSplitDivPayMmddyycc();

						private char[] bdms01SplitRecordDt = Field.fillLowValue(10);

						private char[] bdms01SplitPaymentDt = Field.fillLowValue(10);

						private char[] bdms01SplitExdividendDt = Field.fillLowValue(10);

						private char[] bdms01SplitFrqncPayCd = Field.fillLowValue(2);

								private int bdms01SplitDayTkffGnrtQty;

						private char[] bdms01SplitAssetLiqnInd = Field.fillLowValue(1);

						private char[] bdms01SplitCurrencyCd = Field.fillLowValue(2);

						private char[] bdms01SplitVendorCd = Field.fillLowValue(5);

						private char[] bdms01SplitTypeIncomeCd = Field.fillLowValue(2);

						private char[] bdms01SplitPayFrctnShrInd = Field.fillLowValue(1);

						private char[] msdSplitRightInd = Field.fillLowValue(1);

	
	/**
	* Constructor for Bdms01IncomeSegData
	**/
    public Bdms01IncomeSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01IncomeSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01IncomeSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			msdCashDivRec1Mmddyycc.setParent(this,getStartOffset() + 6);
	       			msdCashDivEx1Mmddyycc.setParent(this,getStartOffset() + 29);
	       			msdCashDivPay1Mmddyycc.setParent(this,getStartOffset() + 37);
	       			msdCashDivRec2Mmddyycc.setParent(this,getStartOffset() + 89);
	       			msdCashDivEx2Mmddyycc.setParent(this,getStartOffset() + 112);
	       			msdCashDivPay2Mmddyycc.setParent(this,getStartOffset() + 120);
	       			msdStockDivRecMmddyycc.setParent(this,getStartOffset() + 172);
	       			msdStockDivExMmddyycc.setParent(this,getStartOffset() + 195);
	       			msdStockDivPayMmddyycc.setParent(this,getStartOffset() + 203);
	       			msdSplitDivRecMmddyycc.setParent(this,getStartOffset() + 255);
	       			msdSplitDivExMmddyycc.setParent(this,getStartOffset() + 278);
	       			msdSplitDivPayMmddyycc.setParent(this,getStartOffset() + 286);
    } 

	/**
	 *	Returns the value of bdms01IncomeSegSqlcd
	 *	@return bdms01IncomeSegSqlcd
	 */
	public int getBdms01IncomeSegSqlcd() throws CFException {
       if (isBdms01IncomeSegSqlcdModified()) { 
           bdms01IncomeSegSqlcd = refreshBdms01IncomeSegSqlcd();
        }
   		return bdms01IncomeSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01IncomeSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-INCOME-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01IncomeSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01IncomeSegSqlcd = checkBdms01IncomeSegSqlcdMaxLimit(number); 
		serializeBdms01IncomeSegSqlcd(bdms01IncomeSegSqlcd);
	}
	

	public void setBdms01IncomeSegSqlcd(long number) {
	    number = checkBdms01IncomeSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01IncomeSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01IncomeSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01IncomeSegSqlcd(char[] value) throws CFException {
		 bdms01IncomeSegSqlcd = serializeBdms01IncomeSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01IncomeSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01IncomeSegSqlcdString(char[] value) throws CFException {
		 setBdms01IncomeSegSqlcd(value);
	}
	/**
	 *	Returns the value of msdDividendType
	 *	@return msdDividendType
	 */
   public char[] getMsdDividendType() throws CFException{
     if (isMsdDividendTypeModified()) { 
        msdDividendType = refreshMsdDividendType();
     }
   		return msdDividendType;
   }

  
	/**
	*  set variable msdDividendType
	*  Corresponding COBOL Variable is MSD-DIVIDEND-TYPE
	*  @param value
	**/
   public void setMsdDividendType(char[] value) {
      msdDividendType = checkMsdDividendTypeConstraints(value);
      serializeMsdDividendType(msdDividendType);
   } 

     /**
	 * 	Update MsdDividendType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdDividendType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdDividendType,msdDividendType.length);
   	
   }
   
   public void setMsdDividendType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdDividendType,msdDividendType.length);
   	
   }
   
     /**
	 * 	Update MsdDividendType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdDividendType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdDividendType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdDividendType with another Field
	 *	@param value
	 */
   public void setMsdDividendType(Field source) {
       replace(source,0,source.length(),beginMsdDividendType,MSD_DIVIDEND_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update MsdDividendType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdDividendType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdDividendType,MSD_DIVIDEND_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update MsdDividendType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdDividendType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdDividendType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdPaymentFreq
	 *	@return msdPaymentFreq
	 */
   public char[] getMsdPaymentFreq() throws CFException{
     if (isMsdPaymentFreqModified()) { 
        msdPaymentFreq = refreshMsdPaymentFreq();
     }
   		return msdPaymentFreq;
   }

  
	/**
	*  set variable msdPaymentFreq
	*  Corresponding COBOL Variable is MSD-PAYMENT-FREQ
	*  @param value
	**/
   public void setMsdPaymentFreq(char[] value) {
      msdPaymentFreq = checkMsdPaymentFreqConstraints(value);
      serializeMsdPaymentFreq(msdPaymentFreq);
   } 

     /**
	 * 	Update MsdPaymentFreq 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdPaymentFreq(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdPaymentFreq,msdPaymentFreq.length);
   	
   }
   
   public void setMsdPaymentFreq(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdPaymentFreq,msdPaymentFreq.length);
   	
   }
   
     /**
	 * 	Update MsdPaymentFreq 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdPaymentFreq(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdPaymentFreq+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdPaymentFreq with another Field
	 *	@param value
	 */
   public void setMsdPaymentFreq(Field source) {
       replace(source,0,source.length(),beginMsdPaymentFreq,MSD_PAYMENT_FREQ_LEN);
   	
   }  
   
     /**
	 * 	Update MsdPaymentFreq 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdPaymentFreq(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdPaymentFreq,MSD_PAYMENT_FREQ_LEN);
   	
   }
   
     /**
	 * 	Update MsdPaymentFreq 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdPaymentFreq(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdPaymentFreq+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdCashDivRec1Mmddyycc
	 *	@return msdCashDivRec1Mmddyycc
	 */   
	 public MsdCashDivRec1Mmddyycc getMsdCashDivRec1Mmddyycc() {
   	return msdCashDivRec1Mmddyycc;
   }
   /**
	* 	Update MsdCashDivRec1Mmddyycc with the passed value
	*   Corresponding COBOL Variable is MSD-CASH-DIV-REC1-MMDDYYCC
	*	@param value
	*/
   public void setMsdCashDivRec1Mmddyycc(char[] value) {
      msdCashDivRec1Mmddyycc.setString(value); 
   }   
    
     /**
	 * 	Update MsdCashDivRec1Mmddyycc 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdCashDivRec1Mmddyycc(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivRec1Mmddyycc.begin,msdCashDivRec1Mmddyycc.length());
   }
   
     /**
	 * 	Update MsdCashDivRec1Mmddyycc 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdCashDivRec1Mmddyycc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivRec1Mmddyycc.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdCashDivRec1Mmddyycc with another Field
	 *	@param value
	 */
   public void setMsdCashDivRec1Mmddyycc(Field source) {
   	replace(source,0,source.length(),msdCashDivRec1Mmddyycc.begin,msdCashDivRec1Mmddyycc.length());
   }  
   
     /**
	 * 	Update MsdCashDivRec1Mmddyycc 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdCashDivRec1Mmddyycc(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivRec1Mmddyycc.begin,msdCashDivRec1Mmddyycc.length());
   }
   
     /**
	 * 	Update MsdCashDivRec1Mmddyycc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdCashDivRec1Mmddyycc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivRec1Mmddyycc.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdCashDivRate1
	 *	@return msdCashDivRate1
	 */
	public BigDecimal getMsdCashDivRate1() throws CFException {
       if (isMsdCashDivRate1Modified()) { 
           msdCashDivRate1 = refreshMsdCashDivRate1();
        }
   		return msdCashDivRate1;
	}
	

	
	   
	/**
	 * 	Update MsdCashDivRate1 with the passed number
	 *  Corresponding COBOL Variable is MSD-CASH-DIV-RATE1
	 *	@param number
	 */
	public void setMsdCashDivRate1(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdCashDivRate1 = checkMsdCashDivRate1MaxLimit(number);
	    serializeMsdCashDivRate1(msdCashDivRate1);
   }
	/**
	 * 	Update MsdCashDivRate1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivRate1(char[] value) throws CFException {
		 msdCashDivRate1 = serializeMsdCashDivRate1(value);
	}   
	/**
	 *	Returns the value of msdCashDivEx1Mmddyycc
	 *	@return msdCashDivEx1Mmddyycc
	 */   
	 public MsdCashDivEx1Mmddyycc getMsdCashDivEx1Mmddyycc() {
   	return msdCashDivEx1Mmddyycc;
   }
   /**
	* 	Update MsdCashDivEx1Mmddyycc with the passed value
	*   Corresponding COBOL Variable is MSD-CASH-DIV-EX1-MMDDYYCC
	*	@param value
	*/
   public void setMsdCashDivEx1Mmddyycc(char[] value) {
      msdCashDivEx1Mmddyycc.setString(value); 
   }   
    
     /**
	 * 	Update MsdCashDivEx1Mmddyycc 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdCashDivEx1Mmddyycc(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivEx1Mmddyycc.begin,msdCashDivEx1Mmddyycc.length());
   }
   
     /**
	 * 	Update MsdCashDivEx1Mmddyycc 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdCashDivEx1Mmddyycc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivEx1Mmddyycc.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdCashDivEx1Mmddyycc with another Field
	 *	@param value
	 */
   public void setMsdCashDivEx1Mmddyycc(Field source) {
   	replace(source,0,source.length(),msdCashDivEx1Mmddyycc.begin,msdCashDivEx1Mmddyycc.length());
   }  
   
     /**
	 * 	Update MsdCashDivEx1Mmddyycc 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdCashDivEx1Mmddyycc(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivEx1Mmddyycc.begin,msdCashDivEx1Mmddyycc.length());
   }
   
     /**
	 * 	Update MsdCashDivEx1Mmddyycc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdCashDivEx1Mmddyycc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivEx1Mmddyycc.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdCashDivPay1Mmddyycc
	 *	@return msdCashDivPay1Mmddyycc
	 */   
	 public MsdCashDivPay1Mmddyycc getMsdCashDivPay1Mmddyycc() {
   	return msdCashDivPay1Mmddyycc;
   }
   /**
	* 	Update MsdCashDivPay1Mmddyycc with the passed value
	*   Corresponding COBOL Variable is MSD-CASH-DIV-PAY1-MMDDYYCC
	*	@param value
	*/
   public void setMsdCashDivPay1Mmddyycc(char[] value) {
      msdCashDivPay1Mmddyycc.setString(value); 
   }   
    
     /**
	 * 	Update MsdCashDivPay1Mmddyycc 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdCashDivPay1Mmddyycc(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivPay1Mmddyycc.begin,msdCashDivPay1Mmddyycc.length());
   }
   
     /**
	 * 	Update MsdCashDivPay1Mmddyycc 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdCashDivPay1Mmddyycc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivPay1Mmddyycc.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdCashDivPay1Mmddyycc with another Field
	 *	@param value
	 */
   public void setMsdCashDivPay1Mmddyycc(Field source) {
   	replace(source,0,source.length(),msdCashDivPay1Mmddyycc.begin,msdCashDivPay1Mmddyycc.length());
   }  
   
     /**
	 * 	Update MsdCashDivPay1Mmddyycc 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdCashDivPay1Mmddyycc(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivPay1Mmddyycc.begin,msdCashDivPay1Mmddyycc.length());
   }
   
     /**
	 * 	Update MsdCashDivPay1Mmddyycc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdCashDivPay1Mmddyycc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivPay1Mmddyycc.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01Cash1RecordDt
	 *	@return bdms01Cash1RecordDt
	 */
   public char[] getBdms01Cash1RecordDt() throws CFException{
     if (isBdms01Cash1RecordDtModified()) { 
        bdms01Cash1RecordDt = refreshBdms01Cash1RecordDt();
     }
   		return bdms01Cash1RecordDt;
   }

  
	/**
	*  set variable bdms01Cash1RecordDt
	*  Corresponding COBOL Variable is BDMS01-CASH1-RECORD-DT
	*  @param value
	**/
   public void setBdms01Cash1RecordDt(char[] value) {
      bdms01Cash1RecordDt = checkBdms01Cash1RecordDtConstraints(value);
      serializeBdms01Cash1RecordDt(bdms01Cash1RecordDt);
   } 

     /**
	 * 	Update Bdms01Cash1RecordDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Cash1RecordDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Cash1RecordDt,bdms01Cash1RecordDt.length);
   	
   }
   
   public void setBdms01Cash1RecordDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1RecordDt,bdms01Cash1RecordDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01Cash1RecordDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash1RecordDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1RecordDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Cash1RecordDt with another Field
	 *	@param value
	 */
   public void setBdms01Cash1RecordDt(Field source) {
       replace(source,0,source.length(),beginBdms01Cash1RecordDt,BDMS_01_CASH_1_RECORD_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Cash1RecordDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Cash1RecordDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Cash1RecordDt,BDMS_01_CASH_1_RECORD_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Cash1RecordDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash1RecordDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1RecordDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Cash1PaymentDt
	 *	@return bdms01Cash1PaymentDt
	 */
   public char[] getBdms01Cash1PaymentDt() throws CFException{
     if (isBdms01Cash1PaymentDtModified()) { 
        bdms01Cash1PaymentDt = refreshBdms01Cash1PaymentDt();
     }
   		return bdms01Cash1PaymentDt;
   }

  
	/**
	*  set variable bdms01Cash1PaymentDt
	*  Corresponding COBOL Variable is BDMS01-CASH1-PAYMENT-DT
	*  @param value
	**/
   public void setBdms01Cash1PaymentDt(char[] value) {
      bdms01Cash1PaymentDt = checkBdms01Cash1PaymentDtConstraints(value);
      serializeBdms01Cash1PaymentDt(bdms01Cash1PaymentDt);
   } 

     /**
	 * 	Update Bdms01Cash1PaymentDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Cash1PaymentDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Cash1PaymentDt,bdms01Cash1PaymentDt.length);
   	
   }
   
   public void setBdms01Cash1PaymentDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1PaymentDt,bdms01Cash1PaymentDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01Cash1PaymentDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash1PaymentDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1PaymentDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Cash1PaymentDt with another Field
	 *	@param value
	 */
   public void setBdms01Cash1PaymentDt(Field source) {
       replace(source,0,source.length(),beginBdms01Cash1PaymentDt,BDMS_01_CASH_1_PAYMENT_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Cash1PaymentDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Cash1PaymentDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Cash1PaymentDt,BDMS_01_CASH_1_PAYMENT_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Cash1PaymentDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash1PaymentDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1PaymentDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Cash1ExdividendDt
	 *	@return bdms01Cash1ExdividendDt
	 */
   public char[] getBdms01Cash1ExdividendDt() throws CFException{
     if (isBdms01Cash1ExdividendDtModified()) { 
        bdms01Cash1ExdividendDt = refreshBdms01Cash1ExdividendDt();
     }
   		return bdms01Cash1ExdividendDt;
   }

  
	/**
	*  set variable bdms01Cash1ExdividendDt
	*  Corresponding COBOL Variable is BDMS01-CASH1-EXDIVIDEND-DT
	*  @param value
	**/
   public void setBdms01Cash1ExdividendDt(char[] value) {
      bdms01Cash1ExdividendDt = checkBdms01Cash1ExdividendDtConstraints(value);
      serializeBdms01Cash1ExdividendDt(bdms01Cash1ExdividendDt);
   } 

     /**
	 * 	Update Bdms01Cash1ExdividendDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Cash1ExdividendDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Cash1ExdividendDt,bdms01Cash1ExdividendDt.length);
   	
   }
   
   public void setBdms01Cash1ExdividendDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1ExdividendDt,bdms01Cash1ExdividendDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01Cash1ExdividendDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash1ExdividendDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1ExdividendDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Cash1ExdividendDt with another Field
	 *	@param value
	 */
   public void setBdms01Cash1ExdividendDt(Field source) {
       replace(source,0,source.length(),beginBdms01Cash1ExdividendDt,BDMS_01_CASH_1_EXDIVIDEND_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Cash1ExdividendDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Cash1ExdividendDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Cash1ExdividendDt,BDMS_01_CASH_1_EXDIVIDEND_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Cash1ExdividendDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash1ExdividendDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1ExdividendDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Cash1FrqncPayCd
	 *	@return bdms01Cash1FrqncPayCd
	 */
   public char[] getBdms01Cash1FrqncPayCd() throws CFException{
     if (isBdms01Cash1FrqncPayCdModified()) { 
        bdms01Cash1FrqncPayCd = refreshBdms01Cash1FrqncPayCd();
     }
   		return bdms01Cash1FrqncPayCd;
   }

  
	/**
	*  set variable bdms01Cash1FrqncPayCd
	*  Corresponding COBOL Variable is BDMS01-CASH1-FRQNC-PAY-CD
	*  @param value
	**/
   public void setBdms01Cash1FrqncPayCd(char[] value) {
      bdms01Cash1FrqncPayCd = checkBdms01Cash1FrqncPayCdConstraints(value);
      serializeBdms01Cash1FrqncPayCd(bdms01Cash1FrqncPayCd);
   } 

     /**
	 * 	Update Bdms01Cash1FrqncPayCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Cash1FrqncPayCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Cash1FrqncPayCd,bdms01Cash1FrqncPayCd.length);
   	
   }
   
   public void setBdms01Cash1FrqncPayCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1FrqncPayCd,bdms01Cash1FrqncPayCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01Cash1FrqncPayCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash1FrqncPayCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1FrqncPayCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Cash1FrqncPayCd with another Field
	 *	@param value
	 */
   public void setBdms01Cash1FrqncPayCd(Field source) {
       replace(source,0,source.length(),beginBdms01Cash1FrqncPayCd,BDMS_01_CASH_1_FRQNC_PAY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Cash1FrqncPayCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Cash1FrqncPayCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Cash1FrqncPayCd,BDMS_01_CASH_1_FRQNC_PAY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Cash1FrqncPayCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash1FrqncPayCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1FrqncPayCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Cash1DayTkffGnrtQty
	 *	@return bdms01Cash1DayTkffGnrtQty
	 */
	public int getBdms01Cash1DayTkffGnrtQty() throws CFException {
       if (isBdms01Cash1DayTkffGnrtQtyModified()) { 
           bdms01Cash1DayTkffGnrtQty = refreshBdms01Cash1DayTkffGnrtQty();
        }
   		return bdms01Cash1DayTkffGnrtQty;
	}
	

	
	   
	/**
	 * 	Update Bdms01Cash1DayTkffGnrtQty with the passed value
	 *  Corresponding COBOL Variable is BDMS01-CASH1-DAY-TKFF-GNRT-QTY
	 *	@param number
	 */
	public void setBdms01Cash1DayTkffGnrtQty(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01Cash1DayTkffGnrtQty = checkBdms01Cash1DayTkffGnrtQtyMaxLimit(number); 
		serializeBdms01Cash1DayTkffGnrtQty(bdms01Cash1DayTkffGnrtQty);
	}
	

	public void setBdms01Cash1DayTkffGnrtQty(long number) {
	    number = checkBdms01Cash1DayTkffGnrtQtyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01Cash1DayTkffGnrtQty((int)number);
	}
	
	/**
	 * 	Update Bdms01Cash1DayTkffGnrtQty with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01Cash1DayTkffGnrtQty(char[] value) throws CFException {
		 bdms01Cash1DayTkffGnrtQty = serializeBdms01Cash1DayTkffGnrtQty(value);
	}
	/**
	 * 	Update Bdms01Cash1DayTkffGnrtQty with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01Cash1DayTkffGnrtQtyString(char[] value) throws CFException {
		 setBdms01Cash1DayTkffGnrtQty(value);
	}
	/**
	 *	Returns the value of bdms01Cash1AssetLiqnInd
	 *	@return bdms01Cash1AssetLiqnInd
	 */
   public char[] getBdms01Cash1AssetLiqnInd() throws CFException{
     if (isBdms01Cash1AssetLiqnIndModified()) { 
        bdms01Cash1AssetLiqnInd = refreshBdms01Cash1AssetLiqnInd();
     }
   		return bdms01Cash1AssetLiqnInd;
   }

  
	/**
	*  set variable bdms01Cash1AssetLiqnInd
	*  Corresponding COBOL Variable is BDMS01-CASH1-ASSET-LIQN-IND
	*  @param value
	**/
   public void setBdms01Cash1AssetLiqnInd(char[] value) {
      bdms01Cash1AssetLiqnInd = checkBdms01Cash1AssetLiqnIndConstraints(value);
      serializeBdms01Cash1AssetLiqnInd(bdms01Cash1AssetLiqnInd);
   } 

     /**
	 * 	Update Bdms01Cash1AssetLiqnInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Cash1AssetLiqnInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Cash1AssetLiqnInd,bdms01Cash1AssetLiqnInd.length);
   	
   }
   
   public void setBdms01Cash1AssetLiqnInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1AssetLiqnInd,bdms01Cash1AssetLiqnInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01Cash1AssetLiqnInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash1AssetLiqnInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1AssetLiqnInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Cash1AssetLiqnInd with another Field
	 *	@param value
	 */
   public void setBdms01Cash1AssetLiqnInd(Field source) {
       replace(source,0,source.length(),beginBdms01Cash1AssetLiqnInd,BDMS_01_CASH_1_ASSET_LIQN_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Cash1AssetLiqnInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Cash1AssetLiqnInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Cash1AssetLiqnInd,BDMS_01_CASH_1_ASSET_LIQN_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Cash1AssetLiqnInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash1AssetLiqnInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1AssetLiqnInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Cash1CurrencyCd
	 *	@return bdms01Cash1CurrencyCd
	 */
   public char[] getBdms01Cash1CurrencyCd() throws CFException{
     if (isBdms01Cash1CurrencyCdModified()) { 
        bdms01Cash1CurrencyCd = refreshBdms01Cash1CurrencyCd();
     }
   		return bdms01Cash1CurrencyCd;
   }

  
	/**
	*  set variable bdms01Cash1CurrencyCd
	*  Corresponding COBOL Variable is BDMS01-CASH1-CURRENCY-CD
	*  @param value
	**/
   public void setBdms01Cash1CurrencyCd(char[] value) {
      bdms01Cash1CurrencyCd = checkBdms01Cash1CurrencyCdConstraints(value);
      serializeBdms01Cash1CurrencyCd(bdms01Cash1CurrencyCd);
   } 

     /**
	 * 	Update Bdms01Cash1CurrencyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Cash1CurrencyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Cash1CurrencyCd,bdms01Cash1CurrencyCd.length);
   	
   }
   
   public void setBdms01Cash1CurrencyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1CurrencyCd,bdms01Cash1CurrencyCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01Cash1CurrencyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash1CurrencyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1CurrencyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Cash1CurrencyCd with another Field
	 *	@param value
	 */
   public void setBdms01Cash1CurrencyCd(Field source) {
       replace(source,0,source.length(),beginBdms01Cash1CurrencyCd,BDMS_01_CASH_1_CURRENCY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Cash1CurrencyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Cash1CurrencyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Cash1CurrencyCd,BDMS_01_CASH_1_CURRENCY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Cash1CurrencyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash1CurrencyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1CurrencyCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Cash1VendorCd
	 *	@return bdms01Cash1VendorCd
	 */
   public char[] getBdms01Cash1VendorCd() throws CFException{
     if (isBdms01Cash1VendorCdModified()) { 
        bdms01Cash1VendorCd = refreshBdms01Cash1VendorCd();
     }
   		return bdms01Cash1VendorCd;
   }

  
	/**
	*  set variable bdms01Cash1VendorCd
	*  Corresponding COBOL Variable is BDMS01-CASH1-VENDOR-CD
	*  @param value
	**/
   public void setBdms01Cash1VendorCd(char[] value) {
      bdms01Cash1VendorCd = checkBdms01Cash1VendorCdConstraints(value);
      serializeBdms01Cash1VendorCd(bdms01Cash1VendorCd);
   } 

     /**
	 * 	Update Bdms01Cash1VendorCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Cash1VendorCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Cash1VendorCd,bdms01Cash1VendorCd.length);
   	
   }
   
   public void setBdms01Cash1VendorCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1VendorCd,bdms01Cash1VendorCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01Cash1VendorCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash1VendorCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1VendorCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Cash1VendorCd with another Field
	 *	@param value
	 */
   public void setBdms01Cash1VendorCd(Field source) {
       replace(source,0,source.length(),beginBdms01Cash1VendorCd,BDMS_01_CASH_1_VENDOR_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Cash1VendorCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Cash1VendorCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Cash1VendorCd,BDMS_01_CASH_1_VENDOR_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Cash1VendorCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash1VendorCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1VendorCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Cash1TypeIncomeCd
	 *	@return bdms01Cash1TypeIncomeCd
	 */
   public char[] getBdms01Cash1TypeIncomeCd() throws CFException{
     if (isBdms01Cash1TypeIncomeCdModified()) { 
        bdms01Cash1TypeIncomeCd = refreshBdms01Cash1TypeIncomeCd();
     }
   		return bdms01Cash1TypeIncomeCd;
   }

  
	/**
	*  set variable bdms01Cash1TypeIncomeCd
	*  Corresponding COBOL Variable is BDMS01-CASH1-TYPE-INCOME-CD
	*  @param value
	**/
   public void setBdms01Cash1TypeIncomeCd(char[] value) {
      bdms01Cash1TypeIncomeCd = checkBdms01Cash1TypeIncomeCdConstraints(value);
      serializeBdms01Cash1TypeIncomeCd(bdms01Cash1TypeIncomeCd);
   } 

     /**
	 * 	Update Bdms01Cash1TypeIncomeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Cash1TypeIncomeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Cash1TypeIncomeCd,bdms01Cash1TypeIncomeCd.length);
   	
   }
   
   public void setBdms01Cash1TypeIncomeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1TypeIncomeCd,bdms01Cash1TypeIncomeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01Cash1TypeIncomeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash1TypeIncomeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1TypeIncomeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Cash1TypeIncomeCd with another Field
	 *	@param value
	 */
   public void setBdms01Cash1TypeIncomeCd(Field source) {
       replace(source,0,source.length(),beginBdms01Cash1TypeIncomeCd,BDMS_01_CASH_1_TYPE_INCOME_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Cash1TypeIncomeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Cash1TypeIncomeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Cash1TypeIncomeCd,BDMS_01_CASH_1_TYPE_INCOME_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Cash1TypeIncomeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash1TypeIncomeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1TypeIncomeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Cash1PayFrctnShrInd
	 *	@return bdms01Cash1PayFrctnShrInd
	 */
   public char[] getBdms01Cash1PayFrctnShrInd() throws CFException{
     if (isBdms01Cash1PayFrctnShrIndModified()) { 
        bdms01Cash1PayFrctnShrInd = refreshBdms01Cash1PayFrctnShrInd();
     }
   		return bdms01Cash1PayFrctnShrInd;
   }

  
	/**
	*  set variable bdms01Cash1PayFrctnShrInd
	*  Corresponding COBOL Variable is BDMS01-CASH1-PAY-FRCTN-SHR-IND
	*  @param value
	**/
   public void setBdms01Cash1PayFrctnShrInd(char[] value) {
      bdms01Cash1PayFrctnShrInd = checkBdms01Cash1PayFrctnShrIndConstraints(value);
      serializeBdms01Cash1PayFrctnShrInd(bdms01Cash1PayFrctnShrInd);
   } 

     /**
	 * 	Update Bdms01Cash1PayFrctnShrInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Cash1PayFrctnShrInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Cash1PayFrctnShrInd,bdms01Cash1PayFrctnShrInd.length);
   	
   }
   
   public void setBdms01Cash1PayFrctnShrInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1PayFrctnShrInd,bdms01Cash1PayFrctnShrInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01Cash1PayFrctnShrInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash1PayFrctnShrInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1PayFrctnShrInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Cash1PayFrctnShrInd with another Field
	 *	@param value
	 */
   public void setBdms01Cash1PayFrctnShrInd(Field source) {
       replace(source,0,source.length(),beginBdms01Cash1PayFrctnShrInd,BDMS_01_CASH_1_PAY_FRCTN_SHR_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Cash1PayFrctnShrInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Cash1PayFrctnShrInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Cash1PayFrctnShrInd,BDMS_01_CASH_1_PAY_FRCTN_SHR_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Cash1PayFrctnShrInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash1PayFrctnShrInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash1PayFrctnShrInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdCashDivRec2Mmddyycc
	 *	@return msdCashDivRec2Mmddyycc
	 */   
	 public MsdCashDivRec2Mmddyycc getMsdCashDivRec2Mmddyycc() {
   	return msdCashDivRec2Mmddyycc;
   }
   /**
	* 	Update MsdCashDivRec2Mmddyycc with the passed value
	*   Corresponding COBOL Variable is MSD-CASH-DIV-REC2-MMDDYYCC
	*	@param value
	*/
   public void setMsdCashDivRec2Mmddyycc(char[] value) {
      msdCashDivRec2Mmddyycc.setString(value); 
   }   
    
     /**
	 * 	Update MsdCashDivRec2Mmddyycc 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdCashDivRec2Mmddyycc(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivRec2Mmddyycc.begin,msdCashDivRec2Mmddyycc.length());
   }
   
     /**
	 * 	Update MsdCashDivRec2Mmddyycc 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdCashDivRec2Mmddyycc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivRec2Mmddyycc.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdCashDivRec2Mmddyycc with another Field
	 *	@param value
	 */
   public void setMsdCashDivRec2Mmddyycc(Field source) {
   	replace(source,0,source.length(),msdCashDivRec2Mmddyycc.begin,msdCashDivRec2Mmddyycc.length());
   }  
   
     /**
	 * 	Update MsdCashDivRec2Mmddyycc 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdCashDivRec2Mmddyycc(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivRec2Mmddyycc.begin,msdCashDivRec2Mmddyycc.length());
   }
   
     /**
	 * 	Update MsdCashDivRec2Mmddyycc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdCashDivRec2Mmddyycc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivRec2Mmddyycc.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdCashDivRate2
	 *	@return msdCashDivRate2
	 */
	public BigDecimal getMsdCashDivRate2() throws CFException {
       if (isMsdCashDivRate2Modified()) { 
           msdCashDivRate2 = refreshMsdCashDivRate2();
        }
   		return msdCashDivRate2;
	}
	

	
	   
	/**
	 * 	Update MsdCashDivRate2 with the passed number
	 *  Corresponding COBOL Variable is MSD-CASH-DIV-RATE2
	 *	@param number
	 */
	public void setMsdCashDivRate2(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdCashDivRate2 = checkMsdCashDivRate2MaxLimit(number);
	    serializeMsdCashDivRate2(msdCashDivRate2);
   }
	/**
	 * 	Update MsdCashDivRate2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivRate2(char[] value) throws CFException {
		 msdCashDivRate2 = serializeMsdCashDivRate2(value);
	}   
	/**
	 *	Returns the value of msdCashDivEx2Mmddyycc
	 *	@return msdCashDivEx2Mmddyycc
	 */   
	 public MsdCashDivEx2Mmddyycc getMsdCashDivEx2Mmddyycc() {
   	return msdCashDivEx2Mmddyycc;
   }
   /**
	* 	Update MsdCashDivEx2Mmddyycc with the passed value
	*   Corresponding COBOL Variable is MSD-CASH-DIV-EX2-MMDDYYCC
	*	@param value
	*/
   public void setMsdCashDivEx2Mmddyycc(char[] value) {
      msdCashDivEx2Mmddyycc.setString(value); 
   }   
    
     /**
	 * 	Update MsdCashDivEx2Mmddyycc 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdCashDivEx2Mmddyycc(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivEx2Mmddyycc.begin,msdCashDivEx2Mmddyycc.length());
   }
   
     /**
	 * 	Update MsdCashDivEx2Mmddyycc 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdCashDivEx2Mmddyycc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivEx2Mmddyycc.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdCashDivEx2Mmddyycc with another Field
	 *	@param value
	 */
   public void setMsdCashDivEx2Mmddyycc(Field source) {
   	replace(source,0,source.length(),msdCashDivEx2Mmddyycc.begin,msdCashDivEx2Mmddyycc.length());
   }  
   
     /**
	 * 	Update MsdCashDivEx2Mmddyycc 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdCashDivEx2Mmddyycc(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivEx2Mmddyycc.begin,msdCashDivEx2Mmddyycc.length());
   }
   
     /**
	 * 	Update MsdCashDivEx2Mmddyycc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdCashDivEx2Mmddyycc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivEx2Mmddyycc.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdCashDivPay2Mmddyycc
	 *	@return msdCashDivPay2Mmddyycc
	 */   
	 public MsdCashDivPay2Mmddyycc getMsdCashDivPay2Mmddyycc() {
   	return msdCashDivPay2Mmddyycc;
   }
   /**
	* 	Update MsdCashDivPay2Mmddyycc with the passed value
	*   Corresponding COBOL Variable is MSD-CASH-DIV-PAY2-MMDDYYCC
	*	@param value
	*/
   public void setMsdCashDivPay2Mmddyycc(char[] value) {
      msdCashDivPay2Mmddyycc.setString(value); 
   }   
    
     /**
	 * 	Update MsdCashDivPay2Mmddyycc 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdCashDivPay2Mmddyycc(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivPay2Mmddyycc.begin,msdCashDivPay2Mmddyycc.length());
   }
   
     /**
	 * 	Update MsdCashDivPay2Mmddyycc 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdCashDivPay2Mmddyycc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivPay2Mmddyycc.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdCashDivPay2Mmddyycc with another Field
	 *	@param value
	 */
   public void setMsdCashDivPay2Mmddyycc(Field source) {
   	replace(source,0,source.length(),msdCashDivPay2Mmddyycc.begin,msdCashDivPay2Mmddyycc.length());
   }  
   
     /**
	 * 	Update MsdCashDivPay2Mmddyycc 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdCashDivPay2Mmddyycc(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivPay2Mmddyycc.begin,msdCashDivPay2Mmddyycc.length());
   }
   
     /**
	 * 	Update MsdCashDivPay2Mmddyycc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdCashDivPay2Mmddyycc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdCashDivPay2Mmddyycc.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01Cash2RecordDt
	 *	@return bdms01Cash2RecordDt
	 */
   public char[] getBdms01Cash2RecordDt() throws CFException{
     if (isBdms01Cash2RecordDtModified()) { 
        bdms01Cash2RecordDt = refreshBdms01Cash2RecordDt();
     }
   		return bdms01Cash2RecordDt;
   }

  
	/**
	*  set variable bdms01Cash2RecordDt
	*  Corresponding COBOL Variable is BDMS01-CASH2-RECORD-DT
	*  @param value
	**/
   public void setBdms01Cash2RecordDt(char[] value) {
      bdms01Cash2RecordDt = checkBdms01Cash2RecordDtConstraints(value);
      serializeBdms01Cash2RecordDt(bdms01Cash2RecordDt);
   } 

     /**
	 * 	Update Bdms01Cash2RecordDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Cash2RecordDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Cash2RecordDt,bdms01Cash2RecordDt.length);
   	
   }
   
   public void setBdms01Cash2RecordDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2RecordDt,bdms01Cash2RecordDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01Cash2RecordDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash2RecordDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2RecordDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Cash2RecordDt with another Field
	 *	@param value
	 */
   public void setBdms01Cash2RecordDt(Field source) {
       replace(source,0,source.length(),beginBdms01Cash2RecordDt,BDMS_01_CASH_2_RECORD_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Cash2RecordDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Cash2RecordDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Cash2RecordDt,BDMS_01_CASH_2_RECORD_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Cash2RecordDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash2RecordDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2RecordDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Cash2PaymentDt
	 *	@return bdms01Cash2PaymentDt
	 */
   public char[] getBdms01Cash2PaymentDt() throws CFException{
     if (isBdms01Cash2PaymentDtModified()) { 
        bdms01Cash2PaymentDt = refreshBdms01Cash2PaymentDt();
     }
   		return bdms01Cash2PaymentDt;
   }

  
	/**
	*  set variable bdms01Cash2PaymentDt
	*  Corresponding COBOL Variable is BDMS01-CASH2-PAYMENT-DT
	*  @param value
	**/
   public void setBdms01Cash2PaymentDt(char[] value) {
      bdms01Cash2PaymentDt = checkBdms01Cash2PaymentDtConstraints(value);
      serializeBdms01Cash2PaymentDt(bdms01Cash2PaymentDt);
   } 

     /**
	 * 	Update Bdms01Cash2PaymentDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Cash2PaymentDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Cash2PaymentDt,bdms01Cash2PaymentDt.length);
   	
   }
   
   public void setBdms01Cash2PaymentDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2PaymentDt,bdms01Cash2PaymentDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01Cash2PaymentDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash2PaymentDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2PaymentDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Cash2PaymentDt with another Field
	 *	@param value
	 */
   public void setBdms01Cash2PaymentDt(Field source) {
       replace(source,0,source.length(),beginBdms01Cash2PaymentDt,BDMS_01_CASH_2_PAYMENT_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Cash2PaymentDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Cash2PaymentDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Cash2PaymentDt,BDMS_01_CASH_2_PAYMENT_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Cash2PaymentDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash2PaymentDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2PaymentDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Cash2ExdividendDt
	 *	@return bdms01Cash2ExdividendDt
	 */
   public char[] getBdms01Cash2ExdividendDt() throws CFException{
     if (isBdms01Cash2ExdividendDtModified()) { 
        bdms01Cash2ExdividendDt = refreshBdms01Cash2ExdividendDt();
     }
   		return bdms01Cash2ExdividendDt;
   }

  
	/**
	*  set variable bdms01Cash2ExdividendDt
	*  Corresponding COBOL Variable is BDMS01-CASH2-EXDIVIDEND-DT
	*  @param value
	**/
   public void setBdms01Cash2ExdividendDt(char[] value) {
      bdms01Cash2ExdividendDt = checkBdms01Cash2ExdividendDtConstraints(value);
      serializeBdms01Cash2ExdividendDt(bdms01Cash2ExdividendDt);
   } 

     /**
	 * 	Update Bdms01Cash2ExdividendDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Cash2ExdividendDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Cash2ExdividendDt,bdms01Cash2ExdividendDt.length);
   	
   }
   
   public void setBdms01Cash2ExdividendDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2ExdividendDt,bdms01Cash2ExdividendDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01Cash2ExdividendDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash2ExdividendDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2ExdividendDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Cash2ExdividendDt with another Field
	 *	@param value
	 */
   public void setBdms01Cash2ExdividendDt(Field source) {
       replace(source,0,source.length(),beginBdms01Cash2ExdividendDt,BDMS_01_CASH_2_EXDIVIDEND_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Cash2ExdividendDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Cash2ExdividendDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Cash2ExdividendDt,BDMS_01_CASH_2_EXDIVIDEND_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Cash2ExdividendDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash2ExdividendDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2ExdividendDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Cash2FrqncPayCd
	 *	@return bdms01Cash2FrqncPayCd
	 */
   public char[] getBdms01Cash2FrqncPayCd() throws CFException{
     if (isBdms01Cash2FrqncPayCdModified()) { 
        bdms01Cash2FrqncPayCd = refreshBdms01Cash2FrqncPayCd();
     }
   		return bdms01Cash2FrqncPayCd;
   }

  
	/**
	*  set variable bdms01Cash2FrqncPayCd
	*  Corresponding COBOL Variable is BDMS01-CASH2-FRQNC-PAY-CD
	*  @param value
	**/
   public void setBdms01Cash2FrqncPayCd(char[] value) {
      bdms01Cash2FrqncPayCd = checkBdms01Cash2FrqncPayCdConstraints(value);
      serializeBdms01Cash2FrqncPayCd(bdms01Cash2FrqncPayCd);
   } 

     /**
	 * 	Update Bdms01Cash2FrqncPayCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Cash2FrqncPayCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Cash2FrqncPayCd,bdms01Cash2FrqncPayCd.length);
   	
   }
   
   public void setBdms01Cash2FrqncPayCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2FrqncPayCd,bdms01Cash2FrqncPayCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01Cash2FrqncPayCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash2FrqncPayCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2FrqncPayCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Cash2FrqncPayCd with another Field
	 *	@param value
	 */
   public void setBdms01Cash2FrqncPayCd(Field source) {
       replace(source,0,source.length(),beginBdms01Cash2FrqncPayCd,BDMS_01_CASH_2_FRQNC_PAY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Cash2FrqncPayCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Cash2FrqncPayCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Cash2FrqncPayCd,BDMS_01_CASH_2_FRQNC_PAY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Cash2FrqncPayCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash2FrqncPayCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2FrqncPayCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Cash2DayTkffGnrtQty
	 *	@return bdms01Cash2DayTkffGnrtQty
	 */
	public int getBdms01Cash2DayTkffGnrtQty() throws CFException {
       if (isBdms01Cash2DayTkffGnrtQtyModified()) { 
           bdms01Cash2DayTkffGnrtQty = refreshBdms01Cash2DayTkffGnrtQty();
        }
   		return bdms01Cash2DayTkffGnrtQty;
	}
	

	
	   
	/**
	 * 	Update Bdms01Cash2DayTkffGnrtQty with the passed value
	 *  Corresponding COBOL Variable is BDMS01-CASH2-DAY-TKFF-GNRT-QTY
	 *	@param number
	 */
	public void setBdms01Cash2DayTkffGnrtQty(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01Cash2DayTkffGnrtQty = checkBdms01Cash2DayTkffGnrtQtyMaxLimit(number); 
		serializeBdms01Cash2DayTkffGnrtQty(bdms01Cash2DayTkffGnrtQty);
	}
	

	public void setBdms01Cash2DayTkffGnrtQty(long number) {
	    number = checkBdms01Cash2DayTkffGnrtQtyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01Cash2DayTkffGnrtQty((int)number);
	}
	
	/**
	 * 	Update Bdms01Cash2DayTkffGnrtQty with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01Cash2DayTkffGnrtQty(char[] value) throws CFException {
		 bdms01Cash2DayTkffGnrtQty = serializeBdms01Cash2DayTkffGnrtQty(value);
	}
	/**
	 * 	Update Bdms01Cash2DayTkffGnrtQty with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01Cash2DayTkffGnrtQtyString(char[] value) throws CFException {
		 setBdms01Cash2DayTkffGnrtQty(value);
	}
	/**
	 *	Returns the value of bdms01Cash2AssetLiqnInd
	 *	@return bdms01Cash2AssetLiqnInd
	 */
   public char[] getBdms01Cash2AssetLiqnInd() throws CFException{
     if (isBdms01Cash2AssetLiqnIndModified()) { 
        bdms01Cash2AssetLiqnInd = refreshBdms01Cash2AssetLiqnInd();
     }
   		return bdms01Cash2AssetLiqnInd;
   }

  
	/**
	*  set variable bdms01Cash2AssetLiqnInd
	*  Corresponding COBOL Variable is BDMS01-CASH2-ASSET-LIQN-IND
	*  @param value
	**/
   public void setBdms01Cash2AssetLiqnInd(char[] value) {
      bdms01Cash2AssetLiqnInd = checkBdms01Cash2AssetLiqnIndConstraints(value);
      serializeBdms01Cash2AssetLiqnInd(bdms01Cash2AssetLiqnInd);
   } 

     /**
	 * 	Update Bdms01Cash2AssetLiqnInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Cash2AssetLiqnInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Cash2AssetLiqnInd,bdms01Cash2AssetLiqnInd.length);
   	
   }
   
   public void setBdms01Cash2AssetLiqnInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2AssetLiqnInd,bdms01Cash2AssetLiqnInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01Cash2AssetLiqnInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash2AssetLiqnInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2AssetLiqnInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Cash2AssetLiqnInd with another Field
	 *	@param value
	 */
   public void setBdms01Cash2AssetLiqnInd(Field source) {
       replace(source,0,source.length(),beginBdms01Cash2AssetLiqnInd,BDMS_01_CASH_2_ASSET_LIQN_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Cash2AssetLiqnInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Cash2AssetLiqnInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Cash2AssetLiqnInd,BDMS_01_CASH_2_ASSET_LIQN_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Cash2AssetLiqnInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash2AssetLiqnInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2AssetLiqnInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Cash2CurrencyCd
	 *	@return bdms01Cash2CurrencyCd
	 */
   public char[] getBdms01Cash2CurrencyCd() throws CFException{
     if (isBdms01Cash2CurrencyCdModified()) { 
        bdms01Cash2CurrencyCd = refreshBdms01Cash2CurrencyCd();
     }
   		return bdms01Cash2CurrencyCd;
   }

  
	/**
	*  set variable bdms01Cash2CurrencyCd
	*  Corresponding COBOL Variable is BDMS01-CASH2-CURRENCY-CD
	*  @param value
	**/
   public void setBdms01Cash2CurrencyCd(char[] value) {
      bdms01Cash2CurrencyCd = checkBdms01Cash2CurrencyCdConstraints(value);
      serializeBdms01Cash2CurrencyCd(bdms01Cash2CurrencyCd);
   } 

     /**
	 * 	Update Bdms01Cash2CurrencyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Cash2CurrencyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Cash2CurrencyCd,bdms01Cash2CurrencyCd.length);
   	
   }
   
   public void setBdms01Cash2CurrencyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2CurrencyCd,bdms01Cash2CurrencyCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01Cash2CurrencyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash2CurrencyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2CurrencyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Cash2CurrencyCd with another Field
	 *	@param value
	 */
   public void setBdms01Cash2CurrencyCd(Field source) {
       replace(source,0,source.length(),beginBdms01Cash2CurrencyCd,BDMS_01_CASH_2_CURRENCY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Cash2CurrencyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Cash2CurrencyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Cash2CurrencyCd,BDMS_01_CASH_2_CURRENCY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Cash2CurrencyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash2CurrencyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2CurrencyCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Cash2VendorCd
	 *	@return bdms01Cash2VendorCd
	 */
   public char[] getBdms01Cash2VendorCd() throws CFException{
     if (isBdms01Cash2VendorCdModified()) { 
        bdms01Cash2VendorCd = refreshBdms01Cash2VendorCd();
     }
   		return bdms01Cash2VendorCd;
   }

  
	/**
	*  set variable bdms01Cash2VendorCd
	*  Corresponding COBOL Variable is BDMS01-CASH2-VENDOR-CD
	*  @param value
	**/
   public void setBdms01Cash2VendorCd(char[] value) {
      bdms01Cash2VendorCd = checkBdms01Cash2VendorCdConstraints(value);
      serializeBdms01Cash2VendorCd(bdms01Cash2VendorCd);
   } 

     /**
	 * 	Update Bdms01Cash2VendorCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Cash2VendorCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Cash2VendorCd,bdms01Cash2VendorCd.length);
   	
   }
   
   public void setBdms01Cash2VendorCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2VendorCd,bdms01Cash2VendorCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01Cash2VendorCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash2VendorCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2VendorCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Cash2VendorCd with another Field
	 *	@param value
	 */
   public void setBdms01Cash2VendorCd(Field source) {
       replace(source,0,source.length(),beginBdms01Cash2VendorCd,BDMS_01_CASH_2_VENDOR_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Cash2VendorCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Cash2VendorCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Cash2VendorCd,BDMS_01_CASH_2_VENDOR_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Cash2VendorCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash2VendorCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2VendorCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Cash2TypeIncomeCd
	 *	@return bdms01Cash2TypeIncomeCd
	 */
   public char[] getBdms01Cash2TypeIncomeCd() throws CFException{
     if (isBdms01Cash2TypeIncomeCdModified()) { 
        bdms01Cash2TypeIncomeCd = refreshBdms01Cash2TypeIncomeCd();
     }
   		return bdms01Cash2TypeIncomeCd;
   }

  
	/**
	*  set variable bdms01Cash2TypeIncomeCd
	*  Corresponding COBOL Variable is BDMS01-CASH2-TYPE-INCOME-CD
	*  @param value
	**/
   public void setBdms01Cash2TypeIncomeCd(char[] value) {
      bdms01Cash2TypeIncomeCd = checkBdms01Cash2TypeIncomeCdConstraints(value);
      serializeBdms01Cash2TypeIncomeCd(bdms01Cash2TypeIncomeCd);
   } 

     /**
	 * 	Update Bdms01Cash2TypeIncomeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Cash2TypeIncomeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Cash2TypeIncomeCd,bdms01Cash2TypeIncomeCd.length);
   	
   }
   
   public void setBdms01Cash2TypeIncomeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2TypeIncomeCd,bdms01Cash2TypeIncomeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01Cash2TypeIncomeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash2TypeIncomeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2TypeIncomeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Cash2TypeIncomeCd with another Field
	 *	@param value
	 */
   public void setBdms01Cash2TypeIncomeCd(Field source) {
       replace(source,0,source.length(),beginBdms01Cash2TypeIncomeCd,BDMS_01_CASH_2_TYPE_INCOME_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Cash2TypeIncomeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Cash2TypeIncomeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Cash2TypeIncomeCd,BDMS_01_CASH_2_TYPE_INCOME_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Cash2TypeIncomeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash2TypeIncomeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2TypeIncomeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Cash2PayFrctnShrInd
	 *	@return bdms01Cash2PayFrctnShrInd
	 */
   public char[] getBdms01Cash2PayFrctnShrInd() throws CFException{
     if (isBdms01Cash2PayFrctnShrIndModified()) { 
        bdms01Cash2PayFrctnShrInd = refreshBdms01Cash2PayFrctnShrInd();
     }
   		return bdms01Cash2PayFrctnShrInd;
   }

  
	/**
	*  set variable bdms01Cash2PayFrctnShrInd
	*  Corresponding COBOL Variable is BDMS01-CASH2-PAY-FRCTN-SHR-IND
	*  @param value
	**/
   public void setBdms01Cash2PayFrctnShrInd(char[] value) {
      bdms01Cash2PayFrctnShrInd = checkBdms01Cash2PayFrctnShrIndConstraints(value);
      serializeBdms01Cash2PayFrctnShrInd(bdms01Cash2PayFrctnShrInd);
   } 

     /**
	 * 	Update Bdms01Cash2PayFrctnShrInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Cash2PayFrctnShrInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Cash2PayFrctnShrInd,bdms01Cash2PayFrctnShrInd.length);
   	
   }
   
   public void setBdms01Cash2PayFrctnShrInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2PayFrctnShrInd,bdms01Cash2PayFrctnShrInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01Cash2PayFrctnShrInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash2PayFrctnShrInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2PayFrctnShrInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Cash2PayFrctnShrInd with another Field
	 *	@param value
	 */
   public void setBdms01Cash2PayFrctnShrInd(Field source) {
       replace(source,0,source.length(),beginBdms01Cash2PayFrctnShrInd,BDMS_01_CASH_2_PAY_FRCTN_SHR_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Cash2PayFrctnShrInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Cash2PayFrctnShrInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Cash2PayFrctnShrInd,BDMS_01_CASH_2_PAY_FRCTN_SHR_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Cash2PayFrctnShrInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Cash2PayFrctnShrInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Cash2PayFrctnShrInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdStockDivRecMmddyycc
	 *	@return msdStockDivRecMmddyycc
	 */   
	 public MsdStockDivRecMmddyycc getMsdStockDivRecMmddyycc() {
   	return msdStockDivRecMmddyycc;
   }
   /**
	* 	Update MsdStockDivRecMmddyycc with the passed value
	*   Corresponding COBOL Variable is MSD-STOCK-DIV-REC-MMDDYYCC
	*	@param value
	*/
   public void setMsdStockDivRecMmddyycc(char[] value) {
      msdStockDivRecMmddyycc.setString(value); 
   }   
    
     /**
	 * 	Update MsdStockDivRecMmddyycc 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdStockDivRecMmddyycc(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdStockDivRecMmddyycc.begin,msdStockDivRecMmddyycc.length());
   }
   
     /**
	 * 	Update MsdStockDivRecMmddyycc 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdStockDivRecMmddyycc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdStockDivRecMmddyycc.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdStockDivRecMmddyycc with another Field
	 *	@param value
	 */
   public void setMsdStockDivRecMmddyycc(Field source) {
   	replace(source,0,source.length(),msdStockDivRecMmddyycc.begin,msdStockDivRecMmddyycc.length());
   }  
   
     /**
	 * 	Update MsdStockDivRecMmddyycc 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdStockDivRecMmddyycc(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdStockDivRecMmddyycc.begin,msdStockDivRecMmddyycc.length());
   }
   
     /**
	 * 	Update MsdStockDivRecMmddyycc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdStockDivRecMmddyycc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdStockDivRecMmddyycc.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdStockDivRate
	 *	@return msdStockDivRate
	 */
	public BigDecimal getMsdStockDivRate() throws CFException {
       if (isMsdStockDivRateModified()) { 
           msdStockDivRate = refreshMsdStockDivRate();
        }
   		return msdStockDivRate;
	}
	

	
	   
	/**
	 * 	Update MsdStockDivRate with the passed number
	 *  Corresponding COBOL Variable is MSD-STOCK-DIV-RATE
	 *	@param number
	 */
	public void setMsdStockDivRate(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdStockDivRate = checkMsdStockDivRateMaxLimit(number);
	    serializeMsdStockDivRate(msdStockDivRate);
   }
	/**
	 * 	Update MsdStockDivRate with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdStockDivRate(char[] value) throws CFException {
		 msdStockDivRate = serializeMsdStockDivRate(value);
	}   
	/**
	 *	Returns the value of msdStockDivExMmddyycc
	 *	@return msdStockDivExMmddyycc
	 */   
	 public MsdStockDivExMmddyycc getMsdStockDivExMmddyycc() {
   	return msdStockDivExMmddyycc;
   }
   /**
	* 	Update MsdStockDivExMmddyycc with the passed value
	*   Corresponding COBOL Variable is MSD-STOCK-DIV-EX-MMDDYYCC
	*	@param value
	*/
   public void setMsdStockDivExMmddyycc(char[] value) {
      msdStockDivExMmddyycc.setString(value); 
   }   
    
     /**
	 * 	Update MsdStockDivExMmddyycc 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdStockDivExMmddyycc(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdStockDivExMmddyycc.begin,msdStockDivExMmddyycc.length());
   }
   
     /**
	 * 	Update MsdStockDivExMmddyycc 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdStockDivExMmddyycc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdStockDivExMmddyycc.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdStockDivExMmddyycc with another Field
	 *	@param value
	 */
   public void setMsdStockDivExMmddyycc(Field source) {
   	replace(source,0,source.length(),msdStockDivExMmddyycc.begin,msdStockDivExMmddyycc.length());
   }  
   
     /**
	 * 	Update MsdStockDivExMmddyycc 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdStockDivExMmddyycc(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdStockDivExMmddyycc.begin,msdStockDivExMmddyycc.length());
   }
   
     /**
	 * 	Update MsdStockDivExMmddyycc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdStockDivExMmddyycc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdStockDivExMmddyycc.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdStockDivPayMmddyycc
	 *	@return msdStockDivPayMmddyycc
	 */   
	 public MsdStockDivPayMmddyycc getMsdStockDivPayMmddyycc() {
   	return msdStockDivPayMmddyycc;
   }
   /**
	* 	Update MsdStockDivPayMmddyycc with the passed value
	*   Corresponding COBOL Variable is MSD-STOCK-DIV-PAY-MMDDYYCC
	*	@param value
	*/
   public void setMsdStockDivPayMmddyycc(char[] value) {
      msdStockDivPayMmddyycc.setString(value); 
   }   
    
     /**
	 * 	Update MsdStockDivPayMmddyycc 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdStockDivPayMmddyycc(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdStockDivPayMmddyycc.begin,msdStockDivPayMmddyycc.length());
   }
   
     /**
	 * 	Update MsdStockDivPayMmddyycc 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdStockDivPayMmddyycc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdStockDivPayMmddyycc.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdStockDivPayMmddyycc with another Field
	 *	@param value
	 */
   public void setMsdStockDivPayMmddyycc(Field source) {
   	replace(source,0,source.length(),msdStockDivPayMmddyycc.begin,msdStockDivPayMmddyycc.length());
   }  
   
     /**
	 * 	Update MsdStockDivPayMmddyycc 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdStockDivPayMmddyycc(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdStockDivPayMmddyycc.begin,msdStockDivPayMmddyycc.length());
   }
   
     /**
	 * 	Update MsdStockDivPayMmddyycc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdStockDivPayMmddyycc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdStockDivPayMmddyycc.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01StockRecordDt
	 *	@return bdms01StockRecordDt
	 */
   public char[] getBdms01StockRecordDt() throws CFException{
     if (isBdms01StockRecordDtModified()) { 
        bdms01StockRecordDt = refreshBdms01StockRecordDt();
     }
   		return bdms01StockRecordDt;
   }

  
	/**
	*  set variable bdms01StockRecordDt
	*  Corresponding COBOL Variable is BDMS01-STOCK-RECORD-DT
	*  @param value
	**/
   public void setBdms01StockRecordDt(char[] value) {
      bdms01StockRecordDt = checkBdms01StockRecordDtConstraints(value);
      serializeBdms01StockRecordDt(bdms01StockRecordDt);
   } 

     /**
	 * 	Update Bdms01StockRecordDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01StockRecordDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01StockRecordDt,bdms01StockRecordDt.length);
   	
   }
   
   public void setBdms01StockRecordDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockRecordDt,bdms01StockRecordDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01StockRecordDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StockRecordDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockRecordDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01StockRecordDt with another Field
	 *	@param value
	 */
   public void setBdms01StockRecordDt(Field source) {
       replace(source,0,source.length(),beginBdms01StockRecordDt,BDMS_01_STOCK_RECORD_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01StockRecordDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01StockRecordDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01StockRecordDt,BDMS_01_STOCK_RECORD_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01StockRecordDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StockRecordDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockRecordDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01StockPaymentDt
	 *	@return bdms01StockPaymentDt
	 */
   public char[] getBdms01StockPaymentDt() throws CFException{
     if (isBdms01StockPaymentDtModified()) { 
        bdms01StockPaymentDt = refreshBdms01StockPaymentDt();
     }
   		return bdms01StockPaymentDt;
   }

  
	/**
	*  set variable bdms01StockPaymentDt
	*  Corresponding COBOL Variable is BDMS01-STOCK-PAYMENT-DT
	*  @param value
	**/
   public void setBdms01StockPaymentDt(char[] value) {
      bdms01StockPaymentDt = checkBdms01StockPaymentDtConstraints(value);
      serializeBdms01StockPaymentDt(bdms01StockPaymentDt);
   } 

     /**
	 * 	Update Bdms01StockPaymentDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01StockPaymentDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01StockPaymentDt,bdms01StockPaymentDt.length);
   	
   }
   
   public void setBdms01StockPaymentDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockPaymentDt,bdms01StockPaymentDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01StockPaymentDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StockPaymentDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockPaymentDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01StockPaymentDt with another Field
	 *	@param value
	 */
   public void setBdms01StockPaymentDt(Field source) {
       replace(source,0,source.length(),beginBdms01StockPaymentDt,BDMS_01_STOCK_PAYMENT_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01StockPaymentDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01StockPaymentDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01StockPaymentDt,BDMS_01_STOCK_PAYMENT_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01StockPaymentDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StockPaymentDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockPaymentDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01StockExdividendDt
	 *	@return bdms01StockExdividendDt
	 */
   public char[] getBdms01StockExdividendDt() throws CFException{
     if (isBdms01StockExdividendDtModified()) { 
        bdms01StockExdividendDt = refreshBdms01StockExdividendDt();
     }
   		return bdms01StockExdividendDt;
   }

  
	/**
	*  set variable bdms01StockExdividendDt
	*  Corresponding COBOL Variable is BDMS01-STOCK-EXDIVIDEND-DT
	*  @param value
	**/
   public void setBdms01StockExdividendDt(char[] value) {
      bdms01StockExdividendDt = checkBdms01StockExdividendDtConstraints(value);
      serializeBdms01StockExdividendDt(bdms01StockExdividendDt);
   } 

     /**
	 * 	Update Bdms01StockExdividendDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01StockExdividendDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01StockExdividendDt,bdms01StockExdividendDt.length);
   	
   }
   
   public void setBdms01StockExdividendDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockExdividendDt,bdms01StockExdividendDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01StockExdividendDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StockExdividendDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockExdividendDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01StockExdividendDt with another Field
	 *	@param value
	 */
   public void setBdms01StockExdividendDt(Field source) {
       replace(source,0,source.length(),beginBdms01StockExdividendDt,BDMS_01_STOCK_EXDIVIDEND_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01StockExdividendDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01StockExdividendDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01StockExdividendDt,BDMS_01_STOCK_EXDIVIDEND_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01StockExdividendDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StockExdividendDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockExdividendDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01StockFrqncPayCd
	 *	@return bdms01StockFrqncPayCd
	 */
   public char[] getBdms01StockFrqncPayCd() throws CFException{
     if (isBdms01StockFrqncPayCdModified()) { 
        bdms01StockFrqncPayCd = refreshBdms01StockFrqncPayCd();
     }
   		return bdms01StockFrqncPayCd;
   }

  
	/**
	*  set variable bdms01StockFrqncPayCd
	*  Corresponding COBOL Variable is BDMS01-STOCK-FRQNC-PAY-CD
	*  @param value
	**/
   public void setBdms01StockFrqncPayCd(char[] value) {
      bdms01StockFrqncPayCd = checkBdms01StockFrqncPayCdConstraints(value);
      serializeBdms01StockFrqncPayCd(bdms01StockFrqncPayCd);
   } 

     /**
	 * 	Update Bdms01StockFrqncPayCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01StockFrqncPayCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01StockFrqncPayCd,bdms01StockFrqncPayCd.length);
   	
   }
   
   public void setBdms01StockFrqncPayCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockFrqncPayCd,bdms01StockFrqncPayCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01StockFrqncPayCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StockFrqncPayCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockFrqncPayCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01StockFrqncPayCd with another Field
	 *	@param value
	 */
   public void setBdms01StockFrqncPayCd(Field source) {
       replace(source,0,source.length(),beginBdms01StockFrqncPayCd,BDMS_01_STOCK_FRQNC_PAY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01StockFrqncPayCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01StockFrqncPayCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01StockFrqncPayCd,BDMS_01_STOCK_FRQNC_PAY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01StockFrqncPayCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StockFrqncPayCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockFrqncPayCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01StockDayTkffGnrtQty
	 *	@return bdms01StockDayTkffGnrtQty
	 */
	public int getBdms01StockDayTkffGnrtQty() throws CFException {
       if (isBdms01StockDayTkffGnrtQtyModified()) { 
           bdms01StockDayTkffGnrtQty = refreshBdms01StockDayTkffGnrtQty();
        }
   		return bdms01StockDayTkffGnrtQty;
	}
	

	
	   
	/**
	 * 	Update Bdms01StockDayTkffGnrtQty with the passed value
	 *  Corresponding COBOL Variable is BDMS01-STOCK-DAY-TKFF-GNRT-QTY
	 *	@param number
	 */
	public void setBdms01StockDayTkffGnrtQty(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01StockDayTkffGnrtQty = checkBdms01StockDayTkffGnrtQtyMaxLimit(number); 
		serializeBdms01StockDayTkffGnrtQty(bdms01StockDayTkffGnrtQty);
	}
	

	public void setBdms01StockDayTkffGnrtQty(long number) {
	    number = checkBdms01StockDayTkffGnrtQtyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01StockDayTkffGnrtQty((int)number);
	}
	
	/**
	 * 	Update Bdms01StockDayTkffGnrtQty with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01StockDayTkffGnrtQty(char[] value) throws CFException {
		 bdms01StockDayTkffGnrtQty = serializeBdms01StockDayTkffGnrtQty(value);
	}
	/**
	 * 	Update Bdms01StockDayTkffGnrtQty with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01StockDayTkffGnrtQtyString(char[] value) throws CFException {
		 setBdms01StockDayTkffGnrtQty(value);
	}
	/**
	 *	Returns the value of bdms01StockAssetLiqnInd
	 *	@return bdms01StockAssetLiqnInd
	 */
   public char[] getBdms01StockAssetLiqnInd() throws CFException{
     if (isBdms01StockAssetLiqnIndModified()) { 
        bdms01StockAssetLiqnInd = refreshBdms01StockAssetLiqnInd();
     }
   		return bdms01StockAssetLiqnInd;
   }

  
	/**
	*  set variable bdms01StockAssetLiqnInd
	*  Corresponding COBOL Variable is BDMS01-STOCK-ASSET-LIQN-IND
	*  @param value
	**/
   public void setBdms01StockAssetLiqnInd(char[] value) {
      bdms01StockAssetLiqnInd = checkBdms01StockAssetLiqnIndConstraints(value);
      serializeBdms01StockAssetLiqnInd(bdms01StockAssetLiqnInd);
   } 

     /**
	 * 	Update Bdms01StockAssetLiqnInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01StockAssetLiqnInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01StockAssetLiqnInd,bdms01StockAssetLiqnInd.length);
   	
   }
   
   public void setBdms01StockAssetLiqnInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockAssetLiqnInd,bdms01StockAssetLiqnInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01StockAssetLiqnInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StockAssetLiqnInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockAssetLiqnInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01StockAssetLiqnInd with another Field
	 *	@param value
	 */
   public void setBdms01StockAssetLiqnInd(Field source) {
       replace(source,0,source.length(),beginBdms01StockAssetLiqnInd,BDMS_01_STOCK_ASSET_LIQN_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01StockAssetLiqnInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01StockAssetLiqnInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01StockAssetLiqnInd,BDMS_01_STOCK_ASSET_LIQN_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01StockAssetLiqnInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StockAssetLiqnInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockAssetLiqnInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01StockCurrencyCd
	 *	@return bdms01StockCurrencyCd
	 */
   public char[] getBdms01StockCurrencyCd() throws CFException{
     if (isBdms01StockCurrencyCdModified()) { 
        bdms01StockCurrencyCd = refreshBdms01StockCurrencyCd();
     }
   		return bdms01StockCurrencyCd;
   }

  
	/**
	*  set variable bdms01StockCurrencyCd
	*  Corresponding COBOL Variable is BDMS01-STOCK-CURRENCY-CD
	*  @param value
	**/
   public void setBdms01StockCurrencyCd(char[] value) {
      bdms01StockCurrencyCd = checkBdms01StockCurrencyCdConstraints(value);
      serializeBdms01StockCurrencyCd(bdms01StockCurrencyCd);
   } 

     /**
	 * 	Update Bdms01StockCurrencyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01StockCurrencyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01StockCurrencyCd,bdms01StockCurrencyCd.length);
   	
   }
   
   public void setBdms01StockCurrencyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockCurrencyCd,bdms01StockCurrencyCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01StockCurrencyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StockCurrencyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockCurrencyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01StockCurrencyCd with another Field
	 *	@param value
	 */
   public void setBdms01StockCurrencyCd(Field source) {
       replace(source,0,source.length(),beginBdms01StockCurrencyCd,BDMS_01_STOCK_CURRENCY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01StockCurrencyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01StockCurrencyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01StockCurrencyCd,BDMS_01_STOCK_CURRENCY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01StockCurrencyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StockCurrencyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockCurrencyCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01StockVendorCd
	 *	@return bdms01StockVendorCd
	 */
   public char[] getBdms01StockVendorCd() throws CFException{
     if (isBdms01StockVendorCdModified()) { 
        bdms01StockVendorCd = refreshBdms01StockVendorCd();
     }
   		return bdms01StockVendorCd;
   }

  
	/**
	*  set variable bdms01StockVendorCd
	*  Corresponding COBOL Variable is BDMS01-STOCK-VENDOR-CD
	*  @param value
	**/
   public void setBdms01StockVendorCd(char[] value) {
      bdms01StockVendorCd = checkBdms01StockVendorCdConstraints(value);
      serializeBdms01StockVendorCd(bdms01StockVendorCd);
   } 

     /**
	 * 	Update Bdms01StockVendorCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01StockVendorCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01StockVendorCd,bdms01StockVendorCd.length);
   	
   }
   
   public void setBdms01StockVendorCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockVendorCd,bdms01StockVendorCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01StockVendorCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StockVendorCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockVendorCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01StockVendorCd with another Field
	 *	@param value
	 */
   public void setBdms01StockVendorCd(Field source) {
       replace(source,0,source.length(),beginBdms01StockVendorCd,BDMS_01_STOCK_VENDOR_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01StockVendorCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01StockVendorCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01StockVendorCd,BDMS_01_STOCK_VENDOR_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01StockVendorCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StockVendorCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockVendorCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01StockTypeIncomeCd
	 *	@return bdms01StockTypeIncomeCd
	 */
   public char[] getBdms01StockTypeIncomeCd() throws CFException{
     if (isBdms01StockTypeIncomeCdModified()) { 
        bdms01StockTypeIncomeCd = refreshBdms01StockTypeIncomeCd();
     }
   		return bdms01StockTypeIncomeCd;
   }

  
	/**
	*  set variable bdms01StockTypeIncomeCd
	*  Corresponding COBOL Variable is BDMS01-STOCK-TYPE-INCOME-CD
	*  @param value
	**/
   public void setBdms01StockTypeIncomeCd(char[] value) {
      bdms01StockTypeIncomeCd = checkBdms01StockTypeIncomeCdConstraints(value);
      serializeBdms01StockTypeIncomeCd(bdms01StockTypeIncomeCd);
   } 

     /**
	 * 	Update Bdms01StockTypeIncomeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01StockTypeIncomeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01StockTypeIncomeCd,bdms01StockTypeIncomeCd.length);
   	
   }
   
   public void setBdms01StockTypeIncomeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockTypeIncomeCd,bdms01StockTypeIncomeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01StockTypeIncomeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StockTypeIncomeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockTypeIncomeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01StockTypeIncomeCd with another Field
	 *	@param value
	 */
   public void setBdms01StockTypeIncomeCd(Field source) {
       replace(source,0,source.length(),beginBdms01StockTypeIncomeCd,BDMS_01_STOCK_TYPE_INCOME_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01StockTypeIncomeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01StockTypeIncomeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01StockTypeIncomeCd,BDMS_01_STOCK_TYPE_INCOME_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01StockTypeIncomeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StockTypeIncomeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockTypeIncomeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01StockPayFrctnShrInd
	 *	@return bdms01StockPayFrctnShrInd
	 */
   public char[] getBdms01StockPayFrctnShrInd() throws CFException{
     if (isBdms01StockPayFrctnShrIndModified()) { 
        bdms01StockPayFrctnShrInd = refreshBdms01StockPayFrctnShrInd();
     }
   		return bdms01StockPayFrctnShrInd;
   }

  
	/**
	*  set variable bdms01StockPayFrctnShrInd
	*  Corresponding COBOL Variable is BDMS01-STOCK-PAY-FRCTN-SHR-IND
	*  @param value
	**/
   public void setBdms01StockPayFrctnShrInd(char[] value) {
      bdms01StockPayFrctnShrInd = checkBdms01StockPayFrctnShrIndConstraints(value);
      serializeBdms01StockPayFrctnShrInd(bdms01StockPayFrctnShrInd);
   } 

     /**
	 * 	Update Bdms01StockPayFrctnShrInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01StockPayFrctnShrInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01StockPayFrctnShrInd,bdms01StockPayFrctnShrInd.length);
   	
   }
   
   public void setBdms01StockPayFrctnShrInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockPayFrctnShrInd,bdms01StockPayFrctnShrInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01StockPayFrctnShrInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StockPayFrctnShrInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockPayFrctnShrInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01StockPayFrctnShrInd with another Field
	 *	@param value
	 */
   public void setBdms01StockPayFrctnShrInd(Field source) {
       replace(source,0,source.length(),beginBdms01StockPayFrctnShrInd,BDMS_01_STOCK_PAY_FRCTN_SHR_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01StockPayFrctnShrInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01StockPayFrctnShrInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01StockPayFrctnShrInd,BDMS_01_STOCK_PAY_FRCTN_SHR_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01StockPayFrctnShrInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StockPayFrctnShrInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockPayFrctnShrInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdSplitDivRecMmddyycc
	 *	@return msdSplitDivRecMmddyycc
	 */   
	 public MsdSplitDivRecMmddyycc getMsdSplitDivRecMmddyycc() {
   	return msdSplitDivRecMmddyycc;
   }
   /**
	* 	Update MsdSplitDivRecMmddyycc with the passed value
	*   Corresponding COBOL Variable is MSD-SPLIT-DIV-REC-MMDDYYCC
	*	@param value
	*/
   public void setMsdSplitDivRecMmddyycc(char[] value) {
      msdSplitDivRecMmddyycc.setString(value); 
   }   
    
     /**
	 * 	Update MsdSplitDivRecMmddyycc 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdSplitDivRecMmddyycc(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdSplitDivRecMmddyycc.begin,msdSplitDivRecMmddyycc.length());
   }
   
     /**
	 * 	Update MsdSplitDivRecMmddyycc 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSplitDivRecMmddyycc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdSplitDivRecMmddyycc.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdSplitDivRecMmddyycc with another Field
	 *	@param value
	 */
   public void setMsdSplitDivRecMmddyycc(Field source) {
   	replace(source,0,source.length(),msdSplitDivRecMmddyycc.begin,msdSplitDivRecMmddyycc.length());
   }  
   
     /**
	 * 	Update MsdSplitDivRecMmddyycc 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdSplitDivRecMmddyycc(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdSplitDivRecMmddyycc.begin,msdSplitDivRecMmddyycc.length());
   }
   
     /**
	 * 	Update MsdSplitDivRecMmddyycc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSplitDivRecMmddyycc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdSplitDivRecMmddyycc.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdSplitDivRate
	 *	@return msdSplitDivRate
	 */
	public BigDecimal getMsdSplitDivRate() throws CFException {
       if (isMsdSplitDivRateModified()) { 
           msdSplitDivRate = refreshMsdSplitDivRate();
        }
   		return msdSplitDivRate;
	}
	

	
	   
	/**
	 * 	Update MsdSplitDivRate with the passed number
	 *  Corresponding COBOL Variable is MSD-SPLIT-DIV-RATE
	 *	@param number
	 */
	public void setMsdSplitDivRate(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdSplitDivRate = checkMsdSplitDivRateMaxLimit(number);
	    serializeMsdSplitDivRate(msdSplitDivRate);
   }
	/**
	 * 	Update MsdSplitDivRate with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdSplitDivRate(char[] value) throws CFException {
		 msdSplitDivRate = serializeMsdSplitDivRate(value);
	}   
	/**
	 *	Returns the value of msdSplitDivExMmddyycc
	 *	@return msdSplitDivExMmddyycc
	 */   
	 public MsdSplitDivExMmddyycc getMsdSplitDivExMmddyycc() {
   	return msdSplitDivExMmddyycc;
   }
   /**
	* 	Update MsdSplitDivExMmddyycc with the passed value
	*   Corresponding COBOL Variable is MSD-SPLIT-DIV-EX-MMDDYYCC
	*	@param value
	*/
   public void setMsdSplitDivExMmddyycc(char[] value) {
      msdSplitDivExMmddyycc.setString(value); 
   }   
    
     /**
	 * 	Update MsdSplitDivExMmddyycc 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdSplitDivExMmddyycc(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdSplitDivExMmddyycc.begin,msdSplitDivExMmddyycc.length());
   }
   
     /**
	 * 	Update MsdSplitDivExMmddyycc 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSplitDivExMmddyycc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdSplitDivExMmddyycc.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdSplitDivExMmddyycc with another Field
	 *	@param value
	 */
   public void setMsdSplitDivExMmddyycc(Field source) {
   	replace(source,0,source.length(),msdSplitDivExMmddyycc.begin,msdSplitDivExMmddyycc.length());
   }  
   
     /**
	 * 	Update MsdSplitDivExMmddyycc 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdSplitDivExMmddyycc(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdSplitDivExMmddyycc.begin,msdSplitDivExMmddyycc.length());
   }
   
     /**
	 * 	Update MsdSplitDivExMmddyycc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSplitDivExMmddyycc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdSplitDivExMmddyycc.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdSplitDivPayMmddyycc
	 *	@return msdSplitDivPayMmddyycc
	 */   
	 public MsdSplitDivPayMmddyycc getMsdSplitDivPayMmddyycc() {
   	return msdSplitDivPayMmddyycc;
   }
   /**
	* 	Update MsdSplitDivPayMmddyycc with the passed value
	*   Corresponding COBOL Variable is MSD-SPLIT-DIV-PAY-MMDDYYCC
	*	@param value
	*/
   public void setMsdSplitDivPayMmddyycc(char[] value) {
      msdSplitDivPayMmddyycc.setString(value); 
   }   
    
     /**
	 * 	Update MsdSplitDivPayMmddyycc 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdSplitDivPayMmddyycc(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdSplitDivPayMmddyycc.begin,msdSplitDivPayMmddyycc.length());
   }
   
     /**
	 * 	Update MsdSplitDivPayMmddyycc 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSplitDivPayMmddyycc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdSplitDivPayMmddyycc.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdSplitDivPayMmddyycc with another Field
	 *	@param value
	 */
   public void setMsdSplitDivPayMmddyycc(Field source) {
   	replace(source,0,source.length(),msdSplitDivPayMmddyycc.begin,msdSplitDivPayMmddyycc.length());
   }  
   
     /**
	 * 	Update MsdSplitDivPayMmddyycc 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdSplitDivPayMmddyycc(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdSplitDivPayMmddyycc.begin,msdSplitDivPayMmddyycc.length());
   }
   
     /**
	 * 	Update MsdSplitDivPayMmddyycc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSplitDivPayMmddyycc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdSplitDivPayMmddyycc.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01SplitRecordDt
	 *	@return bdms01SplitRecordDt
	 */
   public char[] getBdms01SplitRecordDt() throws CFException{
     if (isBdms01SplitRecordDtModified()) { 
        bdms01SplitRecordDt = refreshBdms01SplitRecordDt();
     }
   		return bdms01SplitRecordDt;
   }

  
	/**
	*  set variable bdms01SplitRecordDt
	*  Corresponding COBOL Variable is BDMS01-SPLIT-RECORD-DT
	*  @param value
	**/
   public void setBdms01SplitRecordDt(char[] value) {
      bdms01SplitRecordDt = checkBdms01SplitRecordDtConstraints(value);
      serializeBdms01SplitRecordDt(bdms01SplitRecordDt);
   } 

     /**
	 * 	Update Bdms01SplitRecordDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SplitRecordDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SplitRecordDt,bdms01SplitRecordDt.length);
   	
   }
   
   public void setBdms01SplitRecordDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitRecordDt,bdms01SplitRecordDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01SplitRecordDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SplitRecordDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitRecordDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SplitRecordDt with another Field
	 *	@param value
	 */
   public void setBdms01SplitRecordDt(Field source) {
       replace(source,0,source.length(),beginBdms01SplitRecordDt,BDMS_01_SPLIT_RECORD_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SplitRecordDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SplitRecordDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SplitRecordDt,BDMS_01_SPLIT_RECORD_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SplitRecordDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SplitRecordDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitRecordDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SplitPaymentDt
	 *	@return bdms01SplitPaymentDt
	 */
   public char[] getBdms01SplitPaymentDt() throws CFException{
     if (isBdms01SplitPaymentDtModified()) { 
        bdms01SplitPaymentDt = refreshBdms01SplitPaymentDt();
     }
   		return bdms01SplitPaymentDt;
   }

  
	/**
	*  set variable bdms01SplitPaymentDt
	*  Corresponding COBOL Variable is BDMS01-SPLIT-PAYMENT-DT
	*  @param value
	**/
   public void setBdms01SplitPaymentDt(char[] value) {
      bdms01SplitPaymentDt = checkBdms01SplitPaymentDtConstraints(value);
      serializeBdms01SplitPaymentDt(bdms01SplitPaymentDt);
   } 

     /**
	 * 	Update Bdms01SplitPaymentDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SplitPaymentDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SplitPaymentDt,bdms01SplitPaymentDt.length);
   	
   }
   
   public void setBdms01SplitPaymentDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitPaymentDt,bdms01SplitPaymentDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01SplitPaymentDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SplitPaymentDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitPaymentDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SplitPaymentDt with another Field
	 *	@param value
	 */
   public void setBdms01SplitPaymentDt(Field source) {
       replace(source,0,source.length(),beginBdms01SplitPaymentDt,BDMS_01_SPLIT_PAYMENT_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SplitPaymentDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SplitPaymentDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SplitPaymentDt,BDMS_01_SPLIT_PAYMENT_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SplitPaymentDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SplitPaymentDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitPaymentDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SplitExdividendDt
	 *	@return bdms01SplitExdividendDt
	 */
   public char[] getBdms01SplitExdividendDt() throws CFException{
     if (isBdms01SplitExdividendDtModified()) { 
        bdms01SplitExdividendDt = refreshBdms01SplitExdividendDt();
     }
   		return bdms01SplitExdividendDt;
   }

  
	/**
	*  set variable bdms01SplitExdividendDt
	*  Corresponding COBOL Variable is BDMS01-SPLIT-EXDIVIDEND-DT
	*  @param value
	**/
   public void setBdms01SplitExdividendDt(char[] value) {
      bdms01SplitExdividendDt = checkBdms01SplitExdividendDtConstraints(value);
      serializeBdms01SplitExdividendDt(bdms01SplitExdividendDt);
   } 

     /**
	 * 	Update Bdms01SplitExdividendDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SplitExdividendDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SplitExdividendDt,bdms01SplitExdividendDt.length);
   	
   }
   
   public void setBdms01SplitExdividendDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitExdividendDt,bdms01SplitExdividendDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01SplitExdividendDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SplitExdividendDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitExdividendDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SplitExdividendDt with another Field
	 *	@param value
	 */
   public void setBdms01SplitExdividendDt(Field source) {
       replace(source,0,source.length(),beginBdms01SplitExdividendDt,BDMS_01_SPLIT_EXDIVIDEND_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SplitExdividendDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SplitExdividendDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SplitExdividendDt,BDMS_01_SPLIT_EXDIVIDEND_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SplitExdividendDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SplitExdividendDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitExdividendDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SplitFrqncPayCd
	 *	@return bdms01SplitFrqncPayCd
	 */
   public char[] getBdms01SplitFrqncPayCd() throws CFException{
     if (isBdms01SplitFrqncPayCdModified()) { 
        bdms01SplitFrqncPayCd = refreshBdms01SplitFrqncPayCd();
     }
   		return bdms01SplitFrqncPayCd;
   }

  
	/**
	*  set variable bdms01SplitFrqncPayCd
	*  Corresponding COBOL Variable is BDMS01-SPLIT-FRQNC-PAY-CD
	*  @param value
	**/
   public void setBdms01SplitFrqncPayCd(char[] value) {
      bdms01SplitFrqncPayCd = checkBdms01SplitFrqncPayCdConstraints(value);
      serializeBdms01SplitFrqncPayCd(bdms01SplitFrqncPayCd);
   } 

     /**
	 * 	Update Bdms01SplitFrqncPayCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SplitFrqncPayCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SplitFrqncPayCd,bdms01SplitFrqncPayCd.length);
   	
   }
   
   public void setBdms01SplitFrqncPayCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitFrqncPayCd,bdms01SplitFrqncPayCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SplitFrqncPayCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SplitFrqncPayCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitFrqncPayCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SplitFrqncPayCd with another Field
	 *	@param value
	 */
   public void setBdms01SplitFrqncPayCd(Field source) {
       replace(source,0,source.length(),beginBdms01SplitFrqncPayCd,BDMS_01_SPLIT_FRQNC_PAY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SplitFrqncPayCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SplitFrqncPayCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SplitFrqncPayCd,BDMS_01_SPLIT_FRQNC_PAY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SplitFrqncPayCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SplitFrqncPayCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitFrqncPayCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SplitDayTkffGnrtQty
	 *	@return bdms01SplitDayTkffGnrtQty
	 */
	public int getBdms01SplitDayTkffGnrtQty() throws CFException {
       if (isBdms01SplitDayTkffGnrtQtyModified()) { 
           bdms01SplitDayTkffGnrtQty = refreshBdms01SplitDayTkffGnrtQty();
        }
   		return bdms01SplitDayTkffGnrtQty;
	}
	

	
	   
	/**
	 * 	Update Bdms01SplitDayTkffGnrtQty with the passed value
	 *  Corresponding COBOL Variable is BDMS01-SPLIT-DAY-TKFF-GNRT-QTY
	 *	@param number
	 */
	public void setBdms01SplitDayTkffGnrtQty(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01SplitDayTkffGnrtQty = checkBdms01SplitDayTkffGnrtQtyMaxLimit(number); 
		serializeBdms01SplitDayTkffGnrtQty(bdms01SplitDayTkffGnrtQty);
	}
	

	public void setBdms01SplitDayTkffGnrtQty(long number) {
	    number = checkBdms01SplitDayTkffGnrtQtyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01SplitDayTkffGnrtQty((int)number);
	}
	
	/**
	 * 	Update Bdms01SplitDayTkffGnrtQty with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01SplitDayTkffGnrtQty(char[] value) throws CFException {
		 bdms01SplitDayTkffGnrtQty = serializeBdms01SplitDayTkffGnrtQty(value);
	}
	/**
	 * 	Update Bdms01SplitDayTkffGnrtQty with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01SplitDayTkffGnrtQtyString(char[] value) throws CFException {
		 setBdms01SplitDayTkffGnrtQty(value);
	}
	/**
	 *	Returns the value of bdms01SplitAssetLiqnInd
	 *	@return bdms01SplitAssetLiqnInd
	 */
   public char[] getBdms01SplitAssetLiqnInd() throws CFException{
     if (isBdms01SplitAssetLiqnIndModified()) { 
        bdms01SplitAssetLiqnInd = refreshBdms01SplitAssetLiqnInd();
     }
   		return bdms01SplitAssetLiqnInd;
   }

  
	/**
	*  set variable bdms01SplitAssetLiqnInd
	*  Corresponding COBOL Variable is BDMS01-SPLIT-ASSET-LIQN-IND
	*  @param value
	**/
   public void setBdms01SplitAssetLiqnInd(char[] value) {
      bdms01SplitAssetLiqnInd = checkBdms01SplitAssetLiqnIndConstraints(value);
      serializeBdms01SplitAssetLiqnInd(bdms01SplitAssetLiqnInd);
   } 

     /**
	 * 	Update Bdms01SplitAssetLiqnInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SplitAssetLiqnInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SplitAssetLiqnInd,bdms01SplitAssetLiqnInd.length);
   	
   }
   
   public void setBdms01SplitAssetLiqnInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitAssetLiqnInd,bdms01SplitAssetLiqnInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SplitAssetLiqnInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SplitAssetLiqnInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitAssetLiqnInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SplitAssetLiqnInd with another Field
	 *	@param value
	 */
   public void setBdms01SplitAssetLiqnInd(Field source) {
       replace(source,0,source.length(),beginBdms01SplitAssetLiqnInd,BDMS_01_SPLIT_ASSET_LIQN_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SplitAssetLiqnInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SplitAssetLiqnInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SplitAssetLiqnInd,BDMS_01_SPLIT_ASSET_LIQN_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SplitAssetLiqnInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SplitAssetLiqnInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitAssetLiqnInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SplitCurrencyCd
	 *	@return bdms01SplitCurrencyCd
	 */
   public char[] getBdms01SplitCurrencyCd() throws CFException{
     if (isBdms01SplitCurrencyCdModified()) { 
        bdms01SplitCurrencyCd = refreshBdms01SplitCurrencyCd();
     }
   		return bdms01SplitCurrencyCd;
   }

  
	/**
	*  set variable bdms01SplitCurrencyCd
	*  Corresponding COBOL Variable is BDMS01-SPLIT-CURRENCY-CD
	*  @param value
	**/
   public void setBdms01SplitCurrencyCd(char[] value) {
      bdms01SplitCurrencyCd = checkBdms01SplitCurrencyCdConstraints(value);
      serializeBdms01SplitCurrencyCd(bdms01SplitCurrencyCd);
   } 

     /**
	 * 	Update Bdms01SplitCurrencyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SplitCurrencyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SplitCurrencyCd,bdms01SplitCurrencyCd.length);
   	
   }
   
   public void setBdms01SplitCurrencyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitCurrencyCd,bdms01SplitCurrencyCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SplitCurrencyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SplitCurrencyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitCurrencyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SplitCurrencyCd with another Field
	 *	@param value
	 */
   public void setBdms01SplitCurrencyCd(Field source) {
       replace(source,0,source.length(),beginBdms01SplitCurrencyCd,BDMS_01_SPLIT_CURRENCY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SplitCurrencyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SplitCurrencyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SplitCurrencyCd,BDMS_01_SPLIT_CURRENCY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SplitCurrencyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SplitCurrencyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitCurrencyCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SplitVendorCd
	 *	@return bdms01SplitVendorCd
	 */
   public char[] getBdms01SplitVendorCd() throws CFException{
     if (isBdms01SplitVendorCdModified()) { 
        bdms01SplitVendorCd = refreshBdms01SplitVendorCd();
     }
   		return bdms01SplitVendorCd;
   }

  
	/**
	*  set variable bdms01SplitVendorCd
	*  Corresponding COBOL Variable is BDMS01-SPLIT-VENDOR-CD
	*  @param value
	**/
   public void setBdms01SplitVendorCd(char[] value) {
      bdms01SplitVendorCd = checkBdms01SplitVendorCdConstraints(value);
      serializeBdms01SplitVendorCd(bdms01SplitVendorCd);
   } 

     /**
	 * 	Update Bdms01SplitVendorCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SplitVendorCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SplitVendorCd,bdms01SplitVendorCd.length);
   	
   }
   
   public void setBdms01SplitVendorCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitVendorCd,bdms01SplitVendorCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SplitVendorCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SplitVendorCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitVendorCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SplitVendorCd with another Field
	 *	@param value
	 */
   public void setBdms01SplitVendorCd(Field source) {
       replace(source,0,source.length(),beginBdms01SplitVendorCd,BDMS_01_SPLIT_VENDOR_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SplitVendorCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SplitVendorCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SplitVendorCd,BDMS_01_SPLIT_VENDOR_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SplitVendorCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SplitVendorCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitVendorCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SplitTypeIncomeCd
	 *	@return bdms01SplitTypeIncomeCd
	 */
   public char[] getBdms01SplitTypeIncomeCd() throws CFException{
     if (isBdms01SplitTypeIncomeCdModified()) { 
        bdms01SplitTypeIncomeCd = refreshBdms01SplitTypeIncomeCd();
     }
   		return bdms01SplitTypeIncomeCd;
   }

  
	/**
	*  set variable bdms01SplitTypeIncomeCd
	*  Corresponding COBOL Variable is BDMS01-SPLIT-TYPE-INCOME-CD
	*  @param value
	**/
   public void setBdms01SplitTypeIncomeCd(char[] value) {
      bdms01SplitTypeIncomeCd = checkBdms01SplitTypeIncomeCdConstraints(value);
      serializeBdms01SplitTypeIncomeCd(bdms01SplitTypeIncomeCd);
   } 

     /**
	 * 	Update Bdms01SplitTypeIncomeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SplitTypeIncomeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SplitTypeIncomeCd,bdms01SplitTypeIncomeCd.length);
   	
   }
   
   public void setBdms01SplitTypeIncomeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitTypeIncomeCd,bdms01SplitTypeIncomeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SplitTypeIncomeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SplitTypeIncomeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitTypeIncomeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SplitTypeIncomeCd with another Field
	 *	@param value
	 */
   public void setBdms01SplitTypeIncomeCd(Field source) {
       replace(source,0,source.length(),beginBdms01SplitTypeIncomeCd,BDMS_01_SPLIT_TYPE_INCOME_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SplitTypeIncomeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SplitTypeIncomeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SplitTypeIncomeCd,BDMS_01_SPLIT_TYPE_INCOME_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SplitTypeIncomeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SplitTypeIncomeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitTypeIncomeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SplitPayFrctnShrInd
	 *	@return bdms01SplitPayFrctnShrInd
	 */
   public char[] getBdms01SplitPayFrctnShrInd() throws CFException{
     if (isBdms01SplitPayFrctnShrIndModified()) { 
        bdms01SplitPayFrctnShrInd = refreshBdms01SplitPayFrctnShrInd();
     }
   		return bdms01SplitPayFrctnShrInd;
   }

  
	/**
	*  set variable bdms01SplitPayFrctnShrInd
	*  Corresponding COBOL Variable is BDMS01-SPLIT-PAY-FRCTN-SHR-IND
	*  @param value
	**/
   public void setBdms01SplitPayFrctnShrInd(char[] value) {
      bdms01SplitPayFrctnShrInd = checkBdms01SplitPayFrctnShrIndConstraints(value);
      serializeBdms01SplitPayFrctnShrInd(bdms01SplitPayFrctnShrInd);
   } 

     /**
	 * 	Update Bdms01SplitPayFrctnShrInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SplitPayFrctnShrInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SplitPayFrctnShrInd,bdms01SplitPayFrctnShrInd.length);
   	
   }
   
   public void setBdms01SplitPayFrctnShrInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitPayFrctnShrInd,bdms01SplitPayFrctnShrInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SplitPayFrctnShrInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SplitPayFrctnShrInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitPayFrctnShrInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SplitPayFrctnShrInd with another Field
	 *	@param value
	 */
   public void setBdms01SplitPayFrctnShrInd(Field source) {
       replace(source,0,source.length(),beginBdms01SplitPayFrctnShrInd,BDMS_01_SPLIT_PAY_FRCTN_SHR_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SplitPayFrctnShrInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SplitPayFrctnShrInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SplitPayFrctnShrInd,BDMS_01_SPLIT_PAY_FRCTN_SHR_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SplitPayFrctnShrInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SplitPayFrctnShrInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SplitPayFrctnShrInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdSplitRightInd
	 *	@return msdSplitRightInd
	 */
   public char[] getMsdSplitRightInd() throws CFException{
     if (isMsdSplitRightIndModified()) { 
        msdSplitRightInd = refreshMsdSplitRightInd();
     }
   		return msdSplitRightInd;
   }

  
	/**
	*  set variable msdSplitRightInd
	*  Corresponding COBOL Variable is MSD-SPLIT-RIGHT-IND
	*  @param value
	**/
   public void setMsdSplitRightInd(char[] value) {
      msdSplitRightInd = checkMsdSplitRightIndConstraints(value);
      serializeMsdSplitRightInd(msdSplitRightInd);
   } 

     /**
	 * 	Update MsdSplitRightInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSplitRightInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSplitRightInd,msdSplitRightInd.length);
   	
   }
   
   public void setMsdSplitRightInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSplitRightInd,msdSplitRightInd.length);
   	
   }
   
     /**
	 * 	Update MsdSplitRightInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSplitRightInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSplitRightInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSplitRightInd with another Field
	 *	@param value
	 */
   public void setMsdSplitRightInd(Field source) {
       replace(source,0,source.length(),beginMsdSplitRightInd,MSD_SPLIT_RIGHT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSplitRightInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSplitRightInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSplitRightInd,MSD_SPLIT_RIGHT_IND_LEN);
   	
   }
   
     /**
	 * 	Update MsdSplitRightInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSplitRightInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSplitRightInd+targetIndex,targetLen);
    
   }
	char[] msdSplitDividend88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isMsdSplitDividend()
	 *	@return  Returns true if isMsdSplitDividend() is "1"
	 */
   public boolean isMsdSplitDividend() throws CFException {
      return (  compareChars( getMsdSplitRightInd() , msdSplitDividend88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setMsdSplitDividendTrue() {  			
    	setMsdSplitRightInd( msdSplitDividend88Value);
   	}
	char[] msdRightDividend88Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isMsdRightDividend()
	 *	@return  Returns true if isMsdRightDividend() is "2"
	 */
   public boolean isMsdRightDividend() throws CFException {
      return (  compareChars( getMsdSplitRightInd() , msdRightDividend88Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setMsdRightDividendTrue() {  			
    	setMsdSplitRightInd( msdRightDividend88Value);
   	}
	char[] msdSpinoff88Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isMsdSpinoff()
	 *	@return  Returns true if isMsdSpinoff() is "3"
	 */
   public boolean isMsdSpinoff() throws CFException {
      return (  compareChars( getMsdSplitRightInd() , msdSpinoff88Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setMsdSpinoffTrue() {  			
    	setMsdSplitRightInd( msdSpinoff88Value);
   	}
	char[] msdLiquidation88Value = "4".toCharArray();
	/**
	 *	Test condition "4" for isMsdLiquidation()
	 *	@return  Returns true if isMsdLiquidation() is "4"
	 */
   public boolean isMsdLiquidation() throws CFException {
      return (  compareChars( getMsdSplitRightInd() , msdLiquidation88Value)  == 0  );
   }


	/**
	*  set values "4"
	*/
   	public void setMsdLiquidationTrue() {  			
    	setMsdSplitRightInd( msdLiquidation88Value);
   	}

	
	
	
	/**
	 * 	initializes Bdms01IncomeSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01IncomeSegSqlcd(0);
         setMsdDividendType(CONSTANTS.SPACE);
         setMsdPaymentFreq(CONSTANTS.SPACE);
          msdCashDivRec1Mmddyycc.initialize();
     
			setMsdCashDivRate1(BigDecimal.ZERO);
          msdCashDivEx1Mmddyycc.initialize();
     
          msdCashDivPay1Mmddyycc.initialize();
     
         setBdms01Cash1RecordDt(CONSTANTS.SPACE_10);
         setBdms01Cash1PaymentDt(CONSTANTS.SPACE_10);
         setBdms01Cash1ExdividendDt(CONSTANTS.SPACE_10);
         setBdms01Cash1FrqncPayCd(CONSTANTS.SPACE_2);
                     setBdms01Cash1DayTkffGnrtQty(0);
         setBdms01Cash1AssetLiqnInd(CONSTANTS.SPACE);
         setBdms01Cash1CurrencyCd(CONSTANTS.SPACE_2);
         setBdms01Cash1VendorCd(CONSTANTS.SPACE_5);
         setBdms01Cash1TypeIncomeCd(CONSTANTS.SPACE_2);
         setBdms01Cash1PayFrctnShrInd(CONSTANTS.SPACE);
          msdCashDivRec2Mmddyycc.initialize();
     
			setMsdCashDivRate2(BigDecimal.ZERO);
          msdCashDivEx2Mmddyycc.initialize();
     
          msdCashDivPay2Mmddyycc.initialize();
     
         setBdms01Cash2RecordDt(CONSTANTS.SPACE_10);
         setBdms01Cash2PaymentDt(CONSTANTS.SPACE_10);
         setBdms01Cash2ExdividendDt(CONSTANTS.SPACE_10);
         setBdms01Cash2FrqncPayCd(CONSTANTS.SPACE_2);
                     setBdms01Cash2DayTkffGnrtQty(0);
         setBdms01Cash2AssetLiqnInd(CONSTANTS.SPACE);
         setBdms01Cash2CurrencyCd(CONSTANTS.SPACE_2);
         setBdms01Cash2VendorCd(CONSTANTS.SPACE_5);
         setBdms01Cash2TypeIncomeCd(CONSTANTS.SPACE_2);
         setBdms01Cash2PayFrctnShrInd(CONSTANTS.SPACE);
          msdStockDivRecMmddyycc.initialize();
     
			setMsdStockDivRate(BigDecimal.ZERO);
          msdStockDivExMmddyycc.initialize();
     
          msdStockDivPayMmddyycc.initialize();
     
         setBdms01StockRecordDt(CONSTANTS.SPACE_10);
         setBdms01StockPaymentDt(CONSTANTS.SPACE_10);
         setBdms01StockExdividendDt(CONSTANTS.SPACE_10);
         setBdms01StockFrqncPayCd(CONSTANTS.SPACE_2);
                     setBdms01StockDayTkffGnrtQty(0);
         setBdms01StockAssetLiqnInd(CONSTANTS.SPACE);
         setBdms01StockCurrencyCd(CONSTANTS.SPACE_2);
         setBdms01StockVendorCd(CONSTANTS.SPACE_5);
         setBdms01StockTypeIncomeCd(CONSTANTS.SPACE_2);
         setBdms01StockPayFrctnShrInd(CONSTANTS.SPACE);
          msdSplitDivRecMmddyycc.initialize();
     
			setMsdSplitDivRate(BigDecimal.ZERO);
          msdSplitDivExMmddyycc.initialize();
     
          msdSplitDivPayMmddyycc.initialize();
     
         setBdms01SplitRecordDt(CONSTANTS.SPACE_10);
         setBdms01SplitPaymentDt(CONSTANTS.SPACE_10);
         setBdms01SplitExdividendDt(CONSTANTS.SPACE_10);
         setBdms01SplitFrqncPayCd(CONSTANTS.SPACE_2);
                     setBdms01SplitDayTkffGnrtQty(0);
         setBdms01SplitAssetLiqnInd(CONSTANTS.SPACE);
         setBdms01SplitCurrencyCd(CONSTANTS.SPACE_2);
         setBdms01SplitVendorCd(CONSTANTS.SPACE_5);
         setBdms01SplitTypeIncomeCd(CONSTANTS.SPACE_2);
         setBdms01SplitPayFrctnShrInd(CONSTANTS.SPACE);
         setMsdSplitRightInd(CONSTANTS.SPACE);
   }

		public static int getBdms01IncomeSegDataFieldLength() {
			return BDMS_01_INCOME_SEG_DATA_LENGTH;
		}

}
  
