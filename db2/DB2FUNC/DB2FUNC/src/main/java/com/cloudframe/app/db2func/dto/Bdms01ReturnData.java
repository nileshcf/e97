package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01ReturnData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01ReturnData extends Bdms01ReturnDataSerialized { 
   

						private char[] bdms01ReturnCode = Field.fillLowValue(2);

								private int bdms01ReturnSqlcode;
				private MsdRecordKey msdRecordKey = new MsdRecordKey();

						private char[] bdms01RegCode = Field.fillLowValue(2);
				private Bdms01AdpMasterSegData bdms01AdpMasterSegData = new Bdms01AdpMasterSegData();
				private Bdms01BaseSecuritySegData bdms01BaseSecuritySegData = new Bdms01BaseSecuritySegData();
				private Bdms01SecurityTypeSegData bdms01SecurityTypeSegData = new Bdms01SecurityTypeSegData();
				private Bdms01PriceSegData bdms01PriceSegData = new Bdms01PriceSegData();
				private Bdms01XrefSegData bdms01XrefSegData = new Bdms01XrefSegData();
				private Bdms01DescSegData bdms01DescSegData = new Bdms01DescSegData();
				private Bdms01SpecialistSegData bdms01SpecialistSegData = new Bdms01SpecialistSegData();
				private Bdms01FrozenChillSegData bdms01FrozenChillSegData = new Bdms01FrozenChillSegData();
				private Bdms01IncomeSegData bdms01IncomeSegData = new Bdms01IncomeSegData();
				private Bdms01RatingSegData bdms01RatingSegData = new Bdms01RatingSegData();
				private Bdms01ConvertibleSegData bdms01ConvertibleSegData = new Bdms01ConvertibleSegData();
				private Bdms01StockSegData bdms01StockSegData = new Bdms01StockSegData();
				private Bdms01OptionSegData bdms01OptionSegData = new Bdms01OptionSegData();
				private Bdms01BondBasicSegData bdms01BondBasicSegData = new Bdms01BondBasicSegData();
				private Bdms01BondFeatureSegData bdms01BondFeatureSegData = new Bdms01BondFeatureSegData();
				private Bdms01BondFactorSegData bdms01BondFactorSegData = new Bdms01BondFactorSegData();
				private Bdms01BondCmoSegData bdms01BondCmoSegData = new Bdms01BondCmoSegData();
				private Bdms01OidSegData bdms01OidSegData = new Bdms01OidSegData();
				private Bdms01UitSegData bdms01UitSegData = new Bdms01UitSegData();
				private Bdms01MortBackedSegData bdms01MortBackedSegData = new Bdms01MortBackedSegData();
				private Bdms01GetpriceSegData bdms01GetpriceSegData = new Bdms01GetpriceSegData();
				private Bdms01MultSecurityNoData bdms01MultSecurityNoData = new Bdms01MultSecurityNoData();
				private Bdms01DivQualifyData bdms01DivQualifyData = new Bdms01DivQualifyData();
				private Bdms01TaxSegData bdms01TaxSegData = new Bdms01TaxSegData();
				private Bdms01BondBasicExpData bdms01BondBasicExpData = new Bdms01BondBasicExpData();
				private Bdms01BaseSecurityExpData bdms01BaseSecurityExpData = new Bdms01BaseSecurityExpData();
				private Bdms01MultAdpNoData bdms01MultAdpNoData = new Bdms01MultAdpNoData();
				private Bdms01UnitsSegData bdms01UnitsSegData = new Bdms01UnitsSegData();
				private Bdms01TcontrolSegData bdms01TcontrolSegData = new Bdms01TcontrolSegData();
				private Bdms01SecurityPrivSegData bdms01SecurityPrivSegData = new Bdms01SecurityPrivSegData();
				private Bdms01AdpMasterExpData bdms01AdpMasterExpData = new Bdms01AdpMasterExpData();
				private Bdms01CvrsnSegData bdms01CvrsnSegData = new Bdms01CvrsnSegData();
				private Bdms01CanadaBondSegData bdms01CanadaBondSegData = new Bdms01CanadaBondSegData();
				private Bdms01OptUnderlXrefData bdms01OptUnderlXrefData = new Bdms01OptUnderlXrefData();

	
	/**
	* Constructor for Bdms01ReturnData
	**/
    public Bdms01ReturnData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01ReturnData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01ReturnData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			msdRecordKey.setParent(this,getStartOffset() + 6);
	       			bdms01AdpMasterSegData.setParent(this,getStartOffset() + 16);
	       			bdms01BaseSecuritySegData.setParent(this,getStartOffset() + 222);
	       			bdms01SecurityTypeSegData.setParent(this,getStartOffset() + 357);
	       			bdms01PriceSegData.setParent(this,getStartOffset() + 400);
	       			bdms01XrefSegData.setParent(this,getStartOffset() + 562);
	       			bdms01DescSegData.setParent(this,getStartOffset() + 882);
	       			bdms01SpecialistSegData.setParent(this,getStartOffset() + 1181);
	       			bdms01FrozenChillSegData.setParent(this,getStartOffset() + 1239);
	       			bdms01IncomeSegData.setParent(this,getStartOffset() + 1401);
	       			bdms01RatingSegData.setParent(this,getStartOffset() + 1840);
	       			bdms01ConvertibleSegData.setParent(this,getStartOffset() + 1887);
	       			bdms01StockSegData.setParent(this,getStartOffset() + 1956);
	       			bdms01OptionSegData.setParent(this,getStartOffset() + 2249);
	       			bdms01BondBasicSegData.setParent(this,getStartOffset() + 2438);
	       			bdms01BondFeatureSegData.setParent(this,getStartOffset() + 2687);
	       			bdms01BondFactorSegData.setParent(this,getStartOffset() + 3081);
	       			bdms01BondCmoSegData.setParent(this,getStartOffset() + 3245);
	       			bdms01OidSegData.setParent(this,getStartOffset() + 3329);
	       			bdms01UitSegData.setParent(this,getStartOffset() + 3417);
	       			bdms01MortBackedSegData.setParent(this,getStartOffset() + 3460);
	       			bdms01GetpriceSegData.setParent(this,getStartOffset() + 3549);
	       			bdms01MultSecurityNoData.setParent(this,getStartOffset() + 3668);
	       			bdms01DivQualifyData.setParent(this,getStartOffset() + 3705);
	       			bdms01TaxSegData.setParent(this,getStartOffset() + 3707);
	       			bdms01BondBasicExpData.setParent(this,getStartOffset() + 3773);
	       			bdms01BaseSecurityExpData.setParent(this,getStartOffset() + 3930);
	       			bdms01MultAdpNoData.setParent(this,getStartOffset() + 4146);
	       			bdms01UnitsSegData.setParent(this,getStartOffset() + 4328);
	       			bdms01TcontrolSegData.setParent(this,getStartOffset() + 4385);
	       			bdms01SecurityPrivSegData.setParent(this,getStartOffset() + 4530);
	       			bdms01AdpMasterExpData.setParent(this,getStartOffset() + 4531);
	       			bdms01CvrsnSegData.setParent(this,getStartOffset() + 4744);
	       			bdms01CanadaBondSegData.setParent(this,getStartOffset() + 5133);
	       			bdms01OptUnderlXrefData.setParent(this,getStartOffset() + 5177);
    } 

	/**
	 *	Returns the value of bdms01ReturnCode
	 *	@return bdms01ReturnCode
	 */
   public char[] getBdms01ReturnCode() throws CFException{
     if (isBdms01ReturnCodeModified()) { 
        bdms01ReturnCode = refreshBdms01ReturnCode();
     }
   		return bdms01ReturnCode;
   }

  
	/**
	*  set variable bdms01ReturnCode
	*  Corresponding COBOL Variable is BDMS01-RETURN-CODE
	*  @param value
	**/
   public void setBdms01ReturnCode(char[] value) {
      bdms01ReturnCode = checkBdms01ReturnCodeConstraints(value);
      serializeBdms01ReturnCode(bdms01ReturnCode);
   } 

     /**
	 * 	Update Bdms01ReturnCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ReturnCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ReturnCode,bdms01ReturnCode.length);
   	
   }
   
   public void setBdms01ReturnCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ReturnCode,bdms01ReturnCode.length);
   	
   }
   
     /**
	 * 	Update Bdms01ReturnCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ReturnCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ReturnCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ReturnCode with another Field
	 *	@param value
	 */
   public void setBdms01ReturnCode(Field source) {
       replace(source,0,source.length(),beginBdms01ReturnCode,BDMS_01_RETURN_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ReturnCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ReturnCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ReturnCode,BDMS_01_RETURN_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ReturnCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ReturnCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ReturnCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ReturnSqlcode
	 *	@return bdms01ReturnSqlcode
	 */
	public int getBdms01ReturnSqlcode() throws CFException {
       if (isBdms01ReturnSqlcodeModified()) { 
           bdms01ReturnSqlcode = refreshBdms01ReturnSqlcode();
        }
   		return bdms01ReturnSqlcode;
	}
	

	
	   
	/**
	 * 	Update Bdms01ReturnSqlcode with the passed value
	 *  Corresponding COBOL Variable is BDMS01-RETURN-SQLCODE
	 *	@param number
	 */
	public void setBdms01ReturnSqlcode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01ReturnSqlcode = checkBdms01ReturnSqlcodeMaxLimit(number); 
		serializeBdms01ReturnSqlcode(bdms01ReturnSqlcode);
	}
	

	public void setBdms01ReturnSqlcode(long number) {
	    number = checkBdms01ReturnSqlcodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01ReturnSqlcode((int)number);
	}
	
	/**
	 * 	Update Bdms01ReturnSqlcode with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01ReturnSqlcode(char[] value) throws CFException {
		 bdms01ReturnSqlcode = serializeBdms01ReturnSqlcode(value);
	}
	/**
	 * 	Update Bdms01ReturnSqlcode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01ReturnSqlcodeString(char[] value) throws CFException {
		 setBdms01ReturnSqlcode(value);
	}
	/**
	 *	Returns the value of msdRecordKey
	 *	@return msdRecordKey
	 */   
	 public MsdRecordKey getMsdRecordKey() {
   	return msdRecordKey;
   }
   /**
	* 	Update MsdRecordKey with the passed value
	*   Corresponding COBOL Variable is MSD-RECORD-KEY
	*	@param value
	*/
   public void setMsdRecordKey(char[] value) {
      msdRecordKey.setString(value); 
   }   
    
     /**
	 * 	Update MsdRecordKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdRecordKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdRecordKey.begin,msdRecordKey.length());
   }
   
     /**
	 * 	Update MsdRecordKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdRecordKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdRecordKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdRecordKey with another Field
	 *	@param value
	 */
   public void setMsdRecordKey(Field source) {
   	replace(source,0,source.length(),msdRecordKey.begin,msdRecordKey.length());
   }  
   
     /**
	 * 	Update MsdRecordKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdRecordKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdRecordKey.begin,msdRecordKey.length());
   }
   
     /**
	 * 	Update MsdRecordKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdRecordKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdRecordKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01RegCode
	 *	@return bdms01RegCode
	 */
   public char[] getBdms01RegCode() throws CFException{
     if (isBdms01RegCodeModified()) { 
        bdms01RegCode = refreshBdms01RegCode();
     }
   		return bdms01RegCode;
   }

  
	/**
	*  set variable bdms01RegCode
	*  Corresponding COBOL Variable is BDMS01-REG-CODE
	*  @param value
	**/
   public void setBdms01RegCode(char[] value) {
      bdms01RegCode = checkBdms01RegCodeConstraints(value);
      serializeBdms01RegCode(bdms01RegCode);
   } 

     /**
	 * 	Update Bdms01RegCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RegCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RegCode,bdms01RegCode.length);
   	
   }
   
   public void setBdms01RegCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RegCode,bdms01RegCode.length);
   	
   }
   
     /**
	 * 	Update Bdms01RegCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RegCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RegCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RegCode with another Field
	 *	@param value
	 */
   public void setBdms01RegCode(Field source) {
       replace(source,0,source.length(),beginBdms01RegCode,BDMS_01_REG_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RegCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RegCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RegCode,BDMS_01_REG_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RegCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RegCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RegCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01AdpMasterSegData
	 *	@return bdms01AdpMasterSegData
	 */   
	 public Bdms01AdpMasterSegData getBdms01AdpMasterSegData() {
   	return bdms01AdpMasterSegData;
   }
   /**
	* 	Update Bdms01AdpMasterSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-ADP-MASTER-SEG-DATA
	*	@param value
	*/
   public void setBdms01AdpMasterSegData(char[] value) {
      bdms01AdpMasterSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01AdpMasterSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01AdpMasterSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01AdpMasterSegData.begin,bdms01AdpMasterSegData.length());
   }
   
     /**
	 * 	Update Bdms01AdpMasterSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AdpMasterSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01AdpMasterSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01AdpMasterSegData with another Field
	 *	@param value
	 */
   public void setBdms01AdpMasterSegData(Field source) {
   	replace(source,0,source.length(),bdms01AdpMasterSegData.begin,bdms01AdpMasterSegData.length());
   }  
   
     /**
	 * 	Update Bdms01AdpMasterSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01AdpMasterSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01AdpMasterSegData.begin,bdms01AdpMasterSegData.length());
   }
   
     /**
	 * 	Update Bdms01AdpMasterSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AdpMasterSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01AdpMasterSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01BaseSecuritySegData
	 *	@return bdms01BaseSecuritySegData
	 */   
	 public Bdms01BaseSecuritySegData getBdms01BaseSecuritySegData() {
   	return bdms01BaseSecuritySegData;
   }
   /**
	* 	Update Bdms01BaseSecuritySegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-BASE-SECURITY-SEG-DATA
	*	@param value
	*/
   public void setBdms01BaseSecuritySegData(char[] value) {
      bdms01BaseSecuritySegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01BaseSecuritySegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01BaseSecuritySegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BaseSecuritySegData.begin,bdms01BaseSecuritySegData.length());
   }
   
     /**
	 * 	Update Bdms01BaseSecuritySegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BaseSecuritySegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BaseSecuritySegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01BaseSecuritySegData with another Field
	 *	@param value
	 */
   public void setBdms01BaseSecuritySegData(Field source) {
   	replace(source,0,source.length(),bdms01BaseSecuritySegData.begin,bdms01BaseSecuritySegData.length());
   }  
   
     /**
	 * 	Update Bdms01BaseSecuritySegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01BaseSecuritySegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BaseSecuritySegData.begin,bdms01BaseSecuritySegData.length());
   }
   
     /**
	 * 	Update Bdms01BaseSecuritySegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BaseSecuritySegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BaseSecuritySegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01SecurityTypeSegData
	 *	@return bdms01SecurityTypeSegData
	 */   
	 public Bdms01SecurityTypeSegData getBdms01SecurityTypeSegData() {
   	return bdms01SecurityTypeSegData;
   }
   /**
	* 	Update Bdms01SecurityTypeSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-SECURITY-TYPE-SEG-DATA
	*	@param value
	*/
   public void setBdms01SecurityTypeSegData(char[] value) {
      bdms01SecurityTypeSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01SecurityTypeSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01SecurityTypeSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SecurityTypeSegData.begin,bdms01SecurityTypeSegData.length());
   }
   
     /**
	 * 	Update Bdms01SecurityTypeSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecurityTypeSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SecurityTypeSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01SecurityTypeSegData with another Field
	 *	@param value
	 */
   public void setBdms01SecurityTypeSegData(Field source) {
   	replace(source,0,source.length(),bdms01SecurityTypeSegData.begin,bdms01SecurityTypeSegData.length());
   }  
   
     /**
	 * 	Update Bdms01SecurityTypeSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01SecurityTypeSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SecurityTypeSegData.begin,bdms01SecurityTypeSegData.length());
   }
   
     /**
	 * 	Update Bdms01SecurityTypeSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecurityTypeSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SecurityTypeSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01PriceSegData
	 *	@return bdms01PriceSegData
	 */   
	 public Bdms01PriceSegData getBdms01PriceSegData() {
   	return bdms01PriceSegData;
   }
   /**
	* 	Update Bdms01PriceSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-PRICE-SEG-DATA
	*	@param value
	*/
   public void setBdms01PriceSegData(char[] value) {
      bdms01PriceSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01PriceSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01PriceSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01PriceSegData.begin,bdms01PriceSegData.length());
   }
   
     /**
	 * 	Update Bdms01PriceSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PriceSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01PriceSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01PriceSegData with another Field
	 *	@param value
	 */
   public void setBdms01PriceSegData(Field source) {
   	replace(source,0,source.length(),bdms01PriceSegData.begin,bdms01PriceSegData.length());
   }  
   
     /**
	 * 	Update Bdms01PriceSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01PriceSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01PriceSegData.begin,bdms01PriceSegData.length());
   }
   
     /**
	 * 	Update Bdms01PriceSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PriceSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01PriceSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01XrefSegData
	 *	@return bdms01XrefSegData
	 */   
	 public Bdms01XrefSegData getBdms01XrefSegData() {
   	return bdms01XrefSegData;
   }
   /**
	* 	Update Bdms01XrefSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-XREF-SEG-DATA
	*	@param value
	*/
   public void setBdms01XrefSegData(char[] value) {
      bdms01XrefSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01XrefSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01XrefSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01XrefSegData.begin,bdms01XrefSegData.length());
   }
   
     /**
	 * 	Update Bdms01XrefSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01XrefSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01XrefSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01XrefSegData with another Field
	 *	@param value
	 */
   public void setBdms01XrefSegData(Field source) {
   	replace(source,0,source.length(),bdms01XrefSegData.begin,bdms01XrefSegData.length());
   }  
   
     /**
	 * 	Update Bdms01XrefSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01XrefSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01XrefSegData.begin,bdms01XrefSegData.length());
   }
   
     /**
	 * 	Update Bdms01XrefSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01XrefSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01XrefSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01DescSegData
	 *	@return bdms01DescSegData
	 */   
	 public Bdms01DescSegData getBdms01DescSegData() {
   	return bdms01DescSegData;
   }
   /**
	* 	Update Bdms01DescSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-DESC-SEG-DATA
	*	@param value
	*/
   public void setBdms01DescSegData(char[] value) {
      bdms01DescSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01DescSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01DescSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01DescSegData.begin,bdms01DescSegData.length());
   }
   
     /**
	 * 	Update Bdms01DescSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DescSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01DescSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01DescSegData with another Field
	 *	@param value
	 */
   public void setBdms01DescSegData(Field source) {
   	replace(source,0,source.length(),bdms01DescSegData.begin,bdms01DescSegData.length());
   }  
   
     /**
	 * 	Update Bdms01DescSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01DescSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01DescSegData.begin,bdms01DescSegData.length());
   }
   
     /**
	 * 	Update Bdms01DescSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DescSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01DescSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01SpecialistSegData
	 *	@return bdms01SpecialistSegData
	 */   
	 public Bdms01SpecialistSegData getBdms01SpecialistSegData() {
   	return bdms01SpecialistSegData;
   }
   /**
	* 	Update Bdms01SpecialistSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-SPECIALIST-SEG-DATA
	*	@param value
	*/
   public void setBdms01SpecialistSegData(char[] value) {
      bdms01SpecialistSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01SpecialistSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01SpecialistSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SpecialistSegData.begin,bdms01SpecialistSegData.length());
   }
   
     /**
	 * 	Update Bdms01SpecialistSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SpecialistSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SpecialistSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01SpecialistSegData with another Field
	 *	@param value
	 */
   public void setBdms01SpecialistSegData(Field source) {
   	replace(source,0,source.length(),bdms01SpecialistSegData.begin,bdms01SpecialistSegData.length());
   }  
   
     /**
	 * 	Update Bdms01SpecialistSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01SpecialistSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SpecialistSegData.begin,bdms01SpecialistSegData.length());
   }
   
     /**
	 * 	Update Bdms01SpecialistSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SpecialistSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SpecialistSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01FrozenChillSegData
	 *	@return bdms01FrozenChillSegData
	 */   
	 public Bdms01FrozenChillSegData getBdms01FrozenChillSegData() {
   	return bdms01FrozenChillSegData;
   }
   /**
	* 	Update Bdms01FrozenChillSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-FROZEN-CHILL-SEG-DATA
	*	@param value
	*/
   public void setBdms01FrozenChillSegData(char[] value) {
      bdms01FrozenChillSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01FrozenChillSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01FrozenChillSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01FrozenChillSegData.begin,bdms01FrozenChillSegData.length());
   }
   
     /**
	 * 	Update Bdms01FrozenChillSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FrozenChillSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01FrozenChillSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01FrozenChillSegData with another Field
	 *	@param value
	 */
   public void setBdms01FrozenChillSegData(Field source) {
   	replace(source,0,source.length(),bdms01FrozenChillSegData.begin,bdms01FrozenChillSegData.length());
   }  
   
     /**
	 * 	Update Bdms01FrozenChillSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01FrozenChillSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01FrozenChillSegData.begin,bdms01FrozenChillSegData.length());
   }
   
     /**
	 * 	Update Bdms01FrozenChillSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FrozenChillSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01FrozenChillSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01IncomeSegData
	 *	@return bdms01IncomeSegData
	 */   
	 public Bdms01IncomeSegData getBdms01IncomeSegData() {
   	return bdms01IncomeSegData;
   }
   /**
	* 	Update Bdms01IncomeSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-INCOME-SEG-DATA
	*	@param value
	*/
   public void setBdms01IncomeSegData(char[] value) {
      bdms01IncomeSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01IncomeSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01IncomeSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01IncomeSegData.begin,bdms01IncomeSegData.length());
   }
   
     /**
	 * 	Update Bdms01IncomeSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01IncomeSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01IncomeSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01IncomeSegData with another Field
	 *	@param value
	 */
   public void setBdms01IncomeSegData(Field source) {
   	replace(source,0,source.length(),bdms01IncomeSegData.begin,bdms01IncomeSegData.length());
   }  
   
     /**
	 * 	Update Bdms01IncomeSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01IncomeSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01IncomeSegData.begin,bdms01IncomeSegData.length());
   }
   
     /**
	 * 	Update Bdms01IncomeSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01IncomeSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01IncomeSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01RatingSegData
	 *	@return bdms01RatingSegData
	 */   
	 public Bdms01RatingSegData getBdms01RatingSegData() {
   	return bdms01RatingSegData;
   }
   /**
	* 	Update Bdms01RatingSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-RATING-SEG-DATA
	*	@param value
	*/
   public void setBdms01RatingSegData(char[] value) {
      bdms01RatingSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01RatingSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01RatingSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01RatingSegData.begin,bdms01RatingSegData.length());
   }
   
     /**
	 * 	Update Bdms01RatingSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RatingSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01RatingSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01RatingSegData with another Field
	 *	@param value
	 */
   public void setBdms01RatingSegData(Field source) {
   	replace(source,0,source.length(),bdms01RatingSegData.begin,bdms01RatingSegData.length());
   }  
   
     /**
	 * 	Update Bdms01RatingSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01RatingSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01RatingSegData.begin,bdms01RatingSegData.length());
   }
   
     /**
	 * 	Update Bdms01RatingSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RatingSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01RatingSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01ConvertibleSegData
	 *	@return bdms01ConvertibleSegData
	 */   
	 public Bdms01ConvertibleSegData getBdms01ConvertibleSegData() {
   	return bdms01ConvertibleSegData;
   }
   /**
	* 	Update Bdms01ConvertibleSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-CONVERTIBLE-SEG-DATA
	*	@param value
	*/
   public void setBdms01ConvertibleSegData(char[] value) {
      bdms01ConvertibleSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01ConvertibleSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01ConvertibleSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01ConvertibleSegData.begin,bdms01ConvertibleSegData.length());
   }
   
     /**
	 * 	Update Bdms01ConvertibleSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ConvertibleSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01ConvertibleSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01ConvertibleSegData with another Field
	 *	@param value
	 */
   public void setBdms01ConvertibleSegData(Field source) {
   	replace(source,0,source.length(),bdms01ConvertibleSegData.begin,bdms01ConvertibleSegData.length());
   }  
   
     /**
	 * 	Update Bdms01ConvertibleSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01ConvertibleSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01ConvertibleSegData.begin,bdms01ConvertibleSegData.length());
   }
   
     /**
	 * 	Update Bdms01ConvertibleSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ConvertibleSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01ConvertibleSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01StockSegData
	 *	@return bdms01StockSegData
	 */   
	 public Bdms01StockSegData getBdms01StockSegData() {
   	return bdms01StockSegData;
   }
   /**
	* 	Update Bdms01StockSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-STOCK-SEG-DATA
	*	@param value
	*/
   public void setBdms01StockSegData(char[] value) {
      bdms01StockSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01StockSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01StockSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01StockSegData.begin,bdms01StockSegData.length());
   }
   
     /**
	 * 	Update Bdms01StockSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StockSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01StockSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01StockSegData with another Field
	 *	@param value
	 */
   public void setBdms01StockSegData(Field source) {
   	replace(source,0,source.length(),bdms01StockSegData.begin,bdms01StockSegData.length());
   }  
   
     /**
	 * 	Update Bdms01StockSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01StockSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01StockSegData.begin,bdms01StockSegData.length());
   }
   
     /**
	 * 	Update Bdms01StockSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StockSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01StockSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01OptionSegData
	 *	@return bdms01OptionSegData
	 */   
	 public Bdms01OptionSegData getBdms01OptionSegData() {
   	return bdms01OptionSegData;
   }
   /**
	* 	Update Bdms01OptionSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-OPTION-SEG-DATA
	*	@param value
	*/
   public void setBdms01OptionSegData(char[] value) {
      bdms01OptionSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01OptionSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01OptionSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01OptionSegData.begin,bdms01OptionSegData.length());
   }
   
     /**
	 * 	Update Bdms01OptionSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptionSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01OptionSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01OptionSegData with another Field
	 *	@param value
	 */
   public void setBdms01OptionSegData(Field source) {
   	replace(source,0,source.length(),bdms01OptionSegData.begin,bdms01OptionSegData.length());
   }  
   
     /**
	 * 	Update Bdms01OptionSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01OptionSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01OptionSegData.begin,bdms01OptionSegData.length());
   }
   
     /**
	 * 	Update Bdms01OptionSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptionSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01OptionSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01BondBasicSegData
	 *	@return bdms01BondBasicSegData
	 */   
	 public Bdms01BondBasicSegData getBdms01BondBasicSegData() {
   	return bdms01BondBasicSegData;
   }
   /**
	* 	Update Bdms01BondBasicSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-BOND-BASIC-SEG-DATA
	*	@param value
	*/
   public void setBdms01BondBasicSegData(char[] value) {
      bdms01BondBasicSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01BondBasicSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01BondBasicSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BondBasicSegData.begin,bdms01BondBasicSegData.length());
   }
   
     /**
	 * 	Update Bdms01BondBasicSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BondBasicSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BondBasicSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01BondBasicSegData with another Field
	 *	@param value
	 */
   public void setBdms01BondBasicSegData(Field source) {
   	replace(source,0,source.length(),bdms01BondBasicSegData.begin,bdms01BondBasicSegData.length());
   }  
   
     /**
	 * 	Update Bdms01BondBasicSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01BondBasicSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BondBasicSegData.begin,bdms01BondBasicSegData.length());
   }
   
     /**
	 * 	Update Bdms01BondBasicSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BondBasicSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BondBasicSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01BondFeatureSegData
	 *	@return bdms01BondFeatureSegData
	 */   
	 public Bdms01BondFeatureSegData getBdms01BondFeatureSegData() {
   	return bdms01BondFeatureSegData;
   }
   /**
	* 	Update Bdms01BondFeatureSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-BOND-FEATURE-SEG-DATA
	*	@param value
	*/
   public void setBdms01BondFeatureSegData(char[] value) {
      bdms01BondFeatureSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01BondFeatureSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01BondFeatureSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BondFeatureSegData.begin,bdms01BondFeatureSegData.length());
   }
   
     /**
	 * 	Update Bdms01BondFeatureSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BondFeatureSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BondFeatureSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01BondFeatureSegData with another Field
	 *	@param value
	 */
   public void setBdms01BondFeatureSegData(Field source) {
   	replace(source,0,source.length(),bdms01BondFeatureSegData.begin,bdms01BondFeatureSegData.length());
   }  
   
     /**
	 * 	Update Bdms01BondFeatureSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01BondFeatureSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BondFeatureSegData.begin,bdms01BondFeatureSegData.length());
   }
   
     /**
	 * 	Update Bdms01BondFeatureSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BondFeatureSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BondFeatureSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01BondFactorSegData
	 *	@return bdms01BondFactorSegData
	 */   
	 public Bdms01BondFactorSegData getBdms01BondFactorSegData() {
   	return bdms01BondFactorSegData;
   }
   /**
	* 	Update Bdms01BondFactorSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-BOND-FACTOR-SEG-DATA
	*	@param value
	*/
   public void setBdms01BondFactorSegData(char[] value) {
      bdms01BondFactorSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01BondFactorSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01BondFactorSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BondFactorSegData.begin,bdms01BondFactorSegData.length());
   }
   
     /**
	 * 	Update Bdms01BondFactorSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BondFactorSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BondFactorSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01BondFactorSegData with another Field
	 *	@param value
	 */
   public void setBdms01BondFactorSegData(Field source) {
   	replace(source,0,source.length(),bdms01BondFactorSegData.begin,bdms01BondFactorSegData.length());
   }  
   
     /**
	 * 	Update Bdms01BondFactorSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01BondFactorSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BondFactorSegData.begin,bdms01BondFactorSegData.length());
   }
   
     /**
	 * 	Update Bdms01BondFactorSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BondFactorSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BondFactorSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01BondCmoSegData
	 *	@return bdms01BondCmoSegData
	 */   
	 public Bdms01BondCmoSegData getBdms01BondCmoSegData() {
   	return bdms01BondCmoSegData;
   }
   /**
	* 	Update Bdms01BondCmoSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-BOND-CMO-SEG-DATA
	*	@param value
	*/
   public void setBdms01BondCmoSegData(char[] value) {
      bdms01BondCmoSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01BondCmoSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01BondCmoSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BondCmoSegData.begin,bdms01BondCmoSegData.length());
   }
   
     /**
	 * 	Update Bdms01BondCmoSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BondCmoSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BondCmoSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01BondCmoSegData with another Field
	 *	@param value
	 */
   public void setBdms01BondCmoSegData(Field source) {
   	replace(source,0,source.length(),bdms01BondCmoSegData.begin,bdms01BondCmoSegData.length());
   }  
   
     /**
	 * 	Update Bdms01BondCmoSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01BondCmoSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BondCmoSegData.begin,bdms01BondCmoSegData.length());
   }
   
     /**
	 * 	Update Bdms01BondCmoSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BondCmoSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BondCmoSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01OidSegData
	 *	@return bdms01OidSegData
	 */   
	 public Bdms01OidSegData getBdms01OidSegData() {
   	return bdms01OidSegData;
   }
   /**
	* 	Update Bdms01OidSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-OID-SEG-DATA
	*	@param value
	*/
   public void setBdms01OidSegData(char[] value) {
      bdms01OidSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01OidSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01OidSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01OidSegData.begin,bdms01OidSegData.length());
   }
   
     /**
	 * 	Update Bdms01OidSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OidSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01OidSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01OidSegData with another Field
	 *	@param value
	 */
   public void setBdms01OidSegData(Field source) {
   	replace(source,0,source.length(),bdms01OidSegData.begin,bdms01OidSegData.length());
   }  
   
     /**
	 * 	Update Bdms01OidSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01OidSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01OidSegData.begin,bdms01OidSegData.length());
   }
   
     /**
	 * 	Update Bdms01OidSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OidSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01OidSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01UitSegData
	 *	@return bdms01UitSegData
	 */   
	 public Bdms01UitSegData getBdms01UitSegData() {
   	return bdms01UitSegData;
   }
   /**
	* 	Update Bdms01UitSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-UIT-SEG-DATA
	*	@param value
	*/
   public void setBdms01UitSegData(char[] value) {
      bdms01UitSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01UitSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01UitSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01UitSegData.begin,bdms01UitSegData.length());
   }
   
     /**
	 * 	Update Bdms01UitSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UitSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01UitSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01UitSegData with another Field
	 *	@param value
	 */
   public void setBdms01UitSegData(Field source) {
   	replace(source,0,source.length(),bdms01UitSegData.begin,bdms01UitSegData.length());
   }  
   
     /**
	 * 	Update Bdms01UitSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01UitSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01UitSegData.begin,bdms01UitSegData.length());
   }
   
     /**
	 * 	Update Bdms01UitSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UitSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01UitSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01MortBackedSegData
	 *	@return bdms01MortBackedSegData
	 */   
	 public Bdms01MortBackedSegData getBdms01MortBackedSegData() {
   	return bdms01MortBackedSegData;
   }
   /**
	* 	Update Bdms01MortBackedSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-MORT-BACKED-SEG-DATA
	*	@param value
	*/
   public void setBdms01MortBackedSegData(char[] value) {
      bdms01MortBackedSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01MortBackedSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01MortBackedSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01MortBackedSegData.begin,bdms01MortBackedSegData.length());
   }
   
     /**
	 * 	Update Bdms01MortBackedSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MortBackedSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01MortBackedSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01MortBackedSegData with another Field
	 *	@param value
	 */
   public void setBdms01MortBackedSegData(Field source) {
   	replace(source,0,source.length(),bdms01MortBackedSegData.begin,bdms01MortBackedSegData.length());
   }  
   
     /**
	 * 	Update Bdms01MortBackedSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01MortBackedSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01MortBackedSegData.begin,bdms01MortBackedSegData.length());
   }
   
     /**
	 * 	Update Bdms01MortBackedSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MortBackedSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01MortBackedSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01GetpriceSegData
	 *	@return bdms01GetpriceSegData
	 */   
	 public Bdms01GetpriceSegData getBdms01GetpriceSegData() {
   	return bdms01GetpriceSegData;
   }
   /**
	* 	Update Bdms01GetpriceSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-GETPRICE-SEG-DATA
	*	@param value
	*/
   public void setBdms01GetpriceSegData(char[] value) {
      bdms01GetpriceSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01GetpriceSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01GetpriceSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01GetpriceSegData.begin,bdms01GetpriceSegData.length());
   }
   
     /**
	 * 	Update Bdms01GetpriceSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GetpriceSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01GetpriceSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01GetpriceSegData with another Field
	 *	@param value
	 */
   public void setBdms01GetpriceSegData(Field source) {
   	replace(source,0,source.length(),bdms01GetpriceSegData.begin,bdms01GetpriceSegData.length());
   }  
   
     /**
	 * 	Update Bdms01GetpriceSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01GetpriceSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01GetpriceSegData.begin,bdms01GetpriceSegData.length());
   }
   
     /**
	 * 	Update Bdms01GetpriceSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GetpriceSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01GetpriceSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01MultSecurityNoData
	 *	@return bdms01MultSecurityNoData
	 */   
	 public Bdms01MultSecurityNoData getBdms01MultSecurityNoData() {
   	return bdms01MultSecurityNoData;
   }
   /**
	* 	Update Bdms01MultSecurityNoData with the passed value
	*   Corresponding COBOL Variable is BDMS01-MULT-SECURITY-NO-DATA
	*	@param value
	*/
   public void setBdms01MultSecurityNoData(char[] value) {
      bdms01MultSecurityNoData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01MultSecurityNoData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01MultSecurityNoData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01MultSecurityNoData.begin,bdms01MultSecurityNoData.length());
   }
   
     /**
	 * 	Update Bdms01MultSecurityNoData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MultSecurityNoData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01MultSecurityNoData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01MultSecurityNoData with another Field
	 *	@param value
	 */
   public void setBdms01MultSecurityNoData(Field source) {
   	replace(source,0,source.length(),bdms01MultSecurityNoData.begin,bdms01MultSecurityNoData.length());
   }  
   
     /**
	 * 	Update Bdms01MultSecurityNoData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01MultSecurityNoData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01MultSecurityNoData.begin,bdms01MultSecurityNoData.length());
   }
   
     /**
	 * 	Update Bdms01MultSecurityNoData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MultSecurityNoData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01MultSecurityNoData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01DivQualifyData
	 *	@return bdms01DivQualifyData
	 */   
	 public Bdms01DivQualifyData getBdms01DivQualifyData() {
   	return bdms01DivQualifyData;
   }
   /**
	* 	Update Bdms01DivQualifyData with the passed value
	*   Corresponding COBOL Variable is BDMS01-DIV-QUALIFY-DATA
	*	@param value
	*/
   public void setBdms01DivQualifyData(char[] value) {
      bdms01DivQualifyData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01DivQualifyData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01DivQualifyData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01DivQualifyData.begin,bdms01DivQualifyData.length());
   }
   
     /**
	 * 	Update Bdms01DivQualifyData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DivQualifyData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01DivQualifyData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01DivQualifyData with another Field
	 *	@param value
	 */
   public void setBdms01DivQualifyData(Field source) {
   	replace(source,0,source.length(),bdms01DivQualifyData.begin,bdms01DivQualifyData.length());
   }  
   
     /**
	 * 	Update Bdms01DivQualifyData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01DivQualifyData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01DivQualifyData.begin,bdms01DivQualifyData.length());
   }
   
     /**
	 * 	Update Bdms01DivQualifyData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DivQualifyData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01DivQualifyData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01TaxSegData
	 *	@return bdms01TaxSegData
	 */   
	 public Bdms01TaxSegData getBdms01TaxSegData() {
   	return bdms01TaxSegData;
   }
   /**
	* 	Update Bdms01TaxSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-TAX-SEG-DATA
	*	@param value
	*/
   public void setBdms01TaxSegData(char[] value) {
      bdms01TaxSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01TaxSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01TaxSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01TaxSegData.begin,bdms01TaxSegData.length());
   }
   
     /**
	 * 	Update Bdms01TaxSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TaxSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01TaxSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01TaxSegData with another Field
	 *	@param value
	 */
   public void setBdms01TaxSegData(Field source) {
   	replace(source,0,source.length(),bdms01TaxSegData.begin,bdms01TaxSegData.length());
   }  
   
     /**
	 * 	Update Bdms01TaxSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01TaxSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01TaxSegData.begin,bdms01TaxSegData.length());
   }
   
     /**
	 * 	Update Bdms01TaxSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TaxSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01TaxSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01BondBasicExpData
	 *	@return bdms01BondBasicExpData
	 */   
	 public Bdms01BondBasicExpData getBdms01BondBasicExpData() {
   	return bdms01BondBasicExpData;
   }
   /**
	* 	Update Bdms01BondBasicExpData with the passed value
	*   Corresponding COBOL Variable is BDMS01-BOND-BASIC-EXP-DATA
	*	@param value
	*/
   public void setBdms01BondBasicExpData(char[] value) {
      bdms01BondBasicExpData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01BondBasicExpData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01BondBasicExpData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BondBasicExpData.begin,bdms01BondBasicExpData.length());
   }
   
     /**
	 * 	Update Bdms01BondBasicExpData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BondBasicExpData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BondBasicExpData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01BondBasicExpData with another Field
	 *	@param value
	 */
   public void setBdms01BondBasicExpData(Field source) {
   	replace(source,0,source.length(),bdms01BondBasicExpData.begin,bdms01BondBasicExpData.length());
   }  
   
     /**
	 * 	Update Bdms01BondBasicExpData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01BondBasicExpData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BondBasicExpData.begin,bdms01BondBasicExpData.length());
   }
   
     /**
	 * 	Update Bdms01BondBasicExpData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BondBasicExpData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BondBasicExpData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01BaseSecurityExpData
	 *	@return bdms01BaseSecurityExpData
	 */   
	 public Bdms01BaseSecurityExpData getBdms01BaseSecurityExpData() {
   	return bdms01BaseSecurityExpData;
   }
   /**
	* 	Update Bdms01BaseSecurityExpData with the passed value
	*   Corresponding COBOL Variable is BDMS01-BASE-SECURITY-EXP-DATA
	*	@param value
	*/
   public void setBdms01BaseSecurityExpData(char[] value) {
      bdms01BaseSecurityExpData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01BaseSecurityExpData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01BaseSecurityExpData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BaseSecurityExpData.begin,bdms01BaseSecurityExpData.length());
   }
   
     /**
	 * 	Update Bdms01BaseSecurityExpData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BaseSecurityExpData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BaseSecurityExpData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01BaseSecurityExpData with another Field
	 *	@param value
	 */
   public void setBdms01BaseSecurityExpData(Field source) {
   	replace(source,0,source.length(),bdms01BaseSecurityExpData.begin,bdms01BaseSecurityExpData.length());
   }  
   
     /**
	 * 	Update Bdms01BaseSecurityExpData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01BaseSecurityExpData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BaseSecurityExpData.begin,bdms01BaseSecurityExpData.length());
   }
   
     /**
	 * 	Update Bdms01BaseSecurityExpData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BaseSecurityExpData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01BaseSecurityExpData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01MultAdpNoData
	 *	@return bdms01MultAdpNoData
	 */   
	 public Bdms01MultAdpNoData getBdms01MultAdpNoData() {
   	return bdms01MultAdpNoData;
   }
   /**
	* 	Update Bdms01MultAdpNoData with the passed value
	*   Corresponding COBOL Variable is BDMS01-MULT-ADP-NO-DATA
	*	@param value
	*/
   public void setBdms01MultAdpNoData(char[] value) {
      bdms01MultAdpNoData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01MultAdpNoData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01MultAdpNoData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01MultAdpNoData.begin,bdms01MultAdpNoData.length());
   }
   
     /**
	 * 	Update Bdms01MultAdpNoData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MultAdpNoData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01MultAdpNoData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01MultAdpNoData with another Field
	 *	@param value
	 */
   public void setBdms01MultAdpNoData(Field source) {
   	replace(source,0,source.length(),bdms01MultAdpNoData.begin,bdms01MultAdpNoData.length());
   }  
   
     /**
	 * 	Update Bdms01MultAdpNoData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01MultAdpNoData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01MultAdpNoData.begin,bdms01MultAdpNoData.length());
   }
   
     /**
	 * 	Update Bdms01MultAdpNoData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MultAdpNoData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01MultAdpNoData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01UnitsSegData
	 *	@return bdms01UnitsSegData
	 */   
	 public Bdms01UnitsSegData getBdms01UnitsSegData() {
   	return bdms01UnitsSegData;
   }
   /**
	* 	Update Bdms01UnitsSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-UNITS-SEG-DATA
	*	@param value
	*/
   public void setBdms01UnitsSegData(char[] value) {
      bdms01UnitsSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01UnitsSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01UnitsSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01UnitsSegData.begin,bdms01UnitsSegData.length());
   }
   
     /**
	 * 	Update Bdms01UnitsSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UnitsSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01UnitsSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01UnitsSegData with another Field
	 *	@param value
	 */
   public void setBdms01UnitsSegData(Field source) {
   	replace(source,0,source.length(),bdms01UnitsSegData.begin,bdms01UnitsSegData.length());
   }  
   
     /**
	 * 	Update Bdms01UnitsSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01UnitsSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01UnitsSegData.begin,bdms01UnitsSegData.length());
   }
   
     /**
	 * 	Update Bdms01UnitsSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UnitsSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01UnitsSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01TcontrolSegData
	 *	@return bdms01TcontrolSegData
	 */   
	 public Bdms01TcontrolSegData getBdms01TcontrolSegData() {
   	return bdms01TcontrolSegData;
   }
   /**
	* 	Update Bdms01TcontrolSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-TCONTROL-SEG-DATA
	*	@param value
	*/
   public void setBdms01TcontrolSegData(char[] value) {
      bdms01TcontrolSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01TcontrolSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01TcontrolSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01TcontrolSegData.begin,bdms01TcontrolSegData.length());
   }
   
     /**
	 * 	Update Bdms01TcontrolSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TcontrolSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01TcontrolSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01TcontrolSegData with another Field
	 *	@param value
	 */
   public void setBdms01TcontrolSegData(Field source) {
   	replace(source,0,source.length(),bdms01TcontrolSegData.begin,bdms01TcontrolSegData.length());
   }  
   
     /**
	 * 	Update Bdms01TcontrolSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01TcontrolSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01TcontrolSegData.begin,bdms01TcontrolSegData.length());
   }
   
     /**
	 * 	Update Bdms01TcontrolSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TcontrolSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01TcontrolSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01SecurityPrivSegData
	 *	@return bdms01SecurityPrivSegData
	 */   
	 public Bdms01SecurityPrivSegData getBdms01SecurityPrivSegData() {
   	return bdms01SecurityPrivSegData;
   }
   /**
	* 	Update Bdms01SecurityPrivSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-SECURITY-PRIV-SEG-DATA
	*	@param value
	*/
   public void setBdms01SecurityPrivSegData(char[] value) {
      bdms01SecurityPrivSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01SecurityPrivSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01SecurityPrivSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SecurityPrivSegData.begin,bdms01SecurityPrivSegData.length());
   }
   
     /**
	 * 	Update Bdms01SecurityPrivSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecurityPrivSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SecurityPrivSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01SecurityPrivSegData with another Field
	 *	@param value
	 */
   public void setBdms01SecurityPrivSegData(Field source) {
   	replace(source,0,source.length(),bdms01SecurityPrivSegData.begin,bdms01SecurityPrivSegData.length());
   }  
   
     /**
	 * 	Update Bdms01SecurityPrivSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01SecurityPrivSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SecurityPrivSegData.begin,bdms01SecurityPrivSegData.length());
   }
   
     /**
	 * 	Update Bdms01SecurityPrivSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecurityPrivSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SecurityPrivSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01AdpMasterExpData
	 *	@return bdms01AdpMasterExpData
	 */   
	 public Bdms01AdpMasterExpData getBdms01AdpMasterExpData() {
   	return bdms01AdpMasterExpData;
   }
   /**
	* 	Update Bdms01AdpMasterExpData with the passed value
	*   Corresponding COBOL Variable is BDMS01-ADP-MASTER-EXP-DATA
	*	@param value
	*/
   public void setBdms01AdpMasterExpData(char[] value) {
      bdms01AdpMasterExpData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01AdpMasterExpData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01AdpMasterExpData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01AdpMasterExpData.begin,bdms01AdpMasterExpData.length());
   }
   
     /**
	 * 	Update Bdms01AdpMasterExpData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AdpMasterExpData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01AdpMasterExpData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01AdpMasterExpData with another Field
	 *	@param value
	 */
   public void setBdms01AdpMasterExpData(Field source) {
   	replace(source,0,source.length(),bdms01AdpMasterExpData.begin,bdms01AdpMasterExpData.length());
   }  
   
     /**
	 * 	Update Bdms01AdpMasterExpData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01AdpMasterExpData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01AdpMasterExpData.begin,bdms01AdpMasterExpData.length());
   }
   
     /**
	 * 	Update Bdms01AdpMasterExpData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AdpMasterExpData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01AdpMasterExpData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01CvrsnSegData
	 *	@return bdms01CvrsnSegData
	 */   
	 public Bdms01CvrsnSegData getBdms01CvrsnSegData() {
   	return bdms01CvrsnSegData;
   }
   /**
	* 	Update Bdms01CvrsnSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-CVRSN-SEG-DATA
	*	@param value
	*/
   public void setBdms01CvrsnSegData(char[] value) {
      bdms01CvrsnSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01CvrsnSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01CvrsnSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01CvrsnSegData.begin,bdms01CvrsnSegData.length());
   }
   
     /**
	 * 	Update Bdms01CvrsnSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CvrsnSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01CvrsnSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01CvrsnSegData with another Field
	 *	@param value
	 */
   public void setBdms01CvrsnSegData(Field source) {
   	replace(source,0,source.length(),bdms01CvrsnSegData.begin,bdms01CvrsnSegData.length());
   }  
   
     /**
	 * 	Update Bdms01CvrsnSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01CvrsnSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01CvrsnSegData.begin,bdms01CvrsnSegData.length());
   }
   
     /**
	 * 	Update Bdms01CvrsnSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CvrsnSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01CvrsnSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01CanadaBondSegData
	 *	@return bdms01CanadaBondSegData
	 */   
	 public Bdms01CanadaBondSegData getBdms01CanadaBondSegData() {
   	return bdms01CanadaBondSegData;
   }
   /**
	* 	Update Bdms01CanadaBondSegData with the passed value
	*   Corresponding COBOL Variable is BDMS01-CANADA-BOND-SEG-DATA
	*	@param value
	*/
   public void setBdms01CanadaBondSegData(char[] value) {
      bdms01CanadaBondSegData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01CanadaBondSegData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01CanadaBondSegData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01CanadaBondSegData.begin,bdms01CanadaBondSegData.length());
   }
   
     /**
	 * 	Update Bdms01CanadaBondSegData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CanadaBondSegData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01CanadaBondSegData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01CanadaBondSegData with another Field
	 *	@param value
	 */
   public void setBdms01CanadaBondSegData(Field source) {
   	replace(source,0,source.length(),bdms01CanadaBondSegData.begin,bdms01CanadaBondSegData.length());
   }  
   
     /**
	 * 	Update Bdms01CanadaBondSegData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01CanadaBondSegData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01CanadaBondSegData.begin,bdms01CanadaBondSegData.length());
   }
   
     /**
	 * 	Update Bdms01CanadaBondSegData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CanadaBondSegData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01CanadaBondSegData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01OptUnderlXrefData
	 *	@return bdms01OptUnderlXrefData
	 */   
	 public Bdms01OptUnderlXrefData getBdms01OptUnderlXrefData() {
   	return bdms01OptUnderlXrefData;
   }
   /**
	* 	Update Bdms01OptUnderlXrefData with the passed value
	*   Corresponding COBOL Variable is BDMS01-OPT-UNDERL-XREF-DATA
	*	@param value
	*/
   public void setBdms01OptUnderlXrefData(char[] value) {
      bdms01OptUnderlXrefData.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01OptUnderlXrefData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01OptUnderlXrefData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01OptUnderlXrefData.begin,bdms01OptUnderlXrefData.length());
   }
   
     /**
	 * 	Update Bdms01OptUnderlXrefData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptUnderlXrefData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01OptUnderlXrefData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01OptUnderlXrefData with another Field
	 *	@param value
	 */
   public void setBdms01OptUnderlXrefData(Field source) {
   	replace(source,0,source.length(),bdms01OptUnderlXrefData.begin,bdms01OptUnderlXrefData.length());
   }  
   
     /**
	 * 	Update Bdms01OptUnderlXrefData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01OptUnderlXrefData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01OptUnderlXrefData.begin,bdms01OptUnderlXrefData.length());
   }
   
     /**
	 * 	Update Bdms01OptUnderlXrefData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptUnderlXrefData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01OptUnderlXrefData.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Bdms01ReturnData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBdms01ReturnCode(CONSTANTS.SPACE_2);
                     setBdms01ReturnSqlcode(0);
          msdRecordKey.initialize();
     
         setBdms01RegCode(CONSTANTS.SPACE_2);
          bdms01AdpMasterSegData.initialize();
     
          bdms01BaseSecuritySegData.initialize();
     
          bdms01SecurityTypeSegData.initialize();
     
          bdms01PriceSegData.initialize();
     
          bdms01XrefSegData.initialize();
     
          bdms01DescSegData.initialize();
     
          bdms01SpecialistSegData.initialize();
     
          bdms01FrozenChillSegData.initialize();
     
          bdms01IncomeSegData.initialize();
     
          bdms01RatingSegData.initialize();
     
          bdms01ConvertibleSegData.initialize();
     
          bdms01StockSegData.initialize();
     
          bdms01OptionSegData.initialize();
     
          bdms01BondBasicSegData.initialize();
     
          bdms01BondFeatureSegData.initialize();
     
          bdms01BondFactorSegData.initialize();
     
          bdms01BondCmoSegData.initialize();
     
          bdms01OidSegData.initialize();
     
          bdms01UitSegData.initialize();
     
          bdms01MortBackedSegData.initialize();
     
          bdms01GetpriceSegData.initialize();
     
          bdms01MultSecurityNoData.initialize();
     
          bdms01DivQualifyData.initialize();
     
          bdms01TaxSegData.initialize();
     
          bdms01BondBasicExpData.initialize();
     
          bdms01BaseSecurityExpData.initialize();
     
          bdms01MultAdpNoData.initialize();
     
          bdms01UnitsSegData.initialize();
     
          bdms01TcontrolSegData.initialize();
     
          bdms01SecurityPrivSegData.initialize();
     
          bdms01AdpMasterExpData.initialize();
     
          bdms01CvrsnSegData.initialize();
     
          bdms01CanadaBondSegData.initialize();
     
          bdms01OptUnderlXrefData.initialize();
     
   }

		public static int getBdms01ReturnDataFieldLength() {
			return BDMS_01_RETURN_DATA_LENGTH;
		}

}
  
