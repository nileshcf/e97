package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AS13Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AS13Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AS13Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_S_13_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginASFld113;
            protected  int beginASFld213;
	
	/**
	* Constructor for AS13Serialized
	**/
    public AS13Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AS13Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AS13Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AS13Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this AS13Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in AS13Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_S_13_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginASFld113 = getStartOffset() + 0;	// set offset for serialization
  
             beginASFld213 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localASFld113Counter = -1;
     public boolean isASFld113Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld113Counter != sharedCounter;
         localASFld113Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_113_LEN = 30;
	/**
	 * 	serialize this ASFld113
	 */
   protected void serializeASFld113(char[] aSFld113) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld113,0,getStringValue(),beginASFld113,A_SFLD_113_LEN);
       localASFld113Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld113Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshASFld113 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld113() {	 
   		return (substring(getStringValue(),beginASFld113,beginASFld113 + A_SFLD_113_LEN));
   	}
     int localASFld213Counter = -1;
     public boolean isASFld213Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld213Counter != sharedCounter;
         localASFld213Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_213_LEN = 40;
	/**
	 * 	serialize this ASFld213
	 */
   protected void serializeASFld213(char[] aSFld213) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld213,0,getStringValue(),beginASFld213,A_SFLD_213_LEN);
       localASFld213Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld213Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshASFld213 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld213() {	 
   		return (substring(getStringValue(),beginASFld213,beginASFld213 + A_SFLD_213_LEN));
   	}




}
  
