package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip500041TableKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip500041TableKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip500041TableKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_500041_TABLE_KEY_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp500041EffDate;
	
	/**
	* Constructor for Ip500041TableKeySerialized
	**/
    public Ip500041TableKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip500041TableKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip500041TableKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip500041TableKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip500041TableKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip500041TableKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_500041_TABLE_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp500041EffDate = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp500041EffDateCounter = -1;
     public boolean isIp500041EffDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp500041EffDateCounter != sharedCounter;
         localIp500041EffDateCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_500041_EFF_DATE_LEN = 10;
	/**
	 * 	serialize this Ip500041EffDate
	 */
   protected void serializeIp500041EffDate(char[] ip500041EffDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip500041EffDate,0,getStringValue(),beginIp500041EffDate,IP_500041_EFF_DATE_LEN);
       localIp500041EffDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp500041EffDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshIp500041EffDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp500041EffDate() {	 
   		return (substring(getStringValue(),beginIp500041EffDate,beginIp500041EffDate + IP_500041_EFF_DATE_LEN));
   	}




}
  
