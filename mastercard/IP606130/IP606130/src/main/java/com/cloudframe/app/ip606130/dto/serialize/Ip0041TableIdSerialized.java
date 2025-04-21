package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip0041TableIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0041TableIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0041TableIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0041_TABLE_ID_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0041TableNo;
	
	/**
	* Constructor for Ip0041TableIdSerialized
	**/
    public Ip0041TableIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0041TableIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0041TableIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0041TableIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11); // serialize this field at offset 11 by default 
    }
    
	/**
	* sets parent for this Ip0041TableIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11 by default
    }    
	/**
	* initializes the field in Ip0041TableIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0041_TABLE_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp0041TableNo = getStartOffset() + 2;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp0041TableNoCounter = -1;
     public boolean isIp0041TableNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0041TableNoCounter != sharedCounter;
         localIp0041TableNoCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0041_TABLE_NO_LEN = 4;
	/**
	 * 	serialize this Ip0041TableNo
	 */
   protected void serializeIp0041TableNo(char[] ip0041TableNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0041TableNo,0,getStringValue(),beginIp0041TableNo,IP_0041_TABLE_NO_LEN);
       localIp0041TableNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0041TableNoConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp0041TableNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0041TableNo() {	 
   		return (substring(getStringValue(),beginIp0041TableNo,beginIp0041TableNo + IP_0041_TABLE_NO_LEN));
   	}




}
  
