package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50201FaaDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50201FaaDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50201FaaDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50201_FAA_DATA_LENGTH = 55;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50201PrimaryAcctNbr;
            protected  int beginIp50201AccntStatus;
            protected  int beginIp50201VrtlAcctNum;
	
	/**
	* Constructor for Ip50201FaaDataSerialized
	**/
    public Ip50201FaaDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip50201FaaDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50201FaaDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip50201FaaDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip50201FaaDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip50201FaaDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50201_FAA_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp50201PrimaryAcctNbr = getStartOffset() + 0;	// set offset for serialization
  
  
             beginIp50201AccntStatus = getStartOffset() + 25;	// set offset for serialization
  
  
             beginIp50201VrtlAcctNum = getStartOffset() + 36;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp50201PrimaryAcctNbrCounter = -1;
     public boolean isIp50201PrimaryAcctNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50201PrimaryAcctNbrCounter != sharedCounter;
         localIp50201PrimaryAcctNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50201_PRIMARY_ACCT_NBR_LEN = 19;
	/**
	 * 	serialize this Ip50201PrimaryAcctNbr
	 */
   protected void serializeIp50201PrimaryAcctNbr(char[] ip50201PrimaryAcctNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50201PrimaryAcctNbr,0,getStringValue(),beginIp50201PrimaryAcctNbr,IP_50201_PRIMARY_ACCT_NBR_LEN);
       localIp50201PrimaryAcctNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50201PrimaryAcctNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshIp50201PrimaryAcctNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50201PrimaryAcctNbr() {	 
   		return (substring(getStringValue(),beginIp50201PrimaryAcctNbr,beginIp50201PrimaryAcctNbr + IP_50201_PRIMARY_ACCT_NBR_LEN));
   	}
     int localIp50201AccntStatusCounter = -1;
     public boolean isIp50201AccntStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50201AccntStatusCounter != sharedCounter;
         localIp50201AccntStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50201_ACCNT_STATUS_LEN = 1;
	/**
	 * 	serialize this Ip50201AccntStatus
	 */
   protected void serializeIp50201AccntStatus(char[] ip50201AccntStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50201AccntStatus,0,getStringValue(),beginIp50201AccntStatus,IP_50201_ACCNT_STATUS_LEN);
       localIp50201AccntStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50201AccntStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp50201AccntStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50201AccntStatus() {	 
   		return (substring(getStringValue(),beginIp50201AccntStatus,beginIp50201AccntStatus + IP_50201_ACCNT_STATUS_LEN));
   	}
     int localIp50201VrtlAcctNumCounter = -1;
     public boolean isIp50201VrtlAcctNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50201VrtlAcctNumCounter != sharedCounter;
         localIp50201VrtlAcctNumCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50201_VRTL_ACCT_NUM_LEN = 19;
	/**
	 * 	serialize this Ip50201VrtlAcctNum
	 */
   protected void serializeIp50201VrtlAcctNum(char[] ip50201VrtlAcctNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50201VrtlAcctNum,0,getStringValue(),beginIp50201VrtlAcctNum,IP_50201_VRTL_ACCT_NUM_LEN);
       localIp50201VrtlAcctNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50201VrtlAcctNumConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshIp50201VrtlAcctNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50201VrtlAcctNum() {	 
   		return (substring(getStringValue(),beginIp50201VrtlAcctNum,beginIp50201VrtlAcctNum + IP_50201_VRTL_ACCT_NUM_LEN));
   	}




}
  
