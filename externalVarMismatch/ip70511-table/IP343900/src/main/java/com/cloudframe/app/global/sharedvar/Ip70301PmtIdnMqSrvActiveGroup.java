package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301PmtIdnMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class Ip70301PmtIdnMqSrvActiveGroup extends Ip70301PmtIdnMqSrvActiveGroupSerialized { 
   

						private char[] ip70301PmtIdnMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301PmtIdnMqSrvActiveGroup
	**/
    public Ip70301PmtIdnMqSrvActiveGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip70301PmtIdnMqSrvActive
	 *	@return ip70301PmtIdnMqSrvActive
	 */
   public char[] getIp70301PmtIdnMqSrvActive() throws CFException{
     if (isIp70301PmtIdnMqSrvActiveModified()) { 
        ip70301PmtIdnMqSrvActive = refreshIp70301PmtIdnMqSrvActive();
     }
   		return ip70301PmtIdnMqSrvActive;
   }

  
	/**
	*  set variable ip70301PmtIdnMqSrvActive
	*  Corresponding COBOL Variable is IP70301-PMT-IDN-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301PmtIdnMqSrvActive(char[] value) {
      ip70301PmtIdnMqSrvActive = checkIp70301PmtIdnMqSrvActiveConstraints(value);
      serializeIp70301PmtIdnMqSrvActive(ip70301PmtIdnMqSrvActive);
   } 

     /**
	 * 	Update Ip70301PmtIdnMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301PmtIdnMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301PmtIdnMqSrvActive,ip70301PmtIdnMqSrvActive.length);
   	
   }
   
   public void setIp70301PmtIdnMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmtIdnMqSrvActive,ip70301PmtIdnMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301PmtIdnMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmtIdnMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmtIdnMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301PmtIdnMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301PmtIdnMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301PmtIdnMqSrvActive,IP_70301_PMT_IDN_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301PmtIdnMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301PmtIdnMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301PmtIdnMqSrvActive,IP_70301_PMT_IDN_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301PmtIdnMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmtIdnMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmtIdnMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301PmtIdnMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301PmtIdnMqActveY88()
	 *	@return  Returns true if isIp70301PmtIdnMqActveY88() is "Y"
	 */
   public boolean isIp70301PmtIdnMqActveY88() throws CFException {
      return (  compareChars( getIp70301PmtIdnMqSrvActive() , ip70301PmtIdnMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301PmtIdnMqActveY88True() {  			
    	setIp70301PmtIdnMqSrvActive( ip70301PmtIdnMqActveY8888Value);
   	}
	char[] ip70301PmtIdnMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301PmtIdnMqActveN88()
	 *	@return  Returns true if isIp70301PmtIdnMqActveN88() is "N"
	 */
   public boolean isIp70301PmtIdnMqActveN88() throws CFException {
      return (  compareChars( getIp70301PmtIdnMqSrvActive() , ip70301PmtIdnMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301PmtIdnMqActveN88True() {  			
    	setIp70301PmtIdnMqSrvActive( ip70301PmtIdnMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301PmtIdnMqSrvActiveGroupFieldLength() {
			return IP_70301_PMT_IDN_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
