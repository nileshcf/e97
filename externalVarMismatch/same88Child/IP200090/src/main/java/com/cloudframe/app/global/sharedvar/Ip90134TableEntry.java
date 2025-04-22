package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip90134TableEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip90134TableEntry")

public class Ip90134TableEntry extends Ip90134TableEntrySerialized  implements InitializingBean {
   
				private Ip90134EditGroupKey ip90134EditGroupKey = new Ip90134EditGroupKey();

								private int ip90134PositionStart;

								private int ip90134PositionEnd;
	
	/**
	* Constructor for Ip90134TableEntry
	**/
    public Ip90134TableEntry() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip90134EditGroupKey.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip90134EditGroupKey
	 *	@return ip90134EditGroupKey
	 */   
	 public Ip90134EditGroupKey getIp90134EditGroupKey() {
   	return ip90134EditGroupKey;
   }
   /**
	* 	Update Ip90134EditGroupKey with the passed value
	*   Corresponding COBOL Variable is IP90134-EDIT-GROUP-KEY
	*	@param value
	*/
   public void setIp90134EditGroupKey(char[] value) {
      ip90134EditGroupKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip90134EditGroupKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp90134EditGroupKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip90134EditGroupKey.begin,ip90134EditGroupKey.length());
   }
   
     /**
	 * 	Update Ip90134EditGroupKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp90134EditGroupKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip90134EditGroupKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip90134EditGroupKey with another Field
	 *	@param value
	 */
   public void setIp90134EditGroupKey(Field source) {
   	replace(source,0,source.length(),ip90134EditGroupKey.begin,ip90134EditGroupKey.length());
   }  
   
     /**
	 * 	Update Ip90134EditGroupKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp90134EditGroupKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip90134EditGroupKey.begin,ip90134EditGroupKey.length());
   }
   
     /**
	 * 	Update Ip90134EditGroupKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp90134EditGroupKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip90134EditGroupKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip90134PositionStart
	 *	@return ip90134PositionStart
	 */
	public int getIp90134PositionStart() throws CFException {
       if (isIp90134PositionStartModified()) { 
           ip90134PositionStart = refreshIp90134PositionStart();
        }
   		return ip90134PositionStart;
	}
	

	
	   
	/**
	 * 	Update Ip90134PositionStart with the passed value
	 *  Corresponding COBOL Variable is IP90134-POSITION-START
	 *	@param number
	 */
	public void setIp90134PositionStart(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip90134PositionStart = checkIp90134PositionStartMaxLimit(number); 
		serializeIp90134PositionStart(ip90134PositionStart);
	}
	

	public void setIp90134PositionStart(long number) {
	    number = checkIp90134PositionStartMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp90134PositionStart((int)number);
	}
	
	/**
	 * 	Update Ip90134PositionStart with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp90134PositionStart(char[] value) throws CFException {
		 ip90134PositionStart = serializeIp90134PositionStart(value);
	}
	/**
	 * 	Update Ip90134PositionStart with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp90134PositionStartString(char[] value) throws CFException {
		 setIp90134PositionStart(value);
	}
	/**
	 *	Returns the value of ip90134PositionEnd
	 *	@return ip90134PositionEnd
	 */
	public int getIp90134PositionEnd() throws CFException {
       if (isIp90134PositionEndModified()) { 
           ip90134PositionEnd = refreshIp90134PositionEnd();
        }
   		return ip90134PositionEnd;
	}
	

	
	   
	/**
	 * 	Update Ip90134PositionEnd with the passed value
	 *  Corresponding COBOL Variable is IP90134-POSITION-END
	 *	@param number
	 */
	public void setIp90134PositionEnd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip90134PositionEnd = checkIp90134PositionEndMaxLimit(number); 
		serializeIp90134PositionEnd(ip90134PositionEnd);
	}
	

	public void setIp90134PositionEnd(long number) {
	    number = checkIp90134PositionEndMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp90134PositionEnd((int)number);
	}
	
	/**
	 * 	Update Ip90134PositionEnd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp90134PositionEnd(char[] value) throws CFException {
		 ip90134PositionEnd = serializeIp90134PositionEnd(value);
	}
	/**
	 * 	Update Ip90134PositionEnd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp90134PositionEndString(char[] value) throws CFException {
		 setIp90134PositionEnd(value);
	}

	
	
	
	/**
	 * 	initializes Ip90134TableEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip90134EditGroupKey.initialize();
     
                     setIp90134PositionStart(0);
                     setIp90134PositionEnd(0);
   }

		public static int getIp90134TableEntryFieldLength() {
			return IP_90134_TABLE_ENTRY_LENGTH;
		}

}
  
