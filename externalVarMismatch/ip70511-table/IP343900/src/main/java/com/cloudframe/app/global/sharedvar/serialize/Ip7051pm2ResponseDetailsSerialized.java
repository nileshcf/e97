package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip7051pm2ResponseDetailsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip7051pm2ResponseDetailsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip7051pm2ResponseDetailsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_7051PM_2_RESPONSE_DETAILS_LENGTH = 96;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp7051pm2ResQMgrName;
            protected  int beginIp7051pm2ResQName;
	
	/**
	* Constructor for Ip7051pm2ResponseDetailsSerialized
	**/
    public Ip7051pm2ResponseDetailsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip7051pm2ResponseDetailsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051pm2ResponseDetailsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip7051pm2ResponseDetailsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,129); // serialize this field at offset 129 by default 
    }
    
	/**
	* sets parent for this Ip7051pm2ResponseDetailsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 129 by default
    }    
	/**
	* initializes the field in Ip7051pm2ResponseDetailsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_7051PM_2_RESPONSE_DETAILS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp7051pm2ResQMgrName = getStartOffset() + 0;	// set offset for serialization
  
             beginIp7051pm2ResQName = getStartOffset() + 48;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp7051pm2ResQMgrNameCounter = -1;
     public boolean isIp7051pm2ResQMgrNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pm2ResQMgrNameCounter != sharedCounter;
         localIp7051pm2ResQMgrNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051PM_2_RES_QMGR_NAME_LEN = 48;
	/**
	 * 	serialize this Ip7051pm2ResQMgrName
	 */
   protected void serializeIp7051pm2ResQMgrName(char[] ip7051pm2ResQMgrName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051pm2ResQMgrName,0,getStringValue(),beginIp7051pm2ResQMgrName,IP_7051PM_2_RES_QMGR_NAME_LEN);
       localIp7051pm2ResQMgrNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051pm2ResQMgrNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp7051pm2ResQMgrName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051pm2ResQMgrName() {	 
   		return (substring(getStringValue(),beginIp7051pm2ResQMgrName,beginIp7051pm2ResQMgrName + IP_7051PM_2_RES_QMGR_NAME_LEN));
   	}
     int localIp7051pm2ResQNameCounter = -1;
     public boolean isIp7051pm2ResQNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7051pm2ResQNameCounter != sharedCounter;
         localIp7051pm2ResQNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7051PM_2_RES_QNAME_LEN = 48;
	/**
	 * 	serialize this Ip7051pm2ResQName
	 */
   protected void serializeIp7051pm2ResQName(char[] ip7051pm2ResQName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7051pm2ResQName,0,getStringValue(),beginIp7051pm2ResQName,IP_7051PM_2_RES_QNAME_LEN);
       localIp7051pm2ResQNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7051pm2ResQNameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshIp7051pm2ResQName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7051pm2ResQName() {	 
   		return (substring(getStringValue(),beginIp7051pm2ResQName,beginIp7051pm2ResQName + IP_7051PM_2_RES_QNAME_LEN));
   	}




}
  
