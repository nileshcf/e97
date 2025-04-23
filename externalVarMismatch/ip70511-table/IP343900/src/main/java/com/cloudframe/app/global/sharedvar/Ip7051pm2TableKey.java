package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051pm2TableKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip7051pm2TableKey extends Ip7051pm2TableKeySerialized { 
   

						private char[] ip7051pm2EnvCd = Field.fillLowValue(3);

						private char[] ip7051pm2CloneOwnerId = Field.fillLowValue(3);

						private char[] ip7051pm2Cpu = Field.fillLowValue(4);

						private char[] ip7051pm2HostPrcssAgrmtId = Field.fillLowValue(11);

						private char[] ip7051pm2ServCd = Field.fillLowValue(4);

						private char[] ip7051pm2FuncCd = Field.fillLowValue(4);

								private int ip7051pm2QueueNum;
	
	/**
	* Constructor for Ip7051pm2TableKey
	**/
    public Ip7051pm2TableKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip7051pm2TableKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051pm2TableKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip7051pm2EnvCd
	 *	@return ip7051pm2EnvCd
	 */
   public char[] getIp7051pm2EnvCd() throws CFException{
     if (isIp7051pm2EnvCdModified()) { 
        ip7051pm2EnvCd = refreshIp7051pm2EnvCd();
     }
   		return ip7051pm2EnvCd;
   }

  
	/**
	*  set variable ip7051pm2EnvCd
	*  Corresponding COBOL Variable is IP7051PM2-ENV-CD
	*  @param value
	**/
   public void setIp7051pm2EnvCd(char[] value) {
      ip7051pm2EnvCd = checkIp7051pm2EnvCdConstraints(value);
      serializeIp7051pm2EnvCd(ip7051pm2EnvCd);
   } 

     /**
	 * 	Update Ip7051pm2EnvCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pm2EnvCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pm2EnvCd,ip7051pm2EnvCd.length);
   	
   }
   
   public void setIp7051pm2EnvCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2EnvCd,ip7051pm2EnvCd.length);
   	
   }
   
     /**
	 * 	Update Ip7051pm2EnvCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2EnvCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2EnvCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pm2EnvCd with another Field
	 *	@param value
	 */
   public void setIp7051pm2EnvCd(Field source) {
       replace(source,0,source.length(),beginIp7051pm2EnvCd,IP_7051PM_2_ENV_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pm2EnvCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pm2EnvCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pm2EnvCd,IP_7051PM_2_ENV_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pm2EnvCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2EnvCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2EnvCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7051pm2CloneOwnerId
	 *	@return ip7051pm2CloneOwnerId
	 */
   public char[] getIp7051pm2CloneOwnerId() throws CFException{
     if (isIp7051pm2CloneOwnerIdModified()) { 
        ip7051pm2CloneOwnerId = refreshIp7051pm2CloneOwnerId();
     }
   		return ip7051pm2CloneOwnerId;
   }

  
	/**
	*  set variable ip7051pm2CloneOwnerId
	*  Corresponding COBOL Variable is IP7051PM2-CLONE-OWNER-ID
	*  @param value
	**/
   public void setIp7051pm2CloneOwnerId(char[] value) {
      ip7051pm2CloneOwnerId = checkIp7051pm2CloneOwnerIdConstraints(value);
      serializeIp7051pm2CloneOwnerId(ip7051pm2CloneOwnerId);
   } 

     /**
	 * 	Update Ip7051pm2CloneOwnerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pm2CloneOwnerId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pm2CloneOwnerId,ip7051pm2CloneOwnerId.length);
   	
   }
   
   public void setIp7051pm2CloneOwnerId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2CloneOwnerId,ip7051pm2CloneOwnerId.length);
   	
   }
   
     /**
	 * 	Update Ip7051pm2CloneOwnerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2CloneOwnerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2CloneOwnerId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pm2CloneOwnerId with another Field
	 *	@param value
	 */
   public void setIp7051pm2CloneOwnerId(Field source) {
       replace(source,0,source.length(),beginIp7051pm2CloneOwnerId,IP_7051PM_2_CLONE_OWNER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pm2CloneOwnerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pm2CloneOwnerId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pm2CloneOwnerId,IP_7051PM_2_CLONE_OWNER_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pm2CloneOwnerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2CloneOwnerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2CloneOwnerId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7051pm2Cpu
	 *	@return ip7051pm2Cpu
	 */
   public char[] getIp7051pm2Cpu() throws CFException{
     if (isIp7051pm2CpuModified()) { 
        ip7051pm2Cpu = refreshIp7051pm2Cpu();
     }
   		return ip7051pm2Cpu;
   }

  
	/**
	*  set variable ip7051pm2Cpu
	*  Corresponding COBOL Variable is IP7051PM2-CPU
	*  @param value
	**/
   public void setIp7051pm2Cpu(char[] value) {
      ip7051pm2Cpu = checkIp7051pm2CpuConstraints(value);
      serializeIp7051pm2Cpu(ip7051pm2Cpu);
   } 

     /**
	 * 	Update Ip7051pm2Cpu 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pm2Cpu(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pm2Cpu,ip7051pm2Cpu.length);
   	
   }
   
   public void setIp7051pm2Cpu(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2Cpu,ip7051pm2Cpu.length);
   	
   }
   
     /**
	 * 	Update Ip7051pm2Cpu 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2Cpu(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2Cpu+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pm2Cpu with another Field
	 *	@param value
	 */
   public void setIp7051pm2Cpu(Field source) {
       replace(source,0,source.length(),beginIp7051pm2Cpu,IP_7051PM_2_CPU_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pm2Cpu 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pm2Cpu(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pm2Cpu,IP_7051PM_2_CPU_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pm2Cpu 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2Cpu(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2Cpu+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7051pm2HostPrcssAgrmtId
	 *	@return ip7051pm2HostPrcssAgrmtId
	 */
   public char[] getIp7051pm2HostPrcssAgrmtId() throws CFException{
     if (isIp7051pm2HostPrcssAgrmtIdModified()) { 
        ip7051pm2HostPrcssAgrmtId = refreshIp7051pm2HostPrcssAgrmtId();
     }
   		return ip7051pm2HostPrcssAgrmtId;
   }

  
	/**
	*  set variable ip7051pm2HostPrcssAgrmtId
	*  Corresponding COBOL Variable is IP7051PM2-HOST-PRCSS-AGRMT-ID
	*  @param value
	**/
   public void setIp7051pm2HostPrcssAgrmtId(char[] value) {
      ip7051pm2HostPrcssAgrmtId = checkIp7051pm2HostPrcssAgrmtIdConstraints(value);
      serializeIp7051pm2HostPrcssAgrmtId(ip7051pm2HostPrcssAgrmtId);
   } 

     /**
	 * 	Update Ip7051pm2HostPrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pm2HostPrcssAgrmtId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pm2HostPrcssAgrmtId,ip7051pm2HostPrcssAgrmtId.length);
   	
   }
   
   public void setIp7051pm2HostPrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2HostPrcssAgrmtId,ip7051pm2HostPrcssAgrmtId.length);
   	
   }
   
     /**
	 * 	Update Ip7051pm2HostPrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2HostPrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2HostPrcssAgrmtId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pm2HostPrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp7051pm2HostPrcssAgrmtId(Field source) {
       replace(source,0,source.length(),beginIp7051pm2HostPrcssAgrmtId,IP_7051PM_2_HOST_PRCSS_AGRMT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pm2HostPrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pm2HostPrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pm2HostPrcssAgrmtId,IP_7051PM_2_HOST_PRCSS_AGRMT_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pm2HostPrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2HostPrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2HostPrcssAgrmtId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7051pm2ServCd
	 *	@return ip7051pm2ServCd
	 */
   public char[] getIp7051pm2ServCd() throws CFException{
     if (isIp7051pm2ServCdModified()) { 
        ip7051pm2ServCd = refreshIp7051pm2ServCd();
     }
   		return ip7051pm2ServCd;
   }

  
	/**
	*  set variable ip7051pm2ServCd
	*  Corresponding COBOL Variable is IP7051PM2-SERV-CD
	*  @param value
	**/
   public void setIp7051pm2ServCd(char[] value) {
      ip7051pm2ServCd = checkIp7051pm2ServCdConstraints(value);
      serializeIp7051pm2ServCd(ip7051pm2ServCd);
   } 

     /**
	 * 	Update Ip7051pm2ServCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pm2ServCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pm2ServCd,ip7051pm2ServCd.length);
   	
   }
   
   public void setIp7051pm2ServCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2ServCd,ip7051pm2ServCd.length);
   	
   }
   
     /**
	 * 	Update Ip7051pm2ServCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2ServCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2ServCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pm2ServCd with another Field
	 *	@param value
	 */
   public void setIp7051pm2ServCd(Field source) {
       replace(source,0,source.length(),beginIp7051pm2ServCd,IP_7051PM_2_SERV_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pm2ServCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pm2ServCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pm2ServCd,IP_7051PM_2_SERV_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pm2ServCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2ServCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2ServCd+targetIndex,targetLen);
    
   }
	char[] ip7051pm2PmaServCdIdn8888Value = "0001".toCharArray();
	/**
	 *	Test condition "0001" for isIp7051pm2PmaServCdIdn88()
	 *	@return  Returns true if isIp7051pm2PmaServCdIdn88() is "0001"
	 */
   public boolean isIp7051pm2PmaServCdIdn88() throws CFException {
      return (  compareChars( getIp7051pm2ServCd() , ip7051pm2PmaServCdIdn8888Value)  == 0  );
   }


	/**
	*  set values "0001"
	*/
   	public void setIp7051pm2PmaServCdIdn88True() {  			
    	setIp7051pm2ServCd( ip7051pm2PmaServCdIdn8888Value);
   	}
	char[] ip7051pm2PmtMapServCd8888Value = "0002".toCharArray();
	/**
	 *	Test condition "0002" for isIp7051pm2PmtMapServCd88()
	 *	@return  Returns true if isIp7051pm2PmtMapServCd88() is "0002"
	 */
   public boolean isIp7051pm2PmtMapServCd88() throws CFException {
      return (  compareChars( getIp7051pm2ServCd() , ip7051pm2PmtMapServCd8888Value)  == 0  );
   }


	/**
	*  set values "0002"
	*/
   	public void setIp7051pm2PmtMapServCd88True() {  			
    	setIp7051pm2ServCd( ip7051pm2PmtMapServCd8888Value);
   	}
	char[] ip7051pm2PimMapServCd8888Value = "0003".toCharArray();
	/**
	 *	Test condition "0003" for isIp7051pm2PimMapServCd88()
	 *	@return  Returns true if isIp7051pm2PimMapServCd88() is "0003"
	 */
   public boolean isIp7051pm2PimMapServCd88() throws CFException {
      return (  compareChars( getIp7051pm2ServCd() , ip7051pm2PimMapServCd8888Value)  == 0  );
   }


	/**
	*  set values "0003"
	*/
   	public void setIp7051pm2PimMapServCd88True() {  			
    	setIp7051pm2ServCd( ip7051pm2PimMapServCd8888Value);
   	}
	char[] ip7051pm2CemServCd8888Value = "0004".toCharArray();
	/**
	 *	Test condition "0004" for isIp7051pm2CemServCd88()
	 *	@return  Returns true if isIp7051pm2CemServCd88() is "0004"
	 */
   public boolean isIp7051pm2CemServCd88() throws CFException {
      return (  compareChars( getIp7051pm2ServCd() , ip7051pm2CemServCd8888Value)  == 0  );
   }


	/**
	*  set values "0004"
	*/
   	public void setIp7051pm2CemServCd88True() {  			
    	setIp7051pm2ServCd( ip7051pm2CemServCd8888Value);
   	}
	char[] ip7051pm2FnsServCd8888Value = "0005".toCharArray();
	/**
	 *	Test condition "0005" for isIp7051pm2FnsServCd88()
	 *	@return  Returns true if isIp7051pm2FnsServCd88() is "0005"
	 */
   public boolean isIp7051pm2FnsServCd88() throws CFException {
      return (  compareChars( getIp7051pm2ServCd() , ip7051pm2FnsServCd8888Value)  == 0  );
   }


	/**
	*  set values "0005"
	*/
   	public void setIp7051pm2FnsServCd88True() {  			
    	setIp7051pm2ServCd( ip7051pm2FnsServCd8888Value);
   	}
	char[] ip7051pm2CemAuthServCd8888Value = "0006".toCharArray();
	/**
	 *	Test condition "0006" for isIp7051pm2CemAuthServCd88()
	 *	@return  Returns true if isIp7051pm2CemAuthServCd88() is "0006"
	 */
   public boolean isIp7051pm2CemAuthServCd88() throws CFException {
      return (  compareChars( getIp7051pm2ServCd() , ip7051pm2CemAuthServCd8888Value)  == 0  );
   }


	/**
	*  set values "0006"
	*/
   	public void setIp7051pm2CemAuthServCd88True() {  			
    	setIp7051pm2ServCd( ip7051pm2CemAuthServCd8888Value);
   	}
	char[] ip7051pm2FraudServCd8888Value = "0007".toCharArray();
	/**
	 *	Test condition "0007" for isIp7051pm2FraudServCd88()
	 *	@return  Returns true if isIp7051pm2FraudServCd88() is "0007"
	 */
   public boolean isIp7051pm2FraudServCd88() throws CFException {
      return (  compareChars( getIp7051pm2ServCd() , ip7051pm2FraudServCd8888Value)  == 0  );
   }


	/**
	*  set values "0007"
	*/
   	public void setIp7051pm2FraudServCd88True() {  			
    	setIp7051pm2ServCd( ip7051pm2FraudServCd8888Value);
   	}
	char[] ip7051pm2CemNspkServCd8888Value = "0008".toCharArray();
	/**
	 *	Test condition "0008" for isIp7051pm2CemNspkServCd88()
	 *	@return  Returns true if isIp7051pm2CemNspkServCd88() is "0008"
	 */
   public boolean isIp7051pm2CemNspkServCd88() throws CFException {
      return (  compareChars( getIp7051pm2ServCd() , ip7051pm2CemNspkServCd8888Value)  == 0  );
   }


	/**
	*  set values "0008"
	*/
   	public void setIp7051pm2CemNspkServCd88True() {  			
    	setIp7051pm2ServCd( ip7051pm2CemNspkServCd8888Value);
   	}
	char[] ip7051pm2FastpayServCd8888Value = "0009".toCharArray();
	/**
	 *	Test condition "0009" for isIp7051pm2FastpayServCd88()
	 *	@return  Returns true if isIp7051pm2FastpayServCd88() is "0009"
	 */
   public boolean isIp7051pm2FastpayServCd88() throws CFException {
      return (  compareChars( getIp7051pm2ServCd() , ip7051pm2FastpayServCd8888Value)  == 0  );
   }


	/**
	*  set values "0009"
	*/
   	public void setIp7051pm2FastpayServCd88True() {  			
    	setIp7051pm2ServCd( ip7051pm2FastpayServCd8888Value);
   	}
	char[] ip7051pm2InstallServCd8888Value = "0010".toCharArray();
	/**
	 *	Test condition "0010" for isIp7051pm2InstallServCd88()
	 *	@return  Returns true if isIp7051pm2InstallServCd88() is "0010"
	 */
   public boolean isIp7051pm2InstallServCd88() throws CFException {
      return (  compareChars( getIp7051pm2ServCd() , ip7051pm2InstallServCd8888Value)  == 0  );
   }


	/**
	*  set values "0010"
	*/
   	public void setIp7051pm2InstallServCd88True() {  			
    	setIp7051pm2ServCd( ip7051pm2InstallServCd8888Value);
   	}
	char[] ip7051pm2RefundQrServCd8888Value = "0011".toCharArray();
	/**
	 *	Test condition "0011" for isIp7051pm2RefundQrServCd88()
	 *	@return  Returns true if isIp7051pm2RefundQrServCd88() is "0011"
	 */
   public boolean isIp7051pm2RefundQrServCd88() throws CFException {
      return (  compareChars( getIp7051pm2ServCd() , ip7051pm2RefundQrServCd8888Value)  == 0  );
   }


	/**
	*  set values "0011"
	*/
   	public void setIp7051pm2RefundQrServCd88True() {  			
    	setIp7051pm2ServCd( ip7051pm2RefundQrServCd8888Value);
   	}
	char[] ip7051pm2MpAchServCd8888Value = "0012".toCharArray();
	/**
	 *	Test condition "0012" for isIp7051pm2MpAchServCd88()
	 *	@return  Returns true if isIp7051pm2MpAchServCd88() is "0012"
	 */
   public boolean isIp7051pm2MpAchServCd88() throws CFException {
      return (  compareChars( getIp7051pm2ServCd() , ip7051pm2MpAchServCd8888Value)  == 0  );
   }


	/**
	*  set values "0012"
	*/
   	public void setIp7051pm2MpAchServCd88True() {  			
    	setIp7051pm2ServCd( ip7051pm2MpAchServCd8888Value);
   	}
	char[] ip7051pm2PmaServCdRus8888Value = "0013".toCharArray();
	/**
	 *	Test condition "0013" for isIp7051pm2PmaServCdRus88()
	 *	@return  Returns true if isIp7051pm2PmaServCdRus88() is "0013"
	 */
   public boolean isIp7051pm2PmaServCdRus88() throws CFException {
      return (  compareChars( getIp7051pm2ServCd() , ip7051pm2PmaServCdRus8888Value)  == 0  );
   }


	/**
	*  set values "0013"
	*/
   	public void setIp7051pm2PmaServCdRus88True() {  			
    	setIp7051pm2ServCd( ip7051pm2PmaServCdRus8888Value);
   	}
	/**
	 *	Returns the value of ip7051pm2FuncCd
	 *	@return ip7051pm2FuncCd
	 */
   public char[] getIp7051pm2FuncCd() throws CFException{
     if (isIp7051pm2FuncCdModified()) { 
        ip7051pm2FuncCd = refreshIp7051pm2FuncCd();
     }
   		return ip7051pm2FuncCd;
   }

  
	/**
	*  set variable ip7051pm2FuncCd
	*  Corresponding COBOL Variable is IP7051PM2-FUNC-CD
	*  @param value
	**/
   public void setIp7051pm2FuncCd(char[] value) {
      ip7051pm2FuncCd = checkIp7051pm2FuncCdConstraints(value);
      serializeIp7051pm2FuncCd(ip7051pm2FuncCd);
   } 

     /**
	 * 	Update Ip7051pm2FuncCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pm2FuncCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pm2FuncCd,ip7051pm2FuncCd.length);
   	
   }
   
   public void setIp7051pm2FuncCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2FuncCd,ip7051pm2FuncCd.length);
   	
   }
   
     /**
	 * 	Update Ip7051pm2FuncCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2FuncCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2FuncCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pm2FuncCd with another Field
	 *	@param value
	 */
   public void setIp7051pm2FuncCd(Field source) {
       replace(source,0,source.length(),beginIp7051pm2FuncCd,IP_7051PM_2_FUNC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pm2FuncCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pm2FuncCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pm2FuncCd,IP_7051PM_2_FUNC_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pm2FuncCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2FuncCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2FuncCd+targetIndex,targetLen);
    
   }
	char[] ip7051pm2GeneralFuncCd8888Value = "0000".toCharArray();
	/**
	 *	Test condition "0000" for isIp7051pm2GeneralFuncCd88()
	 *	@return  Returns true if isIp7051pm2GeneralFuncCd88() is "0000"
	 */
   public boolean isIp7051pm2GeneralFuncCd88() throws CFException {
      return (  compareChars( getIp7051pm2FuncCd() , ip7051pm2GeneralFuncCd8888Value)  == 0  );
   }


	/**
	*  set values "0000"
	*/
   	public void setIp7051pm2GeneralFuncCd88True() {  			
    	setIp7051pm2FuncCd( ip7051pm2GeneralFuncCd8888Value);
   	}
	char[] ip7051pm2PresFuncCd8888Value = "0001".toCharArray();
	/**
	 *	Test condition "0001" for isIp7051pm2PresFuncCd88()
	 *	@return  Returns true if isIp7051pm2PresFuncCd88() is "0001"
	 */
   public boolean isIp7051pm2PresFuncCd88() throws CFException {
      return (  compareChars( getIp7051pm2FuncCd() , ip7051pm2PresFuncCd8888Value)  == 0  );
   }


	/**
	*  set values "0001"
	*/
   	public void setIp7051pm2PresFuncCd88True() {  			
    	setIp7051pm2FuncCd( ip7051pm2PresFuncCd8888Value);
   	}
	char[] ip7051pm2ChaFuncCd8888Value = "0002".toCharArray();
	/**
	 *	Test condition "0002" for isIp7051pm2ChaFuncCd88()
	 *	@return  Returns true if isIp7051pm2ChaFuncCd88() is "0002"
	 */
   public boolean isIp7051pm2ChaFuncCd88() throws CFException {
      return (  compareChars( getIp7051pm2FuncCd() , ip7051pm2ChaFuncCd8888Value)  == 0  );
   }


	/**
	*  set values "0002"
	*/
   	public void setIp7051pm2ChaFuncCd88True() {  			
    	setIp7051pm2FuncCd( ip7051pm2ChaFuncCd8888Value);
   	}
	/**
	 *	Returns the value of ip7051pm2QueueNum
	 *	@return ip7051pm2QueueNum
	 */
	public int getIp7051pm2QueueNum() throws CFException {
       if (isIp7051pm2QueueNumModified()) { 
           ip7051pm2QueueNum = refreshIp7051pm2QueueNum();
        }
   		return ip7051pm2QueueNum;
	}
	

	
	   
	/**
	 * 	Update Ip7051pm2QueueNum with the passed value
	 *  Corresponding COBOL Variable is IP7051PM2-QUEUE-NUM
	 *	@param number
	 */
	public void setIp7051pm2QueueNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip7051pm2QueueNum = checkIp7051pm2QueueNumMaxLimit(number); 
		serializeIp7051pm2QueueNum(ip7051pm2QueueNum);
	}
	

	public void setIp7051pm2QueueNum(long number) {
	    number = checkIp7051pm2QueueNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7051pm2QueueNum((int)number);
	}
	
	/**
	 * 	Update Ip7051pm2QueueNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp7051pm2QueueNum(char[] value) throws CFException {
		 ip7051pm2QueueNum = serializeIp7051pm2QueueNum(value);
	}
	/**
	 * 	Update Ip7051pm2QueueNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp7051pm2QueueNumString(char[] value) throws CFException {
		 setIp7051pm2QueueNum(value);
	}

	
	
	
	/**
	 * 	initializes Ip7051pm2TableKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp7051pm2EnvCd(CONSTANTS.SPACE_3);
         setIp7051pm2CloneOwnerId(CONSTANTS.SPACE_3);
         setIp7051pm2Cpu(CONSTANTS.SPACE_4);
         setIp7051pm2HostPrcssAgrmtId(CONSTANTS.SPACE_11);
         setIp7051pm2ServCd(CONSTANTS.SPACE_4);
         setIp7051pm2FuncCd(CONSTANTS.SPACE_4);
                     setIp7051pm2QueueNum(0);
   }

		public static int getIp7051pm2TableKeyFieldLength() {
			return IP_7051PM_2_TABLE_KEY_LENGTH;
		}

}
  
