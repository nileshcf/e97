package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01RatingSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01RatingSegData extends Bdms01RatingSegDataSerialized { 
   

								@Getter @Setter private int bdms01RatingSegSqlcd;

						@Getter @Setter private char[] msdSPRanking = Field.fillLowValue(1);

						@Getter @Setter private char[] msdSPRatings = Field.fillLowValue(1);

						@Getter @Setter private char[] msdMoodyRating = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01SPRatingCd = Field.fillLowValue(5);

						@Getter @Setter private char[] bdms01MoodyRatingCd = Field.fillLowValue(5);

	
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


}
  
