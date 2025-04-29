package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0040iMpePeRecDataCs is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip0040iMpePeRecDataCs extends Ip0040iMpePeRecDataCsSerialized { 
   

						private char[] ip0040iProductType = Field.fillLowValue(1);

								private long ip0040iEndpoint;

						private char[] ip0040iCountry = Field.fillLowValue(3);

								private int ip0040iCountryNum;
				private Ip0040iRegionSubreg ip0040iRegionSubreg = new Ip0040iRegionSubreg();

						private char[] ip0040iProductClass = Field.fillLowValue(3);

						private char[] ip0040iTranRoutingInd = Field.fillLowValue(1);

						private char[] ip0040iPrsProdReassgnSw = Field.fillLowValue(1);

						private char[] ip0040iProdReassignmentSw = Field.fillLowValue(1);

						private char[] ip0040iOptInFlag = Field.fillLowValue(1);

						private char[] ip0040iLicensedProdId = Field.fillLowValue(3);

						private char[] ip0040iVirtFundPanInd = Field.fillLowValue(1);

						private char[] ip0040iAcctCatgPartSw = Field.fillLowValue(1);

								private long ip0040iAcctCatgActvnDate;
				private Ip0040iCardHldrBlngCur ip0040iCardHldrBlngCur = new Ip0040iCardHldrBlngCur();

						private char[] ip0040iChipConversionSw = Field.fillLowValue(1);
				private Ip0040iFloorExpiryDate ip0040iFloorExpiryDate = new Ip0040iFloorExpiryDate();

						private char[] ip0040iCoBrandSw = Field.fillLowValue(1);

						private char[] ip0040iSpendControlRcnSw = Field.fillLowValue(1);

						private char[] ip0040iMerchCleanServPart = Field.fillLowValue(3);

								private long ip0040iMerchCleanActvDate;

						private char[] ip0040iPaypassEnabledInd = Field.fillLowValue(1);

						private char[] ip0040iRateTypeIndicator = Field.fillLowValue(1);

						private char[] ip0040iRoutePsnIndicator = Field.fillLowValue(1);

						private char[] ip0040iCbwpIndicator = Field.fillLowValue(1);

						private char[] ip0040iFlexParticipInd = Field.fillLowValue(1);

						private char[] ip0040iRepwrRldInd = Field.fillLowValue(1);

						private char[] ip0040iMoneySendInd = Field.fillLowValue(1);

						private char[] ip0040iRegulatedRateIndSw = Field.fillLowValue(1);

						private char[] ip0040iCashAccessSw = Field.fillLowValue(1);

								private int ip0040iPersonPresentInd;

						private char[] ip0040iCrossBdrException = Field.fillLowValue(1);

						private char[] ip0040iIssTargetMarketInd = Field.fillLowValue(1);

						private char[] ip0040iPostDateServSw = Field.fillLowValue(1);

						private char[] ip0040iMealVoucherInd = Field.fillLowValue(1);

						private char[] ip0040iNonRldblPrpdSw = Field.fillLowValue(2);

						private char[] ip0040iFasterFundsInd = Field.fillLowValue(1);

						private char[] ip0040iAnonPrepaidInd = Field.fillLowValue(1);

						private char[] ip0040iDccStatusInd = Field.fillLowValue(1);

						private char[] ip0040iPayByAcctInd = Field.fillLowValue(1);

						private char[] ip0040iIssGamParticipSw = Field.fillLowValue(1);

						private char[] ip0040iMemberFiller = Field.fillLowValue(12);

						private char[] ip0040iChbConvExclId = Field.fillLowValue(1);

								private long ip0040iChbConvExclExpire;

						private char[] ip0040iHardshipIndicator = Field.fillLowValue(1);

								private long ip0040iHardshipEffective;

								private long ip0040iHardshipExpiration;

						private char[] ip0040iGamingCountrySw = Field.fillLowValue(1);

								private int ip0040iCrossBorderInd;

						private char[] ip0040iRecPaymtCanSw = Field.fillLowValue(1);

						private char[] ip0040iDomDbtParticipSw = Field.fillLowValue(1);
				private Ip0040iGrpCode ip0040iGrpCode = new Ip0040iGrpCode();

						private char[] ip0040iIpcFraudCtlSw = Field.fillLowValue(1);

						private char[] ip0040iIccrParticipInd = Field.fillLowValue(1);

						private char[] ip0040iRevCreditInd = Field.fillLowValue(1);

						private char[] ip0040iChgbkBkoutInd = Field.fillLowValue(1);

						private char[] ip0040iRtnTrnstNum = Field.fillLowValue(10);

								private long ip0040iTrueIssuerIca;

						private char[] ip0040iMerchantTaxIdSw = Field.fillLowValue(1);

						private char[] ip0040iInstallServSw = Field.fillLowValue(1);

						private char[] ip0040iTokenServiceInd = Field.fillLowValue(1);

						private char[] ip0040iGbsBillInd = Field.fillLowValue(1);

						private char[] ip0040iInstallAuthSw = Field.fillLowValue(1);

						private char[] ip0040iSeqServiceInd = Field.fillLowValue(1);

						private char[] ip0040iCbfmParticipInd = Field.fillLowValue(1);

						private char[] ip0040iCbcmParticipInd = Field.fillLowValue(1);

						private char[] ip0040iCbfmDccSw = Field.fillLowValue(1);

						private char[] ip0040iInstApiGcmsSw = Field.fillLowValue(1);

						private char[] ip0040iInsEnabApiInd = Field.fillLowValue(1);

						private char[] ip0040iInstApiUiSw = Field.fillLowValue(1);

						private char[] ip0040iFiller = Field.fillLowValue(1);

						private char[] ip0040iOboServiceInd = Field.fillLowValue(1);

						private char[] ip0040iMultCurrSw = Field.fillLowValue(1);

								private long ip0040iAnonIndEffDate;

						private char[] ip0040iCbfmEcbRateParInd = Field.fillLowValue(1);

						private char[] ip0040iAlmXbOptOutInd = Field.fillLowValue(1);

						private char[] ip0040iJpnNonmdesTknrngSw = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip0040iMpePeRecDataCs
	**/
    public Ip0040iMpePeRecDataCs() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0040iMpePeRecDataCs. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040iMpePeRecDataCs(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip0040iRegionSubreg.setParent(this,getStartOffset() + 14);
	       			ip0040iCardHldrBlngCur.setParent(this,getStartOffset() + 33);
	       			ip0040iFloorExpiryDate.setParent(this,getStartOffset() + 66);
	       			ip0040iGrpCode.setParent(this,getStartOffset() + 140);
    } 

	/**
	 *	Returns the value of ip0040iProductType
	 *	@return ip0040iProductType
	 */
   public char[] getIp0040iProductType() throws CFException{
     if (isIp0040iProductTypeModified()) { 
        ip0040iProductType = refreshIp0040iProductType();
     }
   		return ip0040iProductType;
   }

  
	/**
	*  set variable ip0040iProductType
	*  Corresponding COBOL Variable is IP0040I-PRODUCT-TYPE
	*  @param value
	**/
   public void setIp0040iProductType(char[] value) {
      ip0040iProductType = checkIp0040iProductTypeConstraints(value);
      serializeIp0040iProductType(ip0040iProductType);
   } 

     /**
	 * 	Update Ip0040iProductType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iProductType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iProductType,ip0040iProductType.length);
   	
   }
   
   public void setIp0040iProductType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iProductType,ip0040iProductType.length);
   	
   }
   
     /**
	 * 	Update Ip0040iProductType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iProductType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iProductType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iProductType with another Field
	 *	@param value
	 */
   public void setIp0040iProductType(Field source) {
       replace(source,0,source.length(),beginIp0040iProductType,IP_0040I_PRODUCT_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iProductType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iProductType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iProductType,IP_0040I_PRODUCT_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iProductType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iProductType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iProductType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iEndpoint
	 *	@return ip0040iEndpoint
	 */
	public long getIp0040iEndpoint() throws CFException {
       if (isIp0040iEndpointModified()) { 
           ip0040iEndpoint = refreshIp0040iEndpoint();
        }
   		return ip0040iEndpoint;
	}
	

	
	   
	/**
	 * 	Update Ip0040iEndpoint with the passed value
	 *  Corresponding COBOL Variable is IP0040I-ENDPOINT
	 *	@param number
	 */
	public void setIp0040iEndpoint(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040iEndpoint = checkIp0040iEndpointMaxLimit(number); 
		serializeIp0040iEndpoint(ip0040iEndpoint);
	}
	

	/**
	 * 	Update Ip0040iEndpoint with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040iEndpoint(char[] value) throws CFException {
		 ip0040iEndpoint = serializeIp0040iEndpoint(value);
	}
	/**
	 * 	Update Ip0040iEndpoint with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040iEndpointString(char[] value) throws CFException {
		 setIp0040iEndpoint(value);
	}
	/**
	 *	Returns the value of ip0040iCountry
	 *	@return ip0040iCountry
	 */
   public char[] getIp0040iCountry() throws CFException{
     if (isIp0040iCountryModified()) { 
        ip0040iCountry = refreshIp0040iCountry();
     }
   		return ip0040iCountry;
   }

  
	/**
	*  set variable ip0040iCountry
	*  Corresponding COBOL Variable is IP0040I-COUNTRY
	*  @param value
	**/
   public void setIp0040iCountry(char[] value) {
      ip0040iCountry = checkIp0040iCountryConstraints(value);
      serializeIp0040iCountry(ip0040iCountry);
   } 

     /**
	 * 	Update Ip0040iCountry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iCountry(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iCountry,ip0040iCountry.length);
   	
   }
   
   public void setIp0040iCountry(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCountry,ip0040iCountry.length);
   	
   }
   
     /**
	 * 	Update Ip0040iCountry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iCountry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCountry+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iCountry with another Field
	 *	@param value
	 */
   public void setIp0040iCountry(Field source) {
       replace(source,0,source.length(),beginIp0040iCountry,IP_0040I_COUNTRY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iCountry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iCountry(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iCountry,IP_0040I_COUNTRY_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iCountry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iCountry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCountry+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iCountryNum
	 *	@return ip0040iCountryNum
	 */
	public int getIp0040iCountryNum() throws CFException {
       if (isIp0040iCountryNumModified()) { 
           ip0040iCountryNum = refreshIp0040iCountryNum();
        }
   		return ip0040iCountryNum;
	}
	

	
	   
	/**
	 * 	Update Ip0040iCountryNum with the passed value
	 *  Corresponding COBOL Variable is IP0040I-COUNTRY-NUM
	 *	@param number
	 */
	public void setIp0040iCountryNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040iCountryNum = checkIp0040iCountryNumMaxLimit(number); 
		serializeIp0040iCountryNum(ip0040iCountryNum);
	}
	

	public void setIp0040iCountryNum(long number) {
	    number = checkIp0040iCountryNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0040iCountryNum((int)number);
	}
	
	/**
	 * 	Update Ip0040iCountryNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040iCountryNum(char[] value) throws CFException {
		 ip0040iCountryNum = serializeIp0040iCountryNum(value);
	}
	/**
	 * 	Update Ip0040iCountryNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040iCountryNumString(char[] value) throws CFException {
		 setIp0040iCountryNum(value);
	}
	/**
	 *	Returns the value of ip0040iRegionSubreg
	 *	@return ip0040iRegionSubreg
	 */   
	 public Ip0040iRegionSubreg getIp0040iRegionSubreg() {
   	return ip0040iRegionSubreg;
   }
   /**
	* 	Update Ip0040iRegionSubreg with the passed value
	*   Corresponding COBOL Variable is IP0040I-REGION-SUBREG
	*	@param value
	*/
   public void setIp0040iRegionSubreg(char[] value) {
      ip0040iRegionSubreg.setString(value); 
   }   
    
     /**
	 * 	Update Ip0040iRegionSubreg 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0040iRegionSubreg(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iRegionSubreg.begin,ip0040iRegionSubreg.length());
   }
   
     /**
	 * 	Update Ip0040iRegionSubreg 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iRegionSubreg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iRegionSubreg.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0040iRegionSubreg with another Field
	 *	@param value
	 */
   public void setIp0040iRegionSubreg(Field source) {
   	replace(source,0,source.length(),ip0040iRegionSubreg.begin,ip0040iRegionSubreg.length());
   }  
   
     /**
	 * 	Update Ip0040iRegionSubreg 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0040iRegionSubreg(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iRegionSubreg.begin,ip0040iRegionSubreg.length());
   }
   
     /**
	 * 	Update Ip0040iRegionSubreg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iRegionSubreg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iRegionSubreg.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip0040iProductClass
	 *	@return ip0040iProductClass
	 */
   public char[] getIp0040iProductClass() throws CFException{
     if (isIp0040iProductClassModified()) { 
        ip0040iProductClass = refreshIp0040iProductClass();
     }
   		return ip0040iProductClass;
   }

  
	/**
	*  set variable ip0040iProductClass
	*  Corresponding COBOL Variable is IP0040I-PRODUCT-CLASS
	*  @param value
	**/
   public void setIp0040iProductClass(char[] value) {
      ip0040iProductClass = checkIp0040iProductClassConstraints(value);
      serializeIp0040iProductClass(ip0040iProductClass);
   } 

     /**
	 * 	Update Ip0040iProductClass 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iProductClass(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iProductClass,ip0040iProductClass.length);
   	
   }
   
   public void setIp0040iProductClass(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iProductClass,ip0040iProductClass.length);
   	
   }
   
     /**
	 * 	Update Ip0040iProductClass 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iProductClass(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iProductClass+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iProductClass with another Field
	 *	@param value
	 */
   public void setIp0040iProductClass(Field source) {
       replace(source,0,source.length(),beginIp0040iProductClass,IP_0040I_PRODUCT_CLASS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iProductClass 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iProductClass(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iProductClass,IP_0040I_PRODUCT_CLASS_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iProductClass 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iProductClass(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iProductClass+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iTranRoutingInd
	 *	@return ip0040iTranRoutingInd
	 */
   public char[] getIp0040iTranRoutingInd() throws CFException{
     if (isIp0040iTranRoutingIndModified()) { 
        ip0040iTranRoutingInd = refreshIp0040iTranRoutingInd();
     }
   		return ip0040iTranRoutingInd;
   }

  
	/**
	*  set variable ip0040iTranRoutingInd
	*  Corresponding COBOL Variable is IP0040I-TRAN-ROUTING-IND
	*  @param value
	**/
   public void setIp0040iTranRoutingInd(char[] value) {
      ip0040iTranRoutingInd = checkIp0040iTranRoutingIndConstraints(value);
      serializeIp0040iTranRoutingInd(ip0040iTranRoutingInd);
   } 

     /**
	 * 	Update Ip0040iTranRoutingInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iTranRoutingInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iTranRoutingInd,ip0040iTranRoutingInd.length);
   	
   }
   
   public void setIp0040iTranRoutingInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iTranRoutingInd,ip0040iTranRoutingInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iTranRoutingInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iTranRoutingInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iTranRoutingInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iTranRoutingInd with another Field
	 *	@param value
	 */
   public void setIp0040iTranRoutingInd(Field source) {
       replace(source,0,source.length(),beginIp0040iTranRoutingInd,IP_0040I_TRAN_ROUTING_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iTranRoutingInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iTranRoutingInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iTranRoutingInd,IP_0040I_TRAN_ROUTING_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iTranRoutingInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iTranRoutingInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iTranRoutingInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iPrsProdReassgnSw
	 *	@return ip0040iPrsProdReassgnSw
	 */
   public char[] getIp0040iPrsProdReassgnSw() throws CFException{
     if (isIp0040iPrsProdReassgnSwModified()) { 
        ip0040iPrsProdReassgnSw = refreshIp0040iPrsProdReassgnSw();
     }
   		return ip0040iPrsProdReassgnSw;
   }

  
	/**
	*  set variable ip0040iPrsProdReassgnSw
	*  Corresponding COBOL Variable is IP0040I-PRS-PROD-REASSGN-SW
	*  @param value
	**/
   public void setIp0040iPrsProdReassgnSw(char[] value) {
      ip0040iPrsProdReassgnSw = checkIp0040iPrsProdReassgnSwConstraints(value);
      serializeIp0040iPrsProdReassgnSw(ip0040iPrsProdReassgnSw);
   } 

     /**
	 * 	Update Ip0040iPrsProdReassgnSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iPrsProdReassgnSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iPrsProdReassgnSw,ip0040iPrsProdReassgnSw.length);
   	
   }
   
   public void setIp0040iPrsProdReassgnSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iPrsProdReassgnSw,ip0040iPrsProdReassgnSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iPrsProdReassgnSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iPrsProdReassgnSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iPrsProdReassgnSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iPrsProdReassgnSw with another Field
	 *	@param value
	 */
   public void setIp0040iPrsProdReassgnSw(Field source) {
       replace(source,0,source.length(),beginIp0040iPrsProdReassgnSw,IP_0040I_PRS_PROD_REASSGN_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iPrsProdReassgnSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iPrsProdReassgnSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iPrsProdReassgnSw,IP_0040I_PRS_PROD_REASSGN_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iPrsProdReassgnSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iPrsProdReassgnSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iPrsProdReassgnSw+targetIndex,targetLen);
    
   }
	char[] ip0040iPrsPdReasgn8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iPrsPdReasgn88()
	 *	@return  Returns true if isIp0040iPrsPdReasgn88() is "Y"
	 */
   public boolean isIp0040iPrsPdReasgn88() throws CFException {
      return (  compareChars( getIp0040iPrsProdReassgnSw() , ip0040iPrsPdReasgn8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iPrsPdReasgn88True() {  			
    	setIp0040iPrsProdReassgnSw( ip0040iPrsPdReasgn8888Value);
   	}
	char[] ip0040iPrsPdNotReasgn8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iPrsPdNotReasgn88()
	 *	@return  Returns true if isIp0040iPrsPdNotReasgn88() is "N"
	 */
   public boolean isIp0040iPrsPdNotReasgn88() throws CFException {
      return (  compareChars( getIp0040iPrsProdReassgnSw() , ip0040iPrsPdNotReasgn8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iPrsPdNotReasgn88True() {  			
    	setIp0040iPrsProdReassgnSw( ip0040iPrsPdNotReasgn8888Value);
   	}
	/**
	 *	Returns the value of ip0040iProdReassignmentSw
	 *	@return ip0040iProdReassignmentSw
	 */
   public char[] getIp0040iProdReassignmentSw() throws CFException{
     if (isIp0040iProdReassignmentSwModified()) { 
        ip0040iProdReassignmentSw = refreshIp0040iProdReassignmentSw();
     }
   		return ip0040iProdReassignmentSw;
   }

  
	/**
	*  set variable ip0040iProdReassignmentSw
	*  Corresponding COBOL Variable is IP0040I-PROD-REASSIGNMENT-SW
	*  @param value
	**/
   public void setIp0040iProdReassignmentSw(char[] value) {
      ip0040iProdReassignmentSw = checkIp0040iProdReassignmentSwConstraints(value);
      serializeIp0040iProdReassignmentSw(ip0040iProdReassignmentSw);
   } 

     /**
	 * 	Update Ip0040iProdReassignmentSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iProdReassignmentSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iProdReassignmentSw,ip0040iProdReassignmentSw.length);
   	
   }
   
   public void setIp0040iProdReassignmentSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iProdReassignmentSw,ip0040iProdReassignmentSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iProdReassignmentSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iProdReassignmentSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iProdReassignmentSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iProdReassignmentSw with another Field
	 *	@param value
	 */
   public void setIp0040iProdReassignmentSw(Field source) {
       replace(source,0,source.length(),beginIp0040iProdReassignmentSw,IP_0040I_PROD_REASSIGNMENT_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iProdReassignmentSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iProdReassignmentSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iProdReassignmentSw,IP_0040I_PROD_REASSIGNMENT_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iProdReassignmentSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iProdReassignmentSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iProdReassignmentSw+targetIndex,targetLen);
    
   }
	char[] ip0040iPdReassigned8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iPdReassigned88()
	 *	@return  Returns true if isIp0040iPdReassigned88() is "Y"
	 */
   public boolean isIp0040iPdReassigned88() throws CFException {
      return (  compareChars( getIp0040iProdReassignmentSw() , ip0040iPdReassigned8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iPdReassigned88True() {  			
    	setIp0040iProdReassignmentSw( ip0040iPdReassigned8888Value);
   	}
	char[] ip0040iPdNotReassigned8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iPdNotReassigned88()
	 *	@return  Returns true if isIp0040iPdNotReassigned88() is "N"
	 */
   public boolean isIp0040iPdNotReassigned88() throws CFException {
      return (  compareChars( getIp0040iProdReassignmentSw() , ip0040iPdNotReassigned8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iPdNotReassigned88True() {  			
    	setIp0040iProdReassignmentSw( ip0040iPdNotReassigned8888Value);
   	}
	/**
	 *	Returns the value of ip0040iOptInFlag
	 *	@return ip0040iOptInFlag
	 */
   public char[] getIp0040iOptInFlag() throws CFException{
     if (isIp0040iOptInFlagModified()) { 
        ip0040iOptInFlag = refreshIp0040iOptInFlag();
     }
   		return ip0040iOptInFlag;
   }

  
	/**
	*  set variable ip0040iOptInFlag
	*  Corresponding COBOL Variable is IP0040I-OPT-IN-FLAG
	*  @param value
	**/
   public void setIp0040iOptInFlag(char[] value) {
      ip0040iOptInFlag = checkIp0040iOptInFlagConstraints(value);
      serializeIp0040iOptInFlag(ip0040iOptInFlag);
   } 

     /**
	 * 	Update Ip0040iOptInFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iOptInFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iOptInFlag,ip0040iOptInFlag.length);
   	
   }
   
   public void setIp0040iOptInFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iOptInFlag,ip0040iOptInFlag.length);
   	
   }
   
     /**
	 * 	Update Ip0040iOptInFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iOptInFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iOptInFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iOptInFlag with another Field
	 *	@param value
	 */
   public void setIp0040iOptInFlag(Field source) {
       replace(source,0,source.length(),beginIp0040iOptInFlag,IP_0040I_OPT_IN_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iOptInFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iOptInFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iOptInFlag,IP_0040I_OPT_IN_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iOptInFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iOptInFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iOptInFlag+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iLicensedProdId
	 *	@return ip0040iLicensedProdId
	 */
   public char[] getIp0040iLicensedProdId() throws CFException{
     if (isIp0040iLicensedProdIdModified()) { 
        ip0040iLicensedProdId = refreshIp0040iLicensedProdId();
     }
   		return ip0040iLicensedProdId;
   }

  
	/**
	*  set variable ip0040iLicensedProdId
	*  Corresponding COBOL Variable is IP0040I-LICENSED-PROD-ID
	*  @param value
	**/
   public void setIp0040iLicensedProdId(char[] value) {
      ip0040iLicensedProdId = checkIp0040iLicensedProdIdConstraints(value);
      serializeIp0040iLicensedProdId(ip0040iLicensedProdId);
   } 

     /**
	 * 	Update Ip0040iLicensedProdId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iLicensedProdId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iLicensedProdId,ip0040iLicensedProdId.length);
   	
   }
   
   public void setIp0040iLicensedProdId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iLicensedProdId,ip0040iLicensedProdId.length);
   	
   }
   
     /**
	 * 	Update Ip0040iLicensedProdId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iLicensedProdId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iLicensedProdId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iLicensedProdId with another Field
	 *	@param value
	 */
   public void setIp0040iLicensedProdId(Field source) {
       replace(source,0,source.length(),beginIp0040iLicensedProdId,IP_0040I_LICENSED_PROD_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iLicensedProdId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iLicensedProdId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iLicensedProdId,IP_0040I_LICENSED_PROD_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iLicensedProdId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iLicensedProdId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iLicensedProdId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iVirtFundPanInd
	 *	@return ip0040iVirtFundPanInd
	 */
   public char[] getIp0040iVirtFundPanInd() throws CFException{
     if (isIp0040iVirtFundPanIndModified()) { 
        ip0040iVirtFundPanInd = refreshIp0040iVirtFundPanInd();
     }
   		return ip0040iVirtFundPanInd;
   }

  
	/**
	*  set variable ip0040iVirtFundPanInd
	*  Corresponding COBOL Variable is IP0040I-VIRT-FUND-PAN-IND
	*  @param value
	**/
   public void setIp0040iVirtFundPanInd(char[] value) {
      ip0040iVirtFundPanInd = checkIp0040iVirtFundPanIndConstraints(value);
      serializeIp0040iVirtFundPanInd(ip0040iVirtFundPanInd);
   } 

     /**
	 * 	Update Ip0040iVirtFundPanInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iVirtFundPanInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iVirtFundPanInd,ip0040iVirtFundPanInd.length);
   	
   }
   
   public void setIp0040iVirtFundPanInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iVirtFundPanInd,ip0040iVirtFundPanInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iVirtFundPanInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iVirtFundPanInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iVirtFundPanInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iVirtFundPanInd with another Field
	 *	@param value
	 */
   public void setIp0040iVirtFundPanInd(Field source) {
       replace(source,0,source.length(),beginIp0040iVirtFundPanInd,IP_0040I_VIRT_FUND_PAN_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iVirtFundPanInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iVirtFundPanInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iVirtFundPanInd,IP_0040I_VIRT_FUND_PAN_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iVirtFundPanInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iVirtFundPanInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iVirtFundPanInd+targetIndex,targetLen);
    
   }
	static java.util.Set<String> ip0040iVirtPan8888Value = new java.util.HashSet<>();
static { 
	ip0040iVirtPan8888Value.add( "1");
	ip0040iVirtPan8888Value.add( "2");
	ip0040iVirtPan8888Value.add( "3");
	ip0040iVirtPan8888Value.add( "4");
	ip0040iVirtPan8888Value.add( "5");
	ip0040iVirtPan8888Value.add( "6");
	ip0040iVirtPan8888Value.add( "8");
	ip0040iVirtPan8888Value.add( "9");
	ip0040iVirtPan8888Value.add( "C");
} 

	/**
	 *	Test condition "1" "2" "3" "4" "5" "6" "8" "9" "C" for isIp0040iVirtPan88()
	 *	@return  Returns true if isIp0040iVirtPan88() is "1" "2" "3" "4" "5" "6" "8" "9" "C"
	 */
   public boolean isIp0040iVirtPan88() throws CFException {
      return   ip0040iVirtPan8888Value.contains(String.valueOf(getIp0040iVirtFundPanInd()));
   }


	/**
	*  set values "1" "2" "3" "4" "5" "6" "8" "9" "C"
	*/
   	public void setIp0040iVirtPan88True() {  			
    	  setIp0040iVirtFundPanInd(ip0040iVirtPan8888Value.iterator().next().toCharArray());
   	}
	static java.util.Set<String> ip0040iVpPaypass8888Value = new java.util.HashSet<>();
static { 
	ip0040iVpPaypass8888Value.add( "1");
	ip0040iVpPaypass8888Value.add( "2");
	ip0040iVpPaypass8888Value.add( "3");
	ip0040iVpPaypass8888Value.add( "4");
	ip0040iVpPaypass8888Value.add( "5");
	ip0040iVpPaypass8888Value.add( "6");
} 

	/**
	 *	Test condition "1" "2" "3" "4" "5" "6" for isIp0040iVpPaypass88()
	 *	@return  Returns true if isIp0040iVpPaypass88() is "1" "2" "3" "4" "5" "6"
	 */
   public boolean isIp0040iVpPaypass88() throws CFException {
      return   ip0040iVpPaypass8888Value.contains(String.valueOf(getIp0040iVirtFundPanInd()));
   }


	/**
	*  set values "1" "2" "3" "4" "5" "6"
	*/
   	public void setIp0040iVpPaypass88True() {  			
    	  setIp0040iVirtFundPanInd(ip0040iVpPaypass8888Value.iterator().next().toCharArray());
   	}
	char[] ip0040iVpIncontrol8888Value = "8".toCharArray();
	/**
	 *	Test condition "8" for isIp0040iVpIncontrol88()
	 *	@return  Returns true if isIp0040iVpIncontrol88() is "8"
	 */
   public boolean isIp0040iVpIncontrol88() throws CFException {
      return (  compareChars( getIp0040iVirtFundPanInd() , ip0040iVpIncontrol8888Value)  == 0  );
   }


	/**
	*  set values "8"
	*/
   	public void setIp0040iVpIncontrol88True() {  			
    	setIp0040iVirtFundPanInd( ip0040iVpIncontrol8888Value);
   	}
	char[] ip0040iVpExpChkout8888Value = "9".toCharArray();
	/**
	 *	Test condition "9" for isIp0040iVpExpChkout88()
	 *	@return  Returns true if isIp0040iVpExpChkout88() is "9"
	 */
   public boolean isIp0040iVpExpChkout88() throws CFException {
      return (  compareChars( getIp0040iVirtFundPanInd() , ip0040iVpExpChkout8888Value)  == 0  );
   }


	/**
	*  set values "9"
	*/
   	public void setIp0040iVpExpChkout88True() {  			
    	setIp0040iVirtFundPanInd( ip0040iVpExpChkout8888Value);
   	}
	char[] ip0040iMdes8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp0040iMdes88()
	 *	@return  Returns true if isIp0040iMdes88() is "C"
	 */
   public boolean isIp0040iMdes88() throws CFException {
      return (  compareChars( getIp0040iVirtFundPanInd() , ip0040iMdes8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp0040iMdes88True() {  			
    	setIp0040iVirtFundPanInd( ip0040iMdes8888Value);
   	}
	char[] ip0040iTspTokenRange8888Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isIp0040iTspTokenRange88()
	 *	@return  Returns true if isIp0040iTspTokenRange88() is "I"
	 */
   public boolean isIp0040iTspTokenRange88() throws CFException {
      return (  compareChars( getIp0040iVirtFundPanInd() , ip0040iTspTokenRange8888Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setIp0040iTspTokenRange88True() {  			
    	setIp0040iVirtFundPanInd( ip0040iTspTokenRange8888Value);
   	}
	/**
	 *	Returns the value of ip0040iAcctCatgPartSw
	 *	@return ip0040iAcctCatgPartSw
	 */
   public char[] getIp0040iAcctCatgPartSw() throws CFException{
     if (isIp0040iAcctCatgPartSwModified()) { 
        ip0040iAcctCatgPartSw = refreshIp0040iAcctCatgPartSw();
     }
   		return ip0040iAcctCatgPartSw;
   }

  
	/**
	*  set variable ip0040iAcctCatgPartSw
	*  Corresponding COBOL Variable is IP0040I-ACCT-CATG-PART-SW
	*  @param value
	**/
   public void setIp0040iAcctCatgPartSw(char[] value) {
      ip0040iAcctCatgPartSw = checkIp0040iAcctCatgPartSwConstraints(value);
      serializeIp0040iAcctCatgPartSw(ip0040iAcctCatgPartSw);
   } 

     /**
	 * 	Update Ip0040iAcctCatgPartSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iAcctCatgPartSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iAcctCatgPartSw,ip0040iAcctCatgPartSw.length);
   	
   }
   
   public void setIp0040iAcctCatgPartSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iAcctCatgPartSw,ip0040iAcctCatgPartSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iAcctCatgPartSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iAcctCatgPartSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iAcctCatgPartSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iAcctCatgPartSw with another Field
	 *	@param value
	 */
   public void setIp0040iAcctCatgPartSw(Field source) {
       replace(source,0,source.length(),beginIp0040iAcctCatgPartSw,IP_0040I_ACCT_CATG_PART_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iAcctCatgPartSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iAcctCatgPartSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iAcctCatgPartSw,IP_0040I_ACCT_CATG_PART_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iAcctCatgPartSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iAcctCatgPartSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iAcctCatgPartSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iAcctCatgActvnDate
	 *	@return ip0040iAcctCatgActvnDate
	 */
	public long getIp0040iAcctCatgActvnDate() throws CFException {
       if (isIp0040iAcctCatgActvnDateModified()) { 
           ip0040iAcctCatgActvnDate = refreshIp0040iAcctCatgActvnDate();
        }
   		return ip0040iAcctCatgActvnDate;
	}
	

	
	   
	/**
	 * 	Update Ip0040iAcctCatgActvnDate with the passed value
	 *  Corresponding COBOL Variable is IP0040I-ACCT-CATG-ACTVN-DATE
	 *	@param number
	 */
	public void setIp0040iAcctCatgActvnDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040iAcctCatgActvnDate = checkIp0040iAcctCatgActvnDateMaxLimit(number); 
		serializeIp0040iAcctCatgActvnDate(ip0040iAcctCatgActvnDate);
	}
	

	/**
	 * 	Update Ip0040iAcctCatgActvnDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040iAcctCatgActvnDate(char[] value) throws CFException {
		 ip0040iAcctCatgActvnDate = serializeIp0040iAcctCatgActvnDate(value);
	}
	/**
	 * 	Update Ip0040iAcctCatgActvnDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040iAcctCatgActvnDateString(char[] value) throws CFException {
		 setIp0040iAcctCatgActvnDate(value);
	}
	/**
	 *	Returns the value of ip0040iCardHldrBlngCur
	 *	@return ip0040iCardHldrBlngCur
	 */   
	 public Ip0040iCardHldrBlngCur getIp0040iCardHldrBlngCur() {
   	return ip0040iCardHldrBlngCur;
   }
   /**
	* 	Update Ip0040iCardHldrBlngCur with the passed value
	*   Corresponding COBOL Variable is IP0040I-CARD-HLDR-BLNG-CUR
	*	@param value
	*/
   public void setIp0040iCardHldrBlngCur(char[] value) {
      ip0040iCardHldrBlngCur.setString(value); 
   }   
    
     /**
	 * 	Update Ip0040iCardHldrBlngCur 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0040iCardHldrBlngCur(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iCardHldrBlngCur.begin,ip0040iCardHldrBlngCur.length());
   }
   
     /**
	 * 	Update Ip0040iCardHldrBlngCur 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iCardHldrBlngCur(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iCardHldrBlngCur.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0040iCardHldrBlngCur with another Field
	 *	@param value
	 */
   public void setIp0040iCardHldrBlngCur(Field source) {
   	replace(source,0,source.length(),ip0040iCardHldrBlngCur.begin,ip0040iCardHldrBlngCur.length());
   }  
   
     /**
	 * 	Update Ip0040iCardHldrBlngCur 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0040iCardHldrBlngCur(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iCardHldrBlngCur.begin,ip0040iCardHldrBlngCur.length());
   }
   
     /**
	 * 	Update Ip0040iCardHldrBlngCur 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iCardHldrBlngCur(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iCardHldrBlngCur.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip0040iChipConversionSw
	 *	@return ip0040iChipConversionSw
	 */
   public char[] getIp0040iChipConversionSw() throws CFException{
     if (isIp0040iChipConversionSwModified()) { 
        ip0040iChipConversionSw = refreshIp0040iChipConversionSw();
     }
   		return ip0040iChipConversionSw;
   }

  
	/**
	*  set variable ip0040iChipConversionSw
	*  Corresponding COBOL Variable is IP0040I-CHIP-CONVERSION-SW
	*  @param value
	**/
   public void setIp0040iChipConversionSw(char[] value) {
      ip0040iChipConversionSw = checkIp0040iChipConversionSwConstraints(value);
      serializeIp0040iChipConversionSw(ip0040iChipConversionSw);
   } 

     /**
	 * 	Update Ip0040iChipConversionSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iChipConversionSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iChipConversionSw,ip0040iChipConversionSw.length);
   	
   }
   
   public void setIp0040iChipConversionSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iChipConversionSw,ip0040iChipConversionSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iChipConversionSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iChipConversionSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iChipConversionSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iChipConversionSw with another Field
	 *	@param value
	 */
   public void setIp0040iChipConversionSw(Field source) {
       replace(source,0,source.length(),beginIp0040iChipConversionSw,IP_0040I_CHIP_CONVERSION_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iChipConversionSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iChipConversionSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iChipConversionSw,IP_0040I_CHIP_CONVERSION_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iChipConversionSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iChipConversionSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iChipConversionSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iFloorExpiryDate
	 *	@return ip0040iFloorExpiryDate
	 */   
	 public Ip0040iFloorExpiryDate getIp0040iFloorExpiryDate() {
   	return ip0040iFloorExpiryDate;
   }
   /**
	* 	Update Ip0040iFloorExpiryDate with the passed value
	*   Corresponding COBOL Variable is IP0040I-FLOOR-EXPIRY-DATE
	*	@param value
	*/
   public void setIp0040iFloorExpiryDate(char[] value) {
      ip0040iFloorExpiryDate.setString(value); 
   }   
    
     /**
	 * 	Update Ip0040iFloorExpiryDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0040iFloorExpiryDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iFloorExpiryDate.begin,ip0040iFloorExpiryDate.length());
   }
   
     /**
	 * 	Update Ip0040iFloorExpiryDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iFloorExpiryDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iFloorExpiryDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0040iFloorExpiryDate with another Field
	 *	@param value
	 */
   public void setIp0040iFloorExpiryDate(Field source) {
   	replace(source,0,source.length(),ip0040iFloorExpiryDate.begin,ip0040iFloorExpiryDate.length());
   }  
   
     /**
	 * 	Update Ip0040iFloorExpiryDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0040iFloorExpiryDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iFloorExpiryDate.begin,ip0040iFloorExpiryDate.length());
   }
   
     /**
	 * 	Update Ip0040iFloorExpiryDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iFloorExpiryDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iFloorExpiryDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip0040iCoBrandSw
	 *	@return ip0040iCoBrandSw
	 */
   public char[] getIp0040iCoBrandSw() throws CFException{
     if (isIp0040iCoBrandSwModified()) { 
        ip0040iCoBrandSw = refreshIp0040iCoBrandSw();
     }
   		return ip0040iCoBrandSw;
   }

  
	/**
	*  set variable ip0040iCoBrandSw
	*  Corresponding COBOL Variable is IP0040I-CO-BRAND-SW
	*  @param value
	**/
   public void setIp0040iCoBrandSw(char[] value) {
      ip0040iCoBrandSw = checkIp0040iCoBrandSwConstraints(value);
      serializeIp0040iCoBrandSw(ip0040iCoBrandSw);
   } 

     /**
	 * 	Update Ip0040iCoBrandSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iCoBrandSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iCoBrandSw,ip0040iCoBrandSw.length);
   	
   }
   
   public void setIp0040iCoBrandSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCoBrandSw,ip0040iCoBrandSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iCoBrandSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iCoBrandSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCoBrandSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iCoBrandSw with another Field
	 *	@param value
	 */
   public void setIp0040iCoBrandSw(Field source) {
       replace(source,0,source.length(),beginIp0040iCoBrandSw,IP_0040I_CO_BRAND_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iCoBrandSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iCoBrandSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iCoBrandSw,IP_0040I_CO_BRAND_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iCoBrandSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iCoBrandSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCoBrandSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iSpendControlRcnSw
	 *	@return ip0040iSpendControlRcnSw
	 */
   public char[] getIp0040iSpendControlRcnSw() throws CFException{
     if (isIp0040iSpendControlRcnSwModified()) { 
        ip0040iSpendControlRcnSw = refreshIp0040iSpendControlRcnSw();
     }
   		return ip0040iSpendControlRcnSw;
   }

  
	/**
	*  set variable ip0040iSpendControlRcnSw
	*  Corresponding COBOL Variable is IP0040I-SPEND-CONTROL-RCN-SW
	*  @param value
	**/
   public void setIp0040iSpendControlRcnSw(char[] value) {
      ip0040iSpendControlRcnSw = checkIp0040iSpendControlRcnSwConstraints(value);
      serializeIp0040iSpendControlRcnSw(ip0040iSpendControlRcnSw);
   } 

     /**
	 * 	Update Ip0040iSpendControlRcnSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iSpendControlRcnSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iSpendControlRcnSw,ip0040iSpendControlRcnSw.length);
   	
   }
   
   public void setIp0040iSpendControlRcnSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iSpendControlRcnSw,ip0040iSpendControlRcnSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iSpendControlRcnSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iSpendControlRcnSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iSpendControlRcnSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iSpendControlRcnSw with another Field
	 *	@param value
	 */
   public void setIp0040iSpendControlRcnSw(Field source) {
       replace(source,0,source.length(),beginIp0040iSpendControlRcnSw,IP_0040I_SPEND_CONTROL_RCN_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iSpendControlRcnSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iSpendControlRcnSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iSpendControlRcnSw,IP_0040I_SPEND_CONTROL_RCN_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iSpendControlRcnSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iSpendControlRcnSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iSpendControlRcnSw+targetIndex,targetLen);
    
   }
	char[] ip0040iRcnSpndCntl8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iRcnSpndCntl88()
	 *	@return  Returns true if isIp0040iRcnSpndCntl88() is "Y"
	 */
   public boolean isIp0040iRcnSpndCntl88() throws CFException {
      return (  compareChars( getIp0040iSpendControlRcnSw() , ip0040iRcnSpndCntl8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iRcnSpndCntl88True() {  			
    	setIp0040iSpendControlRcnSw( ip0040iRcnSpndCntl8888Value);
   	}
	char[] ip0040iNotRcnSpndCntl8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iNotRcnSpndCntl88()
	 *	@return  Returns true if isIp0040iNotRcnSpndCntl88() is "N"
	 */
   public boolean isIp0040iNotRcnSpndCntl88() throws CFException {
      return (  compareChars( getIp0040iSpendControlRcnSw() , ip0040iNotRcnSpndCntl8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iNotRcnSpndCntl88True() {  			
    	setIp0040iSpendControlRcnSw( ip0040iNotRcnSpndCntl8888Value);
   	}
	/**
	 *	Returns the value of ip0040iMerchCleanServPart
	 *	@return ip0040iMerchCleanServPart
	 */
   public char[] getIp0040iMerchCleanServPart() throws CFException{
     if (isIp0040iMerchCleanServPartModified()) { 
        ip0040iMerchCleanServPart = refreshIp0040iMerchCleanServPart();
     }
   		return ip0040iMerchCleanServPart;
   }

  
	/**
	*  set variable ip0040iMerchCleanServPart
	*  Corresponding COBOL Variable is IP0040I-MERCH-CLEAN-SERV-PART
	*  @param value
	**/
   public void setIp0040iMerchCleanServPart(char[] value) {
      ip0040iMerchCleanServPart = checkIp0040iMerchCleanServPartConstraints(value);
      serializeIp0040iMerchCleanServPart(ip0040iMerchCleanServPart);
   } 

     /**
	 * 	Update Ip0040iMerchCleanServPart 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iMerchCleanServPart(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iMerchCleanServPart,ip0040iMerchCleanServPart.length);
   	
   }
   
   public void setIp0040iMerchCleanServPart(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iMerchCleanServPart,ip0040iMerchCleanServPart.length);
   	
   }
   
     /**
	 * 	Update Ip0040iMerchCleanServPart 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iMerchCleanServPart(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iMerchCleanServPart+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iMerchCleanServPart with another Field
	 *	@param value
	 */
   public void setIp0040iMerchCleanServPart(Field source) {
       replace(source,0,source.length(),beginIp0040iMerchCleanServPart,IP_0040I_MERCH_CLEAN_SERV_PART_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iMerchCleanServPart 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iMerchCleanServPart(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iMerchCleanServPart,IP_0040I_MERCH_CLEAN_SERV_PART_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iMerchCleanServPart 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iMerchCleanServPart(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iMerchCleanServPart+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iMerchCleanActvDate
	 *	@return ip0040iMerchCleanActvDate
	 */
	public long getIp0040iMerchCleanActvDate() throws CFException {
       if (isIp0040iMerchCleanActvDateModified()) { 
           ip0040iMerchCleanActvDate = refreshIp0040iMerchCleanActvDate();
        }
   		return ip0040iMerchCleanActvDate;
	}
	

	
	   
	/**
	 * 	Update Ip0040iMerchCleanActvDate with the passed value
	 *  Corresponding COBOL Variable is IP0040I-MERCH-CLEAN-ACTV-DATE
	 *	@param number
	 */
	public void setIp0040iMerchCleanActvDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040iMerchCleanActvDate = checkIp0040iMerchCleanActvDateMaxLimit(number); 
		serializeIp0040iMerchCleanActvDate(ip0040iMerchCleanActvDate);
	}
	

	/**
	 * 	Update Ip0040iMerchCleanActvDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040iMerchCleanActvDate(char[] value) throws CFException {
		 ip0040iMerchCleanActvDate = serializeIp0040iMerchCleanActvDate(value);
	}
	/**
	 * 	Update Ip0040iMerchCleanActvDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040iMerchCleanActvDateString(char[] value) throws CFException {
		 setIp0040iMerchCleanActvDate(value);
	}
	/**
	 *	Returns the value of ip0040iPaypassEnabledInd
	 *	@return ip0040iPaypassEnabledInd
	 */
   public char[] getIp0040iPaypassEnabledInd() throws CFException{
     if (isIp0040iPaypassEnabledIndModified()) { 
        ip0040iPaypassEnabledInd = refreshIp0040iPaypassEnabledInd();
     }
   		return ip0040iPaypassEnabledInd;
   }

  
	/**
	*  set variable ip0040iPaypassEnabledInd
	*  Corresponding COBOL Variable is IP0040I-PAYPASS-ENABLED-IND
	*  @param value
	**/
   public void setIp0040iPaypassEnabledInd(char[] value) {
      ip0040iPaypassEnabledInd = checkIp0040iPaypassEnabledIndConstraints(value);
      serializeIp0040iPaypassEnabledInd(ip0040iPaypassEnabledInd);
   } 

     /**
	 * 	Update Ip0040iPaypassEnabledInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iPaypassEnabledInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iPaypassEnabledInd,ip0040iPaypassEnabledInd.length);
   	
   }
   
   public void setIp0040iPaypassEnabledInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iPaypassEnabledInd,ip0040iPaypassEnabledInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iPaypassEnabledInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iPaypassEnabledInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iPaypassEnabledInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iPaypassEnabledInd with another Field
	 *	@param value
	 */
   public void setIp0040iPaypassEnabledInd(Field source) {
       replace(source,0,source.length(),beginIp0040iPaypassEnabledInd,IP_0040I_PAYPASS_ENABLED_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iPaypassEnabledInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iPaypassEnabledInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iPaypassEnabledInd,IP_0040I_PAYPASS_ENABLED_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iPaypassEnabledInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iPaypassEnabledInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iPaypassEnabledInd+targetIndex,targetLen);
    
   }
	char[] ip0040iPaypassEnabledY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iPaypassEnabledY88()
	 *	@return  Returns true if isIp0040iPaypassEnabledY88() is "Y"
	 */
   public boolean isIp0040iPaypassEnabledY88() throws CFException {
      return (  compareChars( getIp0040iPaypassEnabledInd() , ip0040iPaypassEnabledY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iPaypassEnabledY88True() {  			
    	setIp0040iPaypassEnabledInd( ip0040iPaypassEnabledY8888Value);
   	}
	char[] ip0040iPaypassEnabledN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iPaypassEnabledN88()
	 *	@return  Returns true if isIp0040iPaypassEnabledN88() is "N"
	 */
   public boolean isIp0040iPaypassEnabledN88() throws CFException {
      return (  compareChars( getIp0040iPaypassEnabledInd() , ip0040iPaypassEnabledN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iPaypassEnabledN88True() {  			
    	setIp0040iPaypassEnabledInd( ip0040iPaypassEnabledN8888Value);
   	}
	char[] ip0040iPaypassEnabledM8888Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isIp0040iPaypassEnabledM88()
	 *	@return  Returns true if isIp0040iPaypassEnabledM88() is "M"
	 */
   public boolean isIp0040iPaypassEnabledM88() throws CFException {
      return (  compareChars( getIp0040iPaypassEnabledInd() , ip0040iPaypassEnabledM8888Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setIp0040iPaypassEnabledM88True() {  			
    	setIp0040iPaypassEnabledInd( ip0040iPaypassEnabledM8888Value);
   	}
	/**
	 *	Returns the value of ip0040iRateTypeIndicator
	 *	@return ip0040iRateTypeIndicator
	 */
   public char[] getIp0040iRateTypeIndicator() throws CFException{
     if (isIp0040iRateTypeIndicatorModified()) { 
        ip0040iRateTypeIndicator = refreshIp0040iRateTypeIndicator();
     }
   		return ip0040iRateTypeIndicator;
   }

  
	/**
	*  set variable ip0040iRateTypeIndicator
	*  Corresponding COBOL Variable is IP0040I-RATE-TYPE-INDICATOR
	*  @param value
	**/
   public void setIp0040iRateTypeIndicator(char[] value) {
      ip0040iRateTypeIndicator = checkIp0040iRateTypeIndicatorConstraints(value);
      serializeIp0040iRateTypeIndicator(ip0040iRateTypeIndicator);
   } 

     /**
	 * 	Update Ip0040iRateTypeIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iRateTypeIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iRateTypeIndicator,ip0040iRateTypeIndicator.length);
   	
   }
   
   public void setIp0040iRateTypeIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRateTypeIndicator,ip0040iRateTypeIndicator.length);
   	
   }
   
     /**
	 * 	Update Ip0040iRateTypeIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iRateTypeIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRateTypeIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iRateTypeIndicator with another Field
	 *	@param value
	 */
   public void setIp0040iRateTypeIndicator(Field source) {
       replace(source,0,source.length(),beginIp0040iRateTypeIndicator,IP_0040I_RATE_TYPE_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iRateTypeIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iRateTypeIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iRateTypeIndicator,IP_0040I_RATE_TYPE_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iRateTypeIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iRateTypeIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRateTypeIndicator+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iRoutePsnIndicator
	 *	@return ip0040iRoutePsnIndicator
	 */
   public char[] getIp0040iRoutePsnIndicator() throws CFException{
     if (isIp0040iRoutePsnIndicatorModified()) { 
        ip0040iRoutePsnIndicator = refreshIp0040iRoutePsnIndicator();
     }
   		return ip0040iRoutePsnIndicator;
   }

  
	/**
	*  set variable ip0040iRoutePsnIndicator
	*  Corresponding COBOL Variable is IP0040I-ROUTE-PSN-INDICATOR
	*  @param value
	**/
   public void setIp0040iRoutePsnIndicator(char[] value) {
      ip0040iRoutePsnIndicator = checkIp0040iRoutePsnIndicatorConstraints(value);
      serializeIp0040iRoutePsnIndicator(ip0040iRoutePsnIndicator);
   } 

     /**
	 * 	Update Ip0040iRoutePsnIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iRoutePsnIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iRoutePsnIndicator,ip0040iRoutePsnIndicator.length);
   	
   }
   
   public void setIp0040iRoutePsnIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRoutePsnIndicator,ip0040iRoutePsnIndicator.length);
   	
   }
   
     /**
	 * 	Update Ip0040iRoutePsnIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iRoutePsnIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRoutePsnIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iRoutePsnIndicator with another Field
	 *	@param value
	 */
   public void setIp0040iRoutePsnIndicator(Field source) {
       replace(source,0,source.length(),beginIp0040iRoutePsnIndicator,IP_0040I_ROUTE_PSN_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iRoutePsnIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iRoutePsnIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iRoutePsnIndicator,IP_0040I_ROUTE_PSN_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iRoutePsnIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iRoutePsnIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRoutePsnIndicator+targetIndex,targetLen);
    
   }
	char[] ip0040iRoutePsnIndY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iRoutePsnIndY88()
	 *	@return  Returns true if isIp0040iRoutePsnIndY88() is "Y"
	 */
   public boolean isIp0040iRoutePsnIndY88() throws CFException {
      return (  compareChars( getIp0040iRoutePsnIndicator() , ip0040iRoutePsnIndY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iRoutePsnIndY88True() {  			
    	setIp0040iRoutePsnIndicator( ip0040iRoutePsnIndY8888Value);
   	}
	char[] ip0040iRoutePsnIndN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iRoutePsnIndN88()
	 *	@return  Returns true if isIp0040iRoutePsnIndN88() is "N"
	 */
   public boolean isIp0040iRoutePsnIndN88() throws CFException {
      return (  compareChars( getIp0040iRoutePsnIndicator() , ip0040iRoutePsnIndN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iRoutePsnIndN88True() {  			
    	setIp0040iRoutePsnIndicator( ip0040iRoutePsnIndN8888Value);
   	}
	/**
	 *	Returns the value of ip0040iCbwpIndicator
	 *	@return ip0040iCbwpIndicator
	 */
   public char[] getIp0040iCbwpIndicator() throws CFException{
     if (isIp0040iCbwpIndicatorModified()) { 
        ip0040iCbwpIndicator = refreshIp0040iCbwpIndicator();
     }
   		return ip0040iCbwpIndicator;
   }

  
	/**
	*  set variable ip0040iCbwpIndicator
	*  Corresponding COBOL Variable is IP0040I-CBWP-INDICATOR
	*  @param value
	**/
   public void setIp0040iCbwpIndicator(char[] value) {
      ip0040iCbwpIndicator = checkIp0040iCbwpIndicatorConstraints(value);
      serializeIp0040iCbwpIndicator(ip0040iCbwpIndicator);
   } 

     /**
	 * 	Update Ip0040iCbwpIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iCbwpIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iCbwpIndicator,ip0040iCbwpIndicator.length);
   	
   }
   
   public void setIp0040iCbwpIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCbwpIndicator,ip0040iCbwpIndicator.length);
   	
   }
   
     /**
	 * 	Update Ip0040iCbwpIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iCbwpIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCbwpIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iCbwpIndicator with another Field
	 *	@param value
	 */
   public void setIp0040iCbwpIndicator(Field source) {
       replace(source,0,source.length(),beginIp0040iCbwpIndicator,IP_0040I_CBWP_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iCbwpIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iCbwpIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iCbwpIndicator,IP_0040I_CBWP_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iCbwpIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iCbwpIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCbwpIndicator+targetIndex,targetLen);
    
   }
	char[] ip0040iCbwpIndY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iCbwpIndY88()
	 *	@return  Returns true if isIp0040iCbwpIndY88() is "Y"
	 */
   public boolean isIp0040iCbwpIndY88() throws CFException {
      return (  compareChars( getIp0040iCbwpIndicator() , ip0040iCbwpIndY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iCbwpIndY88True() {  			
    	setIp0040iCbwpIndicator( ip0040iCbwpIndY8888Value);
   	}
	char[] ip0040iCbwpIndN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iCbwpIndN88()
	 *	@return  Returns true if isIp0040iCbwpIndN88() is "N"
	 */
   public boolean isIp0040iCbwpIndN88() throws CFException {
      return (  compareChars( getIp0040iCbwpIndicator() , ip0040iCbwpIndN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iCbwpIndN88True() {  			
    	setIp0040iCbwpIndicator( ip0040iCbwpIndN8888Value);
   	}
	/**
	 *	Returns the value of ip0040iFlexParticipInd
	 *	@return ip0040iFlexParticipInd
	 */
   public char[] getIp0040iFlexParticipInd() throws CFException{
     if (isIp0040iFlexParticipIndModified()) { 
        ip0040iFlexParticipInd = refreshIp0040iFlexParticipInd();
     }
   		return ip0040iFlexParticipInd;
   }

  
	/**
	*  set variable ip0040iFlexParticipInd
	*  Corresponding COBOL Variable is IP0040I-FLEX-PARTICIP-IND
	*  @param value
	**/
   public void setIp0040iFlexParticipInd(char[] value) {
      ip0040iFlexParticipInd = checkIp0040iFlexParticipIndConstraints(value);
      serializeIp0040iFlexParticipInd(ip0040iFlexParticipInd);
   } 

     /**
	 * 	Update Ip0040iFlexParticipInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iFlexParticipInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iFlexParticipInd,ip0040iFlexParticipInd.length);
   	
   }
   
   public void setIp0040iFlexParticipInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iFlexParticipInd,ip0040iFlexParticipInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iFlexParticipInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iFlexParticipInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iFlexParticipInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iFlexParticipInd with another Field
	 *	@param value
	 */
   public void setIp0040iFlexParticipInd(Field source) {
       replace(source,0,source.length(),beginIp0040iFlexParticipInd,IP_0040I_FLEX_PARTICIP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iFlexParticipInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iFlexParticipInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iFlexParticipInd,IP_0040I_FLEX_PARTICIP_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iFlexParticipInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iFlexParticipInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iFlexParticipInd+targetIndex,targetLen);
    
   }
	char[] ip0040iParticipInd08888Value = fillZeroes(1);
	/**
	 *	Test condition "0" for isIp0040iParticipInd088()
	 *	@return  Returns true if isIp0040iParticipInd088() is "0"
	 */
   public boolean isIp0040iParticipInd088() throws CFException {
      return (  compareChars( getIp0040iFlexParticipInd() , ip0040iParticipInd08888Value)  == 0  );
   }


	/**
	*  set values "0"
	*/
   	public void setIp0040iParticipInd088True() {  			
    	setIp0040iFlexParticipInd( ip0040iParticipInd08888Value);
   	}
	char[] ip0040iParticipInd18888Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isIp0040iParticipInd188()
	 *	@return  Returns true if isIp0040iParticipInd188() is "1"
	 */
   public boolean isIp0040iParticipInd188() throws CFException {
      return (  compareChars( getIp0040iFlexParticipInd() , ip0040iParticipInd18888Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setIp0040iParticipInd188True() {  			
    	setIp0040iFlexParticipInd( ip0040iParticipInd18888Value);
   	}
	char[] ip0040iParticipInd28888Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isIp0040iParticipInd288()
	 *	@return  Returns true if isIp0040iParticipInd288() is "2"
	 */
   public boolean isIp0040iParticipInd288() throws CFException {
      return (  compareChars( getIp0040iFlexParticipInd() , ip0040iParticipInd28888Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setIp0040iParticipInd288True() {  			
    	setIp0040iFlexParticipInd( ip0040iParticipInd28888Value);
   	}
	char[] ip0040iParticipInd38888Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isIp0040iParticipInd388()
	 *	@return  Returns true if isIp0040iParticipInd388() is "3"
	 */
   public boolean isIp0040iParticipInd388() throws CFException {
      return (  compareChars( getIp0040iFlexParticipInd() , ip0040iParticipInd38888Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setIp0040iParticipInd388True() {  			
    	setIp0040iFlexParticipInd( ip0040iParticipInd38888Value);
   	}
	/**
	 *	Returns the value of ip0040iRepwrRldInd
	 *	@return ip0040iRepwrRldInd
	 */
   public char[] getIp0040iRepwrRldInd() throws CFException{
     if (isIp0040iRepwrRldIndModified()) { 
        ip0040iRepwrRldInd = refreshIp0040iRepwrRldInd();
     }
   		return ip0040iRepwrRldInd;
   }

  
	/**
	*  set variable ip0040iRepwrRldInd
	*  Corresponding COBOL Variable is IP0040I-REPWR-RLD-IND
	*  @param value
	**/
   public void setIp0040iRepwrRldInd(char[] value) {
      ip0040iRepwrRldInd = checkIp0040iRepwrRldIndConstraints(value);
      serializeIp0040iRepwrRldInd(ip0040iRepwrRldInd);
   } 

     /**
	 * 	Update Ip0040iRepwrRldInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iRepwrRldInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iRepwrRldInd,ip0040iRepwrRldInd.length);
   	
   }
   
   public void setIp0040iRepwrRldInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRepwrRldInd,ip0040iRepwrRldInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iRepwrRldInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iRepwrRldInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRepwrRldInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iRepwrRldInd with another Field
	 *	@param value
	 */
   public void setIp0040iRepwrRldInd(Field source) {
       replace(source,0,source.length(),beginIp0040iRepwrRldInd,IP_0040I_REPWR_RLD_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iRepwrRldInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iRepwrRldInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iRepwrRldInd,IP_0040I_REPWR_RLD_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iRepwrRldInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iRepwrRldInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRepwrRldInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iMoneySendInd
	 *	@return ip0040iMoneySendInd
	 */
   public char[] getIp0040iMoneySendInd() throws CFException{
     if (isIp0040iMoneySendIndModified()) { 
        ip0040iMoneySendInd = refreshIp0040iMoneySendInd();
     }
   		return ip0040iMoneySendInd;
   }

  
	/**
	*  set variable ip0040iMoneySendInd
	*  Corresponding COBOL Variable is IP0040I-MONEY-SEND-IND
	*  @param value
	**/
   public void setIp0040iMoneySendInd(char[] value) {
      ip0040iMoneySendInd = checkIp0040iMoneySendIndConstraints(value);
      serializeIp0040iMoneySendInd(ip0040iMoneySendInd);
   } 

     /**
	 * 	Update Ip0040iMoneySendInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iMoneySendInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iMoneySendInd,ip0040iMoneySendInd.length);
   	
   }
   
   public void setIp0040iMoneySendInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iMoneySendInd,ip0040iMoneySendInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iMoneySendInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iMoneySendInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iMoneySendInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iMoneySendInd with another Field
	 *	@param value
	 */
   public void setIp0040iMoneySendInd(Field source) {
       replace(source,0,source.length(),beginIp0040iMoneySendInd,IP_0040I_MONEY_SEND_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iMoneySendInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iMoneySendInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iMoneySendInd,IP_0040I_MONEY_SEND_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iMoneySendInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iMoneySendInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iMoneySendInd+targetIndex,targetLen);
    
   }
	char[] ip0040iMoneySendDomCrs8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iMoneySendDomCrs88()
	 *	@return  Returns true if isIp0040iMoneySendDomCrs88() is "Y"
	 */
   public boolean isIp0040iMoneySendDomCrs88() throws CFException {
      return (  compareChars( getIp0040iMoneySendInd() , ip0040iMoneySendDomCrs8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iMoneySendDomCrs88True() {  			
    	setIp0040iMoneySendInd( ip0040iMoneySendDomCrs8888Value);
   	}
	char[] ip0040iMoneySendDom8888Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isIp0040iMoneySendDom88()
	 *	@return  Returns true if isIp0040iMoneySendDom88() is "D"
	 */
   public boolean isIp0040iMoneySendDom88() throws CFException {
      return (  compareChars( getIp0040iMoneySendInd() , ip0040iMoneySendDom8888Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setIp0040iMoneySendDom88True() {  			
    	setIp0040iMoneySendInd( ip0040iMoneySendDom8888Value);
   	}
	char[] ip0040iMoneySendNo8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iMoneySendNo88()
	 *	@return  Returns true if isIp0040iMoneySendNo88() is "N"
	 */
   public boolean isIp0040iMoneySendNo88() throws CFException {
      return (  compareChars( getIp0040iMoneySendInd() , ip0040iMoneySendNo8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iMoneySendNo88True() {  			
    	setIp0040iMoneySendInd( ip0040iMoneySendNo8888Value);
   	}
	char[] ip0040iMoneySendUnknown8888Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isIp0040iMoneySendUnknown88()
	 *	@return  Returns true if isIp0040iMoneySendUnknown88() is "U"
	 */
   public boolean isIp0040iMoneySendUnknown88() throws CFException {
      return (  compareChars( getIp0040iMoneySendInd() , ip0040iMoneySendUnknown8888Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setIp0040iMoneySendUnknown88True() {  			
    	setIp0040iMoneySendInd( ip0040iMoneySendUnknown8888Value);
   	}
	/**
	 *	Returns the value of ip0040iRegulatedRateIndSw
	 *	@return ip0040iRegulatedRateIndSw
	 */
   public char[] getIp0040iRegulatedRateIndSw() throws CFException{
     if (isIp0040iRegulatedRateIndSwModified()) { 
        ip0040iRegulatedRateIndSw = refreshIp0040iRegulatedRateIndSw();
     }
   		return ip0040iRegulatedRateIndSw;
   }

  
	/**
	*  set variable ip0040iRegulatedRateIndSw
	*  Corresponding COBOL Variable is IP0040I-REGULATED-RATE-IND-SW
	*  @param value
	**/
   public void setIp0040iRegulatedRateIndSw(char[] value) {
      ip0040iRegulatedRateIndSw = checkIp0040iRegulatedRateIndSwConstraints(value);
      serializeIp0040iRegulatedRateIndSw(ip0040iRegulatedRateIndSw);
   } 

     /**
	 * 	Update Ip0040iRegulatedRateIndSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iRegulatedRateIndSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iRegulatedRateIndSw,ip0040iRegulatedRateIndSw.length);
   	
   }
   
   public void setIp0040iRegulatedRateIndSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRegulatedRateIndSw,ip0040iRegulatedRateIndSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iRegulatedRateIndSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iRegulatedRateIndSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRegulatedRateIndSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iRegulatedRateIndSw with another Field
	 *	@param value
	 */
   public void setIp0040iRegulatedRateIndSw(Field source) {
       replace(source,0,source.length(),beginIp0040iRegulatedRateIndSw,IP_0040I_REGULATED_RATE_IND_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iRegulatedRateIndSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iRegulatedRateIndSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iRegulatedRateIndSw,IP_0040I_REGULATED_RATE_IND_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iRegulatedRateIndSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iRegulatedRateIndSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRegulatedRateIndSw+targetIndex,targetLen);
    
   }
	char[] ip0040iRegRateIndSw8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iRegRateIndSw88()
	 *	@return  Returns true if isIp0040iRegRateIndSw88() is "Y"
	 */
   public boolean isIp0040iRegRateIndSw88() throws CFException {
      return (  compareChars( getIp0040iRegulatedRateIndSw() , ip0040iRegRateIndSw8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iRegRateIndSw88True() {  			
    	setIp0040iRegulatedRateIndSw( ip0040iRegRateIndSw8888Value);
   	}
	char[] ip0040iNonRegIndSw8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iNonRegIndSw88()
	 *	@return  Returns true if isIp0040iNonRegIndSw88() is "N"
	 */
   public boolean isIp0040iNonRegIndSw88() throws CFException {
      return (  compareChars( getIp0040iRegulatedRateIndSw() , ip0040iNonRegIndSw8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iNonRegIndSw88True() {  			
    	setIp0040iRegulatedRateIndSw( ip0040iNonRegIndSw8888Value);
   	}
	/**
	 *	Returns the value of ip0040iCashAccessSw
	 *	@return ip0040iCashAccessSw
	 */
   public char[] getIp0040iCashAccessSw() throws CFException{
     if (isIp0040iCashAccessSwModified()) { 
        ip0040iCashAccessSw = refreshIp0040iCashAccessSw();
     }
   		return ip0040iCashAccessSw;
   }

  
	/**
	*  set variable ip0040iCashAccessSw
	*  Corresponding COBOL Variable is IP0040I-CASH-ACCESS-SW
	*  @param value
	**/
   public void setIp0040iCashAccessSw(char[] value) {
      ip0040iCashAccessSw = checkIp0040iCashAccessSwConstraints(value);
      serializeIp0040iCashAccessSw(ip0040iCashAccessSw);
   } 

     /**
	 * 	Update Ip0040iCashAccessSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iCashAccessSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iCashAccessSw,ip0040iCashAccessSw.length);
   	
   }
   
   public void setIp0040iCashAccessSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCashAccessSw,ip0040iCashAccessSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iCashAccessSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iCashAccessSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCashAccessSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iCashAccessSw with another Field
	 *	@param value
	 */
   public void setIp0040iCashAccessSw(Field source) {
       replace(source,0,source.length(),beginIp0040iCashAccessSw,IP_0040I_CASH_ACCESS_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iCashAccessSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iCashAccessSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iCashAccessSw,IP_0040I_CASH_ACCESS_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iCashAccessSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iCashAccessSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCashAccessSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iPersonPresentInd
	 *	@return ip0040iPersonPresentInd
	 */
	public int getIp0040iPersonPresentInd() throws CFException {
       if (isIp0040iPersonPresentIndModified()) { 
           ip0040iPersonPresentInd = refreshIp0040iPersonPresentInd();
        }
   		return ip0040iPersonPresentInd;
	}
	

	
	   
	/**
	 * 	Update Ip0040iPersonPresentInd with the passed value
	 *  Corresponding COBOL Variable is IP0040I-PERSON-PRESENT-IND
	 *	@param number
	 */
	public void setIp0040iPersonPresentInd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040iPersonPresentInd = checkIp0040iPersonPresentIndMaxLimit(number); 
		serializeIp0040iPersonPresentInd(ip0040iPersonPresentInd);
	}
	

	public void setIp0040iPersonPresentInd(long number) {
	    number = checkIp0040iPersonPresentIndMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0040iPersonPresentInd((int)number);
	}
	
	/**
	 * 	Update Ip0040iPersonPresentInd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040iPersonPresentInd(char[] value) throws CFException {
		 ip0040iPersonPresentInd = serializeIp0040iPersonPresentInd(value);
	}
	/**
	 * 	Update Ip0040iPersonPresentInd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040iPersonPresentIndString(char[] value) throws CFException {
		 setIp0040iPersonPresentInd(value);
	}
	/**
	 *	Returns the value of ip0040iCrossBdrException
	 *	@return ip0040iCrossBdrException
	 */
   public char[] getIp0040iCrossBdrException() throws CFException{
     if (isIp0040iCrossBdrExceptionModified()) { 
        ip0040iCrossBdrException = refreshIp0040iCrossBdrException();
     }
   		return ip0040iCrossBdrException;
   }

  
	/**
	*  set variable ip0040iCrossBdrException
	*  Corresponding COBOL Variable is IP0040I-CROSS-BDR-EXCEPTION
	*  @param value
	**/
   public void setIp0040iCrossBdrException(char[] value) {
      ip0040iCrossBdrException = checkIp0040iCrossBdrExceptionConstraints(value);
      serializeIp0040iCrossBdrException(ip0040iCrossBdrException);
   } 

     /**
	 * 	Update Ip0040iCrossBdrException 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iCrossBdrException(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iCrossBdrException,ip0040iCrossBdrException.length);
   	
   }
   
   public void setIp0040iCrossBdrException(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCrossBdrException,ip0040iCrossBdrException.length);
   	
   }
   
     /**
	 * 	Update Ip0040iCrossBdrException 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iCrossBdrException(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCrossBdrException+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iCrossBdrException with another Field
	 *	@param value
	 */
   public void setIp0040iCrossBdrException(Field source) {
       replace(source,0,source.length(),beginIp0040iCrossBdrException,IP_0040I_CROSS_BDR_EXCEPTION_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iCrossBdrException 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iCrossBdrException(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iCrossBdrException,IP_0040I_CROSS_BDR_EXCEPTION_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iCrossBdrException 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iCrossBdrException(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCrossBdrException+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iIssTargetMarketInd
	 *	@return ip0040iIssTargetMarketInd
	 */
   public char[] getIp0040iIssTargetMarketInd() throws CFException{
     if (isIp0040iIssTargetMarketIndModified()) { 
        ip0040iIssTargetMarketInd = refreshIp0040iIssTargetMarketInd();
     }
   		return ip0040iIssTargetMarketInd;
   }

  
	/**
	*  set variable ip0040iIssTargetMarketInd
	*  Corresponding COBOL Variable is IP0040I-ISS-TARGET-MARKET-IND
	*  @param value
	**/
   public void setIp0040iIssTargetMarketInd(char[] value) {
      ip0040iIssTargetMarketInd = checkIp0040iIssTargetMarketIndConstraints(value);
      serializeIp0040iIssTargetMarketInd(ip0040iIssTargetMarketInd);
   } 

     /**
	 * 	Update Ip0040iIssTargetMarketInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iIssTargetMarketInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iIssTargetMarketInd,ip0040iIssTargetMarketInd.length);
   	
   }
   
   public void setIp0040iIssTargetMarketInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iIssTargetMarketInd,ip0040iIssTargetMarketInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iIssTargetMarketInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iIssTargetMarketInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iIssTargetMarketInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iIssTargetMarketInd with another Field
	 *	@param value
	 */
   public void setIp0040iIssTargetMarketInd(Field source) {
       replace(source,0,source.length(),beginIp0040iIssTargetMarketInd,IP_0040I_ISS_TARGET_MARKET_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iIssTargetMarketInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iIssTargetMarketInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iIssTargetMarketInd,IP_0040I_ISS_TARGET_MARKET_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iIssTargetMarketInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iIssTargetMarketInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iIssTargetMarketInd+targetIndex,targetLen);
    
   }
	char[] ip0040iIssTrgtmktPartY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iIssTrgtmktPartY88()
	 *	@return  Returns true if isIp0040iIssTrgtmktPartY88() is "Y"
	 */
   public boolean isIp0040iIssTrgtmktPartY88() throws CFException {
      return (  compareChars( getIp0040iIssTargetMarketInd() , ip0040iIssTrgtmktPartY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iIssTrgtmktPartY88True() {  			
    	setIp0040iIssTargetMarketInd( ip0040iIssTrgtmktPartY8888Value);
   	}
	char[] ip0040iIssTrgtmktPartN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iIssTrgtmktPartN88()
	 *	@return  Returns true if isIp0040iIssTrgtmktPartN88() is "N"
	 */
   public boolean isIp0040iIssTrgtmktPartN88() throws CFException {
      return (  compareChars( getIp0040iIssTargetMarketInd() , ip0040iIssTrgtmktPartN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iIssTrgtmktPartN88True() {  			
    	setIp0040iIssTargetMarketInd( ip0040iIssTrgtmktPartN8888Value);
   	}
	/**
	 *	Returns the value of ip0040iPostDateServSw
	 *	@return ip0040iPostDateServSw
	 */
   public char[] getIp0040iPostDateServSw() throws CFException{
     if (isIp0040iPostDateServSwModified()) { 
        ip0040iPostDateServSw = refreshIp0040iPostDateServSw();
     }
   		return ip0040iPostDateServSw;
   }

  
	/**
	*  set variable ip0040iPostDateServSw
	*  Corresponding COBOL Variable is IP0040I-POST-DATE-SERV-SW
	*  @param value
	**/
   public void setIp0040iPostDateServSw(char[] value) {
      ip0040iPostDateServSw = checkIp0040iPostDateServSwConstraints(value);
      serializeIp0040iPostDateServSw(ip0040iPostDateServSw);
   } 

     /**
	 * 	Update Ip0040iPostDateServSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iPostDateServSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iPostDateServSw,ip0040iPostDateServSw.length);
   	
   }
   
   public void setIp0040iPostDateServSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iPostDateServSw,ip0040iPostDateServSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iPostDateServSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iPostDateServSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iPostDateServSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iPostDateServSw with another Field
	 *	@param value
	 */
   public void setIp0040iPostDateServSw(Field source) {
       replace(source,0,source.length(),beginIp0040iPostDateServSw,IP_0040I_POST_DATE_SERV_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iPostDateServSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iPostDateServSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iPostDateServSw,IP_0040I_POST_DATE_SERV_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iPostDateServSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iPostDateServSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iPostDateServSw+targetIndex,targetLen);
    
   }
	char[] ip0040iPostDteServSwY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iPostDteServSwY88()
	 *	@return  Returns true if isIp0040iPostDteServSwY88() is "Y"
	 */
   public boolean isIp0040iPostDteServSwY88() throws CFException {
      return (  compareChars( getIp0040iPostDateServSw() , ip0040iPostDteServSwY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iPostDteServSwY88True() {  			
    	setIp0040iPostDateServSw( ip0040iPostDteServSwY8888Value);
   	}
	char[] ip0040iPostDteServSwN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iPostDteServSwN88()
	 *	@return  Returns true if isIp0040iPostDteServSwN88() is "N"
	 */
   public boolean isIp0040iPostDteServSwN88() throws CFException {
      return (  compareChars( getIp0040iPostDateServSw() , ip0040iPostDteServSwN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iPostDteServSwN88True() {  			
    	setIp0040iPostDateServSw( ip0040iPostDteServSwN8888Value);
   	}
	/**
	 *	Returns the value of ip0040iMealVoucherInd
	 *	@return ip0040iMealVoucherInd
	 */
   public char[] getIp0040iMealVoucherInd() throws CFException{
     if (isIp0040iMealVoucherIndModified()) { 
        ip0040iMealVoucherInd = refreshIp0040iMealVoucherInd();
     }
   		return ip0040iMealVoucherInd;
   }

  
	/**
	*  set variable ip0040iMealVoucherInd
	*  Corresponding COBOL Variable is IP0040I-MEAL-VOUCHER-IND
	*  @param value
	**/
   public void setIp0040iMealVoucherInd(char[] value) {
      ip0040iMealVoucherInd = checkIp0040iMealVoucherIndConstraints(value);
      serializeIp0040iMealVoucherInd(ip0040iMealVoucherInd);
   } 

     /**
	 * 	Update Ip0040iMealVoucherInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iMealVoucherInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iMealVoucherInd,ip0040iMealVoucherInd.length);
   	
   }
   
   public void setIp0040iMealVoucherInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iMealVoucherInd,ip0040iMealVoucherInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iMealVoucherInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iMealVoucherInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iMealVoucherInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iMealVoucherInd with another Field
	 *	@param value
	 */
   public void setIp0040iMealVoucherInd(Field source) {
       replace(source,0,source.length(),beginIp0040iMealVoucherInd,IP_0040I_MEAL_VOUCHER_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iMealVoucherInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iMealVoucherInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iMealVoucherInd,IP_0040I_MEAL_VOUCHER_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iMealVoucherInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iMealVoucherInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iMealVoucherInd+targetIndex,targetLen);
    
   }
	char[] ip0040iMealVoucherIndY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iMealVoucherIndY88()
	 *	@return  Returns true if isIp0040iMealVoucherIndY88() is "Y"
	 */
   public boolean isIp0040iMealVoucherIndY88() throws CFException {
      return (  compareChars( getIp0040iMealVoucherInd() , ip0040iMealVoucherIndY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iMealVoucherIndY88True() {  			
    	setIp0040iMealVoucherInd( ip0040iMealVoucherIndY8888Value);
   	}
	char[] ip0040iMealVoucherIndN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iMealVoucherIndN88()
	 *	@return  Returns true if isIp0040iMealVoucherIndN88() is "N"
	 */
   public boolean isIp0040iMealVoucherIndN88() throws CFException {
      return (  compareChars( getIp0040iMealVoucherInd() , ip0040iMealVoucherIndN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iMealVoucherIndN88True() {  			
    	setIp0040iMealVoucherInd( ip0040iMealVoucherIndN8888Value);
   	}
	/**
	 *	Returns the value of ip0040iNonRldblPrpdSw
	 *	@return ip0040iNonRldblPrpdSw
	 */
   public char[] getIp0040iNonRldblPrpdSw() throws CFException{
     if (isIp0040iNonRldblPrpdSwModified()) { 
        ip0040iNonRldblPrpdSw = refreshIp0040iNonRldblPrpdSw();
     }
   		return ip0040iNonRldblPrpdSw;
   }

  
	/**
	*  set variable ip0040iNonRldblPrpdSw
	*  Corresponding COBOL Variable is IP0040I-NON-RLDBL-PRPD-SW
	*  @param value
	**/
   public void setIp0040iNonRldblPrpdSw(char[] value) {
      ip0040iNonRldblPrpdSw = checkIp0040iNonRldblPrpdSwConstraints(value);
      serializeIp0040iNonRldblPrpdSw(ip0040iNonRldblPrpdSw);
   } 

     /**
	 * 	Update Ip0040iNonRldblPrpdSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iNonRldblPrpdSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iNonRldblPrpdSw,ip0040iNonRldblPrpdSw.length);
   	
   }
   
   public void setIp0040iNonRldblPrpdSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iNonRldblPrpdSw,ip0040iNonRldblPrpdSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iNonRldblPrpdSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iNonRldblPrpdSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iNonRldblPrpdSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iNonRldblPrpdSw with another Field
	 *	@param value
	 */
   public void setIp0040iNonRldblPrpdSw(Field source) {
       replace(source,0,source.length(),beginIp0040iNonRldblPrpdSw,IP_0040I_NON_RLDBL_PRPD_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iNonRldblPrpdSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iNonRldblPrpdSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iNonRldblPrpdSw,IP_0040I_NON_RLDBL_PRPD_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iNonRldblPrpdSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iNonRldblPrpdSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iNonRldblPrpdSw+targetIndex,targetLen);
    
   }
	char[] ip0040iNonRldblPrpd8888Value = "01".toCharArray();
	/**
	 *	Test condition "01" for isIp0040iNonRldblPrpd88()
	 *	@return  Returns true if isIp0040iNonRldblPrpd88() is "01"
	 */
   public boolean isIp0040iNonRldblPrpd88() throws CFException {
      return (  compareChars( getIp0040iNonRldblPrpdSw() , ip0040iNonRldblPrpd8888Value)  == 0  );
   }


	/**
	*  set values "01"
	*/
   	public void setIp0040iNonRldblPrpd88True() {  			
    	setIp0040iNonRldblPrpdSw( ip0040iNonRldblPrpd8888Value);
   	}
	char[] ip0040iNonRldlPrpdNomc8888Value = "99".toCharArray();
	/**
	 *	Test condition "99" for isIp0040iNonRldlPrpdNomc88()
	 *	@return  Returns true if isIp0040iNonRldlPrpdNomc88() is "99"
	 */
   public boolean isIp0040iNonRldlPrpdNomc88() throws CFException {
      return (  compareChars( getIp0040iNonRldblPrpdSw() , ip0040iNonRldlPrpdNomc8888Value)  == 0  );
   }


	/**
	*  set values "99"
	*/
   	public void setIp0040iNonRldlPrpdNomc88True() {  			
    	setIp0040iNonRldblPrpdSw( ip0040iNonRldlPrpdNomc8888Value);
   	}
	/**
	 *	Returns the value of ip0040iFasterFundsInd
	 *	@return ip0040iFasterFundsInd
	 */
   public char[] getIp0040iFasterFundsInd() throws CFException{
     if (isIp0040iFasterFundsIndModified()) { 
        ip0040iFasterFundsInd = refreshIp0040iFasterFundsInd();
     }
   		return ip0040iFasterFundsInd;
   }

  
	/**
	*  set variable ip0040iFasterFundsInd
	*  Corresponding COBOL Variable is IP0040I-FASTER-FUNDS-IND
	*  @param value
	**/
   public void setIp0040iFasterFundsInd(char[] value) {
      ip0040iFasterFundsInd = checkIp0040iFasterFundsIndConstraints(value);
      serializeIp0040iFasterFundsInd(ip0040iFasterFundsInd);
   } 

     /**
	 * 	Update Ip0040iFasterFundsInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iFasterFundsInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iFasterFundsInd,ip0040iFasterFundsInd.length);
   	
   }
   
   public void setIp0040iFasterFundsInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iFasterFundsInd,ip0040iFasterFundsInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iFasterFundsInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iFasterFundsInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iFasterFundsInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iFasterFundsInd with another Field
	 *	@param value
	 */
   public void setIp0040iFasterFundsInd(Field source) {
       replace(source,0,source.length(),beginIp0040iFasterFundsInd,IP_0040I_FASTER_FUNDS_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iFasterFundsInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iFasterFundsInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iFasterFundsInd,IP_0040I_FASTER_FUNDS_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iFasterFundsInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iFasterFundsInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iFasterFundsInd+targetIndex,targetLen);
    
   }
	char[] ip0040iFasterFundsNo8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iFasterFundsNo88()
	 *	@return  Returns true if isIp0040iFasterFundsNo88() is "N"
	 */
   public boolean isIp0040iFasterFundsNo88() throws CFException {
      return (  compareChars( getIp0040iFasterFundsInd() , ip0040iFasterFundsNo8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iFasterFundsNo88True() {  			
    	setIp0040iFasterFundsInd( ip0040iFasterFundsNo8888Value);
   	}
	char[] ip0040iFasterFundsDom8888Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isIp0040iFasterFundsDom88()
	 *	@return  Returns true if isIp0040iFasterFundsDom88() is "D"
	 */
   public boolean isIp0040iFasterFundsDom88() throws CFException {
      return (  compareChars( getIp0040iFasterFundsInd() , ip0040iFasterFundsDom8888Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setIp0040iFasterFundsDom88True() {  			
    	setIp0040iFasterFundsInd( ip0040iFasterFundsDom8888Value);
   	}
	char[] ip0040iFstrFndDomCrs8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iFstrFndDomCrs88()
	 *	@return  Returns true if isIp0040iFstrFndDomCrs88() is "Y"
	 */
   public boolean isIp0040iFstrFndDomCrs88() throws CFException {
      return (  compareChars( getIp0040iFasterFundsInd() , ip0040iFstrFndDomCrs8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iFstrFndDomCrs88True() {  			
    	setIp0040iFasterFundsInd( ip0040iFstrFndDomCrs8888Value);
   	}
	/**
	 *	Returns the value of ip0040iAnonPrepaidInd
	 *	@return ip0040iAnonPrepaidInd
	 */
   public char[] getIp0040iAnonPrepaidInd() throws CFException{
     if (isIp0040iAnonPrepaidIndModified()) { 
        ip0040iAnonPrepaidInd = refreshIp0040iAnonPrepaidInd();
     }
   		return ip0040iAnonPrepaidInd;
   }

  
	/**
	*  set variable ip0040iAnonPrepaidInd
	*  Corresponding COBOL Variable is IP0040I-ANON-PREPAID-IND
	*  @param value
	**/
   public void setIp0040iAnonPrepaidInd(char[] value) {
      ip0040iAnonPrepaidInd = checkIp0040iAnonPrepaidIndConstraints(value);
      serializeIp0040iAnonPrepaidInd(ip0040iAnonPrepaidInd);
   } 

     /**
	 * 	Update Ip0040iAnonPrepaidInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iAnonPrepaidInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iAnonPrepaidInd,ip0040iAnonPrepaidInd.length);
   	
   }
   
   public void setIp0040iAnonPrepaidInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iAnonPrepaidInd,ip0040iAnonPrepaidInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iAnonPrepaidInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iAnonPrepaidInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iAnonPrepaidInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iAnonPrepaidInd with another Field
	 *	@param value
	 */
   public void setIp0040iAnonPrepaidInd(Field source) {
       replace(source,0,source.length(),beginIp0040iAnonPrepaidInd,IP_0040I_ANON_PREPAID_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iAnonPrepaidInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iAnonPrepaidInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iAnonPrepaidInd,IP_0040I_ANON_PREPAID_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iAnonPrepaidInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iAnonPrepaidInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iAnonPrepaidInd+targetIndex,targetLen);
    
   }
	char[] ip0040iAnonPrepaidIndN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iAnonPrepaidIndN88()
	 *	@return  Returns true if isIp0040iAnonPrepaidIndN88() is "N"
	 */
   public boolean isIp0040iAnonPrepaidIndN88() throws CFException {
      return (  compareChars( getIp0040iAnonPrepaidInd() , ip0040iAnonPrepaidIndN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iAnonPrepaidIndN88True() {  			
    	setIp0040iAnonPrepaidInd( ip0040iAnonPrepaidIndN8888Value);
   	}
	char[] ip0040iAnonPrepaidIndE8888Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isIp0040iAnonPrepaidIndE88()
	 *	@return  Returns true if isIp0040iAnonPrepaidIndE88() is "E"
	 */
   public boolean isIp0040iAnonPrepaidIndE88() throws CFException {
      return (  compareChars( getIp0040iAnonPrepaidInd() , ip0040iAnonPrepaidIndE8888Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setIp0040iAnonPrepaidIndE88True() {  			
    	setIp0040iAnonPrepaidInd( ip0040iAnonPrepaidIndE8888Value);
   	}
	char[] ip0040iAnonPrepaidIndA8888Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isIp0040iAnonPrepaidIndA88()
	 *	@return  Returns true if isIp0040iAnonPrepaidIndA88() is "A"
	 */
   public boolean isIp0040iAnonPrepaidIndA88() throws CFException {
      return (  compareChars( getIp0040iAnonPrepaidInd() , ip0040iAnonPrepaidIndA8888Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setIp0040iAnonPrepaidIndA88True() {  			
    	setIp0040iAnonPrepaidInd( ip0040iAnonPrepaidIndA8888Value);
   	}
	char[] ip0040iAnonPrepaidIndU8888Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isIp0040iAnonPrepaidIndU88()
	 *	@return  Returns true if isIp0040iAnonPrepaidIndU88() is "U"
	 */
   public boolean isIp0040iAnonPrepaidIndU88() throws CFException {
      return (  compareChars( getIp0040iAnonPrepaidInd() , ip0040iAnonPrepaidIndU8888Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setIp0040iAnonPrepaidIndU88True() {  			
    	setIp0040iAnonPrepaidInd( ip0040iAnonPrepaidIndU8888Value);
   	}
	/**
	 *	Returns the value of ip0040iDccStatusInd
	 *	@return ip0040iDccStatusInd
	 */
   public char[] getIp0040iDccStatusInd() throws CFException{
     if (isIp0040iDccStatusIndModified()) { 
        ip0040iDccStatusInd = refreshIp0040iDccStatusInd();
     }
   		return ip0040iDccStatusInd;
   }

  
	/**
	*  set variable ip0040iDccStatusInd
	*  Corresponding COBOL Variable is IP0040I-DCC-STATUS-IND
	*  @param value
	**/
   public void setIp0040iDccStatusInd(char[] value) {
      ip0040iDccStatusInd = checkIp0040iDccStatusIndConstraints(value);
      serializeIp0040iDccStatusInd(ip0040iDccStatusInd);
   } 

     /**
	 * 	Update Ip0040iDccStatusInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iDccStatusInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iDccStatusInd,ip0040iDccStatusInd.length);
   	
   }
   
   public void setIp0040iDccStatusInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iDccStatusInd,ip0040iDccStatusInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iDccStatusInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iDccStatusInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iDccStatusInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iDccStatusInd with another Field
	 *	@param value
	 */
   public void setIp0040iDccStatusInd(Field source) {
       replace(source,0,source.length(),beginIp0040iDccStatusInd,IP_0040I_DCC_STATUS_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iDccStatusInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iDccStatusInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iDccStatusInd,IP_0040I_DCC_STATUS_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iDccStatusInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iDccStatusInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iDccStatusInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iPayByAcctInd
	 *	@return ip0040iPayByAcctInd
	 */
   public char[] getIp0040iPayByAcctInd() throws CFException{
     if (isIp0040iPayByAcctIndModified()) { 
        ip0040iPayByAcctInd = refreshIp0040iPayByAcctInd();
     }
   		return ip0040iPayByAcctInd;
   }

  
	/**
	*  set variable ip0040iPayByAcctInd
	*  Corresponding COBOL Variable is IP0040I-PAY-BY-ACCT-IND
	*  @param value
	**/
   public void setIp0040iPayByAcctInd(char[] value) {
      ip0040iPayByAcctInd = checkIp0040iPayByAcctIndConstraints(value);
      serializeIp0040iPayByAcctInd(ip0040iPayByAcctInd);
   } 

     /**
	 * 	Update Ip0040iPayByAcctInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iPayByAcctInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iPayByAcctInd,ip0040iPayByAcctInd.length);
   	
   }
   
   public void setIp0040iPayByAcctInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iPayByAcctInd,ip0040iPayByAcctInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iPayByAcctInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iPayByAcctInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iPayByAcctInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iPayByAcctInd with another Field
	 *	@param value
	 */
   public void setIp0040iPayByAcctInd(Field source) {
       replace(source,0,source.length(),beginIp0040iPayByAcctInd,IP_0040I_PAY_BY_ACCT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iPayByAcctInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iPayByAcctInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iPayByAcctInd,IP_0040I_PAY_BY_ACCT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iPayByAcctInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iPayByAcctInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iPayByAcctInd+targetIndex,targetLen);
    
   }
	char[] ip0040iPayByAcctIndY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iPayByAcctIndY88()
	 *	@return  Returns true if isIp0040iPayByAcctIndY88() is "Y"
	 */
   public boolean isIp0040iPayByAcctIndY88() throws CFException {
      return (  compareChars( getIp0040iPayByAcctInd() , ip0040iPayByAcctIndY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iPayByAcctIndY88True() {  			
    	setIp0040iPayByAcctInd( ip0040iPayByAcctIndY8888Value);
   	}
	char[] ip0040iPayByAcctIndN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iPayByAcctIndN88()
	 *	@return  Returns true if isIp0040iPayByAcctIndN88() is "N"
	 */
   public boolean isIp0040iPayByAcctIndN88() throws CFException {
      return (  compareChars( getIp0040iPayByAcctInd() , ip0040iPayByAcctIndN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iPayByAcctIndN88True() {  			
    	setIp0040iPayByAcctInd( ip0040iPayByAcctIndN8888Value);
   	}
	/**
	 *	Returns the value of ip0040iIssGamParticipSw
	 *	@return ip0040iIssGamParticipSw
	 */
   public char[] getIp0040iIssGamParticipSw() throws CFException{
     if (isIp0040iIssGamParticipSwModified()) { 
        ip0040iIssGamParticipSw = refreshIp0040iIssGamParticipSw();
     }
   		return ip0040iIssGamParticipSw;
   }

  
	/**
	*  set variable ip0040iIssGamParticipSw
	*  Corresponding COBOL Variable is IP0040I-ISS-GAM-PARTICIP-SW
	*  @param value
	**/
   public void setIp0040iIssGamParticipSw(char[] value) {
      ip0040iIssGamParticipSw = checkIp0040iIssGamParticipSwConstraints(value);
      serializeIp0040iIssGamParticipSw(ip0040iIssGamParticipSw);
   } 

     /**
	 * 	Update Ip0040iIssGamParticipSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iIssGamParticipSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iIssGamParticipSw,ip0040iIssGamParticipSw.length);
   	
   }
   
   public void setIp0040iIssGamParticipSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iIssGamParticipSw,ip0040iIssGamParticipSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iIssGamParticipSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iIssGamParticipSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iIssGamParticipSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iIssGamParticipSw with another Field
	 *	@param value
	 */
   public void setIp0040iIssGamParticipSw(Field source) {
       replace(source,0,source.length(),beginIp0040iIssGamParticipSw,IP_0040I_ISS_GAM_PARTICIP_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iIssGamParticipSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iIssGamParticipSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iIssGamParticipSw,IP_0040I_ISS_GAM_PARTICIP_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iIssGamParticipSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iIssGamParticipSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iIssGamParticipSw+targetIndex,targetLen);
    
   }
	char[] ip0040iIssGamParticipY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iIssGamParticipY88()
	 *	@return  Returns true if isIp0040iIssGamParticipY88() is "Y"
	 */
   public boolean isIp0040iIssGamParticipY88() throws CFException {
      return (  compareChars( getIp0040iIssGamParticipSw() , ip0040iIssGamParticipY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iIssGamParticipY88True() {  			
    	setIp0040iIssGamParticipSw( ip0040iIssGamParticipY8888Value);
   	}
	char[] ip0040iIssGamParticipN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iIssGamParticipN88()
	 *	@return  Returns true if isIp0040iIssGamParticipN88() is "N"
	 */
   public boolean isIp0040iIssGamParticipN88() throws CFException {
      return (  compareChars( getIp0040iIssGamParticipSw() , ip0040iIssGamParticipN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iIssGamParticipN88True() {  			
    	setIp0040iIssGamParticipSw( ip0040iIssGamParticipN8888Value);
   	}
	/**
	 *	Returns the value of ip0040iMemberFiller
	 *	@return ip0040iMemberFiller
	 */
   public char[] getIp0040iMemberFiller() throws CFException{
     if (isIp0040iMemberFillerModified()) { 
        ip0040iMemberFiller = refreshIp0040iMemberFiller();
     }
   		return ip0040iMemberFiller;
   }

  
	/**
	*  set variable ip0040iMemberFiller
	*  Corresponding COBOL Variable is IP0040I-MEMBER-FILLER
	*  @param value
	**/
   public void setIp0040iMemberFiller(char[] value) {
      ip0040iMemberFiller = checkIp0040iMemberFillerConstraints(value);
      serializeIp0040iMemberFiller(ip0040iMemberFiller);
   } 

     /**
	 * 	Update Ip0040iMemberFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iMemberFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iMemberFiller,ip0040iMemberFiller.length);
   	
   }
   
   public void setIp0040iMemberFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iMemberFiller,ip0040iMemberFiller.length);
   	
   }
   
     /**
	 * 	Update Ip0040iMemberFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iMemberFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iMemberFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iMemberFiller with another Field
	 *	@param value
	 */
   public void setIp0040iMemberFiller(Field source) {
       replace(source,0,source.length(),beginIp0040iMemberFiller,IP_0040I_MEMBER_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iMemberFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iMemberFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iMemberFiller,IP_0040I_MEMBER_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iMemberFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iMemberFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iMemberFiller+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iChbConvExclId
	 *	@return ip0040iChbConvExclId
	 */
   public char[] getIp0040iChbConvExclId() throws CFException{
     if (isIp0040iChbConvExclIdModified()) { 
        ip0040iChbConvExclId = refreshIp0040iChbConvExclId();
     }
   		return ip0040iChbConvExclId;
   }

  
	/**
	*  set variable ip0040iChbConvExclId
	*  Corresponding COBOL Variable is IP0040I-CHB-CONV-EXCL-ID
	*  @param value
	**/
   public void setIp0040iChbConvExclId(char[] value) {
      ip0040iChbConvExclId = checkIp0040iChbConvExclIdConstraints(value);
      serializeIp0040iChbConvExclId(ip0040iChbConvExclId);
   } 

     /**
	 * 	Update Ip0040iChbConvExclId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iChbConvExclId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iChbConvExclId,ip0040iChbConvExclId.length);
   	
   }
   
   public void setIp0040iChbConvExclId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iChbConvExclId,ip0040iChbConvExclId.length);
   	
   }
   
     /**
	 * 	Update Ip0040iChbConvExclId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iChbConvExclId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iChbConvExclId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iChbConvExclId with another Field
	 *	@param value
	 */
   public void setIp0040iChbConvExclId(Field source) {
       replace(source,0,source.length(),beginIp0040iChbConvExclId,IP_0040I_CHB_CONV_EXCL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iChbConvExclId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iChbConvExclId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iChbConvExclId,IP_0040I_CHB_CONV_EXCL_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iChbConvExclId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iChbConvExclId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iChbConvExclId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iChbConvExclExpire
	 *	@return ip0040iChbConvExclExpire
	 */
	public long getIp0040iChbConvExclExpire() throws CFException {
       if (isIp0040iChbConvExclExpireModified()) { 
           ip0040iChbConvExclExpire = refreshIp0040iChbConvExclExpire();
        }
   		return ip0040iChbConvExclExpire;
	}
	

	
	   
	/**
	 * 	Update Ip0040iChbConvExclExpire with the passed value
	 *  Corresponding COBOL Variable is IP0040I-CHB-CONV-EXCL-EXPIRE
	 *	@param number
	 */
	public void setIp0040iChbConvExclExpire(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040iChbConvExclExpire = checkIp0040iChbConvExclExpireMaxLimit(number); 
		serializeIp0040iChbConvExclExpire(ip0040iChbConvExclExpire);
	}
	

	/**
	 * 	Update Ip0040iChbConvExclExpire with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040iChbConvExclExpire(char[] value) throws CFException {
		 ip0040iChbConvExclExpire = serializeIp0040iChbConvExclExpire(value);
	}
	/**
	 * 	Update Ip0040iChbConvExclExpire with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040iChbConvExclExpireString(char[] value) throws CFException {
		 setIp0040iChbConvExclExpire(value);
	}
	/**
	 *	Returns the value of ip0040iHardshipIndicator
	 *	@return ip0040iHardshipIndicator
	 */
   public char[] getIp0040iHardshipIndicator() throws CFException{
     if (isIp0040iHardshipIndicatorModified()) { 
        ip0040iHardshipIndicator = refreshIp0040iHardshipIndicator();
     }
   		return ip0040iHardshipIndicator;
   }

  
	/**
	*  set variable ip0040iHardshipIndicator
	*  Corresponding COBOL Variable is IP0040I-HARDSHIP-INDICATOR
	*  @param value
	**/
   public void setIp0040iHardshipIndicator(char[] value) {
      ip0040iHardshipIndicator = checkIp0040iHardshipIndicatorConstraints(value);
      serializeIp0040iHardshipIndicator(ip0040iHardshipIndicator);
   } 

     /**
	 * 	Update Ip0040iHardshipIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iHardshipIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iHardshipIndicator,ip0040iHardshipIndicator.length);
   	
   }
   
   public void setIp0040iHardshipIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iHardshipIndicator,ip0040iHardshipIndicator.length);
   	
   }
   
     /**
	 * 	Update Ip0040iHardshipIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iHardshipIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iHardshipIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iHardshipIndicator with another Field
	 *	@param value
	 */
   public void setIp0040iHardshipIndicator(Field source) {
       replace(source,0,source.length(),beginIp0040iHardshipIndicator,IP_0040I_HARDSHIP_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iHardshipIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iHardshipIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iHardshipIndicator,IP_0040I_HARDSHIP_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iHardshipIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iHardshipIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iHardshipIndicator+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iHardshipEffective
	 *	@return ip0040iHardshipEffective
	 */
	public long getIp0040iHardshipEffective() throws CFException {
       if (isIp0040iHardshipEffectiveModified()) { 
           ip0040iHardshipEffective = refreshIp0040iHardshipEffective();
        }
   		return ip0040iHardshipEffective;
	}
	

	
	   
	/**
	 * 	Update Ip0040iHardshipEffective with the passed value
	 *  Corresponding COBOL Variable is IP0040I-HARDSHIP-EFFECTIVE
	 *	@param number
	 */
	public void setIp0040iHardshipEffective(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040iHardshipEffective = checkIp0040iHardshipEffectiveMaxLimit(number); 
		serializeIp0040iHardshipEffective(ip0040iHardshipEffective);
	}
	

	/**
	 * 	Update Ip0040iHardshipEffective with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040iHardshipEffective(char[] value) throws CFException {
		 ip0040iHardshipEffective = serializeIp0040iHardshipEffective(value);
	}
	/**
	 * 	Update Ip0040iHardshipEffective with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040iHardshipEffectiveString(char[] value) throws CFException {
		 setIp0040iHardshipEffective(value);
	}
	/**
	 *	Returns the value of ip0040iHardshipExpiration
	 *	@return ip0040iHardshipExpiration
	 */
	public long getIp0040iHardshipExpiration() throws CFException {
       if (isIp0040iHardshipExpirationModified()) { 
           ip0040iHardshipExpiration = refreshIp0040iHardshipExpiration();
        }
   		return ip0040iHardshipExpiration;
	}
	

	
	   
	/**
	 * 	Update Ip0040iHardshipExpiration with the passed value
	 *  Corresponding COBOL Variable is IP0040I-HARDSHIP-EXPIRATION
	 *	@param number
	 */
	public void setIp0040iHardshipExpiration(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040iHardshipExpiration = checkIp0040iHardshipExpirationMaxLimit(number); 
		serializeIp0040iHardshipExpiration(ip0040iHardshipExpiration);
	}
	

	/**
	 * 	Update Ip0040iHardshipExpiration with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040iHardshipExpiration(char[] value) throws CFException {
		 ip0040iHardshipExpiration = serializeIp0040iHardshipExpiration(value);
	}
	/**
	 * 	Update Ip0040iHardshipExpiration with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040iHardshipExpirationString(char[] value) throws CFException {
		 setIp0040iHardshipExpiration(value);
	}
	/**
	 *	Returns the value of ip0040iGamingCountrySw
	 *	@return ip0040iGamingCountrySw
	 */
   public char[] getIp0040iGamingCountrySw() throws CFException{
     if (isIp0040iGamingCountrySwModified()) { 
        ip0040iGamingCountrySw = refreshIp0040iGamingCountrySw();
     }
   		return ip0040iGamingCountrySw;
   }

  
	/**
	*  set variable ip0040iGamingCountrySw
	*  Corresponding COBOL Variable is IP0040I-GAMING-COUNTRY-SW
	*  @param value
	**/
   public void setIp0040iGamingCountrySw(char[] value) {
      ip0040iGamingCountrySw = checkIp0040iGamingCountrySwConstraints(value);
      serializeIp0040iGamingCountrySw(ip0040iGamingCountrySw);
   } 

     /**
	 * 	Update Ip0040iGamingCountrySw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iGamingCountrySw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iGamingCountrySw,ip0040iGamingCountrySw.length);
   	
   }
   
   public void setIp0040iGamingCountrySw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iGamingCountrySw,ip0040iGamingCountrySw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iGamingCountrySw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iGamingCountrySw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iGamingCountrySw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iGamingCountrySw with another Field
	 *	@param value
	 */
   public void setIp0040iGamingCountrySw(Field source) {
       replace(source,0,source.length(),beginIp0040iGamingCountrySw,IP_0040I_GAMING_COUNTRY_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iGamingCountrySw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iGamingCountrySw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iGamingCountrySw,IP_0040I_GAMING_COUNTRY_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iGamingCountrySw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iGamingCountrySw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iGamingCountrySw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iCrossBorderInd
	 *	@return ip0040iCrossBorderInd
	 */
	public int getIp0040iCrossBorderInd() throws CFException {
       if (isIp0040iCrossBorderIndModified()) { 
           ip0040iCrossBorderInd = refreshIp0040iCrossBorderInd();
        }
   		return ip0040iCrossBorderInd;
	}
	

	
	   
	/**
	 * 	Update Ip0040iCrossBorderInd with the passed value
	 *  Corresponding COBOL Variable is IP0040I-CROSS-BORDER-IND
	 *	@param number
	 */
	public void setIp0040iCrossBorderInd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040iCrossBorderInd = checkIp0040iCrossBorderIndMaxLimit(number); 
		serializeIp0040iCrossBorderInd(ip0040iCrossBorderInd);
	}
	

	public void setIp0040iCrossBorderInd(long number) {
	    number = checkIp0040iCrossBorderIndMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0040iCrossBorderInd((int)number);
	}
	
	/**
	 * 	Update Ip0040iCrossBorderInd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040iCrossBorderInd(char[] value) throws CFException {
		 ip0040iCrossBorderInd = serializeIp0040iCrossBorderInd(value);
	}
	/**
	 * 	Update Ip0040iCrossBorderInd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040iCrossBorderIndString(char[] value) throws CFException {
		 setIp0040iCrossBorderInd(value);
	}
	/**
	 *	Returns the value of ip0040iRecPaymtCanSw
	 *	@return ip0040iRecPaymtCanSw
	 */
   public char[] getIp0040iRecPaymtCanSw() throws CFException{
     if (isIp0040iRecPaymtCanSwModified()) { 
        ip0040iRecPaymtCanSw = refreshIp0040iRecPaymtCanSw();
     }
   		return ip0040iRecPaymtCanSw;
   }

  
	/**
	*  set variable ip0040iRecPaymtCanSw
	*  Corresponding COBOL Variable is IP0040I-REC-PAYMT-CAN-SW
	*  @param value
	**/
   public void setIp0040iRecPaymtCanSw(char[] value) {
      ip0040iRecPaymtCanSw = checkIp0040iRecPaymtCanSwConstraints(value);
      serializeIp0040iRecPaymtCanSw(ip0040iRecPaymtCanSw);
   } 

     /**
	 * 	Update Ip0040iRecPaymtCanSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iRecPaymtCanSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iRecPaymtCanSw,ip0040iRecPaymtCanSw.length);
   	
   }
   
   public void setIp0040iRecPaymtCanSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRecPaymtCanSw,ip0040iRecPaymtCanSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iRecPaymtCanSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iRecPaymtCanSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRecPaymtCanSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iRecPaymtCanSw with another Field
	 *	@param value
	 */
   public void setIp0040iRecPaymtCanSw(Field source) {
       replace(source,0,source.length(),beginIp0040iRecPaymtCanSw,IP_0040I_REC_PAYMT_CAN_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iRecPaymtCanSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iRecPaymtCanSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iRecPaymtCanSw,IP_0040I_REC_PAYMT_CAN_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iRecPaymtCanSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iRecPaymtCanSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRecPaymtCanSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iDomDbtParticipSw
	 *	@return ip0040iDomDbtParticipSw
	 */
   public char[] getIp0040iDomDbtParticipSw() throws CFException{
     if (isIp0040iDomDbtParticipSwModified()) { 
        ip0040iDomDbtParticipSw = refreshIp0040iDomDbtParticipSw();
     }
   		return ip0040iDomDbtParticipSw;
   }

  
	/**
	*  set variable ip0040iDomDbtParticipSw
	*  Corresponding COBOL Variable is IP0040I-DOM-DBT-PARTICIP-SW
	*  @param value
	**/
   public void setIp0040iDomDbtParticipSw(char[] value) {
      ip0040iDomDbtParticipSw = checkIp0040iDomDbtParticipSwConstraints(value);
      serializeIp0040iDomDbtParticipSw(ip0040iDomDbtParticipSw);
   } 

     /**
	 * 	Update Ip0040iDomDbtParticipSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iDomDbtParticipSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iDomDbtParticipSw,ip0040iDomDbtParticipSw.length);
   	
   }
   
   public void setIp0040iDomDbtParticipSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iDomDbtParticipSw,ip0040iDomDbtParticipSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iDomDbtParticipSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iDomDbtParticipSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iDomDbtParticipSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iDomDbtParticipSw with another Field
	 *	@param value
	 */
   public void setIp0040iDomDbtParticipSw(Field source) {
       replace(source,0,source.length(),beginIp0040iDomDbtParticipSw,IP_0040I_DOM_DBT_PARTICIP_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iDomDbtParticipSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iDomDbtParticipSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iDomDbtParticipSw,IP_0040I_DOM_DBT_PARTICIP_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iDomDbtParticipSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iDomDbtParticipSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iDomDbtParticipSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iGrpCode
	 *	@return ip0040iGrpCode
	 */   
	 public Ip0040iGrpCode getIp0040iGrpCode() {
   	return ip0040iGrpCode;
   }
   /**
	* 	Update Ip0040iGrpCode with the passed value
	*   Corresponding COBOL Variable is IP0040I-GRP-CODE
	*	@param value
	*/
   public void setIp0040iGrpCode(char[] value) {
      ip0040iGrpCode.setString(value); 
   }   
    
     /**
	 * 	Update Ip0040iGrpCode 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0040iGrpCode(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iGrpCode.begin,ip0040iGrpCode.length());
   }
   
     /**
	 * 	Update Ip0040iGrpCode 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iGrpCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iGrpCode.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0040iGrpCode with another Field
	 *	@param value
	 */
   public void setIp0040iGrpCode(Field source) {
   	replace(source,0,source.length(),ip0040iGrpCode.begin,ip0040iGrpCode.length());
   }  
   
     /**
	 * 	Update Ip0040iGrpCode 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0040iGrpCode(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iGrpCode.begin,ip0040iGrpCode.length());
   }
   
     /**
	 * 	Update Ip0040iGrpCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iGrpCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040iGrpCode.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip0040iIpcFraudCtlSw
	 *	@return ip0040iIpcFraudCtlSw
	 */
   public char[] getIp0040iIpcFraudCtlSw() throws CFException{
     if (isIp0040iIpcFraudCtlSwModified()) { 
        ip0040iIpcFraudCtlSw = refreshIp0040iIpcFraudCtlSw();
     }
   		return ip0040iIpcFraudCtlSw;
   }

  
	/**
	*  set variable ip0040iIpcFraudCtlSw
	*  Corresponding COBOL Variable is IP0040I-IPC-FRAUD-CTL-SW
	*  @param value
	**/
   public void setIp0040iIpcFraudCtlSw(char[] value) {
      ip0040iIpcFraudCtlSw = checkIp0040iIpcFraudCtlSwConstraints(value);
      serializeIp0040iIpcFraudCtlSw(ip0040iIpcFraudCtlSw);
   } 

     /**
	 * 	Update Ip0040iIpcFraudCtlSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iIpcFraudCtlSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iIpcFraudCtlSw,ip0040iIpcFraudCtlSw.length);
   	
   }
   
   public void setIp0040iIpcFraudCtlSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iIpcFraudCtlSw,ip0040iIpcFraudCtlSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iIpcFraudCtlSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iIpcFraudCtlSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iIpcFraudCtlSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iIpcFraudCtlSw with another Field
	 *	@param value
	 */
   public void setIp0040iIpcFraudCtlSw(Field source) {
       replace(source,0,source.length(),beginIp0040iIpcFraudCtlSw,IP_0040I_IPC_FRAUD_CTL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iIpcFraudCtlSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iIpcFraudCtlSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iIpcFraudCtlSw,IP_0040I_IPC_FRAUD_CTL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iIpcFraudCtlSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iIpcFraudCtlSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iIpcFraudCtlSw+targetIndex,targetLen);
    
   }
	char[] ip0040iIpcFraudY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iIpcFraudY88()
	 *	@return  Returns true if isIp0040iIpcFraudY88() is "Y"
	 */
   public boolean isIp0040iIpcFraudY88() throws CFException {
      return (  compareChars( getIp0040iIpcFraudCtlSw() , ip0040iIpcFraudY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iIpcFraudY88True() {  			
    	setIp0040iIpcFraudCtlSw( ip0040iIpcFraudY8888Value);
   	}
	char[] ip0040iIpcFraudN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iIpcFraudN88()
	 *	@return  Returns true if isIp0040iIpcFraudN88() is "N"
	 */
   public boolean isIp0040iIpcFraudN88() throws CFException {
      return (  compareChars( getIp0040iIpcFraudCtlSw() , ip0040iIpcFraudN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iIpcFraudN88True() {  			
    	setIp0040iIpcFraudCtlSw( ip0040iIpcFraudN8888Value);
   	}
	/**
	 *	Returns the value of ip0040iIccrParticipInd
	 *	@return ip0040iIccrParticipInd
	 */
   public char[] getIp0040iIccrParticipInd() throws CFException{
     if (isIp0040iIccrParticipIndModified()) { 
        ip0040iIccrParticipInd = refreshIp0040iIccrParticipInd();
     }
   		return ip0040iIccrParticipInd;
   }

  
	/**
	*  set variable ip0040iIccrParticipInd
	*  Corresponding COBOL Variable is IP0040I-ICCR-PARTICIP-IND
	*  @param value
	**/
   public void setIp0040iIccrParticipInd(char[] value) {
      ip0040iIccrParticipInd = checkIp0040iIccrParticipIndConstraints(value);
      serializeIp0040iIccrParticipInd(ip0040iIccrParticipInd);
   } 

     /**
	 * 	Update Ip0040iIccrParticipInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iIccrParticipInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iIccrParticipInd,ip0040iIccrParticipInd.length);
   	
   }
   
   public void setIp0040iIccrParticipInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iIccrParticipInd,ip0040iIccrParticipInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iIccrParticipInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iIccrParticipInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iIccrParticipInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iIccrParticipInd with another Field
	 *	@param value
	 */
   public void setIp0040iIccrParticipInd(Field source) {
       replace(source,0,source.length(),beginIp0040iIccrParticipInd,IP_0040I_ICCR_PARTICIP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iIccrParticipInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iIccrParticipInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iIccrParticipInd,IP_0040I_ICCR_PARTICIP_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iIccrParticipInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iIccrParticipInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iIccrParticipInd+targetIndex,targetLen);
    
   }
	char[] ip0040iItIsIccr8888Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isIp0040iItIsIccr88()
	 *	@return  Returns true if isIp0040iItIsIccr88() is "I"
	 */
   public boolean isIp0040iItIsIccr88() throws CFException {
      return (  compareChars( getIp0040iIccrParticipInd() , ip0040iItIsIccr8888Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setIp0040iItIsIccr88True() {  			
    	setIp0040iIccrParticipInd( ip0040iItIsIccr8888Value);
   	}
	char[] ip0040iItIsCccr8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp0040iItIsCccr88()
	 *	@return  Returns true if isIp0040iItIsCccr88() is "C"
	 */
   public boolean isIp0040iItIsCccr88() throws CFException {
      return (  compareChars( getIp0040iIccrParticipInd() , ip0040iItIsCccr8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp0040iItIsCccr88True() {  			
    	setIp0040iIccrParticipInd( ip0040iItIsCccr8888Value);
   	}
	char[] ip0040iItIsCcm8888Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isIp0040iItIsCcm88()
	 *	@return  Returns true if isIp0040iItIsCcm88() is "E"
	 */
   public boolean isIp0040iItIsCcm88() throws CFException {
      return (  compareChars( getIp0040iIccrParticipInd() , ip0040iItIsCcm8888Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setIp0040iItIsCcm88True() {  			
    	setIp0040iIccrParticipInd( ip0040iItIsCcm8888Value);
   	}
	/**
	 *	Returns the value of ip0040iRevCreditInd
	 *	@return ip0040iRevCreditInd
	 */
   public char[] getIp0040iRevCreditInd() throws CFException{
     if (isIp0040iRevCreditIndModified()) { 
        ip0040iRevCreditInd = refreshIp0040iRevCreditInd();
     }
   		return ip0040iRevCreditInd;
   }

  
	/**
	*  set variable ip0040iRevCreditInd
	*  Corresponding COBOL Variable is IP0040I-REV-CREDIT-IND
	*  @param value
	**/
   public void setIp0040iRevCreditInd(char[] value) {
      ip0040iRevCreditInd = checkIp0040iRevCreditIndConstraints(value);
      serializeIp0040iRevCreditInd(ip0040iRevCreditInd);
   } 

     /**
	 * 	Update Ip0040iRevCreditInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iRevCreditInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iRevCreditInd,ip0040iRevCreditInd.length);
   	
   }
   
   public void setIp0040iRevCreditInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRevCreditInd,ip0040iRevCreditInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iRevCreditInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iRevCreditInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRevCreditInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iRevCreditInd with another Field
	 *	@param value
	 */
   public void setIp0040iRevCreditInd(Field source) {
       replace(source,0,source.length(),beginIp0040iRevCreditInd,IP_0040I_REV_CREDIT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iRevCreditInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iRevCreditInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iRevCreditInd,IP_0040I_REV_CREDIT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iRevCreditInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iRevCreditInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRevCreditInd+targetIndex,targetLen);
    
   }
	char[] ip0040iRevCrdIndY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iRevCrdIndY88()
	 *	@return  Returns true if isIp0040iRevCrdIndY88() is "Y"
	 */
   public boolean isIp0040iRevCrdIndY88() throws CFException {
      return (  compareChars( getIp0040iRevCreditInd() , ip0040iRevCrdIndY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iRevCrdIndY88True() {  			
    	setIp0040iRevCreditInd( ip0040iRevCrdIndY8888Value);
   	}
	char[] ip0040iRevCrdIndN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iRevCrdIndN88()
	 *	@return  Returns true if isIp0040iRevCrdIndN88() is "N"
	 */
   public boolean isIp0040iRevCrdIndN88() throws CFException {
      return (  compareChars( getIp0040iRevCreditInd() , ip0040iRevCrdIndN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iRevCrdIndN88True() {  			
    	setIp0040iRevCreditInd( ip0040iRevCrdIndN8888Value);
   	}
	/**
	 *	Returns the value of ip0040iChgbkBkoutInd
	 *	@return ip0040iChgbkBkoutInd
	 */
   public char[] getIp0040iChgbkBkoutInd() throws CFException{
     if (isIp0040iChgbkBkoutIndModified()) { 
        ip0040iChgbkBkoutInd = refreshIp0040iChgbkBkoutInd();
     }
   		return ip0040iChgbkBkoutInd;
   }

  
	/**
	*  set variable ip0040iChgbkBkoutInd
	*  Corresponding COBOL Variable is IP0040I-CHGBK-BKOUT-IND
	*  @param value
	**/
   public void setIp0040iChgbkBkoutInd(char[] value) {
      ip0040iChgbkBkoutInd = checkIp0040iChgbkBkoutIndConstraints(value);
      serializeIp0040iChgbkBkoutInd(ip0040iChgbkBkoutInd);
   } 

     /**
	 * 	Update Ip0040iChgbkBkoutInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iChgbkBkoutInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iChgbkBkoutInd,ip0040iChgbkBkoutInd.length);
   	
   }
   
   public void setIp0040iChgbkBkoutInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iChgbkBkoutInd,ip0040iChgbkBkoutInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iChgbkBkoutInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iChgbkBkoutInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iChgbkBkoutInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iChgbkBkoutInd with another Field
	 *	@param value
	 */
   public void setIp0040iChgbkBkoutInd(Field source) {
       replace(source,0,source.length(),beginIp0040iChgbkBkoutInd,IP_0040I_CHGBK_BKOUT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iChgbkBkoutInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iChgbkBkoutInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iChgbkBkoutInd,IP_0040I_CHGBK_BKOUT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iChgbkBkoutInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iChgbkBkoutInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iChgbkBkoutInd+targetIndex,targetLen);
    
   }
	char[] ip0040iChgbkBkoutY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iChgbkBkoutY88()
	 *	@return  Returns true if isIp0040iChgbkBkoutY88() is "Y"
	 */
   public boolean isIp0040iChgbkBkoutY88() throws CFException {
      return (  compareChars( getIp0040iChgbkBkoutInd() , ip0040iChgbkBkoutY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iChgbkBkoutY88True() {  			
    	setIp0040iChgbkBkoutInd( ip0040iChgbkBkoutY8888Value);
   	}
	char[] ip0040iChgbkBkoutN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iChgbkBkoutN88()
	 *	@return  Returns true if isIp0040iChgbkBkoutN88() is "N"
	 */
   public boolean isIp0040iChgbkBkoutN88() throws CFException {
      return (  compareChars( getIp0040iChgbkBkoutInd() , ip0040iChgbkBkoutN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iChgbkBkoutN88True() {  			
    	setIp0040iChgbkBkoutInd( ip0040iChgbkBkoutN8888Value);
   	}
	/**
	 *	Returns the value of ip0040iRtnTrnstNum
	 *	@return ip0040iRtnTrnstNum
	 */
   public char[] getIp0040iRtnTrnstNum() throws CFException{
     if (isIp0040iRtnTrnstNumModified()) { 
        ip0040iRtnTrnstNum = refreshIp0040iRtnTrnstNum();
     }
   		return ip0040iRtnTrnstNum;
   }

  
	/**
	*  set variable ip0040iRtnTrnstNum
	*  Corresponding COBOL Variable is IP0040I-RTN-TRNST-NUM
	*  @param value
	**/
   public void setIp0040iRtnTrnstNum(char[] value) {
      ip0040iRtnTrnstNum = checkIp0040iRtnTrnstNumConstraints(value);
      serializeIp0040iRtnTrnstNum(ip0040iRtnTrnstNum);
   } 

     /**
	 * 	Update Ip0040iRtnTrnstNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iRtnTrnstNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iRtnTrnstNum,ip0040iRtnTrnstNum.length);
   	
   }
   
   public void setIp0040iRtnTrnstNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRtnTrnstNum,ip0040iRtnTrnstNum.length);
   	
   }
   
     /**
	 * 	Update Ip0040iRtnTrnstNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iRtnTrnstNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRtnTrnstNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iRtnTrnstNum with another Field
	 *	@param value
	 */
   public void setIp0040iRtnTrnstNum(Field source) {
       replace(source,0,source.length(),beginIp0040iRtnTrnstNum,IP_0040I_RTN_TRNST_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iRtnTrnstNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iRtnTrnstNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iRtnTrnstNum,IP_0040I_RTN_TRNST_NUM_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iRtnTrnstNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iRtnTrnstNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iRtnTrnstNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iTrueIssuerIca
	 *	@return ip0040iTrueIssuerIca
	 */
	public long getIp0040iTrueIssuerIca() throws CFException {
       if (isIp0040iTrueIssuerIcaModified()) { 
           ip0040iTrueIssuerIca = refreshIp0040iTrueIssuerIca();
        }
   		return ip0040iTrueIssuerIca;
	}
	

	
	   
	/**
	 * 	Update Ip0040iTrueIssuerIca with the passed value
	 *  Corresponding COBOL Variable is IP0040I-TRUE-ISSUER-ICA
	 *	@param number
	 */
	public void setIp0040iTrueIssuerIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040iTrueIssuerIca = checkIp0040iTrueIssuerIcaMaxLimit(number); 
		serializeIp0040iTrueIssuerIca(ip0040iTrueIssuerIca);
	}
	

	/**
	 * 	Update Ip0040iTrueIssuerIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040iTrueIssuerIca(char[] value) throws CFException {
		 ip0040iTrueIssuerIca = serializeIp0040iTrueIssuerIca(value);
	}
	/**
	 * 	Update Ip0040iTrueIssuerIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040iTrueIssuerIcaString(char[] value) throws CFException {
		 setIp0040iTrueIssuerIca(value);
	}
	/**
	 *	Returns the value of ip0040iMerchantTaxIdSw
	 *	@return ip0040iMerchantTaxIdSw
	 */
   public char[] getIp0040iMerchantTaxIdSw() throws CFException{
     if (isIp0040iMerchantTaxIdSwModified()) { 
        ip0040iMerchantTaxIdSw = refreshIp0040iMerchantTaxIdSw();
     }
   		return ip0040iMerchantTaxIdSw;
   }

  
	/**
	*  set variable ip0040iMerchantTaxIdSw
	*  Corresponding COBOL Variable is IP0040I-MERCHANT-TAX-ID-SW
	*  @param value
	**/
   public void setIp0040iMerchantTaxIdSw(char[] value) {
      ip0040iMerchantTaxIdSw = checkIp0040iMerchantTaxIdSwConstraints(value);
      serializeIp0040iMerchantTaxIdSw(ip0040iMerchantTaxIdSw);
   } 

     /**
	 * 	Update Ip0040iMerchantTaxIdSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iMerchantTaxIdSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iMerchantTaxIdSw,ip0040iMerchantTaxIdSw.length);
   	
   }
   
   public void setIp0040iMerchantTaxIdSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iMerchantTaxIdSw,ip0040iMerchantTaxIdSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iMerchantTaxIdSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iMerchantTaxIdSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iMerchantTaxIdSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iMerchantTaxIdSw with another Field
	 *	@param value
	 */
   public void setIp0040iMerchantTaxIdSw(Field source) {
       replace(source,0,source.length(),beginIp0040iMerchantTaxIdSw,IP_0040I_MERCHANT_TAX_ID_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iMerchantTaxIdSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iMerchantTaxIdSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iMerchantTaxIdSw,IP_0040I_MERCHANT_TAX_ID_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iMerchantTaxIdSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iMerchantTaxIdSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iMerchantTaxIdSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iInstallServSw
	 *	@return ip0040iInstallServSw
	 */
   public char[] getIp0040iInstallServSw() throws CFException{
     if (isIp0040iInstallServSwModified()) { 
        ip0040iInstallServSw = refreshIp0040iInstallServSw();
     }
   		return ip0040iInstallServSw;
   }

  
	/**
	*  set variable ip0040iInstallServSw
	*  Corresponding COBOL Variable is IP0040I-INSTALL-SERV-SW
	*  @param value
	**/
   public void setIp0040iInstallServSw(char[] value) {
      ip0040iInstallServSw = checkIp0040iInstallServSwConstraints(value);
      serializeIp0040iInstallServSw(ip0040iInstallServSw);
   } 

     /**
	 * 	Update Ip0040iInstallServSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iInstallServSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iInstallServSw,ip0040iInstallServSw.length);
   	
   }
   
   public void setIp0040iInstallServSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iInstallServSw,ip0040iInstallServSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iInstallServSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iInstallServSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iInstallServSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iInstallServSw with another Field
	 *	@param value
	 */
   public void setIp0040iInstallServSw(Field source) {
       replace(source,0,source.length(),beginIp0040iInstallServSw,IP_0040I_INSTALL_SERV_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iInstallServSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iInstallServSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iInstallServSw,IP_0040I_INSTALL_SERV_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iInstallServSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iInstallServSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iInstallServSw+targetIndex,targetLen);
    
   }
	char[] ip0040iInstallServSwY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iInstallServSwY88()
	 *	@return  Returns true if isIp0040iInstallServSwY88() is "Y"
	 */
   public boolean isIp0040iInstallServSwY88() throws CFException {
      return (  compareChars( getIp0040iInstallServSw() , ip0040iInstallServSwY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iInstallServSwY88True() {  			
    	setIp0040iInstallServSw( ip0040iInstallServSwY8888Value);
   	}
	char[] ip0040iInstallServSwN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iInstallServSwN88()
	 *	@return  Returns true if isIp0040iInstallServSwN88() is "N"
	 */
   public boolean isIp0040iInstallServSwN88() throws CFException {
      return (  compareChars( getIp0040iInstallServSw() , ip0040iInstallServSwN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iInstallServSwN88True() {  			
    	setIp0040iInstallServSw( ip0040iInstallServSwN8888Value);
   	}
	/**
	 *	Returns the value of ip0040iTokenServiceInd
	 *	@return ip0040iTokenServiceInd
	 */
   public char[] getIp0040iTokenServiceInd() throws CFException{
     if (isIp0040iTokenServiceIndModified()) { 
        ip0040iTokenServiceInd = refreshIp0040iTokenServiceInd();
     }
   		return ip0040iTokenServiceInd;
   }

  
	/**
	*  set variable ip0040iTokenServiceInd
	*  Corresponding COBOL Variable is IP0040I-TOKEN-SERVICE-IND
	*  @param value
	**/
   public void setIp0040iTokenServiceInd(char[] value) {
      ip0040iTokenServiceInd = checkIp0040iTokenServiceIndConstraints(value);
      serializeIp0040iTokenServiceInd(ip0040iTokenServiceInd);
   } 

     /**
	 * 	Update Ip0040iTokenServiceInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iTokenServiceInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iTokenServiceInd,ip0040iTokenServiceInd.length);
   	
   }
   
   public void setIp0040iTokenServiceInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iTokenServiceInd,ip0040iTokenServiceInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iTokenServiceInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iTokenServiceInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iTokenServiceInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iTokenServiceInd with another Field
	 *	@param value
	 */
   public void setIp0040iTokenServiceInd(Field source) {
       replace(source,0,source.length(),beginIp0040iTokenServiceInd,IP_0040I_TOKEN_SERVICE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iTokenServiceInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iTokenServiceInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iTokenServiceInd,IP_0040I_TOKEN_SERVICE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iTokenServiceInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iTokenServiceInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iTokenServiceInd+targetIndex,targetLen);
    
   }
	char[] ip0040iMdesToken8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp0040iMdesToken88()
	 *	@return  Returns true if isIp0040iMdesToken88() is "C"
	 */
   public boolean isIp0040iMdesToken88() throws CFException {
      return (  compareChars( getIp0040iTokenServiceInd() , ip0040iMdesToken8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp0040iMdesToken88True() {  			
    	setIp0040iTokenServiceInd( ip0040iMdesToken8888Value);
   	}
	char[] ip0040iCofToken8888Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isIp0040iCofToken88()
	 *	@return  Returns true if isIp0040iCofToken88() is "O"
	 */
   public boolean isIp0040iCofToken88() throws CFException {
      return (  compareChars( getIp0040iTokenServiceInd() , ip0040iCofToken8888Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setIp0040iCofToken88True() {  			
    	setIp0040iTokenServiceInd( ip0040iCofToken8888Value);
   	}
	char[] ip0040iDualToken8888Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isIp0040iDualToken88()
	 *	@return  Returns true if isIp0040iDualToken88() is "D"
	 */
   public boolean isIp0040iDualToken88() throws CFException {
      return (  compareChars( getIp0040iTokenServiceInd() , ip0040iDualToken8888Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setIp0040iDualToken88True() {  			
    	setIp0040iTokenServiceInd( ip0040iDualToken8888Value);
   	}
	char[] ip0040iTspToken8888Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isIp0040iTspToken88()
	 *	@return  Returns true if isIp0040iTspToken88() is "T"
	 */
   public boolean isIp0040iTspToken88() throws CFException {
      return (  compareChars( getIp0040iTokenServiceInd() , ip0040iTspToken8888Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setIp0040iTspToken88True() {  			
    	setIp0040iTokenServiceInd( ip0040iTspToken8888Value);
   	}
	/**
	 *	Returns the value of ip0040iGbsBillInd
	 *	@return ip0040iGbsBillInd
	 */
   public char[] getIp0040iGbsBillInd() throws CFException{
     if (isIp0040iGbsBillIndModified()) { 
        ip0040iGbsBillInd = refreshIp0040iGbsBillInd();
     }
   		return ip0040iGbsBillInd;
   }

  
	/**
	*  set variable ip0040iGbsBillInd
	*  Corresponding COBOL Variable is IP0040I-GBS-BILL-IND
	*  @param value
	**/
   public void setIp0040iGbsBillInd(char[] value) {
      ip0040iGbsBillInd = checkIp0040iGbsBillIndConstraints(value);
      serializeIp0040iGbsBillInd(ip0040iGbsBillInd);
   } 

     /**
	 * 	Update Ip0040iGbsBillInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iGbsBillInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iGbsBillInd,ip0040iGbsBillInd.length);
   	
   }
   
   public void setIp0040iGbsBillInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iGbsBillInd,ip0040iGbsBillInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iGbsBillInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iGbsBillInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iGbsBillInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iGbsBillInd with another Field
	 *	@param value
	 */
   public void setIp0040iGbsBillInd(Field source) {
       replace(source,0,source.length(),beginIp0040iGbsBillInd,IP_0040I_GBS_BILL_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iGbsBillInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iGbsBillInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iGbsBillInd,IP_0040I_GBS_BILL_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iGbsBillInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iGbsBillInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iGbsBillInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iInstallAuthSw
	 *	@return ip0040iInstallAuthSw
	 */
   public char[] getIp0040iInstallAuthSw() throws CFException{
     if (isIp0040iInstallAuthSwModified()) { 
        ip0040iInstallAuthSw = refreshIp0040iInstallAuthSw();
     }
   		return ip0040iInstallAuthSw;
   }

  
	/**
	*  set variable ip0040iInstallAuthSw
	*  Corresponding COBOL Variable is IP0040I-INSTALL-AUTH-SW
	*  @param value
	**/
   public void setIp0040iInstallAuthSw(char[] value) {
      ip0040iInstallAuthSw = checkIp0040iInstallAuthSwConstraints(value);
      serializeIp0040iInstallAuthSw(ip0040iInstallAuthSw);
   } 

     /**
	 * 	Update Ip0040iInstallAuthSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iInstallAuthSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iInstallAuthSw,ip0040iInstallAuthSw.length);
   	
   }
   
   public void setIp0040iInstallAuthSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iInstallAuthSw,ip0040iInstallAuthSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iInstallAuthSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iInstallAuthSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iInstallAuthSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iInstallAuthSw with another Field
	 *	@param value
	 */
   public void setIp0040iInstallAuthSw(Field source) {
       replace(source,0,source.length(),beginIp0040iInstallAuthSw,IP_0040I_INSTALL_AUTH_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iInstallAuthSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iInstallAuthSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iInstallAuthSw,IP_0040I_INSTALL_AUTH_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iInstallAuthSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iInstallAuthSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iInstallAuthSw+targetIndex,targetLen);
    
   }
	char[] ip0040iInstallAuthSwY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iInstallAuthSwY88()
	 *	@return  Returns true if isIp0040iInstallAuthSwY88() is "Y"
	 */
   public boolean isIp0040iInstallAuthSwY88() throws CFException {
      return (  compareChars( getIp0040iInstallAuthSw() , ip0040iInstallAuthSwY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iInstallAuthSwY88True() {  			
    	setIp0040iInstallAuthSw( ip0040iInstallAuthSwY8888Value);
   	}
	char[] ip0040iInstallAuthSwN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iInstallAuthSwN88()
	 *	@return  Returns true if isIp0040iInstallAuthSwN88() is "N"
	 */
   public boolean isIp0040iInstallAuthSwN88() throws CFException {
      return (  compareChars( getIp0040iInstallAuthSw() , ip0040iInstallAuthSwN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iInstallAuthSwN88True() {  			
    	setIp0040iInstallAuthSw( ip0040iInstallAuthSwN8888Value);
   	}
	/**
	 *	Returns the value of ip0040iSeqServiceInd
	 *	@return ip0040iSeqServiceInd
	 */
   public char[] getIp0040iSeqServiceInd() throws CFException{
     if (isIp0040iSeqServiceIndModified()) { 
        ip0040iSeqServiceInd = refreshIp0040iSeqServiceInd();
     }
   		return ip0040iSeqServiceInd;
   }

  
	/**
	*  set variable ip0040iSeqServiceInd
	*  Corresponding COBOL Variable is IP0040I-SEQ-SERVICE-IND
	*  @param value
	**/
   public void setIp0040iSeqServiceInd(char[] value) {
      ip0040iSeqServiceInd = checkIp0040iSeqServiceIndConstraints(value);
      serializeIp0040iSeqServiceInd(ip0040iSeqServiceInd);
   } 

     /**
	 * 	Update Ip0040iSeqServiceInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iSeqServiceInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iSeqServiceInd,ip0040iSeqServiceInd.length);
   	
   }
   
   public void setIp0040iSeqServiceInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iSeqServiceInd,ip0040iSeqServiceInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iSeqServiceInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iSeqServiceInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iSeqServiceInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iSeqServiceInd with another Field
	 *	@param value
	 */
   public void setIp0040iSeqServiceInd(Field source) {
       replace(source,0,source.length(),beginIp0040iSeqServiceInd,IP_0040I_SEQ_SERVICE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iSeqServiceInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iSeqServiceInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iSeqServiceInd,IP_0040I_SEQ_SERVICE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iSeqServiceInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iSeqServiceInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iSeqServiceInd+targetIndex,targetLen);
    
   }
	char[] ip0040iSeqOptIn8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iSeqOptIn88()
	 *	@return  Returns true if isIp0040iSeqOptIn88() is "Y"
	 */
   public boolean isIp0040iSeqOptIn88() throws CFException {
      return (  compareChars( getIp0040iSeqServiceInd() , ip0040iSeqOptIn8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iSeqOptIn88True() {  			
    	setIp0040iSeqServiceInd( ip0040iSeqOptIn8888Value);
   	}
	char[] ip0040iSeqOptOut8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iSeqOptOut88()
	 *	@return  Returns true if isIp0040iSeqOptOut88() is "N"
	 */
   public boolean isIp0040iSeqOptOut88() throws CFException {
      return (  compareChars( getIp0040iSeqServiceInd() , ip0040iSeqOptOut8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iSeqOptOut88True() {  			
    	setIp0040iSeqServiceInd( ip0040iSeqOptOut8888Value);
   	}
	/**
	 *	Returns the value of ip0040iCbfmParticipInd
	 *	@return ip0040iCbfmParticipInd
	 */
   public char[] getIp0040iCbfmParticipInd() throws CFException{
     if (isIp0040iCbfmParticipIndModified()) { 
        ip0040iCbfmParticipInd = refreshIp0040iCbfmParticipInd();
     }
   		return ip0040iCbfmParticipInd;
   }

  
	/**
	*  set variable ip0040iCbfmParticipInd
	*  Corresponding COBOL Variable is IP0040I-CBFM-PARTICIP-IND
	*  @param value
	**/
   public void setIp0040iCbfmParticipInd(char[] value) {
      ip0040iCbfmParticipInd = checkIp0040iCbfmParticipIndConstraints(value);
      serializeIp0040iCbfmParticipInd(ip0040iCbfmParticipInd);
   } 

     /**
	 * 	Update Ip0040iCbfmParticipInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iCbfmParticipInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iCbfmParticipInd,ip0040iCbfmParticipInd.length);
   	
   }
   
   public void setIp0040iCbfmParticipInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCbfmParticipInd,ip0040iCbfmParticipInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iCbfmParticipInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iCbfmParticipInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCbfmParticipInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iCbfmParticipInd with another Field
	 *	@param value
	 */
   public void setIp0040iCbfmParticipInd(Field source) {
       replace(source,0,source.length(),beginIp0040iCbfmParticipInd,IP_0040I_CBFM_PARTICIP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iCbfmParticipInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iCbfmParticipInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iCbfmParticipInd,IP_0040I_CBFM_PARTICIP_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iCbfmParticipInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iCbfmParticipInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCbfmParticipInd+targetIndex,targetLen);
    
   }
	char[] ip0040iCbfmPartY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iCbfmPartY88()
	 *	@return  Returns true if isIp0040iCbfmPartY88() is "Y"
	 */
   public boolean isIp0040iCbfmPartY88() throws CFException {
      return (  compareChars( getIp0040iCbfmParticipInd() , ip0040iCbfmPartY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iCbfmPartY88True() {  			
    	setIp0040iCbfmParticipInd( ip0040iCbfmPartY8888Value);
   	}
	char[] ip0040iCbfmPartN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iCbfmPartN88()
	 *	@return  Returns true if isIp0040iCbfmPartN88() is "N"
	 */
   public boolean isIp0040iCbfmPartN88() throws CFException {
      return (  compareChars( getIp0040iCbfmParticipInd() , ip0040iCbfmPartN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iCbfmPartN88True() {  			
    	setIp0040iCbfmParticipInd( ip0040iCbfmPartN8888Value);
   	}
	/**
	 *	Returns the value of ip0040iCbcmParticipInd
	 *	@return ip0040iCbcmParticipInd
	 */
   public char[] getIp0040iCbcmParticipInd() throws CFException{
     if (isIp0040iCbcmParticipIndModified()) { 
        ip0040iCbcmParticipInd = refreshIp0040iCbcmParticipInd();
     }
   		return ip0040iCbcmParticipInd;
   }

  
	/**
	*  set variable ip0040iCbcmParticipInd
	*  Corresponding COBOL Variable is IP0040I-CBCM-PARTICIP-IND
	*  @param value
	**/
   public void setIp0040iCbcmParticipInd(char[] value) {
      ip0040iCbcmParticipInd = checkIp0040iCbcmParticipIndConstraints(value);
      serializeIp0040iCbcmParticipInd(ip0040iCbcmParticipInd);
   } 

     /**
	 * 	Update Ip0040iCbcmParticipInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iCbcmParticipInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iCbcmParticipInd,ip0040iCbcmParticipInd.length);
   	
   }
   
   public void setIp0040iCbcmParticipInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCbcmParticipInd,ip0040iCbcmParticipInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iCbcmParticipInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iCbcmParticipInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCbcmParticipInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iCbcmParticipInd with another Field
	 *	@param value
	 */
   public void setIp0040iCbcmParticipInd(Field source) {
       replace(source,0,source.length(),beginIp0040iCbcmParticipInd,IP_0040I_CBCM_PARTICIP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iCbcmParticipInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iCbcmParticipInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iCbcmParticipInd,IP_0040I_CBCM_PARTICIP_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iCbcmParticipInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iCbcmParticipInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCbcmParticipInd+targetIndex,targetLen);
    
   }
	char[] ip0040iCbcmPartY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iCbcmPartY88()
	 *	@return  Returns true if isIp0040iCbcmPartY88() is "Y"
	 */
   public boolean isIp0040iCbcmPartY88() throws CFException {
      return (  compareChars( getIp0040iCbcmParticipInd() , ip0040iCbcmPartY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iCbcmPartY88True() {  			
    	setIp0040iCbcmParticipInd( ip0040iCbcmPartY8888Value);
   	}
	char[] ip0040iCbcmPartN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iCbcmPartN88()
	 *	@return  Returns true if isIp0040iCbcmPartN88() is "N"
	 */
   public boolean isIp0040iCbcmPartN88() throws CFException {
      return (  compareChars( getIp0040iCbcmParticipInd() , ip0040iCbcmPartN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iCbcmPartN88True() {  			
    	setIp0040iCbcmParticipInd( ip0040iCbcmPartN8888Value);
   	}
	/**
	 *	Returns the value of ip0040iCbfmDccSw
	 *	@return ip0040iCbfmDccSw
	 */
   public char[] getIp0040iCbfmDccSw() throws CFException{
     if (isIp0040iCbfmDccSwModified()) { 
        ip0040iCbfmDccSw = refreshIp0040iCbfmDccSw();
     }
   		return ip0040iCbfmDccSw;
   }

  
	/**
	*  set variable ip0040iCbfmDccSw
	*  Corresponding COBOL Variable is IP0040I-CBFM-DCC-SW
	*  @param value
	**/
   public void setIp0040iCbfmDccSw(char[] value) {
      ip0040iCbfmDccSw = checkIp0040iCbfmDccSwConstraints(value);
      serializeIp0040iCbfmDccSw(ip0040iCbfmDccSw);
   } 

     /**
	 * 	Update Ip0040iCbfmDccSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iCbfmDccSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iCbfmDccSw,ip0040iCbfmDccSw.length);
   	
   }
   
   public void setIp0040iCbfmDccSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCbfmDccSw,ip0040iCbfmDccSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iCbfmDccSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iCbfmDccSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCbfmDccSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iCbfmDccSw with another Field
	 *	@param value
	 */
   public void setIp0040iCbfmDccSw(Field source) {
       replace(source,0,source.length(),beginIp0040iCbfmDccSw,IP_0040I_CBFM_DCC_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iCbfmDccSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iCbfmDccSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iCbfmDccSw,IP_0040I_CBFM_DCC_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iCbfmDccSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iCbfmDccSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCbfmDccSw+targetIndex,targetLen);
    
   }
	char[] ip0040iCbfmDccSwY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iCbfmDccSwY88()
	 *	@return  Returns true if isIp0040iCbfmDccSwY88() is "Y"
	 */
   public boolean isIp0040iCbfmDccSwY88() throws CFException {
      return (  compareChars( getIp0040iCbfmDccSw() , ip0040iCbfmDccSwY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iCbfmDccSwY88True() {  			
    	setIp0040iCbfmDccSw( ip0040iCbfmDccSwY8888Value);
   	}
	char[] ip0040iCbfmDccSwN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iCbfmDccSwN88()
	 *	@return  Returns true if isIp0040iCbfmDccSwN88() is "N"
	 */
   public boolean isIp0040iCbfmDccSwN88() throws CFException {
      return (  compareChars( getIp0040iCbfmDccSw() , ip0040iCbfmDccSwN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iCbfmDccSwN88True() {  			
    	setIp0040iCbfmDccSw( ip0040iCbfmDccSwN8888Value);
   	}
	char[] ip0040iCbfmDccSwD8888Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isIp0040iCbfmDccSwD88()
	 *	@return  Returns true if isIp0040iCbfmDccSwD88() is "D"
	 */
   public boolean isIp0040iCbfmDccSwD88() throws CFException {
      return (  compareChars( getIp0040iCbfmDccSw() , ip0040iCbfmDccSwD8888Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setIp0040iCbfmDccSwD88True() {  			
    	setIp0040iCbfmDccSw( ip0040iCbfmDccSwD8888Value);
   	}
	/**
	 *	Returns the value of ip0040iInstApiGcmsSw
	 *	@return ip0040iInstApiGcmsSw
	 */
   public char[] getIp0040iInstApiGcmsSw() throws CFException{
     if (isIp0040iInstApiGcmsSwModified()) { 
        ip0040iInstApiGcmsSw = refreshIp0040iInstApiGcmsSw();
     }
   		return ip0040iInstApiGcmsSw;
   }

  
	/**
	*  set variable ip0040iInstApiGcmsSw
	*  Corresponding COBOL Variable is IP0040I-INST-API-GCMS-SW
	*  @param value
	**/
   public void setIp0040iInstApiGcmsSw(char[] value) {
      ip0040iInstApiGcmsSw = checkIp0040iInstApiGcmsSwConstraints(value);
      serializeIp0040iInstApiGcmsSw(ip0040iInstApiGcmsSw);
   } 

     /**
	 * 	Update Ip0040iInstApiGcmsSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iInstApiGcmsSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iInstApiGcmsSw,ip0040iInstApiGcmsSw.length);
   	
   }
   
   public void setIp0040iInstApiGcmsSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iInstApiGcmsSw,ip0040iInstApiGcmsSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iInstApiGcmsSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iInstApiGcmsSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iInstApiGcmsSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iInstApiGcmsSw with another Field
	 *	@param value
	 */
   public void setIp0040iInstApiGcmsSw(Field source) {
       replace(source,0,source.length(),beginIp0040iInstApiGcmsSw,IP_0040I_INST_API_GCMS_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iInstApiGcmsSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iInstApiGcmsSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iInstApiGcmsSw,IP_0040I_INST_API_GCMS_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iInstApiGcmsSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iInstApiGcmsSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iInstApiGcmsSw+targetIndex,targetLen);
    
   }
	char[] ip0040iInstApiGcmsSwY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iInstApiGcmsSwY88()
	 *	@return  Returns true if isIp0040iInstApiGcmsSwY88() is "Y"
	 */
   public boolean isIp0040iInstApiGcmsSwY88() throws CFException {
      return (  compareChars( getIp0040iInstApiGcmsSw() , ip0040iInstApiGcmsSwY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iInstApiGcmsSwY88True() {  			
    	setIp0040iInstApiGcmsSw( ip0040iInstApiGcmsSwY8888Value);
   	}
	char[] ip0040iInstApiGcmsSwN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iInstApiGcmsSwN88()
	 *	@return  Returns true if isIp0040iInstApiGcmsSwN88() is "N"
	 */
   public boolean isIp0040iInstApiGcmsSwN88() throws CFException {
      return (  compareChars( getIp0040iInstApiGcmsSw() , ip0040iInstApiGcmsSwN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iInstApiGcmsSwN88True() {  			
    	setIp0040iInstApiGcmsSw( ip0040iInstApiGcmsSwN8888Value);
   	}
	/**
	 *	Returns the value of ip0040iInsEnabApiInd
	 *	@return ip0040iInsEnabApiInd
	 */
   public char[] getIp0040iInsEnabApiInd() throws CFException{
     if (isIp0040iInsEnabApiIndModified()) { 
        ip0040iInsEnabApiInd = refreshIp0040iInsEnabApiInd();
     }
   		return ip0040iInsEnabApiInd;
   }

  
	/**
	*  set variable ip0040iInsEnabApiInd
	*  Corresponding COBOL Variable is IP0040I-INS-ENAB-API-IND
	*  @param value
	**/
   public void setIp0040iInsEnabApiInd(char[] value) {
      ip0040iInsEnabApiInd = checkIp0040iInsEnabApiIndConstraints(value);
      serializeIp0040iInsEnabApiInd(ip0040iInsEnabApiInd);
   } 

     /**
	 * 	Update Ip0040iInsEnabApiInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iInsEnabApiInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iInsEnabApiInd,ip0040iInsEnabApiInd.length);
   	
   }
   
   public void setIp0040iInsEnabApiInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iInsEnabApiInd,ip0040iInsEnabApiInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iInsEnabApiInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iInsEnabApiInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iInsEnabApiInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iInsEnabApiInd with another Field
	 *	@param value
	 */
   public void setIp0040iInsEnabApiInd(Field source) {
       replace(source,0,source.length(),beginIp0040iInsEnabApiInd,IP_0040I_INS_ENAB_API_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iInsEnabApiInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iInsEnabApiInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iInsEnabApiInd,IP_0040I_INS_ENAB_API_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iInsEnabApiInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iInsEnabApiInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iInsEnabApiInd+targetIndex,targetLen);
    
   }
	char[] ip0040iInsEnabApiIndY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iInsEnabApiIndY88()
	 *	@return  Returns true if isIp0040iInsEnabApiIndY88() is "Y"
	 */
   public boolean isIp0040iInsEnabApiIndY88() throws CFException {
      return (  compareChars( getIp0040iInsEnabApiInd() , ip0040iInsEnabApiIndY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iInsEnabApiIndY88True() {  			
    	setIp0040iInsEnabApiInd( ip0040iInsEnabApiIndY8888Value);
   	}
	char[] ip0040iInsEnabApiIndN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iInsEnabApiIndN88()
	 *	@return  Returns true if isIp0040iInsEnabApiIndN88() is "N"
	 */
   public boolean isIp0040iInsEnabApiIndN88() throws CFException {
      return (  compareChars( getIp0040iInsEnabApiInd() , ip0040iInsEnabApiIndN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iInsEnabApiIndN88True() {  			
    	setIp0040iInsEnabApiInd( ip0040iInsEnabApiIndN8888Value);
   	}
	/**
	 *	Returns the value of ip0040iInstApiUiSw
	 *	@return ip0040iInstApiUiSw
	 */
   public char[] getIp0040iInstApiUiSw() throws CFException{
     if (isIp0040iInstApiUiSwModified()) { 
        ip0040iInstApiUiSw = refreshIp0040iInstApiUiSw();
     }
   		return ip0040iInstApiUiSw;
   }

  
	/**
	*  set variable ip0040iInstApiUiSw
	*  Corresponding COBOL Variable is IP0040I-INST-API-UI-SW
	*  @param value
	**/
   public void setIp0040iInstApiUiSw(char[] value) {
      ip0040iInstApiUiSw = checkIp0040iInstApiUiSwConstraints(value);
      serializeIp0040iInstApiUiSw(ip0040iInstApiUiSw);
   } 

     /**
	 * 	Update Ip0040iInstApiUiSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iInstApiUiSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iInstApiUiSw,ip0040iInstApiUiSw.length);
   	
   }
   
   public void setIp0040iInstApiUiSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iInstApiUiSw,ip0040iInstApiUiSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iInstApiUiSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iInstApiUiSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iInstApiUiSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iInstApiUiSw with another Field
	 *	@param value
	 */
   public void setIp0040iInstApiUiSw(Field source) {
       replace(source,0,source.length(),beginIp0040iInstApiUiSw,IP_0040I_INST_API_UI_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iInstApiUiSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iInstApiUiSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iInstApiUiSw,IP_0040I_INST_API_UI_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iInstApiUiSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iInstApiUiSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iInstApiUiSw+targetIndex,targetLen);
    
   }
	char[] ip0040iInstApiUiSwY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iInstApiUiSwY88()
	 *	@return  Returns true if isIp0040iInstApiUiSwY88() is "Y"
	 */
   public boolean isIp0040iInstApiUiSwY88() throws CFException {
      return (  compareChars( getIp0040iInstApiUiSw() , ip0040iInstApiUiSwY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iInstApiUiSwY88True() {  			
    	setIp0040iInstApiUiSw( ip0040iInstApiUiSwY8888Value);
   	}
	char[] ip0040iInstApiUiSwN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iInstApiUiSwN88()
	 *	@return  Returns true if isIp0040iInstApiUiSwN88() is "N"
	 */
   public boolean isIp0040iInstApiUiSwN88() throws CFException {
      return (  compareChars( getIp0040iInstApiUiSw() , ip0040iInstApiUiSwN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iInstApiUiSwN88True() {  			
    	setIp0040iInstApiUiSw( ip0040iInstApiUiSwN8888Value);
   	}
	/**
	 *	Returns the value of ip0040iFiller
	 *	@return ip0040iFiller
	 */
   public char[] getIp0040iFiller() throws CFException{
     if (isIp0040iFillerModified()) { 
        ip0040iFiller = refreshIp0040iFiller();
     }
   		return ip0040iFiller;
   }

  
	/**
	*  set variable ip0040iFiller
	*  Corresponding COBOL Variable is IP0040I-FILLER
	*  @param value
	**/
   public void setIp0040iFiller(char[] value) {
      ip0040iFiller = checkIp0040iFillerConstraints(value);
      serializeIp0040iFiller(ip0040iFiller);
   } 

     /**
	 * 	Update Ip0040iFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iFiller,ip0040iFiller.length);
   	
   }
   
   public void setIp0040iFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iFiller,ip0040iFiller.length);
   	
   }
   
     /**
	 * 	Update Ip0040iFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iFiller with another Field
	 *	@param value
	 */
   public void setIp0040iFiller(Field source) {
       replace(source,0,source.length(),beginIp0040iFiller,IP_0040I_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iFiller,IP_0040I_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iFiller+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040iOboServiceInd
	 *	@return ip0040iOboServiceInd
	 */
   public char[] getIp0040iOboServiceInd() throws CFException{
     if (isIp0040iOboServiceIndModified()) { 
        ip0040iOboServiceInd = refreshIp0040iOboServiceInd();
     }
   		return ip0040iOboServiceInd;
   }

  
	/**
	*  set variable ip0040iOboServiceInd
	*  Corresponding COBOL Variable is IP0040I-OBO-SERVICE-IND
	*  @param value
	**/
   public void setIp0040iOboServiceInd(char[] value) {
      ip0040iOboServiceInd = checkIp0040iOboServiceIndConstraints(value);
      serializeIp0040iOboServiceInd(ip0040iOboServiceInd);
   } 

     /**
	 * 	Update Ip0040iOboServiceInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iOboServiceInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iOboServiceInd,ip0040iOboServiceInd.length);
   	
   }
   
   public void setIp0040iOboServiceInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iOboServiceInd,ip0040iOboServiceInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iOboServiceInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iOboServiceInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iOboServiceInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iOboServiceInd with another Field
	 *	@param value
	 */
   public void setIp0040iOboServiceInd(Field source) {
       replace(source,0,source.length(),beginIp0040iOboServiceInd,IP_0040I_OBO_SERVICE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iOboServiceInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iOboServiceInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iOboServiceInd,IP_0040I_OBO_SERVICE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iOboServiceInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iOboServiceInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iOboServiceInd+targetIndex,targetLen);
    
   }
	char[] ip0040iOboY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iOboY88()
	 *	@return  Returns true if isIp0040iOboY88() is "Y"
	 */
   public boolean isIp0040iOboY88() throws CFException {
      return (  compareChars( getIp0040iOboServiceInd() , ip0040iOboY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iOboY88True() {  			
    	setIp0040iOboServiceInd( ip0040iOboY8888Value);
   	}
	char[] ip0040iOboN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iOboN88()
	 *	@return  Returns true if isIp0040iOboN88() is "N"
	 */
   public boolean isIp0040iOboN88() throws CFException {
      return (  compareChars( getIp0040iOboServiceInd() , ip0040iOboN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iOboN88True() {  			
    	setIp0040iOboServiceInd( ip0040iOboN8888Value);
   	}
	/**
	 *	Returns the value of ip0040iMultCurrSw
	 *	@return ip0040iMultCurrSw
	 */
   public char[] getIp0040iMultCurrSw() throws CFException{
     if (isIp0040iMultCurrSwModified()) { 
        ip0040iMultCurrSw = refreshIp0040iMultCurrSw();
     }
   		return ip0040iMultCurrSw;
   }

  
	/**
	*  set variable ip0040iMultCurrSw
	*  Corresponding COBOL Variable is IP0040I-MULT-CURR-SW
	*  @param value
	**/
   public void setIp0040iMultCurrSw(char[] value) {
      ip0040iMultCurrSw = checkIp0040iMultCurrSwConstraints(value);
      serializeIp0040iMultCurrSw(ip0040iMultCurrSw);
   } 

     /**
	 * 	Update Ip0040iMultCurrSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iMultCurrSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iMultCurrSw,ip0040iMultCurrSw.length);
   	
   }
   
   public void setIp0040iMultCurrSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iMultCurrSw,ip0040iMultCurrSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iMultCurrSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iMultCurrSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iMultCurrSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iMultCurrSw with another Field
	 *	@param value
	 */
   public void setIp0040iMultCurrSw(Field source) {
       replace(source,0,source.length(),beginIp0040iMultCurrSw,IP_0040I_MULT_CURR_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iMultCurrSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iMultCurrSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iMultCurrSw,IP_0040I_MULT_CURR_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iMultCurrSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iMultCurrSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iMultCurrSw+targetIndex,targetLen);
    
   }
	char[] ip0040iMultCurrSwY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iMultCurrSwY88()
	 *	@return  Returns true if isIp0040iMultCurrSwY88() is "Y"
	 */
   public boolean isIp0040iMultCurrSwY88() throws CFException {
      return (  compareChars( getIp0040iMultCurrSw() , ip0040iMultCurrSwY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iMultCurrSwY88True() {  			
    	setIp0040iMultCurrSw( ip0040iMultCurrSwY8888Value);
   	}
	char[] ip0040iMultCurrSwN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iMultCurrSwN88()
	 *	@return  Returns true if isIp0040iMultCurrSwN88() is "N"
	 */
   public boolean isIp0040iMultCurrSwN88() throws CFException {
      return (  compareChars( getIp0040iMultCurrSw() , ip0040iMultCurrSwN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iMultCurrSwN88True() {  			
    	setIp0040iMultCurrSw( ip0040iMultCurrSwN8888Value);
   	}
	/**
	 *	Returns the value of ip0040iAnonIndEffDate
	 *	@return ip0040iAnonIndEffDate
	 */
	public long getIp0040iAnonIndEffDate() throws CFException {
       if (isIp0040iAnonIndEffDateModified()) { 
           ip0040iAnonIndEffDate = refreshIp0040iAnonIndEffDate();
        }
   		return ip0040iAnonIndEffDate;
	}
	

	
	   
	/**
	 * 	Update Ip0040iAnonIndEffDate with the passed value
	 *  Corresponding COBOL Variable is IP0040I-ANON-IND-EFF-DATE
	 *	@param number
	 */
	public void setIp0040iAnonIndEffDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040iAnonIndEffDate = checkIp0040iAnonIndEffDateMaxLimit(number); 
		serializeIp0040iAnonIndEffDate(ip0040iAnonIndEffDate);
	}
	

	/**
	 * 	Update Ip0040iAnonIndEffDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040iAnonIndEffDate(char[] value) throws CFException {
		 ip0040iAnonIndEffDate = serializeIp0040iAnonIndEffDate(value);
	}
	/**
	 * 	Update Ip0040iAnonIndEffDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040iAnonIndEffDateString(char[] value) throws CFException {
		 setIp0040iAnonIndEffDate(value);
	}
	/**
	 *	Returns the value of ip0040iCbfmEcbRateParInd
	 *	@return ip0040iCbfmEcbRateParInd
	 */
   public char[] getIp0040iCbfmEcbRateParInd() throws CFException{
     if (isIp0040iCbfmEcbRateParIndModified()) { 
        ip0040iCbfmEcbRateParInd = refreshIp0040iCbfmEcbRateParInd();
     }
   		return ip0040iCbfmEcbRateParInd;
   }

  
	/**
	*  set variable ip0040iCbfmEcbRateParInd
	*  Corresponding COBOL Variable is IP0040I-CBFM-ECB-RATE-PAR-IND
	*  @param value
	**/
   public void setIp0040iCbfmEcbRateParInd(char[] value) {
      ip0040iCbfmEcbRateParInd = checkIp0040iCbfmEcbRateParIndConstraints(value);
      serializeIp0040iCbfmEcbRateParInd(ip0040iCbfmEcbRateParInd);
   } 

     /**
	 * 	Update Ip0040iCbfmEcbRateParInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iCbfmEcbRateParInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iCbfmEcbRateParInd,ip0040iCbfmEcbRateParInd.length);
   	
   }
   
   public void setIp0040iCbfmEcbRateParInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCbfmEcbRateParInd,ip0040iCbfmEcbRateParInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iCbfmEcbRateParInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iCbfmEcbRateParInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCbfmEcbRateParInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iCbfmEcbRateParInd with another Field
	 *	@param value
	 */
   public void setIp0040iCbfmEcbRateParInd(Field source) {
       replace(source,0,source.length(),beginIp0040iCbfmEcbRateParInd,IP_0040I_CBFM_ECB_RATE_PAR_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iCbfmEcbRateParInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iCbfmEcbRateParInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iCbfmEcbRateParInd,IP_0040I_CBFM_ECB_RATE_PAR_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iCbfmEcbRateParInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iCbfmEcbRateParInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iCbfmEcbRateParInd+targetIndex,targetLen);
    
   }
	char[] ip0040iEcbPartY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iEcbPartY88()
	 *	@return  Returns true if isIp0040iEcbPartY88() is "Y"
	 */
   public boolean isIp0040iEcbPartY88() throws CFException {
      return (  compareChars( getIp0040iCbfmEcbRateParInd() , ip0040iEcbPartY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iEcbPartY88True() {  			
    	setIp0040iCbfmEcbRateParInd( ip0040iEcbPartY8888Value);
   	}
	char[] ip0040iEcbPartN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iEcbPartN88()
	 *	@return  Returns true if isIp0040iEcbPartN88() is "N"
	 */
   public boolean isIp0040iEcbPartN88() throws CFException {
      return (  compareChars( getIp0040iCbfmEcbRateParInd() , ip0040iEcbPartN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iEcbPartN88True() {  			
    	setIp0040iCbfmEcbRateParInd( ip0040iEcbPartN8888Value);
   	}
	/**
	 *	Returns the value of ip0040iAlmXbOptOutInd
	 *	@return ip0040iAlmXbOptOutInd
	 */
   public char[] getIp0040iAlmXbOptOutInd() throws CFException{
     if (isIp0040iAlmXbOptOutIndModified()) { 
        ip0040iAlmXbOptOutInd = refreshIp0040iAlmXbOptOutInd();
     }
   		return ip0040iAlmXbOptOutInd;
   }

  
	/**
	*  set variable ip0040iAlmXbOptOutInd
	*  Corresponding COBOL Variable is IP0040I-ALM-XB-OPT-OUT-IND
	*  @param value
	**/
   public void setIp0040iAlmXbOptOutInd(char[] value) {
      ip0040iAlmXbOptOutInd = checkIp0040iAlmXbOptOutIndConstraints(value);
      serializeIp0040iAlmXbOptOutInd(ip0040iAlmXbOptOutInd);
   } 

     /**
	 * 	Update Ip0040iAlmXbOptOutInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iAlmXbOptOutInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iAlmXbOptOutInd,ip0040iAlmXbOptOutInd.length);
   	
   }
   
   public void setIp0040iAlmXbOptOutInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iAlmXbOptOutInd,ip0040iAlmXbOptOutInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040iAlmXbOptOutInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iAlmXbOptOutInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iAlmXbOptOutInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iAlmXbOptOutInd with another Field
	 *	@param value
	 */
   public void setIp0040iAlmXbOptOutInd(Field source) {
       replace(source,0,source.length(),beginIp0040iAlmXbOptOutInd,IP_0040I_ALM_XB_OPT_OUT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iAlmXbOptOutInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iAlmXbOptOutInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iAlmXbOptOutInd,IP_0040I_ALM_XB_OPT_OUT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iAlmXbOptOutInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iAlmXbOptOutInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iAlmXbOptOutInd+targetIndex,targetLen);
    
   }
	char[] ip0040iAlmXbOptOutY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iAlmXbOptOutY88()
	 *	@return  Returns true if isIp0040iAlmXbOptOutY88() is "Y"
	 */
   public boolean isIp0040iAlmXbOptOutY88() throws CFException {
      return (  compareChars( getIp0040iAlmXbOptOutInd() , ip0040iAlmXbOptOutY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iAlmXbOptOutY88True() {  			
    	setIp0040iAlmXbOptOutInd( ip0040iAlmXbOptOutY8888Value);
   	}
	char[] ip0040iAlmXbOptOutN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iAlmXbOptOutN88()
	 *	@return  Returns true if isIp0040iAlmXbOptOutN88() is "N"
	 */
   public boolean isIp0040iAlmXbOptOutN88() throws CFException {
      return (  compareChars( getIp0040iAlmXbOptOutInd() , ip0040iAlmXbOptOutN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iAlmXbOptOutN88True() {  			
    	setIp0040iAlmXbOptOutInd( ip0040iAlmXbOptOutN8888Value);
   	}
	/**
	 *	Returns the value of ip0040iJpnNonmdesTknrngSw
	 *	@return ip0040iJpnNonmdesTknrngSw
	 */
   public char[] getIp0040iJpnNonmdesTknrngSw() throws CFException{
     if (isIp0040iJpnNonmdesTknrngSwModified()) { 
        ip0040iJpnNonmdesTknrngSw = refreshIp0040iJpnNonmdesTknrngSw();
     }
   		return ip0040iJpnNonmdesTknrngSw;
   }

  
	/**
	*  set variable ip0040iJpnNonmdesTknrngSw
	*  Corresponding COBOL Variable is IP0040I-JPN-NONMDES-TKNRNG-SW
	*  @param value
	**/
   public void setIp0040iJpnNonmdesTknrngSw(char[] value) {
      ip0040iJpnNonmdesTknrngSw = checkIp0040iJpnNonmdesTknrngSwConstraints(value);
      serializeIp0040iJpnNonmdesTknrngSw(ip0040iJpnNonmdesTknrngSw);
   } 

     /**
	 * 	Update Ip0040iJpnNonmdesTknrngSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iJpnNonmdesTknrngSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040iJpnNonmdesTknrngSw,ip0040iJpnNonmdesTknrngSw.length);
   	
   }
   
   public void setIp0040iJpnNonmdesTknrngSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iJpnNonmdesTknrngSw,ip0040iJpnNonmdesTknrngSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040iJpnNonmdesTknrngSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iJpnNonmdesTknrngSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iJpnNonmdesTknrngSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040iJpnNonmdesTknrngSw with another Field
	 *	@param value
	 */
   public void setIp0040iJpnNonmdesTknrngSw(Field source) {
       replace(source,0,source.length(),beginIp0040iJpnNonmdesTknrngSw,IP_0040I_JPN_NONMDES_TKNRNG_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040iJpnNonmdesTknrngSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iJpnNonmdesTknrngSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040iJpnNonmdesTknrngSw,IP_0040I_JPN_NONMDES_TKNRNG_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040iJpnNonmdesTknrngSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iJpnNonmdesTknrngSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040iJpnNonmdesTknrngSw+targetIndex,targetLen);
    
   }
	char[] ip0040iJpnNonmdesRngY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040iJpnNonmdesRngY88()
	 *	@return  Returns true if isIp0040iJpnNonmdesRngY88() is "Y"
	 */
   public boolean isIp0040iJpnNonmdesRngY88() throws CFException {
      return (  compareChars( getIp0040iJpnNonmdesTknrngSw() , ip0040iJpnNonmdesRngY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040iJpnNonmdesRngY88True() {  			
    	setIp0040iJpnNonmdesTknrngSw( ip0040iJpnNonmdesRngY8888Value);
   	}
	char[] ip0040iJpnNonmdesRngN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040iJpnNonmdesRngN88()
	 *	@return  Returns true if isIp0040iJpnNonmdesRngN88() is "N"
	 */
   public boolean isIp0040iJpnNonmdesRngN88() throws CFException {
      return (  compareChars( getIp0040iJpnNonmdesTknrngSw() , ip0040iJpnNonmdesRngN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040iJpnNonmdesRngN88True() {  			
    	setIp0040iJpnNonmdesTknrngSw( ip0040iJpnNonmdesRngN8888Value);
   	}

	
	
	
	/**
	 * 	initializes Ip0040iMpePeRecDataCs
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp0040iProductType(CONSTANTS.SPACE);
                     setIp0040iEndpoint(0);
         setIp0040iCountry(CONSTANTS.SPACE_3);
                     setIp0040iCountryNum(0);
          ip0040iRegionSubreg.initialize();
     
         setIp0040iProductClass(CONSTANTS.SPACE_3);
         setIp0040iTranRoutingInd(CONSTANTS.SPACE);
         setIp0040iPrsProdReassgnSw(CONSTANTS.SPACE);
         setIp0040iProdReassignmentSw(CONSTANTS.SPACE);
         setIp0040iOptInFlag(CONSTANTS.SPACE);
         setIp0040iLicensedProdId(CONSTANTS.SPACE_3);
         setIp0040iVirtFundPanInd(CONSTANTS.SPACE);
         setIp0040iAcctCatgPartSw(CONSTANTS.SPACE);
                     setIp0040iAcctCatgActvnDate(0);
          ip0040iCardHldrBlngCur.initialize();
     
         setIp0040iChipConversionSw(CONSTANTS.SPACE);
          ip0040iFloorExpiryDate.initialize();
     
         setIp0040iCoBrandSw(CONSTANTS.SPACE);
         setIp0040iSpendControlRcnSw(CONSTANTS.SPACE);
         setIp0040iMerchCleanServPart(CONSTANTS.SPACE_3);
                     setIp0040iMerchCleanActvDate(0);
         setIp0040iPaypassEnabledInd(CONSTANTS.SPACE);
         setIp0040iRateTypeIndicator(CONSTANTS.SPACE);
         setIp0040iRoutePsnIndicator(CONSTANTS.SPACE);
         setIp0040iCbwpIndicator(CONSTANTS.SPACE);
         setIp0040iFlexParticipInd(CONSTANTS.SPACE);
         setIp0040iRepwrRldInd(CONSTANTS.SPACE);
         setIp0040iMoneySendInd(CONSTANTS.SPACE);
         setIp0040iRegulatedRateIndSw(CONSTANTS.SPACE);
         setIp0040iCashAccessSw(CONSTANTS.SPACE);
                     setIp0040iPersonPresentInd(0);
         setIp0040iCrossBdrException(CONSTANTS.SPACE);
         setIp0040iIssTargetMarketInd(CONSTANTS.SPACE);
         setIp0040iPostDateServSw(CONSTANTS.SPACE);
         setIp0040iMealVoucherInd(CONSTANTS.SPACE);
         setIp0040iNonRldblPrpdSw(CONSTANTS.SPACE_2);
         setIp0040iFasterFundsInd(CONSTANTS.SPACE);
         setIp0040iAnonPrepaidInd(CONSTANTS.SPACE);
         setIp0040iDccStatusInd(CONSTANTS.SPACE);
         setIp0040iPayByAcctInd(CONSTANTS.SPACE);
         setIp0040iIssGamParticipSw(CONSTANTS.SPACE);
         setIp0040iMemberFiller(CONSTANTS.SPACE_12);
         setIp0040iChbConvExclId(CONSTANTS.SPACE);
                     setIp0040iChbConvExclExpire(0);
         setIp0040iHardshipIndicator(CONSTANTS.SPACE);
                     setIp0040iHardshipEffective(0);
                     setIp0040iHardshipExpiration(0);
         setIp0040iGamingCountrySw(CONSTANTS.SPACE);
                     setIp0040iCrossBorderInd(0);
         setIp0040iRecPaymtCanSw(CONSTANTS.SPACE);
         setIp0040iDomDbtParticipSw(CONSTANTS.SPACE);
          ip0040iGrpCode.initialize();
     
         setIp0040iIpcFraudCtlSw(CONSTANTS.SPACE);
         setIp0040iIccrParticipInd(CONSTANTS.SPACE);
         setIp0040iRevCreditInd(CONSTANTS.SPACE);
         setIp0040iChgbkBkoutInd(CONSTANTS.SPACE);
         setIp0040iRtnTrnstNum(CONSTANTS.SPACE_10);
                     setIp0040iTrueIssuerIca(0);
         setIp0040iMerchantTaxIdSw(CONSTANTS.SPACE);
         setIp0040iInstallServSw(CONSTANTS.SPACE);
         setIp0040iTokenServiceInd(CONSTANTS.SPACE);
         setIp0040iGbsBillInd(CONSTANTS.SPACE);
         setIp0040iInstallAuthSw(CONSTANTS.SPACE);
         setIp0040iSeqServiceInd(CONSTANTS.SPACE);
         setIp0040iCbfmParticipInd(CONSTANTS.SPACE);
         setIp0040iCbcmParticipInd(CONSTANTS.SPACE);
         setIp0040iCbfmDccSw(CONSTANTS.SPACE);
         setIp0040iInstApiGcmsSw(CONSTANTS.SPACE);
         setIp0040iInsEnabApiInd(CONSTANTS.SPACE);
         setIp0040iInstApiUiSw(CONSTANTS.SPACE);
         setIp0040iFiller(CONSTANTS.SPACE);
         setIp0040iOboServiceInd(CONSTANTS.SPACE);
         setIp0040iMultCurrSw(CONSTANTS.SPACE);
                     setIp0040iAnonIndEffDate(0);
         setIp0040iCbfmEcbRateParInd(CONSTANTS.SPACE);
         setIp0040iAlmXbOptOutInd(CONSTANTS.SPACE);
         setIp0040iJpnNonmdesTknrngSw(CONSTANTS.SPACE);
   }

		public static int getIp0040iMpePeRecDataCsFieldLength() {
			return IP_0040I_MPE_PE_REC_DATA_CS_LENGTH;
		}

}
  
