package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip30781TipaccdTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:02. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip30781TipaccdTable")

public class Ip30781TipaccdTable extends Ip30781TipaccdTableSerialized  implements InitializingBean {
   

								private short ip30781ClrCyclId;

						private char[] ip30781EffTs = Field.fillLowValue(26);

						private char[] ip30781ClrCyclDt = Field.fillLowValue(10);

						private char[] ip30781ClrCyclTm = Field.fillLowValue(8);

						private char[] ip30781RecStatCd = Field.fillLowValue(1);

						private char[] ip30781UtcDt = Field.fillLowValue(10);

						private char[] ip30781UtcTm = Field.fillLowValue(8);

						private char[] ip30781ClrCyclRpmSw = Field.fillLowValue(1);

								private int ip30781ClrCyclRpmNum;

						private char[] ip30781DfltDlvryCyclSw = Field.fillLowValue(1);

						private char[] ip30781MqRespCd = Field.fillLowValue(1);

						private char[] ip30781OvrdeTmoutSw = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip30781TipaccdTable
	**/
    public Ip30781TipaccdTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	public short getIp30781ClrCyclId() throws CFException {
        if (isIp30781ClrCyclIdModified()) { 
           ip30781ClrCyclId = refreshIp30781ClrCyclId();
        }
   		return ip30781ClrCyclId;
	}
	
	/**
	 * 	Update Ip30781ClrCyclId with the passed value
	 *  Corresponding COBOL Variable is IP30781-CLR-CYCL-ID
	 *	@param number
	 */
	public void setIp30781ClrCyclId(short number) {
			ip30781ClrCyclId = checkIp30781ClrCyclIdMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeIp30781ClrCyclId(ip30781ClrCyclId);
	}

	public void setIp30781ClrCyclId(int number) {
	    number = checkIp30781ClrCyclIdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp30781ClrCyclId((short)number);
	}
	public void setIp30781ClrCyclId(long number) {
	    number = checkIp30781ClrCyclIdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp30781ClrCyclId((short)number);
	}
	

	/**
	 *	Returns the value of ip30781EffTs
	 *	@return ip30781EffTs
	 */
   public char[] getIp30781EffTs() throws CFException{
     if (isIp30781EffTsModified()) { 
        ip30781EffTs = refreshIp30781EffTs();
     }
   		return ip30781EffTs;
   }

  
	/**
	*  set variable ip30781EffTs
	*  Corresponding COBOL Variable is IP30781-EFF-TS
	*  @param value
	**/
   public void setIp30781EffTs(char[] value) {
      ip30781EffTs = checkIp30781EffTsConstraints(value);
      serializeIp30781EffTs(ip30781EffTs);
   } 

     /**
	 * 	Update Ip30781EffTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp30781EffTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp30781EffTs,ip30781EffTs.length);
   	
   }
   
   public void setIp30781EffTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781EffTs,ip30781EffTs.length);
   	
   }
   
     /**
	 * 	Update Ip30781EffTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30781EffTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781EffTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip30781EffTs with another Field
	 *	@param value
	 */
   public void setIp30781EffTs(Field source) {
       replace(source,0,source.length(),beginIp30781EffTs,IP_30781_EFF_TS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip30781EffTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp30781EffTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp30781EffTs,IP_30781_EFF_TS_LEN);
   	
   }
   
     /**
	 * 	Update Ip30781EffTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30781EffTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781EffTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip30781ClrCyclDt
	 *	@return ip30781ClrCyclDt
	 */
   public char[] getIp30781ClrCyclDt() throws CFException{
     if (isIp30781ClrCyclDtModified()) { 
        ip30781ClrCyclDt = refreshIp30781ClrCyclDt();
     }
   		return ip30781ClrCyclDt;
   }

  
	/**
	*  set variable ip30781ClrCyclDt
	*  Corresponding COBOL Variable is IP30781-CLR-CYCL-DT
	*  @param value
	**/
   public void setIp30781ClrCyclDt(char[] value) {
      ip30781ClrCyclDt = checkIp30781ClrCyclDtConstraints(value);
      serializeIp30781ClrCyclDt(ip30781ClrCyclDt);
   } 

     /**
	 * 	Update Ip30781ClrCyclDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp30781ClrCyclDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp30781ClrCyclDt,ip30781ClrCyclDt.length);
   	
   }
   
   public void setIp30781ClrCyclDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781ClrCyclDt,ip30781ClrCyclDt.length);
   	
   }
   
     /**
	 * 	Update Ip30781ClrCyclDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30781ClrCyclDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781ClrCyclDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip30781ClrCyclDt with another Field
	 *	@param value
	 */
   public void setIp30781ClrCyclDt(Field source) {
       replace(source,0,source.length(),beginIp30781ClrCyclDt,IP_30781_CLR_CYCL_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip30781ClrCyclDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp30781ClrCyclDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp30781ClrCyclDt,IP_30781_CLR_CYCL_DT_LEN);
   	
   }
   
     /**
	 * 	Update Ip30781ClrCyclDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30781ClrCyclDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781ClrCyclDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip30781ClrCyclTm
	 *	@return ip30781ClrCyclTm
	 */
   public char[] getIp30781ClrCyclTm() throws CFException{
     if (isIp30781ClrCyclTmModified()) { 
        ip30781ClrCyclTm = refreshIp30781ClrCyclTm();
     }
   		return ip30781ClrCyclTm;
   }

  
	/**
	*  set variable ip30781ClrCyclTm
	*  Corresponding COBOL Variable is IP30781-CLR-CYCL-TM
	*  @param value
	**/
   public void setIp30781ClrCyclTm(char[] value) {
      ip30781ClrCyclTm = checkIp30781ClrCyclTmConstraints(value);
      serializeIp30781ClrCyclTm(ip30781ClrCyclTm);
   } 

     /**
	 * 	Update Ip30781ClrCyclTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp30781ClrCyclTm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp30781ClrCyclTm,ip30781ClrCyclTm.length);
   	
   }
   
   public void setIp30781ClrCyclTm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781ClrCyclTm,ip30781ClrCyclTm.length);
   	
   }
   
     /**
	 * 	Update Ip30781ClrCyclTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30781ClrCyclTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781ClrCyclTm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip30781ClrCyclTm with another Field
	 *	@param value
	 */
   public void setIp30781ClrCyclTm(Field source) {
       replace(source,0,source.length(),beginIp30781ClrCyclTm,IP_30781_CLR_CYCL_TM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip30781ClrCyclTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp30781ClrCyclTm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp30781ClrCyclTm,IP_30781_CLR_CYCL_TM_LEN);
   	
   }
   
     /**
	 * 	Update Ip30781ClrCyclTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30781ClrCyclTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781ClrCyclTm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip30781RecStatCd
	 *	@return ip30781RecStatCd
	 */
   public char[] getIp30781RecStatCd() throws CFException{
     if (isIp30781RecStatCdModified()) { 
        ip30781RecStatCd = refreshIp30781RecStatCd();
     }
   		return ip30781RecStatCd;
   }

  
	/**
	*  set variable ip30781RecStatCd
	*  Corresponding COBOL Variable is IP30781-REC-STAT-CD
	*  @param value
	**/
   public void setIp30781RecStatCd(char[] value) {
      ip30781RecStatCd = checkIp30781RecStatCdConstraints(value);
      serializeIp30781RecStatCd(ip30781RecStatCd);
   } 

     /**
	 * 	Update Ip30781RecStatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp30781RecStatCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp30781RecStatCd,ip30781RecStatCd.length);
   	
   }
   
   public void setIp30781RecStatCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781RecStatCd,ip30781RecStatCd.length);
   	
   }
   
     /**
	 * 	Update Ip30781RecStatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30781RecStatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781RecStatCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip30781RecStatCd with another Field
	 *	@param value
	 */
   public void setIp30781RecStatCd(Field source) {
       replace(source,0,source.length(),beginIp30781RecStatCd,IP_30781_REC_STAT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip30781RecStatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp30781RecStatCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp30781RecStatCd,IP_30781_REC_STAT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip30781RecStatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30781RecStatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781RecStatCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip30781UtcDt
	 *	@return ip30781UtcDt
	 */
   public char[] getIp30781UtcDt() throws CFException{
     if (isIp30781UtcDtModified()) { 
        ip30781UtcDt = refreshIp30781UtcDt();
     }
   		return ip30781UtcDt;
   }

  
	/**
	*  set variable ip30781UtcDt
	*  Corresponding COBOL Variable is IP30781-UTC-DT
	*  @param value
	**/
   public void setIp30781UtcDt(char[] value) {
      ip30781UtcDt = checkIp30781UtcDtConstraints(value);
      serializeIp30781UtcDt(ip30781UtcDt);
   } 

     /**
	 * 	Update Ip30781UtcDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp30781UtcDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp30781UtcDt,ip30781UtcDt.length);
   	
   }
   
   public void setIp30781UtcDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781UtcDt,ip30781UtcDt.length);
   	
   }
   
     /**
	 * 	Update Ip30781UtcDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30781UtcDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781UtcDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip30781UtcDt with another Field
	 *	@param value
	 */
   public void setIp30781UtcDt(Field source) {
       replace(source,0,source.length(),beginIp30781UtcDt,IP_30781_UTC_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip30781UtcDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp30781UtcDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp30781UtcDt,IP_30781_UTC_DT_LEN);
   	
   }
   
     /**
	 * 	Update Ip30781UtcDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30781UtcDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781UtcDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip30781UtcTm
	 *	@return ip30781UtcTm
	 */
   public char[] getIp30781UtcTm() throws CFException{
     if (isIp30781UtcTmModified()) { 
        ip30781UtcTm = refreshIp30781UtcTm();
     }
   		return ip30781UtcTm;
   }

  
	/**
	*  set variable ip30781UtcTm
	*  Corresponding COBOL Variable is IP30781-UTC-TM
	*  @param value
	**/
   public void setIp30781UtcTm(char[] value) {
      ip30781UtcTm = checkIp30781UtcTmConstraints(value);
      serializeIp30781UtcTm(ip30781UtcTm);
   } 

     /**
	 * 	Update Ip30781UtcTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp30781UtcTm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp30781UtcTm,ip30781UtcTm.length);
   	
   }
   
   public void setIp30781UtcTm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781UtcTm,ip30781UtcTm.length);
   	
   }
   
     /**
	 * 	Update Ip30781UtcTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30781UtcTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781UtcTm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip30781UtcTm with another Field
	 *	@param value
	 */
   public void setIp30781UtcTm(Field source) {
       replace(source,0,source.length(),beginIp30781UtcTm,IP_30781_UTC_TM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip30781UtcTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp30781UtcTm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp30781UtcTm,IP_30781_UTC_TM_LEN);
   	
   }
   
     /**
	 * 	Update Ip30781UtcTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30781UtcTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781UtcTm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip30781ClrCyclRpmSw
	 *	@return ip30781ClrCyclRpmSw
	 */
   public char[] getIp30781ClrCyclRpmSw() throws CFException{
     if (isIp30781ClrCyclRpmSwModified()) { 
        ip30781ClrCyclRpmSw = refreshIp30781ClrCyclRpmSw();
     }
   		return ip30781ClrCyclRpmSw;
   }

  
	/**
	*  set variable ip30781ClrCyclRpmSw
	*  Corresponding COBOL Variable is IP30781-CLR-CYCL-RPM-SW
	*  @param value
	**/
   public void setIp30781ClrCyclRpmSw(char[] value) {
      ip30781ClrCyclRpmSw = checkIp30781ClrCyclRpmSwConstraints(value);
      serializeIp30781ClrCyclRpmSw(ip30781ClrCyclRpmSw);
   } 

     /**
	 * 	Update Ip30781ClrCyclRpmSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp30781ClrCyclRpmSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp30781ClrCyclRpmSw,ip30781ClrCyclRpmSw.length);
   	
   }
   
   public void setIp30781ClrCyclRpmSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781ClrCyclRpmSw,ip30781ClrCyclRpmSw.length);
   	
   }
   
     /**
	 * 	Update Ip30781ClrCyclRpmSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30781ClrCyclRpmSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781ClrCyclRpmSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip30781ClrCyclRpmSw with another Field
	 *	@param value
	 */
   public void setIp30781ClrCyclRpmSw(Field source) {
       replace(source,0,source.length(),beginIp30781ClrCyclRpmSw,IP_30781_CLR_CYCL_RPM_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip30781ClrCyclRpmSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp30781ClrCyclRpmSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp30781ClrCyclRpmSw,IP_30781_CLR_CYCL_RPM_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip30781ClrCyclRpmSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30781ClrCyclRpmSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781ClrCyclRpmSw+targetIndex,targetLen);
    
   }
	public int getIp30781ClrCyclRpmNum() throws CFException {
        if (isIp30781ClrCyclRpmNumModified()) { 
           ip30781ClrCyclRpmNum = refreshIp30781ClrCyclRpmNum();
        }
   		return ip30781ClrCyclRpmNum;
	}
	
	/**
	 * 	Update Ip30781ClrCyclRpmNum with the passed value
	 *  Corresponding COBOL Variable is IP30781-CLR-CYCL-RPM-NUM
	 *	@param number
	 */
	public void setIp30781ClrCyclRpmNum(int number) {
			ip30781ClrCyclRpmNum = checkIp30781ClrCyclRpmNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeIp30781ClrCyclRpmNum(ip30781ClrCyclRpmNum);
	}


	public void setIp30781ClrCyclRpmNum(long number) {
	    number = checkIp30781ClrCyclRpmNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp30781ClrCyclRpmNum((int)number);
	}
	
	/**
	 *	Returns the value of ip30781DfltDlvryCyclSw
	 *	@return ip30781DfltDlvryCyclSw
	 */
   public char[] getIp30781DfltDlvryCyclSw() throws CFException{
     if (isIp30781DfltDlvryCyclSwModified()) { 
        ip30781DfltDlvryCyclSw = refreshIp30781DfltDlvryCyclSw();
     }
   		return ip30781DfltDlvryCyclSw;
   }

  
	/**
	*  set variable ip30781DfltDlvryCyclSw
	*  Corresponding COBOL Variable is IP30781-DFLT-DLVRY-CYCL-SW
	*  @param value
	**/
   public void setIp30781DfltDlvryCyclSw(char[] value) {
      ip30781DfltDlvryCyclSw = checkIp30781DfltDlvryCyclSwConstraints(value);
      serializeIp30781DfltDlvryCyclSw(ip30781DfltDlvryCyclSw);
   } 

     /**
	 * 	Update Ip30781DfltDlvryCyclSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp30781DfltDlvryCyclSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp30781DfltDlvryCyclSw,ip30781DfltDlvryCyclSw.length);
   	
   }
   
   public void setIp30781DfltDlvryCyclSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781DfltDlvryCyclSw,ip30781DfltDlvryCyclSw.length);
   	
   }
   
     /**
	 * 	Update Ip30781DfltDlvryCyclSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30781DfltDlvryCyclSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781DfltDlvryCyclSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip30781DfltDlvryCyclSw with another Field
	 *	@param value
	 */
   public void setIp30781DfltDlvryCyclSw(Field source) {
       replace(source,0,source.length(),beginIp30781DfltDlvryCyclSw,IP_30781_DFLT_DLVRY_CYCL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip30781DfltDlvryCyclSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp30781DfltDlvryCyclSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp30781DfltDlvryCyclSw,IP_30781_DFLT_DLVRY_CYCL_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip30781DfltDlvryCyclSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30781DfltDlvryCyclSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781DfltDlvryCyclSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip30781MqRespCd
	 *	@return ip30781MqRespCd
	 */
   public char[] getIp30781MqRespCd() throws CFException{
     if (isIp30781MqRespCdModified()) { 
        ip30781MqRespCd = refreshIp30781MqRespCd();
     }
   		return ip30781MqRespCd;
   }

  
	/**
	*  set variable ip30781MqRespCd
	*  Corresponding COBOL Variable is IP30781-MQ-RESP-CD
	*  @param value
	**/
   public void setIp30781MqRespCd(char[] value) {
      ip30781MqRespCd = checkIp30781MqRespCdConstraints(value);
      serializeIp30781MqRespCd(ip30781MqRespCd);
   } 

     /**
	 * 	Update Ip30781MqRespCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp30781MqRespCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp30781MqRespCd,ip30781MqRespCd.length);
   	
   }
   
   public void setIp30781MqRespCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781MqRespCd,ip30781MqRespCd.length);
   	
   }
   
     /**
	 * 	Update Ip30781MqRespCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30781MqRespCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781MqRespCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip30781MqRespCd with another Field
	 *	@param value
	 */
   public void setIp30781MqRespCd(Field source) {
       replace(source,0,source.length(),beginIp30781MqRespCd,IP_30781_MQ_RESP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip30781MqRespCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp30781MqRespCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp30781MqRespCd,IP_30781_MQ_RESP_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip30781MqRespCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30781MqRespCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781MqRespCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip30781OvrdeTmoutSw
	 *	@return ip30781OvrdeTmoutSw
	 */
   public char[] getIp30781OvrdeTmoutSw() throws CFException{
     if (isIp30781OvrdeTmoutSwModified()) { 
        ip30781OvrdeTmoutSw = refreshIp30781OvrdeTmoutSw();
     }
   		return ip30781OvrdeTmoutSw;
   }

  
	/**
	*  set variable ip30781OvrdeTmoutSw
	*  Corresponding COBOL Variable is IP30781-OVRDE-TMOUT-SW
	*  @param value
	**/
   public void setIp30781OvrdeTmoutSw(char[] value) {
      ip30781OvrdeTmoutSw = checkIp30781OvrdeTmoutSwConstraints(value);
      serializeIp30781OvrdeTmoutSw(ip30781OvrdeTmoutSw);
   } 

     /**
	 * 	Update Ip30781OvrdeTmoutSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp30781OvrdeTmoutSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp30781OvrdeTmoutSw,ip30781OvrdeTmoutSw.length);
   	
   }
   
   public void setIp30781OvrdeTmoutSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781OvrdeTmoutSw,ip30781OvrdeTmoutSw.length);
   	
   }
   
     /**
	 * 	Update Ip30781OvrdeTmoutSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30781OvrdeTmoutSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781OvrdeTmoutSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip30781OvrdeTmoutSw with another Field
	 *	@param value
	 */
   public void setIp30781OvrdeTmoutSw(Field source) {
       replace(source,0,source.length(),beginIp30781OvrdeTmoutSw,IP_30781_OVRDE_TMOUT_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip30781OvrdeTmoutSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp30781OvrdeTmoutSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp30781OvrdeTmoutSw,IP_30781_OVRDE_TMOUT_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip30781OvrdeTmoutSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30781OvrdeTmoutSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30781OvrdeTmoutSw+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip30781TipaccdTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp30781ClrCyclId((short)0);
         setIp30781EffTs(CONSTANTS.SPACE_26);
         setIp30781ClrCyclDt(CONSTANTS.SPACE_10);
         setIp30781ClrCyclTm(CONSTANTS.SPACE_8);
         setIp30781RecStatCd(CONSTANTS.SPACE);
         setIp30781UtcDt(CONSTANTS.SPACE_10);
         setIp30781UtcTm(CONSTANTS.SPACE_8);
         setIp30781ClrCyclRpmSw(CONSTANTS.SPACE);
                     setIp30781ClrCyclRpmNum(0);
         setIp30781DfltDlvryCyclSw(CONSTANTS.SPACE);
         setIp30781MqRespCd(CONSTANTS.SPACE);
         setIp30781OvrdeTmoutSw(CONSTANTS.SPACE);
   }

		public static int getIp30781TipaccdTableFieldLength() {
			return IP_30781_TIPACCD_TABLE_LENGTH;
		}

}
  
