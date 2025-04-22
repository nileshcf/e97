package com.cloudframe.app.calldrvr.dto.serialize;

/**
*  The class Parm6GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Parm6GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Parm6GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARM_6_GROUP_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParm6;
	
	/**
	* Constructor for Parm6GroupSerialized
	**/
    public Parm6GroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Parm6GroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parm6GroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Parm6GroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,23); // serialize this field at offset 23 by default 
    }
    
	/**
	* sets parent for this Parm6GroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 23 by default
    }    
	/**
	* initializes the field in Parm6GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARM_6_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginParm6 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localParm6Counter = -1;
        public boolean isParm6Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localParm6Counter != sharedCounter;
           localParm6Counter = sharedCounter; return hasModified; 
        }
	    public boolean parm6IsNumeric() {
	      return decimalIsNumeric(beginParm6,PARM_6_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] parm6String() {
            return getPackedString(beginParm6,PARM_6_LEN);
         }
   protected static final int PARM_6_LEN = 3;
   protected static final int PARM_6_SCALE = 2;
  	/**
	 * 	serializeParm6
	 */
	protected void serializeParm6(BigDecimal parm6) {
		   putDecimal(beginParm6,parm6,PARM_6_LEN,PARM_6_SCALE,true);
		 localParm6Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkParm6MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,4/*precision*/);
   }
     /**
	 *	refreshParm6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshParm6() throws CFException {	
   	try { 
		 return (getDecimal(beginParm6,PARM_6_LEN,PARM_6_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("parm6", beginParm6,PARM_6_LEN);
     }
   	}




}
  
