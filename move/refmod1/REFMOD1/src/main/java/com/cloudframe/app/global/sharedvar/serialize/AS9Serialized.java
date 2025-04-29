package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AS9Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AS9Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AS9Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_S_9_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginASFld19;
            protected  int beginASFld29;
	
	/**
	* Constructor for AS9Serialized
	**/
    public AS9Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AS9Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AS9Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AS9Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this AS9Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in AS9Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_S_9_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginASFld19 = getStartOffset() + 0;	// set offset for serialization
  
             beginASFld29 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localASFld19Counter = -1;
     public boolean isASFld19Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld19Counter != sharedCounter;
         localASFld19Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_19_LEN = 30;
	/**
	 * 	serialize this ASFld19
	 */
   protected void serializeASFld19(char[] aSFld19) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld19,0,getStringValue(),beginASFld19,A_SFLD_19_LEN);
       localASFld19Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld19Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshASFld19 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld19() {	 
   		return (substring(getStringValue(),beginASFld19,beginASFld19 + A_SFLD_19_LEN));
   	}
     int localASFld29Counter = -1;
     public boolean isASFld29Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld29Counter != sharedCounter;
         localASFld29Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_29_LEN = 40;
	/**
	 * 	serialize this ASFld29
	 */
   protected void serializeASFld29(char[] aSFld29) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld29,0,getStringValue(),beginASFld29,A_SFLD_29_LEN);
       localASFld29Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld29Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshASFld29 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld29() {	 
   		return (substring(getStringValue(),beginASFld29,beginASFld29 + A_SFLD_29_LEN));
   	}




}
  
