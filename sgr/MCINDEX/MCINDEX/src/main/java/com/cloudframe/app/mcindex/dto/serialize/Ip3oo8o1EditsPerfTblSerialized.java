package com.cloudframe.app.mcindex.dto.serialize;

/**
*  The class Ip3oo8o1EditsPerfTblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip3oo8o1EditsPerfTblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip3oo8o1EditsPerfTblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_3OO_8O_1_EDITS_PERF_TBL_LENGTH = 8000;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp3oo8o1EditsHolder;
            protected  int beginIp3oo8o1EditsPerfEntry;
	
	/**
	* Constructor for Ip3oo8o1EditsPerfTblSerialized
	**/
    public Ip3oo8o1EditsPerfTblSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip3oo8o1EditsPerfTblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_3OO_8O_1_EDITS_PERF_TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp3oo8o1EditsHolder = getStartOffset() + 0;	// set offset for serialization
  
             beginIp3oo8o1EditsPerfEntry = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp3oo8o1EditsHolderCounter = -1;
     public boolean isIp3oo8o1EditsHolderModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp3oo8o1EditsHolderCounter != sharedCounter;
         localIp3oo8o1EditsHolderCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_3OO_8O_1_EDITS_HOLDER_LEN = 4000;
	/**
	 * 	serialize this Ip3oo8o1EditsHolder
	 */
   protected void serializeIp3oo8o1EditsHolder(char[] ip3oo8o1EditsHolder) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip3oo8o1EditsHolder,0,getStringValue(),beginIp3oo8o1EditsHolder,IP_3OO_8O_1_EDITS_HOLDER_LEN);
       localIp3oo8o1EditsHolderCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp3oo8o1EditsHolderConstraints(char[] value) {
   			return super.checkConstraints(value , 4000 ,false, false);
   }
    /**
	 *	refreshIp3oo8o1EditsHolder is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp3oo8o1EditsHolder() {	 
   		return (substring(getStringValue(),beginIp3oo8o1EditsHolder,beginIp3oo8o1EditsHolder + IP_3OO_8O_1_EDITS_HOLDER_LEN));
   	}
     int localIp3oo8o1EditsPerfEntryCounter = -1;
     public boolean isIp3oo8o1EditsPerfEntryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp3oo8o1EditsPerfEntryCounter != sharedCounter;
         localIp3oo8o1EditsPerfEntryCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_3OO_8O_1_EDITS_PERF_ENTRY_LEN = 4000;
	/**
	 * 	serialize this Ip3oo8o1EditsPerfEntry
	 */
   protected void serializeIp3oo8o1EditsPerfEntry(char[] ip3oo8o1EditsPerfEntry) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip3oo8o1EditsPerfEntry,0,getStringValue(),beginIp3oo8o1EditsPerfEntry,IP_3OO_8O_1_EDITS_PERF_ENTRY_LEN);
       localIp3oo8o1EditsPerfEntryCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp3oo8o1EditsPerfEntryConstraints(char[] value) {
   			return super.checkConstraints(value , 4000 ,false, false);
   }
    /**
	 *	refreshIp3oo8o1EditsPerfEntry is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp3oo8o1EditsPerfEntry() {	 
   		return (substring(getStringValue(),beginIp3oo8o1EditsPerfEntry,beginIp3oo8o1EditsPerfEntry + IP_3OO_8O_1_EDITS_PERF_ENTRY_LEN));
   	}




}
  
