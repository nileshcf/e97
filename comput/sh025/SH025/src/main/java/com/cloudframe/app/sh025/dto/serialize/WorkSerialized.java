package com.cloudframe.app.sh025.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 56;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvVolExposed;
            protected  int beginDealgpalAllocWgtnNum;
            protected  int beginWvVolExposedEdit;
            protected  int beginWvExtrOUsdValue;
            protected  int beginPcstlogUsdCostValue;
            protected  int beginWvExtrOUsdValue2;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvVolExposed = getStartOffset() + 0;	// set offset for serialization
  
             beginDealgpalAllocWgtnNum = getStartOffset() + 7;	// set offset for serialization
  
             beginWvVolExposedEdit = getStartOffset() + 12;	// set offset for serialization
  
             beginWvExtrOUsdValue = getStartOffset() + 27;	// set offset for serialization
  
             beginPcstlogUsdCostValue = getStartOffset() + 37;	// set offset for serialization
  
             beginWvExtrOUsdValue2 = getStartOffset() + 44;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localWvVolExposedCounter = -1;
        public boolean isWvVolExposedModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWvVolExposedCounter != sharedCounter;
           localWvVolExposedCounter = sharedCounter; return hasModified; 
        }
	    public boolean wvVolExposedIsNumeric() {
	      return decimalIsNumeric(beginWvVolExposed,WV_VOL_EXPOSED_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wvVolExposedString() {
            return getPackedString(beginWvVolExposed,WV_VOL_EXPOSED_LEN);
         }
   protected static final int WV_VOL_EXPOSED_LEN = 7;
   protected static final int WV_VOL_EXPOSED_SCALE = 4;
  	/**
	 * 	serializeWvVolExposed
	 */
	protected void serializeWvVolExposed(BigDecimal wvVolExposed) {
		   putDecimal(beginWvVolExposed,wvVolExposed,WV_VOL_EXPOSED_LEN,WV_VOL_EXPOSED_SCALE,true);
		 localWvVolExposedCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWvVolExposedMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshWvVolExposed is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWvVolExposed() throws CFException {	
   	try { 
		 return (getDecimal(beginWvVolExposed,WV_VOL_EXPOSED_LEN,WV_VOL_EXPOSED_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wvVolExposed", beginWvVolExposed,WV_VOL_EXPOSED_LEN);
     }
   	}
        int localDealgpalAllocWgtnNumCounter = -1;
        public boolean isDealgpalAllocWgtnNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDealgpalAllocWgtnNumCounter != sharedCounter;
           localDealgpalAllocWgtnNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean dealgpalAllocWgtnNumIsNumeric() {
	      return decimalIsNumeric(beginDealgpalAllocWgtnNum,DEALGPAL_ALLOC_WGTN_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] dealgpalAllocWgtnNumString() {
            return getPackedString(beginDealgpalAllocWgtnNum,DEALGPAL_ALLOC_WGTN_NUM_LEN);
         }
   protected static final int DEALGPAL_ALLOC_WGTN_NUM_LEN = 5;
   protected static final int DEALGPAL_ALLOC_WGTN_NUM_SCALE = 4;
  	/**
	 * 	serializeDealgpalAllocWgtnNum
	 */
	protected void serializeDealgpalAllocWgtnNum(BigDecimal dealgpalAllocWgtnNum) {
		   putDecimal(beginDealgpalAllocWgtnNum,dealgpalAllocWgtnNum,DEALGPAL_ALLOC_WGTN_NUM_LEN,DEALGPAL_ALLOC_WGTN_NUM_SCALE,true);
		 localDealgpalAllocWgtnNumCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkDealgpalAllocWgtnNumMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshDealgpalAllocWgtnNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDealgpalAllocWgtnNum() throws CFException {	
   	try { 
		 return (getDecimal(beginDealgpalAllocWgtnNum,DEALGPAL_ALLOC_WGTN_NUM_LEN,DEALGPAL_ALLOC_WGTN_NUM_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("dealgpalAllocWgtnNum", beginDealgpalAllocWgtnNum,DEALGPAL_ALLOC_WGTN_NUM_LEN);
     }
   	}
     int localWvVolExposedEditCounter = -1;
     public boolean isWvVolExposedEditModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvVolExposedEditCounter != sharedCounter;
         localWvVolExposedEditCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_VOL_EXPOSED_EDIT_LEN = 15;
	/**
	 * 	serialize this WvVolExposedEdit
	 */
   protected void serializeWvVolExposedEdit(char[] wvVolExposedEdit) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvVolExposedEdit,0,getStringValue(),beginWvVolExposedEdit,WV_VOL_EXPOSED_EDIT_LEN);
       localWvVolExposedEditCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvVolExposedEditConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshWvVolExposedEdit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvVolExposedEdit() {	 
   		return (substring(getStringValue(),beginWvVolExposedEdit,beginWvVolExposedEdit + WV_VOL_EXPOSED_EDIT_LEN));
   	}
     int localWvExtrOUsdValueCounter = -1;
     public boolean isWvExtrOUsdValueModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrOUsdValueCounter != sharedCounter;
         localWvExtrOUsdValueCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_OUSD_VALUE_LEN = 10;
	/**
	 * 	serialize this WvExtrOUsdValue
	 */
   protected void serializeWvExtrOUsdValue(char[] wvExtrOUsdValue) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrOUsdValue,0,getStringValue(),beginWvExtrOUsdValue,WV_EXTR_OUSD_VALUE_LEN);
       localWvExtrOUsdValueCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrOUsdValueConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWvExtrOUsdValue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrOUsdValue() {	 
   		return (substring(getStringValue(),beginWvExtrOUsdValue,beginWvExtrOUsdValue + WV_EXTR_OUSD_VALUE_LEN));
   	}
        int localPcstlogUsdCostValueCounter = -1;
        public boolean isPcstlogUsdCostValueModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPcstlogUsdCostValueCounter != sharedCounter;
           localPcstlogUsdCostValueCounter = sharedCounter; return hasModified; 
        }
	    public boolean pcstlogUsdCostValueIsNumeric() {
	      return decimalIsNumeric(beginPcstlogUsdCostValue,PCSTLOG_USD_COST_VALUE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] pcstlogUsdCostValueString() {
            return getPackedString(beginPcstlogUsdCostValue,PCSTLOG_USD_COST_VALUE_LEN);
         }
   protected static final int PCSTLOG_USD_COST_VALUE_LEN = 7;
   protected static final int PCSTLOG_USD_COST_VALUE_SCALE = 4;
  	/**
	 * 	serializePcstlogUsdCostValue
	 */
	protected void serializePcstlogUsdCostValue(BigDecimal pcstlogUsdCostValue) {
		   putDecimal(beginPcstlogUsdCostValue,pcstlogUsdCostValue,PCSTLOG_USD_COST_VALUE_LEN,PCSTLOG_USD_COST_VALUE_SCALE,true);
		 localPcstlogUsdCostValueCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkPcstlogUsdCostValueMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshPcstlogUsdCostValue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshPcstlogUsdCostValue() throws CFException {	
   	try { 
		 return (getDecimal(beginPcstlogUsdCostValue,PCSTLOG_USD_COST_VALUE_LEN,PCSTLOG_USD_COST_VALUE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("pcstlogUsdCostValue", beginPcstlogUsdCostValue,PCSTLOG_USD_COST_VALUE_LEN);
     }
   	}
     int localWvExtrOUsdValue2Counter = -1;
     public boolean isWvExtrOUsdValue2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvExtrOUsdValue2Counter != sharedCounter;
         localWvExtrOUsdValue2Counter = sharedCounter; return hasModified;
     }
	protected static final int WV_EXTR_OUSD_VALUE_2_LEN = 12;
	/**
	 * 	serialize this WvExtrOUsdValue2
	 */
   protected void serializeWvExtrOUsdValue2(char[] wvExtrOUsdValue2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvExtrOUsdValue2,0,getStringValue(),beginWvExtrOUsdValue2,WV_EXTR_OUSD_VALUE_2_LEN);
       localWvExtrOUsdValue2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvExtrOUsdValue2Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWvExtrOUsdValue2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvExtrOUsdValue2() {	 
   		return (substring(getStringValue(),beginWvExtrOUsdValue2,beginWvExtrOUsdValue2 + WV_EXTR_OUSD_VALUE_2_LEN));
   	}




}
  
