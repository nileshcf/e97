package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01DivQualifyDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01DivQualifyDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01DivQualifyDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_DIV_QUALIFY_DATA_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdDividendQualify;
            protected  int beginMsdDividendQualifyOverride;
	
	/**
	* Constructor for Bdms01DivQualifyDataSerialized
	**/
    public Bdms01DivQualifyDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01DivQualifyDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01DivQualifyDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01DivQualifyDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3805); // serialize this field at offset 3805 by default 
    }
    
	/**
	* sets parent for this Bdms01DivQualifyDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3805 by default
    }    
	/**
	* initializes the field in Bdms01DivQualifyDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_DIV_QUALIFY_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdDividendQualify = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdDividendQualifyOverride = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdDividendQualifyCounter = -1;
     public boolean isMsdDividendQualifyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdDividendQualifyCounter != sharedCounter;
         localMsdDividendQualifyCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_DIVIDEND_QUALIFY_LEN = 1;
	/**
	 * 	serialize this MsdDividendQualify
	 */
   protected void serializeMsdDividendQualify(char[] msdDividendQualify) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdDividendQualify,0,getStringValue(),beginMsdDividendQualify,MSD_DIVIDEND_QUALIFY_LEN);
       localMsdDividendQualifyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdDividendQualifyConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdDividendQualify is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdDividendQualify() {	 
   		return (substring(getStringValue(),beginMsdDividendQualify,beginMsdDividendQualify + MSD_DIVIDEND_QUALIFY_LEN));
   	}
     int localMsdDividendQualifyOverrideCounter = -1;
     public boolean isMsdDividendQualifyOverrideModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdDividendQualifyOverrideCounter != sharedCounter;
         localMsdDividendQualifyOverrideCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_DIVIDEND_QUALIFY_OVERRIDE_LEN = 1;
	/**
	 * 	serialize this MsdDividendQualifyOverride
	 */
   protected void serializeMsdDividendQualifyOverride(char[] msdDividendQualifyOverride) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdDividendQualifyOverride,0,getStringValue(),beginMsdDividendQualifyOverride,MSD_DIVIDEND_QUALIFY_OVERRIDE_LEN);
       localMsdDividendQualifyOverrideCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdDividendQualifyOverrideConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdDividendQualifyOverride is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdDividendQualifyOverride() {	 
   		return (substring(getStringValue(),beginMsdDividendQualifyOverride,beginMsdDividendQualifyOverride + MSD_DIVIDEND_QUALIFY_OVERRIDE_LEN));
   	}




}
  
