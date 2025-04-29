package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01OidSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01OidSegData extends Bdms01OidSegDataSerialized { 
   

								private int bdms01OidSegSqlcd;
				private MsdOidDateCcyymmdd msdOidDateCcyymmdd = new MsdOidDateCcyymmdd();

								private BigDecimal msdOidIssuePrc = BigDecimal.ZERO;

								private BigDecimal msdOidAccrtdValue = BigDecimal.ZERO;

						private char[] bdms01OidDt = Field.fillLowValue(10);

	
	/**
	* Constructor for Bdms01OidSegData
	**/
    public Bdms01OidSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01OidSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01OidSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			msdOidDateCcyymmdd.setParent(this,getStartOffset() + 4);
    } 

	/**
	 *	Returns the value of bdms01OidSegSqlcd
	 *	@return bdms01OidSegSqlcd
	 */
	public int getBdms01OidSegSqlcd() throws CFException {
       if (isBdms01OidSegSqlcdModified()) { 
           bdms01OidSegSqlcd = refreshBdms01OidSegSqlcd();
        }
   		return bdms01OidSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01OidSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-OID-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01OidSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01OidSegSqlcd = checkBdms01OidSegSqlcdMaxLimit(number); 
		serializeBdms01OidSegSqlcd(bdms01OidSegSqlcd);
	}
	

	public void setBdms01OidSegSqlcd(long number) {
	    number = checkBdms01OidSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01OidSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01OidSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01OidSegSqlcd(char[] value) throws CFException {
		 bdms01OidSegSqlcd = serializeBdms01OidSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01OidSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01OidSegSqlcdString(char[] value) throws CFException {
		 setBdms01OidSegSqlcd(value);
	}
	/**
	 *	Returns the value of msdOidDateCcyymmdd
	 *	@return msdOidDateCcyymmdd
	 */   
	 public MsdOidDateCcyymmdd getMsdOidDateCcyymmdd() {
   	return msdOidDateCcyymmdd;
   }
   /**
	* 	Update MsdOidDateCcyymmdd with the passed value
	*   Corresponding COBOL Variable is MSD-OID-DATE-CCYYMMDD
	*	@param value
	*/
   public void setMsdOidDateCcyymmdd(char[] value) {
      msdOidDateCcyymmdd.setString(value); 
   }   
    
     /**
	 * 	Update MsdOidDateCcyymmdd 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdOidDateCcyymmdd(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdOidDateCcyymmdd.begin,msdOidDateCcyymmdd.length());
   }
   
     /**
	 * 	Update MsdOidDateCcyymmdd 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdOidDateCcyymmdd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdOidDateCcyymmdd.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdOidDateCcyymmdd with another Field
	 *	@param value
	 */
   public void setMsdOidDateCcyymmdd(Field source) {
   	replace(source,0,source.length(),msdOidDateCcyymmdd.begin,msdOidDateCcyymmdd.length());
   }  
   
     /**
	 * 	Update MsdOidDateCcyymmdd 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdOidDateCcyymmdd(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdOidDateCcyymmdd.begin,msdOidDateCcyymmdd.length());
   }
   
     /**
	 * 	Update MsdOidDateCcyymmdd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdOidDateCcyymmdd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdOidDateCcyymmdd.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdOidIssuePrc
	 *	@return msdOidIssuePrc
	 */
	public BigDecimal getMsdOidIssuePrc() throws CFException {
       if (isMsdOidIssuePrcModified()) { 
           msdOidIssuePrc = refreshMsdOidIssuePrc();
        }
   		return msdOidIssuePrc;
	}
	

	
	   
	/**
	 * 	Update MsdOidIssuePrc with the passed number
	 *  Corresponding COBOL Variable is MSD-OID-ISSUE-PRC
	 *	@param number
	 */
	public void setMsdOidIssuePrc(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdOidIssuePrc = checkMsdOidIssuePrcMaxLimit(number);
	    serializeMsdOidIssuePrc(msdOidIssuePrc);
   }
	/**
	 * 	Update MsdOidIssuePrc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdOidIssuePrc(char[] value) throws CFException {
		 msdOidIssuePrc = serializeMsdOidIssuePrc(value);
	}   
	/**
	 *	Returns the value of msdOidAccrtdValue
	 *	@return msdOidAccrtdValue
	 */
	public BigDecimal getMsdOidAccrtdValue() throws CFException {
       if (isMsdOidAccrtdValueModified()) { 
           msdOidAccrtdValue = refreshMsdOidAccrtdValue();
        }
   		return msdOidAccrtdValue;
	}
	

	
	   
	/**
	 * 	Update MsdOidAccrtdValue with the passed number
	 *  Corresponding COBOL Variable is MSD-OID-ACCRTD-VALUE
	 *	@param number
	 */
	public void setMsdOidAccrtdValue(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       msdOidAccrtdValue = checkMsdOidAccrtdValueMaxLimit(number);
	    serializeMsdOidAccrtdValue(msdOidAccrtdValue);
   }
	/**
	 * 	Update MsdOidAccrtdValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdOidAccrtdValue(char[] value) throws CFException {
		 msdOidAccrtdValue = serializeMsdOidAccrtdValue(value);
	}   
	/**
	 *	Returns the value of bdms01OidDt
	 *	@return bdms01OidDt
	 */
   public char[] getBdms01OidDt() throws CFException{
     if (isBdms01OidDtModified()) { 
        bdms01OidDt = refreshBdms01OidDt();
     }
   		return bdms01OidDt;
   }

  
	/**
	*  set variable bdms01OidDt
	*  Corresponding COBOL Variable is BDMS01-OID-DT
	*  @param value
	**/
   public void setBdms01OidDt(char[] value) {
      bdms01OidDt = checkBdms01OidDtConstraints(value);
      serializeBdms01OidDt(bdms01OidDt);
   } 

     /**
	 * 	Update Bdms01OidDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OidDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OidDt,bdms01OidDt.length);
   	
   }
   
   public void setBdms01OidDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OidDt,bdms01OidDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01OidDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OidDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OidDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OidDt with another Field
	 *	@param value
	 */
   public void setBdms01OidDt(Field source) {
       replace(source,0,source.length(),beginBdms01OidDt,BDMS_01_OID_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OidDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OidDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OidDt,BDMS_01_OID_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OidDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OidDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OidDt+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01OidSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01OidSegSqlcd(0);
          msdOidDateCcyymmdd.initialize();
     
			setMsdOidIssuePrc(BigDecimal.ZERO);
			setMsdOidAccrtdValue(BigDecimal.ZERO);
         setBdms01OidDt(CONSTANTS.SPACE_10);
   }

		public static int getBdms01OidSegDataFieldLength() {
			return BDMS_01_OID_SEG_DATA_LENGTH;
		}

}
  
