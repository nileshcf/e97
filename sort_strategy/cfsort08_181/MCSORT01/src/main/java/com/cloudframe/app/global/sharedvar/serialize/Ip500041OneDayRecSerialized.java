package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip500041OneDayRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip500041OneDayRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip500041OneDayRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_500041_ONE_DAY_REC_LENGTH = 27991;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp500041TableData;
	
	/**
	* Constructor for Ip500041OneDayRecSerialized
	**/
    public Ip500041OneDayRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip500041OneDayRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_500041_ONE_DAY_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp500041TableData = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp500041TableDataCounter = -1;
     public boolean isIp500041TableDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp500041TableDataCounter != sharedCounter;
         localIp500041TableDataCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_500041_TABLE_DATA_LEN = 27973;
	/**
	 * 	serialize this Ip500041TableData
	 */
   protected void serializeIp500041TableData(char[] ip500041TableData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip500041TableData,0,getStringValue(),beginIp500041TableData,IP_500041_TABLE_DATA_LEN);
       localIp500041TableDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp500041TableDataConstraints(char[] value) {
   			return super.checkConstraints(value , 27973 ,false, false);
   }
    /**
	 *	refreshIp500041TableData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp500041TableData() {	 
   		return (substring(getStringValue(),beginIp500041TableData,beginIp500041TableData + IP_500041_TABLE_DATA_LEN));
   	}




}
  
