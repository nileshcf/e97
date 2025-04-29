package com.cloudframe.app.ip829010.dto;

/**
*  The class QueueVars800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class QueueVars800 extends QueueVars800Serialized {
   

						private char[] reqQmgrName800 = Field.fillLowValue(48);

						private char[] reqQName800 = Field.fillLowValue(48);

								private int reqHconn800;

								private int reqHobj800;

						private char[] resQmgrName800 = Field.fillLowValue(48);

						private char[] resQName800 = Field.fillLowValue(48);

								private int resHconn800;

								private int resHobj800;
	
	/**
	* Constructor for QueueVars800
	**/
    public QueueVars800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of reqQmgrName800
	 *	@return reqQmgrName800
	 */
   public char[] getReqQmgrName800() throws CFException{
     if (isReqQmgrName800Modified()) { 
        reqQmgrName800 = refreshReqQmgrName800();
     }
   		return reqQmgrName800;
   }

  
	/**
	*  set variable reqQmgrName800
	*  Corresponding COBOL Variable is 800-REQ-QMGR-NAME
	*  @param value
	**/
   public void setReqQmgrName800(char[] value) {
      reqQmgrName800 = checkReqQmgrName800Constraints(value);
      serializeReqQmgrName800(reqQmgrName800);
   } 

     /**
	 * 	Update ReqQmgrName800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReqQmgrName800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginReqQmgrName800,reqQmgrName800.length);
   	
   }
   
   public void setReqQmgrName800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginReqQmgrName800,reqQmgrName800.length);
   	
   }
   
     /**
	 * 	Update ReqQmgrName800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReqQmgrName800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReqQmgrName800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ReqQmgrName800 with another Field
	 *	@param value
	 */
   public void setReqQmgrName800(Field source) {
       replace(source,0,source.length(),beginReqQmgrName800,REQ_QMGR_NAME_800_LEN);
   	
   }  
   
     /**
	 * 	Update ReqQmgrName800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReqQmgrName800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginReqQmgrName800,REQ_QMGR_NAME_800_LEN);
   	
   }
   
     /**
	 * 	Update ReqQmgrName800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReqQmgrName800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReqQmgrName800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of reqQName800
	 *	@return reqQName800
	 */
   public char[] getReqQName800() throws CFException{
     if (isReqQName800Modified()) { 
        reqQName800 = refreshReqQName800();
     }
   		return reqQName800;
   }

  
	/**
	*  set variable reqQName800
	*  Corresponding COBOL Variable is 800-REQ-Q-NAME
	*  @param value
	**/
   public void setReqQName800(char[] value) {
      reqQName800 = checkReqQName800Constraints(value);
      serializeReqQName800(reqQName800);
   } 

     /**
	 * 	Update ReqQName800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReqQName800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginReqQName800,reqQName800.length);
   	
   }
   
   public void setReqQName800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginReqQName800,reqQName800.length);
   	
   }
   
     /**
	 * 	Update ReqQName800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReqQName800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReqQName800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ReqQName800 with another Field
	 *	@param value
	 */
   public void setReqQName800(Field source) {
       replace(source,0,source.length(),beginReqQName800,REQ_QNAME_800_LEN);
   	
   }  
   
     /**
	 * 	Update ReqQName800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReqQName800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginReqQName800,REQ_QNAME_800_LEN);
   	
   }
   
     /**
	 * 	Update ReqQName800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReqQName800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReqQName800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of reqHconn800
	 *	@return reqHconn800
	 */
	public int getReqHconn800() throws CFException {
        if (isReqHconn800Modified()) { 
           reqHconn800 = refreshReqHconn800();
        }
   		return reqHconn800;
	}
	
	/**
	 * 	Update ReqHconn800 with the passed value
	 *  Corresponding COBOL Variable is 800-REQ-HCONN
	 *	@param number
	 */
	public void setReqHconn800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    reqHconn800 = checkReqHconn800MaxLimit(number); 
		serializeReqHconn800(reqHconn800);
	}


	public void setReqHconn800(long number) {
	    number = checkReqHconn800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setReqHconn800((int)number);
	}
	
	/**
	 *	Returns the value of reqHobj800
	 *	@return reqHobj800
	 */
	public int getReqHobj800() throws CFException {
        if (isReqHobj800Modified()) { 
           reqHobj800 = refreshReqHobj800();
        }
   		return reqHobj800;
	}
	
	/**
	 * 	Update ReqHobj800 with the passed value
	 *  Corresponding COBOL Variable is 800-REQ-HOBJ
	 *	@param number
	 */
	public void setReqHobj800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    reqHobj800 = checkReqHobj800MaxLimit(number); 
		serializeReqHobj800(reqHobj800);
	}


	public void setReqHobj800(long number) {
	    number = checkReqHobj800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setReqHobj800((int)number);
	}
	
	/**
	 *	Returns the value of resQmgrName800
	 *	@return resQmgrName800
	 */
   public char[] getResQmgrName800() throws CFException{
     if (isResQmgrName800Modified()) { 
        resQmgrName800 = refreshResQmgrName800();
     }
   		return resQmgrName800;
   }

  
	/**
	*  set variable resQmgrName800
	*  Corresponding COBOL Variable is 800-RES-QMGR-NAME
	*  @param value
	**/
   public void setResQmgrName800(char[] value) {
      resQmgrName800 = checkResQmgrName800Constraints(value);
      serializeResQmgrName800(resQmgrName800);
   } 

     /**
	 * 	Update ResQmgrName800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResQmgrName800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResQmgrName800,resQmgrName800.length);
   	
   }
   
   public void setResQmgrName800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResQmgrName800,resQmgrName800.length);
   	
   }
   
     /**
	 * 	Update ResQmgrName800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResQmgrName800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResQmgrName800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResQmgrName800 with another Field
	 *	@param value
	 */
   public void setResQmgrName800(Field source) {
       replace(source,0,source.length(),beginResQmgrName800,RES_QMGR_NAME_800_LEN);
   	
   }  
   
     /**
	 * 	Update ResQmgrName800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResQmgrName800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResQmgrName800,RES_QMGR_NAME_800_LEN);
   	
   }
   
     /**
	 * 	Update ResQmgrName800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResQmgrName800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResQmgrName800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of resQName800
	 *	@return resQName800
	 */
   public char[] getResQName800() throws CFException{
     if (isResQName800Modified()) { 
        resQName800 = refreshResQName800();
     }
   		return resQName800;
   }

  
	/**
	*  set variable resQName800
	*  Corresponding COBOL Variable is 800-RES-Q-NAME
	*  @param value
	**/
   public void setResQName800(char[] value) {
      resQName800 = checkResQName800Constraints(value);
      serializeResQName800(resQName800);
   } 

     /**
	 * 	Update ResQName800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResQName800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResQName800,resQName800.length);
   	
   }
   
   public void setResQName800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResQName800,resQName800.length);
   	
   }
   
     /**
	 * 	Update ResQName800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResQName800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResQName800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResQName800 with another Field
	 *	@param value
	 */
   public void setResQName800(Field source) {
       replace(source,0,source.length(),beginResQName800,RES_QNAME_800_LEN);
   	
   }  
   
     /**
	 * 	Update ResQName800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResQName800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResQName800,RES_QNAME_800_LEN);
   	
   }
   
     /**
	 * 	Update ResQName800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResQName800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResQName800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of resHconn800
	 *	@return resHconn800
	 */
	public int getResHconn800() throws CFException {
        if (isResHconn800Modified()) { 
           resHconn800 = refreshResHconn800();
        }
   		return resHconn800;
	}
	
	/**
	 * 	Update ResHconn800 with the passed value
	 *  Corresponding COBOL Variable is 800-RES-HCONN
	 *	@param number
	 */
	public void setResHconn800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    resHconn800 = checkResHconn800MaxLimit(number); 
		serializeResHconn800(resHconn800);
	}


	public void setResHconn800(long number) {
	    number = checkResHconn800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setResHconn800((int)number);
	}
	
	/**
	 *	Returns the value of resHobj800
	 *	@return resHobj800
	 */
	public int getResHobj800() throws CFException {
        if (isResHobj800Modified()) { 
           resHobj800 = refreshResHobj800();
        }
   		return resHobj800;
	}
	
	/**
	 * 	Update ResHobj800 with the passed value
	 *  Corresponding COBOL Variable is 800-RES-HOBJ
	 *	@param number
	 */
	public void setResHobj800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    resHobj800 = checkResHobj800MaxLimit(number); 
		serializeResHobj800(resHobj800);
	}


	public void setResHobj800(long number) {
	    number = checkResHobj800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setResHobj800((int)number);
	}
	

	
	
	
	/**
	 * 	initializes QueueVars800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setReqQmgrName800(CONSTANTS.SPACE_48);
         setReqQName800(CONSTANTS.SPACE_48);
                     setReqHconn800(0);
                     setReqHobj800(0);
         setResQmgrName800(CONSTANTS.SPACE_48);
         setResQName800(CONSTANTS.SPACE_48);
                     setResHconn800(0);
                     setResHobj800(0);
   }

		public static int getQueueVars800FieldLength() {
			return QUEUE_VARS_800_LENGTH;
		}

}
  
