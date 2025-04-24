package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AT17Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT17Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT17Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_17_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld117;
            protected  int beginATFld217;
	
	/**
	* Constructor for AT17Serialized
	**/
    public AT17Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT17Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT17Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT17Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT17Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT17Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_17_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld117 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld217 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld117Counter = -1;
     public boolean isATFld117Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld117Counter != sharedCounter;
         localATFld117Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_117_LEN = 20;
	/**
	 * 	serialize this ATFld117
	 */
   protected void serializeATFld117(char[] aTFld117) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld117,0,getStringValue(),beginATFld117,A_TFLD_117_LEN);
       localATFld117Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld117Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld117 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld117() {	 
   		return (substring(getStringValue(),beginATFld117,beginATFld117 + A_TFLD_117_LEN));
   	}
     int localATFld217Counter = -1;
     public boolean isATFld217Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld217Counter != sharedCounter;
         localATFld217Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_217_LEN = 40;
	/**
	 * 	serialize this ATFld217
	 */
   protected void serializeATFld217(char[] aTFld217) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld217,0,getStringValue(),beginATFld217,A_TFLD_217_LEN);
       localATFld217Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld217Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld217 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld217() {	 
   		return (substring(getStringValue(),beginATFld217,beginATFld217 + A_TFLD_217_LEN));
   	}




}
  
