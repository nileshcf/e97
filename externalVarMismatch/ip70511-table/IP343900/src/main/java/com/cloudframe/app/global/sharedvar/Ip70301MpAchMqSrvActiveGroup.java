package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301MpAchMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class Ip70301MpAchMqSrvActiveGroup extends Ip70301MpAchMqSrvActiveGroupSerialized { 
   

						private char[] ip70301MpAchMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301MpAchMqSrvActiveGroup
	**/
    public Ip70301MpAchMqSrvActiveGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip70301MpAchMqSrvActive
	 *	@return ip70301MpAchMqSrvActive
	 */
   public char[] getIp70301MpAchMqSrvActive() throws CFException{
     if (isIp70301MpAchMqSrvActiveModified()) { 
        ip70301MpAchMqSrvActive = refreshIp70301MpAchMqSrvActive();
     }
   		return ip70301MpAchMqSrvActive;
   }

  
	/**
	*  set variable ip70301MpAchMqSrvActive
	*  Corresponding COBOL Variable is IP70301-MP-ACH-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301MpAchMqSrvActive(char[] value) {
      ip70301MpAchMqSrvActive = checkIp70301MpAchMqSrvActiveConstraints(value);
      serializeIp70301MpAchMqSrvActive(ip70301MpAchMqSrvActive);
   } 

     /**
	 * 	Update Ip70301MpAchMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301MpAchMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301MpAchMqSrvActive,ip70301MpAchMqSrvActive.length);
   	
   }
   
   public void setIp70301MpAchMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301MpAchMqSrvActive,ip70301MpAchMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301MpAchMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301MpAchMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301MpAchMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301MpAchMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301MpAchMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301MpAchMqSrvActive,IP_70301_MP_ACH_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301MpAchMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301MpAchMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301MpAchMqSrvActive,IP_70301_MP_ACH_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301MpAchMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301MpAchMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301MpAchMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301MpAchMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301MpAchMqActveY88()
	 *	@return  Returns true if isIp70301MpAchMqActveY88() is "Y"
	 */
   public boolean isIp70301MpAchMqActveY88() throws CFException {
      return (  compareChars( getIp70301MpAchMqSrvActive() , ip70301MpAchMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301MpAchMqActveY88True() {  			
    	setIp70301MpAchMqSrvActive( ip70301MpAchMqActveY8888Value);
   	}
	char[] ip70301MpAchMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301MpAchMqActveN88()
	 *	@return  Returns true if isIp70301MpAchMqActveN88() is "N"
	 */
   public boolean isIp70301MpAchMqActveN88() throws CFException {
      return (  compareChars( getIp70301MpAchMqSrvActive() , ip70301MpAchMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301MpAchMqActveN88True() {  			
    	setIp70301MpAchMqSrvActive( ip70301MpAchMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301MpAchMqSrvActiveGroupFieldLength() {
			return IP_70301_MP_ACH_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
