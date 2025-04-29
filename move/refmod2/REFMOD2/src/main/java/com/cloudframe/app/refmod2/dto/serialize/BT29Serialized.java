package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class BT29Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT29Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT29Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_29_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld129;
            protected  int beginBTFld229;
            protected  int beginBTFld329;
	
	/**
	* Constructor for BT29Serialized
	**/
    public BT29Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT29Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT29Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT29Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT29Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT29Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_29_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld129 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld229 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld329 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld129Counter = -1;
     public boolean isBTFld129Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld129Counter != sharedCounter;
         localBTFld129Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_129_LEN = 20;
	/**
	 * 	serialize this BTFld129
	 */
   protected void serializeBTFld129(char[] bTFld129) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld129,0,getStringValue(),beginBTFld129,B_TFLD_129_LEN);
       localBTFld129Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld129Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld129 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld129() {	 
   		return (substring(getStringValue(),beginBTFld129,beginBTFld129 + B_TFLD_129_LEN));
   	}
     int localBTFld229Counter = -1;
     public boolean isBTFld229Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld229Counter != sharedCounter;
         localBTFld229Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_229_LEN = 40;
	/**
	 * 	serialize this BTFld229
	 */
   protected void serializeBTFld229(char[] bTFld229) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld229,0,getStringValue(),beginBTFld229,B_TFLD_229_LEN);
       localBTFld229Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld229Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld229 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld229() {	 
   		return (substring(getStringValue(),beginBTFld229,beginBTFld229 + B_TFLD_229_LEN));
   	}
     int localBTFld329Counter = -1;
     public boolean isBTFld329Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld329Counter != sharedCounter;
         localBTFld329Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_329_LEN = 30;
	/**
	 * 	serialize this BTFld329
	 */
   protected void serializeBTFld329(char[] bTFld329) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld329,0,getStringValue(),beginBTFld329,B_TFLD_329_LEN);
       localBTFld329Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld329Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld329 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld329() {	 
   		return (substring(getStringValue(),beginBTFld329,beginBTFld329 + B_TFLD_329_LEN));
   	}




}
  
