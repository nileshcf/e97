package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301LnCloneOwnerIdGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip70301LnCloneOwnerIdGroup")

public class Ip70301LnCloneOwnerIdGroup extends Ip70301LnCloneOwnerIdGroupSerialized  implements InitializingBean {
   

						private char[] ip70301LnCloneOwnerId = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip70301LnCloneOwnerIdGroup
	**/
    public Ip70301LnCloneOwnerIdGroup() {
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
	 *	Returns the value of ip70301LnCloneOwnerId
	 *	@return ip70301LnCloneOwnerId
	 */
   public char[] getIp70301LnCloneOwnerId() throws CFException{
     if (isIp70301LnCloneOwnerIdModified()) { 
        ip70301LnCloneOwnerId = refreshIp70301LnCloneOwnerId();
     }
   		return ip70301LnCloneOwnerId;
   }

  
	/**
	*  set variable ip70301LnCloneOwnerId
	*  Corresponding COBOL Variable is IP70301-LN-CLONE-OWNER-ID
	*  @param value
	**/
   public void setIp70301LnCloneOwnerId(char[] value) {
      ip70301LnCloneOwnerId = checkIp70301LnCloneOwnerIdConstraints(value);
      serializeIp70301LnCloneOwnerId(ip70301LnCloneOwnerId);
   } 

     /**
	 * 	Update Ip70301LnCloneOwnerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301LnCloneOwnerId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301LnCloneOwnerId,ip70301LnCloneOwnerId.length);
   	
   }
   
   public void setIp70301LnCloneOwnerId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301LnCloneOwnerId,ip70301LnCloneOwnerId.length);
   	
   }
   
     /**
	 * 	Update Ip70301LnCloneOwnerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301LnCloneOwnerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301LnCloneOwnerId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301LnCloneOwnerId with another Field
	 *	@param value
	 */
   public void setIp70301LnCloneOwnerId(Field source) {
       replace(source,0,source.length(),beginIp70301LnCloneOwnerId,IP_70301_LN_CLONE_OWNER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301LnCloneOwnerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301LnCloneOwnerId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301LnCloneOwnerId,IP_70301_LN_CLONE_OWNER_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301LnCloneOwnerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301LnCloneOwnerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301LnCloneOwnerId+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIp70301LnCloneOwnerIdGroupFieldLength() {
			return IP_70301_LN_CLONE_OWNER_ID_GROUP_LENGTH;
		}

}
  
