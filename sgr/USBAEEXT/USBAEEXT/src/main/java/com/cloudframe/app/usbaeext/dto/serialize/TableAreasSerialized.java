package com.cloudframe.app.usbaeext.dto.serialize;

/**
*  The class TableAreasSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class TableAreasSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TableAreasSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TABLE_AREAS_LENGTH = 4142;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTaAdjIndexMax;
            protected  int beginTaAdjTable;
           protected int beginTaAdjTableRedefined;
           protected static final int TA_ADJ_TABLE_REDEFINED_SIZE = 100;
            protected  int beginTaMonthTable;
           protected int beginTaMonthTableRedefined;
           protected static final int TA_MONTH_TABLE_REDEFINED_SIZE = 12;
            protected  int beginTaMonthIndex;
	
	/**
	* Constructor for TableAreasSerialized
	**/
    public TableAreasSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TableAreasSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TABLE_AREAS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTaAdjIndexMax = getStartOffset() + 0;	// set offset for serialization
  
             beginTaAdjTable = getStartOffset() + 3;	// set offset for serialization
  
	        beginTaAdjTableRedefined = getStartOffset() + 3; // set offset for serialization
  
             beginTaMonthTable = getStartOffset() + 4103;	// set offset for serialization
  
	        beginTaMonthTableRedefined = getStartOffset() + 4103; // set offset for serialization
  
             beginTaMonthIndex = getStartOffset() + 4139;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localTaAdjIndexMaxCounter = -1;
        public boolean isTaAdjIndexMaxModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTaAdjIndexMaxCounter != sharedCounter;
           localTaAdjIndexMaxCounter = sharedCounter; return hasModified; 
        }
	    public boolean taAdjIndexMaxIsNumeric() {
	      return decimalIsNumeric(beginTaAdjIndexMax,TA_ADJ_INDEX_MAX_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TA_ADJ_INDEX_MAX_LEN = 3;
  	/**
	 * 	serializeTaAdjIndexMax
	 */
	protected void serializeTaAdjIndexMax(int taAdjIndexMax) {
		   putDecimal(beginTaAdjIndexMax,taAdjIndexMax,TA_ADJ_INDEX_MAX_LEN,true);
   }
   

   protected int checkTaAdjIndexMaxMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTaAdjIndexMax is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTaAdjIndexMax() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTaAdjIndexMax,TA_ADJ_INDEX_MAX_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("taAdjIndexMax", beginTaAdjIndexMax,TA_ADJ_INDEX_MAX_LEN);
     }
   	}
     int localTaAdjTableCounter = -1;
     public boolean isTaAdjTableModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaAdjTableCounter != sharedCounter;
         localTaAdjTableCounter = sharedCounter; return hasModified;
     }
	protected static final int TA_ADJ_TABLE_LEN = 4100;
	/**
	 * 	serialize this TaAdjTable
	 */
   protected void serializeTaAdjTable(char[] taAdjTable) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taAdjTable,0,getStringValue(),beginTaAdjTable,TA_ADJ_TABLE_LEN);
       localTaAdjTableCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaAdjTableConstraints(char[] value) {
   			return super.checkConstraints(value , 4100 ,false, false);
   }
    /**
	 *	refreshTaAdjTable is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaAdjTable() {	 
   		return (substring(getStringValue(),beginTaAdjTable,beginTaAdjTable + TA_ADJ_TABLE_LEN));
   	}
     int localTaMonthTableCounter = -1;
     public boolean isTaMonthTableModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaMonthTableCounter != sharedCounter;
         localTaMonthTableCounter = sharedCounter; return hasModified;
     }
	protected static final int TA_MONTH_TABLE_LEN = 36;
	/**
	 * 	serialize this TaMonthTable
	 */
   protected void serializeTaMonthTable(char[] taMonthTable) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taMonthTable,0,getStringValue(),beginTaMonthTable,TA_MONTH_TABLE_LEN);
       localTaMonthTableCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaMonthTableConstraints(char[] value) {
   			return super.checkConstraints(value , 36 ,false, false);
   }
    /**
	 *	refreshTaMonthTable is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaMonthTable() {	 
   		return (substring(getStringValue(),beginTaMonthTable,beginTaMonthTable + TA_MONTH_TABLE_LEN));
   	}
        int localTaMonthIndexCounter = -1;
        public boolean isTaMonthIndexModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTaMonthIndexCounter != sharedCounter;
           localTaMonthIndexCounter = sharedCounter; return hasModified; 
        }
	    public boolean taMonthIndexIsNumeric() {
	      return decimalIsNumeric(beginTaMonthIndex,TA_MONTH_INDEX_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TA_MONTH_INDEX_LEN = 3;
  	/**
	 * 	serializeTaMonthIndex
	 */
	protected void serializeTaMonthIndex(int taMonthIndex) {
		   putDecimal(beginTaMonthIndex,taMonthIndex,TA_MONTH_INDEX_LEN,true);
   }
   

   protected int checkTaMonthIndexMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTaMonthIndex is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTaMonthIndex() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTaMonthIndex,TA_MONTH_INDEX_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("taMonthIndex", beginTaMonthIndex,TA_MONTH_INDEX_LEN);
     }
   	}

		public int taAdjTableRedefinedSize() {
			return TA_ADJ_TABLE_REDEFINED_SIZE;
		}
		public int taMonthTableRedefinedSize() {
			return TA_MONTH_TABLE_REDEFINED_SIZE;
		}



}
  
