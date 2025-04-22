package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class Wse4aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse4aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse4aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_4A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse4aTFld1;
            protected  int beginWse4aTFld2;
	
	/**
	* Constructor for Wse4aTSerialized
	**/
    public Wse4aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse4aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse4aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse4aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse4aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse4aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_4A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse4aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse4aTFld2 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse4aTFld1Counter = -1;
     public boolean isWse4aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse4aTFld1Counter != sharedCounter;
         localWse4aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_4A_TFLD_1_LEN = 20;
	/**
	 * 	serialize this Wse4aTFld1
	 */
   protected void serializeWse4aTFld1(char[] wse4aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse4aTFld1,0,getStringValue(),beginWse4aTFld1,WSE_4A_TFLD_1_LEN);
       localWse4aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse4aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse4aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse4aTFld1() {	 
   		return (substring(getStringValue(),beginWse4aTFld1,beginWse4aTFld1 + WSE_4A_TFLD_1_LEN));
   	}
     int localWse4aTFld2Counter = -1;
     public boolean isWse4aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse4aTFld2Counter != sharedCounter;
         localWse4aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_4A_TFLD_2_LEN = 40;
	/**
	 * 	serialize this Wse4aTFld2
	 */
   protected void serializeWse4aTFld2(char[] wse4aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse4aTFld2,0,getStringValue(),beginWse4aTFld2,WSE_4A_TFLD_2_LEN);
       localWse4aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse4aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshWse4aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse4aTFld2() {	 
   		return (substring(getStringValue(),beginWse4aTFld2,beginWse4aTFld2 + WSE_4A_TFLD_2_LEN));
   	}




}
  
