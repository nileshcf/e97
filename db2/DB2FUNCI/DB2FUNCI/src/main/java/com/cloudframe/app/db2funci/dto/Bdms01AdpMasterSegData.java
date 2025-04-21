package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01AdpMasterSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:02. using version 5.0.0.256
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01AdpMasterSegData extends Bdms01AdpMasterSegDataSerialized { 
   

								private int bdms01AdpMasterSegSqlcd;

						private char[] msdCountryCode = Field.fillLowValue(2);

						private char[] msdCountryOfOrigin = Field.fillLowValue(2);
				private MsdAddedCcyymmdd msdAddedCcyymmdd = new MsdAddedCcyymmdd();
				private MsdSecurityDesc1 msdSecurityDesc1 = new MsdSecurityDesc1();

								private long msdDontUseAddDt;

						private char[] msdDontUseInd = Field.fillLowValue(1);

						private char[] msdDnuReason = Field.fillLowValue(30);

						private char[] msdReferToSec = Field.fillLowValue(7);

						private char[] msdSourceCodeNewSetup = Field.fillLowValue(2);

						private char[] bdms01AddedTmstp = Field.fillLowValue(26);

						private char[] bdms01DoNotUseDt = Field.fillLowValue(10);

						private char[] bdms01TrmlCd = Field.fillLowValue(8);

						private char[] bdms01TranCd = Field.fillLowValue(8);

						private char[] bdms01SecurityIdaCd = Field.fillLowValue(4);

						private char[] bdms01TypeSecurityCd = Field.fillLowValue(3);

						private char[] bdms01CntryIssueCd = Field.fillLowValue(2);

						private char[] bdms01CntryOrgnCd = Field.fillLowValue(2);

						private char[] bdms01ClientNbr = Field.fillLowValue(4);

								private long bdms01McgillCd;

						private char[] bdms01CusipCntraNbr = Field.fillLowValue(8);

						private char[] msdTradingSymbol = Field.fillLowValue(20);

						private char[] msdClassInd = Field.fillLowValue(1);

	
	/**
	* Constructor for Bdms01AdpMasterSegData
	**/
    public Bdms01AdpMasterSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01AdpMasterSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01AdpMasterSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			msdAddedCcyymmdd.setParent(this,getStartOffset() + 8);
	       			msdSecurityDesc1.setParent(this,getStartOffset() + 16);
    } 

	/**
	 *	Returns the value of bdms01AdpMasterSegSqlcd
	 *	@return bdms01AdpMasterSegSqlcd
	 */
	public int getBdms01AdpMasterSegSqlcd() throws CFException {
       if (isBdms01AdpMasterSegSqlcdModified()) { 
           bdms01AdpMasterSegSqlcd = refreshBdms01AdpMasterSegSqlcd();
        }
   		return bdms01AdpMasterSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01AdpMasterSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-ADP-MASTER-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01AdpMasterSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01AdpMasterSegSqlcd = checkBdms01AdpMasterSegSqlcdMaxLimit(number); 
		serializeBdms01AdpMasterSegSqlcd(bdms01AdpMasterSegSqlcd);
	}
	

	public void setBdms01AdpMasterSegSqlcd(long number) {
	    number = checkBdms01AdpMasterSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01AdpMasterSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01AdpMasterSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01AdpMasterSegSqlcd(char[] value) throws CFException {
		 bdms01AdpMasterSegSqlcd = serializeBdms01AdpMasterSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01AdpMasterSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01AdpMasterSegSqlcdString(char[] value) throws CFException {
		 setBdms01AdpMasterSegSqlcd(value);
	}
	/**
	 *	Returns the value of msdCountryCode
	 *	@return msdCountryCode
	 */
   public char[] getMsdCountryCode() throws CFException{
     if (isMsdCountryCodeModified()) { 
        msdCountryCode = refreshMsdCountryCode();
     }
   		return msdCountryCode;
   }

  
	/**
	*  set variable msdCountryCode
	*  Corresponding COBOL Variable is MSD-COUNTRY-CODE
	*  @param value
	**/
   public void setMsdCountryCode(char[] value) {
      msdCountryCode = checkMsdCountryCodeConstraints(value);
      serializeMsdCountryCode(msdCountryCode);
   } 

     /**
	 * 	Update MsdCountryCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdCountryCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdCountryCode,msdCountryCode.length);
   	
   }
   
   public void setMsdCountryCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCountryCode,msdCountryCode.length);
   	
   }
   
     /**
	 * 	Update MsdCountryCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdCountryCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCountryCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdCountryCode with another Field
	 *	@param value
	 */
   public void setMsdCountryCode(Field source) {
       replace(source,0,source.length(),beginMsdCountryCode,MSD_COUNTRY_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update MsdCountryCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdCountryCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdCountryCode,MSD_COUNTRY_CODE_LEN);
   	
   }
   
     /**
	 * 	Update MsdCountryCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdCountryCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCountryCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdCountryOfOrigin
	 *	@return msdCountryOfOrigin
	 */
   public char[] getMsdCountryOfOrigin() throws CFException{
     if (isMsdCountryOfOriginModified()) { 
        msdCountryOfOrigin = refreshMsdCountryOfOrigin();
     }
   		return msdCountryOfOrigin;
   }

  
	/**
	*  set variable msdCountryOfOrigin
	*  Corresponding COBOL Variable is MSD-COUNTRY-OF-ORIGIN
	*  @param value
	**/
   public void setMsdCountryOfOrigin(char[] value) {
      msdCountryOfOrigin = checkMsdCountryOfOriginConstraints(value);
      serializeMsdCountryOfOrigin(msdCountryOfOrigin);
   } 

     /**
	 * 	Update MsdCountryOfOrigin 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdCountryOfOrigin(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdCountryOfOrigin,msdCountryOfOrigin.length);
   	
   }
   
   public void setMsdCountryOfOrigin(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCountryOfOrigin,msdCountryOfOrigin.length);
   	
   }
   
     /**
	 * 	Update MsdCountryOfOrigin 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdCountryOfOrigin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCountryOfOrigin+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdCountryOfOrigin with another Field
	 *	@param value
	 */
   public void setMsdCountryOfOrigin(Field source) {
       replace(source,0,source.length(),beginMsdCountryOfOrigin,MSD_COUNTRY_OF_ORIGIN_LEN);
   	
   }  
   
     /**
	 * 	Update MsdCountryOfOrigin 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdCountryOfOrigin(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdCountryOfOrigin,MSD_COUNTRY_OF_ORIGIN_LEN);
   	
   }
   
     /**
	 * 	Update MsdCountryOfOrigin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdCountryOfOrigin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCountryOfOrigin+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdAddedCcyymmdd
	 *	@return msdAddedCcyymmdd
	 */   
	 public MsdAddedCcyymmdd getMsdAddedCcyymmdd() {
   	return msdAddedCcyymmdd;
   }
   /**
	* 	Update MsdAddedCcyymmdd with the passed value
	*   Corresponding COBOL Variable is MSD-ADDED-CCYYMMDD
	*	@param value
	*/
   public void setMsdAddedCcyymmdd(char[] value) {
      msdAddedCcyymmdd.setString(value); 
   }   
    
     /**
	 * 	Update MsdAddedCcyymmdd 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdAddedCcyymmdd(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdAddedCcyymmdd.begin,msdAddedCcyymmdd.length());
   }
   
     /**
	 * 	Update MsdAddedCcyymmdd 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdAddedCcyymmdd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdAddedCcyymmdd.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdAddedCcyymmdd with another Field
	 *	@param value
	 */
   public void setMsdAddedCcyymmdd(Field source) {
   	replace(source,0,source.length(),msdAddedCcyymmdd.begin,msdAddedCcyymmdd.length());
   }  
   
     /**
	 * 	Update MsdAddedCcyymmdd 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdAddedCcyymmdd(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdAddedCcyymmdd.begin,msdAddedCcyymmdd.length());
   }
   
     /**
	 * 	Update MsdAddedCcyymmdd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdAddedCcyymmdd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdAddedCcyymmdd.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdSecurityDesc1
	 *	@return msdSecurityDesc1
	 */   
	 public MsdSecurityDesc1 getMsdSecurityDesc1() {
   	return msdSecurityDesc1;
   }
   /**
	* 	Update MsdSecurityDesc1 with the passed value
	*   Corresponding COBOL Variable is MSD-SECURITY-DESC1
	*	@param value
	*/
   public void setMsdSecurityDesc1(char[] value) {
      msdSecurityDesc1.setString(value); 
   }   
    
     /**
	 * 	Update MsdSecurityDesc1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdSecurityDesc1(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdSecurityDesc1.begin,msdSecurityDesc1.length());
   }
   
     /**
	 * 	Update MsdSecurityDesc1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecurityDesc1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdSecurityDesc1.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdSecurityDesc1 with another Field
	 *	@param value
	 */
   public void setMsdSecurityDesc1(Field source) {
   	replace(source,0,source.length(),msdSecurityDesc1.begin,msdSecurityDesc1.length());
   }  
   
     /**
	 * 	Update MsdSecurityDesc1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdSecurityDesc1(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdSecurityDesc1.begin,msdSecurityDesc1.length());
   }
   
     /**
	 * 	Update MsdSecurityDesc1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecurityDesc1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdSecurityDesc1.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdDontUseAddDt
	 *	@return msdDontUseAddDt
	 */
	public long getMsdDontUseAddDt() throws CFException {
       if (isMsdDontUseAddDtModified()) { 
           msdDontUseAddDt = refreshMsdDontUseAddDt();
        }
   		return msdDontUseAddDt;
	}
	

	
	   
	/**
	 * 	Update MsdDontUseAddDt with the passed value
	 *  Corresponding COBOL Variable is MSD-DONT-USE-ADD-DT
	 *	@param number
	 */
	public void setMsdDontUseAddDt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdDontUseAddDt = checkMsdDontUseAddDtMaxLimit(number); 
		serializeMsdDontUseAddDt(msdDontUseAddDt);
	}
	

	/**
	 * 	Update MsdDontUseAddDt with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdDontUseAddDt(char[] value) throws CFException {
		 msdDontUseAddDt = serializeMsdDontUseAddDt(value);
	}
	/**
	 * 	Update MsdDontUseAddDt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdDontUseAddDtString(char[] value) throws CFException {
		 setMsdDontUseAddDt(value);
	}
	/**
	 *	Returns the value of msdDontUseInd
	 *	@return msdDontUseInd
	 */
   public char[] getMsdDontUseInd() throws CFException{
     if (isMsdDontUseIndModified()) { 
        msdDontUseInd = refreshMsdDontUseInd();
     }
   		return msdDontUseInd;
   }

  
	/**
	*  set variable msdDontUseInd
	*  Corresponding COBOL Variable is MSD-DONT-USE-IND
	*  @param value
	**/
   public void setMsdDontUseInd(char[] value) {
      msdDontUseInd = checkMsdDontUseIndConstraints(value);
      serializeMsdDontUseInd(msdDontUseInd);
   } 

     /**
	 * 	Update MsdDontUseInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdDontUseInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdDontUseInd,msdDontUseInd.length);
   	
   }
   
   public void setMsdDontUseInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdDontUseInd,msdDontUseInd.length);
   	
   }
   
     /**
	 * 	Update MsdDontUseInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdDontUseInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdDontUseInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdDontUseInd with another Field
	 *	@param value
	 */
   public void setMsdDontUseInd(Field source) {
       replace(source,0,source.length(),beginMsdDontUseInd,MSD_DONT_USE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update MsdDontUseInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdDontUseInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdDontUseInd,MSD_DONT_USE_IND_LEN);
   	
   }
   
     /**
	 * 	Update MsdDontUseInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdDontUseInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdDontUseInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdDnuReason
	 *	@return msdDnuReason
	 */
   public char[] getMsdDnuReason() throws CFException{
     if (isMsdDnuReasonModified()) { 
        msdDnuReason = refreshMsdDnuReason();
     }
   		return msdDnuReason;
   }

  
	/**
	*  set variable msdDnuReason
	*  Corresponding COBOL Variable is MSD-DNU-REASON
	*  @param value
	**/
   public void setMsdDnuReason(char[] value) {
      msdDnuReason = checkMsdDnuReasonConstraints(value);
      serializeMsdDnuReason(msdDnuReason);
   } 

     /**
	 * 	Update MsdDnuReason 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdDnuReason(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdDnuReason,msdDnuReason.length);
   	
   }
   
   public void setMsdDnuReason(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdDnuReason,msdDnuReason.length);
   	
   }
   
     /**
	 * 	Update MsdDnuReason 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdDnuReason(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdDnuReason+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdDnuReason with another Field
	 *	@param value
	 */
   public void setMsdDnuReason(Field source) {
       replace(source,0,source.length(),beginMsdDnuReason,MSD_DNU_REASON_LEN);
   	
   }  
   
     /**
	 * 	Update MsdDnuReason 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdDnuReason(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdDnuReason,MSD_DNU_REASON_LEN);
   	
   }
   
     /**
	 * 	Update MsdDnuReason 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdDnuReason(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdDnuReason+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdReferToSec
	 *	@return msdReferToSec
	 */
   public char[] getMsdReferToSec() throws CFException{
     if (isMsdReferToSecModified()) { 
        msdReferToSec = refreshMsdReferToSec();
     }
   		return msdReferToSec;
   }

  
	/**
	*  set variable msdReferToSec
	*  Corresponding COBOL Variable is MSD-REFER-TO-SEC
	*  @param value
	**/
   public void setMsdReferToSec(char[] value) {
      msdReferToSec = checkMsdReferToSecConstraints(value);
      serializeMsdReferToSec(msdReferToSec);
   } 

     /**
	 * 	Update MsdReferToSec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdReferToSec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdReferToSec,msdReferToSec.length);
   	
   }
   
   public void setMsdReferToSec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdReferToSec,msdReferToSec.length);
   	
   }
   
     /**
	 * 	Update MsdReferToSec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdReferToSec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdReferToSec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdReferToSec with another Field
	 *	@param value
	 */
   public void setMsdReferToSec(Field source) {
       replace(source,0,source.length(),beginMsdReferToSec,MSD_REFER_TO_SEC_LEN);
   	
   }  
   
     /**
	 * 	Update MsdReferToSec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdReferToSec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdReferToSec,MSD_REFER_TO_SEC_LEN);
   	
   }
   
     /**
	 * 	Update MsdReferToSec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdReferToSec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdReferToSec+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdSourceCodeNewSetup
	 *	@return msdSourceCodeNewSetup
	 */
   public char[] getMsdSourceCodeNewSetup() throws CFException{
     if (isMsdSourceCodeNewSetupModified()) { 
        msdSourceCodeNewSetup = refreshMsdSourceCodeNewSetup();
     }
   		return msdSourceCodeNewSetup;
   }

  
	/**
	*  set variable msdSourceCodeNewSetup
	*  Corresponding COBOL Variable is MSD-SOURCE-CODE-NEW-SETUP
	*  @param value
	**/
   public void setMsdSourceCodeNewSetup(char[] value) {
      msdSourceCodeNewSetup = checkMsdSourceCodeNewSetupConstraints(value);
      serializeMsdSourceCodeNewSetup(msdSourceCodeNewSetup);
   } 

     /**
	 * 	Update MsdSourceCodeNewSetup 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSourceCodeNewSetup(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSourceCodeNewSetup,msdSourceCodeNewSetup.length);
   	
   }
   
   public void setMsdSourceCodeNewSetup(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSourceCodeNewSetup,msdSourceCodeNewSetup.length);
   	
   }
   
     /**
	 * 	Update MsdSourceCodeNewSetup 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSourceCodeNewSetup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSourceCodeNewSetup+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSourceCodeNewSetup with another Field
	 *	@param value
	 */
   public void setMsdSourceCodeNewSetup(Field source) {
       replace(source,0,source.length(),beginMsdSourceCodeNewSetup,MSD_SOURCE_CODE_NEW_SETUP_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSourceCodeNewSetup 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSourceCodeNewSetup(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSourceCodeNewSetup,MSD_SOURCE_CODE_NEW_SETUP_LEN);
   	
   }
   
     /**
	 * 	Update MsdSourceCodeNewSetup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSourceCodeNewSetup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSourceCodeNewSetup+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01AddedTmstp
	 *	@return bdms01AddedTmstp
	 */
   public char[] getBdms01AddedTmstp() throws CFException{
     if (isBdms01AddedTmstpModified()) { 
        bdms01AddedTmstp = refreshBdms01AddedTmstp();
     }
   		return bdms01AddedTmstp;
   }

  
	/**
	*  set variable bdms01AddedTmstp
	*  Corresponding COBOL Variable is BDMS01-ADDED-TMSTP
	*  @param value
	**/
   public void setBdms01AddedTmstp(char[] value) {
      bdms01AddedTmstp = checkBdms01AddedTmstpConstraints(value);
      serializeBdms01AddedTmstp(bdms01AddedTmstp);
   } 

     /**
	 * 	Update Bdms01AddedTmstp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01AddedTmstp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01AddedTmstp,bdms01AddedTmstp.length);
   	
   }
   
   public void setBdms01AddedTmstp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AddedTmstp,bdms01AddedTmstp.length);
   	
   }
   
     /**
	 * 	Update Bdms01AddedTmstp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AddedTmstp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AddedTmstp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01AddedTmstp with another Field
	 *	@param value
	 */
   public void setBdms01AddedTmstp(Field source) {
       replace(source,0,source.length(),beginBdms01AddedTmstp,BDMS_01_ADDED_TMSTP_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01AddedTmstp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01AddedTmstp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01AddedTmstp,BDMS_01_ADDED_TMSTP_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01AddedTmstp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AddedTmstp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AddedTmstp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01DoNotUseDt
	 *	@return bdms01DoNotUseDt
	 */
   public char[] getBdms01DoNotUseDt() throws CFException{
     if (isBdms01DoNotUseDtModified()) { 
        bdms01DoNotUseDt = refreshBdms01DoNotUseDt();
     }
   		return bdms01DoNotUseDt;
   }

  
	/**
	*  set variable bdms01DoNotUseDt
	*  Corresponding COBOL Variable is BDMS01-DO-NOT-USE-DT
	*  @param value
	**/
   public void setBdms01DoNotUseDt(char[] value) {
      bdms01DoNotUseDt = checkBdms01DoNotUseDtConstraints(value);
      serializeBdms01DoNotUseDt(bdms01DoNotUseDt);
   } 

     /**
	 * 	Update Bdms01DoNotUseDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01DoNotUseDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01DoNotUseDt,bdms01DoNotUseDt.length);
   	
   }
   
   public void setBdms01DoNotUseDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DoNotUseDt,bdms01DoNotUseDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01DoNotUseDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DoNotUseDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DoNotUseDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01DoNotUseDt with another Field
	 *	@param value
	 */
   public void setBdms01DoNotUseDt(Field source) {
       replace(source,0,source.length(),beginBdms01DoNotUseDt,BDMS_01_DO_NOT_USE_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01DoNotUseDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01DoNotUseDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01DoNotUseDt,BDMS_01_DO_NOT_USE_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01DoNotUseDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DoNotUseDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DoNotUseDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TrmlCd
	 *	@return bdms01TrmlCd
	 */
   public char[] getBdms01TrmlCd() throws CFException{
     if (isBdms01TrmlCdModified()) { 
        bdms01TrmlCd = refreshBdms01TrmlCd();
     }
   		return bdms01TrmlCd;
   }

  
	/**
	*  set variable bdms01TrmlCd
	*  Corresponding COBOL Variable is BDMS01-TRML-CD
	*  @param value
	**/
   public void setBdms01TrmlCd(char[] value) {
      bdms01TrmlCd = checkBdms01TrmlCdConstraints(value);
      serializeBdms01TrmlCd(bdms01TrmlCd);
   } 

     /**
	 * 	Update Bdms01TrmlCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TrmlCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TrmlCd,bdms01TrmlCd.length);
   	
   }
   
   public void setBdms01TrmlCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TrmlCd,bdms01TrmlCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TrmlCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TrmlCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TrmlCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TrmlCd with another Field
	 *	@param value
	 */
   public void setBdms01TrmlCd(Field source) {
       replace(source,0,source.length(),beginBdms01TrmlCd,BDMS_01_TRML_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TrmlCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TrmlCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TrmlCd,BDMS_01_TRML_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TrmlCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TrmlCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TrmlCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TranCd
	 *	@return bdms01TranCd
	 */
   public char[] getBdms01TranCd() throws CFException{
     if (isBdms01TranCdModified()) { 
        bdms01TranCd = refreshBdms01TranCd();
     }
   		return bdms01TranCd;
   }

  
	/**
	*  set variable bdms01TranCd
	*  Corresponding COBOL Variable is BDMS01-TRAN-CD
	*  @param value
	**/
   public void setBdms01TranCd(char[] value) {
      bdms01TranCd = checkBdms01TranCdConstraints(value);
      serializeBdms01TranCd(bdms01TranCd);
   } 

     /**
	 * 	Update Bdms01TranCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TranCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TranCd,bdms01TranCd.length);
   	
   }
   
   public void setBdms01TranCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TranCd,bdms01TranCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TranCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TranCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TranCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TranCd with another Field
	 *	@param value
	 */
   public void setBdms01TranCd(Field source) {
       replace(source,0,source.length(),beginBdms01TranCd,BDMS_01_TRAN_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TranCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TranCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TranCd,BDMS_01_TRAN_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TranCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TranCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TranCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SecurityIdaCd
	 *	@return bdms01SecurityIdaCd
	 */
   public char[] getBdms01SecurityIdaCd() throws CFException{
     if (isBdms01SecurityIdaCdModified()) { 
        bdms01SecurityIdaCd = refreshBdms01SecurityIdaCd();
     }
   		return bdms01SecurityIdaCd;
   }

  
	/**
	*  set variable bdms01SecurityIdaCd
	*  Corresponding COBOL Variable is BDMS01-SECURITY-IDA-CD
	*  @param value
	**/
   public void setBdms01SecurityIdaCd(char[] value) {
      bdms01SecurityIdaCd = checkBdms01SecurityIdaCdConstraints(value);
      serializeBdms01SecurityIdaCd(bdms01SecurityIdaCd);
   } 

     /**
	 * 	Update Bdms01SecurityIdaCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SecurityIdaCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SecurityIdaCd,bdms01SecurityIdaCd.length);
   	
   }
   
   public void setBdms01SecurityIdaCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecurityIdaCd,bdms01SecurityIdaCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SecurityIdaCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecurityIdaCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecurityIdaCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SecurityIdaCd with another Field
	 *	@param value
	 */
   public void setBdms01SecurityIdaCd(Field source) {
       replace(source,0,source.length(),beginBdms01SecurityIdaCd,BDMS_01_SECURITY_IDA_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SecurityIdaCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SecurityIdaCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SecurityIdaCd,BDMS_01_SECURITY_IDA_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SecurityIdaCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecurityIdaCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecurityIdaCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TypeSecurityCd
	 *	@return bdms01TypeSecurityCd
	 */
   public char[] getBdms01TypeSecurityCd() throws CFException{
     if (isBdms01TypeSecurityCdModified()) { 
        bdms01TypeSecurityCd = refreshBdms01TypeSecurityCd();
     }
   		return bdms01TypeSecurityCd;
   }

  
	/**
	*  set variable bdms01TypeSecurityCd
	*  Corresponding COBOL Variable is BDMS01-TYPE-SECURITY-CD
	*  @param value
	**/
   public void setBdms01TypeSecurityCd(char[] value) {
      bdms01TypeSecurityCd = checkBdms01TypeSecurityCdConstraints(value);
      serializeBdms01TypeSecurityCd(bdms01TypeSecurityCd);
   } 

     /**
	 * 	Update Bdms01TypeSecurityCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TypeSecurityCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TypeSecurityCd,bdms01TypeSecurityCd.length);
   	
   }
   
   public void setBdms01TypeSecurityCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeSecurityCd,bdms01TypeSecurityCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TypeSecurityCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypeSecurityCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeSecurityCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TypeSecurityCd with another Field
	 *	@param value
	 */
   public void setBdms01TypeSecurityCd(Field source) {
       replace(source,0,source.length(),beginBdms01TypeSecurityCd,BDMS_01_TYPE_SECURITY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TypeSecurityCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TypeSecurityCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TypeSecurityCd,BDMS_01_TYPE_SECURITY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TypeSecurityCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypeSecurityCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeSecurityCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CntryIssueCd
	 *	@return bdms01CntryIssueCd
	 */
   public char[] getBdms01CntryIssueCd() throws CFException{
     if (isBdms01CntryIssueCdModified()) { 
        bdms01CntryIssueCd = refreshBdms01CntryIssueCd();
     }
   		return bdms01CntryIssueCd;
   }

  
	/**
	*  set variable bdms01CntryIssueCd
	*  Corresponding COBOL Variable is BDMS01-CNTRY-ISSUE-CD
	*  @param value
	**/
   public void setBdms01CntryIssueCd(char[] value) {
      bdms01CntryIssueCd = checkBdms01CntryIssueCdConstraints(value);
      serializeBdms01CntryIssueCd(bdms01CntryIssueCd);
   } 

     /**
	 * 	Update Bdms01CntryIssueCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CntryIssueCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CntryIssueCd,bdms01CntryIssueCd.length);
   	
   }
   
   public void setBdms01CntryIssueCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CntryIssueCd,bdms01CntryIssueCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CntryIssueCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CntryIssueCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CntryIssueCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CntryIssueCd with another Field
	 *	@param value
	 */
   public void setBdms01CntryIssueCd(Field source) {
       replace(source,0,source.length(),beginBdms01CntryIssueCd,BDMS_01_CNTRY_ISSUE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CntryIssueCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CntryIssueCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CntryIssueCd,BDMS_01_CNTRY_ISSUE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CntryIssueCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CntryIssueCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CntryIssueCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CntryOrgnCd
	 *	@return bdms01CntryOrgnCd
	 */
   public char[] getBdms01CntryOrgnCd() throws CFException{
     if (isBdms01CntryOrgnCdModified()) { 
        bdms01CntryOrgnCd = refreshBdms01CntryOrgnCd();
     }
   		return bdms01CntryOrgnCd;
   }

  
	/**
	*  set variable bdms01CntryOrgnCd
	*  Corresponding COBOL Variable is BDMS01-CNTRY-ORGN-CD
	*  @param value
	**/
   public void setBdms01CntryOrgnCd(char[] value) {
      bdms01CntryOrgnCd = checkBdms01CntryOrgnCdConstraints(value);
      serializeBdms01CntryOrgnCd(bdms01CntryOrgnCd);
   } 

     /**
	 * 	Update Bdms01CntryOrgnCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CntryOrgnCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CntryOrgnCd,bdms01CntryOrgnCd.length);
   	
   }
   
   public void setBdms01CntryOrgnCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CntryOrgnCd,bdms01CntryOrgnCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CntryOrgnCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CntryOrgnCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CntryOrgnCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CntryOrgnCd with another Field
	 *	@param value
	 */
   public void setBdms01CntryOrgnCd(Field source) {
       replace(source,0,source.length(),beginBdms01CntryOrgnCd,BDMS_01_CNTRY_ORGN_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CntryOrgnCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CntryOrgnCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CntryOrgnCd,BDMS_01_CNTRY_ORGN_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CntryOrgnCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CntryOrgnCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CntryOrgnCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ClientNbr
	 *	@return bdms01ClientNbr
	 */
   public char[] getBdms01ClientNbr() throws CFException{
     if (isBdms01ClientNbrModified()) { 
        bdms01ClientNbr = refreshBdms01ClientNbr();
     }
   		return bdms01ClientNbr;
   }

  
	/**
	*  set variable bdms01ClientNbr
	*  Corresponding COBOL Variable is BDMS01-CLIENT-NBR
	*  @param value
	**/
   public void setBdms01ClientNbr(char[] value) {
      bdms01ClientNbr = checkBdms01ClientNbrConstraints(value);
      serializeBdms01ClientNbr(bdms01ClientNbr);
   } 

     /**
	 * 	Update Bdms01ClientNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ClientNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ClientNbr,bdms01ClientNbr.length);
   	
   }
   
   public void setBdms01ClientNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ClientNbr,bdms01ClientNbr.length);
   	
   }
   
     /**
	 * 	Update Bdms01ClientNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ClientNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ClientNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ClientNbr with another Field
	 *	@param value
	 */
   public void setBdms01ClientNbr(Field source) {
       replace(source,0,source.length(),beginBdms01ClientNbr,BDMS_01_CLIENT_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ClientNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ClientNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ClientNbr,BDMS_01_CLIENT_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ClientNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ClientNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ClientNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01McgillCd
	 *	@return bdms01McgillCd
	 */
	public long getBdms01McgillCd() throws CFException {
       if (isBdms01McgillCdModified()) { 
           bdms01McgillCd = refreshBdms01McgillCd();
        }
   		return bdms01McgillCd;
	}
	

	
	   
	/**
	 * 	Update Bdms01McgillCd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-MCGILL-CD
	 *	@param number
	 */
	public void setBdms01McgillCd(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01McgillCd = checkBdms01McgillCdMaxLimit(number); 
		serializeBdms01McgillCd(bdms01McgillCd);
	}
	

	/**
	 * 	Update Bdms01McgillCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01McgillCd(char[] value) throws CFException {
		 bdms01McgillCd = serializeBdms01McgillCd(value);
	}
	/**
	 * 	Update Bdms01McgillCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01McgillCdString(char[] value) throws CFException {
		 setBdms01McgillCd(value);
	}
	/**
	 *	Returns the value of bdms01CusipCntraNbr
	 *	@return bdms01CusipCntraNbr
	 */
   public char[] getBdms01CusipCntraNbr() throws CFException{
     if (isBdms01CusipCntraNbrModified()) { 
        bdms01CusipCntraNbr = refreshBdms01CusipCntraNbr();
     }
   		return bdms01CusipCntraNbr;
   }

  
	/**
	*  set variable bdms01CusipCntraNbr
	*  Corresponding COBOL Variable is BDMS01-CUSIP-CNTRA-NBR
	*  @param value
	**/
   public void setBdms01CusipCntraNbr(char[] value) {
      bdms01CusipCntraNbr = checkBdms01CusipCntraNbrConstraints(value);
      serializeBdms01CusipCntraNbr(bdms01CusipCntraNbr);
   } 

     /**
	 * 	Update Bdms01CusipCntraNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CusipCntraNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CusipCntraNbr,bdms01CusipCntraNbr.length);
   	
   }
   
   public void setBdms01CusipCntraNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CusipCntraNbr,bdms01CusipCntraNbr.length);
   	
   }
   
     /**
	 * 	Update Bdms01CusipCntraNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CusipCntraNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CusipCntraNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CusipCntraNbr with another Field
	 *	@param value
	 */
   public void setBdms01CusipCntraNbr(Field source) {
       replace(source,0,source.length(),beginBdms01CusipCntraNbr,BDMS_01_CUSIP_CNTRA_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CusipCntraNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CusipCntraNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CusipCntraNbr,BDMS_01_CUSIP_CNTRA_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CusipCntraNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CusipCntraNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CusipCntraNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdTradingSymbol
	 *	@return msdTradingSymbol
	 */
   public char[] getMsdTradingSymbol() throws CFException{
     if (isMsdTradingSymbolModified()) { 
        msdTradingSymbol = refreshMsdTradingSymbol();
     }
   		return msdTradingSymbol;
   }

  
	/**
	*  set variable msdTradingSymbol
	*  Corresponding COBOL Variable is MSD-TRADING-SYMBOL
	*  @param value
	**/
   public void setMsdTradingSymbol(char[] value) {
      msdTradingSymbol = checkMsdTradingSymbolConstraints(value);
      serializeMsdTradingSymbol(msdTradingSymbol);
   } 

     /**
	 * 	Update MsdTradingSymbol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdTradingSymbol(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdTradingSymbol,msdTradingSymbol.length);
   	
   }
   
   public void setMsdTradingSymbol(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdTradingSymbol,msdTradingSymbol.length);
   	
   }
   
     /**
	 * 	Update MsdTradingSymbol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdTradingSymbol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdTradingSymbol+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdTradingSymbol with another Field
	 *	@param value
	 */
   public void setMsdTradingSymbol(Field source) {
       replace(source,0,source.length(),beginMsdTradingSymbol,MSD_TRADING_SYMBOL_LEN);
   	
   }  
   
     /**
	 * 	Update MsdTradingSymbol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdTradingSymbol(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdTradingSymbol,MSD_TRADING_SYMBOL_LEN);
   	
   }
   
     /**
	 * 	Update MsdTradingSymbol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdTradingSymbol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdTradingSymbol+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdClassInd
	 *	@return msdClassInd
	 */
   public char[] getMsdClassInd() throws CFException{
     if (isMsdClassIndModified()) { 
        msdClassInd = refreshMsdClassInd();
     }
   		return msdClassInd;
   }

  
	/**
	*  set variable msdClassInd
	*  Corresponding COBOL Variable is MSD-CLASS-IND
	*  @param value
	**/
   public void setMsdClassInd(char[] value) {
      msdClassInd = checkMsdClassIndConstraints(value);
      serializeMsdClassInd(msdClassInd);
   } 

     /**
	 * 	Update MsdClassInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdClassInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdClassInd,msdClassInd.length);
   	
   }
   
   public void setMsdClassInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdClassInd,msdClassInd.length);
   	
   }
   
     /**
	 * 	Update MsdClassInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdClassInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdClassInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdClassInd with another Field
	 *	@param value
	 */
   public void setMsdClassInd(Field source) {
       replace(source,0,source.length(),beginMsdClassInd,MSD_CLASS_IND_LEN);
   	
   }  
   
     /**
	 * 	Update MsdClassInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdClassInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdClassInd,MSD_CLASS_IND_LEN);
   	
   }
   
     /**
	 * 	Update MsdClassInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdClassInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdClassInd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01AdpMasterSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01AdpMasterSegSqlcd(0);
         setMsdCountryCode(CONSTANTS.SPACE_2);
         setMsdCountryOfOrigin(CONSTANTS.SPACE_2);
          msdAddedCcyymmdd.initialize();
     
          msdSecurityDesc1.initialize();
     
                     setMsdDontUseAddDt(0);
         setMsdDontUseInd(CONSTANTS.SPACE);
         setMsdDnuReason(CONSTANTS.SPACE_30);
         setMsdReferToSec(CONSTANTS.SPACE_7);
         setMsdSourceCodeNewSetup(CONSTANTS.SPACE_2);
         setBdms01AddedTmstp(CONSTANTS.SPACE_26);
         setBdms01DoNotUseDt(CONSTANTS.SPACE_10);
         setBdms01TrmlCd(CONSTANTS.SPACE_8);
         setBdms01TranCd(CONSTANTS.SPACE_8);
         setBdms01SecurityIdaCd(CONSTANTS.SPACE_4);
         setBdms01TypeSecurityCd(CONSTANTS.SPACE_3);
         setBdms01CntryIssueCd(CONSTANTS.SPACE_2);
         setBdms01CntryOrgnCd(CONSTANTS.SPACE_2);
         setBdms01ClientNbr(CONSTANTS.SPACE_4);
                     setBdms01McgillCd(0);
         setBdms01CusipCntraNbr(CONSTANTS.SPACE_8);
         setMsdTradingSymbol(CONSTANTS.SPACE_20);
         setMsdClassInd(CONSTANTS.SPACE);
   }

		public static int getBdms01AdpMasterSegDataFieldLength() {
			return BDMS_01_ADP_MASTER_SEG_DATA_LENGTH;
		}

}
  
