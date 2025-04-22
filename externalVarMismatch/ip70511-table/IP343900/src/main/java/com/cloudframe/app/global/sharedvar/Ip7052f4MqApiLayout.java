package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7052f4MqApiLayout is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip7052f4MqApiLayout")

public class Ip7052f4MqApiLayout extends Ip7052f4MqApiLayoutSerialized  implements InitializingBean {
   

						private char[] ip7052f4RequestCd = Field.fillLowValue(4);

						private char[] ip7052f4MqBypassSw = Field.fillLowValue(1);

						private char[] ip7052f4MqReturnSw = Field.fillLowValue(1);

						private char[] ip7052f4MqTimestamp = Field.fillLowValue(26);

						private char[] ip7052f4QmgrName = Field.fillLowValue(48);

						private char[] ip7052f4QName = Field.fillLowValue(48);

						private char[] ip7052f4TargetQmgrName = Field.fillLowValue(48);

						private char[] ip7052f4TargetQName = Field.fillLowValue(48);

								private int ip7052f4Hconn;

								private int ip7052f4Hobj;

								private int ip7052f4CompCd;

								private int ip7052f4ResnCd;

								private int ip7052f4Options;

								private int ip7052f4DataLength;

								private int ip7052f4MsgBufferLen;

						private char[] ip7052f4MsgBuffer = Field.fillLowValue(4000000);
				private Ip7052f4ProcDelay ip7052f4ProcDelay = new Ip7052f4ProcDelay();
	
	/**
	* Constructor for Ip7052f4MqApiLayout
	**/
    public Ip7052f4MqApiLayout() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip7052f4ProcDelay.setParent(this,getStartOffset() + 4000252);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip7052f4RequestCd
	 *	@return ip7052f4RequestCd
	 */
   public char[] getIp7052f4RequestCd() throws CFException{
     if (isIp7052f4RequestCdModified()) { 
        ip7052f4RequestCd = refreshIp7052f4RequestCd();
     }
   		return ip7052f4RequestCd;
   }

  
	/**
	*  set variable ip7052f4RequestCd
	*  Corresponding COBOL Variable is IP7052F4-REQUEST-CD
	*  @param value
	**/
   public void setIp7052f4RequestCd(char[] value) {
      ip7052f4RequestCd = checkIp7052f4RequestCdConstraints(value);
      serializeIp7052f4RequestCd(ip7052f4RequestCd);
   } 

     /**
	 * 	Update Ip7052f4RequestCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052f4RequestCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052f4RequestCd,ip7052f4RequestCd.length);
   	
   }
   
   public void setIp7052f4RequestCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4RequestCd,ip7052f4RequestCd.length);
   	
   }
   
     /**
	 * 	Update Ip7052f4RequestCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4RequestCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4RequestCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052f4RequestCd with another Field
	 *	@param value
	 */
   public void setIp7052f4RequestCd(Field source) {
       replace(source,0,source.length(),beginIp7052f4RequestCd,IP_7052F_4_REQUEST_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052f4RequestCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052f4RequestCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052f4RequestCd,IP_7052F_4_REQUEST_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052f4RequestCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4RequestCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4RequestCd+targetIndex,targetLen);
    
   }
	char[] ip7052f4Connect8888Value = "CONN".toCharArray();
	/**
	 *	Test condition "CONN" for isIp7052f4Connect88()
	 *	@return  Returns true if isIp7052f4Connect88() is "CONN"
	 */
   public boolean isIp7052f4Connect88() throws CFException {
      return (  compareChars( getIp7052f4RequestCd() , ip7052f4Connect8888Value)  == 0  );
   }


	/**
	*  set values "CONN"
	*/
   	public void setIp7052f4Connect88True() {  			
    	setIp7052f4RequestCd( ip7052f4Connect8888Value);
   	}
	char[] ip7052f4Open8888Value = "OPEN".toCharArray();
	/**
	 *	Test condition "OPEN" for isIp7052f4Open88()
	 *	@return  Returns true if isIp7052f4Open88() is "OPEN"
	 */
   public boolean isIp7052f4Open88() throws CFException {
      return (  compareChars( getIp7052f4RequestCd() , ip7052f4Open8888Value)  == 0  );
   }


	/**
	*  set values "OPEN"
	*/
   	public void setIp7052f4Open88True() {  			
    	setIp7052f4RequestCd( ip7052f4Open8888Value);
   	}
	char[] ip7052f4Put8888Value = "PUT ".toCharArray();
	/**
	 *	Test condition "PUT " for isIp7052f4Put88()
	 *	@return  Returns true if isIp7052f4Put88() is "PUT "
	 */
   public boolean isIp7052f4Put88() throws CFException {
      return (  compareChars( getIp7052f4RequestCd() , ip7052f4Put8888Value)  == 0  );
   }


	/**
	*  set values "PUT "
	*/
   	public void setIp7052f4Put88True() {  			
    	setIp7052f4RequestCd( ip7052f4Put8888Value);
   	}
	char[] ip7052f4Get8888Value = "GET ".toCharArray();
	/**
	 *	Test condition "GET " for isIp7052f4Get88()
	 *	@return  Returns true if isIp7052f4Get88() is "GET "
	 */
   public boolean isIp7052f4Get88() throws CFException {
      return (  compareChars( getIp7052f4RequestCd() , ip7052f4Get8888Value)  == 0  );
   }


	/**
	*  set values "GET "
	*/
   	public void setIp7052f4Get88True() {  			
    	setIp7052f4RequestCd( ip7052f4Get8888Value);
   	}
	char[] ip7052f4Close8888Value = "CLOS".toCharArray();
	/**
	 *	Test condition "CLOS" for isIp7052f4Close88()
	 *	@return  Returns true if isIp7052f4Close88() is "CLOS"
	 */
   public boolean isIp7052f4Close88() throws CFException {
      return (  compareChars( getIp7052f4RequestCd() , ip7052f4Close8888Value)  == 0  );
   }


	/**
	*  set values "CLOS"
	*/
   	public void setIp7052f4Close88True() {  			
    	setIp7052f4RequestCd( ip7052f4Close8888Value);
   	}
	char[] ip7052f4Disconnect8888Value = "DISC".toCharArray();
	/**
	 *	Test condition "DISC" for isIp7052f4Disconnect88()
	 *	@return  Returns true if isIp7052f4Disconnect88() is "DISC"
	 */
   public boolean isIp7052f4Disconnect88() throws CFException {
      return (  compareChars( getIp7052f4RequestCd() , ip7052f4Disconnect8888Value)  == 0  );
   }


	/**
	*  set values "DISC"
	*/
   	public void setIp7052f4Disconnect88True() {  			
    	setIp7052f4RequestCd( ip7052f4Disconnect8888Value);
   	}
	char[] ip7052f4Browse8888Value = "BROW".toCharArray();
	/**
	 *	Test condition "BROW" for isIp7052f4Browse88()
	 *	@return  Returns true if isIp7052f4Browse88() is "BROW"
	 */
   public boolean isIp7052f4Browse88() throws CFException {
      return (  compareChars( getIp7052f4RequestCd() , ip7052f4Browse8888Value)  == 0  );
   }


	/**
	*  set values "BROW"
	*/
   	public void setIp7052f4Browse88True() {  			
    	setIp7052f4RequestCd( ip7052f4Browse8888Value);
   	}
	char[] ip7052f4Purge8888Value = "PURG".toCharArray();
	/**
	 *	Test condition "PURG" for isIp7052f4Purge88()
	 *	@return  Returns true if isIp7052f4Purge88() is "PURG"
	 */
   public boolean isIp7052f4Purge88() throws CFException {
      return (  compareChars( getIp7052f4RequestCd() , ip7052f4Purge8888Value)  == 0  );
   }


	/**
	*  set values "PURG"
	*/
   	public void setIp7052f4Purge88True() {  			
    	setIp7052f4RequestCd( ip7052f4Purge8888Value);
   	}
	/**
	 *	Returns the value of ip7052f4MqBypassSw
	 *	@return ip7052f4MqBypassSw
	 */
   public char[] getIp7052f4MqBypassSw() throws CFException{
     if (isIp7052f4MqBypassSwModified()) { 
        ip7052f4MqBypassSw = refreshIp7052f4MqBypassSw();
     }
   		return ip7052f4MqBypassSw;
   }

  
	/**
	*  set variable ip7052f4MqBypassSw
	*  Corresponding COBOL Variable is IP7052F4-MQ-BYPASS-SW
	*  @param value
	**/
   public void setIp7052f4MqBypassSw(char[] value) {
      ip7052f4MqBypassSw = checkIp7052f4MqBypassSwConstraints(value);
      serializeIp7052f4MqBypassSw(ip7052f4MqBypassSw);
   } 

     /**
	 * 	Update Ip7052f4MqBypassSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052f4MqBypassSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052f4MqBypassSw,ip7052f4MqBypassSw.length);
   	
   }
   
   public void setIp7052f4MqBypassSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4MqBypassSw,ip7052f4MqBypassSw.length);
   	
   }
   
     /**
	 * 	Update Ip7052f4MqBypassSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4MqBypassSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4MqBypassSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052f4MqBypassSw with another Field
	 *	@param value
	 */
   public void setIp7052f4MqBypassSw(Field source) {
       replace(source,0,source.length(),beginIp7052f4MqBypassSw,IP_7052F_4_MQ_BYPASS_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052f4MqBypassSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052f4MqBypassSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052f4MqBypassSw,IP_7052F_4_MQ_BYPASS_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052f4MqBypassSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4MqBypassSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4MqBypassSw+targetIndex,targetLen);
    
   }
	char[] ip7052f4MqBypassY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp7052f4MqBypassY88()
	 *	@return  Returns true if isIp7052f4MqBypassY88() is "Y"
	 */
   public boolean isIp7052f4MqBypassY88() throws CFException {
      return (  compareChars( getIp7052f4MqBypassSw() , ip7052f4MqBypassY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp7052f4MqBypassY88True() {  			
    	setIp7052f4MqBypassSw( ip7052f4MqBypassY8888Value);
   	}
	char[] ip7052f4MqBypassN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp7052f4MqBypassN88()
	 *	@return  Returns true if isIp7052f4MqBypassN88() is "N"
	 */
   public boolean isIp7052f4MqBypassN88() throws CFException {
      return (  compareChars( getIp7052f4MqBypassSw() , ip7052f4MqBypassN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp7052f4MqBypassN88True() {  			
    	setIp7052f4MqBypassSw( ip7052f4MqBypassN8888Value);
   	}
	/**
	 *	Returns the value of ip7052f4MqReturnSw
	 *	@return ip7052f4MqReturnSw
	 */
   public char[] getIp7052f4MqReturnSw() throws CFException{
     if (isIp7052f4MqReturnSwModified()) { 
        ip7052f4MqReturnSw = refreshIp7052f4MqReturnSw();
     }
   		return ip7052f4MqReturnSw;
   }

  
	/**
	*  set variable ip7052f4MqReturnSw
	*  Corresponding COBOL Variable is IP7052F4-MQ-RETURN-SW
	*  @param value
	**/
   public void setIp7052f4MqReturnSw(char[] value) {
      ip7052f4MqReturnSw = checkIp7052f4MqReturnSwConstraints(value);
      serializeIp7052f4MqReturnSw(ip7052f4MqReturnSw);
   } 

     /**
	 * 	Update Ip7052f4MqReturnSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052f4MqReturnSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052f4MqReturnSw,ip7052f4MqReturnSw.length);
   	
   }
   
   public void setIp7052f4MqReturnSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4MqReturnSw,ip7052f4MqReturnSw.length);
   	
   }
   
     /**
	 * 	Update Ip7052f4MqReturnSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4MqReturnSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4MqReturnSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052f4MqReturnSw with another Field
	 *	@param value
	 */
   public void setIp7052f4MqReturnSw(Field source) {
       replace(source,0,source.length(),beginIp7052f4MqReturnSw,IP_7052F_4_MQ_RETURN_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052f4MqReturnSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052f4MqReturnSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052f4MqReturnSw,IP_7052F_4_MQ_RETURN_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052f4MqReturnSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4MqReturnSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4MqReturnSw+targetIndex,targetLen);
    
   }
	char[] ip7052f4MqReturnY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp7052f4MqReturnY88()
	 *	@return  Returns true if isIp7052f4MqReturnY88() is "Y"
	 */
   public boolean isIp7052f4MqReturnY88() throws CFException {
      return (  compareChars( getIp7052f4MqReturnSw() , ip7052f4MqReturnY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp7052f4MqReturnY88True() {  			
    	setIp7052f4MqReturnSw( ip7052f4MqReturnY8888Value);
   	}
	char[] ip7052f4MqReturnN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp7052f4MqReturnN88()
	 *	@return  Returns true if isIp7052f4MqReturnN88() is "N"
	 */
   public boolean isIp7052f4MqReturnN88() throws CFException {
      return (  compareChars( getIp7052f4MqReturnSw() , ip7052f4MqReturnN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp7052f4MqReturnN88True() {  			
    	setIp7052f4MqReturnSw( ip7052f4MqReturnN8888Value);
   	}
	/**
	 *	Returns the value of ip7052f4MqTimestamp
	 *	@return ip7052f4MqTimestamp
	 */
   public char[] getIp7052f4MqTimestamp() throws CFException{
     if (isIp7052f4MqTimestampModified()) { 
        ip7052f4MqTimestamp = refreshIp7052f4MqTimestamp();
     }
   		return ip7052f4MqTimestamp;
   }

  
	/**
	*  set variable ip7052f4MqTimestamp
	*  Corresponding COBOL Variable is IP7052F4-MQ-TIMESTAMP
	*  @param value
	**/
   public void setIp7052f4MqTimestamp(char[] value) {
      ip7052f4MqTimestamp = checkIp7052f4MqTimestampConstraints(value);
      serializeIp7052f4MqTimestamp(ip7052f4MqTimestamp);
   } 

     /**
	 * 	Update Ip7052f4MqTimestamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052f4MqTimestamp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052f4MqTimestamp,ip7052f4MqTimestamp.length);
   	
   }
   
   public void setIp7052f4MqTimestamp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4MqTimestamp,ip7052f4MqTimestamp.length);
   	
   }
   
     /**
	 * 	Update Ip7052f4MqTimestamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4MqTimestamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4MqTimestamp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052f4MqTimestamp with another Field
	 *	@param value
	 */
   public void setIp7052f4MqTimestamp(Field source) {
       replace(source,0,source.length(),beginIp7052f4MqTimestamp,IP_7052F_4_MQ_TIMESTAMP_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052f4MqTimestamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052f4MqTimestamp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052f4MqTimestamp,IP_7052F_4_MQ_TIMESTAMP_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052f4MqTimestamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4MqTimestamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4MqTimestamp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7052f4QmgrName
	 *	@return ip7052f4QmgrName
	 */
   public char[] getIp7052f4QmgrName() throws CFException{
     if (isIp7052f4QmgrNameModified()) { 
        ip7052f4QmgrName = refreshIp7052f4QmgrName();
     }
   		return ip7052f4QmgrName;
   }

  
	/**
	*  set variable ip7052f4QmgrName
	*  Corresponding COBOL Variable is IP7052F4-QMGR-NAME
	*  @param value
	**/
   public void setIp7052f4QmgrName(char[] value) {
      ip7052f4QmgrName = checkIp7052f4QmgrNameConstraints(value);
      serializeIp7052f4QmgrName(ip7052f4QmgrName);
   } 

     /**
	 * 	Update Ip7052f4QmgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052f4QmgrName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052f4QmgrName,ip7052f4QmgrName.length);
   	
   }
   
   public void setIp7052f4QmgrName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4QmgrName,ip7052f4QmgrName.length);
   	
   }
   
     /**
	 * 	Update Ip7052f4QmgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4QmgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4QmgrName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052f4QmgrName with another Field
	 *	@param value
	 */
   public void setIp7052f4QmgrName(Field source) {
       replace(source,0,source.length(),beginIp7052f4QmgrName,IP_7052F_4_QMGR_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052f4QmgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052f4QmgrName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052f4QmgrName,IP_7052F_4_QMGR_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052f4QmgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4QmgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4QmgrName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7052f4QName
	 *	@return ip7052f4QName
	 */
   public char[] getIp7052f4QName() throws CFException{
     if (isIp7052f4QNameModified()) { 
        ip7052f4QName = refreshIp7052f4QName();
     }
   		return ip7052f4QName;
   }

  
	/**
	*  set variable ip7052f4QName
	*  Corresponding COBOL Variable is IP7052F4-Q-NAME
	*  @param value
	**/
   public void setIp7052f4QName(char[] value) {
      ip7052f4QName = checkIp7052f4QNameConstraints(value);
      serializeIp7052f4QName(ip7052f4QName);
   } 

     /**
	 * 	Update Ip7052f4QName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052f4QName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052f4QName,ip7052f4QName.length);
   	
   }
   
   public void setIp7052f4QName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4QName,ip7052f4QName.length);
   	
   }
   
     /**
	 * 	Update Ip7052f4QName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4QName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4QName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052f4QName with another Field
	 *	@param value
	 */
   public void setIp7052f4QName(Field source) {
       replace(source,0,source.length(),beginIp7052f4QName,IP_7052F_4_QNAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052f4QName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052f4QName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052f4QName,IP_7052F_4_QNAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052f4QName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4QName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4QName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7052f4TargetQmgrName
	 *	@return ip7052f4TargetQmgrName
	 */
   public char[] getIp7052f4TargetQmgrName() throws CFException{
     if (isIp7052f4TargetQmgrNameModified()) { 
        ip7052f4TargetQmgrName = refreshIp7052f4TargetQmgrName();
     }
   		return ip7052f4TargetQmgrName;
   }

  
	/**
	*  set variable ip7052f4TargetQmgrName
	*  Corresponding COBOL Variable is IP7052F4-TARGET-QMGR-NAME
	*  @param value
	**/
   public void setIp7052f4TargetQmgrName(char[] value) {
      ip7052f4TargetQmgrName = checkIp7052f4TargetQmgrNameConstraints(value);
      serializeIp7052f4TargetQmgrName(ip7052f4TargetQmgrName);
   } 

     /**
	 * 	Update Ip7052f4TargetQmgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052f4TargetQmgrName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052f4TargetQmgrName,ip7052f4TargetQmgrName.length);
   	
   }
   
   public void setIp7052f4TargetQmgrName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4TargetQmgrName,ip7052f4TargetQmgrName.length);
   	
   }
   
     /**
	 * 	Update Ip7052f4TargetQmgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4TargetQmgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4TargetQmgrName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052f4TargetQmgrName with another Field
	 *	@param value
	 */
   public void setIp7052f4TargetQmgrName(Field source) {
       replace(source,0,source.length(),beginIp7052f4TargetQmgrName,IP_7052F_4_TARGET_QMGR_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052f4TargetQmgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052f4TargetQmgrName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052f4TargetQmgrName,IP_7052F_4_TARGET_QMGR_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052f4TargetQmgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4TargetQmgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4TargetQmgrName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7052f4TargetQName
	 *	@return ip7052f4TargetQName
	 */
   public char[] getIp7052f4TargetQName() throws CFException{
     if (isIp7052f4TargetQNameModified()) { 
        ip7052f4TargetQName = refreshIp7052f4TargetQName();
     }
   		return ip7052f4TargetQName;
   }

  
	/**
	*  set variable ip7052f4TargetQName
	*  Corresponding COBOL Variable is IP7052F4-TARGET-Q-NAME
	*  @param value
	**/
   public void setIp7052f4TargetQName(char[] value) {
      ip7052f4TargetQName = checkIp7052f4TargetQNameConstraints(value);
      serializeIp7052f4TargetQName(ip7052f4TargetQName);
   } 

     /**
	 * 	Update Ip7052f4TargetQName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052f4TargetQName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052f4TargetQName,ip7052f4TargetQName.length);
   	
   }
   
   public void setIp7052f4TargetQName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4TargetQName,ip7052f4TargetQName.length);
   	
   }
   
     /**
	 * 	Update Ip7052f4TargetQName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4TargetQName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4TargetQName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052f4TargetQName with another Field
	 *	@param value
	 */
   public void setIp7052f4TargetQName(Field source) {
       replace(source,0,source.length(),beginIp7052f4TargetQName,IP_7052F_4_TARGET_QNAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052f4TargetQName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052f4TargetQName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052f4TargetQName,IP_7052F_4_TARGET_QNAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052f4TargetQName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4TargetQName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4TargetQName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7052f4Hconn
	 *	@return ip7052f4Hconn
	 */
	public int getIp7052f4Hconn() throws CFException {
        if (isIp7052f4HconnModified()) { 
           ip7052f4Hconn = refreshIp7052f4Hconn();
        }
   		return ip7052f4Hconn;
	}
	
	/**
	 * 	Update Ip7052f4Hconn with the passed value
	 *  Corresponding COBOL Variable is IP7052F4-HCONN
	 *	@param number
	 */
	public void setIp7052f4Hconn(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip7052f4Hconn = checkIp7052f4HconnMaxLimit(number); 
		serializeIp7052f4Hconn(ip7052f4Hconn);
	}


	public void setIp7052f4Hconn(long number) {
	    number = checkIp7052f4HconnMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7052f4Hconn((int)number);
	}
	
	/**
	 *	Returns the value of ip7052f4Hobj
	 *	@return ip7052f4Hobj
	 */
	public int getIp7052f4Hobj() throws CFException {
        if (isIp7052f4HobjModified()) { 
           ip7052f4Hobj = refreshIp7052f4Hobj();
        }
   		return ip7052f4Hobj;
	}
	
	/**
	 * 	Update Ip7052f4Hobj with the passed value
	 *  Corresponding COBOL Variable is IP7052F4-HOBJ
	 *	@param number
	 */
	public void setIp7052f4Hobj(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip7052f4Hobj = checkIp7052f4HobjMaxLimit(number); 
		serializeIp7052f4Hobj(ip7052f4Hobj);
	}


	public void setIp7052f4Hobj(long number) {
	    number = checkIp7052f4HobjMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7052f4Hobj((int)number);
	}
	
	/**
	 *	Returns the value of ip7052f4CompCd
	 *	@return ip7052f4CompCd
	 */
	public int getIp7052f4CompCd() throws CFException {
        if (isIp7052f4CompCdModified()) { 
           ip7052f4CompCd = refreshIp7052f4CompCd();
        }
   		return ip7052f4CompCd;
	}
	
	/**
	 * 	Update Ip7052f4CompCd with the passed value
	 *  Corresponding COBOL Variable is IP7052F4-COMP-CD
	 *	@param number
	 */
	public void setIp7052f4CompCd(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip7052f4CompCd = checkIp7052f4CompCdMaxLimit(number); 
		serializeIp7052f4CompCd(ip7052f4CompCd);
	}


	public void setIp7052f4CompCd(long number) {
	    number = checkIp7052f4CompCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7052f4CompCd((int)number);
	}
	
	/**
	 *	Returns the value of ip7052f4ResnCd
	 *	@return ip7052f4ResnCd
	 */
	public int getIp7052f4ResnCd() throws CFException {
        if (isIp7052f4ResnCdModified()) { 
           ip7052f4ResnCd = refreshIp7052f4ResnCd();
        }
   		return ip7052f4ResnCd;
	}
	
	/**
	 * 	Update Ip7052f4ResnCd with the passed value
	 *  Corresponding COBOL Variable is IP7052F4-RESN-CD
	 *	@param number
	 */
	public void setIp7052f4ResnCd(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip7052f4ResnCd = checkIp7052f4ResnCdMaxLimit(number); 
		serializeIp7052f4ResnCd(ip7052f4ResnCd);
	}


	public void setIp7052f4ResnCd(long number) {
	    number = checkIp7052f4ResnCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7052f4ResnCd((int)number);
	}
	
	
	/**
	 *	Test condition 2033 for isIp7052f4NoMsgAvailable88()
	 *	@return  Returns true if isIp7052f4NoMsgAvailable88() is 2033
	 */
   public boolean isIp7052f4NoMsgAvailable88() throws CFException {
      return (  getIp7052f4ResnCd()  ==  2033  );
   }


	/**
	*  set values 2033
	*/
   	public void setIp7052f4NoMsgAvailable88True() {  			
    	setIp7052f4ResnCd( 2033);
   	}
	/**
	 *	Returns the value of ip7052f4Options
	 *	@return ip7052f4Options
	 */
	public int getIp7052f4Options() throws CFException {
        if (isIp7052f4OptionsModified()) { 
           ip7052f4Options = refreshIp7052f4Options();
        }
   		return ip7052f4Options;
	}
	
	/**
	 * 	Update Ip7052f4Options with the passed value
	 *  Corresponding COBOL Variable is IP7052F4-OPTIONS
	 *	@param number
	 */
	public void setIp7052f4Options(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip7052f4Options = checkIp7052f4OptionsMaxLimit(number); 
		serializeIp7052f4Options(ip7052f4Options);
	}


	public void setIp7052f4Options(long number) {
	    number = checkIp7052f4OptionsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7052f4Options((int)number);
	}
	
	/**
	 *	Returns the value of ip7052f4DataLength
	 *	@return ip7052f4DataLength
	 */
	public int getIp7052f4DataLength() throws CFException {
        if (isIp7052f4DataLengthModified()) { 
           ip7052f4DataLength = refreshIp7052f4DataLength();
        }
   		return ip7052f4DataLength;
	}
	
	/**
	 * 	Update Ip7052f4DataLength with the passed value
	 *  Corresponding COBOL Variable is IP7052F4-DATA-LENGTH
	 *	@param number
	 */
	public void setIp7052f4DataLength(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip7052f4DataLength = checkIp7052f4DataLengthMaxLimit(number); 
		serializeIp7052f4DataLength(ip7052f4DataLength);
	}


	public void setIp7052f4DataLength(long number) {
	    number = checkIp7052f4DataLengthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7052f4DataLength((int)number);
	}
	
	/**
	 *	Returns the value of ip7052f4MsgBufferLen
	 *	@return ip7052f4MsgBufferLen
	 */
	public int getIp7052f4MsgBufferLen() throws CFException {
        if (isIp7052f4MsgBufferLenModified()) { 
           ip7052f4MsgBufferLen = refreshIp7052f4MsgBufferLen();
        }
   		return ip7052f4MsgBufferLen;
	}
	
	/**
	 * 	Update Ip7052f4MsgBufferLen with the passed value
	 *  Corresponding COBOL Variable is IP7052F4-MSG-BUFFER-LEN
	 *	@param number
	 */
	public void setIp7052f4MsgBufferLen(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip7052f4MsgBufferLen = checkIp7052f4MsgBufferLenMaxLimit(number); 
		serializeIp7052f4MsgBufferLen(ip7052f4MsgBufferLen);
	}


	public void setIp7052f4MsgBufferLen(long number) {
	    number = checkIp7052f4MsgBufferLenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7052f4MsgBufferLen((int)number);
	}
	
	/**
	 *	Returns the value of ip7052f4MsgBuffer
	 *	@return ip7052f4MsgBuffer
	 */
   public char[] getIp7052f4MsgBuffer() throws CFException{
     if (isIp7052f4MsgBufferModified()) { 
        ip7052f4MsgBuffer = refreshIp7052f4MsgBuffer();
     }
   		return ip7052f4MsgBuffer;
   }

  
	/**
	*  set variable ip7052f4MsgBuffer
	*  Corresponding COBOL Variable is IP7052F4-MSG-BUFFER
	*  @param value
	**/
   public void setIp7052f4MsgBuffer(char[] value) {
      ip7052f4MsgBuffer = checkIp7052f4MsgBufferConstraints(value);
      serializeIp7052f4MsgBuffer(ip7052f4MsgBuffer);
   } 

     /**
	 * 	Update Ip7052f4MsgBuffer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052f4MsgBuffer(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052f4MsgBuffer,ip7052f4MsgBuffer.length);
   	
   }
   
   public void setIp7052f4MsgBuffer(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4MsgBuffer,ip7052f4MsgBuffer.length);
   	
   }
   
     /**
	 * 	Update Ip7052f4MsgBuffer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4MsgBuffer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4MsgBuffer+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052f4MsgBuffer with another Field
	 *	@param value
	 */
   public void setIp7052f4MsgBuffer(Field source) {
       replace(source,0,source.length(),beginIp7052f4MsgBuffer,IP_7052F_4_MSG_BUFFER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052f4MsgBuffer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052f4MsgBuffer(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052f4MsgBuffer,IP_7052F_4_MSG_BUFFER_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052f4MsgBuffer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4MsgBuffer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4MsgBuffer+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7052f4ProcDelay
	 *	@return ip7052f4ProcDelay
	 */   
	 public Ip7052f4ProcDelay getIp7052f4ProcDelay() {
   	return ip7052f4ProcDelay;
   }
   /**
	* 	Update Ip7052f4ProcDelay with the passed value
	*   Corresponding COBOL Variable is IP7052F4-PROC-DELAY
	*	@param value
	*/
   public void setIp7052f4ProcDelay(char[] value) {
      ip7052f4ProcDelay.setString(value); 
   }   
    
     /**
	 * 	Update Ip7052f4ProcDelay 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp7052f4ProcDelay(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7052f4ProcDelay.begin,ip7052f4ProcDelay.length());
   }
   
     /**
	 * 	Update Ip7052f4ProcDelay 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4ProcDelay(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7052f4ProcDelay.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip7052f4ProcDelay with another Field
	 *	@param value
	 */
   public void setIp7052f4ProcDelay(Field source) {
   	replace(source,0,source.length(),ip7052f4ProcDelay.begin,ip7052f4ProcDelay.length());
   }  
   
     /**
	 * 	Update Ip7052f4ProcDelay 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp7052f4ProcDelay(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7052f4ProcDelay.begin,ip7052f4ProcDelay.length());
   }
   
     /**
	 * 	Update Ip7052f4ProcDelay 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4ProcDelay(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7052f4ProcDelay.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip7052f4MqApiLayout
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp7052f4RequestCd(CONSTANTS.SPACE_4);
         setIp7052f4MqBypassSw(CONSTANTS.SPACE);
         setIp7052f4MqReturnSw(CONSTANTS.SPACE);
         setIp7052f4MqTimestamp(CONSTANTS.SPACE_26);
         setIp7052f4QmgrName(CONSTANTS.SPACE_48);
         setIp7052f4QName(CONSTANTS.SPACE_48);
         setIp7052f4TargetQmgrName(CONSTANTS.SPACE_48);
         setIp7052f4TargetQName(CONSTANTS.SPACE_48);
                     setIp7052f4Hconn(0);
                     setIp7052f4Hobj(0);
                     setIp7052f4CompCd(0);
                     setIp7052f4ResnCd(0);
                     setIp7052f4Options(0);
                     setIp7052f4DataLength(0);
                     setIp7052f4MsgBufferLen(0);
         setIp7052f4MsgBuffer(CONSTANTS.SPACE_4000000);
          ip7052f4ProcDelay.initialize();
     
   }

		public static int getIp7052f4MqApiLayoutFieldLength() {
			return IP_7052F_4_MQ_API_LAYOUT_LENGTH;
		}

}
  
