package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AS7Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AS7Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AS7Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_S_7_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginASFld17;
            protected  int beginASFld27;
	
	/**
	* Constructor for AS7Serialized
	**/
    public AS7Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in AS7Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_S_7_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginASFld17 = getStartOffset() + 0;	// set offset for serialization
  
             beginASFld27 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localASFld17Counter = -1;
     public boolean isASFld17Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld17Counter != sharedCounter;
         localASFld17Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_17_LEN = 30;
	/**
	 * 	serialize this ASFld17
	 */
   protected void serializeASFld17(char[] aSFld17) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld17,0,getStringValue(),beginASFld17,A_SFLD_17_LEN);
       localASFld17Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld17Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshASFld17 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld17() {	 
   		return (substring(getStringValue(),beginASFld17,beginASFld17 + A_SFLD_17_LEN));
   	}
     int localASFld27Counter = -1;
     public boolean isASFld27Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld27Counter != sharedCounter;
         localASFld27Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_27_LEN = 40;
	/**
	 * 	serialize this ASFld27
	 */
   protected void serializeASFld27(char[] aSFld27) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld27,0,getStringValue(),beginASFld27,A_SFLD_27_LEN);
       localASFld27Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld27Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshASFld27 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld27() {	 
   		return (substring(getStringValue(),beginASFld27,beginASFld27 + A_SFLD_27_LEN));
   	}




}
  
