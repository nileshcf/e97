package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50005oOneDayRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:41. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50005oOneDayRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50005oOneDayRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50005O_ONE_DAY_REC_LENGTH = 32752;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50005oTableData;
	
	/**
	* Constructor for Ip50005oOneDayRecSerialized
	**/
    public Ip50005oOneDayRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip50005oOneDayRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50005O_ONE_DAY_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp50005oTableData = getStartOffset() + 22;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp50005oTableDataCounter = -1;
     public boolean isIp50005oTableDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50005oTableDataCounter != sharedCounter;
         localIp50005oTableDataCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50005O_TABLE_DATA_LEN = 32730;
	/**
	 * 	serialize this Ip50005oTableData
	 */
   protected void serializeIp50005oTableData(char[] ip50005oTableData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50005oTableData,0,getStringValue(),beginIp50005oTableData,IP_50005O_TABLE_DATA_LEN);
       localIp50005oTableDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50005oTableDataConstraints(char[] value) {
   			return super.checkConstraints(value , 32730 ,false, false);
   }
    /**
	 *	refreshIp50005oTableData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50005oTableData() {	 
   		return (substring(getStringValue(),beginIp50005oTableData,beginIp50005oTableData + IP_50005O_TABLE_DATA_LEN));
   	}




}
  
