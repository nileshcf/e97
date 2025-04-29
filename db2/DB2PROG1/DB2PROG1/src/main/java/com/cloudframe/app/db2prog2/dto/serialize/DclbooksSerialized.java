package com.cloudframe.app.db2prog2.dto.serialize;

/**
*  The class DclbooksSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DclbooksSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DclbooksSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLBOOKS_LENGTH = 297;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBooksBookId;
	
	/**
	* Constructor for DclbooksSerialized
	**/
    public DclbooksSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DclbooksSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLBOOKS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBooksBookId = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localBooksBookIdCounter = -1;
         public boolean isBooksBookIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBooksBookIdCounter != sharedCounter;
            localBooksBookIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int BOOKS_BOOK_ID_LEN = 4;
  	/**
	 * serializeBooksBookId
	 */
	protected void serializeBooksBookId(int booksBookId) {
           replaceValue( //  save the value as string
                   getBinaryString( booksBookId,BOOKS_BOOK_ID_LEN)
                  ,beginBooksBookId
                  ,BOOKS_BOOK_ID_LEN
                 );
            localBooksBookIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBooksBookIdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBooksBookId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBooksBookId() {	 
			return (getInt(beginBooksBookId));
   	}




}
  
