package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360InterType2SrtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class X360InterType2SrtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360InterType2SrtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_INTER_TYPE_2_SRT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360SscServIdSrt2;
            protected  int beginX360IsisAgreeNumSrt2;
	
	/**
	* Constructor for X360InterType2SrtSerialized
	**/
    public X360InterType2SrtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360InterType2SrtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360InterType2SrtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360InterType2SrtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,179); // serialize this field at offset 179 by default 
    }
    
	/**
	* sets parent for this X360InterType2SrtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 179 by default
    }    
	/**
	* initializes the field in X360InterType2SrtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_INTER_TYPE_2_SRT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360SscServIdSrt2 = getStartOffset() + 0;	// set offset for serialization
  
             beginX360IsisAgreeNumSrt2 = getStartOffset() + 3;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localX360SscServIdSrt2Counter = -1;
     public boolean isX360SscServIdSrt2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360SscServIdSrt2Counter != sharedCounter;
         localX360SscServIdSrt2Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_SSC_SERV_ID_SRT_2_LEN = 3;
	/**
	 * 	serialize this X360SscServIdSrt2
	 */
   protected void serializeX360SscServIdSrt2(char[] x360SscServIdSrt2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360SscServIdSrt2,0,getStringValue(),beginX360SscServIdSrt2,X_360_SSC_SERV_ID_SRT_2_LEN);
       localX360SscServIdSrt2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360SscServIdSrt2Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360SscServIdSrt2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360SscServIdSrt2() {	 
   		return (substring(getStringValue(),beginX360SscServIdSrt2,beginX360SscServIdSrt2 + X_360_SSC_SERV_ID_SRT_2_LEN));
   	}
     int localX360IsisAgreeNumSrt2Counter = -1;
     public boolean isX360IsisAgreeNumSrt2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360IsisAgreeNumSrt2Counter != sharedCounter;
         localX360IsisAgreeNumSrt2Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_ISIS_AGREE_NUM_SRT_2_LEN = 4;
	/**
	 * 	serialize this X360IsisAgreeNumSrt2
	 */
   protected void serializeX360IsisAgreeNumSrt2(char[] x360IsisAgreeNumSrt2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360IsisAgreeNumSrt2,0,getStringValue(),beginX360IsisAgreeNumSrt2,X_360_ISIS_AGREE_NUM_SRT_2_LEN);
       localX360IsisAgreeNumSrt2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360IsisAgreeNumSrt2Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshX360IsisAgreeNumSrt2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360IsisAgreeNumSrt2() {	 
   		return (substring(getStringValue(),beginX360IsisAgreeNumSrt2,beginX360IsisAgreeNumSrt2 + X_360_ISIS_AGREE_NUM_SRT_2_LEN));
   	}




}
  
