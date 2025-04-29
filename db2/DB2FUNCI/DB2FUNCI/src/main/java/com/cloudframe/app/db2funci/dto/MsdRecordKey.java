package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdRecordKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class MsdRecordKey extends MsdRecordKeySerialized { 
   

						private char[] msdSecurityNo = Field.fillLowValue(7);
				private MsdSecurityNoRedefined msdSecurityNoRedefined = new MsdSecurityNoRedefined();

						private char[] msdWhenIssuedCode = Field.fillLowValue(1);
	
	/**
	* Constructor for MsdRecordKey
	**/
    public MsdRecordKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdRecordKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdRecordKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			msdSecurityNoRedefined.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of msdSecurityNo
	 *	@return msdSecurityNo
	 */
   public char[] getMsdSecurityNo() throws CFException{
     if (isMsdSecurityNoModified()) { 
        msdSecurityNo = refreshMsdSecurityNo();
     }
   		return msdSecurityNo;
   }

  
	/**
	*  set variable msdSecurityNo
	*  Corresponding COBOL Variable is MSD-SECURITY-NO
	*  @param value
	**/
   public void setMsdSecurityNo(char[] value) {
      msdSecurityNo = checkMsdSecurityNoConstraints(value);
      serializeMsdSecurityNo(msdSecurityNo);
   } 

     /**
	 * 	Update MsdSecurityNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSecurityNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSecurityNo,msdSecurityNo.length);
   	
   }
   
   public void setMsdSecurityNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecurityNo,msdSecurityNo.length);
   	
   }
   
     /**
	 * 	Update MsdSecurityNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecurityNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecurityNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSecurityNo with another Field
	 *	@param value
	 */
   public void setMsdSecurityNo(Field source) {
       replace(source,0,source.length(),beginMsdSecurityNo,MSD_SECURITY_NO_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSecurityNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSecurityNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSecurityNo,MSD_SECURITY_NO_LEN);
   	
   }
   
     /**
	 * 	Update MsdSecurityNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecurityNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSecurityNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdSecurityNoRedefined
	 *	@return msdSecurityNoRedefined
	 */   
	 public MsdSecurityNoRedefined getMsdSecurityNoRedefined() {
   	return msdSecurityNoRedefined;
   }
   /**
	* 	Update MsdSecurityNoRedefined with the passed value
	*   Corresponding COBOL Variable is MSD-SECURITY-NO-REDEFINED
	*	@param value
	*/
   public void setMsdSecurityNoRedefined(char[] value) {
      msdSecurityNoRedefined.setString(value); 
   }   
    
     /**
	 * 	Update MsdSecurityNoRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdSecurityNoRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdSecurityNoRedefined.begin,msdSecurityNoRedefined.length());
   }
   
     /**
	 * 	Update MsdSecurityNoRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecurityNoRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdSecurityNoRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdSecurityNoRedefined with another Field
	 *	@param value
	 */
   public void setMsdSecurityNoRedefined(Field source) {
   	replace(source,0,source.length(),msdSecurityNoRedefined.begin,msdSecurityNoRedefined.length());
   }  
   
     /**
	 * 	Update MsdSecurityNoRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdSecurityNoRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdSecurityNoRedefined.begin,msdSecurityNoRedefined.length());
   }
   
     /**
	 * 	Update MsdSecurityNoRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecurityNoRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdSecurityNoRedefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdWhenIssuedCode
	 *	@return msdWhenIssuedCode
	 */
   public char[] getMsdWhenIssuedCode() throws CFException{
     if (isMsdWhenIssuedCodeModified()) { 
        msdWhenIssuedCode = refreshMsdWhenIssuedCode();
     }
   		return msdWhenIssuedCode;
   }

  
	/**
	*  set variable msdWhenIssuedCode
	*  Corresponding COBOL Variable is MSD-WHEN-ISSUED-CODE
	*  @param value
	**/
   public void setMsdWhenIssuedCode(char[] value) {
      msdWhenIssuedCode = checkMsdWhenIssuedCodeConstraints(value);
      serializeMsdWhenIssuedCode(msdWhenIssuedCode);
   } 

     /**
	 * 	Update MsdWhenIssuedCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdWhenIssuedCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdWhenIssuedCode,msdWhenIssuedCode.length);
   	
   }
   
   public void setMsdWhenIssuedCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdWhenIssuedCode,msdWhenIssuedCode.length);
   	
   }
   
     /**
	 * 	Update MsdWhenIssuedCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdWhenIssuedCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdWhenIssuedCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdWhenIssuedCode with another Field
	 *	@param value
	 */
   public void setMsdWhenIssuedCode(Field source) {
       replace(source,0,source.length(),beginMsdWhenIssuedCode,MSD_WHEN_ISSUED_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update MsdWhenIssuedCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdWhenIssuedCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdWhenIssuedCode,MSD_WHEN_ISSUED_CODE_LEN);
   	
   }
   
     /**
	 * 	Update MsdWhenIssuedCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdWhenIssuedCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdWhenIssuedCode+targetIndex,targetLen);
    
   }
	char[] msdWhenIssued88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isMsdWhenIssued()
	 *	@return  Returns true if isMsdWhenIssued() is "1"
	 */
   public boolean isMsdWhenIssued() throws CFException {
      return (  compareChars( getMsdWhenIssuedCode() , msdWhenIssued88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setMsdWhenIssuedTrue() {  			
    	setMsdWhenIssuedCode( msdWhenIssued88Value);
   	}

	
	
	
	/**
	 * 	initializes MsdRecordKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setMsdSecurityNo(CONSTANTS.SPACE_7);
         setMsdWhenIssuedCode(CONSTANTS.SPACE);
   }

		public static int getMsdRecordKeyFieldLength() {
			return MSD_RECORD_KEY_LENGTH;
		}

}
  
