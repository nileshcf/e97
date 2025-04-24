package com.cloudframe.app.ip202330.dto.serialize;

/**
*  The class AbendParaName900Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AbendParaName900Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AbendParaName900Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ABEND_PARA_NAME_900_LENGTH = 42;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAbendPara900;
	
	/**
	* Constructor for AbendParaName900Serialized
	**/
    public AbendParaName900Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AbendParaName900Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ABEND_PARA_NAME_900_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginAbendPara900 = getStartOffset() + 12;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAbendPara900Counter = -1;
     public boolean isAbendPara900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendPara900Counter != sharedCounter;
         localAbendPara900Counter = sharedCounter; return hasModified;
     }
	protected static final int ABEND_PARA_900_LEN = 30;
	/**
	 * 	serialize this AbendPara900
	 */
   protected void serializeAbendPara900(char[] abendPara900) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(abendPara900,0,getStringValue(),beginAbendPara900,ABEND_PARA_900_LEN);
       localAbendPara900Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAbendPara900Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshAbendPara900 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAbendPara900() {	 
   		return (substring(getStringValue(),beginAbendPara900,beginAbendPara900 + ABEND_PARA_900_LEN));
   	}




}
  
