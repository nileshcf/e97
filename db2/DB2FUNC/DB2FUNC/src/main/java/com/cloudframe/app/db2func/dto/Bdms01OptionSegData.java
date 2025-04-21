package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01OptionSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01OptionSegData extends Bdms01OptionSegDataSerialized { 
   

								private int bdms01OptionSegSqlcd;

						private char[] msdUnderlyingSecNo = Field.fillLowValue(7);

								private BigDecimal msdOptStrikePrice = BigDecimal.ZERO;

								private BigDecimal msdOptExpndStrkPrc = BigDecimal.ZERO;

								private BigDecimal msdOptFactor = BigDecimal.ZERO;

								private BigDecimal msdOptExpndFactor = BigDecimal.ZERO;
				private MsdOptExpMmddccyy msdOptExpMmddccyy = new MsdOptExpMmddccyy();

								private BigDecimal msdOptCapPrice = BigDecimal.ZERO;

						private char[] bdms01OptExpirationDt = Field.fillLowValue(10);

								private BigDecimal msdUnderlyingSecPrice = BigDecimal.ZERO;

						private char[] msdCurrencyCode01 = Field.fillLowValue(3);

						private char[] msdCurrencyCode2 = Field.fillLowValue(3);

								private long bdms01OptTradeVolume;

						private char[] bdms01OptSecurityParsInd = Field.fillLowValue(1);

						private char[] bdms01TypeDebtOptCd = Field.fillLowValue(3);

						private char[] bdms01EscrowRcptInd = Field.fillLowValue(1);

						private char[] bdms01TypeOptionCd = Field.fillLowValue(2);

						private char[] bdms01TypeIndexOptCd = Field.fillLowValue(2);

						private char[] bdms01OptCurrencyCd = Field.fillLowValue(2);

						private char[] bdms01PutCallCd = Field.fillLowValue(1);

						private char[] bdms01LeapInd = Field.fillLowValue(1);

						private char[] bdms01FlexInd = Field.fillLowValue(1);

						private char[] bdms01EurExerciseInd = Field.fillLowValue(1);

						private char[] bdms01OptCurrencyLegacyCd = Field.fillLowValue(2);

								private BigDecimal bdms01DlvrblFctrPct = BigDecimal.ZERO;

						private char[] bdms01DcmlFrctnCd = Field.fillLowValue(1);

						private char[] bdms01DlvrbOptnSymId = Field.fillLowValue(6);

						private char[] bdms01OptionMaturityDt = Field.fillLowValue(10);

						private char[] bdms01OccOptnSymId = Field.fillLowValue(6);

						private char[] bdms01FroInd = Field.fillLowValue(1);

						private char[] bdms01BrdBsdBnryInd = Field.fillLowValue(1);

						private char[] bdms01SecCusipBaseNbr = Field.fillLowValue(9);

	
	/**
	* Constructor for Bdms01OptionSegData
	**/
    public Bdms01OptionSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01OptionSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01OptionSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			msdOptExpMmddccyy.setParent(this,getStartOffset() + 44);
    } 

	/**
	 *	Returns the value of bdms01OptionSegSqlcd
	 *	@return bdms01OptionSegSqlcd
	 */
	public int getBdms01OptionSegSqlcd() throws CFException {
       if (isBdms01OptionSegSqlcdModified()) { 
           bdms01OptionSegSqlcd = refreshBdms01OptionSegSqlcd();
        }
   		return bdms01OptionSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01OptionSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-OPTION-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01OptionSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01OptionSegSqlcd = checkBdms01OptionSegSqlcdMaxLimit(number); 
		serializeBdms01OptionSegSqlcd(bdms01OptionSegSqlcd);
	}
	

	public void setBdms01OptionSegSqlcd(long number) {
	    number = checkBdms01OptionSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01OptionSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01OptionSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01OptionSegSqlcd(char[] value) throws CFException {
		 bdms01OptionSegSqlcd = serializeBdms01OptionSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01OptionSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01OptionSegSqlcdString(char[] value) throws CFException {
		 setBdms01OptionSegSqlcd(value);
	}
	/**
	 *	Returns the value of msdUnderlyingSecNo
	 *	@return msdUnderlyingSecNo
	 */
   public char[] getMsdUnderlyingSecNo() throws CFException{
     if (isMsdUnderlyingSecNoModified()) { 
        msdUnderlyingSecNo = refreshMsdUnderlyingSecNo();
     }
   		return msdUnderlyingSecNo;
   }

  
	/**
	*  set variable msdUnderlyingSecNo
	*  Corresponding COBOL Variable is MSD-UNDERLYING-SEC-NO
	*  @param value
	**/
   public void setMsdUnderlyingSecNo(char[] value) {
      msdUnderlyingSecNo = checkMsdUnderlyingSecNoConstraints(value);
      serializeMsdUnderlyingSecNo(msdUnderlyingSecNo);
   } 

     /**
	 * 	Update MsdUnderlyingSecNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdUnderlyingSecNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdUnderlyingSecNo,msdUnderlyingSecNo.length);
   	
   }
   
   public void setMsdUnderlyingSecNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdUnderlyingSecNo,msdUnderlyingSecNo.length);
   	
   }
   
     /**
	 * 	Update MsdUnderlyingSecNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdUnderlyingSecNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdUnderlyingSecNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdUnderlyingSecNo with another Field
	 *	@param value
	 */
   public void setMsdUnderlyingSecNo(Field source) {
       replace(source,0,source.length(),beginMsdUnderlyingSecNo,MSD_UNDERLYING_SEC_NO_LEN);
   	
   }  
   
     /**
	 * 	Update MsdUnderlyingSecNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdUnderlyingSecNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdUnderlyingSecNo,MSD_UNDERLYING_SEC_NO_LEN);
   	
   }
   
     /**
	 * 	Update MsdUnderlyingSecNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdUnderlyingSecNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdUnderlyingSecNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdOptStrikePrice
	 *	@return msdOptStrikePrice
	 */
	public BigDecimal getMsdOptStrikePrice() throws CFException {
       if (isMsdOptStrikePriceModified()) { 
           msdOptStrikePrice = refreshMsdOptStrikePrice();
        }
   		return msdOptStrikePrice;
	}
	

	
	   
	/**
	 * 	Update MsdOptStrikePrice with the passed number
	 *  Corresponding COBOL Variable is MSD-OPT-STRIKE-PRICE
	 *	@param number
	 */
	public void setMsdOptStrikePrice(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdOptStrikePrice = checkMsdOptStrikePriceMaxLimit(number);
	    serializeMsdOptStrikePrice(msdOptStrikePrice);
   }
	/**
	 * 	Update MsdOptStrikePrice with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdOptStrikePrice(char[] value) throws CFException {
		 msdOptStrikePrice = serializeMsdOptStrikePrice(value);
	}   
	/**
	 *	Returns the value of msdOptExpndStrkPrc
	 *	@return msdOptExpndStrkPrc
	 */
	public BigDecimal getMsdOptExpndStrkPrc() throws CFException {
       if (isMsdOptExpndStrkPrcModified()) { 
           msdOptExpndStrkPrc = refreshMsdOptExpndStrkPrc();
        }
   		return msdOptExpndStrkPrc;
	}
	

	
	   
	/**
	 * 	Update MsdOptExpndStrkPrc with the passed number
	 *  Corresponding COBOL Variable is MSD-OPT-EXPND-STRK-PRC
	 *	@param number
	 */
	public void setMsdOptExpndStrkPrc(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdOptExpndStrkPrc = checkMsdOptExpndStrkPrcMaxLimit(number);
	    serializeMsdOptExpndStrkPrc(msdOptExpndStrkPrc);
   }
	/**
	 * 	Update MsdOptExpndStrkPrc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdOptExpndStrkPrc(char[] value) throws CFException {
		 msdOptExpndStrkPrc = serializeMsdOptExpndStrkPrc(value);
	}   
	/**
	 *	Returns the value of msdOptFactor
	 *	@return msdOptFactor
	 */
	public BigDecimal getMsdOptFactor() throws CFException {
       if (isMsdOptFactorModified()) { 
           msdOptFactor = refreshMsdOptFactor();
        }
   		return msdOptFactor;
	}
	

	
	   
	/**
	 * 	Update MsdOptFactor with the passed number
	 *  Corresponding COBOL Variable is MSD-OPT-FACTOR
	 *	@param number
	 */
	public void setMsdOptFactor(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdOptFactor = checkMsdOptFactorMaxLimit(number);
	    serializeMsdOptFactor(msdOptFactor);
   }
	/**
	 * 	Update MsdOptFactor with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdOptFactor(char[] value) throws CFException {
		 msdOptFactor = serializeMsdOptFactor(value);
	}   
	/**
	 *	Returns the value of msdOptExpndFactor
	 *	@return msdOptExpndFactor
	 */
	public BigDecimal getMsdOptExpndFactor() throws CFException {
       if (isMsdOptExpndFactorModified()) { 
           msdOptExpndFactor = refreshMsdOptExpndFactor();
        }
   		return msdOptExpndFactor;
	}
	

	
	   
	/**
	 * 	Update MsdOptExpndFactor with the passed number
	 *  Corresponding COBOL Variable is MSD-OPT-EXPND-FACTOR
	 *	@param number
	 */
	public void setMsdOptExpndFactor(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdOptExpndFactor = checkMsdOptExpndFactorMaxLimit(number);
	    serializeMsdOptExpndFactor(msdOptExpndFactor);
   }
	/**
	 * 	Update MsdOptExpndFactor with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdOptExpndFactor(char[] value) throws CFException {
		 msdOptExpndFactor = serializeMsdOptExpndFactor(value);
	}   
	/**
	 *	Returns the value of msdOptExpMmddccyy
	 *	@return msdOptExpMmddccyy
	 */   
	 public MsdOptExpMmddccyy getMsdOptExpMmddccyy() {
   	return msdOptExpMmddccyy;
   }
   /**
	* 	Update MsdOptExpMmddccyy with the passed value
	*   Corresponding COBOL Variable is MSD-OPT-EXP-MMDDCCYY
	*	@param value
	*/
   public void setMsdOptExpMmddccyy(char[] value) {
      msdOptExpMmddccyy.setString(value); 
   }   
    
     /**
	 * 	Update MsdOptExpMmddccyy 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdOptExpMmddccyy(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdOptExpMmddccyy.begin,msdOptExpMmddccyy.length());
   }
   
     /**
	 * 	Update MsdOptExpMmddccyy 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdOptExpMmddccyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdOptExpMmddccyy.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdOptExpMmddccyy with another Field
	 *	@param value
	 */
   public void setMsdOptExpMmddccyy(Field source) {
   	replace(source,0,source.length(),msdOptExpMmddccyy.begin,msdOptExpMmddccyy.length());
   }  
   
     /**
	 * 	Update MsdOptExpMmddccyy 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdOptExpMmddccyy(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdOptExpMmddccyy.begin,msdOptExpMmddccyy.length());
   }
   
     /**
	 * 	Update MsdOptExpMmddccyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdOptExpMmddccyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdOptExpMmddccyy.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdOptCapPrice
	 *	@return msdOptCapPrice
	 */
	public BigDecimal getMsdOptCapPrice() throws CFException {
       if (isMsdOptCapPriceModified()) { 
           msdOptCapPrice = refreshMsdOptCapPrice();
        }
   		return msdOptCapPrice;
	}
	

	
	   
	/**
	 * 	Update MsdOptCapPrice with the passed number
	 *  Corresponding COBOL Variable is MSD-OPT-CAP-PRICE
	 *	@param number
	 */
	public void setMsdOptCapPrice(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdOptCapPrice = checkMsdOptCapPriceMaxLimit(number);
	    serializeMsdOptCapPrice(msdOptCapPrice);
   }
	/**
	 * 	Update MsdOptCapPrice with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdOptCapPrice(char[] value) throws CFException {
		 msdOptCapPrice = serializeMsdOptCapPrice(value);
	}   
	/**
	 *	Returns the value of bdms01OptExpirationDt
	 *	@return bdms01OptExpirationDt
	 */
   public char[] getBdms01OptExpirationDt() throws CFException{
     if (isBdms01OptExpirationDtModified()) { 
        bdms01OptExpirationDt = refreshBdms01OptExpirationDt();
     }
   		return bdms01OptExpirationDt;
   }

  
	/**
	*  set variable bdms01OptExpirationDt
	*  Corresponding COBOL Variable is BDMS01-OPT-EXPIRATION-DT
	*  @param value
	**/
   public void setBdms01OptExpirationDt(char[] value) {
      bdms01OptExpirationDt = checkBdms01OptExpirationDtConstraints(value);
      serializeBdms01OptExpirationDt(bdms01OptExpirationDt);
   } 

     /**
	 * 	Update Bdms01OptExpirationDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OptExpirationDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OptExpirationDt,bdms01OptExpirationDt.length);
   	
   }
   
   public void setBdms01OptExpirationDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptExpirationDt,bdms01OptExpirationDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01OptExpirationDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptExpirationDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptExpirationDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OptExpirationDt with another Field
	 *	@param value
	 */
   public void setBdms01OptExpirationDt(Field source) {
       replace(source,0,source.length(),beginBdms01OptExpirationDt,BDMS_01_OPT_EXPIRATION_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OptExpirationDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OptExpirationDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OptExpirationDt,BDMS_01_OPT_EXPIRATION_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OptExpirationDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptExpirationDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptExpirationDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdUnderlyingSecPrice
	 *	@return msdUnderlyingSecPrice
	 */
	public BigDecimal getMsdUnderlyingSecPrice() throws CFException {
       if (isMsdUnderlyingSecPriceModified()) { 
           msdUnderlyingSecPrice = refreshMsdUnderlyingSecPrice();
        }
   		return msdUnderlyingSecPrice;
	}
	

	
	   
	/**
	 * 	Update MsdUnderlyingSecPrice with the passed number
	 *  Corresponding COBOL Variable is MSD-UNDERLYING-SEC-PRICE
	 *	@param number
	 */
	public void setMsdUnderlyingSecPrice(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdUnderlyingSecPrice = checkMsdUnderlyingSecPriceMaxLimit(number);
	    serializeMsdUnderlyingSecPrice(msdUnderlyingSecPrice);
   }
	/**
	 * 	Update MsdUnderlyingSecPrice with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdUnderlyingSecPrice(char[] value) throws CFException {
		 msdUnderlyingSecPrice = serializeMsdUnderlyingSecPrice(value);
	}   
	/**
	 *	Returns the value of msdCurrencyCode01
	 *	@return msdCurrencyCode01
	 */
   public char[] getMsdCurrencyCode01() throws CFException{
     if (isMsdCurrencyCode01Modified()) { 
        msdCurrencyCode01 = refreshMsdCurrencyCode01();
     }
   		return msdCurrencyCode01;
   }

  
	/**
	*  set variable msdCurrencyCode01
	*  Corresponding COBOL Variable is MSD-CURRENCY-CODE
	*  @param value
	**/
   public void setMsdCurrencyCode01(char[] value) {
      msdCurrencyCode01 = checkMsdCurrencyCode01Constraints(value);
      serializeMsdCurrencyCode01(msdCurrencyCode01);
   } 

     /**
	 * 	Update MsdCurrencyCode01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdCurrencyCode01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdCurrencyCode01,msdCurrencyCode01.length);
   	
   }
   
   public void setMsdCurrencyCode01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCurrencyCode01,msdCurrencyCode01.length);
   	
   }
   
     /**
	 * 	Update MsdCurrencyCode01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdCurrencyCode01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCurrencyCode01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdCurrencyCode01 with another Field
	 *	@param value
	 */
   public void setMsdCurrencyCode01(Field source) {
       replace(source,0,source.length(),beginMsdCurrencyCode01,MSD_CURRENCY_CODE_01_LEN);
   	
   }  
   
     /**
	 * 	Update MsdCurrencyCode01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdCurrencyCode01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdCurrencyCode01,MSD_CURRENCY_CODE_01_LEN);
   	
   }
   
     /**
	 * 	Update MsdCurrencyCode01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdCurrencyCode01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCurrencyCode01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdCurrencyCode2
	 *	@return msdCurrencyCode2
	 */
   public char[] getMsdCurrencyCode2() throws CFException{
     if (isMsdCurrencyCode2Modified()) { 
        msdCurrencyCode2 = refreshMsdCurrencyCode2();
     }
   		return msdCurrencyCode2;
   }

  
	/**
	*  set variable msdCurrencyCode2
	*  Corresponding COBOL Variable is MSD-CURRENCY-CODE-2
	*  @param value
	**/
   public void setMsdCurrencyCode2(char[] value) {
      msdCurrencyCode2 = checkMsdCurrencyCode2Constraints(value);
      serializeMsdCurrencyCode2(msdCurrencyCode2);
   } 

     /**
	 * 	Update MsdCurrencyCode2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdCurrencyCode2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdCurrencyCode2,msdCurrencyCode2.length);
   	
   }
   
   public void setMsdCurrencyCode2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCurrencyCode2,msdCurrencyCode2.length);
   	
   }
   
     /**
	 * 	Update MsdCurrencyCode2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdCurrencyCode2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCurrencyCode2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdCurrencyCode2 with another Field
	 *	@param value
	 */
   public void setMsdCurrencyCode2(Field source) {
       replace(source,0,source.length(),beginMsdCurrencyCode2,MSD_CURRENCY_CODE_2_LEN);
   	
   }  
   
     /**
	 * 	Update MsdCurrencyCode2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdCurrencyCode2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdCurrencyCode2,MSD_CURRENCY_CODE_2_LEN);
   	
   }
   
     /**
	 * 	Update MsdCurrencyCode2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdCurrencyCode2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCurrencyCode2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01OptTradeVolume
	 *	@return bdms01OptTradeVolume
	 */
	public long getBdms01OptTradeVolume() throws CFException {
       if (isBdms01OptTradeVolumeModified()) { 
           bdms01OptTradeVolume = refreshBdms01OptTradeVolume();
        }
   		return bdms01OptTradeVolume;
	}
	

	
	   
	/**
	 * 	Update Bdms01OptTradeVolume with the passed value
	 *  Corresponding COBOL Variable is BDMS01-OPT-TRADE-VOLUME
	 *	@param number
	 */
	public void setBdms01OptTradeVolume(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01OptTradeVolume = checkBdms01OptTradeVolumeMaxLimit(number); 
		serializeBdms01OptTradeVolume(bdms01OptTradeVolume);
	}
	

	/**
	 * 	Update Bdms01OptTradeVolume with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01OptTradeVolume(char[] value) throws CFException {
		 bdms01OptTradeVolume = serializeBdms01OptTradeVolume(value);
	}
	/**
	 * 	Update Bdms01OptTradeVolume with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01OptTradeVolumeString(char[] value) throws CFException {
		 setBdms01OptTradeVolume(value);
	}
	/**
	 *	Returns the value of bdms01OptSecurityParsInd
	 *	@return bdms01OptSecurityParsInd
	 */
   public char[] getBdms01OptSecurityParsInd() throws CFException{
     if (isBdms01OptSecurityParsIndModified()) { 
        bdms01OptSecurityParsInd = refreshBdms01OptSecurityParsInd();
     }
   		return bdms01OptSecurityParsInd;
   }

  
	/**
	*  set variable bdms01OptSecurityParsInd
	*  Corresponding COBOL Variable is BDMS01-OPT-SECURITY-PARS-IND
	*  @param value
	**/
   public void setBdms01OptSecurityParsInd(char[] value) {
      bdms01OptSecurityParsInd = checkBdms01OptSecurityParsIndConstraints(value);
      serializeBdms01OptSecurityParsInd(bdms01OptSecurityParsInd);
   } 

     /**
	 * 	Update Bdms01OptSecurityParsInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OptSecurityParsInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OptSecurityParsInd,bdms01OptSecurityParsInd.length);
   	
   }
   
   public void setBdms01OptSecurityParsInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptSecurityParsInd,bdms01OptSecurityParsInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01OptSecurityParsInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptSecurityParsInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptSecurityParsInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OptSecurityParsInd with another Field
	 *	@param value
	 */
   public void setBdms01OptSecurityParsInd(Field source) {
       replace(source,0,source.length(),beginBdms01OptSecurityParsInd,BDMS_01_OPT_SECURITY_PARS_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OptSecurityParsInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OptSecurityParsInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OptSecurityParsInd,BDMS_01_OPT_SECURITY_PARS_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OptSecurityParsInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptSecurityParsInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptSecurityParsInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TypeDebtOptCd
	 *	@return bdms01TypeDebtOptCd
	 */
   public char[] getBdms01TypeDebtOptCd() throws CFException{
     if (isBdms01TypeDebtOptCdModified()) { 
        bdms01TypeDebtOptCd = refreshBdms01TypeDebtOptCd();
     }
   		return bdms01TypeDebtOptCd;
   }

  
	/**
	*  set variable bdms01TypeDebtOptCd
	*  Corresponding COBOL Variable is BDMS01-TYPE-DEBT-OPT-CD
	*  @param value
	**/
   public void setBdms01TypeDebtOptCd(char[] value) {
      bdms01TypeDebtOptCd = checkBdms01TypeDebtOptCdConstraints(value);
      serializeBdms01TypeDebtOptCd(bdms01TypeDebtOptCd);
   } 

     /**
	 * 	Update Bdms01TypeDebtOptCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TypeDebtOptCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TypeDebtOptCd,bdms01TypeDebtOptCd.length);
   	
   }
   
   public void setBdms01TypeDebtOptCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeDebtOptCd,bdms01TypeDebtOptCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TypeDebtOptCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypeDebtOptCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeDebtOptCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TypeDebtOptCd with another Field
	 *	@param value
	 */
   public void setBdms01TypeDebtOptCd(Field source) {
       replace(source,0,source.length(),beginBdms01TypeDebtOptCd,BDMS_01_TYPE_DEBT_OPT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TypeDebtOptCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TypeDebtOptCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TypeDebtOptCd,BDMS_01_TYPE_DEBT_OPT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TypeDebtOptCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypeDebtOptCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeDebtOptCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01EscrowRcptInd
	 *	@return bdms01EscrowRcptInd
	 */
   public char[] getBdms01EscrowRcptInd() throws CFException{
     if (isBdms01EscrowRcptIndModified()) { 
        bdms01EscrowRcptInd = refreshBdms01EscrowRcptInd();
     }
   		return bdms01EscrowRcptInd;
   }

  
	/**
	*  set variable bdms01EscrowRcptInd
	*  Corresponding COBOL Variable is BDMS01-ESCROW-RCPT-IND
	*  @param value
	**/
   public void setBdms01EscrowRcptInd(char[] value) {
      bdms01EscrowRcptInd = checkBdms01EscrowRcptIndConstraints(value);
      serializeBdms01EscrowRcptInd(bdms01EscrowRcptInd);
   } 

     /**
	 * 	Update Bdms01EscrowRcptInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01EscrowRcptInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01EscrowRcptInd,bdms01EscrowRcptInd.length);
   	
   }
   
   public void setBdms01EscrowRcptInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EscrowRcptInd,bdms01EscrowRcptInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01EscrowRcptInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01EscrowRcptInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EscrowRcptInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01EscrowRcptInd with another Field
	 *	@param value
	 */
   public void setBdms01EscrowRcptInd(Field source) {
       replace(source,0,source.length(),beginBdms01EscrowRcptInd,BDMS_01_ESCROW_RCPT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01EscrowRcptInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01EscrowRcptInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01EscrowRcptInd,BDMS_01_ESCROW_RCPT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01EscrowRcptInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01EscrowRcptInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EscrowRcptInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TypeOptionCd
	 *	@return bdms01TypeOptionCd
	 */
   public char[] getBdms01TypeOptionCd() throws CFException{
     if (isBdms01TypeOptionCdModified()) { 
        bdms01TypeOptionCd = refreshBdms01TypeOptionCd();
     }
   		return bdms01TypeOptionCd;
   }

  
	/**
	*  set variable bdms01TypeOptionCd
	*  Corresponding COBOL Variable is BDMS01-TYPE-OPTION-CD
	*  @param value
	**/
   public void setBdms01TypeOptionCd(char[] value) {
      bdms01TypeOptionCd = checkBdms01TypeOptionCdConstraints(value);
      serializeBdms01TypeOptionCd(bdms01TypeOptionCd);
   } 

     /**
	 * 	Update Bdms01TypeOptionCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TypeOptionCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TypeOptionCd,bdms01TypeOptionCd.length);
   	
   }
   
   public void setBdms01TypeOptionCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeOptionCd,bdms01TypeOptionCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TypeOptionCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypeOptionCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeOptionCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TypeOptionCd with another Field
	 *	@param value
	 */
   public void setBdms01TypeOptionCd(Field source) {
       replace(source,0,source.length(),beginBdms01TypeOptionCd,BDMS_01_TYPE_OPTION_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TypeOptionCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TypeOptionCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TypeOptionCd,BDMS_01_TYPE_OPTION_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TypeOptionCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypeOptionCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeOptionCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TypeIndexOptCd
	 *	@return bdms01TypeIndexOptCd
	 */
   public char[] getBdms01TypeIndexOptCd() throws CFException{
     if (isBdms01TypeIndexOptCdModified()) { 
        bdms01TypeIndexOptCd = refreshBdms01TypeIndexOptCd();
     }
   		return bdms01TypeIndexOptCd;
   }

  
	/**
	*  set variable bdms01TypeIndexOptCd
	*  Corresponding COBOL Variable is BDMS01-TYPE-INDEX-OPT-CD
	*  @param value
	**/
   public void setBdms01TypeIndexOptCd(char[] value) {
      bdms01TypeIndexOptCd = checkBdms01TypeIndexOptCdConstraints(value);
      serializeBdms01TypeIndexOptCd(bdms01TypeIndexOptCd);
   } 

     /**
	 * 	Update Bdms01TypeIndexOptCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TypeIndexOptCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TypeIndexOptCd,bdms01TypeIndexOptCd.length);
   	
   }
   
   public void setBdms01TypeIndexOptCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeIndexOptCd,bdms01TypeIndexOptCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TypeIndexOptCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypeIndexOptCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeIndexOptCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TypeIndexOptCd with another Field
	 *	@param value
	 */
   public void setBdms01TypeIndexOptCd(Field source) {
       replace(source,0,source.length(),beginBdms01TypeIndexOptCd,BDMS_01_TYPE_INDEX_OPT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TypeIndexOptCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TypeIndexOptCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TypeIndexOptCd,BDMS_01_TYPE_INDEX_OPT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TypeIndexOptCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypeIndexOptCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeIndexOptCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01OptCurrencyCd
	 *	@return bdms01OptCurrencyCd
	 */
   public char[] getBdms01OptCurrencyCd() throws CFException{
     if (isBdms01OptCurrencyCdModified()) { 
        bdms01OptCurrencyCd = refreshBdms01OptCurrencyCd();
     }
   		return bdms01OptCurrencyCd;
   }

  
	/**
	*  set variable bdms01OptCurrencyCd
	*  Corresponding COBOL Variable is BDMS01-OPT-CURRENCY-CD
	*  @param value
	**/
   public void setBdms01OptCurrencyCd(char[] value) {
      bdms01OptCurrencyCd = checkBdms01OptCurrencyCdConstraints(value);
      serializeBdms01OptCurrencyCd(bdms01OptCurrencyCd);
   } 

     /**
	 * 	Update Bdms01OptCurrencyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OptCurrencyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OptCurrencyCd,bdms01OptCurrencyCd.length);
   	
   }
   
   public void setBdms01OptCurrencyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptCurrencyCd,bdms01OptCurrencyCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01OptCurrencyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptCurrencyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptCurrencyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OptCurrencyCd with another Field
	 *	@param value
	 */
   public void setBdms01OptCurrencyCd(Field source) {
       replace(source,0,source.length(),beginBdms01OptCurrencyCd,BDMS_01_OPT_CURRENCY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OptCurrencyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OptCurrencyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OptCurrencyCd,BDMS_01_OPT_CURRENCY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OptCurrencyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptCurrencyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptCurrencyCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PutCallCd
	 *	@return bdms01PutCallCd
	 */
   public char[] getBdms01PutCallCd() throws CFException{
     if (isBdms01PutCallCdModified()) { 
        bdms01PutCallCd = refreshBdms01PutCallCd();
     }
   		return bdms01PutCallCd;
   }

  
	/**
	*  set variable bdms01PutCallCd
	*  Corresponding COBOL Variable is BDMS01-PUT-CALL-CD
	*  @param value
	**/
   public void setBdms01PutCallCd(char[] value) {
      bdms01PutCallCd = checkBdms01PutCallCdConstraints(value);
      serializeBdms01PutCallCd(bdms01PutCallCd);
   } 

     /**
	 * 	Update Bdms01PutCallCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PutCallCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PutCallCd,bdms01PutCallCd.length);
   	
   }
   
   public void setBdms01PutCallCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutCallCd,bdms01PutCallCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PutCallCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutCallCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutCallCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PutCallCd with another Field
	 *	@param value
	 */
   public void setBdms01PutCallCd(Field source) {
       replace(source,0,source.length(),beginBdms01PutCallCd,BDMS_01_PUT_CALL_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PutCallCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PutCallCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PutCallCd,BDMS_01_PUT_CALL_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PutCallCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutCallCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutCallCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01LeapInd
	 *	@return bdms01LeapInd
	 */
   public char[] getBdms01LeapInd() throws CFException{
     if (isBdms01LeapIndModified()) { 
        bdms01LeapInd = refreshBdms01LeapInd();
     }
   		return bdms01LeapInd;
   }

  
	/**
	*  set variable bdms01LeapInd
	*  Corresponding COBOL Variable is BDMS01-LEAP-IND
	*  @param value
	**/
   public void setBdms01LeapInd(char[] value) {
      bdms01LeapInd = checkBdms01LeapIndConstraints(value);
      serializeBdms01LeapInd(bdms01LeapInd);
   } 

     /**
	 * 	Update Bdms01LeapInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01LeapInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01LeapInd,bdms01LeapInd.length);
   	
   }
   
   public void setBdms01LeapInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01LeapInd,bdms01LeapInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01LeapInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01LeapInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01LeapInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01LeapInd with another Field
	 *	@param value
	 */
   public void setBdms01LeapInd(Field source) {
       replace(source,0,source.length(),beginBdms01LeapInd,BDMS_01_LEAP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01LeapInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01LeapInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01LeapInd,BDMS_01_LEAP_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01LeapInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01LeapInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01LeapInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01FlexInd
	 *	@return bdms01FlexInd
	 */
   public char[] getBdms01FlexInd() throws CFException{
     if (isBdms01FlexIndModified()) { 
        bdms01FlexInd = refreshBdms01FlexInd();
     }
   		return bdms01FlexInd;
   }

  
	/**
	*  set variable bdms01FlexInd
	*  Corresponding COBOL Variable is BDMS01-FLEX-IND
	*  @param value
	**/
   public void setBdms01FlexInd(char[] value) {
      bdms01FlexInd = checkBdms01FlexIndConstraints(value);
      serializeBdms01FlexInd(bdms01FlexInd);
   } 

     /**
	 * 	Update Bdms01FlexInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01FlexInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01FlexInd,bdms01FlexInd.length);
   	
   }
   
   public void setBdms01FlexInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FlexInd,bdms01FlexInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01FlexInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FlexInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FlexInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01FlexInd with another Field
	 *	@param value
	 */
   public void setBdms01FlexInd(Field source) {
       replace(source,0,source.length(),beginBdms01FlexInd,BDMS_01_FLEX_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01FlexInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01FlexInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01FlexInd,BDMS_01_FLEX_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01FlexInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FlexInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FlexInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01EurExerciseInd
	 *	@return bdms01EurExerciseInd
	 */
   public char[] getBdms01EurExerciseInd() throws CFException{
     if (isBdms01EurExerciseIndModified()) { 
        bdms01EurExerciseInd = refreshBdms01EurExerciseInd();
     }
   		return bdms01EurExerciseInd;
   }

  
	/**
	*  set variable bdms01EurExerciseInd
	*  Corresponding COBOL Variable is BDMS01-EUR-EXERCISE-IND
	*  @param value
	**/
   public void setBdms01EurExerciseInd(char[] value) {
      bdms01EurExerciseInd = checkBdms01EurExerciseIndConstraints(value);
      serializeBdms01EurExerciseInd(bdms01EurExerciseInd);
   } 

     /**
	 * 	Update Bdms01EurExerciseInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01EurExerciseInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01EurExerciseInd,bdms01EurExerciseInd.length);
   	
   }
   
   public void setBdms01EurExerciseInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EurExerciseInd,bdms01EurExerciseInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01EurExerciseInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01EurExerciseInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EurExerciseInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01EurExerciseInd with another Field
	 *	@param value
	 */
   public void setBdms01EurExerciseInd(Field source) {
       replace(source,0,source.length(),beginBdms01EurExerciseInd,BDMS_01_EUR_EXERCISE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01EurExerciseInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01EurExerciseInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01EurExerciseInd,BDMS_01_EUR_EXERCISE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01EurExerciseInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01EurExerciseInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EurExerciseInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01OptCurrencyLegacyCd
	 *	@return bdms01OptCurrencyLegacyCd
	 */
   public char[] getBdms01OptCurrencyLegacyCd() throws CFException{
     if (isBdms01OptCurrencyLegacyCdModified()) { 
        bdms01OptCurrencyLegacyCd = refreshBdms01OptCurrencyLegacyCd();
     }
   		return bdms01OptCurrencyLegacyCd;
   }

  
	/**
	*  set variable bdms01OptCurrencyLegacyCd
	*  Corresponding COBOL Variable is BDMS01-OPT-CURRENCY-LEGACY-CD
	*  @param value
	**/
   public void setBdms01OptCurrencyLegacyCd(char[] value) {
      bdms01OptCurrencyLegacyCd = checkBdms01OptCurrencyLegacyCdConstraints(value);
      serializeBdms01OptCurrencyLegacyCd(bdms01OptCurrencyLegacyCd);
   } 

     /**
	 * 	Update Bdms01OptCurrencyLegacyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OptCurrencyLegacyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OptCurrencyLegacyCd,bdms01OptCurrencyLegacyCd.length);
   	
   }
   
   public void setBdms01OptCurrencyLegacyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptCurrencyLegacyCd,bdms01OptCurrencyLegacyCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01OptCurrencyLegacyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptCurrencyLegacyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptCurrencyLegacyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OptCurrencyLegacyCd with another Field
	 *	@param value
	 */
   public void setBdms01OptCurrencyLegacyCd(Field source) {
       replace(source,0,source.length(),beginBdms01OptCurrencyLegacyCd,BDMS_01_OPT_CURRENCY_LEGACY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OptCurrencyLegacyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OptCurrencyLegacyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OptCurrencyLegacyCd,BDMS_01_OPT_CURRENCY_LEGACY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OptCurrencyLegacyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptCurrencyLegacyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptCurrencyLegacyCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01DlvrblFctrPct
	 *	@return bdms01DlvrblFctrPct
	 */
	public BigDecimal getBdms01DlvrblFctrPct() throws CFException {
       if (isBdms01DlvrblFctrPctModified()) { 
           bdms01DlvrblFctrPct = refreshBdms01DlvrblFctrPct();
        }
   		return bdms01DlvrblFctrPct;
	}
	

	
	   
	/**
	 * 	Update Bdms01DlvrblFctrPct with the passed number
	 *  Corresponding COBOL Variable is BDMS01-DLVRBL-FCTR-PCT
	 *	@param number
	 */
	public void setBdms01DlvrblFctrPct(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01DlvrblFctrPct = checkBdms01DlvrblFctrPctMaxLimit(number);
	    serializeBdms01DlvrblFctrPct(bdms01DlvrblFctrPct);
   }
	/**
	 * 	Update Bdms01DlvrblFctrPct with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01DlvrblFctrPct(char[] value) throws CFException {
		 bdms01DlvrblFctrPct = serializeBdms01DlvrblFctrPct(value);
	}   
	/**
	 *	Returns the value of bdms01DcmlFrctnCd
	 *	@return bdms01DcmlFrctnCd
	 */
   public char[] getBdms01DcmlFrctnCd() throws CFException{
     if (isBdms01DcmlFrctnCdModified()) { 
        bdms01DcmlFrctnCd = refreshBdms01DcmlFrctnCd();
     }
   		return bdms01DcmlFrctnCd;
   }

  
	/**
	*  set variable bdms01DcmlFrctnCd
	*  Corresponding COBOL Variable is BDMS01-DCML-FRCTN-CD
	*  @param value
	**/
   public void setBdms01DcmlFrctnCd(char[] value) {
      bdms01DcmlFrctnCd = checkBdms01DcmlFrctnCdConstraints(value);
      serializeBdms01DcmlFrctnCd(bdms01DcmlFrctnCd);
   } 

     /**
	 * 	Update Bdms01DcmlFrctnCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01DcmlFrctnCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01DcmlFrctnCd,bdms01DcmlFrctnCd.length);
   	
   }
   
   public void setBdms01DcmlFrctnCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DcmlFrctnCd,bdms01DcmlFrctnCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01DcmlFrctnCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DcmlFrctnCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DcmlFrctnCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01DcmlFrctnCd with another Field
	 *	@param value
	 */
   public void setBdms01DcmlFrctnCd(Field source) {
       replace(source,0,source.length(),beginBdms01DcmlFrctnCd,BDMS_01_DCML_FRCTN_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01DcmlFrctnCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01DcmlFrctnCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01DcmlFrctnCd,BDMS_01_DCML_FRCTN_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01DcmlFrctnCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DcmlFrctnCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DcmlFrctnCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01DlvrbOptnSymId
	 *	@return bdms01DlvrbOptnSymId
	 */
   public char[] getBdms01DlvrbOptnSymId() throws CFException{
     if (isBdms01DlvrbOptnSymIdModified()) { 
        bdms01DlvrbOptnSymId = refreshBdms01DlvrbOptnSymId();
     }
   		return bdms01DlvrbOptnSymId;
   }

  
	/**
	*  set variable bdms01DlvrbOptnSymId
	*  Corresponding COBOL Variable is BDMS01-DLVRB-OPTN-SYM-ID
	*  @param value
	**/
   public void setBdms01DlvrbOptnSymId(char[] value) {
      bdms01DlvrbOptnSymId = checkBdms01DlvrbOptnSymIdConstraints(value);
      serializeBdms01DlvrbOptnSymId(bdms01DlvrbOptnSymId);
   } 

     /**
	 * 	Update Bdms01DlvrbOptnSymId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01DlvrbOptnSymId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01DlvrbOptnSymId,bdms01DlvrbOptnSymId.length);
   	
   }
   
   public void setBdms01DlvrbOptnSymId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DlvrbOptnSymId,bdms01DlvrbOptnSymId.length);
   	
   }
   
     /**
	 * 	Update Bdms01DlvrbOptnSymId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DlvrbOptnSymId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DlvrbOptnSymId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01DlvrbOptnSymId with another Field
	 *	@param value
	 */
   public void setBdms01DlvrbOptnSymId(Field source) {
       replace(source,0,source.length(),beginBdms01DlvrbOptnSymId,BDMS_01_DLVRB_OPTN_SYM_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01DlvrbOptnSymId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01DlvrbOptnSymId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01DlvrbOptnSymId,BDMS_01_DLVRB_OPTN_SYM_ID_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01DlvrbOptnSymId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DlvrbOptnSymId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DlvrbOptnSymId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01OptionMaturityDt
	 *	@return bdms01OptionMaturityDt
	 */
   public char[] getBdms01OptionMaturityDt() throws CFException{
     if (isBdms01OptionMaturityDtModified()) { 
        bdms01OptionMaturityDt = refreshBdms01OptionMaturityDt();
     }
   		return bdms01OptionMaturityDt;
   }

  
	/**
	*  set variable bdms01OptionMaturityDt
	*  Corresponding COBOL Variable is BDMS01-OPTION-MATURITY-DT
	*  @param value
	**/
   public void setBdms01OptionMaturityDt(char[] value) {
      bdms01OptionMaturityDt = checkBdms01OptionMaturityDtConstraints(value);
      serializeBdms01OptionMaturityDt(bdms01OptionMaturityDt);
   } 

     /**
	 * 	Update Bdms01OptionMaturityDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OptionMaturityDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OptionMaturityDt,bdms01OptionMaturityDt.length);
   	
   }
   
   public void setBdms01OptionMaturityDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptionMaturityDt,bdms01OptionMaturityDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01OptionMaturityDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptionMaturityDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptionMaturityDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OptionMaturityDt with another Field
	 *	@param value
	 */
   public void setBdms01OptionMaturityDt(Field source) {
       replace(source,0,source.length(),beginBdms01OptionMaturityDt,BDMS_01_OPTION_MATURITY_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OptionMaturityDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OptionMaturityDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OptionMaturityDt,BDMS_01_OPTION_MATURITY_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OptionMaturityDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptionMaturityDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptionMaturityDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01OccOptnSymId
	 *	@return bdms01OccOptnSymId
	 */
   public char[] getBdms01OccOptnSymId() throws CFException{
     if (isBdms01OccOptnSymIdModified()) { 
        bdms01OccOptnSymId = refreshBdms01OccOptnSymId();
     }
   		return bdms01OccOptnSymId;
   }

  
	/**
	*  set variable bdms01OccOptnSymId
	*  Corresponding COBOL Variable is BDMS01-OCC-OPTN-SYM-ID
	*  @param value
	**/
   public void setBdms01OccOptnSymId(char[] value) {
      bdms01OccOptnSymId = checkBdms01OccOptnSymIdConstraints(value);
      serializeBdms01OccOptnSymId(bdms01OccOptnSymId);
   } 

     /**
	 * 	Update Bdms01OccOptnSymId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OccOptnSymId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OccOptnSymId,bdms01OccOptnSymId.length);
   	
   }
   
   public void setBdms01OccOptnSymId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OccOptnSymId,bdms01OccOptnSymId.length);
   	
   }
   
     /**
	 * 	Update Bdms01OccOptnSymId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OccOptnSymId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OccOptnSymId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OccOptnSymId with another Field
	 *	@param value
	 */
   public void setBdms01OccOptnSymId(Field source) {
       replace(source,0,source.length(),beginBdms01OccOptnSymId,BDMS_01_OCC_OPTN_SYM_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OccOptnSymId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OccOptnSymId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OccOptnSymId,BDMS_01_OCC_OPTN_SYM_ID_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OccOptnSymId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OccOptnSymId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OccOptnSymId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01FroInd
	 *	@return bdms01FroInd
	 */
   public char[] getBdms01FroInd() throws CFException{
     if (isBdms01FroIndModified()) { 
        bdms01FroInd = refreshBdms01FroInd();
     }
   		return bdms01FroInd;
   }

  
	/**
	*  set variable bdms01FroInd
	*  Corresponding COBOL Variable is BDMS01-FRO-IND
	*  @param value
	**/
   public void setBdms01FroInd(char[] value) {
      bdms01FroInd = checkBdms01FroIndConstraints(value);
      serializeBdms01FroInd(bdms01FroInd);
   } 

     /**
	 * 	Update Bdms01FroInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01FroInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01FroInd,bdms01FroInd.length);
   	
   }
   
   public void setBdms01FroInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FroInd,bdms01FroInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01FroInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FroInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FroInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01FroInd with another Field
	 *	@param value
	 */
   public void setBdms01FroInd(Field source) {
       replace(source,0,source.length(),beginBdms01FroInd,BDMS_01_FRO_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01FroInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01FroInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01FroInd,BDMS_01_FRO_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01FroInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FroInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FroInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01BrdBsdBnryInd
	 *	@return bdms01BrdBsdBnryInd
	 */
   public char[] getBdms01BrdBsdBnryInd() throws CFException{
     if (isBdms01BrdBsdBnryIndModified()) { 
        bdms01BrdBsdBnryInd = refreshBdms01BrdBsdBnryInd();
     }
   		return bdms01BrdBsdBnryInd;
   }

  
	/**
	*  set variable bdms01BrdBsdBnryInd
	*  Corresponding COBOL Variable is BDMS01-BRD-BSD-BNRY-IND
	*  @param value
	**/
   public void setBdms01BrdBsdBnryInd(char[] value) {
      bdms01BrdBsdBnryInd = checkBdms01BrdBsdBnryIndConstraints(value);
      serializeBdms01BrdBsdBnryInd(bdms01BrdBsdBnryInd);
   } 

     /**
	 * 	Update Bdms01BrdBsdBnryInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01BrdBsdBnryInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01BrdBsdBnryInd,bdms01BrdBsdBnryInd.length);
   	
   }
   
   public void setBdms01BrdBsdBnryInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BrdBsdBnryInd,bdms01BrdBsdBnryInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01BrdBsdBnryInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BrdBsdBnryInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BrdBsdBnryInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01BrdBsdBnryInd with another Field
	 *	@param value
	 */
   public void setBdms01BrdBsdBnryInd(Field source) {
       replace(source,0,source.length(),beginBdms01BrdBsdBnryInd,BDMS_01_BRD_BSD_BNRY_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01BrdBsdBnryInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01BrdBsdBnryInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01BrdBsdBnryInd,BDMS_01_BRD_BSD_BNRY_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01BrdBsdBnryInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BrdBsdBnryInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BrdBsdBnryInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SecCusipBaseNbr
	 *	@return bdms01SecCusipBaseNbr
	 */
   public char[] getBdms01SecCusipBaseNbr() throws CFException{
     if (isBdms01SecCusipBaseNbrModified()) { 
        bdms01SecCusipBaseNbr = refreshBdms01SecCusipBaseNbr();
     }
   		return bdms01SecCusipBaseNbr;
   }

  
	/**
	*  set variable bdms01SecCusipBaseNbr
	*  Corresponding COBOL Variable is BDMS01-SEC-CUSIP-BASE-NBR
	*  @param value
	**/
   public void setBdms01SecCusipBaseNbr(char[] value) {
      bdms01SecCusipBaseNbr = checkBdms01SecCusipBaseNbrConstraints(value);
      serializeBdms01SecCusipBaseNbr(bdms01SecCusipBaseNbr);
   } 

     /**
	 * 	Update Bdms01SecCusipBaseNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SecCusipBaseNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SecCusipBaseNbr,bdms01SecCusipBaseNbr.length);
   	
   }
   
   public void setBdms01SecCusipBaseNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecCusipBaseNbr,bdms01SecCusipBaseNbr.length);
   	
   }
   
     /**
	 * 	Update Bdms01SecCusipBaseNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecCusipBaseNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecCusipBaseNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SecCusipBaseNbr with another Field
	 *	@param value
	 */
   public void setBdms01SecCusipBaseNbr(Field source) {
       replace(source,0,source.length(),beginBdms01SecCusipBaseNbr,BDMS_01_SEC_CUSIP_BASE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SecCusipBaseNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SecCusipBaseNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SecCusipBaseNbr,BDMS_01_SEC_CUSIP_BASE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SecCusipBaseNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecCusipBaseNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecCusipBaseNbr+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01OptionSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01OptionSegSqlcd(0);
         setMsdUnderlyingSecNo(CONSTANTS.SPACE_7);
			setMsdOptStrikePrice(BigDecimal.ZERO);
			setMsdOptFactor(BigDecimal.ZERO);
          msdOptExpMmddccyy.initialize();
     
			setMsdOptCapPrice(BigDecimal.ZERO);
         setBdms01OptExpirationDt(CONSTANTS.SPACE_10);
			setMsdUnderlyingSecPrice(BigDecimal.ZERO);
         setMsdCurrencyCode01(CONSTANTS.SPACE_3);
                     setBdms01OptTradeVolume(0);
         setBdms01OptSecurityParsInd(CONSTANTS.SPACE);
         setBdms01TypeDebtOptCd(CONSTANTS.SPACE_3);
         setBdms01EscrowRcptInd(CONSTANTS.SPACE);
         setBdms01TypeOptionCd(CONSTANTS.SPACE_2);
         setBdms01TypeIndexOptCd(CONSTANTS.SPACE_2);
         setBdms01OptCurrencyCd(CONSTANTS.SPACE_2);
         setBdms01PutCallCd(CONSTANTS.SPACE);
         setBdms01LeapInd(CONSTANTS.SPACE);
         setBdms01FlexInd(CONSTANTS.SPACE);
         setBdms01EurExerciseInd(CONSTANTS.SPACE);
         setBdms01OptCurrencyLegacyCd(CONSTANTS.SPACE_2);
			setBdms01DlvrblFctrPct(BigDecimal.ZERO);
         setBdms01DcmlFrctnCd(CONSTANTS.SPACE);
         setBdms01DlvrbOptnSymId(CONSTANTS.SPACE_6);
         setBdms01OptionMaturityDt(CONSTANTS.SPACE_10);
         setBdms01OccOptnSymId(CONSTANTS.SPACE_6);
         setBdms01FroInd(CONSTANTS.SPACE);
         setBdms01BrdBsdBnryInd(CONSTANTS.SPACE);
         setBdms01SecCusipBaseNbr(CONSTANTS.SPACE_9);
   }

		public static int getBdms01OptionSegDataFieldLength() {
			return BDMS_01_OPTION_SEG_DATA_LENGTH;
		}

}
  
