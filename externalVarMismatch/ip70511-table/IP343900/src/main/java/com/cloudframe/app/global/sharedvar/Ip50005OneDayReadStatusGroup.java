package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005OneDayReadStatusGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip50005OneDayReadStatusGroup")

public class Ip50005OneDayReadStatusGroup extends Ip50005OneDayReadStatusGroupSerialized  implements InitializingBean {
   

						private char[] ip50005OneDayReadStatus = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip50005OneDayReadStatusGroup
	**/
    public Ip50005OneDayReadStatusGroup() {
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
	 *	Returns the value of ip50005OneDayReadStatus
	 *	@return ip50005OneDayReadStatus
	 */
   public char[] getIp50005OneDayReadStatus() throws CFException{
     if (isIp50005OneDayReadStatusModified()) { 
        ip50005OneDayReadStatus = refreshIp50005OneDayReadStatus();
     }
   		return ip50005OneDayReadStatus;
   }

  
	/**
	*  set variable ip50005OneDayReadStatus
	*  Corresponding COBOL Variable is IP50005-ONE-DAY-READ-STATUS
	*  @param value
	**/
   public void setIp50005OneDayReadStatus(char[] value) {
      ip50005OneDayReadStatus = checkIp50005OneDayReadStatusConstraints(value);
      serializeIp50005OneDayReadStatus(ip50005OneDayReadStatus);
   } 

     /**
	 * 	Update Ip50005OneDayReadStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005OneDayReadStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50005OneDayReadStatus,ip50005OneDayReadStatus.length);
   	
   }
   
   public void setIp50005OneDayReadStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005OneDayReadStatus,ip50005OneDayReadStatus.length);
   	
   }
   
     /**
	 * 	Update Ip50005OneDayReadStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005OneDayReadStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005OneDayReadStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50005OneDayReadStatus with another Field
	 *	@param value
	 */
   public void setIp50005OneDayReadStatus(Field source) {
       replace(source,0,source.length(),beginIp50005OneDayReadStatus,IP_50005_ONE_DAY_READ_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50005OneDayReadStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005OneDayReadStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50005OneDayReadStatus,IP_50005_ONE_DAY_READ_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update Ip50005OneDayReadStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005OneDayReadStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005OneDayReadStatus+targetIndex,targetLen);
    
   }
	char[] ip50005OneDayIoGood8888Value1 = "00".toCharArray();
char[] ip50005OneDayIoGood8888Value2 = "02".toCharArray();

	/**
	 *	Test condition "00" "02" for isIp50005OneDayIoGood88()
	 *	@return  Returns true if isIp50005OneDayIoGood88() is "00" "02"
	 */
   public boolean isIp50005OneDayIoGood88() throws CFException {
      return (  compareChars( getIp50005OneDayReadStatus() , ip50005OneDayIoGood8888Value1)  == 0  ||  compareChars( getIp50005OneDayReadStatus() , ip50005OneDayIoGood8888Value2)  == 0  );
   }


	/**
	*  set values "00" "02"
	*/
   	public void setIp50005OneDayIoGood88True() {  			
    	setIp50005OneDayReadStatus( ip50005OneDayIoGood8888Value1);
   	}
	char[] ip50005TblLastRecY8888Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isIp50005TblLastRecY88()
	 *	@return  Returns true if isIp50005TblLastRecY88() is "00"
	 */
   public boolean isIp50005TblLastRecY88() throws CFException {
      return (  compareChars( getIp50005OneDayReadStatus() , ip50005TblLastRecY8888Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setIp50005TblLastRecY88True() {  			
    	setIp50005OneDayReadStatus( ip50005TblLastRecY8888Value);
   	}
	char[] ip50005TblLastRecN8888Value = "02".toCharArray();
	/**
	 *	Test condition "02" for isIp50005TblLastRecN88()
	 *	@return  Returns true if isIp50005TblLastRecN88() is "02"
	 */
   public boolean isIp50005TblLastRecN88() throws CFException {
      return (  compareChars( getIp50005OneDayReadStatus() , ip50005TblLastRecN8888Value)  == 0  );
   }


	/**
	*  set values "02"
	*/
   	public void setIp50005TblLastRecN88True() {  			
    	setIp50005OneDayReadStatus( ip50005TblLastRecN8888Value);
   	}
	char[] ip50005NoReqTblRecs8888Value = "23".toCharArray();
	/**
	 *	Test condition "23" for isIp50005NoReqTblRecs88()
	 *	@return  Returns true if isIp50005NoReqTblRecs88() is "23"
	 */
   public boolean isIp50005NoReqTblRecs88() throws CFException {
      return (  compareChars( getIp50005OneDayReadStatus() , ip50005NoReqTblRecs8888Value)  == 0  );
   }


	/**
	*  set values "23"
	*/
   	public void setIp50005NoReqTblRecs88True() {  			
    	setIp50005OneDayReadStatus( ip50005NoReqTblRecs8888Value);
   	}

	
	
	

		public static int getIp50005OneDayReadStatusGroupFieldLength() {
			return IP_50005_ONE_DAY_READ_STATUS_GROUP_LENGTH;
		}

}
  
