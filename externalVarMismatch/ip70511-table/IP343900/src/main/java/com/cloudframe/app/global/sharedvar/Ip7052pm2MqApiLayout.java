package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7052pm2MqApiLayout is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class Ip7052pm2MqApiLayout extends Ip7052pm2MqApiLayoutSerialized { 
   

						private char[] ip7052pm2RequestCd = Field.fillLowValue(4);

						private char[] ip7052pm2MqBypassSw = Field.fillLowValue(1);

						private char[] ip7052pm2MqReturnSw = Field.fillLowValue(1);

						private char[] ip7052pm2MqTimestamp = Field.fillLowValue(26);

						private char[] ip7052pm2QmgrName = Field.fillLowValue(48);

						private char[] ip7052pm2QName = Field.fillLowValue(48);

						private char[] ip7052pm2TargetQmgrName = Field.fillLowValue(48);

						private char[] ip7052pm2TargetQName = Field.fillLowValue(48);

								private int ip7052pm2Hconn;

								private int ip7052pm2Hobj;

								private int ip7052pm2CompCd;

								private int ip7052pm2ResnCd;

								private int ip7052pm2Options;

								private int ip7052pm2DataLength;

								private int ip7052pm2MsgBufferLen;

						private char[] ip7052pm2MsgBuffer = Field.fillLowValue(4000000);
				private Ip7052pm2ProcDelay ip7052pm2ProcDelay = new Ip7052pm2ProcDelay();
	
	/**
	* Constructor for Ip7052pm2MqApiLayout
	**/
    public Ip7052pm2MqApiLayout() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ip7052pm2ProcDelay.setParent(this,getStartOffset() + 4000252);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip7052pm2RequestCd
	 *	@return ip7052pm2RequestCd
	 */
   public char[] getIp7052pm2RequestCd() throws CFException{
     if (isIp7052pm2RequestCdModified()) { 
        ip7052pm2RequestCd = refreshIp7052pm2RequestCd();
     }
   		return ip7052pm2RequestCd;
   }

  
	/**
	*  set variable ip7052pm2RequestCd
	*  Corresponding COBOL Variable is IP7052PM2-REQUEST-CD
	*  @param value
	**/
   public void setIp7052pm2RequestCd(char[] value) {
      ip7052pm2RequestCd = checkIp7052pm2RequestCdConstraints(value);
      serializeIp7052pm2RequestCd(ip7052pm2RequestCd);
   } 

     /**
	 * 	Update Ip7052pm2RequestCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052pm2RequestCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052pm2RequestCd,ip7052pm2RequestCd.length);
   	
   }
   
   public void setIp7052pm2RequestCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2RequestCd,ip7052pm2RequestCd.length);
   	
   }
   
     /**
	 * 	Update Ip7052pm2RequestCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pm2RequestCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2RequestCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052pm2RequestCd with another Field
	 *	@param value
	 */
   public void setIp7052pm2RequestCd(Field source) {
       replace(source,0,source.length(),beginIp7052pm2RequestCd,IP_7052PM_2_REQUEST_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052pm2RequestCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052pm2RequestCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052pm2RequestCd,IP_7052PM_2_REQUEST_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052pm2RequestCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pm2RequestCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2RequestCd+targetIndex,targetLen);
    
   }
	char[] ip7052pm2Connect8888Value = "CONN".toCharArray();
	/**
	 *	Test condition "CONN" for isIp7052pm2Connect88()
	 *	@return  Returns true if isIp7052pm2Connect88() is "CONN"
	 */
   public boolean isIp7052pm2Connect88() throws CFException {
      return (  compareChars( getIp7052pm2RequestCd() , ip7052pm2Connect8888Value)  == 0  );
   }


	/**
	*  set values "CONN"
	*/
   	public void setIp7052pm2Connect88True() {  			
    	setIp7052pm2RequestCd( ip7052pm2Connect8888Value);
   	}
	char[] ip7052pm2Open8888Value = "OPEN".toCharArray();
	/**
	 *	Test condition "OPEN" for isIp7052pm2Open88()
	 *	@return  Returns true if isIp7052pm2Open88() is "OPEN"
	 */
   public boolean isIp7052pm2Open88() throws CFException {
      return (  compareChars( getIp7052pm2RequestCd() , ip7052pm2Open8888Value)  == 0  );
   }


	/**
	*  set values "OPEN"
	*/
   	public void setIp7052pm2Open88True() {  			
    	setIp7052pm2RequestCd( ip7052pm2Open8888Value);
   	}
	char[] ip7052pm2Put8888Value = "PUT ".toCharArray();
	/**
	 *	Test condition "PUT " for isIp7052pm2Put88()
	 *	@return  Returns true if isIp7052pm2Put88() is "PUT "
	 */
   public boolean isIp7052pm2Put88() throws CFException {
      return (  compareChars( getIp7052pm2RequestCd() , ip7052pm2Put8888Value)  == 0  );
   }


	/**
	*  set values "PUT "
	*/
   	public void setIp7052pm2Put88True() {  			
    	setIp7052pm2RequestCd( ip7052pm2Put8888Value);
   	}
	char[] ip7052pm2Get8888Value = "GET ".toCharArray();
	/**
	 *	Test condition "GET " for isIp7052pm2Get88()
	 *	@return  Returns true if isIp7052pm2Get88() is "GET "
	 */
   public boolean isIp7052pm2Get88() throws CFException {
      return (  compareChars( getIp7052pm2RequestCd() , ip7052pm2Get8888Value)  == 0  );
   }


	/**
	*  set values "GET "
	*/
   	public void setIp7052pm2Get88True() {  			
    	setIp7052pm2RequestCd( ip7052pm2Get8888Value);
   	}
	char[] ip7052pm2Close8888Value = "CLOS".toCharArray();
	/**
	 *	Test condition "CLOS" for isIp7052pm2Close88()
	 *	@return  Returns true if isIp7052pm2Close88() is "CLOS"
	 */
   public boolean isIp7052pm2Close88() throws CFException {
      return (  compareChars( getIp7052pm2RequestCd() , ip7052pm2Close8888Value)  == 0  );
   }


	/**
	*  set values "CLOS"
	*/
   	public void setIp7052pm2Close88True() {  			
    	setIp7052pm2RequestCd( ip7052pm2Close8888Value);
   	}
	char[] ip7052pm2Disconnect8888Value = "DISC".toCharArray();
	/**
	 *	Test condition "DISC" for isIp7052pm2Disconnect88()
	 *	@return  Returns true if isIp7052pm2Disconnect88() is "DISC"
	 */
   public boolean isIp7052pm2Disconnect88() throws CFException {
      return (  compareChars( getIp7052pm2RequestCd() , ip7052pm2Disconnect8888Value)  == 0  );
   }


	/**
	*  set values "DISC"
	*/
   	public void setIp7052pm2Disconnect88True() {  			
    	setIp7052pm2RequestCd( ip7052pm2Disconnect8888Value);
   	}
	char[] ip7052pm2Browse8888Value = "BROW".toCharArray();
	/**
	 *	Test condition "BROW" for isIp7052pm2Browse88()
	 *	@return  Returns true if isIp7052pm2Browse88() is "BROW"
	 */
   public boolean isIp7052pm2Browse88() throws CFException {
      return (  compareChars( getIp7052pm2RequestCd() , ip7052pm2Browse8888Value)  == 0  );
   }


	/**
	*  set values "BROW"
	*/
   	public void setIp7052pm2Browse88True() {  			
    	setIp7052pm2RequestCd( ip7052pm2Browse8888Value);
   	}
	char[] ip7052pm2Purge8888Value = "PURG".toCharArray();
	/**
	 *	Test condition "PURG" for isIp7052pm2Purge88()
	 *	@return  Returns true if isIp7052pm2Purge88() is "PURG"
	 */
   public boolean isIp7052pm2Purge88() throws CFException {
      return (  compareChars( getIp7052pm2RequestCd() , ip7052pm2Purge8888Value)  == 0  );
   }


	/**
	*  set values "PURG"
	*/
   	public void setIp7052pm2Purge88True() {  			
    	setIp7052pm2RequestCd( ip7052pm2Purge8888Value);
   	}
	/**
	 *	Returns the value of ip7052pm2MqBypassSw
	 *	@return ip7052pm2MqBypassSw
	 */
   public char[] getIp7052pm2MqBypassSw() throws CFException{
     if (isIp7052pm2MqBypassSwModified()) { 
        ip7052pm2MqBypassSw = refreshIp7052pm2MqBypassSw();
     }
   		return ip7052pm2MqBypassSw;
   }

  
	/**
	*  set variable ip7052pm2MqBypassSw
	*  Corresponding COBOL Variable is IP7052PM2-MQ-BYPASS-SW
	*  @param value
	**/
   public void setIp7052pm2MqBypassSw(char[] value) {
      ip7052pm2MqBypassSw = checkIp7052pm2MqBypassSwConstraints(value);
      serializeIp7052pm2MqBypassSw(ip7052pm2MqBypassSw);
   } 

     /**
	 * 	Update Ip7052pm2MqBypassSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052pm2MqBypassSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052pm2MqBypassSw,ip7052pm2MqBypassSw.length);
   	
   }
   
   public void setIp7052pm2MqBypassSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2MqBypassSw,ip7052pm2MqBypassSw.length);
   	
   }
   
     /**
	 * 	Update Ip7052pm2MqBypassSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pm2MqBypassSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2MqBypassSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052pm2MqBypassSw with another Field
	 *	@param value
	 */
   public void setIp7052pm2MqBypassSw(Field source) {
       replace(source,0,source.length(),beginIp7052pm2MqBypassSw,IP_7052PM_2_MQ_BYPASS_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052pm2MqBypassSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052pm2MqBypassSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052pm2MqBypassSw,IP_7052PM_2_MQ_BYPASS_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052pm2MqBypassSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pm2MqBypassSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2MqBypassSw+targetIndex,targetLen);
    
   }
	char[] ip7052pm2MqBypassY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp7052pm2MqBypassY88()
	 *	@return  Returns true if isIp7052pm2MqBypassY88() is "Y"
	 */
   public boolean isIp7052pm2MqBypassY88() throws CFException {
      return (  compareChars( getIp7052pm2MqBypassSw() , ip7052pm2MqBypassY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp7052pm2MqBypassY88True() {  			
    	setIp7052pm2MqBypassSw( ip7052pm2MqBypassY8888Value);
   	}
	char[] ip7052pm2MqBypassN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp7052pm2MqBypassN88()
	 *	@return  Returns true if isIp7052pm2MqBypassN88() is "N"
	 */
   public boolean isIp7052pm2MqBypassN88() throws CFException {
      return (  compareChars( getIp7052pm2MqBypassSw() , ip7052pm2MqBypassN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp7052pm2MqBypassN88True() {  			
    	setIp7052pm2MqBypassSw( ip7052pm2MqBypassN8888Value);
   	}
	/**
	 *	Returns the value of ip7052pm2MqReturnSw
	 *	@return ip7052pm2MqReturnSw
	 */
   public char[] getIp7052pm2MqReturnSw() throws CFException{
     if (isIp7052pm2MqReturnSwModified()) { 
        ip7052pm2MqReturnSw = refreshIp7052pm2MqReturnSw();
     }
   		return ip7052pm2MqReturnSw;
   }

  
	/**
	*  set variable ip7052pm2MqReturnSw
	*  Corresponding COBOL Variable is IP7052PM2-MQ-RETURN-SW
	*  @param value
	**/
   public void setIp7052pm2MqReturnSw(char[] value) {
      ip7052pm2MqReturnSw = checkIp7052pm2MqReturnSwConstraints(value);
      serializeIp7052pm2MqReturnSw(ip7052pm2MqReturnSw);
   } 

     /**
	 * 	Update Ip7052pm2MqReturnSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052pm2MqReturnSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052pm2MqReturnSw,ip7052pm2MqReturnSw.length);
   	
   }
   
   public void setIp7052pm2MqReturnSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2MqReturnSw,ip7052pm2MqReturnSw.length);
   	
   }
   
     /**
	 * 	Update Ip7052pm2MqReturnSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pm2MqReturnSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2MqReturnSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052pm2MqReturnSw with another Field
	 *	@param value
	 */
   public void setIp7052pm2MqReturnSw(Field source) {
       replace(source,0,source.length(),beginIp7052pm2MqReturnSw,IP_7052PM_2_MQ_RETURN_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052pm2MqReturnSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052pm2MqReturnSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052pm2MqReturnSw,IP_7052PM_2_MQ_RETURN_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052pm2MqReturnSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pm2MqReturnSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2MqReturnSw+targetIndex,targetLen);
    
   }
	char[] ip7052pm2MqReturnY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp7052pm2MqReturnY88()
	 *	@return  Returns true if isIp7052pm2MqReturnY88() is "Y"
	 */
   public boolean isIp7052pm2MqReturnY88() throws CFException {
      return (  compareChars( getIp7052pm2MqReturnSw() , ip7052pm2MqReturnY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp7052pm2MqReturnY88True() {  			
    	setIp7052pm2MqReturnSw( ip7052pm2MqReturnY8888Value);
   	}
	char[] ip7052pm2MqReturnN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp7052pm2MqReturnN88()
	 *	@return  Returns true if isIp7052pm2MqReturnN88() is "N"
	 */
   public boolean isIp7052pm2MqReturnN88() throws CFException {
      return (  compareChars( getIp7052pm2MqReturnSw() , ip7052pm2MqReturnN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp7052pm2MqReturnN88True() {  			
    	setIp7052pm2MqReturnSw( ip7052pm2MqReturnN8888Value);
   	}
	/**
	 *	Returns the value of ip7052pm2MqTimestamp
	 *	@return ip7052pm2MqTimestamp
	 */
   public char[] getIp7052pm2MqTimestamp() throws CFException{
     if (isIp7052pm2MqTimestampModified()) { 
        ip7052pm2MqTimestamp = refreshIp7052pm2MqTimestamp();
     }
   		return ip7052pm2MqTimestamp;
   }

  
	/**
	*  set variable ip7052pm2MqTimestamp
	*  Corresponding COBOL Variable is IP7052PM2-MQ-TIMESTAMP
	*  @param value
	**/
   public void setIp7052pm2MqTimestamp(char[] value) {
      ip7052pm2MqTimestamp = checkIp7052pm2MqTimestampConstraints(value);
      serializeIp7052pm2MqTimestamp(ip7052pm2MqTimestamp);
   } 

     /**
	 * 	Update Ip7052pm2MqTimestamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052pm2MqTimestamp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052pm2MqTimestamp,ip7052pm2MqTimestamp.length);
   	
   }
   
   public void setIp7052pm2MqTimestamp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2MqTimestamp,ip7052pm2MqTimestamp.length);
   	
   }
   
     /**
	 * 	Update Ip7052pm2MqTimestamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pm2MqTimestamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2MqTimestamp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052pm2MqTimestamp with another Field
	 *	@param value
	 */
   public void setIp7052pm2MqTimestamp(Field source) {
       replace(source,0,source.length(),beginIp7052pm2MqTimestamp,IP_7052PM_2_MQ_TIMESTAMP_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052pm2MqTimestamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052pm2MqTimestamp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052pm2MqTimestamp,IP_7052PM_2_MQ_TIMESTAMP_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052pm2MqTimestamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pm2MqTimestamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2MqTimestamp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7052pm2QmgrName
	 *	@return ip7052pm2QmgrName
	 */
   public char[] getIp7052pm2QmgrName() throws CFException{
     if (isIp7052pm2QmgrNameModified()) { 
        ip7052pm2QmgrName = refreshIp7052pm2QmgrName();
     }
   		return ip7052pm2QmgrName;
   }

  
	/**
	*  set variable ip7052pm2QmgrName
	*  Corresponding COBOL Variable is IP7052PM2-QMGR-NAME
	*  @param value
	**/
   public void setIp7052pm2QmgrName(char[] value) {
      ip7052pm2QmgrName = checkIp7052pm2QmgrNameConstraints(value);
      serializeIp7052pm2QmgrName(ip7052pm2QmgrName);
   } 

     /**
	 * 	Update Ip7052pm2QmgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052pm2QmgrName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052pm2QmgrName,ip7052pm2QmgrName.length);
   	
   }
   
   public void setIp7052pm2QmgrName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2QmgrName,ip7052pm2QmgrName.length);
   	
   }
   
     /**
	 * 	Update Ip7052pm2QmgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pm2QmgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2QmgrName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052pm2QmgrName with another Field
	 *	@param value
	 */
   public void setIp7052pm2QmgrName(Field source) {
       replace(source,0,source.length(),beginIp7052pm2QmgrName,IP_7052PM_2_QMGR_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052pm2QmgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052pm2QmgrName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052pm2QmgrName,IP_7052PM_2_QMGR_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052pm2QmgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pm2QmgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2QmgrName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7052pm2QName
	 *	@return ip7052pm2QName
	 */
   public char[] getIp7052pm2QName() throws CFException{
     if (isIp7052pm2QNameModified()) { 
        ip7052pm2QName = refreshIp7052pm2QName();
     }
   		return ip7052pm2QName;
   }

  
	/**
	*  set variable ip7052pm2QName
	*  Corresponding COBOL Variable is IP7052PM2-Q-NAME
	*  @param value
	**/
   public void setIp7052pm2QName(char[] value) {
      ip7052pm2QName = checkIp7052pm2QNameConstraints(value);
      serializeIp7052pm2QName(ip7052pm2QName);
   } 

     /**
	 * 	Update Ip7052pm2QName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052pm2QName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052pm2QName,ip7052pm2QName.length);
   	
   }
   
   public void setIp7052pm2QName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2QName,ip7052pm2QName.length);
   	
   }
   
     /**
	 * 	Update Ip7052pm2QName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pm2QName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2QName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052pm2QName with another Field
	 *	@param value
	 */
   public void setIp7052pm2QName(Field source) {
       replace(source,0,source.length(),beginIp7052pm2QName,IP_7052PM_2_QNAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052pm2QName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052pm2QName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052pm2QName,IP_7052PM_2_QNAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052pm2QName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pm2QName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2QName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7052pm2TargetQmgrName
	 *	@return ip7052pm2TargetQmgrName
	 */
   public char[] getIp7052pm2TargetQmgrName() throws CFException{
     if (isIp7052pm2TargetQmgrNameModified()) { 
        ip7052pm2TargetQmgrName = refreshIp7052pm2TargetQmgrName();
     }
   		return ip7052pm2TargetQmgrName;
   }

  
	/**
	*  set variable ip7052pm2TargetQmgrName
	*  Corresponding COBOL Variable is IP7052PM2-TARGET-QMGR-NAME
	*  @param value
	**/
   public void setIp7052pm2TargetQmgrName(char[] value) {
      ip7052pm2TargetQmgrName = checkIp7052pm2TargetQmgrNameConstraints(value);
      serializeIp7052pm2TargetQmgrName(ip7052pm2TargetQmgrName);
   } 

     /**
	 * 	Update Ip7052pm2TargetQmgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052pm2TargetQmgrName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052pm2TargetQmgrName,ip7052pm2TargetQmgrName.length);
   	
   }
   
   public void setIp7052pm2TargetQmgrName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2TargetQmgrName,ip7052pm2TargetQmgrName.length);
   	
   }
   
     /**
	 * 	Update Ip7052pm2TargetQmgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pm2TargetQmgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2TargetQmgrName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052pm2TargetQmgrName with another Field
	 *	@param value
	 */
   public void setIp7052pm2TargetQmgrName(Field source) {
       replace(source,0,source.length(),beginIp7052pm2TargetQmgrName,IP_7052PM_2_TARGET_QMGR_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052pm2TargetQmgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052pm2TargetQmgrName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052pm2TargetQmgrName,IP_7052PM_2_TARGET_QMGR_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052pm2TargetQmgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pm2TargetQmgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2TargetQmgrName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7052pm2TargetQName
	 *	@return ip7052pm2TargetQName
	 */
   public char[] getIp7052pm2TargetQName() throws CFException{
     if (isIp7052pm2TargetQNameModified()) { 
        ip7052pm2TargetQName = refreshIp7052pm2TargetQName();
     }
   		return ip7052pm2TargetQName;
   }

  
	/**
	*  set variable ip7052pm2TargetQName
	*  Corresponding COBOL Variable is IP7052PM2-TARGET-Q-NAME
	*  @param value
	**/
   public void setIp7052pm2TargetQName(char[] value) {
      ip7052pm2TargetQName = checkIp7052pm2TargetQNameConstraints(value);
      serializeIp7052pm2TargetQName(ip7052pm2TargetQName);
   } 

     /**
	 * 	Update Ip7052pm2TargetQName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052pm2TargetQName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052pm2TargetQName,ip7052pm2TargetQName.length);
   	
   }
   
   public void setIp7052pm2TargetQName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2TargetQName,ip7052pm2TargetQName.length);
   	
   }
   
     /**
	 * 	Update Ip7052pm2TargetQName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pm2TargetQName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2TargetQName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052pm2TargetQName with another Field
	 *	@param value
	 */
   public void setIp7052pm2TargetQName(Field source) {
       replace(source,0,source.length(),beginIp7052pm2TargetQName,IP_7052PM_2_TARGET_QNAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052pm2TargetQName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052pm2TargetQName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052pm2TargetQName,IP_7052PM_2_TARGET_QNAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052pm2TargetQName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pm2TargetQName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2TargetQName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7052pm2Hconn
	 *	@return ip7052pm2Hconn
	 */
	public int getIp7052pm2Hconn() throws CFException {
        if (isIp7052pm2HconnModified()) { 
           ip7052pm2Hconn = refreshIp7052pm2Hconn();
        }
   		return ip7052pm2Hconn;
	}
	
	/**
	 * 	Update Ip7052pm2Hconn with the passed value
	 *  Corresponding COBOL Variable is IP7052PM2-HCONN
	 *	@param number
	 */
	public void setIp7052pm2Hconn(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip7052pm2Hconn = checkIp7052pm2HconnMaxLimit(number); 
		serializeIp7052pm2Hconn(ip7052pm2Hconn);
	}


	public void setIp7052pm2Hconn(long number) {
	    number = checkIp7052pm2HconnMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7052pm2Hconn((int)number);
	}
	
	/**
	 *	Returns the value of ip7052pm2Hobj
	 *	@return ip7052pm2Hobj
	 */
	public int getIp7052pm2Hobj() throws CFException {
        if (isIp7052pm2HobjModified()) { 
           ip7052pm2Hobj = refreshIp7052pm2Hobj();
        }
   		return ip7052pm2Hobj;
	}
	
	/**
	 * 	Update Ip7052pm2Hobj with the passed value
	 *  Corresponding COBOL Variable is IP7052PM2-HOBJ
	 *	@param number
	 */
	public void setIp7052pm2Hobj(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip7052pm2Hobj = checkIp7052pm2HobjMaxLimit(number); 
		serializeIp7052pm2Hobj(ip7052pm2Hobj);
	}


	public void setIp7052pm2Hobj(long number) {
	    number = checkIp7052pm2HobjMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7052pm2Hobj((int)number);
	}
	
	/**
	 *	Returns the value of ip7052pm2CompCd
	 *	@return ip7052pm2CompCd
	 */
	public int getIp7052pm2CompCd() throws CFException {
        if (isIp7052pm2CompCdModified()) { 
           ip7052pm2CompCd = refreshIp7052pm2CompCd();
        }
   		return ip7052pm2CompCd;
	}
	
	/**
	 * 	Update Ip7052pm2CompCd with the passed value
	 *  Corresponding COBOL Variable is IP7052PM2-COMP-CD
	 *	@param number
	 */
	public void setIp7052pm2CompCd(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip7052pm2CompCd = checkIp7052pm2CompCdMaxLimit(number); 
		serializeIp7052pm2CompCd(ip7052pm2CompCd);
	}


	public void setIp7052pm2CompCd(long number) {
	    number = checkIp7052pm2CompCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7052pm2CompCd((int)number);
	}
	
	/**
	 *	Returns the value of ip7052pm2ResnCd
	 *	@return ip7052pm2ResnCd
	 */
	public int getIp7052pm2ResnCd() throws CFException {
        if (isIp7052pm2ResnCdModified()) { 
           ip7052pm2ResnCd = refreshIp7052pm2ResnCd();
        }
   		return ip7052pm2ResnCd;
	}
	
	/**
	 * 	Update Ip7052pm2ResnCd with the passed value
	 *  Corresponding COBOL Variable is IP7052PM2-RESN-CD
	 *	@param number
	 */
	public void setIp7052pm2ResnCd(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip7052pm2ResnCd = checkIp7052pm2ResnCdMaxLimit(number); 
		serializeIp7052pm2ResnCd(ip7052pm2ResnCd);
	}


	public void setIp7052pm2ResnCd(long number) {
	    number = checkIp7052pm2ResnCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7052pm2ResnCd((int)number);
	}
	
	
	/**
	 *	Test condition 2033 for isIp7052pm2NoMsgAvailable88()
	 *	@return  Returns true if isIp7052pm2NoMsgAvailable88() is 2033
	 */
   public boolean isIp7052pm2NoMsgAvailable88() throws CFException {
      return (  getIp7052pm2ResnCd()  ==  2033  );
   }


	/**
	*  set values 2033
	*/
   	public void setIp7052pm2NoMsgAvailable88True() {  			
    	setIp7052pm2ResnCd( 2033);
   	}
	/**
	 *	Returns the value of ip7052pm2Options
	 *	@return ip7052pm2Options
	 */
	public int getIp7052pm2Options() throws CFException {
        if (isIp7052pm2OptionsModified()) { 
           ip7052pm2Options = refreshIp7052pm2Options();
        }
   		return ip7052pm2Options;
	}
	
	/**
	 * 	Update Ip7052pm2Options with the passed value
	 *  Corresponding COBOL Variable is IP7052PM2-OPTIONS
	 *	@param number
	 */
	public void setIp7052pm2Options(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip7052pm2Options = checkIp7052pm2OptionsMaxLimit(number); 
		serializeIp7052pm2Options(ip7052pm2Options);
	}


	public void setIp7052pm2Options(long number) {
	    number = checkIp7052pm2OptionsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7052pm2Options((int)number);
	}
	
	/**
	 *	Returns the value of ip7052pm2DataLength
	 *	@return ip7052pm2DataLength
	 */
	public int getIp7052pm2DataLength() throws CFException {
        if (isIp7052pm2DataLengthModified()) { 
           ip7052pm2DataLength = refreshIp7052pm2DataLength();
        }
   		return ip7052pm2DataLength;
	}
	
	/**
	 * 	Update Ip7052pm2DataLength with the passed value
	 *  Corresponding COBOL Variable is IP7052PM2-DATA-LENGTH
	 *	@param number
	 */
	public void setIp7052pm2DataLength(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip7052pm2DataLength = checkIp7052pm2DataLengthMaxLimit(number); 
		serializeIp7052pm2DataLength(ip7052pm2DataLength);
	}


	public void setIp7052pm2DataLength(long number) {
	    number = checkIp7052pm2DataLengthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7052pm2DataLength((int)number);
	}
	
	/**
	 *	Returns the value of ip7052pm2MsgBufferLen
	 *	@return ip7052pm2MsgBufferLen
	 */
	public int getIp7052pm2MsgBufferLen() throws CFException {
        if (isIp7052pm2MsgBufferLenModified()) { 
           ip7052pm2MsgBufferLen = refreshIp7052pm2MsgBufferLen();
        }
   		return ip7052pm2MsgBufferLen;
	}
	
	/**
	 * 	Update Ip7052pm2MsgBufferLen with the passed value
	 *  Corresponding COBOL Variable is IP7052PM2-MSG-BUFFER-LEN
	 *	@param number
	 */
	public void setIp7052pm2MsgBufferLen(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip7052pm2MsgBufferLen = checkIp7052pm2MsgBufferLenMaxLimit(number); 
		serializeIp7052pm2MsgBufferLen(ip7052pm2MsgBufferLen);
	}


	public void setIp7052pm2MsgBufferLen(long number) {
	    number = checkIp7052pm2MsgBufferLenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7052pm2MsgBufferLen((int)number);
	}
	
	/**
	 *	Returns the value of ip7052pm2MsgBuffer
	 *	@return ip7052pm2MsgBuffer
	 */
   public char[] getIp7052pm2MsgBuffer() throws CFException{
     if (isIp7052pm2MsgBufferModified()) { 
        ip7052pm2MsgBuffer = refreshIp7052pm2MsgBuffer();
     }
   		return ip7052pm2MsgBuffer;
   }

  
	/**
	*  set variable ip7052pm2MsgBuffer
	*  Corresponding COBOL Variable is IP7052PM2-MSG-BUFFER
	*  @param value
	**/
   public void setIp7052pm2MsgBuffer(char[] value) {
      ip7052pm2MsgBuffer = checkIp7052pm2MsgBufferConstraints(value);
      serializeIp7052pm2MsgBuffer(ip7052pm2MsgBuffer);
   } 

     /**
	 * 	Update Ip7052pm2MsgBuffer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052pm2MsgBuffer(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052pm2MsgBuffer,ip7052pm2MsgBuffer.length);
   	
   }
   
   public void setIp7052pm2MsgBuffer(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2MsgBuffer,ip7052pm2MsgBuffer.length);
   	
   }
   
     /**
	 * 	Update Ip7052pm2MsgBuffer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pm2MsgBuffer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2MsgBuffer+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052pm2MsgBuffer with another Field
	 *	@param value
	 */
   public void setIp7052pm2MsgBuffer(Field source) {
       replace(source,0,source.length(),beginIp7052pm2MsgBuffer,IP_7052PM_2_MSG_BUFFER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052pm2MsgBuffer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052pm2MsgBuffer(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052pm2MsgBuffer,IP_7052PM_2_MSG_BUFFER_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052pm2MsgBuffer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pm2MsgBuffer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2MsgBuffer+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7052pm2ProcDelay
	 *	@return ip7052pm2ProcDelay
	 */   
	 public Ip7052pm2ProcDelay getIp7052pm2ProcDelay() {
   	return ip7052pm2ProcDelay;
   }
   /**
	* 	Update Ip7052pm2ProcDelay with the passed value
	*   Corresponding COBOL Variable is IP7052PM2-PROC-DELAY
	*	@param value
	*/
   public void setIp7052pm2ProcDelay(char[] value) {
      ip7052pm2ProcDelay.setString(value); 
   }   
    
     /**
	 * 	Update Ip7052pm2ProcDelay 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp7052pm2ProcDelay(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7052pm2ProcDelay.begin,ip7052pm2ProcDelay.length());
   }
   
     /**
	 * 	Update Ip7052pm2ProcDelay 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pm2ProcDelay(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7052pm2ProcDelay.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip7052pm2ProcDelay with another Field
	 *	@param value
	 */
   public void setIp7052pm2ProcDelay(Field source) {
   	replace(source,0,source.length(),ip7052pm2ProcDelay.begin,ip7052pm2ProcDelay.length());
   }  
   
     /**
	 * 	Update Ip7052pm2ProcDelay 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp7052pm2ProcDelay(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7052pm2ProcDelay.begin,ip7052pm2ProcDelay.length());
   }
   
     /**
	 * 	Update Ip7052pm2ProcDelay 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pm2ProcDelay(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7052pm2ProcDelay.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip7052pm2MqApiLayout
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp7052pm2RequestCd(CONSTANTS.SPACE_4);
         setIp7052pm2MqBypassSw(CONSTANTS.SPACE);
         setIp7052pm2MqReturnSw(CONSTANTS.SPACE);
         setIp7052pm2MqTimestamp(CONSTANTS.SPACE_26);
         setIp7052pm2QmgrName(CONSTANTS.SPACE_48);
         setIp7052pm2QName(CONSTANTS.SPACE_48);
         setIp7052pm2TargetQmgrName(CONSTANTS.SPACE_48);
         setIp7052pm2TargetQName(CONSTANTS.SPACE_48);
                     setIp7052pm2Hconn(0);
                     setIp7052pm2Hobj(0);
                     setIp7052pm2CompCd(0);
                     setIp7052pm2ResnCd(0);
                     setIp7052pm2Options(0);
                     setIp7052pm2DataLength(0);
                     setIp7052pm2MsgBufferLen(0);
         setIp7052pm2MsgBuffer(CONSTANTS.SPACE_4000000);
          ip7052pm2ProcDelay.initialize();
     
   }

		public static int getIp7052pm2MqApiLayoutFieldLength() {
			return IP_7052PM_2_MQ_API_LAYOUT_LENGTH;
		}

}
  
