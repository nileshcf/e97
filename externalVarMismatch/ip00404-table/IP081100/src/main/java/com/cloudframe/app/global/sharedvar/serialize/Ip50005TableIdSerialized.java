package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50005TableIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50005TableIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50005TableIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50005_TABLE_ID_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50005TableNo;
            protected  int beginIp50005TableVersion;
	
	/**
	* Constructor for Ip50005TableIdSerialized
	**/
    public Ip50005TableIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip50005TableIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50005TableIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip50005TableIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip50005TableIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip50005TableIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50005_TABLE_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp50005TableNo = getStartOffset() + 2;	// set offset for serialization
  
             beginIp50005TableVersion = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp50005TableNoCounter = -1;
     public boolean isIp50005TableNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50005TableNoCounter != sharedCounter;
         localIp50005TableNoCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50005_TABLE_NO_LEN = 4;
	/**
	 * 	serialize this Ip50005TableNo
	 */
   protected void serializeIp50005TableNo(char[] ip50005TableNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50005TableNo,0,getStringValue(),beginIp50005TableNo,IP_50005_TABLE_NO_LEN);
       localIp50005TableNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50005TableNoConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp50005TableNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50005TableNo() {	 
   		return (substring(getStringValue(),beginIp50005TableNo,beginIp50005TableNo + IP_50005_TABLE_NO_LEN));
   	}
     int localIp50005TableVersionCounter = -1;
     public boolean isIp50005TableVersionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50005TableVersionCounter != sharedCounter;
         localIp50005TableVersionCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50005_TABLE_VERSION_LEN = 2;
	/**
	 * 	serialize this Ip50005TableVersion
	 */
   protected void serializeIp50005TableVersion(char[] ip50005TableVersion) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50005TableVersion,0,getStringValue(),beginIp50005TableVersion,IP_50005_TABLE_VERSION_LEN);
       localIp50005TableVersionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50005TableVersionConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp50005TableVersion is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50005TableVersion() {	 
   		return (substring(getStringValue(),beginIp50005TableVersion,beginIp50005TableVersion + IP_50005_TABLE_VERSION_LEN));
   	}




}
  
