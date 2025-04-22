package com.cloudframe.app.callprm1.dto.serialize;

/**
*  The class LsParm6GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class LsParm6GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LsParm6GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LS_PARM_6_GROUP_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLsParm6;
	
	/**
	* Constructor for LsParm6GroupSerialized
	**/
    public LsParm6GroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LsParm6GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LS_PARM_6_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLsParm6 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localLsParm6Counter = -1;
        public boolean isLsParm6Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localLsParm6Counter != sharedCounter;
           localLsParm6Counter = sharedCounter; return hasModified; 
        }
	    public boolean lsParm6IsNumeric() {
	      return decimalIsNumeric(beginLsParm6,LS_PARM_6_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] lsParm6String() {
            return getPackedString(beginLsParm6,LS_PARM_6_LEN);
         }
   protected static final int LS_PARM_6_LEN = 3;
   protected static final int LS_PARM_6_SCALE = 2;
  	/**
	 * 	serializeLsParm6
	 */
	protected void serializeLsParm6(BigDecimal lsParm6) {
		   putDecimal(beginLsParm6,lsParm6,LS_PARM_6_LEN,LS_PARM_6_SCALE,true);
		 localLsParm6Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkLsParm6MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,4/*precision*/);
   }
     /**
	 *	refreshLsParm6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshLsParm6() throws CFException {	
   	try { 
		 return (getDecimal(beginLsParm6,LS_PARM_6_LEN,LS_PARM_6_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("lsParm6", beginLsParm6,LS_PARM_6_LEN);
     }
   	}




}
  
