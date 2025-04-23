package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class LocalEnvTitleSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LocalEnvTitleSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LocalEnvTitleSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LOCAL_ENV_TITLE_LENGTH = 28;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLocalEnviron;
	
	/**
	* Constructor for LocalEnvTitleSerialized
	**/
    public LocalEnvTitleSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LocalEnvTitleSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LOCAL_ENV_TITLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLocalEnviron = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localLocalEnvironCounter = -1;
     public boolean isLocalEnvironModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLocalEnvironCounter != sharedCounter;
         localLocalEnvironCounter = sharedCounter; return hasModified;
     }
	protected static final int LOCAL_ENVIRON_LEN = 14;
	/**
	 * 	serialize this LocalEnviron
	 */
   protected void serializeLocalEnviron(char[] localEnviron) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(localEnviron,0,getStringValue(),beginLocalEnviron,LOCAL_ENVIRON_LEN);
       localLocalEnvironCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLocalEnvironConstraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshLocalEnviron is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLocalEnviron() {	 
   		return (substring(getStringValue(),beginLocalEnviron,beginLocalEnviron + LOCAL_ENVIRON_LEN));
   	}




}
  
