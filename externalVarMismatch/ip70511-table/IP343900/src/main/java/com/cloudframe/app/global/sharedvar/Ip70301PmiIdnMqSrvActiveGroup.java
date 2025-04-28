package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301PmiIdnMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class Ip70301PmiIdnMqSrvActiveGroup extends Ip70301PmiIdnMqSrvActiveGroupSerialized { 
   

						private char[] ip70301PmiIdnMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301PmiIdnMqSrvActiveGroup
	**/
    public Ip70301PmiIdnMqSrvActiveGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip70301PmiIdnMqSrvActive
	 *	@return ip70301PmiIdnMqSrvActive
	 */
   public char[] getIp70301PmiIdnMqSrvActive() throws CFException{
     if (isIp70301PmiIdnMqSrvActiveModified()) { 
        ip70301PmiIdnMqSrvActive = refreshIp70301PmiIdnMqSrvActive();
     }
   		return ip70301PmiIdnMqSrvActive;
   }

  
	/**
	*  set variable ip70301PmiIdnMqSrvActive
	*  Corresponding COBOL Variable is IP70301-PMI-IDN-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301PmiIdnMqSrvActive(char[] value) {
      ip70301PmiIdnMqSrvActive = checkIp70301PmiIdnMqSrvActiveConstraints(value);
      serializeIp70301PmiIdnMqSrvActive(ip70301PmiIdnMqSrvActive);
   } 

     /**
	 * 	Update Ip70301PmiIdnMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301PmiIdnMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301PmiIdnMqSrvActive,ip70301PmiIdnMqSrvActive.length);
   	
   }
   
   public void setIp70301PmiIdnMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmiIdnMqSrvActive,ip70301PmiIdnMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301PmiIdnMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmiIdnMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmiIdnMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301PmiIdnMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301PmiIdnMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301PmiIdnMqSrvActive,IP_70301_PMI_IDN_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301PmiIdnMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301PmiIdnMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301PmiIdnMqSrvActive,IP_70301_PMI_IDN_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301PmiIdnMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmiIdnMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmiIdnMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301PmiIdnMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301PmiIdnMqActveY88()
	 *	@return  Returns true if isIp70301PmiIdnMqActveY88() is "Y"
	 */
   public boolean isIp70301PmiIdnMqActveY88() throws CFException {
      return (  compareChars( getIp70301PmiIdnMqSrvActive() , ip70301PmiIdnMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301PmiIdnMqActveY88True() {  			
    	setIp70301PmiIdnMqSrvActive( ip70301PmiIdnMqActveY8888Value);
   	}
	char[] ip70301PmiIdnMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301PmiIdnMqActveN88()
	 *	@return  Returns true if isIp70301PmiIdnMqActveN88() is "N"
	 */
   public boolean isIp70301PmiIdnMqActveN88() throws CFException {
      return (  compareChars( getIp70301PmiIdnMqSrvActive() , ip70301PmiIdnMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301PmiIdnMqActveN88True() {  			
    	setIp70301PmiIdnMqSrvActive( ip70301PmiIdnMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301PmiIdnMqSrvActiveGroupFieldLength() {
			return IP_70301_PMI_IDN_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
