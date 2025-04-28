package com.cloudframe.app.init1.dto;

/**
*  The class ApplicationVersion is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ApplicationVersion extends ApplicationVersionSerialized { 
   

								private short applicationVersionLen;
	
	/**
	* Constructor for ApplicationVersion
	**/
    public ApplicationVersion() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ApplicationVersion. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ApplicationVersion(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setApplicationVersionLen((short)0);
    } 

	/**
	 *	Returns the value of applicationVersionLen
	 *	@return applicationVersionLen
	 */
	public short getApplicationVersionLen() throws CFException {
        if (isApplicationVersionLenModified()) { 
           applicationVersionLen = refreshApplicationVersionLen();
        }
   		return applicationVersionLen;
	}
	
	/**
	 * 	Update ApplicationVersionLen with the passed value
	 *  Corresponding COBOL Variable is APPLICATION-VERSION-LEN
	 *	@param number
	 */
	public void setApplicationVersionLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    applicationVersionLen = checkApplicationVersionLenMaxLimit(number); 
		serializeApplicationVersionLen(applicationVersionLen);
	}

	public void setApplicationVersionLen(int number) {
	    number = checkApplicationVersionLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setApplicationVersionLen((short)number);
	}
	public void setApplicationVersionLen(long number) {
	    number = checkApplicationVersionLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setApplicationVersionLen((short)number);
	}
	


	
	
	

		public static int getApplicationVersionFieldLength() {
			return APPLICATION_VERSION_LENGTH;
		}

}
  
