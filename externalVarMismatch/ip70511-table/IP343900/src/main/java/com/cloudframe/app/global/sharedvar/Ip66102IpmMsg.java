package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66102IpmMsg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip66102IpmMsg")

public class Ip66102IpmMsg extends Ip66102IpmMsgSerialized  implements InitializingBean {
   
				private Ip66102NormalIpmMsg ip66102NormalIpmMsg = new Ip66102NormalIpmMsg();
				private Ip66102NormalIpmMsgRedefined ip66102NormalIpmMsgRedefined = new Ip66102NormalIpmMsgRedefined();
	
	/**
	* Constructor for Ip66102IpmMsg
	**/
    public Ip66102IpmMsg() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip66102NormalIpmMsg.setParent(this,getStartOffset() + 0);
	       			ip66102NormalIpmMsgRedefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip66102NormalIpmMsg
	 *	@return ip66102NormalIpmMsg
	 */   
	 public Ip66102NormalIpmMsg getIp66102NormalIpmMsg() {
   	return ip66102NormalIpmMsg;
   }
   /**
	* 	Update Ip66102NormalIpmMsg with the passed value
	*   Corresponding COBOL Variable is IP66102-NORMAL-IPM-MSG
	*	@param value
	*/
   public void setIp66102NormalIpmMsg(char[] value) {
      ip66102NormalIpmMsg.setString(value); 
   }   
    
     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip66102NormalIpmMsg.begin,ip66102NormalIpmMsg.length());
   }
   
     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip66102NormalIpmMsg.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip66102NormalIpmMsg with another Field
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(Field source) {
   	replace(source,0,source.length(),ip66102NormalIpmMsg.begin,ip66102NormalIpmMsg.length());
   }  
   
     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip66102NormalIpmMsg.begin,ip66102NormalIpmMsg.length());
   }
   
     /**
	 * 	Update Ip66102NormalIpmMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102NormalIpmMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip66102NormalIpmMsg.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip66102NormalIpmMsgRedefined
	 *	@return ip66102NormalIpmMsgRedefined
	 */   
	 public Ip66102NormalIpmMsgRedefined getIp66102NormalIpmMsgRedefined() {
   	return ip66102NormalIpmMsgRedefined;
   }
   /**
	* 	Update Ip66102NormalIpmMsgRedefined with the passed value
	*   Corresponding COBOL Variable is IP66102-NORMAL-IPM-MSG-REDEFINED
	*	@param value
	*/
   public void setIp66102NormalIpmMsgRedefined(char[] value) {
      ip66102NormalIpmMsgRedefined.setString(value); 
   }   
    
     /**
	 * 	Update Ip66102NormalIpmMsgRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp66102NormalIpmMsgRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip66102NormalIpmMsgRedefined.begin,ip66102NormalIpmMsgRedefined.length());
   }
   
     /**
	 * 	Update Ip66102NormalIpmMsgRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102NormalIpmMsgRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip66102NormalIpmMsgRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip66102NormalIpmMsgRedefined with another Field
	 *	@param value
	 */
   public void setIp66102NormalIpmMsgRedefined(Field source) {
   	replace(source,0,source.length(),ip66102NormalIpmMsgRedefined.begin,ip66102NormalIpmMsgRedefined.length());
   }  
   
     /**
	 * 	Update Ip66102NormalIpmMsgRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp66102NormalIpmMsgRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip66102NormalIpmMsgRedefined.begin,ip66102NormalIpmMsgRedefined.length());
   }
   
     /**
	 * 	Update Ip66102NormalIpmMsgRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102NormalIpmMsgRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip66102NormalIpmMsgRedefined.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip66102IpmMsg
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip66102NormalIpmMsg.initialize();
     
   }

		public static int getIp66102IpmMsgFieldLength() {
			return IP_66102_IPM_MSG_LENGTH;
		}

}
  
