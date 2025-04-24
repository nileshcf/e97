package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50004iOneDayRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:41. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50004iOneDayRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50004iOneDayRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50004I_ONE_DAY_REC_LENGTH = 27991;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50004iTableData;
	
	/**
	* Constructor for Ip50004iOneDayRecSerialized
	**/
    public Ip50004iOneDayRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip50004iOneDayRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50004I_ONE_DAY_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp50004iTableData = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp50004iTableDataCounter = -1;
     public boolean isIp50004iTableDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50004iTableDataCounter != sharedCounter;
         localIp50004iTableDataCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50004I_TABLE_DATA_LEN = 27973;
	/**
	 * 	serialize this Ip50004iTableData
	 */
   protected void serializeIp50004iTableData(char[] ip50004iTableData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50004iTableData,0,getStringValue(),beginIp50004iTableData,IP_50004I_TABLE_DATA_LEN);
       localIp50004iTableDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50004iTableDataConstraints(char[] value) {
   			return super.checkConstraints(value , 27973 ,false, false);
   }
    /**
	 *	refreshIp50004iTableData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50004iTableData() {	 
   		return (substring(getStringValue(),beginIp50004iTableData,beginIp50004iTableData + IP_50004I_TABLE_DATA_LEN));
   	}




}
  
