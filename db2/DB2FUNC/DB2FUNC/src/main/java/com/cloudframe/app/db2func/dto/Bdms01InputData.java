package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01InputData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01InputData extends Bdms01InputDataSerialized { 
   

						private char[] bdms01Db2Function = Field.fillLowValue(1);

						private char[] bdms01SearchKeyField = Field.fillLowValue(12);
				private Bdms01SearchKeyFieldRedefined01 bdms01SearchKeyFieldRedefined01 = new Bdms01SearchKeyFieldRedefined01();
				private Bdms01SearchKeyFieldRedefined bdms01SearchKeyFieldRedefined = new Bdms01SearchKeyFieldRedefined();

						private char[] bdms01SearchKeyWiCode = Field.fillLowValue(1);

						private char[] bdms01SearchKeyType = Field.fillLowValue(2);

						private char[] bdms01AdpMasterSegInd = Field.fillLowValue(1);

						private char[] bdms01BaseSecuritySegInd = Field.fillLowValue(1);

						private char[] bdms01SecurityTypeSegInd = Field.fillLowValue(1);

						private char[] bdms01PriceSegInd = Field.fillLowValue(1);

						private char[] bdms01XrefSegInd = Field.fillLowValue(1);

						private char[] bdms01DescSegInd = Field.fillLowValue(1);

						private char[] bdms01SpecialistSegInd = Field.fillLowValue(1);

						private char[] bdms01FrozenChillSegInd = Field.fillLowValue(1);

						private char[] bdms01IncomeSegInd = Field.fillLowValue(1);

						private char[] bdms01RatingSegInd = Field.fillLowValue(1);

						private char[] bdms01ConvertibleSegInd = Field.fillLowValue(1);

						private char[] bdms01StockSegInd = Field.fillLowValue(1);

						private char[] bdms01OptionSegInd = Field.fillLowValue(1);

						private char[] bdms01BondBasicSegInd = Field.fillLowValue(1);

						private char[] bdms01BondFeatureSegInd = Field.fillLowValue(1);

						private char[] bdms01BondFactorSegInd = Field.fillLowValue(1);

						private char[] bdms01BondCmoSegInd = Field.fillLowValue(1);

						private char[] bdms01OidSegInd = Field.fillLowValue(1);

						private char[] bdms01UitSegInd = Field.fillLowValue(1);

						private char[] bdms01MortBackedSegInd = Field.fillLowValue(1);

						private char[] bdms01GetpriceSegInd = Field.fillLowValue(1);

						private char[] bdms01DivQualifyInd = Field.fillLowValue(1);

						private char[] bdms01TaxSegInd = Field.fillLowValue(1);

						private char[] bdms01UnitsSegInd = Field.fillLowValue(1);

						private char[] bdms01TcontrolSegInd = Field.fillLowValue(1);

						private char[] bdms01SecurityPrivSegInd = Field.fillLowValue(1);

						private char[] bdms01CvrsnSegInd = Field.fillLowValue(1);

						private char[] bdms01CanadaBondSegInd = Field.fillLowValue(1);

						private char[] bdms01OptUnderlXrefSegInd = Field.fillLowValue(1);


						private char[] bdms01ReqPriceRegion = Field.fillLowValue(1);
				private Bdms01OsiSymbolCont bdms01OsiSymbolCont = new Bdms01OsiSymbolCont();

						private char[] bdms01SearchKeyIsinCntry = Field.fillLowValue(2);

						private char[] bdms01LogError = Field.fillLowValue(1);

						private char[] bdms01ProgramName = Field.fillLowValue(8);
	
	/**
	* Constructor for Bdms01InputData
	**/
    public Bdms01InputData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01InputData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01InputData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			bdms01SearchKeyFieldRedefined01.setParent(this,getStartOffset() + 1);
	       			bdms01SearchKeyFieldRedefined.setParent(this,getStartOffset() + 1);
	       			bdms01OsiSymbolCont.setParent(this,getStartOffset() + 74);
    } 

	/**
	 *	Returns the value of bdms01Db2Function
	 *	@return bdms01Db2Function
	 */
   public char[] getBdms01Db2Function() throws CFException{
     if (isBdms01Db2FunctionModified()) { 
        bdms01Db2Function = refreshBdms01Db2Function();
     }
   		return bdms01Db2Function;
   }

  
	/**
	*  set variable bdms01Db2Function
	*  Corresponding COBOL Variable is BDMS01-DB2-FUNCTION
	*  @param value
	**/
   public void setBdms01Db2Function(char[] value) {
      bdms01Db2Function = checkBdms01Db2FunctionConstraints(value);
      serializeBdms01Db2Function(bdms01Db2Function);
   } 

     /**
	 * 	Update Bdms01Db2Function 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Db2Function(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Db2Function,bdms01Db2Function.length);
   	
   }
   
   public void setBdms01Db2Function(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Db2Function,bdms01Db2Function.length);
   	
   }
   
     /**
	 * 	Update Bdms01Db2Function 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Db2Function(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Db2Function+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Db2Function with another Field
	 *	@param value
	 */
   public void setBdms01Db2Function(Field source) {
       replace(source,0,source.length(),beginBdms01Db2Function,BDMS_01_DB_2_FUNCTION_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Db2Function 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Db2Function(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Db2Function,BDMS_01_DB_2_FUNCTION_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Db2Function 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Db2Function(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Db2Function+targetIndex,targetLen);
    
   }
	char[] bdms01FunctionDisconnect88Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isBdms01FunctionDisconnect()
	 *	@return  Returns true if isBdms01FunctionDisconnect() is "D"
	 */
   public boolean isBdms01FunctionDisconnect() throws CFException {
      return (  compareChars( getBdms01Db2Function() , bdms01FunctionDisconnect88Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setBdms01FunctionDisconnectTrue() {  			
    	setBdms01Db2Function( bdms01FunctionDisconnect88Value);
   	}
	char[] bdms01FunctionConnect88Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isBdms01FunctionConnect()
	 *	@return  Returns true if isBdms01FunctionConnect() is "C"
	 */
   public boolean isBdms01FunctionConnect() throws CFException {
      return (  compareChars( getBdms01Db2Function() , bdms01FunctionConnect88Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setBdms01FunctionConnectTrue() {  			
    	setBdms01Db2Function( bdms01FunctionConnect88Value);
   	}
	char[] bdms01NoDb2Connect88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isBdms01NoDb2Connect()
	 *	@return  Returns true if isBdms01NoDb2Connect() is "N"
	 */
   public boolean isBdms01NoDb2Connect() throws CFException {
      return (  compareChars( getBdms01Db2Function() , bdms01NoDb2Connect88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setBdms01NoDb2ConnectTrue() {  			
    	setBdms01Db2Function( bdms01NoDb2Connect88Value);
   	}
	/**
	 *	Returns the value of bdms01SearchKeyField
	 *	@return bdms01SearchKeyField
	 */
   public char[] getBdms01SearchKeyField() throws CFException{
     if (isBdms01SearchKeyFieldModified()) { 
        bdms01SearchKeyField = refreshBdms01SearchKeyField();
     }
   		return bdms01SearchKeyField;
   }

  
	/**
	*  set variable bdms01SearchKeyField
	*  Corresponding COBOL Variable is BDMS01-SEARCH-KEY-FIELD
	*  @param value
	**/
   public void setBdms01SearchKeyField(char[] value) {
      bdms01SearchKeyField = checkBdms01SearchKeyFieldConstraints(value);
      serializeBdms01SearchKeyField(bdms01SearchKeyField);
   } 

     /**
	 * 	Update Bdms01SearchKeyField 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SearchKeyField(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SearchKeyField,bdms01SearchKeyField.length);
   	
   }
   
   public void setBdms01SearchKeyField(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchKeyField,bdms01SearchKeyField.length);
   	
   }
   
     /**
	 * 	Update Bdms01SearchKeyField 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchKeyField(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchKeyField+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SearchKeyField with another Field
	 *	@param value
	 */
   public void setBdms01SearchKeyField(Field source) {
       replace(source,0,source.length(),beginBdms01SearchKeyField,BDMS_01_SEARCH_KEY_FIELD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SearchKeyField 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SearchKeyField(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SearchKeyField,BDMS_01_SEARCH_KEY_FIELD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SearchKeyField 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchKeyField(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchKeyField+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SearchKeyFieldRedefined01
	 *	@return bdms01SearchKeyFieldRedefined01
	 */   
	 public Bdms01SearchKeyFieldRedefined01 getBdms01SearchKeyFieldRedefined01() {
   	return bdms01SearchKeyFieldRedefined01;
   }
   /**
	* 	Update Bdms01SearchKeyFieldRedefined01 with the passed value
	*   Corresponding COBOL Variable is BDMS01-SEARCH-KEY-FIELD-REDEFINED
	*	@param value
	*/
   public void setBdms01SearchKeyFieldRedefined01(char[] value) {
      bdms01SearchKeyFieldRedefined01.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01SearchKeyFieldRedefined01 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01SearchKeyFieldRedefined01(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SearchKeyFieldRedefined01.begin,bdms01SearchKeyFieldRedefined01.length());
   }
   
     /**
	 * 	Update Bdms01SearchKeyFieldRedefined01 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchKeyFieldRedefined01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SearchKeyFieldRedefined01.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01SearchKeyFieldRedefined01 with another Field
	 *	@param value
	 */
   public void setBdms01SearchKeyFieldRedefined01(Field source) {
   	replace(source,0,source.length(),bdms01SearchKeyFieldRedefined01.begin,bdms01SearchKeyFieldRedefined01.length());
   }  
   
     /**
	 * 	Update Bdms01SearchKeyFieldRedefined01 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01SearchKeyFieldRedefined01(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SearchKeyFieldRedefined01.begin,bdms01SearchKeyFieldRedefined01.length());
   }
   
     /**
	 * 	Update Bdms01SearchKeyFieldRedefined01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchKeyFieldRedefined01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SearchKeyFieldRedefined01.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01SearchKeyFieldRedefined
	 *	@return bdms01SearchKeyFieldRedefined
	 */   
	 public Bdms01SearchKeyFieldRedefined getBdms01SearchKeyFieldRedefined() {
   	return bdms01SearchKeyFieldRedefined;
   }
   /**
	* 	Update Bdms01SearchKeyFieldRedefined with the passed value
	*   Corresponding COBOL Variable is BDMS01-SEARCH-KEY-FIELD-REDEFINED
	*	@param value
	*/
   public void setBdms01SearchKeyFieldRedefined(char[] value) {
      bdms01SearchKeyFieldRedefined.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01SearchKeyFieldRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01SearchKeyFieldRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SearchKeyFieldRedefined.begin,bdms01SearchKeyFieldRedefined.length());
   }
   
     /**
	 * 	Update Bdms01SearchKeyFieldRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchKeyFieldRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SearchKeyFieldRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01SearchKeyFieldRedefined with another Field
	 *	@param value
	 */
   public void setBdms01SearchKeyFieldRedefined(Field source) {
   	replace(source,0,source.length(),bdms01SearchKeyFieldRedefined.begin,bdms01SearchKeyFieldRedefined.length());
   }  
   
     /**
	 * 	Update Bdms01SearchKeyFieldRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01SearchKeyFieldRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SearchKeyFieldRedefined.begin,bdms01SearchKeyFieldRedefined.length());
   }
   
     /**
	 * 	Update Bdms01SearchKeyFieldRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchKeyFieldRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01SearchKeyFieldRedefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01SearchKeyWiCode
	 *	@return bdms01SearchKeyWiCode
	 */
   public char[] getBdms01SearchKeyWiCode() throws CFException{
     if (isBdms01SearchKeyWiCodeModified()) { 
        bdms01SearchKeyWiCode = refreshBdms01SearchKeyWiCode();
     }
   		return bdms01SearchKeyWiCode;
   }

  
	/**
	*  set variable bdms01SearchKeyWiCode
	*  Corresponding COBOL Variable is BDMS01-SEARCH-KEY-WI-CODE
	*  @param value
	**/
   public void setBdms01SearchKeyWiCode(char[] value) {
      bdms01SearchKeyWiCode = checkBdms01SearchKeyWiCodeConstraints(value);
      serializeBdms01SearchKeyWiCode(bdms01SearchKeyWiCode);
   } 

     /**
	 * 	Update Bdms01SearchKeyWiCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SearchKeyWiCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SearchKeyWiCode,bdms01SearchKeyWiCode.length);
   	
   }
   
   public void setBdms01SearchKeyWiCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchKeyWiCode,bdms01SearchKeyWiCode.length);
   	
   }
   
     /**
	 * 	Update Bdms01SearchKeyWiCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchKeyWiCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchKeyWiCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SearchKeyWiCode with another Field
	 *	@param value
	 */
   public void setBdms01SearchKeyWiCode(Field source) {
       replace(source,0,source.length(),beginBdms01SearchKeyWiCode,BDMS_01_SEARCH_KEY_WI_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SearchKeyWiCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SearchKeyWiCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SearchKeyWiCode,BDMS_01_SEARCH_KEY_WI_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SearchKeyWiCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchKeyWiCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchKeyWiCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SearchKeyType
	 *	@return bdms01SearchKeyType
	 */
   public char[] getBdms01SearchKeyType() throws CFException{
     if (isBdms01SearchKeyTypeModified()) { 
        bdms01SearchKeyType = refreshBdms01SearchKeyType();
     }
   		return bdms01SearchKeyType;
   }

  
	/**
	*  set variable bdms01SearchKeyType
	*  Corresponding COBOL Variable is BDMS01-SEARCH-KEY-TYPE
	*  @param value
	**/
   public void setBdms01SearchKeyType(char[] value) {
      bdms01SearchKeyType = checkBdms01SearchKeyTypeConstraints(value);
      serializeBdms01SearchKeyType(bdms01SearchKeyType);
   } 

     /**
	 * 	Update Bdms01SearchKeyType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SearchKeyType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SearchKeyType,bdms01SearchKeyType.length);
   	
   }
   
   public void setBdms01SearchKeyType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchKeyType,bdms01SearchKeyType.length);
   	
   }
   
     /**
	 * 	Update Bdms01SearchKeyType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchKeyType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchKeyType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SearchKeyType with another Field
	 *	@param value
	 */
   public void setBdms01SearchKeyType(Field source) {
       replace(source,0,source.length(),beginBdms01SearchKeyType,BDMS_01_SEARCH_KEY_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SearchKeyType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SearchKeyType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SearchKeyType,BDMS_01_SEARCH_KEY_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SearchKeyType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchKeyType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchKeyType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01AdpMasterSegInd
	 *	@return bdms01AdpMasterSegInd
	 */
   public char[] getBdms01AdpMasterSegInd() throws CFException{
     if (isBdms01AdpMasterSegIndModified()) { 
        bdms01AdpMasterSegInd = refreshBdms01AdpMasterSegInd();
     }
   		return bdms01AdpMasterSegInd;
   }

  
	/**
	*  set variable bdms01AdpMasterSegInd
	*  Corresponding COBOL Variable is BDMS01-ADP-MASTER-SEG-IND
	*  @param value
	**/
   public void setBdms01AdpMasterSegInd(char[] value) {
      bdms01AdpMasterSegInd = checkBdms01AdpMasterSegIndConstraints(value);
      serializeBdms01AdpMasterSegInd(bdms01AdpMasterSegInd);
   } 

     /**
	 * 	Update Bdms01AdpMasterSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01AdpMasterSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01AdpMasterSegInd,bdms01AdpMasterSegInd.length);
   	
   }
   
   public void setBdms01AdpMasterSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AdpMasterSegInd,bdms01AdpMasterSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01AdpMasterSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AdpMasterSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AdpMasterSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01AdpMasterSegInd with another Field
	 *	@param value
	 */
   public void setBdms01AdpMasterSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01AdpMasterSegInd,BDMS_01_ADP_MASTER_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01AdpMasterSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01AdpMasterSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01AdpMasterSegInd,BDMS_01_ADP_MASTER_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01AdpMasterSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AdpMasterSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AdpMasterSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01BaseSecuritySegInd
	 *	@return bdms01BaseSecuritySegInd
	 */
   public char[] getBdms01BaseSecuritySegInd() throws CFException{
     if (isBdms01BaseSecuritySegIndModified()) { 
        bdms01BaseSecuritySegInd = refreshBdms01BaseSecuritySegInd();
     }
   		return bdms01BaseSecuritySegInd;
   }

  
	/**
	*  set variable bdms01BaseSecuritySegInd
	*  Corresponding COBOL Variable is BDMS01-BASE-SECURITY-SEG-IND
	*  @param value
	**/
   public void setBdms01BaseSecuritySegInd(char[] value) {
      bdms01BaseSecuritySegInd = checkBdms01BaseSecuritySegIndConstraints(value);
      serializeBdms01BaseSecuritySegInd(bdms01BaseSecuritySegInd);
   } 

     /**
	 * 	Update Bdms01BaseSecuritySegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01BaseSecuritySegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01BaseSecuritySegInd,bdms01BaseSecuritySegInd.length);
   	
   }
   
   public void setBdms01BaseSecuritySegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BaseSecuritySegInd,bdms01BaseSecuritySegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01BaseSecuritySegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BaseSecuritySegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BaseSecuritySegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01BaseSecuritySegInd with another Field
	 *	@param value
	 */
   public void setBdms01BaseSecuritySegInd(Field source) {
       replace(source,0,source.length(),beginBdms01BaseSecuritySegInd,BDMS_01_BASE_SECURITY_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01BaseSecuritySegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01BaseSecuritySegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01BaseSecuritySegInd,BDMS_01_BASE_SECURITY_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01BaseSecuritySegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BaseSecuritySegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BaseSecuritySegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SecurityTypeSegInd
	 *	@return bdms01SecurityTypeSegInd
	 */
   public char[] getBdms01SecurityTypeSegInd() throws CFException{
     if (isBdms01SecurityTypeSegIndModified()) { 
        bdms01SecurityTypeSegInd = refreshBdms01SecurityTypeSegInd();
     }
   		return bdms01SecurityTypeSegInd;
   }

  
	/**
	*  set variable bdms01SecurityTypeSegInd
	*  Corresponding COBOL Variable is BDMS01-SECURITY-TYPE-SEG-IND
	*  @param value
	**/
   public void setBdms01SecurityTypeSegInd(char[] value) {
      bdms01SecurityTypeSegInd = checkBdms01SecurityTypeSegIndConstraints(value);
      serializeBdms01SecurityTypeSegInd(bdms01SecurityTypeSegInd);
   } 

     /**
	 * 	Update Bdms01SecurityTypeSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SecurityTypeSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SecurityTypeSegInd,bdms01SecurityTypeSegInd.length);
   	
   }
   
   public void setBdms01SecurityTypeSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecurityTypeSegInd,bdms01SecurityTypeSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SecurityTypeSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecurityTypeSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecurityTypeSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SecurityTypeSegInd with another Field
	 *	@param value
	 */
   public void setBdms01SecurityTypeSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01SecurityTypeSegInd,BDMS_01_SECURITY_TYPE_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SecurityTypeSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SecurityTypeSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SecurityTypeSegInd,BDMS_01_SECURITY_TYPE_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SecurityTypeSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecurityTypeSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecurityTypeSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PriceSegInd
	 *	@return bdms01PriceSegInd
	 */
   public char[] getBdms01PriceSegInd() throws CFException{
     if (isBdms01PriceSegIndModified()) { 
        bdms01PriceSegInd = refreshBdms01PriceSegInd();
     }
   		return bdms01PriceSegInd;
   }

  
	/**
	*  set variable bdms01PriceSegInd
	*  Corresponding COBOL Variable is BDMS01-PRICE-SEG-IND
	*  @param value
	**/
   public void setBdms01PriceSegInd(char[] value) {
      bdms01PriceSegInd = checkBdms01PriceSegIndConstraints(value);
      serializeBdms01PriceSegInd(bdms01PriceSegInd);
   } 

     /**
	 * 	Update Bdms01PriceSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PriceSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PriceSegInd,bdms01PriceSegInd.length);
   	
   }
   
   public void setBdms01PriceSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PriceSegInd,bdms01PriceSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PriceSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PriceSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PriceSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PriceSegInd with another Field
	 *	@param value
	 */
   public void setBdms01PriceSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01PriceSegInd,BDMS_01_PRICE_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PriceSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PriceSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PriceSegInd,BDMS_01_PRICE_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PriceSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PriceSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PriceSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01XrefSegInd
	 *	@return bdms01XrefSegInd
	 */
   public char[] getBdms01XrefSegInd() throws CFException{
     if (isBdms01XrefSegIndModified()) { 
        bdms01XrefSegInd = refreshBdms01XrefSegInd();
     }
   		return bdms01XrefSegInd;
   }

  
	/**
	*  set variable bdms01XrefSegInd
	*  Corresponding COBOL Variable is BDMS01-XREF-SEG-IND
	*  @param value
	**/
   public void setBdms01XrefSegInd(char[] value) {
      bdms01XrefSegInd = checkBdms01XrefSegIndConstraints(value);
      serializeBdms01XrefSegInd(bdms01XrefSegInd);
   } 

     /**
	 * 	Update Bdms01XrefSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01XrefSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01XrefSegInd,bdms01XrefSegInd.length);
   	
   }
   
   public void setBdms01XrefSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01XrefSegInd,bdms01XrefSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01XrefSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01XrefSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01XrefSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01XrefSegInd with another Field
	 *	@param value
	 */
   public void setBdms01XrefSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01XrefSegInd,BDMS_01_XREF_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01XrefSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01XrefSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01XrefSegInd,BDMS_01_XREF_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01XrefSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01XrefSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01XrefSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01DescSegInd
	 *	@return bdms01DescSegInd
	 */
   public char[] getBdms01DescSegInd() throws CFException{
     if (isBdms01DescSegIndModified()) { 
        bdms01DescSegInd = refreshBdms01DescSegInd();
     }
   		return bdms01DescSegInd;
   }

  
	/**
	*  set variable bdms01DescSegInd
	*  Corresponding COBOL Variable is BDMS01-DESC-SEG-IND
	*  @param value
	**/
   public void setBdms01DescSegInd(char[] value) {
      bdms01DescSegInd = checkBdms01DescSegIndConstraints(value);
      serializeBdms01DescSegInd(bdms01DescSegInd);
   } 

     /**
	 * 	Update Bdms01DescSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01DescSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01DescSegInd,bdms01DescSegInd.length);
   	
   }
   
   public void setBdms01DescSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DescSegInd,bdms01DescSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01DescSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DescSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DescSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01DescSegInd with another Field
	 *	@param value
	 */
   public void setBdms01DescSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01DescSegInd,BDMS_01_DESC_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01DescSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01DescSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01DescSegInd,BDMS_01_DESC_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01DescSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DescSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DescSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SpecialistSegInd
	 *	@return bdms01SpecialistSegInd
	 */
   public char[] getBdms01SpecialistSegInd() throws CFException{
     if (isBdms01SpecialistSegIndModified()) { 
        bdms01SpecialistSegInd = refreshBdms01SpecialistSegInd();
     }
   		return bdms01SpecialistSegInd;
   }

  
	/**
	*  set variable bdms01SpecialistSegInd
	*  Corresponding COBOL Variable is BDMS01-SPECIALIST-SEG-IND
	*  @param value
	**/
   public void setBdms01SpecialistSegInd(char[] value) {
      bdms01SpecialistSegInd = checkBdms01SpecialistSegIndConstraints(value);
      serializeBdms01SpecialistSegInd(bdms01SpecialistSegInd);
   } 

     /**
	 * 	Update Bdms01SpecialistSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SpecialistSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SpecialistSegInd,bdms01SpecialistSegInd.length);
   	
   }
   
   public void setBdms01SpecialistSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SpecialistSegInd,bdms01SpecialistSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SpecialistSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SpecialistSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SpecialistSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SpecialistSegInd with another Field
	 *	@param value
	 */
   public void setBdms01SpecialistSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01SpecialistSegInd,BDMS_01_SPECIALIST_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SpecialistSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SpecialistSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SpecialistSegInd,BDMS_01_SPECIALIST_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SpecialistSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SpecialistSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SpecialistSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01FrozenChillSegInd
	 *	@return bdms01FrozenChillSegInd
	 */
   public char[] getBdms01FrozenChillSegInd() throws CFException{
     if (isBdms01FrozenChillSegIndModified()) { 
        bdms01FrozenChillSegInd = refreshBdms01FrozenChillSegInd();
     }
   		return bdms01FrozenChillSegInd;
   }

  
	/**
	*  set variable bdms01FrozenChillSegInd
	*  Corresponding COBOL Variable is BDMS01-FROZEN-CHILL-SEG-IND
	*  @param value
	**/
   public void setBdms01FrozenChillSegInd(char[] value) {
      bdms01FrozenChillSegInd = checkBdms01FrozenChillSegIndConstraints(value);
      serializeBdms01FrozenChillSegInd(bdms01FrozenChillSegInd);
   } 

     /**
	 * 	Update Bdms01FrozenChillSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01FrozenChillSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01FrozenChillSegInd,bdms01FrozenChillSegInd.length);
   	
   }
   
   public void setBdms01FrozenChillSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FrozenChillSegInd,bdms01FrozenChillSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01FrozenChillSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FrozenChillSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FrozenChillSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01FrozenChillSegInd with another Field
	 *	@param value
	 */
   public void setBdms01FrozenChillSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01FrozenChillSegInd,BDMS_01_FROZEN_CHILL_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01FrozenChillSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01FrozenChillSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01FrozenChillSegInd,BDMS_01_FROZEN_CHILL_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01FrozenChillSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FrozenChillSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FrozenChillSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01IncomeSegInd
	 *	@return bdms01IncomeSegInd
	 */
   public char[] getBdms01IncomeSegInd() throws CFException{
     if (isBdms01IncomeSegIndModified()) { 
        bdms01IncomeSegInd = refreshBdms01IncomeSegInd();
     }
   		return bdms01IncomeSegInd;
   }

  
	/**
	*  set variable bdms01IncomeSegInd
	*  Corresponding COBOL Variable is BDMS01-INCOME-SEG-IND
	*  @param value
	**/
   public void setBdms01IncomeSegInd(char[] value) {
      bdms01IncomeSegInd = checkBdms01IncomeSegIndConstraints(value);
      serializeBdms01IncomeSegInd(bdms01IncomeSegInd);
   } 

     /**
	 * 	Update Bdms01IncomeSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01IncomeSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01IncomeSegInd,bdms01IncomeSegInd.length);
   	
   }
   
   public void setBdms01IncomeSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IncomeSegInd,bdms01IncomeSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01IncomeSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01IncomeSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IncomeSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01IncomeSegInd with another Field
	 *	@param value
	 */
   public void setBdms01IncomeSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01IncomeSegInd,BDMS_01_INCOME_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01IncomeSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01IncomeSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01IncomeSegInd,BDMS_01_INCOME_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01IncomeSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01IncomeSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IncomeSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RatingSegInd
	 *	@return bdms01RatingSegInd
	 */
   public char[] getBdms01RatingSegInd() throws CFException{
     if (isBdms01RatingSegIndModified()) { 
        bdms01RatingSegInd = refreshBdms01RatingSegInd();
     }
   		return bdms01RatingSegInd;
   }

  
	/**
	*  set variable bdms01RatingSegInd
	*  Corresponding COBOL Variable is BDMS01-RATING-SEG-IND
	*  @param value
	**/
   public void setBdms01RatingSegInd(char[] value) {
      bdms01RatingSegInd = checkBdms01RatingSegIndConstraints(value);
      serializeBdms01RatingSegInd(bdms01RatingSegInd);
   } 

     /**
	 * 	Update Bdms01RatingSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RatingSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RatingSegInd,bdms01RatingSegInd.length);
   	
   }
   
   public void setBdms01RatingSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RatingSegInd,bdms01RatingSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01RatingSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RatingSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RatingSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RatingSegInd with another Field
	 *	@param value
	 */
   public void setBdms01RatingSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01RatingSegInd,BDMS_01_RATING_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RatingSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RatingSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RatingSegInd,BDMS_01_RATING_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RatingSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RatingSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RatingSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ConvertibleSegInd
	 *	@return bdms01ConvertibleSegInd
	 */
   public char[] getBdms01ConvertibleSegInd() throws CFException{
     if (isBdms01ConvertibleSegIndModified()) { 
        bdms01ConvertibleSegInd = refreshBdms01ConvertibleSegInd();
     }
   		return bdms01ConvertibleSegInd;
   }

  
	/**
	*  set variable bdms01ConvertibleSegInd
	*  Corresponding COBOL Variable is BDMS01-CONVERTIBLE-SEG-IND
	*  @param value
	**/
   public void setBdms01ConvertibleSegInd(char[] value) {
      bdms01ConvertibleSegInd = checkBdms01ConvertibleSegIndConstraints(value);
      serializeBdms01ConvertibleSegInd(bdms01ConvertibleSegInd);
   } 

     /**
	 * 	Update Bdms01ConvertibleSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ConvertibleSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ConvertibleSegInd,bdms01ConvertibleSegInd.length);
   	
   }
   
   public void setBdms01ConvertibleSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ConvertibleSegInd,bdms01ConvertibleSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01ConvertibleSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ConvertibleSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ConvertibleSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ConvertibleSegInd with another Field
	 *	@param value
	 */
   public void setBdms01ConvertibleSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01ConvertibleSegInd,BDMS_01_CONVERTIBLE_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ConvertibleSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ConvertibleSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ConvertibleSegInd,BDMS_01_CONVERTIBLE_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ConvertibleSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ConvertibleSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ConvertibleSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01StockSegInd
	 *	@return bdms01StockSegInd
	 */
   public char[] getBdms01StockSegInd() throws CFException{
     if (isBdms01StockSegIndModified()) { 
        bdms01StockSegInd = refreshBdms01StockSegInd();
     }
   		return bdms01StockSegInd;
   }

  
	/**
	*  set variable bdms01StockSegInd
	*  Corresponding COBOL Variable is BDMS01-STOCK-SEG-IND
	*  @param value
	**/
   public void setBdms01StockSegInd(char[] value) {
      bdms01StockSegInd = checkBdms01StockSegIndConstraints(value);
      serializeBdms01StockSegInd(bdms01StockSegInd);
   } 

     /**
	 * 	Update Bdms01StockSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01StockSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01StockSegInd,bdms01StockSegInd.length);
   	
   }
   
   public void setBdms01StockSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockSegInd,bdms01StockSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01StockSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StockSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01StockSegInd with another Field
	 *	@param value
	 */
   public void setBdms01StockSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01StockSegInd,BDMS_01_STOCK_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01StockSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01StockSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01StockSegInd,BDMS_01_STOCK_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01StockSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StockSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StockSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01OptionSegInd
	 *	@return bdms01OptionSegInd
	 */
   public char[] getBdms01OptionSegInd() throws CFException{
     if (isBdms01OptionSegIndModified()) { 
        bdms01OptionSegInd = refreshBdms01OptionSegInd();
     }
   		return bdms01OptionSegInd;
   }

  
	/**
	*  set variable bdms01OptionSegInd
	*  Corresponding COBOL Variable is BDMS01-OPTION-SEG-IND
	*  @param value
	**/
   public void setBdms01OptionSegInd(char[] value) {
      bdms01OptionSegInd = checkBdms01OptionSegIndConstraints(value);
      serializeBdms01OptionSegInd(bdms01OptionSegInd);
   } 

     /**
	 * 	Update Bdms01OptionSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OptionSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OptionSegInd,bdms01OptionSegInd.length);
   	
   }
   
   public void setBdms01OptionSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptionSegInd,bdms01OptionSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01OptionSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptionSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptionSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OptionSegInd with another Field
	 *	@param value
	 */
   public void setBdms01OptionSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01OptionSegInd,BDMS_01_OPTION_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OptionSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OptionSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OptionSegInd,BDMS_01_OPTION_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OptionSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptionSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptionSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01BondBasicSegInd
	 *	@return bdms01BondBasicSegInd
	 */
   public char[] getBdms01BondBasicSegInd() throws CFException{
     if (isBdms01BondBasicSegIndModified()) { 
        bdms01BondBasicSegInd = refreshBdms01BondBasicSegInd();
     }
   		return bdms01BondBasicSegInd;
   }

  
	/**
	*  set variable bdms01BondBasicSegInd
	*  Corresponding COBOL Variable is BDMS01-BOND-BASIC-SEG-IND
	*  @param value
	**/
   public void setBdms01BondBasicSegInd(char[] value) {
      bdms01BondBasicSegInd = checkBdms01BondBasicSegIndConstraints(value);
      serializeBdms01BondBasicSegInd(bdms01BondBasicSegInd);
   } 

     /**
	 * 	Update Bdms01BondBasicSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01BondBasicSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01BondBasicSegInd,bdms01BondBasicSegInd.length);
   	
   }
   
   public void setBdms01BondBasicSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BondBasicSegInd,bdms01BondBasicSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01BondBasicSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BondBasicSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BondBasicSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01BondBasicSegInd with another Field
	 *	@param value
	 */
   public void setBdms01BondBasicSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01BondBasicSegInd,BDMS_01_BOND_BASIC_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01BondBasicSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01BondBasicSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01BondBasicSegInd,BDMS_01_BOND_BASIC_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01BondBasicSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BondBasicSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BondBasicSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01BondFeatureSegInd
	 *	@return bdms01BondFeatureSegInd
	 */
   public char[] getBdms01BondFeatureSegInd() throws CFException{
     if (isBdms01BondFeatureSegIndModified()) { 
        bdms01BondFeatureSegInd = refreshBdms01BondFeatureSegInd();
     }
   		return bdms01BondFeatureSegInd;
   }

  
	/**
	*  set variable bdms01BondFeatureSegInd
	*  Corresponding COBOL Variable is BDMS01-BOND-FEATURE-SEG-IND
	*  @param value
	**/
   public void setBdms01BondFeatureSegInd(char[] value) {
      bdms01BondFeatureSegInd = checkBdms01BondFeatureSegIndConstraints(value);
      serializeBdms01BondFeatureSegInd(bdms01BondFeatureSegInd);
   } 

     /**
	 * 	Update Bdms01BondFeatureSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01BondFeatureSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01BondFeatureSegInd,bdms01BondFeatureSegInd.length);
   	
   }
   
   public void setBdms01BondFeatureSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BondFeatureSegInd,bdms01BondFeatureSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01BondFeatureSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BondFeatureSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BondFeatureSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01BondFeatureSegInd with another Field
	 *	@param value
	 */
   public void setBdms01BondFeatureSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01BondFeatureSegInd,BDMS_01_BOND_FEATURE_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01BondFeatureSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01BondFeatureSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01BondFeatureSegInd,BDMS_01_BOND_FEATURE_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01BondFeatureSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BondFeatureSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BondFeatureSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01BondFactorSegInd
	 *	@return bdms01BondFactorSegInd
	 */
   public char[] getBdms01BondFactorSegInd() throws CFException{
     if (isBdms01BondFactorSegIndModified()) { 
        bdms01BondFactorSegInd = refreshBdms01BondFactorSegInd();
     }
   		return bdms01BondFactorSegInd;
   }

  
	/**
	*  set variable bdms01BondFactorSegInd
	*  Corresponding COBOL Variable is BDMS01-BOND-FACTOR-SEG-IND
	*  @param value
	**/
   public void setBdms01BondFactorSegInd(char[] value) {
      bdms01BondFactorSegInd = checkBdms01BondFactorSegIndConstraints(value);
      serializeBdms01BondFactorSegInd(bdms01BondFactorSegInd);
   } 

     /**
	 * 	Update Bdms01BondFactorSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01BondFactorSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01BondFactorSegInd,bdms01BondFactorSegInd.length);
   	
   }
   
   public void setBdms01BondFactorSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BondFactorSegInd,bdms01BondFactorSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01BondFactorSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BondFactorSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BondFactorSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01BondFactorSegInd with another Field
	 *	@param value
	 */
   public void setBdms01BondFactorSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01BondFactorSegInd,BDMS_01_BOND_FACTOR_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01BondFactorSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01BondFactorSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01BondFactorSegInd,BDMS_01_BOND_FACTOR_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01BondFactorSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BondFactorSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BondFactorSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01BondCmoSegInd
	 *	@return bdms01BondCmoSegInd
	 */
   public char[] getBdms01BondCmoSegInd() throws CFException{
     if (isBdms01BondCmoSegIndModified()) { 
        bdms01BondCmoSegInd = refreshBdms01BondCmoSegInd();
     }
   		return bdms01BondCmoSegInd;
   }

  
	/**
	*  set variable bdms01BondCmoSegInd
	*  Corresponding COBOL Variable is BDMS01-BOND-CMO-SEG-IND
	*  @param value
	**/
   public void setBdms01BondCmoSegInd(char[] value) {
      bdms01BondCmoSegInd = checkBdms01BondCmoSegIndConstraints(value);
      serializeBdms01BondCmoSegInd(bdms01BondCmoSegInd);
   } 

     /**
	 * 	Update Bdms01BondCmoSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01BondCmoSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01BondCmoSegInd,bdms01BondCmoSegInd.length);
   	
   }
   
   public void setBdms01BondCmoSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BondCmoSegInd,bdms01BondCmoSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01BondCmoSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BondCmoSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BondCmoSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01BondCmoSegInd with another Field
	 *	@param value
	 */
   public void setBdms01BondCmoSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01BondCmoSegInd,BDMS_01_BOND_CMO_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01BondCmoSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01BondCmoSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01BondCmoSegInd,BDMS_01_BOND_CMO_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01BondCmoSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BondCmoSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BondCmoSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01OidSegInd
	 *	@return bdms01OidSegInd
	 */
   public char[] getBdms01OidSegInd() throws CFException{
     if (isBdms01OidSegIndModified()) { 
        bdms01OidSegInd = refreshBdms01OidSegInd();
     }
   		return bdms01OidSegInd;
   }

  
	/**
	*  set variable bdms01OidSegInd
	*  Corresponding COBOL Variable is BDMS01-OID-SEG-IND
	*  @param value
	**/
   public void setBdms01OidSegInd(char[] value) {
      bdms01OidSegInd = checkBdms01OidSegIndConstraints(value);
      serializeBdms01OidSegInd(bdms01OidSegInd);
   } 

     /**
	 * 	Update Bdms01OidSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OidSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OidSegInd,bdms01OidSegInd.length);
   	
   }
   
   public void setBdms01OidSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OidSegInd,bdms01OidSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01OidSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OidSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OidSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OidSegInd with another Field
	 *	@param value
	 */
   public void setBdms01OidSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01OidSegInd,BDMS_01_OID_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OidSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OidSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OidSegInd,BDMS_01_OID_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OidSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OidSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OidSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01UitSegInd
	 *	@return bdms01UitSegInd
	 */
   public char[] getBdms01UitSegInd() throws CFException{
     if (isBdms01UitSegIndModified()) { 
        bdms01UitSegInd = refreshBdms01UitSegInd();
     }
   		return bdms01UitSegInd;
   }

  
	/**
	*  set variable bdms01UitSegInd
	*  Corresponding COBOL Variable is BDMS01-UIT-SEG-IND
	*  @param value
	**/
   public void setBdms01UitSegInd(char[] value) {
      bdms01UitSegInd = checkBdms01UitSegIndConstraints(value);
      serializeBdms01UitSegInd(bdms01UitSegInd);
   } 

     /**
	 * 	Update Bdms01UitSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01UitSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01UitSegInd,bdms01UitSegInd.length);
   	
   }
   
   public void setBdms01UitSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UitSegInd,bdms01UitSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01UitSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UitSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UitSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01UitSegInd with another Field
	 *	@param value
	 */
   public void setBdms01UitSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01UitSegInd,BDMS_01_UIT_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01UitSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01UitSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01UitSegInd,BDMS_01_UIT_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01UitSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UitSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UitSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01MortBackedSegInd
	 *	@return bdms01MortBackedSegInd
	 */
   public char[] getBdms01MortBackedSegInd() throws CFException{
     if (isBdms01MortBackedSegIndModified()) { 
        bdms01MortBackedSegInd = refreshBdms01MortBackedSegInd();
     }
   		return bdms01MortBackedSegInd;
   }

  
	/**
	*  set variable bdms01MortBackedSegInd
	*  Corresponding COBOL Variable is BDMS01-MORT-BACKED-SEG-IND
	*  @param value
	**/
   public void setBdms01MortBackedSegInd(char[] value) {
      bdms01MortBackedSegInd = checkBdms01MortBackedSegIndConstraints(value);
      serializeBdms01MortBackedSegInd(bdms01MortBackedSegInd);
   } 

     /**
	 * 	Update Bdms01MortBackedSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01MortBackedSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01MortBackedSegInd,bdms01MortBackedSegInd.length);
   	
   }
   
   public void setBdms01MortBackedSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MortBackedSegInd,bdms01MortBackedSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01MortBackedSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MortBackedSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MortBackedSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01MortBackedSegInd with another Field
	 *	@param value
	 */
   public void setBdms01MortBackedSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01MortBackedSegInd,BDMS_01_MORT_BACKED_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01MortBackedSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01MortBackedSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01MortBackedSegInd,BDMS_01_MORT_BACKED_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01MortBackedSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MortBackedSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MortBackedSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01GetpriceSegInd
	 *	@return bdms01GetpriceSegInd
	 */
   public char[] getBdms01GetpriceSegInd() throws CFException{
     if (isBdms01GetpriceSegIndModified()) { 
        bdms01GetpriceSegInd = refreshBdms01GetpriceSegInd();
     }
   		return bdms01GetpriceSegInd;
   }

  
	/**
	*  set variable bdms01GetpriceSegInd
	*  Corresponding COBOL Variable is BDMS01-GETPRICE-SEG-IND
	*  @param value
	**/
   public void setBdms01GetpriceSegInd(char[] value) {
      bdms01GetpriceSegInd = checkBdms01GetpriceSegIndConstraints(value);
      serializeBdms01GetpriceSegInd(bdms01GetpriceSegInd);
   } 

     /**
	 * 	Update Bdms01GetpriceSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01GetpriceSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01GetpriceSegInd,bdms01GetpriceSegInd.length);
   	
   }
   
   public void setBdms01GetpriceSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetpriceSegInd,bdms01GetpriceSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01GetpriceSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GetpriceSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetpriceSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01GetpriceSegInd with another Field
	 *	@param value
	 */
   public void setBdms01GetpriceSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01GetpriceSegInd,BDMS_01_GETPRICE_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01GetpriceSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01GetpriceSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01GetpriceSegInd,BDMS_01_GETPRICE_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01GetpriceSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01GetpriceSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01GetpriceSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01DivQualifyInd
	 *	@return bdms01DivQualifyInd
	 */
   public char[] getBdms01DivQualifyInd() throws CFException{
     if (isBdms01DivQualifyIndModified()) { 
        bdms01DivQualifyInd = refreshBdms01DivQualifyInd();
     }
   		return bdms01DivQualifyInd;
   }

  
	/**
	*  set variable bdms01DivQualifyInd
	*  Corresponding COBOL Variable is BDMS01-DIV-QUALIFY-IND
	*  @param value
	**/
   public void setBdms01DivQualifyInd(char[] value) {
      bdms01DivQualifyInd = checkBdms01DivQualifyIndConstraints(value);
      serializeBdms01DivQualifyInd(bdms01DivQualifyInd);
   } 

     /**
	 * 	Update Bdms01DivQualifyInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01DivQualifyInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01DivQualifyInd,bdms01DivQualifyInd.length);
   	
   }
   
   public void setBdms01DivQualifyInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DivQualifyInd,bdms01DivQualifyInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01DivQualifyInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DivQualifyInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DivQualifyInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01DivQualifyInd with another Field
	 *	@param value
	 */
   public void setBdms01DivQualifyInd(Field source) {
       replace(source,0,source.length(),beginBdms01DivQualifyInd,BDMS_01_DIV_QUALIFY_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01DivQualifyInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01DivQualifyInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01DivQualifyInd,BDMS_01_DIV_QUALIFY_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01DivQualifyInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DivQualifyInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DivQualifyInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TaxSegInd
	 *	@return bdms01TaxSegInd
	 */
   public char[] getBdms01TaxSegInd() throws CFException{
     if (isBdms01TaxSegIndModified()) { 
        bdms01TaxSegInd = refreshBdms01TaxSegInd();
     }
   		return bdms01TaxSegInd;
   }

  
	/**
	*  set variable bdms01TaxSegInd
	*  Corresponding COBOL Variable is BDMS01-TAX-SEG-IND
	*  @param value
	**/
   public void setBdms01TaxSegInd(char[] value) {
      bdms01TaxSegInd = checkBdms01TaxSegIndConstraints(value);
      serializeBdms01TaxSegInd(bdms01TaxSegInd);
   } 

     /**
	 * 	Update Bdms01TaxSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TaxSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TaxSegInd,bdms01TaxSegInd.length);
   	
   }
   
   public void setBdms01TaxSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TaxSegInd,bdms01TaxSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TaxSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TaxSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TaxSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TaxSegInd with another Field
	 *	@param value
	 */
   public void setBdms01TaxSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01TaxSegInd,BDMS_01_TAX_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TaxSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TaxSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TaxSegInd,BDMS_01_TAX_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TaxSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TaxSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TaxSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01UnitsSegInd
	 *	@return bdms01UnitsSegInd
	 */
   public char[] getBdms01UnitsSegInd() throws CFException{
     if (isBdms01UnitsSegIndModified()) { 
        bdms01UnitsSegInd = refreshBdms01UnitsSegInd();
     }
   		return bdms01UnitsSegInd;
   }

  
	/**
	*  set variable bdms01UnitsSegInd
	*  Corresponding COBOL Variable is BDMS01-UNITS-SEG-IND
	*  @param value
	**/
   public void setBdms01UnitsSegInd(char[] value) {
      bdms01UnitsSegInd = checkBdms01UnitsSegIndConstraints(value);
      serializeBdms01UnitsSegInd(bdms01UnitsSegInd);
   } 

     /**
	 * 	Update Bdms01UnitsSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01UnitsSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01UnitsSegInd,bdms01UnitsSegInd.length);
   	
   }
   
   public void setBdms01UnitsSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UnitsSegInd,bdms01UnitsSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01UnitsSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UnitsSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UnitsSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01UnitsSegInd with another Field
	 *	@param value
	 */
   public void setBdms01UnitsSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01UnitsSegInd,BDMS_01_UNITS_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01UnitsSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01UnitsSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01UnitsSegInd,BDMS_01_UNITS_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01UnitsSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UnitsSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UnitsSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TcontrolSegInd
	 *	@return bdms01TcontrolSegInd
	 */
   public char[] getBdms01TcontrolSegInd() throws CFException{
     if (isBdms01TcontrolSegIndModified()) { 
        bdms01TcontrolSegInd = refreshBdms01TcontrolSegInd();
     }
   		return bdms01TcontrolSegInd;
   }

  
	/**
	*  set variable bdms01TcontrolSegInd
	*  Corresponding COBOL Variable is BDMS01-TCONTROL-SEG-IND
	*  @param value
	**/
   public void setBdms01TcontrolSegInd(char[] value) {
      bdms01TcontrolSegInd = checkBdms01TcontrolSegIndConstraints(value);
      serializeBdms01TcontrolSegInd(bdms01TcontrolSegInd);
   } 

     /**
	 * 	Update Bdms01TcontrolSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TcontrolSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TcontrolSegInd,bdms01TcontrolSegInd.length);
   	
   }
   
   public void setBdms01TcontrolSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TcontrolSegInd,bdms01TcontrolSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TcontrolSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TcontrolSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TcontrolSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TcontrolSegInd with another Field
	 *	@param value
	 */
   public void setBdms01TcontrolSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01TcontrolSegInd,BDMS_01_TCONTROL_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TcontrolSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TcontrolSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TcontrolSegInd,BDMS_01_TCONTROL_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TcontrolSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TcontrolSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TcontrolSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SecurityPrivSegInd
	 *	@return bdms01SecurityPrivSegInd
	 */
   public char[] getBdms01SecurityPrivSegInd() throws CFException{
     if (isBdms01SecurityPrivSegIndModified()) { 
        bdms01SecurityPrivSegInd = refreshBdms01SecurityPrivSegInd();
     }
   		return bdms01SecurityPrivSegInd;
   }

  
	/**
	*  set variable bdms01SecurityPrivSegInd
	*  Corresponding COBOL Variable is BDMS01-SECURITY-PRIV-SEG-IND
	*  @param value
	**/
   public void setBdms01SecurityPrivSegInd(char[] value) {
      bdms01SecurityPrivSegInd = checkBdms01SecurityPrivSegIndConstraints(value);
      serializeBdms01SecurityPrivSegInd(bdms01SecurityPrivSegInd);
   } 

     /**
	 * 	Update Bdms01SecurityPrivSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SecurityPrivSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SecurityPrivSegInd,bdms01SecurityPrivSegInd.length);
   	
   }
   
   public void setBdms01SecurityPrivSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecurityPrivSegInd,bdms01SecurityPrivSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SecurityPrivSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecurityPrivSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecurityPrivSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SecurityPrivSegInd with another Field
	 *	@param value
	 */
   public void setBdms01SecurityPrivSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01SecurityPrivSegInd,BDMS_01_SECURITY_PRIV_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SecurityPrivSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SecurityPrivSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SecurityPrivSegInd,BDMS_01_SECURITY_PRIV_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SecurityPrivSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecurityPrivSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecurityPrivSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CvrsnSegInd
	 *	@return bdms01CvrsnSegInd
	 */
   public char[] getBdms01CvrsnSegInd() throws CFException{
     if (isBdms01CvrsnSegIndModified()) { 
        bdms01CvrsnSegInd = refreshBdms01CvrsnSegInd();
     }
   		return bdms01CvrsnSegInd;
   }

  
	/**
	*  set variable bdms01CvrsnSegInd
	*  Corresponding COBOL Variable is BDMS01-CVRSN-SEG-IND
	*  @param value
	**/
   public void setBdms01CvrsnSegInd(char[] value) {
      bdms01CvrsnSegInd = checkBdms01CvrsnSegIndConstraints(value);
      serializeBdms01CvrsnSegInd(bdms01CvrsnSegInd);
   } 

     /**
	 * 	Update Bdms01CvrsnSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CvrsnSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CvrsnSegInd,bdms01CvrsnSegInd.length);
   	
   }
   
   public void setBdms01CvrsnSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnSegInd,bdms01CvrsnSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CvrsnSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CvrsnSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CvrsnSegInd with another Field
	 *	@param value
	 */
   public void setBdms01CvrsnSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01CvrsnSegInd,BDMS_01_CVRSN_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CvrsnSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CvrsnSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CvrsnSegInd,BDMS_01_CVRSN_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CvrsnSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CvrsnSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CvrsnSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CanadaBondSegInd
	 *	@return bdms01CanadaBondSegInd
	 */
   public char[] getBdms01CanadaBondSegInd() throws CFException{
     if (isBdms01CanadaBondSegIndModified()) { 
        bdms01CanadaBondSegInd = refreshBdms01CanadaBondSegInd();
     }
   		return bdms01CanadaBondSegInd;
   }

  
	/**
	*  set variable bdms01CanadaBondSegInd
	*  Corresponding COBOL Variable is BDMS01-CANADA-BOND-SEG-IND
	*  @param value
	**/
   public void setBdms01CanadaBondSegInd(char[] value) {
      bdms01CanadaBondSegInd = checkBdms01CanadaBondSegIndConstraints(value);
      serializeBdms01CanadaBondSegInd(bdms01CanadaBondSegInd);
   } 

     /**
	 * 	Update Bdms01CanadaBondSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CanadaBondSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CanadaBondSegInd,bdms01CanadaBondSegInd.length);
   	
   }
   
   public void setBdms01CanadaBondSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CanadaBondSegInd,bdms01CanadaBondSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CanadaBondSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CanadaBondSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CanadaBondSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CanadaBondSegInd with another Field
	 *	@param value
	 */
   public void setBdms01CanadaBondSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01CanadaBondSegInd,BDMS_01_CANADA_BOND_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CanadaBondSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CanadaBondSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CanadaBondSegInd,BDMS_01_CANADA_BOND_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CanadaBondSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CanadaBondSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CanadaBondSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01OptUnderlXrefSegInd
	 *	@return bdms01OptUnderlXrefSegInd
	 */
   public char[] getBdms01OptUnderlXrefSegInd() throws CFException{
     if (isBdms01OptUnderlXrefSegIndModified()) { 
        bdms01OptUnderlXrefSegInd = refreshBdms01OptUnderlXrefSegInd();
     }
   		return bdms01OptUnderlXrefSegInd;
   }

  
	/**
	*  set variable bdms01OptUnderlXrefSegInd
	*  Corresponding COBOL Variable is BDMS01-OPT-UNDERL-XREF-SEG-IND
	*  @param value
	**/
   public void setBdms01OptUnderlXrefSegInd(char[] value) {
      bdms01OptUnderlXrefSegInd = checkBdms01OptUnderlXrefSegIndConstraints(value);
      serializeBdms01OptUnderlXrefSegInd(bdms01OptUnderlXrefSegInd);
   } 

     /**
	 * 	Update Bdms01OptUnderlXrefSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OptUnderlXrefSegInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OptUnderlXrefSegInd,bdms01OptUnderlXrefSegInd.length);
   	
   }
   
   public void setBdms01OptUnderlXrefSegInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptUnderlXrefSegInd,bdms01OptUnderlXrefSegInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01OptUnderlXrefSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptUnderlXrefSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptUnderlXrefSegInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OptUnderlXrefSegInd with another Field
	 *	@param value
	 */
   public void setBdms01OptUnderlXrefSegInd(Field source) {
       replace(source,0,source.length(),beginBdms01OptUnderlXrefSegInd,BDMS_01_OPT_UNDERL_XREF_SEG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OptUnderlXrefSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OptUnderlXrefSegInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OptUnderlXrefSegInd,BDMS_01_OPT_UNDERL_XREF_SEG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OptUnderlXrefSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OptUnderlXrefSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OptUnderlXrefSegInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ReqPriceRegion
	 *	@return bdms01ReqPriceRegion
	 */
   public char[] getBdms01ReqPriceRegion() throws CFException{
     if (isBdms01ReqPriceRegionModified()) { 
        bdms01ReqPriceRegion = refreshBdms01ReqPriceRegion();
     }
   		return bdms01ReqPriceRegion;
   }

  
	/**
	*  set variable bdms01ReqPriceRegion
	*  Corresponding COBOL Variable is BDMS01-REQ-PRICE-REGION
	*  @param value
	**/
   public void setBdms01ReqPriceRegion(char[] value) {
      bdms01ReqPriceRegion = checkBdms01ReqPriceRegionConstraints(value);
      serializeBdms01ReqPriceRegion(bdms01ReqPriceRegion);
   } 

     /**
	 * 	Update Bdms01ReqPriceRegion 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ReqPriceRegion(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ReqPriceRegion,bdms01ReqPriceRegion.length);
   	
   }
   
   public void setBdms01ReqPriceRegion(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ReqPriceRegion,bdms01ReqPriceRegion.length);
   	
   }
   
     /**
	 * 	Update Bdms01ReqPriceRegion 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ReqPriceRegion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ReqPriceRegion+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ReqPriceRegion with another Field
	 *	@param value
	 */
   public void setBdms01ReqPriceRegion(Field source) {
       replace(source,0,source.length(),beginBdms01ReqPriceRegion,BDMS_01_REQ_PRICE_REGION_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ReqPriceRegion 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ReqPriceRegion(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ReqPriceRegion,BDMS_01_REQ_PRICE_REGION_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ReqPriceRegion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ReqPriceRegion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ReqPriceRegion+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01OsiSymbolCont
	 *	@return bdms01OsiSymbolCont
	 */   
	 public Bdms01OsiSymbolCont getBdms01OsiSymbolCont() {
   	return bdms01OsiSymbolCont;
   }
   /**
	* 	Update Bdms01OsiSymbolCont with the passed value
	*   Corresponding COBOL Variable is BDMS01-OSI-SYMBOL-CONT
	*	@param value
	*/
   public void setBdms01OsiSymbolCont(char[] value) {
      bdms01OsiSymbolCont.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01OsiSymbolCont 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01OsiSymbolCont(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01OsiSymbolCont.begin,bdms01OsiSymbolCont.length());
   }
   
     /**
	 * 	Update Bdms01OsiSymbolCont 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OsiSymbolCont(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01OsiSymbolCont.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01OsiSymbolCont with another Field
	 *	@param value
	 */
   public void setBdms01OsiSymbolCont(Field source) {
   	replace(source,0,source.length(),bdms01OsiSymbolCont.begin,bdms01OsiSymbolCont.length());
   }  
   
     /**
	 * 	Update Bdms01OsiSymbolCont 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01OsiSymbolCont(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01OsiSymbolCont.begin,bdms01OsiSymbolCont.length());
   }
   
     /**
	 * 	Update Bdms01OsiSymbolCont 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OsiSymbolCont(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01OsiSymbolCont.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01SearchKeyIsinCntry
	 *	@return bdms01SearchKeyIsinCntry
	 */
   public char[] getBdms01SearchKeyIsinCntry() throws CFException{
     if (isBdms01SearchKeyIsinCntryModified()) { 
        bdms01SearchKeyIsinCntry = refreshBdms01SearchKeyIsinCntry();
     }
   		return bdms01SearchKeyIsinCntry;
   }

  
	/**
	*  set variable bdms01SearchKeyIsinCntry
	*  Corresponding COBOL Variable is BDMS01-SEARCH-KEY-ISIN-CNTRY
	*  @param value
	**/
   public void setBdms01SearchKeyIsinCntry(char[] value) {
      bdms01SearchKeyIsinCntry = checkBdms01SearchKeyIsinCntryConstraints(value);
      serializeBdms01SearchKeyIsinCntry(bdms01SearchKeyIsinCntry);
   } 

     /**
	 * 	Update Bdms01SearchKeyIsinCntry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SearchKeyIsinCntry(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SearchKeyIsinCntry,bdms01SearchKeyIsinCntry.length);
   	
   }
   
   public void setBdms01SearchKeyIsinCntry(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchKeyIsinCntry,bdms01SearchKeyIsinCntry.length);
   	
   }
   
     /**
	 * 	Update Bdms01SearchKeyIsinCntry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchKeyIsinCntry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchKeyIsinCntry+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SearchKeyIsinCntry with another Field
	 *	@param value
	 */
   public void setBdms01SearchKeyIsinCntry(Field source) {
       replace(source,0,source.length(),beginBdms01SearchKeyIsinCntry,BDMS_01_SEARCH_KEY_ISIN_CNTRY_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SearchKeyIsinCntry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SearchKeyIsinCntry(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SearchKeyIsinCntry,BDMS_01_SEARCH_KEY_ISIN_CNTRY_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SearchKeyIsinCntry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SearchKeyIsinCntry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SearchKeyIsinCntry+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01LogError
	 *	@return bdms01LogError
	 */
   public char[] getBdms01LogError() throws CFException{
     if (isBdms01LogErrorModified()) { 
        bdms01LogError = refreshBdms01LogError();
     }
   		return bdms01LogError;
   }

  
	/**
	*  set variable bdms01LogError
	*  Corresponding COBOL Variable is BDMS01-LOG-ERROR
	*  @param value
	**/
   public void setBdms01LogError(char[] value) {
      bdms01LogError = checkBdms01LogErrorConstraints(value);
      serializeBdms01LogError(bdms01LogError);
   } 

     /**
	 * 	Update Bdms01LogError 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01LogError(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01LogError,bdms01LogError.length);
   	
   }
   
   public void setBdms01LogError(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01LogError,bdms01LogError.length);
   	
   }
   
     /**
	 * 	Update Bdms01LogError 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01LogError(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01LogError+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01LogError with another Field
	 *	@param value
	 */
   public void setBdms01LogError(Field source) {
       replace(source,0,source.length(),beginBdms01LogError,BDMS_01_LOG_ERROR_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01LogError 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01LogError(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01LogError,BDMS_01_LOG_ERROR_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01LogError 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01LogError(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01LogError+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ProgramName
	 *	@return bdms01ProgramName
	 */
   public char[] getBdms01ProgramName() throws CFException{
     if (isBdms01ProgramNameModified()) { 
        bdms01ProgramName = refreshBdms01ProgramName();
     }
   		return bdms01ProgramName;
   }

  
	/**
	*  set variable bdms01ProgramName
	*  Corresponding COBOL Variable is BDMS01-PROGRAM-NAME
	*  @param value
	**/
   public void setBdms01ProgramName(char[] value) {
      bdms01ProgramName = checkBdms01ProgramNameConstraints(value);
      serializeBdms01ProgramName(bdms01ProgramName);
   } 

     /**
	 * 	Update Bdms01ProgramName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ProgramName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ProgramName,bdms01ProgramName.length);
   	
   }
   
   public void setBdms01ProgramName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ProgramName,bdms01ProgramName.length);
   	
   }
   
     /**
	 * 	Update Bdms01ProgramName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ProgramName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ProgramName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ProgramName with another Field
	 *	@param value
	 */
   public void setBdms01ProgramName(Field source) {
       replace(source,0,source.length(),beginBdms01ProgramName,BDMS_01_PROGRAM_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ProgramName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ProgramName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ProgramName,BDMS_01_PROGRAM_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ProgramName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ProgramName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ProgramName+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01InputData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBdms01Db2Function(CONSTANTS.SPACE);
         setBdms01SearchKeyField(CONSTANTS.SPACE_12);
         setBdms01SearchKeyWiCode(CONSTANTS.SPACE);
         setBdms01SearchKeyType(CONSTANTS.SPACE_2);
         setBdms01AdpMasterSegInd(CONSTANTS.SPACE);
         setBdms01BaseSecuritySegInd(CONSTANTS.SPACE);
         setBdms01SecurityTypeSegInd(CONSTANTS.SPACE);
         setBdms01PriceSegInd(CONSTANTS.SPACE);
         setBdms01XrefSegInd(CONSTANTS.SPACE);
         setBdms01DescSegInd(CONSTANTS.SPACE);
         setBdms01SpecialistSegInd(CONSTANTS.SPACE);
         setBdms01FrozenChillSegInd(CONSTANTS.SPACE);
         setBdms01IncomeSegInd(CONSTANTS.SPACE);
         setBdms01RatingSegInd(CONSTANTS.SPACE);
         setBdms01ConvertibleSegInd(CONSTANTS.SPACE);
         setBdms01StockSegInd(CONSTANTS.SPACE);
         setBdms01OptionSegInd(CONSTANTS.SPACE);
         setBdms01BondBasicSegInd(CONSTANTS.SPACE);
         setBdms01BondFeatureSegInd(CONSTANTS.SPACE);
         setBdms01BondFactorSegInd(CONSTANTS.SPACE);
         setBdms01BondCmoSegInd(CONSTANTS.SPACE);
         setBdms01OidSegInd(CONSTANTS.SPACE);
         setBdms01UitSegInd(CONSTANTS.SPACE);
         setBdms01MortBackedSegInd(CONSTANTS.SPACE);
         setBdms01GetpriceSegInd(CONSTANTS.SPACE);
         setBdms01DivQualifyInd(CONSTANTS.SPACE);
         setBdms01TaxSegInd(CONSTANTS.SPACE);
         setBdms01UnitsSegInd(CONSTANTS.SPACE);
         setBdms01TcontrolSegInd(CONSTANTS.SPACE);
         setBdms01SecurityPrivSegInd(CONSTANTS.SPACE);
         setBdms01CvrsnSegInd(CONSTANTS.SPACE);
         setBdms01CanadaBondSegInd(CONSTANTS.SPACE);
         setBdms01OptUnderlXrefSegInd(CONSTANTS.SPACE);
         setBdms01ReqPriceRegion(CONSTANTS.SPACE);
          bdms01OsiSymbolCont.initialize();
     
         setBdms01SearchKeyIsinCntry(CONSTANTS.SPACE_2);
         setBdms01LogError(CONSTANTS.SPACE);
         setBdms01ProgramName(CONSTANTS.SPACE_8);
   }

		public static int getBdms01InputDataFieldLength() {
			return BDMS_01_INPUT_DATA_LENGTH;
		}

}
  
