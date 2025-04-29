package com.cloudframe.app.move0.dto.serialize;

/**
*  The class PackedTo2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class PackedTo2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PackedTo2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PACKED_TO_2_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginT11;
	
	/**
	* Constructor for PackedTo2Serialized
	**/
    public PackedTo2Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in PackedTo2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PACKED_TO_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginT11 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localT11Counter = -1;
        public boolean isT11Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localT11Counter != sharedCounter;
           localT11Counter = sharedCounter; return hasModified; 
        }
	    public boolean t11IsNumeric() {
	      return decimalIsNumeric(beginT11,T_11_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] t11String() {
            return getPackedString(beginT11,T_11_LEN);
         }
   protected static final int T_11_LEN = 4;
   protected static final int T_11_SCALE = 3;
  	/**
	 * 	serializeT11
	 */
	protected void serializeT11(BigDecimal t11) {
		   putDecimal(beginT11,t11,T_11_LEN,T_11_SCALE,false);
		 localT11Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkT11MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,7/*precision*/);
   }
     /**
	 *	refreshT11 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshT11() throws CFException {	
   	try { 
		 return (getDecimal(beginT11,T_11_LEN,T_11_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("t11", beginT11,T_11_LEN);
     }
   	}




}
  
