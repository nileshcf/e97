package com.cloudframe.app.comput5.dto.serialize;

/**
*  The class WvExposureResultsTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WvExposureResultsTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvExposureResultsTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_EXPOSURE_RESULTS_TABLE_LENGTH = 16635008;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginWvAccounts;
           protected static final int WV_ACCOUNTS_SIZE = 15000;
            protected  int beginWvAcctIndex;
            protected  int beginWvWeightIndex;
            protected  int beginWvMonthIndex;
	
	/**
	* Constructor for WvExposureResultsTableSerialized
	**/
    public WvExposureResultsTableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WvExposureResultsTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_EXPOSURE_RESULTS_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginWvAccounts = getStartOffset() + 0; // set offset for serialization
  
             beginWvAcctIndex = getStartOffset() + 16635000;	// set offset for serialization
  
             beginWvWeightIndex = getStartOffset() + 16635002;	// set offset for serialization
  
             beginWvMonthIndex = getStartOffset() + 16635006;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localWvAcctIndexCounter = -1;
         public boolean isWvAcctIndexModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWvAcctIndexCounter != sharedCounter;
            localWvAcctIndexCounter = sharedCounter; return hasModified; 
         }
   protected static final int WV_ACCT_INDEX_LEN = 2;
  	/**
	 * serializeWvAcctIndex
	 */
	protected void serializeWvAcctIndex(short wvAcctIndex) {
           replaceValue( //  save the value as string
                   getBinaryString( wvAcctIndex,WV_ACCT_INDEX_LEN)
                  ,beginWvAcctIndex
                  ,WV_ACCT_INDEX_LEN
                 );
            localWvAcctIndexCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkWvAcctIndexMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWvAcctIndex is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshWvAcctIndex() {	 
			return (getShort(beginWvAcctIndex));
   	}
         int localWvWeightIndexCounter = -1;
         public boolean isWvWeightIndexModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWvWeightIndexCounter != sharedCounter;
            localWvWeightIndexCounter = sharedCounter; return hasModified; 
         }
   protected static final int WV_WEIGHT_INDEX_LEN = 4;
  	/**
	 * serializeWvWeightIndex
	 */
	protected void serializeWvWeightIndex(int wvWeightIndex) {
           replaceValue( //  save the value as string
                   getBinaryString( wvWeightIndex,WV_WEIGHT_INDEX_LEN)
                  ,beginWvWeightIndex
                  ,WV_WEIGHT_INDEX_LEN
                 );
            localWvWeightIndexCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWvWeightIndexMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshWvWeightIndex is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWvWeightIndex() {	 
			return (getInt(beginWvWeightIndex));
   	}
         int localWvMonthIndexCounter = -1;
         public boolean isWvMonthIndexModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWvMonthIndexCounter != sharedCounter;
            localWvMonthIndexCounter = sharedCounter; return hasModified; 
         }
   protected static final int WV_MONTH_INDEX_LEN = 2;
  	/**
	 * serializeWvMonthIndex
	 */
	protected void serializeWvMonthIndex(short wvMonthIndex) {
           replaceValue( //  save the value as string
                   getBinaryString( wvMonthIndex,WV_MONTH_INDEX_LEN)
                  ,beginWvMonthIndex
                  ,WV_MONTH_INDEX_LEN
                 );
            localWvMonthIndexCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkWvMonthIndexMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWvMonthIndex is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshWvMonthIndex() {	 
			return (getShort(beginWvMonthIndex));
   	}

		public int wvAccountsSize() {
			return WV_ACCOUNTS_SIZE;
		}



}
  
