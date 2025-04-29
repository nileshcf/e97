package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class AT220Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT220Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT220Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_220_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld1220;
            protected  int beginATFld2220;
	
	/**
	* Constructor for AT220Serialized
	**/
    public AT220Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT220Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT220Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT220Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT220Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT220Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_220_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld1220 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld2220 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld1220Counter = -1;
     public boolean isATFld1220Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld1220Counter != sharedCounter;
         localATFld1220Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_1220_LEN = 20;
	/**
	 * 	serialize this ATFld1220
	 */
   protected void serializeATFld1220(char[] aTFld1220) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld1220,0,getStringValue(),beginATFld1220,A_TFLD_1220_LEN);
       localATFld1220Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld1220Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld1220 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld1220() {	 
   		return (substring(getStringValue(),beginATFld1220,beginATFld1220 + A_TFLD_1220_LEN));
   	}
     int localATFld2220Counter = -1;
     public boolean isATFld2220Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld2220Counter != sharedCounter;
         localATFld2220Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_2220_LEN = 40;
	/**
	 * 	serialize this ATFld2220
	 */
   protected void serializeATFld2220(char[] aTFld2220) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld2220,0,getStringValue(),beginATFld2220,A_TFLD_2220_LEN);
       localATFld2220Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld2220Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld2220 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld2220() {	 
   		return (substring(getStringValue(),beginATFld2220,beginATFld2220 + A_TFLD_2220_LEN));
   	}




}
  
