package com.cloudframe.app.init1.dto;

/**
*  The class KeyUsgPrev is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class KeyUsgPrev extends KeyUsgPrevSerialized { 
   

								private int usgPrvCustIdNo;

								private int usgPrvAcctNo;
				private UsgPrvMtn usgPrvMtn = new UsgPrvMtn();

								private long usgPrvInvoiceNo;

						private char[] usgPrvItuMobCountryCd = new char[3];

						private char[] usgPrvItuMobNetworkCd = new char[3];

						private char[] usgPrvBeginDt = new char[10];

						private char[] usgPrvBeginTm = new char[8];

						private char[] usgPrvGri = new char[40];
	
	/**
	* Constructor for KeyUsgPrev
	**/
    public KeyUsgPrev() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for KeyUsgPrev. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyUsgPrev(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			usgPrvMtn.setParent(this,getStartOffset() + 8);
								setUsgPrvCustIdNo(0);
								setUsgPrvAcctNo(0);
								setUsgPrvInvoiceNo(0L);
								setUsgPrvItuMobCountryCd(fillSpace(3));
								setUsgPrvItuMobNetworkCd(fillSpace(3));
								setUsgPrvBeginDt(fillSpace(10));
								setUsgPrvBeginTm(fillSpace(8));
								setUsgPrvGri(fillSpace(40));
    } 

	/**
	 *	Returns the value of usgPrvCustIdNo
	 *	@return usgPrvCustIdNo
	 */
	public int getUsgPrvCustIdNo() throws CFException {
        if (isUsgPrvCustIdNoModified()) { 
           usgPrvCustIdNo = refreshUsgPrvCustIdNo();
        }
   		return usgPrvCustIdNo;
	}
	
	/**
	 * 	Update UsgPrvCustIdNo with the passed value
	 *  Corresponding COBOL Variable is WS-USG-PRV-CUST-ID-NO
	 *	@param number
	 */
	public void setUsgPrvCustIdNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    usgPrvCustIdNo = checkUsgPrvCustIdNoMaxLimit(number); 
		serializeUsgPrvCustIdNo(usgPrvCustIdNo);
	}


	public void setUsgPrvCustIdNo(long number) {
	    number = checkUsgPrvCustIdNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setUsgPrvCustIdNo((int)number);
	}
	
	/**
	 *	Returns the value of usgPrvAcctNo
	 *	@return usgPrvAcctNo
	 */
	public int getUsgPrvAcctNo() throws CFException {
        if (isUsgPrvAcctNoModified()) { 
           usgPrvAcctNo = refreshUsgPrvAcctNo();
        }
   		return usgPrvAcctNo;
	}
	
	/**
	 * 	Update UsgPrvAcctNo with the passed value
	 *  Corresponding COBOL Variable is WS-USG-PRV-ACCT-NO
	 *	@param number
	 */
	public void setUsgPrvAcctNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    usgPrvAcctNo = checkUsgPrvAcctNoMaxLimit(number); 
		serializeUsgPrvAcctNo(usgPrvAcctNo);
	}


	public void setUsgPrvAcctNo(long number) {
	    number = checkUsgPrvAcctNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setUsgPrvAcctNo((int)number);
	}
	
	/**
	 *	Returns the value of usgPrvMtn
	 *	@return usgPrvMtn
	 */   
	 public UsgPrvMtn getUsgPrvMtn() {
   	return usgPrvMtn;
   }
   /**
	* 	Update UsgPrvMtn with the passed value
	*   Corresponding COBOL Variable is WS-USG-PRV-MTN
	*	@param value
	*/
   public void setUsgPrvMtn(char[] value) {
      usgPrvMtn.setString(value); 
   }   
    
     /**
	 * 	Update UsgPrvMtn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setUsgPrvMtn(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,usgPrvMtn.begin,usgPrvMtn.length());
   }
   
     /**
	 * 	Update UsgPrvMtn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUsgPrvMtn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,usgPrvMtn.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update UsgPrvMtn with another Field
	 *	@param value
	 */
   public void setUsgPrvMtn(Field source) {
   	replace(source,0,source.length(),usgPrvMtn.begin,usgPrvMtn.length());
   }  
   
     /**
	 * 	Update UsgPrvMtn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setUsgPrvMtn(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,usgPrvMtn.begin,usgPrvMtn.length());
   }
   
     /**
	 * 	Update UsgPrvMtn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUsgPrvMtn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,usgPrvMtn.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of usgPrvInvoiceNo
	 *	@return usgPrvInvoiceNo
	 */
	public long getUsgPrvInvoiceNo() throws CFException {
        if (isUsgPrvInvoiceNoModified()) { 
           usgPrvInvoiceNo = refreshUsgPrvInvoiceNo();
        }
   		return usgPrvInvoiceNo;
	}
	
	/**
	 * 	Update UsgPrvInvoiceNo with the passed value
	 *  Corresponding COBOL Variable is WS-USG-PRV-INVOICE-NO
	 *	@param number
	 */
	public void setUsgPrvInvoiceNo(long number) {
	     // Truncate if the number is beyond +/- Max range
	    usgPrvInvoiceNo = checkUsgPrvInvoiceNoMaxLimit(number); 
		serializeUsgPrvInvoiceNo(usgPrvInvoiceNo);
	}


	/**
	 *	Returns the value of usgPrvItuMobCountryCd
	 *	@return usgPrvItuMobCountryCd
	 */
   public char[] getUsgPrvItuMobCountryCd() throws CFException{
     if (isUsgPrvItuMobCountryCdModified()) { 
        usgPrvItuMobCountryCd = refreshUsgPrvItuMobCountryCd();
     }
   		return usgPrvItuMobCountryCd;
   }

  
	/**
	*  set variable usgPrvItuMobCountryCd
	*  Corresponding COBOL Variable is WS-USG-PRV-ITU-MOB-COUNTRY-CD
	*  @param value
	**/
   public void setUsgPrvItuMobCountryCd(char[] value) {
      usgPrvItuMobCountryCd = checkUsgPrvItuMobCountryCdConstraints(value);
      serializeUsgPrvItuMobCountryCd(usgPrvItuMobCountryCd);
   } 

     /**
	 * 	Update UsgPrvItuMobCountryCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUsgPrvItuMobCountryCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUsgPrvItuMobCountryCd,usgPrvItuMobCountryCd.length);
   	
   }
   
   public void setUsgPrvItuMobCountryCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvItuMobCountryCd,usgPrvItuMobCountryCd.length);
   	
   }
   
     /**
	 * 	Update UsgPrvItuMobCountryCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUsgPrvItuMobCountryCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvItuMobCountryCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UsgPrvItuMobCountryCd with another Field
	 *	@param value
	 */
   public void setUsgPrvItuMobCountryCd(Field source) {
       replace(source,0,source.length(),beginUsgPrvItuMobCountryCd,USG_PRV_ITU_MOB_COUNTRY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update UsgPrvItuMobCountryCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUsgPrvItuMobCountryCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUsgPrvItuMobCountryCd,USG_PRV_ITU_MOB_COUNTRY_CD_LEN);
   	
   }
   
     /**
	 * 	Update UsgPrvItuMobCountryCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUsgPrvItuMobCountryCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvItuMobCountryCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of usgPrvItuMobNetworkCd
	 *	@return usgPrvItuMobNetworkCd
	 */
   public char[] getUsgPrvItuMobNetworkCd() throws CFException{
     if (isUsgPrvItuMobNetworkCdModified()) { 
        usgPrvItuMobNetworkCd = refreshUsgPrvItuMobNetworkCd();
     }
   		return usgPrvItuMobNetworkCd;
   }

  
	/**
	*  set variable usgPrvItuMobNetworkCd
	*  Corresponding COBOL Variable is WS-USG-PRV-ITU-MOB-NETWORK-CD
	*  @param value
	**/
   public void setUsgPrvItuMobNetworkCd(char[] value) {
      usgPrvItuMobNetworkCd = checkUsgPrvItuMobNetworkCdConstraints(value);
      serializeUsgPrvItuMobNetworkCd(usgPrvItuMobNetworkCd);
   } 

     /**
	 * 	Update UsgPrvItuMobNetworkCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUsgPrvItuMobNetworkCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUsgPrvItuMobNetworkCd,usgPrvItuMobNetworkCd.length);
   	
   }
   
   public void setUsgPrvItuMobNetworkCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvItuMobNetworkCd,usgPrvItuMobNetworkCd.length);
   	
   }
   
     /**
	 * 	Update UsgPrvItuMobNetworkCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUsgPrvItuMobNetworkCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvItuMobNetworkCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UsgPrvItuMobNetworkCd with another Field
	 *	@param value
	 */
   public void setUsgPrvItuMobNetworkCd(Field source) {
       replace(source,0,source.length(),beginUsgPrvItuMobNetworkCd,USG_PRV_ITU_MOB_NETWORK_CD_LEN);
   	
   }  
   
     /**
	 * 	Update UsgPrvItuMobNetworkCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUsgPrvItuMobNetworkCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUsgPrvItuMobNetworkCd,USG_PRV_ITU_MOB_NETWORK_CD_LEN);
   	
   }
   
     /**
	 * 	Update UsgPrvItuMobNetworkCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUsgPrvItuMobNetworkCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvItuMobNetworkCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of usgPrvBeginDt
	 *	@return usgPrvBeginDt
	 */
   public char[] getUsgPrvBeginDt() throws CFException{
     if (isUsgPrvBeginDtModified()) { 
        usgPrvBeginDt = refreshUsgPrvBeginDt();
     }
   		return usgPrvBeginDt;
   }

  
	/**
	*  set variable usgPrvBeginDt
	*  Corresponding COBOL Variable is WS-USG-PRV-BEGIN-DT
	*  @param value
	**/
   public void setUsgPrvBeginDt(char[] value) {
      usgPrvBeginDt = checkUsgPrvBeginDtConstraints(value);
      serializeUsgPrvBeginDt(usgPrvBeginDt);
   } 

     /**
	 * 	Update UsgPrvBeginDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUsgPrvBeginDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUsgPrvBeginDt,usgPrvBeginDt.length);
   	
   }
   
   public void setUsgPrvBeginDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvBeginDt,usgPrvBeginDt.length);
   	
   }
   
     /**
	 * 	Update UsgPrvBeginDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUsgPrvBeginDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvBeginDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UsgPrvBeginDt with another Field
	 *	@param value
	 */
   public void setUsgPrvBeginDt(Field source) {
       replace(source,0,source.length(),beginUsgPrvBeginDt,USG_PRV_BEGIN_DT_LEN);
   	
   }  
   
     /**
	 * 	Update UsgPrvBeginDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUsgPrvBeginDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUsgPrvBeginDt,USG_PRV_BEGIN_DT_LEN);
   	
   }
   
     /**
	 * 	Update UsgPrvBeginDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUsgPrvBeginDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvBeginDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of usgPrvBeginTm
	 *	@return usgPrvBeginTm
	 */
   public char[] getUsgPrvBeginTm() throws CFException{
     if (isUsgPrvBeginTmModified()) { 
        usgPrvBeginTm = refreshUsgPrvBeginTm();
     }
   		return usgPrvBeginTm;
   }

  
	/**
	*  set variable usgPrvBeginTm
	*  Corresponding COBOL Variable is WS-USG-PRV-BEGIN-TM
	*  @param value
	**/
   public void setUsgPrvBeginTm(char[] value) {
      usgPrvBeginTm = checkUsgPrvBeginTmConstraints(value);
      serializeUsgPrvBeginTm(usgPrvBeginTm);
   } 

     /**
	 * 	Update UsgPrvBeginTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUsgPrvBeginTm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUsgPrvBeginTm,usgPrvBeginTm.length);
   	
   }
   
   public void setUsgPrvBeginTm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvBeginTm,usgPrvBeginTm.length);
   	
   }
   
     /**
	 * 	Update UsgPrvBeginTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUsgPrvBeginTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvBeginTm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UsgPrvBeginTm with another Field
	 *	@param value
	 */
   public void setUsgPrvBeginTm(Field source) {
       replace(source,0,source.length(),beginUsgPrvBeginTm,USG_PRV_BEGIN_TM_LEN);
   	
   }  
   
     /**
	 * 	Update UsgPrvBeginTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUsgPrvBeginTm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUsgPrvBeginTm,USG_PRV_BEGIN_TM_LEN);
   	
   }
   
     /**
	 * 	Update UsgPrvBeginTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUsgPrvBeginTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvBeginTm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of usgPrvGri
	 *	@return usgPrvGri
	 */
   public char[] getUsgPrvGri() throws CFException{
     if (isUsgPrvGriModified()) { 
        usgPrvGri = refreshUsgPrvGri();
     }
   		return usgPrvGri;
   }

  
	/**
	*  set variable usgPrvGri
	*  Corresponding COBOL Variable is WS-USG-PRV-GRI
	*  @param value
	**/
   public void setUsgPrvGri(char[] value) {
      usgPrvGri = checkUsgPrvGriConstraints(value);
      serializeUsgPrvGri(usgPrvGri);
   } 

     /**
	 * 	Update UsgPrvGri 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUsgPrvGri(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUsgPrvGri,usgPrvGri.length);
   	
   }
   
   public void setUsgPrvGri(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvGri,usgPrvGri.length);
   	
   }
   
     /**
	 * 	Update UsgPrvGri 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUsgPrvGri(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvGri+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UsgPrvGri with another Field
	 *	@param value
	 */
   public void setUsgPrvGri(Field source) {
       replace(source,0,source.length(),beginUsgPrvGri,USG_PRV_GRI_LEN);
   	
   }  
   
     /**
	 * 	Update UsgPrvGri 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUsgPrvGri(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUsgPrvGri,USG_PRV_GRI_LEN);
   	
   }
   
     /**
	 * 	Update UsgPrvGri 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUsgPrvGri(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgPrvGri+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes KeyUsgPrev
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setUsgPrvCustIdNo(0);
                     setUsgPrvAcctNo(0);
          usgPrvMtn.initialize();
     
                     setUsgPrvInvoiceNo(0);
         setUsgPrvItuMobCountryCd(CONSTANTS.SPACE_3);
         setUsgPrvItuMobNetworkCd(CONSTANTS.SPACE_3);
         setUsgPrvBeginDt(CONSTANTS.SPACE_10);
         setUsgPrvBeginTm(CONSTANTS.SPACE_8);
         setUsgPrvGri(CONSTANTS.SPACE_40);
   }

		public static int getKeyUsgPrevFieldLength() {
			return KEY_USG_PREV_LENGTH;
		}

}
  
