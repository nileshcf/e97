package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005oOneDayReadStatusGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip50005oOneDayReadStatusGroup")

public class Ip50005oOneDayReadStatusGroup extends Ip50005oOneDayReadStatusGroupSerialized  implements InitializingBean {
   

						private char[] ip50005oOneDayReadStatus = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip50005oOneDayReadStatusGroup
	**/
    public Ip50005oOneDayReadStatusGroup() {
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
	 *	Returns the value of ip50005oOneDayReadStatus
	 *	@return ip50005oOneDayReadStatus
	 */
   public char[] getIp50005oOneDayReadStatus() throws CFException{
     if (isIp50005oOneDayReadStatusModified()) { 
        ip50005oOneDayReadStatus = refreshIp50005oOneDayReadStatus();
     }
   		return ip50005oOneDayReadStatus;
   }

  
	/**
	*  set variable ip50005oOneDayReadStatus
	*  Corresponding COBOL Variable is IP50005O-ONE-DAY-READ-STATUS
	*  @param value
	**/
   public void setIp50005oOneDayReadStatus(char[] value) {
      ip50005oOneDayReadStatus = checkIp50005oOneDayReadStatusConstraints(value);
      serializeIp50005oOneDayReadStatus(ip50005oOneDayReadStatus);
   } 

     /**
	 * 	Update Ip50005oOneDayReadStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005oOneDayReadStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50005oOneDayReadStatus,ip50005oOneDayReadStatus.length);
   	
   }
   
   public void setIp50005oOneDayReadStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005oOneDayReadStatus,ip50005oOneDayReadStatus.length);
   	
   }
   
     /**
	 * 	Update Ip50005oOneDayReadStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oOneDayReadStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005oOneDayReadStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50005oOneDayReadStatus with another Field
	 *	@param value
	 */
   public void setIp50005oOneDayReadStatus(Field source) {
       replace(source,0,source.length(),beginIp50005oOneDayReadStatus,IP_50005O_ONE_DAY_READ_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50005oOneDayReadStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005oOneDayReadStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50005oOneDayReadStatus,IP_50005O_ONE_DAY_READ_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update Ip50005oOneDayReadStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oOneDayReadStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005oOneDayReadStatus+targetIndex,targetLen);
    
   }
	char[] ip50005oOneDayIoGood8888Value1 = "00".toCharArray();
char[] ip50005oOneDayIoGood8888Value2 = "02".toCharArray();

	/**
	 *	Test condition "00" "02" for isIp50005oOneDayIoGood88()
	 *	@return  Returns true if isIp50005oOneDayIoGood88() is "00" "02"
	 */
   public boolean isIp50005oOneDayIoGood88() throws CFException {
      return (  compareChars( getIp50005oOneDayReadStatus() , ip50005oOneDayIoGood8888Value1)  == 0  ||  compareChars( getIp50005oOneDayReadStatus() , ip50005oOneDayIoGood8888Value2)  == 0  );
   }


	/**
	*  set values "00" "02"
	*/
   	public void setIp50005oOneDayIoGood88True() {  			
    	setIp50005oOneDayReadStatus( ip50005oOneDayIoGood8888Value1);
   	}
	char[] ip50005oTblLastRecY8888Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isIp50005oTblLastRecY88()
	 *	@return  Returns true if isIp50005oTblLastRecY88() is "00"
	 */
   public boolean isIp50005oTblLastRecY88() throws CFException {
      return (  compareChars( getIp50005oOneDayReadStatus() , ip50005oTblLastRecY8888Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setIp50005oTblLastRecY88True() {  			
    	setIp50005oOneDayReadStatus( ip50005oTblLastRecY8888Value);
   	}
	char[] ip50005oTblLastRecN8888Value = "02".toCharArray();
	/**
	 *	Test condition "02" for isIp50005oTblLastRecN88()
	 *	@return  Returns true if isIp50005oTblLastRecN88() is "02"
	 */
   public boolean isIp50005oTblLastRecN88() throws CFException {
      return (  compareChars( getIp50005oOneDayReadStatus() , ip50005oTblLastRecN8888Value)  == 0  );
   }


	/**
	*  set values "02"
	*/
   	public void setIp50005oTblLastRecN88True() {  			
    	setIp50005oOneDayReadStatus( ip50005oTblLastRecN8888Value);
   	}
	char[] ip50005oNoReqTblRecs8888Value = "23".toCharArray();
	/**
	 *	Test condition "23" for isIp50005oNoReqTblRecs88()
	 *	@return  Returns true if isIp50005oNoReqTblRecs88() is "23"
	 */
   public boolean isIp50005oNoReqTblRecs88() throws CFException {
      return (  compareChars( getIp50005oOneDayReadStatus() , ip50005oNoReqTblRecs8888Value)  == 0  );
   }


	/**
	*  set values "23"
	*/
   	public void setIp50005oNoReqTblRecs88True() {  			
    	setIp50005oOneDayReadStatus( ip50005oNoReqTblRecs8888Value);
   	}

	
	
	

		public static int getIp50005oOneDayReadStatusGroupFieldLength() {
			return IP_50005O_ONE_DAY_READ_STATUS_GROUP_LENGTH;
		}

}
  
