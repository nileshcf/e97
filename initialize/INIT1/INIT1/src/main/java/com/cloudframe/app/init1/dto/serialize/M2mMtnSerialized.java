package com.cloudframe.app.init1.dto.serialize;

/**
*  The class M2mMtnSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class M2mMtnSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(M2mMtnSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int M_2M_MTN_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginM2mMtnNpa;
            protected  int beginM2mMtnNxx;
            protected  int beginM2mMtnTln;
	
	/**
	* Constructor for M2mMtnSerialized
	**/
    public M2mMtnSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for M2mMtnSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public M2mMtnSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this M2mMtnSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,422); // serialize this field at offset 422 by default 
    }
    
	/**
	* sets parent for this M2mMtnSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 422 by default
    }    
	/**
	* initializes the field in M2mMtnSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(M_2M_MTN_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginM2mMtnNpa = getStartOffset() + 0;	// set offset for serialization
  
             beginM2mMtnNxx = getStartOffset() + 3;	// set offset for serialization
  
             beginM2mMtnTln = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localM2mMtnNpaCounter = -1;
     public boolean isM2mMtnNpaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localM2mMtnNpaCounter != sharedCounter;
         localM2mMtnNpaCounter = sharedCounter; return hasModified;
     }
	protected static final int M_2M_MTN_NPA_LEN = 3;
	/**
	 * 	serialize this M2mMtnNpa
	 */
   protected void serializeM2mMtnNpa(char[] m2mMtnNpa) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(m2mMtnNpa,0,getStringValue(),beginM2mMtnNpa,M_2M_MTN_NPA_LEN);
       localM2mMtnNpaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkM2mMtnNpaConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshM2mMtnNpa is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshM2mMtnNpa() {	 
   		return (substring(getStringValue(),beginM2mMtnNpa,beginM2mMtnNpa + M_2M_MTN_NPA_LEN));
   	}
     int localM2mMtnNxxCounter = -1;
     public boolean isM2mMtnNxxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localM2mMtnNxxCounter != sharedCounter;
         localM2mMtnNxxCounter = sharedCounter; return hasModified;
     }
	protected static final int M_2M_MTN_NXX_LEN = 3;
	/**
	 * 	serialize this M2mMtnNxx
	 */
   protected void serializeM2mMtnNxx(char[] m2mMtnNxx) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(m2mMtnNxx,0,getStringValue(),beginM2mMtnNxx,M_2M_MTN_NXX_LEN);
       localM2mMtnNxxCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkM2mMtnNxxConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshM2mMtnNxx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshM2mMtnNxx() {	 
   		return (substring(getStringValue(),beginM2mMtnNxx,beginM2mMtnNxx + M_2M_MTN_NXX_LEN));
   	}
     int localM2mMtnTlnCounter = -1;
     public boolean isM2mMtnTlnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localM2mMtnTlnCounter != sharedCounter;
         localM2mMtnTlnCounter = sharedCounter; return hasModified;
     }
	protected static final int M_2M_MTN_TLN_LEN = 4;
	/**
	 * 	serialize this M2mMtnTln
	 */
   protected void serializeM2mMtnTln(char[] m2mMtnTln) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(m2mMtnTln,0,getStringValue(),beginM2mMtnTln,M_2M_MTN_TLN_LEN);
       localM2mMtnTlnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkM2mMtnTlnConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshM2mMtnTln is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshM2mMtnTln() {	 
   		return (substring(getStringValue(),beginM2mMtnTln,beginM2mMtnTln + M_2M_MTN_TLN_LEN));
   	}




}
  
