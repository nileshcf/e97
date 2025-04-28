package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip02014wEntriesCntGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip02014wEntriesCntGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip02014wEntriesCntGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_02014W_ENTRIES_CNT_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp02014wEntriesCnt;
	
	/**
	* Constructor for Ip02014wEntriesCntGroupSerialized
	**/
    public Ip02014wEntriesCntGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip02014wEntriesCntGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_02014W_ENTRIES_CNT_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp02014wEntriesCnt = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp02014wEntriesCntCounter = -1;
         public boolean isIp02014wEntriesCntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp02014wEntriesCntCounter != sharedCounter;
            localIp02014wEntriesCntCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_02014W_ENTRIES_CNT_LEN = 2;
  	/**
	 * serializeIp02014wEntriesCnt
	 */
	protected void serializeIp02014wEntriesCnt(short ip02014wEntriesCnt) {
           replaceValue( //  save the value as string
                   getBinaryString( ip02014wEntriesCnt,IP_02014W_ENTRIES_CNT_LEN)
                  ,beginIp02014wEntriesCnt
                  ,IP_02014W_ENTRIES_CNT_LEN
                 );
            localIp02014wEntriesCntCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp02014wEntriesCntMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp02014wEntriesCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp02014wEntriesCnt() {	 
			return (getShort(beginIp02014wEntriesCnt));
   	}




}
  
