package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class RlduuInEocUsgBlDtlSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlduuInEocUsgBlDtlSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlduuInEocUsgBlDtlSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLDUU_IN_EOC_USG_BL_DTL_LENGTH = 1010;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlduuSpclAppType;
	
	/**
	* Constructor for RlduuInEocUsgBlDtlSerialized
	**/
    public RlduuInEocUsgBlDtlSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RlduuInEocUsgBlDtlSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlduuInEocUsgBlDtlSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RlduuInEocUsgBlDtlSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RlduuInEocUsgBlDtlSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RlduuInEocUsgBlDtlSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLDUU_IN_EOC_USG_BL_DTL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlduuSpclAppType = getStartOffset() + 1005;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlduuSpclAppTypeCounter = -1;
     public boolean isRlduuSpclAppTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlduuSpclAppTypeCounter != sharedCounter;
         localRlduuSpclAppTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int RLDUU_SPCL_APP_TYPE_LEN = 5;
	/**
	 * 	serialize this RlduuSpclAppType
	 */
   protected void serializeRlduuSpclAppType(char[] rlduuSpclAppType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlduuSpclAppType,0,getStringValue(),beginRlduuSpclAppType,RLDUU_SPCL_APP_TYPE_LEN);
       localRlduuSpclAppTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlduuSpclAppTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshRlduuSpclAppType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlduuSpclAppType() {	 
   		return (substring(getStringValue(),beginRlduuSpclAppType,beginRlduuSpclAppType + RLDUU_SPCL_APP_TYPE_LEN));
   	}




}
  
