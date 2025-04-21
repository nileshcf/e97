package com.cloudframe.app.db2varch.dto.serialize;

/**
*  The class DclbookSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DclbookSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DclbookSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLBOOK_LENGTH = 534;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBookId;
            protected  int beginIsbn;
            protected  int beginPublisherId;
            protected  int beginRating;
            protected  int beginTotalPages;
	
	/**
	* Constructor for DclbookSerialized
	**/
    public DclbookSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DclbookSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLBOOK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBookId = getStartOffset() + 0;	// set offset for serialization
  
             beginIsbn = getStartOffset() + 4;	// set offset for serialization
  
  
             beginPublisherId = getStartOffset() + 265;	// set offset for serialization
  
             beginRating = getStartOffset() + 269;	// set offset for serialization
  
  
             beginTotalPages = getStartOffset() + 530;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localBookIdCounter = -1;
         public boolean isBookIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBookIdCounter != sharedCounter;
            localBookIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int BOOK_ID_LEN = 4;
  	/**
	 * serializeBookId
	 */
	protected void serializeBookId(int bookId) {
           replaceValue( //  save the value as string
                   getBinaryString( bookId,BOOK_ID_LEN)
                  ,beginBookId
                  ,BOOK_ID_LEN
                 );
            localBookIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBookIdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBookId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBookId() {	 
			return (getInt(beginBookId));
   	}
         int localIsbnCounter = -1;
         public boolean isIsbnModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIsbnCounter != sharedCounter;
            localIsbnCounter = sharedCounter; return hasModified; 
         }
   protected static final int ISBN_LEN = 4;
  	/**
	 * serializeIsbn
	 */
	protected void serializeIsbn(int isbn) {
           replaceValue( //  save the value as string
                   getBinaryString( isbn,ISBN_LEN)
                  ,beginIsbn
                  ,ISBN_LEN
                 );
            localIsbnCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIsbnMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIsbn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIsbn() {	 
			return (getInt(beginIsbn));
   	}
         int localPublisherIdCounter = -1;
         public boolean isPublisherIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPublisherIdCounter != sharedCounter;
            localPublisherIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int PUBLISHER_ID_LEN = 4;
  	/**
	 * serializePublisherId
	 */
	protected void serializePublisherId(int publisherId) {
           replaceValue( //  save the value as string
                   getBinaryString( publisherId,PUBLISHER_ID_LEN)
                  ,beginPublisherId
                  ,PUBLISHER_ID_LEN
                 );
            localPublisherIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkPublisherIdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshPublisherId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPublisherId() {	 
			return (getInt(beginPublisherId));
   	}
         int localRatingCounter = -1;
         public boolean isRatingModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRatingCounter != sharedCounter;
            localRatingCounter = sharedCounter; return hasModified; 
         }
   protected static final int RATING_LEN = 4;
  	/**
	 * serializeRating
	 */
	protected void serializeRating(int rating) {
           replaceValue( //  save the value as string
                   getBinaryString( rating,RATING_LEN)
                  ,beginRating
                  ,RATING_LEN
                 );
            localRatingCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkRatingMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshRating is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRating() {	 
			return (getInt(beginRating));
   	}
         int localTotalPagesCounter = -1;
         public boolean isTotalPagesModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTotalPagesCounter != sharedCounter;
            localTotalPagesCounter = sharedCounter; return hasModified; 
         }
   protected static final int TOTAL_PAGES_LEN = 4;
  	/**
	 * serializeTotalPages
	 */
	protected void serializeTotalPages(int totalPages) {
           replaceValue( //  save the value as string
                   getBinaryString( totalPages,TOTAL_PAGES_LEN)
                  ,beginTotalPages
                  ,TOTAL_PAGES_LEN
                 );
            localTotalPagesCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkTotalPagesMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshTotalPages is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTotalPages() {	 
			return (getInt(beginTotalPages));
   	}




}
  
