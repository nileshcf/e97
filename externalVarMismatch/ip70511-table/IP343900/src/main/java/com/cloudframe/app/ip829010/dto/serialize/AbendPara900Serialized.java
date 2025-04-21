package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class AbendPara900Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AbendPara900Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AbendPara900Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ABEND_PARA_900_LENGTH = 42;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAbendParaName900;
	
	/**
	* Constructor for AbendPara900Serialized
	**/
    public AbendPara900Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AbendPara900Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ABEND_PARA_900_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginAbendParaName900 = getStartOffset() + 12;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAbendParaName900Counter = -1;
     public boolean isAbendParaName900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendParaName900Counter != sharedCounter;
         localAbendParaName900Counter = sharedCounter; return hasModified;
     }
	protected static final int ABEND_PARA_NAME_900_LEN = 30;
	/**
	 * 	serialize this AbendParaName900
	 */
   protected void serializeAbendParaName900(char[] abendParaName900) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(abendParaName900,0,getStringValue(),beginAbendParaName900,ABEND_PARA_NAME_900_LEN);
       localAbendParaName900Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAbendParaName900Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshAbendParaName900 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAbendParaName900() {	 
   		return (substring(getStringValue(),beginAbendParaName900,beginAbendParaName900 + ABEND_PARA_NAME_900_LEN));
   	}




}
  
