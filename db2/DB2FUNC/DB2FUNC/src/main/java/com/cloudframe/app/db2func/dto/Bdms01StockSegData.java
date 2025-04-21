package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01StockSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01StockSegData extends Bdms01StockSegDataSerialized { 
   

								private int bdms01StockSegSqlcd;

								private long msdSharesOuts;

								private BigDecimal msdEarnPerShr = BigDecimal.ZERO;

						private char[] msdEarnPerShrSign = Field.fillLowValue(1);

								private BigDecimal msdEstimatedDiv = BigDecimal.ZERO;

								private long msdStkProxyMtngDt;

								private long msdStkProxyRecDt;
				private MsdWrntsExpMmddccyy msdWrntsExpMmddccyy = new MsdWrntsExpMmddccyy();

						private char[] msdPoisonPillInd = Field.fillLowValue(1);

						private char[] bdms01MeetingProxyDt = Field.fillLowValue(10);

						private char[] bdms01RecordProxyDt = Field.fillLowValue(10);

						private char[] bdms01StkExpirationDt = Field.fillLowValue(10);

						private char[] bdms01MasterLtdInd = Field.fillLowValue(1);

						private char[] msdMlp = Field.fillLowValue(1);

						private char[] bdms01MmfInd = Field.fillLowValue(1);

						private char[] bdms01OpenFundCd = Field.fillLowValue(1);

						private char[] bdms01LotTradeCd = Field.fillLowValue(2);

								private BigDecimal bdms01DvdndYldAmt = BigDecimal.ZERO;

								private BigDecimal bdms01ExpirationAmt = BigDecimal.ZERO;

						private char[] bdms01AdrInd = Field.fillLowValue(1);

						private char[] bdms01GdrInd = Field.fillLowValue(1);

						private char[] bdms01PsnplCd = Field.fillLowValue(3);

						private char[] bdms01PrfrdInd = Field.fillLowValue(1);

						private char[] bdms01DivCumInd = Field.fillLowValue(1);

						private char[] bdms01FreqIncmDebtCd = Field.fillLowValue(2);

						private char[] bdms01CallDt = Field.fillLowValue(10);

								private BigDecimal bdms01CallAmt = BigDecimal.ZERO;

								private BigDecimal bdms01DvdndAnnlAmt = BigDecimal.ZERO;

								private BigDecimal bdms01DvdndAnnlPct = BigDecimal.ZERO;

						private char[] bdms01PrtcpInd = Field.fillLowValue(1);

						private char[] bdms01VoteRghtsInd = Field.fillLowValue(1);

						private char[] bdms01ScrtyAdpRstrNbr = Field.fillLowValue(7);

						private char[] bdms01UtsCanadianCd = Field.fillLowValue(1);

						private char[] bdms01WarrantsIndexInd = Field.fillLowValue(1);

						private char[] msdMidsQids = Field.fillLowValue(1);

						private char[] bdms01EtfInd = Field.fillLowValue(1);

						private char[] bdms01SmallCptlInd = Field.fillLowValue(1);

						private char[] bdms01ExmptUptckInd = Field.fillLowValue(1);

						private char[] bdms01RegShoElgblInd = Field.fillLowValue(1);

						private char[] bdms01RegShoElgblDt = Field.fillLowValue(10);

						private char[] bdms01MfFamilyNbr = Field.fillLowValue(4);

						private char[] bdms01ShrClassCd = Field.fillLowValue(1);

						private char[] bdms01RegShoInelgblDt = Field.fillLowValue(10);

						private char[] bdms01MfLoadTypeCd = Field.fillLowValue(1);

						private char[] bdms01EqiContraInd = Field.fillLowValue(1);

						private char[] bdms01OtcBlltnFeeInd = Field.fillLowValue(1);

	
	/**
	* Constructor for Bdms01StockSegData
	**/
    public Bdms01StockSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01StockSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01StockSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			msdWrntsExpMmddccyy.setParent(this,getStartOffset() + 64);
    } 

	/**
	 *	Returns the value of bdms01StockSegSqlcd
	 *	@return bdms01StockSegSqlcd
	 */
	public int getBdms01StockSegSqlcd() throws CFException {
       if (isBdms01StockSegSqlcdModified()) { 
           bdms01StockSegSqlcd = refreshBdms01StockSegSqlcd();
        }
   		return bdms01StockSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01StockSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-STOCK-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01StockSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01StockSegSqlcd = checkBdms01StockSegSqlcdMaxLimit(number); 
		serializeBdms01StockSegSqlcd(bdms01StockSegSqlcd);
	}
	

	public void setBdms01StockSegSqlcd(long number) {
	    number = checkBdms01StockSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01StockSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01StockSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01StockSegSqlcd(char[] value) throws CFException {
		 bdms01StockSegSqlcd = serializeBdms01StockSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01StockSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01StockSegSqlcdString(char[] value) throws CFException {
		 setBdms01StockSegSqlcd(value);
	}
	/**
	 *	Returns the value of msdSharesOuts
	 *	@return msdSharesOuts
	 */
	public long getMsdSharesOuts() throws CFException {
       if (isMsdSharesOutsModified()) { 
           msdSharesOuts = refreshMsdSharesOuts();
        }
   		return msdSharesOuts;
	}
	

	
	   
	/**
	 * 	Update MsdSharesOuts with the passed value
	 *  Corresponding COBOL Variable is MSD-SHARES-OUTS
	 *	@param number
	 */
	public void setMsdSharesOuts(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdSharesOuts = checkMsdSharesOutsMaxLimit(number); 
		serializeMsdSharesOuts(msdSharesOuts);
	}
	

	/**
	 * 	Update MsdSharesOuts with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdSharesOuts(char[] value) throws CFException {
		 msdSharesOuts = serializeMsdSharesOuts(value);
	}
	/**
	 * 	Update MsdSharesOuts with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdSharesOutsString(char[] value) throws CFException {
		 setMsdSharesOuts(value);
	}
	/**
	 *	Returns the value of msdEarnPerShr
	 *	@return msdEarnPerShr
	 */
	public BigDecimal getMsdEarnPerShr() throws CFException {
       if (isMsdEarnPerShrModified()) { 
           msdEarnPerShr = refreshMsdEarnPerShr();
        }
   		return msdEarnPerShr;
	}
	

	
	   
	/**
	 * 	Update MsdEarnPerShr with the passed number
	 *  Corresponding COBOL Variable is MSD-EARN-PER-SHR
	 *	@param number
	 */
	public void setMsdEarnPerShr(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdEarnPerShr = checkMsdEarnPerShrMaxLimit(number);
	    serializeMsdEarnPerShr(msdEarnPerShr);
   }
	/**
	 * 	Update MsdEarnPerShr with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdEarnPerShr(char[] value) throws CFException {
		 msdEarnPerShr = serializeMsdEarnPerShr(value);
	}   
	/**
	 *	Returns the value of msdEarnPerShrSign
	 *	@return msdEarnPerShrSign
	 */
   public char[] getMsdEarnPerShrSign() throws CFException{
     if (isMsdEarnPerShrSignModified()) { 
        msdEarnPerShrSign = refreshMsdEarnPerShrSign();
     }
   		return msdEarnPerShrSign;
   }

  
	/**
	*  set variable msdEarnPerShrSign
	*  Corresponding COBOL Variable is MSD-EARN-PER-SHR-SIGN
	*  @param value
	**/
   public void setMsdEarnPerShrSign(char[] value) {
      msdEarnPerShrSign = checkMsdEarnPerShrSignConstraints(value);
      serializeMsdEarnPerShrSign(msdEarnPerShrSign);
   } 

     /**
	 * 	Update MsdEarnPerShrSign 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdEarnPerShrSign(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdEarnPerShrSign,msdEarnPerShrSign.length);
   	
   }
   
   public void setMsdEarnPerShrSign(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdEarnPerShrSign,msdEarnPerShrSign.length);
   	
   }
   
     /**
	 * 	Update MsdEarnPerShrSign 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdEarnPerShrSign(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdEarnPerShrSign+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdEarnPerShrSign with another Field
	 *	@param value
	 */
   public void setMsdEarnPerShrSign(Field source) {
       replace(source,0,source.length(),beginMsdEarnPerShrSign,MSD_EARN_PER_SHR_SIGN_LEN);
   	
   }  
   
     /**
	 * 	Update MsdEarnPerShrSign 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdEarnPerShrSign(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdEarnPerShrSign,MSD_EARN_PER_SHR_SIGN_LEN);
   	
   }
   
     /**
	 * 	Update MsdEarnPerShrSign 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdEarnPerShrSign(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdEarnPerShrSign+targetIndex,targetLen);
    
   }
	char[] msdEarnPerShrNeg88Value = "-".toCharArray();
	/**
	 *	Test condition "-" for isMsdEarnPerShrNeg()
	 *	@return  Returns true if isMsdEarnPerShrNeg() is "-"
	 */
   public boolean isMsdEarnPerShrNeg() throws CFException {
      return (  compareChars( getMsdEarnPerShrSign() , msdEarnPerShrNeg88Value)  == 0  );
   }


	/**
	*  set values "-"
	*/
   	public void setMsdEarnPerShrNegTrue() {  			
    	setMsdEarnPerShrSign( msdEarnPerShrNeg88Value);
   	}
	char[] msdEarnPerShrPos88Value = "+".toCharArray();
	/**
	 *	Test condition "+" for isMsdEarnPerShrPos()
	 *	@return  Returns true if isMsdEarnPerShrPos() is "+"
	 */
   public boolean isMsdEarnPerShrPos() throws CFException {
      return (  compareChars( getMsdEarnPerShrSign() , msdEarnPerShrPos88Value)  == 0  );
   }


	/**
	*  set values "+"
	*/
   	public void setMsdEarnPerShrPosTrue() {  			
    	setMsdEarnPerShrSign( msdEarnPerShrPos88Value);
   	}
	/**
	 *	Returns the value of msdEstimatedDiv
	 *	@return msdEstimatedDiv
	 */
	public BigDecimal getMsdEstimatedDiv() throws CFException {
       if (isMsdEstimatedDivModified()) { 
           msdEstimatedDiv = refreshMsdEstimatedDiv();
        }
   		return msdEstimatedDiv;
	}
	

	
	   
	/**
	 * 	Update MsdEstimatedDiv with the passed number
	 *  Corresponding COBOL Variable is MSD-ESTIMATED-DIV
	 *	@param number
	 */
	public void setMsdEstimatedDiv(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdEstimatedDiv = checkMsdEstimatedDivMaxLimit(number);
	    serializeMsdEstimatedDiv(msdEstimatedDiv);
   }
	/**
	 * 	Update MsdEstimatedDiv with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdEstimatedDiv(char[] value) throws CFException {
		 msdEstimatedDiv = serializeMsdEstimatedDiv(value);
	}   
	/**
	 *	Returns the value of msdStkProxyMtngDt
	 *	@return msdStkProxyMtngDt
	 */
	public long getMsdStkProxyMtngDt() throws CFException {
       if (isMsdStkProxyMtngDtModified()) { 
           msdStkProxyMtngDt = refreshMsdStkProxyMtngDt();
        }
   		return msdStkProxyMtngDt;
	}
	

	
	   
	/**
	 * 	Update MsdStkProxyMtngDt with the passed value
	 *  Corresponding COBOL Variable is MSD-STK-PROXY-MTNG-DT
	 *	@param number
	 */
	public void setMsdStkProxyMtngDt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdStkProxyMtngDt = checkMsdStkProxyMtngDtMaxLimit(number); 
		serializeMsdStkProxyMtngDt(msdStkProxyMtngDt);
	}
	

	/**
	 * 	Update MsdStkProxyMtngDt with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdStkProxyMtngDt(char[] value) throws CFException {
		 msdStkProxyMtngDt = serializeMsdStkProxyMtngDt(value);
	}
	/**
	 * 	Update MsdStkProxyMtngDt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdStkProxyMtngDtString(char[] value) throws CFException {
		 setMsdStkProxyMtngDt(value);
	}
	/**
	 *	Returns the value of msdStkProxyRecDt
	 *	@return msdStkProxyRecDt
	 */
	public long getMsdStkProxyRecDt() throws CFException {
       if (isMsdStkProxyRecDtModified()) { 
           msdStkProxyRecDt = refreshMsdStkProxyRecDt();
        }
   		return msdStkProxyRecDt;
	}
	

	
	   
	/**
	 * 	Update MsdStkProxyRecDt with the passed value
	 *  Corresponding COBOL Variable is MSD-STK-PROXY-REC-DT
	 *	@param number
	 */
	public void setMsdStkProxyRecDt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdStkProxyRecDt = checkMsdStkProxyRecDtMaxLimit(number); 
		serializeMsdStkProxyRecDt(msdStkProxyRecDt);
	}
	

	/**
	 * 	Update MsdStkProxyRecDt with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdStkProxyRecDt(char[] value) throws CFException {
		 msdStkProxyRecDt = serializeMsdStkProxyRecDt(value);
	}
	/**
	 * 	Update MsdStkProxyRecDt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdStkProxyRecDtString(char[] value) throws CFException {
		 setMsdStkProxyRecDt(value);
	}
	/**
	 *	Returns the value of msdWrntsExpMmddccyy
	 *	@return msdWrntsExpMmddccyy
	 */   
	 public MsdWrntsExpMmddccyy getMsdWrntsExpMmddccyy() {
   	return msdWrntsExpMmddccyy;
   }
   /**
	* 	Update MsdWrntsExpMmddccyy with the passed value
	*   Corresponding COBOL Variable is MSD-WRNTS-EXP-MMDDCCYY
	*	@param value
	*/
   public void setMsdWrntsExpMmddccyy(char[] value) {
      msdWrntsExpMmddccyy.setString(value); 
   }   
    
     /**
	 * 	Update MsdWrntsExpMmddccyy 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdWrntsExpMmddccyy(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdWrntsExpMmddccyy.begin,msdWrntsExpMmddccyy.length());
   }
   
     /**
	 * 	Update MsdWrntsExpMmddccyy 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdWrntsExpMmddccyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdWrntsExpMmddccyy.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdWrntsExpMmddccyy with another Field
	 *	@param value
	 */
   public void setMsdWrntsExpMmddccyy(Field source) {
   	replace(source,0,source.length(),msdWrntsExpMmddccyy.begin,msdWrntsExpMmddccyy.length());
   }  
   
     /**
	 * 	Update MsdWrntsExpMmddccyy 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdWrntsExpMmddccyy(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdWrntsExpMmddccyy.begin,msdWrntsExpMmddccyy.length());
   }
   
     /**
	 * 	Update MsdWrntsExpMmddccyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdWrntsExpMmddccyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdWrntsExpMmddccyy.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdPoisonPillInd
	 *	@return msdPoisonPillInd
	 */
   public char[] getMsdPoisonPillInd() throws CFException{
     if (isMsdPoisonPillIndModified()) { 
        msdPoisonPillInd = refreshMsdPoisonPillInd();
     }
   		return msdPoisonPillInd;
   }

  
	/**
	*  set variable msdPoisonPillInd
	*  Corresponding COBOL Variable is MSD-POISON-PILL-IND
	*  @param value
	**/
   public void setMsdPoisonPillInd(char[] value) {
      msdPoisonPillInd = checkMsdPoisonPillIndConstraints(value);
      serializeMsdPoisonPillInd(msdPoisonPillInd);
   } 

     /**
	 * 	Update MsdPoisonPillInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdPoisonPillInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdPoisonPillInd,msdPoisonPillInd.length);
   	
   }
   
   public void setMsdPoisonPillInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdPoisonPillInd,msdPoisonPillInd.length);
   	
   }
   
     /**
	 * 	Update MsdPoisonPillInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdPoisonPillInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdPoisonPillInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdPoisonPillInd with another Field
	 *	@param value
	 */
   public void setMsdPoisonPillInd(Field source) {
       replace(source,0,source.length(),beginMsdPoisonPillInd,MSD_POISON_PILL_IND_LEN);
   	
   }  
   
     /**
	 * 	Update MsdPoisonPillInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdPoisonPillInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdPoisonPillInd,MSD_POISON_PILL_IND_LEN);
   	
   }
   
     /**
	 * 	Update MsdPoisonPillInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdPoisonPillInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdPoisonPillInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01MeetingProxyDt
	 *	@return bdms01MeetingProxyDt
	 */
   public char[] getBdms01MeetingProxyDt() throws CFException{
     if (isBdms01MeetingProxyDtModified()) { 
        bdms01MeetingProxyDt = refreshBdms01MeetingProxyDt();
     }
   		return bdms01MeetingProxyDt;
   }

  
	/**
	*  set variable bdms01MeetingProxyDt
	*  Corresponding COBOL Variable is BDMS01-MEETING-PROXY-DT
	*  @param value
	**/
   public void setBdms01MeetingProxyDt(char[] value) {
      bdms01MeetingProxyDt = checkBdms01MeetingProxyDtConstraints(value);
      serializeBdms01MeetingProxyDt(bdms01MeetingProxyDt);
   } 

     /**
	 * 	Update Bdms01MeetingProxyDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01MeetingProxyDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01MeetingProxyDt,bdms01MeetingProxyDt.length);
   	
   }
   
   public void setBdms01MeetingProxyDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MeetingProxyDt,bdms01MeetingProxyDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01MeetingProxyDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MeetingProxyDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MeetingProxyDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01MeetingProxyDt with another Field
	 *	@param value
	 */
   public void setBdms01MeetingProxyDt(Field source) {
       replace(source,0,source.length(),beginBdms01MeetingProxyDt,BDMS_01_MEETING_PROXY_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01MeetingProxyDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01MeetingProxyDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01MeetingProxyDt,BDMS_01_MEETING_PROXY_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01MeetingProxyDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MeetingProxyDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MeetingProxyDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RecordProxyDt
	 *	@return bdms01RecordProxyDt
	 */
   public char[] getBdms01RecordProxyDt() throws CFException{
     if (isBdms01RecordProxyDtModified()) { 
        bdms01RecordProxyDt = refreshBdms01RecordProxyDt();
     }
   		return bdms01RecordProxyDt;
   }

  
	/**
	*  set variable bdms01RecordProxyDt
	*  Corresponding COBOL Variable is BDMS01-RECORD-PROXY-DT
	*  @param value
	**/
   public void setBdms01RecordProxyDt(char[] value) {
      bdms01RecordProxyDt = checkBdms01RecordProxyDtConstraints(value);
      serializeBdms01RecordProxyDt(bdms01RecordProxyDt);
   } 

     /**
	 * 	Update Bdms01RecordProxyDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RecordProxyDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RecordProxyDt,bdms01RecordProxyDt.length);
   	
   }
   
   public void setBdms01RecordProxyDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RecordProxyDt,bdms01RecordProxyDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01RecordProxyDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RecordProxyDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RecordProxyDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RecordProxyDt with another Field
	 *	@param value
	 */
   public void setBdms01RecordProxyDt(Field source) {
       replace(source,0,source.length(),beginBdms01RecordProxyDt,BDMS_01_RECORD_PROXY_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RecordProxyDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RecordProxyDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RecordProxyDt,BDMS_01_RECORD_PROXY_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RecordProxyDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RecordProxyDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RecordProxyDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01StkExpirationDt
	 *	@return bdms01StkExpirationDt
	 */
   public char[] getBdms01StkExpirationDt() throws CFException{
     if (isBdms01StkExpirationDtModified()) { 
        bdms01StkExpirationDt = refreshBdms01StkExpirationDt();
     }
   		return bdms01StkExpirationDt;
   }

  
	/**
	*  set variable bdms01StkExpirationDt
	*  Corresponding COBOL Variable is BDMS01-STK-EXPIRATION-DT
	*  @param value
	**/
   public void setBdms01StkExpirationDt(char[] value) {
      bdms01StkExpirationDt = checkBdms01StkExpirationDtConstraints(value);
      serializeBdms01StkExpirationDt(bdms01StkExpirationDt);
   } 

     /**
	 * 	Update Bdms01StkExpirationDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01StkExpirationDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01StkExpirationDt,bdms01StkExpirationDt.length);
   	
   }
   
   public void setBdms01StkExpirationDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StkExpirationDt,bdms01StkExpirationDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01StkExpirationDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StkExpirationDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StkExpirationDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01StkExpirationDt with another Field
	 *	@param value
	 */
   public void setBdms01StkExpirationDt(Field source) {
       replace(source,0,source.length(),beginBdms01StkExpirationDt,BDMS_01_STK_EXPIRATION_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01StkExpirationDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01StkExpirationDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01StkExpirationDt,BDMS_01_STK_EXPIRATION_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01StkExpirationDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StkExpirationDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StkExpirationDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01MasterLtdInd
	 *	@return bdms01MasterLtdInd
	 */
   public char[] getBdms01MasterLtdInd() throws CFException{
     if (isBdms01MasterLtdIndModified()) { 
        bdms01MasterLtdInd = refreshBdms01MasterLtdInd();
     }
   		return bdms01MasterLtdInd;
   }

  
	/**
	*  set variable bdms01MasterLtdInd
	*  Corresponding COBOL Variable is BDMS01-MASTER-LTD-IND
	*  @param value
	**/
   public void setBdms01MasterLtdInd(char[] value) {
      bdms01MasterLtdInd = checkBdms01MasterLtdIndConstraints(value);
      serializeBdms01MasterLtdInd(bdms01MasterLtdInd);
   } 

     /**
	 * 	Update Bdms01MasterLtdInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01MasterLtdInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01MasterLtdInd,bdms01MasterLtdInd.length);
   	
   }
   
   public void setBdms01MasterLtdInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MasterLtdInd,bdms01MasterLtdInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01MasterLtdInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MasterLtdInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MasterLtdInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01MasterLtdInd with another Field
	 *	@param value
	 */
   public void setBdms01MasterLtdInd(Field source) {
       replace(source,0,source.length(),beginBdms01MasterLtdInd,BDMS_01_MASTER_LTD_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01MasterLtdInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01MasterLtdInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01MasterLtdInd,BDMS_01_MASTER_LTD_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01MasterLtdInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MasterLtdInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MasterLtdInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdMlp
	 *	@return msdMlp
	 */
   public char[] getMsdMlp() throws CFException{
     if (isMsdMlpModified()) { 
        msdMlp = refreshMsdMlp();
     }
   		return msdMlp;
   }

  
	/**
	*  set variable msdMlp
	*  Corresponding COBOL Variable is MSD-MLP
	*  @param value
	**/
   public void setMsdMlp(char[] value) {
      msdMlp = checkMsdMlpConstraints(value);
      serializeMsdMlp(msdMlp);
   } 

     /**
	 * 	Update MsdMlp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdMlp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdMlp,msdMlp.length);
   	
   }
   
   public void setMsdMlp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdMlp,msdMlp.length);
   	
   }
   
     /**
	 * 	Update MsdMlp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdMlp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdMlp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdMlp with another Field
	 *	@param value
	 */
   public void setMsdMlp(Field source) {
       replace(source,0,source.length(),beginMsdMlp,MSD_MLP_LEN);
   	
   }  
   
     /**
	 * 	Update MsdMlp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdMlp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdMlp,MSD_MLP_LEN);
   	
   }
   
     /**
	 * 	Update MsdMlp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdMlp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdMlp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01MmfInd
	 *	@return bdms01MmfInd
	 */
   public char[] getBdms01MmfInd() throws CFException{
     if (isBdms01MmfIndModified()) { 
        bdms01MmfInd = refreshBdms01MmfInd();
     }
   		return bdms01MmfInd;
   }

  
	/**
	*  set variable bdms01MmfInd
	*  Corresponding COBOL Variable is BDMS01-MMF-IND
	*  @param value
	**/
   public void setBdms01MmfInd(char[] value) {
      bdms01MmfInd = checkBdms01MmfIndConstraints(value);
      serializeBdms01MmfInd(bdms01MmfInd);
   } 

     /**
	 * 	Update Bdms01MmfInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01MmfInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01MmfInd,bdms01MmfInd.length);
   	
   }
   
   public void setBdms01MmfInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MmfInd,bdms01MmfInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01MmfInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MmfInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MmfInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01MmfInd with another Field
	 *	@param value
	 */
   public void setBdms01MmfInd(Field source) {
       replace(source,0,source.length(),beginBdms01MmfInd,BDMS_01_MMF_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01MmfInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01MmfInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01MmfInd,BDMS_01_MMF_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01MmfInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MmfInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MmfInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01OpenFundCd
	 *	@return bdms01OpenFundCd
	 */
   public char[] getBdms01OpenFundCd() throws CFException{
     if (isBdms01OpenFundCdModified()) { 
        bdms01OpenFundCd = refreshBdms01OpenFundCd();
     }
   		return bdms01OpenFundCd;
   }

  
	/**
	*  set variable bdms01OpenFundCd
	*  Corresponding COBOL Variable is BDMS01-OPEN-FUND-CD
	*  @param value
	**/
   public void setBdms01OpenFundCd(char[] value) {
      bdms01OpenFundCd = checkBdms01OpenFundCdConstraints(value);
      serializeBdms01OpenFundCd(bdms01OpenFundCd);
   } 

     /**
	 * 	Update Bdms01OpenFundCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OpenFundCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OpenFundCd,bdms01OpenFundCd.length);
   	
   }
   
   public void setBdms01OpenFundCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OpenFundCd,bdms01OpenFundCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01OpenFundCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OpenFundCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OpenFundCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OpenFundCd with another Field
	 *	@param value
	 */
   public void setBdms01OpenFundCd(Field source) {
       replace(source,0,source.length(),beginBdms01OpenFundCd,BDMS_01_OPEN_FUND_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OpenFundCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OpenFundCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OpenFundCd,BDMS_01_OPEN_FUND_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OpenFundCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OpenFundCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OpenFundCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01LotTradeCd
	 *	@return bdms01LotTradeCd
	 */
   public char[] getBdms01LotTradeCd() throws CFException{
     if (isBdms01LotTradeCdModified()) { 
        bdms01LotTradeCd = refreshBdms01LotTradeCd();
     }
   		return bdms01LotTradeCd;
   }

  
	/**
	*  set variable bdms01LotTradeCd
	*  Corresponding COBOL Variable is BDMS01-LOT-TRADE-CD
	*  @param value
	**/
   public void setBdms01LotTradeCd(char[] value) {
      bdms01LotTradeCd = checkBdms01LotTradeCdConstraints(value);
      serializeBdms01LotTradeCd(bdms01LotTradeCd);
   } 

     /**
	 * 	Update Bdms01LotTradeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01LotTradeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01LotTradeCd,bdms01LotTradeCd.length);
   	
   }
   
   public void setBdms01LotTradeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01LotTradeCd,bdms01LotTradeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01LotTradeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01LotTradeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01LotTradeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01LotTradeCd with another Field
	 *	@param value
	 */
   public void setBdms01LotTradeCd(Field source) {
       replace(source,0,source.length(),beginBdms01LotTradeCd,BDMS_01_LOT_TRADE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01LotTradeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01LotTradeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01LotTradeCd,BDMS_01_LOT_TRADE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01LotTradeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01LotTradeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01LotTradeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01DvdndYldAmt
	 *	@return bdms01DvdndYldAmt
	 */
	public BigDecimal getBdms01DvdndYldAmt() throws CFException {
       if (isBdms01DvdndYldAmtModified()) { 
           bdms01DvdndYldAmt = refreshBdms01DvdndYldAmt();
        }
   		return bdms01DvdndYldAmt;
	}
	

	
	   
	/**
	 * 	Update Bdms01DvdndYldAmt with the passed number
	 *  Corresponding COBOL Variable is BDMS01-DVDND-YLD-AMT
	 *	@param number
	 */
	public void setBdms01DvdndYldAmt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01DvdndYldAmt = checkBdms01DvdndYldAmtMaxLimit(number);
	    serializeBdms01DvdndYldAmt(bdms01DvdndYldAmt);
   }
	/**
	 * 	Update Bdms01DvdndYldAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01DvdndYldAmt(char[] value) throws CFException {
		 bdms01DvdndYldAmt = serializeBdms01DvdndYldAmt(value);
	}   
	/**
	 *	Returns the value of bdms01ExpirationAmt
	 *	@return bdms01ExpirationAmt
	 */
	public BigDecimal getBdms01ExpirationAmt() throws CFException {
       if (isBdms01ExpirationAmtModified()) { 
           bdms01ExpirationAmt = refreshBdms01ExpirationAmt();
        }
   		return bdms01ExpirationAmt;
	}
	

	
	   
	/**
	 * 	Update Bdms01ExpirationAmt with the passed number
	 *  Corresponding COBOL Variable is BDMS01-EXPIRATION-AMT
	 *	@param number
	 */
	public void setBdms01ExpirationAmt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01ExpirationAmt = checkBdms01ExpirationAmtMaxLimit(number);
	    serializeBdms01ExpirationAmt(bdms01ExpirationAmt);
   }
	/**
	 * 	Update Bdms01ExpirationAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01ExpirationAmt(char[] value) throws CFException {
		 bdms01ExpirationAmt = serializeBdms01ExpirationAmt(value);
	}   
	/**
	 *	Returns the value of bdms01AdrInd
	 *	@return bdms01AdrInd
	 */
   public char[] getBdms01AdrInd() throws CFException{
     if (isBdms01AdrIndModified()) { 
        bdms01AdrInd = refreshBdms01AdrInd();
     }
   		return bdms01AdrInd;
   }

  
	/**
	*  set variable bdms01AdrInd
	*  Corresponding COBOL Variable is BDMS01-ADR-IND
	*  @param value
	**/
   public void setBdms01AdrInd(char[] value) {
      bdms01AdrInd = checkBdms01AdrIndConstraints(value);
      serializeBdms01AdrInd(bdms01AdrInd);
   } 

     /**
	 * 	Update Bdms01AdrInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01AdrInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01AdrInd,bdms01AdrInd.length);
   	
   }
   
   public void setBdms01AdrInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AdrInd,bdms01AdrInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01AdrInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AdrInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AdrInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01AdrInd with another Field
	 *	@param value
	 */
   public void setBdms01AdrInd(Field source) {
       replace(source,0,source.length(),beginBdms01AdrInd,BDMS_01_ADR_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01AdrInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01AdrInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01AdrInd,BDMS_01_ADR_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01AdrInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AdrInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AdrInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01GdrInd
	 *	@return bdms01GdrInd
	 */
   public char[] getBdms01GdrInd() throws CFException{
     if (isBdms01GdrIndModified()) { 
        bdms01GdrInd = refreshBdms01GdrInd();
     }
   		return bdms01GdrInd;
   }

  
	/**
	*  set variable bdms01GdrInd
	*  Corresponding COBOL Variable is BDMS01-GDR-IND
	*  @param value
	**/
   public void setBdms01GdrInd(char[] value) {
      bdms01GdrInd = checkBdms01GdrIndConstraints(value);
      serializeBdms01GdrInd(bdms01GdrInd);
   } 

     /**
	 * 	Update Bdms01GdrInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01GdrInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01GdrInd,bdms01GdrInd.length);
   	
   }
   
   public void setBdms01GdrInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GdrInd,bdms01GdrInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01GdrInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GdrInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GdrInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01GdrInd with another Field
	 *	@param value
	 */
   public void setBdms01GdrInd(Field source) {
       replace(source,0,source.length(),beginBdms01GdrInd,BDMS_01_GDR_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01GdrInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01GdrInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01GdrInd,BDMS_01_GDR_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01GdrInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GdrInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GdrInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PsnplCd
	 *	@return bdms01PsnplCd
	 */
   public char[] getBdms01PsnplCd() throws CFException{
     if (isBdms01PsnplCdModified()) { 
        bdms01PsnplCd = refreshBdms01PsnplCd();
     }
   		return bdms01PsnplCd;
   }

  
	/**
	*  set variable bdms01PsnplCd
	*  Corresponding COBOL Variable is BDMS01-PSNPL-CD
	*  @param value
	**/
   public void setBdms01PsnplCd(char[] value) {
      bdms01PsnplCd = checkBdms01PsnplCdConstraints(value);
      serializeBdms01PsnplCd(bdms01PsnplCd);
   } 

     /**
	 * 	Update Bdms01PsnplCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PsnplCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PsnplCd,bdms01PsnplCd.length);
   	
   }
   
   public void setBdms01PsnplCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PsnplCd,bdms01PsnplCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PsnplCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PsnplCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PsnplCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PsnplCd with another Field
	 *	@param value
	 */
   public void setBdms01PsnplCd(Field source) {
       replace(source,0,source.length(),beginBdms01PsnplCd,BDMS_01_PSNPL_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PsnplCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PsnplCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PsnplCd,BDMS_01_PSNPL_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PsnplCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PsnplCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PsnplCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PrfrdInd
	 *	@return bdms01PrfrdInd
	 */
   public char[] getBdms01PrfrdInd() throws CFException{
     if (isBdms01PrfrdIndModified()) { 
        bdms01PrfrdInd = refreshBdms01PrfrdInd();
     }
   		return bdms01PrfrdInd;
   }

  
	/**
	*  set variable bdms01PrfrdInd
	*  Corresponding COBOL Variable is BDMS01-PRFRD-IND
	*  @param value
	**/
   public void setBdms01PrfrdInd(char[] value) {
      bdms01PrfrdInd = checkBdms01PrfrdIndConstraints(value);
      serializeBdms01PrfrdInd(bdms01PrfrdInd);
   } 

     /**
	 * 	Update Bdms01PrfrdInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PrfrdInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PrfrdInd,bdms01PrfrdInd.length);
   	
   }
   
   public void setBdms01PrfrdInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrfrdInd,bdms01PrfrdInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PrfrdInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrfrdInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrfrdInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PrfrdInd with another Field
	 *	@param value
	 */
   public void setBdms01PrfrdInd(Field source) {
       replace(source,0,source.length(),beginBdms01PrfrdInd,BDMS_01_PRFRD_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PrfrdInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PrfrdInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PrfrdInd,BDMS_01_PRFRD_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PrfrdInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrfrdInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrfrdInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01DivCumInd
	 *	@return bdms01DivCumInd
	 */
   public char[] getBdms01DivCumInd() throws CFException{
     if (isBdms01DivCumIndModified()) { 
        bdms01DivCumInd = refreshBdms01DivCumInd();
     }
   		return bdms01DivCumInd;
   }

  
	/**
	*  set variable bdms01DivCumInd
	*  Corresponding COBOL Variable is BDMS01-DIV-CUM-IND
	*  @param value
	**/
   public void setBdms01DivCumInd(char[] value) {
      bdms01DivCumInd = checkBdms01DivCumIndConstraints(value);
      serializeBdms01DivCumInd(bdms01DivCumInd);
   } 

     /**
	 * 	Update Bdms01DivCumInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01DivCumInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01DivCumInd,bdms01DivCumInd.length);
   	
   }
   
   public void setBdms01DivCumInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DivCumInd,bdms01DivCumInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01DivCumInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DivCumInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DivCumInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01DivCumInd with another Field
	 *	@param value
	 */
   public void setBdms01DivCumInd(Field source) {
       replace(source,0,source.length(),beginBdms01DivCumInd,BDMS_01_DIV_CUM_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01DivCumInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01DivCumInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01DivCumInd,BDMS_01_DIV_CUM_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01DivCumInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DivCumInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DivCumInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01FreqIncmDebtCd
	 *	@return bdms01FreqIncmDebtCd
	 */
   public char[] getBdms01FreqIncmDebtCd() throws CFException{
     if (isBdms01FreqIncmDebtCdModified()) { 
        bdms01FreqIncmDebtCd = refreshBdms01FreqIncmDebtCd();
     }
   		return bdms01FreqIncmDebtCd;
   }

  
	/**
	*  set variable bdms01FreqIncmDebtCd
	*  Corresponding COBOL Variable is BDMS01-FREQ-INCM-DEBT-CD
	*  @param value
	**/
   public void setBdms01FreqIncmDebtCd(char[] value) {
      bdms01FreqIncmDebtCd = checkBdms01FreqIncmDebtCdConstraints(value);
      serializeBdms01FreqIncmDebtCd(bdms01FreqIncmDebtCd);
   } 

     /**
	 * 	Update Bdms01FreqIncmDebtCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01FreqIncmDebtCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01FreqIncmDebtCd,bdms01FreqIncmDebtCd.length);
   	
   }
   
   public void setBdms01FreqIncmDebtCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FreqIncmDebtCd,bdms01FreqIncmDebtCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01FreqIncmDebtCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FreqIncmDebtCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FreqIncmDebtCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01FreqIncmDebtCd with another Field
	 *	@param value
	 */
   public void setBdms01FreqIncmDebtCd(Field source) {
       replace(source,0,source.length(),beginBdms01FreqIncmDebtCd,BDMS_01_FREQ_INCM_DEBT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01FreqIncmDebtCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01FreqIncmDebtCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01FreqIncmDebtCd,BDMS_01_FREQ_INCM_DEBT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01FreqIncmDebtCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FreqIncmDebtCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FreqIncmDebtCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CallDt
	 *	@return bdms01CallDt
	 */
   public char[] getBdms01CallDt() throws CFException{
     if (isBdms01CallDtModified()) { 
        bdms01CallDt = refreshBdms01CallDt();
     }
   		return bdms01CallDt;
   }

  
	/**
	*  set variable bdms01CallDt
	*  Corresponding COBOL Variable is BDMS01-CALL-DT
	*  @param value
	**/
   public void setBdms01CallDt(char[] value) {
      bdms01CallDt = checkBdms01CallDtConstraints(value);
      serializeBdms01CallDt(bdms01CallDt);
   } 

     /**
	 * 	Update Bdms01CallDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CallDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CallDt,bdms01CallDt.length);
   	
   }
   
   public void setBdms01CallDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallDt,bdms01CallDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01CallDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CallDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CallDt with another Field
	 *	@param value
	 */
   public void setBdms01CallDt(Field source) {
       replace(source,0,source.length(),beginBdms01CallDt,BDMS_01_CALL_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CallDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CallDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CallDt,BDMS_01_CALL_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CallDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CallDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CallAmt
	 *	@return bdms01CallAmt
	 */
	public BigDecimal getBdms01CallAmt() throws CFException {
       if (isBdms01CallAmtModified()) { 
           bdms01CallAmt = refreshBdms01CallAmt();
        }
   		return bdms01CallAmt;
	}
	

	
	   
	/**
	 * 	Update Bdms01CallAmt with the passed number
	 *  Corresponding COBOL Variable is BDMS01-CALL-AMT
	 *	@param number
	 */
	public void setBdms01CallAmt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01CallAmt = checkBdms01CallAmtMaxLimit(number);
	    serializeBdms01CallAmt(bdms01CallAmt);
   }
	/**
	 * 	Update Bdms01CallAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01CallAmt(char[] value) throws CFException {
		 bdms01CallAmt = serializeBdms01CallAmt(value);
	}   
	/**
	 *	Returns the value of bdms01DvdndAnnlAmt
	 *	@return bdms01DvdndAnnlAmt
	 */
	public BigDecimal getBdms01DvdndAnnlAmt() throws CFException {
       if (isBdms01DvdndAnnlAmtModified()) { 
           bdms01DvdndAnnlAmt = refreshBdms01DvdndAnnlAmt();
        }
   		return bdms01DvdndAnnlAmt;
	}
	

	
	   
	/**
	 * 	Update Bdms01DvdndAnnlAmt with the passed number
	 *  Corresponding COBOL Variable is BDMS01-DVDND-ANNL-AMT
	 *	@param number
	 */
	public void setBdms01DvdndAnnlAmt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01DvdndAnnlAmt = checkBdms01DvdndAnnlAmtMaxLimit(number);
	    serializeBdms01DvdndAnnlAmt(bdms01DvdndAnnlAmt);
   }
	/**
	 * 	Update Bdms01DvdndAnnlAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01DvdndAnnlAmt(char[] value) throws CFException {
		 bdms01DvdndAnnlAmt = serializeBdms01DvdndAnnlAmt(value);
	}   
	/**
	 *	Returns the value of bdms01DvdndAnnlPct
	 *	@return bdms01DvdndAnnlPct
	 */
	public BigDecimal getBdms01DvdndAnnlPct() throws CFException {
       if (isBdms01DvdndAnnlPctModified()) { 
           bdms01DvdndAnnlPct = refreshBdms01DvdndAnnlPct();
        }
   		return bdms01DvdndAnnlPct;
	}
	

	
	   
	/**
	 * 	Update Bdms01DvdndAnnlPct with the passed number
	 *  Corresponding COBOL Variable is BDMS01-DVDND-ANNL-PCT
	 *	@param number
	 */
	public void setBdms01DvdndAnnlPct(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01DvdndAnnlPct = checkBdms01DvdndAnnlPctMaxLimit(number);
	    serializeBdms01DvdndAnnlPct(bdms01DvdndAnnlPct);
   }
	/**
	 * 	Update Bdms01DvdndAnnlPct with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01DvdndAnnlPct(char[] value) throws CFException {
		 bdms01DvdndAnnlPct = serializeBdms01DvdndAnnlPct(value);
	}   
	/**
	 *	Returns the value of bdms01PrtcpInd
	 *	@return bdms01PrtcpInd
	 */
   public char[] getBdms01PrtcpInd() throws CFException{
     if (isBdms01PrtcpIndModified()) { 
        bdms01PrtcpInd = refreshBdms01PrtcpInd();
     }
   		return bdms01PrtcpInd;
   }

  
	/**
	*  set variable bdms01PrtcpInd
	*  Corresponding COBOL Variable is BDMS01-PRTCP-IND
	*  @param value
	**/
   public void setBdms01PrtcpInd(char[] value) {
      bdms01PrtcpInd = checkBdms01PrtcpIndConstraints(value);
      serializeBdms01PrtcpInd(bdms01PrtcpInd);
   } 

     /**
	 * 	Update Bdms01PrtcpInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PrtcpInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PrtcpInd,bdms01PrtcpInd.length);
   	
   }
   
   public void setBdms01PrtcpInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrtcpInd,bdms01PrtcpInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PrtcpInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrtcpInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrtcpInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PrtcpInd with another Field
	 *	@param value
	 */
   public void setBdms01PrtcpInd(Field source) {
       replace(source,0,source.length(),beginBdms01PrtcpInd,BDMS_01_PRTCP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PrtcpInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PrtcpInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PrtcpInd,BDMS_01_PRTCP_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PrtcpInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrtcpInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrtcpInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01VoteRghtsInd
	 *	@return bdms01VoteRghtsInd
	 */
   public char[] getBdms01VoteRghtsInd() throws CFException{
     if (isBdms01VoteRghtsIndModified()) { 
        bdms01VoteRghtsInd = refreshBdms01VoteRghtsInd();
     }
   		return bdms01VoteRghtsInd;
   }

  
	/**
	*  set variable bdms01VoteRghtsInd
	*  Corresponding COBOL Variable is BDMS01-VOTE-RGHTS-IND
	*  @param value
	**/
   public void setBdms01VoteRghtsInd(char[] value) {
      bdms01VoteRghtsInd = checkBdms01VoteRghtsIndConstraints(value);
      serializeBdms01VoteRghtsInd(bdms01VoteRghtsInd);
   } 

     /**
	 * 	Update Bdms01VoteRghtsInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01VoteRghtsInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01VoteRghtsInd,bdms01VoteRghtsInd.length);
   	
   }
   
   public void setBdms01VoteRghtsInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01VoteRghtsInd,bdms01VoteRghtsInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01VoteRghtsInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01VoteRghtsInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01VoteRghtsInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01VoteRghtsInd with another Field
	 *	@param value
	 */
   public void setBdms01VoteRghtsInd(Field source) {
       replace(source,0,source.length(),beginBdms01VoteRghtsInd,BDMS_01_VOTE_RGHTS_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01VoteRghtsInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01VoteRghtsInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01VoteRghtsInd,BDMS_01_VOTE_RGHTS_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01VoteRghtsInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01VoteRghtsInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01VoteRghtsInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ScrtyAdpRstrNbr
	 *	@return bdms01ScrtyAdpRstrNbr
	 */
   public char[] getBdms01ScrtyAdpRstrNbr() throws CFException{
     if (isBdms01ScrtyAdpRstrNbrModified()) { 
        bdms01ScrtyAdpRstrNbr = refreshBdms01ScrtyAdpRstrNbr();
     }
   		return bdms01ScrtyAdpRstrNbr;
   }

  
	/**
	*  set variable bdms01ScrtyAdpRstrNbr
	*  Corresponding COBOL Variable is BDMS01-SCRTY-ADP-RSTR-NBR
	*  @param value
	**/
   public void setBdms01ScrtyAdpRstrNbr(char[] value) {
      bdms01ScrtyAdpRstrNbr = checkBdms01ScrtyAdpRstrNbrConstraints(value);
      serializeBdms01ScrtyAdpRstrNbr(bdms01ScrtyAdpRstrNbr);
   } 

     /**
	 * 	Update Bdms01ScrtyAdpRstrNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ScrtyAdpRstrNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ScrtyAdpRstrNbr,bdms01ScrtyAdpRstrNbr.length);
   	
   }
   
   public void setBdms01ScrtyAdpRstrNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ScrtyAdpRstrNbr,bdms01ScrtyAdpRstrNbr.length);
   	
   }
   
     /**
	 * 	Update Bdms01ScrtyAdpRstrNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ScrtyAdpRstrNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ScrtyAdpRstrNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ScrtyAdpRstrNbr with another Field
	 *	@param value
	 */
   public void setBdms01ScrtyAdpRstrNbr(Field source) {
       replace(source,0,source.length(),beginBdms01ScrtyAdpRstrNbr,BDMS_01_SCRTY_ADP_RSTR_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ScrtyAdpRstrNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ScrtyAdpRstrNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ScrtyAdpRstrNbr,BDMS_01_SCRTY_ADP_RSTR_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ScrtyAdpRstrNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ScrtyAdpRstrNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ScrtyAdpRstrNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01UtsCanadianCd
	 *	@return bdms01UtsCanadianCd
	 */
   public char[] getBdms01UtsCanadianCd() throws CFException{
     if (isBdms01UtsCanadianCdModified()) { 
        bdms01UtsCanadianCd = refreshBdms01UtsCanadianCd();
     }
   		return bdms01UtsCanadianCd;
   }

  
	/**
	*  set variable bdms01UtsCanadianCd
	*  Corresponding COBOL Variable is BDMS01-UTS-CANADIAN-CD
	*  @param value
	**/
   public void setBdms01UtsCanadianCd(char[] value) {
      bdms01UtsCanadianCd = checkBdms01UtsCanadianCdConstraints(value);
      serializeBdms01UtsCanadianCd(bdms01UtsCanadianCd);
   } 

     /**
	 * 	Update Bdms01UtsCanadianCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01UtsCanadianCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01UtsCanadianCd,bdms01UtsCanadianCd.length);
   	
   }
   
   public void setBdms01UtsCanadianCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UtsCanadianCd,bdms01UtsCanadianCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01UtsCanadianCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UtsCanadianCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UtsCanadianCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01UtsCanadianCd with another Field
	 *	@param value
	 */
   public void setBdms01UtsCanadianCd(Field source) {
       replace(source,0,source.length(),beginBdms01UtsCanadianCd,BDMS_01_UTS_CANADIAN_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01UtsCanadianCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01UtsCanadianCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01UtsCanadianCd,BDMS_01_UTS_CANADIAN_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01UtsCanadianCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UtsCanadianCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UtsCanadianCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01WarrantsIndexInd
	 *	@return bdms01WarrantsIndexInd
	 */
   public char[] getBdms01WarrantsIndexInd() throws CFException{
     if (isBdms01WarrantsIndexIndModified()) { 
        bdms01WarrantsIndexInd = refreshBdms01WarrantsIndexInd();
     }
   		return bdms01WarrantsIndexInd;
   }

  
	/**
	*  set variable bdms01WarrantsIndexInd
	*  Corresponding COBOL Variable is BDMS01-WARRANTS-INDEX-IND
	*  @param value
	**/
   public void setBdms01WarrantsIndexInd(char[] value) {
      bdms01WarrantsIndexInd = checkBdms01WarrantsIndexIndConstraints(value);
      serializeBdms01WarrantsIndexInd(bdms01WarrantsIndexInd);
   } 

     /**
	 * 	Update Bdms01WarrantsIndexInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01WarrantsIndexInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01WarrantsIndexInd,bdms01WarrantsIndexInd.length);
   	
   }
   
   public void setBdms01WarrantsIndexInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01WarrantsIndexInd,bdms01WarrantsIndexInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01WarrantsIndexInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01WarrantsIndexInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01WarrantsIndexInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01WarrantsIndexInd with another Field
	 *	@param value
	 */
   public void setBdms01WarrantsIndexInd(Field source) {
       replace(source,0,source.length(),beginBdms01WarrantsIndexInd,BDMS_01_WARRANTS_INDEX_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01WarrantsIndexInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01WarrantsIndexInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01WarrantsIndexInd,BDMS_01_WARRANTS_INDEX_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01WarrantsIndexInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01WarrantsIndexInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01WarrantsIndexInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdMidsQids
	 *	@return msdMidsQids
	 */
   public char[] getMsdMidsQids() throws CFException{
     if (isMsdMidsQidsModified()) { 
        msdMidsQids = refreshMsdMidsQids();
     }
   		return msdMidsQids;
   }

  
	/**
	*  set variable msdMidsQids
	*  Corresponding COBOL Variable is MSD-MIDS-QIDS
	*  @param value
	**/
   public void setMsdMidsQids(char[] value) {
      msdMidsQids = checkMsdMidsQidsConstraints(value);
      serializeMsdMidsQids(msdMidsQids);
   } 

     /**
	 * 	Update MsdMidsQids 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdMidsQids(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdMidsQids,msdMidsQids.length);
   	
   }
   
   public void setMsdMidsQids(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdMidsQids,msdMidsQids.length);
   	
   }
   
     /**
	 * 	Update MsdMidsQids 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdMidsQids(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdMidsQids+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdMidsQids with another Field
	 *	@param value
	 */
   public void setMsdMidsQids(Field source) {
       replace(source,0,source.length(),beginMsdMidsQids,MSD_MIDS_QIDS_LEN);
   	
   }  
   
     /**
	 * 	Update MsdMidsQids 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdMidsQids(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdMidsQids,MSD_MIDS_QIDS_LEN);
   	
   }
   
     /**
	 * 	Update MsdMidsQids 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdMidsQids(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdMidsQids+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01EtfInd
	 *	@return bdms01EtfInd
	 */
   public char[] getBdms01EtfInd() throws CFException{
     if (isBdms01EtfIndModified()) { 
        bdms01EtfInd = refreshBdms01EtfInd();
     }
   		return bdms01EtfInd;
   }

  
	/**
	*  set variable bdms01EtfInd
	*  Corresponding COBOL Variable is BDMS01-ETF-IND
	*  @param value
	**/
   public void setBdms01EtfInd(char[] value) {
      bdms01EtfInd = checkBdms01EtfIndConstraints(value);
      serializeBdms01EtfInd(bdms01EtfInd);
   } 

     /**
	 * 	Update Bdms01EtfInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01EtfInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01EtfInd,bdms01EtfInd.length);
   	
   }
   
   public void setBdms01EtfInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EtfInd,bdms01EtfInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01EtfInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01EtfInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EtfInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01EtfInd with another Field
	 *	@param value
	 */
   public void setBdms01EtfInd(Field source) {
       replace(source,0,source.length(),beginBdms01EtfInd,BDMS_01_ETF_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01EtfInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01EtfInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01EtfInd,BDMS_01_ETF_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01EtfInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01EtfInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EtfInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SmallCptlInd
	 *	@return bdms01SmallCptlInd
	 */
   public char[] getBdms01SmallCptlInd() throws CFException{
     if (isBdms01SmallCptlIndModified()) { 
        bdms01SmallCptlInd = refreshBdms01SmallCptlInd();
     }
   		return bdms01SmallCptlInd;
   }

  
	/**
	*  set variable bdms01SmallCptlInd
	*  Corresponding COBOL Variable is BDMS01-SMALL-CPTL-IND
	*  @param value
	**/
   public void setBdms01SmallCptlInd(char[] value) {
      bdms01SmallCptlInd = checkBdms01SmallCptlIndConstraints(value);
      serializeBdms01SmallCptlInd(bdms01SmallCptlInd);
   } 

     /**
	 * 	Update Bdms01SmallCptlInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SmallCptlInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SmallCptlInd,bdms01SmallCptlInd.length);
   	
   }
   
   public void setBdms01SmallCptlInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SmallCptlInd,bdms01SmallCptlInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SmallCptlInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SmallCptlInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SmallCptlInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SmallCptlInd with another Field
	 *	@param value
	 */
   public void setBdms01SmallCptlInd(Field source) {
       replace(source,0,source.length(),beginBdms01SmallCptlInd,BDMS_01_SMALL_CPTL_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SmallCptlInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SmallCptlInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SmallCptlInd,BDMS_01_SMALL_CPTL_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SmallCptlInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SmallCptlInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SmallCptlInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ExmptUptckInd
	 *	@return bdms01ExmptUptckInd
	 */
   public char[] getBdms01ExmptUptckInd() throws CFException{
     if (isBdms01ExmptUptckIndModified()) { 
        bdms01ExmptUptckInd = refreshBdms01ExmptUptckInd();
     }
   		return bdms01ExmptUptckInd;
   }

  
	/**
	*  set variable bdms01ExmptUptckInd
	*  Corresponding COBOL Variable is BDMS01-EXMPT-UPTCK-IND
	*  @param value
	**/
   public void setBdms01ExmptUptckInd(char[] value) {
      bdms01ExmptUptckInd = checkBdms01ExmptUptckIndConstraints(value);
      serializeBdms01ExmptUptckInd(bdms01ExmptUptckInd);
   } 

     /**
	 * 	Update Bdms01ExmptUptckInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ExmptUptckInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ExmptUptckInd,bdms01ExmptUptckInd.length);
   	
   }
   
   public void setBdms01ExmptUptckInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ExmptUptckInd,bdms01ExmptUptckInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01ExmptUptckInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ExmptUptckInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ExmptUptckInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ExmptUptckInd with another Field
	 *	@param value
	 */
   public void setBdms01ExmptUptckInd(Field source) {
       replace(source,0,source.length(),beginBdms01ExmptUptckInd,BDMS_01_EXMPT_UPTCK_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ExmptUptckInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ExmptUptckInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ExmptUptckInd,BDMS_01_EXMPT_UPTCK_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ExmptUptckInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ExmptUptckInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ExmptUptckInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RegShoElgblInd
	 *	@return bdms01RegShoElgblInd
	 */
   public char[] getBdms01RegShoElgblInd() throws CFException{
     if (isBdms01RegShoElgblIndModified()) { 
        bdms01RegShoElgblInd = refreshBdms01RegShoElgblInd();
     }
   		return bdms01RegShoElgblInd;
   }

  
	/**
	*  set variable bdms01RegShoElgblInd
	*  Corresponding COBOL Variable is BDMS01-REG-SHO-ELGBL-IND
	*  @param value
	**/
   public void setBdms01RegShoElgblInd(char[] value) {
      bdms01RegShoElgblInd = checkBdms01RegShoElgblIndConstraints(value);
      serializeBdms01RegShoElgblInd(bdms01RegShoElgblInd);
   } 

     /**
	 * 	Update Bdms01RegShoElgblInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RegShoElgblInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RegShoElgblInd,bdms01RegShoElgblInd.length);
   	
   }
   
   public void setBdms01RegShoElgblInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RegShoElgblInd,bdms01RegShoElgblInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01RegShoElgblInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RegShoElgblInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RegShoElgblInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RegShoElgblInd with another Field
	 *	@param value
	 */
   public void setBdms01RegShoElgblInd(Field source) {
       replace(source,0,source.length(),beginBdms01RegShoElgblInd,BDMS_01_REG_SHO_ELGBL_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RegShoElgblInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RegShoElgblInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RegShoElgblInd,BDMS_01_REG_SHO_ELGBL_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RegShoElgblInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RegShoElgblInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RegShoElgblInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RegShoElgblDt
	 *	@return bdms01RegShoElgblDt
	 */
   public char[] getBdms01RegShoElgblDt() throws CFException{
     if (isBdms01RegShoElgblDtModified()) { 
        bdms01RegShoElgblDt = refreshBdms01RegShoElgblDt();
     }
   		return bdms01RegShoElgblDt;
   }

  
	/**
	*  set variable bdms01RegShoElgblDt
	*  Corresponding COBOL Variable is BDMS01-REG-SHO-ELGBL-DT
	*  @param value
	**/
   public void setBdms01RegShoElgblDt(char[] value) {
      bdms01RegShoElgblDt = checkBdms01RegShoElgblDtConstraints(value);
      serializeBdms01RegShoElgblDt(bdms01RegShoElgblDt);
   } 

     /**
	 * 	Update Bdms01RegShoElgblDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RegShoElgblDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RegShoElgblDt,bdms01RegShoElgblDt.length);
   	
   }
   
   public void setBdms01RegShoElgblDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RegShoElgblDt,bdms01RegShoElgblDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01RegShoElgblDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RegShoElgblDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RegShoElgblDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RegShoElgblDt with another Field
	 *	@param value
	 */
   public void setBdms01RegShoElgblDt(Field source) {
       replace(source,0,source.length(),beginBdms01RegShoElgblDt,BDMS_01_REG_SHO_ELGBL_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RegShoElgblDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RegShoElgblDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RegShoElgblDt,BDMS_01_REG_SHO_ELGBL_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RegShoElgblDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RegShoElgblDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RegShoElgblDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01MfFamilyNbr
	 *	@return bdms01MfFamilyNbr
	 */
   public char[] getBdms01MfFamilyNbr() throws CFException{
     if (isBdms01MfFamilyNbrModified()) { 
        bdms01MfFamilyNbr = refreshBdms01MfFamilyNbr();
     }
   		return bdms01MfFamilyNbr;
   }

  
	/**
	*  set variable bdms01MfFamilyNbr
	*  Corresponding COBOL Variable is BDMS01-MF-FAMILY-NBR
	*  @param value
	**/
   public void setBdms01MfFamilyNbr(char[] value) {
      bdms01MfFamilyNbr = checkBdms01MfFamilyNbrConstraints(value);
      serializeBdms01MfFamilyNbr(bdms01MfFamilyNbr);
   } 

     /**
	 * 	Update Bdms01MfFamilyNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01MfFamilyNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01MfFamilyNbr,bdms01MfFamilyNbr.length);
   	
   }
   
   public void setBdms01MfFamilyNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MfFamilyNbr,bdms01MfFamilyNbr.length);
   	
   }
   
     /**
	 * 	Update Bdms01MfFamilyNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MfFamilyNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MfFamilyNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01MfFamilyNbr with another Field
	 *	@param value
	 */
   public void setBdms01MfFamilyNbr(Field source) {
       replace(source,0,source.length(),beginBdms01MfFamilyNbr,BDMS_01_MF_FAMILY_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01MfFamilyNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01MfFamilyNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01MfFamilyNbr,BDMS_01_MF_FAMILY_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01MfFamilyNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MfFamilyNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MfFamilyNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ShrClassCd
	 *	@return bdms01ShrClassCd
	 */
   public char[] getBdms01ShrClassCd() throws CFException{
     if (isBdms01ShrClassCdModified()) { 
        bdms01ShrClassCd = refreshBdms01ShrClassCd();
     }
   		return bdms01ShrClassCd;
   }

  
	/**
	*  set variable bdms01ShrClassCd
	*  Corresponding COBOL Variable is BDMS01-SHR-CLASS-CD
	*  @param value
	**/
   public void setBdms01ShrClassCd(char[] value) {
      bdms01ShrClassCd = checkBdms01ShrClassCdConstraints(value);
      serializeBdms01ShrClassCd(bdms01ShrClassCd);
   } 

     /**
	 * 	Update Bdms01ShrClassCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ShrClassCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ShrClassCd,bdms01ShrClassCd.length);
   	
   }
   
   public void setBdms01ShrClassCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ShrClassCd,bdms01ShrClassCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01ShrClassCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ShrClassCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ShrClassCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ShrClassCd with another Field
	 *	@param value
	 */
   public void setBdms01ShrClassCd(Field source) {
       replace(source,0,source.length(),beginBdms01ShrClassCd,BDMS_01_SHR_CLASS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ShrClassCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ShrClassCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ShrClassCd,BDMS_01_SHR_CLASS_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ShrClassCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ShrClassCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ShrClassCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RegShoInelgblDt
	 *	@return bdms01RegShoInelgblDt
	 */
   public char[] getBdms01RegShoInelgblDt() throws CFException{
     if (isBdms01RegShoInelgblDtModified()) { 
        bdms01RegShoInelgblDt = refreshBdms01RegShoInelgblDt();
     }
   		return bdms01RegShoInelgblDt;
   }

  
	/**
	*  set variable bdms01RegShoInelgblDt
	*  Corresponding COBOL Variable is BDMS01-REG-SHO-INELGBL-DT
	*  @param value
	**/
   public void setBdms01RegShoInelgblDt(char[] value) {
      bdms01RegShoInelgblDt = checkBdms01RegShoInelgblDtConstraints(value);
      serializeBdms01RegShoInelgblDt(bdms01RegShoInelgblDt);
   } 

     /**
	 * 	Update Bdms01RegShoInelgblDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RegShoInelgblDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RegShoInelgblDt,bdms01RegShoInelgblDt.length);
   	
   }
   
   public void setBdms01RegShoInelgblDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RegShoInelgblDt,bdms01RegShoInelgblDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01RegShoInelgblDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RegShoInelgblDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RegShoInelgblDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RegShoInelgblDt with another Field
	 *	@param value
	 */
   public void setBdms01RegShoInelgblDt(Field source) {
       replace(source,0,source.length(),beginBdms01RegShoInelgblDt,BDMS_01_REG_SHO_INELGBL_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RegShoInelgblDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RegShoInelgblDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RegShoInelgblDt,BDMS_01_REG_SHO_INELGBL_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RegShoInelgblDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RegShoInelgblDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RegShoInelgblDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01MfLoadTypeCd
	 *	@return bdms01MfLoadTypeCd
	 */
   public char[] getBdms01MfLoadTypeCd() throws CFException{
     if (isBdms01MfLoadTypeCdModified()) { 
        bdms01MfLoadTypeCd = refreshBdms01MfLoadTypeCd();
     }
   		return bdms01MfLoadTypeCd;
   }

  
	/**
	*  set variable bdms01MfLoadTypeCd
	*  Corresponding COBOL Variable is BDMS01-MF-LOAD-TYPE-CD
	*  @param value
	**/
   public void setBdms01MfLoadTypeCd(char[] value) {
      bdms01MfLoadTypeCd = checkBdms01MfLoadTypeCdConstraints(value);
      serializeBdms01MfLoadTypeCd(bdms01MfLoadTypeCd);
   } 

     /**
	 * 	Update Bdms01MfLoadTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01MfLoadTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01MfLoadTypeCd,bdms01MfLoadTypeCd.length);
   	
   }
   
   public void setBdms01MfLoadTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MfLoadTypeCd,bdms01MfLoadTypeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01MfLoadTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MfLoadTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MfLoadTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01MfLoadTypeCd with another Field
	 *	@param value
	 */
   public void setBdms01MfLoadTypeCd(Field source) {
       replace(source,0,source.length(),beginBdms01MfLoadTypeCd,BDMS_01_MF_LOAD_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01MfLoadTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01MfLoadTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01MfLoadTypeCd,BDMS_01_MF_LOAD_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01MfLoadTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MfLoadTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MfLoadTypeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01EqiContraInd
	 *	@return bdms01EqiContraInd
	 */
   public char[] getBdms01EqiContraInd() throws CFException{
     if (isBdms01EqiContraIndModified()) { 
        bdms01EqiContraInd = refreshBdms01EqiContraInd();
     }
   		return bdms01EqiContraInd;
   }

  
	/**
	*  set variable bdms01EqiContraInd
	*  Corresponding COBOL Variable is BDMS01-EQI-CONTRA-IND
	*  @param value
	**/
   public void setBdms01EqiContraInd(char[] value) {
      bdms01EqiContraInd = checkBdms01EqiContraIndConstraints(value);
      serializeBdms01EqiContraInd(bdms01EqiContraInd);
   } 

     /**
	 * 	Update Bdms01EqiContraInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01EqiContraInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01EqiContraInd,bdms01EqiContraInd.length);
   	
   }
   
   public void setBdms01EqiContraInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EqiContraInd,bdms01EqiContraInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01EqiContraInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01EqiContraInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EqiContraInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01EqiContraInd with another Field
	 *	@param value
	 */
   public void setBdms01EqiContraInd(Field source) {
       replace(source,0,source.length(),beginBdms01EqiContraInd,BDMS_01_EQI_CONTRA_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01EqiContraInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01EqiContraInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01EqiContraInd,BDMS_01_EQI_CONTRA_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01EqiContraInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01EqiContraInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EqiContraInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01OtcBlltnFeeInd
	 *	@return bdms01OtcBlltnFeeInd
	 */
   public char[] getBdms01OtcBlltnFeeInd() throws CFException{
     if (isBdms01OtcBlltnFeeIndModified()) { 
        bdms01OtcBlltnFeeInd = refreshBdms01OtcBlltnFeeInd();
     }
   		return bdms01OtcBlltnFeeInd;
   }

  
	/**
	*  set variable bdms01OtcBlltnFeeInd
	*  Corresponding COBOL Variable is BDMS01-OTC-BLLTN-FEE-IND
	*  @param value
	**/
   public void setBdms01OtcBlltnFeeInd(char[] value) {
      bdms01OtcBlltnFeeInd = checkBdms01OtcBlltnFeeIndConstraints(value);
      serializeBdms01OtcBlltnFeeInd(bdms01OtcBlltnFeeInd);
   } 

     /**
	 * 	Update Bdms01OtcBlltnFeeInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OtcBlltnFeeInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OtcBlltnFeeInd,bdms01OtcBlltnFeeInd.length);
   	
   }
   
   public void setBdms01OtcBlltnFeeInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OtcBlltnFeeInd,bdms01OtcBlltnFeeInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01OtcBlltnFeeInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OtcBlltnFeeInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OtcBlltnFeeInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OtcBlltnFeeInd with another Field
	 *	@param value
	 */
   public void setBdms01OtcBlltnFeeInd(Field source) {
       replace(source,0,source.length(),beginBdms01OtcBlltnFeeInd,BDMS_01_OTC_BLLTN_FEE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OtcBlltnFeeInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OtcBlltnFeeInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OtcBlltnFeeInd,BDMS_01_OTC_BLLTN_FEE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OtcBlltnFeeInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OtcBlltnFeeInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OtcBlltnFeeInd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01StockSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01StockSegSqlcd(0);
                     setMsdSharesOuts(0);
			setMsdEarnPerShr(BigDecimal.ZERO);
         setMsdEarnPerShrSign(CONSTANTS.SPACE);
			setMsdEstimatedDiv(BigDecimal.ZERO);
                     setMsdStkProxyMtngDt(0);
                     setMsdStkProxyRecDt(0);
          msdWrntsExpMmddccyy.initialize();
     
         setMsdPoisonPillInd(CONSTANTS.SPACE);
         setBdms01MeetingProxyDt(CONSTANTS.SPACE_10);
         setBdms01RecordProxyDt(CONSTANTS.SPACE_10);
         setBdms01StkExpirationDt(CONSTANTS.SPACE_10);
         setBdms01MasterLtdInd(CONSTANTS.SPACE);
         setBdms01MmfInd(CONSTANTS.SPACE);
         setBdms01OpenFundCd(CONSTANTS.SPACE);
         setBdms01LotTradeCd(CONSTANTS.SPACE_2);
			setBdms01DvdndYldAmt(BigDecimal.ZERO);
			setBdms01ExpirationAmt(BigDecimal.ZERO);
         setBdms01AdrInd(CONSTANTS.SPACE);
         setBdms01GdrInd(CONSTANTS.SPACE);
         setBdms01PsnplCd(CONSTANTS.SPACE_3);
         setBdms01PrfrdInd(CONSTANTS.SPACE);
         setBdms01DivCumInd(CONSTANTS.SPACE);
         setBdms01FreqIncmDebtCd(CONSTANTS.SPACE_2);
         setBdms01CallDt(CONSTANTS.SPACE_10);
			setBdms01CallAmt(BigDecimal.ZERO);
			setBdms01DvdndAnnlAmt(BigDecimal.ZERO);
			setBdms01DvdndAnnlPct(BigDecimal.ZERO);
         setBdms01PrtcpInd(CONSTANTS.SPACE);
         setBdms01VoteRghtsInd(CONSTANTS.SPACE);
         setBdms01ScrtyAdpRstrNbr(CONSTANTS.SPACE_7);
         setBdms01UtsCanadianCd(CONSTANTS.SPACE);
         setBdms01WarrantsIndexInd(CONSTANTS.SPACE);
         setMsdMidsQids(CONSTANTS.SPACE);
         setBdms01EtfInd(CONSTANTS.SPACE);
         setBdms01SmallCptlInd(CONSTANTS.SPACE);
         setBdms01ExmptUptckInd(CONSTANTS.SPACE);
         setBdms01RegShoElgblInd(CONSTANTS.SPACE);
         setBdms01RegShoElgblDt(CONSTANTS.SPACE_10);
         setBdms01MfFamilyNbr(CONSTANTS.SPACE_4);
         setBdms01ShrClassCd(CONSTANTS.SPACE);
         setBdms01RegShoInelgblDt(CONSTANTS.SPACE_10);
         setBdms01MfLoadTypeCd(CONSTANTS.SPACE);
         setBdms01EqiContraInd(CONSTANTS.SPACE);
         setBdms01OtcBlltnFeeInd(CONSTANTS.SPACE);
   }

		public static int getBdms01StockSegDataFieldLength() {
			return BDMS_01_STOCK_SEG_DATA_LENGTH;
		}

}
  
