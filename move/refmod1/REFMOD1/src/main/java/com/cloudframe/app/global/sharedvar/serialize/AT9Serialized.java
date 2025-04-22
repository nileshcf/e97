package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AT9Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT9Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT9Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_9_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld19;
            protected  int beginATFld29;
	
	/**
	* Constructor for AT9Serialized
	**/
    public AT9Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT9Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT9Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT9Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT9Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT9Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_9_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld19 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld29 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld19Counter = -1;
     public boolean isATFld19Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld19Counter != sharedCounter;
         localATFld19Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_19_LEN = 20;
	/**
	 * 	serialize this ATFld19
	 */
   protected void serializeATFld19(char[] aTFld19) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld19,0,getStringValue(),beginATFld19,A_TFLD_19_LEN);
       localATFld19Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld19Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld19 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld19() {	 
   		return (substring(getStringValue(),beginATFld19,beginATFld19 + A_TFLD_19_LEN));
   	}
     int localATFld29Counter = -1;
     public boolean isATFld29Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld29Counter != sharedCounter;
         localATFld29Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_29_LEN = 40;
	/**
	 * 	serialize this ATFld29
	 */
   protected void serializeATFld29(char[] aTFld29) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld29,0,getStringValue(),beginATFld29,A_TFLD_29_LEN);
       localATFld29Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld29Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld29 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld29() {	 
   		return (substring(getStringValue(),beginATFld29,beginATFld29 + A_TFLD_29_LEN));
   	}




}
  
