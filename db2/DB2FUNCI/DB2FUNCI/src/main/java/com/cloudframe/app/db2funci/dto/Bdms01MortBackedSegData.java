package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01MortBackedSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:18. using version 5.0.0.257
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01MortBackedSegData extends Bdms01MortBackedSegDataSerialized { 
   

								private int bdms01MortBackedSegSqlcd;

						private char[] msdGnmaPoolNumber = Field.fillLowValue(6);

						private char[] bdms01PayGrdtdInd = Field.fillLowValue(1);

						private char[] bdms01TypeMbsCd = Field.fillLowValue(4);

								private BigDecimal bdms01AvgWghtCpnAmt = BigDecimal.ZERO;

								private BigDecimal bdms01MbOrgnlAmt = BigDecimal.ZERO;

								private BigDecimal bdms01AvgWghtMatAmt = BigDecimal.ZERO;

								private int bdms01MbDayDelayQty;

	
	/**
	* Constructor for Bdms01MortBackedSegData
	**/
    public Bdms01MortBackedSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01MortBackedSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01MortBackedSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01MortBackedSegSqlcd
	 *	@return bdms01MortBackedSegSqlcd
	 */
	public int getBdms01MortBackedSegSqlcd() throws CFException {
       if (isBdms01MortBackedSegSqlcdModified()) { 
           bdms01MortBackedSegSqlcd = refreshBdms01MortBackedSegSqlcd();
        }
   		return bdms01MortBackedSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01MortBackedSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-MORT-BACKED-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01MortBackedSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01MortBackedSegSqlcd = checkBdms01MortBackedSegSqlcdMaxLimit(number); 
		serializeBdms01MortBackedSegSqlcd(bdms01MortBackedSegSqlcd);
	}
	

	public void setBdms01MortBackedSegSqlcd(long number) {
	    number = checkBdms01MortBackedSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01MortBackedSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01MortBackedSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01MortBackedSegSqlcd(char[] value) throws CFException {
		 bdms01MortBackedSegSqlcd = serializeBdms01MortBackedSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01MortBackedSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01MortBackedSegSqlcdString(char[] value) throws CFException {
		 setBdms01MortBackedSegSqlcd(value);
	}
	/**
	 *	Returns the value of msdGnmaPoolNumber
	 *	@return msdGnmaPoolNumber
	 */
   public char[] getMsdGnmaPoolNumber() throws CFException{
     if (isMsdGnmaPoolNumberModified()) { 
        msdGnmaPoolNumber = refreshMsdGnmaPoolNumber();
     }
   		return msdGnmaPoolNumber;
   }

  
	/**
	*  set variable msdGnmaPoolNumber
	*  Corresponding COBOL Variable is MSD-GNMA-POOL-NUMBER
	*  @param value
	**/
   public void setMsdGnmaPoolNumber(char[] value) {
      msdGnmaPoolNumber = checkMsdGnmaPoolNumberConstraints(value);
      serializeMsdGnmaPoolNumber(msdGnmaPoolNumber);
   } 

     /**
	 * 	Update MsdGnmaPoolNumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdGnmaPoolNumber(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdGnmaPoolNumber,msdGnmaPoolNumber.length);
   	
   }
   
   public void setMsdGnmaPoolNumber(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdGnmaPoolNumber,msdGnmaPoolNumber.length);
   	
   }
   
     /**
	 * 	Update MsdGnmaPoolNumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdGnmaPoolNumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdGnmaPoolNumber+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdGnmaPoolNumber with another Field
	 *	@param value
	 */
   public void setMsdGnmaPoolNumber(Field source) {
       replace(source,0,source.length(),beginMsdGnmaPoolNumber,MSD_GNMA_POOL_NUMBER_LEN);
   	
   }  
   
     /**
	 * 	Update MsdGnmaPoolNumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdGnmaPoolNumber(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdGnmaPoolNumber,MSD_GNMA_POOL_NUMBER_LEN);
   	
   }
   
     /**
	 * 	Update MsdGnmaPoolNumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdGnmaPoolNumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdGnmaPoolNumber+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PayGrdtdInd
	 *	@return bdms01PayGrdtdInd
	 */
   public char[] getBdms01PayGrdtdInd() throws CFException{
     if (isBdms01PayGrdtdIndModified()) { 
        bdms01PayGrdtdInd = refreshBdms01PayGrdtdInd();
     }
   		return bdms01PayGrdtdInd;
   }

  
	/**
	*  set variable bdms01PayGrdtdInd
	*  Corresponding COBOL Variable is BDMS01-PAY-GRDTD-IND
	*  @param value
	**/
   public void setBdms01PayGrdtdInd(char[] value) {
      bdms01PayGrdtdInd = checkBdms01PayGrdtdIndConstraints(value);
      serializeBdms01PayGrdtdInd(bdms01PayGrdtdInd);
   } 

     /**
	 * 	Update Bdms01PayGrdtdInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PayGrdtdInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PayGrdtdInd,bdms01PayGrdtdInd.length);
   	
   }
   
   public void setBdms01PayGrdtdInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PayGrdtdInd,bdms01PayGrdtdInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PayGrdtdInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PayGrdtdInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PayGrdtdInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PayGrdtdInd with another Field
	 *	@param value
	 */
   public void setBdms01PayGrdtdInd(Field source) {
       replace(source,0,source.length(),beginBdms01PayGrdtdInd,BDMS_01_PAY_GRDTD_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PayGrdtdInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PayGrdtdInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PayGrdtdInd,BDMS_01_PAY_GRDTD_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PayGrdtdInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PayGrdtdInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PayGrdtdInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TypeMbsCd
	 *	@return bdms01TypeMbsCd
	 */
   public char[] getBdms01TypeMbsCd() throws CFException{
     if (isBdms01TypeMbsCdModified()) { 
        bdms01TypeMbsCd = refreshBdms01TypeMbsCd();
     }
   		return bdms01TypeMbsCd;
   }

  
	/**
	*  set variable bdms01TypeMbsCd
	*  Corresponding COBOL Variable is BDMS01-TYPE-MBS-CD
	*  @param value
	**/
   public void setBdms01TypeMbsCd(char[] value) {
      bdms01TypeMbsCd = checkBdms01TypeMbsCdConstraints(value);
      serializeBdms01TypeMbsCd(bdms01TypeMbsCd);
   } 

     /**
	 * 	Update Bdms01TypeMbsCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TypeMbsCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TypeMbsCd,bdms01TypeMbsCd.length);
   	
   }
   
   public void setBdms01TypeMbsCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeMbsCd,bdms01TypeMbsCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TypeMbsCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypeMbsCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeMbsCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TypeMbsCd with another Field
	 *	@param value
	 */
   public void setBdms01TypeMbsCd(Field source) {
       replace(source,0,source.length(),beginBdms01TypeMbsCd,BDMS_01_TYPE_MBS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TypeMbsCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TypeMbsCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TypeMbsCd,BDMS_01_TYPE_MBS_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TypeMbsCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypeMbsCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeMbsCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01AvgWghtCpnAmt
	 *	@return bdms01AvgWghtCpnAmt
	 */
	public BigDecimal getBdms01AvgWghtCpnAmt() throws CFException {
       if (isBdms01AvgWghtCpnAmtModified()) { 
           bdms01AvgWghtCpnAmt = refreshBdms01AvgWghtCpnAmt();
        }
   		return bdms01AvgWghtCpnAmt;
	}
	

	
	   
	/**
	 * 	Update Bdms01AvgWghtCpnAmt with the passed number
	 *  Corresponding COBOL Variable is BDMS01-AVG-WGHT-CPN-AMT
	 *	@param number
	 */
	public void setBdms01AvgWghtCpnAmt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01AvgWghtCpnAmt = checkBdms01AvgWghtCpnAmtMaxLimit(number);
	    serializeBdms01AvgWghtCpnAmt(bdms01AvgWghtCpnAmt);
   }
	/**
	 * 	Update Bdms01AvgWghtCpnAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01AvgWghtCpnAmt(char[] value) throws CFException {
		 bdms01AvgWghtCpnAmt = serializeBdms01AvgWghtCpnAmt(value);
	}   
	/**
	 *	Returns the value of bdms01MbOrgnlAmt
	 *	@return bdms01MbOrgnlAmt
	 */
	public BigDecimal getBdms01MbOrgnlAmt() throws CFException {
       if (isBdms01MbOrgnlAmtModified()) { 
           bdms01MbOrgnlAmt = refreshBdms01MbOrgnlAmt();
        }
   		return bdms01MbOrgnlAmt;
	}
	

	
	   
	/**
	 * 	Update Bdms01MbOrgnlAmt with the passed number
	 *  Corresponding COBOL Variable is BDMS01-MB-ORGNL-AMT
	 *	@param number
	 */
	public void setBdms01MbOrgnlAmt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01MbOrgnlAmt = checkBdms01MbOrgnlAmtMaxLimit(number);
	    serializeBdms01MbOrgnlAmt(bdms01MbOrgnlAmt);
   }
	/**
	 * 	Update Bdms01MbOrgnlAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01MbOrgnlAmt(char[] value) throws CFException {
		 bdms01MbOrgnlAmt = serializeBdms01MbOrgnlAmt(value);
	}   
	/**
	 *	Returns the value of bdms01AvgWghtMatAmt
	 *	@return bdms01AvgWghtMatAmt
	 */
	public BigDecimal getBdms01AvgWghtMatAmt() throws CFException {
       if (isBdms01AvgWghtMatAmtModified()) { 
           bdms01AvgWghtMatAmt = refreshBdms01AvgWghtMatAmt();
        }
   		return bdms01AvgWghtMatAmt;
	}
	

	
	   
	/**
	 * 	Update Bdms01AvgWghtMatAmt with the passed number
	 *  Corresponding COBOL Variable is BDMS01-AVG-WGHT-MAT-AMT
	 *	@param number
	 */
	public void setBdms01AvgWghtMatAmt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01AvgWghtMatAmt = checkBdms01AvgWghtMatAmtMaxLimit(number);
	    serializeBdms01AvgWghtMatAmt(bdms01AvgWghtMatAmt);
   }
	/**
	 * 	Update Bdms01AvgWghtMatAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01AvgWghtMatAmt(char[] value) throws CFException {
		 bdms01AvgWghtMatAmt = serializeBdms01AvgWghtMatAmt(value);
	}   
	/**
	 *	Returns the value of bdms01MbDayDelayQty
	 *	@return bdms01MbDayDelayQty
	 */
	public int getBdms01MbDayDelayQty() throws CFException {
       if (isBdms01MbDayDelayQtyModified()) { 
           bdms01MbDayDelayQty = refreshBdms01MbDayDelayQty();
        }
   		return bdms01MbDayDelayQty;
	}
	

	
	   
	/**
	 * 	Update Bdms01MbDayDelayQty with the passed value
	 *  Corresponding COBOL Variable is BDMS01-MB-DAY-DELAY-QTY
	 *	@param number
	 */
	public void setBdms01MbDayDelayQty(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01MbDayDelayQty = checkBdms01MbDayDelayQtyMaxLimit(number); 
		serializeBdms01MbDayDelayQty(bdms01MbDayDelayQty);
	}
	

	public void setBdms01MbDayDelayQty(long number) {
	    number = checkBdms01MbDayDelayQtyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01MbDayDelayQty((int)number);
	}
	
	/**
	 * 	Update Bdms01MbDayDelayQty with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01MbDayDelayQty(char[] value) throws CFException {
		 bdms01MbDayDelayQty = serializeBdms01MbDayDelayQty(value);
	}
	/**
	 * 	Update Bdms01MbDayDelayQty with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01MbDayDelayQtyString(char[] value) throws CFException {
		 setBdms01MbDayDelayQty(value);
	}

	
	
	
	/**
	 * 	initializes Bdms01MortBackedSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01MortBackedSegSqlcd(0);
         setMsdGnmaPoolNumber(CONSTANTS.SPACE_6);
         setBdms01PayGrdtdInd(CONSTANTS.SPACE);
         setBdms01TypeMbsCd(CONSTANTS.SPACE_4);
			setBdms01AvgWghtCpnAmt(BigDecimal.ZERO);
			setBdms01MbOrgnlAmt(BigDecimal.ZERO);
			setBdms01AvgWghtMatAmt(BigDecimal.ZERO);
                     setBdms01MbDayDelayQty(0);
   }

		public static int getBdms01MortBackedSegDataFieldLength() {
			return BDMS_01_MORT_BACKED_SEG_DATA_LENGTH;
		}

}
  
