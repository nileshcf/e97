package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class MsdSpecialistAcctNoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdSpecialistAcctNoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdSpecialistAcctNoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_SPECIALIST_ACCT_NO_LENGTH = 9;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdSpecBranch;
            protected  int beginMsdSpecAcct;
            protected  int beginMsdSpecAcctType;
	
	/**
	* Constructor for MsdSpecialistAcctNoSerialized
	**/
    public MsdSpecialistAcctNoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdSpecialistAcctNoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdSpecialistAcctNoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdSpecialistAcctNoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1285); // serialize this field at offset 1285 by default 
    }
    
	/**
	* sets parent for this MsdSpecialistAcctNoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1285 by default
    }    
	/**
	* initializes the field in MsdSpecialistAcctNoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_SPECIALIST_ACCT_NO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdSpecBranch = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdSpecAcct = getStartOffset() + 3;	// set offset for serialization
  
             beginMsdSpecAcctType = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdSpecBranchCounter = -1;
     public boolean isMsdSpecBranchModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSpecBranchCounter != sharedCounter;
         localMsdSpecBranchCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SPEC_BRANCH_LEN = 3;
	/**
	 * 	serialize this MsdSpecBranch
	 */
   protected void serializeMsdSpecBranch(char[] msdSpecBranch) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSpecBranch,0,getStringValue(),beginMsdSpecBranch,MSD_SPEC_BRANCH_LEN);
       localMsdSpecBranchCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSpecBranchConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshMsdSpecBranch is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSpecBranch() {	 
   		return (substring(getStringValue(),beginMsdSpecBranch,beginMsdSpecBranch + MSD_SPEC_BRANCH_LEN));
   	}
     int localMsdSpecAcctCounter = -1;
     public boolean isMsdSpecAcctModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSpecAcctCounter != sharedCounter;
         localMsdSpecAcctCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SPEC_ACCT_LEN = 5;
	/**
	 * 	serialize this MsdSpecAcct
	 */
   protected void serializeMsdSpecAcct(char[] msdSpecAcct) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSpecAcct,0,getStringValue(),beginMsdSpecAcct,MSD_SPEC_ACCT_LEN);
       localMsdSpecAcctCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSpecAcctConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshMsdSpecAcct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSpecAcct() {	 
   		return (substring(getStringValue(),beginMsdSpecAcct,beginMsdSpecAcct + MSD_SPEC_ACCT_LEN));
   	}
     int localMsdSpecAcctTypeCounter = -1;
     public boolean isMsdSpecAcctTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSpecAcctTypeCounter != sharedCounter;
         localMsdSpecAcctTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SPEC_ACCT_TYPE_LEN = 1;
	/**
	 * 	serialize this MsdSpecAcctType
	 */
   protected void serializeMsdSpecAcctType(char[] msdSpecAcctType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSpecAcctType,0,getStringValue(),beginMsdSpecAcctType,MSD_SPEC_ACCT_TYPE_LEN);
       localMsdSpecAcctTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSpecAcctTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdSpecAcctType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSpecAcctType() {	 
   		return (substring(getStringValue(),beginMsdSpecAcctType,beginMsdSpecAcctType + MSD_SPEC_ACCT_TYPE_LEN));
   	}




}
  
