package com.cloudframe.app.ip088030.dto.serialize;

/**
*  The class IchgFeeRecords500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IchgFeeRecords500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IchgFeeRecords500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ICHG_FEE_RECORDS_500_LENGTH = 849919;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIchgEntriesMax500;
            protected  int beginIchgEntriesCnt500;
           protected int beginIchgEntry500;
           protected static final int ICHG_ENTRY_500_SIZE = 9999;
	
	/**
	* Constructor for IchgFeeRecords500Serialized
	**/
    public IchgFeeRecords500Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in IchgFeeRecords500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ICHG_FEE_RECORDS_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIchgEntriesMax500 = getStartOffset() + 0;	// set offset for serialization
  
             beginIchgEntriesCnt500 = getStartOffset() + 2;	// set offset for serialization
  
	        beginIchgEntry500 = getStartOffset() + 4; // set offset for serialization
  
	   /*  end of offset */
	}
         int localIchgEntriesMax500Counter = -1;
         public boolean isIchgEntriesMax500Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIchgEntriesMax500Counter != sharedCounter;
            localIchgEntriesMax500Counter = sharedCounter; return hasModified; 
         }
   protected static final int ICHG_ENTRIES_MAX_500_LEN = 2;
  	/**
	 * serializeIchgEntriesMax500
	 */
	protected void serializeIchgEntriesMax500(short ichgEntriesMax500) {
           replaceValue( //  save the value as string
                   getBinaryString( ichgEntriesMax500,ICHG_ENTRIES_MAX_500_LEN)
                  ,beginIchgEntriesMax500
                  ,ICHG_ENTRIES_MAX_500_LEN
                 );
            localIchgEntriesMax500Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIchgEntriesMax500MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIchgEntriesMax500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIchgEntriesMax500() {	 
			return (getShort(beginIchgEntriesMax500));
   	}
         int localIchgEntriesCnt500Counter = -1;
         public boolean isIchgEntriesCnt500Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIchgEntriesCnt500Counter != sharedCounter;
            localIchgEntriesCnt500Counter = sharedCounter; return hasModified; 
         }
   protected static final int ICHG_ENTRIES_CNT_500_LEN = 2;
  	/**
	 * serializeIchgEntriesCnt500
	 */
	protected void serializeIchgEntriesCnt500(short ichgEntriesCnt500) {
           replaceValue( //  save the value as string
                   getBinaryString( ichgEntriesCnt500,ICHG_ENTRIES_CNT_500_LEN)
                  ,beginIchgEntriesCnt500
                  ,ICHG_ENTRIES_CNT_500_LEN
                 );
            localIchgEntriesCnt500Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIchgEntriesCnt500MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIchgEntriesCnt500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIchgEntriesCnt500() {	 
			return (getShort(beginIchgEntriesCnt500));
   	}

		public int ichgEntry500Size() {
			return ICHG_ENTRY_500_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 4 + (dependValue *  85);
     }
     
     public int getVariableLength(int idx) {
     	return 4 + (idx *  85);
     }
}
  
