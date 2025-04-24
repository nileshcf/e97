package com.cloudframe.app.comput5.dto.serialize;

/**
*  The class Ip00485MemberEntryInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:41. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00485MemberEntryInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00485MemberEntryInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00485_MEMBER_ENTRY_INFO_LENGTH = 7704;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00485MemberEntries;
           protected int beginIp00485MemberEntry;
           protected static final int IP_00485_MEMBER_ENTRY_SIZE = 700;
	
	/**
	* Constructor for Ip00485MemberEntryInfoSerialized
	**/
    public Ip00485MemberEntryInfoSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip00485MemberEntryInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00485_MEMBER_ENTRY_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00485MemberEntries = getStartOffset() + 0;	// set offset for serialization
  
	        beginIp00485MemberEntry = getStartOffset() + 4; // set offset for serialization
  
	   /*  end of offset */
	}
         int localIp00485MemberEntriesCounter = -1;
         public boolean isIp00485MemberEntriesModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00485MemberEntriesCounter != sharedCounter;
            localIp00485MemberEntriesCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_00485_MEMBER_ENTRIES_LEN = 4;
  	/**
	 * serializeIp00485MemberEntries
	 */
	protected void serializeIp00485MemberEntries(long ip00485MemberEntries) {
           replaceValue( //  save the value as string
                   getBinaryString( ip00485MemberEntries,IP_00485_MEMBER_ENTRIES_LEN)
                  ,beginIp00485MemberEntries
                  ,IP_00485_MEMBER_ENTRIES_LEN
                 );
            localIp00485MemberEntriesCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp00485MemberEntriesMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp00485MemberEntries is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00485MemberEntries() {	 
			return (getUnsignedInt(beginIp00485MemberEntries));
   	}

		public int ip00485MemberEntrySize() {
			return IP_00485_MEMBER_ENTRY_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 4 + (dependValue *  11);
     }
     
     public int getVariableLength(int idx) {
     	return 4 + (idx *  11);
     }
}
  
