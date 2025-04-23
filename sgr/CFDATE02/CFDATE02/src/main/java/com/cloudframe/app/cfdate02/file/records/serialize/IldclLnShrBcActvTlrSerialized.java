package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class IldclLnShrBcActvTlrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IldclLnShrBcActvTlrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IldclLnShrBcActvTlrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ILDCL_LN_SHR_BC_ACTV_TLR_LENGTH = 350;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIldclFiller;
	
	/**
	* Constructor for IldclLnShrBcActvTlrSerialized
	**/
    public IldclLnShrBcActvTlrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IldclLnShrBcActvTlrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IldclLnShrBcActvTlrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IldclLnShrBcActvTlrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this IldclLnShrBcActvTlrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in IldclLnShrBcActvTlrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ILDCL_LN_SHR_BC_ACTV_TLR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIldclFiller = getStartOffset() + 39;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIldclFillerCounter = -1;
     public boolean isIldclFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIldclFillerCounter != sharedCounter;
         localIldclFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int ILDCL_FILLER_LEN = 311;
	/**
	 * 	serialize this IldclFiller
	 */
   protected void serializeIldclFiller(char[] ildclFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ildclFiller,0,getStringValue(),beginIldclFiller,ILDCL_FILLER_LEN);
       localIldclFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIldclFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 311 ,false, false);
   }
    /**
	 *	refreshIldclFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIldclFiller() {	 
   		return (substring(getStringValue(),beginIldclFiller,beginIldclFiller + ILDCL_FILLER_LEN));
   	}




}
  
