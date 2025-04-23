package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class IldcrLnShrGrpRemTlrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IldcrLnShrGrpRemTlrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IldcrLnShrGrpRemTlrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ILDCR_LN_SHR_GRP_REM_TLR_LENGTH = 173;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIldcrFiller;
	
	/**
	* Constructor for IldcrLnShrGrpRemTlrSerialized
	**/
    public IldcrLnShrGrpRemTlrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IldcrLnShrGrpRemTlrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IldcrLnShrGrpRemTlrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IldcrLnShrGrpRemTlrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this IldcrLnShrGrpRemTlrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in IldcrLnShrGrpRemTlrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ILDCR_LN_SHR_GRP_REM_TLR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIldcrFiller = getStartOffset() + 39;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIldcrFillerCounter = -1;
     public boolean isIldcrFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIldcrFillerCounter != sharedCounter;
         localIldcrFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int ILDCR_FILLER_LEN = 134;
	/**
	 * 	serialize this IldcrFiller
	 */
   protected void serializeIldcrFiller(char[] ildcrFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ildcrFiller,0,getStringValue(),beginIldcrFiller,ILDCR_FILLER_LEN);
       localIldcrFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIldcrFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 134 ,false, false);
   }
    /**
	 *	refreshIldcrFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIldcrFiller() {	 
   		return (substring(getStringValue(),beginIldcrFiller,beginIldcrFiller + ILDCR_FILLER_LEN));
   	}




}
  
