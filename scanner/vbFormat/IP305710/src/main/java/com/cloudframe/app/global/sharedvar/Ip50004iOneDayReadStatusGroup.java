package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50004iOneDayReadStatusGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:40. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip50004iOneDayReadStatusGroup")

public class Ip50004iOneDayReadStatusGroup extends Ip50004iOneDayReadStatusGroupSerialized  implements InitializingBean {
   

						private char[] ip50004iOneDayReadStatus = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip50004iOneDayReadStatusGroup
	**/
    public Ip50004iOneDayReadStatusGroup() {
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
	 *	Returns the value of ip50004iOneDayReadStatus
	 *	@return ip50004iOneDayReadStatus
	 */
   public char[] getIp50004iOneDayReadStatus() throws CFException{
     if (isIp50004iOneDayReadStatusModified()) { 
        ip50004iOneDayReadStatus = refreshIp50004iOneDayReadStatus();
     }
   		return ip50004iOneDayReadStatus;
   }

  
	/**
	*  set variable ip50004iOneDayReadStatus
	*  Corresponding COBOL Variable is IP50004I-ONE-DAY-READ-STATUS
	*  @param value
	**/
   public void setIp50004iOneDayReadStatus(char[] value) {
      ip50004iOneDayReadStatus = checkIp50004iOneDayReadStatusConstraints(value);
      serializeIp50004iOneDayReadStatus(ip50004iOneDayReadStatus);
   } 

     /**
	 * 	Update Ip50004iOneDayReadStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50004iOneDayReadStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50004iOneDayReadStatus,ip50004iOneDayReadStatus.length);
   	
   }
   
   public void setIp50004iOneDayReadStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50004iOneDayReadStatus,ip50004iOneDayReadStatus.length);
   	
   }
   
     /**
	 * 	Update Ip50004iOneDayReadStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iOneDayReadStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50004iOneDayReadStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50004iOneDayReadStatus with another Field
	 *	@param value
	 */
   public void setIp50004iOneDayReadStatus(Field source) {
       replace(source,0,source.length(),beginIp50004iOneDayReadStatus,IP_50004I_ONE_DAY_READ_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50004iOneDayReadStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50004iOneDayReadStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50004iOneDayReadStatus,IP_50004I_ONE_DAY_READ_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update Ip50004iOneDayReadStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iOneDayReadStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50004iOneDayReadStatus+targetIndex,targetLen);
    
   }
	char[] ip50004iOneDayIoGood8888Value1 = "00".toCharArray();
char[] ip50004iOneDayIoGood8888Value2 = "02".toCharArray();

	/**
	 *	Test condition "00" "02" for isIp50004iOneDayIoGood88()
	 *	@return  Returns true if isIp50004iOneDayIoGood88() is "00" "02"
	 */
   public boolean isIp50004iOneDayIoGood88() throws CFException {
      return (  compareChars( getIp50004iOneDayReadStatus() , ip50004iOneDayIoGood8888Value1)  == 0  ||  compareChars( getIp50004iOneDayReadStatus() , ip50004iOneDayIoGood8888Value2)  == 0  );
   }


	/**
	*  set values "00" "02"
	*/
   	public void setIp50004iOneDayIoGood88True() {  			
    	setIp50004iOneDayReadStatus( ip50004iOneDayIoGood8888Value1);
   	}
	char[] ip50004iTblLastRecY8888Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isIp50004iTblLastRecY88()
	 *	@return  Returns true if isIp50004iTblLastRecY88() is "00"
	 */
   public boolean isIp50004iTblLastRecY88() throws CFException {
      return (  compareChars( getIp50004iOneDayReadStatus() , ip50004iTblLastRecY8888Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setIp50004iTblLastRecY88True() {  			
    	setIp50004iOneDayReadStatus( ip50004iTblLastRecY8888Value);
   	}
	char[] ip50004iTblLastRecN8888Value = "02".toCharArray();
	/**
	 *	Test condition "02" for isIp50004iTblLastRecN88()
	 *	@return  Returns true if isIp50004iTblLastRecN88() is "02"
	 */
   public boolean isIp50004iTblLastRecN88() throws CFException {
      return (  compareChars( getIp50004iOneDayReadStatus() , ip50004iTblLastRecN8888Value)  == 0  );
   }


	/**
	*  set values "02"
	*/
   	public void setIp50004iTblLastRecN88True() {  			
    	setIp50004iOneDayReadStatus( ip50004iTblLastRecN8888Value);
   	}
	char[] ip50004iNoReqTblRecs8888Value = "23".toCharArray();
	/**
	 *	Test condition "23" for isIp50004iNoReqTblRecs88()
	 *	@return  Returns true if isIp50004iNoReqTblRecs88() is "23"
	 */
   public boolean isIp50004iNoReqTblRecs88() throws CFException {
      return (  compareChars( getIp50004iOneDayReadStatus() , ip50004iNoReqTblRecs8888Value)  == 0  );
   }


	/**
	*  set values "23"
	*/
   	public void setIp50004iNoReqTblRecs88True() {  			
    	setIp50004iOneDayReadStatus( ip50004iNoReqTblRecs8888Value);
   	}

	
	
	

		public static int getIp50004iOneDayReadStatusGroupFieldLength() {
			return IP_50004I_ONE_DAY_READ_STATUS_GROUP_LENGTH;
		}

}
  
