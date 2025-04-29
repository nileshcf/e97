package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class AT218Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT218Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT218Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_218_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld1218;
            protected  int beginATFld2218;
	
	/**
	* Constructor for AT218Serialized
	**/
    public AT218Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT218Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT218Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT218Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT218Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT218Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_218_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld1218 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld2218 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld1218Counter = -1;
     public boolean isATFld1218Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld1218Counter != sharedCounter;
         localATFld1218Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_1218_LEN = 20;
	/**
	 * 	serialize this ATFld1218
	 */
   protected void serializeATFld1218(char[] aTFld1218) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld1218,0,getStringValue(),beginATFld1218,A_TFLD_1218_LEN);
       localATFld1218Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld1218Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld1218 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld1218() {	 
   		return (substring(getStringValue(),beginATFld1218,beginATFld1218 + A_TFLD_1218_LEN));
   	}
     int localATFld2218Counter = -1;
     public boolean isATFld2218Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld2218Counter != sharedCounter;
         localATFld2218Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_2218_LEN = 40;
	/**
	 * 	serialize this ATFld2218
	 */
   protected void serializeATFld2218(char[] aTFld2218) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld2218,0,getStringValue(),beginATFld2218,A_TFLD_2218_LEN);
       localATFld2218Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld2218Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld2218 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld2218() {	 
   		return (substring(getStringValue(),beginATFld2218,beginATFld2218 + A_TFLD_2218_LEN));
   	}




}
  
