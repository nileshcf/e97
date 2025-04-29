package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WIniNomPe8090mSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WIniNomPe8090mSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WIniNomPe8090mSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_INI_NOM_PE_8090M_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWIniPe8090m;
	
	/**
	* Constructor for WIniNomPe8090mSerialized
	**/
    public WIniNomPe8090mSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WIniNomPe8090mSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WIniNomPe8090mSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WIniNomPe8090mSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2912); // serialize this field at offset 2912 by default 
    }
    
	/**
	* sets parent for this WIniNomPe8090mSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2912 by default
    }    
	/**
	* initializes the field in WIniNomPe8090mSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_INI_NOM_PE_8090M_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWIniPe8090m = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWIniPe8090mCounter = -1;
     public boolean isWIniPe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWIniPe8090mCounter != sharedCounter;
         localWIniPe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_INI_PE_8090M_LEN = 1;
	/**
	 * 	serialize this WIniPe8090m
	 */
   protected void serializeWIniPe8090m(char[] wIniPe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wIniPe8090m,0,getStringValue(),beginWIniPe8090m,W_INI_PE_8090M_LEN);
       localWIniPe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWIniPe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWIniPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWIniPe8090m() {	 
   		return (substring(getStringValue(),beginWIniPe8090m,beginWIniPe8090m + W_INI_PE_8090M_LEN));
   	}




}
  
