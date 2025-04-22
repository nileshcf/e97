package com.cloudframe.app.calldrvr.dto.serialize;

/**
*  The class Parm3GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Parm3GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Parm3GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARM_3_GROUP_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParm3;
	
	/**
	* Constructor for Parm3GroupSerialized
	**/
    public Parm3GroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Parm3GroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parm3GroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Parm3GroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,10); // serialize this field at offset 10 by default 
    }
    
	/**
	* sets parent for this Parm3GroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 10 by default
    }    
	/**
	* initializes the field in Parm3GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARM_3_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginParm3 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localParm3Counter = -1;
        public boolean isParm3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localParm3Counter != sharedCounter;
           localParm3Counter = sharedCounter; return hasModified; 
        }
	    public boolean parm3IsNumeric() {
	      return decimalIsNumeric(beginParm3,PARM_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] parm3String() {
            return getPackedString(beginParm3,PARM_3_LEN);
         }
   protected static final int PARM_3_LEN = 3;
   protected static final int PARM_3_SCALE = 2;
  	/**
	 * 	serializeParm3
	 */
	protected void serializeParm3(BigDecimal parm3) {
		   putDecimal(beginParm3,parm3,PARM_3_LEN,PARM_3_SCALE,true);
		 localParm3Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkParm3MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,4/*precision*/);
   }
     /**
	 *	refreshParm3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshParm3() throws CFException {	
   	try { 
		 return (getDecimal(beginParm3,PARM_3_LEN,PARM_3_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("parm3", beginParm3,PARM_3_LEN);
     }
   	}




}
  
