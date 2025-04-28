package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01CallParametersArray1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01CallParametersArray1 extends Bdms01CallParametersArray1Serialized { 
   

						private char[] bdms01SecurityDesc = Field.fillLowValue(30);

						private char[] bdms01SecurityDescLang = Field.fillLowValue(2);

						private char[] bdms01TypeDescCd = Field.fillLowValue(1);
	
	/**
	* Constructor for Bdms01CallParametersArray1
	**/
    public Bdms01CallParametersArray1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01CallParametersArray1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01CallParametersArray1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01SecurityDesc
	 *	@return bdms01SecurityDesc
	 */
   public char[] getBdms01SecurityDesc() throws CFException{
     if (isBdms01SecurityDescModified()) { 
        bdms01SecurityDesc = refreshBdms01SecurityDesc();
     }
   		return bdms01SecurityDesc;
   }

  
	/**
	*  set variable bdms01SecurityDesc
	*  Corresponding COBOL Variable is BDMS01-SECURITY-DESC
	*  @param value
	**/
   public void setBdms01SecurityDesc(char[] value) {
      bdms01SecurityDesc = checkBdms01SecurityDescConstraints(value);
      serializeBdms01SecurityDesc(bdms01SecurityDesc);
   } 

     /**
	 * 	Update Bdms01SecurityDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SecurityDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SecurityDesc,bdms01SecurityDesc.length);
   	
   }
   
   public void setBdms01SecurityDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecurityDesc,bdms01SecurityDesc.length);
   	
   }
   
     /**
	 * 	Update Bdms01SecurityDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecurityDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecurityDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SecurityDesc with another Field
	 *	@param value
	 */
   public void setBdms01SecurityDesc(Field source) {
       replace(source,0,source.length(),beginBdms01SecurityDesc,BDMS_01_SECURITY_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SecurityDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SecurityDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SecurityDesc,BDMS_01_SECURITY_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SecurityDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecurityDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecurityDesc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SecurityDescLang
	 *	@return bdms01SecurityDescLang
	 */
   public char[] getBdms01SecurityDescLang() throws CFException{
     if (isBdms01SecurityDescLangModified()) { 
        bdms01SecurityDescLang = refreshBdms01SecurityDescLang();
     }
   		return bdms01SecurityDescLang;
   }

  
	/**
	*  set variable bdms01SecurityDescLang
	*  Corresponding COBOL Variable is BDMS01-SECURITY-DESC-LANG
	*  @param value
	**/
   public void setBdms01SecurityDescLang(char[] value) {
      bdms01SecurityDescLang = checkBdms01SecurityDescLangConstraints(value);
      serializeBdms01SecurityDescLang(bdms01SecurityDescLang);
   } 

     /**
	 * 	Update Bdms01SecurityDescLang 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SecurityDescLang(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SecurityDescLang,bdms01SecurityDescLang.length);
   	
   }
   
   public void setBdms01SecurityDescLang(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecurityDescLang,bdms01SecurityDescLang.length);
   	
   }
   
     /**
	 * 	Update Bdms01SecurityDescLang 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecurityDescLang(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecurityDescLang+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SecurityDescLang with another Field
	 *	@param value
	 */
   public void setBdms01SecurityDescLang(Field source) {
       replace(source,0,source.length(),beginBdms01SecurityDescLang,BDMS_01_SECURITY_DESC_LANG_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SecurityDescLang 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SecurityDescLang(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SecurityDescLang,BDMS_01_SECURITY_DESC_LANG_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SecurityDescLang 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecurityDescLang(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecurityDescLang+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TypeDescCd
	 *	@return bdms01TypeDescCd
	 */
   public char[] getBdms01TypeDescCd() throws CFException{
     if (isBdms01TypeDescCdModified()) { 
        bdms01TypeDescCd = refreshBdms01TypeDescCd();
     }
   		return bdms01TypeDescCd;
   }

  
	/**
	*  set variable bdms01TypeDescCd
	*  Corresponding COBOL Variable is BDMS01-TYPE-DESC-CD
	*  @param value
	**/
   public void setBdms01TypeDescCd(char[] value) {
      bdms01TypeDescCd = checkBdms01TypeDescCdConstraints(value);
      serializeBdms01TypeDescCd(bdms01TypeDescCd);
   } 

     /**
	 * 	Update Bdms01TypeDescCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TypeDescCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TypeDescCd,bdms01TypeDescCd.length);
   	
   }
   
   public void setBdms01TypeDescCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeDescCd,bdms01TypeDescCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TypeDescCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypeDescCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeDescCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TypeDescCd with another Field
	 *	@param value
	 */
   public void setBdms01TypeDescCd(Field source) {
       replace(source,0,source.length(),beginBdms01TypeDescCd,BDMS_01_TYPE_DESC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TypeDescCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TypeDescCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TypeDescCd,BDMS_01_TYPE_DESC_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TypeDescCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypeDescCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeDescCd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01CallParametersArray1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBdms01SecurityDesc(CONSTANTS.SPACE_30);
         setBdms01SecurityDescLang(CONSTANTS.SPACE_2);
         setBdms01TypeDescCd(CONSTANTS.SPACE);
   }

		public static int getBdms01CallParametersArray1FieldLength() {
			return BDMS_01_CALL_PARAMETERS_ARRAY_1_LENGTH;
		}

}
  
