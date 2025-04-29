package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01RatingSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01RatingSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01RatingSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_RATING_SEG_DATA_LENGTH = 47;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01RatingSegSqlcd;
            protected  int beginMsdSPRanking;
            protected  int beginMsdSPRatings;
            protected  int beginMsdMoodyRating;
            protected  int beginBdms01SPRatingCd;
            protected  int beginBdms01MoodyRatingCd;
	
	/**
	* Constructor for Bdms01RatingSegDataSerialized
	**/
    public Bdms01RatingSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01RatingSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01RatingSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01RatingSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1940); // serialize this field at offset 1940 by default 
    }
    
	/**
	* sets parent for this Bdms01RatingSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1940 by default
    }    
	/**
	* initializes the field in Bdms01RatingSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_RATING_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01RatingSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdSPRanking = getStartOffset() + 4;	// set offset for serialization
  
             beginMsdSPRatings = getStartOffset() + 5;	// set offset for serialization
  
             beginMsdMoodyRating = getStartOffset() + 6;	// set offset for serialization
  
             beginBdms01SPRatingCd = getStartOffset() + 7;	// set offset for serialization
  
             beginBdms01MoodyRatingCd = getStartOffset() + 12;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01RatingSegSqlcdCounter = -1;
     public boolean isBdms01RatingSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RatingSegSqlcdCounter != sharedCounter;
         localBdms01RatingSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01RatingSegSqlcd
	 *	@return bdms01RatingSegSqlcd
	 */
	public char[]  getBdms01RatingSegSqlcdString() {
	     return getCharArray(beginBdms01RatingSegSqlcd,BDMS_01_RATING_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01RatingSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01RatingSegSqlcd
	                    ,beginBdms01RatingSegSqlcd + BDMS_01_RATING_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_RATING_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01RatingSegSqlcd
	 */
	protected void serializeBdms01RatingSegSqlcd(int bdms01RatingSegSqlcd) {
		 putNumber(beginBdms01RatingSegSqlcd,bdms01RatingSegSqlcd,BDMS_01_RATING_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01RatingSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01RatingSegSqlcd
	 */
   	protected  int serializeBdms01RatingSegSqlcd(char[] value) {
	    int  bdms01RatingSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01RatingSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01RatingSegSqlcd
		       ,4
		      );
		 localBdms01RatingSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01RatingSegSqlcd;
    }

   protected int checkBdms01RatingSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01RatingSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01RatingSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01RatingSegSqlcd
			                 ,BDMS_01_RATING_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01RatingSegSqlcd", beginBdms01RatingSegSqlcd,BDMS_01_RATING_SEG_SQLCD_LEN);
    }
   	}
     int localMsdSPRankingCounter = -1;
     public boolean isMsdSPRankingModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSPRankingCounter != sharedCounter;
         localMsdSPRankingCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SPRANKING_LEN = 1;
	/**
	 * 	serialize this MsdSPRanking
	 */
   protected void serializeMsdSPRanking(char[] msdSPRanking) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSPRanking,0,getStringValue(),beginMsdSPRanking,MSD_SPRANKING_LEN);
       localMsdSPRankingCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSPRankingConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdSPRanking is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSPRanking() {	 
   		return (substring(getStringValue(),beginMsdSPRanking,beginMsdSPRanking + MSD_SPRANKING_LEN));
   	}
     int localMsdSPRatingsCounter = -1;
     public boolean isMsdSPRatingsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSPRatingsCounter != sharedCounter;
         localMsdSPRatingsCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SPRATINGS_LEN = 1;
	/**
	 * 	serialize this MsdSPRatings
	 */
   protected void serializeMsdSPRatings(char[] msdSPRatings) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSPRatings,0,getStringValue(),beginMsdSPRatings,MSD_SPRATINGS_LEN);
       localMsdSPRatingsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSPRatingsConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdSPRatings is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSPRatings() {	 
   		return (substring(getStringValue(),beginMsdSPRatings,beginMsdSPRatings + MSD_SPRATINGS_LEN));
   	}
     int localMsdMoodyRatingCounter = -1;
     public boolean isMsdMoodyRatingModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdMoodyRatingCounter != sharedCounter;
         localMsdMoodyRatingCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_MOODY_RATING_LEN = 1;
	/**
	 * 	serialize this MsdMoodyRating
	 */
   protected void serializeMsdMoodyRating(char[] msdMoodyRating) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdMoodyRating,0,getStringValue(),beginMsdMoodyRating,MSD_MOODY_RATING_LEN);
       localMsdMoodyRatingCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdMoodyRatingConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdMoodyRating is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdMoodyRating() {	 
   		return (substring(getStringValue(),beginMsdMoodyRating,beginMsdMoodyRating + MSD_MOODY_RATING_LEN));
   	}
     int localBdms01SPRatingCdCounter = -1;
     public boolean isBdms01SPRatingCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SPRatingCdCounter != sharedCounter;
         localBdms01SPRatingCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SPRATING_CD_LEN = 5;
	/**
	 * 	serialize this Bdms01SPRatingCd
	 */
   protected void serializeBdms01SPRatingCd(char[] bdms01SPRatingCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SPRatingCd,0,getStringValue(),beginBdms01SPRatingCd,BDMS_01_SPRATING_CD_LEN);
       localBdms01SPRatingCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SPRatingCdConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshBdms01SPRatingCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SPRatingCd() {	 
   		return (substring(getStringValue(),beginBdms01SPRatingCd,beginBdms01SPRatingCd + BDMS_01_SPRATING_CD_LEN));
   	}
     int localBdms01MoodyRatingCdCounter = -1;
     public boolean isBdms01MoodyRatingCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MoodyRatingCdCounter != sharedCounter;
         localBdms01MoodyRatingCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_MOODY_RATING_CD_LEN = 5;
	/**
	 * 	serialize this Bdms01MoodyRatingCd
	 */
   protected void serializeBdms01MoodyRatingCd(char[] bdms01MoodyRatingCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01MoodyRatingCd,0,getStringValue(),beginBdms01MoodyRatingCd,BDMS_01_MOODY_RATING_CD_LEN);
       localBdms01MoodyRatingCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01MoodyRatingCdConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshBdms01MoodyRatingCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01MoodyRatingCd() {	 
   		return (substring(getStringValue(),beginBdms01MoodyRatingCd,beginBdms01MoodyRatingCd + BDMS_01_MOODY_RATING_CD_LEN));
   	}




}
  
