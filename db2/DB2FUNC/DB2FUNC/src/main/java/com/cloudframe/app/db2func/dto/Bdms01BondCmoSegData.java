package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01BondCmoSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01BondCmoSegData extends Bdms01BondCmoSegDataSerialized { 
   

								private int bdms01BondCmoSegSqlcd;

						private char[] msdCmoInd = Field.fillLowValue(1);

								private long msdStartAccrualDate;

								private long msdEndAccrualDate;

								private int msdDelayDays;

						private char[] bdms01AccrualStartDt = Field.fillLowValue(10);

						private char[] bdms01AccrualEndDt = Field.fillLowValue(10);

	
	/**
	* Constructor for Bdms01BondCmoSegData
	**/
    public Bdms01BondCmoSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01BondCmoSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01BondCmoSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01BondCmoSegSqlcd
	 *	@return bdms01BondCmoSegSqlcd
	 */
	public int getBdms01BondCmoSegSqlcd() throws CFException {
       if (isBdms01BondCmoSegSqlcdModified()) { 
           bdms01BondCmoSegSqlcd = refreshBdms01BondCmoSegSqlcd();
        }
   		return bdms01BondCmoSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01BondCmoSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-BOND-CMO-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01BondCmoSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01BondCmoSegSqlcd = checkBdms01BondCmoSegSqlcdMaxLimit(number); 
		serializeBdms01BondCmoSegSqlcd(bdms01BondCmoSegSqlcd);
	}
	

	public void setBdms01BondCmoSegSqlcd(long number) {
	    number = checkBdms01BondCmoSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01BondCmoSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01BondCmoSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01BondCmoSegSqlcd(char[] value) throws CFException {
		 bdms01BondCmoSegSqlcd = serializeBdms01BondCmoSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01BondCmoSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01BondCmoSegSqlcdString(char[] value) throws CFException {
		 setBdms01BondCmoSegSqlcd(value);
	}
	/**
	 *	Returns the value of msdCmoInd
	 *	@return msdCmoInd
	 */
   public char[] getMsdCmoInd() throws CFException{
     if (isMsdCmoIndModified()) { 
        msdCmoInd = refreshMsdCmoInd();
     }
   		return msdCmoInd;
   }

  
	/**
	*  set variable msdCmoInd
	*  Corresponding COBOL Variable is MSD-CMO-IND
	*  @param value
	**/
   public void setMsdCmoInd(char[] value) {
      msdCmoInd = checkMsdCmoIndConstraints(value);
      serializeMsdCmoInd(msdCmoInd);
   } 

     /**
	 * 	Update MsdCmoInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdCmoInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdCmoInd,msdCmoInd.length);
   	
   }
   
   public void setMsdCmoInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCmoInd,msdCmoInd.length);
   	
   }
   
     /**
	 * 	Update MsdCmoInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdCmoInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCmoInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdCmoInd with another Field
	 *	@param value
	 */
   public void setMsdCmoInd(Field source) {
       replace(source,0,source.length(),beginMsdCmoInd,MSD_CMO_IND_LEN);
   	
   }  
   
     /**
	 * 	Update MsdCmoInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdCmoInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdCmoInd,MSD_CMO_IND_LEN);
   	
   }
   
     /**
	 * 	Update MsdCmoInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdCmoInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCmoInd+targetIndex,targetLen);
    
   }
	char[] msdSecurityIsACmo88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isMsdSecurityIsACmo()
	 *	@return  Returns true if isMsdSecurityIsACmo() is "1"
	 */
   public boolean isMsdSecurityIsACmo() throws CFException {
      return (  compareChars( getMsdCmoInd() , msdSecurityIsACmo88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setMsdSecurityIsACmoTrue() {  			
    	setMsdCmoInd( msdSecurityIsACmo88Value);
   	}
	/**
	 *	Returns the value of msdStartAccrualDate
	 *	@return msdStartAccrualDate
	 */
	public long getMsdStartAccrualDate() throws CFException {
       if (isMsdStartAccrualDateModified()) { 
           msdStartAccrualDate = refreshMsdStartAccrualDate();
        }
   		return msdStartAccrualDate;
	}
	

	
	   
	/**
	 * 	Update MsdStartAccrualDate with the passed value
	 *  Corresponding COBOL Variable is MSD-START-ACCRUAL-DATE
	 *	@param number
	 */
	public void setMsdStartAccrualDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdStartAccrualDate = checkMsdStartAccrualDateMaxLimit(number); 
		serializeMsdStartAccrualDate(msdStartAccrualDate);
	}
	

	/**
	 * 	Update MsdStartAccrualDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdStartAccrualDate(char[] value) throws CFException {
		 msdStartAccrualDate = serializeMsdStartAccrualDate(value);
	}
	/**
	 * 	Update MsdStartAccrualDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdStartAccrualDateString(char[] value) throws CFException {
		 setMsdStartAccrualDate(value);
	}
	/**
	 *	Returns the value of msdEndAccrualDate
	 *	@return msdEndAccrualDate
	 */
	public long getMsdEndAccrualDate() throws CFException {
       if (isMsdEndAccrualDateModified()) { 
           msdEndAccrualDate = refreshMsdEndAccrualDate();
        }
   		return msdEndAccrualDate;
	}
	

	
	   
	/**
	 * 	Update MsdEndAccrualDate with the passed value
	 *  Corresponding COBOL Variable is MSD-END-ACCRUAL-DATE
	 *	@param number
	 */
	public void setMsdEndAccrualDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdEndAccrualDate = checkMsdEndAccrualDateMaxLimit(number); 
		serializeMsdEndAccrualDate(msdEndAccrualDate);
	}
	

	/**
	 * 	Update MsdEndAccrualDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdEndAccrualDate(char[] value) throws CFException {
		 msdEndAccrualDate = serializeMsdEndAccrualDate(value);
	}
	/**
	 * 	Update MsdEndAccrualDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdEndAccrualDateString(char[] value) throws CFException {
		 setMsdEndAccrualDate(value);
	}
	/**
	 *	Returns the value of msdDelayDays
	 *	@return msdDelayDays
	 */
	public int getMsdDelayDays() throws CFException {
       if (isMsdDelayDaysModified()) { 
           msdDelayDays = refreshMsdDelayDays();
        }
   		return msdDelayDays;
	}
	

	
	   
	/**
	 * 	Update MsdDelayDays with the passed value
	 *  Corresponding COBOL Variable is MSD-DELAY-DAYS
	 *	@param number
	 */
	public void setMsdDelayDays(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdDelayDays = checkMsdDelayDaysMaxLimit(number); 
		serializeMsdDelayDays(msdDelayDays);
	}
	

	public void setMsdDelayDays(long number) {
	    number = checkMsdDelayDaysMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdDelayDays((int)number);
	}
	
	/**
	 * 	Update MsdDelayDays with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdDelayDays(char[] value) throws CFException {
		 msdDelayDays = serializeMsdDelayDays(value);
	}
	/**
	 * 	Update MsdDelayDays with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdDelayDaysString(char[] value) throws CFException {
		 setMsdDelayDays(value);
	}
	/**
	 *	Returns the value of bdms01AccrualStartDt
	 *	@return bdms01AccrualStartDt
	 */
   public char[] getBdms01AccrualStartDt() throws CFException{
     if (isBdms01AccrualStartDtModified()) { 
        bdms01AccrualStartDt = refreshBdms01AccrualStartDt();
     }
   		return bdms01AccrualStartDt;
   }

  
	/**
	*  set variable bdms01AccrualStartDt
	*  Corresponding COBOL Variable is BDMS01-ACCRUAL-START-DT
	*  @param value
	**/
   public void setBdms01AccrualStartDt(char[] value) {
      bdms01AccrualStartDt = checkBdms01AccrualStartDtConstraints(value);
      serializeBdms01AccrualStartDt(bdms01AccrualStartDt);
   } 

     /**
	 * 	Update Bdms01AccrualStartDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01AccrualStartDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01AccrualStartDt,bdms01AccrualStartDt.length);
   	
   }
   
   public void setBdms01AccrualStartDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AccrualStartDt,bdms01AccrualStartDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01AccrualStartDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AccrualStartDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AccrualStartDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01AccrualStartDt with another Field
	 *	@param value
	 */
   public void setBdms01AccrualStartDt(Field source) {
       replace(source,0,source.length(),beginBdms01AccrualStartDt,BDMS_01_ACCRUAL_START_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01AccrualStartDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01AccrualStartDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01AccrualStartDt,BDMS_01_ACCRUAL_START_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01AccrualStartDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AccrualStartDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AccrualStartDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01AccrualEndDt
	 *	@return bdms01AccrualEndDt
	 */
   public char[] getBdms01AccrualEndDt() throws CFException{
     if (isBdms01AccrualEndDtModified()) { 
        bdms01AccrualEndDt = refreshBdms01AccrualEndDt();
     }
   		return bdms01AccrualEndDt;
   }

  
	/**
	*  set variable bdms01AccrualEndDt
	*  Corresponding COBOL Variable is BDMS01-ACCRUAL-END-DT
	*  @param value
	**/
   public void setBdms01AccrualEndDt(char[] value) {
      bdms01AccrualEndDt = checkBdms01AccrualEndDtConstraints(value);
      serializeBdms01AccrualEndDt(bdms01AccrualEndDt);
   } 

     /**
	 * 	Update Bdms01AccrualEndDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01AccrualEndDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01AccrualEndDt,bdms01AccrualEndDt.length);
   	
   }
   
   public void setBdms01AccrualEndDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AccrualEndDt,bdms01AccrualEndDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01AccrualEndDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AccrualEndDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AccrualEndDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01AccrualEndDt with another Field
	 *	@param value
	 */
   public void setBdms01AccrualEndDt(Field source) {
       replace(source,0,source.length(),beginBdms01AccrualEndDt,BDMS_01_ACCRUAL_END_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01AccrualEndDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01AccrualEndDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01AccrualEndDt,BDMS_01_ACCRUAL_END_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01AccrualEndDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AccrualEndDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AccrualEndDt+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01BondCmoSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01BondCmoSegSqlcd(0);
         setMsdCmoInd(CONSTANTS.SPACE);
                     setMsdStartAccrualDate(0);
                     setMsdEndAccrualDate(0);
                     setMsdDelayDays(0);
         setBdms01AccrualStartDt(CONSTANTS.SPACE_10);
         setBdms01AccrualEndDt(CONSTANTS.SPACE_10);
   }

		public static int getBdms01BondCmoSegDataFieldLength() {
			return BDMS_01_BOND_CMO_SEG_DATA_LENGTH;
		}

}
  
