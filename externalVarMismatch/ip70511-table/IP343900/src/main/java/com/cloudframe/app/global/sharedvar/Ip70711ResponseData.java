package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70711ResponseData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip70711ResponseData extends Ip70711ResponseDataSerialized { 
   

						private char[] ip70711MqRespCd = Field.fillLowValue(1);

						private char[] ip70711StrtJobNum = Field.fillLowValue(8);

						private char[] ip70711StrtTs = Field.fillLowValue(26);

						private char[] ip70711StatCd = Field.fillLowValue(1);

						private char[] ip70711JobGrpId = Field.fillLowValue(6);

								private int ip70711JobGrpNum;

								private short ip70711RespDataTxtLen;

						private char[] ip70711RespDataTxt = Field.fillLowValue(2000);

						private char[] ip70711RejStatCd = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70711ResponseData
	**/
    public Ip70711ResponseData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip70711ResponseData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip70711ResponseData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip70711MqRespCd
	 *	@return ip70711MqRespCd
	 */
   public char[] getIp70711MqRespCd() throws CFException{
     if (isIp70711MqRespCdModified()) { 
        ip70711MqRespCd = refreshIp70711MqRespCd();
     }
   		return ip70711MqRespCd;
   }

  
	/**
	*  set variable ip70711MqRespCd
	*  Corresponding COBOL Variable is IP70711-MQ-RESP-CD
	*  @param value
	**/
   public void setIp70711MqRespCd(char[] value) {
      ip70711MqRespCd = checkIp70711MqRespCdConstraints(value);
      serializeIp70711MqRespCd(ip70711MqRespCd);
   } 

     /**
	 * 	Update Ip70711MqRespCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70711MqRespCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70711MqRespCd,ip70711MqRespCd.length);
   	
   }
   
   public void setIp70711MqRespCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711MqRespCd,ip70711MqRespCd.length);
   	
   }
   
     /**
	 * 	Update Ip70711MqRespCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70711MqRespCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711MqRespCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70711MqRespCd with another Field
	 *	@param value
	 */
   public void setIp70711MqRespCd(Field source) {
       replace(source,0,source.length(),beginIp70711MqRespCd,IP_70711_MQ_RESP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70711MqRespCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70711MqRespCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70711MqRespCd,IP_70711_MQ_RESP_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip70711MqRespCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70711MqRespCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711MqRespCd+targetIndex,targetLen);
    
   }
	char[] ip70711ResRespN88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70711ResRespN()
	 *	@return  Returns true if isIp70711ResRespN() is "N"
	 */
   public boolean isIp70711ResRespN() throws CFException {
      return (  compareChars( getIp70711MqRespCd() , ip70711ResRespN88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70711ResRespNTrue() {  			
    	setIp70711MqRespCd( ip70711ResRespN88Value);
   	}
	char[] ip70711ResRespR88Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isIp70711ResRespR()
	 *	@return  Returns true if isIp70711ResRespR() is "R"
	 */
   public boolean isIp70711ResRespR() throws CFException {
      return (  compareChars( getIp70711MqRespCd() , ip70711ResRespR88Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setIp70711ResRespRTrue() {  			
    	setIp70711MqRespCd( ip70711ResRespR88Value);
   	}
	char[] ip70711ResRespC88Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp70711ResRespC()
	 *	@return  Returns true if isIp70711ResRespC() is "C"
	 */
   public boolean isIp70711ResRespC() throws CFException {
      return (  compareChars( getIp70711MqRespCd() , ip70711ResRespC88Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp70711ResRespCTrue() {  			
    	setIp70711MqRespCd( ip70711ResRespC88Value);
   	}
	/**
	 *	Returns the value of ip70711StrtJobNum
	 *	@return ip70711StrtJobNum
	 */
   public char[] getIp70711StrtJobNum() throws CFException{
     if (isIp70711StrtJobNumModified()) { 
        ip70711StrtJobNum = refreshIp70711StrtJobNum();
     }
   		return ip70711StrtJobNum;
   }

  
	/**
	*  set variable ip70711StrtJobNum
	*  Corresponding COBOL Variable is IP70711-STRT-JOB-NUM
	*  @param value
	**/
   public void setIp70711StrtJobNum(char[] value) {
      ip70711StrtJobNum = checkIp70711StrtJobNumConstraints(value);
      serializeIp70711StrtJobNum(ip70711StrtJobNum);
   } 

     /**
	 * 	Update Ip70711StrtJobNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70711StrtJobNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70711StrtJobNum,ip70711StrtJobNum.length);
   	
   }
   
   public void setIp70711StrtJobNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711StrtJobNum,ip70711StrtJobNum.length);
   	
   }
   
     /**
	 * 	Update Ip70711StrtJobNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70711StrtJobNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711StrtJobNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70711StrtJobNum with another Field
	 *	@param value
	 */
   public void setIp70711StrtJobNum(Field source) {
       replace(source,0,source.length(),beginIp70711StrtJobNum,IP_70711_STRT_JOB_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70711StrtJobNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70711StrtJobNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70711StrtJobNum,IP_70711_STRT_JOB_NUM_LEN);
   	
   }
   
     /**
	 * 	Update Ip70711StrtJobNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70711StrtJobNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711StrtJobNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip70711StrtTs
	 *	@return ip70711StrtTs
	 */
   public char[] getIp70711StrtTs() throws CFException{
     if (isIp70711StrtTsModified()) { 
        ip70711StrtTs = refreshIp70711StrtTs();
     }
   		return ip70711StrtTs;
   }

  
	/**
	*  set variable ip70711StrtTs
	*  Corresponding COBOL Variable is IP70711-STRT-TS
	*  @param value
	**/
   public void setIp70711StrtTs(char[] value) {
      ip70711StrtTs = checkIp70711StrtTsConstraints(value);
      serializeIp70711StrtTs(ip70711StrtTs);
   } 

     /**
	 * 	Update Ip70711StrtTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70711StrtTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70711StrtTs,ip70711StrtTs.length);
   	
   }
   
   public void setIp70711StrtTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711StrtTs,ip70711StrtTs.length);
   	
   }
   
     /**
	 * 	Update Ip70711StrtTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70711StrtTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711StrtTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70711StrtTs with another Field
	 *	@param value
	 */
   public void setIp70711StrtTs(Field source) {
       replace(source,0,source.length(),beginIp70711StrtTs,IP_70711_STRT_TS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70711StrtTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70711StrtTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70711StrtTs,IP_70711_STRT_TS_LEN);
   	
   }
   
     /**
	 * 	Update Ip70711StrtTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70711StrtTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711StrtTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip70711StatCd
	 *	@return ip70711StatCd
	 */
   public char[] getIp70711StatCd() throws CFException{
     if (isIp70711StatCdModified()) { 
        ip70711StatCd = refreshIp70711StatCd();
     }
   		return ip70711StatCd;
   }

  
	/**
	*  set variable ip70711StatCd
	*  Corresponding COBOL Variable is IP70711-STAT-CD
	*  @param value
	**/
   public void setIp70711StatCd(char[] value) {
      ip70711StatCd = checkIp70711StatCdConstraints(value);
      serializeIp70711StatCd(ip70711StatCd);
   } 

     /**
	 * 	Update Ip70711StatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70711StatCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70711StatCd,ip70711StatCd.length);
   	
   }
   
   public void setIp70711StatCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711StatCd,ip70711StatCd.length);
   	
   }
   
     /**
	 * 	Update Ip70711StatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70711StatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711StatCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70711StatCd with another Field
	 *	@param value
	 */
   public void setIp70711StatCd(Field source) {
       replace(source,0,source.length(),beginIp70711StatCd,IP_70711_STAT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70711StatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70711StatCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70711StatCd,IP_70711_STAT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip70711StatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70711StatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711StatCd+targetIndex,targetLen);
    
   }
	char[] ip70711ResComplete88Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp70711ResComplete()
	 *	@return  Returns true if isIp70711ResComplete() is "C"
	 */
   public boolean isIp70711ResComplete() throws CFException {
      return (  compareChars( getIp70711StatCd() , ip70711ResComplete88Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp70711ResCompleteTrue() {  			
    	setIp70711StatCd( ip70711ResComplete88Value);
   	}
	char[] ip70711ResTimeout88Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isIp70711ResTimeout()
	 *	@return  Returns true if isIp70711ResTimeout() is "T"
	 */
   public boolean isIp70711ResTimeout() throws CFException {
      return (  compareChars( getIp70711StatCd() , ip70711ResTimeout88Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setIp70711ResTimeoutTrue() {  			
    	setIp70711StatCd( ip70711ResTimeout88Value);
   	}
	/**
	 *	Returns the value of ip70711JobGrpId
	 *	@return ip70711JobGrpId
	 */
   public char[] getIp70711JobGrpId() throws CFException{
     if (isIp70711JobGrpIdModified()) { 
        ip70711JobGrpId = refreshIp70711JobGrpId();
     }
   		return ip70711JobGrpId;
   }

  
	/**
	*  set variable ip70711JobGrpId
	*  Corresponding COBOL Variable is IP70711-JOB-GRP-ID
	*  @param value
	**/
   public void setIp70711JobGrpId(char[] value) {
      ip70711JobGrpId = checkIp70711JobGrpIdConstraints(value);
      serializeIp70711JobGrpId(ip70711JobGrpId);
   } 

     /**
	 * 	Update Ip70711JobGrpId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70711JobGrpId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70711JobGrpId,ip70711JobGrpId.length);
   	
   }
   
   public void setIp70711JobGrpId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711JobGrpId,ip70711JobGrpId.length);
   	
   }
   
     /**
	 * 	Update Ip70711JobGrpId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70711JobGrpId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711JobGrpId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70711JobGrpId with another Field
	 *	@param value
	 */
   public void setIp70711JobGrpId(Field source) {
       replace(source,0,source.length(),beginIp70711JobGrpId,IP_70711_JOB_GRP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70711JobGrpId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70711JobGrpId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70711JobGrpId,IP_70711_JOB_GRP_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip70711JobGrpId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70711JobGrpId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711JobGrpId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip70711JobGrpNum
	 *	@return ip70711JobGrpNum
	 */
	public int getIp70711JobGrpNum() throws CFException {
       if (isIp70711JobGrpNumModified()) { 
           ip70711JobGrpNum = refreshIp70711JobGrpNum();
        }
   		return ip70711JobGrpNum;
	}
	

	
	   
	/**
	 * 	Update Ip70711JobGrpNum with the passed value
	 *  Corresponding COBOL Variable is IP70711-JOB-GRP-NUM
	 *	@param number
	 */
	public void setIp70711JobGrpNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip70711JobGrpNum = checkIp70711JobGrpNumMaxLimit(number); 
		serializeIp70711JobGrpNum(ip70711JobGrpNum);
	}
	

	public void setIp70711JobGrpNum(long number) {
	    number = checkIp70711JobGrpNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp70711JobGrpNum((int)number);
	}
	
	/**
	 * 	Update Ip70711JobGrpNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp70711JobGrpNum(char[] value) throws CFException {
		 ip70711JobGrpNum = serializeIp70711JobGrpNum(value);
	}
	/**
	 * 	Update Ip70711JobGrpNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp70711JobGrpNumString(char[] value) throws CFException {
		 setIp70711JobGrpNum(value);
	}
	/**
	 *	Returns the value of ip70711RespDataTxtLen
	 *	@return ip70711RespDataTxtLen
	 */
	public short getIp70711RespDataTxtLen() throws CFException {
        if (isIp70711RespDataTxtLenModified()) { 
           ip70711RespDataTxtLen = refreshIp70711RespDataTxtLen();
        }
   		return ip70711RespDataTxtLen;
	}
	
	/**
	 * 	Update Ip70711RespDataTxtLen with the passed value
	 *  Corresponding COBOL Variable is IP70711-RESP-DATA-TXT-LEN
	 *	@param number
	 */
	public void setIp70711RespDataTxtLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip70711RespDataTxtLen = checkIp70711RespDataTxtLenMaxLimit(number); 
		serializeIp70711RespDataTxtLen(ip70711RespDataTxtLen);
	}

	public void setIp70711RespDataTxtLen(int number) {
	    number = checkIp70711RespDataTxtLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp70711RespDataTxtLen((short)number);
	}
	public void setIp70711RespDataTxtLen(long number) {
	    number = checkIp70711RespDataTxtLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp70711RespDataTxtLen((short)number);
	}
	

	/**
	 *	Returns the value of ip70711RespDataTxt
	 *	@return ip70711RespDataTxt
	 */
   public char[] getIp70711RespDataTxt() throws CFException{
     if (isIp70711RespDataTxtModified()) { 
        ip70711RespDataTxt = refreshIp70711RespDataTxt();
     }
   		return ip70711RespDataTxt;
   }

  
	/**
	*  set variable ip70711RespDataTxt
	*  Corresponding COBOL Variable is IP70711-RESP-DATA-TXT
	*  @param value
	**/
   public void setIp70711RespDataTxt(char[] value) {
      ip70711RespDataTxt = checkIp70711RespDataTxtConstraints(value);
      serializeIp70711RespDataTxt(ip70711RespDataTxt);
   } 

     /**
	 * 	Update Ip70711RespDataTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70711RespDataTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70711RespDataTxt,ip70711RespDataTxt.length);
   	
   }
   
   public void setIp70711RespDataTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711RespDataTxt,ip70711RespDataTxt.length);
   	
   }
   
     /**
	 * 	Update Ip70711RespDataTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70711RespDataTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711RespDataTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70711RespDataTxt with another Field
	 *	@param value
	 */
   public void setIp70711RespDataTxt(Field source) {
       replace(source,0,source.length(),beginIp70711RespDataTxt,IP_70711_RESP_DATA_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70711RespDataTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70711RespDataTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70711RespDataTxt,IP_70711_RESP_DATA_TXT_LEN);
   	
   }
   
     /**
	 * 	Update Ip70711RespDataTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70711RespDataTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711RespDataTxt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip70711RejStatCd
	 *	@return ip70711RejStatCd
	 */
   public char[] getIp70711RejStatCd() throws CFException{
     if (isIp70711RejStatCdModified()) { 
        ip70711RejStatCd = refreshIp70711RejStatCd();
     }
   		return ip70711RejStatCd;
   }

  
	/**
	*  set variable ip70711RejStatCd
	*  Corresponding COBOL Variable is IP70711-REJ-STAT-CD
	*  @param value
	**/
   public void setIp70711RejStatCd(char[] value) {
      ip70711RejStatCd = checkIp70711RejStatCdConstraints(value);
      serializeIp70711RejStatCd(ip70711RejStatCd);
   } 

     /**
	 * 	Update Ip70711RejStatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70711RejStatCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70711RejStatCd,ip70711RejStatCd.length);
   	
   }
   
   public void setIp70711RejStatCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711RejStatCd,ip70711RejStatCd.length);
   	
   }
   
     /**
	 * 	Update Ip70711RejStatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70711RejStatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711RejStatCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70711RejStatCd with another Field
	 *	@param value
	 */
   public void setIp70711RejStatCd(Field source) {
       replace(source,0,source.length(),beginIp70711RejStatCd,IP_70711_REJ_STAT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70711RejStatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70711RejStatCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70711RejStatCd,IP_70711_REJ_STAT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip70711RejStatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70711RejStatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70711RejStatCd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip70711ResponseData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp70711MqRespCd(CONSTANTS.SPACE);
         setIp70711StrtJobNum(CONSTANTS.SPACE_8);
         setIp70711StrtTs(CONSTANTS.SPACE_26);
         setIp70711StatCd(CONSTANTS.SPACE);
         setIp70711JobGrpId(CONSTANTS.SPACE_6);
                     setIp70711JobGrpNum(0);
         	setIp70711RespDataTxtLen((short)0);
         setIp70711RespDataTxt(CONSTANTS.SPACE_2000);
         setIp70711RejStatCd(CONSTANTS.SPACE);
   }

		public static int getIp70711ResponseDataFieldLength() {
			return IP_70711_RESPONSE_DATA_LENGTH;
		}

}
  
