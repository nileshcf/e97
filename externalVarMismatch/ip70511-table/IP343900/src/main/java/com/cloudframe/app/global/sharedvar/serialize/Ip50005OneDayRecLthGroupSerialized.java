package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50005OneDayRecLthGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50005OneDayRecLthGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50005OneDayRecLthGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50005_ONE_DAY_REC_LTH_GROUP_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50005OneDayRecLth;
            protected  int beginIp50005TableDataLength;
	
	/**
	* Constructor for Ip50005OneDayRecLthGroupSerialized
	**/
    public Ip50005OneDayRecLthGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip50005OneDayRecLthGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50005_ONE_DAY_REC_LTH_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp50005OneDayRecLth = getStartOffset() + 0;	// set offset for serialization
  
             beginIp50005TableDataLength = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp50005OneDayRecLthCounter = -1;
         public boolean isIp50005OneDayRecLthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp50005OneDayRecLthCounter != sharedCounter;
            localIp50005OneDayRecLthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_50005_ONE_DAY_REC_LTH_LEN = 4;
  	/**
	 * serializeIp50005OneDayRecLth
	 */
	protected void serializeIp50005OneDayRecLth(long ip50005OneDayRecLth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip50005OneDayRecLth,IP_50005_ONE_DAY_REC_LTH_LEN)
                  ,beginIp50005OneDayRecLth
                  ,IP_50005_ONE_DAY_REC_LTH_LEN
                 );
            localIp50005OneDayRecLthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp50005OneDayRecLthMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp50005OneDayRecLth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp50005OneDayRecLth() {	 
			return (getUnsignedInt(beginIp50005OneDayRecLth));
   	}
         int localIp50005TableDataLengthCounter = -1;
         public boolean isIp50005TableDataLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp50005TableDataLengthCounter != sharedCounter;
            localIp50005TableDataLengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_50005_TABLE_DATA_LENGTH_LEN = 4;
  	/**
	 * serializeIp50005TableDataLength
	 */
	protected void serializeIp50005TableDataLength(long ip50005TableDataLength) {
           replaceValue( //  save the value as string
                   getBinaryString( ip50005TableDataLength,IP_50005_TABLE_DATA_LENGTH_LEN)
                  ,beginIp50005TableDataLength
                  ,IP_50005_TABLE_DATA_LENGTH_LEN
                 );
            localIp50005TableDataLengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp50005TableDataLengthMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp50005TableDataLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp50005TableDataLength() {	 
			return (getUnsignedInt(beginIp50005TableDataLength));
   	}




}
  
