package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AT5Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT5Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT5Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_5_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld15;
            protected  int beginATFld25;
	
	/**
	* Constructor for AT5Serialized
	**/
    public AT5Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT5Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT5Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT5Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this AT5Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in AT5Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_5_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld15 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld25 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld15Counter = -1;
     public boolean isATFld15Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld15Counter != sharedCounter;
         localATFld15Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_15_LEN = 20;
	/**
	 * 	serialize this ATFld15
	 */
   protected void serializeATFld15(char[] aTFld15) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld15,0,getStringValue(),beginATFld15,A_TFLD_15_LEN);
       localATFld15Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld15Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld15 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld15() {	 
   		return (substring(getStringValue(),beginATFld15,beginATFld15 + A_TFLD_15_LEN));
   	}
     int localATFld25Counter = -1;
     public boolean isATFld25Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld25Counter != sharedCounter;
         localATFld25Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_25_LEN = 40;
	/**
	 * 	serialize this ATFld25
	 */
   protected void serializeATFld25(char[] aTFld25) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld25,0,getStringValue(),beginATFld25,A_TFLD_25_LEN);
       localATFld25Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld25Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld25 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld25() {	 
   		return (substring(getStringValue(),beginATFld25,beginATFld25 + A_TFLD_25_LEN));
   	}




}
  
