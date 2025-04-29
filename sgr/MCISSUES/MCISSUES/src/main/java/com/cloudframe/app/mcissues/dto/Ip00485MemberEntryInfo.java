package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip00485MemberEntryInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class Ip00485MemberEntryInfo extends Ip00485MemberEntryInfoSerialized {
   

								@Getter @Setter private long ip00485MemberEntries;
			@Getter @Setter private List<Ip00485MemberEntry> ip00485MemberEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip00485MemberEntryInfo
	**/
    public Ip00485MemberEntryInfo() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_00485_MEMBER_ENTRY_SIZE;arrayIndex++) {
						getIp00485MemberEntry().add(new Ip00485MemberEntry(this, beginIp00485MemberEntry + 
						arrayIndex * Ip00485MemberEntry.getIp00485MemberEntryFieldLength()));
				}
	   	/*  end of offset */
    }





}
  
