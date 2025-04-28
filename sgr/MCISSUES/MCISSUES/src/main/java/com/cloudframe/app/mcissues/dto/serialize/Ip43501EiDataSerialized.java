package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class Ip43501EiDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip43501EiDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip43501EiDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_43501_EI_DATA_LENGTH = 999;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp43501EiInvalidData;
            protected  int beginIp43501RejMsgData;
	
	/**
	* Constructor for Ip43501EiDataSerialized
	**/
    public Ip43501EiDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip43501EiDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip43501EiDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip43501EiDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,296); // serialize this field at offset 296 by default 
    }
    
	/**
	* sets parent for this Ip43501EiDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 296 by default
    }    
	/**
	* initializes the field in Ip43501EiDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_43501_EI_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp43501EiInvalidData = getStartOffset() + 0;	// set offset for serialization
  
             beginIp43501RejMsgData = getStartOffset() + 50;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp43501EiInvalidDataCounter = -1;
     public boolean isIp43501EiInvalidDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501EiInvalidDataCounter != sharedCounter;
         localIp43501EiInvalidDataCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_43501_EI_INVALID_DATA_LEN = 50;
	/**
	 * 	serialize this Ip43501EiInvalidData
	 */
   protected void serializeIp43501EiInvalidData(char[] ip43501EiInvalidData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip43501EiInvalidData,0,getStringValue(),beginIp43501EiInvalidData,IP_43501_EI_INVALID_DATA_LEN);
       localIp43501EiInvalidDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp43501EiInvalidDataConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshIp43501EiInvalidData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp43501EiInvalidData() {	 
   		return (substring(getStringValue(),beginIp43501EiInvalidData,beginIp43501EiInvalidData + IP_43501_EI_INVALID_DATA_LEN));
   	}
     int localIp43501RejMsgDataCounter = -1;
     public boolean isIp43501RejMsgDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501RejMsgDataCounter != sharedCounter;
         localIp43501RejMsgDataCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_43501_REJ_MSG_DATA_LEN = 949;
	/**
	 * 	serialize this Ip43501RejMsgData
	 */
   protected void serializeIp43501RejMsgData(char[] ip43501RejMsgData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip43501RejMsgData,0,getStringValue(),beginIp43501RejMsgData,IP_43501_REJ_MSG_DATA_LEN);
       localIp43501RejMsgDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp43501RejMsgDataConstraints(char[] value) {
   			return super.checkConstraints(value , 949 ,false, false);
   }
    /**
	 *	refreshIp43501RejMsgData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp43501RejMsgData() {	 
   		return (substring(getStringValue(),beginIp43501RejMsgData,beginIp43501RejMsgData + IP_43501_REJ_MSG_DATA_LEN));
   	}




}
  
