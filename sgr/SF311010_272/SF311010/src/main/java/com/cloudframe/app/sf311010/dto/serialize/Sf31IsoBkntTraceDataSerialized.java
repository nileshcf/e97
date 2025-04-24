package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Sf31IsoBkntTraceDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf31IsoBkntTraceDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf31IsoBkntTraceDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_31_ISO_BKNT_TRACE_DATA_LENGTH = 9;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf31IsoBkntProdDesc;
            protected  int beginSf31IsoBkntRefNo;
	
	/**
	* Constructor for Sf31IsoBkntTraceDataSerialized
	**/
    public Sf31IsoBkntTraceDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf31IsoBkntTraceDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf31IsoBkntTraceDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf31IsoBkntTraceDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,300); // serialize this field at offset 300 by default 
    }
    
	/**
	* sets parent for this Sf31IsoBkntTraceDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 300 by default
    }    
	/**
	* initializes the field in Sf31IsoBkntTraceDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_31_ISO_BKNT_TRACE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf31IsoBkntProdDesc = getStartOffset() + 0;	// set offset for serialization
  
             beginSf31IsoBkntRefNo = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf31IsoBkntProdDescCounter = -1;
     public boolean isSf31IsoBkntProdDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoBkntProdDescCounter != sharedCounter;
         localSf31IsoBkntProdDescCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_BKNT_PROD_DESC_LEN = 3;
	/**
	 * 	serialize this Sf31IsoBkntProdDesc
	 */
   protected void serializeSf31IsoBkntProdDesc(char[] sf31IsoBkntProdDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoBkntProdDesc,0,getStringValue(),beginSf31IsoBkntProdDesc,SF_31_ISO_BKNT_PROD_DESC_LEN);
       localSf31IsoBkntProdDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoBkntProdDescConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSf31IsoBkntProdDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoBkntProdDesc() {	 
   		return (substring(getStringValue(),beginSf31IsoBkntProdDesc,beginSf31IsoBkntProdDesc + SF_31_ISO_BKNT_PROD_DESC_LEN));
   	}
     int localSf31IsoBkntRefNoCounter = -1;
     public boolean isSf31IsoBkntRefNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoBkntRefNoCounter != sharedCounter;
         localSf31IsoBkntRefNoCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_BKNT_REF_NO_LEN = 6;
	/**
	 * 	serialize this Sf31IsoBkntRefNo
	 */
   protected void serializeSf31IsoBkntRefNo(char[] sf31IsoBkntRefNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoBkntRefNo,0,getStringValue(),beginSf31IsoBkntRefNo,SF_31_ISO_BKNT_REF_NO_LEN);
       localSf31IsoBkntRefNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoBkntRefNoConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSf31IsoBkntRefNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoBkntRefNo() {	 
   		return (substring(getStringValue(),beginSf31IsoBkntRefNo,beginSf31IsoBkntRefNo + SF_31_ISO_BKNT_REF_NO_LEN));
   	}




}
  
