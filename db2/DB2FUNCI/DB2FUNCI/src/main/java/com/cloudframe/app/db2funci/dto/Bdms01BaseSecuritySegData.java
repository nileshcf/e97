package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01BaseSecuritySegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:18. using version 5.0.0.257
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01BaseSecuritySegData extends Bdms01BaseSecuritySegDataSerialized { 
   

								private int bdms01BaseSecuritySegSqlcd;

						private char[] msdIndustrialClass = Field.fillLowValue(2);

						private char[] msdAidsCode = Field.fillLowValue(1);

								private long msdStkDailyVolume;

								private long msdDailyVolume;

						private char[] msdTaxCode = Field.fillLowValue(1);

						private char[] msdMarginCode = Field.fillLowValue(1);

								private long msdRedenominationDate;

						private char[] msdBndRemicInd = Field.fillLowValue(1);

						private char[] msdBndRemicReitInd = Field.fillLowValue(1);

						private char[] msdCurrencyCode = Field.fillLowValue(3);

						private char[] msdCurrencyCode1 = Field.fillLowValue(3);

						private char[] msdIssueCurrencyPrev = Field.fillLowValue(3);

								private int msdIncomeDistPoint;

						private char[] msdSicCode = Field.fillLowValue(4);

						private char[] msdProprietaryCode = Field.fillLowValue(2);

						private char[] bdms01SecurityParsInd = Field.fillLowValue(1);

						private char[] bdms01MarginableLstInd = Field.fillLowValue(1);

						private char[] bdms01MarginableOtcInd = Field.fillLowValue(1);

						private char[] bdms01TaxableCd = Field.fillLowValue(1);

						private char[] bdms01ConvInd = Field.fillLowValue(1);

						private char[] bdms01CnsInd = Field.fillLowValue(1);

						private char[] bdms01R144aInd = Field.fillLowValue(1);

						private char[] msd144a = Field.fillLowValue(1);

						private char[] bdms01OptionInd = Field.fillLowValue(1);

						private char[] bdms01DllrUsTradeInd = Field.fillLowValue(1);

						private char[] bdms01BasSecCurrencyCd = Field.fillLowValue(2);

						private char[] bdms01ErclrInd = Field.fillLowValue(1);

						private char[] bdms01CedelInd = Field.fillLowValue(1);

						private char[] bdms01IssueDt = Field.fillLowValue(10);

						private char[] bdms01ReitInd = Field.fillLowValue(1);

						private char[] bdms01RemicInd = Field.fillLowValue(1);

						private char[] bdms01RoyaltyInd = Field.fillLowValue(1);

						private char[] bdms01IbmCd = Field.fillLowValue(6);

						private char[] bdms01CanadaProductCd = Field.fillLowValue(3);

						private char[] bdms01ForeignInd = Field.fillLowValue(1);

						private char[] bdms01IssueWhenInd = Field.fillLowValue(1);

						private char[] bdms01InvstDrctInd = Field.fillLowValue(1);

						private char[] bdms01CurrencyLegacyCd = Field.fillLowValue(2);

						private char[] bdms01RedenominationDt = Field.fillLowValue(10);

						private char[] bdms01OatsNasdaqCd = Field.fillLowValue(1);

						private char[] bdms01StepBondInd = Field.fillLowValue(1);

						private char[] bdms01PhlyBltmExchInd = Field.fillLowValue(1);

						private char[] bdms01ChgoExchInd = Field.fillLowValue(1);

						private char[] bdms01BstnExchInd = Field.fillLowValue(1);

						private char[] bdms01PcfcExchInd = Field.fillLowValue(1);

						private char[] bdms01MadoffInd = Field.fillLowValue(1);

						private char[] bdms01PinkSheetInd = Field.fillLowValue(1);

						private char[] bdms01NaicsCd = Field.fillLowValue(6);

						private char[] bdms01LlcInd = Field.fillLowValue(1);

								private BigDecimal bdms01YieldBidPct = BigDecimal.ZERO;

						private char[] bdms01IntPyngInd = Field.fillLowValue(1);

						private char[] bdms01TleBypassInd = Field.fillLowValue(1);

						private char[] bdms01QlfdOvrdDvdCd = Field.fillLowValue(1);

						private char[] bdms01PutStrtDt = Field.fillLowValue(10);

						private char[] bdms01PutTmngCd = Field.fillLowValue(1);

						private char[] bdms01CallTmngCd = Field.fillLowValue(1);

						private char[] bdms01OtcBlltnStkInd = Field.fillLowValue(1);
	
	/**
	* Constructor for Bdms01BaseSecuritySegData
	**/
    public Bdms01BaseSecuritySegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01BaseSecuritySegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01BaseSecuritySegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01BaseSecuritySegSqlcd
	 *	@return bdms01BaseSecuritySegSqlcd
	 */
	public int getBdms01BaseSecuritySegSqlcd() throws CFException {
       if (isBdms01BaseSecuritySegSqlcdModified()) { 
           bdms01BaseSecuritySegSqlcd = refreshBdms01BaseSecuritySegSqlcd();
        }
   		return bdms01BaseSecuritySegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01BaseSecuritySegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-BASE-SECURITY-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01BaseSecuritySegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01BaseSecuritySegSqlcd = checkBdms01BaseSecuritySegSqlcdMaxLimit(number); 
		serializeBdms01BaseSecuritySegSqlcd(bdms01BaseSecuritySegSqlcd);
	}
	

	public void setBdms01BaseSecuritySegSqlcd(long number) {
	    number = checkBdms01BaseSecuritySegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01BaseSecuritySegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01BaseSecuritySegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01BaseSecuritySegSqlcd(char[] value) throws CFException {
		 bdms01BaseSecuritySegSqlcd = serializeBdms01BaseSecuritySegSqlcd(value);
	}
	/**
	 * 	Update Bdms01BaseSecuritySegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01BaseSecuritySegSqlcdString(char[] value) throws CFException {
		 setBdms01BaseSecuritySegSqlcd(value);
	}
	/**
	 *	Returns the value of msdIndustrialClass
	 *	@return msdIndustrialClass
	 */
   public char[] getMsdIndustrialClass() throws CFException{
     if (isMsdIndustrialClassModified()) { 
        msdIndustrialClass = refreshMsdIndustrialClass();
     }
   		return msdIndustrialClass;
   }

  
	/**
	*  set variable msdIndustrialClass
	*  Corresponding COBOL Variable is MSD-INDUSTRIAL-CLASS
	*  @param value
	**/
   public void setMsdIndustrialClass(char[] value) {
      msdIndustrialClass = checkMsdIndustrialClassConstraints(value);
      serializeMsdIndustrialClass(msdIndustrialClass);
   } 

     /**
	 * 	Update MsdIndustrialClass 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdIndustrialClass(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdIndustrialClass,msdIndustrialClass.length);
   	
   }
   
   public void setMsdIndustrialClass(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdIndustrialClass,msdIndustrialClass.length);
   	
   }
   
     /**
	 * 	Update MsdIndustrialClass 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdIndustrialClass(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdIndustrialClass+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdIndustrialClass with another Field
	 *	@param value
	 */
   public void setMsdIndustrialClass(Field source) {
       replace(source,0,source.length(),beginMsdIndustrialClass,MSD_INDUSTRIAL_CLASS_LEN);
   	
   }  
   
     /**
	 * 	Update MsdIndustrialClass 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdIndustrialClass(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdIndustrialClass,MSD_INDUSTRIAL_CLASS_LEN);
   	
   }
   
     /**
	 * 	Update MsdIndustrialClass 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdIndustrialClass(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdIndustrialClass+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdAidsCode
	 *	@return msdAidsCode
	 */
   public char[] getMsdAidsCode() throws CFException{
     if (isMsdAidsCodeModified()) { 
        msdAidsCode = refreshMsdAidsCode();
     }
   		return msdAidsCode;
   }

  
	/**
	*  set variable msdAidsCode
	*  Corresponding COBOL Variable is MSD-AIDS-CODE
	*  @param value
	**/
   public void setMsdAidsCode(char[] value) {
      msdAidsCode = checkMsdAidsCodeConstraints(value);
      serializeMsdAidsCode(msdAidsCode);
   } 

     /**
	 * 	Update MsdAidsCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdAidsCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdAidsCode,msdAidsCode.length);
   	
   }
   
   public void setMsdAidsCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdAidsCode,msdAidsCode.length);
   	
   }
   
     /**
	 * 	Update MsdAidsCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdAidsCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdAidsCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdAidsCode with another Field
	 *	@param value
	 */
   public void setMsdAidsCode(Field source) {
       replace(source,0,source.length(),beginMsdAidsCode,MSD_AIDS_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update MsdAidsCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdAidsCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdAidsCode,MSD_AIDS_CODE_LEN);
   	
   }
   
     /**
	 * 	Update MsdAidsCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdAidsCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdAidsCode+targetIndex,targetLen);
    
   }
	char[] msdAidsSecurity88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isMsdAidsSecurity()
	 *	@return  Returns true if isMsdAidsSecurity() is "Y"
	 */
   public boolean isMsdAidsSecurity() throws CFException {
      return (  compareChars( getMsdAidsCode() , msdAidsSecurity88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setMsdAidsSecurityTrue() {  			
    	setMsdAidsCode( msdAidsSecurity88Value);
   	}
	char[] msdNotAidsSecurity88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isMsdNotAidsSecurity()
	 *	@return  Returns true if isMsdNotAidsSecurity() is "N"
	 */
   public boolean isMsdNotAidsSecurity() throws CFException {
      return (  compareChars( getMsdAidsCode() , msdNotAidsSecurity88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setMsdNotAidsSecurityTrue() {  			
    	setMsdAidsCode( msdNotAidsSecurity88Value);
   	}
	/**
	 *	Returns the value of msdStkDailyVolume
	 *	@return msdStkDailyVolume
	 */
	public long getMsdStkDailyVolume() throws CFException {
       if (isMsdStkDailyVolumeModified()) { 
           msdStkDailyVolume = refreshMsdStkDailyVolume();
        }
   		return msdStkDailyVolume;
	}
	

	
	   
	/**
	 * 	Update MsdStkDailyVolume with the passed value
	 *  Corresponding COBOL Variable is MSD-STK-DAILY-VOLUME
	 *	@param number
	 */
	public void setMsdStkDailyVolume(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdStkDailyVolume = checkMsdStkDailyVolumeMaxLimit(number); 
		serializeMsdStkDailyVolume(msdStkDailyVolume);
	}
	

	/**
	 * 	Update MsdStkDailyVolume with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdStkDailyVolume(char[] value) throws CFException {
		 msdStkDailyVolume = serializeMsdStkDailyVolume(value);
	}
	/**
	 * 	Update MsdStkDailyVolume with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdStkDailyVolumeString(char[] value) throws CFException {
		 setMsdStkDailyVolume(value);
	}
	/**
	 *	Returns the value of msdDailyVolume
	 *	@return msdDailyVolume
	 */
	public long getMsdDailyVolume() throws CFException {
       if (isMsdDailyVolumeModified()) { 
           msdDailyVolume = refreshMsdDailyVolume();
        }
   		return msdDailyVolume;
	}
	

	
	   
	/**
	 * 	Update MsdDailyVolume with the passed value
	 *  Corresponding COBOL Variable is MSD-DAILY-VOLUME
	 *	@param number
	 */
	public void setMsdDailyVolume(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdDailyVolume = checkMsdDailyVolumeMaxLimit(number); 
		serializeMsdDailyVolume(msdDailyVolume);
	}
	

	/**
	 * 	Update MsdDailyVolume with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdDailyVolume(char[] value) throws CFException {
		 msdDailyVolume = serializeMsdDailyVolume(value);
	}
	/**
	 * 	Update MsdDailyVolume with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdDailyVolumeString(char[] value) throws CFException {
		 setMsdDailyVolume(value);
	}
	/**
	 *	Returns the value of msdTaxCode
	 *	@return msdTaxCode
	 */
   public char[] getMsdTaxCode() throws CFException{
     if (isMsdTaxCodeModified()) { 
        msdTaxCode = refreshMsdTaxCode();
     }
   		return msdTaxCode;
   }

  
	/**
	*  set variable msdTaxCode
	*  Corresponding COBOL Variable is MSD-TAX-CODE
	*  @param value
	**/
   public void setMsdTaxCode(char[] value) {
      msdTaxCode = checkMsdTaxCodeConstraints(value);
      serializeMsdTaxCode(msdTaxCode);
   } 

     /**
	 * 	Update MsdTaxCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdTaxCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdTaxCode,msdTaxCode.length);
   	
   }
   
   public void setMsdTaxCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdTaxCode,msdTaxCode.length);
   	
   }
   
     /**
	 * 	Update MsdTaxCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdTaxCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdTaxCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdTaxCode with another Field
	 *	@param value
	 */
   public void setMsdTaxCode(Field source) {
       replace(source,0,source.length(),beginMsdTaxCode,MSD_TAX_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update MsdTaxCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdTaxCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdTaxCode,MSD_TAX_CODE_LEN);
   	
   }
   
     /**
	 * 	Update MsdTaxCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdTaxCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdTaxCode+targetIndex,targetLen);
    
   }
	char[] msdNonTaxable88Value = fillZeroes(1);
	/**
	 *	Test condition "0" for isMsdNonTaxable()
	 *	@return  Returns true if isMsdNonTaxable() is "0"
	 */
   public boolean isMsdNonTaxable() throws CFException {
      return (  compareChars( getMsdTaxCode() , msdNonTaxable88Value)  == 0  );
   }


	/**
	*  set values "0"
	*/
   	public void setMsdNonTaxableTrue() {  			
    	setMsdTaxCode( msdNonTaxable88Value);
   	}
	char[] msdTaxable88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isMsdTaxable()
	 *	@return  Returns true if isMsdTaxable() is "1"
	 */
   public boolean isMsdTaxable() throws CFException {
      return (  compareChars( getMsdTaxCode() , msdTaxable88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setMsdTaxableTrue() {  			
    	setMsdTaxCode( msdTaxable88Value);
   	}
	char[] msdAmtAltMinTax88Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isMsdAmtAltMinTax()
	 *	@return  Returns true if isMsdAmtAltMinTax() is "2"
	 */
   public boolean isMsdAmtAltMinTax() throws CFException {
      return (  compareChars( getMsdTaxCode() , msdAmtAltMinTax88Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setMsdAmtAltMinTaxTrue() {  			
    	setMsdTaxCode( msdAmtAltMinTax88Value);
   	}
	char[] msdNonTaxbleForeignInvstr88Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isMsdNonTaxbleForeignInvstr()
	 *	@return  Returns true if isMsdNonTaxbleForeignInvstr() is "3"
	 */
   public boolean isMsdNonTaxbleForeignInvstr() throws CFException {
      return (  compareChars( getMsdTaxCode() , msdNonTaxbleForeignInvstr88Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setMsdNonTaxbleForeignInvstrTrue() {  			
    	setMsdTaxCode( msdNonTaxbleForeignInvstr88Value);
   	}
	/**
	 *	Returns the value of msdMarginCode
	 *	@return msdMarginCode
	 */
   public char[] getMsdMarginCode() throws CFException{
     if (isMsdMarginCodeModified()) { 
        msdMarginCode = refreshMsdMarginCode();
     }
   		return msdMarginCode;
   }

  
	/**
	*  set variable msdMarginCode
	*  Corresponding COBOL Variable is MSD-MARGIN-CODE
	*  @param value
	**/
   public void setMsdMarginCode(char[] value) {
      msdMarginCode = checkMsdMarginCodeConstraints(value);
      serializeMsdMarginCode(msdMarginCode);
   } 

     /**
	 * 	Update MsdMarginCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdMarginCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdMarginCode,msdMarginCode.length);
   	
   }
   
   public void setMsdMarginCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdMarginCode,msdMarginCode.length);
   	
   }
   
     /**
	 * 	Update MsdMarginCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdMarginCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdMarginCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdMarginCode with another Field
	 *	@param value
	 */
   public void setMsdMarginCode(Field source) {
       replace(source,0,source.length(),beginMsdMarginCode,MSD_MARGIN_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update MsdMarginCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdMarginCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdMarginCode,MSD_MARGIN_CODE_LEN);
   	
   }
   
     /**
	 * 	Update MsdMarginCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdMarginCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdMarginCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdRedenominationDate
	 *	@return msdRedenominationDate
	 */
	public long getMsdRedenominationDate() throws CFException {
       if (isMsdRedenominationDateModified()) { 
           msdRedenominationDate = refreshMsdRedenominationDate();
        }
   		return msdRedenominationDate;
	}
	

	
	   
	/**
	 * 	Update MsdRedenominationDate with the passed value
	 *  Corresponding COBOL Variable is MSD-REDENOMINATION-DATE
	 *	@param number
	 */
	public void setMsdRedenominationDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdRedenominationDate = checkMsdRedenominationDateMaxLimit(number); 
		serializeMsdRedenominationDate(msdRedenominationDate);
	}
	

	/**
	 * 	Update MsdRedenominationDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdRedenominationDate(char[] value) throws CFException {
		 msdRedenominationDate = serializeMsdRedenominationDate(value);
	}
	/**
	 * 	Update MsdRedenominationDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdRedenominationDateString(char[] value) throws CFException {
		 setMsdRedenominationDate(value);
	}
	/**
	 *	Returns the value of msdBndRemicInd
	 *	@return msdBndRemicInd
	 */
   public char[] getMsdBndRemicInd() throws CFException{
     if (isMsdBndRemicIndModified()) { 
        msdBndRemicInd = refreshMsdBndRemicInd();
     }
   		return msdBndRemicInd;
   }

  
	/**
	*  set variable msdBndRemicInd
	*  Corresponding COBOL Variable is MSD-BND-REMIC-IND
	*  @param value
	**/
   public void setMsdBndRemicInd(char[] value) {
      msdBndRemicInd = checkMsdBndRemicIndConstraints(value);
      serializeMsdBndRemicInd(msdBndRemicInd);
   } 

     /**
	 * 	Update MsdBndRemicInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdBndRemicInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdBndRemicInd,msdBndRemicInd.length);
   	
   }
   
   public void setMsdBndRemicInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBndRemicInd,msdBndRemicInd.length);
   	
   }
   
     /**
	 * 	Update MsdBndRemicInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdBndRemicInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBndRemicInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdBndRemicInd with another Field
	 *	@param value
	 */
   public void setMsdBndRemicInd(Field source) {
       replace(source,0,source.length(),beginMsdBndRemicInd,MSD_BND_REMIC_IND_LEN);
   	
   }  
   
     /**
	 * 	Update MsdBndRemicInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdBndRemicInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdBndRemicInd,MSD_BND_REMIC_IND_LEN);
   	
   }
   
     /**
	 * 	Update MsdBndRemicInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdBndRemicInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBndRemicInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdBndRemicReitInd
	 *	@return msdBndRemicReitInd
	 */
   public char[] getMsdBndRemicReitInd() throws CFException{
     if (isMsdBndRemicReitIndModified()) { 
        msdBndRemicReitInd = refreshMsdBndRemicReitInd();
     }
   		return msdBndRemicReitInd;
   }

  
	/**
	*  set variable msdBndRemicReitInd
	*  Corresponding COBOL Variable is MSD-BND-REMIC-REIT-IND
	*  @param value
	**/
   public void setMsdBndRemicReitInd(char[] value) {
      msdBndRemicReitInd = checkMsdBndRemicReitIndConstraints(value);
      serializeMsdBndRemicReitInd(msdBndRemicReitInd);
   } 

     /**
	 * 	Update MsdBndRemicReitInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdBndRemicReitInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdBndRemicReitInd,msdBndRemicReitInd.length);
   	
   }
   
   public void setMsdBndRemicReitInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBndRemicReitInd,msdBndRemicReitInd.length);
   	
   }
   
     /**
	 * 	Update MsdBndRemicReitInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdBndRemicReitInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBndRemicReitInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdBndRemicReitInd with another Field
	 *	@param value
	 */
   public void setMsdBndRemicReitInd(Field source) {
       replace(source,0,source.length(),beginMsdBndRemicReitInd,MSD_BND_REMIC_REIT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update MsdBndRemicReitInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdBndRemicReitInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdBndRemicReitInd,MSD_BND_REMIC_REIT_IND_LEN);
   	
   }
   
     /**
	 * 	Update MsdBndRemicReitInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdBndRemicReitInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdBndRemicReitInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdCurrencyCode
	 *	@return msdCurrencyCode
	 */
   public char[] getMsdCurrencyCode() throws CFException{
     if (isMsdCurrencyCodeModified()) { 
        msdCurrencyCode = refreshMsdCurrencyCode();
     }
   		return msdCurrencyCode;
   }

  
	/**
	*  set variable msdCurrencyCode
	*  Corresponding COBOL Variable is MSD-CURRENCY-CODE
	*  @param value
	**/
   public void setMsdCurrencyCode(char[] value) {
      msdCurrencyCode = checkMsdCurrencyCodeConstraints(value);
      serializeMsdCurrencyCode(msdCurrencyCode);
   } 

     /**
	 * 	Update MsdCurrencyCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdCurrencyCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdCurrencyCode,msdCurrencyCode.length);
   	
   }
   
   public void setMsdCurrencyCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCurrencyCode,msdCurrencyCode.length);
   	
   }
   
     /**
	 * 	Update MsdCurrencyCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdCurrencyCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCurrencyCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdCurrencyCode with another Field
	 *	@param value
	 */
   public void setMsdCurrencyCode(Field source) {
       replace(source,0,source.length(),beginMsdCurrencyCode,MSD_CURRENCY_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update MsdCurrencyCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdCurrencyCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdCurrencyCode,MSD_CURRENCY_CODE_LEN);
   	
   }
   
     /**
	 * 	Update MsdCurrencyCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdCurrencyCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCurrencyCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdCurrencyCode1
	 *	@return msdCurrencyCode1
	 */
   public char[] getMsdCurrencyCode1() throws CFException{
     if (isMsdCurrencyCode1Modified()) { 
        msdCurrencyCode1 = refreshMsdCurrencyCode1();
     }
   		return msdCurrencyCode1;
   }

  
	/**
	*  set variable msdCurrencyCode1
	*  Corresponding COBOL Variable is MSD-CURRENCY-CODE-1
	*  @param value
	**/
   public void setMsdCurrencyCode1(char[] value) {
      msdCurrencyCode1 = checkMsdCurrencyCode1Constraints(value);
      serializeMsdCurrencyCode1(msdCurrencyCode1);
   } 

     /**
	 * 	Update MsdCurrencyCode1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdCurrencyCode1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdCurrencyCode1,msdCurrencyCode1.length);
   	
   }
   
   public void setMsdCurrencyCode1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCurrencyCode1,msdCurrencyCode1.length);
   	
   }
   
     /**
	 * 	Update MsdCurrencyCode1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdCurrencyCode1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCurrencyCode1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdCurrencyCode1 with another Field
	 *	@param value
	 */
   public void setMsdCurrencyCode1(Field source) {
       replace(source,0,source.length(),beginMsdCurrencyCode1,MSD_CURRENCY_CODE_1_LEN);
   	
   }  
   
     /**
	 * 	Update MsdCurrencyCode1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdCurrencyCode1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdCurrencyCode1,MSD_CURRENCY_CODE_1_LEN);
   	
   }
   
     /**
	 * 	Update MsdCurrencyCode1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdCurrencyCode1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCurrencyCode1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdIssueCurrencyPrev
	 *	@return msdIssueCurrencyPrev
	 */
   public char[] getMsdIssueCurrencyPrev() throws CFException{
     if (isMsdIssueCurrencyPrevModified()) { 
        msdIssueCurrencyPrev = refreshMsdIssueCurrencyPrev();
     }
   		return msdIssueCurrencyPrev;
   }

  
	/**
	*  set variable msdIssueCurrencyPrev
	*  Corresponding COBOL Variable is MSD-ISSUE-CURRENCY-PREV
	*  @param value
	**/
   public void setMsdIssueCurrencyPrev(char[] value) {
      msdIssueCurrencyPrev = checkMsdIssueCurrencyPrevConstraints(value);
      serializeMsdIssueCurrencyPrev(msdIssueCurrencyPrev);
   } 

     /**
	 * 	Update MsdIssueCurrencyPrev 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdIssueCurrencyPrev(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdIssueCurrencyPrev,msdIssueCurrencyPrev.length);
   	
   }
   
   public void setMsdIssueCurrencyPrev(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdIssueCurrencyPrev,msdIssueCurrencyPrev.length);
   	
   }
   
     /**
	 * 	Update MsdIssueCurrencyPrev 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdIssueCurrencyPrev(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdIssueCurrencyPrev+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdIssueCurrencyPrev with another Field
	 *	@param value
	 */
   public void setMsdIssueCurrencyPrev(Field source) {
       replace(source,0,source.length(),beginMsdIssueCurrencyPrev,MSD_ISSUE_CURRENCY_PREV_LEN);
   	
   }  
   
     /**
	 * 	Update MsdIssueCurrencyPrev 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdIssueCurrencyPrev(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdIssueCurrencyPrev,MSD_ISSUE_CURRENCY_PREV_LEN);
   	
   }
   
     /**
	 * 	Update MsdIssueCurrencyPrev 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdIssueCurrencyPrev(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdIssueCurrencyPrev+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdIncomeDistPoint
	 *	@return msdIncomeDistPoint
	 */
	public int getMsdIncomeDistPoint() throws CFException {
       if (isMsdIncomeDistPointModified()) { 
           msdIncomeDistPoint = refreshMsdIncomeDistPoint();
        }
   		return msdIncomeDistPoint;
	}
	

	
	   
	/**
	 * 	Update MsdIncomeDistPoint with the passed value
	 *  Corresponding COBOL Variable is MSD-INCOME-DIST-POINT
	 *	@param number
	 */
	public void setMsdIncomeDistPoint(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdIncomeDistPoint = checkMsdIncomeDistPointMaxLimit(number); 
		serializeMsdIncomeDistPoint(msdIncomeDistPoint);
	}
	

	public void setMsdIncomeDistPoint(long number) {
	    number = checkMsdIncomeDistPointMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdIncomeDistPoint((int)number);
	}
	
	/**
	 * 	Update MsdIncomeDistPoint with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdIncomeDistPoint(char[] value) throws CFException {
		 msdIncomeDistPoint = serializeMsdIncomeDistPoint(value);
	}
	/**
	 * 	Update MsdIncomeDistPoint with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdIncomeDistPointString(char[] value) throws CFException {
		 setMsdIncomeDistPoint(value);
	}
	/**
	 *	Returns the value of msdSicCode
	 *	@return msdSicCode
	 */
   public char[] getMsdSicCode() throws CFException{
     if (isMsdSicCodeModified()) { 
        msdSicCode = refreshMsdSicCode();
     }
   		return msdSicCode;
   }

  
	/**
	*  set variable msdSicCode
	*  Corresponding COBOL Variable is MSD-SIC-CODE
	*  @param value
	**/
   public void setMsdSicCode(char[] value) {
      msdSicCode = checkMsdSicCodeConstraints(value);
      serializeMsdSicCode(msdSicCode);
   } 

     /**
	 * 	Update MsdSicCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSicCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSicCode,msdSicCode.length);
   	
   }
   
   public void setMsdSicCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSicCode,msdSicCode.length);
   	
   }
   
     /**
	 * 	Update MsdSicCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSicCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSicCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSicCode with another Field
	 *	@param value
	 */
   public void setMsdSicCode(Field source) {
       replace(source,0,source.length(),beginMsdSicCode,MSD_SIC_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSicCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSicCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSicCode,MSD_SIC_CODE_LEN);
   	
   }
   
     /**
	 * 	Update MsdSicCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSicCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSicCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdProprietaryCode
	 *	@return msdProprietaryCode
	 */
   public char[] getMsdProprietaryCode() throws CFException{
     if (isMsdProprietaryCodeModified()) { 
        msdProprietaryCode = refreshMsdProprietaryCode();
     }
   		return msdProprietaryCode;
   }

  
	/**
	*  set variable msdProprietaryCode
	*  Corresponding COBOL Variable is MSD-PROPRIETARY-CODE
	*  @param value
	**/
   public void setMsdProprietaryCode(char[] value) {
      msdProprietaryCode = checkMsdProprietaryCodeConstraints(value);
      serializeMsdProprietaryCode(msdProprietaryCode);
   } 

     /**
	 * 	Update MsdProprietaryCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdProprietaryCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdProprietaryCode,msdProprietaryCode.length);
   	
   }
   
   public void setMsdProprietaryCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdProprietaryCode,msdProprietaryCode.length);
   	
   }
   
     /**
	 * 	Update MsdProprietaryCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdProprietaryCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdProprietaryCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdProprietaryCode with another Field
	 *	@param value
	 */
   public void setMsdProprietaryCode(Field source) {
       replace(source,0,source.length(),beginMsdProprietaryCode,MSD_PROPRIETARY_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update MsdProprietaryCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdProprietaryCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdProprietaryCode,MSD_PROPRIETARY_CODE_LEN);
   	
   }
   
     /**
	 * 	Update MsdProprietaryCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdProprietaryCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdProprietaryCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SecurityParsInd
	 *	@return bdms01SecurityParsInd
	 */
   public char[] getBdms01SecurityParsInd() throws CFException{
     if (isBdms01SecurityParsIndModified()) { 
        bdms01SecurityParsInd = refreshBdms01SecurityParsInd();
     }
   		return bdms01SecurityParsInd;
   }

  
	/**
	*  set variable bdms01SecurityParsInd
	*  Corresponding COBOL Variable is BDMS01-SECURITY-PARS-IND
	*  @param value
	**/
   public void setBdms01SecurityParsInd(char[] value) {
      bdms01SecurityParsInd = checkBdms01SecurityParsIndConstraints(value);
      serializeBdms01SecurityParsInd(bdms01SecurityParsInd);
   } 

     /**
	 * 	Update Bdms01SecurityParsInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SecurityParsInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SecurityParsInd,bdms01SecurityParsInd.length);
   	
   }
   
   public void setBdms01SecurityParsInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecurityParsInd,bdms01SecurityParsInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SecurityParsInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecurityParsInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecurityParsInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SecurityParsInd with another Field
	 *	@param value
	 */
   public void setBdms01SecurityParsInd(Field source) {
       replace(source,0,source.length(),beginBdms01SecurityParsInd,BDMS_01_SECURITY_PARS_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SecurityParsInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SecurityParsInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SecurityParsInd,BDMS_01_SECURITY_PARS_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SecurityParsInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecurityParsInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecurityParsInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01MarginableLstInd
	 *	@return bdms01MarginableLstInd
	 */
   public char[] getBdms01MarginableLstInd() throws CFException{
     if (isBdms01MarginableLstIndModified()) { 
        bdms01MarginableLstInd = refreshBdms01MarginableLstInd();
     }
   		return bdms01MarginableLstInd;
   }

  
	/**
	*  set variable bdms01MarginableLstInd
	*  Corresponding COBOL Variable is BDMS01-MARGINABLE-LST-IND
	*  @param value
	**/
   public void setBdms01MarginableLstInd(char[] value) {
      bdms01MarginableLstInd = checkBdms01MarginableLstIndConstraints(value);
      serializeBdms01MarginableLstInd(bdms01MarginableLstInd);
   } 

     /**
	 * 	Update Bdms01MarginableLstInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01MarginableLstInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01MarginableLstInd,bdms01MarginableLstInd.length);
   	
   }
   
   public void setBdms01MarginableLstInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MarginableLstInd,bdms01MarginableLstInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01MarginableLstInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MarginableLstInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MarginableLstInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01MarginableLstInd with another Field
	 *	@param value
	 */
   public void setBdms01MarginableLstInd(Field source) {
       replace(source,0,source.length(),beginBdms01MarginableLstInd,BDMS_01_MARGINABLE_LST_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01MarginableLstInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01MarginableLstInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01MarginableLstInd,BDMS_01_MARGINABLE_LST_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01MarginableLstInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MarginableLstInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MarginableLstInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01MarginableOtcInd
	 *	@return bdms01MarginableOtcInd
	 */
   public char[] getBdms01MarginableOtcInd() throws CFException{
     if (isBdms01MarginableOtcIndModified()) { 
        bdms01MarginableOtcInd = refreshBdms01MarginableOtcInd();
     }
   		return bdms01MarginableOtcInd;
   }

  
	/**
	*  set variable bdms01MarginableOtcInd
	*  Corresponding COBOL Variable is BDMS01-MARGINABLE-OTC-IND
	*  @param value
	**/
   public void setBdms01MarginableOtcInd(char[] value) {
      bdms01MarginableOtcInd = checkBdms01MarginableOtcIndConstraints(value);
      serializeBdms01MarginableOtcInd(bdms01MarginableOtcInd);
   } 

     /**
	 * 	Update Bdms01MarginableOtcInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01MarginableOtcInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01MarginableOtcInd,bdms01MarginableOtcInd.length);
   	
   }
   
   public void setBdms01MarginableOtcInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MarginableOtcInd,bdms01MarginableOtcInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01MarginableOtcInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MarginableOtcInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MarginableOtcInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01MarginableOtcInd with another Field
	 *	@param value
	 */
   public void setBdms01MarginableOtcInd(Field source) {
       replace(source,0,source.length(),beginBdms01MarginableOtcInd,BDMS_01_MARGINABLE_OTC_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01MarginableOtcInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01MarginableOtcInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01MarginableOtcInd,BDMS_01_MARGINABLE_OTC_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01MarginableOtcInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MarginableOtcInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MarginableOtcInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TaxableCd
	 *	@return bdms01TaxableCd
	 */
   public char[] getBdms01TaxableCd() throws CFException{
     if (isBdms01TaxableCdModified()) { 
        bdms01TaxableCd = refreshBdms01TaxableCd();
     }
   		return bdms01TaxableCd;
   }

  
	/**
	*  set variable bdms01TaxableCd
	*  Corresponding COBOL Variable is BDMS01-TAXABLE-CD
	*  @param value
	**/
   public void setBdms01TaxableCd(char[] value) {
      bdms01TaxableCd = checkBdms01TaxableCdConstraints(value);
      serializeBdms01TaxableCd(bdms01TaxableCd);
   } 

     /**
	 * 	Update Bdms01TaxableCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TaxableCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TaxableCd,bdms01TaxableCd.length);
   	
   }
   
   public void setBdms01TaxableCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TaxableCd,bdms01TaxableCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TaxableCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TaxableCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TaxableCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TaxableCd with another Field
	 *	@param value
	 */
   public void setBdms01TaxableCd(Field source) {
       replace(source,0,source.length(),beginBdms01TaxableCd,BDMS_01_TAXABLE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TaxableCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TaxableCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TaxableCd,BDMS_01_TAXABLE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TaxableCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TaxableCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TaxableCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ConvInd
	 *	@return bdms01ConvInd
	 */
   public char[] getBdms01ConvInd() throws CFException{
     if (isBdms01ConvIndModified()) { 
        bdms01ConvInd = refreshBdms01ConvInd();
     }
   		return bdms01ConvInd;
   }

  
	/**
	*  set variable bdms01ConvInd
	*  Corresponding COBOL Variable is BDMS01-CONV-IND
	*  @param value
	**/
   public void setBdms01ConvInd(char[] value) {
      bdms01ConvInd = checkBdms01ConvIndConstraints(value);
      serializeBdms01ConvInd(bdms01ConvInd);
   } 

     /**
	 * 	Update Bdms01ConvInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ConvInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ConvInd,bdms01ConvInd.length);
   	
   }
   
   public void setBdms01ConvInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ConvInd,bdms01ConvInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01ConvInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ConvInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ConvInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ConvInd with another Field
	 *	@param value
	 */
   public void setBdms01ConvInd(Field source) {
       replace(source,0,source.length(),beginBdms01ConvInd,BDMS_01_CONV_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ConvInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ConvInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ConvInd,BDMS_01_CONV_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ConvInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ConvInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ConvInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CnsInd
	 *	@return bdms01CnsInd
	 */
   public char[] getBdms01CnsInd() throws CFException{
     if (isBdms01CnsIndModified()) { 
        bdms01CnsInd = refreshBdms01CnsInd();
     }
   		return bdms01CnsInd;
   }

  
	/**
	*  set variable bdms01CnsInd
	*  Corresponding COBOL Variable is BDMS01-CNS-IND
	*  @param value
	**/
   public void setBdms01CnsInd(char[] value) {
      bdms01CnsInd = checkBdms01CnsIndConstraints(value);
      serializeBdms01CnsInd(bdms01CnsInd);
   } 

     /**
	 * 	Update Bdms01CnsInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CnsInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CnsInd,bdms01CnsInd.length);
   	
   }
   
   public void setBdms01CnsInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CnsInd,bdms01CnsInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CnsInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CnsInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CnsInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CnsInd with another Field
	 *	@param value
	 */
   public void setBdms01CnsInd(Field source) {
       replace(source,0,source.length(),beginBdms01CnsInd,BDMS_01_CNS_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CnsInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CnsInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CnsInd,BDMS_01_CNS_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CnsInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CnsInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CnsInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01R144aInd
	 *	@return bdms01R144aInd
	 */
   public char[] getBdms01R144aInd() throws CFException{
     if (isBdms01R144aIndModified()) { 
        bdms01R144aInd = refreshBdms01R144aInd();
     }
   		return bdms01R144aInd;
   }

  
	/**
	*  set variable bdms01R144aInd
	*  Corresponding COBOL Variable is BDMS01-R144A-IND
	*  @param value
	**/
   public void setBdms01R144aInd(char[] value) {
      bdms01R144aInd = checkBdms01R144aIndConstraints(value);
      serializeBdms01R144aInd(bdms01R144aInd);
   } 

     /**
	 * 	Update Bdms01R144aInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01R144aInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01R144aInd,bdms01R144aInd.length);
   	
   }
   
   public void setBdms01R144aInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01R144aInd,bdms01R144aInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01R144aInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01R144aInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01R144aInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01R144aInd with another Field
	 *	@param value
	 */
   public void setBdms01R144aInd(Field source) {
       replace(source,0,source.length(),beginBdms01R144aInd,BDMS_01_R_144A_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01R144aInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01R144aInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01R144aInd,BDMS_01_R_144A_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01R144aInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01R144aInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01R144aInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msd144a
	 *	@return msd144a
	 */
   public char[] getMsd144a() throws CFException{
     if (isMsd144aModified()) { 
        msd144a = refreshMsd144a();
     }
   		return msd144a;
   }

  
	/**
	*  set variable msd144a
	*  Corresponding COBOL Variable is MSD-144A
	*  @param value
	**/
   public void setMsd144a(char[] value) {
      msd144a = checkMsd144aConstraints(value);
      serializeMsd144a(msd144a);
   } 

     /**
	 * 	Update Msd144a 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsd144a(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsd144a,msd144a.length);
   	
   }
   
   public void setMsd144a(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsd144a,msd144a.length);
   	
   }
   
     /**
	 * 	Update Msd144a 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsd144a(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsd144a+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Msd144a with another Field
	 *	@param value
	 */
   public void setMsd144a(Field source) {
       replace(source,0,source.length(),beginMsd144a,MSD_144A_LEN);
   	
   }  
   
     /**
	 * 	Update Msd144a 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsd144a(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsd144a,MSD_144A_LEN);
   	
   }
   
     /**
	 * 	Update Msd144a 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsd144a(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsd144a+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01OptionInd
	 *	@return bdms01OptionInd
	 */
   public char[] getBdms01OptionInd() throws CFException{
     if (isBdms01OptionIndModified()) { 
        bdms01OptionInd = refreshBdms01OptionInd();
     }
   		return bdms01OptionInd;
   }

  
	/**
	*  set variable bdms01OptionInd
	*  Corresponding COBOL Variable is BDMS01-OPTION-IND
	*  @param value
	**/
   public void setBdms01OptionInd(char[] value) {
      bdms01OptionInd = checkBdms01OptionIndConstraints(value);
      serializeBdms01OptionInd(bdms01OptionInd);
   } 

     /**
	 * 	Update Bdms01OptionInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OptionInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OptionInd,bdms01OptionInd.length);
   	
   }
   
   public void setBdms01OptionInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptionInd,bdms01OptionInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01OptionInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptionInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptionInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OptionInd with another Field
	 *	@param value
	 */
   public void setBdms01OptionInd(Field source) {
       replace(source,0,source.length(),beginBdms01OptionInd,BDMS_01_OPTION_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OptionInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OptionInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OptionInd,BDMS_01_OPTION_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OptionInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptionInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptionInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01DllrUsTradeInd
	 *	@return bdms01DllrUsTradeInd
	 */
   public char[] getBdms01DllrUsTradeInd() throws CFException{
     if (isBdms01DllrUsTradeIndModified()) { 
        bdms01DllrUsTradeInd = refreshBdms01DllrUsTradeInd();
     }
   		return bdms01DllrUsTradeInd;
   }

  
	/**
	*  set variable bdms01DllrUsTradeInd
	*  Corresponding COBOL Variable is BDMS01-DLLR-US-TRADE-IND
	*  @param value
	**/
   public void setBdms01DllrUsTradeInd(char[] value) {
      bdms01DllrUsTradeInd = checkBdms01DllrUsTradeIndConstraints(value);
      serializeBdms01DllrUsTradeInd(bdms01DllrUsTradeInd);
   } 

     /**
	 * 	Update Bdms01DllrUsTradeInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01DllrUsTradeInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01DllrUsTradeInd,bdms01DllrUsTradeInd.length);
   	
   }
   
   public void setBdms01DllrUsTradeInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DllrUsTradeInd,bdms01DllrUsTradeInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01DllrUsTradeInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DllrUsTradeInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DllrUsTradeInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01DllrUsTradeInd with another Field
	 *	@param value
	 */
   public void setBdms01DllrUsTradeInd(Field source) {
       replace(source,0,source.length(),beginBdms01DllrUsTradeInd,BDMS_01_DLLR_US_TRADE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01DllrUsTradeInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01DllrUsTradeInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01DllrUsTradeInd,BDMS_01_DLLR_US_TRADE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01DllrUsTradeInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DllrUsTradeInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DllrUsTradeInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01BasSecCurrencyCd
	 *	@return bdms01BasSecCurrencyCd
	 */
   public char[] getBdms01BasSecCurrencyCd() throws CFException{
     if (isBdms01BasSecCurrencyCdModified()) { 
        bdms01BasSecCurrencyCd = refreshBdms01BasSecCurrencyCd();
     }
   		return bdms01BasSecCurrencyCd;
   }

  
	/**
	*  set variable bdms01BasSecCurrencyCd
	*  Corresponding COBOL Variable is BDMS01-BAS-SEC-CURRENCY-CD
	*  @param value
	**/
   public void setBdms01BasSecCurrencyCd(char[] value) {
      bdms01BasSecCurrencyCd = checkBdms01BasSecCurrencyCdConstraints(value);
      serializeBdms01BasSecCurrencyCd(bdms01BasSecCurrencyCd);
   } 

     /**
	 * 	Update Bdms01BasSecCurrencyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01BasSecCurrencyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01BasSecCurrencyCd,bdms01BasSecCurrencyCd.length);
   	
   }
   
   public void setBdms01BasSecCurrencyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BasSecCurrencyCd,bdms01BasSecCurrencyCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01BasSecCurrencyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BasSecCurrencyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BasSecCurrencyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01BasSecCurrencyCd with another Field
	 *	@param value
	 */
   public void setBdms01BasSecCurrencyCd(Field source) {
       replace(source,0,source.length(),beginBdms01BasSecCurrencyCd,BDMS_01_BAS_SEC_CURRENCY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01BasSecCurrencyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01BasSecCurrencyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01BasSecCurrencyCd,BDMS_01_BAS_SEC_CURRENCY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01BasSecCurrencyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BasSecCurrencyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BasSecCurrencyCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ErclrInd
	 *	@return bdms01ErclrInd
	 */
   public char[] getBdms01ErclrInd() throws CFException{
     if (isBdms01ErclrIndModified()) { 
        bdms01ErclrInd = refreshBdms01ErclrInd();
     }
   		return bdms01ErclrInd;
   }

  
	/**
	*  set variable bdms01ErclrInd
	*  Corresponding COBOL Variable is BDMS01-ERCLR-IND
	*  @param value
	**/
   public void setBdms01ErclrInd(char[] value) {
      bdms01ErclrInd = checkBdms01ErclrIndConstraints(value);
      serializeBdms01ErclrInd(bdms01ErclrInd);
   } 

     /**
	 * 	Update Bdms01ErclrInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ErclrInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ErclrInd,bdms01ErclrInd.length);
   	
   }
   
   public void setBdms01ErclrInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ErclrInd,bdms01ErclrInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01ErclrInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ErclrInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ErclrInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ErclrInd with another Field
	 *	@param value
	 */
   public void setBdms01ErclrInd(Field source) {
       replace(source,0,source.length(),beginBdms01ErclrInd,BDMS_01_ERCLR_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ErclrInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ErclrInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ErclrInd,BDMS_01_ERCLR_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ErclrInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ErclrInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ErclrInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CedelInd
	 *	@return bdms01CedelInd
	 */
   public char[] getBdms01CedelInd() throws CFException{
     if (isBdms01CedelIndModified()) { 
        bdms01CedelInd = refreshBdms01CedelInd();
     }
   		return bdms01CedelInd;
   }

  
	/**
	*  set variable bdms01CedelInd
	*  Corresponding COBOL Variable is BDMS01-CEDEL-IND
	*  @param value
	**/
   public void setBdms01CedelInd(char[] value) {
      bdms01CedelInd = checkBdms01CedelIndConstraints(value);
      serializeBdms01CedelInd(bdms01CedelInd);
   } 

     /**
	 * 	Update Bdms01CedelInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CedelInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CedelInd,bdms01CedelInd.length);
   	
   }
   
   public void setBdms01CedelInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CedelInd,bdms01CedelInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CedelInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CedelInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CedelInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CedelInd with another Field
	 *	@param value
	 */
   public void setBdms01CedelInd(Field source) {
       replace(source,0,source.length(),beginBdms01CedelInd,BDMS_01_CEDEL_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CedelInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CedelInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CedelInd,BDMS_01_CEDEL_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CedelInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CedelInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CedelInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01IssueDt
	 *	@return bdms01IssueDt
	 */
   public char[] getBdms01IssueDt() throws CFException{
     if (isBdms01IssueDtModified()) { 
        bdms01IssueDt = refreshBdms01IssueDt();
     }
   		return bdms01IssueDt;
   }

  
	/**
	*  set variable bdms01IssueDt
	*  Corresponding COBOL Variable is BDMS01-ISSUE-DT
	*  @param value
	**/
   public void setBdms01IssueDt(char[] value) {
      bdms01IssueDt = checkBdms01IssueDtConstraints(value);
      serializeBdms01IssueDt(bdms01IssueDt);
   } 

     /**
	 * 	Update Bdms01IssueDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01IssueDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01IssueDt,bdms01IssueDt.length);
   	
   }
   
   public void setBdms01IssueDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IssueDt,bdms01IssueDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01IssueDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01IssueDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IssueDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01IssueDt with another Field
	 *	@param value
	 */
   public void setBdms01IssueDt(Field source) {
       replace(source,0,source.length(),beginBdms01IssueDt,BDMS_01_ISSUE_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01IssueDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01IssueDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01IssueDt,BDMS_01_ISSUE_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01IssueDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01IssueDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IssueDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ReitInd
	 *	@return bdms01ReitInd
	 */
   public char[] getBdms01ReitInd() throws CFException{
     if (isBdms01ReitIndModified()) { 
        bdms01ReitInd = refreshBdms01ReitInd();
     }
   		return bdms01ReitInd;
   }

  
	/**
	*  set variable bdms01ReitInd
	*  Corresponding COBOL Variable is BDMS01-REIT-IND
	*  @param value
	**/
   public void setBdms01ReitInd(char[] value) {
      bdms01ReitInd = checkBdms01ReitIndConstraints(value);
      serializeBdms01ReitInd(bdms01ReitInd);
   } 

     /**
	 * 	Update Bdms01ReitInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ReitInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ReitInd,bdms01ReitInd.length);
   	
   }
   
   public void setBdms01ReitInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ReitInd,bdms01ReitInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01ReitInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ReitInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ReitInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ReitInd with another Field
	 *	@param value
	 */
   public void setBdms01ReitInd(Field source) {
       replace(source,0,source.length(),beginBdms01ReitInd,BDMS_01_REIT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ReitInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ReitInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ReitInd,BDMS_01_REIT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ReitInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ReitInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ReitInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RemicInd
	 *	@return bdms01RemicInd
	 */
   public char[] getBdms01RemicInd() throws CFException{
     if (isBdms01RemicIndModified()) { 
        bdms01RemicInd = refreshBdms01RemicInd();
     }
   		return bdms01RemicInd;
   }

  
	/**
	*  set variable bdms01RemicInd
	*  Corresponding COBOL Variable is BDMS01-REMIC-IND
	*  @param value
	**/
   public void setBdms01RemicInd(char[] value) {
      bdms01RemicInd = checkBdms01RemicIndConstraints(value);
      serializeBdms01RemicInd(bdms01RemicInd);
   } 

     /**
	 * 	Update Bdms01RemicInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RemicInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RemicInd,bdms01RemicInd.length);
   	
   }
   
   public void setBdms01RemicInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RemicInd,bdms01RemicInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01RemicInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RemicInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RemicInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RemicInd with another Field
	 *	@param value
	 */
   public void setBdms01RemicInd(Field source) {
       replace(source,0,source.length(),beginBdms01RemicInd,BDMS_01_REMIC_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RemicInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RemicInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RemicInd,BDMS_01_REMIC_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RemicInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RemicInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RemicInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RoyaltyInd
	 *	@return bdms01RoyaltyInd
	 */
   public char[] getBdms01RoyaltyInd() throws CFException{
     if (isBdms01RoyaltyIndModified()) { 
        bdms01RoyaltyInd = refreshBdms01RoyaltyInd();
     }
   		return bdms01RoyaltyInd;
   }

  
	/**
	*  set variable bdms01RoyaltyInd
	*  Corresponding COBOL Variable is BDMS01-ROYALTY-IND
	*  @param value
	**/
   public void setBdms01RoyaltyInd(char[] value) {
      bdms01RoyaltyInd = checkBdms01RoyaltyIndConstraints(value);
      serializeBdms01RoyaltyInd(bdms01RoyaltyInd);
   } 

     /**
	 * 	Update Bdms01RoyaltyInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RoyaltyInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RoyaltyInd,bdms01RoyaltyInd.length);
   	
   }
   
   public void setBdms01RoyaltyInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RoyaltyInd,bdms01RoyaltyInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01RoyaltyInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RoyaltyInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RoyaltyInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RoyaltyInd with another Field
	 *	@param value
	 */
   public void setBdms01RoyaltyInd(Field source) {
       replace(source,0,source.length(),beginBdms01RoyaltyInd,BDMS_01_ROYALTY_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RoyaltyInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RoyaltyInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RoyaltyInd,BDMS_01_ROYALTY_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RoyaltyInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RoyaltyInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RoyaltyInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01IbmCd
	 *	@return bdms01IbmCd
	 */
   public char[] getBdms01IbmCd() throws CFException{
     if (isBdms01IbmCdModified()) { 
        bdms01IbmCd = refreshBdms01IbmCd();
     }
   		return bdms01IbmCd;
   }

  
	/**
	*  set variable bdms01IbmCd
	*  Corresponding COBOL Variable is BDMS01-IBM-CD
	*  @param value
	**/
   public void setBdms01IbmCd(char[] value) {
      bdms01IbmCd = checkBdms01IbmCdConstraints(value);
      serializeBdms01IbmCd(bdms01IbmCd);
   } 

     /**
	 * 	Update Bdms01IbmCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01IbmCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01IbmCd,bdms01IbmCd.length);
   	
   }
   
   public void setBdms01IbmCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IbmCd,bdms01IbmCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01IbmCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01IbmCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IbmCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01IbmCd with another Field
	 *	@param value
	 */
   public void setBdms01IbmCd(Field source) {
       replace(source,0,source.length(),beginBdms01IbmCd,BDMS_01_IBM_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01IbmCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01IbmCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01IbmCd,BDMS_01_IBM_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01IbmCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01IbmCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IbmCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CanadaProductCd
	 *	@return bdms01CanadaProductCd
	 */
   public char[] getBdms01CanadaProductCd() throws CFException{
     if (isBdms01CanadaProductCdModified()) { 
        bdms01CanadaProductCd = refreshBdms01CanadaProductCd();
     }
   		return bdms01CanadaProductCd;
   }

  
	/**
	*  set variable bdms01CanadaProductCd
	*  Corresponding COBOL Variable is BDMS01-CANADA-PRODUCT-CD
	*  @param value
	**/
   public void setBdms01CanadaProductCd(char[] value) {
      bdms01CanadaProductCd = checkBdms01CanadaProductCdConstraints(value);
      serializeBdms01CanadaProductCd(bdms01CanadaProductCd);
   } 

     /**
	 * 	Update Bdms01CanadaProductCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CanadaProductCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CanadaProductCd,bdms01CanadaProductCd.length);
   	
   }
   
   public void setBdms01CanadaProductCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CanadaProductCd,bdms01CanadaProductCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CanadaProductCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CanadaProductCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CanadaProductCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CanadaProductCd with another Field
	 *	@param value
	 */
   public void setBdms01CanadaProductCd(Field source) {
       replace(source,0,source.length(),beginBdms01CanadaProductCd,BDMS_01_CANADA_PRODUCT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CanadaProductCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CanadaProductCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CanadaProductCd,BDMS_01_CANADA_PRODUCT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CanadaProductCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CanadaProductCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CanadaProductCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ForeignInd
	 *	@return bdms01ForeignInd
	 */
   public char[] getBdms01ForeignInd() throws CFException{
     if (isBdms01ForeignIndModified()) { 
        bdms01ForeignInd = refreshBdms01ForeignInd();
     }
   		return bdms01ForeignInd;
   }

  
	/**
	*  set variable bdms01ForeignInd
	*  Corresponding COBOL Variable is BDMS01-FOREIGN-IND
	*  @param value
	**/
   public void setBdms01ForeignInd(char[] value) {
      bdms01ForeignInd = checkBdms01ForeignIndConstraints(value);
      serializeBdms01ForeignInd(bdms01ForeignInd);
   } 

     /**
	 * 	Update Bdms01ForeignInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ForeignInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ForeignInd,bdms01ForeignInd.length);
   	
   }
   
   public void setBdms01ForeignInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ForeignInd,bdms01ForeignInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01ForeignInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ForeignInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ForeignInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ForeignInd with another Field
	 *	@param value
	 */
   public void setBdms01ForeignInd(Field source) {
       replace(source,0,source.length(),beginBdms01ForeignInd,BDMS_01_FOREIGN_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ForeignInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ForeignInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ForeignInd,BDMS_01_FOREIGN_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ForeignInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ForeignInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ForeignInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01IssueWhenInd
	 *	@return bdms01IssueWhenInd
	 */
   public char[] getBdms01IssueWhenInd() throws CFException{
     if (isBdms01IssueWhenIndModified()) { 
        bdms01IssueWhenInd = refreshBdms01IssueWhenInd();
     }
   		return bdms01IssueWhenInd;
   }

  
	/**
	*  set variable bdms01IssueWhenInd
	*  Corresponding COBOL Variable is BDMS01-ISSUE-WHEN-IND
	*  @param value
	**/
   public void setBdms01IssueWhenInd(char[] value) {
      bdms01IssueWhenInd = checkBdms01IssueWhenIndConstraints(value);
      serializeBdms01IssueWhenInd(bdms01IssueWhenInd);
   } 

     /**
	 * 	Update Bdms01IssueWhenInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01IssueWhenInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01IssueWhenInd,bdms01IssueWhenInd.length);
   	
   }
   
   public void setBdms01IssueWhenInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IssueWhenInd,bdms01IssueWhenInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01IssueWhenInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01IssueWhenInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IssueWhenInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01IssueWhenInd with another Field
	 *	@param value
	 */
   public void setBdms01IssueWhenInd(Field source) {
       replace(source,0,source.length(),beginBdms01IssueWhenInd,BDMS_01_ISSUE_WHEN_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01IssueWhenInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01IssueWhenInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01IssueWhenInd,BDMS_01_ISSUE_WHEN_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01IssueWhenInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01IssueWhenInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IssueWhenInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01InvstDrctInd
	 *	@return bdms01InvstDrctInd
	 */
   public char[] getBdms01InvstDrctInd() throws CFException{
     if (isBdms01InvstDrctIndModified()) { 
        bdms01InvstDrctInd = refreshBdms01InvstDrctInd();
     }
   		return bdms01InvstDrctInd;
   }

  
	/**
	*  set variable bdms01InvstDrctInd
	*  Corresponding COBOL Variable is BDMS01-INVST-DRCT-IND
	*  @param value
	**/
   public void setBdms01InvstDrctInd(char[] value) {
      bdms01InvstDrctInd = checkBdms01InvstDrctIndConstraints(value);
      serializeBdms01InvstDrctInd(bdms01InvstDrctInd);
   } 

     /**
	 * 	Update Bdms01InvstDrctInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01InvstDrctInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01InvstDrctInd,bdms01InvstDrctInd.length);
   	
   }
   
   public void setBdms01InvstDrctInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01InvstDrctInd,bdms01InvstDrctInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01InvstDrctInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01InvstDrctInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01InvstDrctInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01InvstDrctInd with another Field
	 *	@param value
	 */
   public void setBdms01InvstDrctInd(Field source) {
       replace(source,0,source.length(),beginBdms01InvstDrctInd,BDMS_01_INVST_DRCT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01InvstDrctInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01InvstDrctInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01InvstDrctInd,BDMS_01_INVST_DRCT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01InvstDrctInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01InvstDrctInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01InvstDrctInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CurrencyLegacyCd
	 *	@return bdms01CurrencyLegacyCd
	 */
   public char[] getBdms01CurrencyLegacyCd() throws CFException{
     if (isBdms01CurrencyLegacyCdModified()) { 
        bdms01CurrencyLegacyCd = refreshBdms01CurrencyLegacyCd();
     }
   		return bdms01CurrencyLegacyCd;
   }

  
	/**
	*  set variable bdms01CurrencyLegacyCd
	*  Corresponding COBOL Variable is BDMS01-CURRENCY-LEGACY-CD
	*  @param value
	**/
   public void setBdms01CurrencyLegacyCd(char[] value) {
      bdms01CurrencyLegacyCd = checkBdms01CurrencyLegacyCdConstraints(value);
      serializeBdms01CurrencyLegacyCd(bdms01CurrencyLegacyCd);
   } 

     /**
	 * 	Update Bdms01CurrencyLegacyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CurrencyLegacyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CurrencyLegacyCd,bdms01CurrencyLegacyCd.length);
   	
   }
   
   public void setBdms01CurrencyLegacyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CurrencyLegacyCd,bdms01CurrencyLegacyCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CurrencyLegacyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CurrencyLegacyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CurrencyLegacyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CurrencyLegacyCd with another Field
	 *	@param value
	 */
   public void setBdms01CurrencyLegacyCd(Field source) {
       replace(source,0,source.length(),beginBdms01CurrencyLegacyCd,BDMS_01_CURRENCY_LEGACY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CurrencyLegacyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CurrencyLegacyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CurrencyLegacyCd,BDMS_01_CURRENCY_LEGACY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CurrencyLegacyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CurrencyLegacyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CurrencyLegacyCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RedenominationDt
	 *	@return bdms01RedenominationDt
	 */
   public char[] getBdms01RedenominationDt() throws CFException{
     if (isBdms01RedenominationDtModified()) { 
        bdms01RedenominationDt = refreshBdms01RedenominationDt();
     }
   		return bdms01RedenominationDt;
   }

  
	/**
	*  set variable bdms01RedenominationDt
	*  Corresponding COBOL Variable is BDMS01-REDENOMINATION-DT
	*  @param value
	**/
   public void setBdms01RedenominationDt(char[] value) {
      bdms01RedenominationDt = checkBdms01RedenominationDtConstraints(value);
      serializeBdms01RedenominationDt(bdms01RedenominationDt);
   } 

     /**
	 * 	Update Bdms01RedenominationDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RedenominationDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RedenominationDt,bdms01RedenominationDt.length);
   	
   }
   
   public void setBdms01RedenominationDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RedenominationDt,bdms01RedenominationDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01RedenominationDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RedenominationDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RedenominationDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RedenominationDt with another Field
	 *	@param value
	 */
   public void setBdms01RedenominationDt(Field source) {
       replace(source,0,source.length(),beginBdms01RedenominationDt,BDMS_01_REDENOMINATION_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RedenominationDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RedenominationDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RedenominationDt,BDMS_01_REDENOMINATION_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RedenominationDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RedenominationDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RedenominationDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01OatsNasdaqCd
	 *	@return bdms01OatsNasdaqCd
	 */
   public char[] getBdms01OatsNasdaqCd() throws CFException{
     if (isBdms01OatsNasdaqCdModified()) { 
        bdms01OatsNasdaqCd = refreshBdms01OatsNasdaqCd();
     }
   		return bdms01OatsNasdaqCd;
   }

  
	/**
	*  set variable bdms01OatsNasdaqCd
	*  Corresponding COBOL Variable is BDMS01-OATS-NASDAQ-CD
	*  @param value
	**/
   public void setBdms01OatsNasdaqCd(char[] value) {
      bdms01OatsNasdaqCd = checkBdms01OatsNasdaqCdConstraints(value);
      serializeBdms01OatsNasdaqCd(bdms01OatsNasdaqCd);
   } 

     /**
	 * 	Update Bdms01OatsNasdaqCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OatsNasdaqCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OatsNasdaqCd,bdms01OatsNasdaqCd.length);
   	
   }
   
   public void setBdms01OatsNasdaqCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OatsNasdaqCd,bdms01OatsNasdaqCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01OatsNasdaqCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OatsNasdaqCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OatsNasdaqCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OatsNasdaqCd with another Field
	 *	@param value
	 */
   public void setBdms01OatsNasdaqCd(Field source) {
       replace(source,0,source.length(),beginBdms01OatsNasdaqCd,BDMS_01_OATS_NASDAQ_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OatsNasdaqCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OatsNasdaqCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OatsNasdaqCd,BDMS_01_OATS_NASDAQ_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OatsNasdaqCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OatsNasdaqCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OatsNasdaqCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01StepBondInd
	 *	@return bdms01StepBondInd
	 */
   public char[] getBdms01StepBondInd() throws CFException{
     if (isBdms01StepBondIndModified()) { 
        bdms01StepBondInd = refreshBdms01StepBondInd();
     }
   		return bdms01StepBondInd;
   }

  
	/**
	*  set variable bdms01StepBondInd
	*  Corresponding COBOL Variable is BDMS01-STEP-BOND-IND
	*  @param value
	**/
   public void setBdms01StepBondInd(char[] value) {
      bdms01StepBondInd = checkBdms01StepBondIndConstraints(value);
      serializeBdms01StepBondInd(bdms01StepBondInd);
   } 

     /**
	 * 	Update Bdms01StepBondInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01StepBondInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01StepBondInd,bdms01StepBondInd.length);
   	
   }
   
   public void setBdms01StepBondInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StepBondInd,bdms01StepBondInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01StepBondInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StepBondInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StepBondInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01StepBondInd with another Field
	 *	@param value
	 */
   public void setBdms01StepBondInd(Field source) {
       replace(source,0,source.length(),beginBdms01StepBondInd,BDMS_01_STEP_BOND_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01StepBondInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01StepBondInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01StepBondInd,BDMS_01_STEP_BOND_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01StepBondInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StepBondInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StepBondInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PhlyBltmExchInd
	 *	@return bdms01PhlyBltmExchInd
	 */
   public char[] getBdms01PhlyBltmExchInd() throws CFException{
     if (isBdms01PhlyBltmExchIndModified()) { 
        bdms01PhlyBltmExchInd = refreshBdms01PhlyBltmExchInd();
     }
   		return bdms01PhlyBltmExchInd;
   }

  
	/**
	*  set variable bdms01PhlyBltmExchInd
	*  Corresponding COBOL Variable is BDMS01-PHLY-BLTM-EXCH-IND
	*  @param value
	**/
   public void setBdms01PhlyBltmExchInd(char[] value) {
      bdms01PhlyBltmExchInd = checkBdms01PhlyBltmExchIndConstraints(value);
      serializeBdms01PhlyBltmExchInd(bdms01PhlyBltmExchInd);
   } 

     /**
	 * 	Update Bdms01PhlyBltmExchInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PhlyBltmExchInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PhlyBltmExchInd,bdms01PhlyBltmExchInd.length);
   	
   }
   
   public void setBdms01PhlyBltmExchInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PhlyBltmExchInd,bdms01PhlyBltmExchInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PhlyBltmExchInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PhlyBltmExchInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PhlyBltmExchInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PhlyBltmExchInd with another Field
	 *	@param value
	 */
   public void setBdms01PhlyBltmExchInd(Field source) {
       replace(source,0,source.length(),beginBdms01PhlyBltmExchInd,BDMS_01_PHLY_BLTM_EXCH_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PhlyBltmExchInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PhlyBltmExchInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PhlyBltmExchInd,BDMS_01_PHLY_BLTM_EXCH_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PhlyBltmExchInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PhlyBltmExchInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PhlyBltmExchInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ChgoExchInd
	 *	@return bdms01ChgoExchInd
	 */
   public char[] getBdms01ChgoExchInd() throws CFException{
     if (isBdms01ChgoExchIndModified()) { 
        bdms01ChgoExchInd = refreshBdms01ChgoExchInd();
     }
   		return bdms01ChgoExchInd;
   }

  
	/**
	*  set variable bdms01ChgoExchInd
	*  Corresponding COBOL Variable is BDMS01-CHGO-EXCH-IND
	*  @param value
	**/
   public void setBdms01ChgoExchInd(char[] value) {
      bdms01ChgoExchInd = checkBdms01ChgoExchIndConstraints(value);
      serializeBdms01ChgoExchInd(bdms01ChgoExchInd);
   } 

     /**
	 * 	Update Bdms01ChgoExchInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ChgoExchInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ChgoExchInd,bdms01ChgoExchInd.length);
   	
   }
   
   public void setBdms01ChgoExchInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ChgoExchInd,bdms01ChgoExchInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01ChgoExchInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ChgoExchInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ChgoExchInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ChgoExchInd with another Field
	 *	@param value
	 */
   public void setBdms01ChgoExchInd(Field source) {
       replace(source,0,source.length(),beginBdms01ChgoExchInd,BDMS_01_CHGO_EXCH_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ChgoExchInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ChgoExchInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ChgoExchInd,BDMS_01_CHGO_EXCH_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ChgoExchInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ChgoExchInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ChgoExchInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01BstnExchInd
	 *	@return bdms01BstnExchInd
	 */
   public char[] getBdms01BstnExchInd() throws CFException{
     if (isBdms01BstnExchIndModified()) { 
        bdms01BstnExchInd = refreshBdms01BstnExchInd();
     }
   		return bdms01BstnExchInd;
   }

  
	/**
	*  set variable bdms01BstnExchInd
	*  Corresponding COBOL Variable is BDMS01-BSTN-EXCH-IND
	*  @param value
	**/
   public void setBdms01BstnExchInd(char[] value) {
      bdms01BstnExchInd = checkBdms01BstnExchIndConstraints(value);
      serializeBdms01BstnExchInd(bdms01BstnExchInd);
   } 

     /**
	 * 	Update Bdms01BstnExchInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01BstnExchInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01BstnExchInd,bdms01BstnExchInd.length);
   	
   }
   
   public void setBdms01BstnExchInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BstnExchInd,bdms01BstnExchInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01BstnExchInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BstnExchInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BstnExchInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01BstnExchInd with another Field
	 *	@param value
	 */
   public void setBdms01BstnExchInd(Field source) {
       replace(source,0,source.length(),beginBdms01BstnExchInd,BDMS_01_BSTN_EXCH_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01BstnExchInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01BstnExchInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01BstnExchInd,BDMS_01_BSTN_EXCH_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01BstnExchInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BstnExchInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BstnExchInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PcfcExchInd
	 *	@return bdms01PcfcExchInd
	 */
   public char[] getBdms01PcfcExchInd() throws CFException{
     if (isBdms01PcfcExchIndModified()) { 
        bdms01PcfcExchInd = refreshBdms01PcfcExchInd();
     }
   		return bdms01PcfcExchInd;
   }

  
	/**
	*  set variable bdms01PcfcExchInd
	*  Corresponding COBOL Variable is BDMS01-PCFC-EXCH-IND
	*  @param value
	**/
   public void setBdms01PcfcExchInd(char[] value) {
      bdms01PcfcExchInd = checkBdms01PcfcExchIndConstraints(value);
      serializeBdms01PcfcExchInd(bdms01PcfcExchInd);
   } 

     /**
	 * 	Update Bdms01PcfcExchInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PcfcExchInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PcfcExchInd,bdms01PcfcExchInd.length);
   	
   }
   
   public void setBdms01PcfcExchInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PcfcExchInd,bdms01PcfcExchInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PcfcExchInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PcfcExchInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PcfcExchInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PcfcExchInd with another Field
	 *	@param value
	 */
   public void setBdms01PcfcExchInd(Field source) {
       replace(source,0,source.length(),beginBdms01PcfcExchInd,BDMS_01_PCFC_EXCH_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PcfcExchInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PcfcExchInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PcfcExchInd,BDMS_01_PCFC_EXCH_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PcfcExchInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PcfcExchInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PcfcExchInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01MadoffInd
	 *	@return bdms01MadoffInd
	 */
   public char[] getBdms01MadoffInd() throws CFException{
     if (isBdms01MadoffIndModified()) { 
        bdms01MadoffInd = refreshBdms01MadoffInd();
     }
   		return bdms01MadoffInd;
   }

  
	/**
	*  set variable bdms01MadoffInd
	*  Corresponding COBOL Variable is BDMS01-MADOFF-IND
	*  @param value
	**/
   public void setBdms01MadoffInd(char[] value) {
      bdms01MadoffInd = checkBdms01MadoffIndConstraints(value);
      serializeBdms01MadoffInd(bdms01MadoffInd);
   } 

     /**
	 * 	Update Bdms01MadoffInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01MadoffInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01MadoffInd,bdms01MadoffInd.length);
   	
   }
   
   public void setBdms01MadoffInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MadoffInd,bdms01MadoffInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01MadoffInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MadoffInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MadoffInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01MadoffInd with another Field
	 *	@param value
	 */
   public void setBdms01MadoffInd(Field source) {
       replace(source,0,source.length(),beginBdms01MadoffInd,BDMS_01_MADOFF_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01MadoffInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01MadoffInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01MadoffInd,BDMS_01_MADOFF_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01MadoffInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MadoffInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MadoffInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PinkSheetInd
	 *	@return bdms01PinkSheetInd
	 */
   public char[] getBdms01PinkSheetInd() throws CFException{
     if (isBdms01PinkSheetIndModified()) { 
        bdms01PinkSheetInd = refreshBdms01PinkSheetInd();
     }
   		return bdms01PinkSheetInd;
   }

  
	/**
	*  set variable bdms01PinkSheetInd
	*  Corresponding COBOL Variable is BDMS01-PINK-SHEET-IND
	*  @param value
	**/
   public void setBdms01PinkSheetInd(char[] value) {
      bdms01PinkSheetInd = checkBdms01PinkSheetIndConstraints(value);
      serializeBdms01PinkSheetInd(bdms01PinkSheetInd);
   } 

     /**
	 * 	Update Bdms01PinkSheetInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PinkSheetInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PinkSheetInd,bdms01PinkSheetInd.length);
   	
   }
   
   public void setBdms01PinkSheetInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PinkSheetInd,bdms01PinkSheetInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PinkSheetInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PinkSheetInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PinkSheetInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PinkSheetInd with another Field
	 *	@param value
	 */
   public void setBdms01PinkSheetInd(Field source) {
       replace(source,0,source.length(),beginBdms01PinkSheetInd,BDMS_01_PINK_SHEET_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PinkSheetInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PinkSheetInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PinkSheetInd,BDMS_01_PINK_SHEET_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PinkSheetInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PinkSheetInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PinkSheetInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01NaicsCd
	 *	@return bdms01NaicsCd
	 */
   public char[] getBdms01NaicsCd() throws CFException{
     if (isBdms01NaicsCdModified()) { 
        bdms01NaicsCd = refreshBdms01NaicsCd();
     }
   		return bdms01NaicsCd;
   }

  
	/**
	*  set variable bdms01NaicsCd
	*  Corresponding COBOL Variable is BDMS01-NAICS-CD
	*  @param value
	**/
   public void setBdms01NaicsCd(char[] value) {
      bdms01NaicsCd = checkBdms01NaicsCdConstraints(value);
      serializeBdms01NaicsCd(bdms01NaicsCd);
   } 

     /**
	 * 	Update Bdms01NaicsCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01NaicsCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01NaicsCd,bdms01NaicsCd.length);
   	
   }
   
   public void setBdms01NaicsCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01NaicsCd,bdms01NaicsCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01NaicsCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01NaicsCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01NaicsCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01NaicsCd with another Field
	 *	@param value
	 */
   public void setBdms01NaicsCd(Field source) {
       replace(source,0,source.length(),beginBdms01NaicsCd,BDMS_01_NAICS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01NaicsCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01NaicsCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01NaicsCd,BDMS_01_NAICS_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01NaicsCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01NaicsCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01NaicsCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01LlcInd
	 *	@return bdms01LlcInd
	 */
   public char[] getBdms01LlcInd() throws CFException{
     if (isBdms01LlcIndModified()) { 
        bdms01LlcInd = refreshBdms01LlcInd();
     }
   		return bdms01LlcInd;
   }

  
	/**
	*  set variable bdms01LlcInd
	*  Corresponding COBOL Variable is BDMS01-LLC-IND
	*  @param value
	**/
   public void setBdms01LlcInd(char[] value) {
      bdms01LlcInd = checkBdms01LlcIndConstraints(value);
      serializeBdms01LlcInd(bdms01LlcInd);
   } 

     /**
	 * 	Update Bdms01LlcInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01LlcInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01LlcInd,bdms01LlcInd.length);
   	
   }
   
   public void setBdms01LlcInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01LlcInd,bdms01LlcInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01LlcInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01LlcInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01LlcInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01LlcInd with another Field
	 *	@param value
	 */
   public void setBdms01LlcInd(Field source) {
       replace(source,0,source.length(),beginBdms01LlcInd,BDMS_01_LLC_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01LlcInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01LlcInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01LlcInd,BDMS_01_LLC_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01LlcInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01LlcInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01LlcInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01YieldBidPct
	 *	@return bdms01YieldBidPct
	 */
	public BigDecimal getBdms01YieldBidPct() throws CFException {
       if (isBdms01YieldBidPctModified()) { 
           bdms01YieldBidPct = refreshBdms01YieldBidPct();
        }
   		return bdms01YieldBidPct;
	}
	

	
	   
	/**
	 * 	Update Bdms01YieldBidPct with the passed number
	 *  Corresponding COBOL Variable is BDMS01-YIELD-BID-PCT
	 *	@param number
	 */
	public void setBdms01YieldBidPct(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01YieldBidPct = checkBdms01YieldBidPctMaxLimit(number);
	    serializeBdms01YieldBidPct(bdms01YieldBidPct);
   }
	/**
	 * 	Update Bdms01YieldBidPct with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01YieldBidPct(char[] value) throws CFException {
		 bdms01YieldBidPct = serializeBdms01YieldBidPct(value);
	}   
	/**
	 *	Returns the value of bdms01IntPyngInd
	 *	@return bdms01IntPyngInd
	 */
   public char[] getBdms01IntPyngInd() throws CFException{
     if (isBdms01IntPyngIndModified()) { 
        bdms01IntPyngInd = refreshBdms01IntPyngInd();
     }
   		return bdms01IntPyngInd;
   }

  
	/**
	*  set variable bdms01IntPyngInd
	*  Corresponding COBOL Variable is BDMS01-INT-PYNG-IND
	*  @param value
	**/
   public void setBdms01IntPyngInd(char[] value) {
      bdms01IntPyngInd = checkBdms01IntPyngIndConstraints(value);
      serializeBdms01IntPyngInd(bdms01IntPyngInd);
   } 

     /**
	 * 	Update Bdms01IntPyngInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01IntPyngInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01IntPyngInd,bdms01IntPyngInd.length);
   	
   }
   
   public void setBdms01IntPyngInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IntPyngInd,bdms01IntPyngInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01IntPyngInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01IntPyngInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IntPyngInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01IntPyngInd with another Field
	 *	@param value
	 */
   public void setBdms01IntPyngInd(Field source) {
       replace(source,0,source.length(),beginBdms01IntPyngInd,BDMS_01_INT_PYNG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01IntPyngInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01IntPyngInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01IntPyngInd,BDMS_01_INT_PYNG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01IntPyngInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01IntPyngInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IntPyngInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TleBypassInd
	 *	@return bdms01TleBypassInd
	 */
   public char[] getBdms01TleBypassInd() throws CFException{
     if (isBdms01TleBypassIndModified()) { 
        bdms01TleBypassInd = refreshBdms01TleBypassInd();
     }
   		return bdms01TleBypassInd;
   }

  
	/**
	*  set variable bdms01TleBypassInd
	*  Corresponding COBOL Variable is BDMS01-TLE-BYPASS-IND
	*  @param value
	**/
   public void setBdms01TleBypassInd(char[] value) {
      bdms01TleBypassInd = checkBdms01TleBypassIndConstraints(value);
      serializeBdms01TleBypassInd(bdms01TleBypassInd);
   } 

     /**
	 * 	Update Bdms01TleBypassInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TleBypassInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TleBypassInd,bdms01TleBypassInd.length);
   	
   }
   
   public void setBdms01TleBypassInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TleBypassInd,bdms01TleBypassInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TleBypassInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TleBypassInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TleBypassInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TleBypassInd with another Field
	 *	@param value
	 */
   public void setBdms01TleBypassInd(Field source) {
       replace(source,0,source.length(),beginBdms01TleBypassInd,BDMS_01_TLE_BYPASS_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TleBypassInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TleBypassInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TleBypassInd,BDMS_01_TLE_BYPASS_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TleBypassInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TleBypassInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TleBypassInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01QlfdOvrdDvdCd
	 *	@return bdms01QlfdOvrdDvdCd
	 */
   public char[] getBdms01QlfdOvrdDvdCd() throws CFException{
     if (isBdms01QlfdOvrdDvdCdModified()) { 
        bdms01QlfdOvrdDvdCd = refreshBdms01QlfdOvrdDvdCd();
     }
   		return bdms01QlfdOvrdDvdCd;
   }

  
	/**
	*  set variable bdms01QlfdOvrdDvdCd
	*  Corresponding COBOL Variable is BDMS01-QLFD-OVRD-DVD-CD
	*  @param value
	**/
   public void setBdms01QlfdOvrdDvdCd(char[] value) {
      bdms01QlfdOvrdDvdCd = checkBdms01QlfdOvrdDvdCdConstraints(value);
      serializeBdms01QlfdOvrdDvdCd(bdms01QlfdOvrdDvdCd);
   } 

     /**
	 * 	Update Bdms01QlfdOvrdDvdCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01QlfdOvrdDvdCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01QlfdOvrdDvdCd,bdms01QlfdOvrdDvdCd.length);
   	
   }
   
   public void setBdms01QlfdOvrdDvdCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01QlfdOvrdDvdCd,bdms01QlfdOvrdDvdCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01QlfdOvrdDvdCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01QlfdOvrdDvdCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01QlfdOvrdDvdCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01QlfdOvrdDvdCd with another Field
	 *	@param value
	 */
   public void setBdms01QlfdOvrdDvdCd(Field source) {
       replace(source,0,source.length(),beginBdms01QlfdOvrdDvdCd,BDMS_01_QLFD_OVRD_DVD_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01QlfdOvrdDvdCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01QlfdOvrdDvdCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01QlfdOvrdDvdCd,BDMS_01_QLFD_OVRD_DVD_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01QlfdOvrdDvdCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01QlfdOvrdDvdCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01QlfdOvrdDvdCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PutStrtDt
	 *	@return bdms01PutStrtDt
	 */
   public char[] getBdms01PutStrtDt() throws CFException{
     if (isBdms01PutStrtDtModified()) { 
        bdms01PutStrtDt = refreshBdms01PutStrtDt();
     }
   		return bdms01PutStrtDt;
   }

  
	/**
	*  set variable bdms01PutStrtDt
	*  Corresponding COBOL Variable is BDMS01-PUT-STRT-DT
	*  @param value
	**/
   public void setBdms01PutStrtDt(char[] value) {
      bdms01PutStrtDt = checkBdms01PutStrtDtConstraints(value);
      serializeBdms01PutStrtDt(bdms01PutStrtDt);
   } 

     /**
	 * 	Update Bdms01PutStrtDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PutStrtDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PutStrtDt,bdms01PutStrtDt.length);
   	
   }
   
   public void setBdms01PutStrtDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutStrtDt,bdms01PutStrtDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01PutStrtDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutStrtDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutStrtDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PutStrtDt with another Field
	 *	@param value
	 */
   public void setBdms01PutStrtDt(Field source) {
       replace(source,0,source.length(),beginBdms01PutStrtDt,BDMS_01_PUT_STRT_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PutStrtDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PutStrtDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PutStrtDt,BDMS_01_PUT_STRT_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PutStrtDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutStrtDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutStrtDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PutTmngCd
	 *	@return bdms01PutTmngCd
	 */
   public char[] getBdms01PutTmngCd() throws CFException{
     if (isBdms01PutTmngCdModified()) { 
        bdms01PutTmngCd = refreshBdms01PutTmngCd();
     }
   		return bdms01PutTmngCd;
   }

  
	/**
	*  set variable bdms01PutTmngCd
	*  Corresponding COBOL Variable is BDMS01-PUT-TMNG-CD
	*  @param value
	**/
   public void setBdms01PutTmngCd(char[] value) {
      bdms01PutTmngCd = checkBdms01PutTmngCdConstraints(value);
      serializeBdms01PutTmngCd(bdms01PutTmngCd);
   } 

     /**
	 * 	Update Bdms01PutTmngCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PutTmngCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PutTmngCd,bdms01PutTmngCd.length);
   	
   }
   
   public void setBdms01PutTmngCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutTmngCd,bdms01PutTmngCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PutTmngCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutTmngCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutTmngCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PutTmngCd with another Field
	 *	@param value
	 */
   public void setBdms01PutTmngCd(Field source) {
       replace(source,0,source.length(),beginBdms01PutTmngCd,BDMS_01_PUT_TMNG_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PutTmngCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PutTmngCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PutTmngCd,BDMS_01_PUT_TMNG_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PutTmngCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutTmngCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutTmngCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CallTmngCd
	 *	@return bdms01CallTmngCd
	 */
   public char[] getBdms01CallTmngCd() throws CFException{
     if (isBdms01CallTmngCdModified()) { 
        bdms01CallTmngCd = refreshBdms01CallTmngCd();
     }
   		return bdms01CallTmngCd;
   }

  
	/**
	*  set variable bdms01CallTmngCd
	*  Corresponding COBOL Variable is BDMS01-CALL-TMNG-CD
	*  @param value
	**/
   public void setBdms01CallTmngCd(char[] value) {
      bdms01CallTmngCd = checkBdms01CallTmngCdConstraints(value);
      serializeBdms01CallTmngCd(bdms01CallTmngCd);
   } 

     /**
	 * 	Update Bdms01CallTmngCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CallTmngCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CallTmngCd,bdms01CallTmngCd.length);
   	
   }
   
   public void setBdms01CallTmngCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallTmngCd,bdms01CallTmngCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CallTmngCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CallTmngCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallTmngCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CallTmngCd with another Field
	 *	@param value
	 */
   public void setBdms01CallTmngCd(Field source) {
       replace(source,0,source.length(),beginBdms01CallTmngCd,BDMS_01_CALL_TMNG_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CallTmngCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CallTmngCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CallTmngCd,BDMS_01_CALL_TMNG_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CallTmngCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CallTmngCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CallTmngCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01OtcBlltnStkInd
	 *	@return bdms01OtcBlltnStkInd
	 */
   public char[] getBdms01OtcBlltnStkInd() throws CFException{
     if (isBdms01OtcBlltnStkIndModified()) { 
        bdms01OtcBlltnStkInd = refreshBdms01OtcBlltnStkInd();
     }
   		return bdms01OtcBlltnStkInd;
   }

  
	/**
	*  set variable bdms01OtcBlltnStkInd
	*  Corresponding COBOL Variable is BDMS01-OTC-BLLTN-STK-IND
	*  @param value
	**/
   public void setBdms01OtcBlltnStkInd(char[] value) {
      bdms01OtcBlltnStkInd = checkBdms01OtcBlltnStkIndConstraints(value);
      serializeBdms01OtcBlltnStkInd(bdms01OtcBlltnStkInd);
   } 

     /**
	 * 	Update Bdms01OtcBlltnStkInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OtcBlltnStkInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OtcBlltnStkInd,bdms01OtcBlltnStkInd.length);
   	
   }
   
   public void setBdms01OtcBlltnStkInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OtcBlltnStkInd,bdms01OtcBlltnStkInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01OtcBlltnStkInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OtcBlltnStkInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OtcBlltnStkInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OtcBlltnStkInd with another Field
	 *	@param value
	 */
   public void setBdms01OtcBlltnStkInd(Field source) {
       replace(source,0,source.length(),beginBdms01OtcBlltnStkInd,BDMS_01_OTC_BLLTN_STK_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OtcBlltnStkInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OtcBlltnStkInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OtcBlltnStkInd,BDMS_01_OTC_BLLTN_STK_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OtcBlltnStkInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OtcBlltnStkInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OtcBlltnStkInd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01BaseSecuritySegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01BaseSecuritySegSqlcd(0);
         setMsdIndustrialClass(CONSTANTS.SPACE_2);
         setMsdAidsCode(CONSTANTS.SPACE);
                     setMsdStkDailyVolume(0);
         setMsdTaxCode(CONSTANTS.SPACE);
         setMsdMarginCode(CONSTANTS.SPACE);
                     setMsdRedenominationDate(0);
         setMsdBndRemicInd(CONSTANTS.SPACE);
         setMsdCurrencyCode(CONSTANTS.SPACE_3);
         setMsdIssueCurrencyPrev(CONSTANTS.SPACE_3);
                     setMsdIncomeDistPoint(0);
         setMsdSicCode(CONSTANTS.SPACE_4);
         setMsdProprietaryCode(CONSTANTS.SPACE_2);
         setBdms01SecurityParsInd(CONSTANTS.SPACE);
         setBdms01MarginableLstInd(CONSTANTS.SPACE);
         setBdms01MarginableOtcInd(CONSTANTS.SPACE);
         setBdms01TaxableCd(CONSTANTS.SPACE);
         setBdms01ConvInd(CONSTANTS.SPACE);
         setBdms01CnsInd(CONSTANTS.SPACE);
         setBdms01R144aInd(CONSTANTS.SPACE);
         setBdms01OptionInd(CONSTANTS.SPACE);
         setBdms01DllrUsTradeInd(CONSTANTS.SPACE);
         setBdms01BasSecCurrencyCd(CONSTANTS.SPACE_2);
         setBdms01ErclrInd(CONSTANTS.SPACE);
         setBdms01CedelInd(CONSTANTS.SPACE);
         setBdms01IssueDt(CONSTANTS.SPACE_10);
         setBdms01ReitInd(CONSTANTS.SPACE);
         setBdms01RemicInd(CONSTANTS.SPACE);
         setBdms01RoyaltyInd(CONSTANTS.SPACE);
         setBdms01IbmCd(CONSTANTS.SPACE_6);
         setBdms01CanadaProductCd(CONSTANTS.SPACE_3);
         setBdms01ForeignInd(CONSTANTS.SPACE);
         setBdms01IssueWhenInd(CONSTANTS.SPACE);
         setBdms01InvstDrctInd(CONSTANTS.SPACE);
         setBdms01CurrencyLegacyCd(CONSTANTS.SPACE_2);
         setBdms01RedenominationDt(CONSTANTS.SPACE_10);
         setBdms01OatsNasdaqCd(CONSTANTS.SPACE);
         setBdms01StepBondInd(CONSTANTS.SPACE);
         setBdms01PhlyBltmExchInd(CONSTANTS.SPACE);
         setBdms01ChgoExchInd(CONSTANTS.SPACE);
         setBdms01BstnExchInd(CONSTANTS.SPACE);
         setBdms01PcfcExchInd(CONSTANTS.SPACE);
         setBdms01MadoffInd(CONSTANTS.SPACE);
         setBdms01PinkSheetInd(CONSTANTS.SPACE);
         setBdms01NaicsCd(CONSTANTS.SPACE_6);
         setBdms01LlcInd(CONSTANTS.SPACE);
			setBdms01YieldBidPct(BigDecimal.ZERO);
         setBdms01IntPyngInd(CONSTANTS.SPACE);
         setBdms01TleBypassInd(CONSTANTS.SPACE);
         setBdms01QlfdOvrdDvdCd(CONSTANTS.SPACE);
         setBdms01PutStrtDt(CONSTANTS.SPACE_10);
         setBdms01PutTmngCd(CONSTANTS.SPACE);
         setBdms01CallTmngCd(CONSTANTS.SPACE);
         setBdms01OtcBlltnStkInd(CONSTANTS.SPACE);
   }

		public static int getBdms01BaseSecuritySegDataFieldLength() {
			return BDMS_01_BASE_SECURITY_SEG_DATA_LENGTH;
		}

}
  
