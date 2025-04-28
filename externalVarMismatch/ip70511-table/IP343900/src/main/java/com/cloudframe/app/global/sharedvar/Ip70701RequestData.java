package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70701RequestData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip70701RequestData extends Ip70701RequestDataSerialized { 
   

						private char[] ip70701MqRespCd = Field.fillLowValue(1);

						private char[] ip70701StrtJobNam = Field.fillLowValue(8);

						private char[] ip70701StrtTs = Field.fillLowValue(26);

								private short ip70701RqstDataTxtLen;

						private char[] ip70701RqstDataTxt = Field.fillLowValue(2000);
	
	/**
	* Constructor for Ip70701RequestData
	**/
    public Ip70701RequestData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip70701RequestData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip70701RequestData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip70701MqRespCd
	 *	@return ip70701MqRespCd
	 */
   public char[] getIp70701MqRespCd() throws CFException{
     if (isIp70701MqRespCdModified()) { 
        ip70701MqRespCd = refreshIp70701MqRespCd();
     }
   		return ip70701MqRespCd;
   }

  
	/**
	*  set variable ip70701MqRespCd
	*  Corresponding COBOL Variable is IP70701-MQ-RESP-CD
	*  @param value
	**/
   public void setIp70701MqRespCd(char[] value) {
      ip70701MqRespCd = checkIp70701MqRespCdConstraints(value);
      serializeIp70701MqRespCd(ip70701MqRespCd);
   } 

     /**
	 * 	Update Ip70701MqRespCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70701MqRespCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70701MqRespCd,ip70701MqRespCd.length);
   	
   }
   
   public void setIp70701MqRespCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70701MqRespCd,ip70701MqRespCd.length);
   	
   }
   
     /**
	 * 	Update Ip70701MqRespCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70701MqRespCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70701MqRespCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70701MqRespCd with another Field
	 *	@param value
	 */
   public void setIp70701MqRespCd(Field source) {
       replace(source,0,source.length(),beginIp70701MqRespCd,IP_70701_MQ_RESP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70701MqRespCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70701MqRespCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70701MqRespCd,IP_70701_MQ_RESP_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip70701MqRespCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70701MqRespCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70701MqRespCd+targetIndex,targetLen);
    
   }
	char[] ip70701ReqRespN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70701ReqRespN88()
	 *	@return  Returns true if isIp70701ReqRespN88() is "N"
	 */
   public boolean isIp70701ReqRespN88() throws CFException {
      return (  compareChars( getIp70701MqRespCd() , ip70701ReqRespN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70701ReqRespN88True() {  			
    	setIp70701MqRespCd( ip70701ReqRespN8888Value);
   	}
	char[] ip70701ReqRespR8888Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isIp70701ReqRespR88()
	 *	@return  Returns true if isIp70701ReqRespR88() is "R"
	 */
   public boolean isIp70701ReqRespR88() throws CFException {
      return (  compareChars( getIp70701MqRespCd() , ip70701ReqRespR8888Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setIp70701ReqRespR88True() {  			
    	setIp70701MqRespCd( ip70701ReqRespR8888Value);
   	}
	char[] ip70701ReqRespC8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp70701ReqRespC88()
	 *	@return  Returns true if isIp70701ReqRespC88() is "C"
	 */
   public boolean isIp70701ReqRespC88() throws CFException {
      return (  compareChars( getIp70701MqRespCd() , ip70701ReqRespC8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp70701ReqRespC88True() {  			
    	setIp70701MqRespCd( ip70701ReqRespC8888Value);
   	}
	/**
	 *	Returns the value of ip70701StrtJobNam
	 *	@return ip70701StrtJobNam
	 */
   public char[] getIp70701StrtJobNam() throws CFException{
     if (isIp70701StrtJobNamModified()) { 
        ip70701StrtJobNam = refreshIp70701StrtJobNam();
     }
   		return ip70701StrtJobNam;
   }

  
	/**
	*  set variable ip70701StrtJobNam
	*  Corresponding COBOL Variable is IP70701-STRT-JOB-NAM
	*  @param value
	**/
   public void setIp70701StrtJobNam(char[] value) {
      ip70701StrtJobNam = checkIp70701StrtJobNamConstraints(value);
      serializeIp70701StrtJobNam(ip70701StrtJobNam);
   } 

     /**
	 * 	Update Ip70701StrtJobNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70701StrtJobNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70701StrtJobNam,ip70701StrtJobNam.length);
   	
   }
   
   public void setIp70701StrtJobNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70701StrtJobNam,ip70701StrtJobNam.length);
   	
   }
   
     /**
	 * 	Update Ip70701StrtJobNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70701StrtJobNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70701StrtJobNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70701StrtJobNam with another Field
	 *	@param value
	 */
   public void setIp70701StrtJobNam(Field source) {
       replace(source,0,source.length(),beginIp70701StrtJobNam,IP_70701_STRT_JOB_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70701StrtJobNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70701StrtJobNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70701StrtJobNam,IP_70701_STRT_JOB_NAM_LEN);
   	
   }
   
     /**
	 * 	Update Ip70701StrtJobNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70701StrtJobNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70701StrtJobNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip70701StrtTs
	 *	@return ip70701StrtTs
	 */
   public char[] getIp70701StrtTs() throws CFException{
     if (isIp70701StrtTsModified()) { 
        ip70701StrtTs = refreshIp70701StrtTs();
     }
   		return ip70701StrtTs;
   }

  
	/**
	*  set variable ip70701StrtTs
	*  Corresponding COBOL Variable is IP70701-STRT-TS
	*  @param value
	**/
   public void setIp70701StrtTs(char[] value) {
      ip70701StrtTs = checkIp70701StrtTsConstraints(value);
      serializeIp70701StrtTs(ip70701StrtTs);
   } 

     /**
	 * 	Update Ip70701StrtTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70701StrtTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70701StrtTs,ip70701StrtTs.length);
   	
   }
   
   public void setIp70701StrtTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70701StrtTs,ip70701StrtTs.length);
   	
   }
   
     /**
	 * 	Update Ip70701StrtTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70701StrtTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70701StrtTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70701StrtTs with another Field
	 *	@param value
	 */
   public void setIp70701StrtTs(Field source) {
       replace(source,0,source.length(),beginIp70701StrtTs,IP_70701_STRT_TS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70701StrtTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70701StrtTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70701StrtTs,IP_70701_STRT_TS_LEN);
   	
   }
   
     /**
	 * 	Update Ip70701StrtTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70701StrtTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70701StrtTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip70701RqstDataTxtLen
	 *	@return ip70701RqstDataTxtLen
	 */
	public short getIp70701RqstDataTxtLen() throws CFException {
        if (isIp70701RqstDataTxtLenModified()) { 
           ip70701RqstDataTxtLen = refreshIp70701RqstDataTxtLen();
        }
   		return ip70701RqstDataTxtLen;
	}
	
	/**
	 * 	Update Ip70701RqstDataTxtLen with the passed value
	 *  Corresponding COBOL Variable is IP70701-RQST-DATA-TXT-LEN
	 *	@param number
	 */
	public void setIp70701RqstDataTxtLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip70701RqstDataTxtLen = checkIp70701RqstDataTxtLenMaxLimit(number); 
		serializeIp70701RqstDataTxtLen(ip70701RqstDataTxtLen);
	}

	public void setIp70701RqstDataTxtLen(int number) {
	    number = checkIp70701RqstDataTxtLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp70701RqstDataTxtLen((short)number);
	}
	public void setIp70701RqstDataTxtLen(long number) {
	    number = checkIp70701RqstDataTxtLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp70701RqstDataTxtLen((short)number);
	}
	

	/**
	 *	Returns the value of ip70701RqstDataTxt
	 *	@return ip70701RqstDataTxt
	 */
   public char[] getIp70701RqstDataTxt() throws CFException{
     if (isIp70701RqstDataTxtModified()) { 
        ip70701RqstDataTxt = refreshIp70701RqstDataTxt();
     }
   		return ip70701RqstDataTxt;
   }

  
	/**
	*  set variable ip70701RqstDataTxt
	*  Corresponding COBOL Variable is IP70701-RQST-DATA-TXT
	*  @param value
	**/
   public void setIp70701RqstDataTxt(char[] value) {
      ip70701RqstDataTxt = checkIp70701RqstDataTxtConstraints(value);
      serializeIp70701RqstDataTxt(ip70701RqstDataTxt);
   } 

     /**
	 * 	Update Ip70701RqstDataTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70701RqstDataTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70701RqstDataTxt,ip70701RqstDataTxt.length);
   	
   }
   
   public void setIp70701RqstDataTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70701RqstDataTxt,ip70701RqstDataTxt.length);
   	
   }
   
     /**
	 * 	Update Ip70701RqstDataTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70701RqstDataTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70701RqstDataTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70701RqstDataTxt with another Field
	 *	@param value
	 */
   public void setIp70701RqstDataTxt(Field source) {
       replace(source,0,source.length(),beginIp70701RqstDataTxt,IP_70701_RQST_DATA_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70701RqstDataTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70701RqstDataTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70701RqstDataTxt,IP_70701_RQST_DATA_TXT_LEN);
   	
   }
   
     /**
	 * 	Update Ip70701RqstDataTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70701RqstDataTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70701RqstDataTxt+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip70701RequestData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp70701MqRespCd(CONSTANTS.SPACE);
         setIp70701StrtJobNam(CONSTANTS.SPACE_8);
         setIp70701StrtTs(CONSTANTS.SPACE_26);
         	setIp70701RqstDataTxtLen((short)0);
         setIp70701RqstDataTxt(CONSTANTS.SPACE_2000);
   }

		public static int getIp70701RequestDataFieldLength() {
			return IP_70701_REQUEST_DATA_LENGTH;
		}

}
  
