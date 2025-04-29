package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip40004IntMsgHdrRecGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip40004IntMsgHdrRecGroup")

public class Ip40004IntMsgHdrRecGroup extends Ip40004IntMsgHdrRecGroupSerialized  implements InitializingBean {
   
					private Ip40004IntMsgHdrRec ip40004IntMsgHdrRec = new Ip40004IntMsgHdrRec();
					private Ip40004IntMsgDtlRec ip40004IntMsgDtlRec = new Ip40004IntMsgDtlRec();
	
	/**
	* Constructor for Ip40004IntMsgHdrRecGroup
	**/
    public Ip40004IntMsgHdrRecGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip40004IntMsgHdrRec.setParent(this,getStartOffset() + 0);
	       			ip40004IntMsgDtlRec.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip40004IntMsgHdrRec
	 *	@return ip40004IntMsgHdrRec
	 */   
	 public Ip40004IntMsgHdrRec getIp40004IntMsgHdrRec() {
   	return ip40004IntMsgHdrRec;
   }
   /**
	* 	Update Ip40004IntMsgHdrRec with the passed value
	*   Corresponding COBOL Variable is IP40004-INT-MSG-HDR-REC
	*	@param value
	*/
   public void setIp40004IntMsgHdrRec(char[] value) {
      ip40004IntMsgHdrRec.setString(value); 
   }   
    
     /**
	 * 	Update Ip40004IntMsgHdrRec 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp40004IntMsgHdrRec(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip40004IntMsgHdrRec.begin,ip40004IntMsgHdrRec.length());
   }
   
     /**
	 * 	Update Ip40004IntMsgHdrRec 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004IntMsgHdrRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip40004IntMsgHdrRec.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip40004IntMsgHdrRec with another Field
	 *	@param value
	 */
   public void setIp40004IntMsgHdrRec(Field source) {
   	replace(source,0,source.length(),ip40004IntMsgHdrRec.begin,ip40004IntMsgHdrRec.length());
   }  
   
     /**
	 * 	Update Ip40004IntMsgHdrRec 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp40004IntMsgHdrRec(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip40004IntMsgHdrRec.begin,ip40004IntMsgHdrRec.length());
   }
   
     /**
	 * 	Update Ip40004IntMsgHdrRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004IntMsgHdrRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip40004IntMsgHdrRec.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip40004IntMsgDtlRec
	 *	@return ip40004IntMsgDtlRec
	 */   
	 public Ip40004IntMsgDtlRec getIp40004IntMsgDtlRec() {
   	return ip40004IntMsgDtlRec;
   }
   /**
	* 	Update Ip40004IntMsgDtlRec with the passed value
	*   Corresponding COBOL Variable is IP40004-INT-MSG-DTL-REC
	*	@param value
	*/
   public void setIp40004IntMsgDtlRec(char[] value) {
      ip40004IntMsgDtlRec.setString(value); 
   }   
    
     /**
	 * 	Update Ip40004IntMsgDtlRec 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp40004IntMsgDtlRec(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip40004IntMsgDtlRec.begin,ip40004IntMsgDtlRec.length());
   }
   
     /**
	 * 	Update Ip40004IntMsgDtlRec 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004IntMsgDtlRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip40004IntMsgDtlRec.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip40004IntMsgDtlRec with another Field
	 *	@param value
	 */
   public void setIp40004IntMsgDtlRec(Field source) {
   	replace(source,0,source.length(),ip40004IntMsgDtlRec.begin,ip40004IntMsgDtlRec.length());
   }  
   
     /**
	 * 	Update Ip40004IntMsgDtlRec 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp40004IntMsgDtlRec(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip40004IntMsgDtlRec.begin,ip40004IntMsgDtlRec.length());
   }
   
     /**
	 * 	Update Ip40004IntMsgDtlRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004IntMsgDtlRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip40004IntMsgDtlRec.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIp40004IntMsgHdrRecGroupFieldLength() {
			return IP_40004_INT_MSG_HDR_REC_GROUP_LENGTH;
		}

}
  
