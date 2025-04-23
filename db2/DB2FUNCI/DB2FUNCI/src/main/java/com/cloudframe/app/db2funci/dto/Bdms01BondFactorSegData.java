package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01BondFactorSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:00. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01BondFactorSegData extends Bdms01BondFactorSegDataSerialized { 
   

								private int bdms01BondFactorSegSqlcd;

								private BigDecimal msdGnmaCurrFactor = BigDecimal.ZERO;

								private long msdCurrFactorUpdDate;

						private char[] bdms01CurrFacBondDt = Field.fillLowValue(10);

						private char[] bdms01GnmaCurrFactorPDt = Field.fillLowValue(10);

								private BigDecimal msdGnmaPrevFactor = BigDecimal.ZERO;

								private long msdPrevFactorUpdDate;

						private char[] bdms01GnmaPrevFactorPDt = Field.fillLowValue(10);

						private char[] bdms01PrevFacBondDt = Field.fillLowValue(10);

								private BigDecimal msdGnmaPrevToPrevFac = BigDecimal.ZERO;

								private long msdPrev2FactorUpdDate;

						private char[] bdms01GnmaPvToPvFacPDt = Field.fillLowValue(10);

						private char[] bdms01PvpvFacBondDt = Field.fillLowValue(10);

	
	/**
	* Constructor for Bdms01BondFactorSegData
	**/
    public Bdms01BondFactorSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01BondFactorSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01BondFactorSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01BondFactorSegSqlcd
	 *	@return bdms01BondFactorSegSqlcd
	 */
	public int getBdms01BondFactorSegSqlcd() throws CFException {
       if (isBdms01BondFactorSegSqlcdModified()) { 
           bdms01BondFactorSegSqlcd = refreshBdms01BondFactorSegSqlcd();
        }
   		return bdms01BondFactorSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01BondFactorSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-BOND-FACTOR-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01BondFactorSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01BondFactorSegSqlcd = checkBdms01BondFactorSegSqlcdMaxLimit(number); 
		serializeBdms01BondFactorSegSqlcd(bdms01BondFactorSegSqlcd);
	}
	

	public void setBdms01BondFactorSegSqlcd(long number) {
	    number = checkBdms01BondFactorSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01BondFactorSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01BondFactorSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01BondFactorSegSqlcd(char[] value) throws CFException {
		 bdms01BondFactorSegSqlcd = serializeBdms01BondFactorSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01BondFactorSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01BondFactorSegSqlcdString(char[] value) throws CFException {
		 setBdms01BondFactorSegSqlcd(value);
	}
	/**
	 *	Returns the value of msdGnmaCurrFactor
	 *	@return msdGnmaCurrFactor
	 */
	public BigDecimal getMsdGnmaCurrFactor() throws CFException {
       if (isMsdGnmaCurrFactorModified()) { 
           msdGnmaCurrFactor = refreshMsdGnmaCurrFactor();
        }
   		return msdGnmaCurrFactor;
	}
	

	
	   
	/**
	 * 	Update MsdGnmaCurrFactor with the passed number
	 *  Corresponding COBOL Variable is MSD-GNMA-CURR-FACTOR
	 *	@param number
	 */
	public void setMsdGnmaCurrFactor(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdGnmaCurrFactor = checkMsdGnmaCurrFactorMaxLimit(number);
	    serializeMsdGnmaCurrFactor(msdGnmaCurrFactor);
   }
	/**
	 * 	Update MsdGnmaCurrFactor with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdGnmaCurrFactor(char[] value) throws CFException {
		 msdGnmaCurrFactor = serializeMsdGnmaCurrFactor(value);
	}   
	/**
	 *	Returns the value of msdCurrFactorUpdDate
	 *	@return msdCurrFactorUpdDate
	 */
	public long getMsdCurrFactorUpdDate() throws CFException {
       if (isMsdCurrFactorUpdDateModified()) { 
           msdCurrFactorUpdDate = refreshMsdCurrFactorUpdDate();
        }
   		return msdCurrFactorUpdDate;
	}
	

	
	   
	/**
	 * 	Update MsdCurrFactorUpdDate with the passed value
	 *  Corresponding COBOL Variable is MSD-CURR-FACTOR-UPD-DATE
	 *	@param number
	 */
	public void setMsdCurrFactorUpdDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdCurrFactorUpdDate = checkMsdCurrFactorUpdDateMaxLimit(number); 
		serializeMsdCurrFactorUpdDate(msdCurrFactorUpdDate);
	}
	

	/**
	 * 	Update MsdCurrFactorUpdDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdCurrFactorUpdDate(char[] value) throws CFException {
		 msdCurrFactorUpdDate = serializeMsdCurrFactorUpdDate(value);
	}
	/**
	 * 	Update MsdCurrFactorUpdDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdCurrFactorUpdDateString(char[] value) throws CFException {
		 setMsdCurrFactorUpdDate(value);
	}
	/**
	 *	Returns the value of bdms01CurrFacBondDt
	 *	@return bdms01CurrFacBondDt
	 */
   public char[] getBdms01CurrFacBondDt() throws CFException{
     if (isBdms01CurrFacBondDtModified()) { 
        bdms01CurrFacBondDt = refreshBdms01CurrFacBondDt();
     }
   		return bdms01CurrFacBondDt;
   }

  
	/**
	*  set variable bdms01CurrFacBondDt
	*  Corresponding COBOL Variable is BDMS01-CURR-FAC-BOND-DT
	*  @param value
	**/
   public void setBdms01CurrFacBondDt(char[] value) {
      bdms01CurrFacBondDt = checkBdms01CurrFacBondDtConstraints(value);
      serializeBdms01CurrFacBondDt(bdms01CurrFacBondDt);
   } 

     /**
	 * 	Update Bdms01CurrFacBondDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CurrFacBondDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CurrFacBondDt,bdms01CurrFacBondDt.length);
   	
   }
   
   public void setBdms01CurrFacBondDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CurrFacBondDt,bdms01CurrFacBondDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01CurrFacBondDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CurrFacBondDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CurrFacBondDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CurrFacBondDt with another Field
	 *	@param value
	 */
   public void setBdms01CurrFacBondDt(Field source) {
       replace(source,0,source.length(),beginBdms01CurrFacBondDt,BDMS_01_CURR_FAC_BOND_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CurrFacBondDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CurrFacBondDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CurrFacBondDt,BDMS_01_CURR_FAC_BOND_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CurrFacBondDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CurrFacBondDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CurrFacBondDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01GnmaCurrFactorPDt
	 *	@return bdms01GnmaCurrFactorPDt
	 */
   public char[] getBdms01GnmaCurrFactorPDt() throws CFException{
     if (isBdms01GnmaCurrFactorPDtModified()) { 
        bdms01GnmaCurrFactorPDt = refreshBdms01GnmaCurrFactorPDt();
     }
   		return bdms01GnmaCurrFactorPDt;
   }

  
	/**
	*  set variable bdms01GnmaCurrFactorPDt
	*  Corresponding COBOL Variable is BDMS01-GNMA-CURR-FACTOR-P-DT
	*  @param value
	**/
   public void setBdms01GnmaCurrFactorPDt(char[] value) {
      bdms01GnmaCurrFactorPDt = checkBdms01GnmaCurrFactorPDtConstraints(value);
      serializeBdms01GnmaCurrFactorPDt(bdms01GnmaCurrFactorPDt);
   } 

     /**
	 * 	Update Bdms01GnmaCurrFactorPDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01GnmaCurrFactorPDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01GnmaCurrFactorPDt,bdms01GnmaCurrFactorPDt.length);
   	
   }
   
   public void setBdms01GnmaCurrFactorPDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GnmaCurrFactorPDt,bdms01GnmaCurrFactorPDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01GnmaCurrFactorPDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GnmaCurrFactorPDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GnmaCurrFactorPDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01GnmaCurrFactorPDt with another Field
	 *	@param value
	 */
   public void setBdms01GnmaCurrFactorPDt(Field source) {
       replace(source,0,source.length(),beginBdms01GnmaCurrFactorPDt,BDMS_01_GNMA_CURR_FACTOR_PDT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01GnmaCurrFactorPDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01GnmaCurrFactorPDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01GnmaCurrFactorPDt,BDMS_01_GNMA_CURR_FACTOR_PDT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01GnmaCurrFactorPDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GnmaCurrFactorPDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GnmaCurrFactorPDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdGnmaPrevFactor
	 *	@return msdGnmaPrevFactor
	 */
	public BigDecimal getMsdGnmaPrevFactor() throws CFException {
       if (isMsdGnmaPrevFactorModified()) { 
           msdGnmaPrevFactor = refreshMsdGnmaPrevFactor();
        }
   		return msdGnmaPrevFactor;
	}
	

	
	   
	/**
	 * 	Update MsdGnmaPrevFactor with the passed number
	 *  Corresponding COBOL Variable is MSD-GNMA-PREV-FACTOR
	 *	@param number
	 */
	public void setMsdGnmaPrevFactor(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdGnmaPrevFactor = checkMsdGnmaPrevFactorMaxLimit(number);
	    serializeMsdGnmaPrevFactor(msdGnmaPrevFactor);
   }
	/**
	 * 	Update MsdGnmaPrevFactor with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdGnmaPrevFactor(char[] value) throws CFException {
		 msdGnmaPrevFactor = serializeMsdGnmaPrevFactor(value);
	}   
	/**
	 *	Returns the value of msdPrevFactorUpdDate
	 *	@return msdPrevFactorUpdDate
	 */
	public long getMsdPrevFactorUpdDate() throws CFException {
       if (isMsdPrevFactorUpdDateModified()) { 
           msdPrevFactorUpdDate = refreshMsdPrevFactorUpdDate();
        }
   		return msdPrevFactorUpdDate;
	}
	

	
	   
	/**
	 * 	Update MsdPrevFactorUpdDate with the passed value
	 *  Corresponding COBOL Variable is MSD-PREV-FACTOR-UPD-DATE
	 *	@param number
	 */
	public void setMsdPrevFactorUpdDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdPrevFactorUpdDate = checkMsdPrevFactorUpdDateMaxLimit(number); 
		serializeMsdPrevFactorUpdDate(msdPrevFactorUpdDate);
	}
	

	/**
	 * 	Update MsdPrevFactorUpdDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdPrevFactorUpdDate(char[] value) throws CFException {
		 msdPrevFactorUpdDate = serializeMsdPrevFactorUpdDate(value);
	}
	/**
	 * 	Update MsdPrevFactorUpdDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdPrevFactorUpdDateString(char[] value) throws CFException {
		 setMsdPrevFactorUpdDate(value);
	}
	/**
	 *	Returns the value of bdms01GnmaPrevFactorPDt
	 *	@return bdms01GnmaPrevFactorPDt
	 */
   public char[] getBdms01GnmaPrevFactorPDt() throws CFException{
     if (isBdms01GnmaPrevFactorPDtModified()) { 
        bdms01GnmaPrevFactorPDt = refreshBdms01GnmaPrevFactorPDt();
     }
   		return bdms01GnmaPrevFactorPDt;
   }

  
	/**
	*  set variable bdms01GnmaPrevFactorPDt
	*  Corresponding COBOL Variable is BDMS01-GNMA-PREV-FACTOR-P-DT
	*  @param value
	**/
   public void setBdms01GnmaPrevFactorPDt(char[] value) {
      bdms01GnmaPrevFactorPDt = checkBdms01GnmaPrevFactorPDtConstraints(value);
      serializeBdms01GnmaPrevFactorPDt(bdms01GnmaPrevFactorPDt);
   } 

     /**
	 * 	Update Bdms01GnmaPrevFactorPDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01GnmaPrevFactorPDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01GnmaPrevFactorPDt,bdms01GnmaPrevFactorPDt.length);
   	
   }
   
   public void setBdms01GnmaPrevFactorPDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GnmaPrevFactorPDt,bdms01GnmaPrevFactorPDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01GnmaPrevFactorPDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GnmaPrevFactorPDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GnmaPrevFactorPDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01GnmaPrevFactorPDt with another Field
	 *	@param value
	 */
   public void setBdms01GnmaPrevFactorPDt(Field source) {
       replace(source,0,source.length(),beginBdms01GnmaPrevFactorPDt,BDMS_01_GNMA_PREV_FACTOR_PDT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01GnmaPrevFactorPDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01GnmaPrevFactorPDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01GnmaPrevFactorPDt,BDMS_01_GNMA_PREV_FACTOR_PDT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01GnmaPrevFactorPDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GnmaPrevFactorPDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GnmaPrevFactorPDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PrevFacBondDt
	 *	@return bdms01PrevFacBondDt
	 */
   public char[] getBdms01PrevFacBondDt() throws CFException{
     if (isBdms01PrevFacBondDtModified()) { 
        bdms01PrevFacBondDt = refreshBdms01PrevFacBondDt();
     }
   		return bdms01PrevFacBondDt;
   }

  
	/**
	*  set variable bdms01PrevFacBondDt
	*  Corresponding COBOL Variable is BDMS01-PREV-FAC-BOND-DT
	*  @param value
	**/
   public void setBdms01PrevFacBondDt(char[] value) {
      bdms01PrevFacBondDt = checkBdms01PrevFacBondDtConstraints(value);
      serializeBdms01PrevFacBondDt(bdms01PrevFacBondDt);
   } 

     /**
	 * 	Update Bdms01PrevFacBondDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PrevFacBondDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PrevFacBondDt,bdms01PrevFacBondDt.length);
   	
   }
   
   public void setBdms01PrevFacBondDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrevFacBondDt,bdms01PrevFacBondDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01PrevFacBondDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrevFacBondDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrevFacBondDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PrevFacBondDt with another Field
	 *	@param value
	 */
   public void setBdms01PrevFacBondDt(Field source) {
       replace(source,0,source.length(),beginBdms01PrevFacBondDt,BDMS_01_PREV_FAC_BOND_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PrevFacBondDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PrevFacBondDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PrevFacBondDt,BDMS_01_PREV_FAC_BOND_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PrevFacBondDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrevFacBondDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrevFacBondDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdGnmaPrevToPrevFac
	 *	@return msdGnmaPrevToPrevFac
	 */
	public BigDecimal getMsdGnmaPrevToPrevFac() throws CFException {
       if (isMsdGnmaPrevToPrevFacModified()) { 
           msdGnmaPrevToPrevFac = refreshMsdGnmaPrevToPrevFac();
        }
   		return msdGnmaPrevToPrevFac;
	}
	

	
	   
	/**
	 * 	Update MsdGnmaPrevToPrevFac with the passed number
	 *  Corresponding COBOL Variable is MSD-GNMA-PREV-TO-PREV-FAC
	 *	@param number
	 */
	public void setMsdGnmaPrevToPrevFac(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdGnmaPrevToPrevFac = checkMsdGnmaPrevToPrevFacMaxLimit(number);
	    serializeMsdGnmaPrevToPrevFac(msdGnmaPrevToPrevFac);
   }
	/**
	 * 	Update MsdGnmaPrevToPrevFac with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdGnmaPrevToPrevFac(char[] value) throws CFException {
		 msdGnmaPrevToPrevFac = serializeMsdGnmaPrevToPrevFac(value);
	}   
	/**
	 *	Returns the value of msdPrev2FactorUpdDate
	 *	@return msdPrev2FactorUpdDate
	 */
	public long getMsdPrev2FactorUpdDate() throws CFException {
       if (isMsdPrev2FactorUpdDateModified()) { 
           msdPrev2FactorUpdDate = refreshMsdPrev2FactorUpdDate();
        }
   		return msdPrev2FactorUpdDate;
	}
	

	
	   
	/**
	 * 	Update MsdPrev2FactorUpdDate with the passed value
	 *  Corresponding COBOL Variable is MSD-PREV2-FACTOR-UPD-DATE
	 *	@param number
	 */
	public void setMsdPrev2FactorUpdDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdPrev2FactorUpdDate = checkMsdPrev2FactorUpdDateMaxLimit(number); 
		serializeMsdPrev2FactorUpdDate(msdPrev2FactorUpdDate);
	}
	

	/**
	 * 	Update MsdPrev2FactorUpdDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdPrev2FactorUpdDate(char[] value) throws CFException {
		 msdPrev2FactorUpdDate = serializeMsdPrev2FactorUpdDate(value);
	}
	/**
	 * 	Update MsdPrev2FactorUpdDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdPrev2FactorUpdDateString(char[] value) throws CFException {
		 setMsdPrev2FactorUpdDate(value);
	}
	/**
	 *	Returns the value of bdms01GnmaPvToPvFacPDt
	 *	@return bdms01GnmaPvToPvFacPDt
	 */
   public char[] getBdms01GnmaPvToPvFacPDt() throws CFException{
     if (isBdms01GnmaPvToPvFacPDtModified()) { 
        bdms01GnmaPvToPvFacPDt = refreshBdms01GnmaPvToPvFacPDt();
     }
   		return bdms01GnmaPvToPvFacPDt;
   }

  
	/**
	*  set variable bdms01GnmaPvToPvFacPDt
	*  Corresponding COBOL Variable is BDMS01-GNMA-PV-TO-PV-FAC-P-DT
	*  @param value
	**/
   public void setBdms01GnmaPvToPvFacPDt(char[] value) {
      bdms01GnmaPvToPvFacPDt = checkBdms01GnmaPvToPvFacPDtConstraints(value);
      serializeBdms01GnmaPvToPvFacPDt(bdms01GnmaPvToPvFacPDt);
   } 

     /**
	 * 	Update Bdms01GnmaPvToPvFacPDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01GnmaPvToPvFacPDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01GnmaPvToPvFacPDt,bdms01GnmaPvToPvFacPDt.length);
   	
   }
   
   public void setBdms01GnmaPvToPvFacPDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GnmaPvToPvFacPDt,bdms01GnmaPvToPvFacPDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01GnmaPvToPvFacPDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GnmaPvToPvFacPDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GnmaPvToPvFacPDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01GnmaPvToPvFacPDt with another Field
	 *	@param value
	 */
   public void setBdms01GnmaPvToPvFacPDt(Field source) {
       replace(source,0,source.length(),beginBdms01GnmaPvToPvFacPDt,BDMS_01_GNMA_PV_TO_PV_FAC_PDT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01GnmaPvToPvFacPDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01GnmaPvToPvFacPDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01GnmaPvToPvFacPDt,BDMS_01_GNMA_PV_TO_PV_FAC_PDT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01GnmaPvToPvFacPDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GnmaPvToPvFacPDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GnmaPvToPvFacPDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PvpvFacBondDt
	 *	@return bdms01PvpvFacBondDt
	 */
   public char[] getBdms01PvpvFacBondDt() throws CFException{
     if (isBdms01PvpvFacBondDtModified()) { 
        bdms01PvpvFacBondDt = refreshBdms01PvpvFacBondDt();
     }
   		return bdms01PvpvFacBondDt;
   }

  
	/**
	*  set variable bdms01PvpvFacBondDt
	*  Corresponding COBOL Variable is BDMS01-PVPV-FAC-BOND-DT
	*  @param value
	**/
   public void setBdms01PvpvFacBondDt(char[] value) {
      bdms01PvpvFacBondDt = checkBdms01PvpvFacBondDtConstraints(value);
      serializeBdms01PvpvFacBondDt(bdms01PvpvFacBondDt);
   } 

     /**
	 * 	Update Bdms01PvpvFacBondDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PvpvFacBondDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PvpvFacBondDt,bdms01PvpvFacBondDt.length);
   	
   }
   
   public void setBdms01PvpvFacBondDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PvpvFacBondDt,bdms01PvpvFacBondDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01PvpvFacBondDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PvpvFacBondDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PvpvFacBondDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PvpvFacBondDt with another Field
	 *	@param value
	 */
   public void setBdms01PvpvFacBondDt(Field source) {
       replace(source,0,source.length(),beginBdms01PvpvFacBondDt,BDMS_01_PVPV_FAC_BOND_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PvpvFacBondDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PvpvFacBondDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PvpvFacBondDt,BDMS_01_PVPV_FAC_BOND_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PvpvFacBondDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PvpvFacBondDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PvpvFacBondDt+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01BondFactorSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01BondFactorSegSqlcd(0);
			setMsdGnmaCurrFactor(BigDecimal.ZERO);
                     setMsdCurrFactorUpdDate(0);
         setBdms01CurrFacBondDt(CONSTANTS.SPACE_10);
         setBdms01GnmaCurrFactorPDt(CONSTANTS.SPACE_10);
			setMsdGnmaPrevFactor(BigDecimal.ZERO);
                     setMsdPrevFactorUpdDate(0);
         setBdms01GnmaPrevFactorPDt(CONSTANTS.SPACE_10);
         setBdms01PrevFacBondDt(CONSTANTS.SPACE_10);
			setMsdGnmaPrevToPrevFac(BigDecimal.ZERO);
                     setMsdPrev2FactorUpdDate(0);
         setBdms01GnmaPvToPvFacPDt(CONSTANTS.SPACE_10);
         setBdms01PvpvFacBondDt(CONSTANTS.SPACE_10);
   }

		public static int getBdms01BondFactorSegDataFieldLength() {
			return BDMS_01_BOND_FACTOR_SEG_DATA_LENGTH;
		}

}
  
