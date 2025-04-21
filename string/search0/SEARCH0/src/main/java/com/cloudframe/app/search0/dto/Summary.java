package com.cloudframe.app.search0.dto;

/**
*  The class Summary is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.search0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class Summary extends SummarySerialized {
   

								private int summarySubldgMaxCntr;
			private List<SummarySubldgEntries> summarySubldgEntries = new ArrayList<>();
    	
	
	/**
	* Constructor for Summary
	**/
    public Summary() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < SUMMARY_SUBLDG_ENTRIES_SIZE;arrayIndex++) {
						summarySubldgEntries.add(new SummarySubldgEntries(this, beginSummarySubldgEntries + 
						arrayIndex * SummarySubldgEntries.getSummarySubldgEntriesFieldLength()));
				}
	   	/*  end of offset */
								setSummarySubldgMaxCntr(5);
    }


 

	/**
	 *	Returns the value of summarySubldgMaxCntr
	 *	@return summarySubldgMaxCntr
	 */
	public int getSummarySubldgMaxCntr() throws CFException {
        if (isSummarySubldgMaxCntrModified()) { 
           summarySubldgMaxCntr = refreshSummarySubldgMaxCntr();
        }
   		return summarySubldgMaxCntr;
	}
	
	/**
	 * 	Update SummarySubldgMaxCntr with the passed value
	 *  Corresponding COBOL Variable is WS-SUMMARY-SUBLDG-MAX-CNTR
	 *	@param number
	 */
	public void setSummarySubldgMaxCntr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    summarySubldgMaxCntr = checkSummarySubldgMaxCntrMaxLimit(number); 
		serializeSummarySubldgMaxCntr(summarySubldgMaxCntr);
	}


	public void setSummarySubldgMaxCntr(long number) {
	    number = checkSummarySubldgMaxCntrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSummarySubldgMaxCntr((int)number);
	}
	
	/**
	 *	Returns the  value of summarySubldgEntries
	 *  Corresponding COBOL Variable is WS-SUMMARY-SUBLDG-ENTRIES
	 *	@return summarySubldgEntries
	 */
   public List<SummarySubldgEntries> getSummarySubldgEntries() {
       return summarySubldgEntries;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return summarySubldgEntries
	 */
	public SummarySubldgEntries getSummarySubldgEntries(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getSummarySubldgEntries(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= SUMMARY_SUBLDG_ENTRIES_SIZE) {
             	index = SUMMARY_SUBLDG_ENTRIES_SIZE -1; // can't exceed max array size
             	logger.trace("summarySubldgEntries - Array index exceeded max Size {}, resetting it to max allowed",SUMMARY_SUBLDG_ENTRIES_SIZE); 
	    }
		if (index >= summarySubldgEntries.size()) {
       		for (int fillIndex =  summarySubldgEntries.size() -1; fillIndex < index;fillIndex++) {
		       summarySubldgEntries.add(null);
		    }
			summarySubldgEntries.set(index,
			   	   	new SummarySubldgEntries(this,beginSummarySubldgEntries + index * SummarySubldgEntries.getSummarySubldgEntriesFieldLength()) 
				                        ); 	
		} 
   	   SummarySubldgEntries value = summarySubldgEntries.get(index);
   	   if (value == null) {
   	      summarySubldgEntries.set(index,
			   	   	new SummarySubldgEntries(this,beginSummarySubldgEntries + index * SummarySubldgEntries.getSummarySubldgEntriesFieldLength()) 
				                        ); 
		  value = summarySubldgEntries.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update SummarySubldgEntries at index with the passed value
	 *  Corresponding COBOL Variable is WS-SUMMARY-SUBLDG-ENTRIES
	 *  @param index
	 *	@param value
	 */
  public void setSummarySubldgEntries(int index,char[] value) {
   	getSummarySubldgEntries(index).setString(value);
   }
   
	

	
	
	

		public static int getSummaryFieldLength() {
			return SUMMARY_LENGTH;
		}

}
  
