package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class AT214Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:02. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT214Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT214Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_214_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld1214;
            protected  int beginATFld2214;
	
	/**
	* Constructor for AT214Serialized
	**/
    public AT214Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT214Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT214Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT214Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT214Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT214Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_214_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld1214 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld2214 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld1214Counter = -1;
     public boolean isATFld1214Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld1214Counter != sharedCounter;
         localATFld1214Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_1214_LEN = 20;
	/**
	 * 	serialize this ATFld1214
	 */
   protected void serializeATFld1214(char[] aTFld1214) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld1214,0,getStringValue(),beginATFld1214,A_TFLD_1214_LEN);
       localATFld1214Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld1214Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld1214 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld1214() {	 
   		return (substring(getStringValue(),beginATFld1214,beginATFld1214 + A_TFLD_1214_LEN));
   	}
     int localATFld2214Counter = -1;
     public boolean isATFld2214Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld2214Counter != sharedCounter;
         localATFld2214Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_2214_LEN = 40;
	/**
	 * 	serialize this ATFld2214
	 */
   protected void serializeATFld2214(char[] aTFld2214) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld2214,0,getStringValue(),beginATFld2214,A_TFLD_2214_LEN);
       localATFld2214Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld2214Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld2214 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld2214() {	 
   		return (substring(getStringValue(),beginATFld2214,beginATFld2214 + A_TFLD_2214_LEN));
   	}




}
  
