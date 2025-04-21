package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class AT211Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT211Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT211Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_211_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld1211;
            protected  int beginATFld2211;
	
	/**
	* Constructor for AT211Serialized
	**/
    public AT211Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT211Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT211Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT211Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT211Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT211Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_211_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld1211 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld2211 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld1211Counter = -1;
     public boolean isATFld1211Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld1211Counter != sharedCounter;
         localATFld1211Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_1211_LEN = 20;
	/**
	 * 	serialize this ATFld1211
	 */
   protected void serializeATFld1211(char[] aTFld1211) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld1211,0,getStringValue(),beginATFld1211,A_TFLD_1211_LEN);
       localATFld1211Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld1211Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld1211 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld1211() {	 
   		return (substring(getStringValue(),beginATFld1211,beginATFld1211 + A_TFLD_1211_LEN));
   	}
     int localATFld2211Counter = -1;
     public boolean isATFld2211Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld2211Counter != sharedCounter;
         localATFld2211Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_2211_LEN = 40;
	/**
	 * 	serialize this ATFld2211
	 */
   protected void serializeATFld2211(char[] aTFld2211) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld2211,0,getStringValue(),beginATFld2211,A_TFLD_2211_LEN);
       localATFld2211Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld2211Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld2211 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld2211() {	 
   		return (substring(getStringValue(),beginATFld2211,beginATFld2211 + A_TFLD_2211_LEN));
   	}




}
  
