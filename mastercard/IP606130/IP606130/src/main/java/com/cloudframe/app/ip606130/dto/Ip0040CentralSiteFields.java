package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040CentralSiteFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip0040CentralSiteFields extends Ip0040CentralSiteFieldsSerialized { 
   

						private char[] ip0040ChbConvExclId = Field.fillLowValue(1);

								private long ip0040ChbConvExclExpire;

						private char[] ip0040HardshipIndicator = Field.fillLowValue(1);

								private long ip0040HardshipEffective;

								private long ip0040HardshipExpiration;

						private char[] ip0040GamingCountrySw = Field.fillLowValue(1);

								private int ip0040CrossBorderInd;

						private char[] ip0040RecPaymtCanSw = Field.fillLowValue(1);

						private char[] ip0040DomDbtParticipSw = Field.fillLowValue(1);
				private Ip0040GrpCode ip0040GrpCode = new Ip0040GrpCode();

						private char[] ip0040IpcFraudCtlSw = Field.fillLowValue(1);

						private char[] ip0040IccrParticipInd = Field.fillLowValue(1);

						private char[] ip0040RevCreditInd = Field.fillLowValue(1);

						private char[] ip0040ChgbkBkoutInd = Field.fillLowValue(1);

						private char[] ip0040RtnTrnstNum = Field.fillLowValue(10);

								private long ip0040TrueIssuerIca;

						private char[] ip0040MerchantTaxIdSw = Field.fillLowValue(1);

						private char[] ip0040InstallServSw = Field.fillLowValue(1);

						private char[] ip0040TokenServiceInd = Field.fillLowValue(1);

						private char[] ip0040GbsBillInd = Field.fillLowValue(1);

						private char[] ip0040InstallAuthSw = Field.fillLowValue(1);

						private char[] ip0040SeqServiceInd = Field.fillLowValue(1);

						private char[] ip0040CbfmParticipInd = Field.fillLowValue(1);

						private char[] ip0040CbcmParticipInd = Field.fillLowValue(1);

						private char[] ip0040CbfmDccSw = Field.fillLowValue(1);

						private char[] ip0040InstApiGcmsSw = Field.fillLowValue(1);

						private char[] ip0040InsEnabApiInd = Field.fillLowValue(1);

						private char[] ip0040InstApiUiSw = Field.fillLowValue(1);

						private char[] ip0040MstrpassAchProgInd = Field.fillLowValue(1);

						private char[] ip0040OboInd = Field.fillLowValue(1);

						private char[] ip0040MultCurrSw = Field.fillLowValue(1);

								private long ip0040AnonIndEffDate;
	
	/**
	* Constructor for Ip0040CentralSiteFields
	**/
    public Ip0040CentralSiteFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0040CentralSiteFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040CentralSiteFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip0040GrpCode.setParent(this,getStartOffset() + 24);
    } 

	/**
	 *	Returns the value of ip0040ChbConvExclId
	 *	@return ip0040ChbConvExclId
	 */
   public char[] getIp0040ChbConvExclId() throws CFException{
     if (isIp0040ChbConvExclIdModified()) { 
        ip0040ChbConvExclId = refreshIp0040ChbConvExclId();
     }
   		return ip0040ChbConvExclId;
   }

  
	/**
	*  set variable ip0040ChbConvExclId
	*  Corresponding COBOL Variable is IP0040-CHB-CONV-EXCL-ID
	*  @param value
	**/
   public void setIp0040ChbConvExclId(char[] value) {
      ip0040ChbConvExclId = checkIp0040ChbConvExclIdConstraints(value);
      serializeIp0040ChbConvExclId(ip0040ChbConvExclId);
   } 

     /**
	 * 	Update Ip0040ChbConvExclId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040ChbConvExclId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040ChbConvExclId,ip0040ChbConvExclId.length);
   	
   }
   
   public void setIp0040ChbConvExclId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ChbConvExclId,ip0040ChbConvExclId.length);
   	
   }
   
     /**
	 * 	Update Ip0040ChbConvExclId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040ChbConvExclId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ChbConvExclId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040ChbConvExclId with another Field
	 *	@param value
	 */
   public void setIp0040ChbConvExclId(Field source) {
       replace(source,0,source.length(),beginIp0040ChbConvExclId,IP_0040_CHB_CONV_EXCL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040ChbConvExclId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040ChbConvExclId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040ChbConvExclId,IP_0040_CHB_CONV_EXCL_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040ChbConvExclId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040ChbConvExclId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ChbConvExclId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040ChbConvExclExpire
	 *	@return ip0040ChbConvExclExpire
	 */
	public long getIp0040ChbConvExclExpire() throws CFException {
       if (isIp0040ChbConvExclExpireModified()) { 
           ip0040ChbConvExclExpire = refreshIp0040ChbConvExclExpire();
        }
   		return ip0040ChbConvExclExpire;
	}
	

	
	   
	/**
	 * 	Update Ip0040ChbConvExclExpire with the passed value
	 *  Corresponding COBOL Variable is IP0040-CHB-CONV-EXCL-EXPIRE
	 *	@param number
	 */
	public void setIp0040ChbConvExclExpire(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040ChbConvExclExpire = checkIp0040ChbConvExclExpireMaxLimit(number); 
		serializeIp0040ChbConvExclExpire(ip0040ChbConvExclExpire);
	}
	

	/**
	 * 	Update Ip0040ChbConvExclExpire with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040ChbConvExclExpire(char[] value) throws CFException {
		 ip0040ChbConvExclExpire = serializeIp0040ChbConvExclExpire(value);
	}
	/**
	 * 	Update Ip0040ChbConvExclExpire with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040ChbConvExclExpireString(char[] value) throws CFException {
		 setIp0040ChbConvExclExpire(value);
	}
	/**
	 *	Returns the value of ip0040HardshipIndicator
	 *	@return ip0040HardshipIndicator
	 */
   public char[] getIp0040HardshipIndicator() throws CFException{
     if (isIp0040HardshipIndicatorModified()) { 
        ip0040HardshipIndicator = refreshIp0040HardshipIndicator();
     }
   		return ip0040HardshipIndicator;
   }

  
	/**
	*  set variable ip0040HardshipIndicator
	*  Corresponding COBOL Variable is IP0040-HARDSHIP-INDICATOR
	*  @param value
	**/
   public void setIp0040HardshipIndicator(char[] value) {
      ip0040HardshipIndicator = checkIp0040HardshipIndicatorConstraints(value);
      serializeIp0040HardshipIndicator(ip0040HardshipIndicator);
   } 

     /**
	 * 	Update Ip0040HardshipIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040HardshipIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040HardshipIndicator,ip0040HardshipIndicator.length);
   	
   }
   
   public void setIp0040HardshipIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040HardshipIndicator,ip0040HardshipIndicator.length);
   	
   }
   
     /**
	 * 	Update Ip0040HardshipIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040HardshipIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040HardshipIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040HardshipIndicator with another Field
	 *	@param value
	 */
   public void setIp0040HardshipIndicator(Field source) {
       replace(source,0,source.length(),beginIp0040HardshipIndicator,IP_0040_HARDSHIP_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040HardshipIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040HardshipIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040HardshipIndicator,IP_0040_HARDSHIP_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040HardshipIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040HardshipIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040HardshipIndicator+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040HardshipEffective
	 *	@return ip0040HardshipEffective
	 */
	public long getIp0040HardshipEffective() throws CFException {
       if (isIp0040HardshipEffectiveModified()) { 
           ip0040HardshipEffective = refreshIp0040HardshipEffective();
        }
   		return ip0040HardshipEffective;
	}
	

	
	   
	/**
	 * 	Update Ip0040HardshipEffective with the passed value
	 *  Corresponding COBOL Variable is IP0040-HARDSHIP-EFFECTIVE
	 *	@param number
	 */
	public void setIp0040HardshipEffective(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040HardshipEffective = checkIp0040HardshipEffectiveMaxLimit(number); 
		serializeIp0040HardshipEffective(ip0040HardshipEffective);
	}
	

	/**
	 * 	Update Ip0040HardshipEffective with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040HardshipEffective(char[] value) throws CFException {
		 ip0040HardshipEffective = serializeIp0040HardshipEffective(value);
	}
	/**
	 * 	Update Ip0040HardshipEffective with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040HardshipEffectiveString(char[] value) throws CFException {
		 setIp0040HardshipEffective(value);
	}
	/**
	 *	Returns the value of ip0040HardshipExpiration
	 *	@return ip0040HardshipExpiration
	 */
	public long getIp0040HardshipExpiration() throws CFException {
       if (isIp0040HardshipExpirationModified()) { 
           ip0040HardshipExpiration = refreshIp0040HardshipExpiration();
        }
   		return ip0040HardshipExpiration;
	}
	

	
	   
	/**
	 * 	Update Ip0040HardshipExpiration with the passed value
	 *  Corresponding COBOL Variable is IP0040-HARDSHIP-EXPIRATION
	 *	@param number
	 */
	public void setIp0040HardshipExpiration(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040HardshipExpiration = checkIp0040HardshipExpirationMaxLimit(number); 
		serializeIp0040HardshipExpiration(ip0040HardshipExpiration);
	}
	

	/**
	 * 	Update Ip0040HardshipExpiration with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040HardshipExpiration(char[] value) throws CFException {
		 ip0040HardshipExpiration = serializeIp0040HardshipExpiration(value);
	}
	/**
	 * 	Update Ip0040HardshipExpiration with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040HardshipExpirationString(char[] value) throws CFException {
		 setIp0040HardshipExpiration(value);
	}
	/**
	 *	Returns the value of ip0040GamingCountrySw
	 *	@return ip0040GamingCountrySw
	 */
   public char[] getIp0040GamingCountrySw() throws CFException{
     if (isIp0040GamingCountrySwModified()) { 
        ip0040GamingCountrySw = refreshIp0040GamingCountrySw();
     }
   		return ip0040GamingCountrySw;
   }

  
	/**
	*  set variable ip0040GamingCountrySw
	*  Corresponding COBOL Variable is IP0040-GAMING-COUNTRY-SW
	*  @param value
	**/
   public void setIp0040GamingCountrySw(char[] value) {
      ip0040GamingCountrySw = checkIp0040GamingCountrySwConstraints(value);
      serializeIp0040GamingCountrySw(ip0040GamingCountrySw);
   } 

     /**
	 * 	Update Ip0040GamingCountrySw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040GamingCountrySw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040GamingCountrySw,ip0040GamingCountrySw.length);
   	
   }
   
   public void setIp0040GamingCountrySw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040GamingCountrySw,ip0040GamingCountrySw.length);
   	
   }
   
     /**
	 * 	Update Ip0040GamingCountrySw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040GamingCountrySw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040GamingCountrySw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040GamingCountrySw with another Field
	 *	@param value
	 */
   public void setIp0040GamingCountrySw(Field source) {
       replace(source,0,source.length(),beginIp0040GamingCountrySw,IP_0040_GAMING_COUNTRY_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040GamingCountrySw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040GamingCountrySw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040GamingCountrySw,IP_0040_GAMING_COUNTRY_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040GamingCountrySw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040GamingCountrySw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040GamingCountrySw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040CrossBorderInd
	 *	@return ip0040CrossBorderInd
	 */
	public int getIp0040CrossBorderInd() throws CFException {
       if (isIp0040CrossBorderIndModified()) { 
           ip0040CrossBorderInd = refreshIp0040CrossBorderInd();
        }
   		return ip0040CrossBorderInd;
	}
	

	
	   
	/**
	 * 	Update Ip0040CrossBorderInd with the passed value
	 *  Corresponding COBOL Variable is IP0040-CROSS-BORDER-IND
	 *	@param number
	 */
	public void setIp0040CrossBorderInd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040CrossBorderInd = checkIp0040CrossBorderIndMaxLimit(number); 
		serializeIp0040CrossBorderInd(ip0040CrossBorderInd);
	}
	

	public void setIp0040CrossBorderInd(long number) {
	    number = checkIp0040CrossBorderIndMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0040CrossBorderInd((int)number);
	}
	
	/**
	 * 	Update Ip0040CrossBorderInd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040CrossBorderInd(char[] value) throws CFException {
		 ip0040CrossBorderInd = serializeIp0040CrossBorderInd(value);
	}
	/**
	 * 	Update Ip0040CrossBorderInd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040CrossBorderIndString(char[] value) throws CFException {
		 setIp0040CrossBorderInd(value);
	}
	/**
	 *	Returns the value of ip0040RecPaymtCanSw
	 *	@return ip0040RecPaymtCanSw
	 */
   public char[] getIp0040RecPaymtCanSw() throws CFException{
     if (isIp0040RecPaymtCanSwModified()) { 
        ip0040RecPaymtCanSw = refreshIp0040RecPaymtCanSw();
     }
   		return ip0040RecPaymtCanSw;
   }

  
	/**
	*  set variable ip0040RecPaymtCanSw
	*  Corresponding COBOL Variable is IP0040-REC-PAYMT-CAN-SW
	*  @param value
	**/
   public void setIp0040RecPaymtCanSw(char[] value) {
      ip0040RecPaymtCanSw = checkIp0040RecPaymtCanSwConstraints(value);
      serializeIp0040RecPaymtCanSw(ip0040RecPaymtCanSw);
   } 

     /**
	 * 	Update Ip0040RecPaymtCanSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040RecPaymtCanSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040RecPaymtCanSw,ip0040RecPaymtCanSw.length);
   	
   }
   
   public void setIp0040RecPaymtCanSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040RecPaymtCanSw,ip0040RecPaymtCanSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040RecPaymtCanSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040RecPaymtCanSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040RecPaymtCanSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040RecPaymtCanSw with another Field
	 *	@param value
	 */
   public void setIp0040RecPaymtCanSw(Field source) {
       replace(source,0,source.length(),beginIp0040RecPaymtCanSw,IP_0040_REC_PAYMT_CAN_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040RecPaymtCanSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040RecPaymtCanSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040RecPaymtCanSw,IP_0040_REC_PAYMT_CAN_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040RecPaymtCanSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040RecPaymtCanSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040RecPaymtCanSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040DomDbtParticipSw
	 *	@return ip0040DomDbtParticipSw
	 */
   public char[] getIp0040DomDbtParticipSw() throws CFException{
     if (isIp0040DomDbtParticipSwModified()) { 
        ip0040DomDbtParticipSw = refreshIp0040DomDbtParticipSw();
     }
   		return ip0040DomDbtParticipSw;
   }

  
	/**
	*  set variable ip0040DomDbtParticipSw
	*  Corresponding COBOL Variable is IP0040-DOM-DBT-PARTICIP-SW
	*  @param value
	**/
   public void setIp0040DomDbtParticipSw(char[] value) {
      ip0040DomDbtParticipSw = checkIp0040DomDbtParticipSwConstraints(value);
      serializeIp0040DomDbtParticipSw(ip0040DomDbtParticipSw);
   } 

     /**
	 * 	Update Ip0040DomDbtParticipSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040DomDbtParticipSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040DomDbtParticipSw,ip0040DomDbtParticipSw.length);
   	
   }
   
   public void setIp0040DomDbtParticipSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040DomDbtParticipSw,ip0040DomDbtParticipSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040DomDbtParticipSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040DomDbtParticipSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040DomDbtParticipSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040DomDbtParticipSw with another Field
	 *	@param value
	 */
   public void setIp0040DomDbtParticipSw(Field source) {
       replace(source,0,source.length(),beginIp0040DomDbtParticipSw,IP_0040_DOM_DBT_PARTICIP_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040DomDbtParticipSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040DomDbtParticipSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040DomDbtParticipSw,IP_0040_DOM_DBT_PARTICIP_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040DomDbtParticipSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040DomDbtParticipSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040DomDbtParticipSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040GrpCode
	 *	@return ip0040GrpCode
	 */   
	 public Ip0040GrpCode getIp0040GrpCode() {
   	return ip0040GrpCode;
   }
   /**
	* 	Update Ip0040GrpCode with the passed value
	*   Corresponding COBOL Variable is IP0040-GRP-CODE
	*	@param value
	*/
   public void setIp0040GrpCode(char[] value) {
      ip0040GrpCode.setString(value); 
   }   
    
     /**
	 * 	Update Ip0040GrpCode 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0040GrpCode(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040GrpCode.begin,ip0040GrpCode.length());
   }
   
     /**
	 * 	Update Ip0040GrpCode 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040GrpCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040GrpCode.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0040GrpCode with another Field
	 *	@param value
	 */
   public void setIp0040GrpCode(Field source) {
   	replace(source,0,source.length(),ip0040GrpCode.begin,ip0040GrpCode.length());
   }  
   
     /**
	 * 	Update Ip0040GrpCode 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0040GrpCode(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040GrpCode.begin,ip0040GrpCode.length());
   }
   
     /**
	 * 	Update Ip0040GrpCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040GrpCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040GrpCode.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip0040IpcFraudCtlSw
	 *	@return ip0040IpcFraudCtlSw
	 */
   public char[] getIp0040IpcFraudCtlSw() throws CFException{
     if (isIp0040IpcFraudCtlSwModified()) { 
        ip0040IpcFraudCtlSw = refreshIp0040IpcFraudCtlSw();
     }
   		return ip0040IpcFraudCtlSw;
   }

  
	/**
	*  set variable ip0040IpcFraudCtlSw
	*  Corresponding COBOL Variable is IP0040-IPC-FRAUD-CTL-SW
	*  @param value
	**/
   public void setIp0040IpcFraudCtlSw(char[] value) {
      ip0040IpcFraudCtlSw = checkIp0040IpcFraudCtlSwConstraints(value);
      serializeIp0040IpcFraudCtlSw(ip0040IpcFraudCtlSw);
   } 

     /**
	 * 	Update Ip0040IpcFraudCtlSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040IpcFraudCtlSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040IpcFraudCtlSw,ip0040IpcFraudCtlSw.length);
   	
   }
   
   public void setIp0040IpcFraudCtlSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040IpcFraudCtlSw,ip0040IpcFraudCtlSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040IpcFraudCtlSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040IpcFraudCtlSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040IpcFraudCtlSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040IpcFraudCtlSw with another Field
	 *	@param value
	 */
   public void setIp0040IpcFraudCtlSw(Field source) {
       replace(source,0,source.length(),beginIp0040IpcFraudCtlSw,IP_0040_IPC_FRAUD_CTL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040IpcFraudCtlSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040IpcFraudCtlSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040IpcFraudCtlSw,IP_0040_IPC_FRAUD_CTL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040IpcFraudCtlSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040IpcFraudCtlSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040IpcFraudCtlSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040IccrParticipInd
	 *	@return ip0040IccrParticipInd
	 */
   public char[] getIp0040IccrParticipInd() throws CFException{
     if (isIp0040IccrParticipIndModified()) { 
        ip0040IccrParticipInd = refreshIp0040IccrParticipInd();
     }
   		return ip0040IccrParticipInd;
   }

  
	/**
	*  set variable ip0040IccrParticipInd
	*  Corresponding COBOL Variable is IP0040-ICCR-PARTICIP-IND
	*  @param value
	**/
   public void setIp0040IccrParticipInd(char[] value) {
      ip0040IccrParticipInd = checkIp0040IccrParticipIndConstraints(value);
      serializeIp0040IccrParticipInd(ip0040IccrParticipInd);
   } 

     /**
	 * 	Update Ip0040IccrParticipInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040IccrParticipInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040IccrParticipInd,ip0040IccrParticipInd.length);
   	
   }
   
   public void setIp0040IccrParticipInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040IccrParticipInd,ip0040IccrParticipInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040IccrParticipInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040IccrParticipInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040IccrParticipInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040IccrParticipInd with another Field
	 *	@param value
	 */
   public void setIp0040IccrParticipInd(Field source) {
       replace(source,0,source.length(),beginIp0040IccrParticipInd,IP_0040_ICCR_PARTICIP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040IccrParticipInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040IccrParticipInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040IccrParticipInd,IP_0040_ICCR_PARTICIP_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040IccrParticipInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040IccrParticipInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040IccrParticipInd+targetIndex,targetLen);
    
   }
	char[] ip0040ItIsIccr8888Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isIp0040ItIsIccr88()
	 *	@return  Returns true if isIp0040ItIsIccr88() is "I"
	 */
   public boolean isIp0040ItIsIccr88() throws CFException {
      return (  compareChars( getIp0040IccrParticipInd() , ip0040ItIsIccr8888Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setIp0040ItIsIccr88True() {  			
    	setIp0040IccrParticipInd( ip0040ItIsIccr8888Value);
   	}
	char[] ip0040ItIsCccr8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp0040ItIsCccr88()
	 *	@return  Returns true if isIp0040ItIsCccr88() is "C"
	 */
   public boolean isIp0040ItIsCccr88() throws CFException {
      return (  compareChars( getIp0040IccrParticipInd() , ip0040ItIsCccr8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp0040ItIsCccr88True() {  			
    	setIp0040IccrParticipInd( ip0040ItIsCccr8888Value);
   	}
	char[] ip0040ItIsCcm8888Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isIp0040ItIsCcm88()
	 *	@return  Returns true if isIp0040ItIsCcm88() is "E"
	 */
   public boolean isIp0040ItIsCcm88() throws CFException {
      return (  compareChars( getIp0040IccrParticipInd() , ip0040ItIsCcm8888Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setIp0040ItIsCcm88True() {  			
    	setIp0040IccrParticipInd( ip0040ItIsCcm8888Value);
   	}
	/**
	 *	Returns the value of ip0040RevCreditInd
	 *	@return ip0040RevCreditInd
	 */
   public char[] getIp0040RevCreditInd() throws CFException{
     if (isIp0040RevCreditIndModified()) { 
        ip0040RevCreditInd = refreshIp0040RevCreditInd();
     }
   		return ip0040RevCreditInd;
   }

  
	/**
	*  set variable ip0040RevCreditInd
	*  Corresponding COBOL Variable is IP0040-REV-CREDIT-IND
	*  @param value
	**/
   public void setIp0040RevCreditInd(char[] value) {
      ip0040RevCreditInd = checkIp0040RevCreditIndConstraints(value);
      serializeIp0040RevCreditInd(ip0040RevCreditInd);
   } 

     /**
	 * 	Update Ip0040RevCreditInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040RevCreditInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040RevCreditInd,ip0040RevCreditInd.length);
   	
   }
   
   public void setIp0040RevCreditInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040RevCreditInd,ip0040RevCreditInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040RevCreditInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040RevCreditInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040RevCreditInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040RevCreditInd with another Field
	 *	@param value
	 */
   public void setIp0040RevCreditInd(Field source) {
       replace(source,0,source.length(),beginIp0040RevCreditInd,IP_0040_REV_CREDIT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040RevCreditInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040RevCreditInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040RevCreditInd,IP_0040_REV_CREDIT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040RevCreditInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040RevCreditInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040RevCreditInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040ChgbkBkoutInd
	 *	@return ip0040ChgbkBkoutInd
	 */
   public char[] getIp0040ChgbkBkoutInd() throws CFException{
     if (isIp0040ChgbkBkoutIndModified()) { 
        ip0040ChgbkBkoutInd = refreshIp0040ChgbkBkoutInd();
     }
   		return ip0040ChgbkBkoutInd;
   }

  
	/**
	*  set variable ip0040ChgbkBkoutInd
	*  Corresponding COBOL Variable is IP0040-CHGBK-BKOUT-IND
	*  @param value
	**/
   public void setIp0040ChgbkBkoutInd(char[] value) {
      ip0040ChgbkBkoutInd = checkIp0040ChgbkBkoutIndConstraints(value);
      serializeIp0040ChgbkBkoutInd(ip0040ChgbkBkoutInd);
   } 

     /**
	 * 	Update Ip0040ChgbkBkoutInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040ChgbkBkoutInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040ChgbkBkoutInd,ip0040ChgbkBkoutInd.length);
   	
   }
   
   public void setIp0040ChgbkBkoutInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ChgbkBkoutInd,ip0040ChgbkBkoutInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040ChgbkBkoutInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040ChgbkBkoutInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ChgbkBkoutInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040ChgbkBkoutInd with another Field
	 *	@param value
	 */
   public void setIp0040ChgbkBkoutInd(Field source) {
       replace(source,0,source.length(),beginIp0040ChgbkBkoutInd,IP_0040_CHGBK_BKOUT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040ChgbkBkoutInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040ChgbkBkoutInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040ChgbkBkoutInd,IP_0040_CHGBK_BKOUT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040ChgbkBkoutInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040ChgbkBkoutInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ChgbkBkoutInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040RtnTrnstNum
	 *	@return ip0040RtnTrnstNum
	 */
   public char[] getIp0040RtnTrnstNum() throws CFException{
     if (isIp0040RtnTrnstNumModified()) { 
        ip0040RtnTrnstNum = refreshIp0040RtnTrnstNum();
     }
   		return ip0040RtnTrnstNum;
   }

  
	/**
	*  set variable ip0040RtnTrnstNum
	*  Corresponding COBOL Variable is IP0040-RTN-TRNST-NUM
	*  @param value
	**/
   public void setIp0040RtnTrnstNum(char[] value) {
      ip0040RtnTrnstNum = checkIp0040RtnTrnstNumConstraints(value);
      serializeIp0040RtnTrnstNum(ip0040RtnTrnstNum);
   } 

     /**
	 * 	Update Ip0040RtnTrnstNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040RtnTrnstNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040RtnTrnstNum,ip0040RtnTrnstNum.length);
   	
   }
   
   public void setIp0040RtnTrnstNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040RtnTrnstNum,ip0040RtnTrnstNum.length);
   	
   }
   
     /**
	 * 	Update Ip0040RtnTrnstNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040RtnTrnstNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040RtnTrnstNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040RtnTrnstNum with another Field
	 *	@param value
	 */
   public void setIp0040RtnTrnstNum(Field source) {
       replace(source,0,source.length(),beginIp0040RtnTrnstNum,IP_0040_RTN_TRNST_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040RtnTrnstNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040RtnTrnstNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040RtnTrnstNum,IP_0040_RTN_TRNST_NUM_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040RtnTrnstNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040RtnTrnstNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040RtnTrnstNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040TrueIssuerIca
	 *	@return ip0040TrueIssuerIca
	 */
	public long getIp0040TrueIssuerIca() throws CFException {
       if (isIp0040TrueIssuerIcaModified()) { 
           ip0040TrueIssuerIca = refreshIp0040TrueIssuerIca();
        }
   		return ip0040TrueIssuerIca;
	}
	

	
	   
	/**
	 * 	Update Ip0040TrueIssuerIca with the passed value
	 *  Corresponding COBOL Variable is IP0040-TRUE-ISSUER-ICA
	 *	@param number
	 */
	public void setIp0040TrueIssuerIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040TrueIssuerIca = checkIp0040TrueIssuerIcaMaxLimit(number); 
		serializeIp0040TrueIssuerIca(ip0040TrueIssuerIca);
	}
	

	/**
	 * 	Update Ip0040TrueIssuerIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040TrueIssuerIca(char[] value) throws CFException {
		 ip0040TrueIssuerIca = serializeIp0040TrueIssuerIca(value);
	}
	/**
	 * 	Update Ip0040TrueIssuerIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040TrueIssuerIcaString(char[] value) throws CFException {
		 setIp0040TrueIssuerIca(value);
	}
	/**
	 *	Returns the value of ip0040MerchantTaxIdSw
	 *	@return ip0040MerchantTaxIdSw
	 */
   public char[] getIp0040MerchantTaxIdSw() throws CFException{
     if (isIp0040MerchantTaxIdSwModified()) { 
        ip0040MerchantTaxIdSw = refreshIp0040MerchantTaxIdSw();
     }
   		return ip0040MerchantTaxIdSw;
   }

  
	/**
	*  set variable ip0040MerchantTaxIdSw
	*  Corresponding COBOL Variable is IP0040-MERCHANT-TAX-ID-SW
	*  @param value
	**/
   public void setIp0040MerchantTaxIdSw(char[] value) {
      ip0040MerchantTaxIdSw = checkIp0040MerchantTaxIdSwConstraints(value);
      serializeIp0040MerchantTaxIdSw(ip0040MerchantTaxIdSw);
   } 

     /**
	 * 	Update Ip0040MerchantTaxIdSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040MerchantTaxIdSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040MerchantTaxIdSw,ip0040MerchantTaxIdSw.length);
   	
   }
   
   public void setIp0040MerchantTaxIdSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040MerchantTaxIdSw,ip0040MerchantTaxIdSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040MerchantTaxIdSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040MerchantTaxIdSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040MerchantTaxIdSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040MerchantTaxIdSw with another Field
	 *	@param value
	 */
   public void setIp0040MerchantTaxIdSw(Field source) {
       replace(source,0,source.length(),beginIp0040MerchantTaxIdSw,IP_0040_MERCHANT_TAX_ID_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040MerchantTaxIdSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040MerchantTaxIdSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040MerchantTaxIdSw,IP_0040_MERCHANT_TAX_ID_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040MerchantTaxIdSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040MerchantTaxIdSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040MerchantTaxIdSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040InstallServSw
	 *	@return ip0040InstallServSw
	 */
   public char[] getIp0040InstallServSw() throws CFException{
     if (isIp0040InstallServSwModified()) { 
        ip0040InstallServSw = refreshIp0040InstallServSw();
     }
   		return ip0040InstallServSw;
   }

  
	/**
	*  set variable ip0040InstallServSw
	*  Corresponding COBOL Variable is IP0040-INSTALL-SERV-SW
	*  @param value
	**/
   public void setIp0040InstallServSw(char[] value) {
      ip0040InstallServSw = checkIp0040InstallServSwConstraints(value);
      serializeIp0040InstallServSw(ip0040InstallServSw);
   } 

     /**
	 * 	Update Ip0040InstallServSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040InstallServSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040InstallServSw,ip0040InstallServSw.length);
   	
   }
   
   public void setIp0040InstallServSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040InstallServSw,ip0040InstallServSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040InstallServSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040InstallServSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040InstallServSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040InstallServSw with another Field
	 *	@param value
	 */
   public void setIp0040InstallServSw(Field source) {
       replace(source,0,source.length(),beginIp0040InstallServSw,IP_0040_INSTALL_SERV_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040InstallServSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040InstallServSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040InstallServSw,IP_0040_INSTALL_SERV_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040InstallServSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040InstallServSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040InstallServSw+targetIndex,targetLen);
    
   }
	char[] ip0040InstallServSwY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040InstallServSwY88()
	 *	@return  Returns true if isIp0040InstallServSwY88() is "Y"
	 */
   public boolean isIp0040InstallServSwY88() throws CFException {
      return (  compareChars( getIp0040InstallServSw() , ip0040InstallServSwY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040InstallServSwY88True() {  			
    	setIp0040InstallServSw( ip0040InstallServSwY8888Value);
   	}
	char[] ip0040InstallServSwN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040InstallServSwN88()
	 *	@return  Returns true if isIp0040InstallServSwN88() is "N"
	 */
   public boolean isIp0040InstallServSwN88() throws CFException {
      return (  compareChars( getIp0040InstallServSw() , ip0040InstallServSwN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040InstallServSwN88True() {  			
    	setIp0040InstallServSw( ip0040InstallServSwN8888Value);
   	}
	/**
	 *	Returns the value of ip0040TokenServiceInd
	 *	@return ip0040TokenServiceInd
	 */
   public char[] getIp0040TokenServiceInd() throws CFException{
     if (isIp0040TokenServiceIndModified()) { 
        ip0040TokenServiceInd = refreshIp0040TokenServiceInd();
     }
   		return ip0040TokenServiceInd;
   }

  
	/**
	*  set variable ip0040TokenServiceInd
	*  Corresponding COBOL Variable is IP0040-TOKEN-SERVICE-IND
	*  @param value
	**/
   public void setIp0040TokenServiceInd(char[] value) {
      ip0040TokenServiceInd = checkIp0040TokenServiceIndConstraints(value);
      serializeIp0040TokenServiceInd(ip0040TokenServiceInd);
   } 

     /**
	 * 	Update Ip0040TokenServiceInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040TokenServiceInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040TokenServiceInd,ip0040TokenServiceInd.length);
   	
   }
   
   public void setIp0040TokenServiceInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040TokenServiceInd,ip0040TokenServiceInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040TokenServiceInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040TokenServiceInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040TokenServiceInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040TokenServiceInd with another Field
	 *	@param value
	 */
   public void setIp0040TokenServiceInd(Field source) {
       replace(source,0,source.length(),beginIp0040TokenServiceInd,IP_0040_TOKEN_SERVICE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040TokenServiceInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040TokenServiceInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040TokenServiceInd,IP_0040_TOKEN_SERVICE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040TokenServiceInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040TokenServiceInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040TokenServiceInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040GbsBillInd
	 *	@return ip0040GbsBillInd
	 */
   public char[] getIp0040GbsBillInd() throws CFException{
     if (isIp0040GbsBillIndModified()) { 
        ip0040GbsBillInd = refreshIp0040GbsBillInd();
     }
   		return ip0040GbsBillInd;
   }

  
	/**
	*  set variable ip0040GbsBillInd
	*  Corresponding COBOL Variable is IP0040-GBS-BILL-IND
	*  @param value
	**/
   public void setIp0040GbsBillInd(char[] value) {
      ip0040GbsBillInd = checkIp0040GbsBillIndConstraints(value);
      serializeIp0040GbsBillInd(ip0040GbsBillInd);
   } 

     /**
	 * 	Update Ip0040GbsBillInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040GbsBillInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040GbsBillInd,ip0040GbsBillInd.length);
   	
   }
   
   public void setIp0040GbsBillInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040GbsBillInd,ip0040GbsBillInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040GbsBillInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040GbsBillInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040GbsBillInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040GbsBillInd with another Field
	 *	@param value
	 */
   public void setIp0040GbsBillInd(Field source) {
       replace(source,0,source.length(),beginIp0040GbsBillInd,IP_0040_GBS_BILL_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040GbsBillInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040GbsBillInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040GbsBillInd,IP_0040_GBS_BILL_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040GbsBillInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040GbsBillInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040GbsBillInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040InstallAuthSw
	 *	@return ip0040InstallAuthSw
	 */
   public char[] getIp0040InstallAuthSw() throws CFException{
     if (isIp0040InstallAuthSwModified()) { 
        ip0040InstallAuthSw = refreshIp0040InstallAuthSw();
     }
   		return ip0040InstallAuthSw;
   }

  
	/**
	*  set variable ip0040InstallAuthSw
	*  Corresponding COBOL Variable is IP0040-INSTALL-AUTH-SW
	*  @param value
	**/
   public void setIp0040InstallAuthSw(char[] value) {
      ip0040InstallAuthSw = checkIp0040InstallAuthSwConstraints(value);
      serializeIp0040InstallAuthSw(ip0040InstallAuthSw);
   } 

     /**
	 * 	Update Ip0040InstallAuthSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040InstallAuthSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040InstallAuthSw,ip0040InstallAuthSw.length);
   	
   }
   
   public void setIp0040InstallAuthSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040InstallAuthSw,ip0040InstallAuthSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040InstallAuthSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040InstallAuthSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040InstallAuthSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040InstallAuthSw with another Field
	 *	@param value
	 */
   public void setIp0040InstallAuthSw(Field source) {
       replace(source,0,source.length(),beginIp0040InstallAuthSw,IP_0040_INSTALL_AUTH_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040InstallAuthSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040InstallAuthSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040InstallAuthSw,IP_0040_INSTALL_AUTH_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040InstallAuthSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040InstallAuthSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040InstallAuthSw+targetIndex,targetLen);
    
   }
	char[] ip0040InstallAuthSwY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040InstallAuthSwY88()
	 *	@return  Returns true if isIp0040InstallAuthSwY88() is "Y"
	 */
   public boolean isIp0040InstallAuthSwY88() throws CFException {
      return (  compareChars( getIp0040InstallAuthSw() , ip0040InstallAuthSwY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040InstallAuthSwY88True() {  			
    	setIp0040InstallAuthSw( ip0040InstallAuthSwY8888Value);
   	}
	char[] ip0040InstallAuthSwN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040InstallAuthSwN88()
	 *	@return  Returns true if isIp0040InstallAuthSwN88() is "N"
	 */
   public boolean isIp0040InstallAuthSwN88() throws CFException {
      return (  compareChars( getIp0040InstallAuthSw() , ip0040InstallAuthSwN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040InstallAuthSwN88True() {  			
    	setIp0040InstallAuthSw( ip0040InstallAuthSwN8888Value);
   	}
	/**
	 *	Returns the value of ip0040SeqServiceInd
	 *	@return ip0040SeqServiceInd
	 */
   public char[] getIp0040SeqServiceInd() throws CFException{
     if (isIp0040SeqServiceIndModified()) { 
        ip0040SeqServiceInd = refreshIp0040SeqServiceInd();
     }
   		return ip0040SeqServiceInd;
   }

  
	/**
	*  set variable ip0040SeqServiceInd
	*  Corresponding COBOL Variable is IP0040-SEQ-SERVICE-IND
	*  @param value
	**/
   public void setIp0040SeqServiceInd(char[] value) {
      ip0040SeqServiceInd = checkIp0040SeqServiceIndConstraints(value);
      serializeIp0040SeqServiceInd(ip0040SeqServiceInd);
   } 

     /**
	 * 	Update Ip0040SeqServiceInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040SeqServiceInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040SeqServiceInd,ip0040SeqServiceInd.length);
   	
   }
   
   public void setIp0040SeqServiceInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040SeqServiceInd,ip0040SeqServiceInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040SeqServiceInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040SeqServiceInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040SeqServiceInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040SeqServiceInd with another Field
	 *	@param value
	 */
   public void setIp0040SeqServiceInd(Field source) {
       replace(source,0,source.length(),beginIp0040SeqServiceInd,IP_0040_SEQ_SERVICE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040SeqServiceInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040SeqServiceInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040SeqServiceInd,IP_0040_SEQ_SERVICE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040SeqServiceInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040SeqServiceInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040SeqServiceInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040CbfmParticipInd
	 *	@return ip0040CbfmParticipInd
	 */
   public char[] getIp0040CbfmParticipInd() throws CFException{
     if (isIp0040CbfmParticipIndModified()) { 
        ip0040CbfmParticipInd = refreshIp0040CbfmParticipInd();
     }
   		return ip0040CbfmParticipInd;
   }

  
	/**
	*  set variable ip0040CbfmParticipInd
	*  Corresponding COBOL Variable is IP0040-CBFM-PARTICIP-IND
	*  @param value
	**/
   public void setIp0040CbfmParticipInd(char[] value) {
      ip0040CbfmParticipInd = checkIp0040CbfmParticipIndConstraints(value);
      serializeIp0040CbfmParticipInd(ip0040CbfmParticipInd);
   } 

     /**
	 * 	Update Ip0040CbfmParticipInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040CbfmParticipInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040CbfmParticipInd,ip0040CbfmParticipInd.length);
   	
   }
   
   public void setIp0040CbfmParticipInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040CbfmParticipInd,ip0040CbfmParticipInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040CbfmParticipInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040CbfmParticipInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040CbfmParticipInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040CbfmParticipInd with another Field
	 *	@param value
	 */
   public void setIp0040CbfmParticipInd(Field source) {
       replace(source,0,source.length(),beginIp0040CbfmParticipInd,IP_0040_CBFM_PARTICIP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040CbfmParticipInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040CbfmParticipInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040CbfmParticipInd,IP_0040_CBFM_PARTICIP_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040CbfmParticipInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040CbfmParticipInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040CbfmParticipInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040CbcmParticipInd
	 *	@return ip0040CbcmParticipInd
	 */
   public char[] getIp0040CbcmParticipInd() throws CFException{
     if (isIp0040CbcmParticipIndModified()) { 
        ip0040CbcmParticipInd = refreshIp0040CbcmParticipInd();
     }
   		return ip0040CbcmParticipInd;
   }

  
	/**
	*  set variable ip0040CbcmParticipInd
	*  Corresponding COBOL Variable is IP0040-CBCM-PARTICIP-IND
	*  @param value
	**/
   public void setIp0040CbcmParticipInd(char[] value) {
      ip0040CbcmParticipInd = checkIp0040CbcmParticipIndConstraints(value);
      serializeIp0040CbcmParticipInd(ip0040CbcmParticipInd);
   } 

     /**
	 * 	Update Ip0040CbcmParticipInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040CbcmParticipInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040CbcmParticipInd,ip0040CbcmParticipInd.length);
   	
   }
   
   public void setIp0040CbcmParticipInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040CbcmParticipInd,ip0040CbcmParticipInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040CbcmParticipInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040CbcmParticipInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040CbcmParticipInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040CbcmParticipInd with another Field
	 *	@param value
	 */
   public void setIp0040CbcmParticipInd(Field source) {
       replace(source,0,source.length(),beginIp0040CbcmParticipInd,IP_0040_CBCM_PARTICIP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040CbcmParticipInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040CbcmParticipInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040CbcmParticipInd,IP_0040_CBCM_PARTICIP_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040CbcmParticipInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040CbcmParticipInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040CbcmParticipInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040CbfmDccSw
	 *	@return ip0040CbfmDccSw
	 */
   public char[] getIp0040CbfmDccSw() throws CFException{
     if (isIp0040CbfmDccSwModified()) { 
        ip0040CbfmDccSw = refreshIp0040CbfmDccSw();
     }
   		return ip0040CbfmDccSw;
   }

  
	/**
	*  set variable ip0040CbfmDccSw
	*  Corresponding COBOL Variable is IP0040-CBFM-DCC-SW
	*  @param value
	**/
   public void setIp0040CbfmDccSw(char[] value) {
      ip0040CbfmDccSw = checkIp0040CbfmDccSwConstraints(value);
      serializeIp0040CbfmDccSw(ip0040CbfmDccSw);
   } 

     /**
	 * 	Update Ip0040CbfmDccSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040CbfmDccSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040CbfmDccSw,ip0040CbfmDccSw.length);
   	
   }
   
   public void setIp0040CbfmDccSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040CbfmDccSw,ip0040CbfmDccSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040CbfmDccSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040CbfmDccSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040CbfmDccSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040CbfmDccSw with another Field
	 *	@param value
	 */
   public void setIp0040CbfmDccSw(Field source) {
       replace(source,0,source.length(),beginIp0040CbfmDccSw,IP_0040_CBFM_DCC_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040CbfmDccSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040CbfmDccSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040CbfmDccSw,IP_0040_CBFM_DCC_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040CbfmDccSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040CbfmDccSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040CbfmDccSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040InstApiGcmsSw
	 *	@return ip0040InstApiGcmsSw
	 */
   public char[] getIp0040InstApiGcmsSw() throws CFException{
     if (isIp0040InstApiGcmsSwModified()) { 
        ip0040InstApiGcmsSw = refreshIp0040InstApiGcmsSw();
     }
   		return ip0040InstApiGcmsSw;
   }

  
	/**
	*  set variable ip0040InstApiGcmsSw
	*  Corresponding COBOL Variable is IP0040-INST-API-GCMS-SW
	*  @param value
	**/
   public void setIp0040InstApiGcmsSw(char[] value) {
      ip0040InstApiGcmsSw = checkIp0040InstApiGcmsSwConstraints(value);
      serializeIp0040InstApiGcmsSw(ip0040InstApiGcmsSw);
   } 

     /**
	 * 	Update Ip0040InstApiGcmsSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040InstApiGcmsSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040InstApiGcmsSw,ip0040InstApiGcmsSw.length);
   	
   }
   
   public void setIp0040InstApiGcmsSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040InstApiGcmsSw,ip0040InstApiGcmsSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040InstApiGcmsSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040InstApiGcmsSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040InstApiGcmsSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040InstApiGcmsSw with another Field
	 *	@param value
	 */
   public void setIp0040InstApiGcmsSw(Field source) {
       replace(source,0,source.length(),beginIp0040InstApiGcmsSw,IP_0040_INST_API_GCMS_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040InstApiGcmsSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040InstApiGcmsSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040InstApiGcmsSw,IP_0040_INST_API_GCMS_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040InstApiGcmsSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040InstApiGcmsSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040InstApiGcmsSw+targetIndex,targetLen);
    
   }
	char[] ip0040InstApiGcmsSwY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040InstApiGcmsSwY88()
	 *	@return  Returns true if isIp0040InstApiGcmsSwY88() is "Y"
	 */
   public boolean isIp0040InstApiGcmsSwY88() throws CFException {
      return (  compareChars( getIp0040InstApiGcmsSw() , ip0040InstApiGcmsSwY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040InstApiGcmsSwY88True() {  			
    	setIp0040InstApiGcmsSw( ip0040InstApiGcmsSwY8888Value);
   	}
	char[] ip0040InstApiGcmsSwN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040InstApiGcmsSwN88()
	 *	@return  Returns true if isIp0040InstApiGcmsSwN88() is "N"
	 */
   public boolean isIp0040InstApiGcmsSwN88() throws CFException {
      return (  compareChars( getIp0040InstApiGcmsSw() , ip0040InstApiGcmsSwN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040InstApiGcmsSwN88True() {  			
    	setIp0040InstApiGcmsSw( ip0040InstApiGcmsSwN8888Value);
   	}
	/**
	 *	Returns the value of ip0040InsEnabApiInd
	 *	@return ip0040InsEnabApiInd
	 */
   public char[] getIp0040InsEnabApiInd() throws CFException{
     if (isIp0040InsEnabApiIndModified()) { 
        ip0040InsEnabApiInd = refreshIp0040InsEnabApiInd();
     }
   		return ip0040InsEnabApiInd;
   }

  
	/**
	*  set variable ip0040InsEnabApiInd
	*  Corresponding COBOL Variable is IP0040-INS-ENAB-API-IND
	*  @param value
	**/
   public void setIp0040InsEnabApiInd(char[] value) {
      ip0040InsEnabApiInd = checkIp0040InsEnabApiIndConstraints(value);
      serializeIp0040InsEnabApiInd(ip0040InsEnabApiInd);
   } 

     /**
	 * 	Update Ip0040InsEnabApiInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040InsEnabApiInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040InsEnabApiInd,ip0040InsEnabApiInd.length);
   	
   }
   
   public void setIp0040InsEnabApiInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040InsEnabApiInd,ip0040InsEnabApiInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040InsEnabApiInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040InsEnabApiInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040InsEnabApiInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040InsEnabApiInd with another Field
	 *	@param value
	 */
   public void setIp0040InsEnabApiInd(Field source) {
       replace(source,0,source.length(),beginIp0040InsEnabApiInd,IP_0040_INS_ENAB_API_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040InsEnabApiInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040InsEnabApiInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040InsEnabApiInd,IP_0040_INS_ENAB_API_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040InsEnabApiInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040InsEnabApiInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040InsEnabApiInd+targetIndex,targetLen);
    
   }
	char[] ip0040InsEnabApiIndY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040InsEnabApiIndY88()
	 *	@return  Returns true if isIp0040InsEnabApiIndY88() is "Y"
	 */
   public boolean isIp0040InsEnabApiIndY88() throws CFException {
      return (  compareChars( getIp0040InsEnabApiInd() , ip0040InsEnabApiIndY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040InsEnabApiIndY88True() {  			
    	setIp0040InsEnabApiInd( ip0040InsEnabApiIndY8888Value);
   	}
	char[] ip0040InsEnabApiIndN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040InsEnabApiIndN88()
	 *	@return  Returns true if isIp0040InsEnabApiIndN88() is "N"
	 */
   public boolean isIp0040InsEnabApiIndN88() throws CFException {
      return (  compareChars( getIp0040InsEnabApiInd() , ip0040InsEnabApiIndN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040InsEnabApiIndN88True() {  			
    	setIp0040InsEnabApiInd( ip0040InsEnabApiIndN8888Value);
   	}
	/**
	 *	Returns the value of ip0040InstApiUiSw
	 *	@return ip0040InstApiUiSw
	 */
   public char[] getIp0040InstApiUiSw() throws CFException{
     if (isIp0040InstApiUiSwModified()) { 
        ip0040InstApiUiSw = refreshIp0040InstApiUiSw();
     }
   		return ip0040InstApiUiSw;
   }

  
	/**
	*  set variable ip0040InstApiUiSw
	*  Corresponding COBOL Variable is IP0040-INST-API-UI-SW
	*  @param value
	**/
   public void setIp0040InstApiUiSw(char[] value) {
      ip0040InstApiUiSw = checkIp0040InstApiUiSwConstraints(value);
      serializeIp0040InstApiUiSw(ip0040InstApiUiSw);
   } 

     /**
	 * 	Update Ip0040InstApiUiSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040InstApiUiSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040InstApiUiSw,ip0040InstApiUiSw.length);
   	
   }
   
   public void setIp0040InstApiUiSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040InstApiUiSw,ip0040InstApiUiSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040InstApiUiSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040InstApiUiSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040InstApiUiSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040InstApiUiSw with another Field
	 *	@param value
	 */
   public void setIp0040InstApiUiSw(Field source) {
       replace(source,0,source.length(),beginIp0040InstApiUiSw,IP_0040_INST_API_UI_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040InstApiUiSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040InstApiUiSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040InstApiUiSw,IP_0040_INST_API_UI_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040InstApiUiSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040InstApiUiSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040InstApiUiSw+targetIndex,targetLen);
    
   }
	char[] ip0040InstApiUiSwY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040InstApiUiSwY88()
	 *	@return  Returns true if isIp0040InstApiUiSwY88() is "Y"
	 */
   public boolean isIp0040InstApiUiSwY88() throws CFException {
      return (  compareChars( getIp0040InstApiUiSw() , ip0040InstApiUiSwY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040InstApiUiSwY88True() {  			
    	setIp0040InstApiUiSw( ip0040InstApiUiSwY8888Value);
   	}
	char[] ip0040InstApiUiSwN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040InstApiUiSwN88()
	 *	@return  Returns true if isIp0040InstApiUiSwN88() is "N"
	 */
   public boolean isIp0040InstApiUiSwN88() throws CFException {
      return (  compareChars( getIp0040InstApiUiSw() , ip0040InstApiUiSwN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040InstApiUiSwN88True() {  			
    	setIp0040InstApiUiSw( ip0040InstApiUiSwN8888Value);
   	}
	/**
	 *	Returns the value of ip0040MstrpassAchProgInd
	 *	@return ip0040MstrpassAchProgInd
	 */
   public char[] getIp0040MstrpassAchProgInd() throws CFException{
     if (isIp0040MstrpassAchProgIndModified()) { 
        ip0040MstrpassAchProgInd = refreshIp0040MstrpassAchProgInd();
     }
   		return ip0040MstrpassAchProgInd;
   }

  
	/**
	*  set variable ip0040MstrpassAchProgInd
	*  Corresponding COBOL Variable is IP0040-MSTRPASS-ACH-PROG-IND
	*  @param value
	**/
   public void setIp0040MstrpassAchProgInd(char[] value) {
      ip0040MstrpassAchProgInd = checkIp0040MstrpassAchProgIndConstraints(value);
      serializeIp0040MstrpassAchProgInd(ip0040MstrpassAchProgInd);
   } 

     /**
	 * 	Update Ip0040MstrpassAchProgInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040MstrpassAchProgInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040MstrpassAchProgInd,ip0040MstrpassAchProgInd.length);
   	
   }
   
   public void setIp0040MstrpassAchProgInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040MstrpassAchProgInd,ip0040MstrpassAchProgInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040MstrpassAchProgInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040MstrpassAchProgInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040MstrpassAchProgInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040MstrpassAchProgInd with another Field
	 *	@param value
	 */
   public void setIp0040MstrpassAchProgInd(Field source) {
       replace(source,0,source.length(),beginIp0040MstrpassAchProgInd,IP_0040_MSTRPASS_ACH_PROG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040MstrpassAchProgInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040MstrpassAchProgInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040MstrpassAchProgInd,IP_0040_MSTRPASS_ACH_PROG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040MstrpassAchProgInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040MstrpassAchProgInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040MstrpassAchProgInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040OboInd
	 *	@return ip0040OboInd
	 */
   public char[] getIp0040OboInd() throws CFException{
     if (isIp0040OboIndModified()) { 
        ip0040OboInd = refreshIp0040OboInd();
     }
   		return ip0040OboInd;
   }

  
	/**
	*  set variable ip0040OboInd
	*  Corresponding COBOL Variable is IP0040-OBO-IND
	*  @param value
	**/
   public void setIp0040OboInd(char[] value) {
      ip0040OboInd = checkIp0040OboIndConstraints(value);
      serializeIp0040OboInd(ip0040OboInd);
   } 

     /**
	 * 	Update Ip0040OboInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040OboInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040OboInd,ip0040OboInd.length);
   	
   }
   
   public void setIp0040OboInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040OboInd,ip0040OboInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040OboInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040OboInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040OboInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040OboInd with another Field
	 *	@param value
	 */
   public void setIp0040OboInd(Field source) {
       replace(source,0,source.length(),beginIp0040OboInd,IP_0040_OBO_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040OboInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040OboInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040OboInd,IP_0040_OBO_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040OboInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040OboInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040OboInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040MultCurrSw
	 *	@return ip0040MultCurrSw
	 */
   public char[] getIp0040MultCurrSw() throws CFException{
     if (isIp0040MultCurrSwModified()) { 
        ip0040MultCurrSw = refreshIp0040MultCurrSw();
     }
   		return ip0040MultCurrSw;
   }

  
	/**
	*  set variable ip0040MultCurrSw
	*  Corresponding COBOL Variable is IP0040-MULT-CURR-SW
	*  @param value
	**/
   public void setIp0040MultCurrSw(char[] value) {
      ip0040MultCurrSw = checkIp0040MultCurrSwConstraints(value);
      serializeIp0040MultCurrSw(ip0040MultCurrSw);
   } 

     /**
	 * 	Update Ip0040MultCurrSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040MultCurrSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040MultCurrSw,ip0040MultCurrSw.length);
   	
   }
   
   public void setIp0040MultCurrSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040MultCurrSw,ip0040MultCurrSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040MultCurrSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040MultCurrSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040MultCurrSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040MultCurrSw with another Field
	 *	@param value
	 */
   public void setIp0040MultCurrSw(Field source) {
       replace(source,0,source.length(),beginIp0040MultCurrSw,IP_0040_MULT_CURR_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040MultCurrSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040MultCurrSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040MultCurrSw,IP_0040_MULT_CURR_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040MultCurrSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040MultCurrSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040MultCurrSw+targetIndex,targetLen);
    
   }
	char[] ip0040MultCurrSwY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040MultCurrSwY88()
	 *	@return  Returns true if isIp0040MultCurrSwY88() is "Y"
	 */
   public boolean isIp0040MultCurrSwY88() throws CFException {
      return (  compareChars( getIp0040MultCurrSw() , ip0040MultCurrSwY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040MultCurrSwY88True() {  			
    	setIp0040MultCurrSw( ip0040MultCurrSwY8888Value);
   	}
	char[] ip0040MultCurrSwN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040MultCurrSwN88()
	 *	@return  Returns true if isIp0040MultCurrSwN88() is "N"
	 */
   public boolean isIp0040MultCurrSwN88() throws CFException {
      return (  compareChars( getIp0040MultCurrSw() , ip0040MultCurrSwN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040MultCurrSwN88True() {  			
    	setIp0040MultCurrSw( ip0040MultCurrSwN8888Value);
   	}
	/**
	 *	Returns the value of ip0040AnonIndEffDate
	 *	@return ip0040AnonIndEffDate
	 */
	public long getIp0040AnonIndEffDate() throws CFException {
       if (isIp0040AnonIndEffDateModified()) { 
           ip0040AnonIndEffDate = refreshIp0040AnonIndEffDate();
        }
   		return ip0040AnonIndEffDate;
	}
	

	
	   
	/**
	 * 	Update Ip0040AnonIndEffDate with the passed value
	 *  Corresponding COBOL Variable is IP0040-ANON-IND-EFF-DATE
	 *	@param number
	 */
	public void setIp0040AnonIndEffDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040AnonIndEffDate = checkIp0040AnonIndEffDateMaxLimit(number); 
		serializeIp0040AnonIndEffDate(ip0040AnonIndEffDate);
	}
	

	/**
	 * 	Update Ip0040AnonIndEffDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040AnonIndEffDate(char[] value) throws CFException {
		 ip0040AnonIndEffDate = serializeIp0040AnonIndEffDate(value);
	}
	/**
	 * 	Update Ip0040AnonIndEffDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040AnonIndEffDateString(char[] value) throws CFException {
		 setIp0040AnonIndEffDate(value);
	}

	
	
	
	/**
	 * 	initializes Ip0040CentralSiteFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp0040ChbConvExclId(CONSTANTS.SPACE);
                     setIp0040ChbConvExclExpire(0);
         setIp0040HardshipIndicator(CONSTANTS.SPACE);
                     setIp0040HardshipEffective(0);
                     setIp0040HardshipExpiration(0);
         setIp0040GamingCountrySw(CONSTANTS.SPACE);
                     setIp0040CrossBorderInd(0);
         setIp0040RecPaymtCanSw(CONSTANTS.SPACE);
         setIp0040DomDbtParticipSw(CONSTANTS.SPACE);
          ip0040GrpCode.initialize();
     
         setIp0040IpcFraudCtlSw(CONSTANTS.SPACE);
         setIp0040IccrParticipInd(CONSTANTS.SPACE);
         setIp0040RevCreditInd(CONSTANTS.SPACE);
         setIp0040ChgbkBkoutInd(CONSTANTS.SPACE);
         setIp0040RtnTrnstNum(CONSTANTS.SPACE_10);
                     setIp0040TrueIssuerIca(0);
         setIp0040MerchantTaxIdSw(CONSTANTS.SPACE);
         setIp0040InstallServSw(CONSTANTS.SPACE);
         setIp0040TokenServiceInd(CONSTANTS.SPACE);
         setIp0040GbsBillInd(CONSTANTS.SPACE);
         setIp0040InstallAuthSw(CONSTANTS.SPACE);
         setIp0040SeqServiceInd(CONSTANTS.SPACE);
         setIp0040CbfmParticipInd(CONSTANTS.SPACE);
         setIp0040CbcmParticipInd(CONSTANTS.SPACE);
         setIp0040CbfmDccSw(CONSTANTS.SPACE);
         setIp0040InstApiGcmsSw(CONSTANTS.SPACE);
         setIp0040InsEnabApiInd(CONSTANTS.SPACE);
         setIp0040InstApiUiSw(CONSTANTS.SPACE);
         setIp0040MstrpassAchProgInd(CONSTANTS.SPACE);
         setIp0040OboInd(CONSTANTS.SPACE);
         setIp0040MultCurrSw(CONSTANTS.SPACE);
                     setIp0040AnonIndEffDate(0);
   }

		public static int getIp0040CentralSiteFieldsFieldLength() {
			return IP_0040_CENTRAL_SITE_FIELDS_LENGTH;
		}

}
  
