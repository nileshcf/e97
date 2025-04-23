package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class Pe8090pSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Pe8090pSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Pe8090pSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PE_8090P_LENGTH = 11870;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginPe8090r;
           protected static final int PE_8090R_SIZE = 50;
            protected  int beginPe00tc00;
            protected  int beginPe00tc01;
            protected  int beginPe00tc02;
	
	/**
	* Constructor for Pe8090pSerialized
	**/
    public Pe8090pSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Pe8090pSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pe8090pSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Pe8090pSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Pe8090pSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Pe8090pSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PE_8090P_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginPe8090r = getStartOffset() + 0; // set offset for serialization
  
             beginPe00tc00 = getStartOffset() + 11650;	// set offset for serialization
  
             beginPe00tc01 = getStartOffset() + 11750;	// set offset for serialization
  
             beginPe00tc02 = getStartOffset() + 11810;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPe00tc00Counter = -1;
     public boolean isPe00tc00Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPe00tc00Counter != sharedCounter;
         localPe00tc00Counter = sharedCounter; return hasModified;
     }
	protected static final int PE_00TC_00_LEN = 100;
	/**
	 * 	serialize this Pe00tc00
	 */
   protected void serializePe00tc00(char[] pe00tc00) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pe00tc00,0,getStringValue(),beginPe00tc00,PE_00TC_00_LEN);
       localPe00tc00Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPe00tc00Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
    /**
	 *	refreshPe00tc00 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPe00tc00() {	 
   		return (substring(getStringValue(),beginPe00tc00,beginPe00tc00 + PE_00TC_00_LEN));
   	}
     int localPe00tc01Counter = -1;
     public boolean isPe00tc01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPe00tc01Counter != sharedCounter;
         localPe00tc01Counter = sharedCounter; return hasModified;
     }
	protected static final int PE_00TC_01_LEN = 60;
	/**
	 * 	serialize this Pe00tc01
	 */
   protected void serializePe00tc01(char[] pe00tc01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pe00tc01,0,getStringValue(),beginPe00tc01,PE_00TC_01_LEN);
       localPe00tc01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPe00tc01Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshPe00tc01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPe00tc01() {	 
   		return (substring(getStringValue(),beginPe00tc01,beginPe00tc01 + PE_00TC_01_LEN));
   	}
     int localPe00tc02Counter = -1;
     public boolean isPe00tc02Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPe00tc02Counter != sharedCounter;
         localPe00tc02Counter = sharedCounter; return hasModified;
     }
	protected static final int PE_00TC_02_LEN = 60;
	/**
	 * 	serialize this Pe00tc02
	 */
   protected void serializePe00tc02(char[] pe00tc02) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pe00tc02,0,getStringValue(),beginPe00tc02,PE_00TC_02_LEN);
       localPe00tc02Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPe00tc02Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshPe00tc02 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPe00tc02() {	 
   		return (substring(getStringValue(),beginPe00tc02,beginPe00tc02 + PE_00TC_02_LEN));
   	}

		public int pe8090rSize() {
			return PE_8090R_SIZE;
		}



}
  
