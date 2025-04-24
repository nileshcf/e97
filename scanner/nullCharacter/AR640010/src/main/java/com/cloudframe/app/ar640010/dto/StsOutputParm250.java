package com.cloudframe.app.ar640010.dto;

/**
*  The class StsOutputParm250 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class StsOutputParm250 extends StsOutputParm250Serialized { 
   

						private char[] gftStatCd250 = new char[1];

						private char[] hubStatCd250 = new char[2];

						private char[] e2eStatCd250 = new char[2];

						private char[] statRefAbbrTxt250 = new char[14];

						private char[] statRefDesc250 = new char[80];

						private char[] stsLstUpdtUid250 = new char[9];

						private char[] stsLstUpdtTs250 = new char[26];
	
	/**
	* Constructor for StsOutputParm250
	**/
    public StsOutputParm250() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for StsOutputParm250. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StsOutputParm250(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setGftStatCd250(fillSpace(1));
								setHubStatCd250(fillSpace(2));
								setE2eStatCd250(fillSpace(2));
								setStatRefAbbrTxt250(fillSpace(14));
								setStatRefDesc250(pad(80," ".toCharArray(),' ',RIGHT_PAD));
								setStsLstUpdtUid250(fillSpace(9));
								setStsLstUpdtTs250(fillSpace(26));
    } 

	/**
	 *	Returns the value of gftStatCd250
	 *	@return gftStatCd250
	 */
   public char[] getGftStatCd250() throws CFException{
     if (isGftStatCd250Modified()) { 
        gftStatCd250 = refreshGftStatCd250();
     }
   		return gftStatCd250;
   }

  
	/**
	*  set variable gftStatCd250
	*  Corresponding COBOL Variable is 250-GFT-STAT-CD
	*  @param value
	**/
   public void setGftStatCd250(char[] value) {
      gftStatCd250 = checkGftStatCd250Constraints(value);
      serializeGftStatCd250(gftStatCd250);
   } 

     /**
	 * 	Update GftStatCd250 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGftStatCd250(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGftStatCd250,gftStatCd250.length);
   	
   }
   
   public void setGftStatCd250(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGftStatCd250,gftStatCd250.length);
   	
   }
   
     /**
	 * 	Update GftStatCd250 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftStatCd250(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftStatCd250+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GftStatCd250 with another Field
	 *	@param value
	 */
   public void setGftStatCd250(Field source) {
       replace(source,0,source.length(),beginGftStatCd250,GFT_STAT_CD_250_LEN);
   	
   }  
   
     /**
	 * 	Update GftStatCd250 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGftStatCd250(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGftStatCd250,GFT_STAT_CD_250_LEN);
   	
   }
   
     /**
	 * 	Update GftStatCd250 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftStatCd250(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftStatCd250+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hubStatCd250
	 *	@return hubStatCd250
	 */
   public char[] getHubStatCd250() throws CFException{
     if (isHubStatCd250Modified()) { 
        hubStatCd250 = refreshHubStatCd250();
     }
   		return hubStatCd250;
   }

  
	/**
	*  set variable hubStatCd250
	*  Corresponding COBOL Variable is 250-HUB-STAT-CD
	*  @param value
	**/
   public void setHubStatCd250(char[] value) {
      hubStatCd250 = checkHubStatCd250Constraints(value);
      serializeHubStatCd250(hubStatCd250);
   } 

     /**
	 * 	Update HubStatCd250 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHubStatCd250(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHubStatCd250,hubStatCd250.length);
   	
   }
   
   public void setHubStatCd250(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHubStatCd250,hubStatCd250.length);
   	
   }
   
     /**
	 * 	Update HubStatCd250 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHubStatCd250(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHubStatCd250+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HubStatCd250 with another Field
	 *	@param value
	 */
   public void setHubStatCd250(Field source) {
       replace(source,0,source.length(),beginHubStatCd250,HUB_STAT_CD_250_LEN);
   	
   }  
   
     /**
	 * 	Update HubStatCd250 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHubStatCd250(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHubStatCd250,HUB_STAT_CD_250_LEN);
   	
   }
   
     /**
	 * 	Update HubStatCd250 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHubStatCd250(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHubStatCd250+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of e2eStatCd250
	 *	@return e2eStatCd250
	 */
   public char[] getE2eStatCd250() throws CFException{
     if (isE2eStatCd250Modified()) { 
        e2eStatCd250 = refreshE2eStatCd250();
     }
   		return e2eStatCd250;
   }

  
	/**
	*  set variable e2eStatCd250
	*  Corresponding COBOL Variable is 250-E2E-STAT-CD
	*  @param value
	**/
   public void setE2eStatCd250(char[] value) {
      e2eStatCd250 = checkE2eStatCd250Constraints(value);
      serializeE2eStatCd250(e2eStatCd250);
   } 

     /**
	 * 	Update E2eStatCd250 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setE2eStatCd250(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginE2eStatCd250,e2eStatCd250.length);
   	
   }
   
   public void setE2eStatCd250(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginE2eStatCd250,e2eStatCd250.length);
   	
   }
   
     /**
	 * 	Update E2eStatCd250 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setE2eStatCd250(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginE2eStatCd250+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update E2eStatCd250 with another Field
	 *	@param value
	 */
   public void setE2eStatCd250(Field source) {
       replace(source,0,source.length(),beginE2eStatCd250,E_2E_STAT_CD_250_LEN);
   	
   }  
   
     /**
	 * 	Update E2eStatCd250 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setE2eStatCd250(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginE2eStatCd250,E_2E_STAT_CD_250_LEN);
   	
   }
   
     /**
	 * 	Update E2eStatCd250 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setE2eStatCd250(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginE2eStatCd250+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of statRefAbbrTxt250
	 *	@return statRefAbbrTxt250
	 */
   public char[] getStatRefAbbrTxt250() throws CFException{
     if (isStatRefAbbrTxt250Modified()) { 
        statRefAbbrTxt250 = refreshStatRefAbbrTxt250();
     }
   		return statRefAbbrTxt250;
   }

  
	/**
	*  set variable statRefAbbrTxt250
	*  Corresponding COBOL Variable is 250-STAT-REF-ABBR-TXT
	*  @param value
	**/
   public void setStatRefAbbrTxt250(char[] value) {
      statRefAbbrTxt250 = checkStatRefAbbrTxt250Constraints(value);
      serializeStatRefAbbrTxt250(statRefAbbrTxt250);
   } 

     /**
	 * 	Update StatRefAbbrTxt250 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStatRefAbbrTxt250(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStatRefAbbrTxt250,statRefAbbrTxt250.length);
   	
   }
   
   public void setStatRefAbbrTxt250(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStatRefAbbrTxt250,statRefAbbrTxt250.length);
   	
   }
   
     /**
	 * 	Update StatRefAbbrTxt250 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStatRefAbbrTxt250(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStatRefAbbrTxt250+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StatRefAbbrTxt250 with another Field
	 *	@param value
	 */
   public void setStatRefAbbrTxt250(Field source) {
       replace(source,0,source.length(),beginStatRefAbbrTxt250,STAT_REF_ABBR_TXT_250_LEN);
   	
   }  
   
     /**
	 * 	Update StatRefAbbrTxt250 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStatRefAbbrTxt250(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStatRefAbbrTxt250,STAT_REF_ABBR_TXT_250_LEN);
   	
   }
   
     /**
	 * 	Update StatRefAbbrTxt250 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStatRefAbbrTxt250(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStatRefAbbrTxt250+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of statRefDesc250
	 *	@return statRefDesc250
	 */
   public char[] getStatRefDesc250() throws CFException{
     if (isStatRefDesc250Modified()) { 
        statRefDesc250 = refreshStatRefDesc250();
     }
   		return statRefDesc250;
   }

  
	/**
	*  set variable statRefDesc250
	*  Corresponding COBOL Variable is 250-STAT-REF-DESC
	*  @param value
	**/
   public void setStatRefDesc250(char[] value) {
      statRefDesc250 = checkStatRefDesc250Constraints(value);
      serializeStatRefDesc250(statRefDesc250);
   } 

     /**
	 * 	Update StatRefDesc250 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStatRefDesc250(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStatRefDesc250,statRefDesc250.length);
   	
   }
   
   public void setStatRefDesc250(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStatRefDesc250,statRefDesc250.length);
   	
   }
   
     /**
	 * 	Update StatRefDesc250 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStatRefDesc250(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStatRefDesc250+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StatRefDesc250 with another Field
	 *	@param value
	 */
   public void setStatRefDesc250(Field source) {
       replace(source,0,source.length(),beginStatRefDesc250,STAT_REF_DESC_250_LEN);
   	
   }  
   
     /**
	 * 	Update StatRefDesc250 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStatRefDesc250(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStatRefDesc250,STAT_REF_DESC_250_LEN);
   	
   }
   
     /**
	 * 	Update StatRefDesc250 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStatRefDesc250(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStatRefDesc250+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of stsLstUpdtUid250
	 *	@return stsLstUpdtUid250
	 */
   public char[] getStsLstUpdtUid250() throws CFException{
     if (isStsLstUpdtUid250Modified()) { 
        stsLstUpdtUid250 = refreshStsLstUpdtUid250();
     }
   		return stsLstUpdtUid250;
   }

  
	/**
	*  set variable stsLstUpdtUid250
	*  Corresponding COBOL Variable is 250-STS-LST-UPDT-UID
	*  @param value
	**/
   public void setStsLstUpdtUid250(char[] value) {
      stsLstUpdtUid250 = checkStsLstUpdtUid250Constraints(value);
      serializeStsLstUpdtUid250(stsLstUpdtUid250);
   } 

     /**
	 * 	Update StsLstUpdtUid250 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStsLstUpdtUid250(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStsLstUpdtUid250,stsLstUpdtUid250.length);
   	
   }
   
   public void setStsLstUpdtUid250(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStsLstUpdtUid250,stsLstUpdtUid250.length);
   	
   }
   
     /**
	 * 	Update StsLstUpdtUid250 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsLstUpdtUid250(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsLstUpdtUid250+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StsLstUpdtUid250 with another Field
	 *	@param value
	 */
   public void setStsLstUpdtUid250(Field source) {
       replace(source,0,source.length(),beginStsLstUpdtUid250,STS_LST_UPDT_UID_250_LEN);
   	
   }  
   
     /**
	 * 	Update StsLstUpdtUid250 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStsLstUpdtUid250(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStsLstUpdtUid250,STS_LST_UPDT_UID_250_LEN);
   	
   }
   
     /**
	 * 	Update StsLstUpdtUid250 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsLstUpdtUid250(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsLstUpdtUid250+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of stsLstUpdtTs250
	 *	@return stsLstUpdtTs250
	 */
   public char[] getStsLstUpdtTs250() throws CFException{
     if (isStsLstUpdtTs250Modified()) { 
        stsLstUpdtTs250 = refreshStsLstUpdtTs250();
     }
   		return stsLstUpdtTs250;
   }

  
	/**
	*  set variable stsLstUpdtTs250
	*  Corresponding COBOL Variable is 250-STS-LST-UPDT-TS
	*  @param value
	**/
   public void setStsLstUpdtTs250(char[] value) {
      stsLstUpdtTs250 = checkStsLstUpdtTs250Constraints(value);
      serializeStsLstUpdtTs250(stsLstUpdtTs250);
   } 

     /**
	 * 	Update StsLstUpdtTs250 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStsLstUpdtTs250(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStsLstUpdtTs250,stsLstUpdtTs250.length);
   	
   }
   
   public void setStsLstUpdtTs250(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStsLstUpdtTs250,stsLstUpdtTs250.length);
   	
   }
   
     /**
	 * 	Update StsLstUpdtTs250 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsLstUpdtTs250(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsLstUpdtTs250+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StsLstUpdtTs250 with another Field
	 *	@param value
	 */
   public void setStsLstUpdtTs250(Field source) {
       replace(source,0,source.length(),beginStsLstUpdtTs250,STS_LST_UPDT_TS_250_LEN);
   	
   }  
   
     /**
	 * 	Update StsLstUpdtTs250 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStsLstUpdtTs250(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStsLstUpdtTs250,STS_LST_UPDT_TS_250_LEN);
   	
   }
   
     /**
	 * 	Update StsLstUpdtTs250 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsLstUpdtTs250(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsLstUpdtTs250+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes StsOutputParm250
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setGftStatCd250(CONSTANTS.SPACE);
         setHubStatCd250(CONSTANTS.SPACE_2);
         setE2eStatCd250(CONSTANTS.SPACE_2);
         setStatRefAbbrTxt250(CONSTANTS.SPACE_14);
         setStatRefDesc250(CONSTANTS.SPACE_80);
         setStsLstUpdtUid250(CONSTANTS.SPACE_9);
         setStsLstUpdtTs250(CONSTANTS.SPACE_26);
   }

		public static int getStsOutputParm250FieldLength() {
			return STS_OUTPUT_PARM_250_LENGTH;
		}

}
  
