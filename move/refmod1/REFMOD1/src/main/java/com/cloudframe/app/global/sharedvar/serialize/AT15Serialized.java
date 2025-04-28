package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AT15Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT15Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT15Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_15_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld115;
            protected  int beginATFld215;
	
	/**
	* Constructor for AT15Serialized
	**/
    public AT15Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT15Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT15Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT15Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this AT15Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in AT15Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_15_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld115 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld215 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld115Counter = -1;
     public boolean isATFld115Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld115Counter != sharedCounter;
         localATFld115Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_115_LEN = 20;
	/**
	 * 	serialize this ATFld115
	 */
   protected void serializeATFld115(char[] aTFld115) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld115,0,getStringValue(),beginATFld115,A_TFLD_115_LEN);
       localATFld115Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld115Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld115 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld115() {	 
   		return (substring(getStringValue(),beginATFld115,beginATFld115 + A_TFLD_115_LEN));
   	}
     int localATFld215Counter = -1;
     public boolean isATFld215Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld215Counter != sharedCounter;
         localATFld215Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_215_LEN = 40;
	/**
	 * 	serialize this ATFld215
	 */
   protected void serializeATFld215(char[] aTFld215) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld215,0,getStringValue(),beginATFld215,A_TFLD_215_LEN);
       localATFld215Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld215Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld215 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld215() {	 
   		return (substring(getStringValue(),beginATFld215,beginATFld215 + A_TFLD_215_LEN));
   	}




}
  
