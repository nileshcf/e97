package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ErrorTableGroup590Array1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorTableGroup590Array1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorTableGroup590Array1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_TABLE_GROUP_590_ARRAY_1_LENGTH = 54;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginErrorId590;
            protected  int beginErrorText590;
	
	/**
	* Constructor for ErrorTableGroup590Array1Serialized
	**/
    public ErrorTableGroup590Array1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ErrorTableGroup590Array1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrorTableGroup590Array1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ErrorTableGroup590Array1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ErrorTableGroup590Array1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ErrorTableGroup590Array1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_TABLE_GROUP_590_ARRAY_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginErrorId590 = getStartOffset() + 0;	// set offset for serialization
  
             beginErrorText590 = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localErrorId590Counter = -1;
     public boolean isErrorId590Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorId590Counter != sharedCounter;
         localErrorId590Counter = sharedCounter; return hasModified;
     }
	protected static final int ERROR_ID_590_LEN = 4;
	/**
	 * 	serialize this ErrorId590
	 */
   protected void serializeErrorId590(char[] errorId590) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errorId590,0,getStringValue(),beginErrorId590,ERROR_ID_590_LEN);
       localErrorId590Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrorId590Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshErrorId590 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrorId590() {	 
   		return (substring(getStringValue(),beginErrorId590,beginErrorId590 + ERROR_ID_590_LEN));
   	}
     int localErrorText590Counter = -1;
     public boolean isErrorText590Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorText590Counter != sharedCounter;
         localErrorText590Counter = sharedCounter; return hasModified;
     }
	protected static final int ERROR_TEXT_590_LEN = 50;
	/**
	 * 	serialize this ErrorText590
	 */
   protected void serializeErrorText590(char[] errorText590) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errorText590,0,getStringValue(),beginErrorText590,ERROR_TEXT_590_LEN);
       localErrorText590Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrorText590Constraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshErrorText590 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrorText590() {	 
   		return (substring(getStringValue(),beginErrorText590,beginErrorText590 + ERROR_TEXT_590_LEN));
   	}




}
  
