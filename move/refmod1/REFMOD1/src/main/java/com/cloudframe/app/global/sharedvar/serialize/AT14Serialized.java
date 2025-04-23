package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AT14Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT14Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT14Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_14_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld114;
            protected  int beginATFld214;
	
	/**
	* Constructor for AT14Serialized
	**/
    public AT14Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT14Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT14Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT14Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT14Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT14Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_14_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld114 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld214 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld114Counter = -1;
     public boolean isATFld114Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld114Counter != sharedCounter;
         localATFld114Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_114_LEN = 20;
	/**
	 * 	serialize this ATFld114
	 */
   protected void serializeATFld114(char[] aTFld114) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld114,0,getStringValue(),beginATFld114,A_TFLD_114_LEN);
       localATFld114Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld114Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld114 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld114() {	 
   		return (substring(getStringValue(),beginATFld114,beginATFld114 + A_TFLD_114_LEN));
   	}
     int localATFld214Counter = -1;
     public boolean isATFld214Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld214Counter != sharedCounter;
         localATFld214Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_214_LEN = 40;
	/**
	 * 	serialize this ATFld214
	 */
   protected void serializeATFld214(char[] aTFld214) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld214,0,getStringValue(),beginATFld214,A_TFLD_214_LEN);
       localATFld214Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld214Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld214 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld214() {	 
   		return (substring(getStringValue(),beginATFld214,beginATFld214 + A_TFLD_214_LEN));
   	}




}
  
