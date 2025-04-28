package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00404MpePeRecDataCs is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip00404MpePeRecDataCs extends Ip00404MpePeRecDataCsSerialized { 
   

						private char[] ip00404ProductType = Field.fillLowValue(1);

								private long ip00404Endpoint;

						private char[] ip00404Country = Field.fillLowValue(3);

								private int ip00404CountryNum;
				private Ip00404RegionSubreg ip00404RegionSubreg = new Ip00404RegionSubreg();

						private char[] ip00404ProductClass = Field.fillLowValue(3);

						private char[] ip00404TranRoutingInd = Field.fillLowValue(1);

						private char[] ip00404PrsProdReassgnSw = Field.fillLowValue(1);

						private char[] ip00404ProdReassignmentSw = Field.fillLowValue(1);

						private char[] ip00404OptInFlag = Field.fillLowValue(1);

						private char[] ip00404LicensedProdId = Field.fillLowValue(3);

						private char[] ip00404VirtFundPanInd = Field.fillLowValue(1);

						private char[] ip00404AcctCatgPartSw = Field.fillLowValue(1);

								private long ip00404AcctCatgActvnDate;
				private Ip00404CardHldrBlngCur ip00404CardHldrBlngCur = new Ip00404CardHldrBlngCur();

						private char[] ip00404ChipConversionSw = Field.fillLowValue(1);
				private Ip00404FloorExpiryDate ip00404FloorExpiryDate = new Ip00404FloorExpiryDate();

						private char[] ip00404CoBrandSw = Field.fillLowValue(1);

						private char[] ip00404SpendControlRcnSw = Field.fillLowValue(1);

						private char[] ip00404MerchCleanServPart = Field.fillLowValue(3);

								private long ip00404MerchCleanActvDate;

						private char[] ip00404PaypassEnabledInd = Field.fillLowValue(1);

						private char[] ip00404RateTypeIndicator = Field.fillLowValue(1);

						private char[] ip00404RoutePsnIndicator = Field.fillLowValue(1);

						private char[] ip00404CbwpIndicator = Field.fillLowValue(1);

						private char[] ip00404FlexParticipInd = Field.fillLowValue(1);

						private char[] ip00404RepwrRldInd = Field.fillLowValue(1);

						private char[] ip00404MoneySendInd = Field.fillLowValue(1);

						private char[] ip00404RegulatedRateIndSw = Field.fillLowValue(1);

						private char[] ip00404CashAccessSw = Field.fillLowValue(1);

								private int ip00404PersonPresentInd;

						private char[] ip00404CrossBdrException = Field.fillLowValue(1);

						private char[] ip00404IssTargetMarketInd = Field.fillLowValue(1);

						private char[] ip00404PostDateServSw = Field.fillLowValue(1);

						private char[] ip00404MealVoucherInd = Field.fillLowValue(1);

						private char[] ip00404NonRldblPrpdSw = Field.fillLowValue(2);

						private char[] ip00404FasterFundsInd = Field.fillLowValue(1);

						private char[] ip00404AnonPrepaidInd = Field.fillLowValue(1);

						private char[] ip00404DccStatusInd = Field.fillLowValue(1);

						private char[] ip00404PayByAcctInd = Field.fillLowValue(1);

						private char[] ip00404IssGamParticipSw = Field.fillLowValue(1);

						private char[] ip00404MemberFiller = Field.fillLowValue(12);

						private char[] ip00404ChbConvExclId = Field.fillLowValue(1);

								private long ip00404ChbConvExclExpire;

						private char[] ip00404HardshipIndicator = Field.fillLowValue(1);

								private long ip00404HardshipEffective;

								private long ip00404HardshipExpiration;

						private char[] ip00404GamingCountrySw = Field.fillLowValue(1);

								private int ip00404CrossBorderInd;

						private char[] ip00404RecPaymtCanSw = Field.fillLowValue(1);

						private char[] ip00404DomDbtParticipSw = Field.fillLowValue(1);
				private Ip00404GrpCode ip00404GrpCode = new Ip00404GrpCode();

						private char[] ip00404IpcFraudCtlSw = Field.fillLowValue(1);

						private char[] ip00404IccrParticipInd = Field.fillLowValue(1);

						private char[] ip00404RevCreditInd = Field.fillLowValue(1);

						private char[] ip00404ChgbkBkoutInd = Field.fillLowValue(1);

						private char[] ip00404RtnTrnstNum = Field.fillLowValue(10);

								private long ip00404TrueIssuerIca;

						private char[] ip00404MerchantTaxIdSw = Field.fillLowValue(1);

						private char[] ip00404InstallServSw = Field.fillLowValue(1);

						private char[] ip00404TokenServiceInd = Field.fillLowValue(1);

						private char[] ip00404GbsBillInd = Field.fillLowValue(1);

						private char[] ip00404InstallAuthSw = Field.fillLowValue(1);

						private char[] ip00404SeqServiceInd = Field.fillLowValue(1);

						private char[] ip00404CbfmParticipInd = Field.fillLowValue(1);

						private char[] ip00404CbcmParticipInd = Field.fillLowValue(1);

						private char[] ip00404CbfmDccSw = Field.fillLowValue(1);

						private char[] ip00404InstApiGcmsSw = Field.fillLowValue(1);

						private char[] ip00404InsEnabApiInd = Field.fillLowValue(1);

						private char[] ip00404InstApiUiSw = Field.fillLowValue(1);

						private char[] ip00404Filler = Field.fillLowValue(1);

						private char[] ip00404OboServiceInd = Field.fillLowValue(1);

						private char[] ip00404MultCurrSw = Field.fillLowValue(1);

								private long ip00404AnonIndEffDate;

						private char[] ip00404CbfmEcbRateParInd = Field.fillLowValue(1);

						private char[] ip00404AlmXbOptOutInd = Field.fillLowValue(1);

						private char[] ip00404JpnNonmdesTknrngSw = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00404MpePeRecDataCs
	**/
    public Ip00404MpePeRecDataCs() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00404MpePeRecDataCs. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404MpePeRecDataCs(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip00404RegionSubreg.setParent(this,getStartOffset() + 14);
	       			ip00404CardHldrBlngCur.setParent(this,getStartOffset() + 33);
	       			ip00404FloorExpiryDate.setParent(this,getStartOffset() + 66);
	       			ip00404GrpCode.setParent(this,getStartOffset() + 140);
    } 

	/**
	 *	Returns the value of ip00404ProductType
	 *	@return ip00404ProductType
	 */
   public char[] getIp00404ProductType() throws CFException{
     if (isIp00404ProductTypeModified()) { 
        ip00404ProductType = refreshIp00404ProductType();
     }
   		return ip00404ProductType;
   }

  
	/**
	*  set variable ip00404ProductType
	*  Corresponding COBOL Variable is IP00404-PRODUCT-TYPE
	*  @param value
	**/
   public void setIp00404ProductType(char[] value) {
      ip00404ProductType = checkIp00404ProductTypeConstraints(value);
      serializeIp00404ProductType(ip00404ProductType);
   } 

     /**
	 * 	Update Ip00404ProductType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404ProductType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404ProductType,ip00404ProductType.length);
   	
   }
   
   public void setIp00404ProductType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404ProductType,ip00404ProductType.length);
   	
   }
   
     /**
	 * 	Update Ip00404ProductType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404ProductType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404ProductType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404ProductType with another Field
	 *	@param value
	 */
   public void setIp00404ProductType(Field source) {
       replace(source,0,source.length(),beginIp00404ProductType,IP_00404_PRODUCT_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404ProductType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404ProductType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404ProductType,IP_00404_PRODUCT_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404ProductType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404ProductType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404ProductType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404Endpoint
	 *	@return ip00404Endpoint
	 */
	public long getIp00404Endpoint() throws CFException {
       if (isIp00404EndpointModified()) { 
           ip00404Endpoint = refreshIp00404Endpoint();
        }
   		return ip00404Endpoint;
	}
	

	
	   
	/**
	 * 	Update Ip00404Endpoint with the passed value
	 *  Corresponding COBOL Variable is IP00404-ENDPOINT
	 *	@param number
	 */
	public void setIp00404Endpoint(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00404Endpoint = checkIp00404EndpointMaxLimit(number); 
		serializeIp00404Endpoint(ip00404Endpoint);
	}
	

	/**
	 * 	Update Ip00404Endpoint with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00404Endpoint(char[] value) throws CFException {
		 ip00404Endpoint = serializeIp00404Endpoint(value);
	}
	/**
	 * 	Update Ip00404Endpoint with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00404EndpointString(char[] value) throws CFException {
		 setIp00404Endpoint(value);
	}
	/**
	 *	Returns the value of ip00404Country
	 *	@return ip00404Country
	 */
   public char[] getIp00404Country() throws CFException{
     if (isIp00404CountryModified()) { 
        ip00404Country = refreshIp00404Country();
     }
   		return ip00404Country;
   }

  
	/**
	*  set variable ip00404Country
	*  Corresponding COBOL Variable is IP00404-COUNTRY
	*  @param value
	**/
   public void setIp00404Country(char[] value) {
      ip00404Country = checkIp00404CountryConstraints(value);
      serializeIp00404Country(ip00404Country);
   } 

     /**
	 * 	Update Ip00404Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404Country(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404Country,ip00404Country.length);
   	
   }
   
   public void setIp00404Country(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404Country,ip00404Country.length);
   	
   }
   
     /**
	 * 	Update Ip00404Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404Country(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404Country+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404Country with another Field
	 *	@param value
	 */
   public void setIp00404Country(Field source) {
       replace(source,0,source.length(),beginIp00404Country,IP_00404_COUNTRY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404Country(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404Country,IP_00404_COUNTRY_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404Country(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404Country+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404CountryNum
	 *	@return ip00404CountryNum
	 */
	public int getIp00404CountryNum() throws CFException {
       if (isIp00404CountryNumModified()) { 
           ip00404CountryNum = refreshIp00404CountryNum();
        }
   		return ip00404CountryNum;
	}
	

	
	   
	/**
	 * 	Update Ip00404CountryNum with the passed value
	 *  Corresponding COBOL Variable is IP00404-COUNTRY-NUM
	 *	@param number
	 */
	public void setIp00404CountryNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00404CountryNum = checkIp00404CountryNumMaxLimit(number); 
		serializeIp00404CountryNum(ip00404CountryNum);
	}
	

	public void setIp00404CountryNum(long number) {
	    number = checkIp00404CountryNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00404CountryNum((int)number);
	}
	
	/**
	 * 	Update Ip00404CountryNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00404CountryNum(char[] value) throws CFException {
		 ip00404CountryNum = serializeIp00404CountryNum(value);
	}
	/**
	 * 	Update Ip00404CountryNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00404CountryNumString(char[] value) throws CFException {
		 setIp00404CountryNum(value);
	}
	/**
	 *	Returns the value of ip00404RegionSubreg
	 *	@return ip00404RegionSubreg
	 */   
	 public Ip00404RegionSubreg getIp00404RegionSubreg() {
   	return ip00404RegionSubreg;
   }
   /**
	* 	Update Ip00404RegionSubreg with the passed value
	*   Corresponding COBOL Variable is IP00404-REGION-SUBREG
	*	@param value
	*/
   public void setIp00404RegionSubreg(char[] value) {
      ip00404RegionSubreg.setString(value); 
   }   
    
     /**
	 * 	Update Ip00404RegionSubreg 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00404RegionSubreg(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00404RegionSubreg.begin,ip00404RegionSubreg.length());
   }
   
     /**
	 * 	Update Ip00404RegionSubreg 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404RegionSubreg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00404RegionSubreg.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00404RegionSubreg with another Field
	 *	@param value
	 */
   public void setIp00404RegionSubreg(Field source) {
   	replace(source,0,source.length(),ip00404RegionSubreg.begin,ip00404RegionSubreg.length());
   }  
   
     /**
	 * 	Update Ip00404RegionSubreg 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00404RegionSubreg(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00404RegionSubreg.begin,ip00404RegionSubreg.length());
   }
   
     /**
	 * 	Update Ip00404RegionSubreg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404RegionSubreg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00404RegionSubreg.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip00404ProductClass
	 *	@return ip00404ProductClass
	 */
   public char[] getIp00404ProductClass() throws CFException{
     if (isIp00404ProductClassModified()) { 
        ip00404ProductClass = refreshIp00404ProductClass();
     }
   		return ip00404ProductClass;
   }

  
	/**
	*  set variable ip00404ProductClass
	*  Corresponding COBOL Variable is IP00404-PRODUCT-CLASS
	*  @param value
	**/
   public void setIp00404ProductClass(char[] value) {
      ip00404ProductClass = checkIp00404ProductClassConstraints(value);
      serializeIp00404ProductClass(ip00404ProductClass);
   } 

     /**
	 * 	Update Ip00404ProductClass 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404ProductClass(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404ProductClass,ip00404ProductClass.length);
   	
   }
   
   public void setIp00404ProductClass(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404ProductClass,ip00404ProductClass.length);
   	
   }
   
     /**
	 * 	Update Ip00404ProductClass 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404ProductClass(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404ProductClass+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404ProductClass with another Field
	 *	@param value
	 */
   public void setIp00404ProductClass(Field source) {
       replace(source,0,source.length(),beginIp00404ProductClass,IP_00404_PRODUCT_CLASS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404ProductClass 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404ProductClass(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404ProductClass,IP_00404_PRODUCT_CLASS_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404ProductClass 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404ProductClass(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404ProductClass+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404TranRoutingInd
	 *	@return ip00404TranRoutingInd
	 */
   public char[] getIp00404TranRoutingInd() throws CFException{
     if (isIp00404TranRoutingIndModified()) { 
        ip00404TranRoutingInd = refreshIp00404TranRoutingInd();
     }
   		return ip00404TranRoutingInd;
   }

  
	/**
	*  set variable ip00404TranRoutingInd
	*  Corresponding COBOL Variable is IP00404-TRAN-ROUTING-IND
	*  @param value
	**/
   public void setIp00404TranRoutingInd(char[] value) {
      ip00404TranRoutingInd = checkIp00404TranRoutingIndConstraints(value);
      serializeIp00404TranRoutingInd(ip00404TranRoutingInd);
   } 

     /**
	 * 	Update Ip00404TranRoutingInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404TranRoutingInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404TranRoutingInd,ip00404TranRoutingInd.length);
   	
   }
   
   public void setIp00404TranRoutingInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404TranRoutingInd,ip00404TranRoutingInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404TranRoutingInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404TranRoutingInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404TranRoutingInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404TranRoutingInd with another Field
	 *	@param value
	 */
   public void setIp00404TranRoutingInd(Field source) {
       replace(source,0,source.length(),beginIp00404TranRoutingInd,IP_00404_TRAN_ROUTING_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404TranRoutingInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404TranRoutingInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404TranRoutingInd,IP_00404_TRAN_ROUTING_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404TranRoutingInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404TranRoutingInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404TranRoutingInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404PrsProdReassgnSw
	 *	@return ip00404PrsProdReassgnSw
	 */
   public char[] getIp00404PrsProdReassgnSw() throws CFException{
     if (isIp00404PrsProdReassgnSwModified()) { 
        ip00404PrsProdReassgnSw = refreshIp00404PrsProdReassgnSw();
     }
   		return ip00404PrsProdReassgnSw;
   }

  
	/**
	*  set variable ip00404PrsProdReassgnSw
	*  Corresponding COBOL Variable is IP00404-PRS-PROD-REASSGN-SW
	*  @param value
	**/
   public void setIp00404PrsProdReassgnSw(char[] value) {
      ip00404PrsProdReassgnSw = checkIp00404PrsProdReassgnSwConstraints(value);
      serializeIp00404PrsProdReassgnSw(ip00404PrsProdReassgnSw);
   } 

     /**
	 * 	Update Ip00404PrsProdReassgnSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404PrsProdReassgnSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404PrsProdReassgnSw,ip00404PrsProdReassgnSw.length);
   	
   }
   
   public void setIp00404PrsProdReassgnSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404PrsProdReassgnSw,ip00404PrsProdReassgnSw.length);
   	
   }
   
     /**
	 * 	Update Ip00404PrsProdReassgnSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404PrsProdReassgnSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404PrsProdReassgnSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404PrsProdReassgnSw with another Field
	 *	@param value
	 */
   public void setIp00404PrsProdReassgnSw(Field source) {
       replace(source,0,source.length(),beginIp00404PrsProdReassgnSw,IP_00404_PRS_PROD_REASSGN_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404PrsProdReassgnSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404PrsProdReassgnSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404PrsProdReassgnSw,IP_00404_PRS_PROD_REASSGN_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404PrsProdReassgnSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404PrsProdReassgnSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404PrsProdReassgnSw+targetIndex,targetLen);
    
   }
	char[] ip00404PrsPdReasgn8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404PrsPdReasgn88()
	 *	@return  Returns true if isIp00404PrsPdReasgn88() is "Y"
	 */
   public boolean isIp00404PrsPdReasgn88() throws CFException {
      return (  compareChars( getIp00404PrsProdReassgnSw() , ip00404PrsPdReasgn8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404PrsPdReasgn88True() {  			
    	setIp00404PrsProdReassgnSw( ip00404PrsPdReasgn8888Value);
   	}
	char[] ip00404PrsPdNotReasgn8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404PrsPdNotReasgn88()
	 *	@return  Returns true if isIp00404PrsPdNotReasgn88() is "N"
	 */
   public boolean isIp00404PrsPdNotReasgn88() throws CFException {
      return (  compareChars( getIp00404PrsProdReassgnSw() , ip00404PrsPdNotReasgn8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404PrsPdNotReasgn88True() {  			
    	setIp00404PrsProdReassgnSw( ip00404PrsPdNotReasgn8888Value);
   	}
	/**
	 *	Returns the value of ip00404ProdReassignmentSw
	 *	@return ip00404ProdReassignmentSw
	 */
   public char[] getIp00404ProdReassignmentSw() throws CFException{
     if (isIp00404ProdReassignmentSwModified()) { 
        ip00404ProdReassignmentSw = refreshIp00404ProdReassignmentSw();
     }
   		return ip00404ProdReassignmentSw;
   }

  
	/**
	*  set variable ip00404ProdReassignmentSw
	*  Corresponding COBOL Variable is IP00404-PROD-REASSIGNMENT-SW
	*  @param value
	**/
   public void setIp00404ProdReassignmentSw(char[] value) {
      ip00404ProdReassignmentSw = checkIp00404ProdReassignmentSwConstraints(value);
      serializeIp00404ProdReassignmentSw(ip00404ProdReassignmentSw);
   } 

     /**
	 * 	Update Ip00404ProdReassignmentSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404ProdReassignmentSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404ProdReassignmentSw,ip00404ProdReassignmentSw.length);
   	
   }
   
   public void setIp00404ProdReassignmentSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404ProdReassignmentSw,ip00404ProdReassignmentSw.length);
   	
   }
   
     /**
	 * 	Update Ip00404ProdReassignmentSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404ProdReassignmentSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404ProdReassignmentSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404ProdReassignmentSw with another Field
	 *	@param value
	 */
   public void setIp00404ProdReassignmentSw(Field source) {
       replace(source,0,source.length(),beginIp00404ProdReassignmentSw,IP_00404_PROD_REASSIGNMENT_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404ProdReassignmentSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404ProdReassignmentSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404ProdReassignmentSw,IP_00404_PROD_REASSIGNMENT_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404ProdReassignmentSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404ProdReassignmentSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404ProdReassignmentSw+targetIndex,targetLen);
    
   }
	char[] ip00404PdReassigned8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404PdReassigned88()
	 *	@return  Returns true if isIp00404PdReassigned88() is "Y"
	 */
   public boolean isIp00404PdReassigned88() throws CFException {
      return (  compareChars( getIp00404ProdReassignmentSw() , ip00404PdReassigned8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404PdReassigned88True() {  			
    	setIp00404ProdReassignmentSw( ip00404PdReassigned8888Value);
   	}
	char[] ip00404PdNotReassigned8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404PdNotReassigned88()
	 *	@return  Returns true if isIp00404PdNotReassigned88() is "N"
	 */
   public boolean isIp00404PdNotReassigned88() throws CFException {
      return (  compareChars( getIp00404ProdReassignmentSw() , ip00404PdNotReassigned8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404PdNotReassigned88True() {  			
    	setIp00404ProdReassignmentSw( ip00404PdNotReassigned8888Value);
   	}
	/**
	 *	Returns the value of ip00404OptInFlag
	 *	@return ip00404OptInFlag
	 */
   public char[] getIp00404OptInFlag() throws CFException{
     if (isIp00404OptInFlagModified()) { 
        ip00404OptInFlag = refreshIp00404OptInFlag();
     }
   		return ip00404OptInFlag;
   }

  
	/**
	*  set variable ip00404OptInFlag
	*  Corresponding COBOL Variable is IP00404-OPT-IN-FLAG
	*  @param value
	**/
   public void setIp00404OptInFlag(char[] value) {
      ip00404OptInFlag = checkIp00404OptInFlagConstraints(value);
      serializeIp00404OptInFlag(ip00404OptInFlag);
   } 

     /**
	 * 	Update Ip00404OptInFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404OptInFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404OptInFlag,ip00404OptInFlag.length);
   	
   }
   
   public void setIp00404OptInFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404OptInFlag,ip00404OptInFlag.length);
   	
   }
   
     /**
	 * 	Update Ip00404OptInFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404OptInFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404OptInFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404OptInFlag with another Field
	 *	@param value
	 */
   public void setIp00404OptInFlag(Field source) {
       replace(source,0,source.length(),beginIp00404OptInFlag,IP_00404_OPT_IN_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404OptInFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404OptInFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404OptInFlag,IP_00404_OPT_IN_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404OptInFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404OptInFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404OptInFlag+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404LicensedProdId
	 *	@return ip00404LicensedProdId
	 */
   public char[] getIp00404LicensedProdId() throws CFException{
     if (isIp00404LicensedProdIdModified()) { 
        ip00404LicensedProdId = refreshIp00404LicensedProdId();
     }
   		return ip00404LicensedProdId;
   }

  
	/**
	*  set variable ip00404LicensedProdId
	*  Corresponding COBOL Variable is IP00404-LICENSED-PROD-ID
	*  @param value
	**/
   public void setIp00404LicensedProdId(char[] value) {
      ip00404LicensedProdId = checkIp00404LicensedProdIdConstraints(value);
      serializeIp00404LicensedProdId(ip00404LicensedProdId);
   } 

     /**
	 * 	Update Ip00404LicensedProdId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404LicensedProdId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404LicensedProdId,ip00404LicensedProdId.length);
   	
   }
   
   public void setIp00404LicensedProdId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404LicensedProdId,ip00404LicensedProdId.length);
   	
   }
   
     /**
	 * 	Update Ip00404LicensedProdId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404LicensedProdId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404LicensedProdId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404LicensedProdId with another Field
	 *	@param value
	 */
   public void setIp00404LicensedProdId(Field source) {
       replace(source,0,source.length(),beginIp00404LicensedProdId,IP_00404_LICENSED_PROD_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404LicensedProdId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404LicensedProdId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404LicensedProdId,IP_00404_LICENSED_PROD_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404LicensedProdId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404LicensedProdId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404LicensedProdId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404VirtFundPanInd
	 *	@return ip00404VirtFundPanInd
	 */
   public char[] getIp00404VirtFundPanInd() throws CFException{
     if (isIp00404VirtFundPanIndModified()) { 
        ip00404VirtFundPanInd = refreshIp00404VirtFundPanInd();
     }
   		return ip00404VirtFundPanInd;
   }

  
	/**
	*  set variable ip00404VirtFundPanInd
	*  Corresponding COBOL Variable is IP00404-VIRT-FUND-PAN-IND
	*  @param value
	**/
   public void setIp00404VirtFundPanInd(char[] value) {
      ip00404VirtFundPanInd = checkIp00404VirtFundPanIndConstraints(value);
      serializeIp00404VirtFundPanInd(ip00404VirtFundPanInd);
   } 

     /**
	 * 	Update Ip00404VirtFundPanInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404VirtFundPanInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404VirtFundPanInd,ip00404VirtFundPanInd.length);
   	
   }
   
   public void setIp00404VirtFundPanInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404VirtFundPanInd,ip00404VirtFundPanInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404VirtFundPanInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404VirtFundPanInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404VirtFundPanInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404VirtFundPanInd with another Field
	 *	@param value
	 */
   public void setIp00404VirtFundPanInd(Field source) {
       replace(source,0,source.length(),beginIp00404VirtFundPanInd,IP_00404_VIRT_FUND_PAN_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404VirtFundPanInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404VirtFundPanInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404VirtFundPanInd,IP_00404_VIRT_FUND_PAN_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404VirtFundPanInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404VirtFundPanInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404VirtFundPanInd+targetIndex,targetLen);
    
   }
	static java.util.Set<String> ip00404VirtPan8888Value = new java.util.HashSet<>();
static { 
	ip00404VirtPan8888Value.add( "1");
	ip00404VirtPan8888Value.add( "2");
	ip00404VirtPan8888Value.add( "3");
	ip00404VirtPan8888Value.add( "4");
	ip00404VirtPan8888Value.add( "5");
	ip00404VirtPan8888Value.add( "6");
	ip00404VirtPan8888Value.add( "8");
	ip00404VirtPan8888Value.add( "9");
	ip00404VirtPan8888Value.add( "C");
} 

	/**
	 *	Test condition "1" "2" "3" "4" "5" "6" "8" "9" "C" for isIp00404VirtPan88()
	 *	@return  Returns true if isIp00404VirtPan88() is "1" "2" "3" "4" "5" "6" "8" "9" "C"
	 */
   public boolean isIp00404VirtPan88() throws CFException {
      return   ip00404VirtPan8888Value.contains(String.valueOf(getIp00404VirtFundPanInd()));
   }


	/**
	*  set values "1" "2" "3" "4" "5" "6" "8" "9" "C"
	*/
   	public void setIp00404VirtPan88True() {  			
    	  setIp00404VirtFundPanInd(ip00404VirtPan8888Value.iterator().next().toCharArray());
   	}
	static java.util.Set<String> ip00404VpPaypass8888Value = new java.util.HashSet<>();
static { 
	ip00404VpPaypass8888Value.add( "1");
	ip00404VpPaypass8888Value.add( "2");
	ip00404VpPaypass8888Value.add( "3");
	ip00404VpPaypass8888Value.add( "4");
	ip00404VpPaypass8888Value.add( "5");
	ip00404VpPaypass8888Value.add( "6");
} 

	/**
	 *	Test condition "1" "2" "3" "4" "5" "6" for isIp00404VpPaypass88()
	 *	@return  Returns true if isIp00404VpPaypass88() is "1" "2" "3" "4" "5" "6"
	 */
   public boolean isIp00404VpPaypass88() throws CFException {
      return   ip00404VpPaypass8888Value.contains(String.valueOf(getIp00404VirtFundPanInd()));
   }


	/**
	*  set values "1" "2" "3" "4" "5" "6"
	*/
   	public void setIp00404VpPaypass88True() {  			
    	  setIp00404VirtFundPanInd(ip00404VpPaypass8888Value.iterator().next().toCharArray());
   	}
	char[] ip00404VpIncontrol8888Value = "8".toCharArray();
	/**
	 *	Test condition "8" for isIp00404VpIncontrol88()
	 *	@return  Returns true if isIp00404VpIncontrol88() is "8"
	 */
   public boolean isIp00404VpIncontrol88() throws CFException {
      return (  compareChars( getIp00404VirtFundPanInd() , ip00404VpIncontrol8888Value)  == 0  );
   }


	/**
	*  set values "8"
	*/
   	public void setIp00404VpIncontrol88True() {  			
    	setIp00404VirtFundPanInd( ip00404VpIncontrol8888Value);
   	}
	char[] ip00404VpExpChkout8888Value = "9".toCharArray();
	/**
	 *	Test condition "9" for isIp00404VpExpChkout88()
	 *	@return  Returns true if isIp00404VpExpChkout88() is "9"
	 */
   public boolean isIp00404VpExpChkout88() throws CFException {
      return (  compareChars( getIp00404VirtFundPanInd() , ip00404VpExpChkout8888Value)  == 0  );
   }


	/**
	*  set values "9"
	*/
   	public void setIp00404VpExpChkout88True() {  			
    	setIp00404VirtFundPanInd( ip00404VpExpChkout8888Value);
   	}
	char[] ip00404Mdes8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp00404Mdes88()
	 *	@return  Returns true if isIp00404Mdes88() is "C"
	 */
   public boolean isIp00404Mdes88() throws CFException {
      return (  compareChars( getIp00404VirtFundPanInd() , ip00404Mdes8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp00404Mdes88True() {  			
    	setIp00404VirtFundPanInd( ip00404Mdes8888Value);
   	}
	char[] ip00404TspTokenRange8888Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isIp00404TspTokenRange88()
	 *	@return  Returns true if isIp00404TspTokenRange88() is "I"
	 */
   public boolean isIp00404TspTokenRange88() throws CFException {
      return (  compareChars( getIp00404VirtFundPanInd() , ip00404TspTokenRange8888Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setIp00404TspTokenRange88True() {  			
    	setIp00404VirtFundPanInd( ip00404TspTokenRange8888Value);
   	}
	/**
	 *	Returns the value of ip00404AcctCatgPartSw
	 *	@return ip00404AcctCatgPartSw
	 */
   public char[] getIp00404AcctCatgPartSw() throws CFException{
     if (isIp00404AcctCatgPartSwModified()) { 
        ip00404AcctCatgPartSw = refreshIp00404AcctCatgPartSw();
     }
   		return ip00404AcctCatgPartSw;
   }

  
	/**
	*  set variable ip00404AcctCatgPartSw
	*  Corresponding COBOL Variable is IP00404-ACCT-CATG-PART-SW
	*  @param value
	**/
   public void setIp00404AcctCatgPartSw(char[] value) {
      ip00404AcctCatgPartSw = checkIp00404AcctCatgPartSwConstraints(value);
      serializeIp00404AcctCatgPartSw(ip00404AcctCatgPartSw);
   } 

     /**
	 * 	Update Ip00404AcctCatgPartSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404AcctCatgPartSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404AcctCatgPartSw,ip00404AcctCatgPartSw.length);
   	
   }
   
   public void setIp00404AcctCatgPartSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404AcctCatgPartSw,ip00404AcctCatgPartSw.length);
   	
   }
   
     /**
	 * 	Update Ip00404AcctCatgPartSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404AcctCatgPartSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404AcctCatgPartSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404AcctCatgPartSw with another Field
	 *	@param value
	 */
   public void setIp00404AcctCatgPartSw(Field source) {
       replace(source,0,source.length(),beginIp00404AcctCatgPartSw,IP_00404_ACCT_CATG_PART_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404AcctCatgPartSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404AcctCatgPartSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404AcctCatgPartSw,IP_00404_ACCT_CATG_PART_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404AcctCatgPartSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404AcctCatgPartSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404AcctCatgPartSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404AcctCatgActvnDate
	 *	@return ip00404AcctCatgActvnDate
	 */
	public long getIp00404AcctCatgActvnDate() throws CFException {
       if (isIp00404AcctCatgActvnDateModified()) { 
           ip00404AcctCatgActvnDate = refreshIp00404AcctCatgActvnDate();
        }
   		return ip00404AcctCatgActvnDate;
	}
	

	
	   
	/**
	 * 	Update Ip00404AcctCatgActvnDate with the passed value
	 *  Corresponding COBOL Variable is IP00404-ACCT-CATG-ACTVN-DATE
	 *	@param number
	 */
	public void setIp00404AcctCatgActvnDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00404AcctCatgActvnDate = checkIp00404AcctCatgActvnDateMaxLimit(number); 
		serializeIp00404AcctCatgActvnDate(ip00404AcctCatgActvnDate);
	}
	

	/**
	 * 	Update Ip00404AcctCatgActvnDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00404AcctCatgActvnDate(char[] value) throws CFException {
		 ip00404AcctCatgActvnDate = serializeIp00404AcctCatgActvnDate(value);
	}
	/**
	 * 	Update Ip00404AcctCatgActvnDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00404AcctCatgActvnDateString(char[] value) throws CFException {
		 setIp00404AcctCatgActvnDate(value);
	}
	/**
	 *	Returns the value of ip00404CardHldrBlngCur
	 *	@return ip00404CardHldrBlngCur
	 */   
	 public Ip00404CardHldrBlngCur getIp00404CardHldrBlngCur() {
   	return ip00404CardHldrBlngCur;
   }
   /**
	* 	Update Ip00404CardHldrBlngCur with the passed value
	*   Corresponding COBOL Variable is IP00404-CARD-HLDR-BLNG-CUR
	*	@param value
	*/
   public void setIp00404CardHldrBlngCur(char[] value) {
      ip00404CardHldrBlngCur.setString(value); 
   }   
    
     /**
	 * 	Update Ip00404CardHldrBlngCur 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00404CardHldrBlngCur(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00404CardHldrBlngCur.begin,ip00404CardHldrBlngCur.length());
   }
   
     /**
	 * 	Update Ip00404CardHldrBlngCur 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404CardHldrBlngCur(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00404CardHldrBlngCur.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00404CardHldrBlngCur with another Field
	 *	@param value
	 */
   public void setIp00404CardHldrBlngCur(Field source) {
   	replace(source,0,source.length(),ip00404CardHldrBlngCur.begin,ip00404CardHldrBlngCur.length());
   }  
   
     /**
	 * 	Update Ip00404CardHldrBlngCur 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00404CardHldrBlngCur(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00404CardHldrBlngCur.begin,ip00404CardHldrBlngCur.length());
   }
   
     /**
	 * 	Update Ip00404CardHldrBlngCur 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404CardHldrBlngCur(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00404CardHldrBlngCur.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip00404ChipConversionSw
	 *	@return ip00404ChipConversionSw
	 */
   public char[] getIp00404ChipConversionSw() throws CFException{
     if (isIp00404ChipConversionSwModified()) { 
        ip00404ChipConversionSw = refreshIp00404ChipConversionSw();
     }
   		return ip00404ChipConversionSw;
   }

  
	/**
	*  set variable ip00404ChipConversionSw
	*  Corresponding COBOL Variable is IP00404-CHIP-CONVERSION-SW
	*  @param value
	**/
   public void setIp00404ChipConversionSw(char[] value) {
      ip00404ChipConversionSw = checkIp00404ChipConversionSwConstraints(value);
      serializeIp00404ChipConversionSw(ip00404ChipConversionSw);
   } 

     /**
	 * 	Update Ip00404ChipConversionSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404ChipConversionSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404ChipConversionSw,ip00404ChipConversionSw.length);
   	
   }
   
   public void setIp00404ChipConversionSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404ChipConversionSw,ip00404ChipConversionSw.length);
   	
   }
   
     /**
	 * 	Update Ip00404ChipConversionSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404ChipConversionSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404ChipConversionSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404ChipConversionSw with another Field
	 *	@param value
	 */
   public void setIp00404ChipConversionSw(Field source) {
       replace(source,0,source.length(),beginIp00404ChipConversionSw,IP_00404_CHIP_CONVERSION_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404ChipConversionSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404ChipConversionSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404ChipConversionSw,IP_00404_CHIP_CONVERSION_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404ChipConversionSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404ChipConversionSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404ChipConversionSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404FloorExpiryDate
	 *	@return ip00404FloorExpiryDate
	 */   
	 public Ip00404FloorExpiryDate getIp00404FloorExpiryDate() {
   	return ip00404FloorExpiryDate;
   }
   /**
	* 	Update Ip00404FloorExpiryDate with the passed value
	*   Corresponding COBOL Variable is IP00404-FLOOR-EXPIRY-DATE
	*	@param value
	*/
   public void setIp00404FloorExpiryDate(char[] value) {
      ip00404FloorExpiryDate.setString(value); 
   }   
    
     /**
	 * 	Update Ip00404FloorExpiryDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00404FloorExpiryDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00404FloorExpiryDate.begin,ip00404FloorExpiryDate.length());
   }
   
     /**
	 * 	Update Ip00404FloorExpiryDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404FloorExpiryDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00404FloorExpiryDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00404FloorExpiryDate with another Field
	 *	@param value
	 */
   public void setIp00404FloorExpiryDate(Field source) {
   	replace(source,0,source.length(),ip00404FloorExpiryDate.begin,ip00404FloorExpiryDate.length());
   }  
   
     /**
	 * 	Update Ip00404FloorExpiryDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00404FloorExpiryDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00404FloorExpiryDate.begin,ip00404FloorExpiryDate.length());
   }
   
     /**
	 * 	Update Ip00404FloorExpiryDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404FloorExpiryDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00404FloorExpiryDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip00404CoBrandSw
	 *	@return ip00404CoBrandSw
	 */
   public char[] getIp00404CoBrandSw() throws CFException{
     if (isIp00404CoBrandSwModified()) { 
        ip00404CoBrandSw = refreshIp00404CoBrandSw();
     }
   		return ip00404CoBrandSw;
   }

  
	/**
	*  set variable ip00404CoBrandSw
	*  Corresponding COBOL Variable is IP00404-CO-BRAND-SW
	*  @param value
	**/
   public void setIp00404CoBrandSw(char[] value) {
      ip00404CoBrandSw = checkIp00404CoBrandSwConstraints(value);
      serializeIp00404CoBrandSw(ip00404CoBrandSw);
   } 

     /**
	 * 	Update Ip00404CoBrandSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404CoBrandSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404CoBrandSw,ip00404CoBrandSw.length);
   	
   }
   
   public void setIp00404CoBrandSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CoBrandSw,ip00404CoBrandSw.length);
   	
   }
   
     /**
	 * 	Update Ip00404CoBrandSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404CoBrandSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CoBrandSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404CoBrandSw with another Field
	 *	@param value
	 */
   public void setIp00404CoBrandSw(Field source) {
       replace(source,0,source.length(),beginIp00404CoBrandSw,IP_00404_CO_BRAND_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404CoBrandSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404CoBrandSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404CoBrandSw,IP_00404_CO_BRAND_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404CoBrandSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404CoBrandSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CoBrandSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404SpendControlRcnSw
	 *	@return ip00404SpendControlRcnSw
	 */
   public char[] getIp00404SpendControlRcnSw() throws CFException{
     if (isIp00404SpendControlRcnSwModified()) { 
        ip00404SpendControlRcnSw = refreshIp00404SpendControlRcnSw();
     }
   		return ip00404SpendControlRcnSw;
   }

  
	/**
	*  set variable ip00404SpendControlRcnSw
	*  Corresponding COBOL Variable is IP00404-SPEND-CONTROL-RCN-SW
	*  @param value
	**/
   public void setIp00404SpendControlRcnSw(char[] value) {
      ip00404SpendControlRcnSw = checkIp00404SpendControlRcnSwConstraints(value);
      serializeIp00404SpendControlRcnSw(ip00404SpendControlRcnSw);
   } 

     /**
	 * 	Update Ip00404SpendControlRcnSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404SpendControlRcnSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404SpendControlRcnSw,ip00404SpendControlRcnSw.length);
   	
   }
   
   public void setIp00404SpendControlRcnSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404SpendControlRcnSw,ip00404SpendControlRcnSw.length);
   	
   }
   
     /**
	 * 	Update Ip00404SpendControlRcnSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404SpendControlRcnSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404SpendControlRcnSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404SpendControlRcnSw with another Field
	 *	@param value
	 */
   public void setIp00404SpendControlRcnSw(Field source) {
       replace(source,0,source.length(),beginIp00404SpendControlRcnSw,IP_00404_SPEND_CONTROL_RCN_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404SpendControlRcnSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404SpendControlRcnSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404SpendControlRcnSw,IP_00404_SPEND_CONTROL_RCN_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404SpendControlRcnSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404SpendControlRcnSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404SpendControlRcnSw+targetIndex,targetLen);
    
   }
	char[] ip00404RcnSpndCntl8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404RcnSpndCntl88()
	 *	@return  Returns true if isIp00404RcnSpndCntl88() is "Y"
	 */
   public boolean isIp00404RcnSpndCntl88() throws CFException {
      return (  compareChars( getIp00404SpendControlRcnSw() , ip00404RcnSpndCntl8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404RcnSpndCntl88True() {  			
    	setIp00404SpendControlRcnSw( ip00404RcnSpndCntl8888Value);
   	}
	char[] ip00404NotRcnSpndCntl8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404NotRcnSpndCntl88()
	 *	@return  Returns true if isIp00404NotRcnSpndCntl88() is "N"
	 */
   public boolean isIp00404NotRcnSpndCntl88() throws CFException {
      return (  compareChars( getIp00404SpendControlRcnSw() , ip00404NotRcnSpndCntl8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404NotRcnSpndCntl88True() {  			
    	setIp00404SpendControlRcnSw( ip00404NotRcnSpndCntl8888Value);
   	}
	/**
	 *	Returns the value of ip00404MerchCleanServPart
	 *	@return ip00404MerchCleanServPart
	 */
   public char[] getIp00404MerchCleanServPart() throws CFException{
     if (isIp00404MerchCleanServPartModified()) { 
        ip00404MerchCleanServPart = refreshIp00404MerchCleanServPart();
     }
   		return ip00404MerchCleanServPart;
   }

  
	/**
	*  set variable ip00404MerchCleanServPart
	*  Corresponding COBOL Variable is IP00404-MERCH-CLEAN-SERV-PART
	*  @param value
	**/
   public void setIp00404MerchCleanServPart(char[] value) {
      ip00404MerchCleanServPart = checkIp00404MerchCleanServPartConstraints(value);
      serializeIp00404MerchCleanServPart(ip00404MerchCleanServPart);
   } 

     /**
	 * 	Update Ip00404MerchCleanServPart 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404MerchCleanServPart(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404MerchCleanServPart,ip00404MerchCleanServPart.length);
   	
   }
   
   public void setIp00404MerchCleanServPart(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404MerchCleanServPart,ip00404MerchCleanServPart.length);
   	
   }
   
     /**
	 * 	Update Ip00404MerchCleanServPart 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404MerchCleanServPart(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404MerchCleanServPart+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404MerchCleanServPart with another Field
	 *	@param value
	 */
   public void setIp00404MerchCleanServPart(Field source) {
       replace(source,0,source.length(),beginIp00404MerchCleanServPart,IP_00404_MERCH_CLEAN_SERV_PART_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404MerchCleanServPart 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404MerchCleanServPart(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404MerchCleanServPart,IP_00404_MERCH_CLEAN_SERV_PART_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404MerchCleanServPart 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404MerchCleanServPart(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404MerchCleanServPart+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404MerchCleanActvDate
	 *	@return ip00404MerchCleanActvDate
	 */
	public long getIp00404MerchCleanActvDate() throws CFException {
       if (isIp00404MerchCleanActvDateModified()) { 
           ip00404MerchCleanActvDate = refreshIp00404MerchCleanActvDate();
        }
   		return ip00404MerchCleanActvDate;
	}
	

	
	   
	/**
	 * 	Update Ip00404MerchCleanActvDate with the passed value
	 *  Corresponding COBOL Variable is IP00404-MERCH-CLEAN-ACTV-DATE
	 *	@param number
	 */
	public void setIp00404MerchCleanActvDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00404MerchCleanActvDate = checkIp00404MerchCleanActvDateMaxLimit(number); 
		serializeIp00404MerchCleanActvDate(ip00404MerchCleanActvDate);
	}
	

	/**
	 * 	Update Ip00404MerchCleanActvDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00404MerchCleanActvDate(char[] value) throws CFException {
		 ip00404MerchCleanActvDate = serializeIp00404MerchCleanActvDate(value);
	}
	/**
	 * 	Update Ip00404MerchCleanActvDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00404MerchCleanActvDateString(char[] value) throws CFException {
		 setIp00404MerchCleanActvDate(value);
	}
	/**
	 *	Returns the value of ip00404PaypassEnabledInd
	 *	@return ip00404PaypassEnabledInd
	 */
   public char[] getIp00404PaypassEnabledInd() throws CFException{
     if (isIp00404PaypassEnabledIndModified()) { 
        ip00404PaypassEnabledInd = refreshIp00404PaypassEnabledInd();
     }
   		return ip00404PaypassEnabledInd;
   }

  
	/**
	*  set variable ip00404PaypassEnabledInd
	*  Corresponding COBOL Variable is IP00404-PAYPASS-ENABLED-IND
	*  @param value
	**/
   public void setIp00404PaypassEnabledInd(char[] value) {
      ip00404PaypassEnabledInd = checkIp00404PaypassEnabledIndConstraints(value);
      serializeIp00404PaypassEnabledInd(ip00404PaypassEnabledInd);
   } 

     /**
	 * 	Update Ip00404PaypassEnabledInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404PaypassEnabledInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404PaypassEnabledInd,ip00404PaypassEnabledInd.length);
   	
   }
   
   public void setIp00404PaypassEnabledInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404PaypassEnabledInd,ip00404PaypassEnabledInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404PaypassEnabledInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404PaypassEnabledInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404PaypassEnabledInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404PaypassEnabledInd with another Field
	 *	@param value
	 */
   public void setIp00404PaypassEnabledInd(Field source) {
       replace(source,0,source.length(),beginIp00404PaypassEnabledInd,IP_00404_PAYPASS_ENABLED_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404PaypassEnabledInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404PaypassEnabledInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404PaypassEnabledInd,IP_00404_PAYPASS_ENABLED_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404PaypassEnabledInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404PaypassEnabledInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404PaypassEnabledInd+targetIndex,targetLen);
    
   }
	char[] ip00404PaypassEnabledY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404PaypassEnabledY88()
	 *	@return  Returns true if isIp00404PaypassEnabledY88() is "Y"
	 */
   public boolean isIp00404PaypassEnabledY88() throws CFException {
      return (  compareChars( getIp00404PaypassEnabledInd() , ip00404PaypassEnabledY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404PaypassEnabledY88True() {  			
    	setIp00404PaypassEnabledInd( ip00404PaypassEnabledY8888Value);
   	}
	char[] ip00404PaypassEnabledN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404PaypassEnabledN88()
	 *	@return  Returns true if isIp00404PaypassEnabledN88() is "N"
	 */
   public boolean isIp00404PaypassEnabledN88() throws CFException {
      return (  compareChars( getIp00404PaypassEnabledInd() , ip00404PaypassEnabledN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404PaypassEnabledN88True() {  			
    	setIp00404PaypassEnabledInd( ip00404PaypassEnabledN8888Value);
   	}
	char[] ip00404PaypassEnabledM8888Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isIp00404PaypassEnabledM88()
	 *	@return  Returns true if isIp00404PaypassEnabledM88() is "M"
	 */
   public boolean isIp00404PaypassEnabledM88() throws CFException {
      return (  compareChars( getIp00404PaypassEnabledInd() , ip00404PaypassEnabledM8888Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setIp00404PaypassEnabledM88True() {  			
    	setIp00404PaypassEnabledInd( ip00404PaypassEnabledM8888Value);
   	}
	/**
	 *	Returns the value of ip00404RateTypeIndicator
	 *	@return ip00404RateTypeIndicator
	 */
   public char[] getIp00404RateTypeIndicator() throws CFException{
     if (isIp00404RateTypeIndicatorModified()) { 
        ip00404RateTypeIndicator = refreshIp00404RateTypeIndicator();
     }
   		return ip00404RateTypeIndicator;
   }

  
	/**
	*  set variable ip00404RateTypeIndicator
	*  Corresponding COBOL Variable is IP00404-RATE-TYPE-INDICATOR
	*  @param value
	**/
   public void setIp00404RateTypeIndicator(char[] value) {
      ip00404RateTypeIndicator = checkIp00404RateTypeIndicatorConstraints(value);
      serializeIp00404RateTypeIndicator(ip00404RateTypeIndicator);
   } 

     /**
	 * 	Update Ip00404RateTypeIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404RateTypeIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404RateTypeIndicator,ip00404RateTypeIndicator.length);
   	
   }
   
   public void setIp00404RateTypeIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404RateTypeIndicator,ip00404RateTypeIndicator.length);
   	
   }
   
     /**
	 * 	Update Ip00404RateTypeIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404RateTypeIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404RateTypeIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404RateTypeIndicator with another Field
	 *	@param value
	 */
   public void setIp00404RateTypeIndicator(Field source) {
       replace(source,0,source.length(),beginIp00404RateTypeIndicator,IP_00404_RATE_TYPE_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404RateTypeIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404RateTypeIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404RateTypeIndicator,IP_00404_RATE_TYPE_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404RateTypeIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404RateTypeIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404RateTypeIndicator+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404RoutePsnIndicator
	 *	@return ip00404RoutePsnIndicator
	 */
   public char[] getIp00404RoutePsnIndicator() throws CFException{
     if (isIp00404RoutePsnIndicatorModified()) { 
        ip00404RoutePsnIndicator = refreshIp00404RoutePsnIndicator();
     }
   		return ip00404RoutePsnIndicator;
   }

  
	/**
	*  set variable ip00404RoutePsnIndicator
	*  Corresponding COBOL Variable is IP00404-ROUTE-PSN-INDICATOR
	*  @param value
	**/
   public void setIp00404RoutePsnIndicator(char[] value) {
      ip00404RoutePsnIndicator = checkIp00404RoutePsnIndicatorConstraints(value);
      serializeIp00404RoutePsnIndicator(ip00404RoutePsnIndicator);
   } 

     /**
	 * 	Update Ip00404RoutePsnIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404RoutePsnIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404RoutePsnIndicator,ip00404RoutePsnIndicator.length);
   	
   }
   
   public void setIp00404RoutePsnIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404RoutePsnIndicator,ip00404RoutePsnIndicator.length);
   	
   }
   
     /**
	 * 	Update Ip00404RoutePsnIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404RoutePsnIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404RoutePsnIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404RoutePsnIndicator with another Field
	 *	@param value
	 */
   public void setIp00404RoutePsnIndicator(Field source) {
       replace(source,0,source.length(),beginIp00404RoutePsnIndicator,IP_00404_ROUTE_PSN_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404RoutePsnIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404RoutePsnIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404RoutePsnIndicator,IP_00404_ROUTE_PSN_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404RoutePsnIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404RoutePsnIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404RoutePsnIndicator+targetIndex,targetLen);
    
   }
	char[] ip00404RoutePsnIndY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404RoutePsnIndY88()
	 *	@return  Returns true if isIp00404RoutePsnIndY88() is "Y"
	 */
   public boolean isIp00404RoutePsnIndY88() throws CFException {
      return (  compareChars( getIp00404RoutePsnIndicator() , ip00404RoutePsnIndY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404RoutePsnIndY88True() {  			
    	setIp00404RoutePsnIndicator( ip00404RoutePsnIndY8888Value);
   	}
	char[] ip00404RoutePsnIndN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404RoutePsnIndN88()
	 *	@return  Returns true if isIp00404RoutePsnIndN88() is "N"
	 */
   public boolean isIp00404RoutePsnIndN88() throws CFException {
      return (  compareChars( getIp00404RoutePsnIndicator() , ip00404RoutePsnIndN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404RoutePsnIndN88True() {  			
    	setIp00404RoutePsnIndicator( ip00404RoutePsnIndN8888Value);
   	}
	/**
	 *	Returns the value of ip00404CbwpIndicator
	 *	@return ip00404CbwpIndicator
	 */
   public char[] getIp00404CbwpIndicator() throws CFException{
     if (isIp00404CbwpIndicatorModified()) { 
        ip00404CbwpIndicator = refreshIp00404CbwpIndicator();
     }
   		return ip00404CbwpIndicator;
   }

  
	/**
	*  set variable ip00404CbwpIndicator
	*  Corresponding COBOL Variable is IP00404-CBWP-INDICATOR
	*  @param value
	**/
   public void setIp00404CbwpIndicator(char[] value) {
      ip00404CbwpIndicator = checkIp00404CbwpIndicatorConstraints(value);
      serializeIp00404CbwpIndicator(ip00404CbwpIndicator);
   } 

     /**
	 * 	Update Ip00404CbwpIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404CbwpIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404CbwpIndicator,ip00404CbwpIndicator.length);
   	
   }
   
   public void setIp00404CbwpIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CbwpIndicator,ip00404CbwpIndicator.length);
   	
   }
   
     /**
	 * 	Update Ip00404CbwpIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404CbwpIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CbwpIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404CbwpIndicator with another Field
	 *	@param value
	 */
   public void setIp00404CbwpIndicator(Field source) {
       replace(source,0,source.length(),beginIp00404CbwpIndicator,IP_00404_CBWP_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404CbwpIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404CbwpIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404CbwpIndicator,IP_00404_CBWP_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404CbwpIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404CbwpIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CbwpIndicator+targetIndex,targetLen);
    
   }
	char[] ip00404CbwpIndY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404CbwpIndY88()
	 *	@return  Returns true if isIp00404CbwpIndY88() is "Y"
	 */
   public boolean isIp00404CbwpIndY88() throws CFException {
      return (  compareChars( getIp00404CbwpIndicator() , ip00404CbwpIndY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404CbwpIndY88True() {  			
    	setIp00404CbwpIndicator( ip00404CbwpIndY8888Value);
   	}
	char[] ip00404CbwpIndN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404CbwpIndN88()
	 *	@return  Returns true if isIp00404CbwpIndN88() is "N"
	 */
   public boolean isIp00404CbwpIndN88() throws CFException {
      return (  compareChars( getIp00404CbwpIndicator() , ip00404CbwpIndN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404CbwpIndN88True() {  			
    	setIp00404CbwpIndicator( ip00404CbwpIndN8888Value);
   	}
	/**
	 *	Returns the value of ip00404FlexParticipInd
	 *	@return ip00404FlexParticipInd
	 */
   public char[] getIp00404FlexParticipInd() throws CFException{
     if (isIp00404FlexParticipIndModified()) { 
        ip00404FlexParticipInd = refreshIp00404FlexParticipInd();
     }
   		return ip00404FlexParticipInd;
   }

  
	/**
	*  set variable ip00404FlexParticipInd
	*  Corresponding COBOL Variable is IP00404-FLEX-PARTICIP-IND
	*  @param value
	**/
   public void setIp00404FlexParticipInd(char[] value) {
      ip00404FlexParticipInd = checkIp00404FlexParticipIndConstraints(value);
      serializeIp00404FlexParticipInd(ip00404FlexParticipInd);
   } 

     /**
	 * 	Update Ip00404FlexParticipInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404FlexParticipInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404FlexParticipInd,ip00404FlexParticipInd.length);
   	
   }
   
   public void setIp00404FlexParticipInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404FlexParticipInd,ip00404FlexParticipInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404FlexParticipInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404FlexParticipInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404FlexParticipInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404FlexParticipInd with another Field
	 *	@param value
	 */
   public void setIp00404FlexParticipInd(Field source) {
       replace(source,0,source.length(),beginIp00404FlexParticipInd,IP_00404_FLEX_PARTICIP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404FlexParticipInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404FlexParticipInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404FlexParticipInd,IP_00404_FLEX_PARTICIP_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404FlexParticipInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404FlexParticipInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404FlexParticipInd+targetIndex,targetLen);
    
   }
	char[] ip00404ParticipInd08888Value = fillZeroes(1);
	/**
	 *	Test condition "0" for isIp00404ParticipInd088()
	 *	@return  Returns true if isIp00404ParticipInd088() is "0"
	 */
   public boolean isIp00404ParticipInd088() throws CFException {
      return (  compareChars( getIp00404FlexParticipInd() , ip00404ParticipInd08888Value)  == 0  );
   }


	/**
	*  set values "0"
	*/
   	public void setIp00404ParticipInd088True() {  			
    	setIp00404FlexParticipInd( ip00404ParticipInd08888Value);
   	}
	char[] ip00404ParticipInd18888Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isIp00404ParticipInd188()
	 *	@return  Returns true if isIp00404ParticipInd188() is "1"
	 */
   public boolean isIp00404ParticipInd188() throws CFException {
      return (  compareChars( getIp00404FlexParticipInd() , ip00404ParticipInd18888Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setIp00404ParticipInd188True() {  			
    	setIp00404FlexParticipInd( ip00404ParticipInd18888Value);
   	}
	char[] ip00404ParticipInd28888Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isIp00404ParticipInd288()
	 *	@return  Returns true if isIp00404ParticipInd288() is "2"
	 */
   public boolean isIp00404ParticipInd288() throws CFException {
      return (  compareChars( getIp00404FlexParticipInd() , ip00404ParticipInd28888Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setIp00404ParticipInd288True() {  			
    	setIp00404FlexParticipInd( ip00404ParticipInd28888Value);
   	}
	char[] ip00404ParticipInd38888Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isIp00404ParticipInd388()
	 *	@return  Returns true if isIp00404ParticipInd388() is "3"
	 */
   public boolean isIp00404ParticipInd388() throws CFException {
      return (  compareChars( getIp00404FlexParticipInd() , ip00404ParticipInd38888Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setIp00404ParticipInd388True() {  			
    	setIp00404FlexParticipInd( ip00404ParticipInd38888Value);
   	}
	/**
	 *	Returns the value of ip00404RepwrRldInd
	 *	@return ip00404RepwrRldInd
	 */
   public char[] getIp00404RepwrRldInd() throws CFException{
     if (isIp00404RepwrRldIndModified()) { 
        ip00404RepwrRldInd = refreshIp00404RepwrRldInd();
     }
   		return ip00404RepwrRldInd;
   }

  
	/**
	*  set variable ip00404RepwrRldInd
	*  Corresponding COBOL Variable is IP00404-REPWR-RLD-IND
	*  @param value
	**/
   public void setIp00404RepwrRldInd(char[] value) {
      ip00404RepwrRldInd = checkIp00404RepwrRldIndConstraints(value);
      serializeIp00404RepwrRldInd(ip00404RepwrRldInd);
   } 

     /**
	 * 	Update Ip00404RepwrRldInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404RepwrRldInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404RepwrRldInd,ip00404RepwrRldInd.length);
   	
   }
   
   public void setIp00404RepwrRldInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404RepwrRldInd,ip00404RepwrRldInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404RepwrRldInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404RepwrRldInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404RepwrRldInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404RepwrRldInd with another Field
	 *	@param value
	 */
   public void setIp00404RepwrRldInd(Field source) {
       replace(source,0,source.length(),beginIp00404RepwrRldInd,IP_00404_REPWR_RLD_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404RepwrRldInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404RepwrRldInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404RepwrRldInd,IP_00404_REPWR_RLD_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404RepwrRldInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404RepwrRldInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404RepwrRldInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404MoneySendInd
	 *	@return ip00404MoneySendInd
	 */
   public char[] getIp00404MoneySendInd() throws CFException{
     if (isIp00404MoneySendIndModified()) { 
        ip00404MoneySendInd = refreshIp00404MoneySendInd();
     }
   		return ip00404MoneySendInd;
   }

  
	/**
	*  set variable ip00404MoneySendInd
	*  Corresponding COBOL Variable is IP00404-MONEY-SEND-IND
	*  @param value
	**/
   public void setIp00404MoneySendInd(char[] value) {
      ip00404MoneySendInd = checkIp00404MoneySendIndConstraints(value);
      serializeIp00404MoneySendInd(ip00404MoneySendInd);
   } 

     /**
	 * 	Update Ip00404MoneySendInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404MoneySendInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404MoneySendInd,ip00404MoneySendInd.length);
   	
   }
   
   public void setIp00404MoneySendInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404MoneySendInd,ip00404MoneySendInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404MoneySendInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404MoneySendInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404MoneySendInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404MoneySendInd with another Field
	 *	@param value
	 */
   public void setIp00404MoneySendInd(Field source) {
       replace(source,0,source.length(),beginIp00404MoneySendInd,IP_00404_MONEY_SEND_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404MoneySendInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404MoneySendInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404MoneySendInd,IP_00404_MONEY_SEND_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404MoneySendInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404MoneySendInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404MoneySendInd+targetIndex,targetLen);
    
   }
	char[] ip00404MoneySendDomCrs8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404MoneySendDomCrs88()
	 *	@return  Returns true if isIp00404MoneySendDomCrs88() is "Y"
	 */
   public boolean isIp00404MoneySendDomCrs88() throws CFException {
      return (  compareChars( getIp00404MoneySendInd() , ip00404MoneySendDomCrs8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404MoneySendDomCrs88True() {  			
    	setIp00404MoneySendInd( ip00404MoneySendDomCrs8888Value);
   	}
	char[] ip00404MoneySendDom8888Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isIp00404MoneySendDom88()
	 *	@return  Returns true if isIp00404MoneySendDom88() is "D"
	 */
   public boolean isIp00404MoneySendDom88() throws CFException {
      return (  compareChars( getIp00404MoneySendInd() , ip00404MoneySendDom8888Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setIp00404MoneySendDom88True() {  			
    	setIp00404MoneySendInd( ip00404MoneySendDom8888Value);
   	}
	char[] ip00404MoneySendNo8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404MoneySendNo88()
	 *	@return  Returns true if isIp00404MoneySendNo88() is "N"
	 */
   public boolean isIp00404MoneySendNo88() throws CFException {
      return (  compareChars( getIp00404MoneySendInd() , ip00404MoneySendNo8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404MoneySendNo88True() {  			
    	setIp00404MoneySendInd( ip00404MoneySendNo8888Value);
   	}
	char[] ip00404MoneySendUnknown8888Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isIp00404MoneySendUnknown88()
	 *	@return  Returns true if isIp00404MoneySendUnknown88() is "U"
	 */
   public boolean isIp00404MoneySendUnknown88() throws CFException {
      return (  compareChars( getIp00404MoneySendInd() , ip00404MoneySendUnknown8888Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setIp00404MoneySendUnknown88True() {  			
    	setIp00404MoneySendInd( ip00404MoneySendUnknown8888Value);
   	}
	/**
	 *	Returns the value of ip00404RegulatedRateIndSw
	 *	@return ip00404RegulatedRateIndSw
	 */
   public char[] getIp00404RegulatedRateIndSw() throws CFException{
     if (isIp00404RegulatedRateIndSwModified()) { 
        ip00404RegulatedRateIndSw = refreshIp00404RegulatedRateIndSw();
     }
   		return ip00404RegulatedRateIndSw;
   }

  
	/**
	*  set variable ip00404RegulatedRateIndSw
	*  Corresponding COBOL Variable is IP00404-REGULATED-RATE-IND-SW
	*  @param value
	**/
   public void setIp00404RegulatedRateIndSw(char[] value) {
      ip00404RegulatedRateIndSw = checkIp00404RegulatedRateIndSwConstraints(value);
      serializeIp00404RegulatedRateIndSw(ip00404RegulatedRateIndSw);
   } 

     /**
	 * 	Update Ip00404RegulatedRateIndSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404RegulatedRateIndSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404RegulatedRateIndSw,ip00404RegulatedRateIndSw.length);
   	
   }
   
   public void setIp00404RegulatedRateIndSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404RegulatedRateIndSw,ip00404RegulatedRateIndSw.length);
   	
   }
   
     /**
	 * 	Update Ip00404RegulatedRateIndSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404RegulatedRateIndSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404RegulatedRateIndSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404RegulatedRateIndSw with another Field
	 *	@param value
	 */
   public void setIp00404RegulatedRateIndSw(Field source) {
       replace(source,0,source.length(),beginIp00404RegulatedRateIndSw,IP_00404_REGULATED_RATE_IND_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404RegulatedRateIndSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404RegulatedRateIndSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404RegulatedRateIndSw,IP_00404_REGULATED_RATE_IND_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404RegulatedRateIndSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404RegulatedRateIndSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404RegulatedRateIndSw+targetIndex,targetLen);
    
   }
	char[] ip00404RegRateIndSw8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404RegRateIndSw88()
	 *	@return  Returns true if isIp00404RegRateIndSw88() is "Y"
	 */
   public boolean isIp00404RegRateIndSw88() throws CFException {
      return (  compareChars( getIp00404RegulatedRateIndSw() , ip00404RegRateIndSw8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404RegRateIndSw88True() {  			
    	setIp00404RegulatedRateIndSw( ip00404RegRateIndSw8888Value);
   	}
	char[] ip00404NonRegIndSw8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404NonRegIndSw88()
	 *	@return  Returns true if isIp00404NonRegIndSw88() is "N"
	 */
   public boolean isIp00404NonRegIndSw88() throws CFException {
      return (  compareChars( getIp00404RegulatedRateIndSw() , ip00404NonRegIndSw8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404NonRegIndSw88True() {  			
    	setIp00404RegulatedRateIndSw( ip00404NonRegIndSw8888Value);
   	}
	/**
	 *	Returns the value of ip00404CashAccessSw
	 *	@return ip00404CashAccessSw
	 */
   public char[] getIp00404CashAccessSw() throws CFException{
     if (isIp00404CashAccessSwModified()) { 
        ip00404CashAccessSw = refreshIp00404CashAccessSw();
     }
   		return ip00404CashAccessSw;
   }

  
	/**
	*  set variable ip00404CashAccessSw
	*  Corresponding COBOL Variable is IP00404-CASH-ACCESS-SW
	*  @param value
	**/
   public void setIp00404CashAccessSw(char[] value) {
      ip00404CashAccessSw = checkIp00404CashAccessSwConstraints(value);
      serializeIp00404CashAccessSw(ip00404CashAccessSw);
   } 

     /**
	 * 	Update Ip00404CashAccessSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404CashAccessSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404CashAccessSw,ip00404CashAccessSw.length);
   	
   }
   
   public void setIp00404CashAccessSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CashAccessSw,ip00404CashAccessSw.length);
   	
   }
   
     /**
	 * 	Update Ip00404CashAccessSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404CashAccessSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CashAccessSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404CashAccessSw with another Field
	 *	@param value
	 */
   public void setIp00404CashAccessSw(Field source) {
       replace(source,0,source.length(),beginIp00404CashAccessSw,IP_00404_CASH_ACCESS_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404CashAccessSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404CashAccessSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404CashAccessSw,IP_00404_CASH_ACCESS_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404CashAccessSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404CashAccessSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CashAccessSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404PersonPresentInd
	 *	@return ip00404PersonPresentInd
	 */
	public int getIp00404PersonPresentInd() throws CFException {
       if (isIp00404PersonPresentIndModified()) { 
           ip00404PersonPresentInd = refreshIp00404PersonPresentInd();
        }
   		return ip00404PersonPresentInd;
	}
	

	
	   
	/**
	 * 	Update Ip00404PersonPresentInd with the passed value
	 *  Corresponding COBOL Variable is IP00404-PERSON-PRESENT-IND
	 *	@param number
	 */
	public void setIp00404PersonPresentInd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00404PersonPresentInd = checkIp00404PersonPresentIndMaxLimit(number); 
		serializeIp00404PersonPresentInd(ip00404PersonPresentInd);
	}
	

	public void setIp00404PersonPresentInd(long number) {
	    number = checkIp00404PersonPresentIndMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00404PersonPresentInd((int)number);
	}
	
	/**
	 * 	Update Ip00404PersonPresentInd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00404PersonPresentInd(char[] value) throws CFException {
		 ip00404PersonPresentInd = serializeIp00404PersonPresentInd(value);
	}
	/**
	 * 	Update Ip00404PersonPresentInd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00404PersonPresentIndString(char[] value) throws CFException {
		 setIp00404PersonPresentInd(value);
	}
	/**
	 *	Returns the value of ip00404CrossBdrException
	 *	@return ip00404CrossBdrException
	 */
   public char[] getIp00404CrossBdrException() throws CFException{
     if (isIp00404CrossBdrExceptionModified()) { 
        ip00404CrossBdrException = refreshIp00404CrossBdrException();
     }
   		return ip00404CrossBdrException;
   }

  
	/**
	*  set variable ip00404CrossBdrException
	*  Corresponding COBOL Variable is IP00404-CROSS-BDR-EXCEPTION
	*  @param value
	**/
   public void setIp00404CrossBdrException(char[] value) {
      ip00404CrossBdrException = checkIp00404CrossBdrExceptionConstraints(value);
      serializeIp00404CrossBdrException(ip00404CrossBdrException);
   } 

     /**
	 * 	Update Ip00404CrossBdrException 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404CrossBdrException(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404CrossBdrException,ip00404CrossBdrException.length);
   	
   }
   
   public void setIp00404CrossBdrException(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CrossBdrException,ip00404CrossBdrException.length);
   	
   }
   
     /**
	 * 	Update Ip00404CrossBdrException 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404CrossBdrException(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CrossBdrException+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404CrossBdrException with another Field
	 *	@param value
	 */
   public void setIp00404CrossBdrException(Field source) {
       replace(source,0,source.length(),beginIp00404CrossBdrException,IP_00404_CROSS_BDR_EXCEPTION_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404CrossBdrException 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404CrossBdrException(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404CrossBdrException,IP_00404_CROSS_BDR_EXCEPTION_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404CrossBdrException 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404CrossBdrException(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CrossBdrException+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404IssTargetMarketInd
	 *	@return ip00404IssTargetMarketInd
	 */
   public char[] getIp00404IssTargetMarketInd() throws CFException{
     if (isIp00404IssTargetMarketIndModified()) { 
        ip00404IssTargetMarketInd = refreshIp00404IssTargetMarketInd();
     }
   		return ip00404IssTargetMarketInd;
   }

  
	/**
	*  set variable ip00404IssTargetMarketInd
	*  Corresponding COBOL Variable is IP00404-ISS-TARGET-MARKET-IND
	*  @param value
	**/
   public void setIp00404IssTargetMarketInd(char[] value) {
      ip00404IssTargetMarketInd = checkIp00404IssTargetMarketIndConstraints(value);
      serializeIp00404IssTargetMarketInd(ip00404IssTargetMarketInd);
   } 

     /**
	 * 	Update Ip00404IssTargetMarketInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404IssTargetMarketInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404IssTargetMarketInd,ip00404IssTargetMarketInd.length);
   	
   }
   
   public void setIp00404IssTargetMarketInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404IssTargetMarketInd,ip00404IssTargetMarketInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404IssTargetMarketInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404IssTargetMarketInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404IssTargetMarketInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404IssTargetMarketInd with another Field
	 *	@param value
	 */
   public void setIp00404IssTargetMarketInd(Field source) {
       replace(source,0,source.length(),beginIp00404IssTargetMarketInd,IP_00404_ISS_TARGET_MARKET_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404IssTargetMarketInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404IssTargetMarketInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404IssTargetMarketInd,IP_00404_ISS_TARGET_MARKET_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404IssTargetMarketInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404IssTargetMarketInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404IssTargetMarketInd+targetIndex,targetLen);
    
   }
	char[] ip00404IssTrgtmktPartY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404IssTrgtmktPartY88()
	 *	@return  Returns true if isIp00404IssTrgtmktPartY88() is "Y"
	 */
   public boolean isIp00404IssTrgtmktPartY88() throws CFException {
      return (  compareChars( getIp00404IssTargetMarketInd() , ip00404IssTrgtmktPartY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404IssTrgtmktPartY88True() {  			
    	setIp00404IssTargetMarketInd( ip00404IssTrgtmktPartY8888Value);
   	}
	char[] ip00404IssTrgtmktPartN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404IssTrgtmktPartN88()
	 *	@return  Returns true if isIp00404IssTrgtmktPartN88() is "N"
	 */
   public boolean isIp00404IssTrgtmktPartN88() throws CFException {
      return (  compareChars( getIp00404IssTargetMarketInd() , ip00404IssTrgtmktPartN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404IssTrgtmktPartN88True() {  			
    	setIp00404IssTargetMarketInd( ip00404IssTrgtmktPartN8888Value);
   	}
	/**
	 *	Returns the value of ip00404PostDateServSw
	 *	@return ip00404PostDateServSw
	 */
   public char[] getIp00404PostDateServSw() throws CFException{
     if (isIp00404PostDateServSwModified()) { 
        ip00404PostDateServSw = refreshIp00404PostDateServSw();
     }
   		return ip00404PostDateServSw;
   }

  
	/**
	*  set variable ip00404PostDateServSw
	*  Corresponding COBOL Variable is IP00404-POST-DATE-SERV-SW
	*  @param value
	**/
   public void setIp00404PostDateServSw(char[] value) {
      ip00404PostDateServSw = checkIp00404PostDateServSwConstraints(value);
      serializeIp00404PostDateServSw(ip00404PostDateServSw);
   } 

     /**
	 * 	Update Ip00404PostDateServSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404PostDateServSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404PostDateServSw,ip00404PostDateServSw.length);
   	
   }
   
   public void setIp00404PostDateServSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404PostDateServSw,ip00404PostDateServSw.length);
   	
   }
   
     /**
	 * 	Update Ip00404PostDateServSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404PostDateServSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404PostDateServSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404PostDateServSw with another Field
	 *	@param value
	 */
   public void setIp00404PostDateServSw(Field source) {
       replace(source,0,source.length(),beginIp00404PostDateServSw,IP_00404_POST_DATE_SERV_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404PostDateServSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404PostDateServSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404PostDateServSw,IP_00404_POST_DATE_SERV_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404PostDateServSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404PostDateServSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404PostDateServSw+targetIndex,targetLen);
    
   }
	char[] ip00404PostDteServSwY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404PostDteServSwY88()
	 *	@return  Returns true if isIp00404PostDteServSwY88() is "Y"
	 */
   public boolean isIp00404PostDteServSwY88() throws CFException {
      return (  compareChars( getIp00404PostDateServSw() , ip00404PostDteServSwY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404PostDteServSwY88True() {  			
    	setIp00404PostDateServSw( ip00404PostDteServSwY8888Value);
   	}
	char[] ip00404PostDteServSwN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404PostDteServSwN88()
	 *	@return  Returns true if isIp00404PostDteServSwN88() is "N"
	 */
   public boolean isIp00404PostDteServSwN88() throws CFException {
      return (  compareChars( getIp00404PostDateServSw() , ip00404PostDteServSwN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404PostDteServSwN88True() {  			
    	setIp00404PostDateServSw( ip00404PostDteServSwN8888Value);
   	}
	/**
	 *	Returns the value of ip00404MealVoucherInd
	 *	@return ip00404MealVoucherInd
	 */
   public char[] getIp00404MealVoucherInd() throws CFException{
     if (isIp00404MealVoucherIndModified()) { 
        ip00404MealVoucherInd = refreshIp00404MealVoucherInd();
     }
   		return ip00404MealVoucherInd;
   }

  
	/**
	*  set variable ip00404MealVoucherInd
	*  Corresponding COBOL Variable is IP00404-MEAL-VOUCHER-IND
	*  @param value
	**/
   public void setIp00404MealVoucherInd(char[] value) {
      ip00404MealVoucherInd = checkIp00404MealVoucherIndConstraints(value);
      serializeIp00404MealVoucherInd(ip00404MealVoucherInd);
   } 

     /**
	 * 	Update Ip00404MealVoucherInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404MealVoucherInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404MealVoucherInd,ip00404MealVoucherInd.length);
   	
   }
   
   public void setIp00404MealVoucherInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404MealVoucherInd,ip00404MealVoucherInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404MealVoucherInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404MealVoucherInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404MealVoucherInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404MealVoucherInd with another Field
	 *	@param value
	 */
   public void setIp00404MealVoucherInd(Field source) {
       replace(source,0,source.length(),beginIp00404MealVoucherInd,IP_00404_MEAL_VOUCHER_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404MealVoucherInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404MealVoucherInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404MealVoucherInd,IP_00404_MEAL_VOUCHER_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404MealVoucherInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404MealVoucherInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404MealVoucherInd+targetIndex,targetLen);
    
   }
	char[] ip00404MealVoucherIndY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404MealVoucherIndY88()
	 *	@return  Returns true if isIp00404MealVoucherIndY88() is "Y"
	 */
   public boolean isIp00404MealVoucherIndY88() throws CFException {
      return (  compareChars( getIp00404MealVoucherInd() , ip00404MealVoucherIndY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404MealVoucherIndY88True() {  			
    	setIp00404MealVoucherInd( ip00404MealVoucherIndY8888Value);
   	}
	char[] ip00404MealVoucherIndN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404MealVoucherIndN88()
	 *	@return  Returns true if isIp00404MealVoucherIndN88() is "N"
	 */
   public boolean isIp00404MealVoucherIndN88() throws CFException {
      return (  compareChars( getIp00404MealVoucherInd() , ip00404MealVoucherIndN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404MealVoucherIndN88True() {  			
    	setIp00404MealVoucherInd( ip00404MealVoucherIndN8888Value);
   	}
	/**
	 *	Returns the value of ip00404NonRldblPrpdSw
	 *	@return ip00404NonRldblPrpdSw
	 */
   public char[] getIp00404NonRldblPrpdSw() throws CFException{
     if (isIp00404NonRldblPrpdSwModified()) { 
        ip00404NonRldblPrpdSw = refreshIp00404NonRldblPrpdSw();
     }
   		return ip00404NonRldblPrpdSw;
   }

  
	/**
	*  set variable ip00404NonRldblPrpdSw
	*  Corresponding COBOL Variable is IP00404-NON-RLDBL-PRPD-SW
	*  @param value
	**/
   public void setIp00404NonRldblPrpdSw(char[] value) {
      ip00404NonRldblPrpdSw = checkIp00404NonRldblPrpdSwConstraints(value);
      serializeIp00404NonRldblPrpdSw(ip00404NonRldblPrpdSw);
   } 

     /**
	 * 	Update Ip00404NonRldblPrpdSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404NonRldblPrpdSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404NonRldblPrpdSw,ip00404NonRldblPrpdSw.length);
   	
   }
   
   public void setIp00404NonRldblPrpdSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404NonRldblPrpdSw,ip00404NonRldblPrpdSw.length);
   	
   }
   
     /**
	 * 	Update Ip00404NonRldblPrpdSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404NonRldblPrpdSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404NonRldblPrpdSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404NonRldblPrpdSw with another Field
	 *	@param value
	 */
   public void setIp00404NonRldblPrpdSw(Field source) {
       replace(source,0,source.length(),beginIp00404NonRldblPrpdSw,IP_00404_NON_RLDBL_PRPD_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404NonRldblPrpdSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404NonRldblPrpdSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404NonRldblPrpdSw,IP_00404_NON_RLDBL_PRPD_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404NonRldblPrpdSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404NonRldblPrpdSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404NonRldblPrpdSw+targetIndex,targetLen);
    
   }
	char[] ip00404NonRldblPrpd8888Value = "01".toCharArray();
	/**
	 *	Test condition "01" for isIp00404NonRldblPrpd88()
	 *	@return  Returns true if isIp00404NonRldblPrpd88() is "01"
	 */
   public boolean isIp00404NonRldblPrpd88() throws CFException {
      return (  compareChars( getIp00404NonRldblPrpdSw() , ip00404NonRldblPrpd8888Value)  == 0  );
   }


	/**
	*  set values "01"
	*/
   	public void setIp00404NonRldblPrpd88True() {  			
    	setIp00404NonRldblPrpdSw( ip00404NonRldblPrpd8888Value);
   	}
	char[] ip00404NonRldlPrpdNomc8888Value = "99".toCharArray();
	/**
	 *	Test condition "99" for isIp00404NonRldlPrpdNomc88()
	 *	@return  Returns true if isIp00404NonRldlPrpdNomc88() is "99"
	 */
   public boolean isIp00404NonRldlPrpdNomc88() throws CFException {
      return (  compareChars( getIp00404NonRldblPrpdSw() , ip00404NonRldlPrpdNomc8888Value)  == 0  );
   }


	/**
	*  set values "99"
	*/
   	public void setIp00404NonRldlPrpdNomc88True() {  			
    	setIp00404NonRldblPrpdSw( ip00404NonRldlPrpdNomc8888Value);
   	}
	/**
	 *	Returns the value of ip00404FasterFundsInd
	 *	@return ip00404FasterFundsInd
	 */
   public char[] getIp00404FasterFundsInd() throws CFException{
     if (isIp00404FasterFundsIndModified()) { 
        ip00404FasterFundsInd = refreshIp00404FasterFundsInd();
     }
   		return ip00404FasterFundsInd;
   }

  
	/**
	*  set variable ip00404FasterFundsInd
	*  Corresponding COBOL Variable is IP00404-FASTER-FUNDS-IND
	*  @param value
	**/
   public void setIp00404FasterFundsInd(char[] value) {
      ip00404FasterFundsInd = checkIp00404FasterFundsIndConstraints(value);
      serializeIp00404FasterFundsInd(ip00404FasterFundsInd);
   } 

     /**
	 * 	Update Ip00404FasterFundsInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404FasterFundsInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404FasterFundsInd,ip00404FasterFundsInd.length);
   	
   }
   
   public void setIp00404FasterFundsInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404FasterFundsInd,ip00404FasterFundsInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404FasterFundsInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404FasterFundsInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404FasterFundsInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404FasterFundsInd with another Field
	 *	@param value
	 */
   public void setIp00404FasterFundsInd(Field source) {
       replace(source,0,source.length(),beginIp00404FasterFundsInd,IP_00404_FASTER_FUNDS_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404FasterFundsInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404FasterFundsInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404FasterFundsInd,IP_00404_FASTER_FUNDS_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404FasterFundsInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404FasterFundsInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404FasterFundsInd+targetIndex,targetLen);
    
   }
	char[] ip00404FasterFundsNo8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404FasterFundsNo88()
	 *	@return  Returns true if isIp00404FasterFundsNo88() is "N"
	 */
   public boolean isIp00404FasterFundsNo88() throws CFException {
      return (  compareChars( getIp00404FasterFundsInd() , ip00404FasterFundsNo8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404FasterFundsNo88True() {  			
    	setIp00404FasterFundsInd( ip00404FasterFundsNo8888Value);
   	}
	char[] ip00404FasterFundsDom8888Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isIp00404FasterFundsDom88()
	 *	@return  Returns true if isIp00404FasterFundsDom88() is "D"
	 */
   public boolean isIp00404FasterFundsDom88() throws CFException {
      return (  compareChars( getIp00404FasterFundsInd() , ip00404FasterFundsDom8888Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setIp00404FasterFundsDom88True() {  			
    	setIp00404FasterFundsInd( ip00404FasterFundsDom8888Value);
   	}
	char[] ip00404FstrFndDomCrs8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404FstrFndDomCrs88()
	 *	@return  Returns true if isIp00404FstrFndDomCrs88() is "Y"
	 */
   public boolean isIp00404FstrFndDomCrs88() throws CFException {
      return (  compareChars( getIp00404FasterFundsInd() , ip00404FstrFndDomCrs8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404FstrFndDomCrs88True() {  			
    	setIp00404FasterFundsInd( ip00404FstrFndDomCrs8888Value);
   	}
	/**
	 *	Returns the value of ip00404AnonPrepaidInd
	 *	@return ip00404AnonPrepaidInd
	 */
   public char[] getIp00404AnonPrepaidInd() throws CFException{
     if (isIp00404AnonPrepaidIndModified()) { 
        ip00404AnonPrepaidInd = refreshIp00404AnonPrepaidInd();
     }
   		return ip00404AnonPrepaidInd;
   }

  
	/**
	*  set variable ip00404AnonPrepaidInd
	*  Corresponding COBOL Variable is IP00404-ANON-PREPAID-IND
	*  @param value
	**/
   public void setIp00404AnonPrepaidInd(char[] value) {
      ip00404AnonPrepaidInd = checkIp00404AnonPrepaidIndConstraints(value);
      serializeIp00404AnonPrepaidInd(ip00404AnonPrepaidInd);
   } 

     /**
	 * 	Update Ip00404AnonPrepaidInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404AnonPrepaidInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404AnonPrepaidInd,ip00404AnonPrepaidInd.length);
   	
   }
   
   public void setIp00404AnonPrepaidInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404AnonPrepaidInd,ip00404AnonPrepaidInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404AnonPrepaidInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404AnonPrepaidInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404AnonPrepaidInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404AnonPrepaidInd with another Field
	 *	@param value
	 */
   public void setIp00404AnonPrepaidInd(Field source) {
       replace(source,0,source.length(),beginIp00404AnonPrepaidInd,IP_00404_ANON_PREPAID_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404AnonPrepaidInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404AnonPrepaidInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404AnonPrepaidInd,IP_00404_ANON_PREPAID_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404AnonPrepaidInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404AnonPrepaidInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404AnonPrepaidInd+targetIndex,targetLen);
    
   }
	char[] ip00404AnonPrepaidIndN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404AnonPrepaidIndN88()
	 *	@return  Returns true if isIp00404AnonPrepaidIndN88() is "N"
	 */
   public boolean isIp00404AnonPrepaidIndN88() throws CFException {
      return (  compareChars( getIp00404AnonPrepaidInd() , ip00404AnonPrepaidIndN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404AnonPrepaidIndN88True() {  			
    	setIp00404AnonPrepaidInd( ip00404AnonPrepaidIndN8888Value);
   	}
	char[] ip00404AnonPrepaidIndE8888Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isIp00404AnonPrepaidIndE88()
	 *	@return  Returns true if isIp00404AnonPrepaidIndE88() is "E"
	 */
   public boolean isIp00404AnonPrepaidIndE88() throws CFException {
      return (  compareChars( getIp00404AnonPrepaidInd() , ip00404AnonPrepaidIndE8888Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setIp00404AnonPrepaidIndE88True() {  			
    	setIp00404AnonPrepaidInd( ip00404AnonPrepaidIndE8888Value);
   	}
	char[] ip00404AnonPrepaidIndA8888Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isIp00404AnonPrepaidIndA88()
	 *	@return  Returns true if isIp00404AnonPrepaidIndA88() is "A"
	 */
   public boolean isIp00404AnonPrepaidIndA88() throws CFException {
      return (  compareChars( getIp00404AnonPrepaidInd() , ip00404AnonPrepaidIndA8888Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setIp00404AnonPrepaidIndA88True() {  			
    	setIp00404AnonPrepaidInd( ip00404AnonPrepaidIndA8888Value);
   	}
	char[] ip00404AnonPrepaidIndU8888Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isIp00404AnonPrepaidIndU88()
	 *	@return  Returns true if isIp00404AnonPrepaidIndU88() is "U"
	 */
   public boolean isIp00404AnonPrepaidIndU88() throws CFException {
      return (  compareChars( getIp00404AnonPrepaidInd() , ip00404AnonPrepaidIndU8888Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setIp00404AnonPrepaidIndU88True() {  			
    	setIp00404AnonPrepaidInd( ip00404AnonPrepaidIndU8888Value);
   	}
	/**
	 *	Returns the value of ip00404DccStatusInd
	 *	@return ip00404DccStatusInd
	 */
   public char[] getIp00404DccStatusInd() throws CFException{
     if (isIp00404DccStatusIndModified()) { 
        ip00404DccStatusInd = refreshIp00404DccStatusInd();
     }
   		return ip00404DccStatusInd;
   }

  
	/**
	*  set variable ip00404DccStatusInd
	*  Corresponding COBOL Variable is IP00404-DCC-STATUS-IND
	*  @param value
	**/
   public void setIp00404DccStatusInd(char[] value) {
      ip00404DccStatusInd = checkIp00404DccStatusIndConstraints(value);
      serializeIp00404DccStatusInd(ip00404DccStatusInd);
   } 

     /**
	 * 	Update Ip00404DccStatusInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404DccStatusInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404DccStatusInd,ip00404DccStatusInd.length);
   	
   }
   
   public void setIp00404DccStatusInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404DccStatusInd,ip00404DccStatusInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404DccStatusInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404DccStatusInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404DccStatusInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404DccStatusInd with another Field
	 *	@param value
	 */
   public void setIp00404DccStatusInd(Field source) {
       replace(source,0,source.length(),beginIp00404DccStatusInd,IP_00404_DCC_STATUS_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404DccStatusInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404DccStatusInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404DccStatusInd,IP_00404_DCC_STATUS_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404DccStatusInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404DccStatusInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404DccStatusInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404PayByAcctInd
	 *	@return ip00404PayByAcctInd
	 */
   public char[] getIp00404PayByAcctInd() throws CFException{
     if (isIp00404PayByAcctIndModified()) { 
        ip00404PayByAcctInd = refreshIp00404PayByAcctInd();
     }
   		return ip00404PayByAcctInd;
   }

  
	/**
	*  set variable ip00404PayByAcctInd
	*  Corresponding COBOL Variable is IP00404-PAY-BY-ACCT-IND
	*  @param value
	**/
   public void setIp00404PayByAcctInd(char[] value) {
      ip00404PayByAcctInd = checkIp00404PayByAcctIndConstraints(value);
      serializeIp00404PayByAcctInd(ip00404PayByAcctInd);
   } 

     /**
	 * 	Update Ip00404PayByAcctInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404PayByAcctInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404PayByAcctInd,ip00404PayByAcctInd.length);
   	
   }
   
   public void setIp00404PayByAcctInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404PayByAcctInd,ip00404PayByAcctInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404PayByAcctInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404PayByAcctInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404PayByAcctInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404PayByAcctInd with another Field
	 *	@param value
	 */
   public void setIp00404PayByAcctInd(Field source) {
       replace(source,0,source.length(),beginIp00404PayByAcctInd,IP_00404_PAY_BY_ACCT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404PayByAcctInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404PayByAcctInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404PayByAcctInd,IP_00404_PAY_BY_ACCT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404PayByAcctInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404PayByAcctInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404PayByAcctInd+targetIndex,targetLen);
    
   }
	char[] ip00404PayByAcctIndY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404PayByAcctIndY88()
	 *	@return  Returns true if isIp00404PayByAcctIndY88() is "Y"
	 */
   public boolean isIp00404PayByAcctIndY88() throws CFException {
      return (  compareChars( getIp00404PayByAcctInd() , ip00404PayByAcctIndY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404PayByAcctIndY88True() {  			
    	setIp00404PayByAcctInd( ip00404PayByAcctIndY8888Value);
   	}
	char[] ip00404PayByAcctIndN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404PayByAcctIndN88()
	 *	@return  Returns true if isIp00404PayByAcctIndN88() is "N"
	 */
   public boolean isIp00404PayByAcctIndN88() throws CFException {
      return (  compareChars( getIp00404PayByAcctInd() , ip00404PayByAcctIndN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404PayByAcctIndN88True() {  			
    	setIp00404PayByAcctInd( ip00404PayByAcctIndN8888Value);
   	}
	/**
	 *	Returns the value of ip00404IssGamParticipSw
	 *	@return ip00404IssGamParticipSw
	 */
   public char[] getIp00404IssGamParticipSw() throws CFException{
     if (isIp00404IssGamParticipSwModified()) { 
        ip00404IssGamParticipSw = refreshIp00404IssGamParticipSw();
     }
   		return ip00404IssGamParticipSw;
   }

  
	/**
	*  set variable ip00404IssGamParticipSw
	*  Corresponding COBOL Variable is IP00404-ISS-GAM-PARTICIP-SW
	*  @param value
	**/
   public void setIp00404IssGamParticipSw(char[] value) {
      ip00404IssGamParticipSw = checkIp00404IssGamParticipSwConstraints(value);
      serializeIp00404IssGamParticipSw(ip00404IssGamParticipSw);
   } 

     /**
	 * 	Update Ip00404IssGamParticipSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404IssGamParticipSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404IssGamParticipSw,ip00404IssGamParticipSw.length);
   	
   }
   
   public void setIp00404IssGamParticipSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404IssGamParticipSw,ip00404IssGamParticipSw.length);
   	
   }
   
     /**
	 * 	Update Ip00404IssGamParticipSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404IssGamParticipSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404IssGamParticipSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404IssGamParticipSw with another Field
	 *	@param value
	 */
   public void setIp00404IssGamParticipSw(Field source) {
       replace(source,0,source.length(),beginIp00404IssGamParticipSw,IP_00404_ISS_GAM_PARTICIP_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404IssGamParticipSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404IssGamParticipSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404IssGamParticipSw,IP_00404_ISS_GAM_PARTICIP_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404IssGamParticipSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404IssGamParticipSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404IssGamParticipSw+targetIndex,targetLen);
    
   }
	char[] ip00404IssGamParticipY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404IssGamParticipY88()
	 *	@return  Returns true if isIp00404IssGamParticipY88() is "Y"
	 */
   public boolean isIp00404IssGamParticipY88() throws CFException {
      return (  compareChars( getIp00404IssGamParticipSw() , ip00404IssGamParticipY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404IssGamParticipY88True() {  			
    	setIp00404IssGamParticipSw( ip00404IssGamParticipY8888Value);
   	}
	char[] ip00404IssGamParticipN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404IssGamParticipN88()
	 *	@return  Returns true if isIp00404IssGamParticipN88() is "N"
	 */
   public boolean isIp00404IssGamParticipN88() throws CFException {
      return (  compareChars( getIp00404IssGamParticipSw() , ip00404IssGamParticipN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404IssGamParticipN88True() {  			
    	setIp00404IssGamParticipSw( ip00404IssGamParticipN8888Value);
   	}
	/**
	 *	Returns the value of ip00404MemberFiller
	 *	@return ip00404MemberFiller
	 */
   public char[] getIp00404MemberFiller() throws CFException{
     if (isIp00404MemberFillerModified()) { 
        ip00404MemberFiller = refreshIp00404MemberFiller();
     }
   		return ip00404MemberFiller;
   }

  
	/**
	*  set variable ip00404MemberFiller
	*  Corresponding COBOL Variable is IP00404-MEMBER-FILLER
	*  @param value
	**/
   public void setIp00404MemberFiller(char[] value) {
      ip00404MemberFiller = checkIp00404MemberFillerConstraints(value);
      serializeIp00404MemberFiller(ip00404MemberFiller);
   } 

     /**
	 * 	Update Ip00404MemberFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404MemberFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404MemberFiller,ip00404MemberFiller.length);
   	
   }
   
   public void setIp00404MemberFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404MemberFiller,ip00404MemberFiller.length);
   	
   }
   
     /**
	 * 	Update Ip00404MemberFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404MemberFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404MemberFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404MemberFiller with another Field
	 *	@param value
	 */
   public void setIp00404MemberFiller(Field source) {
       replace(source,0,source.length(),beginIp00404MemberFiller,IP_00404_MEMBER_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404MemberFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404MemberFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404MemberFiller,IP_00404_MEMBER_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404MemberFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404MemberFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404MemberFiller+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404ChbConvExclId
	 *	@return ip00404ChbConvExclId
	 */
   public char[] getIp00404ChbConvExclId() throws CFException{
     if (isIp00404ChbConvExclIdModified()) { 
        ip00404ChbConvExclId = refreshIp00404ChbConvExclId();
     }
   		return ip00404ChbConvExclId;
   }

  
	/**
	*  set variable ip00404ChbConvExclId
	*  Corresponding COBOL Variable is IP00404-CHB-CONV-EXCL-ID
	*  @param value
	**/
   public void setIp00404ChbConvExclId(char[] value) {
      ip00404ChbConvExclId = checkIp00404ChbConvExclIdConstraints(value);
      serializeIp00404ChbConvExclId(ip00404ChbConvExclId);
   } 

     /**
	 * 	Update Ip00404ChbConvExclId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404ChbConvExclId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404ChbConvExclId,ip00404ChbConvExclId.length);
   	
   }
   
   public void setIp00404ChbConvExclId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404ChbConvExclId,ip00404ChbConvExclId.length);
   	
   }
   
     /**
	 * 	Update Ip00404ChbConvExclId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404ChbConvExclId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404ChbConvExclId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404ChbConvExclId with another Field
	 *	@param value
	 */
   public void setIp00404ChbConvExclId(Field source) {
       replace(source,0,source.length(),beginIp00404ChbConvExclId,IP_00404_CHB_CONV_EXCL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404ChbConvExclId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404ChbConvExclId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404ChbConvExclId,IP_00404_CHB_CONV_EXCL_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404ChbConvExclId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404ChbConvExclId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404ChbConvExclId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404ChbConvExclExpire
	 *	@return ip00404ChbConvExclExpire
	 */
	public long getIp00404ChbConvExclExpire() throws CFException {
       if (isIp00404ChbConvExclExpireModified()) { 
           ip00404ChbConvExclExpire = refreshIp00404ChbConvExclExpire();
        }
   		return ip00404ChbConvExclExpire;
	}
	

	
	   
	/**
	 * 	Update Ip00404ChbConvExclExpire with the passed value
	 *  Corresponding COBOL Variable is IP00404-CHB-CONV-EXCL-EXPIRE
	 *	@param number
	 */
	public void setIp00404ChbConvExclExpire(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00404ChbConvExclExpire = checkIp00404ChbConvExclExpireMaxLimit(number); 
		serializeIp00404ChbConvExclExpire(ip00404ChbConvExclExpire);
	}
	

	/**
	 * 	Update Ip00404ChbConvExclExpire with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00404ChbConvExclExpire(char[] value) throws CFException {
		 ip00404ChbConvExclExpire = serializeIp00404ChbConvExclExpire(value);
	}
	/**
	 * 	Update Ip00404ChbConvExclExpire with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00404ChbConvExclExpireString(char[] value) throws CFException {
		 setIp00404ChbConvExclExpire(value);
	}
	/**
	 *	Returns the value of ip00404HardshipIndicator
	 *	@return ip00404HardshipIndicator
	 */
   public char[] getIp00404HardshipIndicator() throws CFException{
     if (isIp00404HardshipIndicatorModified()) { 
        ip00404HardshipIndicator = refreshIp00404HardshipIndicator();
     }
   		return ip00404HardshipIndicator;
   }

  
	/**
	*  set variable ip00404HardshipIndicator
	*  Corresponding COBOL Variable is IP00404-HARDSHIP-INDICATOR
	*  @param value
	**/
   public void setIp00404HardshipIndicator(char[] value) {
      ip00404HardshipIndicator = checkIp00404HardshipIndicatorConstraints(value);
      serializeIp00404HardshipIndicator(ip00404HardshipIndicator);
   } 

     /**
	 * 	Update Ip00404HardshipIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404HardshipIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404HardshipIndicator,ip00404HardshipIndicator.length);
   	
   }
   
   public void setIp00404HardshipIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404HardshipIndicator,ip00404HardshipIndicator.length);
   	
   }
   
     /**
	 * 	Update Ip00404HardshipIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404HardshipIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404HardshipIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404HardshipIndicator with another Field
	 *	@param value
	 */
   public void setIp00404HardshipIndicator(Field source) {
       replace(source,0,source.length(),beginIp00404HardshipIndicator,IP_00404_HARDSHIP_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404HardshipIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404HardshipIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404HardshipIndicator,IP_00404_HARDSHIP_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404HardshipIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404HardshipIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404HardshipIndicator+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404HardshipEffective
	 *	@return ip00404HardshipEffective
	 */
	public long getIp00404HardshipEffective() throws CFException {
       if (isIp00404HardshipEffectiveModified()) { 
           ip00404HardshipEffective = refreshIp00404HardshipEffective();
        }
   		return ip00404HardshipEffective;
	}
	

	
	   
	/**
	 * 	Update Ip00404HardshipEffective with the passed value
	 *  Corresponding COBOL Variable is IP00404-HARDSHIP-EFFECTIVE
	 *	@param number
	 */
	public void setIp00404HardshipEffective(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00404HardshipEffective = checkIp00404HardshipEffectiveMaxLimit(number); 
		serializeIp00404HardshipEffective(ip00404HardshipEffective);
	}
	

	/**
	 * 	Update Ip00404HardshipEffective with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00404HardshipEffective(char[] value) throws CFException {
		 ip00404HardshipEffective = serializeIp00404HardshipEffective(value);
	}
	/**
	 * 	Update Ip00404HardshipEffective with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00404HardshipEffectiveString(char[] value) throws CFException {
		 setIp00404HardshipEffective(value);
	}
	/**
	 *	Returns the value of ip00404HardshipExpiration
	 *	@return ip00404HardshipExpiration
	 */
	public long getIp00404HardshipExpiration() throws CFException {
       if (isIp00404HardshipExpirationModified()) { 
           ip00404HardshipExpiration = refreshIp00404HardshipExpiration();
        }
   		return ip00404HardshipExpiration;
	}
	

	
	   
	/**
	 * 	Update Ip00404HardshipExpiration with the passed value
	 *  Corresponding COBOL Variable is IP00404-HARDSHIP-EXPIRATION
	 *	@param number
	 */
	public void setIp00404HardshipExpiration(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00404HardshipExpiration = checkIp00404HardshipExpirationMaxLimit(number); 
		serializeIp00404HardshipExpiration(ip00404HardshipExpiration);
	}
	

	/**
	 * 	Update Ip00404HardshipExpiration with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00404HardshipExpiration(char[] value) throws CFException {
		 ip00404HardshipExpiration = serializeIp00404HardshipExpiration(value);
	}
	/**
	 * 	Update Ip00404HardshipExpiration with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00404HardshipExpirationString(char[] value) throws CFException {
		 setIp00404HardshipExpiration(value);
	}
	/**
	 *	Returns the value of ip00404GamingCountrySw
	 *	@return ip00404GamingCountrySw
	 */
   public char[] getIp00404GamingCountrySw() throws CFException{
     if (isIp00404GamingCountrySwModified()) { 
        ip00404GamingCountrySw = refreshIp00404GamingCountrySw();
     }
   		return ip00404GamingCountrySw;
   }

  
	/**
	*  set variable ip00404GamingCountrySw
	*  Corresponding COBOL Variable is IP00404-GAMING-COUNTRY-SW
	*  @param value
	**/
   public void setIp00404GamingCountrySw(char[] value) {
      ip00404GamingCountrySw = checkIp00404GamingCountrySwConstraints(value);
      serializeIp00404GamingCountrySw(ip00404GamingCountrySw);
   } 

     /**
	 * 	Update Ip00404GamingCountrySw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404GamingCountrySw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404GamingCountrySw,ip00404GamingCountrySw.length);
   	
   }
   
   public void setIp00404GamingCountrySw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404GamingCountrySw,ip00404GamingCountrySw.length);
   	
   }
   
     /**
	 * 	Update Ip00404GamingCountrySw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404GamingCountrySw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404GamingCountrySw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404GamingCountrySw with another Field
	 *	@param value
	 */
   public void setIp00404GamingCountrySw(Field source) {
       replace(source,0,source.length(),beginIp00404GamingCountrySw,IP_00404_GAMING_COUNTRY_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404GamingCountrySw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404GamingCountrySw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404GamingCountrySw,IP_00404_GAMING_COUNTRY_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404GamingCountrySw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404GamingCountrySw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404GamingCountrySw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404CrossBorderInd
	 *	@return ip00404CrossBorderInd
	 */
	public int getIp00404CrossBorderInd() throws CFException {
       if (isIp00404CrossBorderIndModified()) { 
           ip00404CrossBorderInd = refreshIp00404CrossBorderInd();
        }
   		return ip00404CrossBorderInd;
	}
	

	
	   
	/**
	 * 	Update Ip00404CrossBorderInd with the passed value
	 *  Corresponding COBOL Variable is IP00404-CROSS-BORDER-IND
	 *	@param number
	 */
	public void setIp00404CrossBorderInd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00404CrossBorderInd = checkIp00404CrossBorderIndMaxLimit(number); 
		serializeIp00404CrossBorderInd(ip00404CrossBorderInd);
	}
	

	public void setIp00404CrossBorderInd(long number) {
	    number = checkIp00404CrossBorderIndMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00404CrossBorderInd((int)number);
	}
	
	/**
	 * 	Update Ip00404CrossBorderInd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00404CrossBorderInd(char[] value) throws CFException {
		 ip00404CrossBorderInd = serializeIp00404CrossBorderInd(value);
	}
	/**
	 * 	Update Ip00404CrossBorderInd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00404CrossBorderIndString(char[] value) throws CFException {
		 setIp00404CrossBorderInd(value);
	}
	/**
	 *	Returns the value of ip00404RecPaymtCanSw
	 *	@return ip00404RecPaymtCanSw
	 */
   public char[] getIp00404RecPaymtCanSw() throws CFException{
     if (isIp00404RecPaymtCanSwModified()) { 
        ip00404RecPaymtCanSw = refreshIp00404RecPaymtCanSw();
     }
   		return ip00404RecPaymtCanSw;
   }

  
	/**
	*  set variable ip00404RecPaymtCanSw
	*  Corresponding COBOL Variable is IP00404-REC-PAYMT-CAN-SW
	*  @param value
	**/
   public void setIp00404RecPaymtCanSw(char[] value) {
      ip00404RecPaymtCanSw = checkIp00404RecPaymtCanSwConstraints(value);
      serializeIp00404RecPaymtCanSw(ip00404RecPaymtCanSw);
   } 

     /**
	 * 	Update Ip00404RecPaymtCanSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404RecPaymtCanSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404RecPaymtCanSw,ip00404RecPaymtCanSw.length);
   	
   }
   
   public void setIp00404RecPaymtCanSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404RecPaymtCanSw,ip00404RecPaymtCanSw.length);
   	
   }
   
     /**
	 * 	Update Ip00404RecPaymtCanSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404RecPaymtCanSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404RecPaymtCanSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404RecPaymtCanSw with another Field
	 *	@param value
	 */
   public void setIp00404RecPaymtCanSw(Field source) {
       replace(source,0,source.length(),beginIp00404RecPaymtCanSw,IP_00404_REC_PAYMT_CAN_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404RecPaymtCanSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404RecPaymtCanSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404RecPaymtCanSw,IP_00404_REC_PAYMT_CAN_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404RecPaymtCanSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404RecPaymtCanSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404RecPaymtCanSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404DomDbtParticipSw
	 *	@return ip00404DomDbtParticipSw
	 */
   public char[] getIp00404DomDbtParticipSw() throws CFException{
     if (isIp00404DomDbtParticipSwModified()) { 
        ip00404DomDbtParticipSw = refreshIp00404DomDbtParticipSw();
     }
   		return ip00404DomDbtParticipSw;
   }

  
	/**
	*  set variable ip00404DomDbtParticipSw
	*  Corresponding COBOL Variable is IP00404-DOM-DBT-PARTICIP-SW
	*  @param value
	**/
   public void setIp00404DomDbtParticipSw(char[] value) {
      ip00404DomDbtParticipSw = checkIp00404DomDbtParticipSwConstraints(value);
      serializeIp00404DomDbtParticipSw(ip00404DomDbtParticipSw);
   } 

     /**
	 * 	Update Ip00404DomDbtParticipSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404DomDbtParticipSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404DomDbtParticipSw,ip00404DomDbtParticipSw.length);
   	
   }
   
   public void setIp00404DomDbtParticipSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404DomDbtParticipSw,ip00404DomDbtParticipSw.length);
   	
   }
   
     /**
	 * 	Update Ip00404DomDbtParticipSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404DomDbtParticipSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404DomDbtParticipSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404DomDbtParticipSw with another Field
	 *	@param value
	 */
   public void setIp00404DomDbtParticipSw(Field source) {
       replace(source,0,source.length(),beginIp00404DomDbtParticipSw,IP_00404_DOM_DBT_PARTICIP_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404DomDbtParticipSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404DomDbtParticipSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404DomDbtParticipSw,IP_00404_DOM_DBT_PARTICIP_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404DomDbtParticipSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404DomDbtParticipSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404DomDbtParticipSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404GrpCode
	 *	@return ip00404GrpCode
	 */   
	 public Ip00404GrpCode getIp00404GrpCode() {
   	return ip00404GrpCode;
   }
   /**
	* 	Update Ip00404GrpCode with the passed value
	*   Corresponding COBOL Variable is IP00404-GRP-CODE
	*	@param value
	*/
   public void setIp00404GrpCode(char[] value) {
      ip00404GrpCode.setString(value); 
   }   
    
     /**
	 * 	Update Ip00404GrpCode 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00404GrpCode(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00404GrpCode.begin,ip00404GrpCode.length());
   }
   
     /**
	 * 	Update Ip00404GrpCode 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404GrpCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00404GrpCode.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00404GrpCode with another Field
	 *	@param value
	 */
   public void setIp00404GrpCode(Field source) {
   	replace(source,0,source.length(),ip00404GrpCode.begin,ip00404GrpCode.length());
   }  
   
     /**
	 * 	Update Ip00404GrpCode 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00404GrpCode(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00404GrpCode.begin,ip00404GrpCode.length());
   }
   
     /**
	 * 	Update Ip00404GrpCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404GrpCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00404GrpCode.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip00404IpcFraudCtlSw
	 *	@return ip00404IpcFraudCtlSw
	 */
   public char[] getIp00404IpcFraudCtlSw() throws CFException{
     if (isIp00404IpcFraudCtlSwModified()) { 
        ip00404IpcFraudCtlSw = refreshIp00404IpcFraudCtlSw();
     }
   		return ip00404IpcFraudCtlSw;
   }

  
	/**
	*  set variable ip00404IpcFraudCtlSw
	*  Corresponding COBOL Variable is IP00404-IPC-FRAUD-CTL-SW
	*  @param value
	**/
   public void setIp00404IpcFraudCtlSw(char[] value) {
      ip00404IpcFraudCtlSw = checkIp00404IpcFraudCtlSwConstraints(value);
      serializeIp00404IpcFraudCtlSw(ip00404IpcFraudCtlSw);
   } 

     /**
	 * 	Update Ip00404IpcFraudCtlSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404IpcFraudCtlSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404IpcFraudCtlSw,ip00404IpcFraudCtlSw.length);
   	
   }
   
   public void setIp00404IpcFraudCtlSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404IpcFraudCtlSw,ip00404IpcFraudCtlSw.length);
   	
   }
   
     /**
	 * 	Update Ip00404IpcFraudCtlSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404IpcFraudCtlSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404IpcFraudCtlSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404IpcFraudCtlSw with another Field
	 *	@param value
	 */
   public void setIp00404IpcFraudCtlSw(Field source) {
       replace(source,0,source.length(),beginIp00404IpcFraudCtlSw,IP_00404_IPC_FRAUD_CTL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404IpcFraudCtlSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404IpcFraudCtlSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404IpcFraudCtlSw,IP_00404_IPC_FRAUD_CTL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404IpcFraudCtlSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404IpcFraudCtlSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404IpcFraudCtlSw+targetIndex,targetLen);
    
   }
	char[] ip00404IpcFraudY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404IpcFraudY88()
	 *	@return  Returns true if isIp00404IpcFraudY88() is "Y"
	 */
   public boolean isIp00404IpcFraudY88() throws CFException {
      return (  compareChars( getIp00404IpcFraudCtlSw() , ip00404IpcFraudY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404IpcFraudY88True() {  			
    	setIp00404IpcFraudCtlSw( ip00404IpcFraudY8888Value);
   	}
	char[] ip00404IpcFraudN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404IpcFraudN88()
	 *	@return  Returns true if isIp00404IpcFraudN88() is "N"
	 */
   public boolean isIp00404IpcFraudN88() throws CFException {
      return (  compareChars( getIp00404IpcFraudCtlSw() , ip00404IpcFraudN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404IpcFraudN88True() {  			
    	setIp00404IpcFraudCtlSw( ip00404IpcFraudN8888Value);
   	}
	/**
	 *	Returns the value of ip00404IccrParticipInd
	 *	@return ip00404IccrParticipInd
	 */
   public char[] getIp00404IccrParticipInd() throws CFException{
     if (isIp00404IccrParticipIndModified()) { 
        ip00404IccrParticipInd = refreshIp00404IccrParticipInd();
     }
   		return ip00404IccrParticipInd;
   }

  
	/**
	*  set variable ip00404IccrParticipInd
	*  Corresponding COBOL Variable is IP00404-ICCR-PARTICIP-IND
	*  @param value
	**/
   public void setIp00404IccrParticipInd(char[] value) {
      ip00404IccrParticipInd = checkIp00404IccrParticipIndConstraints(value);
      serializeIp00404IccrParticipInd(ip00404IccrParticipInd);
   } 

     /**
	 * 	Update Ip00404IccrParticipInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404IccrParticipInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404IccrParticipInd,ip00404IccrParticipInd.length);
   	
   }
   
   public void setIp00404IccrParticipInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404IccrParticipInd,ip00404IccrParticipInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404IccrParticipInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404IccrParticipInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404IccrParticipInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404IccrParticipInd with another Field
	 *	@param value
	 */
   public void setIp00404IccrParticipInd(Field source) {
       replace(source,0,source.length(),beginIp00404IccrParticipInd,IP_00404_ICCR_PARTICIP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404IccrParticipInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404IccrParticipInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404IccrParticipInd,IP_00404_ICCR_PARTICIP_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404IccrParticipInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404IccrParticipInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404IccrParticipInd+targetIndex,targetLen);
    
   }
	char[] ip00404ItIsIccr8888Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isIp00404ItIsIccr88()
	 *	@return  Returns true if isIp00404ItIsIccr88() is "I"
	 */
   public boolean isIp00404ItIsIccr88() throws CFException {
      return (  compareChars( getIp00404IccrParticipInd() , ip00404ItIsIccr8888Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setIp00404ItIsIccr88True() {  			
    	setIp00404IccrParticipInd( ip00404ItIsIccr8888Value);
   	}
	char[] ip00404ItIsCccr8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp00404ItIsCccr88()
	 *	@return  Returns true if isIp00404ItIsCccr88() is "C"
	 */
   public boolean isIp00404ItIsCccr88() throws CFException {
      return (  compareChars( getIp00404IccrParticipInd() , ip00404ItIsCccr8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp00404ItIsCccr88True() {  			
    	setIp00404IccrParticipInd( ip00404ItIsCccr8888Value);
   	}
	char[] ip00404ItIsCcm8888Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isIp00404ItIsCcm88()
	 *	@return  Returns true if isIp00404ItIsCcm88() is "E"
	 */
   public boolean isIp00404ItIsCcm88() throws CFException {
      return (  compareChars( getIp00404IccrParticipInd() , ip00404ItIsCcm8888Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setIp00404ItIsCcm88True() {  			
    	setIp00404IccrParticipInd( ip00404ItIsCcm8888Value);
   	}
	/**
	 *	Returns the value of ip00404RevCreditInd
	 *	@return ip00404RevCreditInd
	 */
   public char[] getIp00404RevCreditInd() throws CFException{
     if (isIp00404RevCreditIndModified()) { 
        ip00404RevCreditInd = refreshIp00404RevCreditInd();
     }
   		return ip00404RevCreditInd;
   }

  
	/**
	*  set variable ip00404RevCreditInd
	*  Corresponding COBOL Variable is IP00404-REV-CREDIT-IND
	*  @param value
	**/
   public void setIp00404RevCreditInd(char[] value) {
      ip00404RevCreditInd = checkIp00404RevCreditIndConstraints(value);
      serializeIp00404RevCreditInd(ip00404RevCreditInd);
   } 

     /**
	 * 	Update Ip00404RevCreditInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404RevCreditInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404RevCreditInd,ip00404RevCreditInd.length);
   	
   }
   
   public void setIp00404RevCreditInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404RevCreditInd,ip00404RevCreditInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404RevCreditInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404RevCreditInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404RevCreditInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404RevCreditInd with another Field
	 *	@param value
	 */
   public void setIp00404RevCreditInd(Field source) {
       replace(source,0,source.length(),beginIp00404RevCreditInd,IP_00404_REV_CREDIT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404RevCreditInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404RevCreditInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404RevCreditInd,IP_00404_REV_CREDIT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404RevCreditInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404RevCreditInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404RevCreditInd+targetIndex,targetLen);
    
   }
	char[] ip00404RevCrdIndY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404RevCrdIndY88()
	 *	@return  Returns true if isIp00404RevCrdIndY88() is "Y"
	 */
   public boolean isIp00404RevCrdIndY88() throws CFException {
      return (  compareChars( getIp00404RevCreditInd() , ip00404RevCrdIndY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404RevCrdIndY88True() {  			
    	setIp00404RevCreditInd( ip00404RevCrdIndY8888Value);
   	}
	char[] ip00404RevCrdIndN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404RevCrdIndN88()
	 *	@return  Returns true if isIp00404RevCrdIndN88() is "N"
	 */
   public boolean isIp00404RevCrdIndN88() throws CFException {
      return (  compareChars( getIp00404RevCreditInd() , ip00404RevCrdIndN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404RevCrdIndN88True() {  			
    	setIp00404RevCreditInd( ip00404RevCrdIndN8888Value);
   	}
	/**
	 *	Returns the value of ip00404ChgbkBkoutInd
	 *	@return ip00404ChgbkBkoutInd
	 */
   public char[] getIp00404ChgbkBkoutInd() throws CFException{
     if (isIp00404ChgbkBkoutIndModified()) { 
        ip00404ChgbkBkoutInd = refreshIp00404ChgbkBkoutInd();
     }
   		return ip00404ChgbkBkoutInd;
   }

  
	/**
	*  set variable ip00404ChgbkBkoutInd
	*  Corresponding COBOL Variable is IP00404-CHGBK-BKOUT-IND
	*  @param value
	**/
   public void setIp00404ChgbkBkoutInd(char[] value) {
      ip00404ChgbkBkoutInd = checkIp00404ChgbkBkoutIndConstraints(value);
      serializeIp00404ChgbkBkoutInd(ip00404ChgbkBkoutInd);
   } 

     /**
	 * 	Update Ip00404ChgbkBkoutInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404ChgbkBkoutInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404ChgbkBkoutInd,ip00404ChgbkBkoutInd.length);
   	
   }
   
   public void setIp00404ChgbkBkoutInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404ChgbkBkoutInd,ip00404ChgbkBkoutInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404ChgbkBkoutInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404ChgbkBkoutInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404ChgbkBkoutInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404ChgbkBkoutInd with another Field
	 *	@param value
	 */
   public void setIp00404ChgbkBkoutInd(Field source) {
       replace(source,0,source.length(),beginIp00404ChgbkBkoutInd,IP_00404_CHGBK_BKOUT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404ChgbkBkoutInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404ChgbkBkoutInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404ChgbkBkoutInd,IP_00404_CHGBK_BKOUT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404ChgbkBkoutInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404ChgbkBkoutInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404ChgbkBkoutInd+targetIndex,targetLen);
    
   }
	char[] ip00404ChgbkBkoutY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404ChgbkBkoutY88()
	 *	@return  Returns true if isIp00404ChgbkBkoutY88() is "Y"
	 */
   public boolean isIp00404ChgbkBkoutY88() throws CFException {
      return (  compareChars( getIp00404ChgbkBkoutInd() , ip00404ChgbkBkoutY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404ChgbkBkoutY88True() {  			
    	setIp00404ChgbkBkoutInd( ip00404ChgbkBkoutY8888Value);
   	}
	char[] ip00404ChgbkBkoutN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404ChgbkBkoutN88()
	 *	@return  Returns true if isIp00404ChgbkBkoutN88() is "N"
	 */
   public boolean isIp00404ChgbkBkoutN88() throws CFException {
      return (  compareChars( getIp00404ChgbkBkoutInd() , ip00404ChgbkBkoutN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404ChgbkBkoutN88True() {  			
    	setIp00404ChgbkBkoutInd( ip00404ChgbkBkoutN8888Value);
   	}
	/**
	 *	Returns the value of ip00404RtnTrnstNum
	 *	@return ip00404RtnTrnstNum
	 */
   public char[] getIp00404RtnTrnstNum() throws CFException{
     if (isIp00404RtnTrnstNumModified()) { 
        ip00404RtnTrnstNum = refreshIp00404RtnTrnstNum();
     }
   		return ip00404RtnTrnstNum;
   }

  
	/**
	*  set variable ip00404RtnTrnstNum
	*  Corresponding COBOL Variable is IP00404-RTN-TRNST-NUM
	*  @param value
	**/
   public void setIp00404RtnTrnstNum(char[] value) {
      ip00404RtnTrnstNum = checkIp00404RtnTrnstNumConstraints(value);
      serializeIp00404RtnTrnstNum(ip00404RtnTrnstNum);
   } 

     /**
	 * 	Update Ip00404RtnTrnstNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404RtnTrnstNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404RtnTrnstNum,ip00404RtnTrnstNum.length);
   	
   }
   
   public void setIp00404RtnTrnstNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404RtnTrnstNum,ip00404RtnTrnstNum.length);
   	
   }
   
     /**
	 * 	Update Ip00404RtnTrnstNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404RtnTrnstNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404RtnTrnstNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404RtnTrnstNum with another Field
	 *	@param value
	 */
   public void setIp00404RtnTrnstNum(Field source) {
       replace(source,0,source.length(),beginIp00404RtnTrnstNum,IP_00404_RTN_TRNST_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404RtnTrnstNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404RtnTrnstNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404RtnTrnstNum,IP_00404_RTN_TRNST_NUM_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404RtnTrnstNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404RtnTrnstNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404RtnTrnstNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404TrueIssuerIca
	 *	@return ip00404TrueIssuerIca
	 */
	public long getIp00404TrueIssuerIca() throws CFException {
       if (isIp00404TrueIssuerIcaModified()) { 
           ip00404TrueIssuerIca = refreshIp00404TrueIssuerIca();
        }
   		return ip00404TrueIssuerIca;
	}
	

	
	   
	/**
	 * 	Update Ip00404TrueIssuerIca with the passed value
	 *  Corresponding COBOL Variable is IP00404-TRUE-ISSUER-ICA
	 *	@param number
	 */
	public void setIp00404TrueIssuerIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00404TrueIssuerIca = checkIp00404TrueIssuerIcaMaxLimit(number); 
		serializeIp00404TrueIssuerIca(ip00404TrueIssuerIca);
	}
	

	/**
	 * 	Update Ip00404TrueIssuerIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00404TrueIssuerIca(char[] value) throws CFException {
		 ip00404TrueIssuerIca = serializeIp00404TrueIssuerIca(value);
	}
	/**
	 * 	Update Ip00404TrueIssuerIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00404TrueIssuerIcaString(char[] value) throws CFException {
		 setIp00404TrueIssuerIca(value);
	}
	/**
	 *	Returns the value of ip00404MerchantTaxIdSw
	 *	@return ip00404MerchantTaxIdSw
	 */
   public char[] getIp00404MerchantTaxIdSw() throws CFException{
     if (isIp00404MerchantTaxIdSwModified()) { 
        ip00404MerchantTaxIdSw = refreshIp00404MerchantTaxIdSw();
     }
   		return ip00404MerchantTaxIdSw;
   }

  
	/**
	*  set variable ip00404MerchantTaxIdSw
	*  Corresponding COBOL Variable is IP00404-MERCHANT-TAX-ID-SW
	*  @param value
	**/
   public void setIp00404MerchantTaxIdSw(char[] value) {
      ip00404MerchantTaxIdSw = checkIp00404MerchantTaxIdSwConstraints(value);
      serializeIp00404MerchantTaxIdSw(ip00404MerchantTaxIdSw);
   } 

     /**
	 * 	Update Ip00404MerchantTaxIdSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404MerchantTaxIdSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404MerchantTaxIdSw,ip00404MerchantTaxIdSw.length);
   	
   }
   
   public void setIp00404MerchantTaxIdSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404MerchantTaxIdSw,ip00404MerchantTaxIdSw.length);
   	
   }
   
     /**
	 * 	Update Ip00404MerchantTaxIdSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404MerchantTaxIdSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404MerchantTaxIdSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404MerchantTaxIdSw with another Field
	 *	@param value
	 */
   public void setIp00404MerchantTaxIdSw(Field source) {
       replace(source,0,source.length(),beginIp00404MerchantTaxIdSw,IP_00404_MERCHANT_TAX_ID_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404MerchantTaxIdSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404MerchantTaxIdSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404MerchantTaxIdSw,IP_00404_MERCHANT_TAX_ID_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404MerchantTaxIdSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404MerchantTaxIdSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404MerchantTaxIdSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404InstallServSw
	 *	@return ip00404InstallServSw
	 */
   public char[] getIp00404InstallServSw() throws CFException{
     if (isIp00404InstallServSwModified()) { 
        ip00404InstallServSw = refreshIp00404InstallServSw();
     }
   		return ip00404InstallServSw;
   }

  
	/**
	*  set variable ip00404InstallServSw
	*  Corresponding COBOL Variable is IP00404-INSTALL-SERV-SW
	*  @param value
	**/
   public void setIp00404InstallServSw(char[] value) {
      ip00404InstallServSw = checkIp00404InstallServSwConstraints(value);
      serializeIp00404InstallServSw(ip00404InstallServSw);
   } 

     /**
	 * 	Update Ip00404InstallServSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404InstallServSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404InstallServSw,ip00404InstallServSw.length);
   	
   }
   
   public void setIp00404InstallServSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404InstallServSw,ip00404InstallServSw.length);
   	
   }
   
     /**
	 * 	Update Ip00404InstallServSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404InstallServSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404InstallServSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404InstallServSw with another Field
	 *	@param value
	 */
   public void setIp00404InstallServSw(Field source) {
       replace(source,0,source.length(),beginIp00404InstallServSw,IP_00404_INSTALL_SERV_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404InstallServSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404InstallServSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404InstallServSw,IP_00404_INSTALL_SERV_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404InstallServSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404InstallServSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404InstallServSw+targetIndex,targetLen);
    
   }
	char[] ip00404InstallServSwY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404InstallServSwY88()
	 *	@return  Returns true if isIp00404InstallServSwY88() is "Y"
	 */
   public boolean isIp00404InstallServSwY88() throws CFException {
      return (  compareChars( getIp00404InstallServSw() , ip00404InstallServSwY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404InstallServSwY88True() {  			
    	setIp00404InstallServSw( ip00404InstallServSwY8888Value);
   	}
	char[] ip00404InstallServSwN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404InstallServSwN88()
	 *	@return  Returns true if isIp00404InstallServSwN88() is "N"
	 */
   public boolean isIp00404InstallServSwN88() throws CFException {
      return (  compareChars( getIp00404InstallServSw() , ip00404InstallServSwN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404InstallServSwN88True() {  			
    	setIp00404InstallServSw( ip00404InstallServSwN8888Value);
   	}
	/**
	 *	Returns the value of ip00404TokenServiceInd
	 *	@return ip00404TokenServiceInd
	 */
   public char[] getIp00404TokenServiceInd() throws CFException{
     if (isIp00404TokenServiceIndModified()) { 
        ip00404TokenServiceInd = refreshIp00404TokenServiceInd();
     }
   		return ip00404TokenServiceInd;
   }

  
	/**
	*  set variable ip00404TokenServiceInd
	*  Corresponding COBOL Variable is IP00404-TOKEN-SERVICE-IND
	*  @param value
	**/
   public void setIp00404TokenServiceInd(char[] value) {
      ip00404TokenServiceInd = checkIp00404TokenServiceIndConstraints(value);
      serializeIp00404TokenServiceInd(ip00404TokenServiceInd);
   } 

     /**
	 * 	Update Ip00404TokenServiceInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404TokenServiceInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404TokenServiceInd,ip00404TokenServiceInd.length);
   	
   }
   
   public void setIp00404TokenServiceInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404TokenServiceInd,ip00404TokenServiceInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404TokenServiceInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404TokenServiceInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404TokenServiceInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404TokenServiceInd with another Field
	 *	@param value
	 */
   public void setIp00404TokenServiceInd(Field source) {
       replace(source,0,source.length(),beginIp00404TokenServiceInd,IP_00404_TOKEN_SERVICE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404TokenServiceInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404TokenServiceInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404TokenServiceInd,IP_00404_TOKEN_SERVICE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404TokenServiceInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404TokenServiceInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404TokenServiceInd+targetIndex,targetLen);
    
   }
	char[] ip00404MdesToken8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp00404MdesToken88()
	 *	@return  Returns true if isIp00404MdesToken88() is "C"
	 */
   public boolean isIp00404MdesToken88() throws CFException {
      return (  compareChars( getIp00404TokenServiceInd() , ip00404MdesToken8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp00404MdesToken88True() {  			
    	setIp00404TokenServiceInd( ip00404MdesToken8888Value);
   	}
	char[] ip00404CofToken8888Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isIp00404CofToken88()
	 *	@return  Returns true if isIp00404CofToken88() is "O"
	 */
   public boolean isIp00404CofToken88() throws CFException {
      return (  compareChars( getIp00404TokenServiceInd() , ip00404CofToken8888Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setIp00404CofToken88True() {  			
    	setIp00404TokenServiceInd( ip00404CofToken8888Value);
   	}
	char[] ip00404DualToken8888Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isIp00404DualToken88()
	 *	@return  Returns true if isIp00404DualToken88() is "D"
	 */
   public boolean isIp00404DualToken88() throws CFException {
      return (  compareChars( getIp00404TokenServiceInd() , ip00404DualToken8888Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setIp00404DualToken88True() {  			
    	setIp00404TokenServiceInd( ip00404DualToken8888Value);
   	}
	char[] ip00404TspToken8888Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isIp00404TspToken88()
	 *	@return  Returns true if isIp00404TspToken88() is "T"
	 */
   public boolean isIp00404TspToken88() throws CFException {
      return (  compareChars( getIp00404TokenServiceInd() , ip00404TspToken8888Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setIp00404TspToken88True() {  			
    	setIp00404TokenServiceInd( ip00404TspToken8888Value);
   	}
	/**
	 *	Returns the value of ip00404GbsBillInd
	 *	@return ip00404GbsBillInd
	 */
   public char[] getIp00404GbsBillInd() throws CFException{
     if (isIp00404GbsBillIndModified()) { 
        ip00404GbsBillInd = refreshIp00404GbsBillInd();
     }
   		return ip00404GbsBillInd;
   }

  
	/**
	*  set variable ip00404GbsBillInd
	*  Corresponding COBOL Variable is IP00404-GBS-BILL-IND
	*  @param value
	**/
   public void setIp00404GbsBillInd(char[] value) {
      ip00404GbsBillInd = checkIp00404GbsBillIndConstraints(value);
      serializeIp00404GbsBillInd(ip00404GbsBillInd);
   } 

     /**
	 * 	Update Ip00404GbsBillInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404GbsBillInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404GbsBillInd,ip00404GbsBillInd.length);
   	
   }
   
   public void setIp00404GbsBillInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404GbsBillInd,ip00404GbsBillInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404GbsBillInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404GbsBillInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404GbsBillInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404GbsBillInd with another Field
	 *	@param value
	 */
   public void setIp00404GbsBillInd(Field source) {
       replace(source,0,source.length(),beginIp00404GbsBillInd,IP_00404_GBS_BILL_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404GbsBillInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404GbsBillInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404GbsBillInd,IP_00404_GBS_BILL_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404GbsBillInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404GbsBillInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404GbsBillInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404InstallAuthSw
	 *	@return ip00404InstallAuthSw
	 */
   public char[] getIp00404InstallAuthSw() throws CFException{
     if (isIp00404InstallAuthSwModified()) { 
        ip00404InstallAuthSw = refreshIp00404InstallAuthSw();
     }
   		return ip00404InstallAuthSw;
   }

  
	/**
	*  set variable ip00404InstallAuthSw
	*  Corresponding COBOL Variable is IP00404-INSTALL-AUTH-SW
	*  @param value
	**/
   public void setIp00404InstallAuthSw(char[] value) {
      ip00404InstallAuthSw = checkIp00404InstallAuthSwConstraints(value);
      serializeIp00404InstallAuthSw(ip00404InstallAuthSw);
   } 

     /**
	 * 	Update Ip00404InstallAuthSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404InstallAuthSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404InstallAuthSw,ip00404InstallAuthSw.length);
   	
   }
   
   public void setIp00404InstallAuthSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404InstallAuthSw,ip00404InstallAuthSw.length);
   	
   }
   
     /**
	 * 	Update Ip00404InstallAuthSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404InstallAuthSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404InstallAuthSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404InstallAuthSw with another Field
	 *	@param value
	 */
   public void setIp00404InstallAuthSw(Field source) {
       replace(source,0,source.length(),beginIp00404InstallAuthSw,IP_00404_INSTALL_AUTH_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404InstallAuthSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404InstallAuthSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404InstallAuthSw,IP_00404_INSTALL_AUTH_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404InstallAuthSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404InstallAuthSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404InstallAuthSw+targetIndex,targetLen);
    
   }
	char[] ip00404InstallAuthSwY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404InstallAuthSwY88()
	 *	@return  Returns true if isIp00404InstallAuthSwY88() is "Y"
	 */
   public boolean isIp00404InstallAuthSwY88() throws CFException {
      return (  compareChars( getIp00404InstallAuthSw() , ip00404InstallAuthSwY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404InstallAuthSwY88True() {  			
    	setIp00404InstallAuthSw( ip00404InstallAuthSwY8888Value);
   	}
	char[] ip00404InstallAuthSwN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404InstallAuthSwN88()
	 *	@return  Returns true if isIp00404InstallAuthSwN88() is "N"
	 */
   public boolean isIp00404InstallAuthSwN88() throws CFException {
      return (  compareChars( getIp00404InstallAuthSw() , ip00404InstallAuthSwN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404InstallAuthSwN88True() {  			
    	setIp00404InstallAuthSw( ip00404InstallAuthSwN8888Value);
   	}
	/**
	 *	Returns the value of ip00404SeqServiceInd
	 *	@return ip00404SeqServiceInd
	 */
   public char[] getIp00404SeqServiceInd() throws CFException{
     if (isIp00404SeqServiceIndModified()) { 
        ip00404SeqServiceInd = refreshIp00404SeqServiceInd();
     }
   		return ip00404SeqServiceInd;
   }

  
	/**
	*  set variable ip00404SeqServiceInd
	*  Corresponding COBOL Variable is IP00404-SEQ-SERVICE-IND
	*  @param value
	**/
   public void setIp00404SeqServiceInd(char[] value) {
      ip00404SeqServiceInd = checkIp00404SeqServiceIndConstraints(value);
      serializeIp00404SeqServiceInd(ip00404SeqServiceInd);
   } 

     /**
	 * 	Update Ip00404SeqServiceInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404SeqServiceInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404SeqServiceInd,ip00404SeqServiceInd.length);
   	
   }
   
   public void setIp00404SeqServiceInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404SeqServiceInd,ip00404SeqServiceInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404SeqServiceInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404SeqServiceInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404SeqServiceInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404SeqServiceInd with another Field
	 *	@param value
	 */
   public void setIp00404SeqServiceInd(Field source) {
       replace(source,0,source.length(),beginIp00404SeqServiceInd,IP_00404_SEQ_SERVICE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404SeqServiceInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404SeqServiceInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404SeqServiceInd,IP_00404_SEQ_SERVICE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404SeqServiceInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404SeqServiceInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404SeqServiceInd+targetIndex,targetLen);
    
   }
	char[] ip00404SeqOptIn8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404SeqOptIn88()
	 *	@return  Returns true if isIp00404SeqOptIn88() is "Y"
	 */
   public boolean isIp00404SeqOptIn88() throws CFException {
      return (  compareChars( getIp00404SeqServiceInd() , ip00404SeqOptIn8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404SeqOptIn88True() {  			
    	setIp00404SeqServiceInd( ip00404SeqOptIn8888Value);
   	}
	char[] ip00404SeqOptOut8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404SeqOptOut88()
	 *	@return  Returns true if isIp00404SeqOptOut88() is "N"
	 */
   public boolean isIp00404SeqOptOut88() throws CFException {
      return (  compareChars( getIp00404SeqServiceInd() , ip00404SeqOptOut8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404SeqOptOut88True() {  			
    	setIp00404SeqServiceInd( ip00404SeqOptOut8888Value);
   	}
	/**
	 *	Returns the value of ip00404CbfmParticipInd
	 *	@return ip00404CbfmParticipInd
	 */
   public char[] getIp00404CbfmParticipInd() throws CFException{
     if (isIp00404CbfmParticipIndModified()) { 
        ip00404CbfmParticipInd = refreshIp00404CbfmParticipInd();
     }
   		return ip00404CbfmParticipInd;
   }

  
	/**
	*  set variable ip00404CbfmParticipInd
	*  Corresponding COBOL Variable is IP00404-CBFM-PARTICIP-IND
	*  @param value
	**/
   public void setIp00404CbfmParticipInd(char[] value) {
      ip00404CbfmParticipInd = checkIp00404CbfmParticipIndConstraints(value);
      serializeIp00404CbfmParticipInd(ip00404CbfmParticipInd);
   } 

     /**
	 * 	Update Ip00404CbfmParticipInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404CbfmParticipInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404CbfmParticipInd,ip00404CbfmParticipInd.length);
   	
   }
   
   public void setIp00404CbfmParticipInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CbfmParticipInd,ip00404CbfmParticipInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404CbfmParticipInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404CbfmParticipInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CbfmParticipInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404CbfmParticipInd with another Field
	 *	@param value
	 */
   public void setIp00404CbfmParticipInd(Field source) {
       replace(source,0,source.length(),beginIp00404CbfmParticipInd,IP_00404_CBFM_PARTICIP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404CbfmParticipInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404CbfmParticipInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404CbfmParticipInd,IP_00404_CBFM_PARTICIP_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404CbfmParticipInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404CbfmParticipInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CbfmParticipInd+targetIndex,targetLen);
    
   }
	char[] ip00404CbfmPartY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404CbfmPartY88()
	 *	@return  Returns true if isIp00404CbfmPartY88() is "Y"
	 */
   public boolean isIp00404CbfmPartY88() throws CFException {
      return (  compareChars( getIp00404CbfmParticipInd() , ip00404CbfmPartY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404CbfmPartY88True() {  			
    	setIp00404CbfmParticipInd( ip00404CbfmPartY8888Value);
   	}
	char[] ip00404CbfmPartN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404CbfmPartN88()
	 *	@return  Returns true if isIp00404CbfmPartN88() is "N"
	 */
   public boolean isIp00404CbfmPartN88() throws CFException {
      return (  compareChars( getIp00404CbfmParticipInd() , ip00404CbfmPartN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404CbfmPartN88True() {  			
    	setIp00404CbfmParticipInd( ip00404CbfmPartN8888Value);
   	}
	/**
	 *	Returns the value of ip00404CbcmParticipInd
	 *	@return ip00404CbcmParticipInd
	 */
   public char[] getIp00404CbcmParticipInd() throws CFException{
     if (isIp00404CbcmParticipIndModified()) { 
        ip00404CbcmParticipInd = refreshIp00404CbcmParticipInd();
     }
   		return ip00404CbcmParticipInd;
   }

  
	/**
	*  set variable ip00404CbcmParticipInd
	*  Corresponding COBOL Variable is IP00404-CBCM-PARTICIP-IND
	*  @param value
	**/
   public void setIp00404CbcmParticipInd(char[] value) {
      ip00404CbcmParticipInd = checkIp00404CbcmParticipIndConstraints(value);
      serializeIp00404CbcmParticipInd(ip00404CbcmParticipInd);
   } 

     /**
	 * 	Update Ip00404CbcmParticipInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404CbcmParticipInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404CbcmParticipInd,ip00404CbcmParticipInd.length);
   	
   }
   
   public void setIp00404CbcmParticipInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CbcmParticipInd,ip00404CbcmParticipInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404CbcmParticipInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404CbcmParticipInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CbcmParticipInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404CbcmParticipInd with another Field
	 *	@param value
	 */
   public void setIp00404CbcmParticipInd(Field source) {
       replace(source,0,source.length(),beginIp00404CbcmParticipInd,IP_00404_CBCM_PARTICIP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404CbcmParticipInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404CbcmParticipInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404CbcmParticipInd,IP_00404_CBCM_PARTICIP_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404CbcmParticipInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404CbcmParticipInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CbcmParticipInd+targetIndex,targetLen);
    
   }
	char[] ip00404CbcmPartY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404CbcmPartY88()
	 *	@return  Returns true if isIp00404CbcmPartY88() is "Y"
	 */
   public boolean isIp00404CbcmPartY88() throws CFException {
      return (  compareChars( getIp00404CbcmParticipInd() , ip00404CbcmPartY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404CbcmPartY88True() {  			
    	setIp00404CbcmParticipInd( ip00404CbcmPartY8888Value);
   	}
	char[] ip00404CbcmPartN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404CbcmPartN88()
	 *	@return  Returns true if isIp00404CbcmPartN88() is "N"
	 */
   public boolean isIp00404CbcmPartN88() throws CFException {
      return (  compareChars( getIp00404CbcmParticipInd() , ip00404CbcmPartN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404CbcmPartN88True() {  			
    	setIp00404CbcmParticipInd( ip00404CbcmPartN8888Value);
   	}
	/**
	 *	Returns the value of ip00404CbfmDccSw
	 *	@return ip00404CbfmDccSw
	 */
   public char[] getIp00404CbfmDccSw() throws CFException{
     if (isIp00404CbfmDccSwModified()) { 
        ip00404CbfmDccSw = refreshIp00404CbfmDccSw();
     }
   		return ip00404CbfmDccSw;
   }

  
	/**
	*  set variable ip00404CbfmDccSw
	*  Corresponding COBOL Variable is IP00404-CBFM-DCC-SW
	*  @param value
	**/
   public void setIp00404CbfmDccSw(char[] value) {
      ip00404CbfmDccSw = checkIp00404CbfmDccSwConstraints(value);
      serializeIp00404CbfmDccSw(ip00404CbfmDccSw);
   } 

     /**
	 * 	Update Ip00404CbfmDccSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404CbfmDccSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404CbfmDccSw,ip00404CbfmDccSw.length);
   	
   }
   
   public void setIp00404CbfmDccSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CbfmDccSw,ip00404CbfmDccSw.length);
   	
   }
   
     /**
	 * 	Update Ip00404CbfmDccSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404CbfmDccSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CbfmDccSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404CbfmDccSw with another Field
	 *	@param value
	 */
   public void setIp00404CbfmDccSw(Field source) {
       replace(source,0,source.length(),beginIp00404CbfmDccSw,IP_00404_CBFM_DCC_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404CbfmDccSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404CbfmDccSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404CbfmDccSw,IP_00404_CBFM_DCC_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404CbfmDccSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404CbfmDccSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CbfmDccSw+targetIndex,targetLen);
    
   }
	char[] ip00404CbfmDccSwY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404CbfmDccSwY88()
	 *	@return  Returns true if isIp00404CbfmDccSwY88() is "Y"
	 */
   public boolean isIp00404CbfmDccSwY88() throws CFException {
      return (  compareChars( getIp00404CbfmDccSw() , ip00404CbfmDccSwY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404CbfmDccSwY88True() {  			
    	setIp00404CbfmDccSw( ip00404CbfmDccSwY8888Value);
   	}
	char[] ip00404CbfmDccSwN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404CbfmDccSwN88()
	 *	@return  Returns true if isIp00404CbfmDccSwN88() is "N"
	 */
   public boolean isIp00404CbfmDccSwN88() throws CFException {
      return (  compareChars( getIp00404CbfmDccSw() , ip00404CbfmDccSwN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404CbfmDccSwN88True() {  			
    	setIp00404CbfmDccSw( ip00404CbfmDccSwN8888Value);
   	}
	char[] ip00404CbfmDccSwD8888Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isIp00404CbfmDccSwD88()
	 *	@return  Returns true if isIp00404CbfmDccSwD88() is "D"
	 */
   public boolean isIp00404CbfmDccSwD88() throws CFException {
      return (  compareChars( getIp00404CbfmDccSw() , ip00404CbfmDccSwD8888Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setIp00404CbfmDccSwD88True() {  			
    	setIp00404CbfmDccSw( ip00404CbfmDccSwD8888Value);
   	}
	/**
	 *	Returns the value of ip00404InstApiGcmsSw
	 *	@return ip00404InstApiGcmsSw
	 */
   public char[] getIp00404InstApiGcmsSw() throws CFException{
     if (isIp00404InstApiGcmsSwModified()) { 
        ip00404InstApiGcmsSw = refreshIp00404InstApiGcmsSw();
     }
   		return ip00404InstApiGcmsSw;
   }

  
	/**
	*  set variable ip00404InstApiGcmsSw
	*  Corresponding COBOL Variable is IP00404-INST-API-GCMS-SW
	*  @param value
	**/
   public void setIp00404InstApiGcmsSw(char[] value) {
      ip00404InstApiGcmsSw = checkIp00404InstApiGcmsSwConstraints(value);
      serializeIp00404InstApiGcmsSw(ip00404InstApiGcmsSw);
   } 

     /**
	 * 	Update Ip00404InstApiGcmsSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404InstApiGcmsSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404InstApiGcmsSw,ip00404InstApiGcmsSw.length);
   	
   }
   
   public void setIp00404InstApiGcmsSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404InstApiGcmsSw,ip00404InstApiGcmsSw.length);
   	
   }
   
     /**
	 * 	Update Ip00404InstApiGcmsSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404InstApiGcmsSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404InstApiGcmsSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404InstApiGcmsSw with another Field
	 *	@param value
	 */
   public void setIp00404InstApiGcmsSw(Field source) {
       replace(source,0,source.length(),beginIp00404InstApiGcmsSw,IP_00404_INST_API_GCMS_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404InstApiGcmsSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404InstApiGcmsSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404InstApiGcmsSw,IP_00404_INST_API_GCMS_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404InstApiGcmsSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404InstApiGcmsSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404InstApiGcmsSw+targetIndex,targetLen);
    
   }
	char[] ip00404InstApiGcmsSwY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404InstApiGcmsSwY88()
	 *	@return  Returns true if isIp00404InstApiGcmsSwY88() is "Y"
	 */
   public boolean isIp00404InstApiGcmsSwY88() throws CFException {
      return (  compareChars( getIp00404InstApiGcmsSw() , ip00404InstApiGcmsSwY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404InstApiGcmsSwY88True() {  			
    	setIp00404InstApiGcmsSw( ip00404InstApiGcmsSwY8888Value);
   	}
	char[] ip00404InstApiGcmsSwN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404InstApiGcmsSwN88()
	 *	@return  Returns true if isIp00404InstApiGcmsSwN88() is "N"
	 */
   public boolean isIp00404InstApiGcmsSwN88() throws CFException {
      return (  compareChars( getIp00404InstApiGcmsSw() , ip00404InstApiGcmsSwN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404InstApiGcmsSwN88True() {  			
    	setIp00404InstApiGcmsSw( ip00404InstApiGcmsSwN8888Value);
   	}
	/**
	 *	Returns the value of ip00404InsEnabApiInd
	 *	@return ip00404InsEnabApiInd
	 */
   public char[] getIp00404InsEnabApiInd() throws CFException{
     if (isIp00404InsEnabApiIndModified()) { 
        ip00404InsEnabApiInd = refreshIp00404InsEnabApiInd();
     }
   		return ip00404InsEnabApiInd;
   }

  
	/**
	*  set variable ip00404InsEnabApiInd
	*  Corresponding COBOL Variable is IP00404-INS-ENAB-API-IND
	*  @param value
	**/
   public void setIp00404InsEnabApiInd(char[] value) {
      ip00404InsEnabApiInd = checkIp00404InsEnabApiIndConstraints(value);
      serializeIp00404InsEnabApiInd(ip00404InsEnabApiInd);
   } 

     /**
	 * 	Update Ip00404InsEnabApiInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404InsEnabApiInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404InsEnabApiInd,ip00404InsEnabApiInd.length);
   	
   }
   
   public void setIp00404InsEnabApiInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404InsEnabApiInd,ip00404InsEnabApiInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404InsEnabApiInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404InsEnabApiInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404InsEnabApiInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404InsEnabApiInd with another Field
	 *	@param value
	 */
   public void setIp00404InsEnabApiInd(Field source) {
       replace(source,0,source.length(),beginIp00404InsEnabApiInd,IP_00404_INS_ENAB_API_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404InsEnabApiInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404InsEnabApiInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404InsEnabApiInd,IP_00404_INS_ENAB_API_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404InsEnabApiInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404InsEnabApiInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404InsEnabApiInd+targetIndex,targetLen);
    
   }
	char[] ip00404InsEnabApiIndY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404InsEnabApiIndY88()
	 *	@return  Returns true if isIp00404InsEnabApiIndY88() is "Y"
	 */
   public boolean isIp00404InsEnabApiIndY88() throws CFException {
      return (  compareChars( getIp00404InsEnabApiInd() , ip00404InsEnabApiIndY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404InsEnabApiIndY88True() {  			
    	setIp00404InsEnabApiInd( ip00404InsEnabApiIndY8888Value);
   	}
	char[] ip00404InsEnabApiIndN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404InsEnabApiIndN88()
	 *	@return  Returns true if isIp00404InsEnabApiIndN88() is "N"
	 */
   public boolean isIp00404InsEnabApiIndN88() throws CFException {
      return (  compareChars( getIp00404InsEnabApiInd() , ip00404InsEnabApiIndN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404InsEnabApiIndN88True() {  			
    	setIp00404InsEnabApiInd( ip00404InsEnabApiIndN8888Value);
   	}
	/**
	 *	Returns the value of ip00404InstApiUiSw
	 *	@return ip00404InstApiUiSw
	 */
   public char[] getIp00404InstApiUiSw() throws CFException{
     if (isIp00404InstApiUiSwModified()) { 
        ip00404InstApiUiSw = refreshIp00404InstApiUiSw();
     }
   		return ip00404InstApiUiSw;
   }

  
	/**
	*  set variable ip00404InstApiUiSw
	*  Corresponding COBOL Variable is IP00404-INST-API-UI-SW
	*  @param value
	**/
   public void setIp00404InstApiUiSw(char[] value) {
      ip00404InstApiUiSw = checkIp00404InstApiUiSwConstraints(value);
      serializeIp00404InstApiUiSw(ip00404InstApiUiSw);
   } 

     /**
	 * 	Update Ip00404InstApiUiSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404InstApiUiSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404InstApiUiSw,ip00404InstApiUiSw.length);
   	
   }
   
   public void setIp00404InstApiUiSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404InstApiUiSw,ip00404InstApiUiSw.length);
   	
   }
   
     /**
	 * 	Update Ip00404InstApiUiSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404InstApiUiSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404InstApiUiSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404InstApiUiSw with another Field
	 *	@param value
	 */
   public void setIp00404InstApiUiSw(Field source) {
       replace(source,0,source.length(),beginIp00404InstApiUiSw,IP_00404_INST_API_UI_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404InstApiUiSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404InstApiUiSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404InstApiUiSw,IP_00404_INST_API_UI_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404InstApiUiSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404InstApiUiSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404InstApiUiSw+targetIndex,targetLen);
    
   }
	char[] ip00404InstApiUiSwY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404InstApiUiSwY88()
	 *	@return  Returns true if isIp00404InstApiUiSwY88() is "Y"
	 */
   public boolean isIp00404InstApiUiSwY88() throws CFException {
      return (  compareChars( getIp00404InstApiUiSw() , ip00404InstApiUiSwY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404InstApiUiSwY88True() {  			
    	setIp00404InstApiUiSw( ip00404InstApiUiSwY8888Value);
   	}
	char[] ip00404InstApiUiSwN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404InstApiUiSwN88()
	 *	@return  Returns true if isIp00404InstApiUiSwN88() is "N"
	 */
   public boolean isIp00404InstApiUiSwN88() throws CFException {
      return (  compareChars( getIp00404InstApiUiSw() , ip00404InstApiUiSwN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404InstApiUiSwN88True() {  			
    	setIp00404InstApiUiSw( ip00404InstApiUiSwN8888Value);
   	}
	/**
	 *	Returns the value of ip00404Filler
	 *	@return ip00404Filler
	 */
   public char[] getIp00404Filler() throws CFException{
     if (isIp00404FillerModified()) { 
        ip00404Filler = refreshIp00404Filler();
     }
   		return ip00404Filler;
   }

  
	/**
	*  set variable ip00404Filler
	*  Corresponding COBOL Variable is IP00404-FILLER
	*  @param value
	**/
   public void setIp00404Filler(char[] value) {
      ip00404Filler = checkIp00404FillerConstraints(value);
      serializeIp00404Filler(ip00404Filler);
   } 

     /**
	 * 	Update Ip00404Filler 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404Filler(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404Filler,ip00404Filler.length);
   	
   }
   
   public void setIp00404Filler(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404Filler,ip00404Filler.length);
   	
   }
   
     /**
	 * 	Update Ip00404Filler 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404Filler(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404Filler+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404Filler with another Field
	 *	@param value
	 */
   public void setIp00404Filler(Field source) {
       replace(source,0,source.length(),beginIp00404Filler,IP_00404_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404Filler 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404Filler(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404Filler,IP_00404_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404Filler 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404Filler(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404Filler+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404OboServiceInd
	 *	@return ip00404OboServiceInd
	 */
   public char[] getIp00404OboServiceInd() throws CFException{
     if (isIp00404OboServiceIndModified()) { 
        ip00404OboServiceInd = refreshIp00404OboServiceInd();
     }
   		return ip00404OboServiceInd;
   }

  
	/**
	*  set variable ip00404OboServiceInd
	*  Corresponding COBOL Variable is IP00404-OBO-SERVICE-IND
	*  @param value
	**/
   public void setIp00404OboServiceInd(char[] value) {
      ip00404OboServiceInd = checkIp00404OboServiceIndConstraints(value);
      serializeIp00404OboServiceInd(ip00404OboServiceInd);
   } 

     /**
	 * 	Update Ip00404OboServiceInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404OboServiceInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404OboServiceInd,ip00404OboServiceInd.length);
   	
   }
   
   public void setIp00404OboServiceInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404OboServiceInd,ip00404OboServiceInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404OboServiceInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404OboServiceInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404OboServiceInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404OboServiceInd with another Field
	 *	@param value
	 */
   public void setIp00404OboServiceInd(Field source) {
       replace(source,0,source.length(),beginIp00404OboServiceInd,IP_00404_OBO_SERVICE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404OboServiceInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404OboServiceInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404OboServiceInd,IP_00404_OBO_SERVICE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404OboServiceInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404OboServiceInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404OboServiceInd+targetIndex,targetLen);
    
   }
	char[] ip00404OboY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404OboY88()
	 *	@return  Returns true if isIp00404OboY88() is "Y"
	 */
   public boolean isIp00404OboY88() throws CFException {
      return (  compareChars( getIp00404OboServiceInd() , ip00404OboY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404OboY88True() {  			
    	setIp00404OboServiceInd( ip00404OboY8888Value);
   	}
	char[] ip00404OboN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404OboN88()
	 *	@return  Returns true if isIp00404OboN88() is "N"
	 */
   public boolean isIp00404OboN88() throws CFException {
      return (  compareChars( getIp00404OboServiceInd() , ip00404OboN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404OboN88True() {  			
    	setIp00404OboServiceInd( ip00404OboN8888Value);
   	}
	/**
	 *	Returns the value of ip00404MultCurrSw
	 *	@return ip00404MultCurrSw
	 */
   public char[] getIp00404MultCurrSw() throws CFException{
     if (isIp00404MultCurrSwModified()) { 
        ip00404MultCurrSw = refreshIp00404MultCurrSw();
     }
   		return ip00404MultCurrSw;
   }

  
	/**
	*  set variable ip00404MultCurrSw
	*  Corresponding COBOL Variable is IP00404-MULT-CURR-SW
	*  @param value
	**/
   public void setIp00404MultCurrSw(char[] value) {
      ip00404MultCurrSw = checkIp00404MultCurrSwConstraints(value);
      serializeIp00404MultCurrSw(ip00404MultCurrSw);
   } 

     /**
	 * 	Update Ip00404MultCurrSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404MultCurrSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404MultCurrSw,ip00404MultCurrSw.length);
   	
   }
   
   public void setIp00404MultCurrSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404MultCurrSw,ip00404MultCurrSw.length);
   	
   }
   
     /**
	 * 	Update Ip00404MultCurrSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404MultCurrSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404MultCurrSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404MultCurrSw with another Field
	 *	@param value
	 */
   public void setIp00404MultCurrSw(Field source) {
       replace(source,0,source.length(),beginIp00404MultCurrSw,IP_00404_MULT_CURR_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404MultCurrSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404MultCurrSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404MultCurrSw,IP_00404_MULT_CURR_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404MultCurrSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404MultCurrSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404MultCurrSw+targetIndex,targetLen);
    
   }
	char[] ip00404MultCurrSwY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404MultCurrSwY88()
	 *	@return  Returns true if isIp00404MultCurrSwY88() is "Y"
	 */
   public boolean isIp00404MultCurrSwY88() throws CFException {
      return (  compareChars( getIp00404MultCurrSw() , ip00404MultCurrSwY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404MultCurrSwY88True() {  			
    	setIp00404MultCurrSw( ip00404MultCurrSwY8888Value);
   	}
	char[] ip00404MultCurrSwN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404MultCurrSwN88()
	 *	@return  Returns true if isIp00404MultCurrSwN88() is "N"
	 */
   public boolean isIp00404MultCurrSwN88() throws CFException {
      return (  compareChars( getIp00404MultCurrSw() , ip00404MultCurrSwN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404MultCurrSwN88True() {  			
    	setIp00404MultCurrSw( ip00404MultCurrSwN8888Value);
   	}
	/**
	 *	Returns the value of ip00404AnonIndEffDate
	 *	@return ip00404AnonIndEffDate
	 */
	public long getIp00404AnonIndEffDate() throws CFException {
       if (isIp00404AnonIndEffDateModified()) { 
           ip00404AnonIndEffDate = refreshIp00404AnonIndEffDate();
        }
   		return ip00404AnonIndEffDate;
	}
	

	
	   
	/**
	 * 	Update Ip00404AnonIndEffDate with the passed value
	 *  Corresponding COBOL Variable is IP00404-ANON-IND-EFF-DATE
	 *	@param number
	 */
	public void setIp00404AnonIndEffDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00404AnonIndEffDate = checkIp00404AnonIndEffDateMaxLimit(number); 
		serializeIp00404AnonIndEffDate(ip00404AnonIndEffDate);
	}
	

	/**
	 * 	Update Ip00404AnonIndEffDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00404AnonIndEffDate(char[] value) throws CFException {
		 ip00404AnonIndEffDate = serializeIp00404AnonIndEffDate(value);
	}
	/**
	 * 	Update Ip00404AnonIndEffDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00404AnonIndEffDateString(char[] value) throws CFException {
		 setIp00404AnonIndEffDate(value);
	}
	/**
	 *	Returns the value of ip00404CbfmEcbRateParInd
	 *	@return ip00404CbfmEcbRateParInd
	 */
   public char[] getIp00404CbfmEcbRateParInd() throws CFException{
     if (isIp00404CbfmEcbRateParIndModified()) { 
        ip00404CbfmEcbRateParInd = refreshIp00404CbfmEcbRateParInd();
     }
   		return ip00404CbfmEcbRateParInd;
   }

  
	/**
	*  set variable ip00404CbfmEcbRateParInd
	*  Corresponding COBOL Variable is IP00404-CBFM-ECB-RATE-PAR-IND
	*  @param value
	**/
   public void setIp00404CbfmEcbRateParInd(char[] value) {
      ip00404CbfmEcbRateParInd = checkIp00404CbfmEcbRateParIndConstraints(value);
      serializeIp00404CbfmEcbRateParInd(ip00404CbfmEcbRateParInd);
   } 

     /**
	 * 	Update Ip00404CbfmEcbRateParInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404CbfmEcbRateParInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404CbfmEcbRateParInd,ip00404CbfmEcbRateParInd.length);
   	
   }
   
   public void setIp00404CbfmEcbRateParInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CbfmEcbRateParInd,ip00404CbfmEcbRateParInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404CbfmEcbRateParInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404CbfmEcbRateParInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CbfmEcbRateParInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404CbfmEcbRateParInd with another Field
	 *	@param value
	 */
   public void setIp00404CbfmEcbRateParInd(Field source) {
       replace(source,0,source.length(),beginIp00404CbfmEcbRateParInd,IP_00404_CBFM_ECB_RATE_PAR_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404CbfmEcbRateParInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404CbfmEcbRateParInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404CbfmEcbRateParInd,IP_00404_CBFM_ECB_RATE_PAR_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404CbfmEcbRateParInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404CbfmEcbRateParInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404CbfmEcbRateParInd+targetIndex,targetLen);
    
   }
	char[] ip00404EcbPartY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404EcbPartY88()
	 *	@return  Returns true if isIp00404EcbPartY88() is "Y"
	 */
   public boolean isIp00404EcbPartY88() throws CFException {
      return (  compareChars( getIp00404CbfmEcbRateParInd() , ip00404EcbPartY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404EcbPartY88True() {  			
    	setIp00404CbfmEcbRateParInd( ip00404EcbPartY8888Value);
   	}
	char[] ip00404EcbPartN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404EcbPartN88()
	 *	@return  Returns true if isIp00404EcbPartN88() is "N"
	 */
   public boolean isIp00404EcbPartN88() throws CFException {
      return (  compareChars( getIp00404CbfmEcbRateParInd() , ip00404EcbPartN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404EcbPartN88True() {  			
    	setIp00404CbfmEcbRateParInd( ip00404EcbPartN8888Value);
   	}
	/**
	 *	Returns the value of ip00404AlmXbOptOutInd
	 *	@return ip00404AlmXbOptOutInd
	 */
   public char[] getIp00404AlmXbOptOutInd() throws CFException{
     if (isIp00404AlmXbOptOutIndModified()) { 
        ip00404AlmXbOptOutInd = refreshIp00404AlmXbOptOutInd();
     }
   		return ip00404AlmXbOptOutInd;
   }

  
	/**
	*  set variable ip00404AlmXbOptOutInd
	*  Corresponding COBOL Variable is IP00404-ALM-XB-OPT-OUT-IND
	*  @param value
	**/
   public void setIp00404AlmXbOptOutInd(char[] value) {
      ip00404AlmXbOptOutInd = checkIp00404AlmXbOptOutIndConstraints(value);
      serializeIp00404AlmXbOptOutInd(ip00404AlmXbOptOutInd);
   } 

     /**
	 * 	Update Ip00404AlmXbOptOutInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404AlmXbOptOutInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404AlmXbOptOutInd,ip00404AlmXbOptOutInd.length);
   	
   }
   
   public void setIp00404AlmXbOptOutInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404AlmXbOptOutInd,ip00404AlmXbOptOutInd.length);
   	
   }
   
     /**
	 * 	Update Ip00404AlmXbOptOutInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404AlmXbOptOutInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404AlmXbOptOutInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404AlmXbOptOutInd with another Field
	 *	@param value
	 */
   public void setIp00404AlmXbOptOutInd(Field source) {
       replace(source,0,source.length(),beginIp00404AlmXbOptOutInd,IP_00404_ALM_XB_OPT_OUT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404AlmXbOptOutInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404AlmXbOptOutInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404AlmXbOptOutInd,IP_00404_ALM_XB_OPT_OUT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404AlmXbOptOutInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404AlmXbOptOutInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404AlmXbOptOutInd+targetIndex,targetLen);
    
   }
	char[] ip00404AlmXbOptOutY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404AlmXbOptOutY88()
	 *	@return  Returns true if isIp00404AlmXbOptOutY88() is "Y"
	 */
   public boolean isIp00404AlmXbOptOutY88() throws CFException {
      return (  compareChars( getIp00404AlmXbOptOutInd() , ip00404AlmXbOptOutY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404AlmXbOptOutY88True() {  			
    	setIp00404AlmXbOptOutInd( ip00404AlmXbOptOutY8888Value);
   	}
	char[] ip00404AlmXbOptOutN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404AlmXbOptOutN88()
	 *	@return  Returns true if isIp00404AlmXbOptOutN88() is "N"
	 */
   public boolean isIp00404AlmXbOptOutN88() throws CFException {
      return (  compareChars( getIp00404AlmXbOptOutInd() , ip00404AlmXbOptOutN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404AlmXbOptOutN88True() {  			
    	setIp00404AlmXbOptOutInd( ip00404AlmXbOptOutN8888Value);
   	}
	/**
	 *	Returns the value of ip00404JpnNonmdesTknrngSw
	 *	@return ip00404JpnNonmdesTknrngSw
	 */
   public char[] getIp00404JpnNonmdesTknrngSw() throws CFException{
     if (isIp00404JpnNonmdesTknrngSwModified()) { 
        ip00404JpnNonmdesTknrngSw = refreshIp00404JpnNonmdesTknrngSw();
     }
   		return ip00404JpnNonmdesTknrngSw;
   }

  
	/**
	*  set variable ip00404JpnNonmdesTknrngSw
	*  Corresponding COBOL Variable is IP00404-JPN-NONMDES-TKNRNG-SW
	*  @param value
	**/
   public void setIp00404JpnNonmdesTknrngSw(char[] value) {
      ip00404JpnNonmdesTknrngSw = checkIp00404JpnNonmdesTknrngSwConstraints(value);
      serializeIp00404JpnNonmdesTknrngSw(ip00404JpnNonmdesTknrngSw);
   } 

     /**
	 * 	Update Ip00404JpnNonmdesTknrngSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404JpnNonmdesTknrngSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404JpnNonmdesTknrngSw,ip00404JpnNonmdesTknrngSw.length);
   	
   }
   
   public void setIp00404JpnNonmdesTknrngSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404JpnNonmdesTknrngSw,ip00404JpnNonmdesTknrngSw.length);
   	
   }
   
     /**
	 * 	Update Ip00404JpnNonmdesTknrngSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404JpnNonmdesTknrngSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404JpnNonmdesTknrngSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404JpnNonmdesTknrngSw with another Field
	 *	@param value
	 */
   public void setIp00404JpnNonmdesTknrngSw(Field source) {
       replace(source,0,source.length(),beginIp00404JpnNonmdesTknrngSw,IP_00404_JPN_NONMDES_TKNRNG_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404JpnNonmdesTknrngSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404JpnNonmdesTknrngSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404JpnNonmdesTknrngSw,IP_00404_JPN_NONMDES_TKNRNG_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404JpnNonmdesTknrngSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404JpnNonmdesTknrngSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404JpnNonmdesTknrngSw+targetIndex,targetLen);
    
   }
	char[] ip00404JpnNonmdesRngY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00404JpnNonmdesRngY88()
	 *	@return  Returns true if isIp00404JpnNonmdesRngY88() is "Y"
	 */
   public boolean isIp00404JpnNonmdesRngY88() throws CFException {
      return (  compareChars( getIp00404JpnNonmdesTknrngSw() , ip00404JpnNonmdesRngY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00404JpnNonmdesRngY88True() {  			
    	setIp00404JpnNonmdesTknrngSw( ip00404JpnNonmdesRngY8888Value);
   	}
	char[] ip00404JpnNonmdesRngN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00404JpnNonmdesRngN88()
	 *	@return  Returns true if isIp00404JpnNonmdesRngN88() is "N"
	 */
   public boolean isIp00404JpnNonmdesRngN88() throws CFException {
      return (  compareChars( getIp00404JpnNonmdesTknrngSw() , ip00404JpnNonmdesRngN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00404JpnNonmdesRngN88True() {  			
    	setIp00404JpnNonmdesTknrngSw( ip00404JpnNonmdesRngN8888Value);
   	}

	
	
	
	/**
	 * 	initializes Ip00404MpePeRecDataCs
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00404ProductType(CONSTANTS.SPACE);
                     setIp00404Endpoint(0);
         setIp00404Country(CONSTANTS.SPACE_3);
                     setIp00404CountryNum(0);
          ip00404RegionSubreg.initialize();
     
         setIp00404ProductClass(CONSTANTS.SPACE_3);
         setIp00404TranRoutingInd(CONSTANTS.SPACE);
         setIp00404PrsProdReassgnSw(CONSTANTS.SPACE);
         setIp00404ProdReassignmentSw(CONSTANTS.SPACE);
         setIp00404OptInFlag(CONSTANTS.SPACE);
         setIp00404LicensedProdId(CONSTANTS.SPACE_3);
         setIp00404VirtFundPanInd(CONSTANTS.SPACE);
         setIp00404AcctCatgPartSw(CONSTANTS.SPACE);
                     setIp00404AcctCatgActvnDate(0);
          ip00404CardHldrBlngCur.initialize();
     
         setIp00404ChipConversionSw(CONSTANTS.SPACE);
          ip00404FloorExpiryDate.initialize();
     
         setIp00404CoBrandSw(CONSTANTS.SPACE);
         setIp00404SpendControlRcnSw(CONSTANTS.SPACE);
         setIp00404MerchCleanServPart(CONSTANTS.SPACE_3);
                     setIp00404MerchCleanActvDate(0);
         setIp00404PaypassEnabledInd(CONSTANTS.SPACE);
         setIp00404RateTypeIndicator(CONSTANTS.SPACE);
         setIp00404RoutePsnIndicator(CONSTANTS.SPACE);
         setIp00404CbwpIndicator(CONSTANTS.SPACE);
         setIp00404FlexParticipInd(CONSTANTS.SPACE);
         setIp00404RepwrRldInd(CONSTANTS.SPACE);
         setIp00404MoneySendInd(CONSTANTS.SPACE);
         setIp00404RegulatedRateIndSw(CONSTANTS.SPACE);
         setIp00404CashAccessSw(CONSTANTS.SPACE);
                     setIp00404PersonPresentInd(0);
         setIp00404CrossBdrException(CONSTANTS.SPACE);
         setIp00404IssTargetMarketInd(CONSTANTS.SPACE);
         setIp00404PostDateServSw(CONSTANTS.SPACE);
         setIp00404MealVoucherInd(CONSTANTS.SPACE);
         setIp00404NonRldblPrpdSw(CONSTANTS.SPACE_2);
         setIp00404FasterFundsInd(CONSTANTS.SPACE);
         setIp00404AnonPrepaidInd(CONSTANTS.SPACE);
         setIp00404DccStatusInd(CONSTANTS.SPACE);
         setIp00404PayByAcctInd(CONSTANTS.SPACE);
         setIp00404IssGamParticipSw(CONSTANTS.SPACE);
         setIp00404MemberFiller(CONSTANTS.SPACE_12);
         setIp00404ChbConvExclId(CONSTANTS.SPACE);
                     setIp00404ChbConvExclExpire(0);
         setIp00404HardshipIndicator(CONSTANTS.SPACE);
                     setIp00404HardshipEffective(0);
                     setIp00404HardshipExpiration(0);
         setIp00404GamingCountrySw(CONSTANTS.SPACE);
                     setIp00404CrossBorderInd(0);
         setIp00404RecPaymtCanSw(CONSTANTS.SPACE);
         setIp00404DomDbtParticipSw(CONSTANTS.SPACE);
          ip00404GrpCode.initialize();
     
         setIp00404IpcFraudCtlSw(CONSTANTS.SPACE);
         setIp00404IccrParticipInd(CONSTANTS.SPACE);
         setIp00404RevCreditInd(CONSTANTS.SPACE);
         setIp00404ChgbkBkoutInd(CONSTANTS.SPACE);
         setIp00404RtnTrnstNum(CONSTANTS.SPACE_10);
                     setIp00404TrueIssuerIca(0);
         setIp00404MerchantTaxIdSw(CONSTANTS.SPACE);
         setIp00404InstallServSw(CONSTANTS.SPACE);
         setIp00404TokenServiceInd(CONSTANTS.SPACE);
         setIp00404GbsBillInd(CONSTANTS.SPACE);
         setIp00404InstallAuthSw(CONSTANTS.SPACE);
         setIp00404SeqServiceInd(CONSTANTS.SPACE);
         setIp00404CbfmParticipInd(CONSTANTS.SPACE);
         setIp00404CbcmParticipInd(CONSTANTS.SPACE);
         setIp00404CbfmDccSw(CONSTANTS.SPACE);
         setIp00404InstApiGcmsSw(CONSTANTS.SPACE);
         setIp00404InsEnabApiInd(CONSTANTS.SPACE);
         setIp00404InstApiUiSw(CONSTANTS.SPACE);
         setIp00404Filler(CONSTANTS.SPACE);
         setIp00404OboServiceInd(CONSTANTS.SPACE);
         setIp00404MultCurrSw(CONSTANTS.SPACE);
                     setIp00404AnonIndEffDate(0);
         setIp00404CbfmEcbRateParInd(CONSTANTS.SPACE);
         setIp00404AlmXbOptOutInd(CONSTANTS.SPACE);
         setIp00404JpnNonmdesTknrngSw(CONSTANTS.SPACE);
   }

		public static int getIp00404MpePeRecDataCsFieldLength() {
			return IP_00404_MPE_PE_REC_DATA_CS_LENGTH;
		}

}
  
