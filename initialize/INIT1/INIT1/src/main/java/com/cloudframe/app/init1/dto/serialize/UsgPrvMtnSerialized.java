package com.cloudframe.app.init1.dto.serialize;

/**
*  The class UsgPrvMtnSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class UsgPrvMtnSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(UsgPrvMtnSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int USG_PRV_MTN_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginUsgPrvNpa;
            protected  int beginUsgPrvNxx;
            protected  int beginUsgPrvTln;
	
	/**
	* Constructor for UsgPrvMtnSerialized
	**/
    public UsgPrvMtnSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for UsgPrvMtnSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public UsgPrvMtnSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this UsgPrvMtnSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,246); // serialize this field at offset 246 by default 
    }
    
	/**
	* sets parent for this UsgPrvMtnSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 246 by default
    }    
	/**
	* initializes the field in UsgPrvMtnSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(USG_PRV_MTN_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginUsgPrvNpa = getStartOffset() + 0;	// set offset for serialization
  
             beginUsgPrvNxx = getStartOffset() + 3;	// set offset for serialization
  
             beginUsgPrvTln = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localUsgPrvNpaCounter = -1;
     public boolean isUsgPrvNpaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUsgPrvNpaCounter != sharedCounter;
         localUsgPrvNpaCounter = sharedCounter; return hasModified;
     }
	protected static final int USG_PRV_NPA_LEN = 3;
	/**
	 * 	serialize this UsgPrvNpa
	 */
   protected void serializeUsgPrvNpa(char[] usgPrvNpa) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(usgPrvNpa,0,getStringValue(),beginUsgPrvNpa,USG_PRV_NPA_LEN);
       localUsgPrvNpaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUsgPrvNpaConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshUsgPrvNpa is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUsgPrvNpa() {	 
   		return (substring(getStringValue(),beginUsgPrvNpa,beginUsgPrvNpa + USG_PRV_NPA_LEN));
   	}
     int localUsgPrvNxxCounter = -1;
     public boolean isUsgPrvNxxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUsgPrvNxxCounter != sharedCounter;
         localUsgPrvNxxCounter = sharedCounter; return hasModified;
     }
	protected static final int USG_PRV_NXX_LEN = 3;
	/**
	 * 	serialize this UsgPrvNxx
	 */
   protected void serializeUsgPrvNxx(char[] usgPrvNxx) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(usgPrvNxx,0,getStringValue(),beginUsgPrvNxx,USG_PRV_NXX_LEN);
       localUsgPrvNxxCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUsgPrvNxxConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshUsgPrvNxx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUsgPrvNxx() {	 
   		return (substring(getStringValue(),beginUsgPrvNxx,beginUsgPrvNxx + USG_PRV_NXX_LEN));
   	}
     int localUsgPrvTlnCounter = -1;
     public boolean isUsgPrvTlnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUsgPrvTlnCounter != sharedCounter;
         localUsgPrvTlnCounter = sharedCounter; return hasModified;
     }
	protected static final int USG_PRV_TLN_LEN = 4;
	/**
	 * 	serialize this UsgPrvTln
	 */
   protected void serializeUsgPrvTln(char[] usgPrvTln) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(usgPrvTln,0,getStringValue(),beginUsgPrvTln,USG_PRV_TLN_LEN);
       localUsgPrvTlnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUsgPrvTlnConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshUsgPrvTln is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUsgPrvTln() {	 
   		return (substring(getStringValue(),beginUsgPrvTln,beginUsgPrvTln + USG_PRV_TLN_LEN));
   	}




}
  
