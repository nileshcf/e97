package com.cloudframe.app.ms00d363.dto;

/**
*  The class Ms10frptDetDelvData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ms10frptDetDelvData extends Ms10frptDetDelvDataSerialized { 
   
				private Ms10frptDetDelvKey ms10frptDetDelvKey = new Ms10frptDetDelvKey();

								private long ms10frptDetProc2;
	
	/**
	* Constructor for Ms10frptDetDelvData
	**/
    public Ms10frptDetDelvData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ms10frptDetDelvData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ms10frptDetDelvData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ms10frptDetDelvKey.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ms10frptDetDelvKey
	 *	@return ms10frptDetDelvKey
	 */   
	 public Ms10frptDetDelvKey getMs10frptDetDelvKey() {
   	return ms10frptDetDelvKey;
   }
   /**
	* 	Update Ms10frptDetDelvKey with the passed value
	*   Corresponding COBOL Variable is MS10FRPT-DET-DELV-KEY
	*	@param value
	*/
   public void setMs10frptDetDelvKey(char[] value) {
      ms10frptDetDelvKey.setString(value); 
   }   
    
     /**
	 * 	Update Ms10frptDetDelvKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMs10frptDetDelvKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ms10frptDetDelvKey.begin,ms10frptDetDelvKey.length());
   }
   
     /**
	 * 	Update Ms10frptDetDelvKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptDetDelvKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ms10frptDetDelvKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ms10frptDetDelvKey with another Field
	 *	@param value
	 */
   public void setMs10frptDetDelvKey(Field source) {
   	replace(source,0,source.length(),ms10frptDetDelvKey.begin,ms10frptDetDelvKey.length());
   }  
   
     /**
	 * 	Update Ms10frptDetDelvKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMs10frptDetDelvKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ms10frptDetDelvKey.begin,ms10frptDetDelvKey.length());
   }
   
     /**
	 * 	Update Ms10frptDetDelvKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptDetDelvKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ms10frptDetDelvKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ms10frptDetProc2
	 *	@return ms10frptDetProc2
	 */
	public long getMs10frptDetProc2() throws CFException {
       if (isMs10frptDetProc2Modified()) { 
           ms10frptDetProc2 = refreshMs10frptDetProc2();
        }
   		return ms10frptDetProc2;
	}
	

	
	   
	/**
	 * 	Update Ms10frptDetProc2 with the passed value
	 *  Corresponding COBOL Variable is MS10FRPT-DET-PROC-2
	 *	@param number
	 */
	public void setMs10frptDetProc2(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ms10frptDetProc2 = checkMs10frptDetProc2MaxLimit(number); 
		serializeMs10frptDetProc2(ms10frptDetProc2);
	}
	

	/**
	 * 	Update Ms10frptDetProc2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMs10frptDetProc2(char[] value) throws CFException {
		 ms10frptDetProc2 = serializeMs10frptDetProc2(value);
	}
	/**
	 * 	Update Ms10frptDetProc2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMs10frptDetProc2String(char[] value) throws CFException {
		 setMs10frptDetProc2(value);
	}

	
	
	

		public static int getMs10frptDetDelvDataFieldLength() {
			return MS_10FRPT_DET_DELV_DATA_LENGTH;
		}

}
  
