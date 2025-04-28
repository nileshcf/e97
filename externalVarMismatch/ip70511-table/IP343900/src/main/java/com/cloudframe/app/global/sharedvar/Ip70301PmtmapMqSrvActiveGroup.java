package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301PmtmapMqSrvActiveGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class Ip70301PmtmapMqSrvActiveGroup extends Ip70301PmtmapMqSrvActiveGroupSerialized { 
   

						private char[] ip70301PmtmapMqSrvActive = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70301PmtmapMqSrvActiveGroup
	**/
    public Ip70301PmtmapMqSrvActiveGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip70301PmtmapMqSrvActive
	 *	@return ip70301PmtmapMqSrvActive
	 */
   public char[] getIp70301PmtmapMqSrvActive() throws CFException{
     if (isIp70301PmtmapMqSrvActiveModified()) { 
        ip70301PmtmapMqSrvActive = refreshIp70301PmtmapMqSrvActive();
     }
   		return ip70301PmtmapMqSrvActive;
   }

  
	/**
	*  set variable ip70301PmtmapMqSrvActive
	*  Corresponding COBOL Variable is IP70301-PMTMAP-MQ-SRV-ACTIVE
	*  @param value
	**/
   public void setIp70301PmtmapMqSrvActive(char[] value) {
      ip70301PmtmapMqSrvActive = checkIp70301PmtmapMqSrvActiveConstraints(value);
      serializeIp70301PmtmapMqSrvActive(ip70301PmtmapMqSrvActive);
   } 

     /**
	 * 	Update Ip70301PmtmapMqSrvActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70301PmtmapMqSrvActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70301PmtmapMqSrvActive,ip70301PmtmapMqSrvActive.length);
   	
   }
   
   public void setIp70301PmtmapMqSrvActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmtmapMqSrvActive,ip70301PmtmapMqSrvActive.length);
   	
   }
   
     /**
	 * 	Update Ip70301PmtmapMqSrvActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmtmapMqSrvActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmtmapMqSrvActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70301PmtmapMqSrvActive with another Field
	 *	@param value
	 */
   public void setIp70301PmtmapMqSrvActive(Field source) {
       replace(source,0,source.length(),beginIp70301PmtmapMqSrvActive,IP_70301_PMTMAP_MQ_SRV_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70301PmtmapMqSrvActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70301PmtmapMqSrvActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70301PmtmapMqSrvActive,IP_70301_PMTMAP_MQ_SRV_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update Ip70301PmtmapMqSrvActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70301PmtmapMqSrvActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70301PmtmapMqSrvActive+targetIndex,targetLen);
    
   }
	char[] ip70301PmtmapMqActveY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp70301PmtmapMqActveY88()
	 *	@return  Returns true if isIp70301PmtmapMqActveY88() is "Y"
	 */
   public boolean isIp70301PmtmapMqActveY88() throws CFException {
      return (  compareChars( getIp70301PmtmapMqSrvActive() , ip70301PmtmapMqActveY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp70301PmtmapMqActveY88True() {  			
    	setIp70301PmtmapMqSrvActive( ip70301PmtmapMqActveY8888Value);
   	}
	char[] ip70301PmtmapMqActveN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp70301PmtmapMqActveN88()
	 *	@return  Returns true if isIp70301PmtmapMqActveN88() is "N"
	 */
   public boolean isIp70301PmtmapMqActveN88() throws CFException {
      return (  compareChars( getIp70301PmtmapMqSrvActive() , ip70301PmtmapMqActveN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp70301PmtmapMqActveN88True() {  			
    	setIp70301PmtmapMqSrvActive( ip70301PmtmapMqActveN8888Value);
   	}

	
	
	

		public static int getIp70301PmtmapMqSrvActiveGroupFieldLength() {
			return IP_70301_PMTMAP_MQ_SRV_ACTIVE_GROUP_LENGTH;
		}

}
  
