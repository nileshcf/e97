package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7052pmrMqApiLayout is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip7052pmrMqApiLayout")

public class Ip7052pmrMqApiLayout extends Ip7052pmrMqApiLayoutSerialized  implements InitializingBean {
   

						private char[] ip7052pmrRequestCd = Field.fillLowValue(4);

						private char[] ip7052pmrMqBypassSw = Field.fillLowValue(1);

						private char[] ip7052pmrMqReturnSw = Field.fillLowValue(1);

						private char[] ip7052pmrMqTimestamp = Field.fillLowValue(26);

						private char[] ip7052pmrQmgrName = Field.fillLowValue(48);

						private char[] ip7052pmrQName = Field.fillLowValue(48);

						private char[] ip7052pmrTargetQmgrName = Field.fillLowValue(48);

						private char[] ip7052pmrTargetQName = Field.fillLowValue(48);

								private int ip7052pmrHconn;

								private int ip7052pmrHobj;

								private int ip7052pmrCompCd;

								private int ip7052pmrResnCd;

								private int ip7052pmrOptions;

								private int ip7052pmrDataLength;

								private int ip7052pmrMsgBufferLen;

						private char[] ip7052pmrMsgBuffer = Field.fillLowValue(4000000);
				private Ip7052pmrProcDelay ip7052pmrProcDelay = new Ip7052pmrProcDelay();
	
	/**
	* Constructor for Ip7052pmrMqApiLayout
	**/
    public Ip7052pmrMqApiLayout() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip7052pmrProcDelay.setParent(this,getStartOffset() + 4000252);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip7052pmrRequestCd
	 *	@return ip7052pmrRequestCd
	 */
   public char[] getIp7052pmrRequestCd() throws CFException{
     if (isIp7052pmrRequestCdModified()) { 
        ip7052pmrRequestCd = refreshIp7052pmrRequestCd();
     }
   		return ip7052pmrRequestCd;
   }

  
	/**
	*  set variable ip7052pmrRequestCd
	*  Corresponding COBOL Variable is IP7052PMR-REQUEST-CD
	*  @param value
	**/
   public void setIp7052pmrRequestCd(char[] value) {
      ip7052pmrRequestCd = checkIp7052pmrRequestCdConstraints(value);
      serializeIp7052pmrRequestCd(ip7052pmrRequestCd);
   } 

     /**
	 * 	Update Ip7052pmrRequestCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052pmrRequestCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052pmrRequestCd,ip7052pmrRequestCd.length);
   	
   }
   
   public void setIp7052pmrRequestCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrRequestCd,ip7052pmrRequestCd.length);
   	
   }
   
     /**
	 * 	Update Ip7052pmrRequestCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pmrRequestCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrRequestCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052pmrRequestCd with another Field
	 *	@param value
	 */
   public void setIp7052pmrRequestCd(Field source) {
       replace(source,0,source.length(),beginIp7052pmrRequestCd,IP_7052PMR_REQUEST_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052pmrRequestCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052pmrRequestCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052pmrRequestCd,IP_7052PMR_REQUEST_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052pmrRequestCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pmrRequestCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrRequestCd+targetIndex,targetLen);
    
   }
	char[] ip7052pmrConnect8888Value = "CONN".toCharArray();
	/**
	 *	Test condition "CONN" for isIp7052pmrConnect88()
	 *	@return  Returns true if isIp7052pmrConnect88() is "CONN"
	 */
   public boolean isIp7052pmrConnect88() throws CFException {
      return (  compareChars( getIp7052pmrRequestCd() , ip7052pmrConnect8888Value)  == 0  );
   }


	/**
	*  set values "CONN"
	*/
   	public void setIp7052pmrConnect88True() {  			
    	setIp7052pmrRequestCd( ip7052pmrConnect8888Value);
   	}
	char[] ip7052pmrOpen8888Value = "OPEN".toCharArray();
	/**
	 *	Test condition "OPEN" for isIp7052pmrOpen88()
	 *	@return  Returns true if isIp7052pmrOpen88() is "OPEN"
	 */
   public boolean isIp7052pmrOpen88() throws CFException {
      return (  compareChars( getIp7052pmrRequestCd() , ip7052pmrOpen8888Value)  == 0  );
   }


	/**
	*  set values "OPEN"
	*/
   	public void setIp7052pmrOpen88True() {  			
    	setIp7052pmrRequestCd( ip7052pmrOpen8888Value);
   	}
	char[] ip7052pmrPut8888Value = "PUT ".toCharArray();
	/**
	 *	Test condition "PUT " for isIp7052pmrPut88()
	 *	@return  Returns true if isIp7052pmrPut88() is "PUT "
	 */
   public boolean isIp7052pmrPut88() throws CFException {
      return (  compareChars( getIp7052pmrRequestCd() , ip7052pmrPut8888Value)  == 0  );
   }


	/**
	*  set values "PUT "
	*/
   	public void setIp7052pmrPut88True() {  			
    	setIp7052pmrRequestCd( ip7052pmrPut8888Value);
   	}
	char[] ip7052pmrGet8888Value = "GET ".toCharArray();
	/**
	 *	Test condition "GET " for isIp7052pmrGet88()
	 *	@return  Returns true if isIp7052pmrGet88() is "GET "
	 */
   public boolean isIp7052pmrGet88() throws CFException {
      return (  compareChars( getIp7052pmrRequestCd() , ip7052pmrGet8888Value)  == 0  );
   }


	/**
	*  set values "GET "
	*/
   	public void setIp7052pmrGet88True() {  			
    	setIp7052pmrRequestCd( ip7052pmrGet8888Value);
   	}
	char[] ip7052pmrClose8888Value = "CLOS".toCharArray();
	/**
	 *	Test condition "CLOS" for isIp7052pmrClose88()
	 *	@return  Returns true if isIp7052pmrClose88() is "CLOS"
	 */
   public boolean isIp7052pmrClose88() throws CFException {
      return (  compareChars( getIp7052pmrRequestCd() , ip7052pmrClose8888Value)  == 0  );
   }


	/**
	*  set values "CLOS"
	*/
   	public void setIp7052pmrClose88True() {  			
    	setIp7052pmrRequestCd( ip7052pmrClose8888Value);
   	}
	char[] ip7052pmrDisconnect8888Value = "DISC".toCharArray();
	/**
	 *	Test condition "DISC" for isIp7052pmrDisconnect88()
	 *	@return  Returns true if isIp7052pmrDisconnect88() is "DISC"
	 */
   public boolean isIp7052pmrDisconnect88() throws CFException {
      return (  compareChars( getIp7052pmrRequestCd() , ip7052pmrDisconnect8888Value)  == 0  );
   }


	/**
	*  set values "DISC"
	*/
   	public void setIp7052pmrDisconnect88True() {  			
    	setIp7052pmrRequestCd( ip7052pmrDisconnect8888Value);
   	}
	char[] ip7052pmrBrowse8888Value = "BROW".toCharArray();
	/**
	 *	Test condition "BROW" for isIp7052pmrBrowse88()
	 *	@return  Returns true if isIp7052pmrBrowse88() is "BROW"
	 */
   public boolean isIp7052pmrBrowse88() throws CFException {
      return (  compareChars( getIp7052pmrRequestCd() , ip7052pmrBrowse8888Value)  == 0  );
   }


	/**
	*  set values "BROW"
	*/
   	public void setIp7052pmrBrowse88True() {  			
    	setIp7052pmrRequestCd( ip7052pmrBrowse8888Value);
   	}
	char[] ip7052pmrPurge8888Value = "PURG".toCharArray();
	/**
	 *	Test condition "PURG" for isIp7052pmrPurge88()
	 *	@return  Returns true if isIp7052pmrPurge88() is "PURG"
	 */
   public boolean isIp7052pmrPurge88() throws CFException {
      return (  compareChars( getIp7052pmrRequestCd() , ip7052pmrPurge8888Value)  == 0  );
   }


	/**
	*  set values "PURG"
	*/
   	public void setIp7052pmrPurge88True() {  			
    	setIp7052pmrRequestCd( ip7052pmrPurge8888Value);
   	}
	/**
	 *	Returns the value of ip7052pmrMqBypassSw
	 *	@return ip7052pmrMqBypassSw
	 */
   public char[] getIp7052pmrMqBypassSw() throws CFException{
     if (isIp7052pmrMqBypassSwModified()) { 
        ip7052pmrMqBypassSw = refreshIp7052pmrMqBypassSw();
     }
   		return ip7052pmrMqBypassSw;
   }

  
	/**
	*  set variable ip7052pmrMqBypassSw
	*  Corresponding COBOL Variable is IP7052PMR-MQ-BYPASS-SW
	*  @param value
	**/
   public void setIp7052pmrMqBypassSw(char[] value) {
      ip7052pmrMqBypassSw = checkIp7052pmrMqBypassSwConstraints(value);
      serializeIp7052pmrMqBypassSw(ip7052pmrMqBypassSw);
   } 

     /**
	 * 	Update Ip7052pmrMqBypassSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052pmrMqBypassSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052pmrMqBypassSw,ip7052pmrMqBypassSw.length);
   	
   }
   
   public void setIp7052pmrMqBypassSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrMqBypassSw,ip7052pmrMqBypassSw.length);
   	
   }
   
     /**
	 * 	Update Ip7052pmrMqBypassSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pmrMqBypassSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrMqBypassSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052pmrMqBypassSw with another Field
	 *	@param value
	 */
   public void setIp7052pmrMqBypassSw(Field source) {
       replace(source,0,source.length(),beginIp7052pmrMqBypassSw,IP_7052PMR_MQ_BYPASS_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052pmrMqBypassSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052pmrMqBypassSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052pmrMqBypassSw,IP_7052PMR_MQ_BYPASS_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052pmrMqBypassSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pmrMqBypassSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrMqBypassSw+targetIndex,targetLen);
    
   }
	char[] ip7052pmrMqBypassY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp7052pmrMqBypassY88()
	 *	@return  Returns true if isIp7052pmrMqBypassY88() is "Y"
	 */
   public boolean isIp7052pmrMqBypassY88() throws CFException {
      return (  compareChars( getIp7052pmrMqBypassSw() , ip7052pmrMqBypassY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp7052pmrMqBypassY88True() {  			
    	setIp7052pmrMqBypassSw( ip7052pmrMqBypassY8888Value);
   	}
	char[] ip7052pmrMqBypassN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp7052pmrMqBypassN88()
	 *	@return  Returns true if isIp7052pmrMqBypassN88() is "N"
	 */
   public boolean isIp7052pmrMqBypassN88() throws CFException {
      return (  compareChars( getIp7052pmrMqBypassSw() , ip7052pmrMqBypassN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp7052pmrMqBypassN88True() {  			
    	setIp7052pmrMqBypassSw( ip7052pmrMqBypassN8888Value);
   	}
	/**
	 *	Returns the value of ip7052pmrMqReturnSw
	 *	@return ip7052pmrMqReturnSw
	 */
   public char[] getIp7052pmrMqReturnSw() throws CFException{
     if (isIp7052pmrMqReturnSwModified()) { 
        ip7052pmrMqReturnSw = refreshIp7052pmrMqReturnSw();
     }
   		return ip7052pmrMqReturnSw;
   }

  
	/**
	*  set variable ip7052pmrMqReturnSw
	*  Corresponding COBOL Variable is IP7052PMR-MQ-RETURN-SW
	*  @param value
	**/
   public void setIp7052pmrMqReturnSw(char[] value) {
      ip7052pmrMqReturnSw = checkIp7052pmrMqReturnSwConstraints(value);
      serializeIp7052pmrMqReturnSw(ip7052pmrMqReturnSw);
   } 

     /**
	 * 	Update Ip7052pmrMqReturnSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052pmrMqReturnSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052pmrMqReturnSw,ip7052pmrMqReturnSw.length);
   	
   }
   
   public void setIp7052pmrMqReturnSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrMqReturnSw,ip7052pmrMqReturnSw.length);
   	
   }
   
     /**
	 * 	Update Ip7052pmrMqReturnSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pmrMqReturnSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrMqReturnSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052pmrMqReturnSw with another Field
	 *	@param value
	 */
   public void setIp7052pmrMqReturnSw(Field source) {
       replace(source,0,source.length(),beginIp7052pmrMqReturnSw,IP_7052PMR_MQ_RETURN_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052pmrMqReturnSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052pmrMqReturnSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052pmrMqReturnSw,IP_7052PMR_MQ_RETURN_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052pmrMqReturnSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pmrMqReturnSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrMqReturnSw+targetIndex,targetLen);
    
   }
	char[] ip7052pmrMqReturnY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp7052pmrMqReturnY88()
	 *	@return  Returns true if isIp7052pmrMqReturnY88() is "Y"
	 */
   public boolean isIp7052pmrMqReturnY88() throws CFException {
      return (  compareChars( getIp7052pmrMqReturnSw() , ip7052pmrMqReturnY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp7052pmrMqReturnY88True() {  			
    	setIp7052pmrMqReturnSw( ip7052pmrMqReturnY8888Value);
   	}
	char[] ip7052pmrMqReturnN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp7052pmrMqReturnN88()
	 *	@return  Returns true if isIp7052pmrMqReturnN88() is "N"
	 */
   public boolean isIp7052pmrMqReturnN88() throws CFException {
      return (  compareChars( getIp7052pmrMqReturnSw() , ip7052pmrMqReturnN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp7052pmrMqReturnN88True() {  			
    	setIp7052pmrMqReturnSw( ip7052pmrMqReturnN8888Value);
   	}
	/**
	 *	Returns the value of ip7052pmrMqTimestamp
	 *	@return ip7052pmrMqTimestamp
	 */
   public char[] getIp7052pmrMqTimestamp() throws CFException{
     if (isIp7052pmrMqTimestampModified()) { 
        ip7052pmrMqTimestamp = refreshIp7052pmrMqTimestamp();
     }
   		return ip7052pmrMqTimestamp;
   }

  
	/**
	*  set variable ip7052pmrMqTimestamp
	*  Corresponding COBOL Variable is IP7052PMR-MQ-TIMESTAMP
	*  @param value
	**/
   public void setIp7052pmrMqTimestamp(char[] value) {
      ip7052pmrMqTimestamp = checkIp7052pmrMqTimestampConstraints(value);
      serializeIp7052pmrMqTimestamp(ip7052pmrMqTimestamp);
   } 

     /**
	 * 	Update Ip7052pmrMqTimestamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052pmrMqTimestamp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052pmrMqTimestamp,ip7052pmrMqTimestamp.length);
   	
   }
   
   public void setIp7052pmrMqTimestamp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrMqTimestamp,ip7052pmrMqTimestamp.length);
   	
   }
   
     /**
	 * 	Update Ip7052pmrMqTimestamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pmrMqTimestamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrMqTimestamp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052pmrMqTimestamp with another Field
	 *	@param value
	 */
   public void setIp7052pmrMqTimestamp(Field source) {
       replace(source,0,source.length(),beginIp7052pmrMqTimestamp,IP_7052PMR_MQ_TIMESTAMP_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052pmrMqTimestamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052pmrMqTimestamp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052pmrMqTimestamp,IP_7052PMR_MQ_TIMESTAMP_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052pmrMqTimestamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pmrMqTimestamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrMqTimestamp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7052pmrQmgrName
	 *	@return ip7052pmrQmgrName
	 */
   public char[] getIp7052pmrQmgrName() throws CFException{
     if (isIp7052pmrQmgrNameModified()) { 
        ip7052pmrQmgrName = refreshIp7052pmrQmgrName();
     }
   		return ip7052pmrQmgrName;
   }

  
	/**
	*  set variable ip7052pmrQmgrName
	*  Corresponding COBOL Variable is IP7052PMR-QMGR-NAME
	*  @param value
	**/
   public void setIp7052pmrQmgrName(char[] value) {
      ip7052pmrQmgrName = checkIp7052pmrQmgrNameConstraints(value);
      serializeIp7052pmrQmgrName(ip7052pmrQmgrName);
   } 

     /**
	 * 	Update Ip7052pmrQmgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052pmrQmgrName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052pmrQmgrName,ip7052pmrQmgrName.length);
   	
   }
   
   public void setIp7052pmrQmgrName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrQmgrName,ip7052pmrQmgrName.length);
   	
   }
   
     /**
	 * 	Update Ip7052pmrQmgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pmrQmgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrQmgrName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052pmrQmgrName with another Field
	 *	@param value
	 */
   public void setIp7052pmrQmgrName(Field source) {
       replace(source,0,source.length(),beginIp7052pmrQmgrName,IP_7052PMR_QMGR_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052pmrQmgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052pmrQmgrName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052pmrQmgrName,IP_7052PMR_QMGR_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052pmrQmgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pmrQmgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrQmgrName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7052pmrQName
	 *	@return ip7052pmrQName
	 */
   public char[] getIp7052pmrQName() throws CFException{
     if (isIp7052pmrQNameModified()) { 
        ip7052pmrQName = refreshIp7052pmrQName();
     }
   		return ip7052pmrQName;
   }

  
	/**
	*  set variable ip7052pmrQName
	*  Corresponding COBOL Variable is IP7052PMR-Q-NAME
	*  @param value
	**/
   public void setIp7052pmrQName(char[] value) {
      ip7052pmrQName = checkIp7052pmrQNameConstraints(value);
      serializeIp7052pmrQName(ip7052pmrQName);
   } 

     /**
	 * 	Update Ip7052pmrQName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052pmrQName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052pmrQName,ip7052pmrQName.length);
   	
   }
   
   public void setIp7052pmrQName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrQName,ip7052pmrQName.length);
   	
   }
   
     /**
	 * 	Update Ip7052pmrQName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pmrQName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrQName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052pmrQName with another Field
	 *	@param value
	 */
   public void setIp7052pmrQName(Field source) {
       replace(source,0,source.length(),beginIp7052pmrQName,IP_7052PMR_QNAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052pmrQName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052pmrQName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052pmrQName,IP_7052PMR_QNAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052pmrQName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pmrQName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrQName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7052pmrTargetQmgrName
	 *	@return ip7052pmrTargetQmgrName
	 */
   public char[] getIp7052pmrTargetQmgrName() throws CFException{
     if (isIp7052pmrTargetQmgrNameModified()) { 
        ip7052pmrTargetQmgrName = refreshIp7052pmrTargetQmgrName();
     }
   		return ip7052pmrTargetQmgrName;
   }

  
	/**
	*  set variable ip7052pmrTargetQmgrName
	*  Corresponding COBOL Variable is IP7052PMR-TARGET-QMGR-NAME
	*  @param value
	**/
   public void setIp7052pmrTargetQmgrName(char[] value) {
      ip7052pmrTargetQmgrName = checkIp7052pmrTargetQmgrNameConstraints(value);
      serializeIp7052pmrTargetQmgrName(ip7052pmrTargetQmgrName);
   } 

     /**
	 * 	Update Ip7052pmrTargetQmgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052pmrTargetQmgrName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052pmrTargetQmgrName,ip7052pmrTargetQmgrName.length);
   	
   }
   
   public void setIp7052pmrTargetQmgrName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrTargetQmgrName,ip7052pmrTargetQmgrName.length);
   	
   }
   
     /**
	 * 	Update Ip7052pmrTargetQmgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pmrTargetQmgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrTargetQmgrName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052pmrTargetQmgrName with another Field
	 *	@param value
	 */
   public void setIp7052pmrTargetQmgrName(Field source) {
       replace(source,0,source.length(),beginIp7052pmrTargetQmgrName,IP_7052PMR_TARGET_QMGR_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052pmrTargetQmgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052pmrTargetQmgrName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052pmrTargetQmgrName,IP_7052PMR_TARGET_QMGR_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052pmrTargetQmgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pmrTargetQmgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrTargetQmgrName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7052pmrTargetQName
	 *	@return ip7052pmrTargetQName
	 */
   public char[] getIp7052pmrTargetQName() throws CFException{
     if (isIp7052pmrTargetQNameModified()) { 
        ip7052pmrTargetQName = refreshIp7052pmrTargetQName();
     }
   		return ip7052pmrTargetQName;
   }

  
	/**
	*  set variable ip7052pmrTargetQName
	*  Corresponding COBOL Variable is IP7052PMR-TARGET-Q-NAME
	*  @param value
	**/
   public void setIp7052pmrTargetQName(char[] value) {
      ip7052pmrTargetQName = checkIp7052pmrTargetQNameConstraints(value);
      serializeIp7052pmrTargetQName(ip7052pmrTargetQName);
   } 

     /**
	 * 	Update Ip7052pmrTargetQName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052pmrTargetQName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052pmrTargetQName,ip7052pmrTargetQName.length);
   	
   }
   
   public void setIp7052pmrTargetQName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrTargetQName,ip7052pmrTargetQName.length);
   	
   }
   
     /**
	 * 	Update Ip7052pmrTargetQName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pmrTargetQName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrTargetQName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052pmrTargetQName with another Field
	 *	@param value
	 */
   public void setIp7052pmrTargetQName(Field source) {
       replace(source,0,source.length(),beginIp7052pmrTargetQName,IP_7052PMR_TARGET_QNAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052pmrTargetQName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052pmrTargetQName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052pmrTargetQName,IP_7052PMR_TARGET_QNAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052pmrTargetQName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pmrTargetQName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrTargetQName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7052pmrHconn
	 *	@return ip7052pmrHconn
	 */
	public int getIp7052pmrHconn() throws CFException {
        if (isIp7052pmrHconnModified()) { 
           ip7052pmrHconn = refreshIp7052pmrHconn();
        }
   		return ip7052pmrHconn;
	}
	
	/**
	 * 	Update Ip7052pmrHconn with the passed value
	 *  Corresponding COBOL Variable is IP7052PMR-HCONN
	 *	@param number
	 */
	public void setIp7052pmrHconn(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip7052pmrHconn = checkIp7052pmrHconnMaxLimit(number); 
		serializeIp7052pmrHconn(ip7052pmrHconn);
	}


	public void setIp7052pmrHconn(long number) {
	    number = checkIp7052pmrHconnMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7052pmrHconn((int)number);
	}
	
	/**
	 *	Returns the value of ip7052pmrHobj
	 *	@return ip7052pmrHobj
	 */
	public int getIp7052pmrHobj() throws CFException {
        if (isIp7052pmrHobjModified()) { 
           ip7052pmrHobj = refreshIp7052pmrHobj();
        }
   		return ip7052pmrHobj;
	}
	
	/**
	 * 	Update Ip7052pmrHobj with the passed value
	 *  Corresponding COBOL Variable is IP7052PMR-HOBJ
	 *	@param number
	 */
	public void setIp7052pmrHobj(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip7052pmrHobj = checkIp7052pmrHobjMaxLimit(number); 
		serializeIp7052pmrHobj(ip7052pmrHobj);
	}


	public void setIp7052pmrHobj(long number) {
	    number = checkIp7052pmrHobjMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7052pmrHobj((int)number);
	}
	
	/**
	 *	Returns the value of ip7052pmrCompCd
	 *	@return ip7052pmrCompCd
	 */
	public int getIp7052pmrCompCd() throws CFException {
        if (isIp7052pmrCompCdModified()) { 
           ip7052pmrCompCd = refreshIp7052pmrCompCd();
        }
   		return ip7052pmrCompCd;
	}
	
	/**
	 * 	Update Ip7052pmrCompCd with the passed value
	 *  Corresponding COBOL Variable is IP7052PMR-COMP-CD
	 *	@param number
	 */
	public void setIp7052pmrCompCd(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip7052pmrCompCd = checkIp7052pmrCompCdMaxLimit(number); 
		serializeIp7052pmrCompCd(ip7052pmrCompCd);
	}


	public void setIp7052pmrCompCd(long number) {
	    number = checkIp7052pmrCompCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7052pmrCompCd((int)number);
	}
	
	/**
	 *	Returns the value of ip7052pmrResnCd
	 *	@return ip7052pmrResnCd
	 */
	public int getIp7052pmrResnCd() throws CFException {
        if (isIp7052pmrResnCdModified()) { 
           ip7052pmrResnCd = refreshIp7052pmrResnCd();
        }
   		return ip7052pmrResnCd;
	}
	
	/**
	 * 	Update Ip7052pmrResnCd with the passed value
	 *  Corresponding COBOL Variable is IP7052PMR-RESN-CD
	 *	@param number
	 */
	public void setIp7052pmrResnCd(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip7052pmrResnCd = checkIp7052pmrResnCdMaxLimit(number); 
		serializeIp7052pmrResnCd(ip7052pmrResnCd);
	}


	public void setIp7052pmrResnCd(long number) {
	    number = checkIp7052pmrResnCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7052pmrResnCd((int)number);
	}
	
	
	/**
	 *	Test condition 2033 for isIp7052pmrNoMsgAvailable88()
	 *	@return  Returns true if isIp7052pmrNoMsgAvailable88() is 2033
	 */
   public boolean isIp7052pmrNoMsgAvailable88() throws CFException {
      return (  getIp7052pmrResnCd()  ==  2033  );
   }


	/**
	*  set values 2033
	*/
   	public void setIp7052pmrNoMsgAvailable88True() {  			
    	setIp7052pmrResnCd( 2033);
   	}
	/**
	 *	Returns the value of ip7052pmrOptions
	 *	@return ip7052pmrOptions
	 */
	public int getIp7052pmrOptions() throws CFException {
        if (isIp7052pmrOptionsModified()) { 
           ip7052pmrOptions = refreshIp7052pmrOptions();
        }
   		return ip7052pmrOptions;
	}
	
	/**
	 * 	Update Ip7052pmrOptions with the passed value
	 *  Corresponding COBOL Variable is IP7052PMR-OPTIONS
	 *	@param number
	 */
	public void setIp7052pmrOptions(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip7052pmrOptions = checkIp7052pmrOptionsMaxLimit(number); 
		serializeIp7052pmrOptions(ip7052pmrOptions);
	}


	public void setIp7052pmrOptions(long number) {
	    number = checkIp7052pmrOptionsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7052pmrOptions((int)number);
	}
	
	/**
	 *	Returns the value of ip7052pmrDataLength
	 *	@return ip7052pmrDataLength
	 */
	public int getIp7052pmrDataLength() throws CFException {
        if (isIp7052pmrDataLengthModified()) { 
           ip7052pmrDataLength = refreshIp7052pmrDataLength();
        }
   		return ip7052pmrDataLength;
	}
	
	/**
	 * 	Update Ip7052pmrDataLength with the passed value
	 *  Corresponding COBOL Variable is IP7052PMR-DATA-LENGTH
	 *	@param number
	 */
	public void setIp7052pmrDataLength(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip7052pmrDataLength = checkIp7052pmrDataLengthMaxLimit(number); 
		serializeIp7052pmrDataLength(ip7052pmrDataLength);
	}


	public void setIp7052pmrDataLength(long number) {
	    number = checkIp7052pmrDataLengthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7052pmrDataLength((int)number);
	}
	
	/**
	 *	Returns the value of ip7052pmrMsgBufferLen
	 *	@return ip7052pmrMsgBufferLen
	 */
	public int getIp7052pmrMsgBufferLen() throws CFException {
        if (isIp7052pmrMsgBufferLenModified()) { 
           ip7052pmrMsgBufferLen = refreshIp7052pmrMsgBufferLen();
        }
   		return ip7052pmrMsgBufferLen;
	}
	
	/**
	 * 	Update Ip7052pmrMsgBufferLen with the passed value
	 *  Corresponding COBOL Variable is IP7052PMR-MSG-BUFFER-LEN
	 *	@param number
	 */
	public void setIp7052pmrMsgBufferLen(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip7052pmrMsgBufferLen = checkIp7052pmrMsgBufferLenMaxLimit(number); 
		serializeIp7052pmrMsgBufferLen(ip7052pmrMsgBufferLen);
	}


	public void setIp7052pmrMsgBufferLen(long number) {
	    number = checkIp7052pmrMsgBufferLenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp7052pmrMsgBufferLen((int)number);
	}
	
	/**
	 *	Returns the value of ip7052pmrMsgBuffer
	 *	@return ip7052pmrMsgBuffer
	 */
   public char[] getIp7052pmrMsgBuffer() throws CFException{
     if (isIp7052pmrMsgBufferModified()) { 
        ip7052pmrMsgBuffer = refreshIp7052pmrMsgBuffer();
     }
   		return ip7052pmrMsgBuffer;
   }

  
	/**
	*  set variable ip7052pmrMsgBuffer
	*  Corresponding COBOL Variable is IP7052PMR-MSG-BUFFER
	*  @param value
	**/
   public void setIp7052pmrMsgBuffer(char[] value) {
      ip7052pmrMsgBuffer = checkIp7052pmrMsgBufferConstraints(value);
      serializeIp7052pmrMsgBuffer(ip7052pmrMsgBuffer);
   } 

     /**
	 * 	Update Ip7052pmrMsgBuffer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052pmrMsgBuffer(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052pmrMsgBuffer,ip7052pmrMsgBuffer.length);
   	
   }
   
   public void setIp7052pmrMsgBuffer(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrMsgBuffer,ip7052pmrMsgBuffer.length);
   	
   }
   
     /**
	 * 	Update Ip7052pmrMsgBuffer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pmrMsgBuffer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrMsgBuffer+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052pmrMsgBuffer with another Field
	 *	@param value
	 */
   public void setIp7052pmrMsgBuffer(Field source) {
       replace(source,0,source.length(),beginIp7052pmrMsgBuffer,IP_7052PMR_MSG_BUFFER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052pmrMsgBuffer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052pmrMsgBuffer(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052pmrMsgBuffer,IP_7052PMR_MSG_BUFFER_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052pmrMsgBuffer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pmrMsgBuffer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrMsgBuffer+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip7052pmrProcDelay
	 *	@return ip7052pmrProcDelay
	 */   
	 public Ip7052pmrProcDelay getIp7052pmrProcDelay() {
   	return ip7052pmrProcDelay;
   }
   /**
	* 	Update Ip7052pmrProcDelay with the passed value
	*   Corresponding COBOL Variable is IP7052PMR-PROC-DELAY
	*	@param value
	*/
   public void setIp7052pmrProcDelay(char[] value) {
      ip7052pmrProcDelay.setString(value); 
   }   
    
     /**
	 * 	Update Ip7052pmrProcDelay 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp7052pmrProcDelay(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7052pmrProcDelay.begin,ip7052pmrProcDelay.length());
   }
   
     /**
	 * 	Update Ip7052pmrProcDelay 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pmrProcDelay(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7052pmrProcDelay.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip7052pmrProcDelay with another Field
	 *	@param value
	 */
   public void setIp7052pmrProcDelay(Field source) {
   	replace(source,0,source.length(),ip7052pmrProcDelay.begin,ip7052pmrProcDelay.length());
   }  
   
     /**
	 * 	Update Ip7052pmrProcDelay 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp7052pmrProcDelay(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip7052pmrProcDelay.begin,ip7052pmrProcDelay.length());
   }
   
     /**
	 * 	Update Ip7052pmrProcDelay 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pmrProcDelay(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip7052pmrProcDelay.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip7052pmrMqApiLayout
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp7052pmrRequestCd(CONSTANTS.SPACE_4);
         setIp7052pmrMqBypassSw(CONSTANTS.SPACE);
         setIp7052pmrMqReturnSw(CONSTANTS.SPACE);
         setIp7052pmrMqTimestamp(CONSTANTS.SPACE_26);
         setIp7052pmrQmgrName(CONSTANTS.SPACE_48);
         setIp7052pmrQName(CONSTANTS.SPACE_48);
         setIp7052pmrTargetQmgrName(CONSTANTS.SPACE_48);
         setIp7052pmrTargetQName(CONSTANTS.SPACE_48);
                     setIp7052pmrHconn(0);
                     setIp7052pmrHobj(0);
                     setIp7052pmrCompCd(0);
                     setIp7052pmrResnCd(0);
                     setIp7052pmrOptions(0);
                     setIp7052pmrDataLength(0);
                     setIp7052pmrMsgBufferLen(0);
         setIp7052pmrMsgBuffer(CONSTANTS.SPACE_4000000);
          ip7052pmrProcDelay.initialize();
     
   }

		public static int getIp7052pmrMqApiLayoutFieldLength() {
			return IP_7052PMR_MQ_API_LAYOUT_LENGTH;
		}

}
  
