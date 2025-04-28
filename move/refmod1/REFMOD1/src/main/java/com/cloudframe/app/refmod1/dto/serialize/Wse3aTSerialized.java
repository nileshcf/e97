package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class Wse3aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse3aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse3aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_3A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse3aTFld1;
            protected  int beginWse3aTFld2;
	
	/**
	* Constructor for Wse3aTSerialized
	**/
    public Wse3aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse3aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse3aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse3aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse3aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse3aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_3A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse3aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse3aTFld2 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse3aTFld1Counter = -1;
     public boolean isWse3aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse3aTFld1Counter != sharedCounter;
         localWse3aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_3A_TFLD_1_LEN = 20;
	/**
	 * 	serialize this Wse3aTFld1
	 */
   protected void serializeWse3aTFld1(char[] wse3aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse3aTFld1,0,getStringValue(),beginWse3aTFld1,WSE_3A_TFLD_1_LEN);
       localWse3aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse3aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse3aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse3aTFld1() {	 
   		return (substring(getStringValue(),beginWse3aTFld1,beginWse3aTFld1 + WSE_3A_TFLD_1_LEN));
   	}
     int localWse3aTFld2Counter = -1;
     public boolean isWse3aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse3aTFld2Counter != sharedCounter;
         localWse3aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_3A_TFLD_2_LEN = 40;
	/**
	 * 	serialize this Wse3aTFld2
	 */
   protected void serializeWse3aTFld2(char[] wse3aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse3aTFld2,0,getStringValue(),beginWse3aTFld2,WSE_3A_TFLD_2_LEN);
       localWse3aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse3aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshWse3aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse3aTFld2() {	 
   		return (substring(getStringValue(),beginWse3aTFld2,beginWse3aTFld2 + WSE_3A_TFLD_2_LEN));
   	}




}
  
