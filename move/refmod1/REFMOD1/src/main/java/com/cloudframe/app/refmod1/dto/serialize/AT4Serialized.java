package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class AT4Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT4Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT4Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_4_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld14;
            protected  int beginATFld24;
	
	/**
	* Constructor for AT4Serialized
	**/
    public AT4Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT4Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT4Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT4Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this AT4Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in AT4Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_4_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld14 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld24 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld14Counter = -1;
     public boolean isATFld14Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld14Counter != sharedCounter;
         localATFld14Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_14_LEN = 20;
	/**
	 * 	serialize this ATFld14
	 */
   protected void serializeATFld14(char[] aTFld14) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld14,0,getStringValue(),beginATFld14,A_TFLD_14_LEN);
       localATFld14Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld14Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld14 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld14() {	 
   		return (substring(getStringValue(),beginATFld14,beginATFld14 + A_TFLD_14_LEN));
   	}
     int localATFld24Counter = -1;
     public boolean isATFld24Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld24Counter != sharedCounter;
         localATFld24Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_24_LEN = 40;
	/**
	 * 	serialize this ATFld24
	 */
   protected void serializeATFld24(char[] aTFld24) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld24,0,getStringValue(),beginATFld24,A_TFLD_24_LEN);
       localATFld24Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld24Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld24 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld24() {	 
   		return (substring(getStringValue(),beginATFld24,beginATFld24 + A_TFLD_24_LEN));
   	}




}
  
