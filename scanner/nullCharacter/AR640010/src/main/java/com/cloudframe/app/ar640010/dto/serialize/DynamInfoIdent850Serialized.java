package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class DynamInfoIdent850Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DynamInfoIdent850Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DynamInfoIdent850Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DYNAM_INFO_IDENT_850_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDynamInfoJclDd850;
	
	/**
	* Constructor for DynamInfoIdent850Serialized
	**/
    public DynamInfoIdent850Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DynamInfoIdent850Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DynamInfoIdent850Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DynamInfoIdent850Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,236); // serialize this field at offset 236 by default 
    }
    
	/**
	* sets parent for this DynamInfoIdent850Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 236 by default
    }    
	/**
	* initializes the field in DynamInfoIdent850Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DYNAM_INFO_IDENT_850_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginDynamInfoJclDd850 = getStartOffset() + 3;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDynamInfoJclDd850Counter = -1;
     public boolean isDynamInfoJclDd850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamInfoJclDd850Counter != sharedCounter;
         localDynamInfoJclDd850Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_INFO_JCL_DD_850_LEN = 8;
	/**
	 * 	serialize this DynamInfoJclDd850
	 */
   protected void serializeDynamInfoJclDd850(char[] dynamInfoJclDd850) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamInfoJclDd850,0,getStringValue(),beginDynamInfoJclDd850,DYNAM_INFO_JCL_DD_850_LEN);
       localDynamInfoJclDd850Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamInfoJclDd850Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDynamInfoJclDd850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamInfoJclDd850() {	 
   		return (substring(getStringValue(),beginDynamInfoJclDd850,beginDynamInfoJclDd850 + DYNAM_INFO_JCL_DD_850_LEN));
   	}




}
  
