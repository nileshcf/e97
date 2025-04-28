package com.cloudframe.app.search0.dto.serialize;

/**
*  The class SummarySubldgEntriesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SummarySubldgEntriesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SummarySubldgEntriesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SUMMARY_SUBLDG_ENTRIES_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSummaryFinEvntNo;
            protected  int beginSummaryFinCat;
            protected  int beginSummaryFinMktId;
	
	/**
	* Constructor for SummarySubldgEntriesSerialized
	**/
    public SummarySubldgEntriesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SummarySubldgEntriesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SummarySubldgEntriesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SummarySubldgEntriesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this SummarySubldgEntriesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in SummarySubldgEntriesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SUMMARY_SUBLDG_ENTRIES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSummaryFinEvntNo = getStartOffset() + 0;	// set offset for serialization
  
             beginSummaryFinCat = getStartOffset() + 4;	// set offset for serialization
  
             beginSummaryFinMktId = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localSummaryFinEvntNoCounter = -1;
         public boolean isSummaryFinEvntNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSummaryFinEvntNoCounter != sharedCounter;
            localSummaryFinEvntNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int SUMMARY_FIN_EVNT_NO_LEN = 4;
  	/**
	 * serializeSummaryFinEvntNo
	 */
	protected void serializeSummaryFinEvntNo(int summaryFinEvntNo) {
           replaceValue( //  save the value as string
                   getBinaryString( summaryFinEvntNo,SUMMARY_FIN_EVNT_NO_LEN)
                  ,beginSummaryFinEvntNo
                  ,SUMMARY_FIN_EVNT_NO_LEN
                 );
            localSummaryFinEvntNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSummaryFinEvntNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSummaryFinEvntNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSummaryFinEvntNo() {	 
			return (getInt(beginSummaryFinEvntNo));
   	}
         int localSummaryFinCatCounter = -1;
         public boolean isSummaryFinCatModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSummaryFinCatCounter != sharedCounter;
            localSummaryFinCatCounter = sharedCounter; return hasModified; 
         }
   protected static final int SUMMARY_FIN_CAT_LEN = 4;
  	/**
	 * serializeSummaryFinCat
	 */
	protected void serializeSummaryFinCat(int summaryFinCat) {
           replaceValue( //  save the value as string
                   getBinaryString( summaryFinCat,SUMMARY_FIN_CAT_LEN)
                  ,beginSummaryFinCat
                  ,SUMMARY_FIN_CAT_LEN
                 );
            localSummaryFinCatCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSummaryFinCatMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSummaryFinCat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSummaryFinCat() {	 
			return (getInt(beginSummaryFinCat));
   	}
     int localSummaryFinMktIdCounter = -1;
     public boolean isSummaryFinMktIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSummaryFinMktIdCounter != sharedCounter;
         localSummaryFinMktIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SUMMARY_FIN_MKT_ID_LEN = 3;
	/**
	 * 	serialize this SummaryFinMktId
	 */
   protected void serializeSummaryFinMktId(char[] summaryFinMktId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(summaryFinMktId,0,getStringValue(),beginSummaryFinMktId,SUMMARY_FIN_MKT_ID_LEN);
       localSummaryFinMktIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSummaryFinMktIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSummaryFinMktId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSummaryFinMktId() {	 
   		return (substring(getStringValue(),beginSummaryFinMktId,beginSummaryFinMktId + SUMMARY_FIN_MKT_ID_LEN));
   	}




}
  
