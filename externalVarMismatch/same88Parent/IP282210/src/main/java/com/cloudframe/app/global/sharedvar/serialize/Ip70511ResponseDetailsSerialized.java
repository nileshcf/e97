package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70511ResponseDetailsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70511ResponseDetailsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70511ResponseDetailsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70511_RESPONSE_DETAILS_LENGTH = 96;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70511ResQMgrName;
            protected  int beginIp70511ResQName;
	
	/**
	* Constructor for Ip70511ResponseDetailsSerialized
	**/
    public Ip70511ResponseDetailsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip70511ResponseDetailsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip70511ResponseDetailsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip70511ResponseDetailsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,129); // serialize this field at offset 129 by default 
    }
    
	/**
	* sets parent for this Ip70511ResponseDetailsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 129 by default
    }    
	/**
	* initializes the field in Ip70511ResponseDetailsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70511_RESPONSE_DETAILS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70511ResQMgrName = getStartOffset() + 0;	// set offset for serialization
  
             beginIp70511ResQName = getStartOffset() + 48;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70511ResQMgrNameCounter = -1;
     public boolean isIp70511ResQMgrNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70511ResQMgrNameCounter != sharedCounter;
         localIp70511ResQMgrNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70511_RES_QMGR_NAME_LEN = 48;
	/**
	 * 	serialize this Ip70511ResQMgrName
	 */
   protected void serializeIp70511ResQMgrName(char[] ip70511ResQMgrName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70511ResQMgrName,0,getStringValue(),beginIp70511ResQMgrName,IP_70511_RES_QMGR_NAME_LEN);
       localIp70511ResQMgrNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70511ResQMgrNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp70511ResQMgrName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70511ResQMgrName() {	 
   		return (substring(getStringValue(),beginIp70511ResQMgrName,beginIp70511ResQMgrName + IP_70511_RES_QMGR_NAME_LEN));
   	}
     int localIp70511ResQNameCounter = -1;
     public boolean isIp70511ResQNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70511ResQNameCounter != sharedCounter;
         localIp70511ResQNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70511_RES_QNAME_LEN = 48;
	/**
	 * 	serialize this Ip70511ResQName
	 */
   protected void serializeIp70511ResQName(char[] ip70511ResQName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70511ResQName,0,getStringValue(),beginIp70511ResQName,IP_70511_RES_QNAME_LEN);
       localIp70511ResQNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70511ResQNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp70511ResQName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70511ResQName() {	 
   		return (substring(getStringValue(),beginIp70511ResQName,beginIp70511ResQName + IP_70511_RES_QNAME_LEN));
   	}




}
  
