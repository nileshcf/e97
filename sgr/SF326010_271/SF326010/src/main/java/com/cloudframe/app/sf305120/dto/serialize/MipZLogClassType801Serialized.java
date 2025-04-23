package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class MipZLogClassType801Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MipZLogClassType801Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MipZLogClassType801Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MIP_ZLOG_CLASS_TYPE_801_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMipZLogClass801;
            protected  int beginMipZLogTyp801;
	
	/**
	* Constructor for MipZLogClassType801Serialized
	**/
    public MipZLogClassType801Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MipZLogClassType801Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MipZLogClassType801Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MipZLogClassType801Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,15); // serialize this field at offset 15 by default 
    }
    
	/**
	* sets parent for this MipZLogClassType801Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 15 by default
    }    
	/**
	* initializes the field in MipZLogClassType801Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MIP_ZLOG_CLASS_TYPE_801_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMipZLogClass801 = getStartOffset() + 0;	// set offset for serialization
  
             beginMipZLogTyp801 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMipZLogClass801Counter = -1;
     public boolean isMipZLogClass801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMipZLogClass801Counter != sharedCounter;
         localMipZLogClass801Counter = sharedCounter; return hasModified;
     }
	protected static final int MIP_ZLOG_CLASS_801_LEN = 1;
	/**
	 * 	serialize this MipZLogClass801
	 */
   protected void serializeMipZLogClass801(char[] mipZLogClass801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mipZLogClass801,0,getStringValue(),beginMipZLogClass801,MIP_ZLOG_CLASS_801_LEN);
       localMipZLogClass801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMipZLogClass801Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMipZLogClass801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMipZLogClass801() {	 
   		return (substring(getStringValue(),beginMipZLogClass801,beginMipZLogClass801 + MIP_ZLOG_CLASS_801_LEN));
   	}
     int localMipZLogTyp801Counter = -1;
     public boolean isMipZLogTyp801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMipZLogTyp801Counter != sharedCounter;
         localMipZLogTyp801Counter = sharedCounter; return hasModified;
     }
	protected static final int MIP_ZLOG_TYP_801_LEN = 1;
	/**
	 * 	serialize this MipZLogTyp801
	 */
   protected void serializeMipZLogTyp801(char[] mipZLogTyp801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mipZLogTyp801,0,getStringValue(),beginMipZLogTyp801,MIP_ZLOG_TYP_801_LEN);
       localMipZLogTyp801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMipZLogTyp801Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMipZLogTyp801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMipZLogTyp801() {	 
   		return (substring(getStringValue(),beginMipZLogTyp801,beginMipZLogTyp801 + MIP_ZLOG_TYP_801_LEN));
   	}




}
  
