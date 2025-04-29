package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip00485MemberEntryInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class Ip00485MemberEntryInfo extends Ip00485MemberEntryInfoSerialized {
   

								private long ip00485MemberEntries;
			private List<Ip00485MemberEntry> ip00485MemberEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip00485MemberEntryInfo
	**/
    public Ip00485MemberEntryInfo() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_00485_MEMBER_ENTRY_SIZE;arrayIndex++) {
						ip00485MemberEntry.add(new Ip00485MemberEntry(this, beginIp00485MemberEntry + 
						arrayIndex * Ip00485MemberEntry.getIp00485MemberEntryFieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip00485MemberEntries
	 *	@return ip00485MemberEntries
	 */
	public long getIp00485MemberEntries() throws CFException {
        if (isIp00485MemberEntriesModified()) { 
           ip00485MemberEntries = refreshIp00485MemberEntries();
        }
   		return ip00485MemberEntries;
	}
	
	/**
	 * 	Update Ip00485MemberEntries with the passed value
	 *  Corresponding COBOL Variable is IP00485-MEMBER-ENTRIES
	 *	@param number
	 */
	public void setIp00485MemberEntries(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00485MemberEntries = checkIp00485MemberEntriesMaxLimit(number); 
		serializeIp00485MemberEntries(ip00485MemberEntries);
	}


	/**
	 *	Returns the  value of ip00485MemberEntry
	 *  Corresponding COBOL Variable is IP00485-MEMBER-ENTRY
	 *	@return ip00485MemberEntry
	 */
   public List<Ip00485MemberEntry> getIp00485MemberEntry() {
       return ip00485MemberEntry;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip00485MemberEntry
	 */
	public Ip00485MemberEntry getIp00485MemberEntry(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp00485MemberEntry(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_00485_MEMBER_ENTRY_SIZE) {
             	index = IP_00485_MEMBER_ENTRY_SIZE -1; // can't exceed max array size
             	logger.trace("ip00485MemberEntry - Array index exceeded max Size {}, resetting it to max allowed",IP_00485_MEMBER_ENTRY_SIZE); 
	    }
		if (index >= ip00485MemberEntry.size()) {
       		for (int fillIndex =  ip00485MemberEntry.size() -1; fillIndex < index;fillIndex++) {
		       ip00485MemberEntry.add(null);
		    }
			ip00485MemberEntry.set(index,
			   	   	new Ip00485MemberEntry(this,beginIp00485MemberEntry + index * Ip00485MemberEntry.getIp00485MemberEntryFieldLength()) 
				                        ); 	
		} 
   	   Ip00485MemberEntry value = ip00485MemberEntry.get(index);
   	   if (value == null) {
   	      ip00485MemberEntry.set(index,
			   	   	new Ip00485MemberEntry(this,beginIp00485MemberEntry + index * Ip00485MemberEntry.getIp00485MemberEntryFieldLength()) 
				                        ); 
		  value = ip00485MemberEntry.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip00485MemberEntry at index with the passed value
	 *  Corresponding COBOL Variable is IP00485-MEMBER-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setIp00485MemberEntry(int index,char[] value) {
   	getIp00485MemberEntry(index).setString(value);
   }
   
	

	
	
	

		public static int getIp00485MemberEntryInfoFieldLength() {
			return IP_00485_MEMBER_ENTRY_INFO_LENGTH;
		}

}
  
