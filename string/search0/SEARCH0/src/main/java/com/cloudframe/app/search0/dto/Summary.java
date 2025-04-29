package com.cloudframe.app.search0.dto;

/**
*  The class Summary is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class Summary extends SummarySerialized {
   

								@Getter @Setter private int summarySubldgMaxCntr;
			@Getter @Setter private List<SummarySubldgEntries> summarySubldgEntries = new ArrayList<>();
    	
	
	/**
	* Constructor for Summary
	**/
    public Summary() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < SUMMARY_SUBLDG_ENTRIES_SIZE;arrayIndex++) {
						getSummarySubldgEntries().add(new SummarySubldgEntries(this, beginSummarySubldgEntries + 
						arrayIndex * SummarySubldgEntries.getSummarySubldgEntriesFieldLength()));
				}
	   	/*  end of offset */
								setSummarySubldgMaxCntr(5);
    }





}
  
