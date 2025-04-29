package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip58041CreateUpdateTsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip58041CreateUpdateTsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip58041CreateUpdateTsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_58041_CREATE_UPDATE_TS_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp58041CreateTime;
	
	/**
	* Constructor for Ip58041CreateUpdateTsSerialized
	**/
    public Ip58041CreateUpdateTsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip58041CreateUpdateTsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip58041CreateUpdateTsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip58041CreateUpdateTsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,19); // serialize this field at offset 19 by default 
    }
    
	/**
	* sets parent for this Ip58041CreateUpdateTsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 19 by default
    }    
	/**
	* initializes the field in Ip58041CreateUpdateTsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_58041_CREATE_UPDATE_TS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp58041CreateTime = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp58041CreateTimeCounter = -1;
     public boolean isIp58041CreateTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp58041CreateTimeCounter != sharedCounter;
         localIp58041CreateTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_58041_CREATE_TIME_LEN = 16;
	/**
	 * 	serialize this Ip58041CreateTime
	 */
   protected void serializeIp58041CreateTime(char[] ip58041CreateTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip58041CreateTime,0,getStringValue(),beginIp58041CreateTime,IP_58041_CREATE_TIME_LEN);
       localIp58041CreateTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp58041CreateTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshIp58041CreateTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp58041CreateTime() {	 
   		return (substring(getStringValue(),beginIp58041CreateTime,beginIp58041CreateTime + IP_58041_CREATE_TIME_LEN));
   	}




}
  
