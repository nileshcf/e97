package com.cloudframe.app.ip809050.dto.serialize;

/**
*  The class Pds05800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Pds05800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Pds05800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PDS_05800_LENGTH = 14;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPds005S3ErrCde800;
	
	/**
	* Constructor for Pds05800Serialized
	**/
    public Pds05800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Pds05800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pds05800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Pds05800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Pds05800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Pds05800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PDS_05800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPds005S3ErrCde800 = getStartOffset() + 7;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPds005S3ErrCde800Counter = -1;
     public boolean isPds005S3ErrCde800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPds005S3ErrCde800Counter != sharedCounter;
         localPds005S3ErrCde800Counter = sharedCounter; return hasModified;
     }
	protected static final int PDS_005_S_3_ERR_CDE_800_LEN = 4;
	/**
	 * 	serialize this Pds005S3ErrCde800
	 */
   protected void serializePds005S3ErrCde800(char[] pds005S3ErrCde800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pds005S3ErrCde800,0,getStringValue(),beginPds005S3ErrCde800,PDS_005_S_3_ERR_CDE_800_LEN);
       localPds005S3ErrCde800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPds005S3ErrCde800Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshPds005S3ErrCde800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPds005S3ErrCde800() {	 
   		return (substring(getStringValue(),beginPds005S3ErrCde800,beginPds005S3ErrCde800 + PDS_005_S_3_ERR_CDE_800_LEN));
   	}




}
  
