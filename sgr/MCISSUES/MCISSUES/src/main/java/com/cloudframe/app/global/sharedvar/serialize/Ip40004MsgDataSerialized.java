package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip40004MsgDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip40004MsgDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip40004MsgDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_40004_MSG_DATA_LENGTH = 27387;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp40004MsgLen;
            protected  int beginIp40004MsgDetail;
	
	/**
	* Constructor for Ip40004MsgDataSerialized
	**/
    public Ip40004MsgDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip40004MsgDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004MsgDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip40004MsgDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,613); // serialize this field at offset 613 by default 
    }
    
	/**
	* sets parent for this Ip40004MsgDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 613 by default
    }    
	/**
	* initializes the field in Ip40004MsgDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_40004_MSG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp40004MsgLen = getStartOffset() + 0;	// set offset for serialization
  
             beginIp40004MsgDetail = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp40004MsgLenCounter = -1;
         public boolean isIp40004MsgLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp40004MsgLenCounter != sharedCounter;
            localIp40004MsgLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_40004_MSG_LEN_LEN = 4;
  	/**
	 * serializeIp40004MsgLen
	 */
	protected void serializeIp40004MsgLen(int ip40004MsgLen) {
           replaceValue( //  save the value as string
                   getBinaryString( ip40004MsgLen,IP_40004_MSG_LEN_LEN)
                  ,beginIp40004MsgLen
                  ,IP_40004_MSG_LEN_LEN
                 );
            localIp40004MsgLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp40004MsgLenMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp40004MsgLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp40004MsgLen() {	 
			return (getInt(beginIp40004MsgLen));
   	}
     int localIp40004MsgDetailCounter = -1;
     public boolean isIp40004MsgDetailModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004MsgDetailCounter != sharedCounter;
         localIp40004MsgDetailCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_40004_MSG_DETAIL_LEN = 27383;
	/**
	 * 	serialize this Ip40004MsgDetail
	 */
   protected void serializeIp40004MsgDetail(char[] ip40004MsgDetail) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip40004MsgDetail,0,getStringValue(),beginIp40004MsgDetail,IP_40004_MSG_DETAIL_LEN);
       localIp40004MsgDetailCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp40004MsgDetailConstraints(char[] value) {
   			return super.checkConstraints(value , 27383 ,false, false);
   }
    /**
	 *	refreshIp40004MsgDetail is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp40004MsgDetail() {	 
   		return (substring(getStringValue(),beginIp40004MsgDetail,beginIp40004MsgDetail + IP_40004_MSG_DETAIL_LEN));
   	}




}
  
