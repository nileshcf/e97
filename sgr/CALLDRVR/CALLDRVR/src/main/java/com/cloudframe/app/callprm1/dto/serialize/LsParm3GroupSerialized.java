package com.cloudframe.app.callprm1.dto.serialize;

/**
*  The class LsParm3GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class LsParm3GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LsParm3GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LS_PARM_3_GROUP_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLsParm3;
	
	/**
	* Constructor for LsParm3GroupSerialized
	**/
    public LsParm3GroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LsParm3GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LS_PARM_3_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLsParm3 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localLsParm3Counter = -1;
        public boolean isLsParm3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localLsParm3Counter != sharedCounter;
           localLsParm3Counter = sharedCounter; return hasModified; 
        }
	    public boolean lsParm3IsNumeric() {
	      return decimalIsNumeric(beginLsParm3,LS_PARM_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] lsParm3String() {
            return getPackedString(beginLsParm3,LS_PARM_3_LEN);
         }
   protected static final int LS_PARM_3_LEN = 3;
   protected static final int LS_PARM_3_SCALE = 2;
  	/**
	 * 	serializeLsParm3
	 */
	protected void serializeLsParm3(BigDecimal lsParm3) {
		   putDecimal(beginLsParm3,lsParm3,LS_PARM_3_LEN,LS_PARM_3_SCALE,true);
		 localLsParm3Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkLsParm3MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,4/*precision*/);
   }
     /**
	 *	refreshLsParm3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshLsParm3() throws CFException {	
   	try { 
		 return (getDecimal(beginLsParm3,LS_PARM_3_LEN,LS_PARM_3_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("lsParm3", beginLsParm3,LS_PARM_3_LEN);
     }
   	}




}
  
