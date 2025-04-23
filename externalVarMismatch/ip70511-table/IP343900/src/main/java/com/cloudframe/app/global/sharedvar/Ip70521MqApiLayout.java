package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70521MqApiLayout is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip70521MqApiLayout")

public class Ip70521MqApiLayout extends Ip70521MqApiLayoutSerialized  implements InitializingBean {
   

						private char[] ip70521RequestCd = Field.fillLowValue(4);

						private char[] ip70521MqBypassSw = Field.fillLowValue(1);

						private char[] ip70521MqReturnSw = Field.fillLowValue(1);

						private char[] ip70521MqTimestamp = Field.fillLowValue(26);

						private char[] ip70521QmgrName = Field.fillLowValue(48);

						private char[] ip70521QName = Field.fillLowValue(48);

						private char[] ip70521TargetQmgrName = Field.fillLowValue(48);

						private char[] ip70521TargetQName = Field.fillLowValue(48);

								private int ip70521Hconn;

								private int ip70521Hobj;

								private int ip70521CompCd;

								private int ip70521ResnCd;

								private int ip70521Options;

								private int ip70521DataLength;

								private int ip70521MsgBufferLen;

						private char[] ip70521MsgBuffer = Field.fillLowValue(4000000);
				private Ip70521ProcDelay ip70521ProcDelay = new Ip70521ProcDelay();
	
	/**
	* Constructor for Ip70521MqApiLayout
	**/
    public Ip70521MqApiLayout() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip70521ProcDelay.setParent(this,getStartOffset() + 4000252);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip70521RequestCd
	 *	@return ip70521RequestCd
	 */
   public char[] getIp70521RequestCd() throws CFException{
     if (isIp70521RequestCdModified()) { 
        ip70521RequestCd = refreshIp70521RequestCd();
     }
   		return ip70521RequestCd;
   }

  
	/**
	*  set variable ip70521RequestCd
	*  Corresponding COBOL Variable is IP70521-REQUEST-CD
	*  @param value
	**/
   public void setIp70521RequestCd(char[] value) {
      ip70521RequestCd = checkIp70521RequestCdConstraints(value);
      serializeIp70521RequestCd(ip70521RequestCd);
   } 

     /**
	 * 	Update Ip70521RequestCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521RequestCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70521RequestCd,ip70521RequestCd.length);
   	
   }
   
   public void setIp70521RequestCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521RequestCd,ip70521RequestCd.length);
   	
   }
   
     /**
	 * 	Update Ip70521RequestCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521RequestCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521RequestCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70521RequestCd with another Field
	 *	@param value
	 */
   public void setIp70521RequestCd(Field source) {
       replace(source,0,source.length(),beginIp70521RequestCd,IP_70521_REQUEST_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70521RequestCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521RequestCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70521RequestCd,IP_70521_REQUEST_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip70521RequestCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521RequestCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521RequestCd+targetIndex,targetLen);
    
   }
	char[] ip70521Connect8888Value = "CONN".toCharArray();
	/**
	 *	Test condition "CONN" for isIp70521Connect88()
	 *	@return  Returns true if isIp70521Connect88() is "CONN"
	 */
   public boolean isIp70521Connect88() throws CFException {
      return (  compareChars( getIp70521RequestCd() , ip70521Connect8888Value)  == 0  );
   }


	/**
	*  set values "CONN"
	*/
   	public void setIp70521Connect88True() {  			
    	setIp70521RequestCd( ip70521Connect8888Value);
   	}
	char[] ip70521Open8888Value = "OPEN".toCharArray();
	/**
	 *	Test condition "OPEN" for isIp70521Open88()
	 *	@return  Returns true if isIp70521Open88() is "OPEN"
	 */
   public boolean isIp70521Open88() throws CFException {
      return (  compareChars( getIp70521RequestCd() , ip70521Open8888Value)  == 0  );
   }


	/**
	*  set values "OPEN"
	*/
   	public void setIp70521Open88True() {  			
    	setIp70521RequestCd( ip70521Open8888Value);
   	}
	char[] ip70521Put8888Value = "PUT ".toCharArray();
	/**
	 *	Test condition "PUT " for isIp70521Put88()
	 *	@return  Returns true if isIp70521Put88() is "PUT "
	 */
   public boolean isIp70521Put88() throws CFException {
      return (  compareChars( getIp70521RequestCd() , ip70521Put8888Value)  == 0  );
   }


	/**
	*  set values "PUT "
	*/
   	public void setIp70521Put88True() {  			
    	setIp70521RequestCd( ip70521Put8888Value);
   	}
	char[] ip70521Get8888Value = "GET ".toCharArray();
	/**
	 *	Test condition "GET " for isIp70521Get88()
	 *	@return  Returns true if isIp70521Get88() is "GET "
	 */
   public boolean isIp70521Get88() throws CFException {
      return (  compareChars( getIp70521RequestCd() , ip70521Get8888Value)  == 0  );
   }


	/**
	*  set values "GET "
	*/
   	public void setIp70521Get88True() {  			
    	setIp70521RequestCd( ip70521Get8888Value);
   	}
	char[] ip70521Close8888Value = "CLOS".toCharArray();
	/**
	 *	Test condition "CLOS" for isIp70521Close88()
	 *	@return  Returns true if isIp70521Close88() is "CLOS"
	 */
   public boolean isIp70521Close88() throws CFException {
      return (  compareChars( getIp70521RequestCd() , ip70521Close8888Value)  == 0  );
   }


	/**
	*  set values "CLOS"
	*/
   	public void setIp70521Close88True() {  			
    	setIp70521RequestCd( ip70521Close8888Value);
   	}
	char[] ip70521Disconnect8888Value = "DISC".toCharArray();
	/**
	 *	Test condition "DISC" for isIp70521Disconnect88()
	 *	@return  Returns true if isIp70521Disconnect88() is "DISC"
	 */
   public boolean isIp70521Disconnect88() throws CFException {
      return (  compareChars( getIp70521RequestCd() , ip70521Disconnect8888Value)  == 0  );
   }


	/**
	*  set values "DISC"
	*/
   	public void setIp70521Disconnect88True() {  			
    	setIp70521RequestCd( ip70521Disconnect8888Value);
   	}
	char[] ip70521Browse8888Value = "BROW".toCharArray();
	/**
	 *	Test condition "BROW" for isIp70521Browse88()
	 *	@return  Returns true if isIp70521Browse88() is "BROW"
	 */
   public boolean isIp70521Browse88() throws CFException {
      return (  compareChars( getIp70521RequestCd() , ip70521Browse8888Value)  == 0  );
   }


	/**
	*  set values "BROW"
	*/
   	public void setIp70521Browse88True() {  			
    	setIp70521RequestCd( ip70521Browse8888Value);
   	}
	char[] ip70521Purge8888Value = "PURG".toCharArray();
	/**
	 *	Test condition "PURG" for isIp70521Purge88()
	 *	@return  Returns true if isIp70521Purge88() is "PURG"
	 */
   public boolean isIp70521Purge88() throws CFException {
      return (  compareChars( getIp70521RequestCd() , ip70521Purge8888Value)  == 0  );
   }


	/**
	*  set values "PURG"
	*/
   	public void setIp70521Purge88True() {  			
    	setIp70521RequestCd( ip70521Purge8888Value);
   	}
	/**
	 *	Returns the value of ip70521MqBypassSw
	 *	@return ip70521MqBypassSw
	 */
   public char[] getIp70521MqBypassSw() throws CFException{
     if (isIp70521MqBypassSwModified()) { 
        ip70521MqBypassSw = refreshIp70521MqBypassSw();
     }
   		return ip70521MqBypassSw;
   }

  
	/**
	*  set variable ip70521MqBypassSw
	*  Corresponding COBOL Variable is IP70521-MQ-BYPASS-SW
	*  @param value
	**/
   public void setIp70521MqBypassSw(char[] value) {
      ip70521MqBypassSw = checkIp70521MqBypassSwConstraints(value);
      serializeIp70521MqBypassSw(ip70521MqBypassSw);
   } 

     /**
	 * 	Update Ip70521MqBypassSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521MqBypassSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70521MqBypassSw,ip70521MqBypassSw.length);
   	
   }
   
   public void setIp70521MqBypassSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521MqBypassSw,ip70521MqBypassSw.length);
   	
   }
   
     /**
	 * 	Update Ip70521MqBypassSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MqBypassSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521MqBypassSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70521MqBypassSw with another Field
	 *	@param value
	 */
   public void setIp70521MqBypassSw(Field source) {
       replace(source,0,source.length(),beginIp70521MqBypassSw,IP_70521_MQ_BYPASS_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70521MqBypassSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521MqBypassSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70521MqBypassSw,IP_70521_MQ_BYPASS_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip70521MqBypassSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MqBypassSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521MqBypassSw+targetIndex,targetLen);
    
   }
	char[] ip70521MqBypassY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70521MqBypassY88()
	 *	@return  Returns true if isIp70521MqBypassY88() is "Y"
	 */
   public boolean isIp70521MqBypassY88() throws CFException {
      return (  compareChars( getIp70521MqBypassSw() , ip70521MqBypassY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70521MqBypassY88True() {  			
    	setIp70521MqBypassSw( ip70521MqBypassY8888Value);
   	}
	char[] ip70521MqBypassN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70521MqBypassN88()
	 *	@return  Returns true if isIp70521MqBypassN88() is "N"
	 */
   public boolean isIp70521MqBypassN88() throws CFException {
      return (  compareChars( getIp70521MqBypassSw() , ip70521MqBypassN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70521MqBypassN88True() {  			
    	setIp70521MqBypassSw( ip70521MqBypassN8888Value);
   	}
	/**
	 *	Returns the value of ip70521MqReturnSw
	 *	@return ip70521MqReturnSw
	 */
   public char[] getIp70521MqReturnSw() throws CFException{
     if (isIp70521MqReturnSwModified()) { 
        ip70521MqReturnSw = refreshIp70521MqReturnSw();
     }
   		return ip70521MqReturnSw;
   }

  
	/**
	*  set variable ip70521MqReturnSw
	*  Corresponding COBOL Variable is IP70521-MQ-RETURN-SW
	*  @param value
	**/
   public void setIp70521MqReturnSw(char[] value) {
      ip70521MqReturnSw = checkIp70521MqReturnSwConstraints(value);
      serializeIp70521MqReturnSw(ip70521MqReturnSw);
   } 

     /**
	 * 	Update Ip70521MqReturnSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521MqReturnSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70521MqReturnSw,ip70521MqReturnSw.length);
   	
   }
   
   public void setIp70521MqReturnSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521MqReturnSw,ip70521MqReturnSw.length);
   	
   }
   
     /**
	 * 	Update Ip70521MqReturnSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MqReturnSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521MqReturnSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70521MqReturnSw with another Field
	 *	@param value
	 */
   public void setIp70521MqReturnSw(Field source) {
       replace(source,0,source.length(),beginIp70521MqReturnSw,IP_70521_MQ_RETURN_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70521MqReturnSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521MqReturnSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70521MqReturnSw,IP_70521_MQ_RETURN_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip70521MqReturnSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MqReturnSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521MqReturnSw+targetIndex,targetLen);
    
   }
	char[] ip70521MqReturnY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70521MqReturnY88()
	 *	@return  Returns true if isIp70521MqReturnY88() is "Y"
	 */
   public boolean isIp70521MqReturnY88() throws CFException {
      return (  compareChars( getIp70521MqReturnSw() , ip70521MqReturnY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70521MqReturnY88True() {  			
    	setIp70521MqReturnSw( ip70521MqReturnY8888Value);
   	}
	char[] ip70521MqReturnN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70521MqReturnN88()
	 *	@return  Returns true if isIp70521MqReturnN88() is "N"
	 */
   public boolean isIp70521MqReturnN88() throws CFException {
      return (  compareChars( getIp70521MqReturnSw() , ip70521MqReturnN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70521MqReturnN88True() {  			
    	setIp70521MqReturnSw( ip70521MqReturnN8888Value);
   	}
	/**
	 *	Returns the value of ip70521MqTimestamp
	 *	@return ip70521MqTimestamp
	 */
   public char[] getIp70521MqTimestamp() throws CFException{
     if (isIp70521MqTimestampModified()) { 
        ip70521MqTimestamp = refreshIp70521MqTimestamp();
     }
   		return ip70521MqTimestamp;
   }

  
	/**
	*  set variable ip70521MqTimestamp
	*  Corresponding COBOL Variable is IP70521-MQ-TIMESTAMP
	*  @param value
	**/
   public void setIp70521MqTimestamp(char[] value) {
      ip70521MqTimestamp = checkIp70521MqTimestampConstraints(value);
      serializeIp70521MqTimestamp(ip70521MqTimestamp);
   } 

     /**
	 * 	Update Ip70521MqTimestamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521MqTimestamp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70521MqTimestamp,ip70521MqTimestamp.length);
   	
   }
   
   public void setIp70521MqTimestamp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521MqTimestamp,ip70521MqTimestamp.length);
   	
   }
   
     /**
	 * 	Update Ip70521MqTimestamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MqTimestamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521MqTimestamp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70521MqTimestamp with another Field
	 *	@param value
	 */
   public void setIp70521MqTimestamp(Field source) {
       replace(source,0,source.length(),beginIp70521MqTimestamp,IP_70521_MQ_TIMESTAMP_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70521MqTimestamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521MqTimestamp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70521MqTimestamp,IP_70521_MQ_TIMESTAMP_LEN);
   	
   }
   
     /**
	 * 	Update Ip70521MqTimestamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MqTimestamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521MqTimestamp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip70521QmgrName
	 *	@return ip70521QmgrName
	 */
   public char[] getIp70521QmgrName() throws CFException{
     if (isIp70521QmgrNameModified()) { 
        ip70521QmgrName = refreshIp70521QmgrName();
     }
   		return ip70521QmgrName;
   }

  
	/**
	*  set variable ip70521QmgrName
	*  Corresponding COBOL Variable is IP70521-QMGR-NAME
	*  @param value
	**/
   public void setIp70521QmgrName(char[] value) {
      ip70521QmgrName = checkIp70521QmgrNameConstraints(value);
      serializeIp70521QmgrName(ip70521QmgrName);
   } 

     /**
	 * 	Update Ip70521QmgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521QmgrName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70521QmgrName,ip70521QmgrName.length);
   	
   }
   
   public void setIp70521QmgrName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521QmgrName,ip70521QmgrName.length);
   	
   }
   
     /**
	 * 	Update Ip70521QmgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521QmgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521QmgrName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70521QmgrName with another Field
	 *	@param value
	 */
   public void setIp70521QmgrName(Field source) {
       replace(source,0,source.length(),beginIp70521QmgrName,IP_70521_QMGR_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70521QmgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521QmgrName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70521QmgrName,IP_70521_QMGR_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip70521QmgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521QmgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521QmgrName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip70521QName
	 *	@return ip70521QName
	 */
   public char[] getIp70521QName() throws CFException{
     if (isIp70521QNameModified()) { 
        ip70521QName = refreshIp70521QName();
     }
   		return ip70521QName;
   }

  
	/**
	*  set variable ip70521QName
	*  Corresponding COBOL Variable is IP70521-Q-NAME
	*  @param value
	**/
   public void setIp70521QName(char[] value) {
      ip70521QName = checkIp70521QNameConstraints(value);
      serializeIp70521QName(ip70521QName);
   } 

     /**
	 * 	Update Ip70521QName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521QName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70521QName,ip70521QName.length);
   	
   }
   
   public void setIp70521QName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521QName,ip70521QName.length);
   	
   }
   
     /**
	 * 	Update Ip70521QName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521QName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521QName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70521QName with another Field
	 *	@param value
	 */
   public void setIp70521QName(Field source) {
       replace(source,0,source.length(),beginIp70521QName,IP_70521_QNAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70521QName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521QName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70521QName,IP_70521_QNAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip70521QName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521QName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521QName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip70521TargetQmgrName
	 *	@return ip70521TargetQmgrName
	 */
   public char[] getIp70521TargetQmgrName() throws CFException{
     if (isIp70521TargetQmgrNameModified()) { 
        ip70521TargetQmgrName = refreshIp70521TargetQmgrName();
     }
   		return ip70521TargetQmgrName;
   }

  
	/**
	*  set variable ip70521TargetQmgrName
	*  Corresponding COBOL Variable is IP70521-TARGET-QMGR-NAME
	*  @param value
	**/
   public void setIp70521TargetQmgrName(char[] value) {
      ip70521TargetQmgrName = checkIp70521TargetQmgrNameConstraints(value);
      serializeIp70521TargetQmgrName(ip70521TargetQmgrName);
   } 

     /**
	 * 	Update Ip70521TargetQmgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521TargetQmgrName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70521TargetQmgrName,ip70521TargetQmgrName.length);
   	
   }
   
   public void setIp70521TargetQmgrName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521TargetQmgrName,ip70521TargetQmgrName.length);
   	
   }
   
     /**
	 * 	Update Ip70521TargetQmgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521TargetQmgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521TargetQmgrName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70521TargetQmgrName with another Field
	 *	@param value
	 */
   public void setIp70521TargetQmgrName(Field source) {
       replace(source,0,source.length(),beginIp70521TargetQmgrName,IP_70521_TARGET_QMGR_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70521TargetQmgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521TargetQmgrName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70521TargetQmgrName,IP_70521_TARGET_QMGR_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip70521TargetQmgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521TargetQmgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521TargetQmgrName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip70521TargetQName
	 *	@return ip70521TargetQName
	 */
   public char[] getIp70521TargetQName() throws CFException{
     if (isIp70521TargetQNameModified()) { 
        ip70521TargetQName = refreshIp70521TargetQName();
     }
   		return ip70521TargetQName;
   }

  
	/**
	*  set variable ip70521TargetQName
	*  Corresponding COBOL Variable is IP70521-TARGET-Q-NAME
	*  @param value
	**/
   public void setIp70521TargetQName(char[] value) {
      ip70521TargetQName = checkIp70521TargetQNameConstraints(value);
      serializeIp70521TargetQName(ip70521TargetQName);
   } 

     /**
	 * 	Update Ip70521TargetQName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521TargetQName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70521TargetQName,ip70521TargetQName.length);
   	
   }
   
   public void setIp70521TargetQName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521TargetQName,ip70521TargetQName.length);
   	
   }
   
     /**
	 * 	Update Ip70521TargetQName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521TargetQName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521TargetQName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70521TargetQName with another Field
	 *	@param value
	 */
   public void setIp70521TargetQName(Field source) {
       replace(source,0,source.length(),beginIp70521TargetQName,IP_70521_TARGET_QNAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70521TargetQName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521TargetQName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70521TargetQName,IP_70521_TARGET_QNAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip70521TargetQName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521TargetQName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521TargetQName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip70521Hconn
	 *	@return ip70521Hconn
	 */
	public int getIp70521Hconn() throws CFException {
        if (isIp70521HconnModified()) { 
           ip70521Hconn = refreshIp70521Hconn();
        }
   		return ip70521Hconn;
	}
	
	/**
	 * 	Update Ip70521Hconn with the passed value
	 *  Corresponding COBOL Variable is IP70521-HCONN
	 *	@param number
	 */
	public void setIp70521Hconn(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip70521Hconn = checkIp70521HconnMaxLimit(number); 
		serializeIp70521Hconn(ip70521Hconn);
	}


	public void setIp70521Hconn(long number) {
	    number = checkIp70521HconnMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp70521Hconn((int)number);
	}
	
	/**
	 *	Returns the value of ip70521Hobj
	 *	@return ip70521Hobj
	 */
	public int getIp70521Hobj() throws CFException {
        if (isIp70521HobjModified()) { 
           ip70521Hobj = refreshIp70521Hobj();
        }
   		return ip70521Hobj;
	}
	
	/**
	 * 	Update Ip70521Hobj with the passed value
	 *  Corresponding COBOL Variable is IP70521-HOBJ
	 *	@param number
	 */
	public void setIp70521Hobj(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip70521Hobj = checkIp70521HobjMaxLimit(number); 
		serializeIp70521Hobj(ip70521Hobj);
	}


	public void setIp70521Hobj(long number) {
	    number = checkIp70521HobjMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp70521Hobj((int)number);
	}
	
	/**
	 *	Returns the value of ip70521CompCd
	 *	@return ip70521CompCd
	 */
	public int getIp70521CompCd() throws CFException {
        if (isIp70521CompCdModified()) { 
           ip70521CompCd = refreshIp70521CompCd();
        }
   		return ip70521CompCd;
	}
	
	/**
	 * 	Update Ip70521CompCd with the passed value
	 *  Corresponding COBOL Variable is IP70521-COMP-CD
	 *	@param number
	 */
	public void setIp70521CompCd(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip70521CompCd = checkIp70521CompCdMaxLimit(number); 
		serializeIp70521CompCd(ip70521CompCd);
	}


	public void setIp70521CompCd(long number) {
	    number = checkIp70521CompCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp70521CompCd((int)number);
	}
	
	/**
	 *	Returns the value of ip70521ResnCd
	 *	@return ip70521ResnCd
	 */
	public int getIp70521ResnCd() throws CFException {
        if (isIp70521ResnCdModified()) { 
           ip70521ResnCd = refreshIp70521ResnCd();
        }
   		return ip70521ResnCd;
	}
	
	/**
	 * 	Update Ip70521ResnCd with the passed value
	 *  Corresponding COBOL Variable is IP70521-RESN-CD
	 *	@param number
	 */
	public void setIp70521ResnCd(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip70521ResnCd = checkIp70521ResnCdMaxLimit(number); 
		serializeIp70521ResnCd(ip70521ResnCd);
	}


	public void setIp70521ResnCd(long number) {
	    number = checkIp70521ResnCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp70521ResnCd((int)number);
	}
	
	
	/**
	 *	Test condition 2033 for isIp70521NoMsgAvailable88()
	 *	@return  Returns true if isIp70521NoMsgAvailable88() is 2033
	 */
   public boolean isIp70521NoMsgAvailable88() throws CFException {
      return (  getIp70521ResnCd()  ==  2033  );
   }


	/**
	*  set values 2033
	*/
   	public void setIp70521NoMsgAvailable88True() {  			
    	setIp70521ResnCd( 2033);
   	}
	/**
	 *	Returns the value of ip70521Options
	 *	@return ip70521Options
	 */
	public int getIp70521Options() throws CFException {
        if (isIp70521OptionsModified()) { 
           ip70521Options = refreshIp70521Options();
        }
   		return ip70521Options;
	}
	
	/**
	 * 	Update Ip70521Options with the passed value
	 *  Corresponding COBOL Variable is IP70521-OPTIONS
	 *	@param number
	 */
	public void setIp70521Options(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip70521Options = checkIp70521OptionsMaxLimit(number); 
		serializeIp70521Options(ip70521Options);
	}


	public void setIp70521Options(long number) {
	    number = checkIp70521OptionsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp70521Options((int)number);
	}
	
	/**
	 *	Returns the value of ip70521DataLength
	 *	@return ip70521DataLength
	 */
	public int getIp70521DataLength() throws CFException {
        if (isIp70521DataLengthModified()) { 
           ip70521DataLength = refreshIp70521DataLength();
        }
   		return ip70521DataLength;
	}
	
	/**
	 * 	Update Ip70521DataLength with the passed value
	 *  Corresponding COBOL Variable is IP70521-DATA-LENGTH
	 *	@param number
	 */
	public void setIp70521DataLength(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip70521DataLength = checkIp70521DataLengthMaxLimit(number); 
		serializeIp70521DataLength(ip70521DataLength);
	}


	public void setIp70521DataLength(long number) {
	    number = checkIp70521DataLengthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp70521DataLength((int)number);
	}
	
	/**
	 *	Returns the value of ip70521MsgBufferLen
	 *	@return ip70521MsgBufferLen
	 */
	public int getIp70521MsgBufferLen() throws CFException {
        if (isIp70521MsgBufferLenModified()) { 
           ip70521MsgBufferLen = refreshIp70521MsgBufferLen();
        }
   		return ip70521MsgBufferLen;
	}
	
	/**
	 * 	Update Ip70521MsgBufferLen with the passed value
	 *  Corresponding COBOL Variable is IP70521-MSG-BUFFER-LEN
	 *	@param number
	 */
	public void setIp70521MsgBufferLen(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip70521MsgBufferLen = checkIp70521MsgBufferLenMaxLimit(number); 
		serializeIp70521MsgBufferLen(ip70521MsgBufferLen);
	}


	public void setIp70521MsgBufferLen(long number) {
	    number = checkIp70521MsgBufferLenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp70521MsgBufferLen((int)number);
	}
	
	/**
	 *	Returns the value of ip70521MsgBuffer
	 *	@return ip70521MsgBuffer
	 */
   public char[] getIp70521MsgBuffer() throws CFException{
     if (isIp70521MsgBufferModified()) { 
        ip70521MsgBuffer = refreshIp70521MsgBuffer();
     }
   		return ip70521MsgBuffer;
   }

  
	/**
	*  set variable ip70521MsgBuffer
	*  Corresponding COBOL Variable is IP70521-MSG-BUFFER
	*  @param value
	**/
   public void setIp70521MsgBuffer(char[] value) {
      ip70521MsgBuffer = checkIp70521MsgBufferConstraints(value);
      serializeIp70521MsgBuffer(ip70521MsgBuffer);
   } 

     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521MsgBuffer(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70521MsgBuffer,ip70521MsgBuffer.length);
   	
   }
   
   public void setIp70521MsgBuffer(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521MsgBuffer,ip70521MsgBuffer.length);
   	
   }
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MsgBuffer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521MsgBuffer+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70521MsgBuffer with another Field
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source) {
       replace(source,0,source.length(),beginIp70521MsgBuffer,IP_70521_MSG_BUFFER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70521MsgBuffer,IP_70521_MSG_BUFFER_LEN);
   	
   }
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521MsgBuffer+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip70521ProcDelay
	 *	@return ip70521ProcDelay
	 */   
	 public Ip70521ProcDelay getIp70521ProcDelay() {
   	return ip70521ProcDelay;
   }
   /**
	* 	Update Ip70521ProcDelay with the passed value
	*   Corresponding COBOL Variable is IP70521-PROC-DELAY
	*	@param value
	*/
   public void setIp70521ProcDelay(char[] value) {
      ip70521ProcDelay.setString(value); 
   }   
    
     /**
	 * 	Update Ip70521ProcDelay 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp70521ProcDelay(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip70521ProcDelay.begin,ip70521ProcDelay.length());
   }
   
     /**
	 * 	Update Ip70521ProcDelay 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521ProcDelay(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip70521ProcDelay.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip70521ProcDelay with another Field
	 *	@param value
	 */
   public void setIp70521ProcDelay(Field source) {
   	replace(source,0,source.length(),ip70521ProcDelay.begin,ip70521ProcDelay.length());
   }  
   
     /**
	 * 	Update Ip70521ProcDelay 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp70521ProcDelay(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip70521ProcDelay.begin,ip70521ProcDelay.length());
   }
   
     /**
	 * 	Update Ip70521ProcDelay 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521ProcDelay(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip70521ProcDelay.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip70521MqApiLayout
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp70521RequestCd(CONSTANTS.SPACE_4);
         setIp70521MqBypassSw(CONSTANTS.SPACE);
         setIp70521MqReturnSw(CONSTANTS.SPACE);
         setIp70521MqTimestamp(CONSTANTS.SPACE_26);
         setIp70521QmgrName(CONSTANTS.SPACE_48);
         setIp70521QName(CONSTANTS.SPACE_48);
         setIp70521TargetQmgrName(CONSTANTS.SPACE_48);
         setIp70521TargetQName(CONSTANTS.SPACE_48);
                     setIp70521Hconn(0);
                     setIp70521Hobj(0);
                     setIp70521CompCd(0);
                     setIp70521ResnCd(0);
                     setIp70521Options(0);
                     setIp70521DataLength(0);
                     setIp70521MsgBufferLen(0);
         setIp70521MsgBuffer(CONSTANTS.SPACE_4000000);
          ip70521ProcDelay.initialize();
     
   }

		public static int getIp70521MqApiLayoutFieldLength() {
			return IP_70521_MQ_API_LAYOUT_LENGTH;
		}

}
  
