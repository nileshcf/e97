package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051f4TableKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip7051f4TableKey extends Ip7051f4TableKeySerialized { 
   

						private char[] ip7051f4EnvCd = Field.fillLowValue(3);

						private char[] ip7051f4CloneOwnerId = Field.fillLowValue(3);

						private char[] ip7051f4Cpu = Field.fillLowValue(4);

						private char[] ip7051f4HostPrcssAgrmtId = Field.fillLowValue(11);

						private char[] ip7051f4ServCd = Field.fillLowValue(4);

						private char[] ip7051f4FuncCd = Field.fillLowValue(4);

								private int ip7051f4QueueNum;
	
	/**
	* Constructor for Ip7051f4TableKey
	**/
    public Ip7051f4TableKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip7051f4TableKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051f4TableKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip7051f4EnvCd
	 *	@return ip7051f4EnvCd
	 */
   public char[] getIp7051f4EnvCd() throws CFException{
     if (isIp7051f4EnvCdModified()) { 
        ip7051f4EnvCd = refreshIp7051f4EnvCd();
     }
   		return ip7051f4EnvCd;
   }

  
	/**
	*  set variable ip7051f4EnvCd
	*  Corresponding COBOL Variable is IP7051F4-ENV-CD
	*  @param value
	**/
   public void setIp7051f4EnvCd(char[] value) {
      ip7051f4EnvCd = checkIp7051f4EnvCdConstraints(value);
      serializeIp7051f4EnvCd(ip7051f4EnvCd);
   } 

     /**
	 * 	Update Ip7051f4EnvCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051f4EnvCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051f4EnvCd,ip7051f4EnvCd.length);
   	
   }
   
   public void setIp7051f4EnvCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4EnvCd,ip7051f4EnvCd.length);
   	
   }
   
     /**
	 * 	Update Ip7051f4EnvCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4EnvCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4EnvCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051f4EnvCd with another Field
	 *	@param value
	 */
   public void setIp7051f4EnvCd(Field source) {
       replace(source,0,source.length(),beginIp7051f4EnvCd,IP_7051F_4_ENV_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051f4EnvCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051f4EnvCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051f4EnvCd,IP_7051F_4_ENV_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051f4EnvCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4EnvCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4EnvCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7051f4CloneOwnerId
	 *	@return ip7051f4CloneOwnerId
	 */
   public char[] getIp7051f4CloneOwnerId() throws CFException{
     if (isIp7051f4CloneOwnerIdModified()) { 
        ip7051f4CloneOwnerId = refreshIp7051f4CloneOwnerId();
     }
   		return ip7051f4CloneOwnerId;
   }

  
	/**
	*  set variable ip7051f4CloneOwnerId
	*  Corresponding COBOL Variable is IP7051F4-CLONE-OWNER-ID
	*  @param value
	**/
   public void setIp7051f4CloneOwnerId(char[] value) {
      ip7051f4CloneOwnerId = checkIp7051f4CloneOwnerIdConstraints(value);
      serializeIp7051f4CloneOwnerId(ip7051f4CloneOwnerId);
   } 

     /**
	 * 	Update Ip7051f4CloneOwnerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051f4CloneOwnerId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051f4CloneOwnerId,ip7051f4CloneOwnerId.length);
   	
   }
   
   public void setIp7051f4CloneOwnerId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4CloneOwnerId,ip7051f4CloneOwnerId.length);
   	
   }
   
     /**
	 * 	Update Ip7051f4CloneOwnerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4CloneOwnerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4CloneOwnerId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051f4CloneOwnerId with another Field
	 *	@param value
	 */
   public void setIp7051f4CloneOwnerId(Field source) {
       replace(source,0,source.length(),beginIp7051f4CloneOwnerId,IP_7051F_4_CLONE_OWNER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051f4CloneOwnerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051f4CloneOwnerId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051f4CloneOwnerId,IP_7051F_4_CLONE_OWNER_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051f4CloneOwnerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4CloneOwnerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4CloneOwnerId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7051f4Cpu
	 *	@return ip7051f4Cpu
	 */
   public char[] getIp7051f4Cpu() throws CFException{
     if (isIp7051f4CpuModified()) { 
        ip7051f4Cpu = refreshIp7051f4Cpu();
     }
   		return ip7051f4Cpu;
   }

  
	/**
	*  set variable ip7051f4Cpu
	*  Corresponding COBOL Variable is IP7051F4-CPU
	*  @param value
	**/
   public void setIp7051f4Cpu(char[] value) {
      ip7051f4Cpu = checkIp7051f4CpuConstraints(value);
      serializeIp7051f4Cpu(ip7051f4Cpu);
   } 

     /**
	 * 	Update Ip7051f4Cpu 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051f4Cpu(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051f4Cpu,ip7051f4Cpu.length);
   	
   }
   
   public void setIp7051f4Cpu(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4Cpu,ip7051f4Cpu.length);
   	
   }
   
     /**
	 * 	Update Ip7051f4Cpu 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4Cpu(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4Cpu+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051f4Cpu with another Field
	 *	@param value
	 */
   public void setIp7051f4Cpu(Field source) {
       replace(source,0,source.length(),beginIp7051f4Cpu,IP_7051F_4_CPU_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051f4Cpu 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051f4Cpu(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051f4Cpu,IP_7051F_4_CPU_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051f4Cpu 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4Cpu(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4Cpu+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7051f4HostPrcssAgrmtId
	 *	@return ip7051f4HostPrcssAgrmtId
	 */
   public char[] getIp7051f4HostPrcssAgrmtId() throws CFException{
     if (isIp7051f4HostPrcssAgrmtIdModified()) { 
        ip7051f4HostPrcssAgrmtId = refreshIp7051f4HostPrcssAgrmtId();
     }
   		return ip7051f4HostPrcssAgrmtId;
   }

  
	/**
	*  set variable ip7051f4HostPrcssAgrmtId
	*  Corresponding COBOL Variable is IP7051F4-HOST-PRCSS-AGRMT-ID
	*  @param value
	**/
   public void setIp7051f4HostPrcssAgrmtId(char[] value) {
      ip7051f4HostPrcssAgrmtId = checkIp7051f4HostPrcssAgrmtIdConstraints(value);
      serializeIp7051f4HostPrcssAgrmtId(ip7051f4HostPrcssAgrmtId);
   } 

     /**
	 * 	Update Ip7051f4HostPrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051f4HostPrcssAgrmtId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051f4HostPrcssAgrmtId,ip7051f4HostPrcssAgrmtId.length);
   	
   }
   
   public void setIp7051f4HostPrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4HostPrcssAgrmtId,ip7051f4HostPrcssAgrmtId.length);
   	
   }
   
     /**
	 * 	Update Ip7051f4HostPrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4HostPrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4HostPrcssAgrmtId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051f4HostPrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp7051f4HostPrcssAgrmtId(Field source) {
       replace(source,0,source.length(),beginIp7051f4HostPrcssAgrmtId,IP_7051F_4_HOST_PRCSS_AGRMT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051f4HostPrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051f4HostPrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051f4HostPrcssAgrmtId,IP_7051F_4_HOST_PRCSS_AGRMT_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051f4HostPrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4HostPrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4HostPrcssAgrmtId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7051f4ServCd
	 *	@return ip7051f4ServCd
	 */
   public char[] getIp7051f4ServCd() throws CFException{
     if (isIp7051f4ServCdModified()) { 
        ip7051f4ServCd = refreshIp7051f4ServCd();
     }
   		return ip7051f4ServCd;
   }

  
	/**
	*  set variable ip7051f4ServCd
	*  Corresponding COBOL Variable is IP7051F4-SERV-CD
	*  @param value
	**/
   public void setIp7051f4ServCd(char[] value) {
      ip7051f4ServCd = checkIp7051f4ServCdConstraints(value);
      serializeIp7051f4ServCd(ip7051f4ServCd);
   } 

     /**
	 * 	Update Ip7051f4ServCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051f4ServCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051f4ServCd,ip7051f4ServCd.length);
   	
   }
   
   public void setIp7051f4ServCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4ServCd,ip7051f4ServCd.length);
   	
   }
   
     /**
	 * 	Update Ip7051f4ServCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4ServCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4ServCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051f4ServCd with another Field
	 *	@param value
	 */
   public void setIp7051f4ServCd(Field source) {
       replace(source,0,source.length(),beginIp7051f4ServCd,IP_7051F_4_SERV_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051f4ServCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051f4ServCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051f4ServCd,IP_7051F_4_SERV_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051f4ServCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4ServCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4ServCd+targetIndex,targetLen);
    
   }
	char[] ip7051f4PmaServCdIdn8888Value = "0001".toCharArray();
	/**
	 *	Test condition "0001" for isIp7051f4PmaServCdIdn88()
	 *	@return  Returns true if isIp7051f4PmaServCdIdn88() is "0001"
	 */
   public boolean isIp7051f4PmaServCdIdn88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4PmaServCdIdn8888Value)  == 0  );
   }


	/**
	*  set values "0001"
	*/
   	public void setIp7051f4PmaServCdIdn88True() {  			
    	setIp7051f4ServCd( ip7051f4PmaServCdIdn8888Value);
   	}
	char[] ip7051f4PmtServCdIdn8888Value = "0002".toCharArray();
	/**
	 *	Test condition "0002" for isIp7051f4PmtServCdIdn88()
	 *	@return  Returns true if isIp7051f4PmtServCdIdn88() is "0002"
	 */
   public boolean isIp7051f4PmtServCdIdn88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4PmtServCdIdn8888Value)  == 0  );
   }


	/**
	*  set values "0002"
	*/
   	public void setIp7051f4PmtServCdIdn88True() {  			
    	setIp7051f4ServCd( ip7051f4PmtServCdIdn8888Value);
   	}
	char[] ip7051f4PimServCdIdn8888Value = "0003".toCharArray();
	/**
	 *	Test condition "0003" for isIp7051f4PimServCdIdn88()
	 *	@return  Returns true if isIp7051f4PimServCdIdn88() is "0003"
	 */
   public boolean isIp7051f4PimServCdIdn88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4PimServCdIdn8888Value)  == 0  );
   }


	/**
	*  set values "0003"
	*/
   	public void setIp7051f4PimServCdIdn88True() {  			
    	setIp7051f4ServCd( ip7051f4PimServCdIdn8888Value);
   	}
	char[] ip7051f4CemServCd8888Value = "0004".toCharArray();
	/**
	 *	Test condition "0004" for isIp7051f4CemServCd88()
	 *	@return  Returns true if isIp7051f4CemServCd88() is "0004"
	 */
   public boolean isIp7051f4CemServCd88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4CemServCd8888Value)  == 0  );
   }


	/**
	*  set values "0004"
	*/
   	public void setIp7051f4CemServCd88True() {  			
    	setIp7051f4ServCd( ip7051f4CemServCd8888Value);
   	}
	char[] ip7051f4FnsServCd8888Value = "0005".toCharArray();
	/**
	 *	Test condition "0005" for isIp7051f4FnsServCd88()
	 *	@return  Returns true if isIp7051f4FnsServCd88() is "0005"
	 */
   public boolean isIp7051f4FnsServCd88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4FnsServCd8888Value)  == 0  );
   }


	/**
	*  set values "0005"
	*/
   	public void setIp7051f4FnsServCd88True() {  			
    	setIp7051f4ServCd( ip7051f4FnsServCd8888Value);
   	}
	char[] ip7051f4CemAuthServCd8888Value = "0006".toCharArray();
	/**
	 *	Test condition "0006" for isIp7051f4CemAuthServCd88()
	 *	@return  Returns true if isIp7051f4CemAuthServCd88() is "0006"
	 */
   public boolean isIp7051f4CemAuthServCd88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4CemAuthServCd8888Value)  == 0  );
   }


	/**
	*  set values "0006"
	*/
   	public void setIp7051f4CemAuthServCd88True() {  			
    	setIp7051f4ServCd( ip7051f4CemAuthServCd8888Value);
   	}
	char[] ip7051f4FraudServCd8888Value = "0007".toCharArray();
	/**
	 *	Test condition "0007" for isIp7051f4FraudServCd88()
	 *	@return  Returns true if isIp7051f4FraudServCd88() is "0007"
	 */
   public boolean isIp7051f4FraudServCd88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4FraudServCd8888Value)  == 0  );
   }


	/**
	*  set values "0007"
	*/
   	public void setIp7051f4FraudServCd88True() {  			
    	setIp7051f4ServCd( ip7051f4FraudServCd8888Value);
   	}
	char[] ip7051f4CemNspkServCd8888Value = "0008".toCharArray();
	/**
	 *	Test condition "0008" for isIp7051f4CemNspkServCd88()
	 *	@return  Returns true if isIp7051f4CemNspkServCd88() is "0008"
	 */
   public boolean isIp7051f4CemNspkServCd88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4CemNspkServCd8888Value)  == 0  );
   }


	/**
	*  set values "0008"
	*/
   	public void setIp7051f4CemNspkServCd88True() {  			
    	setIp7051f4ServCd( ip7051f4CemNspkServCd8888Value);
   	}
	char[] ip7051f4FastpayServCd8888Value = "0009".toCharArray();
	/**
	 *	Test condition "0009" for isIp7051f4FastpayServCd88()
	 *	@return  Returns true if isIp7051f4FastpayServCd88() is "0009"
	 */
   public boolean isIp7051f4FastpayServCd88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4FastpayServCd8888Value)  == 0  );
   }


	/**
	*  set values "0009"
	*/
   	public void setIp7051f4FastpayServCd88True() {  			
    	setIp7051f4ServCd( ip7051f4FastpayServCd8888Value);
   	}
	char[] ip7051f4InstallServCd8888Value = "0010".toCharArray();
	/**
	 *	Test condition "0010" for isIp7051f4InstallServCd88()
	 *	@return  Returns true if isIp7051f4InstallServCd88() is "0010"
	 */
   public boolean isIp7051f4InstallServCd88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4InstallServCd8888Value)  == 0  );
   }


	/**
	*  set values "0010"
	*/
   	public void setIp7051f4InstallServCd88True() {  			
    	setIp7051f4ServCd( ip7051f4InstallServCd8888Value);
   	}
	char[] ip7051f4RefundQrServCd8888Value = "0011".toCharArray();
	/**
	 *	Test condition "0011" for isIp7051f4RefundQrServCd88()
	 *	@return  Returns true if isIp7051f4RefundQrServCd88() is "0011"
	 */
   public boolean isIp7051f4RefundQrServCd88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4RefundQrServCd8888Value)  == 0  );
   }


	/**
	*  set values "0011"
	*/
   	public void setIp7051f4RefundQrServCd88True() {  			
    	setIp7051f4ServCd( ip7051f4RefundQrServCd8888Value);
   	}
	char[] ip7051f4MpAchServCd8888Value = "0012".toCharArray();
	/**
	 *	Test condition "0012" for isIp7051f4MpAchServCd88()
	 *	@return  Returns true if isIp7051f4MpAchServCd88() is "0012"
	 */
   public boolean isIp7051f4MpAchServCd88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4MpAchServCd8888Value)  == 0  );
   }


	/**
	*  set values "0012"
	*/
   	public void setIp7051f4MpAchServCd88True() {  			
    	setIp7051f4ServCd( ip7051f4MpAchServCd8888Value);
   	}
	char[] ip7051f4PmaServCdRus8888Value = "0013".toCharArray();
	/**
	 *	Test condition "0013" for isIp7051f4PmaServCdRus88()
	 *	@return  Returns true if isIp7051f4PmaServCdRus88() is "0013"
	 */
   public boolean isIp7051f4PmaServCdRus88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4PmaServCdRus8888Value)  == 0  );
   }


	/**
	*  set values "0013"
	*/
   	public void setIp7051f4PmaServCdRus88True() {  			
    	setIp7051f4ServCd( ip7051f4PmaServCdRus8888Value);
   	}
	char[] ip7051f4PimServCdRus8888Value = "0014".toCharArray();
	/**
	 *	Test condition "0014" for isIp7051f4PimServCdRus88()
	 *	@return  Returns true if isIp7051f4PimServCdRus88() is "0014"
	 */
   public boolean isIp7051f4PimServCdRus88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4PimServCdRus8888Value)  == 0  );
   }


	/**
	*  set values "0014"
	*/
   	public void setIp7051f4PimServCdRus88True() {  			
    	setIp7051f4ServCd( ip7051f4PimServCdRus8888Value);
   	}
	char[] ip7051f4PmiServCdIdn8888Value = "0015".toCharArray();
	/**
	 *	Test condition "0015" for isIp7051f4PmiServCdIdn88()
	 *	@return  Returns true if isIp7051f4PmiServCdIdn88() is "0015"
	 */
   public boolean isIp7051f4PmiServCdIdn88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4PmiServCdIdn8888Value)  == 0  );
   }


	/**
	*  set values "0015"
	*/
   	public void setIp7051f4PmiServCdIdn88True() {  			
    	setIp7051f4ServCd( ip7051f4PmiServCdIdn8888Value);
   	}
	char[] ip7051f4PmiServCdRus8888Value = "0016".toCharArray();
	/**
	 *	Test condition "0016" for isIp7051f4PmiServCdRus88()
	 *	@return  Returns true if isIp7051f4PmiServCdRus88() is "0016"
	 */
   public boolean isIp7051f4PmiServCdRus88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4PmiServCdRus8888Value)  == 0  );
   }


	/**
	*  set values "0016"
	*/
   	public void setIp7051f4PmiServCdRus88True() {  			
    	setIp7051f4ServCd( ip7051f4PmiServCdRus8888Value);
   	}
	char[] ip7051f4PmaServCdAms8888Value = "0017".toCharArray();
	/**
	 *	Test condition "0017" for isIp7051f4PmaServCdAms88()
	 *	@return  Returns true if isIp7051f4PmaServCdAms88() is "0017"
	 */
   public boolean isIp7051f4PmaServCdAms88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4PmaServCdAms8888Value)  == 0  );
   }


	/**
	*  set values "0017"
	*/
   	public void setIp7051f4PmaServCdAms88True() {  			
    	setIp7051f4ServCd( ip7051f4PmaServCdAms8888Value);
   	}
	char[] ip7051f4PmiServCdAms8888Value = "0018".toCharArray();
	/**
	 *	Test condition "0018" for isIp7051f4PmiServCdAms88()
	 *	@return  Returns true if isIp7051f4PmiServCdAms88() is "0018"
	 */
   public boolean isIp7051f4PmiServCdAms88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4PmiServCdAms8888Value)  == 0  );
   }


	/**
	*  set values "0018"
	*/
   	public void setIp7051f4PmiServCdAms88True() {  			
    	setIp7051f4ServCd( ip7051f4PmiServCdAms8888Value);
   	}
	char[] ip7051f4PimServCdAms8888Value = "0019".toCharArray();
	/**
	 *	Test condition "0019" for isIp7051f4PimServCdAms88()
	 *	@return  Returns true if isIp7051f4PimServCdAms88() is "0019"
	 */
   public boolean isIp7051f4PimServCdAms88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4PimServCdAms8888Value)  == 0  );
   }


	/**
	*  set values "0019"
	*/
   	public void setIp7051f4PimServCdAms88True() {  			
    	setIp7051f4ServCd( ip7051f4PimServCdAms8888Value);
   	}
	char[] ip7051f4PmtServCdRus8888Value = "0020".toCharArray();
	/**
	 *	Test condition "0020" for isIp7051f4PmtServCdRus88()
	 *	@return  Returns true if isIp7051f4PmtServCdRus88() is "0020"
	 */
   public boolean isIp7051f4PmtServCdRus88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4PmtServCdRus8888Value)  == 0  );
   }


	/**
	*  set values "0020"
	*/
   	public void setIp7051f4PmtServCdRus88True() {  			
    	setIp7051f4ServCd( ip7051f4PmtServCdRus8888Value);
   	}
	char[] ip7051f4PmtServCdInd8888Value = "0021".toCharArray();
	/**
	 *	Test condition "0021" for isIp7051f4PmtServCdInd88()
	 *	@return  Returns true if isIp7051f4PmtServCdInd88() is "0021"
	 */
   public boolean isIp7051f4PmtServCdInd88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4PmtServCdInd8888Value)  == 0  );
   }


	/**
	*  set values "0021"
	*/
   	public void setIp7051f4PmtServCdInd88True() {  			
    	setIp7051f4ServCd( ip7051f4PmtServCdInd8888Value);
   	}
	char[] ip7051f4PmaServCdInd8888Value = "0022".toCharArray();
	/**
	 *	Test condition "0022" for isIp7051f4PmaServCdInd88()
	 *	@return  Returns true if isIp7051f4PmaServCdInd88() is "0022"
	 */
   public boolean isIp7051f4PmaServCdInd88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4PmaServCdInd8888Value)  == 0  );
   }


	/**
	*  set values "0022"
	*/
   	public void setIp7051f4PmaServCdInd88True() {  			
    	setIp7051f4ServCd( ip7051f4PmaServCdInd8888Value);
   	}
	char[] ip7051f4PimServCdInd8888Value = "0023".toCharArray();
	/**
	 *	Test condition "0023" for isIp7051f4PimServCdInd88()
	 *	@return  Returns true if isIp7051f4PimServCdInd88() is "0023"
	 */
   public boolean isIp7051f4PimServCdInd88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4PimServCdInd8888Value)  == 0  );
   }


	/**
	*  set values "0023"
	*/
   	public void setIp7051f4PimServCdInd88True() {  			
    	setIp7051f4ServCd( ip7051f4PimServCdInd8888Value);
   	}
	char[] ip7051f4PmiServCdInd8888Value = "0024".toCharArray();
	/**
	 *	Test condition "0024" for isIp7051f4PmiServCdInd88()
	 *	@return  Returns true if isIp7051f4PmiServCdInd88() is "0024"
	 */
   public boolean isIp7051f4PmiServCdInd88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4PmiServCdInd8888Value)  == 0  );
   }


	/**
	*  set values "0024"
	*/
   	public void setIp7051f4PmiServCdInd88True() {  			
    	setIp7051f4ServCd( ip7051f4PmiServCdInd8888Value);
   	}
	char[] ip7051f4AlmServCd8888Value = "0025".toCharArray();
	/**
	 *	Test condition "0025" for isIp7051f4AlmServCd88()
	 *	@return  Returns true if isIp7051f4AlmServCd88() is "0025"
	 */
   public boolean isIp7051f4AlmServCd88() throws CFException {
      return (  compareChars( getIp7051f4ServCd() , ip7051f4AlmServCd8888Value)  == 0  );
   }


	/**
	*  set values "0025"
	*/
   	public void setIp7051f4AlmServCd88True() {  			
    	setIp7051f4ServCd( ip7051f4AlmServCd8888Value);
   	}
	/**
	 *	Returns the value of ip7051f4FuncCd
	 *	@return ip7051f4FuncCd
	 */
   public char[] getIp7051f4FuncCd() throws CFException{
     if (isIp7051f4FuncCdModified()) { 
        ip7051f4FuncCd = refreshIp7051f4FuncCd();
     }
   		return ip7051f4FuncCd;
   }

  
	/**
	*  set variable ip7051f4FuncCd
	*  Corresponding COBOL Variable is IP7051F4-FUNC-CD
	*  @param value
	**/
   public void setIp7051f4FuncCd(char[] value) {
      ip7051f4FuncCd = checkIp7051f4FuncCdConstraints(value);
      serializeIp7051f4FuncCd(ip7051f4FuncCd);
   } 

     /**
	 * 	Update Ip7051f4FuncCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051f4FuncCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051f4FuncCd,ip7051f4FuncCd.length);
   	
   }
   
   public void setIp7051f4FuncCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4FuncCd,ip7051f4FuncCd.length);
   	
   }
   
     /**
	 * 	Update Ip7051f4FuncCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4FuncCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4FuncCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051f4FuncCd with another Field
	 *	@param value
	 */
   public void setIp7051f4FuncCd(Field source) {
       replace(source,0,source.length(),beginIp7051f4FuncCd,IP_7051F_4_FUNC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051f4FuncCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051f4FuncCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051f4FuncCd,IP_7051F_4_FUNC_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051f4FuncCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4FuncCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4FuncCd+targetIndex,targetLen);
    
   }
	char[] ip7051f4GeneralFuncCd8888Value = "0000".toCharArray();
	/**
	 *	Test condition "0000" for isIp7051f4GeneralFuncCd88()
	 *	@return  Returns true if isIp7051f4GeneralFuncCd88() is "0000"
	 */
   public boolean isIp7051f4GeneralFuncCd88() throws CFException {
      return (  compareChars( getIp7051f4FuncCd() , ip7051f4GeneralFuncCd8888Value)  == 0  );
   }


	/**
	*  set values "0000"
	*/
   	public void setIp7051f4GeneralFuncCd88True() {  			
    	setIp7051f4FuncCd( ip7051f4GeneralFuncCd8888Value);
   	}
	char[] ip7051f4PresFuncCd8888Value = "0001".toCharArray();
	/**
	 *	Test condition "0001" for isIp7051f4PresFuncCd88()
	 *	@return  Returns true if isIp7051f4PresFuncCd88() is "0001"
	 */
   public boolean isIp7051f4PresFuncCd88() throws CFException {
      return (  compareChars( getIp7051f4FuncCd() , ip7051f4PresFuncCd8888Value)  == 0  );
   }


	/**
	*  set values "0001"
	*/
   	public void setIp7051f4PresFuncCd88True() {  			
    	setIp7051f4FuncCd( ip7051f4PresFuncCd8888Value);
   	}
	char[] ip7051f4ChaFuncCd8888Value = "0002".toCharArray();
	/**
	 *	Test condition "0002" for isIp7051f4ChaFuncCd88()
	 *	@return  Returns true if isIp7051f4ChaFuncCd88() is "0002"
	 */
   public boolean isIp7051f4ChaFuncCd88() throws CFException {
      return (  compareChars( getIp7051f4FuncCd() , ip7051f4ChaFuncCd8888Value)  == 0  );
   }


	/**
	*  set values "0002"
	*/
   	public void setIp7051f4ChaFuncCd88True() {  			
    	setIp7051f4FuncCd( ip7051f4ChaFuncCd8888Value);
   	}
	/**
	 *	Returns the value of ip7051f4QueueNum
	 *	@return ip7051f4QueueNum
	 */
	public int getIp7051f4QueueNum() throws CFException {
       if (isIp7051f4QueueNumModified()) { 
           ip7051f4QueueNum = refreshIp7051f4QueueNum();
        }
   		return ip7051f4QueueNum;
	}
	

	
	   
	/**
	 * 	Update Ip7051f4QueueNum with the passed value
	 *  Corresponding COBOL Variable is IP7051F4-QUEUE-NUM
	 *	@param number
	 */
	public void setIp7051f4QueueNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip7051f4QueueNum = checkIp7051f4QueueNumMaxLimit(number); 
		serializeIp7051f4QueueNum(ip7051f4QueueNum);
	}
	

	public void setIp7051f4QueueNum(long number) {
	    number = checkIp7051f4QueueNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7051f4QueueNum((int)number);
	}
	
	/**
	 * 	Update Ip7051f4QueueNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp7051f4QueueNum(char[] value) throws CFException {
		 ip7051f4QueueNum = serializeIp7051f4QueueNum(value);
	}
	/**
	 * 	Update Ip7051f4QueueNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp7051f4QueueNumString(char[] value) throws CFException {
		 setIp7051f4QueueNum(value);
	}

	
	
	
	/**
	 * 	initializes Ip7051f4TableKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp7051f4EnvCd(CONSTANTS.SPACE_3);
         setIp7051f4CloneOwnerId(CONSTANTS.SPACE_3);
         setIp7051f4Cpu(CONSTANTS.SPACE_4);
         setIp7051f4HostPrcssAgrmtId(CONSTANTS.SPACE_11);
         setIp7051f4ServCd(CONSTANTS.SPACE_4);
         setIp7051f4FuncCd(CONSTANTS.SPACE_4);
                     setIp7051f4QueueNum(0);
   }

		public static int getIp7051f4TableKeyFieldLength() {
			return IP_7051F_4_TABLE_KEY_LENGTH;
		}

}
  
