package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01BondBasicSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01BondBasicSegData extends Bdms01BondBasicSegDataSerialized { 
   

								private int bdms01BondBasicSegSqlcd;

								private BigDecimal msdBondInterestRate = BigDecimal.ZERO;
				private MsdBondMaturityMmddccyy msdBondMaturityMmddccyy = new MsdBondMaturityMmddccyy();
				private MsdBondCouponMmdd msdBondCouponMmdd = new MsdBondCouponMmdd();

						private char[] bdms01DateCouponCd = Field.fillLowValue(4);
				private MsdBondDatedMmddyycc msdBondDatedMmddyycc = new MsdBondDatedMmddyycc();
				private MsdBondRecordMmddyycc msdBondRecordMmddyycc = new MsdBondRecordMmddyycc();

						private char[] msdBondDatedIndicator = Field.fillLowValue(1);

						private char[] msdStateCode = Field.fillLowValue(2);

						private char[] msdInsuranceCode = Field.fillLowValue(2);

						private char[] bdms01InsJjkCd = Field.fillLowValue(2);

						private char[] msdBondGuaranteedInd = Field.fillLowValue(1);

						private char[] msdBndEvalueCode = Field.fillLowValue(1);
				private MsdBondPayMmddyycc msdBondPayMmddyycc = new MsdBondPayMmddyycc();

						private char[] msdBondActualPayDate = Field.fillLowValue(4);

						private char[] bdms01DatePayActualCd = Field.fillLowValue(4);

								private long msdBondFirstCpnDt;

						private char[] bdms01FrqncRateChgCd = Field.fillLowValue(2);
				private Bdms01FrqncRateChgCdRedefined bdms01FrqncRateChgCdRedefined = new Bdms01FrqncRateChgCdRedefined();

						private char[] bdms01MaturityDt = Field.fillLowValue(10);

						private char[] bdms01AccrueIntDt = Field.fillLowValue(10);

						private char[] bdms01PayInterestDt = Field.fillLowValue(10);

						private char[] bdms01CouponFirstDt = Field.fillLowValue(10);

						private char[] bdms01CalcYldIntCd = Field.fillLowValue(1);

						private char[] bdms01RecordHldEstDt = Field.fillLowValue(10);

						private char[] bdms01PrdLongShortCd = Field.fillLowValue(1);

						private char[] bdms01ExtCallInd = Field.fillLowValue(1);

						private char[] msdExtraordinaryCall = Field.fillLowValue(1);

						private char[] bdms01ChngRateCd = Field.fillLowValue(1);

						private char[] bdms01MuniMultInd = Field.fillLowValue(1);

						private char[] bdms01SbaInd = Field.fillLowValue(1);

						private char[] bdms01TaxExmptBankInd = Field.fillLowValue(1);

						private char[] bdms01StrpdBondInd = Field.fillLowValue(1);

						private char[] bdms01DefaultInd = Field.fillLowValue(1);

						private char[] bdms01SerialBondNbr = Field.fillLowValue(7);

						private char[] bdms01InterestPayCd = Field.fillLowValue(2);

						private char[] bdms01NbrDayPayCd = Field.fillLowValue(4);

						private char[] bdms01CmrlBondCd = Field.fillLowValue(2);

						private char[] bdms01TypeGovtCd = Field.fillLowValue(2);

						private char[] bdms01StateCd = Field.fillLowValue(2);

						private char[] bdms01GovtBackCd = Field.fillLowValue(2);

						private char[] bdms01TypePaperCd = Field.fillLowValue(2);

						private char[] bdms01PymntArreasInd = Field.fillLowValue(1);

						private char[] bdms01RdmptPrtlCd = Field.fillLowValue(2);

						private char[] bdms01OrgnlIntPayDt = Field.fillLowValue(10);

						private char[] bdms01EvltnBondCd = Field.fillLowValue(2);

						private char[] bdms01RefundReasonCd = Field.fillLowValue(2);

						private char[] bdms01CanadaBondInd = Field.fillLowValue(1);

						private char[] bdms01ErbndInd = Field.fillLowValue(1);

						private char[] bdms01CallTypeCd = Field.fillLowValue(2);

						private char[] bdms01TypeMuniCd = Field.fillLowValue(4);

						private char[] bdms01AgencyInd = Field.fillLowValue(1);

						private char[] bdms01TiisInd = Field.fillLowValue(1);

						private char[] bdms01IntCalcnCd = Field.fillLowValue(4);

						private char[] bdms01AstBckdCd = Field.fillLowValue(2);

						private char[] bdms01GnmaSrlNoteInd = Field.fillLowValue(1);

						private char[] bdms01TraceInd = Field.fillLowValue(1);

						private char[] bdms01TbaInd = Field.fillLowValue(1);

								private BigDecimal bdms01MnmmDnmntAmt = BigDecimal.ZERO;

								private int bdms01ClNoticeDaysNbr;

						private char[] bdms01SinkingFundInd = Field.fillLowValue(1);

						private char[] bdms01DefeaseInd = Field.fillLowValue(1);

						private char[] bdms01RvnuInd = Field.fillLowValue(1);

								private BigDecimal bdms01CvrsnRt = BigDecimal.ZERO;

								private BigDecimal bdms01CvrsnPrcAmt = BigDecimal.ZERO;

						private char[] bdms01CvrsnExpDt = Field.fillLowValue(10);

	
	/**
	* Constructor for Bdms01BondBasicSegData
	**/
    public Bdms01BondBasicSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01BondBasicSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01BondBasicSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			msdBondMaturityMmddccyy.setParent(this,getStartOffset() + 15);
	       			msdBondCouponMmdd.setParent(this,getStartOffset() + 23);
	       			msdBondDatedMmddyycc.setParent(this,getStartOffset() + 27);
	       			msdBondRecordMmddyycc.setParent(this,getStartOffset() + 35);
	       			msdBondPayMmddyycc.setParent(this,getStartOffset() + 50);
	       			bdms01FrqncRateChgCdRedefined.setParent(this,getStartOffset() + 68);
    } 

	/**
	 *	Returns the value of bdms01BondBasicSegSqlcd
	 *	@return bdms01BondBasicSegSqlcd
	 */
	public int getBdms01BondBasicSegSqlcd() throws CFException {
       if (isBdms01BondBasicSegSqlcdModified()) { 
           bdms01BondBasicSegSqlcd = refreshBdms01BondBasicSegSqlcd();
        }
   		return bdms01BondBasicSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01BondBasicSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-BOND-BASIC-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01BondBasicSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01BondBasicSegSqlcd = checkBdms01BondBasicSegSqlcdMaxLimit(number); 
		serializeBdms01BondBasicSegSqlcd(bdms01BondBasicSegSqlcd);
	}
	

	public void setBdms01BondBasicSegSqlcd(long number) {
	    number = checkBdms01BondBasicSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01BondBasicSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01BondBasicSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01BondBasicSegSqlcd(char[] value) throws CFException {
		 bdms01BondBasicSegSqlcd = serializeBdms01BondBasicSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01BondBasicSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01BondBasicSegSqlcdString(char[] value) throws CFException {
		 setBdms01BondBasicSegSqlcd(value);
	}
	/**
	 *	Returns the value of msdBondInterestRate
	 *	@return msdBondInterestRate
	 */
	public BigDecimal getMsdBondInterestRate() throws CFException {
       if (isMsdBondInterestRateModified()) { 
           msdBondInterestRate = refreshMsdBondInterestRate();
        }
   		return msdBondInterestRate;
	}
	

	
	   
	/**
	 * 	Update MsdBondInterestRate with the passed number
	 *  Corresponding COBOL Variable is MSD-BOND-INTEREST-RATE
	 *	@param number
	 */
	public void setMsdBondInterestRate(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdBondInterestRate = checkMsdBondInterestRateMaxLimit(number);
	    serializeMsdBondInterestRate(msdBondInterestRate);
   }
	/**
	 * 	Update MsdBondInterestRate with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondInterestRate(char[] value) throws CFException {
		 msdBondInterestRate = serializeMsdBondInterestRate(value);
	}   
	/**
	 *	Returns the value of msdBondMaturityMmddccyy
	 *	@return msdBondMaturityMmddccyy
	 */   
	 public MsdBondMaturityMmddccyy getMsdBondMaturityMmddccyy() {
   	return msdBondMaturityMmddccyy;
   }
   /**
	* 	Update MsdBondMaturityMmddccyy with the passed value
	*   Corresponding COBOL Variable is MSD-BOND-MATURITY-MMDDCCYY
	*	@param value
	*/
   public void setMsdBondMaturityMmddccyy(char[] value) {
      msdBondMaturityMmddccyy.setString(value); 
   }   
    
     /**
	 * 	Update MsdBondMaturityMmddccyy 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdBondMaturityMmddccyy(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdBondMaturityMmddccyy.begin,msdBondMaturityMmddccyy.length());
   }
   
     /**
	 * 	Update MsdBondMaturityMmddccyy 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondMaturityMmddccyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdBondMaturityMmddccyy.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdBondMaturityMmddccyy with another Field
	 *	@param value
	 */
   public void setMsdBondMaturityMmddccyy(Field source) {
   	replace(source,0,source.length(),msdBondMaturityMmddccyy.begin,msdBondMaturityMmddccyy.length());
   }  
   
     /**
	 * 	Update MsdBondMaturityMmddccyy 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdBondMaturityMmddccyy(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdBondMaturityMmddccyy.begin,msdBondMaturityMmddccyy.length());
   }
   
     /**
	 * 	Update MsdBondMaturityMmddccyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondMaturityMmddccyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdBondMaturityMmddccyy.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdBondCouponMmdd
	 *	@return msdBondCouponMmdd
	 */   
	 public MsdBondCouponMmdd getMsdBondCouponMmdd() {
   	return msdBondCouponMmdd;
   }
   /**
	* 	Update MsdBondCouponMmdd with the passed value
	*   Corresponding COBOL Variable is MSD-BOND-COUPON-MMDD
	*	@param value
	*/
   public void setMsdBondCouponMmdd(char[] value) {
      msdBondCouponMmdd.setString(value); 
   }   
    
     /**
	 * 	Update MsdBondCouponMmdd 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdBondCouponMmdd(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdBondCouponMmdd.begin,msdBondCouponMmdd.length());
   }
   
     /**
	 * 	Update MsdBondCouponMmdd 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondCouponMmdd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdBondCouponMmdd.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdBondCouponMmdd with another Field
	 *	@param value
	 */
   public void setMsdBondCouponMmdd(Field source) {
   	replace(source,0,source.length(),msdBondCouponMmdd.begin,msdBondCouponMmdd.length());
   }  
   
     /**
	 * 	Update MsdBondCouponMmdd 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdBondCouponMmdd(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdBondCouponMmdd.begin,msdBondCouponMmdd.length());
   }
   
     /**
	 * 	Update MsdBondCouponMmdd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondCouponMmdd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdBondCouponMmdd.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01DateCouponCd
	 *	@return bdms01DateCouponCd
	 */
   public char[] getBdms01DateCouponCd() throws CFException{
     if (isBdms01DateCouponCdModified()) { 
        bdms01DateCouponCd = refreshBdms01DateCouponCd();
     }
   		return bdms01DateCouponCd;
   }

  
	/**
	*  set variable bdms01DateCouponCd
	*  Corresponding COBOL Variable is BDMS01-DATE-COUPON-CD
	*  @param value
	**/
   public void setBdms01DateCouponCd(char[] value) {
      bdms01DateCouponCd = checkBdms01DateCouponCdConstraints(value);
      serializeBdms01DateCouponCd(bdms01DateCouponCd);
   } 

     /**
	 * 	Update Bdms01DateCouponCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01DateCouponCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01DateCouponCd,bdms01DateCouponCd.length);
   	
   }
   
   public void setBdms01DateCouponCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DateCouponCd,bdms01DateCouponCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01DateCouponCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DateCouponCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DateCouponCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01DateCouponCd with another Field
	 *	@param value
	 */
   public void setBdms01DateCouponCd(Field source) {
       replace(source,0,source.length(),beginBdms01DateCouponCd,BDMS_01_DATE_COUPON_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01DateCouponCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01DateCouponCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01DateCouponCd,BDMS_01_DATE_COUPON_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01DateCouponCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DateCouponCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DateCouponCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdBondDatedMmddyycc
	 *	@return msdBondDatedMmddyycc
	 */   
	 public MsdBondDatedMmddyycc getMsdBondDatedMmddyycc() {
   	return msdBondDatedMmddyycc;
   }
   /**
	* 	Update MsdBondDatedMmddyycc with the passed value
	*   Corresponding COBOL Variable is MSD-BOND-DATED-MMDDYYCC
	*	@param value
	*/
   public void setMsdBondDatedMmddyycc(char[] value) {
      msdBondDatedMmddyycc.setString(value); 
   }   
    
     /**
	 * 	Update MsdBondDatedMmddyycc 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdBondDatedMmddyycc(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdBondDatedMmddyycc.begin,msdBondDatedMmddyycc.length());
   }
   
     /**
	 * 	Update MsdBondDatedMmddyycc 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondDatedMmddyycc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdBondDatedMmddyycc.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdBondDatedMmddyycc with another Field
	 *	@param value
	 */
   public void setMsdBondDatedMmddyycc(Field source) {
   	replace(source,0,source.length(),msdBondDatedMmddyycc.begin,msdBondDatedMmddyycc.length());
   }  
   
     /**
	 * 	Update MsdBondDatedMmddyycc 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdBondDatedMmddyycc(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdBondDatedMmddyycc.begin,msdBondDatedMmddyycc.length());
   }
   
     /**
	 * 	Update MsdBondDatedMmddyycc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondDatedMmddyycc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdBondDatedMmddyycc.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdBondRecordMmddyycc
	 *	@return msdBondRecordMmddyycc
	 */   
	 public MsdBondRecordMmddyycc getMsdBondRecordMmddyycc() {
   	return msdBondRecordMmddyycc;
   }
   /**
	* 	Update MsdBondRecordMmddyycc with the passed value
	*   Corresponding COBOL Variable is MSD-BOND-RECORD-MMDDYYCC
	*	@param value
	*/
   public void setMsdBondRecordMmddyycc(char[] value) {
      msdBondRecordMmddyycc.setString(value); 
   }   
    
     /**
	 * 	Update MsdBondRecordMmddyycc 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdBondRecordMmddyycc(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdBondRecordMmddyycc.begin,msdBondRecordMmddyycc.length());
   }
   
     /**
	 * 	Update MsdBondRecordMmddyycc 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondRecordMmddyycc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdBondRecordMmddyycc.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdBondRecordMmddyycc with another Field
	 *	@param value
	 */
   public void setMsdBondRecordMmddyycc(Field source) {
   	replace(source,0,source.length(),msdBondRecordMmddyycc.begin,msdBondRecordMmddyycc.length());
   }  
   
     /**
	 * 	Update MsdBondRecordMmddyycc 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdBondRecordMmddyycc(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdBondRecordMmddyycc.begin,msdBondRecordMmddyycc.length());
   }
   
     /**
	 * 	Update MsdBondRecordMmddyycc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondRecordMmddyycc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdBondRecordMmddyycc.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdBondDatedIndicator
	 *	@return msdBondDatedIndicator
	 */
   public char[] getMsdBondDatedIndicator() throws CFException{
     if (isMsdBondDatedIndicatorModified()) { 
        msdBondDatedIndicator = refreshMsdBondDatedIndicator();
     }
   		return msdBondDatedIndicator;
   }

  
	/**
	*  set variable msdBondDatedIndicator
	*  Corresponding COBOL Variable is MSD-BOND-DATED-INDICATOR
	*  @param value
	**/
   public void setMsdBondDatedIndicator(char[] value) {
      msdBondDatedIndicator = checkMsdBondDatedIndicatorConstraints(value);
      serializeMsdBondDatedIndicator(msdBondDatedIndicator);
   } 

     /**
	 * 	Update MsdBondDatedIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdBondDatedIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdBondDatedIndicator,msdBondDatedIndicator.length);
   	
   }
   
   public void setMsdBondDatedIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBondDatedIndicator,msdBondDatedIndicator.length);
   	
   }
   
     /**
	 * 	Update MsdBondDatedIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondDatedIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBondDatedIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdBondDatedIndicator with another Field
	 *	@param value
	 */
   public void setMsdBondDatedIndicator(Field source) {
       replace(source,0,source.length(),beginMsdBondDatedIndicator,MSD_BOND_DATED_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update MsdBondDatedIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdBondDatedIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdBondDatedIndicator,MSD_BOND_DATED_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update MsdBondDatedIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondDatedIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBondDatedIndicator+targetIndex,targetLen);
    
   }
	char[] msdNotDated88Value = fillZeroes(1);
	/**
	 *	Test condition "0" for isMsdNotDated()
	 *	@return  Returns true if isMsdNotDated() is "0"
	 */
   public boolean isMsdNotDated() throws CFException {
      return (  compareChars( getMsdBondDatedIndicator() , msdNotDated88Value)  == 0  );
   }


	/**
	*  set values "0"
	*/
   	public void setMsdNotDatedTrue() {  			
    	setMsdBondDatedIndicator( msdNotDated88Value);
   	}
	char[] msdLongDate88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isMsdLongDate()
	 *	@return  Returns true if isMsdLongDate() is "1"
	 */
   public boolean isMsdLongDate() throws CFException {
      return (  compareChars( getMsdBondDatedIndicator() , msdLongDate88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setMsdLongDateTrue() {  			
    	setMsdBondDatedIndicator( msdLongDate88Value);
   	}
	char[] msdShortDate88Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isMsdShortDate()
	 *	@return  Returns true if isMsdShortDate() is "2"
	 */
   public boolean isMsdShortDate() throws CFException {
      return (  compareChars( getMsdBondDatedIndicator() , msdShortDate88Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setMsdShortDateTrue() {  			
    	setMsdBondDatedIndicator( msdShortDate88Value);
   	}
	char[] msdIssueDate88Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isMsdIssueDate()
	 *	@return  Returns true if isMsdIssueDate() is "3"
	 */
   public boolean isMsdIssueDate() throws CFException {
      return (  compareChars( getMsdBondDatedIndicator() , msdIssueDate88Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setMsdIssueDateTrue() {  			
    	setMsdBondDatedIndicator( msdIssueDate88Value);
   	}
	/**
	 *	Returns the value of msdStateCode
	 *	@return msdStateCode
	 */
   public char[] getMsdStateCode() throws CFException{
     if (isMsdStateCodeModified()) { 
        msdStateCode = refreshMsdStateCode();
     }
   		return msdStateCode;
   }

  
	/**
	*  set variable msdStateCode
	*  Corresponding COBOL Variable is MSD-STATE-CODE
	*  @param value
	**/
   public void setMsdStateCode(char[] value) {
      msdStateCode = checkMsdStateCodeConstraints(value);
      serializeMsdStateCode(msdStateCode);
   } 

     /**
	 * 	Update MsdStateCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdStateCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdStateCode,msdStateCode.length);
   	
   }
   
   public void setMsdStateCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdStateCode,msdStateCode.length);
   	
   }
   
     /**
	 * 	Update MsdStateCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdStateCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdStateCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdStateCode with another Field
	 *	@param value
	 */
   public void setMsdStateCode(Field source) {
       replace(source,0,source.length(),beginMsdStateCode,MSD_STATE_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update MsdStateCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdStateCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdStateCode,MSD_STATE_CODE_LEN);
   	
   }
   
     /**
	 * 	Update MsdStateCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdStateCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdStateCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdInsuranceCode
	 *	@return msdInsuranceCode
	 */
   public char[] getMsdInsuranceCode() throws CFException{
     if (isMsdInsuranceCodeModified()) { 
        msdInsuranceCode = refreshMsdInsuranceCode();
     }
   		return msdInsuranceCode;
   }

  
	/**
	*  set variable msdInsuranceCode
	*  Corresponding COBOL Variable is MSD-INSURANCE-CODE
	*  @param value
	**/
   public void setMsdInsuranceCode(char[] value) {
      msdInsuranceCode = checkMsdInsuranceCodeConstraints(value);
      serializeMsdInsuranceCode(msdInsuranceCode);
   } 

     /**
	 * 	Update MsdInsuranceCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdInsuranceCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdInsuranceCode,msdInsuranceCode.length);
   	
   }
   
   public void setMsdInsuranceCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdInsuranceCode,msdInsuranceCode.length);
   	
   }
   
     /**
	 * 	Update MsdInsuranceCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdInsuranceCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdInsuranceCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdInsuranceCode with another Field
	 *	@param value
	 */
   public void setMsdInsuranceCode(Field source) {
       replace(source,0,source.length(),beginMsdInsuranceCode,MSD_INSURANCE_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update MsdInsuranceCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdInsuranceCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdInsuranceCode,MSD_INSURANCE_CODE_LEN);
   	
   }
   
     /**
	 * 	Update MsdInsuranceCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdInsuranceCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdInsuranceCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01InsJjkCd
	 *	@return bdms01InsJjkCd
	 */
   public char[] getBdms01InsJjkCd() throws CFException{
     if (isBdms01InsJjkCdModified()) { 
        bdms01InsJjkCd = refreshBdms01InsJjkCd();
     }
   		return bdms01InsJjkCd;
   }

  
	/**
	*  set variable bdms01InsJjkCd
	*  Corresponding COBOL Variable is BDMS01-INS-JJK-CD
	*  @param value
	**/
   public void setBdms01InsJjkCd(char[] value) {
      bdms01InsJjkCd = checkBdms01InsJjkCdConstraints(value);
      serializeBdms01InsJjkCd(bdms01InsJjkCd);
   } 

     /**
	 * 	Update Bdms01InsJjkCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01InsJjkCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01InsJjkCd,bdms01InsJjkCd.length);
   	
   }
   
   public void setBdms01InsJjkCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01InsJjkCd,bdms01InsJjkCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01InsJjkCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01InsJjkCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01InsJjkCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01InsJjkCd with another Field
	 *	@param value
	 */
   public void setBdms01InsJjkCd(Field source) {
       replace(source,0,source.length(),beginBdms01InsJjkCd,BDMS_01_INS_JJK_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01InsJjkCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01InsJjkCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01InsJjkCd,BDMS_01_INS_JJK_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01InsJjkCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01InsJjkCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01InsJjkCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdBondGuaranteedInd
	 *	@return msdBondGuaranteedInd
	 */
   public char[] getMsdBondGuaranteedInd() throws CFException{
     if (isMsdBondGuaranteedIndModified()) { 
        msdBondGuaranteedInd = refreshMsdBondGuaranteedInd();
     }
   		return msdBondGuaranteedInd;
   }

  
	/**
	*  set variable msdBondGuaranteedInd
	*  Corresponding COBOL Variable is MSD-BOND-GUARANTEED-IND
	*  @param value
	**/
   public void setMsdBondGuaranteedInd(char[] value) {
      msdBondGuaranteedInd = checkMsdBondGuaranteedIndConstraints(value);
      serializeMsdBondGuaranteedInd(msdBondGuaranteedInd);
   } 

     /**
	 * 	Update MsdBondGuaranteedInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdBondGuaranteedInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdBondGuaranteedInd,msdBondGuaranteedInd.length);
   	
   }
   
   public void setMsdBondGuaranteedInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBondGuaranteedInd,msdBondGuaranteedInd.length);
   	
   }
   
     /**
	 * 	Update MsdBondGuaranteedInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondGuaranteedInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBondGuaranteedInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdBondGuaranteedInd with another Field
	 *	@param value
	 */
   public void setMsdBondGuaranteedInd(Field source) {
       replace(source,0,source.length(),beginMsdBondGuaranteedInd,MSD_BOND_GUARANTEED_IND_LEN);
   	
   }  
   
     /**
	 * 	Update MsdBondGuaranteedInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdBondGuaranteedInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdBondGuaranteedInd,MSD_BOND_GUARANTEED_IND_LEN);
   	
   }
   
     /**
	 * 	Update MsdBondGuaranteedInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondGuaranteedInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBondGuaranteedInd+targetIndex,targetLen);
    
   }
	char[] msdFederal88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isMsdFederal()
	 *	@return  Returns true if isMsdFederal() is "1"
	 */
   public boolean isMsdFederal() throws CFException {
      return (  compareChars( getMsdBondGuaranteedInd() , msdFederal88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setMsdFederalTrue() {  			
    	setMsdBondGuaranteedInd( msdFederal88Value);
   	}
	char[] msdProvincial88Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isMsdProvincial()
	 *	@return  Returns true if isMsdProvincial() is "2"
	 */
   public boolean isMsdProvincial() throws CFException {
      return (  compareChars( getMsdBondGuaranteedInd() , msdProvincial88Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setMsdProvincialTrue() {  			
    	setMsdBondGuaranteedInd( msdProvincial88Value);
   	}
	char[] msdLocal88Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isMsdLocal()
	 *	@return  Returns true if isMsdLocal() is "3"
	 */
   public boolean isMsdLocal() throws CFException {
      return (  compareChars( getMsdBondGuaranteedInd() , msdLocal88Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setMsdLocalTrue() {  			
    	setMsdBondGuaranteedInd( msdLocal88Value);
   	}
	/**
	 *	Returns the value of msdBndEvalueCode
	 *	@return msdBndEvalueCode
	 */
   public char[] getMsdBndEvalueCode() throws CFException{
     if (isMsdBndEvalueCodeModified()) { 
        msdBndEvalueCode = refreshMsdBndEvalueCode();
     }
   		return msdBndEvalueCode;
   }

  
	/**
	*  set variable msdBndEvalueCode
	*  Corresponding COBOL Variable is MSD-BND-EVALUE-CODE
	*  @param value
	**/
   public void setMsdBndEvalueCode(char[] value) {
      msdBndEvalueCode = checkMsdBndEvalueCodeConstraints(value);
      serializeMsdBndEvalueCode(msdBndEvalueCode);
   } 

     /**
	 * 	Update MsdBndEvalueCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdBndEvalueCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdBndEvalueCode,msdBndEvalueCode.length);
   	
   }
   
   public void setMsdBndEvalueCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBndEvalueCode,msdBndEvalueCode.length);
   	
   }
   
     /**
	 * 	Update MsdBndEvalueCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdBndEvalueCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBndEvalueCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdBndEvalueCode with another Field
	 *	@param value
	 */
   public void setMsdBndEvalueCode(Field source) {
       replace(source,0,source.length(),beginMsdBndEvalueCode,MSD_BND_EVALUE_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update MsdBndEvalueCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdBndEvalueCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdBndEvalueCode,MSD_BND_EVALUE_CODE_LEN);
   	
   }
   
     /**
	 * 	Update MsdBndEvalueCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdBndEvalueCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBndEvalueCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdBondPayMmddyycc
	 *	@return msdBondPayMmddyycc
	 */   
	 public MsdBondPayMmddyycc getMsdBondPayMmddyycc() {
   	return msdBondPayMmddyycc;
   }
   /**
	* 	Update MsdBondPayMmddyycc with the passed value
	*   Corresponding COBOL Variable is MSD-BOND-PAY-MMDDYYCC
	*	@param value
	*/
   public void setMsdBondPayMmddyycc(char[] value) {
      msdBondPayMmddyycc.setString(value); 
   }   
    
     /**
	 * 	Update MsdBondPayMmddyycc 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdBondPayMmddyycc(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdBondPayMmddyycc.begin,msdBondPayMmddyycc.length());
   }
   
     /**
	 * 	Update MsdBondPayMmddyycc 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondPayMmddyycc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdBondPayMmddyycc.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdBondPayMmddyycc with another Field
	 *	@param value
	 */
   public void setMsdBondPayMmddyycc(Field source) {
   	replace(source,0,source.length(),msdBondPayMmddyycc.begin,msdBondPayMmddyycc.length());
   }  
   
     /**
	 * 	Update MsdBondPayMmddyycc 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdBondPayMmddyycc(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdBondPayMmddyycc.begin,msdBondPayMmddyycc.length());
   }
   
     /**
	 * 	Update MsdBondPayMmddyycc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondPayMmddyycc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdBondPayMmddyycc.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdBondActualPayDate
	 *	@return msdBondActualPayDate
	 */
   public char[] getMsdBondActualPayDate() throws CFException{
     if (isMsdBondActualPayDateModified()) { 
        msdBondActualPayDate = refreshMsdBondActualPayDate();
     }
   		return msdBondActualPayDate;
   }

  
	/**
	*  set variable msdBondActualPayDate
	*  Corresponding COBOL Variable is MSD-BOND-ACTUAL-PAY-DATE
	*  @param value
	**/
   public void setMsdBondActualPayDate(char[] value) {
      msdBondActualPayDate = checkMsdBondActualPayDateConstraints(value);
      serializeMsdBondActualPayDate(msdBondActualPayDate);
   } 

     /**
	 * 	Update MsdBondActualPayDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdBondActualPayDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdBondActualPayDate,msdBondActualPayDate.length);
   	
   }
   
   public void setMsdBondActualPayDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBondActualPayDate,msdBondActualPayDate.length);
   	
   }
   
     /**
	 * 	Update MsdBondActualPayDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondActualPayDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBondActualPayDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdBondActualPayDate with another Field
	 *	@param value
	 */
   public void setMsdBondActualPayDate(Field source) {
       replace(source,0,source.length(),beginMsdBondActualPayDate,MSD_BOND_ACTUAL_PAY_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update MsdBondActualPayDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdBondActualPayDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdBondActualPayDate,MSD_BOND_ACTUAL_PAY_DATE_LEN);
   	
   }
   
     /**
	 * 	Update MsdBondActualPayDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondActualPayDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBondActualPayDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01DatePayActualCd
	 *	@return bdms01DatePayActualCd
	 */
   public char[] getBdms01DatePayActualCd() throws CFException{
     if (isBdms01DatePayActualCdModified()) { 
        bdms01DatePayActualCd = refreshBdms01DatePayActualCd();
     }
   		return bdms01DatePayActualCd;
   }

  
	/**
	*  set variable bdms01DatePayActualCd
	*  Corresponding COBOL Variable is BDMS01-DATE-PAY-ACTUAL-CD
	*  @param value
	**/
   public void setBdms01DatePayActualCd(char[] value) {
      bdms01DatePayActualCd = checkBdms01DatePayActualCdConstraints(value);
      serializeBdms01DatePayActualCd(bdms01DatePayActualCd);
   } 

     /**
	 * 	Update Bdms01DatePayActualCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01DatePayActualCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01DatePayActualCd,bdms01DatePayActualCd.length);
   	
   }
   
   public void setBdms01DatePayActualCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DatePayActualCd,bdms01DatePayActualCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01DatePayActualCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DatePayActualCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DatePayActualCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01DatePayActualCd with another Field
	 *	@param value
	 */
   public void setBdms01DatePayActualCd(Field source) {
       replace(source,0,source.length(),beginBdms01DatePayActualCd,BDMS_01_DATE_PAY_ACTUAL_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01DatePayActualCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01DatePayActualCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01DatePayActualCd,BDMS_01_DATE_PAY_ACTUAL_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01DatePayActualCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DatePayActualCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DatePayActualCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdBondFirstCpnDt
	 *	@return msdBondFirstCpnDt
	 */
	public long getMsdBondFirstCpnDt() throws CFException {
       if (isMsdBondFirstCpnDtModified()) { 
           msdBondFirstCpnDt = refreshMsdBondFirstCpnDt();
        }
   		return msdBondFirstCpnDt;
	}
	

	
	   
	/**
	 * 	Update MsdBondFirstCpnDt with the passed value
	 *  Corresponding COBOL Variable is MSD-BOND-FIRST-CPN-DT
	 *	@param number
	 */
	public void setMsdBondFirstCpnDt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBondFirstCpnDt = checkMsdBondFirstCpnDtMaxLimit(number); 
		serializeMsdBondFirstCpnDt(msdBondFirstCpnDt);
	}
	

	/**
	 * 	Update MsdBondFirstCpnDt with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondFirstCpnDt(char[] value) throws CFException {
		 msdBondFirstCpnDt = serializeMsdBondFirstCpnDt(value);
	}
	/**
	 * 	Update MsdBondFirstCpnDt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBondFirstCpnDtString(char[] value) throws CFException {
		 setMsdBondFirstCpnDt(value);
	}
	/**
	 *	Returns the value of bdms01FrqncRateChgCd
	 *	@return bdms01FrqncRateChgCd
	 */
   public char[] getBdms01FrqncRateChgCd() throws CFException{
     if (isBdms01FrqncRateChgCdModified()) { 
        bdms01FrqncRateChgCd = refreshBdms01FrqncRateChgCd();
     }
   		return bdms01FrqncRateChgCd;
   }

  
	/**
	*  set variable bdms01FrqncRateChgCd
	*  Corresponding COBOL Variable is BDMS01-FRQNC-RATE-CHG-CD
	*  @param value
	**/
   public void setBdms01FrqncRateChgCd(char[] value) {
      bdms01FrqncRateChgCd = checkBdms01FrqncRateChgCdConstraints(value);
      serializeBdms01FrqncRateChgCd(bdms01FrqncRateChgCd);
   } 

     /**
	 * 	Update Bdms01FrqncRateChgCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01FrqncRateChgCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01FrqncRateChgCd,bdms01FrqncRateChgCd.length);
   	
   }
   
   public void setBdms01FrqncRateChgCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FrqncRateChgCd,bdms01FrqncRateChgCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01FrqncRateChgCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FrqncRateChgCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FrqncRateChgCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01FrqncRateChgCd with another Field
	 *	@param value
	 */
   public void setBdms01FrqncRateChgCd(Field source) {
       replace(source,0,source.length(),beginBdms01FrqncRateChgCd,BDMS_01_FRQNC_RATE_CHG_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01FrqncRateChgCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01FrqncRateChgCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01FrqncRateChgCd,BDMS_01_FRQNC_RATE_CHG_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01FrqncRateChgCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FrqncRateChgCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FrqncRateChgCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01FrqncRateChgCdRedefined
	 *	@return bdms01FrqncRateChgCdRedefined
	 */   
	 public Bdms01FrqncRateChgCdRedefined getBdms01FrqncRateChgCdRedefined() {
   	return bdms01FrqncRateChgCdRedefined;
   }
   /**
	* 	Update Bdms01FrqncRateChgCdRedefined with the passed value
	*   Corresponding COBOL Variable is BDMS01-FRQNC-RATE-CHG-CD-REDEFINED
	*	@param value
	*/
   public void setBdms01FrqncRateChgCdRedefined(char[] value) {
      bdms01FrqncRateChgCdRedefined.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01FrqncRateChgCdRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01FrqncRateChgCdRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01FrqncRateChgCdRedefined.begin,bdms01FrqncRateChgCdRedefined.length());
   }
   
     /**
	 * 	Update Bdms01FrqncRateChgCdRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FrqncRateChgCdRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01FrqncRateChgCdRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01FrqncRateChgCdRedefined with another Field
	 *	@param value
	 */
   public void setBdms01FrqncRateChgCdRedefined(Field source) {
   	replace(source,0,source.length(),bdms01FrqncRateChgCdRedefined.begin,bdms01FrqncRateChgCdRedefined.length());
   }  
   
     /**
	 * 	Update Bdms01FrqncRateChgCdRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01FrqncRateChgCdRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01FrqncRateChgCdRedefined.begin,bdms01FrqncRateChgCdRedefined.length());
   }
   
     /**
	 * 	Update Bdms01FrqncRateChgCdRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FrqncRateChgCdRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01FrqncRateChgCdRedefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01MaturityDt
	 *	@return bdms01MaturityDt
	 */
   public char[] getBdms01MaturityDt() throws CFException{
     if (isBdms01MaturityDtModified()) { 
        bdms01MaturityDt = refreshBdms01MaturityDt();
     }
   		return bdms01MaturityDt;
   }

  
	/**
	*  set variable bdms01MaturityDt
	*  Corresponding COBOL Variable is BDMS01-MATURITY-DT
	*  @param value
	**/
   public void setBdms01MaturityDt(char[] value) {
      bdms01MaturityDt = checkBdms01MaturityDtConstraints(value);
      serializeBdms01MaturityDt(bdms01MaturityDt);
   } 

     /**
	 * 	Update Bdms01MaturityDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01MaturityDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01MaturityDt,bdms01MaturityDt.length);
   	
   }
   
   public void setBdms01MaturityDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MaturityDt,bdms01MaturityDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01MaturityDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MaturityDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MaturityDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01MaturityDt with another Field
	 *	@param value
	 */
   public void setBdms01MaturityDt(Field source) {
       replace(source,0,source.length(),beginBdms01MaturityDt,BDMS_01_MATURITY_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01MaturityDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01MaturityDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01MaturityDt,BDMS_01_MATURITY_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01MaturityDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MaturityDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MaturityDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01AccrueIntDt
	 *	@return bdms01AccrueIntDt
	 */
   public char[] getBdms01AccrueIntDt() throws CFException{
     if (isBdms01AccrueIntDtModified()) { 
        bdms01AccrueIntDt = refreshBdms01AccrueIntDt();
     }
   		return bdms01AccrueIntDt;
   }

  
	/**
	*  set variable bdms01AccrueIntDt
	*  Corresponding COBOL Variable is BDMS01-ACCRUE-INT-DT
	*  @param value
	**/
   public void setBdms01AccrueIntDt(char[] value) {
      bdms01AccrueIntDt = checkBdms01AccrueIntDtConstraints(value);
      serializeBdms01AccrueIntDt(bdms01AccrueIntDt);
   } 

     /**
	 * 	Update Bdms01AccrueIntDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01AccrueIntDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01AccrueIntDt,bdms01AccrueIntDt.length);
   	
   }
   
   public void setBdms01AccrueIntDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AccrueIntDt,bdms01AccrueIntDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01AccrueIntDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AccrueIntDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AccrueIntDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01AccrueIntDt with another Field
	 *	@param value
	 */
   public void setBdms01AccrueIntDt(Field source) {
       replace(source,0,source.length(),beginBdms01AccrueIntDt,BDMS_01_ACCRUE_INT_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01AccrueIntDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01AccrueIntDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01AccrueIntDt,BDMS_01_ACCRUE_INT_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01AccrueIntDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AccrueIntDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AccrueIntDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PayInterestDt
	 *	@return bdms01PayInterestDt
	 */
   public char[] getBdms01PayInterestDt() throws CFException{
     if (isBdms01PayInterestDtModified()) { 
        bdms01PayInterestDt = refreshBdms01PayInterestDt();
     }
   		return bdms01PayInterestDt;
   }

  
	/**
	*  set variable bdms01PayInterestDt
	*  Corresponding COBOL Variable is BDMS01-PAY-INTEREST-DT
	*  @param value
	**/
   public void setBdms01PayInterestDt(char[] value) {
      bdms01PayInterestDt = checkBdms01PayInterestDtConstraints(value);
      serializeBdms01PayInterestDt(bdms01PayInterestDt);
   } 

     /**
	 * 	Update Bdms01PayInterestDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PayInterestDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PayInterestDt,bdms01PayInterestDt.length);
   	
   }
   
   public void setBdms01PayInterestDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PayInterestDt,bdms01PayInterestDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01PayInterestDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PayInterestDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PayInterestDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PayInterestDt with another Field
	 *	@param value
	 */
   public void setBdms01PayInterestDt(Field source) {
       replace(source,0,source.length(),beginBdms01PayInterestDt,BDMS_01_PAY_INTEREST_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PayInterestDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PayInterestDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PayInterestDt,BDMS_01_PAY_INTEREST_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PayInterestDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PayInterestDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PayInterestDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CouponFirstDt
	 *	@return bdms01CouponFirstDt
	 */
   public char[] getBdms01CouponFirstDt() throws CFException{
     if (isBdms01CouponFirstDtModified()) { 
        bdms01CouponFirstDt = refreshBdms01CouponFirstDt();
     }
   		return bdms01CouponFirstDt;
   }

  
	/**
	*  set variable bdms01CouponFirstDt
	*  Corresponding COBOL Variable is BDMS01-COUPON-FIRST-DT
	*  @param value
	**/
   public void setBdms01CouponFirstDt(char[] value) {
      bdms01CouponFirstDt = checkBdms01CouponFirstDtConstraints(value);
      serializeBdms01CouponFirstDt(bdms01CouponFirstDt);
   } 

     /**
	 * 	Update Bdms01CouponFirstDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CouponFirstDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CouponFirstDt,bdms01CouponFirstDt.length);
   	
   }
   
   public void setBdms01CouponFirstDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CouponFirstDt,bdms01CouponFirstDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01CouponFirstDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CouponFirstDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CouponFirstDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CouponFirstDt with another Field
	 *	@param value
	 */
   public void setBdms01CouponFirstDt(Field source) {
       replace(source,0,source.length(),beginBdms01CouponFirstDt,BDMS_01_COUPON_FIRST_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CouponFirstDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CouponFirstDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CouponFirstDt,BDMS_01_COUPON_FIRST_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CouponFirstDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CouponFirstDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CouponFirstDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CalcYldIntCd
	 *	@return bdms01CalcYldIntCd
	 */
   public char[] getBdms01CalcYldIntCd() throws CFException{
     if (isBdms01CalcYldIntCdModified()) { 
        bdms01CalcYldIntCd = refreshBdms01CalcYldIntCd();
     }
   		return bdms01CalcYldIntCd;
   }

  
	/**
	*  set variable bdms01CalcYldIntCd
	*  Corresponding COBOL Variable is BDMS01-CALC-YLD-INT-CD
	*  @param value
	**/
   public void setBdms01CalcYldIntCd(char[] value) {
      bdms01CalcYldIntCd = checkBdms01CalcYldIntCdConstraints(value);
      serializeBdms01CalcYldIntCd(bdms01CalcYldIntCd);
   } 

     /**
	 * 	Update Bdms01CalcYldIntCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CalcYldIntCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CalcYldIntCd,bdms01CalcYldIntCd.length);
   	
   }
   
   public void setBdms01CalcYldIntCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CalcYldIntCd,bdms01CalcYldIntCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CalcYldIntCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CalcYldIntCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CalcYldIntCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CalcYldIntCd with another Field
	 *	@param value
	 */
   public void setBdms01CalcYldIntCd(Field source) {
       replace(source,0,source.length(),beginBdms01CalcYldIntCd,BDMS_01_CALC_YLD_INT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CalcYldIntCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CalcYldIntCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CalcYldIntCd,BDMS_01_CALC_YLD_INT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CalcYldIntCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CalcYldIntCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CalcYldIntCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RecordHldEstDt
	 *	@return bdms01RecordHldEstDt
	 */
   public char[] getBdms01RecordHldEstDt() throws CFException{
     if (isBdms01RecordHldEstDtModified()) { 
        bdms01RecordHldEstDt = refreshBdms01RecordHldEstDt();
     }
   		return bdms01RecordHldEstDt;
   }

  
	/**
	*  set variable bdms01RecordHldEstDt
	*  Corresponding COBOL Variable is BDMS01-RECORD-HLD-EST-DT
	*  @param value
	**/
   public void setBdms01RecordHldEstDt(char[] value) {
      bdms01RecordHldEstDt = checkBdms01RecordHldEstDtConstraints(value);
      serializeBdms01RecordHldEstDt(bdms01RecordHldEstDt);
   } 

     /**
	 * 	Update Bdms01RecordHldEstDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RecordHldEstDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RecordHldEstDt,bdms01RecordHldEstDt.length);
   	
   }
   
   public void setBdms01RecordHldEstDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RecordHldEstDt,bdms01RecordHldEstDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01RecordHldEstDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RecordHldEstDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RecordHldEstDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RecordHldEstDt with another Field
	 *	@param value
	 */
   public void setBdms01RecordHldEstDt(Field source) {
       replace(source,0,source.length(),beginBdms01RecordHldEstDt,BDMS_01_RECORD_HLD_EST_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RecordHldEstDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RecordHldEstDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RecordHldEstDt,BDMS_01_RECORD_HLD_EST_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RecordHldEstDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RecordHldEstDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RecordHldEstDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PrdLongShortCd
	 *	@return bdms01PrdLongShortCd
	 */
   public char[] getBdms01PrdLongShortCd() throws CFException{
     if (isBdms01PrdLongShortCdModified()) { 
        bdms01PrdLongShortCd = refreshBdms01PrdLongShortCd();
     }
   		return bdms01PrdLongShortCd;
   }

  
	/**
	*  set variable bdms01PrdLongShortCd
	*  Corresponding COBOL Variable is BDMS01-PRD-LONG-SHORT-CD
	*  @param value
	**/
   public void setBdms01PrdLongShortCd(char[] value) {
      bdms01PrdLongShortCd = checkBdms01PrdLongShortCdConstraints(value);
      serializeBdms01PrdLongShortCd(bdms01PrdLongShortCd);
   } 

     /**
	 * 	Update Bdms01PrdLongShortCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PrdLongShortCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PrdLongShortCd,bdms01PrdLongShortCd.length);
   	
   }
   
   public void setBdms01PrdLongShortCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrdLongShortCd,bdms01PrdLongShortCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PrdLongShortCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrdLongShortCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrdLongShortCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PrdLongShortCd with another Field
	 *	@param value
	 */
   public void setBdms01PrdLongShortCd(Field source) {
       replace(source,0,source.length(),beginBdms01PrdLongShortCd,BDMS_01_PRD_LONG_SHORT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PrdLongShortCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PrdLongShortCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PrdLongShortCd,BDMS_01_PRD_LONG_SHORT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PrdLongShortCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrdLongShortCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrdLongShortCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ExtCallInd
	 *	@return bdms01ExtCallInd
	 */
   public char[] getBdms01ExtCallInd() throws CFException{
     if (isBdms01ExtCallIndModified()) { 
        bdms01ExtCallInd = refreshBdms01ExtCallInd();
     }
   		return bdms01ExtCallInd;
   }

  
	/**
	*  set variable bdms01ExtCallInd
	*  Corresponding COBOL Variable is BDMS01-EXT-CALL-IND
	*  @param value
	**/
   public void setBdms01ExtCallInd(char[] value) {
      bdms01ExtCallInd = checkBdms01ExtCallIndConstraints(value);
      serializeBdms01ExtCallInd(bdms01ExtCallInd);
   } 

     /**
	 * 	Update Bdms01ExtCallInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ExtCallInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ExtCallInd,bdms01ExtCallInd.length);
   	
   }
   
   public void setBdms01ExtCallInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ExtCallInd,bdms01ExtCallInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01ExtCallInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ExtCallInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ExtCallInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ExtCallInd with another Field
	 *	@param value
	 */
   public void setBdms01ExtCallInd(Field source) {
       replace(source,0,source.length(),beginBdms01ExtCallInd,BDMS_01_EXT_CALL_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ExtCallInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ExtCallInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ExtCallInd,BDMS_01_EXT_CALL_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ExtCallInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ExtCallInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ExtCallInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdExtraordinaryCall
	 *	@return msdExtraordinaryCall
	 */
   public char[] getMsdExtraordinaryCall() throws CFException{
     if (isMsdExtraordinaryCallModified()) { 
        msdExtraordinaryCall = refreshMsdExtraordinaryCall();
     }
   		return msdExtraordinaryCall;
   }

  
	/**
	*  set variable msdExtraordinaryCall
	*  Corresponding COBOL Variable is MSD-EXTRAORDINARY-CALL
	*  @param value
	**/
   public void setMsdExtraordinaryCall(char[] value) {
      msdExtraordinaryCall = checkMsdExtraordinaryCallConstraints(value);
      serializeMsdExtraordinaryCall(msdExtraordinaryCall);
   } 

     /**
	 * 	Update MsdExtraordinaryCall 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdExtraordinaryCall(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdExtraordinaryCall,msdExtraordinaryCall.length);
   	
   }
   
   public void setMsdExtraordinaryCall(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdExtraordinaryCall,msdExtraordinaryCall.length);
   	
   }
   
     /**
	 * 	Update MsdExtraordinaryCall 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdExtraordinaryCall(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdExtraordinaryCall+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdExtraordinaryCall with another Field
	 *	@param value
	 */
   public void setMsdExtraordinaryCall(Field source) {
       replace(source,0,source.length(),beginMsdExtraordinaryCall,MSD_EXTRAORDINARY_CALL_LEN);
   	
   }  
   
     /**
	 * 	Update MsdExtraordinaryCall 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdExtraordinaryCall(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdExtraordinaryCall,MSD_EXTRAORDINARY_CALL_LEN);
   	
   }
   
     /**
	 * 	Update MsdExtraordinaryCall 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdExtraordinaryCall(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdExtraordinaryCall+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ChngRateCd
	 *	@return bdms01ChngRateCd
	 */
   public char[] getBdms01ChngRateCd() throws CFException{
     if (isBdms01ChngRateCdModified()) { 
        bdms01ChngRateCd = refreshBdms01ChngRateCd();
     }
   		return bdms01ChngRateCd;
   }

  
	/**
	*  set variable bdms01ChngRateCd
	*  Corresponding COBOL Variable is BDMS01-CHNG-RATE-CD
	*  @param value
	**/
   public void setBdms01ChngRateCd(char[] value) {
      bdms01ChngRateCd = checkBdms01ChngRateCdConstraints(value);
      serializeBdms01ChngRateCd(bdms01ChngRateCd);
   } 

     /**
	 * 	Update Bdms01ChngRateCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ChngRateCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ChngRateCd,bdms01ChngRateCd.length);
   	
   }
   
   public void setBdms01ChngRateCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ChngRateCd,bdms01ChngRateCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01ChngRateCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ChngRateCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ChngRateCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ChngRateCd with another Field
	 *	@param value
	 */
   public void setBdms01ChngRateCd(Field source) {
       replace(source,0,source.length(),beginBdms01ChngRateCd,BDMS_01_CHNG_RATE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ChngRateCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ChngRateCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ChngRateCd,BDMS_01_CHNG_RATE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ChngRateCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ChngRateCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ChngRateCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01MuniMultInd
	 *	@return bdms01MuniMultInd
	 */
   public char[] getBdms01MuniMultInd() throws CFException{
     if (isBdms01MuniMultIndModified()) { 
        bdms01MuniMultInd = refreshBdms01MuniMultInd();
     }
   		return bdms01MuniMultInd;
   }

  
	/**
	*  set variable bdms01MuniMultInd
	*  Corresponding COBOL Variable is BDMS01-MUNI-MULT-IND
	*  @param value
	**/
   public void setBdms01MuniMultInd(char[] value) {
      bdms01MuniMultInd = checkBdms01MuniMultIndConstraints(value);
      serializeBdms01MuniMultInd(bdms01MuniMultInd);
   } 

     /**
	 * 	Update Bdms01MuniMultInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01MuniMultInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01MuniMultInd,bdms01MuniMultInd.length);
   	
   }
   
   public void setBdms01MuniMultInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MuniMultInd,bdms01MuniMultInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01MuniMultInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MuniMultInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MuniMultInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01MuniMultInd with another Field
	 *	@param value
	 */
   public void setBdms01MuniMultInd(Field source) {
       replace(source,0,source.length(),beginBdms01MuniMultInd,BDMS_01_MUNI_MULT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01MuniMultInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01MuniMultInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01MuniMultInd,BDMS_01_MUNI_MULT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01MuniMultInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MuniMultInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MuniMultInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SbaInd
	 *	@return bdms01SbaInd
	 */
   public char[] getBdms01SbaInd() throws CFException{
     if (isBdms01SbaIndModified()) { 
        bdms01SbaInd = refreshBdms01SbaInd();
     }
   		return bdms01SbaInd;
   }

  
	/**
	*  set variable bdms01SbaInd
	*  Corresponding COBOL Variable is BDMS01-SBA-IND
	*  @param value
	**/
   public void setBdms01SbaInd(char[] value) {
      bdms01SbaInd = checkBdms01SbaIndConstraints(value);
      serializeBdms01SbaInd(bdms01SbaInd);
   } 

     /**
	 * 	Update Bdms01SbaInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SbaInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SbaInd,bdms01SbaInd.length);
   	
   }
   
   public void setBdms01SbaInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SbaInd,bdms01SbaInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SbaInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SbaInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SbaInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SbaInd with another Field
	 *	@param value
	 */
   public void setBdms01SbaInd(Field source) {
       replace(source,0,source.length(),beginBdms01SbaInd,BDMS_01_SBA_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SbaInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SbaInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SbaInd,BDMS_01_SBA_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SbaInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SbaInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SbaInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TaxExmptBankInd
	 *	@return bdms01TaxExmptBankInd
	 */
   public char[] getBdms01TaxExmptBankInd() throws CFException{
     if (isBdms01TaxExmptBankIndModified()) { 
        bdms01TaxExmptBankInd = refreshBdms01TaxExmptBankInd();
     }
   		return bdms01TaxExmptBankInd;
   }

  
	/**
	*  set variable bdms01TaxExmptBankInd
	*  Corresponding COBOL Variable is BDMS01-TAX-EXMPT-BANK-IND
	*  @param value
	**/
   public void setBdms01TaxExmptBankInd(char[] value) {
      bdms01TaxExmptBankInd = checkBdms01TaxExmptBankIndConstraints(value);
      serializeBdms01TaxExmptBankInd(bdms01TaxExmptBankInd);
   } 

     /**
	 * 	Update Bdms01TaxExmptBankInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TaxExmptBankInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TaxExmptBankInd,bdms01TaxExmptBankInd.length);
   	
   }
   
   public void setBdms01TaxExmptBankInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TaxExmptBankInd,bdms01TaxExmptBankInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TaxExmptBankInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TaxExmptBankInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TaxExmptBankInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TaxExmptBankInd with another Field
	 *	@param value
	 */
   public void setBdms01TaxExmptBankInd(Field source) {
       replace(source,0,source.length(),beginBdms01TaxExmptBankInd,BDMS_01_TAX_EXMPT_BANK_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TaxExmptBankInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TaxExmptBankInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TaxExmptBankInd,BDMS_01_TAX_EXMPT_BANK_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TaxExmptBankInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TaxExmptBankInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TaxExmptBankInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01StrpdBondInd
	 *	@return bdms01StrpdBondInd
	 */
   public char[] getBdms01StrpdBondInd() throws CFException{
     if (isBdms01StrpdBondIndModified()) { 
        bdms01StrpdBondInd = refreshBdms01StrpdBondInd();
     }
   		return bdms01StrpdBondInd;
   }

  
	/**
	*  set variable bdms01StrpdBondInd
	*  Corresponding COBOL Variable is BDMS01-STRPD-BOND-IND
	*  @param value
	**/
   public void setBdms01StrpdBondInd(char[] value) {
      bdms01StrpdBondInd = checkBdms01StrpdBondIndConstraints(value);
      serializeBdms01StrpdBondInd(bdms01StrpdBondInd);
   } 

     /**
	 * 	Update Bdms01StrpdBondInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01StrpdBondInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01StrpdBondInd,bdms01StrpdBondInd.length);
   	
   }
   
   public void setBdms01StrpdBondInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StrpdBondInd,bdms01StrpdBondInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01StrpdBondInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StrpdBondInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StrpdBondInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01StrpdBondInd with another Field
	 *	@param value
	 */
   public void setBdms01StrpdBondInd(Field source) {
       replace(source,0,source.length(),beginBdms01StrpdBondInd,BDMS_01_STRPD_BOND_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01StrpdBondInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01StrpdBondInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01StrpdBondInd,BDMS_01_STRPD_BOND_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01StrpdBondInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StrpdBondInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StrpdBondInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01DefaultInd
	 *	@return bdms01DefaultInd
	 */
   public char[] getBdms01DefaultInd() throws CFException{
     if (isBdms01DefaultIndModified()) { 
        bdms01DefaultInd = refreshBdms01DefaultInd();
     }
   		return bdms01DefaultInd;
   }

  
	/**
	*  set variable bdms01DefaultInd
	*  Corresponding COBOL Variable is BDMS01-DEFAULT-IND
	*  @param value
	**/
   public void setBdms01DefaultInd(char[] value) {
      bdms01DefaultInd = checkBdms01DefaultIndConstraints(value);
      serializeBdms01DefaultInd(bdms01DefaultInd);
   } 

     /**
	 * 	Update Bdms01DefaultInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01DefaultInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01DefaultInd,bdms01DefaultInd.length);
   	
   }
   
   public void setBdms01DefaultInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DefaultInd,bdms01DefaultInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01DefaultInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DefaultInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DefaultInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01DefaultInd with another Field
	 *	@param value
	 */
   public void setBdms01DefaultInd(Field source) {
       replace(source,0,source.length(),beginBdms01DefaultInd,BDMS_01_DEFAULT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01DefaultInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01DefaultInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01DefaultInd,BDMS_01_DEFAULT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01DefaultInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DefaultInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DefaultInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SerialBondNbr
	 *	@return bdms01SerialBondNbr
	 */
   public char[] getBdms01SerialBondNbr() throws CFException{
     if (isBdms01SerialBondNbrModified()) { 
        bdms01SerialBondNbr = refreshBdms01SerialBondNbr();
     }
   		return bdms01SerialBondNbr;
   }

  
	/**
	*  set variable bdms01SerialBondNbr
	*  Corresponding COBOL Variable is BDMS01-SERIAL-BOND-NBR
	*  @param value
	**/
   public void setBdms01SerialBondNbr(char[] value) {
      bdms01SerialBondNbr = checkBdms01SerialBondNbrConstraints(value);
      serializeBdms01SerialBondNbr(bdms01SerialBondNbr);
   } 

     /**
	 * 	Update Bdms01SerialBondNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SerialBondNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SerialBondNbr,bdms01SerialBondNbr.length);
   	
   }
   
   public void setBdms01SerialBondNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SerialBondNbr,bdms01SerialBondNbr.length);
   	
   }
   
     /**
	 * 	Update Bdms01SerialBondNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SerialBondNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SerialBondNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SerialBondNbr with another Field
	 *	@param value
	 */
   public void setBdms01SerialBondNbr(Field source) {
       replace(source,0,source.length(),beginBdms01SerialBondNbr,BDMS_01_SERIAL_BOND_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SerialBondNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SerialBondNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SerialBondNbr,BDMS_01_SERIAL_BOND_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SerialBondNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SerialBondNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SerialBondNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01InterestPayCd
	 *	@return bdms01InterestPayCd
	 */
   public char[] getBdms01InterestPayCd() throws CFException{
     if (isBdms01InterestPayCdModified()) { 
        bdms01InterestPayCd = refreshBdms01InterestPayCd();
     }
   		return bdms01InterestPayCd;
   }

  
	/**
	*  set variable bdms01InterestPayCd
	*  Corresponding COBOL Variable is BDMS01-INTEREST-PAY-CD
	*  @param value
	**/
   public void setBdms01InterestPayCd(char[] value) {
      bdms01InterestPayCd = checkBdms01InterestPayCdConstraints(value);
      serializeBdms01InterestPayCd(bdms01InterestPayCd);
   } 

     /**
	 * 	Update Bdms01InterestPayCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01InterestPayCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01InterestPayCd,bdms01InterestPayCd.length);
   	
   }
   
   public void setBdms01InterestPayCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01InterestPayCd,bdms01InterestPayCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01InterestPayCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01InterestPayCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01InterestPayCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01InterestPayCd with another Field
	 *	@param value
	 */
   public void setBdms01InterestPayCd(Field source) {
       replace(source,0,source.length(),beginBdms01InterestPayCd,BDMS_01_INTEREST_PAY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01InterestPayCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01InterestPayCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01InterestPayCd,BDMS_01_INTEREST_PAY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01InterestPayCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01InterestPayCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01InterestPayCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01NbrDayPayCd
	 *	@return bdms01NbrDayPayCd
	 */
   public char[] getBdms01NbrDayPayCd() throws CFException{
     if (isBdms01NbrDayPayCdModified()) { 
        bdms01NbrDayPayCd = refreshBdms01NbrDayPayCd();
     }
   		return bdms01NbrDayPayCd;
   }

  
	/**
	*  set variable bdms01NbrDayPayCd
	*  Corresponding COBOL Variable is BDMS01-NBR-DAY-PAY-CD
	*  @param value
	**/
   public void setBdms01NbrDayPayCd(char[] value) {
      bdms01NbrDayPayCd = checkBdms01NbrDayPayCdConstraints(value);
      serializeBdms01NbrDayPayCd(bdms01NbrDayPayCd);
   } 

     /**
	 * 	Update Bdms01NbrDayPayCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01NbrDayPayCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01NbrDayPayCd,bdms01NbrDayPayCd.length);
   	
   }
   
   public void setBdms01NbrDayPayCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01NbrDayPayCd,bdms01NbrDayPayCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01NbrDayPayCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01NbrDayPayCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01NbrDayPayCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01NbrDayPayCd with another Field
	 *	@param value
	 */
   public void setBdms01NbrDayPayCd(Field source) {
       replace(source,0,source.length(),beginBdms01NbrDayPayCd,BDMS_01_NBR_DAY_PAY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01NbrDayPayCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01NbrDayPayCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01NbrDayPayCd,BDMS_01_NBR_DAY_PAY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01NbrDayPayCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01NbrDayPayCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01NbrDayPayCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CmrlBondCd
	 *	@return bdms01CmrlBondCd
	 */
   public char[] getBdms01CmrlBondCd() throws CFException{
     if (isBdms01CmrlBondCdModified()) { 
        bdms01CmrlBondCd = refreshBdms01CmrlBondCd();
     }
   		return bdms01CmrlBondCd;
   }

  
	/**
	*  set variable bdms01CmrlBondCd
	*  Corresponding COBOL Variable is BDMS01-CMRL-BOND-CD
	*  @param value
	**/
   public void setBdms01CmrlBondCd(char[] value) {
      bdms01CmrlBondCd = checkBdms01CmrlBondCdConstraints(value);
      serializeBdms01CmrlBondCd(bdms01CmrlBondCd);
   } 

     /**
	 * 	Update Bdms01CmrlBondCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CmrlBondCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CmrlBondCd,bdms01CmrlBondCd.length);
   	
   }
   
   public void setBdms01CmrlBondCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CmrlBondCd,bdms01CmrlBondCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CmrlBondCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CmrlBondCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CmrlBondCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CmrlBondCd with another Field
	 *	@param value
	 */
   public void setBdms01CmrlBondCd(Field source) {
       replace(source,0,source.length(),beginBdms01CmrlBondCd,BDMS_01_CMRL_BOND_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CmrlBondCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CmrlBondCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CmrlBondCd,BDMS_01_CMRL_BOND_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CmrlBondCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CmrlBondCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CmrlBondCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TypeGovtCd
	 *	@return bdms01TypeGovtCd
	 */
   public char[] getBdms01TypeGovtCd() throws CFException{
     if (isBdms01TypeGovtCdModified()) { 
        bdms01TypeGovtCd = refreshBdms01TypeGovtCd();
     }
   		return bdms01TypeGovtCd;
   }

  
	/**
	*  set variable bdms01TypeGovtCd
	*  Corresponding COBOL Variable is BDMS01-TYPE-GOVT-CD
	*  @param value
	**/
   public void setBdms01TypeGovtCd(char[] value) {
      bdms01TypeGovtCd = checkBdms01TypeGovtCdConstraints(value);
      serializeBdms01TypeGovtCd(bdms01TypeGovtCd);
   } 

     /**
	 * 	Update Bdms01TypeGovtCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TypeGovtCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TypeGovtCd,bdms01TypeGovtCd.length);
   	
   }
   
   public void setBdms01TypeGovtCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeGovtCd,bdms01TypeGovtCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TypeGovtCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypeGovtCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeGovtCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TypeGovtCd with another Field
	 *	@param value
	 */
   public void setBdms01TypeGovtCd(Field source) {
       replace(source,0,source.length(),beginBdms01TypeGovtCd,BDMS_01_TYPE_GOVT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TypeGovtCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TypeGovtCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TypeGovtCd,BDMS_01_TYPE_GOVT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TypeGovtCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypeGovtCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeGovtCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01StateCd
	 *	@return bdms01StateCd
	 */
   public char[] getBdms01StateCd() throws CFException{
     if (isBdms01StateCdModified()) { 
        bdms01StateCd = refreshBdms01StateCd();
     }
   		return bdms01StateCd;
   }

  
	/**
	*  set variable bdms01StateCd
	*  Corresponding COBOL Variable is BDMS01-STATE-CD
	*  @param value
	**/
   public void setBdms01StateCd(char[] value) {
      bdms01StateCd = checkBdms01StateCdConstraints(value);
      serializeBdms01StateCd(bdms01StateCd);
   } 

     /**
	 * 	Update Bdms01StateCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01StateCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01StateCd,bdms01StateCd.length);
   	
   }
   
   public void setBdms01StateCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StateCd,bdms01StateCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01StateCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StateCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StateCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01StateCd with another Field
	 *	@param value
	 */
   public void setBdms01StateCd(Field source) {
       replace(source,0,source.length(),beginBdms01StateCd,BDMS_01_STATE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01StateCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01StateCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01StateCd,BDMS_01_STATE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01StateCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StateCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StateCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01GovtBackCd
	 *	@return bdms01GovtBackCd
	 */
   public char[] getBdms01GovtBackCd() throws CFException{
     if (isBdms01GovtBackCdModified()) { 
        bdms01GovtBackCd = refreshBdms01GovtBackCd();
     }
   		return bdms01GovtBackCd;
   }

  
	/**
	*  set variable bdms01GovtBackCd
	*  Corresponding COBOL Variable is BDMS01-GOVT-BACK-CD
	*  @param value
	**/
   public void setBdms01GovtBackCd(char[] value) {
      bdms01GovtBackCd = checkBdms01GovtBackCdConstraints(value);
      serializeBdms01GovtBackCd(bdms01GovtBackCd);
   } 

     /**
	 * 	Update Bdms01GovtBackCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01GovtBackCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01GovtBackCd,bdms01GovtBackCd.length);
   	
   }
   
   public void setBdms01GovtBackCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GovtBackCd,bdms01GovtBackCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01GovtBackCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GovtBackCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GovtBackCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01GovtBackCd with another Field
	 *	@param value
	 */
   public void setBdms01GovtBackCd(Field source) {
       replace(source,0,source.length(),beginBdms01GovtBackCd,BDMS_01_GOVT_BACK_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01GovtBackCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01GovtBackCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01GovtBackCd,BDMS_01_GOVT_BACK_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01GovtBackCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GovtBackCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GovtBackCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TypePaperCd
	 *	@return bdms01TypePaperCd
	 */
   public char[] getBdms01TypePaperCd() throws CFException{
     if (isBdms01TypePaperCdModified()) { 
        bdms01TypePaperCd = refreshBdms01TypePaperCd();
     }
   		return bdms01TypePaperCd;
   }

  
	/**
	*  set variable bdms01TypePaperCd
	*  Corresponding COBOL Variable is BDMS01-TYPE-PAPER-CD
	*  @param value
	**/
   public void setBdms01TypePaperCd(char[] value) {
      bdms01TypePaperCd = checkBdms01TypePaperCdConstraints(value);
      serializeBdms01TypePaperCd(bdms01TypePaperCd);
   } 

     /**
	 * 	Update Bdms01TypePaperCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TypePaperCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TypePaperCd,bdms01TypePaperCd.length);
   	
   }
   
   public void setBdms01TypePaperCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypePaperCd,bdms01TypePaperCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TypePaperCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypePaperCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypePaperCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TypePaperCd with another Field
	 *	@param value
	 */
   public void setBdms01TypePaperCd(Field source) {
       replace(source,0,source.length(),beginBdms01TypePaperCd,BDMS_01_TYPE_PAPER_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TypePaperCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TypePaperCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TypePaperCd,BDMS_01_TYPE_PAPER_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TypePaperCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypePaperCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypePaperCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PymntArreasInd
	 *	@return bdms01PymntArreasInd
	 */
   public char[] getBdms01PymntArreasInd() throws CFException{
     if (isBdms01PymntArreasIndModified()) { 
        bdms01PymntArreasInd = refreshBdms01PymntArreasInd();
     }
   		return bdms01PymntArreasInd;
   }

  
	/**
	*  set variable bdms01PymntArreasInd
	*  Corresponding COBOL Variable is BDMS01-PYMNT-ARREAS-IND
	*  @param value
	**/
   public void setBdms01PymntArreasInd(char[] value) {
      bdms01PymntArreasInd = checkBdms01PymntArreasIndConstraints(value);
      serializeBdms01PymntArreasInd(bdms01PymntArreasInd);
   } 

     /**
	 * 	Update Bdms01PymntArreasInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PymntArreasInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PymntArreasInd,bdms01PymntArreasInd.length);
   	
   }
   
   public void setBdms01PymntArreasInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PymntArreasInd,bdms01PymntArreasInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PymntArreasInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PymntArreasInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PymntArreasInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PymntArreasInd with another Field
	 *	@param value
	 */
   public void setBdms01PymntArreasInd(Field source) {
       replace(source,0,source.length(),beginBdms01PymntArreasInd,BDMS_01_PYMNT_ARREAS_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PymntArreasInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PymntArreasInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PymntArreasInd,BDMS_01_PYMNT_ARREAS_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PymntArreasInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PymntArreasInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PymntArreasInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RdmptPrtlCd
	 *	@return bdms01RdmptPrtlCd
	 */
   public char[] getBdms01RdmptPrtlCd() throws CFException{
     if (isBdms01RdmptPrtlCdModified()) { 
        bdms01RdmptPrtlCd = refreshBdms01RdmptPrtlCd();
     }
   		return bdms01RdmptPrtlCd;
   }

  
	/**
	*  set variable bdms01RdmptPrtlCd
	*  Corresponding COBOL Variable is BDMS01-RDMPT-PRTL-CD
	*  @param value
	**/
   public void setBdms01RdmptPrtlCd(char[] value) {
      bdms01RdmptPrtlCd = checkBdms01RdmptPrtlCdConstraints(value);
      serializeBdms01RdmptPrtlCd(bdms01RdmptPrtlCd);
   } 

     /**
	 * 	Update Bdms01RdmptPrtlCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RdmptPrtlCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RdmptPrtlCd,bdms01RdmptPrtlCd.length);
   	
   }
   
   public void setBdms01RdmptPrtlCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RdmptPrtlCd,bdms01RdmptPrtlCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01RdmptPrtlCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RdmptPrtlCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RdmptPrtlCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RdmptPrtlCd with another Field
	 *	@param value
	 */
   public void setBdms01RdmptPrtlCd(Field source) {
       replace(source,0,source.length(),beginBdms01RdmptPrtlCd,BDMS_01_RDMPT_PRTL_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RdmptPrtlCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RdmptPrtlCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RdmptPrtlCd,BDMS_01_RDMPT_PRTL_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RdmptPrtlCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RdmptPrtlCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RdmptPrtlCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01OrgnlIntPayDt
	 *	@return bdms01OrgnlIntPayDt
	 */
   public char[] getBdms01OrgnlIntPayDt() throws CFException{
     if (isBdms01OrgnlIntPayDtModified()) { 
        bdms01OrgnlIntPayDt = refreshBdms01OrgnlIntPayDt();
     }
   		return bdms01OrgnlIntPayDt;
   }

  
	/**
	*  set variable bdms01OrgnlIntPayDt
	*  Corresponding COBOL Variable is BDMS01-ORGNL-INT-PAY-DT
	*  @param value
	**/
   public void setBdms01OrgnlIntPayDt(char[] value) {
      bdms01OrgnlIntPayDt = checkBdms01OrgnlIntPayDtConstraints(value);
      serializeBdms01OrgnlIntPayDt(bdms01OrgnlIntPayDt);
   } 

     /**
	 * 	Update Bdms01OrgnlIntPayDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OrgnlIntPayDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OrgnlIntPayDt,bdms01OrgnlIntPayDt.length);
   	
   }
   
   public void setBdms01OrgnlIntPayDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OrgnlIntPayDt,bdms01OrgnlIntPayDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01OrgnlIntPayDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OrgnlIntPayDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OrgnlIntPayDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OrgnlIntPayDt with another Field
	 *	@param value
	 */
   public void setBdms01OrgnlIntPayDt(Field source) {
       replace(source,0,source.length(),beginBdms01OrgnlIntPayDt,BDMS_01_ORGNL_INT_PAY_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OrgnlIntPayDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OrgnlIntPayDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OrgnlIntPayDt,BDMS_01_ORGNL_INT_PAY_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OrgnlIntPayDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OrgnlIntPayDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OrgnlIntPayDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01EvltnBondCd
	 *	@return bdms01EvltnBondCd
	 */
   public char[] getBdms01EvltnBondCd() throws CFException{
     if (isBdms01EvltnBondCdModified()) { 
        bdms01EvltnBondCd = refreshBdms01EvltnBondCd();
     }
   		return bdms01EvltnBondCd;
   }

  
	/**
	*  set variable bdms01EvltnBondCd
	*  Corresponding COBOL Variable is BDMS01-EVLTN-BOND-CD
	*  @param value
	**/
   public void setBdms01EvltnBondCd(char[] value) {
      bdms01EvltnBondCd = checkBdms01EvltnBondCdConstraints(value);
      serializeBdms01EvltnBondCd(bdms01EvltnBondCd);
   } 

     /**
	 * 	Update Bdms01EvltnBondCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01EvltnBondCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01EvltnBondCd,bdms01EvltnBondCd.length);
   	
   }
   
   public void setBdms01EvltnBondCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EvltnBondCd,bdms01EvltnBondCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01EvltnBondCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01EvltnBondCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EvltnBondCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01EvltnBondCd with another Field
	 *	@param value
	 */
   public void setBdms01EvltnBondCd(Field source) {
       replace(source,0,source.length(),beginBdms01EvltnBondCd,BDMS_01_EVLTN_BOND_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01EvltnBondCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01EvltnBondCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01EvltnBondCd,BDMS_01_EVLTN_BOND_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01EvltnBondCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01EvltnBondCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EvltnBondCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RefundReasonCd
	 *	@return bdms01RefundReasonCd
	 */
   public char[] getBdms01RefundReasonCd() throws CFException{
     if (isBdms01RefundReasonCdModified()) { 
        bdms01RefundReasonCd = refreshBdms01RefundReasonCd();
     }
   		return bdms01RefundReasonCd;
   }

  
	/**
	*  set variable bdms01RefundReasonCd
	*  Corresponding COBOL Variable is BDMS01-REFUND-REASON-CD
	*  @param value
	**/
   public void setBdms01RefundReasonCd(char[] value) {
      bdms01RefundReasonCd = checkBdms01RefundReasonCdConstraints(value);
      serializeBdms01RefundReasonCd(bdms01RefundReasonCd);
   } 

     /**
	 * 	Update Bdms01RefundReasonCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RefundReasonCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RefundReasonCd,bdms01RefundReasonCd.length);
   	
   }
   
   public void setBdms01RefundReasonCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RefundReasonCd,bdms01RefundReasonCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01RefundReasonCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RefundReasonCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RefundReasonCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RefundReasonCd with another Field
	 *	@param value
	 */
   public void setBdms01RefundReasonCd(Field source) {
       replace(source,0,source.length(),beginBdms01RefundReasonCd,BDMS_01_REFUND_REASON_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RefundReasonCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RefundReasonCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RefundReasonCd,BDMS_01_REFUND_REASON_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RefundReasonCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RefundReasonCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RefundReasonCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CanadaBondInd
	 *	@return bdms01CanadaBondInd
	 */
   public char[] getBdms01CanadaBondInd() throws CFException{
     if (isBdms01CanadaBondIndModified()) { 
        bdms01CanadaBondInd = refreshBdms01CanadaBondInd();
     }
   		return bdms01CanadaBondInd;
   }

  
	/**
	*  set variable bdms01CanadaBondInd
	*  Corresponding COBOL Variable is BDMS01-CANADA-BOND-IND
	*  @param value
	**/
   public void setBdms01CanadaBondInd(char[] value) {
      bdms01CanadaBondInd = checkBdms01CanadaBondIndConstraints(value);
      serializeBdms01CanadaBondInd(bdms01CanadaBondInd);
   } 

     /**
	 * 	Update Bdms01CanadaBondInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CanadaBondInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CanadaBondInd,bdms01CanadaBondInd.length);
   	
   }
   
   public void setBdms01CanadaBondInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CanadaBondInd,bdms01CanadaBondInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CanadaBondInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CanadaBondInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CanadaBondInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CanadaBondInd with another Field
	 *	@param value
	 */
   public void setBdms01CanadaBondInd(Field source) {
       replace(source,0,source.length(),beginBdms01CanadaBondInd,BDMS_01_CANADA_BOND_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CanadaBondInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CanadaBondInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CanadaBondInd,BDMS_01_CANADA_BOND_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CanadaBondInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CanadaBondInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CanadaBondInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ErbndInd
	 *	@return bdms01ErbndInd
	 */
   public char[] getBdms01ErbndInd() throws CFException{
     if (isBdms01ErbndIndModified()) { 
        bdms01ErbndInd = refreshBdms01ErbndInd();
     }
   		return bdms01ErbndInd;
   }

  
	/**
	*  set variable bdms01ErbndInd
	*  Corresponding COBOL Variable is BDMS01-ERBND-IND
	*  @param value
	**/
   public void setBdms01ErbndInd(char[] value) {
      bdms01ErbndInd = checkBdms01ErbndIndConstraints(value);
      serializeBdms01ErbndInd(bdms01ErbndInd);
   } 

     /**
	 * 	Update Bdms01ErbndInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ErbndInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ErbndInd,bdms01ErbndInd.length);
   	
   }
   
   public void setBdms01ErbndInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ErbndInd,bdms01ErbndInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01ErbndInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ErbndInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ErbndInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ErbndInd with another Field
	 *	@param value
	 */
   public void setBdms01ErbndInd(Field source) {
       replace(source,0,source.length(),beginBdms01ErbndInd,BDMS_01_ERBND_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ErbndInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ErbndInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ErbndInd,BDMS_01_ERBND_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ErbndInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ErbndInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ErbndInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CallTypeCd
	 *	@return bdms01CallTypeCd
	 */
   public char[] getBdms01CallTypeCd() throws CFException{
     if (isBdms01CallTypeCdModified()) { 
        bdms01CallTypeCd = refreshBdms01CallTypeCd();
     }
   		return bdms01CallTypeCd;
   }

  
	/**
	*  set variable bdms01CallTypeCd
	*  Corresponding COBOL Variable is BDMS01-CALL-TYPE-CD
	*  @param value
	**/
   public void setBdms01CallTypeCd(char[] value) {
      bdms01CallTypeCd = checkBdms01CallTypeCdConstraints(value);
      serializeBdms01CallTypeCd(bdms01CallTypeCd);
   } 

     /**
	 * 	Update Bdms01CallTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CallTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CallTypeCd,bdms01CallTypeCd.length);
   	
   }
   
   public void setBdms01CallTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallTypeCd,bdms01CallTypeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CallTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CallTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CallTypeCd with another Field
	 *	@param value
	 */
   public void setBdms01CallTypeCd(Field source) {
       replace(source,0,source.length(),beginBdms01CallTypeCd,BDMS_01_CALL_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CallTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CallTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CallTypeCd,BDMS_01_CALL_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CallTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CallTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallTypeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TypeMuniCd
	 *	@return bdms01TypeMuniCd
	 */
   public char[] getBdms01TypeMuniCd() throws CFException{
     if (isBdms01TypeMuniCdModified()) { 
        bdms01TypeMuniCd = refreshBdms01TypeMuniCd();
     }
   		return bdms01TypeMuniCd;
   }

  
	/**
	*  set variable bdms01TypeMuniCd
	*  Corresponding COBOL Variable is BDMS01-TYPE-MUNI-CD
	*  @param value
	**/
   public void setBdms01TypeMuniCd(char[] value) {
      bdms01TypeMuniCd = checkBdms01TypeMuniCdConstraints(value);
      serializeBdms01TypeMuniCd(bdms01TypeMuniCd);
   } 

     /**
	 * 	Update Bdms01TypeMuniCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TypeMuniCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TypeMuniCd,bdms01TypeMuniCd.length);
   	
   }
   
   public void setBdms01TypeMuniCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeMuniCd,bdms01TypeMuniCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TypeMuniCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypeMuniCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeMuniCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TypeMuniCd with another Field
	 *	@param value
	 */
   public void setBdms01TypeMuniCd(Field source) {
       replace(source,0,source.length(),beginBdms01TypeMuniCd,BDMS_01_TYPE_MUNI_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TypeMuniCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TypeMuniCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TypeMuniCd,BDMS_01_TYPE_MUNI_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TypeMuniCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypeMuniCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeMuniCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01AgencyInd
	 *	@return bdms01AgencyInd
	 */
   public char[] getBdms01AgencyInd() throws CFException{
     if (isBdms01AgencyIndModified()) { 
        bdms01AgencyInd = refreshBdms01AgencyInd();
     }
   		return bdms01AgencyInd;
   }

  
	/**
	*  set variable bdms01AgencyInd
	*  Corresponding COBOL Variable is BDMS01-AGENCY-IND
	*  @param value
	**/
   public void setBdms01AgencyInd(char[] value) {
      bdms01AgencyInd = checkBdms01AgencyIndConstraints(value);
      serializeBdms01AgencyInd(bdms01AgencyInd);
   } 

     /**
	 * 	Update Bdms01AgencyInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01AgencyInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01AgencyInd,bdms01AgencyInd.length);
   	
   }
   
   public void setBdms01AgencyInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AgencyInd,bdms01AgencyInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01AgencyInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AgencyInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AgencyInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01AgencyInd with another Field
	 *	@param value
	 */
   public void setBdms01AgencyInd(Field source) {
       replace(source,0,source.length(),beginBdms01AgencyInd,BDMS_01_AGENCY_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01AgencyInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01AgencyInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01AgencyInd,BDMS_01_AGENCY_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01AgencyInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AgencyInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AgencyInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TiisInd
	 *	@return bdms01TiisInd
	 */
   public char[] getBdms01TiisInd() throws CFException{
     if (isBdms01TiisIndModified()) { 
        bdms01TiisInd = refreshBdms01TiisInd();
     }
   		return bdms01TiisInd;
   }

  
	/**
	*  set variable bdms01TiisInd
	*  Corresponding COBOL Variable is BDMS01-TIIS-IND
	*  @param value
	**/
   public void setBdms01TiisInd(char[] value) {
      bdms01TiisInd = checkBdms01TiisIndConstraints(value);
      serializeBdms01TiisInd(bdms01TiisInd);
   } 

     /**
	 * 	Update Bdms01TiisInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TiisInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TiisInd,bdms01TiisInd.length);
   	
   }
   
   public void setBdms01TiisInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TiisInd,bdms01TiisInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TiisInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TiisInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TiisInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TiisInd with another Field
	 *	@param value
	 */
   public void setBdms01TiisInd(Field source) {
       replace(source,0,source.length(),beginBdms01TiisInd,BDMS_01_TIIS_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TiisInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TiisInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TiisInd,BDMS_01_TIIS_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TiisInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TiisInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TiisInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01IntCalcnCd
	 *	@return bdms01IntCalcnCd
	 */
   public char[] getBdms01IntCalcnCd() throws CFException{
     if (isBdms01IntCalcnCdModified()) { 
        bdms01IntCalcnCd = refreshBdms01IntCalcnCd();
     }
   		return bdms01IntCalcnCd;
   }

  
	/**
	*  set variable bdms01IntCalcnCd
	*  Corresponding COBOL Variable is BDMS01-INT-CALCN-CD
	*  @param value
	**/
   public void setBdms01IntCalcnCd(char[] value) {
      bdms01IntCalcnCd = checkBdms01IntCalcnCdConstraints(value);
      serializeBdms01IntCalcnCd(bdms01IntCalcnCd);
   } 

     /**
	 * 	Update Bdms01IntCalcnCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01IntCalcnCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01IntCalcnCd,bdms01IntCalcnCd.length);
   	
   }
   
   public void setBdms01IntCalcnCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IntCalcnCd,bdms01IntCalcnCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01IntCalcnCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01IntCalcnCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IntCalcnCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01IntCalcnCd with another Field
	 *	@param value
	 */
   public void setBdms01IntCalcnCd(Field source) {
       replace(source,0,source.length(),beginBdms01IntCalcnCd,BDMS_01_INT_CALCN_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01IntCalcnCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01IntCalcnCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01IntCalcnCd,BDMS_01_INT_CALCN_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01IntCalcnCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01IntCalcnCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IntCalcnCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01AstBckdCd
	 *	@return bdms01AstBckdCd
	 */
   public char[] getBdms01AstBckdCd() throws CFException{
     if (isBdms01AstBckdCdModified()) { 
        bdms01AstBckdCd = refreshBdms01AstBckdCd();
     }
   		return bdms01AstBckdCd;
   }

  
	/**
	*  set variable bdms01AstBckdCd
	*  Corresponding COBOL Variable is BDMS01-AST-BCKD-CD
	*  @param value
	**/
   public void setBdms01AstBckdCd(char[] value) {
      bdms01AstBckdCd = checkBdms01AstBckdCdConstraints(value);
      serializeBdms01AstBckdCd(bdms01AstBckdCd);
   } 

     /**
	 * 	Update Bdms01AstBckdCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01AstBckdCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01AstBckdCd,bdms01AstBckdCd.length);
   	
   }
   
   public void setBdms01AstBckdCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AstBckdCd,bdms01AstBckdCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01AstBckdCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AstBckdCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AstBckdCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01AstBckdCd with another Field
	 *	@param value
	 */
   public void setBdms01AstBckdCd(Field source) {
       replace(source,0,source.length(),beginBdms01AstBckdCd,BDMS_01_AST_BCKD_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01AstBckdCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01AstBckdCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01AstBckdCd,BDMS_01_AST_BCKD_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01AstBckdCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AstBckdCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AstBckdCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01GnmaSrlNoteInd
	 *	@return bdms01GnmaSrlNoteInd
	 */
   public char[] getBdms01GnmaSrlNoteInd() throws CFException{
     if (isBdms01GnmaSrlNoteIndModified()) { 
        bdms01GnmaSrlNoteInd = refreshBdms01GnmaSrlNoteInd();
     }
   		return bdms01GnmaSrlNoteInd;
   }

  
	/**
	*  set variable bdms01GnmaSrlNoteInd
	*  Corresponding COBOL Variable is BDMS01-GNMA-SRL-NOTE-IND
	*  @param value
	**/
   public void setBdms01GnmaSrlNoteInd(char[] value) {
      bdms01GnmaSrlNoteInd = checkBdms01GnmaSrlNoteIndConstraints(value);
      serializeBdms01GnmaSrlNoteInd(bdms01GnmaSrlNoteInd);
   } 

     /**
	 * 	Update Bdms01GnmaSrlNoteInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01GnmaSrlNoteInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01GnmaSrlNoteInd,bdms01GnmaSrlNoteInd.length);
   	
   }
   
   public void setBdms01GnmaSrlNoteInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GnmaSrlNoteInd,bdms01GnmaSrlNoteInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01GnmaSrlNoteInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GnmaSrlNoteInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GnmaSrlNoteInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01GnmaSrlNoteInd with another Field
	 *	@param value
	 */
   public void setBdms01GnmaSrlNoteInd(Field source) {
       replace(source,0,source.length(),beginBdms01GnmaSrlNoteInd,BDMS_01_GNMA_SRL_NOTE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01GnmaSrlNoteInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01GnmaSrlNoteInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01GnmaSrlNoteInd,BDMS_01_GNMA_SRL_NOTE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01GnmaSrlNoteInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GnmaSrlNoteInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GnmaSrlNoteInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TraceInd
	 *	@return bdms01TraceInd
	 */
   public char[] getBdms01TraceInd() throws CFException{
     if (isBdms01TraceIndModified()) { 
        bdms01TraceInd = refreshBdms01TraceInd();
     }
   		return bdms01TraceInd;
   }

  
	/**
	*  set variable bdms01TraceInd
	*  Corresponding COBOL Variable is BDMS01-TRACE-IND
	*  @param value
	**/
   public void setBdms01TraceInd(char[] value) {
      bdms01TraceInd = checkBdms01TraceIndConstraints(value);
      serializeBdms01TraceInd(bdms01TraceInd);
   } 

     /**
	 * 	Update Bdms01TraceInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TraceInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TraceInd,bdms01TraceInd.length);
   	
   }
   
   public void setBdms01TraceInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TraceInd,bdms01TraceInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TraceInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TraceInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TraceInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TraceInd with another Field
	 *	@param value
	 */
   public void setBdms01TraceInd(Field source) {
       replace(source,0,source.length(),beginBdms01TraceInd,BDMS_01_TRACE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TraceInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TraceInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TraceInd,BDMS_01_TRACE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TraceInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TraceInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TraceInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TbaInd
	 *	@return bdms01TbaInd
	 */
   public char[] getBdms01TbaInd() throws CFException{
     if (isBdms01TbaIndModified()) { 
        bdms01TbaInd = refreshBdms01TbaInd();
     }
   		return bdms01TbaInd;
   }

  
	/**
	*  set variable bdms01TbaInd
	*  Corresponding COBOL Variable is BDMS01-TBA-IND
	*  @param value
	**/
   public void setBdms01TbaInd(char[] value) {
      bdms01TbaInd = checkBdms01TbaIndConstraints(value);
      serializeBdms01TbaInd(bdms01TbaInd);
   } 

     /**
	 * 	Update Bdms01TbaInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TbaInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TbaInd,bdms01TbaInd.length);
   	
   }
   
   public void setBdms01TbaInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TbaInd,bdms01TbaInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TbaInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TbaInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TbaInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TbaInd with another Field
	 *	@param value
	 */
   public void setBdms01TbaInd(Field source) {
       replace(source,0,source.length(),beginBdms01TbaInd,BDMS_01_TBA_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TbaInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TbaInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TbaInd,BDMS_01_TBA_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TbaInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TbaInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TbaInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01MnmmDnmntAmt
	 *	@return bdms01MnmmDnmntAmt
	 */
	public BigDecimal getBdms01MnmmDnmntAmt() throws CFException {
       if (isBdms01MnmmDnmntAmtModified()) { 
           bdms01MnmmDnmntAmt = refreshBdms01MnmmDnmntAmt();
        }
   		return bdms01MnmmDnmntAmt;
	}
	

	
	   
	/**
	 * 	Update Bdms01MnmmDnmntAmt with the passed number
	 *  Corresponding COBOL Variable is BDMS01-MNMM-DNMNT-AMT
	 *	@param number
	 */
	public void setBdms01MnmmDnmntAmt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01MnmmDnmntAmt = checkBdms01MnmmDnmntAmtMaxLimit(number);
	    serializeBdms01MnmmDnmntAmt(bdms01MnmmDnmntAmt);
   }
	/**
	 * 	Update Bdms01MnmmDnmntAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01MnmmDnmntAmt(char[] value) throws CFException {
		 bdms01MnmmDnmntAmt = serializeBdms01MnmmDnmntAmt(value);
	}   
	/**
	 *	Returns the value of bdms01ClNoticeDaysNbr
	 *	@return bdms01ClNoticeDaysNbr
	 */
	public int getBdms01ClNoticeDaysNbr() throws CFException {
       if (isBdms01ClNoticeDaysNbrModified()) { 
           bdms01ClNoticeDaysNbr = refreshBdms01ClNoticeDaysNbr();
        }
   		return bdms01ClNoticeDaysNbr;
	}
	

	
	   
	/**
	 * 	Update Bdms01ClNoticeDaysNbr with the passed value
	 *  Corresponding COBOL Variable is BDMS01-CL-NOTICE-DAYS-NBR
	 *	@param number
	 */
	public void setBdms01ClNoticeDaysNbr(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01ClNoticeDaysNbr = checkBdms01ClNoticeDaysNbrMaxLimit(number); 
		serializeBdms01ClNoticeDaysNbr(bdms01ClNoticeDaysNbr);
	}
	

	public void setBdms01ClNoticeDaysNbr(long number) {
	    number = checkBdms01ClNoticeDaysNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01ClNoticeDaysNbr((int)number);
	}
	
	/**
	 * 	Update Bdms01ClNoticeDaysNbr with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01ClNoticeDaysNbr(char[] value) throws CFException {
		 bdms01ClNoticeDaysNbr = serializeBdms01ClNoticeDaysNbr(value);
	}
	/**
	 * 	Update Bdms01ClNoticeDaysNbr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01ClNoticeDaysNbrString(char[] value) throws CFException {
		 setBdms01ClNoticeDaysNbr(value);
	}
	/**
	 *	Returns the value of bdms01SinkingFundInd
	 *	@return bdms01SinkingFundInd
	 */
   public char[] getBdms01SinkingFundInd() throws CFException{
     if (isBdms01SinkingFundIndModified()) { 
        bdms01SinkingFundInd = refreshBdms01SinkingFundInd();
     }
   		return bdms01SinkingFundInd;
   }

  
	/**
	*  set variable bdms01SinkingFundInd
	*  Corresponding COBOL Variable is BDMS01-SINKING-FUND-IND
	*  @param value
	**/
   public void setBdms01SinkingFundInd(char[] value) {
      bdms01SinkingFundInd = checkBdms01SinkingFundIndConstraints(value);
      serializeBdms01SinkingFundInd(bdms01SinkingFundInd);
   } 

     /**
	 * 	Update Bdms01SinkingFundInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SinkingFundInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SinkingFundInd,bdms01SinkingFundInd.length);
   	
   }
   
   public void setBdms01SinkingFundInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SinkingFundInd,bdms01SinkingFundInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SinkingFundInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SinkingFundInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SinkingFundInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SinkingFundInd with another Field
	 *	@param value
	 */
   public void setBdms01SinkingFundInd(Field source) {
       replace(source,0,source.length(),beginBdms01SinkingFundInd,BDMS_01_SINKING_FUND_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SinkingFundInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SinkingFundInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SinkingFundInd,BDMS_01_SINKING_FUND_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SinkingFundInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SinkingFundInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SinkingFundInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01DefeaseInd
	 *	@return bdms01DefeaseInd
	 */
   public char[] getBdms01DefeaseInd() throws CFException{
     if (isBdms01DefeaseIndModified()) { 
        bdms01DefeaseInd = refreshBdms01DefeaseInd();
     }
   		return bdms01DefeaseInd;
   }

  
	/**
	*  set variable bdms01DefeaseInd
	*  Corresponding COBOL Variable is BDMS01-DEFEASE-IND
	*  @param value
	**/
   public void setBdms01DefeaseInd(char[] value) {
      bdms01DefeaseInd = checkBdms01DefeaseIndConstraints(value);
      serializeBdms01DefeaseInd(bdms01DefeaseInd);
   } 

     /**
	 * 	Update Bdms01DefeaseInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01DefeaseInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01DefeaseInd,bdms01DefeaseInd.length);
   	
   }
   
   public void setBdms01DefeaseInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DefeaseInd,bdms01DefeaseInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01DefeaseInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DefeaseInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DefeaseInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01DefeaseInd with another Field
	 *	@param value
	 */
   public void setBdms01DefeaseInd(Field source) {
       replace(source,0,source.length(),beginBdms01DefeaseInd,BDMS_01_DEFEASE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01DefeaseInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01DefeaseInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01DefeaseInd,BDMS_01_DEFEASE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01DefeaseInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DefeaseInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DefeaseInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RvnuInd
	 *	@return bdms01RvnuInd
	 */
   public char[] getBdms01RvnuInd() throws CFException{
     if (isBdms01RvnuIndModified()) { 
        bdms01RvnuInd = refreshBdms01RvnuInd();
     }
   		return bdms01RvnuInd;
   }

  
	/**
	*  set variable bdms01RvnuInd
	*  Corresponding COBOL Variable is BDMS01-RVNU-IND
	*  @param value
	**/
   public void setBdms01RvnuInd(char[] value) {
      bdms01RvnuInd = checkBdms01RvnuIndConstraints(value);
      serializeBdms01RvnuInd(bdms01RvnuInd);
   } 

     /**
	 * 	Update Bdms01RvnuInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RvnuInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RvnuInd,bdms01RvnuInd.length);
   	
   }
   
   public void setBdms01RvnuInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RvnuInd,bdms01RvnuInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01RvnuInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RvnuInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RvnuInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RvnuInd with another Field
	 *	@param value
	 */
   public void setBdms01RvnuInd(Field source) {
       replace(source,0,source.length(),beginBdms01RvnuInd,BDMS_01_RVNU_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RvnuInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RvnuInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RvnuInd,BDMS_01_RVNU_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RvnuInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RvnuInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RvnuInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CvrsnRt
	 *	@return bdms01CvrsnRt
	 */
	public BigDecimal getBdms01CvrsnRt() throws CFException {
       if (isBdms01CvrsnRtModified()) { 
           bdms01CvrsnRt = refreshBdms01CvrsnRt();
        }
   		return bdms01CvrsnRt;
	}
	

	
	   
	/**
	 * 	Update Bdms01CvrsnRt with the passed number
	 *  Corresponding COBOL Variable is BDMS01-CVRSN-RT
	 *	@param number
	 */
	public void setBdms01CvrsnRt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01CvrsnRt = checkBdms01CvrsnRtMaxLimit(number);
	    serializeBdms01CvrsnRt(bdms01CvrsnRt);
   }
	/**
	 * 	Update Bdms01CvrsnRt with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01CvrsnRt(char[] value) throws CFException {
		 bdms01CvrsnRt = serializeBdms01CvrsnRt(value);
	}   
	/**
	 *	Returns the value of bdms01CvrsnPrcAmt
	 *	@return bdms01CvrsnPrcAmt
	 */
	public BigDecimal getBdms01CvrsnPrcAmt() throws CFException {
       if (isBdms01CvrsnPrcAmtModified()) { 
           bdms01CvrsnPrcAmt = refreshBdms01CvrsnPrcAmt();
        }
   		return bdms01CvrsnPrcAmt;
	}
	

	
	   
	/**
	 * 	Update Bdms01CvrsnPrcAmt with the passed number
	 *  Corresponding COBOL Variable is BDMS01-CVRSN-PRC-AMT
	 *	@param number
	 */
	public void setBdms01CvrsnPrcAmt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01CvrsnPrcAmt = checkBdms01CvrsnPrcAmtMaxLimit(number);
	    serializeBdms01CvrsnPrcAmt(bdms01CvrsnPrcAmt);
   }
	/**
	 * 	Update Bdms01CvrsnPrcAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01CvrsnPrcAmt(char[] value) throws CFException {
		 bdms01CvrsnPrcAmt = serializeBdms01CvrsnPrcAmt(value);
	}   
	/**
	 *	Returns the value of bdms01CvrsnExpDt
	 *	@return bdms01CvrsnExpDt
	 */
   public char[] getBdms01CvrsnExpDt() throws CFException{
     if (isBdms01CvrsnExpDtModified()) { 
        bdms01CvrsnExpDt = refreshBdms01CvrsnExpDt();
     }
   		return bdms01CvrsnExpDt;
   }

  
	/**
	*  set variable bdms01CvrsnExpDt
	*  Corresponding COBOL Variable is BDMS01-CVRSN-EXP-DT
	*  @param value
	**/
   public void setBdms01CvrsnExpDt(char[] value) {
      bdms01CvrsnExpDt = checkBdms01CvrsnExpDtConstraints(value);
      serializeBdms01CvrsnExpDt(bdms01CvrsnExpDt);
   } 

     /**
	 * 	Update Bdms01CvrsnExpDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CvrsnExpDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CvrsnExpDt,bdms01CvrsnExpDt.length);
   	
   }
   
   public void setBdms01CvrsnExpDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExpDt,bdms01CvrsnExpDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01CvrsnExpDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CvrsnExpDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExpDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CvrsnExpDt with another Field
	 *	@param value
	 */
   public void setBdms01CvrsnExpDt(Field source) {
       replace(source,0,source.length(),beginBdms01CvrsnExpDt,BDMS_01_CVRSN_EXP_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CvrsnExpDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CvrsnExpDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExpDt,BDMS_01_CVRSN_EXP_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CvrsnExpDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CvrsnExpDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExpDt+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01BondBasicSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01BondBasicSegSqlcd(0);
			setMsdBondInterestRate(BigDecimal.ZERO);
          msdBondMaturityMmddccyy.initialize();
     
          msdBondCouponMmdd.initialize();
     
          msdBondDatedMmddyycc.initialize();
     
          msdBondRecordMmddyycc.initialize();
     
         setMsdBondDatedIndicator(CONSTANTS.SPACE);
         setMsdStateCode(CONSTANTS.SPACE_2);
         setMsdInsuranceCode(CONSTANTS.SPACE_2);
         setMsdBondGuaranteedInd(CONSTANTS.SPACE);
         setMsdBndEvalueCode(CONSTANTS.SPACE);
          msdBondPayMmddyycc.initialize();
     
         setMsdBondActualPayDate(CONSTANTS.SPACE_4);
                     setMsdBondFirstCpnDt(0);
         setBdms01FrqncRateChgCd(CONSTANTS.SPACE_2);
         setBdms01MaturityDt(CONSTANTS.SPACE_10);
         setBdms01AccrueIntDt(CONSTANTS.SPACE_10);
         setBdms01PayInterestDt(CONSTANTS.SPACE_10);
         setBdms01CouponFirstDt(CONSTANTS.SPACE_10);
         setBdms01CalcYldIntCd(CONSTANTS.SPACE);
         setBdms01RecordHldEstDt(CONSTANTS.SPACE_10);
         setBdms01PrdLongShortCd(CONSTANTS.SPACE);
         setBdms01ExtCallInd(CONSTANTS.SPACE);
         setBdms01ChngRateCd(CONSTANTS.SPACE);
         setBdms01MuniMultInd(CONSTANTS.SPACE);
         setBdms01SbaInd(CONSTANTS.SPACE);
         setBdms01TaxExmptBankInd(CONSTANTS.SPACE);
         setBdms01StrpdBondInd(CONSTANTS.SPACE);
         setBdms01DefaultInd(CONSTANTS.SPACE);
         setBdms01SerialBondNbr(CONSTANTS.SPACE_7);
         setBdms01InterestPayCd(CONSTANTS.SPACE_2);
         setBdms01NbrDayPayCd(CONSTANTS.SPACE_4);
         setBdms01CmrlBondCd(CONSTANTS.SPACE_2);
         setBdms01TypeGovtCd(CONSTANTS.SPACE_2);
         setBdms01StateCd(CONSTANTS.SPACE_2);
         setBdms01GovtBackCd(CONSTANTS.SPACE_2);
         setBdms01TypePaperCd(CONSTANTS.SPACE_2);
         setBdms01PymntArreasInd(CONSTANTS.SPACE);
         setBdms01RdmptPrtlCd(CONSTANTS.SPACE_2);
         setBdms01OrgnlIntPayDt(CONSTANTS.SPACE_10);
         setBdms01EvltnBondCd(CONSTANTS.SPACE_2);
         setBdms01RefundReasonCd(CONSTANTS.SPACE_2);
         setBdms01CanadaBondInd(CONSTANTS.SPACE);
         setBdms01ErbndInd(CONSTANTS.SPACE);
         setBdms01CallTypeCd(CONSTANTS.SPACE_2);
         setBdms01TypeMuniCd(CONSTANTS.SPACE_4);
         setBdms01AgencyInd(CONSTANTS.SPACE);
         setBdms01TiisInd(CONSTANTS.SPACE);
         setBdms01IntCalcnCd(CONSTANTS.SPACE_4);
         setBdms01AstBckdCd(CONSTANTS.SPACE_2);
         setBdms01GnmaSrlNoteInd(CONSTANTS.SPACE);
         setBdms01TraceInd(CONSTANTS.SPACE);
         setBdms01TbaInd(CONSTANTS.SPACE);
			setBdms01MnmmDnmntAmt(BigDecimal.ZERO);
                     setBdms01ClNoticeDaysNbr(0);
         setBdms01SinkingFundInd(CONSTANTS.SPACE);
         setBdms01DefeaseInd(CONSTANTS.SPACE);
         setBdms01RvnuInd(CONSTANTS.SPACE);
			setBdms01CvrsnRt(BigDecimal.ZERO);
			setBdms01CvrsnPrcAmt(BigDecimal.ZERO);
         setBdms01CvrsnExpDt(CONSTANTS.SPACE_10);
   }

		public static int getBdms01BondBasicSegDataFieldLength() {
			return BDMS_01_BOND_BASIC_SEG_DATA_LENGTH;
		}

}
  
