package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01ConvertibleSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01ConvertibleSegData extends Bdms01ConvertibleSegDataSerialized { 
   

								private int bdms01ConvertibleSegSqlcd;

								private BigDecimal msdCnvrtbleConvtnRate = BigDecimal.ZERO;

						private char[] msdCnvrtbleConvtnCode = Field.fillLowValue(2);

								private long msdCnvrtbleConvtnExpDt;

						private char[] bdms01CvrsnExptnDt = Field.fillLowValue(10);

	
	/**
	* Constructor for Bdms01ConvertibleSegData
	**/
    public Bdms01ConvertibleSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01ConvertibleSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01ConvertibleSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01ConvertibleSegSqlcd
	 *	@return bdms01ConvertibleSegSqlcd
	 */
	public int getBdms01ConvertibleSegSqlcd() throws CFException {
       if (isBdms01ConvertibleSegSqlcdModified()) { 
           bdms01ConvertibleSegSqlcd = refreshBdms01ConvertibleSegSqlcd();
        }
   		return bdms01ConvertibleSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01ConvertibleSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-CONVERTIBLE-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01ConvertibleSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01ConvertibleSegSqlcd = checkBdms01ConvertibleSegSqlcdMaxLimit(number); 
		serializeBdms01ConvertibleSegSqlcd(bdms01ConvertibleSegSqlcd);
	}
	

	public void setBdms01ConvertibleSegSqlcd(long number) {
	    number = checkBdms01ConvertibleSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01ConvertibleSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01ConvertibleSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01ConvertibleSegSqlcd(char[] value) throws CFException {
		 bdms01ConvertibleSegSqlcd = serializeBdms01ConvertibleSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01ConvertibleSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01ConvertibleSegSqlcdString(char[] value) throws CFException {
		 setBdms01ConvertibleSegSqlcd(value);
	}
	/**
	 *	Returns the value of msdCnvrtbleConvtnRate
	 *	@return msdCnvrtbleConvtnRate
	 */
	public BigDecimal getMsdCnvrtbleConvtnRate() throws CFException {
       if (isMsdCnvrtbleConvtnRateModified()) { 
           msdCnvrtbleConvtnRate = refreshMsdCnvrtbleConvtnRate();
        }
   		return msdCnvrtbleConvtnRate;
	}
	

	
	   
	/**
	 * 	Update MsdCnvrtbleConvtnRate with the passed number
	 *  Corresponding COBOL Variable is MSD-CNVRTBLE-CONVTN-RATE
	 *	@param number
	 */
	public void setMsdCnvrtbleConvtnRate(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdCnvrtbleConvtnRate = checkMsdCnvrtbleConvtnRateMaxLimit(number);
	    serializeMsdCnvrtbleConvtnRate(msdCnvrtbleConvtnRate);
   }
	/**
	 * 	Update MsdCnvrtbleConvtnRate with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdCnvrtbleConvtnRate(char[] value) throws CFException {
		 msdCnvrtbleConvtnRate = serializeMsdCnvrtbleConvtnRate(value);
	}   
	/**
	 *	Returns the value of msdCnvrtbleConvtnCode
	 *	@return msdCnvrtbleConvtnCode
	 */
   public char[] getMsdCnvrtbleConvtnCode() throws CFException{
     if (isMsdCnvrtbleConvtnCodeModified()) { 
        msdCnvrtbleConvtnCode = refreshMsdCnvrtbleConvtnCode();
     }
   		return msdCnvrtbleConvtnCode;
   }

  
	/**
	*  set variable msdCnvrtbleConvtnCode
	*  Corresponding COBOL Variable is MSD-CNVRTBLE-CONVTN-CODE
	*  @param value
	**/
   public void setMsdCnvrtbleConvtnCode(char[] value) {
      msdCnvrtbleConvtnCode = checkMsdCnvrtbleConvtnCodeConstraints(value);
      serializeMsdCnvrtbleConvtnCode(msdCnvrtbleConvtnCode);
   } 

     /**
	 * 	Update MsdCnvrtbleConvtnCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdCnvrtbleConvtnCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdCnvrtbleConvtnCode,msdCnvrtbleConvtnCode.length);
   	
   }
   
   public void setMsdCnvrtbleConvtnCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCnvrtbleConvtnCode,msdCnvrtbleConvtnCode.length);
   	
   }
   
     /**
	 * 	Update MsdCnvrtbleConvtnCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdCnvrtbleConvtnCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCnvrtbleConvtnCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdCnvrtbleConvtnCode with another Field
	 *	@param value
	 */
   public void setMsdCnvrtbleConvtnCode(Field source) {
       replace(source,0,source.length(),beginMsdCnvrtbleConvtnCode,MSD_CNVRTBLE_CONVTN_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update MsdCnvrtbleConvtnCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdCnvrtbleConvtnCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdCnvrtbleConvtnCode,MSD_CNVRTBLE_CONVTN_CODE_LEN);
   	
   }
   
     /**
	 * 	Update MsdCnvrtbleConvtnCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdCnvrtbleConvtnCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdCnvrtbleConvtnCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdCnvrtbleConvtnExpDt
	 *	@return msdCnvrtbleConvtnExpDt
	 */
	public long getMsdCnvrtbleConvtnExpDt() throws CFException {
       if (isMsdCnvrtbleConvtnExpDtModified()) { 
           msdCnvrtbleConvtnExpDt = refreshMsdCnvrtbleConvtnExpDt();
        }
   		return msdCnvrtbleConvtnExpDt;
	}
	

	
	   
	/**
	 * 	Update MsdCnvrtbleConvtnExpDt with the passed value
	 *  Corresponding COBOL Variable is MSD-CNVRTBLE-CONVTN-EXP-DT
	 *	@param number
	 */
	public void setMsdCnvrtbleConvtnExpDt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdCnvrtbleConvtnExpDt = checkMsdCnvrtbleConvtnExpDtMaxLimit(number); 
		serializeMsdCnvrtbleConvtnExpDt(msdCnvrtbleConvtnExpDt);
	}
	

	/**
	 * 	Update MsdCnvrtbleConvtnExpDt with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdCnvrtbleConvtnExpDt(char[] value) throws CFException {
		 msdCnvrtbleConvtnExpDt = serializeMsdCnvrtbleConvtnExpDt(value);
	}
	/**
	 * 	Update MsdCnvrtbleConvtnExpDt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdCnvrtbleConvtnExpDtString(char[] value) throws CFException {
		 setMsdCnvrtbleConvtnExpDt(value);
	}
	/**
	 *	Returns the value of bdms01CvrsnExptnDt
	 *	@return bdms01CvrsnExptnDt
	 */
   public char[] getBdms01CvrsnExptnDt() throws CFException{
     if (isBdms01CvrsnExptnDtModified()) { 
        bdms01CvrsnExptnDt = refreshBdms01CvrsnExptnDt();
     }
   		return bdms01CvrsnExptnDt;
   }

  
	/**
	*  set variable bdms01CvrsnExptnDt
	*  Corresponding COBOL Variable is BDMS01-CVRSN-EXPTN-DT
	*  @param value
	**/
   public void setBdms01CvrsnExptnDt(char[] value) {
      bdms01CvrsnExptnDt = checkBdms01CvrsnExptnDtConstraints(value);
      serializeBdms01CvrsnExptnDt(bdms01CvrsnExptnDt);
   } 

     /**
	 * 	Update Bdms01CvrsnExptnDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CvrsnExptnDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CvrsnExptnDt,bdms01CvrsnExptnDt.length);
   	
   }
   
   public void setBdms01CvrsnExptnDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExptnDt,bdms01CvrsnExptnDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01CvrsnExptnDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CvrsnExptnDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExptnDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CvrsnExptnDt with another Field
	 *	@param value
	 */
   public void setBdms01CvrsnExptnDt(Field source) {
       replace(source,0,source.length(),beginBdms01CvrsnExptnDt,BDMS_01_CVRSN_EXPTN_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CvrsnExptnDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CvrsnExptnDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExptnDt,BDMS_01_CVRSN_EXPTN_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CvrsnExptnDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CvrsnExptnDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnExptnDt+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01ConvertibleSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01ConvertibleSegSqlcd(0);
			setMsdCnvrtbleConvtnRate(BigDecimal.ZERO);
         setMsdCnvrtbleConvtnCode(CONSTANTS.SPACE_2);
                     setMsdCnvrtbleConvtnExpDt(0);
         setBdms01CvrsnExptnDt(CONSTANTS.SPACE_10);
   }

		public static int getBdms01ConvertibleSegDataFieldLength() {
			return BDMS_01_CONVERTIBLE_SEG_DATA_LENGTH;
		}

}
  
