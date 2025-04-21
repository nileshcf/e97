package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class OldclLnShrBcActvTlrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class OldclLnShrBcActvTlrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(OldclLnShrBcActvTlrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OLDCL_LN_SHR_BC_ACTV_TLR_LENGTH = 350;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOldclFiller;
	
	/**
	* Constructor for OldclLnShrBcActvTlrSerialized
	**/
    public OldclLnShrBcActvTlrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for OldclLnShrBcActvTlrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public OldclLnShrBcActvTlrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this OldclLnShrBcActvTlrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this OldclLnShrBcActvTlrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in OldclLnShrBcActvTlrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OLDCL_LN_SHR_BC_ACTV_TLR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOldclFiller = getStartOffset() + 39;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOldclFillerCounter = -1;
     public boolean isOldclFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOldclFillerCounter != sharedCounter;
         localOldclFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int OLDCL_FILLER_LEN = 311;
	/**
	 * 	serialize this OldclFiller
	 */
   protected void serializeOldclFiller(char[] oldclFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(oldclFiller,0,getStringValue(),beginOldclFiller,OLDCL_FILLER_LEN);
       localOldclFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOldclFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 311 ,false, false);
   }
    /**
	 *	refreshOldclFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOldclFiller() {	 
   		return (substring(getStringValue(),beginOldclFiller,beginOldclFiller + OLDCL_FILLER_LEN));
   	}




}
  
