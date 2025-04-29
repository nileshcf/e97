package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse215bSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse215bSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse215bSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_215B_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse215bSFld1;
            protected  int beginWse215bSFld2;
	
	/**
	* Constructor for Wse215bSSerialized
	**/
    public Wse215bSSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse215bSSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse215bSSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse215bSSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this Wse215bSSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in Wse215bSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_215B_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse215bSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse215bSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse215bSFld1Counter = -1;
     public boolean isWse215bSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse215bSFld1Counter != sharedCounter;
         localWse215bSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_215B_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse215bSFld1
	 */
   protected void serializeWse215bSFld1(char[] wse215bSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse215bSFld1,0,getStringValue(),beginWse215bSFld1,WSE_215B_SFLD_1_LEN);
       localWse215bSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse215bSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse215bSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse215bSFld1() {	 
   		return (substring(getStringValue(),beginWse215bSFld1,beginWse215bSFld1 + WSE_215B_SFLD_1_LEN));
   	}
     int localWse215bSFld2Counter = -1;
     public boolean isWse215bSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse215bSFld2Counter != sharedCounter;
         localWse215bSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_215B_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse215bSFld2
	 */
   protected void serializeWse215bSFld2(char[] wse215bSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse215bSFld2,0,getStringValue(),beginWse215bSFld2,WSE_215B_SFLD_2_LEN);
       localWse215bSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse215bSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse215bSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse215bSFld2() {	 
   		return (substring(getStringValue(),beginWse215bSFld2,beginWse215bSFld2 + WSE_215B_SFLD_2_LEN));
   	}




}
  
