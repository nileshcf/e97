package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class CyclNum1000RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CyclNum1000RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CyclNum1000RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CYCL_NUM_1000_REDEFINED_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected int beginRequestParms1000ConditionGroup2;
            protected  int beginCyclNumFtssSeq1000;
	
	/**
	* Constructor for CyclNum1000RedefinedSerialized
	**/
    public CyclNum1000RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CyclNum1000RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CyclNum1000RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CyclNum1000RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,13); // serialize this field at offset 13 by default 
    }
    
	/**
	* sets parent for this CyclNum1000RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 13 by default
    }    
	/**
	* initializes the field in CyclNum1000RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CYCL_NUM_1000_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
                beginRequestParms1000ConditionGroup2 = getStartOffset() + 0;	// filler with 88
  
             beginCyclNumFtssSeq1000 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRequestParms1000ConditionGroup2Counter = -1;
     public boolean isRequestParms1000ConditionGroup2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRequestParms1000ConditionGroup2Counter != sharedCounter;
         localRequestParms1000ConditionGroup2Counter = sharedCounter; return hasModified;
     }
	protected static final int REQUEST_PARMS_1000_CONDITION_GROUP_2_LEN = 1;
	/**
	 * 	serialize this RequestParms1000ConditionGroup2
	 */
   protected void serializeRequestParms1000ConditionGroup2(char[] requestParms1000ConditionGroup2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(requestParms1000ConditionGroup2,0,getStringValue(),beginRequestParms1000ConditionGroup2,REQUEST_PARMS_1000_CONDITION_GROUP_2_LEN);
       localRequestParms1000ConditionGroup2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRequestParms1000ConditionGroup2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRequestParms1000ConditionGroup2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRequestParms1000ConditionGroup2() {	 
   		return (substring(getStringValue(),beginRequestParms1000ConditionGroup2,beginRequestParms1000ConditionGroup2 + REQUEST_PARMS_1000_CONDITION_GROUP_2_LEN));
   	}
     int localCyclNumFtssSeq1000Counter = -1;
     public boolean isCyclNumFtssSeq1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCyclNumFtssSeq1000Counter != sharedCounter;
         localCyclNumFtssSeq1000Counter = sharedCounter; return hasModified;
     }
	protected static final int CYCL_NUM_FTSS_SEQ_1000_LEN = 2;
	/**
	 * 	serialize this CyclNumFtssSeq1000
	 */
   protected void serializeCyclNumFtssSeq1000(char[] cyclNumFtssSeq1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cyclNumFtssSeq1000,0,getStringValue(),beginCyclNumFtssSeq1000,CYCL_NUM_FTSS_SEQ_1000_LEN);
       localCyclNumFtssSeq1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCyclNumFtssSeq1000Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCyclNumFtssSeq1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCyclNumFtssSeq1000() {	 
   		return (substring(getStringValue(),beginCyclNumFtssSeq1000,beginCyclNumFtssSeq1000 + CYCL_NUM_FTSS_SEQ_1000_LEN));
   	}




}
  
