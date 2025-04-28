package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip500041TableIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip500041TableIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip500041TableIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_500041_TABLE_ID_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp500041TableNo;
            protected  int beginIp500041TableVersion;
	
	/**
	* Constructor for Ip500041TableIdSerialized
	**/
    public Ip500041TableIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip500041TableIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip500041TableIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip500041TableIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip500041TableIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip500041TableIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_500041_TABLE_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp500041TableNo = getStartOffset() + 2;	// set offset for serialization
  
             beginIp500041TableVersion = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp500041TableNoCounter = -1;
     public boolean isIp500041TableNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp500041TableNoCounter != sharedCounter;
         localIp500041TableNoCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_500041_TABLE_NO_LEN = 4;
	/**
	 * 	serialize this Ip500041TableNo
	 */
   protected void serializeIp500041TableNo(char[] ip500041TableNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip500041TableNo,0,getStringValue(),beginIp500041TableNo,IP_500041_TABLE_NO_LEN);
       localIp500041TableNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp500041TableNoConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp500041TableNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp500041TableNo() {	 
   		return (substring(getStringValue(),beginIp500041TableNo,beginIp500041TableNo + IP_500041_TABLE_NO_LEN));
   	}
     int localIp500041TableVersionCounter = -1;
     public boolean isIp500041TableVersionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp500041TableVersionCounter != sharedCounter;
         localIp500041TableVersionCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_500041_TABLE_VERSION_LEN = 2;
	/**
	 * 	serialize this Ip500041TableVersion
	 */
   protected void serializeIp500041TableVersion(char[] ip500041TableVersion) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip500041TableVersion,0,getStringValue(),beginIp500041TableVersion,IP_500041_TABLE_VERSION_LEN);
       localIp500041TableVersionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp500041TableVersionConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp500041TableVersion is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp500041TableVersion() {	 
   		return (substring(getStringValue(),beginIp500041TableVersion,beginIp500041TableVersion + IP_500041_TABLE_VERSION_LEN));
   	}




}
  
