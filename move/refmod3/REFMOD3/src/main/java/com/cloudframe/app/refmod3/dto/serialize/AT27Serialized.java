package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class AT27Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT27Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT27Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_27_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld127;
            protected  int beginATFld227;
	
	/**
	* Constructor for AT27Serialized
	**/
    public AT27Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT27Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT27Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT27Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT27Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT27Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_27_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld127 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld227 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld127Counter = -1;
     public boolean isATFld127Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld127Counter != sharedCounter;
         localATFld127Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_127_LEN = 20;
	/**
	 * 	serialize this ATFld127
	 */
   protected void serializeATFld127(char[] aTFld127) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld127,0,getStringValue(),beginATFld127,A_TFLD_127_LEN);
       localATFld127Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld127Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld127 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld127() {	 
   		return (substring(getStringValue(),beginATFld127,beginATFld127 + A_TFLD_127_LEN));
   	}
     int localATFld227Counter = -1;
     public boolean isATFld227Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld227Counter != sharedCounter;
         localATFld227Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_227_LEN = 40;
	/**
	 * 	serialize this ATFld227
	 */
   protected void serializeATFld227(char[] aTFld227) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld227,0,getStringValue(),beginATFld227,A_TFLD_227_LEN);
       localATFld227Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld227Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld227 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld227() {	 
   		return (substring(getStringValue(),beginATFld227,beginATFld227 + A_TFLD_227_LEN));
   	}




}
  
