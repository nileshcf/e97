package com.cloudframe.app.comput5.dto.serialize;

/**
*  The class WvWeightingTypeSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WvWeightingTypeSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WvWeightingTypeSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WV_WEIGHTING_TYPE_LENGTH = 110;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWvWeight;
            protected  int beginWvFmse;
            protected  int beginWvTotal;
           protected int beginWvMonthlyExpo;
           protected static final int WV_MONTHLY_EXPO_SIZE = 13;
	
	/**
	* Constructor for WvWeightingTypeSerialized
	**/
    public WvWeightingTypeSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WvWeightingTypeSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvWeightingTypeSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WvWeightingTypeSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,9); // serialize this field at offset 9 by default 
    }
    
	/**
	* sets parent for this WvWeightingTypeSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 9 by default
    }    
	/**
	* initializes the field in WvWeightingTypeSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WV_WEIGHTING_TYPE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWvWeight = getStartOffset() + 0;	// set offset for serialization
  
             beginWvFmse = getStartOffset() + 5;	// set offset for serialization
  
             beginWvTotal = getStartOffset() + 12;	// set offset for serialization
  
	        beginWvMonthlyExpo = getStartOffset() + 19; // set offset for serialization
  
	   /*  end of offset */
	}
     int localWvWeightCounter = -1;
     public boolean isWvWeightModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWvWeightCounter != sharedCounter;
         localWvWeightCounter = sharedCounter; return hasModified;
     }
	protected static final int WV_WEIGHT_LEN = 5;
	/**
	 * 	serialize this WvWeight
	 */
   protected void serializeWvWeight(char[] wvWeight) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wvWeight,0,getStringValue(),beginWvWeight,WV_WEIGHT_LEN);
       localWvWeightCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWvWeightConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWvWeight is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWvWeight() {	 
   		return (substring(getStringValue(),beginWvWeight,beginWvWeight + WV_WEIGHT_LEN));
   	}
        int localWvFmseCounter = -1;
        public boolean isWvFmseModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWvFmseCounter != sharedCounter;
           localWvFmseCounter = sharedCounter; return hasModified; 
        }
	    public boolean wvFmseIsNumeric() {
	      return decimalIsNumeric(beginWvFmse,WV_FMSE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wvFmseString() {
            return getPackedString(beginWvFmse,WV_FMSE_LEN);
         }
   protected static final int WV_FMSE_LEN = 7;
   protected static final int WV_FMSE_SCALE = 4;
  	/**
	 * 	serializeWvFmse
	 */
	protected void serializeWvFmse(BigDecimal wvFmse) {
		   putDecimal(beginWvFmse,wvFmse,WV_FMSE_LEN,WV_FMSE_SCALE,true);
		 localWvFmseCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWvFmseMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshWvFmse is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWvFmse() throws CFException {	
   	try { 
		 return (getDecimal(beginWvFmse,WV_FMSE_LEN,WV_FMSE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wvFmse", beginWvFmse,WV_FMSE_LEN);
     }
   	}
        int localWvTotalCounter = -1;
        public boolean isWvTotalModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWvTotalCounter != sharedCounter;
           localWvTotalCounter = sharedCounter; return hasModified; 
        }
	    public boolean wvTotalIsNumeric() {
	      return decimalIsNumeric(beginWvTotal,WV_TOTAL_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wvTotalString() {
            return getPackedString(beginWvTotal,WV_TOTAL_LEN);
         }
   protected static final int WV_TOTAL_LEN = 7;
   protected static final int WV_TOTAL_SCALE = 4;
  	/**
	 * 	serializeWvTotal
	 */
	protected void serializeWvTotal(BigDecimal wvTotal) {
		   putDecimal(beginWvTotal,wvTotal,WV_TOTAL_LEN,WV_TOTAL_SCALE,true);
		 localWvTotalCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWvTotalMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshWvTotal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWvTotal() throws CFException {	
   	try { 
		 return (getDecimal(beginWvTotal,WV_TOTAL_LEN,WV_TOTAL_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wvTotal", beginWvTotal,WV_TOTAL_LEN);
     }
   	}
   protected static final int WV_MONTHLY_EXPO_LEN = 7;
   protected static final int WV_MONTHLY_EXPO_SCALE = 4;
     /**
	 * 	serializes this WvMonthlyExpo as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeWvMonthlyExpo(int index, BigDecimal value) {
		   replaceValue( 
		        getPackedString(value,WV_MONTHLY_EXPO_LEN,WV_MONTHLY_EXPO_SCALE,true)
		        ,(beginWvMonthlyExpo + index*WV_MONTHLY_EXPO_LEN) 
		        ,WV_MONTHLY_EXPO_LEN
		      );
   }

		public int wvMonthlyExpoSize() {
			return WV_MONTHLY_EXPO_SIZE;
		}



}
  
