package com.cloudframe.app.db2varch.dto;

/**
*  The class PublishedDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class PublishedDate extends PublishedDateSerialized { 
   

								@Getter @Setter private short publishedDateLen;

						@Getter @Setter private char[] publishedDateText = Field.fillLowValue(255);
	
	/**
	* Constructor for PublishedDate
	**/
    public PublishedDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for PublishedDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PublishedDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes PublishedDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setPublishedDateLen((short)0);
         setPublishedDateText(CONSTANTS.SPACE_255);
   }


}
  
