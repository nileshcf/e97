package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BT7Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT7Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT7Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_7_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld17;
            protected  int beginBTFld27;
            protected  int beginBTFld37;
	
	/**
	* Constructor for BT7Serialized
	**/
    public BT7Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT7Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT7Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT7Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT7Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT7Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_7_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld17 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld27 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld37 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld17Counter = -1;
     public boolean isBTFld17Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld17Counter != sharedCounter;
         localBTFld17Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_17_LEN = 20;
	/**
	 * 	serialize this BTFld17
	 */
   protected void serializeBTFld17(char[] bTFld17) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld17,0,getStringValue(),beginBTFld17,B_TFLD_17_LEN);
       localBTFld17Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld17Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld17 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld17() {	 
   		return (substring(getStringValue(),beginBTFld17,beginBTFld17 + B_TFLD_17_LEN));
   	}
     int localBTFld27Counter = -1;
     public boolean isBTFld27Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld27Counter != sharedCounter;
         localBTFld27Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_27_LEN = 40;
	/**
	 * 	serialize this BTFld27
	 */
   protected void serializeBTFld27(char[] bTFld27) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld27,0,getStringValue(),beginBTFld27,B_TFLD_27_LEN);
       localBTFld27Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld27Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld27 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld27() {	 
   		return (substring(getStringValue(),beginBTFld27,beginBTFld27 + B_TFLD_27_LEN));
   	}
     int localBTFld37Counter = -1;
     public boolean isBTFld37Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld37Counter != sharedCounter;
         localBTFld37Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_37_LEN = 30;
	/**
	 * 	serialize this BTFld37
	 */
   protected void serializeBTFld37(char[] bTFld37) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld37,0,getStringValue(),beginBTFld37,B_TFLD_37_LEN);
       localBTFld37Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld37Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld37 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld37() {	 
   		return (substring(getStringValue(),beginBTFld37,beginBTFld37 + B_TFLD_37_LEN));
   	}




}
  
