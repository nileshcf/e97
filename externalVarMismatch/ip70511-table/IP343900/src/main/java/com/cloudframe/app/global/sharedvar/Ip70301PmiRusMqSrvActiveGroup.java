package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301PmiRusMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class Ip70301PmiRusMqSrvActiveGroup extends Ip70301PmiRusMqSrvActiveGroupSerialized { 
   

						private char[] ip70301PmiRusMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301PmiRusMqSrvActiveGroup
	**/
    public Ip70301PmiRusMqSrvActiveGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip70301PmiRusMqSrvActive
	 *	@return ip70301PmiRusMqSrvActive
	 */
   public char[] getIp70301PmiRusMqSrvActive() throws CFException{
     if (isIp70301PmiRusMqSrvActiveModified()) { 
        ip70301PmiRusMqSrvActive = refreshIp70301PmiRusMqSrvActive();
     }
   		return ip70301PmiRusMqSrvActive;
   }

  
	/**
	*  set variable ip70301PmiRusMqSrvActive
	*  Corresponding COBOL Variable is IP70301-PMI-RUS-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301PmiRusMqSrvActive(char[] value) {
      ip70301PmiRusMqSrvActive = checkIp70301PmiRusMqSrvActiveConstraints(value);
      serializeIp70301PmiRusMqSrvActive(ip70301PmiRusMqSrvActive);
   } 

     /**
	 * 	Update Ip70301PmiRusMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301PmiRusMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301PmiRusMqSrvActive,ip70301PmiRusMqSrvActive.length);
   	
   }
   
   public void setIp70301PmiRusMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmiRusMqSrvActive,ip70301PmiRusMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301PmiRusMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmiRusMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmiRusMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301PmiRusMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301PmiRusMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301PmiRusMqSrvActive,IP_70301_PMI_RUS_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301PmiRusMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301PmiRusMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301PmiRusMqSrvActive,IP_70301_PMI_RUS_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301PmiRusMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmiRusMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmiRusMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301PmiRusMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301PmiRusMqActveY88()
	 *	@return  Returns true if isIp70301PmiRusMqActveY88() is "Y"
	 */
   public boolean isIp70301PmiRusMqActveY88() throws CFException {
      return (  compareChars( getIp70301PmiRusMqSrvActive() , ip70301PmiRusMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301PmiRusMqActveY88True() {  			
    	setIp70301PmiRusMqSrvActive( ip70301PmiRusMqActveY8888Value);
   	}
	char[] ip70301PmiRusMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301PmiRusMqActveN88()
	 *	@return  Returns true if isIp70301PmiRusMqActveN88() is "N"
	 */
   public boolean isIp70301PmiRusMqActveN88() throws CFException {
      return (  compareChars( getIp70301PmiRusMqSrvActive() , ip70301PmiRusMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301PmiRusMqActveN88True() {  			
    	setIp70301PmiRusMqSrvActive( ip70301PmiRusMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301PmiRusMqSrvActiveGroupFieldLength() {
			return IP_70301_PMI_RUS_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
