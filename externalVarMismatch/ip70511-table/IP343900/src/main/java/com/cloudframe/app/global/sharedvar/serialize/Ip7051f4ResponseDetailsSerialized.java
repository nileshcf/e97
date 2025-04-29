package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip7051f4ResponseDetailsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip7051f4ResponseDetailsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip7051f4ResponseDetailsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_7051F_4_RESPONSE_DETAILS_LENGTH = 96;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp7051f4ResQMgrName;
            protected  int beginIp7051f4ResQName;
	
	/**
	* Constructor for Ip7051f4ResponseDetailsSerialized
	**/
    public Ip7051f4ResponseDetailsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip7051f4ResponseDetailsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051f4ResponseDetailsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip7051f4ResponseDetailsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,129); // serialize this field at offset 129 by default 
    }
    
	/**
	* sets parent for this Ip7051f4ResponseDetailsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 129 by default
    }    
	/**
	* initializes the field in Ip7051f4ResponseDetailsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_7051F_4_RESPONSE_DETAILS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp7051f4ResQMgrName = getStartOffset() + 0;	// set offset for serialization
  
             beginIp7051f4ResQName = getStartOffset() + 48;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp7051f4ResQMgrNameCounter = -1;
     public boolean isIp7051f4ResQMgrNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051f4ResQMgrNameCounter != sharedCounter;
         localIp7051f4ResQMgrNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051F_4_RES_QMGR_NAME_LEN = 48;
	/**
	 * 	serialize this Ip7051f4ResQMgrName
	 */
   protected void serializeIp7051f4ResQMgrName(char[] ip7051f4ResQMgrName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051f4ResQMgrName,0,getStringValue(),beginIp7051f4ResQMgrName,IP_7051F_4_RES_QMGR_NAME_LEN);
       localIp7051f4ResQMgrNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051f4ResQMgrNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp7051f4ResQMgrName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051f4ResQMgrName() {	 
   		return (substring(getStringValue(),beginIp7051f4ResQMgrName,beginIp7051f4ResQMgrName + IP_7051F_4_RES_QMGR_NAME_LEN));
   	}
     int localIp7051f4ResQNameCounter = -1;
     public boolean isIp7051f4ResQNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051f4ResQNameCounter != sharedCounter;
         localIp7051f4ResQNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051F_4_RES_QNAME_LEN = 48;
	/**
	 * 	serialize this Ip7051f4ResQName
	 */
   protected void serializeIp7051f4ResQName(char[] ip7051f4ResQName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051f4ResQName,0,getStringValue(),beginIp7051f4ResQName,IP_7051F_4_RES_QNAME_LEN);
       localIp7051f4ResQNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051f4ResQNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp7051f4ResQName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051f4ResQName() {	 
   		return (substring(getStringValue(),beginIp7051f4ResQName,beginIp7051f4ResQName + IP_7051F_4_RES_QNAME_LEN));
   	}




}
  
