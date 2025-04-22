package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class AT210Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT210Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT210Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_210_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld1210;
            protected  int beginATFld2210;
	
	/**
	* Constructor for AT210Serialized
	**/
    public AT210Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT210Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT210Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT210Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT210Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT210Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_210_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld1210 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld2210 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld1210Counter = -1;
     public boolean isATFld1210Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld1210Counter != sharedCounter;
         localATFld1210Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_1210_LEN = 20;
	/**
	 * 	serialize this ATFld1210
	 */
   protected void serializeATFld1210(char[] aTFld1210) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld1210,0,getStringValue(),beginATFld1210,A_TFLD_1210_LEN);
       localATFld1210Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld1210Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld1210 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld1210() {	 
   		return (substring(getStringValue(),beginATFld1210,beginATFld1210 + A_TFLD_1210_LEN));
   	}
     int localATFld2210Counter = -1;
     public boolean isATFld2210Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld2210Counter != sharedCounter;
         localATFld2210Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_2210_LEN = 40;
	/**
	 * 	serialize this ATFld2210
	 */
   protected void serializeATFld2210(char[] aTFld2210) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld2210,0,getStringValue(),beginATFld2210,A_TFLD_2210_LEN);
       localATFld2210Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld2210Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld2210 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld2210() {	 
   		return (substring(getStringValue(),beginATFld2210,beginATFld2210 + A_TFLD_2210_LEN));
   	}




}
  
