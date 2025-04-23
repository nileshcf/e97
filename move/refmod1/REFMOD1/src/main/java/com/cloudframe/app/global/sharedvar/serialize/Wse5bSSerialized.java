package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse5bSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse5bSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse5bSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_5B_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse5bSFld1;
            protected  int beginWse5bSFld2;
	
	/**
	* Constructor for Wse5bSSerialized
	**/
    public Wse5bSSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse5bSSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse5bSSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse5bSSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this Wse5bSSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in Wse5bSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_5B_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse5bSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse5bSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse5bSFld1Counter = -1;
     public boolean isWse5bSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse5bSFld1Counter != sharedCounter;
         localWse5bSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_5B_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse5bSFld1
	 */
   protected void serializeWse5bSFld1(char[] wse5bSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse5bSFld1,0,getStringValue(),beginWse5bSFld1,WSE_5B_SFLD_1_LEN);
       localWse5bSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse5bSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse5bSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse5bSFld1() {	 
   		return (substring(getStringValue(),beginWse5bSFld1,beginWse5bSFld1 + WSE_5B_SFLD_1_LEN));
   	}
     int localWse5bSFld2Counter = -1;
     public boolean isWse5bSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse5bSFld2Counter != sharedCounter;
         localWse5bSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_5B_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse5bSFld2
	 */
   protected void serializeWse5bSFld2(char[] wse5bSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse5bSFld2,0,getStringValue(),beginWse5bSFld2,WSE_5B_SFLD_2_LEN);
       localWse5bSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse5bSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse5bSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse5bSFld2() {	 
   		return (substring(getStringValue(),beginWse5bSFld2,beginWse5bSFld2 + WSE_5B_SFLD_2_LEN));
   	}




}
  
