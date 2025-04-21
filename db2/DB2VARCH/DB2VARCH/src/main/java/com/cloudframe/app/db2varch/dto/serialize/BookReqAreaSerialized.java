package com.cloudframe.app.db2varch.dto.serialize;

/**
*  The class BookReqAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BookReqAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BookReqAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BOOK_REQ_AREA_LENGTH = 534;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBreqBookId;
            protected  int beginBreqIsbn;
            protected  int beginBreqPublisherId;
            protected  int beginBreqRating;
            protected  int beginBreqTotalPages;
	
	/**
	* Constructor for BookReqAreaSerialized
	**/
    public BookReqAreaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BookReqAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BOOK_REQ_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBreqBookId = getStartOffset() + 0;	// set offset for serialization
  
             beginBreqIsbn = getStartOffset() + 4;	// set offset for serialization
  
  
             beginBreqPublisherId = getStartOffset() + 265;	// set offset for serialization
  
             beginBreqRating = getStartOffset() + 269;	// set offset for serialization
  
  
             beginBreqTotalPages = getStartOffset() + 530;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localBreqBookIdCounter = -1;
         public boolean isBreqBookIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBreqBookIdCounter != sharedCounter;
            localBreqBookIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int BREQ_BOOK_ID_LEN = 4;
  	/**
	 * serializeBreqBookId
	 */
	protected void serializeBreqBookId(int breqBookId) {
           replaceValue( //  save the value as string
                   getBinaryString( breqBookId,BREQ_BOOK_ID_LEN)
                  ,beginBreqBookId
                  ,BREQ_BOOK_ID_LEN
                 );
            localBreqBookIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBreqBookIdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBreqBookId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBreqBookId() {	 
			return (getInt(beginBreqBookId));
   	}
         int localBreqIsbnCounter = -1;
         public boolean isBreqIsbnModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBreqIsbnCounter != sharedCounter;
            localBreqIsbnCounter = sharedCounter; return hasModified; 
         }
   protected static final int BREQ_ISBN_LEN = 4;
  	/**
	 * serializeBreqIsbn
	 */
	protected void serializeBreqIsbn(int breqIsbn) {
           replaceValue( //  save the value as string
                   getBinaryString( breqIsbn,BREQ_ISBN_LEN)
                  ,beginBreqIsbn
                  ,BREQ_ISBN_LEN
                 );
            localBreqIsbnCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBreqIsbnMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBreqIsbn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBreqIsbn() {	 
			return (getInt(beginBreqIsbn));
   	}
         int localBreqPublisherIdCounter = -1;
         public boolean isBreqPublisherIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBreqPublisherIdCounter != sharedCounter;
            localBreqPublisherIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int BREQ_PUBLISHER_ID_LEN = 4;
  	/**
	 * serializeBreqPublisherId
	 */
	protected void serializeBreqPublisherId(int breqPublisherId) {
           replaceValue( //  save the value as string
                   getBinaryString( breqPublisherId,BREQ_PUBLISHER_ID_LEN)
                  ,beginBreqPublisherId
                  ,BREQ_PUBLISHER_ID_LEN
                 );
            localBreqPublisherIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBreqPublisherIdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBreqPublisherId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBreqPublisherId() {	 
			return (getInt(beginBreqPublisherId));
   	}
         int localBreqRatingCounter = -1;
         public boolean isBreqRatingModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBreqRatingCounter != sharedCounter;
            localBreqRatingCounter = sharedCounter; return hasModified; 
         }
   protected static final int BREQ_RATING_LEN = 4;
  	/**
	 * serializeBreqRating
	 */
	protected void serializeBreqRating(int breqRating) {
           replaceValue( //  save the value as string
                   getBinaryString( breqRating,BREQ_RATING_LEN)
                  ,beginBreqRating
                  ,BREQ_RATING_LEN
                 );
            localBreqRatingCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBreqRatingMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBreqRating is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBreqRating() {	 
			return (getInt(beginBreqRating));
   	}
         int localBreqTotalPagesCounter = -1;
         public boolean isBreqTotalPagesModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBreqTotalPagesCounter != sharedCounter;
            localBreqTotalPagesCounter = sharedCounter; return hasModified; 
         }
   protected static final int BREQ_TOTAL_PAGES_LEN = 4;
  	/**
	 * serializeBreqTotalPages
	 */
	protected void serializeBreqTotalPages(int breqTotalPages) {
           replaceValue( //  save the value as string
                   getBinaryString( breqTotalPages,BREQ_TOTAL_PAGES_LEN)
                  ,beginBreqTotalPages
                  ,BREQ_TOTAL_PAGES_LEN
                 );
            localBreqTotalPagesCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBreqTotalPagesMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBreqTotalPages is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBreqTotalPages() {	 
			return (getInt(beginBreqTotalPages));
   	}




}
  
