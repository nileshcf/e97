package com.cloudframe.app.vsammon1.file.records;

/**
*  The class MonitorRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:00. using version 5.0.0.254
**/


import com.cloudframe.app.vsammon1.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class MonitorRecord extends MonitorRecordSerialized {
   
				private MonPriKey monPriKey = new MonPriKey();

						private char[] monXctorSysId = Field.fillLowValue(4);

						private char[] monXctorTranId = Field.fillLowValue(4);

						private char[] monXcaorSysId = Field.fillLowValue(4);

								private int monXcaorTskNo;

						private char[] monXcdtPgmTyCd = Field.fillLowValue(35);

						private char[] monXcdtReqrIpAd = Field.fillLowValue(15);

								private int monXcdtTskAorTm;

								private int monXcdtTskElpsTm;

								private short monXcdtTskCmpCd;

						private char[] monXcdtTskAbndCd = Field.fillLowValue(4);

								private int monXcdtReqSz;

								private int monXcdtRespSz;

						private char[] monUsertoken = Field.fillLowValue(128);
	
	/**
	* Constructor for MonitorRecord
	**/
    public MonitorRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			monPriKey.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of monPriKey
	 *	@return monPriKey
	 */   
	 public MonPriKey getMonPriKey() {
   	return monPriKey;
   }
   /**
	* 	Update MonPriKey with the passed value
	*   Corresponding COBOL Variable is MON-PRI-KEY
	*	@param value
	*/
   public void setMonPriKey(char[] value) {
      monPriKey.setString(value); 
   }   
    
     /**
	 * 	Update MonPriKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMonPriKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,monPriKey.begin,monPriKey.length());
   }
   
     /**
	 * 	Update MonPriKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonPriKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,monPriKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MonPriKey with another Field
	 *	@param value
	 */
   public void setMonPriKey(Field source) {
   	replace(source,0,source.length(),monPriKey.begin,monPriKey.length());
   }  
   
     /**
	 * 	Update MonPriKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMonPriKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,monPriKey.begin,monPriKey.length());
   }
   
     /**
	 * 	Update MonPriKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonPriKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,monPriKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of monXctorSysId
	 *	@return monXctorSysId
	 */
   public char[] getMonXctorSysId() throws CFException{
     if (isMonXctorSysIdModified()) { 
        monXctorSysId = refreshMonXctorSysId();
     }
   		return monXctorSysId;
   }

  
	/**
	*  set variable monXctorSysId
	*  Corresponding COBOL Variable is MON-XCTOR-SYS-ID
	*  @param value
	**/
   public void setMonXctorSysId(char[] value) {
      monXctorSysId = checkMonXctorSysIdConstraints(value);
      serializeMonXctorSysId(monXctorSysId);
   } 

     /**
	 * 	Update MonXctorSysId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXctorSysId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMonXctorSysId,monXctorSysId.length);
   	
   }
   
   public void setMonXctorSysId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMonXctorSysId,monXctorSysId.length);
   	
   }
   
     /**
	 * 	Update MonXctorSysId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXctorSysId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXctorSysId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MonXctorSysId with another Field
	 *	@param value
	 */
   public void setMonXctorSysId(Field source) {
       replace(source,0,source.length(),beginMonXctorSysId,MON_XCTOR_SYS_ID_LEN);
   	
   }  
   
     /**
	 * 	Update MonXctorSysId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXctorSysId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMonXctorSysId,MON_XCTOR_SYS_ID_LEN);
   	
   }
   
     /**
	 * 	Update MonXctorSysId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXctorSysId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXctorSysId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of monXctorTranId
	 *	@return monXctorTranId
	 */
   public char[] getMonXctorTranId() throws CFException{
     if (isMonXctorTranIdModified()) { 
        monXctorTranId = refreshMonXctorTranId();
     }
   		return monXctorTranId;
   }

  
	/**
	*  set variable monXctorTranId
	*  Corresponding COBOL Variable is MON-XCTOR-TRAN-ID
	*  @param value
	**/
   public void setMonXctorTranId(char[] value) {
      monXctorTranId = checkMonXctorTranIdConstraints(value);
      serializeMonXctorTranId(monXctorTranId);
   } 

     /**
	 * 	Update MonXctorTranId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXctorTranId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMonXctorTranId,monXctorTranId.length);
   	
   }
   
   public void setMonXctorTranId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMonXctorTranId,monXctorTranId.length);
   	
   }
   
     /**
	 * 	Update MonXctorTranId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXctorTranId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXctorTranId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MonXctorTranId with another Field
	 *	@param value
	 */
   public void setMonXctorTranId(Field source) {
       replace(source,0,source.length(),beginMonXctorTranId,MON_XCTOR_TRAN_ID_LEN);
   	
   }  
   
     /**
	 * 	Update MonXctorTranId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXctorTranId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMonXctorTranId,MON_XCTOR_TRAN_ID_LEN);
   	
   }
   
     /**
	 * 	Update MonXctorTranId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXctorTranId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXctorTranId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of monXcaorSysId
	 *	@return monXcaorSysId
	 */
   public char[] getMonXcaorSysId() throws CFException{
     if (isMonXcaorSysIdModified()) { 
        monXcaorSysId = refreshMonXcaorSysId();
     }
   		return monXcaorSysId;
   }

  
	/**
	*  set variable monXcaorSysId
	*  Corresponding COBOL Variable is MON-XCAOR-SYS-ID
	*  @param value
	**/
   public void setMonXcaorSysId(char[] value) {
      monXcaorSysId = checkMonXcaorSysIdConstraints(value);
      serializeMonXcaorSysId(monXcaorSysId);
   } 

     /**
	 * 	Update MonXcaorSysId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcaorSysId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMonXcaorSysId,monXcaorSysId.length);
   	
   }
   
   public void setMonXcaorSysId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcaorSysId,monXcaorSysId.length);
   	
   }
   
     /**
	 * 	Update MonXcaorSysId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcaorSysId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcaorSysId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MonXcaorSysId with another Field
	 *	@param value
	 */
   public void setMonXcaorSysId(Field source) {
       replace(source,0,source.length(),beginMonXcaorSysId,MON_XCAOR_SYS_ID_LEN);
   	
   }  
   
     /**
	 * 	Update MonXcaorSysId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcaorSysId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMonXcaorSysId,MON_XCAOR_SYS_ID_LEN);
   	
   }
   
     /**
	 * 	Update MonXcaorSysId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcaorSysId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcaorSysId+targetIndex,targetLen);
    
   }
	public int getMonXcaorTskNo() throws CFException {
        if (isMonXcaorTskNoModified()) { 
           monXcaorTskNo = refreshMonXcaorTskNo();
        }
   		return monXcaorTskNo;
	}
	
	/**
	 * 	Update MonXcaorTskNo with the passed value
	 *  Corresponding COBOL Variable is MON-XCAOR-TSK-NO
	 *	@param number
	 */
	public void setMonXcaorTskNo(int number) {
			monXcaorTskNo = checkMonXcaorTskNoMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeMonXcaorTskNo(monXcaorTskNo);
	}


	public void setMonXcaorTskNo(long number) {
	    number = checkMonXcaorTskNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMonXcaorTskNo((int)number);
	}
	
	/**
	 *	Returns the value of monXcdtPgmTyCd
	 *	@return monXcdtPgmTyCd
	 */
   public char[] getMonXcdtPgmTyCd() throws CFException{
     if (isMonXcdtPgmTyCdModified()) { 
        monXcdtPgmTyCd = refreshMonXcdtPgmTyCd();
     }
   		return monXcdtPgmTyCd;
   }

  
	/**
	*  set variable monXcdtPgmTyCd
	*  Corresponding COBOL Variable is MON-XCDT-PGM-TY-CD
	*  @param value
	**/
   public void setMonXcdtPgmTyCd(char[] value) {
      monXcdtPgmTyCd = checkMonXcdtPgmTyCdConstraints(value);
      serializeMonXcdtPgmTyCd(monXcdtPgmTyCd);
   } 

     /**
	 * 	Update MonXcdtPgmTyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtPgmTyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMonXcdtPgmTyCd,monXcdtPgmTyCd.length);
   	
   }
   
   public void setMonXcdtPgmTyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtPgmTyCd,monXcdtPgmTyCd.length);
   	
   }
   
     /**
	 * 	Update MonXcdtPgmTyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtPgmTyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtPgmTyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MonXcdtPgmTyCd with another Field
	 *	@param value
	 */
   public void setMonXcdtPgmTyCd(Field source) {
       replace(source,0,source.length(),beginMonXcdtPgmTyCd,MON_XCDT_PGM_TY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update MonXcdtPgmTyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtPgmTyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMonXcdtPgmTyCd,MON_XCDT_PGM_TY_CD_LEN);
   	
   }
   
     /**
	 * 	Update MonXcdtPgmTyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtPgmTyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtPgmTyCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of monXcdtReqrIpAd
	 *	@return monXcdtReqrIpAd
	 */
   public char[] getMonXcdtReqrIpAd() throws CFException{
     if (isMonXcdtReqrIpAdModified()) { 
        monXcdtReqrIpAd = refreshMonXcdtReqrIpAd();
     }
   		return monXcdtReqrIpAd;
   }

  
	/**
	*  set variable monXcdtReqrIpAd
	*  Corresponding COBOL Variable is MON-XCDT-REQR-IP-AD
	*  @param value
	**/
   public void setMonXcdtReqrIpAd(char[] value) {
      monXcdtReqrIpAd = checkMonXcdtReqrIpAdConstraints(value);
      serializeMonXcdtReqrIpAd(monXcdtReqrIpAd);
   } 

     /**
	 * 	Update MonXcdtReqrIpAd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtReqrIpAd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMonXcdtReqrIpAd,monXcdtReqrIpAd.length);
   	
   }
   
   public void setMonXcdtReqrIpAd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtReqrIpAd,monXcdtReqrIpAd.length);
   	
   }
   
     /**
	 * 	Update MonXcdtReqrIpAd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtReqrIpAd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtReqrIpAd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MonXcdtReqrIpAd with another Field
	 *	@param value
	 */
   public void setMonXcdtReqrIpAd(Field source) {
       replace(source,0,source.length(),beginMonXcdtReqrIpAd,MON_XCDT_REQR_IP_AD_LEN);
   	
   }  
   
     /**
	 * 	Update MonXcdtReqrIpAd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtReqrIpAd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMonXcdtReqrIpAd,MON_XCDT_REQR_IP_AD_LEN);
   	
   }
   
     /**
	 * 	Update MonXcdtReqrIpAd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtReqrIpAd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtReqrIpAd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of monXcdtTskAorTm
	 *	@return monXcdtTskAorTm
	 */
	public int getMonXcdtTskAorTm() throws CFException {
        if (isMonXcdtTskAorTmModified()) { 
           monXcdtTskAorTm = refreshMonXcdtTskAorTm();
        }
   		return monXcdtTskAorTm;
	}
	
	/**
	 * 	Update MonXcdtTskAorTm with the passed value
	 *  Corresponding COBOL Variable is MON-XCDT-TSK-AOR-TM
	 *	@param number
	 */
	public void setMonXcdtTskAorTm(int number) {
	     // Truncate if the number is beyond +/- Max range
	    monXcdtTskAorTm = checkMonXcdtTskAorTmMaxLimit(number); 
		serializeMonXcdtTskAorTm(monXcdtTskAorTm);
	}


	public void setMonXcdtTskAorTm(long number) {
	    number = checkMonXcdtTskAorTmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMonXcdtTskAorTm((int)number);
	}
	
	/**
	 *	Returns the value of monXcdtTskElpsTm
	 *	@return monXcdtTskElpsTm
	 */
	public int getMonXcdtTskElpsTm() throws CFException {
        if (isMonXcdtTskElpsTmModified()) { 
           monXcdtTskElpsTm = refreshMonXcdtTskElpsTm();
        }
   		return monXcdtTskElpsTm;
	}
	
	/**
	 * 	Update MonXcdtTskElpsTm with the passed value
	 *  Corresponding COBOL Variable is MON-XCDT-TSK-ELPS-TM
	 *	@param number
	 */
	public void setMonXcdtTskElpsTm(int number) {
	     // Truncate if the number is beyond +/- Max range
	    monXcdtTskElpsTm = checkMonXcdtTskElpsTmMaxLimit(number); 
		serializeMonXcdtTskElpsTm(monXcdtTskElpsTm);
	}


	public void setMonXcdtTskElpsTm(long number) {
	    number = checkMonXcdtTskElpsTmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMonXcdtTskElpsTm((int)number);
	}
	
	/**
	 *	Returns the value of monXcdtTskCmpCd
	 *	@return monXcdtTskCmpCd
	 */
	public short getMonXcdtTskCmpCd() throws CFException {
        if (isMonXcdtTskCmpCdModified()) { 
           monXcdtTskCmpCd = refreshMonXcdtTskCmpCd();
        }
   		return monXcdtTskCmpCd;
	}
	
	/**
	 * 	Update MonXcdtTskCmpCd with the passed value
	 *  Corresponding COBOL Variable is MON-XCDT-TSK-CMP-CD
	 *	@param number
	 */
	public void setMonXcdtTskCmpCd(short number) {
	     // Truncate if the number is beyond +/- Max range
	    monXcdtTskCmpCd = checkMonXcdtTskCmpCdMaxLimit(number); 
		serializeMonXcdtTskCmpCd(monXcdtTskCmpCd);
	}

	public void setMonXcdtTskCmpCd(int number) {
	    number = checkMonXcdtTskCmpCdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMonXcdtTskCmpCd((short)number);
	}
	public void setMonXcdtTskCmpCd(long number) {
	    number = checkMonXcdtTskCmpCdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMonXcdtTskCmpCd((short)number);
	}
	

	/**
	 *	Returns the value of monXcdtTskAbndCd
	 *	@return monXcdtTskAbndCd
	 */
   public char[] getMonXcdtTskAbndCd() throws CFException{
     if (isMonXcdtTskAbndCdModified()) { 
        monXcdtTskAbndCd = refreshMonXcdtTskAbndCd();
     }
   		return monXcdtTskAbndCd;
   }

  
	/**
	*  set variable monXcdtTskAbndCd
	*  Corresponding COBOL Variable is MON-XCDT-TSK-ABND-CD
	*  @param value
	**/
   public void setMonXcdtTskAbndCd(char[] value) {
      monXcdtTskAbndCd = checkMonXcdtTskAbndCdConstraints(value);
      serializeMonXcdtTskAbndCd(monXcdtTskAbndCd);
   } 

     /**
	 * 	Update MonXcdtTskAbndCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtTskAbndCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMonXcdtTskAbndCd,monXcdtTskAbndCd.length);
   	
   }
   
   public void setMonXcdtTskAbndCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtTskAbndCd,monXcdtTskAbndCd.length);
   	
   }
   
     /**
	 * 	Update MonXcdtTskAbndCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskAbndCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtTskAbndCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MonXcdtTskAbndCd with another Field
	 *	@param value
	 */
   public void setMonXcdtTskAbndCd(Field source) {
       replace(source,0,source.length(),beginMonXcdtTskAbndCd,MON_XCDT_TSK_ABND_CD_LEN);
   	
   }  
   
     /**
	 * 	Update MonXcdtTskAbndCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtTskAbndCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMonXcdtTskAbndCd,MON_XCDT_TSK_ABND_CD_LEN);
   	
   }
   
     /**
	 * 	Update MonXcdtTskAbndCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskAbndCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonXcdtTskAbndCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of monXcdtReqSz
	 *	@return monXcdtReqSz
	 */
	public int getMonXcdtReqSz() throws CFException {
        if (isMonXcdtReqSzModified()) { 
           monXcdtReqSz = refreshMonXcdtReqSz();
        }
   		return monXcdtReqSz;
	}
	
	/**
	 * 	Update MonXcdtReqSz with the passed value
	 *  Corresponding COBOL Variable is MON-XCDT-REQ-SZ
	 *	@param number
	 */
	public void setMonXcdtReqSz(int number) {
	     // Truncate if the number is beyond +/- Max range
	    monXcdtReqSz = checkMonXcdtReqSzMaxLimit(number); 
		serializeMonXcdtReqSz(monXcdtReqSz);
	}


	public void setMonXcdtReqSz(long number) {
	    number = checkMonXcdtReqSzMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMonXcdtReqSz((int)number);
	}
	
	/**
	 *	Returns the value of monXcdtRespSz
	 *	@return monXcdtRespSz
	 */
	public int getMonXcdtRespSz() throws CFException {
        if (isMonXcdtRespSzModified()) { 
           monXcdtRespSz = refreshMonXcdtRespSz();
        }
   		return monXcdtRespSz;
	}
	
	/**
	 * 	Update MonXcdtRespSz with the passed value
	 *  Corresponding COBOL Variable is MON-XCDT-RESP-SZ
	 *	@param number
	 */
	public void setMonXcdtRespSz(int number) {
	     // Truncate if the number is beyond +/- Max range
	    monXcdtRespSz = checkMonXcdtRespSzMaxLimit(number); 
		serializeMonXcdtRespSz(monXcdtRespSz);
	}


	public void setMonXcdtRespSz(long number) {
	    number = checkMonXcdtRespSzMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMonXcdtRespSz((int)number);
	}
	
	/**
	 *	Returns the value of monUsertoken
	 *	@return monUsertoken
	 */
   public char[] getMonUsertoken() throws CFException{
     if (isMonUsertokenModified()) { 
        monUsertoken = refreshMonUsertoken();
     }
   		return monUsertoken;
   }

  
	/**
	*  set variable monUsertoken
	*  Corresponding COBOL Variable is MON-USERTOKEN
	*  @param value
	**/
   public void setMonUsertoken(char[] value) {
      monUsertoken = checkMonUsertokenConstraints(value);
      serializeMonUsertoken(monUsertoken);
   } 

     /**
	 * 	Update MonUsertoken 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonUsertoken(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMonUsertoken,monUsertoken.length);
   	
   }
   
   public void setMonUsertoken(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMonUsertoken,monUsertoken.length);
   	
   }
   
     /**
	 * 	Update MonUsertoken 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonUsertoken(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonUsertoken+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MonUsertoken with another Field
	 *	@param value
	 */
   public void setMonUsertoken(Field source) {
       replace(source,0,source.length(),beginMonUsertoken,MON_USERTOKEN_LEN);
   	
   }  
   
     /**
	 * 	Update MonUsertoken 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonUsertoken(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMonUsertoken,MON_USERTOKEN_LEN);
   	
   }
   
     /**
	 * 	Update MonUsertoken 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonUsertoken(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonUsertoken+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes MonitorRecord
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          monPriKey.initialize();
     
         setMonXctorSysId(CONSTANTS.SPACE_4);
         setMonXctorTranId(CONSTANTS.SPACE_4);
         setMonXcaorSysId(CONSTANTS.SPACE_4);
                     setMonXcaorTskNo(0);
         setMonXcdtPgmTyCd(CONSTANTS.SPACE_35);
         setMonXcdtReqrIpAd(CONSTANTS.SPACE_15);
                     setMonXcdtTskAorTm(0);
                     setMonXcdtTskElpsTm(0);
         	setMonXcdtTskCmpCd((short)0);
         setMonXcdtTskAbndCd(CONSTANTS.SPACE_4);
                     setMonXcdtReqSz(0);
                     setMonXcdtRespSz(0);
         setMonUsertoken(CONSTANTS.SPACE_128);
   }

		public static int getMonitorRecordFieldLength() {
			return MONITOR_RECORD_LENGTH;
		}

}
  
