package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip500041OneDayRecLthGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip500041OneDayRecLthGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip500041OneDayRecLthGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_500041_ONE_DAY_REC_LTH_GROUP_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp500041OneDayRecLth;
	
	/**
	* Constructor for Ip500041OneDayRecLthGroupSerialized
	**/
    public Ip500041OneDayRecLthGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip500041OneDayRecLthGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_500041_ONE_DAY_REC_LTH_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp500041OneDayRecLth = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp500041OneDayRecLthCounter = -1;
         public boolean isIp500041OneDayRecLthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp500041OneDayRecLthCounter != sharedCounter;
            localIp500041OneDayRecLthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_500041_ONE_DAY_REC_LTH_LEN = 4;
  	/**
	 * serializeIp500041OneDayRecLth
	 */
	protected void serializeIp500041OneDayRecLth(long ip500041OneDayRecLth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip500041OneDayRecLth,IP_500041_ONE_DAY_REC_LTH_LEN)
                  ,beginIp500041OneDayRecLth
                  ,IP_500041_ONE_DAY_REC_LTH_LEN
                 );
            localIp500041OneDayRecLthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp500041OneDayRecLthMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp500041OneDayRecLth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp500041OneDayRecLth() {	 
			return (getUnsignedInt(beginIp500041OneDayRecLth));
   	}




}
  
