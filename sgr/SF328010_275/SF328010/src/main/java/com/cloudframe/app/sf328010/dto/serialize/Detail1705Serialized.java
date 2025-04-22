package com.cloudframe.app.sf328010.dto.serialize;

/**
*  The class Detail1705Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Detail1705Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Detail1705Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DETAIL_1705_LENGTH = 78;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginServiceName705;
	
	/**
	* Constructor for Detail1705Serialized
	**/
    public Detail1705Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Detail1705Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Detail1705Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Detail1705Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Detail1705Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Detail1705Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DETAIL_1705_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginServiceName705 = getStartOffset() + 6;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localServiceName705Counter = -1;
     public boolean isServiceName705Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localServiceName705Counter != sharedCounter;
         localServiceName705Counter = sharedCounter; return hasModified;
     }
	protected static final int SERVICE_NAME_705_LEN = 64;
	/**
	 * 	serialize this ServiceName705
	 */
   protected void serializeServiceName705(char[] serviceName705) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(serviceName705,0,getStringValue(),beginServiceName705,SERVICE_NAME_705_LEN);
       localServiceName705Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkServiceName705Constraints(char[] value) {
   			return super.checkConstraints(value , 64 ,false, false);
   }
    /**
	 *	refreshServiceName705 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshServiceName705() {	 
   		return (substring(getStringValue(),beginServiceName705,beginServiceName705 + SERVICE_NAME_705_LEN));
   	}




}
  
