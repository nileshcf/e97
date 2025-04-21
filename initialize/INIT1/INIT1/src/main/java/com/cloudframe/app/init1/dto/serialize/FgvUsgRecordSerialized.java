package com.cloudframe.app.init1.dto.serialize;

/**
*  The class FgvUsgRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class FgvUsgRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FgvUsgRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FGV_USG_RECORD_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFgvTotalAlwUsg;
            protected  int beginFgvEdpAcctThrshold;
            protected  int beginFgvAcctUsgThrshold;
	
	/**
	* Constructor for FgvUsgRecordSerialized
	**/
    public FgvUsgRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FgvUsgRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FgvUsgRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FgvUsgRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,611); // serialize this field at offset 611 by default 
    }
    
	/**
	* sets parent for this FgvUsgRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 611 by default
    }    
	/**
	* initializes the field in FgvUsgRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FGV_USG_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFgvTotalAlwUsg = getStartOffset() + 0;	// set offset for serialization
  
             beginFgvEdpAcctThrshold = getStartOffset() + 4;	// set offset for serialization
  
             beginFgvAcctUsgThrshold = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localFgvTotalAlwUsgCounter = -1;
         public boolean isFgvTotalAlwUsgModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFgvTotalAlwUsgCounter != sharedCounter;
            localFgvTotalAlwUsgCounter = sharedCounter; return hasModified; 
         }
   protected static final int FGV_TOTAL_ALW_USG_LEN = 4;
  	/**
	 * serializeFgvTotalAlwUsg
	 */
	protected void serializeFgvTotalAlwUsg(int fgvTotalAlwUsg) {
           replaceValue( //  save the value as string
                   getBinaryString( fgvTotalAlwUsg,FGV_TOTAL_ALW_USG_LEN)
                  ,beginFgvTotalAlwUsg
                  ,FGV_TOTAL_ALW_USG_LEN
                 );
            localFgvTotalAlwUsgCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkFgvTotalAlwUsgMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshFgvTotalAlwUsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFgvTotalAlwUsg() {	 
			return (getInt(beginFgvTotalAlwUsg));
   	}
         int localFgvEdpAcctThrsholdCounter = -1;
         public boolean isFgvEdpAcctThrsholdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFgvEdpAcctThrsholdCounter != sharedCounter;
            localFgvEdpAcctThrsholdCounter = sharedCounter; return hasModified; 
         }
   protected static final int FGV_EDP_ACCT_THRSHOLD_LEN = 4;
  	/**
	 * serializeFgvEdpAcctThrshold
	 */
	protected void serializeFgvEdpAcctThrshold(int fgvEdpAcctThrshold) {
           replaceValue( //  save the value as string
                   getBinaryString( fgvEdpAcctThrshold,FGV_EDP_ACCT_THRSHOLD_LEN)
                  ,beginFgvEdpAcctThrshold
                  ,FGV_EDP_ACCT_THRSHOLD_LEN
                 );
            localFgvEdpAcctThrsholdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkFgvEdpAcctThrsholdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshFgvEdpAcctThrshold is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFgvEdpAcctThrshold() {	 
			return (getInt(beginFgvEdpAcctThrshold));
   	}
        int localFgvAcctUsgThrsholdCounter = -1;
        public boolean isFgvAcctUsgThrsholdModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localFgvAcctUsgThrsholdCounter != sharedCounter;
           localFgvAcctUsgThrsholdCounter = sharedCounter; return hasModified; 
        }
	    public boolean fgvAcctUsgThrsholdIsNumeric() {
	      return decimalIsNumeric(beginFgvAcctUsgThrshold,FGV_ACCT_USG_THRSHOLD_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] fgvAcctUsgThrsholdString() {
            return getPackedString(beginFgvAcctUsgThrshold,FGV_ACCT_USG_THRSHOLD_LEN);
         }
   protected static final int FGV_ACCT_USG_THRSHOLD_LEN = 4;
   protected static final int FGV_ACCT_USG_THRSHOLD_SCALE = 2;
  	/**
	 * 	serializeFgvAcctUsgThrshold
	 */
	protected void serializeFgvAcctUsgThrshold(BigDecimal fgvAcctUsgThrshold) {
		   putDecimal(beginFgvAcctUsgThrshold,fgvAcctUsgThrshold,FGV_ACCT_USG_THRSHOLD_LEN,FGV_ACCT_USG_THRSHOLD_SCALE,true);
		 localFgvAcctUsgThrsholdCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkFgvAcctUsgThrsholdMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,7/*precision*/);
   }
     /**
	 *	refreshFgvAcctUsgThrshold is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshFgvAcctUsgThrshold() throws CFException {	
   	try { 
		 return (getDecimal(beginFgvAcctUsgThrshold,FGV_ACCT_USG_THRSHOLD_LEN,FGV_ACCT_USG_THRSHOLD_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("fgvAcctUsgThrshold", beginFgvAcctUsgThrshold,FGV_ACCT_USG_THRSHOLD_LEN);
     }
   	}




}
  
