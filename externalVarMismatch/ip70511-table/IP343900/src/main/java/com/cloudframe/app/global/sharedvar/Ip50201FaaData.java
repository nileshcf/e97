package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50201FaaData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:02. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip50201FaaData extends Ip50201FaaDataSerialized { 
   

						private char[] ip50201PrimaryAcctNbr = Field.fillLowValue(19);
				private Ip50201ExpirationDate ip50201ExpirationDate = new Ip50201ExpirationDate();

						private char[] ip50201AccntStatus = Field.fillLowValue(1);
				private Ip50201ClosedDate ip50201ClosedDate = new Ip50201ClosedDate();

						private char[] ip50201VrtlAcctNum = Field.fillLowValue(19);
	
	/**
	* Constructor for Ip50201FaaData
	**/
    public Ip50201FaaData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip50201FaaData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50201FaaData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip50201ExpirationDate.setParent(this,getStartOffset() + 19);
	       			ip50201ClosedDate.setParent(this,getStartOffset() + 26);
    } 

	/**
	 *	Returns the value of ip50201PrimaryAcctNbr
	 *	@return ip50201PrimaryAcctNbr
	 */
   public char[] getIp50201PrimaryAcctNbr() throws CFException{
     if (isIp50201PrimaryAcctNbrModified()) { 
        ip50201PrimaryAcctNbr = refreshIp50201PrimaryAcctNbr();
     }
   		return ip50201PrimaryAcctNbr;
   }

  
	/**
	*  set variable ip50201PrimaryAcctNbr
	*  Corresponding COBOL Variable is IP50201-PRIMARY-ACCT-NBR
	*  @param value
	**/
   public void setIp50201PrimaryAcctNbr(char[] value) {
      ip50201PrimaryAcctNbr = checkIp50201PrimaryAcctNbrConstraints(value);
      serializeIp50201PrimaryAcctNbr(ip50201PrimaryAcctNbr);
   } 

     /**
	 * 	Update Ip50201PrimaryAcctNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50201PrimaryAcctNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50201PrimaryAcctNbr,ip50201PrimaryAcctNbr.length);
   	
   }
   
   public void setIp50201PrimaryAcctNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201PrimaryAcctNbr,ip50201PrimaryAcctNbr.length);
   	
   }
   
     /**
	 * 	Update Ip50201PrimaryAcctNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201PrimaryAcctNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201PrimaryAcctNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50201PrimaryAcctNbr with another Field
	 *	@param value
	 */
   public void setIp50201PrimaryAcctNbr(Field source) {
       replace(source,0,source.length(),beginIp50201PrimaryAcctNbr,IP_50201_PRIMARY_ACCT_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50201PrimaryAcctNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50201PrimaryAcctNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50201PrimaryAcctNbr,IP_50201_PRIMARY_ACCT_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Ip50201PrimaryAcctNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201PrimaryAcctNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201PrimaryAcctNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50201ExpirationDate
	 *	@return ip50201ExpirationDate
	 */   
	 public Ip50201ExpirationDate getIp50201ExpirationDate() {
   	return ip50201ExpirationDate;
   }
   /**
	* 	Update Ip50201ExpirationDate with the passed value
	*   Corresponding COBOL Variable is IP50201-EXPIRATION-DATE
	*	@param value
	*/
   public void setIp50201ExpirationDate(char[] value) {
      ip50201ExpirationDate.setString(value); 
   }   
    
     /**
	 * 	Update Ip50201ExpirationDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50201ExpirationDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50201ExpirationDate.begin,ip50201ExpirationDate.length());
   }
   
     /**
	 * 	Update Ip50201ExpirationDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ExpirationDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50201ExpirationDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip50201ExpirationDate with another Field
	 *	@param value
	 */
   public void setIp50201ExpirationDate(Field source) {
   	replace(source,0,source.length(),ip50201ExpirationDate.begin,ip50201ExpirationDate.length());
   }  
   
     /**
	 * 	Update Ip50201ExpirationDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50201ExpirationDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50201ExpirationDate.begin,ip50201ExpirationDate.length());
   }
   
     /**
	 * 	Update Ip50201ExpirationDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ExpirationDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50201ExpirationDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip50201AccntStatus
	 *	@return ip50201AccntStatus
	 */
   public char[] getIp50201AccntStatus() throws CFException{
     if (isIp50201AccntStatusModified()) { 
        ip50201AccntStatus = refreshIp50201AccntStatus();
     }
   		return ip50201AccntStatus;
   }

  
	/**
	*  set variable ip50201AccntStatus
	*  Corresponding COBOL Variable is IP50201-ACCNT-STATUS
	*  @param value
	**/
   public void setIp50201AccntStatus(char[] value) {
      ip50201AccntStatus = checkIp50201AccntStatusConstraints(value);
      serializeIp50201AccntStatus(ip50201AccntStatus);
   } 

     /**
	 * 	Update Ip50201AccntStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50201AccntStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50201AccntStatus,ip50201AccntStatus.length);
   	
   }
   
   public void setIp50201AccntStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201AccntStatus,ip50201AccntStatus.length);
   	
   }
   
     /**
	 * 	Update Ip50201AccntStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201AccntStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201AccntStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50201AccntStatus with another Field
	 *	@param value
	 */
   public void setIp50201AccntStatus(Field source) {
       replace(source,0,source.length(),beginIp50201AccntStatus,IP_50201_ACCNT_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50201AccntStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50201AccntStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50201AccntStatus,IP_50201_ACCNT_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update Ip50201AccntStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201AccntStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201AccntStatus+targetIndex,targetLen);
    
   }
	char[] ip50201Open8888Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isIp50201Open88()
	 *	@return  Returns true if isIp50201Open88() is "O"
	 */
   public boolean isIp50201Open88() throws CFException {
      return (  compareChars( getIp50201AccntStatus() , ip50201Open8888Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setIp50201Open88True() {  			
    	setIp50201AccntStatus( ip50201Open8888Value);
   	}
	char[] ip50201Close8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp50201Close88()
	 *	@return  Returns true if isIp50201Close88() is "C"
	 */
   public boolean isIp50201Close88() throws CFException {
      return (  compareChars( getIp50201AccntStatus() , ip50201Close8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp50201Close88True() {  			
    	setIp50201AccntStatus( ip50201Close8888Value);
   	}
	/**
	 *	Returns the value of ip50201ClosedDate
	 *	@return ip50201ClosedDate
	 */   
	 public Ip50201ClosedDate getIp50201ClosedDate() {
   	return ip50201ClosedDate;
   }
   /**
	* 	Update Ip50201ClosedDate with the passed value
	*   Corresponding COBOL Variable is IP50201-CLOSED-DATE
	*	@param value
	*/
   public void setIp50201ClosedDate(char[] value) {
      ip50201ClosedDate.setString(value); 
   }   
    
     /**
	 * 	Update Ip50201ClosedDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50201ClosedDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50201ClosedDate.begin,ip50201ClosedDate.length());
   }
   
     /**
	 * 	Update Ip50201ClosedDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ClosedDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50201ClosedDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip50201ClosedDate with another Field
	 *	@param value
	 */
   public void setIp50201ClosedDate(Field source) {
   	replace(source,0,source.length(),ip50201ClosedDate.begin,ip50201ClosedDate.length());
   }  
   
     /**
	 * 	Update Ip50201ClosedDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50201ClosedDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50201ClosedDate.begin,ip50201ClosedDate.length());
   }
   
     /**
	 * 	Update Ip50201ClosedDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ClosedDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50201ClosedDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip50201VrtlAcctNum
	 *	@return ip50201VrtlAcctNum
	 */
   public char[] getIp50201VrtlAcctNum() throws CFException{
     if (isIp50201VrtlAcctNumModified()) { 
        ip50201VrtlAcctNum = refreshIp50201VrtlAcctNum();
     }
   		return ip50201VrtlAcctNum;
   }

  
	/**
	*  set variable ip50201VrtlAcctNum
	*  Corresponding COBOL Variable is IP50201-VRTL-ACCT-NUM
	*  @param value
	**/
   public void setIp50201VrtlAcctNum(char[] value) {
      ip50201VrtlAcctNum = checkIp50201VrtlAcctNumConstraints(value);
      serializeIp50201VrtlAcctNum(ip50201VrtlAcctNum);
   } 

     /**
	 * 	Update Ip50201VrtlAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50201VrtlAcctNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50201VrtlAcctNum,ip50201VrtlAcctNum.length);
   	
   }
   
   public void setIp50201VrtlAcctNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201VrtlAcctNum,ip50201VrtlAcctNum.length);
   	
   }
   
     /**
	 * 	Update Ip50201VrtlAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201VrtlAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201VrtlAcctNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50201VrtlAcctNum with another Field
	 *	@param value
	 */
   public void setIp50201VrtlAcctNum(Field source) {
       replace(source,0,source.length(),beginIp50201VrtlAcctNum,IP_50201_VRTL_ACCT_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50201VrtlAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50201VrtlAcctNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50201VrtlAcctNum,IP_50201_VRTL_ACCT_NUM_LEN);
   	
   }
   
     /**
	 * 	Update Ip50201VrtlAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201VrtlAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201VrtlAcctNum+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip50201FaaData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50201PrimaryAcctNbr(CONSTANTS.SPACE_19);
          ip50201ExpirationDate.initialize();
     
         setIp50201AccntStatus(CONSTANTS.SPACE);
          ip50201ClosedDate.initialize();
     
         setIp50201VrtlAcctNum(CONSTANTS.SPACE_19);
   }

		public static int getIp50201FaaDataFieldLength() {
			return IP_50201_FAA_DATA_LENGTH;
		}

}
  
