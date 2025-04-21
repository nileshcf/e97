package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040TableDataFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip0040TableDataFields extends Ip0040TableDataFieldsSerialized { 
   

						private char[] ip0040AccRangeH = Field.fillLowValue(19);

						private char[] ip0040Ab = Field.fillLowValue(3);

								private int ip0040PriorityCode;

								private long ip0040PrfxIca;

						private char[] ip0040ProductType = Field.fillLowValue(1);

								private long ip0040Endpoint;

						private char[] ip0040Country = Field.fillLowValue(3);

								private int ip0040CountryNum;
				private Ip0040RegionSubreg ip0040RegionSubreg = new Ip0040RegionSubreg();

						private char[] ip0040ProductClass = Field.fillLowValue(3);

						private char[] ip0040TranRoutingInd = Field.fillLowValue(1);

						private char[] ip0040PrsProdReassgnSw = Field.fillLowValue(1);

						private char[] ip0040ProdReassignmentSw = Field.fillLowValue(1);

						private char[] ip0040OptInFlag = Field.fillLowValue(1);

						private char[] ip0040LicensedProdId = Field.fillLowValue(3);

						private char[] ip0040VirtFundPanInd = Field.fillLowValue(1);

						private char[] ip0040AcctCatgPartSw = Field.fillLowValue(1);

								private long ip0040AcctCatgActvnDate;
				private Ip0040CardHldrBlngCur ip0040CardHldrBlngCur = new Ip0040CardHldrBlngCur();

						private char[] ip0040ChipConversionSw = Field.fillLowValue(1);
				private Ip0040FloorExpiryDate ip0040FloorExpiryDate = new Ip0040FloorExpiryDate();

						private char[] ip0040CoBrandSw = Field.fillLowValue(1);

						private char[] ip0040SpendControlRcnSw = Field.fillLowValue(1);

						private char[] ip0040MerchCleanServPart = Field.fillLowValue(3);

								private long ip0040MerchCleanActvDate;

						private char[] ip0040PaypassEnabledInd = Field.fillLowValue(1);

						private char[] ip0040RateTypeIndicator = Field.fillLowValue(1);

						private char[] ip0040RoutePsnIndicator = Field.fillLowValue(1);

						private char[] ip0040CbwpIndicator = Field.fillLowValue(1);

						private char[] ip0040FlexParticipInd = Field.fillLowValue(1);

						private char[] ip0040RepwrRldInd = Field.fillLowValue(1);

						private char[] ip0040MoneySendInd = Field.fillLowValue(1);

						private char[] ip0040RegulatedRateIndSw = Field.fillLowValue(1);

						private char[] ip0040CashAccessSw = Field.fillLowValue(1);

								private int ip0040PersonPresentInd;

						private char[] ip0040CrossBdrException = Field.fillLowValue(1);

						private char[] ip0040IssTargetMarketInd = Field.fillLowValue(1);

						private char[] ip0040PostDateServSw = Field.fillLowValue(1);

						private char[] ip0040MealVoucherInd = Field.fillLowValue(1);

						private char[] ip0040NonRldblPrpdSw = Field.fillLowValue(2);

						private char[] ip0040FasterFundsInd = Field.fillLowValue(1);

						private char[] ip0040AnonPrepaidInd = Field.fillLowValue(1);

						private char[] ip0040DccStatusInd = Field.fillLowValue(1);

						private char[] ip0040MemberFiller = Field.fillLowValue(14);
	
	/**
	* Constructor for Ip0040TableDataFields
	**/
    public Ip0040TableDataFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0040TableDataFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040TableDataFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip0040RegionSubreg.setParent(this,getStartOffset() + 49);
	       			ip0040CardHldrBlngCur.setParent(this,getStartOffset() + 68);
	       			ip0040FloorExpiryDate.setParent(this,getStartOffset() + 101);
    } 

	/**
	 *	Returns the value of ip0040AccRangeH
	 *	@return ip0040AccRangeH
	 */
   public char[] getIp0040AccRangeH() throws CFException{
     if (isIp0040AccRangeHModified()) { 
        ip0040AccRangeH = refreshIp0040AccRangeH();
     }
   		return ip0040AccRangeH;
   }

  
	/**
	*  set variable ip0040AccRangeH
	*  Corresponding COBOL Variable is IP0040-ACC-RANGE-H
	*  @param value
	**/
   public void setIp0040AccRangeH(char[] value) {
      ip0040AccRangeH = checkIp0040AccRangeHConstraints(value);
      serializeIp0040AccRangeH(ip0040AccRangeH);
   } 

     /**
	 * 	Update Ip0040AccRangeH 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040AccRangeH(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040AccRangeH,ip0040AccRangeH.length);
   	
   }
   
   public void setIp0040AccRangeH(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040AccRangeH,ip0040AccRangeH.length);
   	
   }
   
     /**
	 * 	Update Ip0040AccRangeH 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040AccRangeH(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040AccRangeH+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040AccRangeH with another Field
	 *	@param value
	 */
   public void setIp0040AccRangeH(Field source) {
       replace(source,0,source.length(),beginIp0040AccRangeH,IP_0040_ACC_RANGE_H_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040AccRangeH 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040AccRangeH(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040AccRangeH,IP_0040_ACC_RANGE_H_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040AccRangeH 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040AccRangeH(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040AccRangeH+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040Ab
	 *	@return ip0040Ab
	 */
   public char[] getIp0040Ab() throws CFException{
     if (isIp0040AbModified()) { 
        ip0040Ab = refreshIp0040Ab();
     }
   		return ip0040Ab;
   }

  
	/**
	*  set variable ip0040Ab
	*  Corresponding COBOL Variable is IP0040-AB
	*  @param value
	**/
   public void setIp0040Ab(char[] value) {
      ip0040Ab = checkIp0040AbConstraints(value);
      serializeIp0040Ab(ip0040Ab);
   } 

     /**
	 * 	Update Ip0040Ab 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040Ab(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040Ab,ip0040Ab.length);
   	
   }
   
   public void setIp0040Ab(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040Ab,ip0040Ab.length);
   	
   }
   
     /**
	 * 	Update Ip0040Ab 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040Ab(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040Ab+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040Ab with another Field
	 *	@param value
	 */
   public void setIp0040Ab(Field source) {
       replace(source,0,source.length(),beginIp0040Ab,IP_0040_AB_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040Ab 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040Ab(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040Ab,IP_0040_AB_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040Ab 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040Ab(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040Ab+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040PriorityCode
	 *	@return ip0040PriorityCode
	 */
	public int getIp0040PriorityCode() throws CFException {
       if (isIp0040PriorityCodeModified()) { 
           ip0040PriorityCode = refreshIp0040PriorityCode();
        }
   		return ip0040PriorityCode;
	}
	

	
	   
	/**
	 * 	Update Ip0040PriorityCode with the passed value
	 *  Corresponding COBOL Variable is IP0040-PRIORITY-CODE
	 *	@param number
	 */
	public void setIp0040PriorityCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040PriorityCode = checkIp0040PriorityCodeMaxLimit(number); 
		serializeIp0040PriorityCode(ip0040PriorityCode);
	}
	

	public void setIp0040PriorityCode(long number) {
	    number = checkIp0040PriorityCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0040PriorityCode((int)number);
	}
	
	/**
	 * 	Update Ip0040PriorityCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040PriorityCode(char[] value) throws CFException {
		 ip0040PriorityCode = serializeIp0040PriorityCode(value);
	}
	/**
	 * 	Update Ip0040PriorityCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040PriorityCodeString(char[] value) throws CFException {
		 setIp0040PriorityCode(value);
	}
	/**
	 *	Returns the value of ip0040PrfxIca
	 *	@return ip0040PrfxIca
	 */
	public long getIp0040PrfxIca() throws CFException {
       if (isIp0040PrfxIcaModified()) { 
           ip0040PrfxIca = refreshIp0040PrfxIca();
        }
   		return ip0040PrfxIca;
	}
	

	
	   
	/**
	 * 	Update Ip0040PrfxIca with the passed value
	 *  Corresponding COBOL Variable is IP0040-PRFX-ICA
	 *	@param number
	 */
	public void setIp0040PrfxIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040PrfxIca = checkIp0040PrfxIcaMaxLimit(number); 
		serializeIp0040PrfxIca(ip0040PrfxIca);
	}
	

	/**
	 * 	Update Ip0040PrfxIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040PrfxIca(char[] value) throws CFException {
		 ip0040PrfxIca = serializeIp0040PrfxIca(value);
	}
	/**
	 * 	Update Ip0040PrfxIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040PrfxIcaString(char[] value) throws CFException {
		 setIp0040PrfxIca(value);
	}
	/**
	 *	Returns the value of ip0040ProductType
	 *	@return ip0040ProductType
	 */
   public char[] getIp0040ProductType() throws CFException{
     if (isIp0040ProductTypeModified()) { 
        ip0040ProductType = refreshIp0040ProductType();
     }
   		return ip0040ProductType;
   }

  
	/**
	*  set variable ip0040ProductType
	*  Corresponding COBOL Variable is IP0040-PRODUCT-TYPE
	*  @param value
	**/
   public void setIp0040ProductType(char[] value) {
      ip0040ProductType = checkIp0040ProductTypeConstraints(value);
      serializeIp0040ProductType(ip0040ProductType);
   } 

     /**
	 * 	Update Ip0040ProductType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040ProductType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040ProductType,ip0040ProductType.length);
   	
   }
   
   public void setIp0040ProductType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ProductType,ip0040ProductType.length);
   	
   }
   
     /**
	 * 	Update Ip0040ProductType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040ProductType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ProductType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040ProductType with another Field
	 *	@param value
	 */
   public void setIp0040ProductType(Field source) {
       replace(source,0,source.length(),beginIp0040ProductType,IP_0040_PRODUCT_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040ProductType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040ProductType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040ProductType,IP_0040_PRODUCT_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040ProductType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040ProductType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ProductType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040Endpoint
	 *	@return ip0040Endpoint
	 */
	public long getIp0040Endpoint() throws CFException {
       if (isIp0040EndpointModified()) { 
           ip0040Endpoint = refreshIp0040Endpoint();
        }
   		return ip0040Endpoint;
	}
	

	
	   
	/**
	 * 	Update Ip0040Endpoint with the passed value
	 *  Corresponding COBOL Variable is IP0040-ENDPOINT
	 *	@param number
	 */
	public void setIp0040Endpoint(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040Endpoint = checkIp0040EndpointMaxLimit(number); 
		serializeIp0040Endpoint(ip0040Endpoint);
	}
	

	/**
	 * 	Update Ip0040Endpoint with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040Endpoint(char[] value) throws CFException {
		 ip0040Endpoint = serializeIp0040Endpoint(value);
	}
	/**
	 * 	Update Ip0040Endpoint with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040EndpointString(char[] value) throws CFException {
		 setIp0040Endpoint(value);
	}
	/**
	 *	Returns the value of ip0040Country
	 *	@return ip0040Country
	 */
   public char[] getIp0040Country() throws CFException{
     if (isIp0040CountryModified()) { 
        ip0040Country = refreshIp0040Country();
     }
   		return ip0040Country;
   }

  
	/**
	*  set variable ip0040Country
	*  Corresponding COBOL Variable is IP0040-COUNTRY
	*  @param value
	**/
   public void setIp0040Country(char[] value) {
      ip0040Country = checkIp0040CountryConstraints(value);
      serializeIp0040Country(ip0040Country);
   } 

     /**
	 * 	Update Ip0040Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040Country(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040Country,ip0040Country.length);
   	
   }
   
   public void setIp0040Country(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040Country,ip0040Country.length);
   	
   }
   
     /**
	 * 	Update Ip0040Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040Country(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040Country+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040Country with another Field
	 *	@param value
	 */
   public void setIp0040Country(Field source) {
       replace(source,0,source.length(),beginIp0040Country,IP_0040_COUNTRY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040Country(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040Country,IP_0040_COUNTRY_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040Country(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040Country+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040CountryNum
	 *	@return ip0040CountryNum
	 */
	public int getIp0040CountryNum() throws CFException {
       if (isIp0040CountryNumModified()) { 
           ip0040CountryNum = refreshIp0040CountryNum();
        }
   		return ip0040CountryNum;
	}
	

	
	   
	/**
	 * 	Update Ip0040CountryNum with the passed value
	 *  Corresponding COBOL Variable is IP0040-COUNTRY-NUM
	 *	@param number
	 */
	public void setIp0040CountryNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040CountryNum = checkIp0040CountryNumMaxLimit(number); 
		serializeIp0040CountryNum(ip0040CountryNum);
	}
	

	public void setIp0040CountryNum(long number) {
	    number = checkIp0040CountryNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0040CountryNum((int)number);
	}
	
	/**
	 * 	Update Ip0040CountryNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040CountryNum(char[] value) throws CFException {
		 ip0040CountryNum = serializeIp0040CountryNum(value);
	}
	/**
	 * 	Update Ip0040CountryNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040CountryNumString(char[] value) throws CFException {
		 setIp0040CountryNum(value);
	}
	/**
	 *	Returns the value of ip0040RegionSubreg
	 *	@return ip0040RegionSubreg
	 */   
	 public Ip0040RegionSubreg getIp0040RegionSubreg() {
   	return ip0040RegionSubreg;
   }
   /**
	* 	Update Ip0040RegionSubreg with the passed value
	*   Corresponding COBOL Variable is IP0040-REGION-SUBREG
	*	@param value
	*/
   public void setIp0040RegionSubreg(char[] value) {
      ip0040RegionSubreg.setString(value); 
   }   
    
     /**
	 * 	Update Ip0040RegionSubreg 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0040RegionSubreg(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040RegionSubreg.begin,ip0040RegionSubreg.length());
   }
   
     /**
	 * 	Update Ip0040RegionSubreg 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040RegionSubreg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040RegionSubreg.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0040RegionSubreg with another Field
	 *	@param value
	 */
   public void setIp0040RegionSubreg(Field source) {
   	replace(source,0,source.length(),ip0040RegionSubreg.begin,ip0040RegionSubreg.length());
   }  
   
     /**
	 * 	Update Ip0040RegionSubreg 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0040RegionSubreg(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040RegionSubreg.begin,ip0040RegionSubreg.length());
   }
   
     /**
	 * 	Update Ip0040RegionSubreg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040RegionSubreg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040RegionSubreg.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip0040ProductClass
	 *	@return ip0040ProductClass
	 */
   public char[] getIp0040ProductClass() throws CFException{
     if (isIp0040ProductClassModified()) { 
        ip0040ProductClass = refreshIp0040ProductClass();
     }
   		return ip0040ProductClass;
   }

  
	/**
	*  set variable ip0040ProductClass
	*  Corresponding COBOL Variable is IP0040-PRODUCT-CLASS
	*  @param value
	**/
   public void setIp0040ProductClass(char[] value) {
      ip0040ProductClass = checkIp0040ProductClassConstraints(value);
      serializeIp0040ProductClass(ip0040ProductClass);
   } 

     /**
	 * 	Update Ip0040ProductClass 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040ProductClass(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040ProductClass,ip0040ProductClass.length);
   	
   }
   
   public void setIp0040ProductClass(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ProductClass,ip0040ProductClass.length);
   	
   }
   
     /**
	 * 	Update Ip0040ProductClass 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040ProductClass(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ProductClass+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040ProductClass with another Field
	 *	@param value
	 */
   public void setIp0040ProductClass(Field source) {
       replace(source,0,source.length(),beginIp0040ProductClass,IP_0040_PRODUCT_CLASS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040ProductClass 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040ProductClass(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040ProductClass,IP_0040_PRODUCT_CLASS_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040ProductClass 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040ProductClass(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ProductClass+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040TranRoutingInd
	 *	@return ip0040TranRoutingInd
	 */
   public char[] getIp0040TranRoutingInd() throws CFException{
     if (isIp0040TranRoutingIndModified()) { 
        ip0040TranRoutingInd = refreshIp0040TranRoutingInd();
     }
   		return ip0040TranRoutingInd;
   }

  
	/**
	*  set variable ip0040TranRoutingInd
	*  Corresponding COBOL Variable is IP0040-TRAN-ROUTING-IND
	*  @param value
	**/
   public void setIp0040TranRoutingInd(char[] value) {
      ip0040TranRoutingInd = checkIp0040TranRoutingIndConstraints(value);
      serializeIp0040TranRoutingInd(ip0040TranRoutingInd);
   } 

     /**
	 * 	Update Ip0040TranRoutingInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040TranRoutingInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040TranRoutingInd,ip0040TranRoutingInd.length);
   	
   }
   
   public void setIp0040TranRoutingInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040TranRoutingInd,ip0040TranRoutingInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040TranRoutingInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040TranRoutingInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040TranRoutingInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040TranRoutingInd with another Field
	 *	@param value
	 */
   public void setIp0040TranRoutingInd(Field source) {
       replace(source,0,source.length(),beginIp0040TranRoutingInd,IP_0040_TRAN_ROUTING_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040TranRoutingInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040TranRoutingInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040TranRoutingInd,IP_0040_TRAN_ROUTING_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040TranRoutingInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040TranRoutingInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040TranRoutingInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040PrsProdReassgnSw
	 *	@return ip0040PrsProdReassgnSw
	 */
   public char[] getIp0040PrsProdReassgnSw() throws CFException{
     if (isIp0040PrsProdReassgnSwModified()) { 
        ip0040PrsProdReassgnSw = refreshIp0040PrsProdReassgnSw();
     }
   		return ip0040PrsProdReassgnSw;
   }

  
	/**
	*  set variable ip0040PrsProdReassgnSw
	*  Corresponding COBOL Variable is IP0040-PRS-PROD-REASSGN-SW
	*  @param value
	**/
   public void setIp0040PrsProdReassgnSw(char[] value) {
      ip0040PrsProdReassgnSw = checkIp0040PrsProdReassgnSwConstraints(value);
      serializeIp0040PrsProdReassgnSw(ip0040PrsProdReassgnSw);
   } 

     /**
	 * 	Update Ip0040PrsProdReassgnSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040PrsProdReassgnSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040PrsProdReassgnSw,ip0040PrsProdReassgnSw.length);
   	
   }
   
   public void setIp0040PrsProdReassgnSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040PrsProdReassgnSw,ip0040PrsProdReassgnSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040PrsProdReassgnSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040PrsProdReassgnSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040PrsProdReassgnSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040PrsProdReassgnSw with another Field
	 *	@param value
	 */
   public void setIp0040PrsProdReassgnSw(Field source) {
       replace(source,0,source.length(),beginIp0040PrsProdReassgnSw,IP_0040_PRS_PROD_REASSGN_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040PrsProdReassgnSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040PrsProdReassgnSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040PrsProdReassgnSw,IP_0040_PRS_PROD_REASSGN_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040PrsProdReassgnSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040PrsProdReassgnSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040PrsProdReassgnSw+targetIndex,targetLen);
    
   }
	char[] ip0040PrsPdReasgn8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040PrsPdReasgn88()
	 *	@return  Returns true if isIp0040PrsPdReasgn88() is "Y"
	 */
   public boolean isIp0040PrsPdReasgn88() throws CFException {
      return (  compareChars( getIp0040PrsProdReassgnSw() , ip0040PrsPdReasgn8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040PrsPdReasgn88True() {  			
    	setIp0040PrsProdReassgnSw( ip0040PrsPdReasgn8888Value);
   	}
	char[] ip0040PrsPdNotReasgn8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040PrsPdNotReasgn88()
	 *	@return  Returns true if isIp0040PrsPdNotReasgn88() is "N"
	 */
   public boolean isIp0040PrsPdNotReasgn88() throws CFException {
      return (  compareChars( getIp0040PrsProdReassgnSw() , ip0040PrsPdNotReasgn8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040PrsPdNotReasgn88True() {  			
    	setIp0040PrsProdReassgnSw( ip0040PrsPdNotReasgn8888Value);
   	}
	/**
	 *	Returns the value of ip0040ProdReassignmentSw
	 *	@return ip0040ProdReassignmentSw
	 */
   public char[] getIp0040ProdReassignmentSw() throws CFException{
     if (isIp0040ProdReassignmentSwModified()) { 
        ip0040ProdReassignmentSw = refreshIp0040ProdReassignmentSw();
     }
   		return ip0040ProdReassignmentSw;
   }

  
	/**
	*  set variable ip0040ProdReassignmentSw
	*  Corresponding COBOL Variable is IP0040-PROD-REASSIGNMENT-SW
	*  @param value
	**/
   public void setIp0040ProdReassignmentSw(char[] value) {
      ip0040ProdReassignmentSw = checkIp0040ProdReassignmentSwConstraints(value);
      serializeIp0040ProdReassignmentSw(ip0040ProdReassignmentSw);
   } 

     /**
	 * 	Update Ip0040ProdReassignmentSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040ProdReassignmentSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040ProdReassignmentSw,ip0040ProdReassignmentSw.length);
   	
   }
   
   public void setIp0040ProdReassignmentSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ProdReassignmentSw,ip0040ProdReassignmentSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040ProdReassignmentSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040ProdReassignmentSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ProdReassignmentSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040ProdReassignmentSw with another Field
	 *	@param value
	 */
   public void setIp0040ProdReassignmentSw(Field source) {
       replace(source,0,source.length(),beginIp0040ProdReassignmentSw,IP_0040_PROD_REASSIGNMENT_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040ProdReassignmentSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040ProdReassignmentSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040ProdReassignmentSw,IP_0040_PROD_REASSIGNMENT_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040ProdReassignmentSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040ProdReassignmentSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ProdReassignmentSw+targetIndex,targetLen);
    
   }
	char[] ip0040PdReassigned8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040PdReassigned88()
	 *	@return  Returns true if isIp0040PdReassigned88() is "Y"
	 */
   public boolean isIp0040PdReassigned88() throws CFException {
      return (  compareChars( getIp0040ProdReassignmentSw() , ip0040PdReassigned8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040PdReassigned88True() {  			
    	setIp0040ProdReassignmentSw( ip0040PdReassigned8888Value);
   	}
	char[] ip0040PdNotReassigned8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040PdNotReassigned88()
	 *	@return  Returns true if isIp0040PdNotReassigned88() is "N"
	 */
   public boolean isIp0040PdNotReassigned88() throws CFException {
      return (  compareChars( getIp0040ProdReassignmentSw() , ip0040PdNotReassigned8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040PdNotReassigned88True() {  			
    	setIp0040ProdReassignmentSw( ip0040PdNotReassigned8888Value);
   	}
	/**
	 *	Returns the value of ip0040OptInFlag
	 *	@return ip0040OptInFlag
	 */
   public char[] getIp0040OptInFlag() throws CFException{
     if (isIp0040OptInFlagModified()) { 
        ip0040OptInFlag = refreshIp0040OptInFlag();
     }
   		return ip0040OptInFlag;
   }

  
	/**
	*  set variable ip0040OptInFlag
	*  Corresponding COBOL Variable is IP0040-OPT-IN-FLAG
	*  @param value
	**/
   public void setIp0040OptInFlag(char[] value) {
      ip0040OptInFlag = checkIp0040OptInFlagConstraints(value);
      serializeIp0040OptInFlag(ip0040OptInFlag);
   } 

     /**
	 * 	Update Ip0040OptInFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040OptInFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040OptInFlag,ip0040OptInFlag.length);
   	
   }
   
   public void setIp0040OptInFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040OptInFlag,ip0040OptInFlag.length);
   	
   }
   
     /**
	 * 	Update Ip0040OptInFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040OptInFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040OptInFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040OptInFlag with another Field
	 *	@param value
	 */
   public void setIp0040OptInFlag(Field source) {
       replace(source,0,source.length(),beginIp0040OptInFlag,IP_0040_OPT_IN_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040OptInFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040OptInFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040OptInFlag,IP_0040_OPT_IN_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040OptInFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040OptInFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040OptInFlag+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040LicensedProdId
	 *	@return ip0040LicensedProdId
	 */
   public char[] getIp0040LicensedProdId() throws CFException{
     if (isIp0040LicensedProdIdModified()) { 
        ip0040LicensedProdId = refreshIp0040LicensedProdId();
     }
   		return ip0040LicensedProdId;
   }

  
	/**
	*  set variable ip0040LicensedProdId
	*  Corresponding COBOL Variable is IP0040-LICENSED-PROD-ID
	*  @param value
	**/
   public void setIp0040LicensedProdId(char[] value) {
      ip0040LicensedProdId = checkIp0040LicensedProdIdConstraints(value);
      serializeIp0040LicensedProdId(ip0040LicensedProdId);
   } 

     /**
	 * 	Update Ip0040LicensedProdId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040LicensedProdId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040LicensedProdId,ip0040LicensedProdId.length);
   	
   }
   
   public void setIp0040LicensedProdId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040LicensedProdId,ip0040LicensedProdId.length);
   	
   }
   
     /**
	 * 	Update Ip0040LicensedProdId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040LicensedProdId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040LicensedProdId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040LicensedProdId with another Field
	 *	@param value
	 */
   public void setIp0040LicensedProdId(Field source) {
       replace(source,0,source.length(),beginIp0040LicensedProdId,IP_0040_LICENSED_PROD_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040LicensedProdId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040LicensedProdId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040LicensedProdId,IP_0040_LICENSED_PROD_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040LicensedProdId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040LicensedProdId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040LicensedProdId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040VirtFundPanInd
	 *	@return ip0040VirtFundPanInd
	 */
   public char[] getIp0040VirtFundPanInd() throws CFException{
     if (isIp0040VirtFundPanIndModified()) { 
        ip0040VirtFundPanInd = refreshIp0040VirtFundPanInd();
     }
   		return ip0040VirtFundPanInd;
   }

  
	/**
	*  set variable ip0040VirtFundPanInd
	*  Corresponding COBOL Variable is IP0040-VIRT-FUND-PAN-IND
	*  @param value
	**/
   public void setIp0040VirtFundPanInd(char[] value) {
      ip0040VirtFundPanInd = checkIp0040VirtFundPanIndConstraints(value);
      serializeIp0040VirtFundPanInd(ip0040VirtFundPanInd);
   } 

     /**
	 * 	Update Ip0040VirtFundPanInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040VirtFundPanInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040VirtFundPanInd,ip0040VirtFundPanInd.length);
   	
   }
   
   public void setIp0040VirtFundPanInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040VirtFundPanInd,ip0040VirtFundPanInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040VirtFundPanInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040VirtFundPanInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040VirtFundPanInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040VirtFundPanInd with another Field
	 *	@param value
	 */
   public void setIp0040VirtFundPanInd(Field source) {
       replace(source,0,source.length(),beginIp0040VirtFundPanInd,IP_0040_VIRT_FUND_PAN_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040VirtFundPanInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040VirtFundPanInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040VirtFundPanInd,IP_0040_VIRT_FUND_PAN_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040VirtFundPanInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040VirtFundPanInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040VirtFundPanInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040AcctCatgPartSw
	 *	@return ip0040AcctCatgPartSw
	 */
   public char[] getIp0040AcctCatgPartSw() throws CFException{
     if (isIp0040AcctCatgPartSwModified()) { 
        ip0040AcctCatgPartSw = refreshIp0040AcctCatgPartSw();
     }
   		return ip0040AcctCatgPartSw;
   }

  
	/**
	*  set variable ip0040AcctCatgPartSw
	*  Corresponding COBOL Variable is IP0040-ACCT-CATG-PART-SW
	*  @param value
	**/
   public void setIp0040AcctCatgPartSw(char[] value) {
      ip0040AcctCatgPartSw = checkIp0040AcctCatgPartSwConstraints(value);
      serializeIp0040AcctCatgPartSw(ip0040AcctCatgPartSw);
   } 

     /**
	 * 	Update Ip0040AcctCatgPartSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040AcctCatgPartSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040AcctCatgPartSw,ip0040AcctCatgPartSw.length);
   	
   }
   
   public void setIp0040AcctCatgPartSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040AcctCatgPartSw,ip0040AcctCatgPartSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040AcctCatgPartSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040AcctCatgPartSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040AcctCatgPartSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040AcctCatgPartSw with another Field
	 *	@param value
	 */
   public void setIp0040AcctCatgPartSw(Field source) {
       replace(source,0,source.length(),beginIp0040AcctCatgPartSw,IP_0040_ACCT_CATG_PART_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040AcctCatgPartSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040AcctCatgPartSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040AcctCatgPartSw,IP_0040_ACCT_CATG_PART_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040AcctCatgPartSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040AcctCatgPartSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040AcctCatgPartSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040AcctCatgActvnDate
	 *	@return ip0040AcctCatgActvnDate
	 */
	public long getIp0040AcctCatgActvnDate() throws CFException {
       if (isIp0040AcctCatgActvnDateModified()) { 
           ip0040AcctCatgActvnDate = refreshIp0040AcctCatgActvnDate();
        }
   		return ip0040AcctCatgActvnDate;
	}
	

	
	   
	/**
	 * 	Update Ip0040AcctCatgActvnDate with the passed value
	 *  Corresponding COBOL Variable is IP0040-ACCT-CATG-ACTVN-DATE
	 *	@param number
	 */
	public void setIp0040AcctCatgActvnDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040AcctCatgActvnDate = checkIp0040AcctCatgActvnDateMaxLimit(number); 
		serializeIp0040AcctCatgActvnDate(ip0040AcctCatgActvnDate);
	}
	

	/**
	 * 	Update Ip0040AcctCatgActvnDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040AcctCatgActvnDate(char[] value) throws CFException {
		 ip0040AcctCatgActvnDate = serializeIp0040AcctCatgActvnDate(value);
	}
	/**
	 * 	Update Ip0040AcctCatgActvnDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040AcctCatgActvnDateString(char[] value) throws CFException {
		 setIp0040AcctCatgActvnDate(value);
	}
	/**
	 *	Returns the value of ip0040CardHldrBlngCur
	 *	@return ip0040CardHldrBlngCur
	 */   
	 public Ip0040CardHldrBlngCur getIp0040CardHldrBlngCur() {
   	return ip0040CardHldrBlngCur;
   }
   /**
	* 	Update Ip0040CardHldrBlngCur with the passed value
	*   Corresponding COBOL Variable is IP0040-CARD-HLDR-BLNG-CUR
	*	@param value
	*/
   public void setIp0040CardHldrBlngCur(char[] value) {
      ip0040CardHldrBlngCur.setString(value); 
   }   
    
     /**
	 * 	Update Ip0040CardHldrBlngCur 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0040CardHldrBlngCur(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040CardHldrBlngCur.begin,ip0040CardHldrBlngCur.length());
   }
   
     /**
	 * 	Update Ip0040CardHldrBlngCur 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040CardHldrBlngCur(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040CardHldrBlngCur.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0040CardHldrBlngCur with another Field
	 *	@param value
	 */
   public void setIp0040CardHldrBlngCur(Field source) {
   	replace(source,0,source.length(),ip0040CardHldrBlngCur.begin,ip0040CardHldrBlngCur.length());
   }  
   
     /**
	 * 	Update Ip0040CardHldrBlngCur 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0040CardHldrBlngCur(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040CardHldrBlngCur.begin,ip0040CardHldrBlngCur.length());
   }
   
     /**
	 * 	Update Ip0040CardHldrBlngCur 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040CardHldrBlngCur(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040CardHldrBlngCur.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip0040ChipConversionSw
	 *	@return ip0040ChipConversionSw
	 */
   public char[] getIp0040ChipConversionSw() throws CFException{
     if (isIp0040ChipConversionSwModified()) { 
        ip0040ChipConversionSw = refreshIp0040ChipConversionSw();
     }
   		return ip0040ChipConversionSw;
   }

  
	/**
	*  set variable ip0040ChipConversionSw
	*  Corresponding COBOL Variable is IP0040-CHIP-CONVERSION-SW
	*  @param value
	**/
   public void setIp0040ChipConversionSw(char[] value) {
      ip0040ChipConversionSw = checkIp0040ChipConversionSwConstraints(value);
      serializeIp0040ChipConversionSw(ip0040ChipConversionSw);
   } 

     /**
	 * 	Update Ip0040ChipConversionSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040ChipConversionSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040ChipConversionSw,ip0040ChipConversionSw.length);
   	
   }
   
   public void setIp0040ChipConversionSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ChipConversionSw,ip0040ChipConversionSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040ChipConversionSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040ChipConversionSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ChipConversionSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040ChipConversionSw with another Field
	 *	@param value
	 */
   public void setIp0040ChipConversionSw(Field source) {
       replace(source,0,source.length(),beginIp0040ChipConversionSw,IP_0040_CHIP_CONVERSION_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040ChipConversionSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040ChipConversionSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040ChipConversionSw,IP_0040_CHIP_CONVERSION_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040ChipConversionSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040ChipConversionSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040ChipConversionSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040FloorExpiryDate
	 *	@return ip0040FloorExpiryDate
	 */   
	 public Ip0040FloorExpiryDate getIp0040FloorExpiryDate() {
   	return ip0040FloorExpiryDate;
   }
   /**
	* 	Update Ip0040FloorExpiryDate with the passed value
	*   Corresponding COBOL Variable is IP0040-FLOOR-EXPIRY-DATE
	*	@param value
	*/
   public void setIp0040FloorExpiryDate(char[] value) {
      ip0040FloorExpiryDate.setString(value); 
   }   
    
     /**
	 * 	Update Ip0040FloorExpiryDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0040FloorExpiryDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040FloorExpiryDate.begin,ip0040FloorExpiryDate.length());
   }
   
     /**
	 * 	Update Ip0040FloorExpiryDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040FloorExpiryDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040FloorExpiryDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0040FloorExpiryDate with another Field
	 *	@param value
	 */
   public void setIp0040FloorExpiryDate(Field source) {
   	replace(source,0,source.length(),ip0040FloorExpiryDate.begin,ip0040FloorExpiryDate.length());
   }  
   
     /**
	 * 	Update Ip0040FloorExpiryDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0040FloorExpiryDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040FloorExpiryDate.begin,ip0040FloorExpiryDate.length());
   }
   
     /**
	 * 	Update Ip0040FloorExpiryDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040FloorExpiryDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040FloorExpiryDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip0040CoBrandSw
	 *	@return ip0040CoBrandSw
	 */
   public char[] getIp0040CoBrandSw() throws CFException{
     if (isIp0040CoBrandSwModified()) { 
        ip0040CoBrandSw = refreshIp0040CoBrandSw();
     }
   		return ip0040CoBrandSw;
   }

  
	/**
	*  set variable ip0040CoBrandSw
	*  Corresponding COBOL Variable is IP0040-CO-BRAND-SW
	*  @param value
	**/
   public void setIp0040CoBrandSw(char[] value) {
      ip0040CoBrandSw = checkIp0040CoBrandSwConstraints(value);
      serializeIp0040CoBrandSw(ip0040CoBrandSw);
   } 

     /**
	 * 	Update Ip0040CoBrandSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040CoBrandSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040CoBrandSw,ip0040CoBrandSw.length);
   	
   }
   
   public void setIp0040CoBrandSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040CoBrandSw,ip0040CoBrandSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040CoBrandSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040CoBrandSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040CoBrandSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040CoBrandSw with another Field
	 *	@param value
	 */
   public void setIp0040CoBrandSw(Field source) {
       replace(source,0,source.length(),beginIp0040CoBrandSw,IP_0040_CO_BRAND_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040CoBrandSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040CoBrandSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040CoBrandSw,IP_0040_CO_BRAND_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040CoBrandSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040CoBrandSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040CoBrandSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040SpendControlRcnSw
	 *	@return ip0040SpendControlRcnSw
	 */
   public char[] getIp0040SpendControlRcnSw() throws CFException{
     if (isIp0040SpendControlRcnSwModified()) { 
        ip0040SpendControlRcnSw = refreshIp0040SpendControlRcnSw();
     }
   		return ip0040SpendControlRcnSw;
   }

  
	/**
	*  set variable ip0040SpendControlRcnSw
	*  Corresponding COBOL Variable is IP0040-SPEND-CONTROL-RCN-SW
	*  @param value
	**/
   public void setIp0040SpendControlRcnSw(char[] value) {
      ip0040SpendControlRcnSw = checkIp0040SpendControlRcnSwConstraints(value);
      serializeIp0040SpendControlRcnSw(ip0040SpendControlRcnSw);
   } 

     /**
	 * 	Update Ip0040SpendControlRcnSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040SpendControlRcnSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040SpendControlRcnSw,ip0040SpendControlRcnSw.length);
   	
   }
   
   public void setIp0040SpendControlRcnSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040SpendControlRcnSw,ip0040SpendControlRcnSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040SpendControlRcnSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040SpendControlRcnSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040SpendControlRcnSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040SpendControlRcnSw with another Field
	 *	@param value
	 */
   public void setIp0040SpendControlRcnSw(Field source) {
       replace(source,0,source.length(),beginIp0040SpendControlRcnSw,IP_0040_SPEND_CONTROL_RCN_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040SpendControlRcnSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040SpendControlRcnSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040SpendControlRcnSw,IP_0040_SPEND_CONTROL_RCN_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040SpendControlRcnSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040SpendControlRcnSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040SpendControlRcnSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040MerchCleanServPart
	 *	@return ip0040MerchCleanServPart
	 */
   public char[] getIp0040MerchCleanServPart() throws CFException{
     if (isIp0040MerchCleanServPartModified()) { 
        ip0040MerchCleanServPart = refreshIp0040MerchCleanServPart();
     }
   		return ip0040MerchCleanServPart;
   }

  
	/**
	*  set variable ip0040MerchCleanServPart
	*  Corresponding COBOL Variable is IP0040-MERCH-CLEAN-SERV-PART
	*  @param value
	**/
   public void setIp0040MerchCleanServPart(char[] value) {
      ip0040MerchCleanServPart = checkIp0040MerchCleanServPartConstraints(value);
      serializeIp0040MerchCleanServPart(ip0040MerchCleanServPart);
   } 

     /**
	 * 	Update Ip0040MerchCleanServPart 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040MerchCleanServPart(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040MerchCleanServPart,ip0040MerchCleanServPart.length);
   	
   }
   
   public void setIp0040MerchCleanServPart(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040MerchCleanServPart,ip0040MerchCleanServPart.length);
   	
   }
   
     /**
	 * 	Update Ip0040MerchCleanServPart 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040MerchCleanServPart(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040MerchCleanServPart+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040MerchCleanServPart with another Field
	 *	@param value
	 */
   public void setIp0040MerchCleanServPart(Field source) {
       replace(source,0,source.length(),beginIp0040MerchCleanServPart,IP_0040_MERCH_CLEAN_SERV_PART_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040MerchCleanServPart 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040MerchCleanServPart(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040MerchCleanServPart,IP_0040_MERCH_CLEAN_SERV_PART_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040MerchCleanServPart 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040MerchCleanServPart(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040MerchCleanServPart+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040MerchCleanActvDate
	 *	@return ip0040MerchCleanActvDate
	 */
	public long getIp0040MerchCleanActvDate() throws CFException {
       if (isIp0040MerchCleanActvDateModified()) { 
           ip0040MerchCleanActvDate = refreshIp0040MerchCleanActvDate();
        }
   		return ip0040MerchCleanActvDate;
	}
	

	
	   
	/**
	 * 	Update Ip0040MerchCleanActvDate with the passed value
	 *  Corresponding COBOL Variable is IP0040-MERCH-CLEAN-ACTV-DATE
	 *	@param number
	 */
	public void setIp0040MerchCleanActvDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040MerchCleanActvDate = checkIp0040MerchCleanActvDateMaxLimit(number); 
		serializeIp0040MerchCleanActvDate(ip0040MerchCleanActvDate);
	}
	

	/**
	 * 	Update Ip0040MerchCleanActvDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040MerchCleanActvDate(char[] value) throws CFException {
		 ip0040MerchCleanActvDate = serializeIp0040MerchCleanActvDate(value);
	}
	/**
	 * 	Update Ip0040MerchCleanActvDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040MerchCleanActvDateString(char[] value) throws CFException {
		 setIp0040MerchCleanActvDate(value);
	}
	/**
	 *	Returns the value of ip0040PaypassEnabledInd
	 *	@return ip0040PaypassEnabledInd
	 */
   public char[] getIp0040PaypassEnabledInd() throws CFException{
     if (isIp0040PaypassEnabledIndModified()) { 
        ip0040PaypassEnabledInd = refreshIp0040PaypassEnabledInd();
     }
   		return ip0040PaypassEnabledInd;
   }

  
	/**
	*  set variable ip0040PaypassEnabledInd
	*  Corresponding COBOL Variable is IP0040-PAYPASS-ENABLED-IND
	*  @param value
	**/
   public void setIp0040PaypassEnabledInd(char[] value) {
      ip0040PaypassEnabledInd = checkIp0040PaypassEnabledIndConstraints(value);
      serializeIp0040PaypassEnabledInd(ip0040PaypassEnabledInd);
   } 

     /**
	 * 	Update Ip0040PaypassEnabledInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040PaypassEnabledInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040PaypassEnabledInd,ip0040PaypassEnabledInd.length);
   	
   }
   
   public void setIp0040PaypassEnabledInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040PaypassEnabledInd,ip0040PaypassEnabledInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040PaypassEnabledInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040PaypassEnabledInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040PaypassEnabledInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040PaypassEnabledInd with another Field
	 *	@param value
	 */
   public void setIp0040PaypassEnabledInd(Field source) {
       replace(source,0,source.length(),beginIp0040PaypassEnabledInd,IP_0040_PAYPASS_ENABLED_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040PaypassEnabledInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040PaypassEnabledInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040PaypassEnabledInd,IP_0040_PAYPASS_ENABLED_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040PaypassEnabledInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040PaypassEnabledInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040PaypassEnabledInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040RateTypeIndicator
	 *	@return ip0040RateTypeIndicator
	 */
   public char[] getIp0040RateTypeIndicator() throws CFException{
     if (isIp0040RateTypeIndicatorModified()) { 
        ip0040RateTypeIndicator = refreshIp0040RateTypeIndicator();
     }
   		return ip0040RateTypeIndicator;
   }

  
	/**
	*  set variable ip0040RateTypeIndicator
	*  Corresponding COBOL Variable is IP0040-RATE-TYPE-INDICATOR
	*  @param value
	**/
   public void setIp0040RateTypeIndicator(char[] value) {
      ip0040RateTypeIndicator = checkIp0040RateTypeIndicatorConstraints(value);
      serializeIp0040RateTypeIndicator(ip0040RateTypeIndicator);
   } 

     /**
	 * 	Update Ip0040RateTypeIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040RateTypeIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040RateTypeIndicator,ip0040RateTypeIndicator.length);
   	
   }
   
   public void setIp0040RateTypeIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040RateTypeIndicator,ip0040RateTypeIndicator.length);
   	
   }
   
     /**
	 * 	Update Ip0040RateTypeIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040RateTypeIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040RateTypeIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040RateTypeIndicator with another Field
	 *	@param value
	 */
   public void setIp0040RateTypeIndicator(Field source) {
       replace(source,0,source.length(),beginIp0040RateTypeIndicator,IP_0040_RATE_TYPE_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040RateTypeIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040RateTypeIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040RateTypeIndicator,IP_0040_RATE_TYPE_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040RateTypeIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040RateTypeIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040RateTypeIndicator+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040RoutePsnIndicator
	 *	@return ip0040RoutePsnIndicator
	 */
   public char[] getIp0040RoutePsnIndicator() throws CFException{
     if (isIp0040RoutePsnIndicatorModified()) { 
        ip0040RoutePsnIndicator = refreshIp0040RoutePsnIndicator();
     }
   		return ip0040RoutePsnIndicator;
   }

  
	/**
	*  set variable ip0040RoutePsnIndicator
	*  Corresponding COBOL Variable is IP0040-ROUTE-PSN-INDICATOR
	*  @param value
	**/
   public void setIp0040RoutePsnIndicator(char[] value) {
      ip0040RoutePsnIndicator = checkIp0040RoutePsnIndicatorConstraints(value);
      serializeIp0040RoutePsnIndicator(ip0040RoutePsnIndicator);
   } 

     /**
	 * 	Update Ip0040RoutePsnIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040RoutePsnIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040RoutePsnIndicator,ip0040RoutePsnIndicator.length);
   	
   }
   
   public void setIp0040RoutePsnIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040RoutePsnIndicator,ip0040RoutePsnIndicator.length);
   	
   }
   
     /**
	 * 	Update Ip0040RoutePsnIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040RoutePsnIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040RoutePsnIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040RoutePsnIndicator with another Field
	 *	@param value
	 */
   public void setIp0040RoutePsnIndicator(Field source) {
       replace(source,0,source.length(),beginIp0040RoutePsnIndicator,IP_0040_ROUTE_PSN_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040RoutePsnIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040RoutePsnIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040RoutePsnIndicator,IP_0040_ROUTE_PSN_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040RoutePsnIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040RoutePsnIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040RoutePsnIndicator+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040CbwpIndicator
	 *	@return ip0040CbwpIndicator
	 */
   public char[] getIp0040CbwpIndicator() throws CFException{
     if (isIp0040CbwpIndicatorModified()) { 
        ip0040CbwpIndicator = refreshIp0040CbwpIndicator();
     }
   		return ip0040CbwpIndicator;
   }

  
	/**
	*  set variable ip0040CbwpIndicator
	*  Corresponding COBOL Variable is IP0040-CBWP-INDICATOR
	*  @param value
	**/
   public void setIp0040CbwpIndicator(char[] value) {
      ip0040CbwpIndicator = checkIp0040CbwpIndicatorConstraints(value);
      serializeIp0040CbwpIndicator(ip0040CbwpIndicator);
   } 

     /**
	 * 	Update Ip0040CbwpIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040CbwpIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040CbwpIndicator,ip0040CbwpIndicator.length);
   	
   }
   
   public void setIp0040CbwpIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040CbwpIndicator,ip0040CbwpIndicator.length);
   	
   }
   
     /**
	 * 	Update Ip0040CbwpIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040CbwpIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040CbwpIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040CbwpIndicator with another Field
	 *	@param value
	 */
   public void setIp0040CbwpIndicator(Field source) {
       replace(source,0,source.length(),beginIp0040CbwpIndicator,IP_0040_CBWP_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040CbwpIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040CbwpIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040CbwpIndicator,IP_0040_CBWP_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040CbwpIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040CbwpIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040CbwpIndicator+targetIndex,targetLen);
    
   }
	char[] ip0040CbwpIndY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040CbwpIndY88()
	 *	@return  Returns true if isIp0040CbwpIndY88() is "Y"
	 */
   public boolean isIp0040CbwpIndY88() throws CFException {
      return (  compareChars( getIp0040CbwpIndicator() , ip0040CbwpIndY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040CbwpIndY88True() {  			
    	setIp0040CbwpIndicator( ip0040CbwpIndY8888Value);
   	}
	char[] ip0040CbwpIndN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040CbwpIndN88()
	 *	@return  Returns true if isIp0040CbwpIndN88() is "N"
	 */
   public boolean isIp0040CbwpIndN88() throws CFException {
      return (  compareChars( getIp0040CbwpIndicator() , ip0040CbwpIndN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040CbwpIndN88True() {  			
    	setIp0040CbwpIndicator( ip0040CbwpIndN8888Value);
   	}
	/**
	 *	Returns the value of ip0040FlexParticipInd
	 *	@return ip0040FlexParticipInd
	 */
   public char[] getIp0040FlexParticipInd() throws CFException{
     if (isIp0040FlexParticipIndModified()) { 
        ip0040FlexParticipInd = refreshIp0040FlexParticipInd();
     }
   		return ip0040FlexParticipInd;
   }

  
	/**
	*  set variable ip0040FlexParticipInd
	*  Corresponding COBOL Variable is IP0040-FLEX-PARTICIP-IND
	*  @param value
	**/
   public void setIp0040FlexParticipInd(char[] value) {
      ip0040FlexParticipInd = checkIp0040FlexParticipIndConstraints(value);
      serializeIp0040FlexParticipInd(ip0040FlexParticipInd);
   } 

     /**
	 * 	Update Ip0040FlexParticipInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040FlexParticipInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040FlexParticipInd,ip0040FlexParticipInd.length);
   	
   }
   
   public void setIp0040FlexParticipInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040FlexParticipInd,ip0040FlexParticipInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040FlexParticipInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040FlexParticipInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040FlexParticipInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040FlexParticipInd with another Field
	 *	@param value
	 */
   public void setIp0040FlexParticipInd(Field source) {
       replace(source,0,source.length(),beginIp0040FlexParticipInd,IP_0040_FLEX_PARTICIP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040FlexParticipInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040FlexParticipInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040FlexParticipInd,IP_0040_FLEX_PARTICIP_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040FlexParticipInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040FlexParticipInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040FlexParticipInd+targetIndex,targetLen);
    
   }
	char[] ip0040ParticipInd08888Value = fillZeroes(1);
	/**
	 *	Test condition "0" for isIp0040ParticipInd088()
	 *	@return  Returns true if isIp0040ParticipInd088() is "0"
	 */
   public boolean isIp0040ParticipInd088() throws CFException {
      return (  compareChars( getIp0040FlexParticipInd() , ip0040ParticipInd08888Value)  == 0  );
   }


	/**
	*  set values "0"
	*/
   	public void setIp0040ParticipInd088True() {  			
    	setIp0040FlexParticipInd( ip0040ParticipInd08888Value);
   	}
	char[] ip0040ParticipInd18888Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isIp0040ParticipInd188()
	 *	@return  Returns true if isIp0040ParticipInd188() is "1"
	 */
   public boolean isIp0040ParticipInd188() throws CFException {
      return (  compareChars( getIp0040FlexParticipInd() , ip0040ParticipInd18888Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setIp0040ParticipInd188True() {  			
    	setIp0040FlexParticipInd( ip0040ParticipInd18888Value);
   	}
	char[] ip0040ParticipInd28888Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isIp0040ParticipInd288()
	 *	@return  Returns true if isIp0040ParticipInd288() is "2"
	 */
   public boolean isIp0040ParticipInd288() throws CFException {
      return (  compareChars( getIp0040FlexParticipInd() , ip0040ParticipInd28888Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setIp0040ParticipInd288True() {  			
    	setIp0040FlexParticipInd( ip0040ParticipInd28888Value);
   	}
	char[] ip0040ParticipInd38888Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isIp0040ParticipInd388()
	 *	@return  Returns true if isIp0040ParticipInd388() is "3"
	 */
   public boolean isIp0040ParticipInd388() throws CFException {
      return (  compareChars( getIp0040FlexParticipInd() , ip0040ParticipInd38888Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setIp0040ParticipInd388True() {  			
    	setIp0040FlexParticipInd( ip0040ParticipInd38888Value);
   	}
	/**
	 *	Returns the value of ip0040RepwrRldInd
	 *	@return ip0040RepwrRldInd
	 */
   public char[] getIp0040RepwrRldInd() throws CFException{
     if (isIp0040RepwrRldIndModified()) { 
        ip0040RepwrRldInd = refreshIp0040RepwrRldInd();
     }
   		return ip0040RepwrRldInd;
   }

  
	/**
	*  set variable ip0040RepwrRldInd
	*  Corresponding COBOL Variable is IP0040-REPWR-RLD-IND
	*  @param value
	**/
   public void setIp0040RepwrRldInd(char[] value) {
      ip0040RepwrRldInd = checkIp0040RepwrRldIndConstraints(value);
      serializeIp0040RepwrRldInd(ip0040RepwrRldInd);
   } 

     /**
	 * 	Update Ip0040RepwrRldInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040RepwrRldInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040RepwrRldInd,ip0040RepwrRldInd.length);
   	
   }
   
   public void setIp0040RepwrRldInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040RepwrRldInd,ip0040RepwrRldInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040RepwrRldInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040RepwrRldInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040RepwrRldInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040RepwrRldInd with another Field
	 *	@param value
	 */
   public void setIp0040RepwrRldInd(Field source) {
       replace(source,0,source.length(),beginIp0040RepwrRldInd,IP_0040_REPWR_RLD_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040RepwrRldInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040RepwrRldInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040RepwrRldInd,IP_0040_REPWR_RLD_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040RepwrRldInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040RepwrRldInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040RepwrRldInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040MoneySendInd
	 *	@return ip0040MoneySendInd
	 */
   public char[] getIp0040MoneySendInd() throws CFException{
     if (isIp0040MoneySendIndModified()) { 
        ip0040MoneySendInd = refreshIp0040MoneySendInd();
     }
   		return ip0040MoneySendInd;
   }

  
	/**
	*  set variable ip0040MoneySendInd
	*  Corresponding COBOL Variable is IP0040-MONEY-SEND-IND
	*  @param value
	**/
   public void setIp0040MoneySendInd(char[] value) {
      ip0040MoneySendInd = checkIp0040MoneySendIndConstraints(value);
      serializeIp0040MoneySendInd(ip0040MoneySendInd);
   } 

     /**
	 * 	Update Ip0040MoneySendInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040MoneySendInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040MoneySendInd,ip0040MoneySendInd.length);
   	
   }
   
   public void setIp0040MoneySendInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040MoneySendInd,ip0040MoneySendInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040MoneySendInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040MoneySendInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040MoneySendInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040MoneySendInd with another Field
	 *	@param value
	 */
   public void setIp0040MoneySendInd(Field source) {
       replace(source,0,source.length(),beginIp0040MoneySendInd,IP_0040_MONEY_SEND_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040MoneySendInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040MoneySendInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040MoneySendInd,IP_0040_MONEY_SEND_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040MoneySendInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040MoneySendInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040MoneySendInd+targetIndex,targetLen);
    
   }
	char[] ip0040MoneySendDomCrs8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040MoneySendDomCrs88()
	 *	@return  Returns true if isIp0040MoneySendDomCrs88() is "Y"
	 */
   public boolean isIp0040MoneySendDomCrs88() throws CFException {
      return (  compareChars( getIp0040MoneySendInd() , ip0040MoneySendDomCrs8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040MoneySendDomCrs88True() {  			
    	setIp0040MoneySendInd( ip0040MoneySendDomCrs8888Value);
   	}
	char[] ip0040MoneySendDom8888Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isIp0040MoneySendDom88()
	 *	@return  Returns true if isIp0040MoneySendDom88() is "D"
	 */
   public boolean isIp0040MoneySendDom88() throws CFException {
      return (  compareChars( getIp0040MoneySendInd() , ip0040MoneySendDom8888Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setIp0040MoneySendDom88True() {  			
    	setIp0040MoneySendInd( ip0040MoneySendDom8888Value);
   	}
	char[] ip0040MoneySendNo8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040MoneySendNo88()
	 *	@return  Returns true if isIp0040MoneySendNo88() is "N"
	 */
   public boolean isIp0040MoneySendNo88() throws CFException {
      return (  compareChars( getIp0040MoneySendInd() , ip0040MoneySendNo8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040MoneySendNo88True() {  			
    	setIp0040MoneySendInd( ip0040MoneySendNo8888Value);
   	}
	char[] ip0040MoneySendUnknown8888Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isIp0040MoneySendUnknown88()
	 *	@return  Returns true if isIp0040MoneySendUnknown88() is "U"
	 */
   public boolean isIp0040MoneySendUnknown88() throws CFException {
      return (  compareChars( getIp0040MoneySendInd() , ip0040MoneySendUnknown8888Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setIp0040MoneySendUnknown88True() {  			
    	setIp0040MoneySendInd( ip0040MoneySendUnknown8888Value);
   	}
	/**
	 *	Returns the value of ip0040RegulatedRateIndSw
	 *	@return ip0040RegulatedRateIndSw
	 */
   public char[] getIp0040RegulatedRateIndSw() throws CFException{
     if (isIp0040RegulatedRateIndSwModified()) { 
        ip0040RegulatedRateIndSw = refreshIp0040RegulatedRateIndSw();
     }
   		return ip0040RegulatedRateIndSw;
   }

  
	/**
	*  set variable ip0040RegulatedRateIndSw
	*  Corresponding COBOL Variable is IP0040-REGULATED-RATE-IND-SW
	*  @param value
	**/
   public void setIp0040RegulatedRateIndSw(char[] value) {
      ip0040RegulatedRateIndSw = checkIp0040RegulatedRateIndSwConstraints(value);
      serializeIp0040RegulatedRateIndSw(ip0040RegulatedRateIndSw);
   } 

     /**
	 * 	Update Ip0040RegulatedRateIndSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040RegulatedRateIndSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040RegulatedRateIndSw,ip0040RegulatedRateIndSw.length);
   	
   }
   
   public void setIp0040RegulatedRateIndSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040RegulatedRateIndSw,ip0040RegulatedRateIndSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040RegulatedRateIndSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040RegulatedRateIndSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040RegulatedRateIndSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040RegulatedRateIndSw with another Field
	 *	@param value
	 */
   public void setIp0040RegulatedRateIndSw(Field source) {
       replace(source,0,source.length(),beginIp0040RegulatedRateIndSw,IP_0040_REGULATED_RATE_IND_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040RegulatedRateIndSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040RegulatedRateIndSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040RegulatedRateIndSw,IP_0040_REGULATED_RATE_IND_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040RegulatedRateIndSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040RegulatedRateIndSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040RegulatedRateIndSw+targetIndex,targetLen);
    
   }
	char[] ip0040RegRateIndSw8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040RegRateIndSw88()
	 *	@return  Returns true if isIp0040RegRateIndSw88() is "Y"
	 */
   public boolean isIp0040RegRateIndSw88() throws CFException {
      return (  compareChars( getIp0040RegulatedRateIndSw() , ip0040RegRateIndSw8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040RegRateIndSw88True() {  			
    	setIp0040RegulatedRateIndSw( ip0040RegRateIndSw8888Value);
   	}
	char[] ip0040NonRegIndSw8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040NonRegIndSw88()
	 *	@return  Returns true if isIp0040NonRegIndSw88() is "N"
	 */
   public boolean isIp0040NonRegIndSw88() throws CFException {
      return (  compareChars( getIp0040RegulatedRateIndSw() , ip0040NonRegIndSw8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040NonRegIndSw88True() {  			
    	setIp0040RegulatedRateIndSw( ip0040NonRegIndSw8888Value);
   	}
	/**
	 *	Returns the value of ip0040CashAccessSw
	 *	@return ip0040CashAccessSw
	 */
   public char[] getIp0040CashAccessSw() throws CFException{
     if (isIp0040CashAccessSwModified()) { 
        ip0040CashAccessSw = refreshIp0040CashAccessSw();
     }
   		return ip0040CashAccessSw;
   }

  
	/**
	*  set variable ip0040CashAccessSw
	*  Corresponding COBOL Variable is IP0040-CASH-ACCESS-SW
	*  @param value
	**/
   public void setIp0040CashAccessSw(char[] value) {
      ip0040CashAccessSw = checkIp0040CashAccessSwConstraints(value);
      serializeIp0040CashAccessSw(ip0040CashAccessSw);
   } 

     /**
	 * 	Update Ip0040CashAccessSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040CashAccessSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040CashAccessSw,ip0040CashAccessSw.length);
   	
   }
   
   public void setIp0040CashAccessSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040CashAccessSw,ip0040CashAccessSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040CashAccessSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040CashAccessSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040CashAccessSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040CashAccessSw with another Field
	 *	@param value
	 */
   public void setIp0040CashAccessSw(Field source) {
       replace(source,0,source.length(),beginIp0040CashAccessSw,IP_0040_CASH_ACCESS_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040CashAccessSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040CashAccessSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040CashAccessSw,IP_0040_CASH_ACCESS_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040CashAccessSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040CashAccessSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040CashAccessSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040PersonPresentInd
	 *	@return ip0040PersonPresentInd
	 */
	public int getIp0040PersonPresentInd() throws CFException {
       if (isIp0040PersonPresentIndModified()) { 
           ip0040PersonPresentInd = refreshIp0040PersonPresentInd();
        }
   		return ip0040PersonPresentInd;
	}
	

	
	   
	/**
	 * 	Update Ip0040PersonPresentInd with the passed value
	 *  Corresponding COBOL Variable is IP0040-PERSON-PRESENT-IND
	 *	@param number
	 */
	public void setIp0040PersonPresentInd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040PersonPresentInd = checkIp0040PersonPresentIndMaxLimit(number); 
		serializeIp0040PersonPresentInd(ip0040PersonPresentInd);
	}
	

	public void setIp0040PersonPresentInd(long number) {
	    number = checkIp0040PersonPresentIndMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0040PersonPresentInd((int)number);
	}
	
	/**
	 * 	Update Ip0040PersonPresentInd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040PersonPresentInd(char[] value) throws CFException {
		 ip0040PersonPresentInd = serializeIp0040PersonPresentInd(value);
	}
	/**
	 * 	Update Ip0040PersonPresentInd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040PersonPresentIndString(char[] value) throws CFException {
		 setIp0040PersonPresentInd(value);
	}
	/**
	 *	Returns the value of ip0040CrossBdrException
	 *	@return ip0040CrossBdrException
	 */
   public char[] getIp0040CrossBdrException() throws CFException{
     if (isIp0040CrossBdrExceptionModified()) { 
        ip0040CrossBdrException = refreshIp0040CrossBdrException();
     }
   		return ip0040CrossBdrException;
   }

  
	/**
	*  set variable ip0040CrossBdrException
	*  Corresponding COBOL Variable is IP0040-CROSS-BDR-EXCEPTION
	*  @param value
	**/
   public void setIp0040CrossBdrException(char[] value) {
      ip0040CrossBdrException = checkIp0040CrossBdrExceptionConstraints(value);
      serializeIp0040CrossBdrException(ip0040CrossBdrException);
   } 

     /**
	 * 	Update Ip0040CrossBdrException 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040CrossBdrException(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040CrossBdrException,ip0040CrossBdrException.length);
   	
   }
   
   public void setIp0040CrossBdrException(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040CrossBdrException,ip0040CrossBdrException.length);
   	
   }
   
     /**
	 * 	Update Ip0040CrossBdrException 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040CrossBdrException(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040CrossBdrException+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040CrossBdrException with another Field
	 *	@param value
	 */
   public void setIp0040CrossBdrException(Field source) {
       replace(source,0,source.length(),beginIp0040CrossBdrException,IP_0040_CROSS_BDR_EXCEPTION_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040CrossBdrException 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040CrossBdrException(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040CrossBdrException,IP_0040_CROSS_BDR_EXCEPTION_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040CrossBdrException 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040CrossBdrException(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040CrossBdrException+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040IssTargetMarketInd
	 *	@return ip0040IssTargetMarketInd
	 */
   public char[] getIp0040IssTargetMarketInd() throws CFException{
     if (isIp0040IssTargetMarketIndModified()) { 
        ip0040IssTargetMarketInd = refreshIp0040IssTargetMarketInd();
     }
   		return ip0040IssTargetMarketInd;
   }

  
	/**
	*  set variable ip0040IssTargetMarketInd
	*  Corresponding COBOL Variable is IP0040-ISS-TARGET-MARKET-IND
	*  @param value
	**/
   public void setIp0040IssTargetMarketInd(char[] value) {
      ip0040IssTargetMarketInd = checkIp0040IssTargetMarketIndConstraints(value);
      serializeIp0040IssTargetMarketInd(ip0040IssTargetMarketInd);
   } 

     /**
	 * 	Update Ip0040IssTargetMarketInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040IssTargetMarketInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040IssTargetMarketInd,ip0040IssTargetMarketInd.length);
   	
   }
   
   public void setIp0040IssTargetMarketInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040IssTargetMarketInd,ip0040IssTargetMarketInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040IssTargetMarketInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040IssTargetMarketInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040IssTargetMarketInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040IssTargetMarketInd with another Field
	 *	@param value
	 */
   public void setIp0040IssTargetMarketInd(Field source) {
       replace(source,0,source.length(),beginIp0040IssTargetMarketInd,IP_0040_ISS_TARGET_MARKET_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040IssTargetMarketInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040IssTargetMarketInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040IssTargetMarketInd,IP_0040_ISS_TARGET_MARKET_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040IssTargetMarketInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040IssTargetMarketInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040IssTargetMarketInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040PostDateServSw
	 *	@return ip0040PostDateServSw
	 */
   public char[] getIp0040PostDateServSw() throws CFException{
     if (isIp0040PostDateServSwModified()) { 
        ip0040PostDateServSw = refreshIp0040PostDateServSw();
     }
   		return ip0040PostDateServSw;
   }

  
	/**
	*  set variable ip0040PostDateServSw
	*  Corresponding COBOL Variable is IP0040-POST-DATE-SERV-SW
	*  @param value
	**/
   public void setIp0040PostDateServSw(char[] value) {
      ip0040PostDateServSw = checkIp0040PostDateServSwConstraints(value);
      serializeIp0040PostDateServSw(ip0040PostDateServSw);
   } 

     /**
	 * 	Update Ip0040PostDateServSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040PostDateServSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040PostDateServSw,ip0040PostDateServSw.length);
   	
   }
   
   public void setIp0040PostDateServSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040PostDateServSw,ip0040PostDateServSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040PostDateServSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040PostDateServSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040PostDateServSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040PostDateServSw with another Field
	 *	@param value
	 */
   public void setIp0040PostDateServSw(Field source) {
       replace(source,0,source.length(),beginIp0040PostDateServSw,IP_0040_POST_DATE_SERV_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040PostDateServSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040PostDateServSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040PostDateServSw,IP_0040_POST_DATE_SERV_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040PostDateServSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040PostDateServSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040PostDateServSw+targetIndex,targetLen);
    
   }
	char[] ip0040PostDteServSwY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040PostDteServSwY88()
	 *	@return  Returns true if isIp0040PostDteServSwY88() is "Y"
	 */
   public boolean isIp0040PostDteServSwY88() throws CFException {
      return (  compareChars( getIp0040PostDateServSw() , ip0040PostDteServSwY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040PostDteServSwY88True() {  			
    	setIp0040PostDateServSw( ip0040PostDteServSwY8888Value);
   	}
	char[] ip0040PostDteServSwN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040PostDteServSwN88()
	 *	@return  Returns true if isIp0040PostDteServSwN88() is "N"
	 */
   public boolean isIp0040PostDteServSwN88() throws CFException {
      return (  compareChars( getIp0040PostDateServSw() , ip0040PostDteServSwN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040PostDteServSwN88True() {  			
    	setIp0040PostDateServSw( ip0040PostDteServSwN8888Value);
   	}
	/**
	 *	Returns the value of ip0040MealVoucherInd
	 *	@return ip0040MealVoucherInd
	 */
   public char[] getIp0040MealVoucherInd() throws CFException{
     if (isIp0040MealVoucherIndModified()) { 
        ip0040MealVoucherInd = refreshIp0040MealVoucherInd();
     }
   		return ip0040MealVoucherInd;
   }

  
	/**
	*  set variable ip0040MealVoucherInd
	*  Corresponding COBOL Variable is IP0040-MEAL-VOUCHER-IND
	*  @param value
	**/
   public void setIp0040MealVoucherInd(char[] value) {
      ip0040MealVoucherInd = checkIp0040MealVoucherIndConstraints(value);
      serializeIp0040MealVoucherInd(ip0040MealVoucherInd);
   } 

     /**
	 * 	Update Ip0040MealVoucherInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040MealVoucherInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040MealVoucherInd,ip0040MealVoucherInd.length);
   	
   }
   
   public void setIp0040MealVoucherInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040MealVoucherInd,ip0040MealVoucherInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040MealVoucherInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040MealVoucherInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040MealVoucherInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040MealVoucherInd with another Field
	 *	@param value
	 */
   public void setIp0040MealVoucherInd(Field source) {
       replace(source,0,source.length(),beginIp0040MealVoucherInd,IP_0040_MEAL_VOUCHER_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040MealVoucherInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040MealVoucherInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040MealVoucherInd,IP_0040_MEAL_VOUCHER_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040MealVoucherInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040MealVoucherInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040MealVoucherInd+targetIndex,targetLen);
    
   }
	char[] ip0040MealVoucherIndY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040MealVoucherIndY88()
	 *	@return  Returns true if isIp0040MealVoucherIndY88() is "Y"
	 */
   public boolean isIp0040MealVoucherIndY88() throws CFException {
      return (  compareChars( getIp0040MealVoucherInd() , ip0040MealVoucherIndY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040MealVoucherIndY88True() {  			
    	setIp0040MealVoucherInd( ip0040MealVoucherIndY8888Value);
   	}
	char[] ip0040MealVoucherIndN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040MealVoucherIndN88()
	 *	@return  Returns true if isIp0040MealVoucherIndN88() is "N"
	 */
   public boolean isIp0040MealVoucherIndN88() throws CFException {
      return (  compareChars( getIp0040MealVoucherInd() , ip0040MealVoucherIndN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040MealVoucherIndN88True() {  			
    	setIp0040MealVoucherInd( ip0040MealVoucherIndN8888Value);
   	}
	/**
	 *	Returns the value of ip0040NonRldblPrpdSw
	 *	@return ip0040NonRldblPrpdSw
	 */
   public char[] getIp0040NonRldblPrpdSw() throws CFException{
     if (isIp0040NonRldblPrpdSwModified()) { 
        ip0040NonRldblPrpdSw = refreshIp0040NonRldblPrpdSw();
     }
   		return ip0040NonRldblPrpdSw;
   }

  
	/**
	*  set variable ip0040NonRldblPrpdSw
	*  Corresponding COBOL Variable is IP0040-NON-RLDBL-PRPD-SW
	*  @param value
	**/
   public void setIp0040NonRldblPrpdSw(char[] value) {
      ip0040NonRldblPrpdSw = checkIp0040NonRldblPrpdSwConstraints(value);
      serializeIp0040NonRldblPrpdSw(ip0040NonRldblPrpdSw);
   } 

     /**
	 * 	Update Ip0040NonRldblPrpdSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040NonRldblPrpdSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040NonRldblPrpdSw,ip0040NonRldblPrpdSw.length);
   	
   }
   
   public void setIp0040NonRldblPrpdSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040NonRldblPrpdSw,ip0040NonRldblPrpdSw.length);
   	
   }
   
     /**
	 * 	Update Ip0040NonRldblPrpdSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040NonRldblPrpdSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040NonRldblPrpdSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040NonRldblPrpdSw with another Field
	 *	@param value
	 */
   public void setIp0040NonRldblPrpdSw(Field source) {
       replace(source,0,source.length(),beginIp0040NonRldblPrpdSw,IP_0040_NON_RLDBL_PRPD_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040NonRldblPrpdSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040NonRldblPrpdSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040NonRldblPrpdSw,IP_0040_NON_RLDBL_PRPD_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040NonRldblPrpdSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040NonRldblPrpdSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040NonRldblPrpdSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040FasterFundsInd
	 *	@return ip0040FasterFundsInd
	 */
   public char[] getIp0040FasterFundsInd() throws CFException{
     if (isIp0040FasterFundsIndModified()) { 
        ip0040FasterFundsInd = refreshIp0040FasterFundsInd();
     }
   		return ip0040FasterFundsInd;
   }

  
	/**
	*  set variable ip0040FasterFundsInd
	*  Corresponding COBOL Variable is IP0040-FASTER-FUNDS-IND
	*  @param value
	**/
   public void setIp0040FasterFundsInd(char[] value) {
      ip0040FasterFundsInd = checkIp0040FasterFundsIndConstraints(value);
      serializeIp0040FasterFundsInd(ip0040FasterFundsInd);
   } 

     /**
	 * 	Update Ip0040FasterFundsInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040FasterFundsInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040FasterFundsInd,ip0040FasterFundsInd.length);
   	
   }
   
   public void setIp0040FasterFundsInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040FasterFundsInd,ip0040FasterFundsInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040FasterFundsInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040FasterFundsInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040FasterFundsInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040FasterFundsInd with another Field
	 *	@param value
	 */
   public void setIp0040FasterFundsInd(Field source) {
       replace(source,0,source.length(),beginIp0040FasterFundsInd,IP_0040_FASTER_FUNDS_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040FasterFundsInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040FasterFundsInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040FasterFundsInd,IP_0040_FASTER_FUNDS_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040FasterFundsInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040FasterFundsInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040FasterFundsInd+targetIndex,targetLen);
    
   }
	char[] ip0040FasterFundsNo8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040FasterFundsNo88()
	 *	@return  Returns true if isIp0040FasterFundsNo88() is "N"
	 */
   public boolean isIp0040FasterFundsNo88() throws CFException {
      return (  compareChars( getIp0040FasterFundsInd() , ip0040FasterFundsNo8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040FasterFundsNo88True() {  			
    	setIp0040FasterFundsInd( ip0040FasterFundsNo8888Value);
   	}
	char[] ip0040FasterFundsDom8888Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isIp0040FasterFundsDom88()
	 *	@return  Returns true if isIp0040FasterFundsDom88() is "D"
	 */
   public boolean isIp0040FasterFundsDom88() throws CFException {
      return (  compareChars( getIp0040FasterFundsInd() , ip0040FasterFundsDom8888Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setIp0040FasterFundsDom88True() {  			
    	setIp0040FasterFundsInd( ip0040FasterFundsDom8888Value);
   	}
	char[] ip0040FstrFndDomCrs8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp0040FstrFndDomCrs88()
	 *	@return  Returns true if isIp0040FstrFndDomCrs88() is "Y"
	 */
   public boolean isIp0040FstrFndDomCrs88() throws CFException {
      return (  compareChars( getIp0040FasterFundsInd() , ip0040FstrFndDomCrs8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp0040FstrFndDomCrs88True() {  			
    	setIp0040FasterFundsInd( ip0040FstrFndDomCrs8888Value);
   	}
	/**
	 *	Returns the value of ip0040AnonPrepaidInd
	 *	@return ip0040AnonPrepaidInd
	 */
   public char[] getIp0040AnonPrepaidInd() throws CFException{
     if (isIp0040AnonPrepaidIndModified()) { 
        ip0040AnonPrepaidInd = refreshIp0040AnonPrepaidInd();
     }
   		return ip0040AnonPrepaidInd;
   }

  
	/**
	*  set variable ip0040AnonPrepaidInd
	*  Corresponding COBOL Variable is IP0040-ANON-PREPAID-IND
	*  @param value
	**/
   public void setIp0040AnonPrepaidInd(char[] value) {
      ip0040AnonPrepaidInd = checkIp0040AnonPrepaidIndConstraints(value);
      serializeIp0040AnonPrepaidInd(ip0040AnonPrepaidInd);
   } 

     /**
	 * 	Update Ip0040AnonPrepaidInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040AnonPrepaidInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040AnonPrepaidInd,ip0040AnonPrepaidInd.length);
   	
   }
   
   public void setIp0040AnonPrepaidInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040AnonPrepaidInd,ip0040AnonPrepaidInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040AnonPrepaidInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040AnonPrepaidInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040AnonPrepaidInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040AnonPrepaidInd with another Field
	 *	@param value
	 */
   public void setIp0040AnonPrepaidInd(Field source) {
       replace(source,0,source.length(),beginIp0040AnonPrepaidInd,IP_0040_ANON_PREPAID_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040AnonPrepaidInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040AnonPrepaidInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040AnonPrepaidInd,IP_0040_ANON_PREPAID_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040AnonPrepaidInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040AnonPrepaidInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040AnonPrepaidInd+targetIndex,targetLen);
    
   }
	char[] ip0040AnonPrepaidIndN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp0040AnonPrepaidIndN88()
	 *	@return  Returns true if isIp0040AnonPrepaidIndN88() is "N"
	 */
   public boolean isIp0040AnonPrepaidIndN88() throws CFException {
      return (  compareChars( getIp0040AnonPrepaidInd() , ip0040AnonPrepaidIndN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp0040AnonPrepaidIndN88True() {  			
    	setIp0040AnonPrepaidInd( ip0040AnonPrepaidIndN8888Value);
   	}
	char[] ip0040AnonPrepaidIndE8888Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isIp0040AnonPrepaidIndE88()
	 *	@return  Returns true if isIp0040AnonPrepaidIndE88() is "E"
	 */
   public boolean isIp0040AnonPrepaidIndE88() throws CFException {
      return (  compareChars( getIp0040AnonPrepaidInd() , ip0040AnonPrepaidIndE8888Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setIp0040AnonPrepaidIndE88True() {  			
    	setIp0040AnonPrepaidInd( ip0040AnonPrepaidIndE8888Value);
   	}
	char[] ip0040AnonPrepaidIndA8888Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isIp0040AnonPrepaidIndA88()
	 *	@return  Returns true if isIp0040AnonPrepaidIndA88() is "A"
	 */
   public boolean isIp0040AnonPrepaidIndA88() throws CFException {
      return (  compareChars( getIp0040AnonPrepaidInd() , ip0040AnonPrepaidIndA8888Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setIp0040AnonPrepaidIndA88True() {  			
    	setIp0040AnonPrepaidInd( ip0040AnonPrepaidIndA8888Value);
   	}
	char[] ip0040AnonPrepaidIndU8888Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isIp0040AnonPrepaidIndU88()
	 *	@return  Returns true if isIp0040AnonPrepaidIndU88() is "U"
	 */
   public boolean isIp0040AnonPrepaidIndU88() throws CFException {
      return (  compareChars( getIp0040AnonPrepaidInd() , ip0040AnonPrepaidIndU8888Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setIp0040AnonPrepaidIndU88True() {  			
    	setIp0040AnonPrepaidInd( ip0040AnonPrepaidIndU8888Value);
   	}
	/**
	 *	Returns the value of ip0040DccStatusInd
	 *	@return ip0040DccStatusInd
	 */
   public char[] getIp0040DccStatusInd() throws CFException{
     if (isIp0040DccStatusIndModified()) { 
        ip0040DccStatusInd = refreshIp0040DccStatusInd();
     }
   		return ip0040DccStatusInd;
   }

  
	/**
	*  set variable ip0040DccStatusInd
	*  Corresponding COBOL Variable is IP0040-DCC-STATUS-IND
	*  @param value
	**/
   public void setIp0040DccStatusInd(char[] value) {
      ip0040DccStatusInd = checkIp0040DccStatusIndConstraints(value);
      serializeIp0040DccStatusInd(ip0040DccStatusInd);
   } 

     /**
	 * 	Update Ip0040DccStatusInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040DccStatusInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040DccStatusInd,ip0040DccStatusInd.length);
   	
   }
   
   public void setIp0040DccStatusInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040DccStatusInd,ip0040DccStatusInd.length);
   	
   }
   
     /**
	 * 	Update Ip0040DccStatusInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040DccStatusInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040DccStatusInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040DccStatusInd with another Field
	 *	@param value
	 */
   public void setIp0040DccStatusInd(Field source) {
       replace(source,0,source.length(),beginIp0040DccStatusInd,IP_0040_DCC_STATUS_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040DccStatusInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040DccStatusInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040DccStatusInd,IP_0040_DCC_STATUS_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040DccStatusInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040DccStatusInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040DccStatusInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0040MemberFiller
	 *	@return ip0040MemberFiller
	 */
   public char[] getIp0040MemberFiller() throws CFException{
     if (isIp0040MemberFillerModified()) { 
        ip0040MemberFiller = refreshIp0040MemberFiller();
     }
   		return ip0040MemberFiller;
   }

  
	/**
	*  set variable ip0040MemberFiller
	*  Corresponding COBOL Variable is IP0040-MEMBER-FILLER
	*  @param value
	**/
   public void setIp0040MemberFiller(char[] value) {
      ip0040MemberFiller = checkIp0040MemberFillerConstraints(value);
      serializeIp0040MemberFiller(ip0040MemberFiller);
   } 

     /**
	 * 	Update Ip0040MemberFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040MemberFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0040MemberFiller,ip0040MemberFiller.length);
   	
   }
   
   public void setIp0040MemberFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040MemberFiller,ip0040MemberFiller.length);
   	
   }
   
     /**
	 * 	Update Ip0040MemberFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040MemberFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040MemberFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0040MemberFiller with another Field
	 *	@param value
	 */
   public void setIp0040MemberFiller(Field source) {
       replace(source,0,source.length(),beginIp0040MemberFiller,IP_0040_MEMBER_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0040MemberFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040MemberFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0040MemberFiller,IP_0040_MEMBER_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Ip0040MemberFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040MemberFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0040MemberFiller+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip0040TableDataFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp0040AccRangeH(CONSTANTS.SPACE_19);
         setIp0040Ab(CONSTANTS.SPACE_3);
                     setIp0040PriorityCode(0);
                     setIp0040PrfxIca(0);
         setIp0040ProductType(CONSTANTS.SPACE);
                     setIp0040Endpoint(0);
         setIp0040Country(CONSTANTS.SPACE_3);
                     setIp0040CountryNum(0);
          ip0040RegionSubreg.initialize();
     
         setIp0040ProductClass(CONSTANTS.SPACE_3);
         setIp0040TranRoutingInd(CONSTANTS.SPACE);
         setIp0040PrsProdReassgnSw(CONSTANTS.SPACE);
         setIp0040ProdReassignmentSw(CONSTANTS.SPACE);
         setIp0040OptInFlag(CONSTANTS.SPACE);
         setIp0040LicensedProdId(CONSTANTS.SPACE_3);
         setIp0040VirtFundPanInd(CONSTANTS.SPACE);
         setIp0040AcctCatgPartSw(CONSTANTS.SPACE);
                     setIp0040AcctCatgActvnDate(0);
          ip0040CardHldrBlngCur.initialize();
     
         setIp0040ChipConversionSw(CONSTANTS.SPACE);
          ip0040FloorExpiryDate.initialize();
     
         setIp0040CoBrandSw(CONSTANTS.SPACE);
         setIp0040SpendControlRcnSw(CONSTANTS.SPACE);
         setIp0040MerchCleanServPart(CONSTANTS.SPACE_3);
                     setIp0040MerchCleanActvDate(0);
         setIp0040PaypassEnabledInd(CONSTANTS.SPACE);
         setIp0040RateTypeIndicator(CONSTANTS.SPACE);
         setIp0040RoutePsnIndicator(CONSTANTS.SPACE);
         setIp0040CbwpIndicator(CONSTANTS.SPACE);
         setIp0040FlexParticipInd(CONSTANTS.SPACE);
         setIp0040RepwrRldInd(CONSTANTS.SPACE);
         setIp0040MoneySendInd(CONSTANTS.SPACE);
         setIp0040RegulatedRateIndSw(CONSTANTS.SPACE);
         setIp0040CashAccessSw(CONSTANTS.SPACE);
                     setIp0040PersonPresentInd(0);
         setIp0040CrossBdrException(CONSTANTS.SPACE);
         setIp0040IssTargetMarketInd(CONSTANTS.SPACE);
         setIp0040PostDateServSw(CONSTANTS.SPACE);
         setIp0040MealVoucherInd(CONSTANTS.SPACE);
         setIp0040NonRldblPrpdSw(CONSTANTS.SPACE_2);
         setIp0040FasterFundsInd(CONSTANTS.SPACE);
         setIp0040AnonPrepaidInd(CONSTANTS.SPACE);
         setIp0040DccStatusInd(CONSTANTS.SPACE);
         setIp0040MemberFiller(CONSTANTS.SPACE_14);
   }

		public static int getIp0040TableDataFieldsFieldLength() {
			return IP_0040_TABLE_DATA_FIELDS_LENGTH;
		}

}
  
