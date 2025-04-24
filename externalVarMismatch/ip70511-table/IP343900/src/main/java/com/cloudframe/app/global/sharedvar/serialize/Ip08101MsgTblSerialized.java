package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip08101MsgTblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip08101MsgTblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip08101MsgTblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_08101_MSG_TBL_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp081011stPresThresh;
            protected  int beginIp081012ndPresChbkThresh;
            protected  int beginIp08101FeeCollectThresh;
            protected  int beginIp08101RetrievalThresh;
            protected  int beginIp08101AllMsgsThresh;
	
	/**
	* Constructor for Ip08101MsgTblSerialized
	**/
    public Ip08101MsgTblSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip08101MsgTblSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip08101MsgTblSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip08101MsgTblSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,24); // serialize this field at offset 24 by default 
    }
    
	/**
	* sets parent for this Ip08101MsgTblSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 24 by default
    }    
	/**
	* initializes the field in Ip08101MsgTblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_08101_MSG_TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp081011stPresThresh = getStartOffset() + 0;	// set offset for serialization
  
             beginIp081012ndPresChbkThresh = getStartOffset() + 3;	// set offset for serialization
  
             beginIp08101FeeCollectThresh = getStartOffset() + 6;	// set offset for serialization
  
             beginIp08101RetrievalThresh = getStartOffset() + 9;	// set offset for serialization
  
             beginIp08101AllMsgsThresh = getStartOffset() + 12;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp081011stPresThreshCounter = -1;
     public boolean isIp081011stPresThreshModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp081011stPresThreshCounter != sharedCounter;
         localIp081011stPresThreshCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_081011ST_PRES_THRESH_LEN = 3;
	/**
	 * 	serialize this Ip081011stPresThresh
	 */
   protected void serializeIp081011stPresThresh(char[] ip081011stPresThresh) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip081011stPresThresh,0,getStringValue(),beginIp081011stPresThresh,IP_081011ST_PRES_THRESH_LEN);
       localIp081011stPresThreshCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp081011stPresThreshConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp081011stPresThresh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp081011stPresThresh() {	 
   		return (substring(getStringValue(),beginIp081011stPresThresh,beginIp081011stPresThresh + IP_081011ST_PRES_THRESH_LEN));
   	}
     int localIp081012ndPresChbkThreshCounter = -1;
     public boolean isIp081012ndPresChbkThreshModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp081012ndPresChbkThreshCounter != sharedCounter;
         localIp081012ndPresChbkThreshCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_081012ND_PRES_CHBK_THRESH_LEN = 3;
	/**
	 * 	serialize this Ip081012ndPresChbkThresh
	 */
   protected void serializeIp081012ndPresChbkThresh(char[] ip081012ndPresChbkThresh) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip081012ndPresChbkThresh,0,getStringValue(),beginIp081012ndPresChbkThresh,IP_081012ND_PRES_CHBK_THRESH_LEN);
       localIp081012ndPresChbkThreshCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp081012ndPresChbkThreshConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp081012ndPresChbkThresh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp081012ndPresChbkThresh() {	 
   		return (substring(getStringValue(),beginIp081012ndPresChbkThresh,beginIp081012ndPresChbkThresh + IP_081012ND_PRES_CHBK_THRESH_LEN));
   	}
     int localIp08101FeeCollectThreshCounter = -1;
     public boolean isIp08101FeeCollectThreshModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101FeeCollectThreshCounter != sharedCounter;
         localIp08101FeeCollectThreshCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_FEE_COLLECT_THRESH_LEN = 3;
	/**
	 * 	serialize this Ip08101FeeCollectThresh
	 */
   protected void serializeIp08101FeeCollectThresh(char[] ip08101FeeCollectThresh) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101FeeCollectThresh,0,getStringValue(),beginIp08101FeeCollectThresh,IP_08101_FEE_COLLECT_THRESH_LEN);
       localIp08101FeeCollectThreshCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101FeeCollectThreshConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp08101FeeCollectThresh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101FeeCollectThresh() {	 
   		return (substring(getStringValue(),beginIp08101FeeCollectThresh,beginIp08101FeeCollectThresh + IP_08101_FEE_COLLECT_THRESH_LEN));
   	}
     int localIp08101RetrievalThreshCounter = -1;
     public boolean isIp08101RetrievalThreshModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101RetrievalThreshCounter != sharedCounter;
         localIp08101RetrievalThreshCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_RETRIEVAL_THRESH_LEN = 3;
	/**
	 * 	serialize this Ip08101RetrievalThresh
	 */
   protected void serializeIp08101RetrievalThresh(char[] ip08101RetrievalThresh) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101RetrievalThresh,0,getStringValue(),beginIp08101RetrievalThresh,IP_08101_RETRIEVAL_THRESH_LEN);
       localIp08101RetrievalThreshCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101RetrievalThreshConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp08101RetrievalThresh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101RetrievalThresh() {	 
   		return (substring(getStringValue(),beginIp08101RetrievalThresh,beginIp08101RetrievalThresh + IP_08101_RETRIEVAL_THRESH_LEN));
   	}
     int localIp08101AllMsgsThreshCounter = -1;
     public boolean isIp08101AllMsgsThreshModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101AllMsgsThreshCounter != sharedCounter;
         localIp08101AllMsgsThreshCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_ALL_MSGS_THRESH_LEN = 3;
	/**
	 * 	serialize this Ip08101AllMsgsThresh
	 */
   protected void serializeIp08101AllMsgsThresh(char[] ip08101AllMsgsThresh) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101AllMsgsThresh,0,getStringValue(),beginIp08101AllMsgsThresh,IP_08101_ALL_MSGS_THRESH_LEN);
       localIp08101AllMsgsThreshCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101AllMsgsThreshConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp08101AllMsgsThresh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101AllMsgsThresh() {	 
   		return (substring(getStringValue(),beginIp08101AllMsgsThresh,beginIp08101AllMsgsThresh + IP_08101_ALL_MSGS_THRESH_LEN));
   	}




}
  
