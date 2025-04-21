package com.cloudframe.app.cfstring.dto.serialize;

/**
*  The class ExtBillCycleDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ExtBillCycleDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ExtBillCycleDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EXT_BILL_CYCLE_DT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSlash1;
            protected  int beginSlash2;
	
	/**
	* Constructor for ExtBillCycleDtSerialized
	**/
    public ExtBillCycleDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ExtBillCycleDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtBillCycleDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ExtBillCycleDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1046); // serialize this field at offset 1046 by default 
    }
    
	/**
	* sets parent for this ExtBillCycleDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1046 by default
    }    
	/**
	* initializes the field in ExtBillCycleDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EXT_BILL_CYCLE_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSlash1 = getStartOffset() + 2;	// set offset for serialization
  
             beginSlash2 = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSlash1Counter = -1;
     public boolean isSlash1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSlash1Counter != sharedCounter;
         localSlash1Counter = sharedCounter; return hasModified;
     }
	protected static final int SLASH_1_LEN = 1;
	/**
	 * 	serialize this Slash1
	 */
   protected void serializeSlash1(char[] slash1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(slash1,0,getStringValue(),beginSlash1,SLASH_1_LEN);
       localSlash1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSlash1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSlash1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSlash1() {	 
   		return (substring(getStringValue(),beginSlash1,beginSlash1 + SLASH_1_LEN));
   	}
     int localSlash2Counter = -1;
     public boolean isSlash2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSlash2Counter != sharedCounter;
         localSlash2Counter = sharedCounter; return hasModified;
     }
	protected static final int SLASH_2_LEN = 1;
	/**
	 * 	serialize this Slash2
	 */
   protected void serializeSlash2(char[] slash2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(slash2,0,getStringValue(),beginSlash2,SLASH_2_LEN);
       localSlash2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSlash2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSlash2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSlash2() {	 
   		return (substring(getStringValue(),beginSlash2,beginSlash2 + SLASH_2_LEN));
   	}




}
  
