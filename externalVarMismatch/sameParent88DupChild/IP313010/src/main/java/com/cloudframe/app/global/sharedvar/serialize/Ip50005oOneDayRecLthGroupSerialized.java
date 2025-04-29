package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50005oOneDayRecLthGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50005oOneDayRecLthGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50005oOneDayRecLthGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50005O_ONE_DAY_REC_LTH_GROUP_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50005oOneDayRecLth;
            protected  int beginIp50005oTableDataLength;
	
	/**
	* Constructor for Ip50005oOneDayRecLthGroupSerialized
	**/
    public Ip50005oOneDayRecLthGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip50005oOneDayRecLthGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50005O_ONE_DAY_REC_LTH_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp50005oOneDayRecLth = getStartOffset() + 0;	// set offset for serialization
  
             beginIp50005oTableDataLength = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp50005oOneDayRecLthCounter = -1;
         public boolean isIp50005oOneDayRecLthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp50005oOneDayRecLthCounter != sharedCounter;
            localIp50005oOneDayRecLthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_50005O_ONE_DAY_REC_LTH_LEN = 4;
  	/**
	 * serializeIp50005oOneDayRecLth
	 */
	protected void serializeIp50005oOneDayRecLth(long ip50005oOneDayRecLth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip50005oOneDayRecLth,IP_50005O_ONE_DAY_REC_LTH_LEN)
                  ,beginIp50005oOneDayRecLth
                  ,IP_50005O_ONE_DAY_REC_LTH_LEN
                 );
            localIp50005oOneDayRecLthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp50005oOneDayRecLthMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp50005oOneDayRecLth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp50005oOneDayRecLth() {	 
			return (getUnsignedInt(beginIp50005oOneDayRecLth));
   	}
         int localIp50005oTableDataLengthCounter = -1;
         public boolean isIp50005oTableDataLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp50005oTableDataLengthCounter != sharedCounter;
            localIp50005oTableDataLengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_50005O_TABLE_DATA_LENGTH_LEN = 4;
  	/**
	 * serializeIp50005oTableDataLength
	 */
	protected void serializeIp50005oTableDataLength(long ip50005oTableDataLength) {
           replaceValue( //  save the value as string
                   getBinaryString( ip50005oTableDataLength,IP_50005O_TABLE_DATA_LENGTH_LEN)
                  ,beginIp50005oTableDataLength
                  ,IP_50005O_TABLE_DATA_LENGTH_LEN
                 );
            localIp50005oTableDataLengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp50005oTableDataLengthMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp50005oTableDataLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp50005oTableDataLength() {	 
			return (getUnsignedInt(beginIp50005oTableDataLength));
   	}




}
  
