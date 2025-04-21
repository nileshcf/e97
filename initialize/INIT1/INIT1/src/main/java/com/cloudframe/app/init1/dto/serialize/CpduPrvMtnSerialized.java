package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CpduPrvMtnSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CpduPrvMtnSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CpduPrvMtnSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CPDU_PRV_MTN_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCpduPrvNpa;
            protected  int beginCpduPrvNxx;
            protected  int beginCpduPrvTln;
	
	/**
	* Constructor for CpduPrvMtnSerialized
	**/
    public CpduPrvMtnSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CpduPrvMtnSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CpduPrvMtnSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CpduPrvMtnSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,59); // serialize this field at offset 59 by default 
    }
    
	/**
	* sets parent for this CpduPrvMtnSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 59 by default
    }    
	/**
	* initializes the field in CpduPrvMtnSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CPDU_PRV_MTN_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCpduPrvNpa = getStartOffset() + 0;	// set offset for serialization
  
             beginCpduPrvNxx = getStartOffset() + 3;	// set offset for serialization
  
             beginCpduPrvTln = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCpduPrvNpaCounter = -1;
     public boolean isCpduPrvNpaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpduPrvNpaCounter != sharedCounter;
         localCpduPrvNpaCounter = sharedCounter; return hasModified;
     }
	protected static final int CPDU_PRV_NPA_LEN = 3;
	/**
	 * 	serialize this CpduPrvNpa
	 */
   protected void serializeCpduPrvNpa(char[] cpduPrvNpa) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpduPrvNpa,0,getStringValue(),beginCpduPrvNpa,CPDU_PRV_NPA_LEN);
       localCpduPrvNpaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpduPrvNpaConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCpduPrvNpa is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpduPrvNpa() {	 
   		return (substring(getStringValue(),beginCpduPrvNpa,beginCpduPrvNpa + CPDU_PRV_NPA_LEN));
   	}
     int localCpduPrvNxxCounter = -1;
     public boolean isCpduPrvNxxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpduPrvNxxCounter != sharedCounter;
         localCpduPrvNxxCounter = sharedCounter; return hasModified;
     }
	protected static final int CPDU_PRV_NXX_LEN = 3;
	/**
	 * 	serialize this CpduPrvNxx
	 */
   protected void serializeCpduPrvNxx(char[] cpduPrvNxx) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpduPrvNxx,0,getStringValue(),beginCpduPrvNxx,CPDU_PRV_NXX_LEN);
       localCpduPrvNxxCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpduPrvNxxConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCpduPrvNxx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpduPrvNxx() {	 
   		return (substring(getStringValue(),beginCpduPrvNxx,beginCpduPrvNxx + CPDU_PRV_NXX_LEN));
   	}
     int localCpduPrvTlnCounter = -1;
     public boolean isCpduPrvTlnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpduPrvTlnCounter != sharedCounter;
         localCpduPrvTlnCounter = sharedCounter; return hasModified;
     }
	protected static final int CPDU_PRV_TLN_LEN = 4;
	/**
	 * 	serialize this CpduPrvTln
	 */
   protected void serializeCpduPrvTln(char[] cpduPrvTln) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpduPrvTln,0,getStringValue(),beginCpduPrvTln,CPDU_PRV_TLN_LEN);
       localCpduPrvTlnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpduPrvTlnConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshCpduPrvTln is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpduPrvTln() {	 
   		return (substring(getStringValue(),beginCpduPrvTln,beginCpduPrvTln + CPDU_PRV_TLN_LEN));
   	}




}
  
