package com.cloudframe.app.comput5.dto;

/**
*  The class Ip00485MemberEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:30. using version 5.0.0.254
**/


import com.cloudframe.app.comput5.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip00485MemberEntry extends Ip00485MemberEntrySerialized { 
   
				private Ip00485UserTagId ip00485UserTagId = new Ip00485UserTagId();

								private short ip00485UserTagStart;

								private short ip00485UserTagLngth;

						private char[] ip00485UserTagStatus = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00485MemberEntry
	**/
    public Ip00485MemberEntry() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00485MemberEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00485MemberEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip00485UserTagId.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip00485UserTagId
	 *	@return ip00485UserTagId
	 */   
	 public Ip00485UserTagId getIp00485UserTagId() {
   	return ip00485UserTagId;
   }
   /**
	* 	Update Ip00485UserTagId with the passed value
	*   Corresponding COBOL Variable is IP00485-USER-TAG-ID
	*	@param value
	*/
   public void setIp00485UserTagId(char[] value) {
      ip00485UserTagId.setString(value); 
   }   
    
     /**
	 * 	Update Ip00485UserTagId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00485UserTagId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00485UserTagId.begin,ip00485UserTagId.length());
   }
   
     /**
	 * 	Update Ip00485UserTagId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00485UserTagId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00485UserTagId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00485UserTagId with another Field
	 *	@param value
	 */
   public void setIp00485UserTagId(Field source) {
   	replace(source,0,source.length(),ip00485UserTagId.begin,ip00485UserTagId.length());
   }  
   
     /**
	 * 	Update Ip00485UserTagId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00485UserTagId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00485UserTagId.begin,ip00485UserTagId.length());
   }
   
     /**
	 * 	Update Ip00485UserTagId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00485UserTagId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00485UserTagId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip00485UserTagStart
	 *	@return ip00485UserTagStart
	 */
	public short getIp00485UserTagStart() throws CFException {
        if (isIp00485UserTagStartModified()) { 
           ip00485UserTagStart = refreshIp00485UserTagStart();
        }
   		return ip00485UserTagStart;
	}
	
	/**
	 * 	Update Ip00485UserTagStart with the passed value
	 *  Corresponding COBOL Variable is IP00485-USER-TAG-START
	 *	@param number
	 */
	public void setIp00485UserTagStart(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00485UserTagStart = checkIp00485UserTagStartMaxLimit(number); 
		serializeIp00485UserTagStart(ip00485UserTagStart);
	}

	public void setIp00485UserTagStart(int number) {
	    number = checkIp00485UserTagStartMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00485UserTagStart((short)number);
	}
	public void setIp00485UserTagStart(long number) {
	    number = checkIp00485UserTagStartMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00485UserTagStart((short)number);
	}
	

	/**
	 *	Returns the value of ip00485UserTagLngth
	 *	@return ip00485UserTagLngth
	 */
	public short getIp00485UserTagLngth() throws CFException {
        if (isIp00485UserTagLngthModified()) { 
           ip00485UserTagLngth = refreshIp00485UserTagLngth();
        }
   		return ip00485UserTagLngth;
	}
	
	/**
	 * 	Update Ip00485UserTagLngth with the passed value
	 *  Corresponding COBOL Variable is IP00485-USER-TAG-LNGTH
	 *	@param number
	 */
	public void setIp00485UserTagLngth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00485UserTagLngth = checkIp00485UserTagLngthMaxLimit(number); 
		serializeIp00485UserTagLngth(ip00485UserTagLngth);
	}

	public void setIp00485UserTagLngth(int number) {
	    number = checkIp00485UserTagLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00485UserTagLngth((short)number);
	}
	public void setIp00485UserTagLngth(long number) {
	    number = checkIp00485UserTagLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00485UserTagLngth((short)number);
	}
	

	/**
	 *	Returns the value of ip00485UserTagStatus
	 *	@return ip00485UserTagStatus
	 */
   public char[] getIp00485UserTagStatus() throws CFException{
     if (isIp00485UserTagStatusModified()) { 
        ip00485UserTagStatus = refreshIp00485UserTagStatus();
     }
   		return ip00485UserTagStatus;
   }

  
	/**
	*  set variable ip00485UserTagStatus
	*  Corresponding COBOL Variable is IP00485-USER-TAG-STATUS
	*  @param value
	**/
   public void setIp00485UserTagStatus(char[] value) {
      ip00485UserTagStatus = checkIp00485UserTagStatusConstraints(value);
      serializeIp00485UserTagStatus(ip00485UserTagStatus);
   } 

     /**
	 * 	Update Ip00485UserTagStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00485UserTagStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00485UserTagStatus,ip00485UserTagStatus.length);
   	
   }
   
   public void setIp00485UserTagStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00485UserTagStatus,ip00485UserTagStatus.length);
   	
   }
   
     /**
	 * 	Update Ip00485UserTagStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00485UserTagStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00485UserTagStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00485UserTagStatus with another Field
	 *	@param value
	 */
   public void setIp00485UserTagStatus(Field source) {
       replace(source,0,source.length(),beginIp00485UserTagStatus,IP_00485_USER_TAG_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00485UserTagStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00485UserTagStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00485UserTagStatus,IP_00485_USER_TAG_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update Ip00485UserTagStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00485UserTagStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00485UserTagStatus+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIp00485MemberEntryFieldLength() {
			return IP_00485_MEMBER_ENTRY_LENGTH;
		}

}
  
