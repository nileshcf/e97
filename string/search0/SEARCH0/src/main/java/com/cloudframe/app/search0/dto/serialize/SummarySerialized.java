package com.cloudframe.app.search0.dto.serialize;

/**
*  The class SummarySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SummarySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SummarySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SUMMARY_LENGTH = 1625004;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSummarySubldgMaxCntr;
           protected int beginSummarySubldgEntries;
           protected static final int SUMMARY_SUBLDG_ENTRIES_SIZE = 125000;
	
	/**
	* Constructor for SummarySerialized
	**/
    public SummarySerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SummarySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SUMMARY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSummarySubldgMaxCntr = getStartOffset() + 0;	// set offset for serialization
  
	        beginSummarySubldgEntries = getStartOffset() + 4; // set offset for serialization
  
	   /*  end of offset */
	}
         int localSummarySubldgMaxCntrCounter = -1;
         public boolean isSummarySubldgMaxCntrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSummarySubldgMaxCntrCounter != sharedCounter;
            localSummarySubldgMaxCntrCounter = sharedCounter; return hasModified; 
         }
   protected static final int SUMMARY_SUBLDG_MAX_CNTR_LEN = 4;
  	/**
	 * serializeSummarySubldgMaxCntr
	 */
	protected void serializeSummarySubldgMaxCntr(int summarySubldgMaxCntr) {
           replaceValue( //  save the value as string
                   getBinaryString( summarySubldgMaxCntr,SUMMARY_SUBLDG_MAX_CNTR_LEN)
                  ,beginSummarySubldgMaxCntr
                  ,SUMMARY_SUBLDG_MAX_CNTR_LEN
                 );
            localSummarySubldgMaxCntrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSummarySubldgMaxCntrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSummarySubldgMaxCntr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSummarySubldgMaxCntr() {	 
			return (getInt(beginSummarySubldgMaxCntr));
   	}

		public int summarySubldgEntriesSize() {
			return SUMMARY_SUBLDG_ENTRIES_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 4 + (dependValue *  13);
     }
     
     public int getVariableLength(int idx) {
     	return 4 + (idx *  13);
     }
}
  
