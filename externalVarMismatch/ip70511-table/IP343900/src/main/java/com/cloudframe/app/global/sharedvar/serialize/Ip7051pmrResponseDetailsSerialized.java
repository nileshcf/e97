package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip7051pmrResponseDetailsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip7051pmrResponseDetailsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip7051pmrResponseDetailsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_7051PMR_RESPONSE_DETAILS_LENGTH = 96;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp7051pmrResQMgrName;
            protected  int beginIp7051pmrResQName;
	
	/**
	* Constructor for Ip7051pmrResponseDetailsSerialized
	**/
    public Ip7051pmrResponseDetailsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip7051pmrResponseDetailsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051pmrResponseDetailsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip7051pmrResponseDetailsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,129); // serialize this field at offset 129 by default 
    }
    
	/**
	* sets parent for this Ip7051pmrResponseDetailsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 129 by default
    }    
	/**
	* initializes the field in Ip7051pmrResponseDetailsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_7051PMR_RESPONSE_DETAILS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp7051pmrResQMgrName = getStartOffset() + 0;	// set offset for serialization
  
             beginIp7051pmrResQName = getStartOffset() + 48;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp7051pmrResQMgrNameCounter = -1;
     public boolean isIp7051pmrResQMgrNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pmrResQMgrNameCounter != sharedCounter;
         localIp7051pmrResQMgrNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051PMR_RES_QMGR_NAME_LEN = 48;
	/**
	 * 	serialize this Ip7051pmrResQMgrName
	 */
   protected void serializeIp7051pmrResQMgrName(char[] ip7051pmrResQMgrName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051pmrResQMgrName,0,getStringValue(),beginIp7051pmrResQMgrName,IP_7051PMR_RES_QMGR_NAME_LEN);
       localIp7051pmrResQMgrNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051pmrResQMgrNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp7051pmrResQMgrName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051pmrResQMgrName() {	 
   		return (substring(getStringValue(),beginIp7051pmrResQMgrName,beginIp7051pmrResQMgrName + IP_7051PMR_RES_QMGR_NAME_LEN));
   	}
     int localIp7051pmrResQNameCounter = -1;
     public boolean isIp7051pmrResQNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pmrResQNameCounter != sharedCounter;
         localIp7051pmrResQNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051PMR_RES_QNAME_LEN = 48;
	/**
	 * 	serialize this Ip7051pmrResQName
	 */
   protected void serializeIp7051pmrResQName(char[] ip7051pmrResQName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051pmrResQName,0,getStringValue(),beginIp7051pmrResQName,IP_7051PMR_RES_QNAME_LEN);
       localIp7051pmrResQNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051pmrResQNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp7051pmrResQName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051pmrResQName() {	 
   		return (substring(getStringValue(),beginIp7051pmrResQName,beginIp7051pmrResQName + IP_7051PMR_RES_QNAME_LEN));
   	}




}
  
