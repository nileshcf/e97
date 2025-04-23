package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse211aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse211aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse211aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_211A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse211aTFld1;
            protected  int beginWse211aTFld2;
	
	/**
	* Constructor for Wse211aTSerialized
	**/
    public Wse211aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse211aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse211aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse211aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse211aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse211aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_211A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse211aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse211aTFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse211aTFld1Counter = -1;
     public boolean isWse211aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse211aTFld1Counter != sharedCounter;
         localWse211aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_211A_TFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse211aTFld1
	 */
   protected void serializeWse211aTFld1(char[] wse211aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse211aTFld1,0,getStringValue(),beginWse211aTFld1,WSE_211A_TFLD_1_LEN);
       localWse211aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse211aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse211aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse211aTFld1() {	 
   		return (substring(getStringValue(),beginWse211aTFld1,beginWse211aTFld1 + WSE_211A_TFLD_1_LEN));
   	}
     int localWse211aTFld2Counter = -1;
     public boolean isWse211aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse211aTFld2Counter != sharedCounter;
         localWse211aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_211A_TFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse211aTFld2
	 */
   protected void serializeWse211aTFld2(char[] wse211aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse211aTFld2,0,getStringValue(),beginWse211aTFld2,WSE_211A_TFLD_2_LEN);
       localWse211aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse211aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse211aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse211aTFld2() {	 
   		return (substring(getStringValue(),beginWse211aTFld2,beginWse211aTFld2 + WSE_211A_TFLD_2_LEN));
   	}




}
  
