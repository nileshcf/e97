package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051pmrTableKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip7051pmrTableKey extends Ip7051pmrTableKeySerialized { 
   

						private char[] ip7051pmrEnvCd = Field.fillLowValue(3);

						private char[] ip7051pmrCloneOwnerId = Field.fillLowValue(3);

						private char[] ip7051pmrCpu = Field.fillLowValue(4);

						private char[] ip7051pmrHostPrcssAgrmtId = Field.fillLowValue(11);

						private char[] ip7051pmrServCd = Field.fillLowValue(4);

						private char[] ip7051pmrFuncCd = Field.fillLowValue(4);

								private int ip7051pmrQueueNum;
	
	/**
	* Constructor for Ip7051pmrTableKey
	**/
    public Ip7051pmrTableKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip7051pmrTableKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051pmrTableKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip7051pmrEnvCd
	 *	@return ip7051pmrEnvCd
	 */
   public char[] getIp7051pmrEnvCd() throws CFException{
     if (isIp7051pmrEnvCdModified()) { 
        ip7051pmrEnvCd = refreshIp7051pmrEnvCd();
     }
   		return ip7051pmrEnvCd;
   }

  
	/**
	*  set variable ip7051pmrEnvCd
	*  Corresponding COBOL Variable is IP7051PMR-ENV-CD
	*  @param value
	**/
   public void setIp7051pmrEnvCd(char[] value) {
      ip7051pmrEnvCd = checkIp7051pmrEnvCdConstraints(value);
      serializeIp7051pmrEnvCd(ip7051pmrEnvCd);
   } 

     /**
	 * 	Update Ip7051pmrEnvCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pmrEnvCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pmrEnvCd,ip7051pmrEnvCd.length);
   	
   }
   
   public void setIp7051pmrEnvCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrEnvCd,ip7051pmrEnvCd.length);
   	
   }
   
     /**
	 * 	Update Ip7051pmrEnvCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrEnvCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrEnvCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pmrEnvCd with another Field
	 *	@param value
	 */
   public void setIp7051pmrEnvCd(Field source) {
       replace(source,0,source.length(),beginIp7051pmrEnvCd,IP_7051PMR_ENV_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pmrEnvCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pmrEnvCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pmrEnvCd,IP_7051PMR_ENV_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pmrEnvCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrEnvCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrEnvCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7051pmrCloneOwnerId
	 *	@return ip7051pmrCloneOwnerId
	 */
   public char[] getIp7051pmrCloneOwnerId() throws CFException{
     if (isIp7051pmrCloneOwnerIdModified()) { 
        ip7051pmrCloneOwnerId = refreshIp7051pmrCloneOwnerId();
     }
   		return ip7051pmrCloneOwnerId;
   }

  
	/**
	*  set variable ip7051pmrCloneOwnerId
	*  Corresponding COBOL Variable is IP7051PMR-CLONE-OWNER-ID
	*  @param value
	**/
   public void setIp7051pmrCloneOwnerId(char[] value) {
      ip7051pmrCloneOwnerId = checkIp7051pmrCloneOwnerIdConstraints(value);
      serializeIp7051pmrCloneOwnerId(ip7051pmrCloneOwnerId);
   } 

     /**
	 * 	Update Ip7051pmrCloneOwnerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pmrCloneOwnerId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pmrCloneOwnerId,ip7051pmrCloneOwnerId.length);
   	
   }
   
   public void setIp7051pmrCloneOwnerId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrCloneOwnerId,ip7051pmrCloneOwnerId.length);
   	
   }
   
     /**
	 * 	Update Ip7051pmrCloneOwnerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrCloneOwnerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrCloneOwnerId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pmrCloneOwnerId with another Field
	 *	@param value
	 */
   public void setIp7051pmrCloneOwnerId(Field source) {
       replace(source,0,source.length(),beginIp7051pmrCloneOwnerId,IP_7051PMR_CLONE_OWNER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pmrCloneOwnerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pmrCloneOwnerId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pmrCloneOwnerId,IP_7051PMR_CLONE_OWNER_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pmrCloneOwnerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrCloneOwnerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrCloneOwnerId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7051pmrCpu
	 *	@return ip7051pmrCpu
	 */
   public char[] getIp7051pmrCpu() throws CFException{
     if (isIp7051pmrCpuModified()) { 
        ip7051pmrCpu = refreshIp7051pmrCpu();
     }
   		return ip7051pmrCpu;
   }

  
	/**
	*  set variable ip7051pmrCpu
	*  Corresponding COBOL Variable is IP7051PMR-CPU
	*  @param value
	**/
   public void setIp7051pmrCpu(char[] value) {
      ip7051pmrCpu = checkIp7051pmrCpuConstraints(value);
      serializeIp7051pmrCpu(ip7051pmrCpu);
   } 

     /**
	 * 	Update Ip7051pmrCpu 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pmrCpu(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pmrCpu,ip7051pmrCpu.length);
   	
   }
   
   public void setIp7051pmrCpu(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrCpu,ip7051pmrCpu.length);
   	
   }
   
     /**
	 * 	Update Ip7051pmrCpu 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrCpu(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrCpu+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pmrCpu with another Field
	 *	@param value
	 */
   public void setIp7051pmrCpu(Field source) {
       replace(source,0,source.length(),beginIp7051pmrCpu,IP_7051PMR_CPU_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pmrCpu 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pmrCpu(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pmrCpu,IP_7051PMR_CPU_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pmrCpu 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrCpu(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrCpu+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7051pmrHostPrcssAgrmtId
	 *	@return ip7051pmrHostPrcssAgrmtId
	 */
   public char[] getIp7051pmrHostPrcssAgrmtId() throws CFException{
     if (isIp7051pmrHostPrcssAgrmtIdModified()) { 
        ip7051pmrHostPrcssAgrmtId = refreshIp7051pmrHostPrcssAgrmtId();
     }
   		return ip7051pmrHostPrcssAgrmtId;
   }

  
	/**
	*  set variable ip7051pmrHostPrcssAgrmtId
	*  Corresponding COBOL Variable is IP7051PMR-HOST-PRCSS-AGRMT-ID
	*  @param value
	**/
   public void setIp7051pmrHostPrcssAgrmtId(char[] value) {
      ip7051pmrHostPrcssAgrmtId = checkIp7051pmrHostPrcssAgrmtIdConstraints(value);
      serializeIp7051pmrHostPrcssAgrmtId(ip7051pmrHostPrcssAgrmtId);
   } 

     /**
	 * 	Update Ip7051pmrHostPrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pmrHostPrcssAgrmtId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pmrHostPrcssAgrmtId,ip7051pmrHostPrcssAgrmtId.length);
   	
   }
   
   public void setIp7051pmrHostPrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrHostPrcssAgrmtId,ip7051pmrHostPrcssAgrmtId.length);
   	
   }
   
     /**
	 * 	Update Ip7051pmrHostPrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrHostPrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrHostPrcssAgrmtId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pmrHostPrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp7051pmrHostPrcssAgrmtId(Field source) {
       replace(source,0,source.length(),beginIp7051pmrHostPrcssAgrmtId,IP_7051PMR_HOST_PRCSS_AGRMT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pmrHostPrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pmrHostPrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pmrHostPrcssAgrmtId,IP_7051PMR_HOST_PRCSS_AGRMT_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pmrHostPrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrHostPrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrHostPrcssAgrmtId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7051pmrServCd
	 *	@return ip7051pmrServCd
	 */
   public char[] getIp7051pmrServCd() throws CFException{
     if (isIp7051pmrServCdModified()) { 
        ip7051pmrServCd = refreshIp7051pmrServCd();
     }
   		return ip7051pmrServCd;
   }

  
	/**
	*  set variable ip7051pmrServCd
	*  Corresponding COBOL Variable is IP7051PMR-SERV-CD
	*  @param value
	**/
   public void setIp7051pmrServCd(char[] value) {
      ip7051pmrServCd = checkIp7051pmrServCdConstraints(value);
      serializeIp7051pmrServCd(ip7051pmrServCd);
   } 

     /**
	 * 	Update Ip7051pmrServCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pmrServCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pmrServCd,ip7051pmrServCd.length);
   	
   }
   
   public void setIp7051pmrServCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrServCd,ip7051pmrServCd.length);
   	
   }
   
     /**
	 * 	Update Ip7051pmrServCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrServCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrServCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pmrServCd with another Field
	 *	@param value
	 */
   public void setIp7051pmrServCd(Field source) {
       replace(source,0,source.length(),beginIp7051pmrServCd,IP_7051PMR_SERV_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pmrServCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pmrServCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pmrServCd,IP_7051PMR_SERV_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pmrServCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrServCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrServCd+targetIndex,targetLen);
    
   }
	char[] ip7051pmrPmaServCdIdn8888Value = "0001".toCharArray();
	/**
	 *	Test condition "0001" for isIp7051pmrPmaServCdIdn88()
	 *	@return  Returns true if isIp7051pmrPmaServCdIdn88() is "0001"
	 */
   public boolean isIp7051pmrPmaServCdIdn88() throws CFException {
      return (  compareChars( getIp7051pmrServCd() , ip7051pmrPmaServCdIdn8888Value)  == 0  );
   }


	/**
	*  set values "0001"
	*/
   	public void setIp7051pmrPmaServCdIdn88True() {  			
    	setIp7051pmrServCd( ip7051pmrPmaServCdIdn8888Value);
   	}
	char[] ip7051pmrPmtMapServCd8888Value = "0002".toCharArray();
	/**
	 *	Test condition "0002" for isIp7051pmrPmtMapServCd88()
	 *	@return  Returns true if isIp7051pmrPmtMapServCd88() is "0002"
	 */
   public boolean isIp7051pmrPmtMapServCd88() throws CFException {
      return (  compareChars( getIp7051pmrServCd() , ip7051pmrPmtMapServCd8888Value)  == 0  );
   }


	/**
	*  set values "0002"
	*/
   	public void setIp7051pmrPmtMapServCd88True() {  			
    	setIp7051pmrServCd( ip7051pmrPmtMapServCd8888Value);
   	}
	char[] ip7051pmrPimMapServCd8888Value = "0003".toCharArray();
	/**
	 *	Test condition "0003" for isIp7051pmrPimMapServCd88()
	 *	@return  Returns true if isIp7051pmrPimMapServCd88() is "0003"
	 */
   public boolean isIp7051pmrPimMapServCd88() throws CFException {
      return (  compareChars( getIp7051pmrServCd() , ip7051pmrPimMapServCd8888Value)  == 0  );
   }


	/**
	*  set values "0003"
	*/
   	public void setIp7051pmrPimMapServCd88True() {  			
    	setIp7051pmrServCd( ip7051pmrPimMapServCd8888Value);
   	}
	char[] ip7051pmrCemServCd8888Value = "0004".toCharArray();
	/**
	 *	Test condition "0004" for isIp7051pmrCemServCd88()
	 *	@return  Returns true if isIp7051pmrCemServCd88() is "0004"
	 */
   public boolean isIp7051pmrCemServCd88() throws CFException {
      return (  compareChars( getIp7051pmrServCd() , ip7051pmrCemServCd8888Value)  == 0  );
   }


	/**
	*  set values "0004"
	*/
   	public void setIp7051pmrCemServCd88True() {  			
    	setIp7051pmrServCd( ip7051pmrCemServCd8888Value);
   	}
	char[] ip7051pmrFnsServCd8888Value = "0005".toCharArray();
	/**
	 *	Test condition "0005" for isIp7051pmrFnsServCd88()
	 *	@return  Returns true if isIp7051pmrFnsServCd88() is "0005"
	 */
   public boolean isIp7051pmrFnsServCd88() throws CFException {
      return (  compareChars( getIp7051pmrServCd() , ip7051pmrFnsServCd8888Value)  == 0  );
   }


	/**
	*  set values "0005"
	*/
   	public void setIp7051pmrFnsServCd88True() {  			
    	setIp7051pmrServCd( ip7051pmrFnsServCd8888Value);
   	}
	char[] ip7051pmrCemAuthServCd8888Value = "0006".toCharArray();
	/**
	 *	Test condition "0006" for isIp7051pmrCemAuthServCd88()
	 *	@return  Returns true if isIp7051pmrCemAuthServCd88() is "0006"
	 */
   public boolean isIp7051pmrCemAuthServCd88() throws CFException {
      return (  compareChars( getIp7051pmrServCd() , ip7051pmrCemAuthServCd8888Value)  == 0  );
   }


	/**
	*  set values "0006"
	*/
   	public void setIp7051pmrCemAuthServCd88True() {  			
    	setIp7051pmrServCd( ip7051pmrCemAuthServCd8888Value);
   	}
	char[] ip7051pmrFraudServCd8888Value = "0007".toCharArray();
	/**
	 *	Test condition "0007" for isIp7051pmrFraudServCd88()
	 *	@return  Returns true if isIp7051pmrFraudServCd88() is "0007"
	 */
   public boolean isIp7051pmrFraudServCd88() throws CFException {
      return (  compareChars( getIp7051pmrServCd() , ip7051pmrFraudServCd8888Value)  == 0  );
   }


	/**
	*  set values "0007"
	*/
   	public void setIp7051pmrFraudServCd88True() {  			
    	setIp7051pmrServCd( ip7051pmrFraudServCd8888Value);
   	}
	char[] ip7051pmrCemNspkServCd8888Value = "0008".toCharArray();
	/**
	 *	Test condition "0008" for isIp7051pmrCemNspkServCd88()
	 *	@return  Returns true if isIp7051pmrCemNspkServCd88() is "0008"
	 */
   public boolean isIp7051pmrCemNspkServCd88() throws CFException {
      return (  compareChars( getIp7051pmrServCd() , ip7051pmrCemNspkServCd8888Value)  == 0  );
   }


	/**
	*  set values "0008"
	*/
   	public void setIp7051pmrCemNspkServCd88True() {  			
    	setIp7051pmrServCd( ip7051pmrCemNspkServCd8888Value);
   	}
	char[] ip7051pmrFastpayServCd8888Value = "0009".toCharArray();
	/**
	 *	Test condition "0009" for isIp7051pmrFastpayServCd88()
	 *	@return  Returns true if isIp7051pmrFastpayServCd88() is "0009"
	 */
   public boolean isIp7051pmrFastpayServCd88() throws CFException {
      return (  compareChars( getIp7051pmrServCd() , ip7051pmrFastpayServCd8888Value)  == 0  );
   }


	/**
	*  set values "0009"
	*/
   	public void setIp7051pmrFastpayServCd88True() {  			
    	setIp7051pmrServCd( ip7051pmrFastpayServCd8888Value);
   	}
	char[] ip7051pmrInstallServCd8888Value = "0010".toCharArray();
	/**
	 *	Test condition "0010" for isIp7051pmrInstallServCd88()
	 *	@return  Returns true if isIp7051pmrInstallServCd88() is "0010"
	 */
   public boolean isIp7051pmrInstallServCd88() throws CFException {
      return (  compareChars( getIp7051pmrServCd() , ip7051pmrInstallServCd8888Value)  == 0  );
   }


	/**
	*  set values "0010"
	*/
   	public void setIp7051pmrInstallServCd88True() {  			
    	setIp7051pmrServCd( ip7051pmrInstallServCd8888Value);
   	}
	char[] ip7051pmrRefundQrServCd8888Value = "0011".toCharArray();
	/**
	 *	Test condition "0011" for isIp7051pmrRefundQrServCd88()
	 *	@return  Returns true if isIp7051pmrRefundQrServCd88() is "0011"
	 */
   public boolean isIp7051pmrRefundQrServCd88() throws CFException {
      return (  compareChars( getIp7051pmrServCd() , ip7051pmrRefundQrServCd8888Value)  == 0  );
   }


	/**
	*  set values "0011"
	*/
   	public void setIp7051pmrRefundQrServCd88True() {  			
    	setIp7051pmrServCd( ip7051pmrRefundQrServCd8888Value);
   	}
	char[] ip7051pmrMpAchServCd8888Value = "0012".toCharArray();
	/**
	 *	Test condition "0012" for isIp7051pmrMpAchServCd88()
	 *	@return  Returns true if isIp7051pmrMpAchServCd88() is "0012"
	 */
   public boolean isIp7051pmrMpAchServCd88() throws CFException {
      return (  compareChars( getIp7051pmrServCd() , ip7051pmrMpAchServCd8888Value)  == 0  );
   }


	/**
	*  set values "0012"
	*/
   	public void setIp7051pmrMpAchServCd88True() {  			
    	setIp7051pmrServCd( ip7051pmrMpAchServCd8888Value);
   	}
	char[] ip7051pmrPmaServCdRus8888Value = "0013".toCharArray();
	/**
	 *	Test condition "0013" for isIp7051pmrPmaServCdRus88()
	 *	@return  Returns true if isIp7051pmrPmaServCdRus88() is "0013"
	 */
   public boolean isIp7051pmrPmaServCdRus88() throws CFException {
      return (  compareChars( getIp7051pmrServCd() , ip7051pmrPmaServCdRus8888Value)  == 0  );
   }


	/**
	*  set values "0013"
	*/
   	public void setIp7051pmrPmaServCdRus88True() {  			
    	setIp7051pmrServCd( ip7051pmrPmaServCdRus8888Value);
   	}
	/**
	 *	Returns the value of ip7051pmrFuncCd
	 *	@return ip7051pmrFuncCd
	 */
   public char[] getIp7051pmrFuncCd() throws CFException{
     if (isIp7051pmrFuncCdModified()) { 
        ip7051pmrFuncCd = refreshIp7051pmrFuncCd();
     }
   		return ip7051pmrFuncCd;
   }

  
	/**
	*  set variable ip7051pmrFuncCd
	*  Corresponding COBOL Variable is IP7051PMR-FUNC-CD
	*  @param value
	**/
   public void setIp7051pmrFuncCd(char[] value) {
      ip7051pmrFuncCd = checkIp7051pmrFuncCdConstraints(value);
      serializeIp7051pmrFuncCd(ip7051pmrFuncCd);
   } 

     /**
	 * 	Update Ip7051pmrFuncCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pmrFuncCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pmrFuncCd,ip7051pmrFuncCd.length);
   	
   }
   
   public void setIp7051pmrFuncCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrFuncCd,ip7051pmrFuncCd.length);
   	
   }
   
     /**
	 * 	Update Ip7051pmrFuncCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrFuncCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrFuncCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pmrFuncCd with another Field
	 *	@param value
	 */
   public void setIp7051pmrFuncCd(Field source) {
       replace(source,0,source.length(),beginIp7051pmrFuncCd,IP_7051PMR_FUNC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pmrFuncCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pmrFuncCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pmrFuncCd,IP_7051PMR_FUNC_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pmrFuncCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pmrFuncCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pmrFuncCd+targetIndex,targetLen);
    
   }
	char[] ip7051pmrGeneralFuncCd8888Value = "0000".toCharArray();
	/**
	 *	Test condition "0000" for isIp7051pmrGeneralFuncCd88()
	 *	@return  Returns true if isIp7051pmrGeneralFuncCd88() is "0000"
	 */
   public boolean isIp7051pmrGeneralFuncCd88() throws CFException {
      return (  compareChars( getIp7051pmrFuncCd() , ip7051pmrGeneralFuncCd8888Value)  == 0  );
   }


	/**
	*  set values "0000"
	*/
   	public void setIp7051pmrGeneralFuncCd88True() {  			
    	setIp7051pmrFuncCd( ip7051pmrGeneralFuncCd8888Value);
   	}
	char[] ip7051pmrPresFuncCd8888Value = "0001".toCharArray();
	/**
	 *	Test condition "0001" for isIp7051pmrPresFuncCd88()
	 *	@return  Returns true if isIp7051pmrPresFuncCd88() is "0001"
	 */
   public boolean isIp7051pmrPresFuncCd88() throws CFException {
      return (  compareChars( getIp7051pmrFuncCd() , ip7051pmrPresFuncCd8888Value)  == 0  );
   }


	/**
	*  set values "0001"
	*/
   	public void setIp7051pmrPresFuncCd88True() {  			
    	setIp7051pmrFuncCd( ip7051pmrPresFuncCd8888Value);
   	}
	char[] ip7051pmrChaFuncCd8888Value = "0002".toCharArray();
	/**
	 *	Test condition "0002" for isIp7051pmrChaFuncCd88()
	 *	@return  Returns true if isIp7051pmrChaFuncCd88() is "0002"
	 */
   public boolean isIp7051pmrChaFuncCd88() throws CFException {
      return (  compareChars( getIp7051pmrFuncCd() , ip7051pmrChaFuncCd8888Value)  == 0  );
   }


	/**
	*  set values "0002"
	*/
   	public void setIp7051pmrChaFuncCd88True() {  			
    	setIp7051pmrFuncCd( ip7051pmrChaFuncCd8888Value);
   	}
	/**
	 *	Returns the value of ip7051pmrQueueNum
	 *	@return ip7051pmrQueueNum
	 */
	public int getIp7051pmrQueueNum() throws CFException {
       if (isIp7051pmrQueueNumModified()) { 
           ip7051pmrQueueNum = refreshIp7051pmrQueueNum();
        }
   		return ip7051pmrQueueNum;
	}
	

	
	   
	/**
	 * 	Update Ip7051pmrQueueNum with the passed value
	 *  Corresponding COBOL Variable is IP7051PMR-QUEUE-NUM
	 *	@param number
	 */
	public void setIp7051pmrQueueNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip7051pmrQueueNum = checkIp7051pmrQueueNumMaxLimit(number); 
		serializeIp7051pmrQueueNum(ip7051pmrQueueNum);
	}
	

	public void setIp7051pmrQueueNum(long number) {
	    number = checkIp7051pmrQueueNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7051pmrQueueNum((int)number);
	}
	
	/**
	 * 	Update Ip7051pmrQueueNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp7051pmrQueueNum(char[] value) throws CFException {
		 ip7051pmrQueueNum = serializeIp7051pmrQueueNum(value);
	}
	/**
	 * 	Update Ip7051pmrQueueNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp7051pmrQueueNumString(char[] value) throws CFException {
		 setIp7051pmrQueueNum(value);
	}

	
	
	
	/**
	 * 	initializes Ip7051pmrTableKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp7051pmrEnvCd(CONSTANTS.SPACE_3);
         setIp7051pmrCloneOwnerId(CONSTANTS.SPACE_3);
         setIp7051pmrCpu(CONSTANTS.SPACE_4);
         setIp7051pmrHostPrcssAgrmtId(CONSTANTS.SPACE_11);
         setIp7051pmrServCd(CONSTANTS.SPACE_4);
         setIp7051pmrFuncCd(CONSTANTS.SPACE_4);
                     setIp7051pmrQueueNum(0);
   }

		public static int getIp7051pmrTableKeyFieldLength() {
			return IP_7051PMR_TABLE_KEY_LENGTH;
		}

}
  
