package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip60001EventLogWorkArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip60001EventLogWorkArea")

public class Ip60001EventLogWorkArea extends Ip60001EventLogWorkAreaSerialized  implements InitializingBean {
   

						private char[] ip60001EventLogControl = Field.fillLowValue(1);

								private long ip60001Subscript;
			private List<Ip60001EventEntry> ip60001EventEntry = new ArrayList<>();
    	

						private char[] ip60001HoldPgmName = Field.fillLowValue(8);

						private char[] ip60001EventErrorCode = Field.fillLowValue(4);

						private char[] ip60001EventErrorMsg = Field.fillLowValue(50);
	
	/**
	* Constructor for Ip60001EventLogWorkArea
	**/
    public Ip60001EventLogWorkArea() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_60001_EVENT_ENTRY_SIZE;arrayIndex++) {
						ip60001EventEntry.add(new Ip60001EventEntry(this, beginIp60001EventEntry + 
						arrayIndex * Ip60001EventEntry.getIp60001EventEntryFieldLength()));
				}
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip60001EventLogControl
	 *	@return ip60001EventLogControl
	 */
   public char[] getIp60001EventLogControl() throws CFException{
     if (isIp60001EventLogControlModified()) { 
        ip60001EventLogControl = refreshIp60001EventLogControl();
     }
   		return ip60001EventLogControl;
   }

  
	/**
	*  set variable ip60001EventLogControl
	*  Corresponding COBOL Variable is IP60001-EVENT-LOG-CONTROL
	*  @param value
	**/
   public void setIp60001EventLogControl(char[] value) {
      ip60001EventLogControl = checkIp60001EventLogControlConstraints(value);
      serializeIp60001EventLogControl(ip60001EventLogControl);
   } 

     /**
	 * 	Update Ip60001EventLogControl 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001EventLogControl(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp60001EventLogControl,ip60001EventLogControl.length);
   	
   }
   
   public void setIp60001EventLogControl(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp60001EventLogControl,ip60001EventLogControl.length);
   	
   }
   
     /**
	 * 	Update Ip60001EventLogControl 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventLogControl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp60001EventLogControl+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip60001EventLogControl with another Field
	 *	@param value
	 */
   public void setIp60001EventLogControl(Field source) {
       replace(source,0,source.length(),beginIp60001EventLogControl,IP_60001_EVENT_LOG_CONTROL_LEN);
   	
   }  
   
     /**
	 * 	Update Ip60001EventLogControl 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001EventLogControl(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp60001EventLogControl,IP_60001_EVENT_LOG_CONTROL_LEN);
   	
   }
   
     /**
	 * 	Update Ip60001EventLogControl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventLogControl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp60001EventLogControl+targetIndex,targetLen);
    
   }
	char[] ip60001LogEvent8888Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isIp60001LogEvent88()
	 *	@return  Returns true if isIp60001LogEvent88() is "T"
	 */
   public boolean isIp60001LogEvent88() throws CFException {
      return (  compareChars( getIp60001EventLogControl() , ip60001LogEvent8888Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setIp60001LogEvent88True() {  			
    	setIp60001EventLogControl( ip60001LogEvent8888Value);
   	}
	/**
	 *	Returns the value of ip60001Subscript
	 *	@return ip60001Subscript
	 */
	public long getIp60001Subscript() throws CFException {
        if (isIp60001SubscriptModified()) { 
           ip60001Subscript = refreshIp60001Subscript();
        }
   		return ip60001Subscript;
	}
	
	/**
	 * 	Update Ip60001Subscript with the passed value
	 *  Corresponding COBOL Variable is IP60001-SUBSCRIPT
	 *	@param number
	 */
	public void setIp60001Subscript(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip60001Subscript = checkIp60001SubscriptMaxLimit(number); 
		serializeIp60001Subscript(ip60001Subscript);
	}


	/**
	 *	Returns the  value of ip60001EventEntry
	 *  Corresponding COBOL Variable is IP60001-EVENT-ENTRY
	 *	@return ip60001EventEntry
	 */
   public List<Ip60001EventEntry> getIp60001EventEntry() {
       return ip60001EventEntry;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip60001EventEntry
	 */
	public Ip60001EventEntry getIp60001EventEntry(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp60001EventEntry(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_60001_EVENT_ENTRY_SIZE) {
             	index = IP_60001_EVENT_ENTRY_SIZE -1; // can't exceed max array size
             	logger.trace("ip60001EventEntry - Array index exceeded max Size {}, resetting it to max allowed",IP_60001_EVENT_ENTRY_SIZE); 
	    }
		if (index >= ip60001EventEntry.size()) {
       		for (int fillIndex =  ip60001EventEntry.size() -1; fillIndex < index;fillIndex++) {
		       ip60001EventEntry.add(null);
		    }
			ip60001EventEntry.set(index,
			   	   	new Ip60001EventEntry(this,beginIp60001EventEntry + index * Ip60001EventEntry.getIp60001EventEntryFieldLength()) 
				                        ); 	
		} 
   	   Ip60001EventEntry value = ip60001EventEntry.get(index);
   	   if (value == null) {
   	      ip60001EventEntry.set(index,
			   	   	new Ip60001EventEntry(this,beginIp60001EventEntry + index * Ip60001EventEntry.getIp60001EventEntryFieldLength()) 
				                        ); 
		  value = ip60001EventEntry.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip60001EventEntry at index with the passed value
	 *  Corresponding COBOL Variable is IP60001-EVENT-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setIp60001EventEntry(int index,char[] value) {
   	getIp60001EventEntry(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of ip60001HoldPgmName
	 *	@return ip60001HoldPgmName
	 */
   public char[] getIp60001HoldPgmName() throws CFException{
     if (isIp60001HoldPgmNameModified()) { 
        ip60001HoldPgmName = refreshIp60001HoldPgmName();
     }
   		return ip60001HoldPgmName;
   }

  
	/**
	*  set variable ip60001HoldPgmName
	*  Corresponding COBOL Variable is IP60001-HOLD-PGM-NAME
	*  @param value
	**/
   public void setIp60001HoldPgmName(char[] value) {
      ip60001HoldPgmName = checkIp60001HoldPgmNameConstraints(value);
      serializeIp60001HoldPgmName(ip60001HoldPgmName);
   } 

     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp60001HoldPgmName,ip60001HoldPgmName.length);
   	
   }
   
   public void setIp60001HoldPgmName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp60001HoldPgmName,ip60001HoldPgmName.length);
   	
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp60001HoldPgmName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip60001HoldPgmName with another Field
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source) {
       replace(source,0,source.length(),beginIp60001HoldPgmName,IP_60001_HOLD_PGM_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp60001HoldPgmName,IP_60001_HOLD_PGM_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp60001HoldPgmName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip60001EventErrorCode
	 *	@return ip60001EventErrorCode
	 */
   public char[] getIp60001EventErrorCode() throws CFException{
     if (isIp60001EventErrorCodeModified()) { 
        ip60001EventErrorCode = refreshIp60001EventErrorCode();
     }
   		return ip60001EventErrorCode;
   }

  
	/**
	*  set variable ip60001EventErrorCode
	*  Corresponding COBOL Variable is IP60001-EVENT-ERROR-CODE
	*  @param value
	**/
   public void setIp60001EventErrorCode(char[] value) {
      ip60001EventErrorCode = checkIp60001EventErrorCodeConstraints(value);
      serializeIp60001EventErrorCode(ip60001EventErrorCode);
   } 

     /**
	 * 	Update Ip60001EventErrorCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001EventErrorCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp60001EventErrorCode,ip60001EventErrorCode.length);
   	
   }
   
   public void setIp60001EventErrorCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp60001EventErrorCode,ip60001EventErrorCode.length);
   	
   }
   
     /**
	 * 	Update Ip60001EventErrorCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventErrorCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp60001EventErrorCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip60001EventErrorCode with another Field
	 *	@param value
	 */
   public void setIp60001EventErrorCode(Field source) {
       replace(source,0,source.length(),beginIp60001EventErrorCode,IP_60001_EVENT_ERROR_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip60001EventErrorCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001EventErrorCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp60001EventErrorCode,IP_60001_EVENT_ERROR_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Ip60001EventErrorCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventErrorCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp60001EventErrorCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip60001EventErrorMsg
	 *	@return ip60001EventErrorMsg
	 */
   public char[] getIp60001EventErrorMsg() throws CFException{
     if (isIp60001EventErrorMsgModified()) { 
        ip60001EventErrorMsg = refreshIp60001EventErrorMsg();
     }
   		return ip60001EventErrorMsg;
   }

  
	/**
	*  set variable ip60001EventErrorMsg
	*  Corresponding COBOL Variable is IP60001-EVENT-ERROR-MSG
	*  @param value
	**/
   public void setIp60001EventErrorMsg(char[] value) {
      ip60001EventErrorMsg = checkIp60001EventErrorMsgConstraints(value);
      serializeIp60001EventErrorMsg(ip60001EventErrorMsg);
   } 

     /**
	 * 	Update Ip60001EventErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp60001EventErrorMsg,ip60001EventErrorMsg.length);
   	
   }
   
   public void setIp60001EventErrorMsg(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp60001EventErrorMsg,ip60001EventErrorMsg.length);
   	
   }
   
     /**
	 * 	Update Ip60001EventErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp60001EventErrorMsg+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip60001EventErrorMsg with another Field
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(Field source) {
       replace(source,0,source.length(),beginIp60001EventErrorMsg,IP_60001_EVENT_ERROR_MSG_LEN);
   	
   }  
   
     /**
	 * 	Update Ip60001EventErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp60001EventErrorMsg,IP_60001_EVENT_ERROR_MSG_LEN);
   	
   }
   
     /**
	 * 	Update Ip60001EventErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp60001EventErrorMsg+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip60001EventLogWorkArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp60001EventLogControl(CONSTANTS.SPACE);
                     setIp60001Subscript(0);
     if (ip60001EventEntry.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_60001_EVENT_ENTRY_SIZE;index++) {
              Ip60001EventEntry  newElement = new Ip60001EventEntry(this,beginIp60001EventEntry + index * Ip60001EventEntry.getIp60001EventEntryFieldLength());
              newElement.initialize();
               ip60001EventEntry.add(newElement);
          }
     } else {
        if (ip60001EventEntry.size() < IP_60001_EVENT_ENTRY_SIZE) {
          // prefill it first
          for (int index = ip60001EventEntry.size();index <  IP_60001_EVENT_ENTRY_SIZE;index++) {
              Ip60001EventEntry  newElement = new Ip60001EventEntry(this,beginIp60001EventEntry + index * Ip60001EventEntry.getIp60001EventEntryFieldLength());
               ip60001EventEntry.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_60001_EVENT_ENTRY_SIZE;index++) {
     		Ip60001EventEntry ip60001EventEntryVar = ip60001EventEntry.get(index);
 			if (ip60001EventEntryVar == null) {
                ip60001EventEntryVar = new Ip60001EventEntry(this,beginIp60001EventEntry + index * Ip60001EventEntry.getIp60001EventEntryFieldLength());
                  ip60001EventEntry.set(index, ip60001EventEntryVar);
			} 
			ip60001EventEntryVar.initialize();
		}
     }
         setIp60001HoldPgmName(CONSTANTS.SPACE_8);
         setIp60001EventErrorCode(CONSTANTS.SPACE_4);
         setIp60001EventErrorMsg(CONSTANTS.SPACE_50);
   }

		public static int getIp60001EventLogWorkAreaFieldLength() {
			return IP_60001_EVENT_LOG_WORK_AREA_LENGTH;
		}

}
  
