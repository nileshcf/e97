package com.cloudframe.app.ip829010.dto;

/**
*  The class QueueErrorMsg611 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class QueueErrorMsg611 extends QueueErrorMsg611Serialized {
   

						private char[] action611 = new char[38];

								private long badReasonCode611;

	
	/**
	* Constructor for QueueErrorMsg611
	**/
    public QueueErrorMsg611() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setAction611(fillSpace(38));
								setBadReasonCode611(0L);
       replaceValue( // serialize and save the value
             ("\".").toCharArray()
             , getStartOffset() + 47
             ,2
             );
    }


 

	/**
	 *	Returns the value of action611
	 *	@return action611
	 */
   public char[] getAction611() throws CFException{
     if (isAction611Modified()) { 
        action611 = refreshAction611();
     }
   		return action611;
   }

  
	/**
	*  set variable action611
	*  Corresponding COBOL Variable is 611-ACTION
	*  @param value
	**/
   public void setAction611(char[] value) {
      action611 = checkAction611Constraints(value);
      serializeAction611(action611);
   } 

     /**
	 * 	Update Action611 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAction611(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAction611,action611.length);
   	
   }
   
   public void setAction611(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAction611,action611.length);
   	
   }
   
     /**
	 * 	Update Action611 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAction611(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAction611+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Action611 with another Field
	 *	@param value
	 */
   public void setAction611(Field source) {
       replace(source,0,source.length(),beginAction611,ACTION_611_LEN);
   	
   }  
   
     /**
	 * 	Update Action611 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAction611(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAction611,ACTION_611_LEN);
   	
   }
   
     /**
	 * 	Update Action611 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAction611(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAction611+targetIndex,targetLen);
    
   }
	char[] errGet8861188Value = "ERROR GETTING MESSAGE FROM QUEUE      ".toCharArray();
	/**
	 *	Test condition "ERROR GETTING MESSAGE FROM QUEUE " for isErrGet88611()
	 *	@return  Returns true if isErrGet88611() is "ERROR GETTING MESSAGE FROM QUEUE "
	 */
   public boolean isErrGet88611() throws CFException {
      return (  compareChars( getAction611() , errGet8861188Value)  == 0  );
   }


	/**
	*  set values "ERROR GETTING MESSAGE FROM QUEUE "
	*/
   	public void setErrGet88611True() {  			
    	setAction611( errGet8861188Value);
   	}
	char[] errPut8861188Value = "ERROR PUTTING MESSAGE INTO QUEUE      ".toCharArray();
	/**
	 *	Test condition "ERROR PUTTING MESSAGE INTO QUEUE " for isErrPut88611()
	 *	@return  Returns true if isErrPut88611() is "ERROR PUTTING MESSAGE INTO QUEUE "
	 */
   public boolean isErrPut88611() throws CFException {
      return (  compareChars( getAction611() , errPut8861188Value)  == 0  );
   }


	/**
	*  set values "ERROR PUTTING MESSAGE INTO QUEUE "
	*/
   	public void setErrPut88611True() {  			
    	setAction611( errPut8861188Value);
   	}
	/**
	 *	Returns the value of badReasonCode611
	 *	@return badReasonCode611
	 */
	public long getBadReasonCode611() throws CFException {
       if (isBadReasonCode611Modified()) { 
           badReasonCode611 = refreshBadReasonCode611();
        }
   		return badReasonCode611;
	}
	

	
	   
	/**
	 * 	Update BadReasonCode611 with the passed value
	 *  Corresponding COBOL Variable is 611-BAD-REASON-CODE
	 *	@param number
	 */
	public void setBadReasonCode611(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    badReasonCode611 = checkBadReasonCode611MaxLimit(number); 
		serializeBadReasonCode611(badReasonCode611);
	}
	

	/**
	 * 	Update BadReasonCode611 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBadReasonCode611(char[] value) throws CFException {
		 badReasonCode611 = serializeBadReasonCode611(value);
	}
	/**
	 * 	Update BadReasonCode611 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBadReasonCode611String(char[] value) throws CFException {
		 setBadReasonCode611(value);
	}

	
	
	

		public static int getQueueErrorMsg611FieldLength() {
			return QUEUE_ERROR_MSG_611_LENGTH;
		}

}
  
