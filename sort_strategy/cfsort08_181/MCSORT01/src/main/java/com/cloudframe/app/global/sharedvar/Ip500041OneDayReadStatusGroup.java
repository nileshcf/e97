package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip500041OneDayReadStatusGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:57. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip500041OneDayReadStatusGroup")

public class Ip500041OneDayReadStatusGroup extends Ip500041OneDayReadStatusGroupSerialized  implements InitializingBean {
   

						private char[] ip500041OneDayReadStatus = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip500041OneDayReadStatusGroup
	**/
    public Ip500041OneDayReadStatusGroup() {
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
	 *	Returns the value of ip500041OneDayReadStatus
	 *	@return ip500041OneDayReadStatus
	 */
   public char[] getIp500041OneDayReadStatus() throws CFException{
     if (isIp500041OneDayReadStatusModified()) { 
        ip500041OneDayReadStatus = refreshIp500041OneDayReadStatus();
     }
   		return ip500041OneDayReadStatus;
   }

  
	/**
	*  set variable ip500041OneDayReadStatus
	*  Corresponding COBOL Variable is IP500041-ONE-DAY-READ-STATUS
	*  @param value
	**/
   public void setIp500041OneDayReadStatus(char[] value) {
      ip500041OneDayReadStatus = checkIp500041OneDayReadStatusConstraints(value);
      serializeIp500041OneDayReadStatus(ip500041OneDayReadStatus);
   } 

     /**
	 * 	Update Ip500041OneDayReadStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp500041OneDayReadStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp500041OneDayReadStatus,ip500041OneDayReadStatus.length);
   	
   }
   
   public void setIp500041OneDayReadStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp500041OneDayReadStatus,ip500041OneDayReadStatus.length);
   	
   }
   
     /**
	 * 	Update Ip500041OneDayReadStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp500041OneDayReadStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp500041OneDayReadStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip500041OneDayReadStatus with another Field
	 *	@param value
	 */
   public void setIp500041OneDayReadStatus(Field source) {
       replace(source,0,source.length(),beginIp500041OneDayReadStatus,IP_500041_ONE_DAY_READ_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip500041OneDayReadStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp500041OneDayReadStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp500041OneDayReadStatus,IP_500041_ONE_DAY_READ_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update Ip500041OneDayReadStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp500041OneDayReadStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp500041OneDayReadStatus+targetIndex,targetLen);
    
   }
	char[] ip500041TblLastRecY8888Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isIp500041TblLastRecY88()
	 *	@return  Returns true if isIp500041TblLastRecY88() is "00"
	 */
   public boolean isIp500041TblLastRecY88() throws CFException {
      return (  compareChars( getIp500041OneDayReadStatus() , ip500041TblLastRecY8888Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setIp500041TblLastRecY88True() {  			
    	setIp500041OneDayReadStatus( ip500041TblLastRecY8888Value);
   	}
	char[] ip500041TblLastRecN8888Value = "02".toCharArray();
	/**
	 *	Test condition "02" for isIp500041TblLastRecN88()
	 *	@return  Returns true if isIp500041TblLastRecN88() is "02"
	 */
   public boolean isIp500041TblLastRecN88() throws CFException {
      return (  compareChars( getIp500041OneDayReadStatus() , ip500041TblLastRecN8888Value)  == 0  );
   }


	/**
	*  set values "02"
	*/
   	public void setIp500041TblLastRecN88True() {  			
    	setIp500041OneDayReadStatus( ip500041TblLastRecN8888Value);
   	}
	char[] ip500041NoReqTblRecs8888Value = "23".toCharArray();
	/**
	 *	Test condition "23" for isIp500041NoReqTblRecs88()
	 *	@return  Returns true if isIp500041NoReqTblRecs88() is "23"
	 */
   public boolean isIp500041NoReqTblRecs88() throws CFException {
      return (  compareChars( getIp500041OneDayReadStatus() , ip500041NoReqTblRecs8888Value)  == 0  );
   }


	/**
	*  set values "23"
	*/
   	public void setIp500041NoReqTblRecs88True() {  			
    	setIp500041OneDayReadStatus( ip500041NoReqTblRecs8888Value);
   	}

	
	
	

		public static int getIp500041OneDayReadStatusGroupFieldLength() {
			return IP_500041_ONE_DAY_READ_STATUS_GROUP_LENGTH;
		}

}
  
