package com.cloudframe.app.init1.dto.serialize;

/**
*  The class Rlu5fVzedgePaymtSchedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Rlu5fVzedgePaymtSchedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rlu5fVzedgePaymtSchedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLU_5F_VZEDGE_PAYMT_SCHED_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlu5fVzedgePymtDueDt;
	
	/**
	* Constructor for Rlu5fVzedgePaymtSchedSerialized
	**/
    public Rlu5fVzedgePaymtSchedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Rlu5fVzedgePaymtSchedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fVzedgePaymtSchedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Rlu5fVzedgePaymtSchedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,458); // serialize this field at offset 458 by default 
    }
    
	/**
	* sets parent for this Rlu5fVzedgePaymtSchedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 458 by default
    }    
	/**
	* initializes the field in Rlu5fVzedgePaymtSchedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLU_5F_VZEDGE_PAYMT_SCHED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlu5fVzedgePymtDueDt = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlu5fVzedgePymtDueDtCounter = -1;
     public boolean isRlu5fVzedgePymtDueDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fVzedgePymtDueDtCounter != sharedCounter;
         localRlu5fVzedgePymtDueDtCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_VZEDGE_PYMT_DUE_DT_LEN = 8;
	/**
	 * 	serialize this Rlu5fVzedgePymtDueDt
	 */
   protected void serializeRlu5fVzedgePymtDueDt(char[] rlu5fVzedgePymtDueDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fVzedgePymtDueDt,0,getStringValue(),beginRlu5fVzedgePymtDueDt,RLU_5F_VZEDGE_PYMT_DUE_DT_LEN);
       localRlu5fVzedgePymtDueDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fVzedgePymtDueDtConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshRlu5fVzedgePymtDueDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fVzedgePymtDueDt() {	 
   		return (substring(getStringValue(),beginRlu5fVzedgePymtDueDt,beginRlu5fVzedgePymtDueDt + RLU_5F_VZEDGE_PYMT_DUE_DT_LEN));
   	}




}
  
