package com.cloudframe.app.cfstring.dto.serialize;

/**
*  The class ExtServiceStartDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ExtServiceStartDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ExtServiceStartDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EXT_SERVICE_START_DT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSlash3;
            protected  int beginSlash4;
	
	/**
	* Constructor for ExtServiceStartDtSerialized
	**/
    public ExtServiceStartDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ExtServiceStartDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtServiceStartDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ExtServiceStartDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1056); // serialize this field at offset 1056 by default 
    }
    
	/**
	* sets parent for this ExtServiceStartDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1056 by default
    }    
	/**
	* initializes the field in ExtServiceStartDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EXT_SERVICE_START_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSlash3 = getStartOffset() + 2;	// set offset for serialization
  
             beginSlash4 = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSlash3Counter = -1;
     public boolean isSlash3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSlash3Counter != sharedCounter;
         localSlash3Counter = sharedCounter; return hasModified;
     }
	protected static final int SLASH_3_LEN = 1;
	/**
	 * 	serialize this Slash3
	 */
   protected void serializeSlash3(char[] slash3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(slash3,0,getStringValue(),beginSlash3,SLASH_3_LEN);
       localSlash3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSlash3Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSlash3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSlash3() {	 
   		return (substring(getStringValue(),beginSlash3,beginSlash3 + SLASH_3_LEN));
   	}
     int localSlash4Counter = -1;
     public boolean isSlash4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSlash4Counter != sharedCounter;
         localSlash4Counter = sharedCounter; return hasModified;
     }
	protected static final int SLASH_4_LEN = 1;
	/**
	 * 	serialize this Slash4
	 */
   protected void serializeSlash4(char[] slash4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(slash4,0,getStringValue(),beginSlash4,SLASH_4_LEN);
       localSlash4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSlash4Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSlash4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSlash4() {	 
   		return (substring(getStringValue(),beginSlash4,beginSlash4 + SLASH_4_LEN));
   	}




}
  
