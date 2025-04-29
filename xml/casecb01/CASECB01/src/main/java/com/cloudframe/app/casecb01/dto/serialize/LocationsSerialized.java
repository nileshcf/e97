package com.cloudframe.app.casecb01.dto.serialize;

/**
*  The class LocationsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LocationsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LocationsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LOCATIONS_LENGTH = 32;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginState;
            protected  int beginStreetaddress;
	
	/**
	* Constructor for LocationsSerialized
	**/
    public LocationsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for LocationsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LocationsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this LocationsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,40); // serialize this field at offset 40 by default 
    }
    
	/**
	* sets parent for this LocationsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 40 by default
    }    
	/**
	* initializes the field in LocationsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LOCATIONS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginState = getStartOffset() + 0;	// set offset for serialization
  
             beginStreetaddress = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localStateCounter = -1;
     public boolean isStateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStateCounter != sharedCounter;
         localStateCounter = sharedCounter; return hasModified;
     }
	protected static final int STATE_LEN = 2;
	/**
	 * 	serialize this State
	 */
   protected void serializeState(char[] state) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(state,0,getStringValue(),beginState,STATE_LEN);
       localStateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStateConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshState is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshState() {	 
   		return (substring(getStringValue(),beginState,beginState + STATE_LEN));
   	}
     int localStreetaddressCounter = -1;
     public boolean isStreetaddressModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStreetaddressCounter != sharedCounter;
         localStreetaddressCounter = sharedCounter; return hasModified;
     }
	protected static final int STREETADDRESS_LEN = 30;
	/**
	 * 	serialize this Streetaddress
	 */
   protected void serializeStreetaddress(char[] streetaddress) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(streetaddress,0,getStringValue(),beginStreetaddress,STREETADDRESS_LEN);
       localStreetaddressCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStreetaddressConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshStreetaddress is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStreetaddress() {	 
   		return (substring(getStringValue(),beginStreetaddress,beginStreetaddress + STREETADDRESS_LEN));
   	}




}
  
