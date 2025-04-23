package com.cloudframe.app.edjaddrs.dto.serialize;

/**
*  The class RctMinComp3GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class RctMinComp3GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RctMinComp3GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RCT_MIN_COMP_3_GROUP_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRctMinComp3;
	
	/**
	* Constructor for RctMinComp3GroupSerialized
	**/
    public RctMinComp3GroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RctMinComp3GroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RctMinComp3GroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RctMinComp3GroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,208); // serialize this field at offset 208 by default 
    }
    
	/**
	* sets parent for this RctMinComp3GroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 208 by default
    }    
	/**
	* initializes the field in RctMinComp3GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RCT_MIN_COMP_3_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRctMinComp3 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localRctMinComp3Counter = -1;
        public boolean isRctMinComp3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRctMinComp3Counter != sharedCounter;
           localRctMinComp3Counter = sharedCounter; return hasModified; 
        }
	    public boolean rctMinComp3IsNumeric() {
	      return decimalIsNumeric(beginRctMinComp3,RCT_MIN_COMP_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int RCT_MIN_COMP_3_LEN = 10;
  	/**
	 * 	serializeRctMinComp3
	 */
	protected void serializeRctMinComp3(long rctMinComp3) {
		   putDecimal(beginRctMinComp3,rctMinComp3,RCT_MIN_COMP_3_LEN,true);
   }
   

   protected long checkRctMinComp3MaxLimit(long number) {
        return checkMaxLimit(number , MAX_1E /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshRctMinComp3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRctMinComp3() throws CFException {	
   	try { 
		 return (getLongDecimal(beginRctMinComp3,RCT_MIN_COMP_3_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("rctMinComp3", beginRctMinComp3,RCT_MIN_COMP_3_LEN);
     }
   	}




}
  
