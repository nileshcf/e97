package com.cloudframe.app.ip829010.dto;

/**
*  The class Ip82921ErrMsgOut is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip82921ErrMsgOut extends Ip82921ErrMsgOutSerialized {
   
				private Ip82921ErrPayloadMsg ip82921ErrPayloadMsg = new Ip82921ErrPayloadMsg();

						private char[] ip82921ErrRequestCd = new char[3];

						private char[] ip82921ErrTargetQmgrName = new char[4];

						private char[] ip82921ErrTargetQName = new char[11];

								private long ip82921ErrCompCd;

								private long ip82921ErrResnCd;

						private char[] ip82921ErrMsg = new char[30];
	
	/**
	* Constructor for Ip82921ErrMsgOut
	**/
    public Ip82921ErrMsgOut() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ip82921ErrPayloadMsg.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setIp82921ErrRequestCd(fillSpace(3));
								setIp82921ErrTargetQmgrName(fillSpace(4));
								setIp82921ErrTargetQName(fillSpace(11));
								setIp82921ErrCompCd(0L);
								setIp82921ErrResnCd(0L);
								setIp82921ErrMsg(fillSpace(30));
    }


 

	/**
	 *	Returns the value of ip82921ErrPayloadMsg
	 *	@return ip82921ErrPayloadMsg
	 */   
	 public Ip82921ErrPayloadMsg getIp82921ErrPayloadMsg() {
   	return ip82921ErrPayloadMsg;
   }
   /**
	* 	Update Ip82921ErrPayloadMsg with the passed value
	*   Corresponding COBOL Variable is IP82921-ERR-PAYLOAD-MSG
	*	@param value
	*/
   public void setIp82921ErrPayloadMsg(char[] value) {
      ip82921ErrPayloadMsg.setString(value); 
   }   
    
     /**
	 * 	Update Ip82921ErrPayloadMsg 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp82921ErrPayloadMsg(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip82921ErrPayloadMsg.begin,ip82921ErrPayloadMsg.length());
   }
   
     /**
	 * 	Update Ip82921ErrPayloadMsg 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrPayloadMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip82921ErrPayloadMsg.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip82921ErrPayloadMsg with another Field
	 *	@param value
	 */
   public void setIp82921ErrPayloadMsg(Field source) {
   	replace(source,0,source.length(),ip82921ErrPayloadMsg.begin,ip82921ErrPayloadMsg.length());
   }  
   
     /**
	 * 	Update Ip82921ErrPayloadMsg 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp82921ErrPayloadMsg(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip82921ErrPayloadMsg.begin,ip82921ErrPayloadMsg.length());
   }
   
     /**
	 * 	Update Ip82921ErrPayloadMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrPayloadMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip82921ErrPayloadMsg.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip82921ErrRequestCd
	 *	@return ip82921ErrRequestCd
	 */
   public char[] getIp82921ErrRequestCd() throws CFException{
     if (isIp82921ErrRequestCdModified()) { 
        ip82921ErrRequestCd = refreshIp82921ErrRequestCd();
     }
   		return ip82921ErrRequestCd;
   }

  
	/**
	*  set variable ip82921ErrRequestCd
	*  Corresponding COBOL Variable is IP82921-ERR-REQUEST-CD
	*  @param value
	**/
   public void setIp82921ErrRequestCd(char[] value) {
      ip82921ErrRequestCd = checkIp82921ErrRequestCdConstraints(value);
      serializeIp82921ErrRequestCd(ip82921ErrRequestCd);
   } 

     /**
	 * 	Update Ip82921ErrRequestCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921ErrRequestCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921ErrRequestCd,ip82921ErrRequestCd.length);
   	
   }
   
   public void setIp82921ErrRequestCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ErrRequestCd,ip82921ErrRequestCd.length);
   	
   }
   
     /**
	 * 	Update Ip82921ErrRequestCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrRequestCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ErrRequestCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921ErrRequestCd with another Field
	 *	@param value
	 */
   public void setIp82921ErrRequestCd(Field source) {
       replace(source,0,source.length(),beginIp82921ErrRequestCd,IP_82921_ERR_REQUEST_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921ErrRequestCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921ErrRequestCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921ErrRequestCd,IP_82921_ERR_REQUEST_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921ErrRequestCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrRequestCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ErrRequestCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip82921ErrTargetQmgrName
	 *	@return ip82921ErrTargetQmgrName
	 */
   public char[] getIp82921ErrTargetQmgrName() throws CFException{
     if (isIp82921ErrTargetQmgrNameModified()) { 
        ip82921ErrTargetQmgrName = refreshIp82921ErrTargetQmgrName();
     }
   		return ip82921ErrTargetQmgrName;
   }

  
	/**
	*  set variable ip82921ErrTargetQmgrName
	*  Corresponding COBOL Variable is IP82921-ERR-TARGET-QMGR-NAME
	*  @param value
	**/
   public void setIp82921ErrTargetQmgrName(char[] value) {
      ip82921ErrTargetQmgrName = checkIp82921ErrTargetQmgrNameConstraints(value);
      serializeIp82921ErrTargetQmgrName(ip82921ErrTargetQmgrName);
   } 

     /**
	 * 	Update Ip82921ErrTargetQmgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921ErrTargetQmgrName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921ErrTargetQmgrName,ip82921ErrTargetQmgrName.length);
   	
   }
   
   public void setIp82921ErrTargetQmgrName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ErrTargetQmgrName,ip82921ErrTargetQmgrName.length);
   	
   }
   
     /**
	 * 	Update Ip82921ErrTargetQmgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrTargetQmgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ErrTargetQmgrName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921ErrTargetQmgrName with another Field
	 *	@param value
	 */
   public void setIp82921ErrTargetQmgrName(Field source) {
       replace(source,0,source.length(),beginIp82921ErrTargetQmgrName,IP_82921_ERR_TARGET_QMGR_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921ErrTargetQmgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921ErrTargetQmgrName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921ErrTargetQmgrName,IP_82921_ERR_TARGET_QMGR_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921ErrTargetQmgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrTargetQmgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ErrTargetQmgrName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip82921ErrTargetQName
	 *	@return ip82921ErrTargetQName
	 */
   public char[] getIp82921ErrTargetQName() throws CFException{
     if (isIp82921ErrTargetQNameModified()) { 
        ip82921ErrTargetQName = refreshIp82921ErrTargetQName();
     }
   		return ip82921ErrTargetQName;
   }

  
	/**
	*  set variable ip82921ErrTargetQName
	*  Corresponding COBOL Variable is IP82921-ERR-TARGET-Q-NAME
	*  @param value
	**/
   public void setIp82921ErrTargetQName(char[] value) {
      ip82921ErrTargetQName = checkIp82921ErrTargetQNameConstraints(value);
      serializeIp82921ErrTargetQName(ip82921ErrTargetQName);
   } 

     /**
	 * 	Update Ip82921ErrTargetQName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921ErrTargetQName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921ErrTargetQName,ip82921ErrTargetQName.length);
   	
   }
   
   public void setIp82921ErrTargetQName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ErrTargetQName,ip82921ErrTargetQName.length);
   	
   }
   
     /**
	 * 	Update Ip82921ErrTargetQName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrTargetQName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ErrTargetQName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921ErrTargetQName with another Field
	 *	@param value
	 */
   public void setIp82921ErrTargetQName(Field source) {
       replace(source,0,source.length(),beginIp82921ErrTargetQName,IP_82921_ERR_TARGET_QNAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921ErrTargetQName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921ErrTargetQName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921ErrTargetQName,IP_82921_ERR_TARGET_QNAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921ErrTargetQName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrTargetQName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ErrTargetQName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip82921ErrCompCd
	 *	@return ip82921ErrCompCd
	 */
	public long getIp82921ErrCompCd() throws CFException {
       if (isIp82921ErrCompCdModified()) { 
           ip82921ErrCompCd = refreshIp82921ErrCompCd();
        }
   		return ip82921ErrCompCd;
	}
	

	
	   
	/**
	 * 	Update Ip82921ErrCompCd with the passed value
	 *  Corresponding COBOL Variable is IP82921-ERR-COMP-CD
	 *	@param number
	 */
	public void setIp82921ErrCompCd(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip82921ErrCompCd = checkIp82921ErrCompCdMaxLimit(number); 
		serializeIp82921ErrCompCd(ip82921ErrCompCd);
	}
	

	/**
	 * 	Update Ip82921ErrCompCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp82921ErrCompCd(char[] value) throws CFException {
		 ip82921ErrCompCd = serializeIp82921ErrCompCd(value);
	}
	/**
	 * 	Update Ip82921ErrCompCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp82921ErrCompCdString(char[] value) throws CFException {
		 setIp82921ErrCompCd(value);
	}
	/**
	 *	Returns the value of ip82921ErrResnCd
	 *	@return ip82921ErrResnCd
	 */
	public long getIp82921ErrResnCd() throws CFException {
       if (isIp82921ErrResnCdModified()) { 
           ip82921ErrResnCd = refreshIp82921ErrResnCd();
        }
   		return ip82921ErrResnCd;
	}
	

	
	   
	/**
	 * 	Update Ip82921ErrResnCd with the passed value
	 *  Corresponding COBOL Variable is IP82921-ERR-RESN-CD
	 *	@param number
	 */
	public void setIp82921ErrResnCd(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip82921ErrResnCd = checkIp82921ErrResnCdMaxLimit(number); 
		serializeIp82921ErrResnCd(ip82921ErrResnCd);
	}
	

	/**
	 * 	Update Ip82921ErrResnCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp82921ErrResnCd(char[] value) throws CFException {
		 ip82921ErrResnCd = serializeIp82921ErrResnCd(value);
	}
	/**
	 * 	Update Ip82921ErrResnCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp82921ErrResnCdString(char[] value) throws CFException {
		 setIp82921ErrResnCd(value);
	}
	/**
	 *	Returns the value of ip82921ErrMsg
	 *	@return ip82921ErrMsg
	 */
   public char[] getIp82921ErrMsg() throws CFException{
     if (isIp82921ErrMsgModified()) { 
        ip82921ErrMsg = refreshIp82921ErrMsg();
     }
   		return ip82921ErrMsg;
   }

  
	/**
	*  set variable ip82921ErrMsg
	*  Corresponding COBOL Variable is IP82921-ERR-MSG
	*  @param value
	**/
   public void setIp82921ErrMsg(char[] value) {
      ip82921ErrMsg = checkIp82921ErrMsgConstraints(value);
      serializeIp82921ErrMsg(ip82921ErrMsg);
   } 

     /**
	 * 	Update Ip82921ErrMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921ErrMsg(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921ErrMsg,ip82921ErrMsg.length);
   	
   }
   
   public void setIp82921ErrMsg(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ErrMsg,ip82921ErrMsg.length);
   	
   }
   
     /**
	 * 	Update Ip82921ErrMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ErrMsg+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921ErrMsg with another Field
	 *	@param value
	 */
   public void setIp82921ErrMsg(Field source) {
       replace(source,0,source.length(),beginIp82921ErrMsg,IP_82921_ERR_MSG_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921ErrMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921ErrMsg(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921ErrMsg,IP_82921_ERR_MSG_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921ErrMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ErrMsg+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip82921ErrMsgOut
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip82921ErrPayloadMsg.initialize();
     
         setIp82921ErrRequestCd(CONSTANTS.SPACE_3);
         setIp82921ErrTargetQmgrName(CONSTANTS.SPACE_4);
         setIp82921ErrTargetQName(CONSTANTS.SPACE_11);
                     setIp82921ErrCompCd(0);
                     setIp82921ErrResnCd(0);
         setIp82921ErrMsg(CONSTANTS.SPACE_30);
   }

		public static int getIp82921ErrMsgOutFieldLength() {
			return IP_82921_ERR_MSG_OUT_LENGTH;
		}

}
  
