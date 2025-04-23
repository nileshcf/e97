package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50004iTableIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50004iTableIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50004iTableIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50004I_TABLE_ID_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50004iTableNo;
            protected  int beginIp50004iTableVersion;
	
	/**
	* Constructor for Ip50004iTableIdSerialized
	**/
    public Ip50004iTableIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip50004iTableIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50004iTableIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip50004iTableIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip50004iTableIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip50004iTableIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50004I_TABLE_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp50004iTableNo = getStartOffset() + 2;	// set offset for serialization
  
             beginIp50004iTableVersion = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp50004iTableNoCounter = -1;
     public boolean isIp50004iTableNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50004iTableNoCounter != sharedCounter;
         localIp50004iTableNoCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50004I_TABLE_NO_LEN = 4;
	/**
	 * 	serialize this Ip50004iTableNo
	 */
   protected void serializeIp50004iTableNo(char[] ip50004iTableNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50004iTableNo,0,getStringValue(),beginIp50004iTableNo,IP_50004I_TABLE_NO_LEN);
       localIp50004iTableNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50004iTableNoConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp50004iTableNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50004iTableNo() {	 
   		return (substring(getStringValue(),beginIp50004iTableNo,beginIp50004iTableNo + IP_50004I_TABLE_NO_LEN));
   	}
     int localIp50004iTableVersionCounter = -1;
     public boolean isIp50004iTableVersionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50004iTableVersionCounter != sharedCounter;
         localIp50004iTableVersionCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50004I_TABLE_VERSION_LEN = 2;
	/**
	 * 	serialize this Ip50004iTableVersion
	 */
   protected void serializeIp50004iTableVersion(char[] ip50004iTableVersion) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50004iTableVersion,0,getStringValue(),beginIp50004iTableVersion,IP_50004I_TABLE_VERSION_LEN);
       localIp50004iTableVersionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50004iTableVersionConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp50004iTableVersion is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50004iTableVersion() {	 
   		return (substring(getStringValue(),beginIp50004iTableVersion,beginIp50004iTableVersion + IP_50004I_TABLE_VERSION_LEN));
   	}




}
  
