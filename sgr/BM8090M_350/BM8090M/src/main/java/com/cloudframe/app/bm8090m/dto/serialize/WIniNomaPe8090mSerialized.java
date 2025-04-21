package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WIniNomaPe8090mSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WIniNomaPe8090mSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WIniNomaPe8090mSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_INI_NOMA_PE_8090M_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWIni1NomPe8090m;
	
	/**
	* Constructor for WIniNomaPe8090mSerialized
	**/
    public WIniNomaPe8090mSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WIniNomaPe8090mSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WIniNomaPe8090mSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WIniNomaPe8090mSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2604); // serialize this field at offset 2604 by default 
    }
    
	/**
	* sets parent for this WIniNomaPe8090mSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2604 by default
    }    
	/**
	* initializes the field in WIniNomaPe8090mSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_INI_NOMA_PE_8090M_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWIni1NomPe8090m = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWIni1NomPe8090mCounter = -1;
     public boolean isWIni1NomPe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWIni1NomPe8090mCounter != sharedCounter;
         localWIni1NomPe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_INI_1_NOM_PE_8090M_LEN = 1;
	/**
	 * 	serialize this WIni1NomPe8090m
	 */
   protected void serializeWIni1NomPe8090m(char[] wIni1NomPe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wIni1NomPe8090m,0,getStringValue(),beginWIni1NomPe8090m,W_INI_1_NOM_PE_8090M_LEN);
       localWIni1NomPe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWIni1NomPe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWIni1NomPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWIni1NomPe8090m() {	 
   		return (substring(getStringValue(),beginWIni1NomPe8090m,beginWIni1NomPe8090m + W_INI_1_NOM_PE_8090M_LEN));
   	}




}
  
