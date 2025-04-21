package com.cloudframe.app.move0.dto.serialize;

/**
*  The class PackedTo1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class PackedTo1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PackedTo1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PACKED_TO_1_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginT10;
	
	/**
	* Constructor for PackedTo1Serialized
	**/
    public PackedTo1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in PackedTo1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PACKED_TO_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginT10 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localT10Counter = -1;
        public boolean isT10Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localT10Counter != sharedCounter;
           localT10Counter = sharedCounter; return hasModified; 
        }
	    public boolean t10IsNumeric() {
	      return decimalIsNumeric(beginT10,T_10_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] t10String() {
            return getPackedString(beginT10,T_10_LEN);
         }
   protected static final int T_10_LEN = 4;
   protected static final int T_10_SCALE = 3;
  	/**
	 * 	serializeT10
	 */
	protected void serializeT10(BigDecimal t10) {
		   putDecimal(beginT10,t10,T_10_LEN,T_10_SCALE,true);
		 localT10Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkT10MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,7/*precision*/);
   }
     /**
	 *	refreshT10 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshT10() throws CFException {	
   	try { 
		 return (getDecimal(beginT10,T_10_LEN,T_10_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("t10", beginT10,T_10_LEN);
     }
   	}




}
  
