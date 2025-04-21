package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip35501RelativeRecNumGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip35501RelativeRecNumGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip35501RelativeRecNumGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_35501_RELATIVE_REC_NUM_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp35501RelativeRecNum;
	
	/**
	* Constructor for Ip35501RelativeRecNumGroupSerialized
	**/
    public Ip35501RelativeRecNumGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip35501RelativeRecNumGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_35501_RELATIVE_REC_NUM_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp35501RelativeRecNum = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp35501RelativeRecNumCounter = -1;
         public boolean isIp35501RelativeRecNumModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp35501RelativeRecNumCounter != sharedCounter;
            localIp35501RelativeRecNumCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_35501_RELATIVE_REC_NUM_LEN = 2;
  	/**
	 * serializeIp35501RelativeRecNum
	 */
	protected void serializeIp35501RelativeRecNum(int ip35501RelativeRecNum) {
           replaceValue( //  save the value as string
                   getBinaryString( ip35501RelativeRecNum,IP_35501_RELATIVE_REC_NUM_LEN)
                  ,beginIp35501RelativeRecNum
                  ,IP_35501_RELATIVE_REC_NUM_LEN
                 );
            localIp35501RelativeRecNumCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp35501RelativeRecNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp35501RelativeRecNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp35501RelativeRecNum() {	 
			return (getUnsignedShort(beginIp35501RelativeRecNum));
   	}




}
  
