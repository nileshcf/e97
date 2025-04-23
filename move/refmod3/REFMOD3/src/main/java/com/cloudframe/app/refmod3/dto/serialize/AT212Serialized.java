package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class AT212Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT212Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT212Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_212_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld1212;
            protected  int beginATFld2212;
	
	/**
	* Constructor for AT212Serialized
	**/
    public AT212Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT212Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT212Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT212Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT212Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT212Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_212_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld1212 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld2212 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld1212Counter = -1;
     public boolean isATFld1212Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld1212Counter != sharedCounter;
         localATFld1212Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_1212_LEN = 20;
	/**
	 * 	serialize this ATFld1212
	 */
   protected void serializeATFld1212(char[] aTFld1212) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld1212,0,getStringValue(),beginATFld1212,A_TFLD_1212_LEN);
       localATFld1212Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld1212Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld1212 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld1212() {	 
   		return (substring(getStringValue(),beginATFld1212,beginATFld1212 + A_TFLD_1212_LEN));
   	}
     int localATFld2212Counter = -1;
     public boolean isATFld2212Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld2212Counter != sharedCounter;
         localATFld2212Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_2212_LEN = 40;
	/**
	 * 	serialize this ATFld2212
	 */
   protected void serializeATFld2212(char[] aTFld2212) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld2212,0,getStringValue(),beginATFld2212,A_TFLD_2212_LEN);
       localATFld2212Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld2212Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld2212 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld2212() {	 
   		return (substring(getStringValue(),beginATFld2212,beginATFld2212 + A_TFLD_2212_LEN));
   	}




}
  
