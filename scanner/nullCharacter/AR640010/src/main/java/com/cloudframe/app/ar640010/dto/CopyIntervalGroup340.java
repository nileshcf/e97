package com.cloudframe.app.ar640010.dto;

/**
*  The class CopyIntervalGroup340 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CopyIntervalGroup340 extends CopyIntervalGroup340Serialized { 
   

								private long copyInterval340;
	
	/**
	* Constructor for CopyIntervalGroup340
	**/
    public CopyIntervalGroup340() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CopyIntervalGroup340. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CopyIntervalGroup340(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCopyInterval340(300L);
    } 

	/**
	 *	Returns the value of copyInterval340
	 *	@return copyInterval340
	 */
	public long getCopyInterval340() throws CFException {
       if (isCopyInterval340Modified()) { 
           copyInterval340 = refreshCopyInterval340();
        }
   		return copyInterval340;
	}
	

	
	   
	/**
	 * 	Update CopyInterval340 with the passed value
	 *  Corresponding COBOL Variable is 340-COPY-INTERVAL
	 *	@param number
	 */
	public void setCopyInterval340(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    copyInterval340 = checkCopyInterval340MaxLimit(number); 
		serializeCopyInterval340(copyInterval340);
	}
	

	/**
	 * 	Update CopyInterval340 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCopyInterval340(char[] value) throws CFException {
		 copyInterval340 = serializeCopyInterval340(value);
	}
	/**
	 * 	Update CopyInterval340 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCopyInterval340String(char[] value) throws CFException {
		 setCopyInterval340(value);
	}

	
	
	

		public static int getCopyIntervalGroup340FieldLength() {
			return COPY_INTERVAL_GROUP_340_LENGTH;
		}

}
  
