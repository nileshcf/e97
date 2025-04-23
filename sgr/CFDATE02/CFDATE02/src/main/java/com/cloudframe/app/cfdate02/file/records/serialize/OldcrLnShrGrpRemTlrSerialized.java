package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class OldcrLnShrGrpRemTlrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class OldcrLnShrGrpRemTlrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(OldcrLnShrGrpRemTlrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OLDCR_LN_SHR_GRP_REM_TLR_LENGTH = 173;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOldcrFiller;
	
	/**
	* Constructor for OldcrLnShrGrpRemTlrSerialized
	**/
    public OldcrLnShrGrpRemTlrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for OldcrLnShrGrpRemTlrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public OldcrLnShrGrpRemTlrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this OldcrLnShrGrpRemTlrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this OldcrLnShrGrpRemTlrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in OldcrLnShrGrpRemTlrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OLDCR_LN_SHR_GRP_REM_TLR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOldcrFiller = getStartOffset() + 39;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOldcrFillerCounter = -1;
     public boolean isOldcrFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOldcrFillerCounter != sharedCounter;
         localOldcrFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int OLDCR_FILLER_LEN = 134;
	/**
	 * 	serialize this OldcrFiller
	 */
   protected void serializeOldcrFiller(char[] oldcrFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(oldcrFiller,0,getStringValue(),beginOldcrFiller,OLDCR_FILLER_LEN);
       localOldcrFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOldcrFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 134 ,false, false);
   }
    /**
	 *	refreshOldcrFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOldcrFiller() {	 
   		return (substring(getStringValue(),beginOldcrFiller,beginOldcrFiller + OLDCR_FILLER_LEN));
   	}




}
  
