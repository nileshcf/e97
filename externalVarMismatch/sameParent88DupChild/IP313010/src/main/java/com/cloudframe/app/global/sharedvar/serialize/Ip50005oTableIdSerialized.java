package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50005oTableIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:41. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50005oTableIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50005oTableIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50005O_TABLE_ID_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50005oTableNo;
            protected  int beginIp50005oTableVersion;
	
	/**
	* Constructor for Ip50005oTableIdSerialized
	**/
    public Ip50005oTableIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip50005oTableIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50005oTableIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip50005oTableIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip50005oTableIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip50005oTableIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50005O_TABLE_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp50005oTableNo = getStartOffset() + 2;	// set offset for serialization
  
             beginIp50005oTableVersion = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp50005oTableNoCounter = -1;
     public boolean isIp50005oTableNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50005oTableNoCounter != sharedCounter;
         localIp50005oTableNoCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50005O_TABLE_NO_LEN = 4;
	/**
	 * 	serialize this Ip50005oTableNo
	 */
   protected void serializeIp50005oTableNo(char[] ip50005oTableNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50005oTableNo,0,getStringValue(),beginIp50005oTableNo,IP_50005O_TABLE_NO_LEN);
       localIp50005oTableNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50005oTableNoConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp50005oTableNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50005oTableNo() {	 
   		return (substring(getStringValue(),beginIp50005oTableNo,beginIp50005oTableNo + IP_50005O_TABLE_NO_LEN));
   	}
     int localIp50005oTableVersionCounter = -1;
     public boolean isIp50005oTableVersionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50005oTableVersionCounter != sharedCounter;
         localIp50005oTableVersionCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50005O_TABLE_VERSION_LEN = 2;
	/**
	 * 	serialize this Ip50005oTableVersion
	 */
   protected void serializeIp50005oTableVersion(char[] ip50005oTableVersion) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50005oTableVersion,0,getStringValue(),beginIp50005oTableVersion,IP_50005O_TABLE_VERSION_LEN);
       localIp50005oTableVersionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50005oTableVersionConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp50005oTableVersion is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50005oTableVersion() {	 
   		return (substring(getStringValue(),beginIp50005oTableVersion,beginIp50005oTableVersion + IP_50005O_TABLE_VERSION_LEN));
   	}




}
  
