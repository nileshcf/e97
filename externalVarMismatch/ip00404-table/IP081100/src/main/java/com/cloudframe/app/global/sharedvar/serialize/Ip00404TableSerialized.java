package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00404TableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00404TableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00404TableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00404_TABLE_LENGTH = 22416;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00404EntriesFoundCount;
	
	/**
	* Constructor for Ip00404TableSerialized
	**/
    public Ip00404TableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip00404TableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00404_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00404EntriesFoundCount = getStartOffset() + 0;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
         int localIp00404EntriesFoundCountCounter = -1;
         public boolean isIp00404EntriesFoundCountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00404EntriesFoundCountCounter != sharedCounter;
            localIp00404EntriesFoundCountCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_00404_ENTRIES_FOUND_COUNT_LEN = 4;
  	/**
	 * serializeIp00404EntriesFoundCount
	 */
	protected void serializeIp00404EntriesFoundCount(int ip00404EntriesFoundCount) {
           replaceValue( //  save the value as string
                   getBinaryString( ip00404EntriesFoundCount,IP_00404_ENTRIES_FOUND_COUNT_LEN)
                  ,beginIp00404EntriesFoundCount
                  ,IP_00404_ENTRIES_FOUND_COUNT_LEN
                 );
            localIp00404EntriesFoundCountCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp00404EntriesFoundCountMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp00404EntriesFoundCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00404EntriesFoundCount() {	 
			return (getInt(beginIp00404EntriesFoundCount));
   	}




}
  
