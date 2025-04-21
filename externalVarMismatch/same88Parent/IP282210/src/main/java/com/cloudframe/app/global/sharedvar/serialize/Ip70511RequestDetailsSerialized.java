package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70511RequestDetailsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70511RequestDetailsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70511RequestDetailsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70511_REQUEST_DETAILS_LENGTH = 96;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70511ReqQMgrName;
            protected  int beginIp70511ReqQName;
	
	/**
	* Constructor for Ip70511RequestDetailsSerialized
	**/
    public Ip70511RequestDetailsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip70511RequestDetailsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip70511RequestDetailsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip70511RequestDetailsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,33); // serialize this field at offset 33 by default 
    }
    
	/**
	* sets parent for this Ip70511RequestDetailsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 33 by default
    }    
	/**
	* initializes the field in Ip70511RequestDetailsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70511_REQUEST_DETAILS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70511ReqQMgrName = getStartOffset() + 0;	// set offset for serialization
  
             beginIp70511ReqQName = getStartOffset() + 48;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70511ReqQMgrNameCounter = -1;
     public boolean isIp70511ReqQMgrNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70511ReqQMgrNameCounter != sharedCounter;
         localIp70511ReqQMgrNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70511_REQ_QMGR_NAME_LEN = 48;
	/**
	 * 	serialize this Ip70511ReqQMgrName
	 */
   protected void serializeIp70511ReqQMgrName(char[] ip70511ReqQMgrName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70511ReqQMgrName,0,getStringValue(),beginIp70511ReqQMgrName,IP_70511_REQ_QMGR_NAME_LEN);
       localIp70511ReqQMgrNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70511ReqQMgrNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp70511ReqQMgrName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70511ReqQMgrName() {	 
   		return (substring(getStringValue(),beginIp70511ReqQMgrName,beginIp70511ReqQMgrName + IP_70511_REQ_QMGR_NAME_LEN));
   	}
     int localIp70511ReqQNameCounter = -1;
     public boolean isIp70511ReqQNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70511ReqQNameCounter != sharedCounter;
         localIp70511ReqQNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70511_REQ_QNAME_LEN = 48;
	/**
	 * 	serialize this Ip70511ReqQName
	 */
   protected void serializeIp70511ReqQName(char[] ip70511ReqQName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70511ReqQName,0,getStringValue(),beginIp70511ReqQName,IP_70511_REQ_QNAME_LEN);
       localIp70511ReqQNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70511ReqQNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp70511ReqQName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70511ReqQName() {	 
   		return (substring(getStringValue(),beginIp70511ReqQName,beginIp70511ReqQName + IP_70511_REQ_QNAME_LEN));
   	}




}
  
