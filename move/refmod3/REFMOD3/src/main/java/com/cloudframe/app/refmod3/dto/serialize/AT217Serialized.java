package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class AT217Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:57. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT217Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT217Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_217_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld1217;
            protected  int beginATFld2217;
	
	/**
	* Constructor for AT217Serialized
	**/
    public AT217Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT217Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT217Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT217Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT217Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT217Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_217_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld1217 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld2217 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld1217Counter = -1;
     public boolean isATFld1217Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld1217Counter != sharedCounter;
         localATFld1217Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_1217_LEN = 20;
	/**
	 * 	serialize this ATFld1217
	 */
   protected void serializeATFld1217(char[] aTFld1217) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld1217,0,getStringValue(),beginATFld1217,A_TFLD_1217_LEN);
       localATFld1217Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld1217Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld1217 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld1217() {	 
   		return (substring(getStringValue(),beginATFld1217,beginATFld1217 + A_TFLD_1217_LEN));
   	}
     int localATFld2217Counter = -1;
     public boolean isATFld2217Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld2217Counter != sharedCounter;
         localATFld2217Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_2217_LEN = 40;
	/**
	 * 	serialize this ATFld2217
	 */
   protected void serializeATFld2217(char[] aTFld2217) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld2217,0,getStringValue(),beginATFld2217,A_TFLD_2217_LEN);
       localATFld2217Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld2217Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld2217 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld2217() {	 
   		return (substring(getStringValue(),beginATFld2217,beginATFld2217 + A_TFLD_2217_LEN));
   	}




}
  
