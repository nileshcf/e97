package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WAstJurPe8090mSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WAstJurPe8090mSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WAstJurPe8090mSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_AST_JUR_PE_8090M_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWEstPe8090m;
            protected  int beginWJurPe8090m;
	
	/**
	* Constructor for WAstJurPe8090mSerialized
	**/
    public WAstJurPe8090mSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WAstJurPe8090mSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WAstJurPe8090mSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WAstJurPe8090mSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2710); // serialize this field at offset 2710 by default 
    }
    
	/**
	* sets parent for this WAstJurPe8090mSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2710 by default
    }    
	/**
	* initializes the field in WAstJurPe8090mSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_AST_JUR_PE_8090M_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWEstPe8090m = getStartOffset() + 0;	// set offset for serialization
  
             beginWJurPe8090m = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWEstPe8090mCounter = -1;
     public boolean isWEstPe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWEstPe8090mCounter != sharedCounter;
         localWEstPe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_EST_PE_8090M_LEN = 1;
	/**
	 * 	serialize this WEstPe8090m
	 */
   protected void serializeWEstPe8090m(char[] wEstPe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wEstPe8090m,0,getStringValue(),beginWEstPe8090m,W_EST_PE_8090M_LEN);
       localWEstPe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWEstPe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWEstPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWEstPe8090m() {	 
   		return (substring(getStringValue(),beginWEstPe8090m,beginWEstPe8090m + W_EST_PE_8090M_LEN));
   	}
     int localWJurPe8090mCounter = -1;
     public boolean isWJurPe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWJurPe8090mCounter != sharedCounter;
         localWJurPe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_JUR_PE_8090M_LEN = 59;
	/**
	 * 	serialize this WJurPe8090m
	 */
   protected void serializeWJurPe8090m(char[] wJurPe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wJurPe8090m,0,getStringValue(),beginWJurPe8090m,W_JUR_PE_8090M_LEN);
       localWJurPe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWJurPe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 59 ,false, false);
   }
    /**
	 *	refreshWJurPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWJurPe8090m() {	 
   		return (substring(getStringValue(),beginWJurPe8090m,beginWJurPe8090m + W_JUR_PE_8090M_LEN));
   	}




}
  
