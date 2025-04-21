package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class CurcyTable2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CurcyTable2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CurcyTable2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CURCY_TABLE_2_LENGTH = 33;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTb2CurId;
            protected  int beginTb2CurDesc;
	
	/**
	* Constructor for CurcyTable2Serialized
	**/
    public CurcyTable2Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CurcyTable2Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurcyTable2Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CurcyTable2Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this CurcyTable2Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in CurcyTable2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CURCY_TABLE_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTb2CurId = getStartOffset() + 0;	// set offset for serialization
  
             beginTb2CurDesc = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTb2CurIdCounter = -1;
     public boolean isTb2CurIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb2CurIdCounter != sharedCounter;
         localTb2CurIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_2_CUR_ID_LEN = 3;
	/**
	 * 	serialize this Tb2CurId
	 */
   protected void serializeTb2CurId(char[] tb2CurId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb2CurId,0,getStringValue(),beginTb2CurId,TB_2_CUR_ID_LEN);
       localTb2CurIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb2CurIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshTb2CurId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb2CurId() {	 
   		return (substring(getStringValue(),beginTb2CurId,beginTb2CurId + TB_2_CUR_ID_LEN));
   	}
     int localTb2CurDescCounter = -1;
     public boolean isTb2CurDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb2CurDescCounter != sharedCounter;
         localTb2CurDescCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_2_CUR_DESC_LEN = 30;
	/**
	 * 	serialize this Tb2CurDesc
	 */
   protected void serializeTb2CurDesc(char[] tb2CurDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb2CurDesc,0,getStringValue(),beginTb2CurDesc,TB_2_CUR_DESC_LEN);
       localTb2CurDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb2CurDescConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshTb2CurDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb2CurDesc() {	 
   		return (substring(getStringValue(),beginTb2CurDesc,beginTb2CurDesc + TB_2_CUR_DESC_LEN));
   	}




}
  
