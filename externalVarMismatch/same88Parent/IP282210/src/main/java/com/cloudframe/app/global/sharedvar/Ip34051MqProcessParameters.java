package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip34051MqProcessParameters is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip34051MqProcessParameters")

public class Ip34051MqProcessParameters extends Ip34051MqProcessParametersSerialized  implements InitializingBean {
   

						private char[] ip34051ProcessSwitch = Field.fillLowValue(1);

						private char[] ip34051QueueType = Field.fillLowValue(1);

						private char[] ip34051ServCd = Field.fillLowValue(4);

						private char[] ip34051FuncCd = Field.fillLowValue(4);

						private char[] ip34051TipacliSwitch = Field.fillLowValue(1);

						private char[] ip34051TipasvcSwitch = Field.fillLowValue(1);

						private char[] ip34051CallFromIp545110 = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip34051MqProcessParameters
	**/
    public Ip34051MqProcessParameters() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip34051ProcessSwitch
	 *	@return ip34051ProcessSwitch
	 */
   public char[] getIp34051ProcessSwitch() throws CFException{
     if (isIp34051ProcessSwitchModified()) { 
        ip34051ProcessSwitch = refreshIp34051ProcessSwitch();
     }
   		return ip34051ProcessSwitch;
   }

  
	/**
	*  set variable ip34051ProcessSwitch
	*  Corresponding COBOL Variable is IP34051-PROCESS-SWITCH
	*  @param value
	**/
   public void setIp34051ProcessSwitch(char[] value) {
      ip34051ProcessSwitch = checkIp34051ProcessSwitchConstraints(value);
      serializeIp34051ProcessSwitch(ip34051ProcessSwitch);
   } 

     /**
	 * 	Update Ip34051ProcessSwitch 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34051ProcessSwitch(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp34051ProcessSwitch,ip34051ProcessSwitch.length);
   	
   }
   
   public void setIp34051ProcessSwitch(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp34051ProcessSwitch,ip34051ProcessSwitch.length);
   	
   }
   
     /**
	 * 	Update Ip34051ProcessSwitch 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34051ProcessSwitch(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34051ProcessSwitch+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip34051ProcessSwitch with another Field
	 *	@param value
	 */
   public void setIp34051ProcessSwitch(Field source) {
       replace(source,0,source.length(),beginIp34051ProcessSwitch,IP_34051_PROCESS_SWITCH_LEN);
   	
   }  
   
     /**
	 * 	Update Ip34051ProcessSwitch 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34051ProcessSwitch(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp34051ProcessSwitch,IP_34051_PROCESS_SWITCH_LEN);
   	
   }
   
     /**
	 * 	Update Ip34051ProcessSwitch 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34051ProcessSwitch(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34051ProcessSwitch+targetIndex,targetLen);
    
   }
	char[] ip34051RequestStart8888Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isIp34051RequestStart88()
	 *	@return  Returns true if isIp34051RequestStart88() is "S"
	 */
   public boolean isIp34051RequestStart88() throws CFException {
      return (  compareChars( getIp34051ProcessSwitch() , ip34051RequestStart8888Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setIp34051RequestStart88True() {  			
    	setIp34051ProcessSwitch( ip34051RequestStart8888Value);
   	}
	char[] ip34051RequestEnd8888Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isIp34051RequestEnd88()
	 *	@return  Returns true if isIp34051RequestEnd88() is "E"
	 */
   public boolean isIp34051RequestEnd88() throws CFException {
      return (  compareChars( getIp34051ProcessSwitch() , ip34051RequestEnd8888Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setIp34051RequestEnd88True() {  			
    	setIp34051ProcessSwitch( ip34051RequestEnd8888Value);
   	}
	char[] ip34051RequestDiscnct8888Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isIp34051RequestDiscnct88()
	 *	@return  Returns true if isIp34051RequestDiscnct88() is "D"
	 */
   public boolean isIp34051RequestDiscnct88() throws CFException {
      return (  compareChars( getIp34051ProcessSwitch() , ip34051RequestDiscnct8888Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setIp34051RequestDiscnct88True() {  			
    	setIp34051ProcessSwitch( ip34051RequestDiscnct8888Value);
   	}
	/**
	 *	Returns the value of ip34051QueueType
	 *	@return ip34051QueueType
	 */
   public char[] getIp34051QueueType() throws CFException{
     if (isIp34051QueueTypeModified()) { 
        ip34051QueueType = refreshIp34051QueueType();
     }
   		return ip34051QueueType;
   }

  
	/**
	*  set variable ip34051QueueType
	*  Corresponding COBOL Variable is IP34051-QUEUE-TYPE
	*  @param value
	**/
   public void setIp34051QueueType(char[] value) {
      ip34051QueueType = checkIp34051QueueTypeConstraints(value);
      serializeIp34051QueueType(ip34051QueueType);
   } 

     /**
	 * 	Update Ip34051QueueType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34051QueueType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp34051QueueType,ip34051QueueType.length);
   	
   }
   
   public void setIp34051QueueType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp34051QueueType,ip34051QueueType.length);
   	
   }
   
     /**
	 * 	Update Ip34051QueueType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34051QueueType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34051QueueType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip34051QueueType with another Field
	 *	@param value
	 */
   public void setIp34051QueueType(Field source) {
       replace(source,0,source.length(),beginIp34051QueueType,IP_34051_QUEUE_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip34051QueueType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34051QueueType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp34051QueueType,IP_34051_QUEUE_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ip34051QueueType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34051QueueType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34051QueueType+targetIndex,targetLen);
    
   }
	char[] ip34051RequestQ8888Value = "Q".toCharArray();
	/**
	 *	Test condition "Q" for isIp34051RequestQ88()
	 *	@return  Returns true if isIp34051RequestQ88() is "Q"
	 */
   public boolean isIp34051RequestQ88() throws CFException {
      return (  compareChars( getIp34051QueueType() , ip34051RequestQ8888Value)  == 0  );
   }


	/**
	*  set values "Q"
	*/
   	public void setIp34051RequestQ88True() {  			
    	setIp34051QueueType( ip34051RequestQ8888Value);
   	}
	char[] ip34051RespnseQ8888Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isIp34051RespnseQ88()
	 *	@return  Returns true if isIp34051RespnseQ88() is "S"
	 */
   public boolean isIp34051RespnseQ88() throws CFException {
      return (  compareChars( getIp34051QueueType() , ip34051RespnseQ8888Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setIp34051RespnseQ88True() {  			
    	setIp34051QueueType( ip34051RespnseQ8888Value);
   	}
	char[] ip34051ReqResQ8888Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isIp34051ReqResQ88()
	 *	@return  Returns true if isIp34051ReqResQ88() is "B"
	 */
   public boolean isIp34051ReqResQ88() throws CFException {
      return (  compareChars( getIp34051QueueType() , ip34051ReqResQ8888Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setIp34051ReqResQ88True() {  			
    	setIp34051QueueType( ip34051ReqResQ8888Value);
   	}
	/**
	 *	Returns the value of ip34051ServCd
	 *	@return ip34051ServCd
	 */
   public char[] getIp34051ServCd() throws CFException{
     if (isIp34051ServCdModified()) { 
        ip34051ServCd = refreshIp34051ServCd();
     }
   		return ip34051ServCd;
   }

  
	/**
	*  set variable ip34051ServCd
	*  Corresponding COBOL Variable is IP34051-SERV-CD
	*  @param value
	**/
   public void setIp34051ServCd(char[] value) {
      ip34051ServCd = checkIp34051ServCdConstraints(value);
      serializeIp34051ServCd(ip34051ServCd);
   } 

     /**
	 * 	Update Ip34051ServCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34051ServCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp34051ServCd,ip34051ServCd.length);
   	
   }
   
   public void setIp34051ServCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp34051ServCd,ip34051ServCd.length);
   	
   }
   
     /**
	 * 	Update Ip34051ServCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34051ServCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34051ServCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip34051ServCd with another Field
	 *	@param value
	 */
   public void setIp34051ServCd(Field source) {
       replace(source,0,source.length(),beginIp34051ServCd,IP_34051_SERV_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip34051ServCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34051ServCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp34051ServCd,IP_34051_SERV_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip34051ServCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34051ServCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34051ServCd+targetIndex,targetLen);
    
   }
	char[] ip34051ServCdPmaToIdn8888Value = "0001".toCharArray();
	/**
	 *	Test condition "0001" for isIp34051ServCdPmaToIdn88()
	 *	@return  Returns true if isIp34051ServCdPmaToIdn88() is "0001"
	 */
   public boolean isIp34051ServCdPmaToIdn88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdPmaToIdn8888Value)  == 0  );
   }


	/**
	*  set values "0001"
	*/
   	public void setIp34051ServCdPmaToIdn88True() {  			
    	setIp34051ServCd( ip34051ServCdPmaToIdn8888Value);
   	}
	char[] ip34051ServCdPmtToIdn8888Value = "0002".toCharArray();
	/**
	 *	Test condition "0002" for isIp34051ServCdPmtToIdn88()
	 *	@return  Returns true if isIp34051ServCdPmtToIdn88() is "0002"
	 */
   public boolean isIp34051ServCdPmtToIdn88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdPmtToIdn8888Value)  == 0  );
   }


	/**
	*  set values "0002"
	*/
   	public void setIp34051ServCdPmtToIdn88True() {  			
    	setIp34051ServCd( ip34051ServCdPmtToIdn8888Value);
   	}
	char[] ip34051ServCdPimToIdn8888Value = "0003".toCharArray();
	/**
	 *	Test condition "0003" for isIp34051ServCdPimToIdn88()
	 *	@return  Returns true if isIp34051ServCdPimToIdn88() is "0003"
	 */
   public boolean isIp34051ServCdPimToIdn88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdPimToIdn8888Value)  == 0  );
   }


	/**
	*  set values "0003"
	*/
   	public void setIp34051ServCdPimToIdn88True() {  			
    	setIp34051ServCd( ip34051ServCdPimToIdn8888Value);
   	}
	char[] ip34051ServCdCem8888Value = "0004".toCharArray();
	/**
	 *	Test condition "0004" for isIp34051ServCdCem88()
	 *	@return  Returns true if isIp34051ServCdCem88() is "0004"
	 */
   public boolean isIp34051ServCdCem88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdCem8888Value)  == 0  );
   }


	/**
	*  set values "0004"
	*/
   	public void setIp34051ServCdCem88True() {  			
    	setIp34051ServCd( ip34051ServCdCem8888Value);
   	}
	char[] ip34051ServCdFns8888Value = "0005".toCharArray();
	/**
	 *	Test condition "0005" for isIp34051ServCdFns88()
	 *	@return  Returns true if isIp34051ServCdFns88() is "0005"
	 */
   public boolean isIp34051ServCdFns88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdFns8888Value)  == 0  );
   }


	/**
	*  set values "0005"
	*/
   	public void setIp34051ServCdFns88True() {  			
    	setIp34051ServCd( ip34051ServCdFns8888Value);
   	}
	char[] ip34051ServCdCemToAuth8888Value = "0006".toCharArray();
	/**
	 *	Test condition "0006" for isIp34051ServCdCemToAuth88()
	 *	@return  Returns true if isIp34051ServCdCemToAuth88() is "0006"
	 */
   public boolean isIp34051ServCdCemToAuth88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdCemToAuth8888Value)  == 0  );
   }


	/**
	*  set values "0006"
	*/
   	public void setIp34051ServCdCemToAuth88True() {  			
    	setIp34051ServCd( ip34051ServCdCemToAuth8888Value);
   	}
	char[] ip34051ServCdFra8888Value = "0007".toCharArray();
	/**
	 *	Test condition "0007" for isIp34051ServCdFra88()
	 *	@return  Returns true if isIp34051ServCdFra88() is "0007"
	 */
   public boolean isIp34051ServCdFra88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdFra8888Value)  == 0  );
   }


	/**
	*  set values "0007"
	*/
   	public void setIp34051ServCdFra88True() {  			
    	setIp34051ServCd( ip34051ServCdFra8888Value);
   	}
	char[] ip34051ServCdCemToNspk8888Value = "0008".toCharArray();
	/**
	 *	Test condition "0008" for isIp34051ServCdCemToNspk88()
	 *	@return  Returns true if isIp34051ServCdCemToNspk88() is "0008"
	 */
   public boolean isIp34051ServCdCemToNspk88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdCemToNspk8888Value)  == 0  );
   }


	/**
	*  set values "0008"
	*/
   	public void setIp34051ServCdCemToNspk88True() {  			
    	setIp34051ServCd( ip34051ServCdCemToNspk8888Value);
   	}
	char[] ip34051ServCdFastpay8888Value = "0009".toCharArray();
	/**
	 *	Test condition "0009" for isIp34051ServCdFastpay88()
	 *	@return  Returns true if isIp34051ServCdFastpay88() is "0009"
	 */
   public boolean isIp34051ServCdFastpay88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdFastpay8888Value)  == 0  );
   }


	/**
	*  set values "0009"
	*/
   	public void setIp34051ServCdFastpay88True() {  			
    	setIp34051ServCd( ip34051ServCdFastpay8888Value);
   	}
	char[] ip34051ServCdInstall8888Value = "0010".toCharArray();
	/**
	 *	Test condition "0010" for isIp34051ServCdInstall88()
	 *	@return  Returns true if isIp34051ServCdInstall88() is "0010"
	 */
   public boolean isIp34051ServCdInstall88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdInstall8888Value)  == 0  );
   }


	/**
	*  set values "0010"
	*/
   	public void setIp34051ServCdInstall88True() {  			
    	setIp34051ServCd( ip34051ServCdInstall8888Value);
   	}
	char[] ip34051ServCdRefdQr8888Value = "0011".toCharArray();
	/**
	 *	Test condition "0011" for isIp34051ServCdRefdQr88()
	 *	@return  Returns true if isIp34051ServCdRefdQr88() is "0011"
	 */
   public boolean isIp34051ServCdRefdQr88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdRefdQr8888Value)  == 0  );
   }


	/**
	*  set values "0011"
	*/
   	public void setIp34051ServCdRefdQr88True() {  			
    	setIp34051ServCd( ip34051ServCdRefdQr8888Value);
   	}
	char[] ip34051ServCdMpAch8888Value = "0012".toCharArray();
	/**
	 *	Test condition "0012" for isIp34051ServCdMpAch88()
	 *	@return  Returns true if isIp34051ServCdMpAch88() is "0012"
	 */
   public boolean isIp34051ServCdMpAch88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdMpAch8888Value)  == 0  );
   }


	/**
	*  set values "0012"
	*/
   	public void setIp34051ServCdMpAch88True() {  			
    	setIp34051ServCd( ip34051ServCdMpAch8888Value);
   	}
	char[] ip34051ServCdPmaToRus8888Value = "0013".toCharArray();
	/**
	 *	Test condition "0013" for isIp34051ServCdPmaToRus88()
	 *	@return  Returns true if isIp34051ServCdPmaToRus88() is "0013"
	 */
   public boolean isIp34051ServCdPmaToRus88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdPmaToRus8888Value)  == 0  );
   }


	/**
	*  set values "0013"
	*/
   	public void setIp34051ServCdPmaToRus88True() {  			
    	setIp34051ServCd( ip34051ServCdPmaToRus8888Value);
   	}
	char[] ip34051ServCdPimToRus8888Value = "0014".toCharArray();
	/**
	 *	Test condition "0014" for isIp34051ServCdPimToRus88()
	 *	@return  Returns true if isIp34051ServCdPimToRus88() is "0014"
	 */
   public boolean isIp34051ServCdPimToRus88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdPimToRus8888Value)  == 0  );
   }


	/**
	*  set values "0014"
	*/
   	public void setIp34051ServCdPimToRus88True() {  			
    	setIp34051ServCd( ip34051ServCdPimToRus8888Value);
   	}
	char[] ip34051ServCdPmiToIdn8888Value = "0015".toCharArray();
	/**
	 *	Test condition "0015" for isIp34051ServCdPmiToIdn88()
	 *	@return  Returns true if isIp34051ServCdPmiToIdn88() is "0015"
	 */
   public boolean isIp34051ServCdPmiToIdn88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdPmiToIdn8888Value)  == 0  );
   }


	/**
	*  set values "0015"
	*/
   	public void setIp34051ServCdPmiToIdn88True() {  			
    	setIp34051ServCd( ip34051ServCdPmiToIdn8888Value);
   	}
	char[] ip34051ServCdPmiToRus8888Value = "0016".toCharArray();
	/**
	 *	Test condition "0016" for isIp34051ServCdPmiToRus88()
	 *	@return  Returns true if isIp34051ServCdPmiToRus88() is "0016"
	 */
   public boolean isIp34051ServCdPmiToRus88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdPmiToRus8888Value)  == 0  );
   }


	/**
	*  set values "0016"
	*/
   	public void setIp34051ServCdPmiToRus88True() {  			
    	setIp34051ServCd( ip34051ServCdPmiToRus8888Value);
   	}
	char[] ip34051ServCdPmaAms8888Value = "0017".toCharArray();
	/**
	 *	Test condition "0017" for isIp34051ServCdPmaAms88()
	 *	@return  Returns true if isIp34051ServCdPmaAms88() is "0017"
	 */
   public boolean isIp34051ServCdPmaAms88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdPmaAms8888Value)  == 0  );
   }


	/**
	*  set values "0017"
	*/
   	public void setIp34051ServCdPmaAms88True() {  			
    	setIp34051ServCd( ip34051ServCdPmaAms8888Value);
   	}
	char[] ip34051ServCdPmiAms8888Value = "0018".toCharArray();
	/**
	 *	Test condition "0018" for isIp34051ServCdPmiAms88()
	 *	@return  Returns true if isIp34051ServCdPmiAms88() is "0018"
	 */
   public boolean isIp34051ServCdPmiAms88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdPmiAms8888Value)  == 0  );
   }


	/**
	*  set values "0018"
	*/
   	public void setIp34051ServCdPmiAms88True() {  			
    	setIp34051ServCd( ip34051ServCdPmiAms8888Value);
   	}
	char[] ip34051ServCdPimAms8888Value = "0019".toCharArray();
	/**
	 *	Test condition "0019" for isIp34051ServCdPimAms88()
	 *	@return  Returns true if isIp34051ServCdPimAms88() is "0019"
	 */
   public boolean isIp34051ServCdPimAms88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdPimAms8888Value)  == 0  );
   }


	/**
	*  set values "0019"
	*/
   	public void setIp34051ServCdPimAms88True() {  			
    	setIp34051ServCd( ip34051ServCdPimAms8888Value);
   	}
	char[] ip34051ServCdPmtToRus8888Value = "0020".toCharArray();
	/**
	 *	Test condition "0020" for isIp34051ServCdPmtToRus88()
	 *	@return  Returns true if isIp34051ServCdPmtToRus88() is "0020"
	 */
   public boolean isIp34051ServCdPmtToRus88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdPmtToRus8888Value)  == 0  );
   }


	/**
	*  set values "0020"
	*/
   	public void setIp34051ServCdPmtToRus88True() {  			
    	setIp34051ServCd( ip34051ServCdPmtToRus8888Value);
   	}
	char[] ip34051ServCdPmtToInd8888Value = "0021".toCharArray();
	/**
	 *	Test condition "0021" for isIp34051ServCdPmtToInd88()
	 *	@return  Returns true if isIp34051ServCdPmtToInd88() is "0021"
	 */
   public boolean isIp34051ServCdPmtToInd88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdPmtToInd8888Value)  == 0  );
   }


	/**
	*  set values "0021"
	*/
   	public void setIp34051ServCdPmtToInd88True() {  			
    	setIp34051ServCd( ip34051ServCdPmtToInd8888Value);
   	}
	char[] ip34051ServCdPmaToInd8888Value = "0022".toCharArray();
	/**
	 *	Test condition "0022" for isIp34051ServCdPmaToInd88()
	 *	@return  Returns true if isIp34051ServCdPmaToInd88() is "0022"
	 */
   public boolean isIp34051ServCdPmaToInd88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdPmaToInd8888Value)  == 0  );
   }


	/**
	*  set values "0022"
	*/
   	public void setIp34051ServCdPmaToInd88True() {  			
    	setIp34051ServCd( ip34051ServCdPmaToInd8888Value);
   	}
	char[] ip34051ServCdPimToInd8888Value = "0023".toCharArray();
	/**
	 *	Test condition "0023" for isIp34051ServCdPimToInd88()
	 *	@return  Returns true if isIp34051ServCdPimToInd88() is "0023"
	 */
   public boolean isIp34051ServCdPimToInd88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdPimToInd8888Value)  == 0  );
   }


	/**
	*  set values "0023"
	*/
   	public void setIp34051ServCdPimToInd88True() {  			
    	setIp34051ServCd( ip34051ServCdPimToInd8888Value);
   	}
	char[] ip34051ServCdPmiToInd8888Value = "0024".toCharArray();
	/**
	 *	Test condition "0024" for isIp34051ServCdPmiToInd88()
	 *	@return  Returns true if isIp34051ServCdPmiToInd88() is "0024"
	 */
   public boolean isIp34051ServCdPmiToInd88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdPmiToInd8888Value)  == 0  );
   }


	/**
	*  set values "0024"
	*/
   	public void setIp34051ServCdPmiToInd88True() {  			
    	setIp34051ServCd( ip34051ServCdPmiToInd8888Value);
   	}
	char[] ip34051ServCdAlm8888Value = "0025".toCharArray();
	/**
	 *	Test condition "0025" for isIp34051ServCdAlm88()
	 *	@return  Returns true if isIp34051ServCdAlm88() is "0025"
	 */
   public boolean isIp34051ServCdAlm88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdAlm8888Value)  == 0  );
   }


	/**
	*  set values "0025"
	*/
   	public void setIp34051ServCdAlm88True() {  			
    	setIp34051ServCd( ip34051ServCdAlm8888Value);
   	}
	char[] ip34051ServCdPmtmap8888Value = "0002".toCharArray();
	/**
	 *	Test condition "0002" for isIp34051ServCdPmtmap88()
	 *	@return  Returns true if isIp34051ServCdPmtmap88() is "0002"
	 */
   public boolean isIp34051ServCdPmtmap88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdPmtmap8888Value)  == 0  );
   }


	/**
	*  set values "0002"
	*/
   	public void setIp34051ServCdPmtmap88True() {  			
    	setIp34051ServCd( ip34051ServCdPmtmap8888Value);
   	}
	char[] ip34051ServCdPimmap8888Value = "0003".toCharArray();
	/**
	 *	Test condition "0003" for isIp34051ServCdPimmap88()
	 *	@return  Returns true if isIp34051ServCdPimmap88() is "0003"
	 */
   public boolean isIp34051ServCdPimmap88() throws CFException {
      return (  compareChars( getIp34051ServCd() , ip34051ServCdPimmap8888Value)  == 0  );
   }


	/**
	*  set values "0003"
	*/
   	public void setIp34051ServCdPimmap88True() {  			
    	setIp34051ServCd( ip34051ServCdPimmap8888Value);
   	}
	/**
	 *	Returns the value of ip34051FuncCd
	 *	@return ip34051FuncCd
	 */
   public char[] getIp34051FuncCd() throws CFException{
     if (isIp34051FuncCdModified()) { 
        ip34051FuncCd = refreshIp34051FuncCd();
     }
   		return ip34051FuncCd;
   }

  
	/**
	*  set variable ip34051FuncCd
	*  Corresponding COBOL Variable is IP34051-FUNC-CD
	*  @param value
	**/
   public void setIp34051FuncCd(char[] value) {
      ip34051FuncCd = checkIp34051FuncCdConstraints(value);
      serializeIp34051FuncCd(ip34051FuncCd);
   } 

     /**
	 * 	Update Ip34051FuncCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34051FuncCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp34051FuncCd,ip34051FuncCd.length);
   	
   }
   
   public void setIp34051FuncCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp34051FuncCd,ip34051FuncCd.length);
   	
   }
   
     /**
	 * 	Update Ip34051FuncCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34051FuncCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34051FuncCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip34051FuncCd with another Field
	 *	@param value
	 */
   public void setIp34051FuncCd(Field source) {
       replace(source,0,source.length(),beginIp34051FuncCd,IP_34051_FUNC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip34051FuncCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34051FuncCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp34051FuncCd,IP_34051_FUNC_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip34051FuncCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34051FuncCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34051FuncCd+targetIndex,targetLen);
    
   }
	char[] ip34051FuncCdGeneral8888Value = "0000".toCharArray();
	/**
	 *	Test condition "0000" for isIp34051FuncCdGeneral88()
	 *	@return  Returns true if isIp34051FuncCdGeneral88() is "0000"
	 */
   public boolean isIp34051FuncCdGeneral88() throws CFException {
      return (  compareChars( getIp34051FuncCd() , ip34051FuncCdGeneral8888Value)  == 0  );
   }


	/**
	*  set values "0000"
	*/
   	public void setIp34051FuncCdGeneral88True() {  			
    	setIp34051FuncCd( ip34051FuncCdGeneral8888Value);
   	}
	char[] ip34051FuncCdPre8888Value = "0001".toCharArray();
	/**
	 *	Test condition "0001" for isIp34051FuncCdPre88()
	 *	@return  Returns true if isIp34051FuncCdPre88() is "0001"
	 */
   public boolean isIp34051FuncCdPre88() throws CFException {
      return (  compareChars( getIp34051FuncCd() , ip34051FuncCdPre8888Value)  == 0  );
   }


	/**
	*  set values "0001"
	*/
   	public void setIp34051FuncCdPre88True() {  			
    	setIp34051FuncCd( ip34051FuncCdPre8888Value);
   	}
	char[] ip34051FuncCdCha8888Value = "0002".toCharArray();
	/**
	 *	Test condition "0002" for isIp34051FuncCdCha88()
	 *	@return  Returns true if isIp34051FuncCdCha88() is "0002"
	 */
   public boolean isIp34051FuncCdCha88() throws CFException {
      return (  compareChars( getIp34051FuncCd() , ip34051FuncCdCha8888Value)  == 0  );
   }


	/**
	*  set values "0002"
	*/
   	public void setIp34051FuncCdCha88True() {  			
    	setIp34051FuncCd( ip34051FuncCdCha8888Value);
   	}
	char[] ip34051FuncCdCemReq8888Value = "0003".toCharArray();
	/**
	 *	Test condition "0003" for isIp34051FuncCdCemReq88()
	 *	@return  Returns true if isIp34051FuncCdCemReq88() is "0003"
	 */
   public boolean isIp34051FuncCdCemReq88() throws CFException {
      return (  compareChars( getIp34051FuncCd() , ip34051FuncCdCemReq8888Value)  == 0  );
   }


	/**
	*  set values "0003"
	*/
   	public void setIp34051FuncCdCemReq88True() {  			
    	setIp34051FuncCd( ip34051FuncCdCemReq8888Value);
   	}
	char[] ip34051FuncCdCemRes8888Value = "0004".toCharArray();
	/**
	 *	Test condition "0004" for isIp34051FuncCdCemRes88()
	 *	@return  Returns true if isIp34051FuncCdCemRes88() is "0004"
	 */
   public boolean isIp34051FuncCdCemRes88() throws CFException {
      return (  compareChars( getIp34051FuncCd() , ip34051FuncCdCemRes8888Value)  == 0  );
   }


	/**
	*  set values "0004"
	*/
   	public void setIp34051FuncCdCemRes88True() {  			
    	setIp34051FuncCd( ip34051FuncCdCemRes8888Value);
   	}
	/**
	 *	Returns the value of ip34051TipacliSwitch
	 *	@return ip34051TipacliSwitch
	 */
   public char[] getIp34051TipacliSwitch() throws CFException{
     if (isIp34051TipacliSwitchModified()) { 
        ip34051TipacliSwitch = refreshIp34051TipacliSwitch();
     }
   		return ip34051TipacliSwitch;
   }

  
	/**
	*  set variable ip34051TipacliSwitch
	*  Corresponding COBOL Variable is IP34051-TIPACLI-SWITCH
	*  @param value
	**/
   public void setIp34051TipacliSwitch(char[] value) {
      ip34051TipacliSwitch = checkIp34051TipacliSwitchConstraints(value);
      serializeIp34051TipacliSwitch(ip34051TipacliSwitch);
   } 

     /**
	 * 	Update Ip34051TipacliSwitch 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34051TipacliSwitch(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp34051TipacliSwitch,ip34051TipacliSwitch.length);
   	
   }
   
   public void setIp34051TipacliSwitch(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp34051TipacliSwitch,ip34051TipacliSwitch.length);
   	
   }
   
     /**
	 * 	Update Ip34051TipacliSwitch 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34051TipacliSwitch(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34051TipacliSwitch+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip34051TipacliSwitch with another Field
	 *	@param value
	 */
   public void setIp34051TipacliSwitch(Field source) {
       replace(source,0,source.length(),beginIp34051TipacliSwitch,IP_34051_TIPACLI_SWITCH_LEN);
   	
   }  
   
     /**
	 * 	Update Ip34051TipacliSwitch 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34051TipacliSwitch(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp34051TipacliSwitch,IP_34051_TIPACLI_SWITCH_LEN);
   	
   }
   
     /**
	 * 	Update Ip34051TipacliSwitch 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34051TipacliSwitch(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34051TipacliSwitch+targetIndex,targetLen);
    
   }
	char[] ip34051TipacliActiveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp34051TipacliActiveY88()
	 *	@return  Returns true if isIp34051TipacliActiveY88() is "Y"
	 */
   public boolean isIp34051TipacliActiveY88() throws CFException {
      return (  compareChars( getIp34051TipacliSwitch() , ip34051TipacliActiveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp34051TipacliActiveY88True() {  			
    	setIp34051TipacliSwitch( ip34051TipacliActiveY8888Value);
   	}
	char[] ip34051TipacliActiveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp34051TipacliActiveN88()
	 *	@return  Returns true if isIp34051TipacliActiveN88() is "N"
	 */
   public boolean isIp34051TipacliActiveN88() throws CFException {
      return (  compareChars( getIp34051TipacliSwitch() , ip34051TipacliActiveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp34051TipacliActiveN88True() {  			
    	setIp34051TipacliSwitch( ip34051TipacliActiveN8888Value);
   	}
	/**
	 *	Returns the value of ip34051TipasvcSwitch
	 *	@return ip34051TipasvcSwitch
	 */
   public char[] getIp34051TipasvcSwitch() throws CFException{
     if (isIp34051TipasvcSwitchModified()) { 
        ip34051TipasvcSwitch = refreshIp34051TipasvcSwitch();
     }
   		return ip34051TipasvcSwitch;
   }

  
	/**
	*  set variable ip34051TipasvcSwitch
	*  Corresponding COBOL Variable is IP34051-TIPASVC-SWITCH
	*  @param value
	**/
   public void setIp34051TipasvcSwitch(char[] value) {
      ip34051TipasvcSwitch = checkIp34051TipasvcSwitchConstraints(value);
      serializeIp34051TipasvcSwitch(ip34051TipasvcSwitch);
   } 

     /**
	 * 	Update Ip34051TipasvcSwitch 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34051TipasvcSwitch(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp34051TipasvcSwitch,ip34051TipasvcSwitch.length);
   	
   }
   
   public void setIp34051TipasvcSwitch(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp34051TipasvcSwitch,ip34051TipasvcSwitch.length);
   	
   }
   
     /**
	 * 	Update Ip34051TipasvcSwitch 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34051TipasvcSwitch(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34051TipasvcSwitch+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip34051TipasvcSwitch with another Field
	 *	@param value
	 */
   public void setIp34051TipasvcSwitch(Field source) {
       replace(source,0,source.length(),beginIp34051TipasvcSwitch,IP_34051_TIPASVC_SWITCH_LEN);
   	
   }  
   
     /**
	 * 	Update Ip34051TipasvcSwitch 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34051TipasvcSwitch(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp34051TipasvcSwitch,IP_34051_TIPASVC_SWITCH_LEN);
   	
   }
   
     /**
	 * 	Update Ip34051TipasvcSwitch 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34051TipasvcSwitch(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34051TipasvcSwitch+targetIndex,targetLen);
    
   }
	char[] ip34051TipasvcActiveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp34051TipasvcActiveY88()
	 *	@return  Returns true if isIp34051TipasvcActiveY88() is "Y"
	 */
   public boolean isIp34051TipasvcActiveY88() throws CFException {
      return (  compareChars( getIp34051TipasvcSwitch() , ip34051TipasvcActiveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp34051TipasvcActiveY88True() {  			
    	setIp34051TipasvcSwitch( ip34051TipasvcActiveY8888Value);
   	}
	char[] ip34051TipasvcActiveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp34051TipasvcActiveN88()
	 *	@return  Returns true if isIp34051TipasvcActiveN88() is "N"
	 */
   public boolean isIp34051TipasvcActiveN88() throws CFException {
      return (  compareChars( getIp34051TipasvcSwitch() , ip34051TipasvcActiveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp34051TipasvcActiveN88True() {  			
    	setIp34051TipasvcSwitch( ip34051TipasvcActiveN8888Value);
   	}
	/**
	 *	Returns the value of ip34051CallFromIp545110
	 *	@return ip34051CallFromIp545110
	 */
   public char[] getIp34051CallFromIp545110() throws CFException{
     if (isIp34051CallFromIp545110Modified()) { 
        ip34051CallFromIp545110 = refreshIp34051CallFromIp545110();
     }
   		return ip34051CallFromIp545110;
   }

  
	/**
	*  set variable ip34051CallFromIp545110
	*  Corresponding COBOL Variable is IP34051-CALL-FROM-IP545110
	*  @param value
	**/
   public void setIp34051CallFromIp545110(char[] value) {
      ip34051CallFromIp545110 = checkIp34051CallFromIp545110Constraints(value);
      serializeIp34051CallFromIp545110(ip34051CallFromIp545110);
   } 

     /**
	 * 	Update Ip34051CallFromIp545110 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34051CallFromIp545110(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp34051CallFromIp545110,ip34051CallFromIp545110.length);
   	
   }
   
   public void setIp34051CallFromIp545110(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp34051CallFromIp545110,ip34051CallFromIp545110.length);
   	
   }
   
     /**
	 * 	Update Ip34051CallFromIp545110 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34051CallFromIp545110(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34051CallFromIp545110+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip34051CallFromIp545110 with another Field
	 *	@param value
	 */
   public void setIp34051CallFromIp545110(Field source) {
       replace(source,0,source.length(),beginIp34051CallFromIp545110,IP_34051_CALL_FROM_IP_545110_LEN);
   	
   }  
   
     /**
	 * 	Update Ip34051CallFromIp545110 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34051CallFromIp545110(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp34051CallFromIp545110,IP_34051_CALL_FROM_IP_545110_LEN);
   	
   }
   
     /**
	 * 	Update Ip34051CallFromIp545110 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34051CallFromIp545110(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34051CallFromIp545110+targetIndex,targetLen);
    
   }
	char[] ip34051Ip545110Y8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp34051Ip545110Y88()
	 *	@return  Returns true if isIp34051Ip545110Y88() is "Y"
	 */
   public boolean isIp34051Ip545110Y88() throws CFException {
      return (  compareChars( getIp34051CallFromIp545110() , ip34051Ip545110Y8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp34051Ip545110Y88True() {  			
    	setIp34051CallFromIp545110( ip34051Ip545110Y8888Value);
   	}
	char[] ip34051Ip545110N8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp34051Ip545110N88()
	 *	@return  Returns true if isIp34051Ip545110N88() is "N"
	 */
   public boolean isIp34051Ip545110N88() throws CFException {
      return (  compareChars( getIp34051CallFromIp545110() , ip34051Ip545110N8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp34051Ip545110N88True() {  			
    	setIp34051CallFromIp545110( ip34051Ip545110N8888Value);
   	}

	
	
	
	/**
	 * 	initializes Ip34051MqProcessParameters
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp34051ProcessSwitch(CONSTANTS.SPACE);
         setIp34051QueueType(CONSTANTS.SPACE);
         setIp34051ServCd(CONSTANTS.SPACE_4);
         setIp34051FuncCd(CONSTANTS.SPACE_4);
         setIp34051TipacliSwitch(CONSTANTS.SPACE);
         setIp34051TipasvcSwitch(CONSTANTS.SPACE);
         setIp34051CallFromIp545110(CONSTANTS.SPACE);
   }

		public static int getIp34051MqProcessParametersFieldLength() {
			return IP_34051_MQ_PROCESS_PARAMETERS_LENGTH;
		}

}
  
