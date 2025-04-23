package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BT15Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT15Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT15Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_15_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld115;
            protected  int beginBTFld215;
            protected  int beginBTFld315;
	
	/**
	* Constructor for BT15Serialized
	**/
    public BT15Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT15Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT15Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT15Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BT15Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BT15Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_15_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld115 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld215 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld315 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld115Counter = -1;
     public boolean isBTFld115Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld115Counter != sharedCounter;
         localBTFld115Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_115_LEN = 20;
	/**
	 * 	serialize this BTFld115
	 */
   protected void serializeBTFld115(char[] bTFld115) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld115,0,getStringValue(),beginBTFld115,B_TFLD_115_LEN);
       localBTFld115Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld115Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld115 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld115() {	 
   		return (substring(getStringValue(),beginBTFld115,beginBTFld115 + B_TFLD_115_LEN));
   	}
     int localBTFld215Counter = -1;
     public boolean isBTFld215Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld215Counter != sharedCounter;
         localBTFld215Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_215_LEN = 40;
	/**
	 * 	serialize this BTFld215
	 */
   protected void serializeBTFld215(char[] bTFld215) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld215,0,getStringValue(),beginBTFld215,B_TFLD_215_LEN);
       localBTFld215Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld215Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld215 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld215() {	 
   		return (substring(getStringValue(),beginBTFld215,beginBTFld215 + B_TFLD_215_LEN));
   	}
     int localBTFld315Counter = -1;
     public boolean isBTFld315Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld315Counter != sharedCounter;
         localBTFld315Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_315_LEN = 30;
	/**
	 * 	serialize this BTFld315
	 */
   protected void serializeBTFld315(char[] bTFld315) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld315,0,getStringValue(),beginBTFld315,B_TFLD_315_LEN);
       localBTFld315Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld315Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld315 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld315() {	 
   		return (substring(getStringValue(),beginBTFld315,beginBTFld315 + B_TFLD_315_LEN));
   	}




}
  
