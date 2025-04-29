package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AS17Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AS17Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AS17Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_S_17_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginASFld117;
            protected  int beginASFld217;
	
	/**
	* Constructor for AS17Serialized
	**/
    public AS17Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in AS17Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_S_17_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginASFld117 = getStartOffset() + 0;	// set offset for serialization
  
             beginASFld217 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localASFld117Counter = -1;
     public boolean isASFld117Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld117Counter != sharedCounter;
         localASFld117Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_117_LEN = 30;
	/**
	 * 	serialize this ASFld117
	 */
   protected void serializeASFld117(char[] aSFld117) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld117,0,getStringValue(),beginASFld117,A_SFLD_117_LEN);
       localASFld117Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld117Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshASFld117 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld117() {	 
   		return (substring(getStringValue(),beginASFld117,beginASFld117 + A_SFLD_117_LEN));
   	}
     int localASFld217Counter = -1;
     public boolean isASFld217Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld217Counter != sharedCounter;
         localASFld217Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_217_LEN = 40;
	/**
	 * 	serialize this ASFld217
	 */
   protected void serializeASFld217(char[] aSFld217) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld217,0,getStringValue(),beginASFld217,A_SFLD_217_LEN);
       localASFld217Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld217Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshASFld217 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld217() {	 
   		return (substring(getStringValue(),beginASFld217,beginASFld217 + A_SFLD_217_LEN));
   	}




}
  
