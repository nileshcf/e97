package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AT11Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT11Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT11Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_11_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld111;
            protected  int beginATFld211;
	
	/**
	* Constructor for AT11Serialized
	**/
    public AT11Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT11Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT11Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT11Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT11Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT11Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_11_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld111 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld211 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld111Counter = -1;
     public boolean isATFld111Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld111Counter != sharedCounter;
         localATFld111Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_111_LEN = 20;
	/**
	 * 	serialize this ATFld111
	 */
   protected void serializeATFld111(char[] aTFld111) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld111,0,getStringValue(),beginATFld111,A_TFLD_111_LEN);
       localATFld111Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld111Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld111 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld111() {	 
   		return (substring(getStringValue(),beginATFld111,beginATFld111 + A_TFLD_111_LEN));
   	}
     int localATFld211Counter = -1;
     public boolean isATFld211Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld211Counter != sharedCounter;
         localATFld211Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_211_LEN = 40;
	/**
	 * 	serialize this ATFld211
	 */
   protected void serializeATFld211(char[] aTFld211) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld211,0,getStringValue(),beginATFld211,A_TFLD_211_LEN);
       localATFld211Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld211Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld211 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld211() {	 
   		return (substring(getStringValue(),beginATFld211,beginATFld211 + A_TFLD_211_LEN));
   	}




}
  
