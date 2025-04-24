package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse27aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse27aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse27aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_27A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse27aTFld1;
            protected  int beginWse27aTFld2;
	
	/**
	* Constructor for Wse27aTSerialized
	**/
    public Wse27aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse27aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse27aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse27aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse27aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse27aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_27A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse27aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse27aTFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse27aTFld1Counter = -1;
     public boolean isWse27aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse27aTFld1Counter != sharedCounter;
         localWse27aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_27A_TFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse27aTFld1
	 */
   protected void serializeWse27aTFld1(char[] wse27aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse27aTFld1,0,getStringValue(),beginWse27aTFld1,WSE_27A_TFLD_1_LEN);
       localWse27aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse27aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse27aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse27aTFld1() {	 
   		return (substring(getStringValue(),beginWse27aTFld1,beginWse27aTFld1 + WSE_27A_TFLD_1_LEN));
   	}
     int localWse27aTFld2Counter = -1;
     public boolean isWse27aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse27aTFld2Counter != sharedCounter;
         localWse27aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_27A_TFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse27aTFld2
	 */
   protected void serializeWse27aTFld2(char[] wse27aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse27aTFld2,0,getStringValue(),beginWse27aTFld2,WSE_27A_TFLD_2_LEN);
       localWse27aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse27aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse27aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse27aTFld2() {	 
   		return (substring(getStringValue(),beginWse27aTFld2,beginWse27aTFld2 + WSE_27A_TFLD_2_LEN));
   	}




}
  
