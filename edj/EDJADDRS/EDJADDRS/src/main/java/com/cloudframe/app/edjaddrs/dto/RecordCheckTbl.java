package com.cloudframe.app.edjaddrs.dto;

/**
*  The class RecordCheckTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class RecordCheckTbl extends RecordCheckTblSerialized {
   
			@Getter @Setter private List<RctTblEntry> rctTblEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for RecordCheckTbl
	**/
    public RecordCheckTbl() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < RCT_TBL_ENTRY_SIZE;arrayIndex++) {
						getRctTblEntry().add(new RctTblEntry(this, beginRctTblEntry + 
						arrayIndex * RctTblEntry.getRctTblEntryFieldLength()));
				}
	   	/*  end of offset */
    }





}
  
