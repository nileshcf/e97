package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Cf20004TableDataKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Cf20004TableDataKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Cf20004TableDataKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CF_20004_TABLE_DATA_KEY_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCf20004Ab;
            protected  int beginCf20004BsR;
	
	/**
	* Constructor for Cf20004TableDataKeySerialized
	**/
    public Cf20004TableDataKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Cf20004TableDataKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Cf20004TableDataKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Cf20004TableDataKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,18); // serialize this field at offset 18 by default 
    }
    
	/**
	* sets parent for this Cf20004TableDataKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 18 by default
    }    
	/**
	* initializes the field in Cf20004TableDataKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CF_20004_TABLE_DATA_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCf20004Ab = getStartOffset() + 0;	// set offset for serialization
  
  
             beginCf20004BsR = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCf20004AbCounter = -1;
     public boolean isCf20004AbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCf20004AbCounter != sharedCounter;
         localCf20004AbCounter = sharedCounter; return hasModified;
     }
	protected static final int CF_20004_AB_LEN = 3;
	/**
	 * 	serialize this Cf20004Ab
	 */
   protected void serializeCf20004Ab(char[] cf20004Ab) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cf20004Ab,0,getStringValue(),beginCf20004Ab,CF_20004_AB_LEN);
       localCf20004AbCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCf20004AbConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCf20004Ab is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCf20004Ab() {	 
   		return (substring(getStringValue(),beginCf20004Ab,beginCf20004Ab + CF_20004_AB_LEN));
   	}
     int localCf20004BsRCounter = -1;
     public boolean isCf20004BsRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCf20004BsRCounter != sharedCounter;
         localCf20004BsRCounter = sharedCounter; return hasModified;
     }
	protected static final int CF_20004_BS_R_LEN = 7;
	/**
	 * 	serialize this Cf20004BsR
	 */
   protected void serializeCf20004BsR(char[] cf20004BsR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cf20004BsR,0,getStringValue(),beginCf20004BsR,CF_20004_BS_R_LEN);
       localCf20004BsRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCf20004BsRConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshCf20004BsR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCf20004BsR() {	 
   		return (substring(getStringValue(),beginCf20004BsR,beginCf20004BsR + CF_20004_BS_R_LEN));
   	}




}
  
