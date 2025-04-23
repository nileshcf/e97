package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66601UserTag is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip66601UserTag extends Ip66601UserTagSerialized { 
   
				private Ip66601UserTagId ip66601UserTagId = new Ip66601UserTagId();

								private short ip66601UserTagStart;

								private short ip66601UserTagLngth;

						private char[] ip66601UserTagStatus = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip66601UserTag
	**/
    public Ip66601UserTag() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip66601UserTag. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66601UserTag(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip66601UserTagId.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip66601UserTagId
	 *	@return ip66601UserTagId
	 */   
	 public Ip66601UserTagId getIp66601UserTagId() {
   	return ip66601UserTagId;
   }
   /**
	* 	Update Ip66601UserTagId with the passed value
	*   Corresponding COBOL Variable is IP66601-USER-TAG-ID
	*	@param value
	*/
   public void setIp66601UserTagId(char[] value) {
      ip66601UserTagId.setString(value); 
   }   
    
     /**
	 * 	Update Ip66601UserTagId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp66601UserTagId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip66601UserTagId.begin,ip66601UserTagId.length());
   }
   
     /**
	 * 	Update Ip66601UserTagId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip66601UserTagId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip66601UserTagId with another Field
	 *	@param value
	 */
   public void setIp66601UserTagId(Field source) {
   	replace(source,0,source.length(),ip66601UserTagId.begin,ip66601UserTagId.length());
   }  
   
     /**
	 * 	Update Ip66601UserTagId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp66601UserTagId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip66601UserTagId.begin,ip66601UserTagId.length());
   }
   
     /**
	 * 	Update Ip66601UserTagId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip66601UserTagId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip66601UserTagStart
	 *	@return ip66601UserTagStart
	 */
	public short getIp66601UserTagStart() throws CFException {
        if (isIp66601UserTagStartModified()) { 
           ip66601UserTagStart = refreshIp66601UserTagStart();
        }
   		return ip66601UserTagStart;
	}
	
	/**
	 * 	Update Ip66601UserTagStart with the passed value
	 *  Corresponding COBOL Variable is IP66601-USER-TAG-START
	 *	@param number
	 */
	public void setIp66601UserTagStart(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip66601UserTagStart = checkIp66601UserTagStartMaxLimit(number); 
		serializeIp66601UserTagStart(ip66601UserTagStart);
	}

	public void setIp66601UserTagStart(int number) {
	    number = checkIp66601UserTagStartMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagStart((short)number);
	}
	public void setIp66601UserTagStart(long number) {
	    number = checkIp66601UserTagStartMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagStart((short)number);
	}
	

	/**
	 *	Returns the value of ip66601UserTagLngth
	 *	@return ip66601UserTagLngth
	 */
	public short getIp66601UserTagLngth() throws CFException {
        if (isIp66601UserTagLngthModified()) { 
           ip66601UserTagLngth = refreshIp66601UserTagLngth();
        }
   		return ip66601UserTagLngth;
	}
	
	/**
	 * 	Update Ip66601UserTagLngth with the passed value
	 *  Corresponding COBOL Variable is IP66601-USER-TAG-LNGTH
	 *	@param number
	 */
	public void setIp66601UserTagLngth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip66601UserTagLngth = checkIp66601UserTagLngthMaxLimit(number); 
		serializeIp66601UserTagLngth(ip66601UserTagLngth);
	}

	public void setIp66601UserTagLngth(int number) {
	    number = checkIp66601UserTagLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagLngth((short)number);
	}
	public void setIp66601UserTagLngth(long number) {
	    number = checkIp66601UserTagLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagLngth((short)number);
	}
	

	/**
	 *	Returns the value of ip66601UserTagStatus
	 *	@return ip66601UserTagStatus
	 */
   public char[] getIp66601UserTagStatus() throws CFException{
     if (isIp66601UserTagStatusModified()) { 
        ip66601UserTagStatus = refreshIp66601UserTagStatus();
     }
   		return ip66601UserTagStatus;
   }

  
	/**
	*  set variable ip66601UserTagStatus
	*  Corresponding COBOL Variable is IP66601-USER-TAG-STATUS
	*  @param value
	**/
   public void setIp66601UserTagStatus(char[] value) {
      ip66601UserTagStatus = checkIp66601UserTagStatusConstraints(value);
      serializeIp66601UserTagStatus(ip66601UserTagStatus);
   } 

     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66601UserTagStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66601UserTagStatus,ip66601UserTagStatus.length);
   	
   }
   
   public void setIp66601UserTagStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66601UserTagStatus,ip66601UserTagStatus.length);
   	
   }
   
     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66601UserTagStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66601UserTagStatus with another Field
	 *	@param value
	 */
   public void setIp66601UserTagStatus(Field source) {
       replace(source,0,source.length(),beginIp66601UserTagStatus,IP_66601_USER_TAG_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66601UserTagStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66601UserTagStatus,IP_66601_USER_TAG_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66601UserTagStatus+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip66601UserTag
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip66601UserTagId.initialize();
     
         	setIp66601UserTagStart((short)0);
         	setIp66601UserTagLngth((short)0);
         setIp66601UserTagStatus(CONSTANTS.SPACE);
   }

		public static int getIp66601UserTagFieldLength() {
			return IP_66601_USER_TAG_LENGTH;
		}

}
  
