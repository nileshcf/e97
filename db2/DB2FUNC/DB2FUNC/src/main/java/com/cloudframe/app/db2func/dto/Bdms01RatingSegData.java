package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01RatingSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01RatingSegData extends Bdms01RatingSegDataSerialized { 
   

								private int bdms01RatingSegSqlcd;

						private char[] msdSPRanking = Field.fillLowValue(1);

						private char[] msdSPRatings = Field.fillLowValue(1);

						private char[] msdMoodyRating = Field.fillLowValue(1);

						private char[] bdms01SPRatingCd = Field.fillLowValue(5);

						private char[] bdms01MoodyRatingCd = Field.fillLowValue(5);

	
	/**
	* Constructor for Bdms01RatingSegData
	**/
    public Bdms01RatingSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01RatingSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01RatingSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01RatingSegSqlcd
	 *	@return bdms01RatingSegSqlcd
	 */
	public int getBdms01RatingSegSqlcd() throws CFException {
       if (isBdms01RatingSegSqlcdModified()) { 
           bdms01RatingSegSqlcd = refreshBdms01RatingSegSqlcd();
        }
   		return bdms01RatingSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01RatingSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-RATING-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01RatingSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01RatingSegSqlcd = checkBdms01RatingSegSqlcdMaxLimit(number); 
		serializeBdms01RatingSegSqlcd(bdms01RatingSegSqlcd);
	}
	

	public void setBdms01RatingSegSqlcd(long number) {
	    number = checkBdms01RatingSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01RatingSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01RatingSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01RatingSegSqlcd(char[] value) throws CFException {
		 bdms01RatingSegSqlcd = serializeBdms01RatingSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01RatingSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01RatingSegSqlcdString(char[] value) throws CFException {
		 setBdms01RatingSegSqlcd(value);
	}
	/**
	 *	Returns the value of msdSPRanking
	 *	@return msdSPRanking
	 */
   public char[] getMsdSPRanking() throws CFException{
     if (isMsdSPRankingModified()) { 
        msdSPRanking = refreshMsdSPRanking();
     }
   		return msdSPRanking;
   }

  
	/**
	*  set variable msdSPRanking
	*  Corresponding COBOL Variable is MSD-S-P-RANKING
	*  @param value
	**/
   public void setMsdSPRanking(char[] value) {
      msdSPRanking = checkMsdSPRankingConstraints(value);
      serializeMsdSPRanking(msdSPRanking);
   } 

     /**
	 * 	Update MsdSPRanking 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSPRanking(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSPRanking,msdSPRanking.length);
   	
   }
   
   public void setMsdSPRanking(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSPRanking,msdSPRanking.length);
   	
   }
   
     /**
	 * 	Update MsdSPRanking 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSPRanking(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSPRanking+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSPRanking with another Field
	 *	@param value
	 */
   public void setMsdSPRanking(Field source) {
       replace(source,0,source.length(),beginMsdSPRanking,MSD_SPRANKING_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSPRanking 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSPRanking(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSPRanking,MSD_SPRANKING_LEN);
   	
   }
   
     /**
	 * 	Update MsdSPRanking 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSPRanking(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSPRanking+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdSPRatings
	 *	@return msdSPRatings
	 */
   public char[] getMsdSPRatings() throws CFException{
     if (isMsdSPRatingsModified()) { 
        msdSPRatings = refreshMsdSPRatings();
     }
   		return msdSPRatings;
   }

  
	/**
	*  set variable msdSPRatings
	*  Corresponding COBOL Variable is MSD-S-P-RATINGS
	*  @param value
	**/
   public void setMsdSPRatings(char[] value) {
      msdSPRatings = checkMsdSPRatingsConstraints(value);
      serializeMsdSPRatings(msdSPRatings);
   } 

     /**
	 * 	Update MsdSPRatings 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSPRatings(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSPRatings,msdSPRatings.length);
   	
   }
   
   public void setMsdSPRatings(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSPRatings,msdSPRatings.length);
   	
   }
   
     /**
	 * 	Update MsdSPRatings 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSPRatings(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSPRatings+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSPRatings with another Field
	 *	@param value
	 */
   public void setMsdSPRatings(Field source) {
       replace(source,0,source.length(),beginMsdSPRatings,MSD_SPRATINGS_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSPRatings 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSPRatings(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSPRatings,MSD_SPRATINGS_LEN);
   	
   }
   
     /**
	 * 	Update MsdSPRatings 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSPRatings(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSPRatings+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdMoodyRating
	 *	@return msdMoodyRating
	 */
   public char[] getMsdMoodyRating() throws CFException{
     if (isMsdMoodyRatingModified()) { 
        msdMoodyRating = refreshMsdMoodyRating();
     }
   		return msdMoodyRating;
   }

  
	/**
	*  set variable msdMoodyRating
	*  Corresponding COBOL Variable is MSD-MOODY-RATING
	*  @param value
	**/
   public void setMsdMoodyRating(char[] value) {
      msdMoodyRating = checkMsdMoodyRatingConstraints(value);
      serializeMsdMoodyRating(msdMoodyRating);
   } 

     /**
	 * 	Update MsdMoodyRating 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdMoodyRating(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdMoodyRating,msdMoodyRating.length);
   	
   }
   
   public void setMsdMoodyRating(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdMoodyRating,msdMoodyRating.length);
   	
   }
   
     /**
	 * 	Update MsdMoodyRating 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdMoodyRating(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdMoodyRating+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdMoodyRating with another Field
	 *	@param value
	 */
   public void setMsdMoodyRating(Field source) {
       replace(source,0,source.length(),beginMsdMoodyRating,MSD_MOODY_RATING_LEN);
   	
   }  
   
     /**
	 * 	Update MsdMoodyRating 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdMoodyRating(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdMoodyRating,MSD_MOODY_RATING_LEN);
   	
   }
   
     /**
	 * 	Update MsdMoodyRating 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdMoodyRating(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdMoodyRating+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SPRatingCd
	 *	@return bdms01SPRatingCd
	 */
   public char[] getBdms01SPRatingCd() throws CFException{
     if (isBdms01SPRatingCdModified()) { 
        bdms01SPRatingCd = refreshBdms01SPRatingCd();
     }
   		return bdms01SPRatingCd;
   }

  
	/**
	*  set variable bdms01SPRatingCd
	*  Corresponding COBOL Variable is BDMS01-S-P-RATING-CD
	*  @param value
	**/
   public void setBdms01SPRatingCd(char[] value) {
      bdms01SPRatingCd = checkBdms01SPRatingCdConstraints(value);
      serializeBdms01SPRatingCd(bdms01SPRatingCd);
   } 

     /**
	 * 	Update Bdms01SPRatingCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SPRatingCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SPRatingCd,bdms01SPRatingCd.length);
   	
   }
   
   public void setBdms01SPRatingCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SPRatingCd,bdms01SPRatingCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SPRatingCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SPRatingCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SPRatingCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SPRatingCd with another Field
	 *	@param value
	 */
   public void setBdms01SPRatingCd(Field source) {
       replace(source,0,source.length(),beginBdms01SPRatingCd,BDMS_01_SPRATING_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SPRatingCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SPRatingCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SPRatingCd,BDMS_01_SPRATING_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SPRatingCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SPRatingCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SPRatingCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01MoodyRatingCd
	 *	@return bdms01MoodyRatingCd
	 */
   public char[] getBdms01MoodyRatingCd() throws CFException{
     if (isBdms01MoodyRatingCdModified()) { 
        bdms01MoodyRatingCd = refreshBdms01MoodyRatingCd();
     }
   		return bdms01MoodyRatingCd;
   }

  
	/**
	*  set variable bdms01MoodyRatingCd
	*  Corresponding COBOL Variable is BDMS01-MOODY-RATING-CD
	*  @param value
	**/
   public void setBdms01MoodyRatingCd(char[] value) {
      bdms01MoodyRatingCd = checkBdms01MoodyRatingCdConstraints(value);
      serializeBdms01MoodyRatingCd(bdms01MoodyRatingCd);
   } 

     /**
	 * 	Update Bdms01MoodyRatingCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01MoodyRatingCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01MoodyRatingCd,bdms01MoodyRatingCd.length);
   	
   }
   
   public void setBdms01MoodyRatingCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MoodyRatingCd,bdms01MoodyRatingCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01MoodyRatingCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MoodyRatingCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MoodyRatingCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01MoodyRatingCd with another Field
	 *	@param value
	 */
   public void setBdms01MoodyRatingCd(Field source) {
       replace(source,0,source.length(),beginBdms01MoodyRatingCd,BDMS_01_MOODY_RATING_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01MoodyRatingCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01MoodyRatingCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01MoodyRatingCd,BDMS_01_MOODY_RATING_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01MoodyRatingCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MoodyRatingCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MoodyRatingCd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01RatingSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01RatingSegSqlcd(0);
         setMsdSPRanking(CONSTANTS.SPACE);
         setMsdSPRatings(CONSTANTS.SPACE);
         setMsdMoodyRating(CONSTANTS.SPACE);
         setBdms01SPRatingCd(CONSTANTS.SPACE_5);
         setBdms01MoodyRatingCd(CONSTANTS.SPACE_5);
   }

		public static int getBdms01RatingSegDataFieldLength() {
			return BDMS_01_RATING_SEG_DATA_LENGTH;
		}

}
  
