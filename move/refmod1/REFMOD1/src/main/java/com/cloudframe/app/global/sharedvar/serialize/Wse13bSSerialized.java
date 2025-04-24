package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse13bSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse13bSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse13bSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_13B_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse13bSFld1;
            protected  int beginWse13bSFld2;
	
	/**
	* Constructor for Wse13bSSerialized
	**/
    public Wse13bSSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse13bSSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse13bSSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse13bSSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this Wse13bSSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in Wse13bSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_13B_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse13bSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse13bSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse13bSFld1Counter = -1;
     public boolean isWse13bSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse13bSFld1Counter != sharedCounter;
         localWse13bSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_13B_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse13bSFld1
	 */
   protected void serializeWse13bSFld1(char[] wse13bSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse13bSFld1,0,getStringValue(),beginWse13bSFld1,WSE_13B_SFLD_1_LEN);
       localWse13bSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse13bSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse13bSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse13bSFld1() {	 
   		return (substring(getStringValue(),beginWse13bSFld1,beginWse13bSFld1 + WSE_13B_SFLD_1_LEN));
   	}
     int localWse13bSFld2Counter = -1;
     public boolean isWse13bSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse13bSFld2Counter != sharedCounter;
         localWse13bSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_13B_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse13bSFld2
	 */
   protected void serializeWse13bSFld2(char[] wse13bSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse13bSFld2,0,getStringValue(),beginWse13bSFld2,WSE_13B_SFLD_2_LEN);
       localWse13bSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse13bSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse13bSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse13bSFld2() {	 
   		return (substring(getStringValue(),beginWse13bSFld2,beginWse13bSFld2 + WSE_13B_SFLD_2_LEN));
   	}




}
  
