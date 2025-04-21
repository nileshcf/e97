package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class RldusInEocTgpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RldusInEocTgpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RldusInEocTgpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLDUS_IN_EOC_TGP_LENGTH = 162;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRldusTgpRec;
	
	/**
	* Constructor for RldusInEocTgpSerialized
	**/
    public RldusInEocTgpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RldusInEocTgpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RldusInEocTgpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RldusInEocTgpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RldusInEocTgpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RldusInEocTgpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLDUS_IN_EOC_TGP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRldusTgpRec = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRldusTgpRecCounter = -1;
     public boolean isRldusTgpRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRldusTgpRecCounter != sharedCounter;
         localRldusTgpRecCounter = sharedCounter; return hasModified;
     }
	protected static final int RLDUS_TGP_REC_LEN = 161;
	/**
	 * 	serialize this RldusTgpRec
	 */
   protected void serializeRldusTgpRec(char[] rldusTgpRec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rldusTgpRec,0,getStringValue(),beginRldusTgpRec,RLDUS_TGP_REC_LEN);
       localRldusTgpRecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRldusTgpRecConstraints(char[] value) {
   			return super.checkConstraints(value , 161 ,false, false);
   }
    /**
	 *	refreshRldusTgpRec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRldusTgpRec() {	 
   		return (substring(getStringValue(),beginRldusTgpRec,beginRldusTgpRec + RLDUS_TGP_REC_LEN));
   	}




}
  
