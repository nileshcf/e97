package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ApplicationDsn1000Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ApplicationDsn1000Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ApplicationDsn1000Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int APPLICATION_DSN_1000_LENGTH = 44;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginApplicationDd1000;
	
	/**
	* Constructor for ApplicationDsn1000Serialized
	**/
    public ApplicationDsn1000Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ApplicationDsn1000Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ApplicationDsn1000Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ApplicationDsn1000Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,24); // serialize this field at offset 24 by default 
    }
    
	/**
	* sets parent for this ApplicationDsn1000Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 24 by default
    }    
	/**
	* initializes the field in ApplicationDsn1000Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(APPLICATION_DSN_1000_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginApplicationDd1000 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localApplicationDd1000Counter = -1;
     public boolean isApplicationDd1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localApplicationDd1000Counter != sharedCounter;
         localApplicationDd1000Counter = sharedCounter; return hasModified;
     }
	protected static final int APPLICATION_DD_1000_LEN = 8;
	/**
	 * 	serialize this ApplicationDd1000
	 */
   protected void serializeApplicationDd1000(char[] applicationDd1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(applicationDd1000,0,getStringValue(),beginApplicationDd1000,APPLICATION_DD_1000_LEN);
       localApplicationDd1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkApplicationDd1000Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshApplicationDd1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshApplicationDd1000() {	 
   		return (substring(getStringValue(),beginApplicationDd1000,beginApplicationDd1000 + APPLICATION_DD_1000_LEN));
   	}




}
  
