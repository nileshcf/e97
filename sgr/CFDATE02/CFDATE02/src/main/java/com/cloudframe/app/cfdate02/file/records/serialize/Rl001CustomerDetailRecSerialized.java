package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class Rl001CustomerDetailRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Rl001CustomerDetailRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rl001CustomerDetailRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RL_001_CUSTOMER_DETAIL_REC_LENGTH = 681;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRl001VbmCustInd;
            protected  int beginRl001MachToMachInfoRedefined;
            protected  int beginRl001PricingLabInd;
            protected  int beginRl001FirstBillInd;
	
	/**
	* Constructor for Rl001CustomerDetailRecSerialized
	**/
    public Rl001CustomerDetailRecSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Rl001CustomerDetailRecSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rl001CustomerDetailRecSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Rl001CustomerDetailRecSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,19); // serialize this field at offset 19 by default 
    }
    
	/**
	* sets parent for this Rl001CustomerDetailRecSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 19 by default
    }    
	/**
	* initializes the field in Rl001CustomerDetailRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RL_001_CUSTOMER_DETAIL_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRl001VbmCustInd = getStartOffset() + 148;	// set offset for serialization
  
  
             beginRl001MachToMachInfoRedefined = getStartOffset() + 173;	// set offset for serialization
  
             beginRl001PricingLabInd = getStartOffset() + 231;	// set offset for serialization
  
             beginRl001FirstBillInd = getStartOffset() + 292;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRl001VbmCustIndCounter = -1;
     public boolean isRl001VbmCustIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRl001VbmCustIndCounter != sharedCounter;
         localRl001VbmCustIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RL_001_VBM_CUST_IND_LEN = 1;
	/**
	 * 	serialize this Rl001VbmCustInd
	 */
   protected void serializeRl001VbmCustInd(char[] rl001VbmCustInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rl001VbmCustInd,0,getStringValue(),beginRl001VbmCustInd,RL_001_VBM_CUST_IND_LEN);
       localRl001VbmCustIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRl001VbmCustIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRl001VbmCustInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRl001VbmCustInd() {	 
   		return (substring(getStringValue(),beginRl001VbmCustInd,beginRl001VbmCustInd + RL_001_VBM_CUST_IND_LEN));
   	}
     int localRl001MachToMachInfoRedefinedCounter = -1;
     public boolean isRl001MachToMachInfoRedefinedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRl001MachToMachInfoRedefinedCounter != sharedCounter;
         localRl001MachToMachInfoRedefinedCounter = sharedCounter; return hasModified;
     }
	protected static final int RL_001_MACH_TO_MACH_INFO_REDEFINED_LEN = 2;
	/**
	 * 	serialize this Rl001MachToMachInfoRedefined
	 */
   protected void serializeRl001MachToMachInfoRedefined(char[] rl001MachToMachInfoRedefined) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rl001MachToMachInfoRedefined,0,getStringValue(),beginRl001MachToMachInfoRedefined,RL_001_MACH_TO_MACH_INFO_REDEFINED_LEN);
       localRl001MachToMachInfoRedefinedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRl001MachToMachInfoRedefinedConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRl001MachToMachInfoRedefined is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRl001MachToMachInfoRedefined() {	 
   		return (substring(getStringValue(),beginRl001MachToMachInfoRedefined,beginRl001MachToMachInfoRedefined + RL_001_MACH_TO_MACH_INFO_REDEFINED_LEN));
   	}
     int localRl001PricingLabIndCounter = -1;
     public boolean isRl001PricingLabIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRl001PricingLabIndCounter != sharedCounter;
         localRl001PricingLabIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RL_001_PRICING_LAB_IND_LEN = 1;
	/**
	 * 	serialize this Rl001PricingLabInd
	 */
   protected void serializeRl001PricingLabInd(char[] rl001PricingLabInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rl001PricingLabInd,0,getStringValue(),beginRl001PricingLabInd,RL_001_PRICING_LAB_IND_LEN);
       localRl001PricingLabIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRl001PricingLabIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRl001PricingLabInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRl001PricingLabInd() {	 
   		return (substring(getStringValue(),beginRl001PricingLabInd,beginRl001PricingLabInd + RL_001_PRICING_LAB_IND_LEN));
   	}
     int localRl001FirstBillIndCounter = -1;
     public boolean isRl001FirstBillIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRl001FirstBillIndCounter != sharedCounter;
         localRl001FirstBillIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RL_001_FIRST_BILL_IND_LEN = 1;
	/**
	 * 	serialize this Rl001FirstBillInd
	 */
   protected void serializeRl001FirstBillInd(char[] rl001FirstBillInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rl001FirstBillInd,0,getStringValue(),beginRl001FirstBillInd,RL_001_FIRST_BILL_IND_LEN);
       localRl001FirstBillIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRl001FirstBillIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRl001FirstBillInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRl001FirstBillInd() {	 
   		return (substring(getStringValue(),beginRl001FirstBillInd,beginRl001FirstBillInd + RL_001_FIRST_BILL_IND_LEN));
   	}




}
  
