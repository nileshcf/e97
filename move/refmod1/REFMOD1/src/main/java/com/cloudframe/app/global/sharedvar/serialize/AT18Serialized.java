package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AT18Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT18Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT18Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_18_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld118;
            protected  int beginATFld218;
	
	/**
	* Constructor for AT18Serialized
	**/
    public AT18Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT18Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT18Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT18Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT18Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT18Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_18_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld118 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld218 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld118Counter = -1;
     public boolean isATFld118Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld118Counter != sharedCounter;
         localATFld118Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_118_LEN = 20;
	/**
	 * 	serialize this ATFld118
	 */
   protected void serializeATFld118(char[] aTFld118) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld118,0,getStringValue(),beginATFld118,A_TFLD_118_LEN);
       localATFld118Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld118Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld118 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld118() {	 
   		return (substring(getStringValue(),beginATFld118,beginATFld118 + A_TFLD_118_LEN));
   	}
     int localATFld218Counter = -1;
     public boolean isATFld218Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld218Counter != sharedCounter;
         localATFld218Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_218_LEN = 40;
	/**
	 * 	serialize this ATFld218
	 */
   protected void serializeATFld218(char[] aTFld218) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld218,0,getStringValue(),beginATFld218,A_TFLD_218_LEN);
       localATFld218Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld218Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld218 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld218() {	 
   		return (substring(getStringValue(),beginATFld218,beginATFld218 + A_TFLD_218_LEN));
   	}




}
  
