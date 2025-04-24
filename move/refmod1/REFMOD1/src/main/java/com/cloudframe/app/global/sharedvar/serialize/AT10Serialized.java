package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AT10Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT10Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT10Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_10_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld110;
            protected  int beginATFld210;
	
	/**
	* Constructor for AT10Serialized
	**/
    public AT10Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT10Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT10Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT10Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT10Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT10Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_10_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld110 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld210 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld110Counter = -1;
     public boolean isATFld110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld110Counter != sharedCounter;
         localATFld110Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_110_LEN = 20;
	/**
	 * 	serialize this ATFld110
	 */
   protected void serializeATFld110(char[] aTFld110) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld110,0,getStringValue(),beginATFld110,A_TFLD_110_LEN);
       localATFld110Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld110Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld110 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld110() {	 
   		return (substring(getStringValue(),beginATFld110,beginATFld110 + A_TFLD_110_LEN));
   	}
     int localATFld210Counter = -1;
     public boolean isATFld210Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld210Counter != sharedCounter;
         localATFld210Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_210_LEN = 40;
	/**
	 * 	serialize this ATFld210
	 */
   protected void serializeATFld210(char[] aTFld210) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld210,0,getStringValue(),beginATFld210,A_TFLD_210_LEN);
       localATFld210Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld210Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld210 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld210() {	 
   		return (substring(getStringValue(),beginATFld210,beginATFld210 + A_TFLD_210_LEN));
   	}




}
  
