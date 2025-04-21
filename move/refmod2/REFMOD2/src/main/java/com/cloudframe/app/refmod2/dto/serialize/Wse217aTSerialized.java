package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse217aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse217aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse217aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_217A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse217aTFld1;
            protected  int beginWse217aTFld2;
	
	/**
	* Constructor for Wse217aTSerialized
	**/
    public Wse217aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse217aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse217aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse217aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse217aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse217aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_217A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse217aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse217aTFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse217aTFld1Counter = -1;
     public boolean isWse217aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse217aTFld1Counter != sharedCounter;
         localWse217aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_217A_TFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse217aTFld1
	 */
   protected void serializeWse217aTFld1(char[] wse217aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse217aTFld1,0,getStringValue(),beginWse217aTFld1,WSE_217A_TFLD_1_LEN);
       localWse217aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse217aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse217aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse217aTFld1() {	 
   		return (substring(getStringValue(),beginWse217aTFld1,beginWse217aTFld1 + WSE_217A_TFLD_1_LEN));
   	}
     int localWse217aTFld2Counter = -1;
     public boolean isWse217aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse217aTFld2Counter != sharedCounter;
         localWse217aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_217A_TFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse217aTFld2
	 */
   protected void serializeWse217aTFld2(char[] wse217aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse217aTFld2,0,getStringValue(),beginWse217aTFld2,WSE_217A_TFLD_2_LEN);
       localWse217aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse217aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse217aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse217aTFld2() {	 
   		return (substring(getStringValue(),beginWse217aTFld2,beginWse217aTFld2 + WSE_217A_TFLD_2_LEN));
   	}




}
  
