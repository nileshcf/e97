package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66102NormalIpmMsgRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip66102NormalIpmMsgRedefined extends Ip66102NormalIpmMsgRedefinedSerialized { 
   

						private char[] ip66102IsTagTablePresent = Field.fillLowValue(1);

								private long ip66102TagStart;

						private char[] ip66102TaggedIpmMsg = Field.fillLowValue(32762);
	
	/**
	* Constructor for Ip66102NormalIpmMsgRedefined
	**/
    public Ip66102NormalIpmMsgRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip66102NormalIpmMsgRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66102NormalIpmMsgRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip66102IsTagTablePresent
	 *	@return ip66102IsTagTablePresent
	 */
   public char[] getIp66102IsTagTablePresent() throws CFException{
     if (isIp66102IsTagTablePresentModified()) { 
        ip66102IsTagTablePresent = refreshIp66102IsTagTablePresent();
     }
   		return ip66102IsTagTablePresent;
   }

  
	/**
	*  set variable ip66102IsTagTablePresent
	*  Corresponding COBOL Variable is IP66102-IS-TAG-TABLE-PRESENT
	*  @param value
	**/
   public void setIp66102IsTagTablePresent(char[] value) {
      ip66102IsTagTablePresent = checkIp66102IsTagTablePresentConstraints(value);
      serializeIp66102IsTagTablePresent(ip66102IsTagTablePresent);
   } 

     /**
	 * 	Update Ip66102IsTagTablePresent 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102IsTagTablePresent(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66102IsTagTablePresent,ip66102IsTagTablePresent.length);
   	
   }
   
   public void setIp66102IsTagTablePresent(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102IsTagTablePresent,ip66102IsTagTablePresent.length);
   	
   }
   
     /**
	 * 	Update Ip66102IsTagTablePresent 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102IsTagTablePresent(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102IsTagTablePresent+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66102IsTagTablePresent with another Field
	 *	@param value
	 */
   public void setIp66102IsTagTablePresent(Field source) {
       replace(source,0,source.length(),beginIp66102IsTagTablePresent,IP_66102_IS_TAG_TABLE_PRESENT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66102IsTagTablePresent 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102IsTagTablePresent(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66102IsTagTablePresent,IP_66102_IS_TAG_TABLE_PRESENT_LEN);
   	
   }
   
     /**
	 * 	Update Ip66102IsTagTablePresent 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102IsTagTablePresent(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102IsTagTablePresent+targetIndex,targetLen);
    
   }
	char[] ip66102TagTableIsPresent88Value = "!".toCharArray();
	/**
	 *	Test condition "!" for isIp66102TagTableIsPresent()
	 *	@return  Returns true if isIp66102TagTableIsPresent() is "!"
	 */
   public boolean isIp66102TagTableIsPresent() throws CFException {
      return (  compareChars( getIp66102IsTagTablePresent() , ip66102TagTableIsPresent88Value)  == 0  );
   }


	/**
	*  set values "!"
	*/
   	public void setIp66102TagTableIsPresentTrue() {  			
    	setIp66102IsTagTablePresent( ip66102TagTableIsPresent88Value);
   	}
	/**
	 *	Returns the value of ip66102TagStart
	 *	@return ip66102TagStart
	 */
	public long getIp66102TagStart() throws CFException {
        if (isIp66102TagStartModified()) { 
           ip66102TagStart = refreshIp66102TagStart();
        }
   		return ip66102TagStart;
	}
	
	/**
	 * 	Update Ip66102TagStart with the passed value
	 *  Corresponding COBOL Variable is IP66102-TAG-START
	 *	@param number
	 */
	public void setIp66102TagStart(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip66102TagStart = checkIp66102TagStartMaxLimit(number); 
		serializeIp66102TagStart(ip66102TagStart);
	}


	/**
	 *	Returns the value of ip66102TaggedIpmMsg
	 *	@return ip66102TaggedIpmMsg
	 */
   public char[] getIp66102TaggedIpmMsg() throws CFException{
     if (isIp66102TaggedIpmMsgModified()) { 
        ip66102TaggedIpmMsg = refreshIp66102TaggedIpmMsg();
     }
   		return ip66102TaggedIpmMsg;
   }

  
	/**
	*  set variable ip66102TaggedIpmMsg
	*  Corresponding COBOL Variable is IP66102-TAGGED-IPM-MSG
	*  @param value
	**/
   public void setIp66102TaggedIpmMsg(char[] value) {
      ip66102TaggedIpmMsg = checkIp66102TaggedIpmMsgConstraints(value);
      serializeIp66102TaggedIpmMsg(ip66102TaggedIpmMsg);
   } 

     /**
	 * 	Update Ip66102TaggedIpmMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102TaggedIpmMsg(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66102TaggedIpmMsg,ip66102TaggedIpmMsg.length);
   	
   }
   
   public void setIp66102TaggedIpmMsg(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102TaggedIpmMsg,ip66102TaggedIpmMsg.length);
   	
   }
   
     /**
	 * 	Update Ip66102TaggedIpmMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102TaggedIpmMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102TaggedIpmMsg+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66102TaggedIpmMsg with another Field
	 *	@param value
	 */
   public void setIp66102TaggedIpmMsg(Field source) {
       replace(source,0,source.length(),beginIp66102TaggedIpmMsg,IP_66102_TAGGED_IPM_MSG_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66102TaggedIpmMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102TaggedIpmMsg(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66102TaggedIpmMsg,IP_66102_TAGGED_IPM_MSG_LEN);
   	
   }
   
     /**
	 * 	Update Ip66102TaggedIpmMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102TaggedIpmMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102TaggedIpmMsg+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip66102NormalIpmMsgRedefined
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp66102IsTagTablePresent(CONSTANTS.SPACE);
                     setIp66102TagStart(0);
         setIp66102TaggedIpmMsg(CONSTANTS.SPACE_32762);
   }

		public static int getIp66102NormalIpmMsgRedefinedFieldLength() {
			return IP_66102_NORMAL_IPM_MSG_REDEFINED_LENGTH;
		}

}
  
