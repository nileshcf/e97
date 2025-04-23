package com.cloudframe.app.uhdynsql.dto.serialize;

/**
*  The class WqSqlFullClauseSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:58. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WqSqlFullClauseSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WqSqlFullClauseSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WQ_SQL_FULL_CLAUSE_LENGTH = 7002;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWqSqlFullClauseLen;
            protected  int beginWqSqlFullClauseText;
	
	/**
	* Constructor for WqSqlFullClauseSerialized
	**/
    public WqSqlFullClauseSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WqSqlFullClauseSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WQ_SQL_FULL_CLAUSE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWqSqlFullClauseLen = getStartOffset() + 0;	// set offset for serialization
  
             beginWqSqlFullClauseText = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localWqSqlFullClauseLenCounter = -1;
         public boolean isWqSqlFullClauseLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWqSqlFullClauseLenCounter != sharedCounter;
            localWqSqlFullClauseLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int WQ_SQL_FULL_CLAUSE_LEN_LEN = 2;
  	/**
	 * serializeWqSqlFullClauseLen
	 */
	protected void serializeWqSqlFullClauseLen(short wqSqlFullClauseLen) {
           replaceValue( //  save the value as string
                   getBinaryString( wqSqlFullClauseLen,WQ_SQL_FULL_CLAUSE_LEN_LEN)
                  ,beginWqSqlFullClauseLen
                  ,WQ_SQL_FULL_CLAUSE_LEN_LEN
                 );
            localWqSqlFullClauseLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkWqSqlFullClauseLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWqSqlFullClauseLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshWqSqlFullClauseLen() {	 
			return (getShort(beginWqSqlFullClauseLen));
   	}
     int localWqSqlFullClauseTextCounter = -1;
     public boolean isWqSqlFullClauseTextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWqSqlFullClauseTextCounter != sharedCounter;
         localWqSqlFullClauseTextCounter = sharedCounter; return hasModified;
     }
	protected static final int WQ_SQL_FULL_CLAUSE_TEXT_LEN = 7000;
	/**
	 * 	serialize this WqSqlFullClauseText
	 */
   protected void serializeWqSqlFullClauseText(char[] wqSqlFullClauseText) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wqSqlFullClauseText,0,getStringValue(),beginWqSqlFullClauseText,WQ_SQL_FULL_CLAUSE_TEXT_LEN);
       localWqSqlFullClauseTextCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWqSqlFullClauseTextConstraints(char[] value) {
   			return super.checkConstraints(value , 7000 ,false, false);
   }
    /**
	 *	refreshWqSqlFullClauseText is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWqSqlFullClauseText() {	 
   		return (substring(getStringValue(),beginWqSqlFullClauseText,beginWqSqlFullClauseText + WQ_SQL_FULL_CLAUSE_TEXT_LEN));
   	}




}
  
