package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70511TableKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:34. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip70511TableKey extends Ip70511TableKeySerialized { 
   

						private char[] ip70511EnvCd = Field.fillLowValue(3);

						private char[] ip70511CloneOwnerId = Field.fillLowValue(3);

						private char[] ip70511Cpu = Field.fillLowValue(4);

						private char[] ip70511HostPrcssAgrmtId = Field.fillLowValue(11);

						private char[] ip70511ServCd = Field.fillLowValue(4);

						private char[] ip70511FuncCd = Field.fillLowValue(4);

								private int ip70511QueueNum;
	
	/**
	* Constructor for Ip70511TableKey
	**/
    public Ip70511TableKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip70511TableKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip70511TableKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip70511EnvCd
	 *	@return ip70511EnvCd
	 */
   public char[] getIp70511EnvCd() throws CFException{
     if (isIp70511EnvCdModified()) { 
        ip70511EnvCd = refreshIp70511EnvCd();
     }
   		return ip70511EnvCd;
   }

  
	/**
	*  set variable ip70511EnvCd
	*  Corresponding COBOL Variable is IP70511-ENV-CD
	*  @param value
	**/
   public void setIp70511EnvCd(char[] value) {
      ip70511EnvCd = checkIp70511EnvCdConstraints(value);
      serializeIp70511EnvCd(ip70511EnvCd);
   } 

     /**
	 * 	Update Ip70511EnvCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70511EnvCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70511EnvCd,ip70511EnvCd.length);
   	
   }
   
   public void setIp70511EnvCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511EnvCd,ip70511EnvCd.length);
   	
   }
   
     /**
	 * 	Update Ip70511EnvCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70511EnvCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511EnvCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70511EnvCd with another Field
	 *	@param value
	 */
   public void setIp70511EnvCd(Field source) {
       replace(source,0,source.length(),beginIp70511EnvCd,IP_70511_ENV_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70511EnvCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70511EnvCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70511EnvCd,IP_70511_ENV_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip70511EnvCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70511EnvCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511EnvCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip70511CloneOwnerId
	 *	@return ip70511CloneOwnerId
	 */
   public char[] getIp70511CloneOwnerId() throws CFException{
     if (isIp70511CloneOwnerIdModified()) { 
        ip70511CloneOwnerId = refreshIp70511CloneOwnerId();
     }
   		return ip70511CloneOwnerId;
   }

  
	/**
	*  set variable ip70511CloneOwnerId
	*  Corresponding COBOL Variable is IP70511-CLONE-OWNER-ID
	*  @param value
	**/
   public void setIp70511CloneOwnerId(char[] value) {
      ip70511CloneOwnerId = checkIp70511CloneOwnerIdConstraints(value);
      serializeIp70511CloneOwnerId(ip70511CloneOwnerId);
   } 

     /**
	 * 	Update Ip70511CloneOwnerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70511CloneOwnerId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70511CloneOwnerId,ip70511CloneOwnerId.length);
   	
   }
   
   public void setIp70511CloneOwnerId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511CloneOwnerId,ip70511CloneOwnerId.length);
   	
   }
   
     /**
	 * 	Update Ip70511CloneOwnerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70511CloneOwnerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511CloneOwnerId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70511CloneOwnerId with another Field
	 *	@param value
	 */
   public void setIp70511CloneOwnerId(Field source) {
       replace(source,0,source.length(),beginIp70511CloneOwnerId,IP_70511_CLONE_OWNER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70511CloneOwnerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70511CloneOwnerId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70511CloneOwnerId,IP_70511_CLONE_OWNER_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip70511CloneOwnerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70511CloneOwnerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511CloneOwnerId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip70511Cpu
	 *	@return ip70511Cpu
	 */
   public char[] getIp70511Cpu() throws CFException{
     if (isIp70511CpuModified()) { 
        ip70511Cpu = refreshIp70511Cpu();
     }
   		return ip70511Cpu;
   }

  
	/**
	*  set variable ip70511Cpu
	*  Corresponding COBOL Variable is IP70511-CPU
	*  @param value
	**/
   public void setIp70511Cpu(char[] value) {
      ip70511Cpu = checkIp70511CpuConstraints(value);
      serializeIp70511Cpu(ip70511Cpu);
   } 

     /**
	 * 	Update Ip70511Cpu 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70511Cpu(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70511Cpu,ip70511Cpu.length);
   	
   }
   
   public void setIp70511Cpu(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511Cpu,ip70511Cpu.length);
   	
   }
   
     /**
	 * 	Update Ip70511Cpu 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70511Cpu(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511Cpu+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70511Cpu with another Field
	 *	@param value
	 */
   public void setIp70511Cpu(Field source) {
       replace(source,0,source.length(),beginIp70511Cpu,IP_70511_CPU_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70511Cpu 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70511Cpu(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70511Cpu,IP_70511_CPU_LEN);
   	
   }
   
     /**
	 * 	Update Ip70511Cpu 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70511Cpu(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511Cpu+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip70511HostPrcssAgrmtId
	 *	@return ip70511HostPrcssAgrmtId
	 */
   public char[] getIp70511HostPrcssAgrmtId() throws CFException{
     if (isIp70511HostPrcssAgrmtIdModified()) { 
        ip70511HostPrcssAgrmtId = refreshIp70511HostPrcssAgrmtId();
     }
   		return ip70511HostPrcssAgrmtId;
   }

  
	/**
	*  set variable ip70511HostPrcssAgrmtId
	*  Corresponding COBOL Variable is IP70511-HOST-PRCSS-AGRMT-ID
	*  @param value
	**/
   public void setIp70511HostPrcssAgrmtId(char[] value) {
      ip70511HostPrcssAgrmtId = checkIp70511HostPrcssAgrmtIdConstraints(value);
      serializeIp70511HostPrcssAgrmtId(ip70511HostPrcssAgrmtId);
   } 

     /**
	 * 	Update Ip70511HostPrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70511HostPrcssAgrmtId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70511HostPrcssAgrmtId,ip70511HostPrcssAgrmtId.length);
   	
   }
   
   public void setIp70511HostPrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511HostPrcssAgrmtId,ip70511HostPrcssAgrmtId.length);
   	
   }
   
     /**
	 * 	Update Ip70511HostPrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70511HostPrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511HostPrcssAgrmtId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70511HostPrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp70511HostPrcssAgrmtId(Field source) {
       replace(source,0,source.length(),beginIp70511HostPrcssAgrmtId,IP_70511_HOST_PRCSS_AGRMT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70511HostPrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70511HostPrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70511HostPrcssAgrmtId,IP_70511_HOST_PRCSS_AGRMT_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip70511HostPrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70511HostPrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511HostPrcssAgrmtId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip70511ServCd
	 *	@return ip70511ServCd
	 */
   public char[] getIp70511ServCd() throws CFException{
     if (isIp70511ServCdModified()) { 
        ip70511ServCd = refreshIp70511ServCd();
     }
   		return ip70511ServCd;
   }

  
	/**
	*  set variable ip70511ServCd
	*  Corresponding COBOL Variable is IP70511-SERV-CD
	*  @param value
	**/
   public void setIp70511ServCd(char[] value) {
      ip70511ServCd = checkIp70511ServCdConstraints(value);
      serializeIp70511ServCd(ip70511ServCd);
   } 

     /**
	 * 	Update Ip70511ServCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70511ServCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70511ServCd,ip70511ServCd.length);
   	
   }
   
   public void setIp70511ServCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511ServCd,ip70511ServCd.length);
   	
   }
   
     /**
	 * 	Update Ip70511ServCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70511ServCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511ServCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70511ServCd with another Field
	 *	@param value
	 */
   public void setIp70511ServCd(Field source) {
       replace(source,0,source.length(),beginIp70511ServCd,IP_70511_SERV_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70511ServCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70511ServCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70511ServCd,IP_70511_SERV_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip70511ServCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70511ServCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511ServCd+targetIndex,targetLen);
    
   }
	char[] ip70511PmaServCdIdn8888Value = "0001".toCharArray();
	/**
	 *	Test condition "0001" for isIp70511PmaServCdIdn88()
	 *	@return  Returns true if isIp70511PmaServCdIdn88() is "0001"
	 */
   public boolean isIp70511PmaServCdIdn88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511PmaServCdIdn8888Value)  == 0  );
   }


	/**
	*  set values "0001"
	*/
   	public void setIp70511PmaServCdIdn88True() {  			
    	setIp70511ServCd( ip70511PmaServCdIdn8888Value);
   	}
	char[] ip70511PmtMapServCd8888Value = "0002".toCharArray();
	/**
	 *	Test condition "0002" for isIp70511PmtMapServCd88()
	 *	@return  Returns true if isIp70511PmtMapServCd88() is "0002"
	 */
   public boolean isIp70511PmtMapServCd88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511PmtMapServCd8888Value)  == 0  );
   }


	/**
	*  set values "0002"
	*/
   	public void setIp70511PmtMapServCd88True() {  			
    	setIp70511ServCd( ip70511PmtMapServCd8888Value);
   	}
	char[] ip70511PimMapServCd8888Value = "0003".toCharArray();
	/**
	 *	Test condition "0003" for isIp70511PimMapServCd88()
	 *	@return  Returns true if isIp70511PimMapServCd88() is "0003"
	 */
   public boolean isIp70511PimMapServCd88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511PimMapServCd8888Value)  == 0  );
   }


	/**
	*  set values "0003"
	*/
   	public void setIp70511PimMapServCd88True() {  			
    	setIp70511ServCd( ip70511PimMapServCd8888Value);
   	}
	char[] ip70511CemServCd8888Value = "0004".toCharArray();
	/**
	 *	Test condition "0004" for isIp70511CemServCd88()
	 *	@return  Returns true if isIp70511CemServCd88() is "0004"
	 */
   public boolean isIp70511CemServCd88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511CemServCd8888Value)  == 0  );
   }


	/**
	*  set values "0004"
	*/
   	public void setIp70511CemServCd88True() {  			
    	setIp70511ServCd( ip70511CemServCd8888Value);
   	}
	char[] ip70511FnsServCd8888Value = "0005".toCharArray();
	/**
	 *	Test condition "0005" for isIp70511FnsServCd88()
	 *	@return  Returns true if isIp70511FnsServCd88() is "0005"
	 */
   public boolean isIp70511FnsServCd88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511FnsServCd8888Value)  == 0  );
   }


	/**
	*  set values "0005"
	*/
   	public void setIp70511FnsServCd88True() {  			
    	setIp70511ServCd( ip70511FnsServCd8888Value);
   	}
	char[] ip70511CemAuthServCd8888Value = "0006".toCharArray();
	/**
	 *	Test condition "0006" for isIp70511CemAuthServCd88()
	 *	@return  Returns true if isIp70511CemAuthServCd88() is "0006"
	 */
   public boolean isIp70511CemAuthServCd88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511CemAuthServCd8888Value)  == 0  );
   }


	/**
	*  set values "0006"
	*/
   	public void setIp70511CemAuthServCd88True() {  			
    	setIp70511ServCd( ip70511CemAuthServCd8888Value);
   	}
	char[] ip70511FraudServCd8888Value = "0007".toCharArray();
	/**
	 *	Test condition "0007" for isIp70511FraudServCd88()
	 *	@return  Returns true if isIp70511FraudServCd88() is "0007"
	 */
   public boolean isIp70511FraudServCd88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511FraudServCd8888Value)  == 0  );
   }


	/**
	*  set values "0007"
	*/
   	public void setIp70511FraudServCd88True() {  			
    	setIp70511ServCd( ip70511FraudServCd8888Value);
   	}
	char[] ip70511CemNspkServCd8888Value = "0008".toCharArray();
	/**
	 *	Test condition "0008" for isIp70511CemNspkServCd88()
	 *	@return  Returns true if isIp70511CemNspkServCd88() is "0008"
	 */
   public boolean isIp70511CemNspkServCd88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511CemNspkServCd8888Value)  == 0  );
   }


	/**
	*  set values "0008"
	*/
   	public void setIp70511CemNspkServCd88True() {  			
    	setIp70511ServCd( ip70511CemNspkServCd8888Value);
   	}
	char[] ip70511FastpayServCd8888Value = "0009".toCharArray();
	/**
	 *	Test condition "0009" for isIp70511FastpayServCd88()
	 *	@return  Returns true if isIp70511FastpayServCd88() is "0009"
	 */
   public boolean isIp70511FastpayServCd88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511FastpayServCd8888Value)  == 0  );
   }


	/**
	*  set values "0009"
	*/
   	public void setIp70511FastpayServCd88True() {  			
    	setIp70511ServCd( ip70511FastpayServCd8888Value);
   	}
	char[] ip70511InstallServCd8888Value = "0010".toCharArray();
	/**
	 *	Test condition "0010" for isIp70511InstallServCd88()
	 *	@return  Returns true if isIp70511InstallServCd88() is "0010"
	 */
   public boolean isIp70511InstallServCd88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511InstallServCd8888Value)  == 0  );
   }


	/**
	*  set values "0010"
	*/
   	public void setIp70511InstallServCd88True() {  			
    	setIp70511ServCd( ip70511InstallServCd8888Value);
   	}
	char[] ip70511RefundQrServCd8888Value = "0011".toCharArray();
	/**
	 *	Test condition "0011" for isIp70511RefundQrServCd88()
	 *	@return  Returns true if isIp70511RefundQrServCd88() is "0011"
	 */
   public boolean isIp70511RefundQrServCd88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511RefundQrServCd8888Value)  == 0  );
   }


	/**
	*  set values "0011"
	*/
   	public void setIp70511RefundQrServCd88True() {  			
    	setIp70511ServCd( ip70511RefundQrServCd8888Value);
   	}
	char[] ip70511MpAchServCd8888Value = "0012".toCharArray();
	/**
	 *	Test condition "0012" for isIp70511MpAchServCd88()
	 *	@return  Returns true if isIp70511MpAchServCd88() is "0012"
	 */
   public boolean isIp70511MpAchServCd88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511MpAchServCd8888Value)  == 0  );
   }


	/**
	*  set values "0012"
	*/
   	public void setIp70511MpAchServCd88True() {  			
    	setIp70511ServCd( ip70511MpAchServCd8888Value);
   	}
	char[] ip70511PmaServCdRus8888Value = "0013".toCharArray();
	/**
	 *	Test condition "0013" for isIp70511PmaServCdRus88()
	 *	@return  Returns true if isIp70511PmaServCdRus88() is "0013"
	 */
   public boolean isIp70511PmaServCdRus88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511PmaServCdRus8888Value)  == 0  );
   }


	/**
	*  set values "0013"
	*/
   	public void setIp70511PmaServCdRus88True() {  			
    	setIp70511ServCd( ip70511PmaServCdRus8888Value);
   	}
	char[] ip70511PmtServCdIdn8888Value = "0002".toCharArray();
	/**
	 *	Test condition "0002" for isIp70511PmtServCdIdn88()
	 *	@return  Returns true if isIp70511PmtServCdIdn88() is "0002"
	 */
   public boolean isIp70511PmtServCdIdn88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511PmtServCdIdn8888Value)  == 0  );
   }


	/**
	*  set values "0002"
	*/
   	public void setIp70511PmtServCdIdn88True() {  			
    	setIp70511ServCd( ip70511PmtServCdIdn8888Value);
   	}
	char[] ip70511PimServCdIdn8888Value = "0003".toCharArray();
	/**
	 *	Test condition "0003" for isIp70511PimServCdIdn88()
	 *	@return  Returns true if isIp70511PimServCdIdn88() is "0003"
	 */
   public boolean isIp70511PimServCdIdn88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511PimServCdIdn8888Value)  == 0  );
   }


	/**
	*  set values "0003"
	*/
   	public void setIp70511PimServCdIdn88True() {  			
    	setIp70511ServCd( ip70511PimServCdIdn8888Value);
   	}
	char[] ip70511PimServCdRus8888Value = "0014".toCharArray();
	/**
	 *	Test condition "0014" for isIp70511PimServCdRus88()
	 *	@return  Returns true if isIp70511PimServCdRus88() is "0014"
	 */
   public boolean isIp70511PimServCdRus88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511PimServCdRus8888Value)  == 0  );
   }


	/**
	*  set values "0014"
	*/
   	public void setIp70511PimServCdRus88True() {  			
    	setIp70511ServCd( ip70511PimServCdRus8888Value);
   	}
	char[] ip70511PmiServCdIdn8888Value = "0015".toCharArray();
	/**
	 *	Test condition "0015" for isIp70511PmiServCdIdn88()
	 *	@return  Returns true if isIp70511PmiServCdIdn88() is "0015"
	 */
   public boolean isIp70511PmiServCdIdn88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511PmiServCdIdn8888Value)  == 0  );
   }


	/**
	*  set values "0015"
	*/
   	public void setIp70511PmiServCdIdn88True() {  			
    	setIp70511ServCd( ip70511PmiServCdIdn8888Value);
   	}
	char[] ip70511PmiServCdRus8888Value = "0016".toCharArray();
	/**
	 *	Test condition "0016" for isIp70511PmiServCdRus88()
	 *	@return  Returns true if isIp70511PmiServCdRus88() is "0016"
	 */
   public boolean isIp70511PmiServCdRus88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511PmiServCdRus8888Value)  == 0  );
   }


	/**
	*  set values "0016"
	*/
   	public void setIp70511PmiServCdRus88True() {  			
    	setIp70511ServCd( ip70511PmiServCdRus8888Value);
   	}
	char[] ip70511PmaServCdAms8888Value = "0017".toCharArray();
	/**
	 *	Test condition "0017" for isIp70511PmaServCdAms88()
	 *	@return  Returns true if isIp70511PmaServCdAms88() is "0017"
	 */
   public boolean isIp70511PmaServCdAms88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511PmaServCdAms8888Value)  == 0  );
   }


	/**
	*  set values "0017"
	*/
   	public void setIp70511PmaServCdAms88True() {  			
    	setIp70511ServCd( ip70511PmaServCdAms8888Value);
   	}
	char[] ip70511PmiServCdAms8888Value = "0018".toCharArray();
	/**
	 *	Test condition "0018" for isIp70511PmiServCdAms88()
	 *	@return  Returns true if isIp70511PmiServCdAms88() is "0018"
	 */
   public boolean isIp70511PmiServCdAms88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511PmiServCdAms8888Value)  == 0  );
   }


	/**
	*  set values "0018"
	*/
   	public void setIp70511PmiServCdAms88True() {  			
    	setIp70511ServCd( ip70511PmiServCdAms8888Value);
   	}
	char[] ip70511PimServCdAms8888Value = "0019".toCharArray();
	/**
	 *	Test condition "0019" for isIp70511PimServCdAms88()
	 *	@return  Returns true if isIp70511PimServCdAms88() is "0019"
	 */
   public boolean isIp70511PimServCdAms88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511PimServCdAms8888Value)  == 0  );
   }


	/**
	*  set values "0019"
	*/
   	public void setIp70511PimServCdAms88True() {  			
    	setIp70511ServCd( ip70511PimServCdAms8888Value);
   	}
	char[] ip70511PmtServCdRus8888Value = "0020".toCharArray();
	/**
	 *	Test condition "0020" for isIp70511PmtServCdRus88()
	 *	@return  Returns true if isIp70511PmtServCdRus88() is "0020"
	 */
   public boolean isIp70511PmtServCdRus88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511PmtServCdRus8888Value)  == 0  );
   }


	/**
	*  set values "0020"
	*/
   	public void setIp70511PmtServCdRus88True() {  			
    	setIp70511ServCd( ip70511PmtServCdRus8888Value);
   	}
	char[] ip70511PmtServCdInd8888Value = "0021".toCharArray();
	/**
	 *	Test condition "0021" for isIp70511PmtServCdInd88()
	 *	@return  Returns true if isIp70511PmtServCdInd88() is "0021"
	 */
   public boolean isIp70511PmtServCdInd88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511PmtServCdInd8888Value)  == 0  );
   }


	/**
	*  set values "0021"
	*/
   	public void setIp70511PmtServCdInd88True() {  			
    	setIp70511ServCd( ip70511PmtServCdInd8888Value);
   	}
	char[] ip70511PmaServCdInd8888Value = "0022".toCharArray();
	/**
	 *	Test condition "0022" for isIp70511PmaServCdInd88()
	 *	@return  Returns true if isIp70511PmaServCdInd88() is "0022"
	 */
   public boolean isIp70511PmaServCdInd88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511PmaServCdInd8888Value)  == 0  );
   }


	/**
	*  set values "0022"
	*/
   	public void setIp70511PmaServCdInd88True() {  			
    	setIp70511ServCd( ip70511PmaServCdInd8888Value);
   	}
	char[] ip70511PimServCdInd8888Value = "0023".toCharArray();
	/**
	 *	Test condition "0023" for isIp70511PimServCdInd88()
	 *	@return  Returns true if isIp70511PimServCdInd88() is "0023"
	 */
   public boolean isIp70511PimServCdInd88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511PimServCdInd8888Value)  == 0  );
   }


	/**
	*  set values "0023"
	*/
   	public void setIp70511PimServCdInd88True() {  			
    	setIp70511ServCd( ip70511PimServCdInd8888Value);
   	}
	char[] ip70511PmiServCdInd8888Value = "0024".toCharArray();
	/**
	 *	Test condition "0024" for isIp70511PmiServCdInd88()
	 *	@return  Returns true if isIp70511PmiServCdInd88() is "0024"
	 */
   public boolean isIp70511PmiServCdInd88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511PmiServCdInd8888Value)  == 0  );
   }


	/**
	*  set values "0024"
	*/
   	public void setIp70511PmiServCdInd88True() {  			
    	setIp70511ServCd( ip70511PmiServCdInd8888Value);
   	}
	char[] ip70511AlmServCd8888Value = "0025".toCharArray();
	/**
	 *	Test condition "0025" for isIp70511AlmServCd88()
	 *	@return  Returns true if isIp70511AlmServCd88() is "0025"
	 */
   public boolean isIp70511AlmServCd88() throws CFException {
      return (  compareChars( getIp70511ServCd() , ip70511AlmServCd8888Value)  == 0  );
   }


	/**
	*  set values "0025"
	*/
   	public void setIp70511AlmServCd88True() {  			
    	setIp70511ServCd( ip70511AlmServCd8888Value);
   	}
	/**
	 *	Returns the value of ip70511FuncCd
	 *	@return ip70511FuncCd
	 */
   public char[] getIp70511FuncCd() throws CFException{
     if (isIp70511FuncCdModified()) { 
        ip70511FuncCd = refreshIp70511FuncCd();
     }
   		return ip70511FuncCd;
   }

  
	/**
	*  set variable ip70511FuncCd
	*  Corresponding COBOL Variable is IP70511-FUNC-CD
	*  @param value
	**/
   public void setIp70511FuncCd(char[] value) {
      ip70511FuncCd = checkIp70511FuncCdConstraints(value);
      serializeIp70511FuncCd(ip70511FuncCd);
   } 

     /**
	 * 	Update Ip70511FuncCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70511FuncCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70511FuncCd,ip70511FuncCd.length);
   	
   }
   
   public void setIp70511FuncCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511FuncCd,ip70511FuncCd.length);
   	
   }
   
     /**
	 * 	Update Ip70511FuncCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70511FuncCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511FuncCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70511FuncCd with another Field
	 *	@param value
	 */
   public void setIp70511FuncCd(Field source) {
       replace(source,0,source.length(),beginIp70511FuncCd,IP_70511_FUNC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70511FuncCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70511FuncCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70511FuncCd,IP_70511_FUNC_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip70511FuncCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70511FuncCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70511FuncCd+targetIndex,targetLen);
    
   }
	char[] ip70511GeneralFuncCd8888Value = "0000".toCharArray();
	/**
	 *	Test condition "0000" for isIp70511GeneralFuncCd88()
	 *	@return  Returns true if isIp70511GeneralFuncCd88() is "0000"
	 */
   public boolean isIp70511GeneralFuncCd88() throws CFException {
      return (  compareChars( getIp70511FuncCd() , ip70511GeneralFuncCd8888Value)  == 0  );
   }


	/**
	*  set values "0000"
	*/
   	public void setIp70511GeneralFuncCd88True() {  			
    	setIp70511FuncCd( ip70511GeneralFuncCd8888Value);
   	}
	char[] ip70511PresFuncCd8888Value = "0001".toCharArray();
	/**
	 *	Test condition "0001" for isIp70511PresFuncCd88()
	 *	@return  Returns true if isIp70511PresFuncCd88() is "0001"
	 */
   public boolean isIp70511PresFuncCd88() throws CFException {
      return (  compareChars( getIp70511FuncCd() , ip70511PresFuncCd8888Value)  == 0  );
   }


	/**
	*  set values "0001"
	*/
   	public void setIp70511PresFuncCd88True() {  			
    	setIp70511FuncCd( ip70511PresFuncCd8888Value);
   	}
	char[] ip70511ChaFuncCd8888Value = "0002".toCharArray();
	/**
	 *	Test condition "0002" for isIp70511ChaFuncCd88()
	 *	@return  Returns true if isIp70511ChaFuncCd88() is "0002"
	 */
   public boolean isIp70511ChaFuncCd88() throws CFException {
      return (  compareChars( getIp70511FuncCd() , ip70511ChaFuncCd8888Value)  == 0  );
   }


	/**
	*  set values "0002"
	*/
   	public void setIp70511ChaFuncCd88True() {  			
    	setIp70511FuncCd( ip70511ChaFuncCd8888Value);
   	}
	char[] ip70511CemFuncCdReq8888Value = "0003".toCharArray();
	/**
	 *	Test condition "0003" for isIp70511CemFuncCdReq88()
	 *	@return  Returns true if isIp70511CemFuncCdReq88() is "0003"
	 */
   public boolean isIp70511CemFuncCdReq88() throws CFException {
      return (  compareChars( getIp70511FuncCd() , ip70511CemFuncCdReq8888Value)  == 0  );
   }


	/**
	*  set values "0003"
	*/
   	public void setIp70511CemFuncCdReq88True() {  			
    	setIp70511FuncCd( ip70511CemFuncCdReq8888Value);
   	}
	char[] ip70511CemFuncCdRes8888Value = "0004".toCharArray();
	/**
	 *	Test condition "0004" for isIp70511CemFuncCdRes88()
	 *	@return  Returns true if isIp70511CemFuncCdRes88() is "0004"
	 */
   public boolean isIp70511CemFuncCdRes88() throws CFException {
      return (  compareChars( getIp70511FuncCd() , ip70511CemFuncCdRes8888Value)  == 0  );
   }


	/**
	*  set values "0004"
	*/
   	public void setIp70511CemFuncCdRes88True() {  			
    	setIp70511FuncCd( ip70511CemFuncCdRes8888Value);
   	}
	/**
	 *	Returns the value of ip70511QueueNum
	 *	@return ip70511QueueNum
	 */
	public int getIp70511QueueNum() throws CFException {
       if (isIp70511QueueNumModified()) { 
           ip70511QueueNum = refreshIp70511QueueNum();
        }
   		return ip70511QueueNum;
	}
	

	
	   
	/**
	 * 	Update Ip70511QueueNum with the passed value
	 *  Corresponding COBOL Variable is IP70511-QUEUE-NUM
	 *	@param number
	 */
	public void setIp70511QueueNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip70511QueueNum = checkIp70511QueueNumMaxLimit(number); 
		serializeIp70511QueueNum(ip70511QueueNum);
	}
	

	public void setIp70511QueueNum(long number) {
	    number = checkIp70511QueueNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp70511QueueNum((int)number);
	}
	
	/**
	 * 	Update Ip70511QueueNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp70511QueueNum(char[] value) throws CFException {
		 ip70511QueueNum = serializeIp70511QueueNum(value);
	}
	/**
	 * 	Update Ip70511QueueNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp70511QueueNumString(char[] value) throws CFException {
		 setIp70511QueueNum(value);
	}

	
	
	
	/**
	 * 	initializes Ip70511TableKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp70511EnvCd(CONSTANTS.SPACE_3);
         setIp70511CloneOwnerId(CONSTANTS.SPACE_3);
         setIp70511Cpu(CONSTANTS.SPACE_4);
         setIp70511HostPrcssAgrmtId(CONSTANTS.SPACE_11);
         setIp70511ServCd(CONSTANTS.SPACE_4);
         setIp70511FuncCd(CONSTANTS.SPACE_4);
                     setIp70511QueueNum(0);
   }

		public static int getIp70511TableKeyFieldLength() {
			return IP_70511_TABLE_KEY_LENGTH;
		}

}
  
