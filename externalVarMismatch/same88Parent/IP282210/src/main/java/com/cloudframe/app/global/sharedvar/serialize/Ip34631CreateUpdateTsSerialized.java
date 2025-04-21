package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip34631CreateUpdateTsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip34631CreateUpdateTsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip34631CreateUpdateTsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_34631_CREATE_UPDATE_TS_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp34631CreateTime;
	
	/**
	* Constructor for Ip34631CreateUpdateTsSerialized
	**/
    public Ip34631CreateUpdateTsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip34631CreateUpdateTsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip34631CreateUpdateTsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip34631CreateUpdateTsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,19); // serialize this field at offset 19 by default 
    }
    
	/**
	* sets parent for this Ip34631CreateUpdateTsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 19 by default
    }    
	/**
	* initializes the field in Ip34631CreateUpdateTsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_34631_CREATE_UPDATE_TS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp34631CreateTime = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp34631CreateTimeCounter = -1;
     public boolean isIp34631CreateTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp34631CreateTimeCounter != sharedCounter;
         localIp34631CreateTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_34631_CREATE_TIME_LEN = 16;
	/**
	 * 	serialize this Ip34631CreateTime
	 */
   protected void serializeIp34631CreateTime(char[] ip34631CreateTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip34631CreateTime,0,getStringValue(),beginIp34631CreateTime,IP_34631_CREATE_TIME_LEN);
       localIp34631CreateTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp34631CreateTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshIp34631CreateTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp34631CreateTime() {	 
   		return (substring(getStringValue(),beginIp34631CreateTime,beginIp34631CreateTime + IP_34631_CREATE_TIME_LEN));
   	}




}
  
