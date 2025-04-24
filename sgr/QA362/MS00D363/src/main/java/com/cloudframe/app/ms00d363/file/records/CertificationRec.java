package com.cloudframe.app.ms00d363.file.records;

/**
*  The class CertificationRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CertificationRec extends CertificationRecSerialized { 
   

						private char[] crParameterId = Field.fillLowValue(8);

						private char[] crDomesticOnSoil = Field.fillLowValue(5);

						private char[] localEnv = Field.fillLowValue(14);
	
	/**
	* Constructor for CertificationRec
	**/
    public CertificationRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of crParameterId
	 *	@return crParameterId
	 */
   public char[] getCrParameterId() throws CFException{
     if (isCrParameterIdModified()) { 
        crParameterId = refreshCrParameterId();
     }
   		return crParameterId;
   }

  
	/**
	*  set variable crParameterId
	*  Corresponding COBOL Variable is CR-PARAMETER-ID
	*  @param value
	**/
   public void setCrParameterId(char[] value) {
      crParameterId = checkCrParameterIdConstraints(value);
      serializeCrParameterId(crParameterId);
   } 

     /**
	 * 	Update CrParameterId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCrParameterId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCrParameterId,crParameterId.length);
   	
   }
   
   public void setCrParameterId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCrParameterId,crParameterId.length);
   	
   }
   
     /**
	 * 	Update CrParameterId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCrParameterId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCrParameterId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CrParameterId with another Field
	 *	@param value
	 */
   public void setCrParameterId(Field source) {
       replace(source,0,source.length(),beginCrParameterId,CR_PARAMETER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update CrParameterId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCrParameterId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCrParameterId,CR_PARAMETER_ID_LEN);
   	
   }
   
     /**
	 * 	Update CrParameterId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCrParameterId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCrParameterId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of crDomesticOnSoil
	 *	@return crDomesticOnSoil
	 */
   public char[] getCrDomesticOnSoil() throws CFException{
     if (isCrDomesticOnSoilModified()) { 
        crDomesticOnSoil = refreshCrDomesticOnSoil();
     }
   		return crDomesticOnSoil;
   }

  
	/**
	*  set variable crDomesticOnSoil
	*  Corresponding COBOL Variable is CR-DOMESTIC-ON-SOIL
	*  @param value
	**/
   public void setCrDomesticOnSoil(char[] value) {
      crDomesticOnSoil = checkCrDomesticOnSoilConstraints(value);
      serializeCrDomesticOnSoil(crDomesticOnSoil);
   } 

     /**
	 * 	Update CrDomesticOnSoil 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCrDomesticOnSoil(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCrDomesticOnSoil,crDomesticOnSoil.length);
   	
   }
   
   public void setCrDomesticOnSoil(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCrDomesticOnSoil,crDomesticOnSoil.length);
   	
   }
   
     /**
	 * 	Update CrDomesticOnSoil 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCrDomesticOnSoil(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCrDomesticOnSoil+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CrDomesticOnSoil with another Field
	 *	@param value
	 */
   public void setCrDomesticOnSoil(Field source) {
       replace(source,0,source.length(),beginCrDomesticOnSoil,CR_DOMESTIC_ON_SOIL_LEN);
   	
   }  
   
     /**
	 * 	Update CrDomesticOnSoil 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCrDomesticOnSoil(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCrDomesticOnSoil,CR_DOMESTIC_ON_SOIL_LEN);
   	
   }
   
     /**
	 * 	Update CrDomesticOnSoil 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCrDomesticOnSoil(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCrDomesticOnSoil+targetIndex,targetLen);
    
   }
	char[] crGlobal88Value = "     ".toCharArray();
	/**
	 *	Test condition " " for isCrGlobal()
	 *	@return  Returns true if isCrGlobal() is " "
	 */
   public boolean isCrGlobal() throws CFException {
      return (  compareChars( getCrDomesticOnSoil() , crGlobal88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setCrGlobalTrue() {  			
    	setCrDomesticOnSoil( crGlobal88Value);
   	}
	char[] crLocal88Value = "LOCAL".toCharArray();
	/**
	 *	Test condition "LOCAL" for isCrLocal()
	 *	@return  Returns true if isCrLocal() is "LOCAL"
	 */
   public boolean isCrLocal() throws CFException {
      return (  compareChars( getCrDomesticOnSoil() , crLocal88Value)  == 0  );
   }


	/**
	*  set values "LOCAL"
	*/
   	public void setCrLocalTrue() {  			
    	setCrDomesticOnSoil( crLocal88Value);
   	}
	/**
	 *	Returns the value of localEnv
	 *	@return localEnv
	 */
   public char[] getLocalEnv() throws CFException{
     if (isLocalEnvModified()) { 
        localEnv = refreshLocalEnv();
     }
   		return localEnv;
   }

  
	/**
	*  set variable localEnv
	*  Corresponding COBOL Variable is LOCAL-ENV
	*  @param value
	**/
   public void setLocalEnv(char[] value) {
      localEnv = checkLocalEnvConstraints(value);
      serializeLocalEnv(localEnv);
   } 

     /**
	 * 	Update LocalEnv 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLocalEnv(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLocalEnv,localEnv.length);
   	
   }
   
   public void setLocalEnv(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLocalEnv,localEnv.length);
   	
   }
   
     /**
	 * 	Update LocalEnv 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLocalEnv(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLocalEnv+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LocalEnv with another Field
	 *	@param value
	 */
   public void setLocalEnv(Field source) {
       replace(source,0,source.length(),beginLocalEnv,LOCAL_ENV_LEN);
   	
   }  
   
     /**
	 * 	Update LocalEnv 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLocalEnv(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLocalEnv,LOCAL_ENV_LEN);
   	
   }
   
     /**
	 * 	Update LocalEnv 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLocalEnv(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLocalEnv+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCertificationRecFieldLength() {
			return CERTIFICATION_REC_LENGTH;
		}

}
  
