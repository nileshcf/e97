package com.cloudframe.app.ip224620.dto.serialize;

/**
*  The class Pds501S1s2s3Table500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Pds501S1s2s3Table500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Pds501S1s2s3Table500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PDS_501_S_1S_2S_3_TABLE_500_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSubfld1Value500;
            protected  int beginSubfld2Value500;
            protected  int beginSubfld3Value500;
	
	/**
	* Constructor for Pds501S1s2s3Table500Serialized
	**/
    public Pds501S1s2s3Table500Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Pds501S1s2s3Table500Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pds501S1s2s3Table500Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Pds501S1s2s3Table500Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this Pds501S1s2s3Table500Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in Pds501S1s2s3Table500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PDS_501_S_1S_2S_3_TABLE_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSubfld1Value500 = getStartOffset() + 0;	// set offset for serialization
  
             beginSubfld2Value500 = getStartOffset() + 2;	// set offset for serialization
  
             beginSubfld3Value500 = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSubfld1Value500Counter = -1;
     public boolean isSubfld1Value500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSubfld1Value500Counter != sharedCounter;
         localSubfld1Value500Counter = sharedCounter; return hasModified;
     }
	protected static final int SUBFLD_1_VALUE_500_LEN = 2;
	/**
	 * 	serialize this Subfld1Value500
	 */
   protected void serializeSubfld1Value500(char[] subfld1Value500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(subfld1Value500,0,getStringValue(),beginSubfld1Value500,SUBFLD_1_VALUE_500_LEN);
       localSubfld1Value500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSubfld1Value500Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSubfld1Value500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSubfld1Value500() {	 
   		return (substring(getStringValue(),beginSubfld1Value500,beginSubfld1Value500 + SUBFLD_1_VALUE_500_LEN));
   	}
     int localSubfld2Value500Counter = -1;
     public boolean isSubfld2Value500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSubfld2Value500Counter != sharedCounter;
         localSubfld2Value500Counter = sharedCounter; return hasModified;
     }
	protected static final int SUBFLD_2_VALUE_500_LEN = 3;
	/**
	 * 	serialize this Subfld2Value500
	 */
   protected void serializeSubfld2Value500(char[] subfld2Value500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(subfld2Value500,0,getStringValue(),beginSubfld2Value500,SUBFLD_2_VALUE_500_LEN);
       localSubfld2Value500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSubfld2Value500Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSubfld2Value500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSubfld2Value500() {	 
   		return (substring(getStringValue(),beginSubfld2Value500,beginSubfld2Value500 + SUBFLD_2_VALUE_500_LEN));
   	}
     int localSubfld3Value500Counter = -1;
     public boolean isSubfld3Value500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSubfld3Value500Counter != sharedCounter;
         localSubfld3Value500Counter = sharedCounter; return hasModified;
     }
	protected static final int SUBFLD_3_VALUE_500_LEN = 3;
	/**
	 * 	serialize this Subfld3Value500
	 */
   protected void serializeSubfld3Value500(char[] subfld3Value500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(subfld3Value500,0,getStringValue(),beginSubfld3Value500,SUBFLD_3_VALUE_500_LEN);
       localSubfld3Value500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSubfld3Value500Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSubfld3Value500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSubfld3Value500() {	 
   		return (substring(getStringValue(),beginSubfld3Value500,beginSubfld3Value500 + SUBFLD_3_VALUE_500_LEN));
   	}




}
  
