package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AT12Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT12Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT12Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_12_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld112;
            protected  int beginATFld212;
	
	/**
	* Constructor for AT12Serialized
	**/
    public AT12Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT12Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT12Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT12Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT12Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT12Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_12_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld112 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld212 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld112Counter = -1;
     public boolean isATFld112Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld112Counter != sharedCounter;
         localATFld112Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_112_LEN = 20;
	/**
	 * 	serialize this ATFld112
	 */
   protected void serializeATFld112(char[] aTFld112) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld112,0,getStringValue(),beginATFld112,A_TFLD_112_LEN);
       localATFld112Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld112Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld112 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld112() {	 
   		return (substring(getStringValue(),beginATFld112,beginATFld112 + A_TFLD_112_LEN));
   	}
     int localATFld212Counter = -1;
     public boolean isATFld212Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld212Counter != sharedCounter;
         localATFld212Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_212_LEN = 40;
	/**
	 * 	serialize this ATFld212
	 */
   protected void serializeATFld212(char[] aTFld212) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld212,0,getStringValue(),beginATFld212,A_TFLD_212_LEN);
       localATFld212Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld212Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld212 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld212() {	 
   		return (substring(getStringValue(),beginATFld212,beginATFld212 + A_TFLD_212_LEN));
   	}




}
  
