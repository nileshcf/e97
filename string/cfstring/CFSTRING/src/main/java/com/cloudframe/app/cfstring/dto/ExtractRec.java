package com.cloudframe.app.cfstring.dto;

/**
*  The class ExtractRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.cfstring.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.*;


public class ExtractRec extends ExtractRecSerialized {
   

						private char[] extMtn = Field.fillLowValue(10);

						private char[] extLname = Field.fillLowValue(25);

						private char[] extFname = Field.fillLowValue(20);
				private ExtActEffDt extActEffDt = new ExtActEffDt();

						private char[] extCarrierName = new char[30];

						private char[] extDeviceId = new char[20];

						private char[] extRegionCd = new char[2];

								private long extOutletId;

						private char[] extMfgNme = new char[30];

						private char[] extProdNme = Field.fillLowValue(32);

						private char[] extAddr1 = new char[30];

						private char[] extAddr2 = Field.fillLowValue(30);

						private char[] extCity = new char[30];

						private char[] extState = new char[2];

						private char[] extZipCode = new char[9];

						private char[] extAnalogDigitalCd = new char[1];

						private char[] extTermnlOptCd = new char[1];

						private char[] extWarranty = new char[1];

						private char[] extMtnEffDt = new char[8];
				private ExtCustAcctNo extCustAcctNo = new ExtCustAcctNo();

						private char[] extActDeact = Field.fillLowValue(1);
				private ExtFlds extFlds = new ExtFlds();

								private int extAuserCnt;
			private List<ExtAuthUsers> extAuthUsers = new ArrayList<>();
    	

						private char[] extIccid = Field.fillLowValue(20);

						private char[] extDeviceIdType = Field.fillLowValue(3);

						private char[] dvcTransRsnCd = Field.fillLowValue(2);

						private char[] extActvReqDt = Field.fillLowValue(10);

						private char[] extCustTypeCd = Field.fillLowValue(2);

						private char[] extSfoSpoIndicator = Field.fillLowValue(3);

						private char[] extLevel = Field.fillLowValue(1);

						private char[] extLineStatus = Field.fillLowValue(2);

						private char[] extFinMarketCode = Field.fillLowValue(3);

						private char[] extEmailAddr1 = Field.fillLowValue(60);

						private char[] extEmailAddr2 = Field.fillLowValue(60);

						private char[] extEmailAddr3 = Field.fillLowValue(60);

						private char[] extLocationState = Field.fillLowValue(2);

								private long extUniqueId;

						private char[] extBrandIdentifier = Field.fillLowValue(1);
				private ExtBillCycleDt extBillCycleDt = new ExtBillCycleDt();
				private ExtServiceStartDt extServiceStartDt = new ExtServiceStartDt();

						private char[] extSlsRepId = Field.fillLowValue(5);

						private char[] extSlsRepLname = Field.fillLowValue(25);

						private char[] extSlsRepFname = Field.fillLowValue(20);

						private char[] extChnlDetail = Field.fillLowValue(20);

						private char[] extOutletName = Field.fillLowValue(30);

						private char[] extDistrictDesc = Field.fillLowValue(20);

						private char[] extVzMktDesc = Field.fillLowValue(20);

						private char[] extUniqueIdLine = Field.fillLowValue(25);

						private char[] extSvcAddr1 = Field.fillLowValue(30);

						private char[] extSvcAddr2 = Field.fillLowValue(30);

						private char[] extSvcCity = Field.fillLowValue(30);

						private char[] extSvcState = Field.fillLowValue(2);

						private char[] extSvcZipCode = Field.fillLowValue(9);
				private ExtShsArea extShsArea = new ExtShsArea();

						private char[] extSkuId = Field.fillLowValue(20);
	
	/**
	* Constructor for ExtractRec
	**/
    public ExtractRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			extActEffDt.setParent(this,getStartOffset() + 55);
	       			extCustAcctNo.setParent(this,getStartOffset() + 298);
	       			extFlds.setParent(this,getStartOffset() + 314);
				for (int arrayIndex = 0; arrayIndex < EXT_AUTH_USERS_SIZE;arrayIndex++) {
						extAuthUsers.add(new ExtAuthUsers(this, beginExtAuthUsers + 
						arrayIndex * ExtAuthUsers.getExtAuthUsersFieldLength()));
				}
	       			extBillCycleDt.setParent(this,getStartOffset() + 1046);
	       			extServiceStartDt.setParent(this,getStartOffset() + 1056);
	       			extShsArea.setParent(this,getStartOffset() + 1332);
	   	/*  end of offset */
								setExtCarrierName(("VERIZON                       ").toCharArray());
								setExtDeviceId(("DEVICEID            ").toCharArray());
								setExtRegionCd(("NE").toCharArray());
								setExtOutletId(15123L);
								setExtMfgNme(("SAMSUNG                       ").toCharArray());
								setExtAddr1(("63 AMBER                      ").toCharArray());
								setExtCity(("ROBBINSVILLE                  ").toCharArray());
								setExtState(("NJ").toCharArray());
								setExtZipCode(("08691    ").toCharArray());
								setExtAnalogDigitalCd(("A").toCharArray());
								setExtTermnlOptCd(("P").toCharArray());
								setExtWarranty(("N").toCharArray());
								setExtMtnEffDt(("12/10/01").toCharArray());
    }


 

	/**
	 *	Returns the value of extMtn
	 *	@return extMtn
	 */
   public char[] getExtMtn() throws CFException{
     if (isExtMtnModified()) { 
        extMtn = refreshExtMtn();
     }
   		return extMtn;
   }

  
	/**
	*  set variable extMtn
	*  Corresponding COBOL Variable is WS-EXT-MTN
	*  @param value
	**/
   public void setExtMtn(char[] value) {
      extMtn = checkExtMtnConstraints(value);
      serializeExtMtn(extMtn);
   } 

     /**
	 * 	Update ExtMtn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtMtn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtMtn,extMtn.length);
   	
   }
   
   public void setExtMtn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtMtn,extMtn.length);
   	
   }
   
     /**
	 * 	Update ExtMtn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtMtn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtMtn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtMtn with another Field
	 *	@param value
	 */
   public void setExtMtn(Field source) {
       replace(source,0,source.length(),beginExtMtn,EXT_MTN_LEN);
   	
   }  
   
     /**
	 * 	Update ExtMtn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtMtn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtMtn,EXT_MTN_LEN);
   	
   }
   
     /**
	 * 	Update ExtMtn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtMtn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtMtn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extLname
	 *	@return extLname
	 */
   public char[] getExtLname() throws CFException{
     if (isExtLnameModified()) { 
        extLname = refreshExtLname();
     }
   		return extLname;
   }

  
	/**
	*  set variable extLname
	*  Corresponding COBOL Variable is WS-EXT-LNAME
	*  @param value
	**/
   public void setExtLname(char[] value) {
      extLname = checkExtLnameConstraints(value);
      serializeExtLname(extLname);
   } 

     /**
	 * 	Update ExtLname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtLname(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtLname,extLname.length);
   	
   }
   
   public void setExtLname(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtLname,extLname.length);
   	
   }
   
     /**
	 * 	Update ExtLname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtLname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtLname+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtLname with another Field
	 *	@param value
	 */
   public void setExtLname(Field source) {
       replace(source,0,source.length(),beginExtLname,EXT_LNAME_LEN);
   	
   }  
   
     /**
	 * 	Update ExtLname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtLname(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtLname,EXT_LNAME_LEN);
   	
   }
   
     /**
	 * 	Update ExtLname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtLname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtLname+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extFname
	 *	@return extFname
	 */
   public char[] getExtFname() throws CFException{
     if (isExtFnameModified()) { 
        extFname = refreshExtFname();
     }
   		return extFname;
   }

  
	/**
	*  set variable extFname
	*  Corresponding COBOL Variable is WS-EXT-FNAME
	*  @param value
	**/
   public void setExtFname(char[] value) {
      extFname = checkExtFnameConstraints(value);
      serializeExtFname(extFname);
   } 

     /**
	 * 	Update ExtFname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtFname(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtFname,extFname.length);
   	
   }
   
   public void setExtFname(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtFname,extFname.length);
   	
   }
   
     /**
	 * 	Update ExtFname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtFname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtFname+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtFname with another Field
	 *	@param value
	 */
   public void setExtFname(Field source) {
       replace(source,0,source.length(),beginExtFname,EXT_FNAME_LEN);
   	
   }  
   
     /**
	 * 	Update ExtFname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtFname(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtFname,EXT_FNAME_LEN);
   	
   }
   
     /**
	 * 	Update ExtFname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtFname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtFname+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extActEffDt
	 *	@return extActEffDt
	 */   
	 public ExtActEffDt getExtActEffDt() {
   	return extActEffDt;
   }
   /**
	* 	Update ExtActEffDt with the passed value
	*   Corresponding COBOL Variable is WS-EXT-ACT-EFF-DT
	*	@param value
	*/
   public void setExtActEffDt(char[] value) {
      extActEffDt.setString(value); 
   }   
    
     /**
	 * 	Update ExtActEffDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setExtActEffDt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,extActEffDt.begin,extActEffDt.length());
   }
   
     /**
	 * 	Update ExtActEffDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtActEffDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,extActEffDt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ExtActEffDt with another Field
	 *	@param value
	 */
   public void setExtActEffDt(Field source) {
   	replace(source,0,source.length(),extActEffDt.begin,extActEffDt.length());
   }  
   
     /**
	 * 	Update ExtActEffDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setExtActEffDt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,extActEffDt.begin,extActEffDt.length());
   }
   
     /**
	 * 	Update ExtActEffDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtActEffDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,extActEffDt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of extCarrierName
	 *	@return extCarrierName
	 */
   public char[] getExtCarrierName() throws CFException{
     if (isExtCarrierNameModified()) { 
        extCarrierName = refreshExtCarrierName();
     }
   		return extCarrierName;
   }

  
	/**
	*  set variable extCarrierName
	*  Corresponding COBOL Variable is WS-EXT-CARRIER-NAME
	*  @param value
	**/
   public void setExtCarrierName(char[] value) {
      extCarrierName = checkExtCarrierNameConstraints(value);
      serializeExtCarrierName(extCarrierName);
   } 

     /**
	 * 	Update ExtCarrierName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtCarrierName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtCarrierName,extCarrierName.length);
   	
   }
   
   public void setExtCarrierName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtCarrierName,extCarrierName.length);
   	
   }
   
     /**
	 * 	Update ExtCarrierName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtCarrierName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtCarrierName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtCarrierName with another Field
	 *	@param value
	 */
   public void setExtCarrierName(Field source) {
       replace(source,0,source.length(),beginExtCarrierName,EXT_CARRIER_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update ExtCarrierName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtCarrierName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtCarrierName,EXT_CARRIER_NAME_LEN);
   	
   }
   
     /**
	 * 	Update ExtCarrierName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtCarrierName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtCarrierName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extDeviceId
	 *	@return extDeviceId
	 */
   public char[] getExtDeviceId() throws CFException{
     if (isExtDeviceIdModified()) { 
        extDeviceId = refreshExtDeviceId();
     }
   		return extDeviceId;
   }

  
	/**
	*  set variable extDeviceId
	*  Corresponding COBOL Variable is WS-EXT-DEVICE-ID
	*  @param value
	**/
   public void setExtDeviceId(char[] value) {
      extDeviceId = checkExtDeviceIdConstraints(value);
      serializeExtDeviceId(extDeviceId);
   } 

     /**
	 * 	Update ExtDeviceId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtDeviceId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtDeviceId,extDeviceId.length);
   	
   }
   
   public void setExtDeviceId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtDeviceId,extDeviceId.length);
   	
   }
   
     /**
	 * 	Update ExtDeviceId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtDeviceId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtDeviceId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtDeviceId with another Field
	 *	@param value
	 */
   public void setExtDeviceId(Field source) {
       replace(source,0,source.length(),beginExtDeviceId,EXT_DEVICE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update ExtDeviceId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtDeviceId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtDeviceId,EXT_DEVICE_ID_LEN);
   	
   }
   
     /**
	 * 	Update ExtDeviceId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtDeviceId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtDeviceId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extRegionCd
	 *	@return extRegionCd
	 */
   public char[] getExtRegionCd() throws CFException{
     if (isExtRegionCdModified()) { 
        extRegionCd = refreshExtRegionCd();
     }
   		return extRegionCd;
   }

  
	/**
	*  set variable extRegionCd
	*  Corresponding COBOL Variable is WS-EXT-REGION-CD
	*  @param value
	**/
   public void setExtRegionCd(char[] value) {
      extRegionCd = checkExtRegionCdConstraints(value);
      serializeExtRegionCd(extRegionCd);
   } 

     /**
	 * 	Update ExtRegionCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtRegionCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtRegionCd,extRegionCd.length);
   	
   }
   
   public void setExtRegionCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtRegionCd,extRegionCd.length);
   	
   }
   
     /**
	 * 	Update ExtRegionCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtRegionCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtRegionCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtRegionCd with another Field
	 *	@param value
	 */
   public void setExtRegionCd(Field source) {
       replace(source,0,source.length(),beginExtRegionCd,EXT_REGION_CD_LEN);
   	
   }  
   
     /**
	 * 	Update ExtRegionCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtRegionCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtRegionCd,EXT_REGION_CD_LEN);
   	
   }
   
     /**
	 * 	Update ExtRegionCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtRegionCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtRegionCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extOutletId
	 *	@return extOutletId
	 */
	public long getExtOutletId() throws CFException {
       if (isExtOutletIdModified()) { 
           extOutletId = refreshExtOutletId();
        }
   		return extOutletId;
	}
	

	
	   
	/**
	 * 	Update ExtOutletId with the passed value
	 *  Corresponding COBOL Variable is WS-EXT-OUTLET-ID
	 *	@param number
	 */
	public void setExtOutletId(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    extOutletId = checkExtOutletIdMaxLimit(number); 
		serializeExtOutletId(extOutletId);
	}
	

	/**
	 * 	Update ExtOutletId with the passed value
	 *	@param value (String or char[])
	 */
	public void setExtOutletId(char[] value) throws CFException {
		 extOutletId = serializeExtOutletId(value);
	}
	/**
	 * 	Update ExtOutletId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExtOutletIdString(char[] value) throws CFException {
		 setExtOutletId(value);
	}
	/**
	 *	Returns the value of extMfgNme
	 *	@return extMfgNme
	 */
   public char[] getExtMfgNme() throws CFException{
     if (isExtMfgNmeModified()) { 
        extMfgNme = refreshExtMfgNme();
     }
   		return extMfgNme;
   }

  
	/**
	*  set variable extMfgNme
	*  Corresponding COBOL Variable is WS-EXT-MFG-NME
	*  @param value
	**/
   public void setExtMfgNme(char[] value) {
      extMfgNme = checkExtMfgNmeConstraints(value);
      serializeExtMfgNme(extMfgNme);
   } 

     /**
	 * 	Update ExtMfgNme 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtMfgNme(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtMfgNme,extMfgNme.length);
   	
   }
   
   public void setExtMfgNme(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtMfgNme,extMfgNme.length);
   	
   }
   
     /**
	 * 	Update ExtMfgNme 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtMfgNme(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtMfgNme+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtMfgNme with another Field
	 *	@param value
	 */
   public void setExtMfgNme(Field source) {
       replace(source,0,source.length(),beginExtMfgNme,EXT_MFG_NME_LEN);
   	
   }  
   
     /**
	 * 	Update ExtMfgNme 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtMfgNme(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtMfgNme,EXT_MFG_NME_LEN);
   	
   }
   
     /**
	 * 	Update ExtMfgNme 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtMfgNme(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtMfgNme+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extProdNme
	 *	@return extProdNme
	 */
   public char[] getExtProdNme() throws CFException{
     if (isExtProdNmeModified()) { 
        extProdNme = refreshExtProdNme();
     }
   		return extProdNme;
   }

  
	/**
	*  set variable extProdNme
	*  Corresponding COBOL Variable is WS-EXT-PROD-NME
	*  @param value
	**/
   public void setExtProdNme(char[] value) {
      extProdNme = checkExtProdNmeConstraints(value);
      serializeExtProdNme(extProdNme);
   } 

     /**
	 * 	Update ExtProdNme 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtProdNme(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtProdNme,extProdNme.length);
   	
   }
   
   public void setExtProdNme(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtProdNme,extProdNme.length);
   	
   }
   
     /**
	 * 	Update ExtProdNme 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtProdNme(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtProdNme+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtProdNme with another Field
	 *	@param value
	 */
   public void setExtProdNme(Field source) {
       replace(source,0,source.length(),beginExtProdNme,EXT_PROD_NME_LEN);
   	
   }  
   
     /**
	 * 	Update ExtProdNme 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtProdNme(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtProdNme,EXT_PROD_NME_LEN);
   	
   }
   
     /**
	 * 	Update ExtProdNme 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtProdNme(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtProdNme+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extAddr1
	 *	@return extAddr1
	 */
   public char[] getExtAddr1() throws CFException{
     if (isExtAddr1Modified()) { 
        extAddr1 = refreshExtAddr1();
     }
   		return extAddr1;
   }

  
	/**
	*  set variable extAddr1
	*  Corresponding COBOL Variable is WS-EXT-ADDR1
	*  @param value
	**/
   public void setExtAddr1(char[] value) {
      extAddr1 = checkExtAddr1Constraints(value);
      serializeExtAddr1(extAddr1);
   } 

     /**
	 * 	Update ExtAddr1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtAddr1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtAddr1,extAddr1.length);
   	
   }
   
   public void setExtAddr1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtAddr1,extAddr1.length);
   	
   }
   
     /**
	 * 	Update ExtAddr1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtAddr1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtAddr1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtAddr1 with another Field
	 *	@param value
	 */
   public void setExtAddr1(Field source) {
       replace(source,0,source.length(),beginExtAddr1,EXT_ADDR_1_LEN);
   	
   }  
   
     /**
	 * 	Update ExtAddr1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtAddr1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtAddr1,EXT_ADDR_1_LEN);
   	
   }
   
     /**
	 * 	Update ExtAddr1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtAddr1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtAddr1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extAddr2
	 *	@return extAddr2
	 */
   public char[] getExtAddr2() throws CFException{
     if (isExtAddr2Modified()) { 
        extAddr2 = refreshExtAddr2();
     }
   		return extAddr2;
   }

  
	/**
	*  set variable extAddr2
	*  Corresponding COBOL Variable is WS-EXT-ADDR2
	*  @param value
	**/
   public void setExtAddr2(char[] value) {
      extAddr2 = checkExtAddr2Constraints(value);
      serializeExtAddr2(extAddr2);
   } 

     /**
	 * 	Update ExtAddr2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtAddr2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtAddr2,extAddr2.length);
   	
   }
   
   public void setExtAddr2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtAddr2,extAddr2.length);
   	
   }
   
     /**
	 * 	Update ExtAddr2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtAddr2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtAddr2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtAddr2 with another Field
	 *	@param value
	 */
   public void setExtAddr2(Field source) {
       replace(source,0,source.length(),beginExtAddr2,EXT_ADDR_2_LEN);
   	
   }  
   
     /**
	 * 	Update ExtAddr2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtAddr2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtAddr2,EXT_ADDR_2_LEN);
   	
   }
   
     /**
	 * 	Update ExtAddr2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtAddr2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtAddr2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extCity
	 *	@return extCity
	 */
   public char[] getExtCity() throws CFException{
     if (isExtCityModified()) { 
        extCity = refreshExtCity();
     }
   		return extCity;
   }

  
	/**
	*  set variable extCity
	*  Corresponding COBOL Variable is WS-EXT-CITY
	*  @param value
	**/
   public void setExtCity(char[] value) {
      extCity = checkExtCityConstraints(value);
      serializeExtCity(extCity);
   } 

     /**
	 * 	Update ExtCity 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtCity(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtCity,extCity.length);
   	
   }
   
   public void setExtCity(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtCity,extCity.length);
   	
   }
   
     /**
	 * 	Update ExtCity 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtCity(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtCity+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtCity with another Field
	 *	@param value
	 */
   public void setExtCity(Field source) {
       replace(source,0,source.length(),beginExtCity,EXT_CITY_LEN);
   	
   }  
   
     /**
	 * 	Update ExtCity 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtCity(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtCity,EXT_CITY_LEN);
   	
   }
   
     /**
	 * 	Update ExtCity 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtCity(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtCity+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extState
	 *	@return extState
	 */
   public char[] getExtState() throws CFException{
     if (isExtStateModified()) { 
        extState = refreshExtState();
     }
   		return extState;
   }

  
	/**
	*  set variable extState
	*  Corresponding COBOL Variable is WS-EXT-STATE
	*  @param value
	**/
   public void setExtState(char[] value) {
      extState = checkExtStateConstraints(value);
      serializeExtState(extState);
   } 

     /**
	 * 	Update ExtState 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtState(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtState,extState.length);
   	
   }
   
   public void setExtState(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtState,extState.length);
   	
   }
   
     /**
	 * 	Update ExtState 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtState(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtState+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtState with another Field
	 *	@param value
	 */
   public void setExtState(Field source) {
       replace(source,0,source.length(),beginExtState,EXT_STATE_LEN);
   	
   }  
   
     /**
	 * 	Update ExtState 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtState(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtState,EXT_STATE_LEN);
   	
   }
   
     /**
	 * 	Update ExtState 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtState(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtState+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extZipCode
	 *	@return extZipCode
	 */
   public char[] getExtZipCode() throws CFException{
     if (isExtZipCodeModified()) { 
        extZipCode = refreshExtZipCode();
     }
   		return extZipCode;
   }

  
	/**
	*  set variable extZipCode
	*  Corresponding COBOL Variable is WS-EXT-ZIP-CODE
	*  @param value
	**/
   public void setExtZipCode(char[] value) {
      extZipCode = checkExtZipCodeConstraints(value);
      serializeExtZipCode(extZipCode);
   } 

     /**
	 * 	Update ExtZipCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtZipCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtZipCode,extZipCode.length);
   	
   }
   
   public void setExtZipCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtZipCode,extZipCode.length);
   	
   }
   
     /**
	 * 	Update ExtZipCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtZipCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtZipCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtZipCode with another Field
	 *	@param value
	 */
   public void setExtZipCode(Field source) {
       replace(source,0,source.length(),beginExtZipCode,EXT_ZIP_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update ExtZipCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtZipCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtZipCode,EXT_ZIP_CODE_LEN);
   	
   }
   
     /**
	 * 	Update ExtZipCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtZipCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtZipCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extAnalogDigitalCd
	 *	@return extAnalogDigitalCd
	 */
   public char[] getExtAnalogDigitalCd() throws CFException{
     if (isExtAnalogDigitalCdModified()) { 
        extAnalogDigitalCd = refreshExtAnalogDigitalCd();
     }
   		return extAnalogDigitalCd;
   }

  
	/**
	*  set variable extAnalogDigitalCd
	*  Corresponding COBOL Variable is WS-EXT-ANALOG-DIGITAL-CD
	*  @param value
	**/
   public void setExtAnalogDigitalCd(char[] value) {
      extAnalogDigitalCd = checkExtAnalogDigitalCdConstraints(value);
      serializeExtAnalogDigitalCd(extAnalogDigitalCd);
   } 

     /**
	 * 	Update ExtAnalogDigitalCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtAnalogDigitalCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtAnalogDigitalCd,extAnalogDigitalCd.length);
   	
   }
   
   public void setExtAnalogDigitalCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtAnalogDigitalCd,extAnalogDigitalCd.length);
   	
   }
   
     /**
	 * 	Update ExtAnalogDigitalCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtAnalogDigitalCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtAnalogDigitalCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtAnalogDigitalCd with another Field
	 *	@param value
	 */
   public void setExtAnalogDigitalCd(Field source) {
       replace(source,0,source.length(),beginExtAnalogDigitalCd,EXT_ANALOG_DIGITAL_CD_LEN);
   	
   }  
   
     /**
	 * 	Update ExtAnalogDigitalCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtAnalogDigitalCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtAnalogDigitalCd,EXT_ANALOG_DIGITAL_CD_LEN);
   	
   }
   
     /**
	 * 	Update ExtAnalogDigitalCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtAnalogDigitalCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtAnalogDigitalCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extTermnlOptCd
	 *	@return extTermnlOptCd
	 */
   public char[] getExtTermnlOptCd() throws CFException{
     if (isExtTermnlOptCdModified()) { 
        extTermnlOptCd = refreshExtTermnlOptCd();
     }
   		return extTermnlOptCd;
   }

  
	/**
	*  set variable extTermnlOptCd
	*  Corresponding COBOL Variable is WS-EXT-TERMNL-OPT-CD
	*  @param value
	**/
   public void setExtTermnlOptCd(char[] value) {
      extTermnlOptCd = checkExtTermnlOptCdConstraints(value);
      serializeExtTermnlOptCd(extTermnlOptCd);
   } 

     /**
	 * 	Update ExtTermnlOptCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtTermnlOptCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtTermnlOptCd,extTermnlOptCd.length);
   	
   }
   
   public void setExtTermnlOptCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtTermnlOptCd,extTermnlOptCd.length);
   	
   }
   
     /**
	 * 	Update ExtTermnlOptCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtTermnlOptCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtTermnlOptCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtTermnlOptCd with another Field
	 *	@param value
	 */
   public void setExtTermnlOptCd(Field source) {
       replace(source,0,source.length(),beginExtTermnlOptCd,EXT_TERMNL_OPT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update ExtTermnlOptCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtTermnlOptCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtTermnlOptCd,EXT_TERMNL_OPT_CD_LEN);
   	
   }
   
     /**
	 * 	Update ExtTermnlOptCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtTermnlOptCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtTermnlOptCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extWarranty
	 *	@return extWarranty
	 */
   public char[] getExtWarranty() throws CFException{
     if (isExtWarrantyModified()) { 
        extWarranty = refreshExtWarranty();
     }
   		return extWarranty;
   }

  
	/**
	*  set variable extWarranty
	*  Corresponding COBOL Variable is WS-EXT-WARRANTY
	*  @param value
	**/
   public void setExtWarranty(char[] value) {
      extWarranty = checkExtWarrantyConstraints(value);
      serializeExtWarranty(extWarranty);
   } 

     /**
	 * 	Update ExtWarranty 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtWarranty(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtWarranty,extWarranty.length);
   	
   }
   
   public void setExtWarranty(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtWarranty,extWarranty.length);
   	
   }
   
     /**
	 * 	Update ExtWarranty 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtWarranty(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtWarranty+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtWarranty with another Field
	 *	@param value
	 */
   public void setExtWarranty(Field source) {
       replace(source,0,source.length(),beginExtWarranty,EXT_WARRANTY_LEN);
   	
   }  
   
     /**
	 * 	Update ExtWarranty 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtWarranty(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtWarranty,EXT_WARRANTY_LEN);
   	
   }
   
     /**
	 * 	Update ExtWarranty 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtWarranty(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtWarranty+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extMtnEffDt
	 *	@return extMtnEffDt
	 */
   public char[] getExtMtnEffDt() throws CFException{
     if (isExtMtnEffDtModified()) { 
        extMtnEffDt = refreshExtMtnEffDt();
     }
   		return extMtnEffDt;
   }

  
	/**
	*  set variable extMtnEffDt
	*  Corresponding COBOL Variable is WS-EXT-MTN-EFF-DT
	*  @param value
	**/
   public void setExtMtnEffDt(char[] value) {
      extMtnEffDt = checkExtMtnEffDtConstraints(value);
      serializeExtMtnEffDt(extMtnEffDt);
   } 

     /**
	 * 	Update ExtMtnEffDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtMtnEffDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtMtnEffDt,extMtnEffDt.length);
   	
   }
   
   public void setExtMtnEffDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtMtnEffDt,extMtnEffDt.length);
   	
   }
   
     /**
	 * 	Update ExtMtnEffDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtMtnEffDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtMtnEffDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtMtnEffDt with another Field
	 *	@param value
	 */
   public void setExtMtnEffDt(Field source) {
       replace(source,0,source.length(),beginExtMtnEffDt,EXT_MTN_EFF_DT_LEN);
   	
   }  
   
     /**
	 * 	Update ExtMtnEffDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtMtnEffDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtMtnEffDt,EXT_MTN_EFF_DT_LEN);
   	
   }
   
     /**
	 * 	Update ExtMtnEffDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtMtnEffDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtMtnEffDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extCustAcctNo
	 *	@return extCustAcctNo
	 */   
	 public ExtCustAcctNo getExtCustAcctNo() {
   	return extCustAcctNo;
   }
   /**
	* 	Update ExtCustAcctNo with the passed value
	*   Corresponding COBOL Variable is WS-EXT-CUST-ACCT-NO
	*	@param value
	*/
   public void setExtCustAcctNo(char[] value) {
      extCustAcctNo.setString(value); 
   }   
    
     /**
	 * 	Update ExtCustAcctNo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setExtCustAcctNo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,extCustAcctNo.begin,extCustAcctNo.length());
   }
   
     /**
	 * 	Update ExtCustAcctNo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtCustAcctNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,extCustAcctNo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ExtCustAcctNo with another Field
	 *	@param value
	 */
   public void setExtCustAcctNo(Field source) {
   	replace(source,0,source.length(),extCustAcctNo.begin,extCustAcctNo.length());
   }  
   
     /**
	 * 	Update ExtCustAcctNo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setExtCustAcctNo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,extCustAcctNo.begin,extCustAcctNo.length());
   }
   
     /**
	 * 	Update ExtCustAcctNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtCustAcctNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,extCustAcctNo.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of extActDeact
	 *	@return extActDeact
	 */
   public char[] getExtActDeact() throws CFException{
     if (isExtActDeactModified()) { 
        extActDeact = refreshExtActDeact();
     }
   		return extActDeact;
   }

  
	/**
	*  set variable extActDeact
	*  Corresponding COBOL Variable is WS-EXT-ACT-DEACT
	*  @param value
	**/
   public void setExtActDeact(char[] value) {
      extActDeact = checkExtActDeactConstraints(value);
      serializeExtActDeact(extActDeact);
   } 

     /**
	 * 	Update ExtActDeact 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtActDeact(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtActDeact,extActDeact.length);
   	
   }
   
   public void setExtActDeact(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtActDeact,extActDeact.length);
   	
   }
   
     /**
	 * 	Update ExtActDeact 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtActDeact(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtActDeact+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtActDeact with another Field
	 *	@param value
	 */
   public void setExtActDeact(Field source) {
       replace(source,0,source.length(),beginExtActDeact,EXT_ACT_DEACT_LEN);
   	
   }  
   
     /**
	 * 	Update ExtActDeact 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtActDeact(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtActDeact,EXT_ACT_DEACT_LEN);
   	
   }
   
     /**
	 * 	Update ExtActDeact 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtActDeact(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtActDeact+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extFlds
	 *	@return extFlds
	 */   
	 public ExtFlds getExtFlds() {
   	return extFlds;
   }
   /**
	* 	Update ExtFlds with the passed value
	*   Corresponding COBOL Variable is WS-EXT-FLDS
	*	@param value
	*/
   public void setExtFlds(char[] value) {
      extFlds.setString(value); 
   }   
    
     /**
	 * 	Update ExtFlds 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setExtFlds(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,extFlds.begin,extFlds.length());
   }
   
     /**
	 * 	Update ExtFlds 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtFlds(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,extFlds.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ExtFlds with another Field
	 *	@param value
	 */
   public void setExtFlds(Field source) {
   	replace(source,0,source.length(),extFlds.begin,extFlds.length());
   }  
   
     /**
	 * 	Update ExtFlds 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setExtFlds(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,extFlds.begin,extFlds.length());
   }
   
     /**
	 * 	Update ExtFlds 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtFlds(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,extFlds.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of extAuserCnt
	 *	@return extAuserCnt
	 */
	public int getExtAuserCnt() throws CFException {
       if (isExtAuserCntModified()) { 
           extAuserCnt = refreshExtAuserCnt();
        }
   		return extAuserCnt;
	}
	

	
	   
	/**
	 * 	Update ExtAuserCnt with the passed value
	 *  Corresponding COBOL Variable is WS-EXT-AUSER-CNT
	 *	@param number
	 */
	public void setExtAuserCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    extAuserCnt = checkExtAuserCntMaxLimit(number); 
		serializeExtAuserCnt(extAuserCnt);
	}
	

	public void setExtAuserCnt(long number) {
	    number = checkExtAuserCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setExtAuserCnt((int)number);
	}
	
	/**
	 * 	Update ExtAuserCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setExtAuserCnt(char[] value) throws CFException {
		 extAuserCnt = serializeExtAuserCnt(value);
	}
	/**
	 * 	Update ExtAuserCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExtAuserCntString(char[] value) throws CFException {
		 setExtAuserCnt(value);
	}
	/**
	 *	Returns the  value of extAuthUsers
	 *  Corresponding COBOL Variable is WS-EXT-AUTH-USERS
	 *	@return extAuthUsers
	 */
   public List<ExtAuthUsers> getExtAuthUsers() {
       return extAuthUsers;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return extAuthUsers
	 */
	public ExtAuthUsers getExtAuthUsers(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getExtAuthUsers(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= EXT_AUTH_USERS_SIZE) {
             	index = EXT_AUTH_USERS_SIZE -1; // can't exceed max array size
             	logger.trace("extAuthUsers - Array index exceeded max Size {}, resetting it to max allowed",EXT_AUTH_USERS_SIZE); 
	    }
		if (index >= extAuthUsers.size()) {
       		for (int fillIndex =  extAuthUsers.size() -1; fillIndex < index;fillIndex++) {
		       extAuthUsers.add(null);
		    }
			extAuthUsers.set(index,
			   	   	new ExtAuthUsers(this,beginExtAuthUsers + index * ExtAuthUsers.getExtAuthUsersFieldLength()) 
				                        ); 	
		} 
   	   ExtAuthUsers value = extAuthUsers.get(index);
   	   if (value == null) {
   	      extAuthUsers.set(index,
			   	   	new ExtAuthUsers(this,beginExtAuthUsers + index * ExtAuthUsers.getExtAuthUsersFieldLength()) 
				                        ); 
		  value = extAuthUsers.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update ExtAuthUsers at index with the passed value
	 *  Corresponding COBOL Variable is WS-EXT-AUTH-USERS
	 *  @param index
	 *	@param value
	 */
  public void setExtAuthUsers(int index,char[] value) {
   	getExtAuthUsers(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of extIccid
	 *	@return extIccid
	 */
   public char[] getExtIccid() throws CFException{
     if (isExtIccidModified()) { 
        extIccid = refreshExtIccid();
     }
   		return extIccid;
   }

  
	/**
	*  set variable extIccid
	*  Corresponding COBOL Variable is WS-EXT-ICCID
	*  @param value
	**/
   public void setExtIccid(char[] value) {
      extIccid = checkExtIccidConstraints(value);
      serializeExtIccid(extIccid);
   } 

     /**
	 * 	Update ExtIccid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtIccid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtIccid,extIccid.length);
   	
   }
   
   public void setExtIccid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtIccid,extIccid.length);
   	
   }
   
     /**
	 * 	Update ExtIccid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtIccid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtIccid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtIccid with another Field
	 *	@param value
	 */
   public void setExtIccid(Field source) {
       replace(source,0,source.length(),beginExtIccid,EXT_ICCID_LEN);
   	
   }  
   
     /**
	 * 	Update ExtIccid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtIccid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtIccid,EXT_ICCID_LEN);
   	
   }
   
     /**
	 * 	Update ExtIccid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtIccid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtIccid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extDeviceIdType
	 *	@return extDeviceIdType
	 */
   public char[] getExtDeviceIdType() throws CFException{
     if (isExtDeviceIdTypeModified()) { 
        extDeviceIdType = refreshExtDeviceIdType();
     }
   		return extDeviceIdType;
   }

  
	/**
	*  set variable extDeviceIdType
	*  Corresponding COBOL Variable is WS-EXT-DEVICE-ID-TYPE
	*  @param value
	**/
   public void setExtDeviceIdType(char[] value) {
      extDeviceIdType = checkExtDeviceIdTypeConstraints(value);
      serializeExtDeviceIdType(extDeviceIdType);
   } 

     /**
	 * 	Update ExtDeviceIdType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtDeviceIdType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtDeviceIdType,extDeviceIdType.length);
   	
   }
   
   public void setExtDeviceIdType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtDeviceIdType,extDeviceIdType.length);
   	
   }
   
     /**
	 * 	Update ExtDeviceIdType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtDeviceIdType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtDeviceIdType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtDeviceIdType with another Field
	 *	@param value
	 */
   public void setExtDeviceIdType(Field source) {
       replace(source,0,source.length(),beginExtDeviceIdType,EXT_DEVICE_ID_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update ExtDeviceIdType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtDeviceIdType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtDeviceIdType,EXT_DEVICE_ID_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update ExtDeviceIdType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtDeviceIdType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtDeviceIdType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dvcTransRsnCd
	 *	@return dvcTransRsnCd
	 */
   public char[] getDvcTransRsnCd() throws CFException{
     if (isDvcTransRsnCdModified()) { 
        dvcTransRsnCd = refreshDvcTransRsnCd();
     }
   		return dvcTransRsnCd;
   }

  
	/**
	*  set variable dvcTransRsnCd
	*  Corresponding COBOL Variable is WS-DVC-TRANS-RSN-CD
	*  @param value
	**/
   public void setDvcTransRsnCd(char[] value) {
      dvcTransRsnCd = checkDvcTransRsnCdConstraints(value);
      serializeDvcTransRsnCd(dvcTransRsnCd);
   } 

     /**
	 * 	Update DvcTransRsnCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDvcTransRsnCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDvcTransRsnCd,dvcTransRsnCd.length);
   	
   }
   
   public void setDvcTransRsnCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDvcTransRsnCd,dvcTransRsnCd.length);
   	
   }
   
     /**
	 * 	Update DvcTransRsnCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDvcTransRsnCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDvcTransRsnCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DvcTransRsnCd with another Field
	 *	@param value
	 */
   public void setDvcTransRsnCd(Field source) {
       replace(source,0,source.length(),beginDvcTransRsnCd,DVC_TRANS_RSN_CD_LEN);
   	
   }  
   
     /**
	 * 	Update DvcTransRsnCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDvcTransRsnCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDvcTransRsnCd,DVC_TRANS_RSN_CD_LEN);
   	
   }
   
     /**
	 * 	Update DvcTransRsnCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDvcTransRsnCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDvcTransRsnCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extActvReqDt
	 *	@return extActvReqDt
	 */
   public char[] getExtActvReqDt() throws CFException{
     if (isExtActvReqDtModified()) { 
        extActvReqDt = refreshExtActvReqDt();
     }
   		return extActvReqDt;
   }

  
	/**
	*  set variable extActvReqDt
	*  Corresponding COBOL Variable is WS-EXT-ACTV-REQ-DT
	*  @param value
	**/
   public void setExtActvReqDt(char[] value) {
      extActvReqDt = checkExtActvReqDtConstraints(value);
      serializeExtActvReqDt(extActvReqDt);
   } 

     /**
	 * 	Update ExtActvReqDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtActvReqDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtActvReqDt,extActvReqDt.length);
   	
   }
   
   public void setExtActvReqDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtActvReqDt,extActvReqDt.length);
   	
   }
   
     /**
	 * 	Update ExtActvReqDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtActvReqDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtActvReqDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtActvReqDt with another Field
	 *	@param value
	 */
   public void setExtActvReqDt(Field source) {
       replace(source,0,source.length(),beginExtActvReqDt,EXT_ACTV_REQ_DT_LEN);
   	
   }  
   
     /**
	 * 	Update ExtActvReqDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtActvReqDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtActvReqDt,EXT_ACTV_REQ_DT_LEN);
   	
   }
   
     /**
	 * 	Update ExtActvReqDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtActvReqDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtActvReqDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extCustTypeCd
	 *	@return extCustTypeCd
	 */
   public char[] getExtCustTypeCd() throws CFException{
     if (isExtCustTypeCdModified()) { 
        extCustTypeCd = refreshExtCustTypeCd();
     }
   		return extCustTypeCd;
   }

  
	/**
	*  set variable extCustTypeCd
	*  Corresponding COBOL Variable is WS-EXT-CUST-TYPE-CD
	*  @param value
	**/
   public void setExtCustTypeCd(char[] value) {
      extCustTypeCd = checkExtCustTypeCdConstraints(value);
      serializeExtCustTypeCd(extCustTypeCd);
   } 

     /**
	 * 	Update ExtCustTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtCustTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtCustTypeCd,extCustTypeCd.length);
   	
   }
   
   public void setExtCustTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtCustTypeCd,extCustTypeCd.length);
   	
   }
   
     /**
	 * 	Update ExtCustTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtCustTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtCustTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtCustTypeCd with another Field
	 *	@param value
	 */
   public void setExtCustTypeCd(Field source) {
       replace(source,0,source.length(),beginExtCustTypeCd,EXT_CUST_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update ExtCustTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtCustTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtCustTypeCd,EXT_CUST_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update ExtCustTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtCustTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtCustTypeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extSfoSpoIndicator
	 *	@return extSfoSpoIndicator
	 */
   public char[] getExtSfoSpoIndicator() throws CFException{
     if (isExtSfoSpoIndicatorModified()) { 
        extSfoSpoIndicator = refreshExtSfoSpoIndicator();
     }
   		return extSfoSpoIndicator;
   }

  
	/**
	*  set variable extSfoSpoIndicator
	*  Corresponding COBOL Variable is WS-EXT-SFO-SPO-INDICATOR
	*  @param value
	**/
   public void setExtSfoSpoIndicator(char[] value) {
      extSfoSpoIndicator = checkExtSfoSpoIndicatorConstraints(value);
      serializeExtSfoSpoIndicator(extSfoSpoIndicator);
   } 

     /**
	 * 	Update ExtSfoSpoIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtSfoSpoIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtSfoSpoIndicator,extSfoSpoIndicator.length);
   	
   }
   
   public void setExtSfoSpoIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtSfoSpoIndicator,extSfoSpoIndicator.length);
   	
   }
   
     /**
	 * 	Update ExtSfoSpoIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtSfoSpoIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtSfoSpoIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtSfoSpoIndicator with another Field
	 *	@param value
	 */
   public void setExtSfoSpoIndicator(Field source) {
       replace(source,0,source.length(),beginExtSfoSpoIndicator,EXT_SFO_SPO_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update ExtSfoSpoIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtSfoSpoIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtSfoSpoIndicator,EXT_SFO_SPO_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update ExtSfoSpoIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtSfoSpoIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtSfoSpoIndicator+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extLevel
	 *	@return extLevel
	 */
   public char[] getExtLevel() throws CFException{
     if (isExtLevelModified()) { 
        extLevel = refreshExtLevel();
     }
   		return extLevel;
   }

  
	/**
	*  set variable extLevel
	*  Corresponding COBOL Variable is WS-EXT-LEVEL
	*  @param value
	**/
   public void setExtLevel(char[] value) {
      extLevel = checkExtLevelConstraints(value);
      serializeExtLevel(extLevel);
   } 

     /**
	 * 	Update ExtLevel 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtLevel(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtLevel,extLevel.length);
   	
   }
   
   public void setExtLevel(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtLevel,extLevel.length);
   	
   }
   
     /**
	 * 	Update ExtLevel 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtLevel(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtLevel+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtLevel with another Field
	 *	@param value
	 */
   public void setExtLevel(Field source) {
       replace(source,0,source.length(),beginExtLevel,EXT_LEVEL_LEN);
   	
   }  
   
     /**
	 * 	Update ExtLevel 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtLevel(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtLevel,EXT_LEVEL_LEN);
   	
   }
   
     /**
	 * 	Update ExtLevel 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtLevel(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtLevel+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extLineStatus
	 *	@return extLineStatus
	 */
   public char[] getExtLineStatus() throws CFException{
     if (isExtLineStatusModified()) { 
        extLineStatus = refreshExtLineStatus();
     }
   		return extLineStatus;
   }

  
	/**
	*  set variable extLineStatus
	*  Corresponding COBOL Variable is WS-EXT-LINE-STATUS
	*  @param value
	**/
   public void setExtLineStatus(char[] value) {
      extLineStatus = checkExtLineStatusConstraints(value);
      serializeExtLineStatus(extLineStatus);
   } 

     /**
	 * 	Update ExtLineStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtLineStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtLineStatus,extLineStatus.length);
   	
   }
   
   public void setExtLineStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtLineStatus,extLineStatus.length);
   	
   }
   
     /**
	 * 	Update ExtLineStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtLineStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtLineStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtLineStatus with another Field
	 *	@param value
	 */
   public void setExtLineStatus(Field source) {
       replace(source,0,source.length(),beginExtLineStatus,EXT_LINE_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update ExtLineStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtLineStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtLineStatus,EXT_LINE_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update ExtLineStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtLineStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtLineStatus+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extFinMarketCode
	 *	@return extFinMarketCode
	 */
   public char[] getExtFinMarketCode() throws CFException{
     if (isExtFinMarketCodeModified()) { 
        extFinMarketCode = refreshExtFinMarketCode();
     }
   		return extFinMarketCode;
   }

  
	/**
	*  set variable extFinMarketCode
	*  Corresponding COBOL Variable is WS-EXT-FIN-MARKET-CODE
	*  @param value
	**/
   public void setExtFinMarketCode(char[] value) {
      extFinMarketCode = checkExtFinMarketCodeConstraints(value);
      serializeExtFinMarketCode(extFinMarketCode);
   } 

     /**
	 * 	Update ExtFinMarketCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtFinMarketCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtFinMarketCode,extFinMarketCode.length);
   	
   }
   
   public void setExtFinMarketCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtFinMarketCode,extFinMarketCode.length);
   	
   }
   
     /**
	 * 	Update ExtFinMarketCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtFinMarketCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtFinMarketCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtFinMarketCode with another Field
	 *	@param value
	 */
   public void setExtFinMarketCode(Field source) {
       replace(source,0,source.length(),beginExtFinMarketCode,EXT_FIN_MARKET_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update ExtFinMarketCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtFinMarketCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtFinMarketCode,EXT_FIN_MARKET_CODE_LEN);
   	
   }
   
     /**
	 * 	Update ExtFinMarketCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtFinMarketCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtFinMarketCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extEmailAddr1
	 *	@return extEmailAddr1
	 */
   public char[] getExtEmailAddr1() throws CFException{
     if (isExtEmailAddr1Modified()) { 
        extEmailAddr1 = refreshExtEmailAddr1();
     }
   		return extEmailAddr1;
   }

  
	/**
	*  set variable extEmailAddr1
	*  Corresponding COBOL Variable is WS-EXT-EMAIL-ADDR1
	*  @param value
	**/
   public void setExtEmailAddr1(char[] value) {
      extEmailAddr1 = checkExtEmailAddr1Constraints(value);
      serializeExtEmailAddr1(extEmailAddr1);
   } 

     /**
	 * 	Update ExtEmailAddr1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtEmailAddr1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtEmailAddr1,extEmailAddr1.length);
   	
   }
   
   public void setExtEmailAddr1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtEmailAddr1,extEmailAddr1.length);
   	
   }
   
     /**
	 * 	Update ExtEmailAddr1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtEmailAddr1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtEmailAddr1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtEmailAddr1 with another Field
	 *	@param value
	 */
   public void setExtEmailAddr1(Field source) {
       replace(source,0,source.length(),beginExtEmailAddr1,EXT_EMAIL_ADDR_1_LEN);
   	
   }  
   
     /**
	 * 	Update ExtEmailAddr1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtEmailAddr1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtEmailAddr1,EXT_EMAIL_ADDR_1_LEN);
   	
   }
   
     /**
	 * 	Update ExtEmailAddr1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtEmailAddr1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtEmailAddr1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extEmailAddr2
	 *	@return extEmailAddr2
	 */
   public char[] getExtEmailAddr2() throws CFException{
     if (isExtEmailAddr2Modified()) { 
        extEmailAddr2 = refreshExtEmailAddr2();
     }
   		return extEmailAddr2;
   }

  
	/**
	*  set variable extEmailAddr2
	*  Corresponding COBOL Variable is WS-EXT-EMAIL-ADDR2
	*  @param value
	**/
   public void setExtEmailAddr2(char[] value) {
      extEmailAddr2 = checkExtEmailAddr2Constraints(value);
      serializeExtEmailAddr2(extEmailAddr2);
   } 

     /**
	 * 	Update ExtEmailAddr2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtEmailAddr2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtEmailAddr2,extEmailAddr2.length);
   	
   }
   
   public void setExtEmailAddr2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtEmailAddr2,extEmailAddr2.length);
   	
   }
   
     /**
	 * 	Update ExtEmailAddr2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtEmailAddr2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtEmailAddr2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtEmailAddr2 with another Field
	 *	@param value
	 */
   public void setExtEmailAddr2(Field source) {
       replace(source,0,source.length(),beginExtEmailAddr2,EXT_EMAIL_ADDR_2_LEN);
   	
   }  
   
     /**
	 * 	Update ExtEmailAddr2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtEmailAddr2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtEmailAddr2,EXT_EMAIL_ADDR_2_LEN);
   	
   }
   
     /**
	 * 	Update ExtEmailAddr2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtEmailAddr2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtEmailAddr2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extEmailAddr3
	 *	@return extEmailAddr3
	 */
   public char[] getExtEmailAddr3() throws CFException{
     if (isExtEmailAddr3Modified()) { 
        extEmailAddr3 = refreshExtEmailAddr3();
     }
   		return extEmailAddr3;
   }

  
	/**
	*  set variable extEmailAddr3
	*  Corresponding COBOL Variable is WS-EXT-EMAIL-ADDR3
	*  @param value
	**/
   public void setExtEmailAddr3(char[] value) {
      extEmailAddr3 = checkExtEmailAddr3Constraints(value);
      serializeExtEmailAddr3(extEmailAddr3);
   } 

     /**
	 * 	Update ExtEmailAddr3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtEmailAddr3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtEmailAddr3,extEmailAddr3.length);
   	
   }
   
   public void setExtEmailAddr3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtEmailAddr3,extEmailAddr3.length);
   	
   }
   
     /**
	 * 	Update ExtEmailAddr3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtEmailAddr3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtEmailAddr3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtEmailAddr3 with another Field
	 *	@param value
	 */
   public void setExtEmailAddr3(Field source) {
       replace(source,0,source.length(),beginExtEmailAddr3,EXT_EMAIL_ADDR_3_LEN);
   	
   }  
   
     /**
	 * 	Update ExtEmailAddr3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtEmailAddr3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtEmailAddr3,EXT_EMAIL_ADDR_3_LEN);
   	
   }
   
     /**
	 * 	Update ExtEmailAddr3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtEmailAddr3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtEmailAddr3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extLocationState
	 *	@return extLocationState
	 */
   public char[] getExtLocationState() throws CFException{
     if (isExtLocationStateModified()) { 
        extLocationState = refreshExtLocationState();
     }
   		return extLocationState;
   }

  
	/**
	*  set variable extLocationState
	*  Corresponding COBOL Variable is WS-EXT-LOCATION-STATE
	*  @param value
	**/
   public void setExtLocationState(char[] value) {
      extLocationState = checkExtLocationStateConstraints(value);
      serializeExtLocationState(extLocationState);
   } 

     /**
	 * 	Update ExtLocationState 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtLocationState(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtLocationState,extLocationState.length);
   	
   }
   
   public void setExtLocationState(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtLocationState,extLocationState.length);
   	
   }
   
     /**
	 * 	Update ExtLocationState 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtLocationState(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtLocationState+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtLocationState with another Field
	 *	@param value
	 */
   public void setExtLocationState(Field source) {
       replace(source,0,source.length(),beginExtLocationState,EXT_LOCATION_STATE_LEN);
   	
   }  
   
     /**
	 * 	Update ExtLocationState 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtLocationState(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtLocationState,EXT_LOCATION_STATE_LEN);
   	
   }
   
     /**
	 * 	Update ExtLocationState 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtLocationState(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtLocationState+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extUniqueId
	 *	@return extUniqueId
	 */
	public long getExtUniqueId() throws CFException {
       if (isExtUniqueIdModified()) { 
           extUniqueId = refreshExtUniqueId();
        }
   		return extUniqueId;
	}
	

	
	   
	/**
	 * 	Update ExtUniqueId with the passed value
	 *  Corresponding COBOL Variable is WS-EXT-UNIQUE-ID
	 *	@param number
	 */
	public void setExtUniqueId(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    extUniqueId = checkExtUniqueIdMaxLimit(number); 
		serializeExtUniqueId(extUniqueId);
	}
	

	/**
	 * 	Update ExtUniqueId with the passed value
	 *	@param value (String or char[])
	 */
	public void setExtUniqueId(char[] value) throws CFException {
		 extUniqueId = serializeExtUniqueId(value);
	}
	/**
	 * 	Update ExtUniqueId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExtUniqueIdString(char[] value) throws CFException {
		 setExtUniqueId(value);
	}
	/**
	 *	Returns the value of extBrandIdentifier
	 *	@return extBrandIdentifier
	 */
   public char[] getExtBrandIdentifier() throws CFException{
     if (isExtBrandIdentifierModified()) { 
        extBrandIdentifier = refreshExtBrandIdentifier();
     }
   		return extBrandIdentifier;
   }

  
	/**
	*  set variable extBrandIdentifier
	*  Corresponding COBOL Variable is WS-EXT-BRAND-IDENTIFIER
	*  @param value
	**/
   public void setExtBrandIdentifier(char[] value) {
      extBrandIdentifier = checkExtBrandIdentifierConstraints(value);
      serializeExtBrandIdentifier(extBrandIdentifier);
   } 

     /**
	 * 	Update ExtBrandIdentifier 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtBrandIdentifier(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtBrandIdentifier,extBrandIdentifier.length);
   	
   }
   
   public void setExtBrandIdentifier(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtBrandIdentifier,extBrandIdentifier.length);
   	
   }
   
     /**
	 * 	Update ExtBrandIdentifier 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtBrandIdentifier(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtBrandIdentifier+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtBrandIdentifier with another Field
	 *	@param value
	 */
   public void setExtBrandIdentifier(Field source) {
       replace(source,0,source.length(),beginExtBrandIdentifier,EXT_BRAND_IDENTIFIER_LEN);
   	
   }  
   
     /**
	 * 	Update ExtBrandIdentifier 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtBrandIdentifier(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtBrandIdentifier,EXT_BRAND_IDENTIFIER_LEN);
   	
   }
   
     /**
	 * 	Update ExtBrandIdentifier 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtBrandIdentifier(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtBrandIdentifier+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extBillCycleDt
	 *	@return extBillCycleDt
	 */   
	 public ExtBillCycleDt getExtBillCycleDt() {
   	return extBillCycleDt;
   }
   /**
	* 	Update ExtBillCycleDt with the passed value
	*   Corresponding COBOL Variable is WS-EXT-BILL-CYCLE-DT
	*	@param value
	*/
   public void setExtBillCycleDt(char[] value) {
      extBillCycleDt.setString(value); 
   }   
    
     /**
	 * 	Update ExtBillCycleDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setExtBillCycleDt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,extBillCycleDt.begin,extBillCycleDt.length());
   }
   
     /**
	 * 	Update ExtBillCycleDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtBillCycleDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,extBillCycleDt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ExtBillCycleDt with another Field
	 *	@param value
	 */
   public void setExtBillCycleDt(Field source) {
   	replace(source,0,source.length(),extBillCycleDt.begin,extBillCycleDt.length());
   }  
   
     /**
	 * 	Update ExtBillCycleDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setExtBillCycleDt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,extBillCycleDt.begin,extBillCycleDt.length());
   }
   
     /**
	 * 	Update ExtBillCycleDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtBillCycleDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,extBillCycleDt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of extServiceStartDt
	 *	@return extServiceStartDt
	 */   
	 public ExtServiceStartDt getExtServiceStartDt() {
   	return extServiceStartDt;
   }
   /**
	* 	Update ExtServiceStartDt with the passed value
	*   Corresponding COBOL Variable is WS-EXT-SERVICE-START-DT
	*	@param value
	*/
   public void setExtServiceStartDt(char[] value) {
      extServiceStartDt.setString(value); 
   }   
    
     /**
	 * 	Update ExtServiceStartDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setExtServiceStartDt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,extServiceStartDt.begin,extServiceStartDt.length());
   }
   
     /**
	 * 	Update ExtServiceStartDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtServiceStartDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,extServiceStartDt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ExtServiceStartDt with another Field
	 *	@param value
	 */
   public void setExtServiceStartDt(Field source) {
   	replace(source,0,source.length(),extServiceStartDt.begin,extServiceStartDt.length());
   }  
   
     /**
	 * 	Update ExtServiceStartDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setExtServiceStartDt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,extServiceStartDt.begin,extServiceStartDt.length());
   }
   
     /**
	 * 	Update ExtServiceStartDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtServiceStartDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,extServiceStartDt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of extSlsRepId
	 *	@return extSlsRepId
	 */
   public char[] getExtSlsRepId() throws CFException{
     if (isExtSlsRepIdModified()) { 
        extSlsRepId = refreshExtSlsRepId();
     }
   		return extSlsRepId;
   }

  
	/**
	*  set variable extSlsRepId
	*  Corresponding COBOL Variable is WS-EXT-SLS-REP-ID
	*  @param value
	**/
   public void setExtSlsRepId(char[] value) {
      extSlsRepId = checkExtSlsRepIdConstraints(value);
      serializeExtSlsRepId(extSlsRepId);
   } 

     /**
	 * 	Update ExtSlsRepId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtSlsRepId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtSlsRepId,extSlsRepId.length);
   	
   }
   
   public void setExtSlsRepId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtSlsRepId,extSlsRepId.length);
   	
   }
   
     /**
	 * 	Update ExtSlsRepId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtSlsRepId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtSlsRepId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtSlsRepId with another Field
	 *	@param value
	 */
   public void setExtSlsRepId(Field source) {
       replace(source,0,source.length(),beginExtSlsRepId,EXT_SLS_REP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update ExtSlsRepId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtSlsRepId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtSlsRepId,EXT_SLS_REP_ID_LEN);
   	
   }
   
     /**
	 * 	Update ExtSlsRepId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtSlsRepId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtSlsRepId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extSlsRepLname
	 *	@return extSlsRepLname
	 */
   public char[] getExtSlsRepLname() throws CFException{
     if (isExtSlsRepLnameModified()) { 
        extSlsRepLname = refreshExtSlsRepLname();
     }
   		return extSlsRepLname;
   }

  
	/**
	*  set variable extSlsRepLname
	*  Corresponding COBOL Variable is WS-EXT-SLS-REP-LNAME
	*  @param value
	**/
   public void setExtSlsRepLname(char[] value) {
      extSlsRepLname = checkExtSlsRepLnameConstraints(value);
      serializeExtSlsRepLname(extSlsRepLname);
   } 

     /**
	 * 	Update ExtSlsRepLname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtSlsRepLname(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtSlsRepLname,extSlsRepLname.length);
   	
   }
   
   public void setExtSlsRepLname(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtSlsRepLname,extSlsRepLname.length);
   	
   }
   
     /**
	 * 	Update ExtSlsRepLname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtSlsRepLname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtSlsRepLname+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtSlsRepLname with another Field
	 *	@param value
	 */
   public void setExtSlsRepLname(Field source) {
       replace(source,0,source.length(),beginExtSlsRepLname,EXT_SLS_REP_LNAME_LEN);
   	
   }  
   
     /**
	 * 	Update ExtSlsRepLname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtSlsRepLname(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtSlsRepLname,EXT_SLS_REP_LNAME_LEN);
   	
   }
   
     /**
	 * 	Update ExtSlsRepLname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtSlsRepLname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtSlsRepLname+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extSlsRepFname
	 *	@return extSlsRepFname
	 */
   public char[] getExtSlsRepFname() throws CFException{
     if (isExtSlsRepFnameModified()) { 
        extSlsRepFname = refreshExtSlsRepFname();
     }
   		return extSlsRepFname;
   }

  
	/**
	*  set variable extSlsRepFname
	*  Corresponding COBOL Variable is WS-EXT-SLS-REP-FNAME
	*  @param value
	**/
   public void setExtSlsRepFname(char[] value) {
      extSlsRepFname = checkExtSlsRepFnameConstraints(value);
      serializeExtSlsRepFname(extSlsRepFname);
   } 

     /**
	 * 	Update ExtSlsRepFname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtSlsRepFname(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtSlsRepFname,extSlsRepFname.length);
   	
   }
   
   public void setExtSlsRepFname(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtSlsRepFname,extSlsRepFname.length);
   	
   }
   
     /**
	 * 	Update ExtSlsRepFname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtSlsRepFname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtSlsRepFname+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtSlsRepFname with another Field
	 *	@param value
	 */
   public void setExtSlsRepFname(Field source) {
       replace(source,0,source.length(),beginExtSlsRepFname,EXT_SLS_REP_FNAME_LEN);
   	
   }  
   
     /**
	 * 	Update ExtSlsRepFname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtSlsRepFname(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtSlsRepFname,EXT_SLS_REP_FNAME_LEN);
   	
   }
   
     /**
	 * 	Update ExtSlsRepFname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtSlsRepFname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtSlsRepFname+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extChnlDetail
	 *	@return extChnlDetail
	 */
   public char[] getExtChnlDetail() throws CFException{
     if (isExtChnlDetailModified()) { 
        extChnlDetail = refreshExtChnlDetail();
     }
   		return extChnlDetail;
   }

  
	/**
	*  set variable extChnlDetail
	*  Corresponding COBOL Variable is WS-EXT-CHNL-DETAIL
	*  @param value
	**/
   public void setExtChnlDetail(char[] value) {
      extChnlDetail = checkExtChnlDetailConstraints(value);
      serializeExtChnlDetail(extChnlDetail);
   } 

     /**
	 * 	Update ExtChnlDetail 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtChnlDetail(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtChnlDetail,extChnlDetail.length);
   	
   }
   
   public void setExtChnlDetail(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtChnlDetail,extChnlDetail.length);
   	
   }
   
     /**
	 * 	Update ExtChnlDetail 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtChnlDetail(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtChnlDetail+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtChnlDetail with another Field
	 *	@param value
	 */
   public void setExtChnlDetail(Field source) {
       replace(source,0,source.length(),beginExtChnlDetail,EXT_CHNL_DETAIL_LEN);
   	
   }  
   
     /**
	 * 	Update ExtChnlDetail 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtChnlDetail(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtChnlDetail,EXT_CHNL_DETAIL_LEN);
   	
   }
   
     /**
	 * 	Update ExtChnlDetail 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtChnlDetail(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtChnlDetail+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extOutletName
	 *	@return extOutletName
	 */
   public char[] getExtOutletName() throws CFException{
     if (isExtOutletNameModified()) { 
        extOutletName = refreshExtOutletName();
     }
   		return extOutletName;
   }

  
	/**
	*  set variable extOutletName
	*  Corresponding COBOL Variable is WS-EXT-OUTLET-NAME
	*  @param value
	**/
   public void setExtOutletName(char[] value) {
      extOutletName = checkExtOutletNameConstraints(value);
      serializeExtOutletName(extOutletName);
   } 

     /**
	 * 	Update ExtOutletName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtOutletName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtOutletName,extOutletName.length);
   	
   }
   
   public void setExtOutletName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtOutletName,extOutletName.length);
   	
   }
   
     /**
	 * 	Update ExtOutletName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtOutletName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtOutletName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtOutletName with another Field
	 *	@param value
	 */
   public void setExtOutletName(Field source) {
       replace(source,0,source.length(),beginExtOutletName,EXT_OUTLET_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update ExtOutletName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtOutletName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtOutletName,EXT_OUTLET_NAME_LEN);
   	
   }
   
     /**
	 * 	Update ExtOutletName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtOutletName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtOutletName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extDistrictDesc
	 *	@return extDistrictDesc
	 */
   public char[] getExtDistrictDesc() throws CFException{
     if (isExtDistrictDescModified()) { 
        extDistrictDesc = refreshExtDistrictDesc();
     }
   		return extDistrictDesc;
   }

  
	/**
	*  set variable extDistrictDesc
	*  Corresponding COBOL Variable is WS-EXT-DISTRICT-DESC
	*  @param value
	**/
   public void setExtDistrictDesc(char[] value) {
      extDistrictDesc = checkExtDistrictDescConstraints(value);
      serializeExtDistrictDesc(extDistrictDesc);
   } 

     /**
	 * 	Update ExtDistrictDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtDistrictDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtDistrictDesc,extDistrictDesc.length);
   	
   }
   
   public void setExtDistrictDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtDistrictDesc,extDistrictDesc.length);
   	
   }
   
     /**
	 * 	Update ExtDistrictDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtDistrictDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtDistrictDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtDistrictDesc with another Field
	 *	@param value
	 */
   public void setExtDistrictDesc(Field source) {
       replace(source,0,source.length(),beginExtDistrictDesc,EXT_DISTRICT_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update ExtDistrictDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtDistrictDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtDistrictDesc,EXT_DISTRICT_DESC_LEN);
   	
   }
   
     /**
	 * 	Update ExtDistrictDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtDistrictDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtDistrictDesc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extVzMktDesc
	 *	@return extVzMktDesc
	 */
   public char[] getExtVzMktDesc() throws CFException{
     if (isExtVzMktDescModified()) { 
        extVzMktDesc = refreshExtVzMktDesc();
     }
   		return extVzMktDesc;
   }

  
	/**
	*  set variable extVzMktDesc
	*  Corresponding COBOL Variable is WS-EXT-VZ-MKT-DESC
	*  @param value
	**/
   public void setExtVzMktDesc(char[] value) {
      extVzMktDesc = checkExtVzMktDescConstraints(value);
      serializeExtVzMktDesc(extVzMktDesc);
   } 

     /**
	 * 	Update ExtVzMktDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtVzMktDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtVzMktDesc,extVzMktDesc.length);
   	
   }
   
   public void setExtVzMktDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtVzMktDesc,extVzMktDesc.length);
   	
   }
   
     /**
	 * 	Update ExtVzMktDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtVzMktDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtVzMktDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtVzMktDesc with another Field
	 *	@param value
	 */
   public void setExtVzMktDesc(Field source) {
       replace(source,0,source.length(),beginExtVzMktDesc,EXT_VZ_MKT_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update ExtVzMktDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtVzMktDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtVzMktDesc,EXT_VZ_MKT_DESC_LEN);
   	
   }
   
     /**
	 * 	Update ExtVzMktDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtVzMktDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtVzMktDesc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extUniqueIdLine
	 *	@return extUniqueIdLine
	 */
   public char[] getExtUniqueIdLine() throws CFException{
     if (isExtUniqueIdLineModified()) { 
        extUniqueIdLine = refreshExtUniqueIdLine();
     }
   		return extUniqueIdLine;
   }

  
	/**
	*  set variable extUniqueIdLine
	*  Corresponding COBOL Variable is WS-EXT-UNIQUE-ID-LINE
	*  @param value
	**/
   public void setExtUniqueIdLine(char[] value) {
      extUniqueIdLine = checkExtUniqueIdLineConstraints(value);
      serializeExtUniqueIdLine(extUniqueIdLine);
   } 

     /**
	 * 	Update ExtUniqueIdLine 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtUniqueIdLine(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtUniqueIdLine,extUniqueIdLine.length);
   	
   }
   
   public void setExtUniqueIdLine(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtUniqueIdLine,extUniqueIdLine.length);
   	
   }
   
     /**
	 * 	Update ExtUniqueIdLine 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtUniqueIdLine(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtUniqueIdLine+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtUniqueIdLine with another Field
	 *	@param value
	 */
   public void setExtUniqueIdLine(Field source) {
       replace(source,0,source.length(),beginExtUniqueIdLine,EXT_UNIQUE_ID_LINE_LEN);
   	
   }  
   
     /**
	 * 	Update ExtUniqueIdLine 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtUniqueIdLine(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtUniqueIdLine,EXT_UNIQUE_ID_LINE_LEN);
   	
   }
   
     /**
	 * 	Update ExtUniqueIdLine 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtUniqueIdLine(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtUniqueIdLine+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extSvcAddr1
	 *	@return extSvcAddr1
	 */
   public char[] getExtSvcAddr1() throws CFException{
     if (isExtSvcAddr1Modified()) { 
        extSvcAddr1 = refreshExtSvcAddr1();
     }
   		return extSvcAddr1;
   }

  
	/**
	*  set variable extSvcAddr1
	*  Corresponding COBOL Variable is WS-EXT-SVC-ADDR1
	*  @param value
	**/
   public void setExtSvcAddr1(char[] value) {
      extSvcAddr1 = checkExtSvcAddr1Constraints(value);
      serializeExtSvcAddr1(extSvcAddr1);
   } 

     /**
	 * 	Update ExtSvcAddr1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtSvcAddr1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtSvcAddr1,extSvcAddr1.length);
   	
   }
   
   public void setExtSvcAddr1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtSvcAddr1,extSvcAddr1.length);
   	
   }
   
     /**
	 * 	Update ExtSvcAddr1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtSvcAddr1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtSvcAddr1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtSvcAddr1 with another Field
	 *	@param value
	 */
   public void setExtSvcAddr1(Field source) {
       replace(source,0,source.length(),beginExtSvcAddr1,EXT_SVC_ADDR_1_LEN);
   	
   }  
   
     /**
	 * 	Update ExtSvcAddr1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtSvcAddr1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtSvcAddr1,EXT_SVC_ADDR_1_LEN);
   	
   }
   
     /**
	 * 	Update ExtSvcAddr1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtSvcAddr1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtSvcAddr1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extSvcAddr2
	 *	@return extSvcAddr2
	 */
   public char[] getExtSvcAddr2() throws CFException{
     if (isExtSvcAddr2Modified()) { 
        extSvcAddr2 = refreshExtSvcAddr2();
     }
   		return extSvcAddr2;
   }

  
	/**
	*  set variable extSvcAddr2
	*  Corresponding COBOL Variable is WS-EXT-SVC-ADDR2
	*  @param value
	**/
   public void setExtSvcAddr2(char[] value) {
      extSvcAddr2 = checkExtSvcAddr2Constraints(value);
      serializeExtSvcAddr2(extSvcAddr2);
   } 

     /**
	 * 	Update ExtSvcAddr2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtSvcAddr2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtSvcAddr2,extSvcAddr2.length);
   	
   }
   
   public void setExtSvcAddr2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtSvcAddr2,extSvcAddr2.length);
   	
   }
   
     /**
	 * 	Update ExtSvcAddr2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtSvcAddr2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtSvcAddr2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtSvcAddr2 with another Field
	 *	@param value
	 */
   public void setExtSvcAddr2(Field source) {
       replace(source,0,source.length(),beginExtSvcAddr2,EXT_SVC_ADDR_2_LEN);
   	
   }  
   
     /**
	 * 	Update ExtSvcAddr2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtSvcAddr2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtSvcAddr2,EXT_SVC_ADDR_2_LEN);
   	
   }
   
     /**
	 * 	Update ExtSvcAddr2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtSvcAddr2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtSvcAddr2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extSvcCity
	 *	@return extSvcCity
	 */
   public char[] getExtSvcCity() throws CFException{
     if (isExtSvcCityModified()) { 
        extSvcCity = refreshExtSvcCity();
     }
   		return extSvcCity;
   }

  
	/**
	*  set variable extSvcCity
	*  Corresponding COBOL Variable is WS-EXT-SVC-CITY
	*  @param value
	**/
   public void setExtSvcCity(char[] value) {
      extSvcCity = checkExtSvcCityConstraints(value);
      serializeExtSvcCity(extSvcCity);
   } 

     /**
	 * 	Update ExtSvcCity 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtSvcCity(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtSvcCity,extSvcCity.length);
   	
   }
   
   public void setExtSvcCity(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtSvcCity,extSvcCity.length);
   	
   }
   
     /**
	 * 	Update ExtSvcCity 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtSvcCity(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtSvcCity+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtSvcCity with another Field
	 *	@param value
	 */
   public void setExtSvcCity(Field source) {
       replace(source,0,source.length(),beginExtSvcCity,EXT_SVC_CITY_LEN);
   	
   }  
   
     /**
	 * 	Update ExtSvcCity 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtSvcCity(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtSvcCity,EXT_SVC_CITY_LEN);
   	
   }
   
     /**
	 * 	Update ExtSvcCity 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtSvcCity(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtSvcCity+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extSvcState
	 *	@return extSvcState
	 */
   public char[] getExtSvcState() throws CFException{
     if (isExtSvcStateModified()) { 
        extSvcState = refreshExtSvcState();
     }
   		return extSvcState;
   }

  
	/**
	*  set variable extSvcState
	*  Corresponding COBOL Variable is WS-EXT-SVC-STATE
	*  @param value
	**/
   public void setExtSvcState(char[] value) {
      extSvcState = checkExtSvcStateConstraints(value);
      serializeExtSvcState(extSvcState);
   } 

     /**
	 * 	Update ExtSvcState 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtSvcState(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtSvcState,extSvcState.length);
   	
   }
   
   public void setExtSvcState(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtSvcState,extSvcState.length);
   	
   }
   
     /**
	 * 	Update ExtSvcState 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtSvcState(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtSvcState+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtSvcState with another Field
	 *	@param value
	 */
   public void setExtSvcState(Field source) {
       replace(source,0,source.length(),beginExtSvcState,EXT_SVC_STATE_LEN);
   	
   }  
   
     /**
	 * 	Update ExtSvcState 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtSvcState(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtSvcState,EXT_SVC_STATE_LEN);
   	
   }
   
     /**
	 * 	Update ExtSvcState 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtSvcState(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtSvcState+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extSvcZipCode
	 *	@return extSvcZipCode
	 */
   public char[] getExtSvcZipCode() throws CFException{
     if (isExtSvcZipCodeModified()) { 
        extSvcZipCode = refreshExtSvcZipCode();
     }
   		return extSvcZipCode;
   }

  
	/**
	*  set variable extSvcZipCode
	*  Corresponding COBOL Variable is WS-EXT-SVC-ZIP-CODE
	*  @param value
	**/
   public void setExtSvcZipCode(char[] value) {
      extSvcZipCode = checkExtSvcZipCodeConstraints(value);
      serializeExtSvcZipCode(extSvcZipCode);
   } 

     /**
	 * 	Update ExtSvcZipCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtSvcZipCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtSvcZipCode,extSvcZipCode.length);
   	
   }
   
   public void setExtSvcZipCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtSvcZipCode,extSvcZipCode.length);
   	
   }
   
     /**
	 * 	Update ExtSvcZipCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtSvcZipCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtSvcZipCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtSvcZipCode with another Field
	 *	@param value
	 */
   public void setExtSvcZipCode(Field source) {
       replace(source,0,source.length(),beginExtSvcZipCode,EXT_SVC_ZIP_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update ExtSvcZipCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtSvcZipCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtSvcZipCode,EXT_SVC_ZIP_CODE_LEN);
   	
   }
   
     /**
	 * 	Update ExtSvcZipCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtSvcZipCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtSvcZipCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extShsArea
	 *	@return extShsArea
	 */   
	 public ExtShsArea getExtShsArea() {
   	return extShsArea;
   }
   /**
	* 	Update ExtShsArea with the passed value
	*   Corresponding COBOL Variable is WS-EXT-SHS-AREA
	*	@param value
	*/
   public void setExtShsArea(char[] value) {
      extShsArea.setString(value); 
   }   
    
     /**
	 * 	Update ExtShsArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setExtShsArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,extShsArea.begin,extShsArea.length());
   }
   
     /**
	 * 	Update ExtShsArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtShsArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,extShsArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ExtShsArea with another Field
	 *	@param value
	 */
   public void setExtShsArea(Field source) {
   	replace(source,0,source.length(),extShsArea.begin,extShsArea.length());
   }  
   
     /**
	 * 	Update ExtShsArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setExtShsArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,extShsArea.begin,extShsArea.length());
   }
   
     /**
	 * 	Update ExtShsArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtShsArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,extShsArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of extSkuId
	 *	@return extSkuId
	 */
   public char[] getExtSkuId() throws CFException{
     if (isExtSkuIdModified()) { 
        extSkuId = refreshExtSkuId();
     }
   		return extSkuId;
   }

  
	/**
	*  set variable extSkuId
	*  Corresponding COBOL Variable is WS-EXT-SKU-ID
	*  @param value
	**/
   public void setExtSkuId(char[] value) {
      extSkuId = checkExtSkuIdConstraints(value);
      serializeExtSkuId(extSkuId);
   } 

     /**
	 * 	Update ExtSkuId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtSkuId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtSkuId,extSkuId.length);
   	
   }
   
   public void setExtSkuId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtSkuId,extSkuId.length);
   	
   }
   
     /**
	 * 	Update ExtSkuId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtSkuId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtSkuId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtSkuId with another Field
	 *	@param value
	 */
   public void setExtSkuId(Field source) {
       replace(source,0,source.length(),beginExtSkuId,EXT_SKU_ID_LEN);
   	
   }  
   
     /**
	 * 	Update ExtSkuId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtSkuId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtSkuId,EXT_SKU_ID_LEN);
   	
   }
   
     /**
	 * 	Update ExtSkuId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtSkuId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtSkuId+targetIndex,targetLen);
    
   }

	
	
	

		public static int getExtractRecFieldLength() {
			return EXTRACT_REC_LENGTH;
		}

}
  
