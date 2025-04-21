package com.cloudframe.app.init1.dto.serialize;

/**
*  The class KeyLsbcaMtnSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class KeyLsbcaMtnSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(KeyLsbcaMtnSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int KEY_LSBCA_MTN_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLsbcaNpa;
            protected  int beginLsbcaNxx;
            protected  int beginLsbcaTln;
	
	/**
	* Constructor for KeyLsbcaMtnSerialized
	**/
    public KeyLsbcaMtnSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for KeyLsbcaMtnSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyLsbcaMtnSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this KeyLsbcaMtnSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,138); // serialize this field at offset 138 by default 
    }
    
	/**
	* sets parent for this KeyLsbcaMtnSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 138 by default
    }    
	/**
	* initializes the field in KeyLsbcaMtnSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(KEY_LSBCA_MTN_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLsbcaNpa = getStartOffset() + 0;	// set offset for serialization
  
             beginLsbcaNxx = getStartOffset() + 3;	// set offset for serialization
  
             beginLsbcaTln = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLsbcaNpaCounter = -1;
     public boolean isLsbcaNpaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsbcaNpaCounter != sharedCounter;
         localLsbcaNpaCounter = sharedCounter; return hasModified;
     }
	protected static final int LSBCA_NPA_LEN = 3;
	/**
	 * 	serialize this LsbcaNpa
	 */
   protected void serializeLsbcaNpa(char[] lsbcaNpa) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsbcaNpa,0,getStringValue(),beginLsbcaNpa,LSBCA_NPA_LEN);
       localLsbcaNpaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsbcaNpaConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshLsbcaNpa is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsbcaNpa() {	 
   		return (substring(getStringValue(),beginLsbcaNpa,beginLsbcaNpa + LSBCA_NPA_LEN));
   	}
     int localLsbcaNxxCounter = -1;
     public boolean isLsbcaNxxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsbcaNxxCounter != sharedCounter;
         localLsbcaNxxCounter = sharedCounter; return hasModified;
     }
	protected static final int LSBCA_NXX_LEN = 3;
	/**
	 * 	serialize this LsbcaNxx
	 */
   protected void serializeLsbcaNxx(char[] lsbcaNxx) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsbcaNxx,0,getStringValue(),beginLsbcaNxx,LSBCA_NXX_LEN);
       localLsbcaNxxCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsbcaNxxConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshLsbcaNxx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsbcaNxx() {	 
   		return (substring(getStringValue(),beginLsbcaNxx,beginLsbcaNxx + LSBCA_NXX_LEN));
   	}
     int localLsbcaTlnCounter = -1;
     public boolean isLsbcaTlnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsbcaTlnCounter != sharedCounter;
         localLsbcaTlnCounter = sharedCounter; return hasModified;
     }
	protected static final int LSBCA_TLN_LEN = 4;
	/**
	 * 	serialize this LsbcaTln
	 */
   protected void serializeLsbcaTln(char[] lsbcaTln) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsbcaTln,0,getStringValue(),beginLsbcaTln,LSBCA_TLN_LEN);
       localLsbcaTlnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsbcaTlnConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshLsbcaTln is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsbcaTln() {	 
   		return (substring(getStringValue(),beginLsbcaTln,beginLsbcaTln + LSBCA_TLN_LEN));
   	}




}
  
