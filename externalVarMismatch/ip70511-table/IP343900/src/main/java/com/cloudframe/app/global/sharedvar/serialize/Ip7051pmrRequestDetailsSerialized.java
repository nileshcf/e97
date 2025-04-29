package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip7051pmrRequestDetailsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip7051pmrRequestDetailsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip7051pmrRequestDetailsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_7051PMR_REQUEST_DETAILS_LENGTH = 96;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp7051pmrReqQMgrName;
            protected  int beginIp7051pmrReqQName;
	
	/**
	* Constructor for Ip7051pmrRequestDetailsSerialized
	**/
    public Ip7051pmrRequestDetailsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip7051pmrRequestDetailsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051pmrRequestDetailsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip7051pmrRequestDetailsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,33); // serialize this field at offset 33 by default 
    }
    
	/**
	* sets parent for this Ip7051pmrRequestDetailsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 33 by default
    }    
	/**
	* initializes the field in Ip7051pmrRequestDetailsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_7051PMR_REQUEST_DETAILS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp7051pmrReqQMgrName = getStartOffset() + 0;	// set offset for serialization
  
             beginIp7051pmrReqQName = getStartOffset() + 48;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp7051pmrReqQMgrNameCounter = -1;
     public boolean isIp7051pmrReqQMgrNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pmrReqQMgrNameCounter != sharedCounter;
         localIp7051pmrReqQMgrNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051PMR_REQ_QMGR_NAME_LEN = 48;
	/**
	 * 	serialize this Ip7051pmrReqQMgrName
	 */
   protected void serializeIp7051pmrReqQMgrName(char[] ip7051pmrReqQMgrName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051pmrReqQMgrName,0,getStringValue(),beginIp7051pmrReqQMgrName,IP_7051PMR_REQ_QMGR_NAME_LEN);
       localIp7051pmrReqQMgrNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051pmrReqQMgrNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp7051pmrReqQMgrName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051pmrReqQMgrName() {	 
   		return (substring(getStringValue(),beginIp7051pmrReqQMgrName,beginIp7051pmrReqQMgrName + IP_7051PMR_REQ_QMGR_NAME_LEN));
   	}
     int localIp7051pmrReqQNameCounter = -1;
     public boolean isIp7051pmrReqQNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pmrReqQNameCounter != sharedCounter;
         localIp7051pmrReqQNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051PMR_REQ_QNAME_LEN = 48;
	/**
	 * 	serialize this Ip7051pmrReqQName
	 */
   protected void serializeIp7051pmrReqQName(char[] ip7051pmrReqQName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051pmrReqQName,0,getStringValue(),beginIp7051pmrReqQName,IP_7051PMR_REQ_QNAME_LEN);
       localIp7051pmrReqQNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051pmrReqQNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp7051pmrReqQName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051pmrReqQName() {	 
   		return (substring(getStringValue(),beginIp7051pmrReqQName,beginIp7051pmrReqQName + IP_7051PMR_REQ_QNAME_LEN));
   	}




}
  
