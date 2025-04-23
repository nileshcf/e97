package com.cloudframe.app.dlcrntof.dto.serialize;

/**
*  The class IsinTableData01Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IsinTableData01Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IsinTableData01Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ISIN_TABLE_DATA_01_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIsinDeleted;
	
	/**
	* Constructor for IsinTableData01Serialized
	**/
    public IsinTableData01Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IsinTableData01Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IsinTableData01Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IsinTableData01Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this IsinTableData01Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in IsinTableData01Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ISIN_TABLE_DATA_01_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIsinDeleted = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIsinDeletedCounter = -1;
     public boolean isIsinDeletedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsinDeletedCounter != sharedCounter;
         localIsinDeletedCounter = sharedCounter; return hasModified;
     }
	protected static final int ISIN_DELETED_LEN = 12;
	/**
	 * 	serialize this IsinDeleted
	 */
   protected void serializeIsinDeleted(char[] isinDeleted) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(isinDeleted,0,getStringValue(),beginIsinDeleted,ISIN_DELETED_LEN);
       localIsinDeletedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIsinDeletedConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshIsinDeleted is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIsinDeleted() {	 
   		return (substring(getStringValue(),beginIsinDeleted,beginIsinDeleted + ISIN_DELETED_LEN));
   	}




}
  
