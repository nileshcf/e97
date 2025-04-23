package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse29bSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse29bSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse29bSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_29B_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse29bSFld1;
            protected  int beginWse29bSFld2;
	
	/**
	* Constructor for Wse29bSSerialized
	**/
    public Wse29bSSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse29bSSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse29bSSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse29bSSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this Wse29bSSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in Wse29bSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_29B_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse29bSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse29bSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse29bSFld1Counter = -1;
     public boolean isWse29bSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse29bSFld1Counter != sharedCounter;
         localWse29bSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_29B_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse29bSFld1
	 */
   protected void serializeWse29bSFld1(char[] wse29bSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse29bSFld1,0,getStringValue(),beginWse29bSFld1,WSE_29B_SFLD_1_LEN);
       localWse29bSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse29bSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse29bSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse29bSFld1() {	 
   		return (substring(getStringValue(),beginWse29bSFld1,beginWse29bSFld1 + WSE_29B_SFLD_1_LEN));
   	}
     int localWse29bSFld2Counter = -1;
     public boolean isWse29bSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse29bSFld2Counter != sharedCounter;
         localWse29bSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_29B_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse29bSFld2
	 */
   protected void serializeWse29bSFld2(char[] wse29bSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse29bSFld2,0,getStringValue(),beginWse29bSFld2,WSE_29B_SFLD_2_LEN);
       localWse29bSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse29bSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse29bSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse29bSFld2() {	 
   		return (substring(getStringValue(),beginWse29bSFld2,beginWse29bSFld2 + WSE_29B_SFLD_2_LEN));
   	}




}
  
