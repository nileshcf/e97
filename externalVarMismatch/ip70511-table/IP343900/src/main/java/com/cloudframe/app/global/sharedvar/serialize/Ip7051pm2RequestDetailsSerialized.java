package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip7051pm2RequestDetailsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip7051pm2RequestDetailsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip7051pm2RequestDetailsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_7051PM_2_REQUEST_DETAILS_LENGTH = 96;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp7051pm2ReqQMgrName;
            protected  int beginIp7051pm2ReqQName;
	
	/**
	* Constructor for Ip7051pm2RequestDetailsSerialized
	**/
    public Ip7051pm2RequestDetailsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip7051pm2RequestDetailsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051pm2RequestDetailsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip7051pm2RequestDetailsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,33); // serialize this field at offset 33 by default 
    }
    
	/**
	* sets parent for this Ip7051pm2RequestDetailsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 33 by default
    }    
	/**
	* initializes the field in Ip7051pm2RequestDetailsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_7051PM_2_REQUEST_DETAILS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp7051pm2ReqQMgrName = getStartOffset() + 0;	// set offset for serialization
  
             beginIp7051pm2ReqQName = getStartOffset() + 48;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp7051pm2ReqQMgrNameCounter = -1;
     public boolean isIp7051pm2ReqQMgrNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pm2ReqQMgrNameCounter != sharedCounter;
         localIp7051pm2ReqQMgrNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051PM_2_REQ_QMGR_NAME_LEN = 48;
	/**
	 * 	serialize this Ip7051pm2ReqQMgrName
	 */
   protected void serializeIp7051pm2ReqQMgrName(char[] ip7051pm2ReqQMgrName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051pm2ReqQMgrName,0,getStringValue(),beginIp7051pm2ReqQMgrName,IP_7051PM_2_REQ_QMGR_NAME_LEN);
       localIp7051pm2ReqQMgrNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051pm2ReqQMgrNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp7051pm2ReqQMgrName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051pm2ReqQMgrName() {	 
   		return (substring(getStringValue(),beginIp7051pm2ReqQMgrName,beginIp7051pm2ReqQMgrName + IP_7051PM_2_REQ_QMGR_NAME_LEN));
   	}
     int localIp7051pm2ReqQNameCounter = -1;
     public boolean isIp7051pm2ReqQNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pm2ReqQNameCounter != sharedCounter;
         localIp7051pm2ReqQNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051PM_2_REQ_QNAME_LEN = 48;
	/**
	 * 	serialize this Ip7051pm2ReqQName
	 */
   protected void serializeIp7051pm2ReqQName(char[] ip7051pm2ReqQName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051pm2ReqQName,0,getStringValue(),beginIp7051pm2ReqQName,IP_7051PM_2_REQ_QNAME_LEN);
       localIp7051pm2ReqQNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051pm2ReqQNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp7051pm2ReqQName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051pm2ReqQName() {	 
   		return (substring(getStringValue(),beginIp7051pm2ReqQName,beginIp7051pm2ReqQName + IP_7051PM_2_REQ_QNAME_LEN));
   	}




}
  
