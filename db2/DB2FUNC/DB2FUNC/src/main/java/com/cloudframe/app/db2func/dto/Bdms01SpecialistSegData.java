package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01SpecialistSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01SpecialistSegData extends Bdms01SpecialistSegDataSerialized { 
   

								private int bdms01SpecialistSegSqlcd;

								private long msdSpecAcctBbbaaaaat;
				private MsdSpecialistAcctNo msdSpecialistAcctNo = new MsdSpecialistAcctNo();

						private char[] msdSpecAcctCkdg = Field.fillLowValue(1);

						private char[] bdms01SpecExchangeCd = Field.fillLowValue(10);

						private char[] bdms01SpecClientNbr = Field.fillLowValue(4);

	
	/**
	* Constructor for Bdms01SpecialistSegData
	**/
    public Bdms01SpecialistSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01SpecialistSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01SpecialistSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			msdSpecialistAcctNo.setParent(this,getStartOffset() + 4);
    } 

	/**
	 *	Returns the value of bdms01SpecialistSegSqlcd
	 *	@return bdms01SpecialistSegSqlcd
	 */
	public int getBdms01SpecialistSegSqlcd() throws CFException {
       if (isBdms01SpecialistSegSqlcdModified()) { 
           bdms01SpecialistSegSqlcd = refreshBdms01SpecialistSegSqlcd();
        }
   		return bdms01SpecialistSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01SpecialistSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-SPECIALIST-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01SpecialistSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01SpecialistSegSqlcd = checkBdms01SpecialistSegSqlcdMaxLimit(number); 
		serializeBdms01SpecialistSegSqlcd(bdms01SpecialistSegSqlcd);
	}
	

	public void setBdms01SpecialistSegSqlcd(long number) {
	    number = checkBdms01SpecialistSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01SpecialistSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01SpecialistSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01SpecialistSegSqlcd(char[] value) throws CFException {
		 bdms01SpecialistSegSqlcd = serializeBdms01SpecialistSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01SpecialistSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01SpecialistSegSqlcdString(char[] value) throws CFException {
		 setBdms01SpecialistSegSqlcd(value);
	}
	/**
	 *	Returns the value of msdSpecAcctBbbaaaaat
	 *	@return msdSpecAcctBbbaaaaat
	 */
	public long getMsdSpecAcctBbbaaaaat() throws CFException {
       if (isMsdSpecAcctBbbaaaaatModified()) { 
           msdSpecAcctBbbaaaaat = refreshMsdSpecAcctBbbaaaaat();
        }
   		return msdSpecAcctBbbaaaaat;
	}
	

	
	   
	/**
	 * 	Update MsdSpecAcctBbbaaaaat with the passed value
	 *  Corresponding COBOL Variable is MSD-SPEC-ACCT-BBBAAAAAT
	 *	@param number
	 */
	public void setMsdSpecAcctBbbaaaaat(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdSpecAcctBbbaaaaat = checkMsdSpecAcctBbbaaaaatMaxLimit(number); 
		serializeMsdSpecAcctBbbaaaaat(msdSpecAcctBbbaaaaat);
	}
	

	/**
	 * 	Update MsdSpecAcctBbbaaaaat with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdSpecAcctBbbaaaaat(char[] value) throws CFException {
		 msdSpecAcctBbbaaaaat = serializeMsdSpecAcctBbbaaaaat(value);
	}
	/**
	 * 	Update MsdSpecAcctBbbaaaaat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdSpecAcctBbbaaaaatString(char[] value) throws CFException {
		 setMsdSpecAcctBbbaaaaat(value);
	}
	/**
	 *	Returns the value of msdSpecialistAcctNo
	 *	@return msdSpecialistAcctNo
	 */   
	 public MsdSpecialistAcctNo getMsdSpecialistAcctNo() {
   	return msdSpecialistAcctNo;
   }
   /**
	* 	Update MsdSpecialistAcctNo with the passed value
	*   Corresponding COBOL Variable is MSD-SPECIALIST-ACCT-NO
	*	@param value
	*/
   public void setMsdSpecialistAcctNo(char[] value) {
      msdSpecialistAcctNo.setString(value); 
   }   
    
     /**
	 * 	Update MsdSpecialistAcctNo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdSpecialistAcctNo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdSpecialistAcctNo.begin,msdSpecialistAcctNo.length());
   }
   
     /**
	 * 	Update MsdSpecialistAcctNo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSpecialistAcctNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdSpecialistAcctNo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdSpecialistAcctNo with another Field
	 *	@param value
	 */
   public void setMsdSpecialistAcctNo(Field source) {
   	replace(source,0,source.length(),msdSpecialistAcctNo.begin,msdSpecialistAcctNo.length());
   }  
   
     /**
	 * 	Update MsdSpecialistAcctNo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdSpecialistAcctNo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdSpecialistAcctNo.begin,msdSpecialistAcctNo.length());
   }
   
     /**
	 * 	Update MsdSpecialistAcctNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSpecialistAcctNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdSpecialistAcctNo.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdSpecAcctCkdg
	 *	@return msdSpecAcctCkdg
	 */
   public char[] getMsdSpecAcctCkdg() throws CFException{
     if (isMsdSpecAcctCkdgModified()) { 
        msdSpecAcctCkdg = refreshMsdSpecAcctCkdg();
     }
   		return msdSpecAcctCkdg;
   }

  
	/**
	*  set variable msdSpecAcctCkdg
	*  Corresponding COBOL Variable is MSD-SPEC-ACCT-CKDG
	*  @param value
	**/
   public void setMsdSpecAcctCkdg(char[] value) {
      msdSpecAcctCkdg = checkMsdSpecAcctCkdgConstraints(value);
      serializeMsdSpecAcctCkdg(msdSpecAcctCkdg);
   } 

     /**
	 * 	Update MsdSpecAcctCkdg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSpecAcctCkdg(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSpecAcctCkdg,msdSpecAcctCkdg.length);
   	
   }
   
   public void setMsdSpecAcctCkdg(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSpecAcctCkdg,msdSpecAcctCkdg.length);
   	
   }
   
     /**
	 * 	Update MsdSpecAcctCkdg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSpecAcctCkdg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSpecAcctCkdg+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSpecAcctCkdg with another Field
	 *	@param value
	 */
   public void setMsdSpecAcctCkdg(Field source) {
       replace(source,0,source.length(),beginMsdSpecAcctCkdg,MSD_SPEC_ACCT_CKDG_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSpecAcctCkdg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSpecAcctCkdg(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSpecAcctCkdg,MSD_SPEC_ACCT_CKDG_LEN);
   	
   }
   
     /**
	 * 	Update MsdSpecAcctCkdg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSpecAcctCkdg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSpecAcctCkdg+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SpecExchangeCd
	 *	@return bdms01SpecExchangeCd
	 */
   public char[] getBdms01SpecExchangeCd() throws CFException{
     if (isBdms01SpecExchangeCdModified()) { 
        bdms01SpecExchangeCd = refreshBdms01SpecExchangeCd();
     }
   		return bdms01SpecExchangeCd;
   }

  
	/**
	*  set variable bdms01SpecExchangeCd
	*  Corresponding COBOL Variable is BDMS01-SPEC-EXCHANGE-CD
	*  @param value
	**/
   public void setBdms01SpecExchangeCd(char[] value) {
      bdms01SpecExchangeCd = checkBdms01SpecExchangeCdConstraints(value);
      serializeBdms01SpecExchangeCd(bdms01SpecExchangeCd);
   } 

     /**
	 * 	Update Bdms01SpecExchangeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SpecExchangeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SpecExchangeCd,bdms01SpecExchangeCd.length);
   	
   }
   
   public void setBdms01SpecExchangeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SpecExchangeCd,bdms01SpecExchangeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SpecExchangeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SpecExchangeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SpecExchangeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SpecExchangeCd with another Field
	 *	@param value
	 */
   public void setBdms01SpecExchangeCd(Field source) {
       replace(source,0,source.length(),beginBdms01SpecExchangeCd,BDMS_01_SPEC_EXCHANGE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SpecExchangeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SpecExchangeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SpecExchangeCd,BDMS_01_SPEC_EXCHANGE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SpecExchangeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SpecExchangeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SpecExchangeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SpecClientNbr
	 *	@return bdms01SpecClientNbr
	 */
   public char[] getBdms01SpecClientNbr() throws CFException{
     if (isBdms01SpecClientNbrModified()) { 
        bdms01SpecClientNbr = refreshBdms01SpecClientNbr();
     }
   		return bdms01SpecClientNbr;
   }

  
	/**
	*  set variable bdms01SpecClientNbr
	*  Corresponding COBOL Variable is BDMS01-SPEC-CLIENT-NBR
	*  @param value
	**/
   public void setBdms01SpecClientNbr(char[] value) {
      bdms01SpecClientNbr = checkBdms01SpecClientNbrConstraints(value);
      serializeBdms01SpecClientNbr(bdms01SpecClientNbr);
   } 

     /**
	 * 	Update Bdms01SpecClientNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SpecClientNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SpecClientNbr,bdms01SpecClientNbr.length);
   	
   }
   
   public void setBdms01SpecClientNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SpecClientNbr,bdms01SpecClientNbr.length);
   	
   }
   
     /**
	 * 	Update Bdms01SpecClientNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SpecClientNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SpecClientNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SpecClientNbr with another Field
	 *	@param value
	 */
   public void setBdms01SpecClientNbr(Field source) {
       replace(source,0,source.length(),beginBdms01SpecClientNbr,BDMS_01_SPEC_CLIENT_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SpecClientNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SpecClientNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SpecClientNbr,BDMS_01_SPEC_CLIENT_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SpecClientNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SpecClientNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SpecClientNbr+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01SpecialistSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01SpecialistSegSqlcd(0);
                     setMsdSpecAcctBbbaaaaat(0);
         setMsdSpecAcctCkdg(CONSTANTS.SPACE);
         setBdms01SpecExchangeCd(CONSTANTS.SPACE_10);
         setBdms01SpecClientNbr(CONSTANTS.SPACE_4);
   }

		public static int getBdms01SpecialistSegDataFieldLength() {
			return BDMS_01_SPECIALIST_SEG_DATA_LENGTH;
		}

}
  
