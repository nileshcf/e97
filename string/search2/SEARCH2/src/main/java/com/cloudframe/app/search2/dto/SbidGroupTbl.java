package com.cloudframe.app.search2.dto;

/**
*  The class SbidGroupTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class SbidGroupTbl extends SbidGroupTblSerialized {
   
			@Getter @Setter private List<SbidGroupEntries> sbidGroupEntries = new ArrayList<>();
    	
	
	/**
	* Constructor for SbidGroupTbl
	**/
    public SbidGroupTbl() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < SBID_GROUP_ENTRIES_SIZE;arrayIndex++) {
						getSbidGroupEntries().add(new SbidGroupEntries(this, beginSbidGroupEntries + 
						arrayIndex * SbidGroupEntries.getSbidGroupEntriesFieldLength()));
				}
	   	/*  end of offset */
    }





}
  
